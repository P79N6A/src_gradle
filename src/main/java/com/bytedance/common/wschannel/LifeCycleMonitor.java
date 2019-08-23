package com.bytedance.common.wschannel;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;

public class LifeCycleMonitor implements Application.ActivityLifecycleCallbacks {
    public static boolean mAppAlive;
    private static WeakHandler sHandler = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
        public final void handleMsg(Message message) {
        }
    });
    public AppStateListener mListener;
    private Runnable mRunnable = new Runnable() {
        public void run() {
            Logger.debug();
            if (LifeCycleMonitor.mAppAlive) {
                LifeCycleMonitor.mAppAlive = false;
                if (LifeCycleMonitor.this.mListener != null) {
                    LifeCycleMonitor.this.mListener.onEnterToBackground();
                }
            }
        }
    };

    public interface AppStateListener {
        void onEnterToBackground();

        void onEnterToForeground();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    LifeCycleMonitor() {
    }

    public void setAppStateChangedListener(AppStateListener appStateListener) {
        this.mListener = appStateListener;
    }

    public void onActivityPaused(Activity activity) {
        if (mAppAlive) {
            sHandler.postDelayed(this.mRunnable, 30000);
        }
    }

    public void onActivityResumed(Activity activity) {
        if (!mAppAlive) {
            mAppAlive = true;
            if (this.mListener != null) {
                this.mListener.onEnterToForeground();
            }
        }
        Logger.debug();
        sHandler.removeCallbacks(this.mRunnable);
    }
}
