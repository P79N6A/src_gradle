package com.bytedance.common.push;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class ActivityLifecycleObserver extends Observable implements Application.ActivityLifecycleCallbacks, WeakHandler.IHandler {
    private static ActivityLifecycleObserver ins = null;
    private static boolean sIsBackGround = true;
    private static int sNumStarted;
    private WeakReference<Activity> mActivityRef;
    public boolean mAppActive;
    public AppStateListener mLifeCycleListener;
    private final List<Application.ActivityLifecycleCallbacks> mListener = new ArrayList();
    private Runnable mRunnable = new Runnable() {
        public void run() {
            if (ActivityLifecycleObserver.this.mAppActive) {
                ActivityLifecycleObserver.this.mAppActive = false;
                if (ActivityLifecycleObserver.this.mLifeCycleListener != null) {
                    ActivityLifecycleObserver.this.mLifeCycleListener.onEnterToBackground();
                }
            }
        }
    };
    private WeakHandler sHandler = new WeakHandler(this);

    public interface AppStateListener {
        void onEnterToBackground();

        void onEnterToForeground();
    }

    public boolean isApplicationActive() {
        return this.mAppActive;
    }

    public boolean isBackGround() {
        return sIsBackGround;
    }

    public Activity getTopActivity() {
        if (this.mActivityRef != null) {
            return (Activity) this.mActivityRef.get();
        }
        return null;
    }

    private ActivityLifecycleObserver() {
    }

    private Object[] collectActivityLifecycleCallbacks() {
        Object[] objArr;
        synchronized (this.mListener) {
            if (this.mListener.size() > 0) {
                objArr = this.mListener.toArray();
            } else {
                objArr = null;
            }
        }
        return objArr;
    }

    public static synchronized ActivityLifecycleObserver getIns() {
        ActivityLifecycleObserver activityLifecycleObserver;
        synchronized (ActivityLifecycleObserver.class) {
            if (ins == null) {
                ins = new ActivityLifecycleObserver();
            }
            activityLifecycleObserver = ins;
        }
        return activityLifecycleObserver;
    }

    public void setAppStateChangedListener(AppStateListener appStateListener) {
        this.mLifeCycleListener = appStateListener;
    }

    public void removeActivityLifeCycleListener(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (activityLifecycleCallbacks != null) {
            synchronized (this.mListener) {
                this.mListener.remove(activityLifecycleCallbacks);
            }
        }
    }

    public void addActivityLifeCycleListener(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (activityLifecycleCallbacks != null) {
            synchronized (this.mListener) {
                if (!this.mListener.contains(activityLifecycleCallbacks)) {
                    this.mListener.add(activityLifecycleCallbacks);
                }
            }
        }
    }

    public void handleMsg(Message message) {
        if (message.what == 1 && sIsBackGround) {
            setChanged();
            notifyObservers(Boolean.valueOf(sIsBackGround));
        }
    }

    public void onActivityDestroyed(Activity activity) {
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityDestroyed(activity);
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        if (this.mAppActive) {
            this.sHandler.postDelayed(this.mRunnable, 30000);
        }
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityPaused(activity);
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        this.mActivityRef = new WeakReference<>(activity);
        if (!this.mAppActive) {
            this.mAppActive = true;
            if (this.mLifeCycleListener != null) {
                this.mLifeCycleListener.onEnterToForeground();
            }
        }
        this.sHandler.removeCallbacks(this.mRunnable);
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityResumed(activity);
            }
        }
    }

    public void onActivityStarted(Activity activity) {
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityStarted(activity);
            }
        }
        this.sHandler.removeMessages(1);
        if (sNumStarted == 0) {
            sIsBackGround = false;
        }
        sNumStarted++;
    }

    public void onActivityStopped(Activity activity) {
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityStopped(activity);
            }
        }
        int i = sNumStarted - 1;
        sNumStarted = i;
        if (i == 0) {
            sIsBackGround = true;
            this.sHandler.sendEmptyMessageDelayed(1, 30000);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        sIsBackGround = false;
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivityCreated(activity, bundle);
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] collectActivityLifecycleCallbacks = collectActivityLifecycleCallbacks();
        if (collectActivityLifecycleCallbacks != null) {
            for (Object obj : collectActivityLifecycleCallbacks) {
                ((Application.ActivityLifecycleCallbacks) obj).onActivitySaveInstanceState(activity, bundle);
            }
        }
    }
}
