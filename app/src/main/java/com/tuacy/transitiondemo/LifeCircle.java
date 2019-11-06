package com.tuacy.transitiondemo;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by zbk on 2019/11/6.
 */

public class LifeCircle implements Application.ActivityLifecycleCallbacks {

    private String TAG = "LifeCircle";

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Log.i(TAG,"onActivityCreated:"+activity.getClass().getSimpleName());
    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }
}
