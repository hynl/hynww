package com.ys.hynl.hynweiwei.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.ys.hynl.hynweiwei.R;

/**
 * Created by 何以奈良 on 2016/11/6.
 */
public class MainActivity extends Activity {

    FrameLayout fl;
    CoordinatorLayout cl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        fl = (FrameLayout) findViewById(R.id.fl_content);
        LayoutInflater inflater = LayoutInflater.from(this);
        View v =inflater.inflate(R.layout.activity_content,fl);
        fl.addView(v);
        cl = (CoordinatorLayout) fl.findViewById(R.id.cl_main_content);
    }
}
