package com.example.pan.myapplication1;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MyFragmant extends Fragment {

    Button sw , sw1 , bu ,bu1 , bu2;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public MyFragmant() {

    }


    public static MyFragmant newInstance(String param1, String param2) {
        MyFragmant fragment = new MyFragmant();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle){
        View v = inflater.inflate(R.layout.my_fragment, viewGroup, false);

        bu = (Button) v.findViewById(R.id.bu);
        bu.setOnTouchListener(new MyListener());

        bu1 = (Button) v.findViewById(R.id.bu1);
        bu1.setOnTouchListener(new MyListener1());

        bu2 = (Button) v.findViewById(R.id.bu2);
        bu2.setOnTouchListener(new MyListener2());

        return v;
    }

    private class MyListener implements View.OnTouchListener {

        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    Drawable a = getResources().getDrawable(R.drawable.group8);
                    bu.setBackground(a);
                    break;
                case MotionEvent.ACTION_UP:
                    Drawable a1 = getResources().getDrawable(R.mipmap.group7);
                    bu.setBackground(a1);
                    String srt = "กดปุ่มแล้ว";
                    Toast.makeText(getContext(), srt, Toast.LENGTH_SHORT).show();
                    break;
                default:
                    return false;
            }
            return true;
        }

    }
    private class MyListener1 implements View.OnTouchListener {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            //float x = motionEvent.getX();
            //float y = motionEvent.getY();
            int action = motionEvent.getAction();
            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    Drawable s = getResources().getDrawable(R.mipmap.group7);
                    bu1.setBackground(s);
                    break;

                case MotionEvent.ACTION_UP:
                    Drawable s1 = getResources().getDrawable(R.mipmap.group5);
                    bu1.setBackground(s1);
                    String srt = "กดปุ่มแล้ว1";
                    Toast.makeText(getContext(), srt, Toast.LENGTH_SHORT).show();
                    break;
                default:
            }
            return true;
        }
    }
    private class MyListener2 implements View.OnTouchListener {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            //float x = motionEvent.getX();
            //float y = motionEvent.getY();
            int action = motionEvent.getAction();
            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    Drawable s2 = getResources().getDrawable(R.mipmap.group7);
                    bu2.setBackground(s2);
                    break;

                case MotionEvent.ACTION_UP:
                    Drawable s3 = getResources().getDrawable(R.mipmap.group4);
                    bu2.setBackground(s3);
                    String srt = "กดปุ่มแล้ว2";
                    Toast.makeText(getContext(), srt, Toast.LENGTH_SHORT).show();
            }
            return true;
        }
    }

}
