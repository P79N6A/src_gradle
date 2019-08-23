package dagger.android.support;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import dagger.android.a;
import dagger.android.c;
import dagger.internal.e;

public abstract class DaggerAppCompatActivity extends AppCompatActivity implements b {
    public void onCreate(@Nullable Bundle bundle) {
        e.a(this, PushConstants.INTENT_ACTIVITY_NAME);
        Application application = getApplication();
        if (application instanceof c) {
            a<Activity> j = ((c) application).j();
            e.a(j, "%s.activityInjector() returned null", application.getClass());
            j.a(this);
            super.onCreate(bundle);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), c.class.getCanonicalName()}));
    }
}
