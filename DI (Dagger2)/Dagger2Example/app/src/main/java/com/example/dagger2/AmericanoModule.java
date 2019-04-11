package com.example.dagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class AmericanoModule {
    @Provides
    Americano proivdeAmericano(Espresso espresso, Water water) {
        return new Americano(espresso, water);
    }

    @Provides
    Espresso provideEspresso() {
        return new Espresso();
    }

    @Provides
    Water provideWater() {
        return new Water();
    }
}
