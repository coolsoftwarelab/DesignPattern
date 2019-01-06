package com.csl.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.csl.mvp.R;
import com.csl.mvp.presenter.ClickerPresenter;

public class ClickerActivity extends AppCompatActivity implements ClickerView {
    private static String TAG = ClickerActivity.class.getName();

    private TextView mCountTv;

    ClickerPresenter mPresenter = new ClickerPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicker);

        mCountTv = (TextView) findViewById(R.id.count);
        mPresenter.onCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPresenter.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroy();
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
                mPresenter.onResetSelected();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void setScore(String score) {
        mCountTv.setText(score);
    }

    @Override
    public void clearScore() {
        mCountTv.setText("0");
    }

    public void onClick(View v) {
        mPresenter.onClicked();
    }
}
