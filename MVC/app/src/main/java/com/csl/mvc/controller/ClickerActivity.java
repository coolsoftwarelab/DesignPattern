package com.csl.mvc.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.csl.mvc.R;
import com.csl.mvc.model.Counter;

public class ClickerActivity extends AppCompatActivity {
    private static String TAG = ClickerActivity.class.getName();

    private Counter mModel;

    private TextView mCountTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicker);

        mCountTv = (TextView) findViewById(R.id.count);

        mModel = new Counter();
    }

    public void onClick(View v) {
        String score = mModel.increaseScore();
        Log.i(TAG, "score : " + score);

        mCountTv.setText(score);
    }

    public void reset() {
        mCountTv.setText("0");
        mModel.restart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_clicker, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_reset:
                reset();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
