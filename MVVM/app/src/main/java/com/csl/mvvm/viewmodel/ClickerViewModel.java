package com.csl.mvvm.viewmodel;

import android.databinding.ObservableField;

import com.csl.mvvm.model.Counter;

public class ClickerViewModel implements ViewModel {
    private Counter mModel;

    public final ObservableField<String> mScoreObservField = new ObservableField<>();

    public ClickerViewModel() {
        mModel = new Counter();
    }

    @Override
    public void onCreate() {
        mScoreObservField.set("0");
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    public void onResetSelected() {
        mModel.restart();
    }

    public void onClicked() {
        String score = mModel.increaseScore();
        mScoreObservField.set(score);
    }
}
