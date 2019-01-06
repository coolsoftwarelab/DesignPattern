package com.csl.mvp.presenter;

import com.csl.mvp.model.Counter;
import com.csl.mvp.view.ClickerView;

public class ClickerPresenter implements Presenter {
    private Counter mModel;
    private ClickerView mView;

    public ClickerPresenter(ClickerView view) {
        mView = view;
        mModel = new Counter();
    }

    @Override
    public void onCreate() {
        mModel = new Counter();
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
        mView.clearScore();
        mModel.restart();
    }

    public void onClicked() {
        String score = mModel.increaseScore();
        mView.setScore(score);
    }

}
