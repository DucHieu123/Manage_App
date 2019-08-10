package com.example.news;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.blikoon.qrcodescanner.QrCodeActivity;
import com.example.news.adapter.CustomAdapter;
import com.example.news.model.MonHoc;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvMonHoc;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;


    private static final int REQUEST_CODE_QR_SCAN = 101;
    private final String LOGTAG = "QRCScanner-MainActivity";

    @RequiresApi(api = Build.VERSION_CODES.M)
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMonHoc = (ListView) findViewById(R.id.lvmonhoc);
        ArrayList<MonHoc> arrMonhoc = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            arrMonhoc.add(new MonHoc("Môn học " + i, "ca " + i));
        }

        CustomAdapter customAdaper = new CustomAdapter(this, R.layout.row_listview_monhoc, arrMonhoc);
        lvMonHoc.setAdapter(customAdaper);



        //set navication bar
        dl = (DrawerLayout) findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl, R.string.Open, R.string.Close);

        dl.addDrawerListener(t);
        t.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView) findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {
                    case R.id.somi:
                        Toast.makeText(MainActivity.this, "Chức năng đang làm", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.aothun:
                        Toast.makeText(MainActivity.this, "Chức năng đang làm", Toast.LENGTH_SHORT).show();
                        // Intent intentSetting = new Intent(MainActivity.this,SettingActivity.class);
                        // startActivity(intentSetting);
                        break;
                    case R.id.quan:
                        Toast.makeText(MainActivity.this, "Chức năng đang làm", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
                return true;
            }
        });


    }


    @Override
   public boolean onOptionsItemSelected(MenuItem item) {

        if (t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }

}
