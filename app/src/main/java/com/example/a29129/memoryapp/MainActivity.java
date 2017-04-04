package com.example.a29129.memoryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TextView tv_show;
    private ArrayList<String> arrayList;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_show = (TextView) findViewById(R.id.tv_show);
        arrayList = new ArrayList<>();

    }

    public void clickAddItems(View view) {

//        tv_show.setText("click add items");
        for (int counter = 0; counter < 1000; counter++) {
            arrayList.add("item:" + counter);
        }
        showTextView();
    }

    public void clickClearItems(View view) {
//        tv_show.setText("click clear items");
        arrayList.clear();
        showTextView();
    }

    public void showTextView() {
        tv_show.setText("arrayList size:"+arrayList.size());
    }
}
