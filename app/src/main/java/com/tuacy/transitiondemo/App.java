package com.tuacy.transitiondemo;

import android.app.Application;

/**
 * Created by zbk on 2019/11/6.
 */

public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(new LifeCircle());
    }
}
