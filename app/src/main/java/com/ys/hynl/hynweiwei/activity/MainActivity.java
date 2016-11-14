package com.ys.hynl.hynweiwei.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.ys.hynl.hynweiwei.R;

import static com.ys.hynl.hynweiwei.R.string.toolbar_title;

/**
 * Created by 何以奈良 on 2016/11/6.
 */
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
 ,View.OnClickListener{

    FrameLayout fl;
    NavigationView nv_left;
    DrawerLayout dl_main;
    Toolbar toolbar_main;
    CollapsingToolbarLayout ctl_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        fl = (FrameLayout) findViewById(R.id.fl_content);
        LayoutInflater inflater = LayoutInflater.from(this);
        View v =inflater.inflate(R.layout.activity_content,null);
        CoordinatorLayout cl = (CoordinatorLayout) v.findViewById(R.id.cl_main_content);
        fl.addView(cl);

        dl_main = (DrawerLayout) findViewById(R.id.dl_main);
        nv_left = (NavigationView) findViewById(R.id.nav_left);
        nv_left.setNavigationItemSelectedListener(this);

        ctl_main = (CollapsingToolbarLayout) cl.findViewById(R.id.ctl_scale_toolbar);
        toolbar_main = (Toolbar) cl.findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar_main);
        ctl_main.setTitle("测试");
        toolbar_main.setNavigationOnClickListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        item.setChecked(true);
        dl_main.closeDrawers();
        return false;
    }

    @Override
    public void onClick(View v) {

    }
}
