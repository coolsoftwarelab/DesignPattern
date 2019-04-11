package com.example.dagger2;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AmericanoModule.class)
public interface AmericanoComponent {
    void inject(MainActivity activity);
}
