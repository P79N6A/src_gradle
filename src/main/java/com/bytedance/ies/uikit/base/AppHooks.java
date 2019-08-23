package com.bytedance.ies.uikit.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class AppHooks {
    private static ActivityLifeCycleHook mActivityHook;
    private static ActivityResultHook mActivityResultHook;
    private static AppBackgroundHook mAppBackgroundHook;
    private static InitHook mInitHook;

    public interface ActivityLifeCycleHook {
        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);
    }

    public interface ActivityResultHook {
        boolean onActivityResult(Activity activity, int i, int i2, Intent intent);
    }

    public interface AppBackgroundHook {
        void onAppBackgoundSwitch(boolean z);
    }

    public interface InitHook {
        void tryInit(Context context);
    }

    public static ActivityLifeCycleHook getActivityHook() {
        return mActivityHook;
    }

    public static ActivityResultHook getActivityResultHook() {
        return mActivityResultHook;
    }

    public static AppBackgroundHook getAppBackgroundHook() {
        return mAppBackgroundHook;
    }

    public static InitHook getInitHook() {
        return mInitHook;
    }

    public static void setActivityHook(ActivityLifeCycleHook activityLifeCycleHook) {
        mActivityHook = activityLifeCycleHook;
    }

    public static void setActivityResultHook(ActivityResultHook activityResultHook) {
        mActivityResultHook = activityResultHook;
    }

    public static void setAppBackgroundHook(AppBackgroundHook appBackgroundHook) {
        mAppBackgroundHook = appBackgroundHook;
    }

    public static void setInitHook(InitHook initHook) {
        mInitHook = initHook;
    }
}
