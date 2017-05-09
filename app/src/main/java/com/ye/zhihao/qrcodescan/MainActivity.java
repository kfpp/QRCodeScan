package com.ye.zhihao.qrcodescan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.zxing.client.android.CaptureActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button mBtnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnMain = (Button) findViewById(R.id.btn_main);
        mBtnMain.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, CaptureActivity.class));
    }
}
