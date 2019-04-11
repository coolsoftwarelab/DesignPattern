package com.example.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    Americano americano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AmericanoComponent component = DaggerAmericanoComponent.builder()
                .americanoModule(new AmericanoModule())
                .build();
        component.inject(this);

        String coffeBrand = americano.getCoffeBrand();
        Log.d(TAG, "coffeBrand : " + coffeBrand);
    }
}
