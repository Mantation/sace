package com.example.bombo.sace;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import org.apache.poi.xslf.usermodel.tutorial.Step1;
import org.apache.poi.xslf.usermodel.tutorial.Step2;

import adapters.ViewPagerAdapter;
import menuFragments.forgotpass;
import menuFragments.login;
import menuFragments.register;
import menuFragments.registration.step1;
import menuFragments.registration.step2;
import menuFragments.registration.step3;

public class home extends AppCompatActivity {
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tabLayout = findViewById(R.id.tab);
        appBarLayout = findViewById(R.id.appBar);
        viewPager = findViewById(R.id.pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        //Adding Fragments
        adapter.addFragment(new register(),"Register");
        adapter.addFragment(new login(),"Log In");
        adapter.addFragment(new forgotpass(),"Forgot Password");
        adapter.addFragment(new step1(),"Step 1");
        adapter.addFragment(new step2(),"Step 2");
        adapter.addFragment(new step3(),"Step 3");
        //Adapter setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
