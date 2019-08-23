package com.bytedance.apm.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.apm.api.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class ActivityLifeObserver implements Application.ActivityLifecycleCallbacks, IActivityLifeManager {
    private static final ActivityLifeObserver mInstance = new ActivityLifeObserver();
    private boolean mChangingConfigActivity;
    private String mCurActivityHash;
    private int mFrontActivityCount;
    private boolean mIsFrontV2;
    private ArrayList<c> mObservers;
    private WeakReference<Activity> mTopActivityRef;

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    private ActivityLifeObserver() {
    }

    public static ActivityLifeObserver getInstance() {
        return mInstance;
    }

    public WeakReference<Activity> getTopActivityRef() {
        return this.mTopActivityRef;
    }

    public boolean isForeground() {
        return this.mIsFrontV2;
    }

    public boolean isV2Foreground() {
        return this.mIsFrontV2;
    }

    private Object[] collectObservers() {
        Object[] objArr;
        synchronized (this.mObservers) {
            if (this.mObservers.size() > 0) {
                objArr = this.mObservers.toArray();
            } else {
                objArr = null;
            }
        }
        if (objArr == null) {
            return new Object[0];
        }
        return objArr;
    }

    public String getTopActivityClassName() {
        if (this.mTopActivityRef == null) {
            return "";
        }
        Activity activity = (Activity) this.mTopActivityRef.get();
        if (activity != null) {
            return activity.getClass().getCanonicalName();
        }
        return "";
    }

    public static void init(Application application) {
        mInstance.initWithApp(application);
    }

    public void onActivityDestroyed(Activity activity) {
        if (getActivityHash(activity).equals(this.mCurActivityHash)) {
            this.mCurActivityHash = null;
        }
    }

    private String getActivityHash(Activity activity) {
        return activity.getClass().getName() + activity.hashCode();
    }

    private void initWithApp(@NonNull Application application) {
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
            application.registerActivityLifecycleCallbacks(this);
        }
        this.mObservers = new ArrayList<>(8);
    }

    private void notifyBackground(Activity activity) {
        for (Object obj : collectObservers()) {
            ((c) obj).a(activity);
        }
    }

    private void notifyFront(Activity activity) {
        for (Object obj : collectObservers()) {
            ((c) obj).b(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        for (Object obj : collectObservers()) {
            ((c) obj).d(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        this.mTopActivityRef = new WeakReference<>(activity);
        collectObservers();
        String activityHash = getActivityHash(activity);
        if (!activityHash.equals(this.mCurActivityHash)) {
            this.mCurActivityHash = activityHash;
        }
    }

    public void onActivityStarted(Activity activity) {
        collectObservers();
        if (this.mChangingConfigActivity) {
            this.mChangingConfigActivity = false;
            return;
        }
        this.mFrontActivityCount++;
        if (this.mFrontActivityCount == 1) {
            this.mIsFrontV2 = true;
            notifyFront(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.mChangingConfigActivity = true;
            return;
        }
        this.mFrontActivityCount--;
        if (this.mFrontActivityCount == 0) {
            this.mIsFrontV2 = false;
            notifyBackground(activity);
        }
    }

    public void register(c cVar) {
        if (this.mObservers != null) {
            synchronized (this.mObservers) {
                this.mObservers.add(cVar);
            }
        }
    }

    public void unregister(c cVar) {
        if (this.mObservers != null) {
            synchronized (this.mObservers) {
                this.mObservers.remove(cVar);
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (Object obj : collectObservers()) {
            ((c) obj).c(activity);
        }
    }
}
