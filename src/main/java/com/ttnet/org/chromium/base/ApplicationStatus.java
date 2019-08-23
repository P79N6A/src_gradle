package com.ttnet.org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ttnet.org.chromium.base.BaseChromiumApplication;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import com.ttnet.org.chromium.base.annotations.MainDex;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@MainDex
@JNINamespace("base::android")
public class ApplicationStatus {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static Activity sActivity;
    private static final Map<Activity, ActivityInfo> sActivityInfo = new ConcurrentHashMap();
    private static final ObserverList<ApplicationStateListener> sApplicationStateListeners = new ObserverList<>();
    private static Integer sCachedApplicationState;
    private static Object sCachedApplicationStateLock = new Object();
    private static final ObserverList<ActivityStateListener> sGeneralActivityStateListeners = new ObserverList<>();
    public static ApplicationStateListener sNativeApplicationStateListener;

    static class ActivityInfo {
        private ObserverList<ActivityStateListener> mListeners;
        private int mStatus;

        public ObserverList<ActivityStateListener> getListeners() {
            return this.mListeners;
        }

        public int getStatus() {
            return this.mStatus;
        }

        private ActivityInfo() {
            this.mStatus = 6;
            this.mListeners = new ObserverList<>();
        }

        public void setStatus(int i) {
            this.mStatus = i;
        }
    }

    public interface ActivityStateListener {
        void onActivityStateChange(Activity activity, int i);
    }

    public interface ApplicationStateListener {
        void onApplicationStateChange(int i);
    }

    public static native void nativeOnApplicationStateChange(int i);

    private ApplicationStatus() {
    }

    public static Activity getLastTrackedFocusedActivity() {
        return sActivity;
    }

    public static boolean isEveryActivityDestroyed() {
        return sActivityInfo.isEmpty();
    }

    public static boolean hasVisibleActivities() {
        int stateForApplication = getStateForApplication();
        if (stateForApplication == 1 || stateForApplication == 2) {
            return true;
        }
        return false;
    }

    @CalledByNative
    private static void registerThreadSafeNativeApplicationStateListener() {
        ThreadUtils.runOnUiThread((Runnable) new Runnable() {
            public final void run() {
                if (ApplicationStatus.sNativeApplicationStateListener == null) {
                    AnonymousClass1 r0 = new ApplicationStateListener() {
                        public void onApplicationStateChange(int i) {
                            ApplicationStatus.nativeOnApplicationStateChange(i);
                        }
                    };
                    ApplicationStatus.sNativeApplicationStateListener = r0;
                    ApplicationStatus.registerApplicationStateListener(r0);
                }
            }
        });
    }

    public static void destroyForJUnitTests() {
        sApplicationStateListeners.clear();
        sGeneralActivityStateListeners.clear();
        sActivityInfo.clear();
        synchronized (sCachedApplicationStateLock) {
            sCachedApplicationState = null;
        }
        sActivity = null;
        sNativeApplicationStateListener = null;
    }

    @CalledByNative
    public static int getStateForApplication() {
        int intValue;
        synchronized (sCachedApplicationStateLock) {
            if (sCachedApplicationState == null) {
                sCachedApplicationState = Integer.valueOf(determineApplicationState());
            }
            intValue = sCachedApplicationState.intValue();
        }
        return intValue;
    }

    private static int determineApplicationState() {
        boolean z = false;
        boolean z2 = false;
        for (ActivityInfo status : sActivityInfo.values()) {
            int status2 = status.getStatus();
            if (status2 != 4 && status2 != 5 && status2 != 6) {
                return 1;
            }
            if (status2 == 4) {
                z = true;
            } else if (status2 == 5) {
                z2 = true;
            }
        }
        if (z) {
            return 2;
        }
        if (z2) {
            return 3;
        }
        return 4;
    }

    public static List<WeakReference<Activity>> getRunningActivities() {
        ArrayList arrayList = new ArrayList();
        for (Activity weakReference : sActivityInfo.keySet()) {
            arrayList.add(new WeakReference(weakReference));
        }
        return arrayList;
    }

    public static void registerApplicationStateListener(ApplicationStateListener applicationStateListener) {
        sApplicationStateListeners.addObserver(applicationStateListener);
    }

    public static void registerStateListenerForAllActivities(ActivityStateListener activityStateListener) {
        sGeneralActivityStateListeners.addObserver(activityStateListener);
    }

    public static void unregisterApplicationStateListener(ApplicationStateListener applicationStateListener) {
        sApplicationStateListeners.removeObserver(applicationStateListener);
    }

    public static int getStateForActivity(Activity activity) {
        ActivityInfo activityInfo = sActivityInfo.get(activity);
        if (activityInfo != null) {
            return activityInfo.getStatus();
        }
        return 6;
    }

    public static void initialize(BaseChromiumApplication baseChromiumApplication) {
        baseChromiumApplication.registerWindowFocusChangedListener(new BaseChromiumApplication.WindowFocusChangedListener() {
            public final void onWindowFocusChanged(Activity activity, boolean z) {
                if (z && activity != ApplicationStatus.sActivity) {
                    int stateForActivity = ApplicationStatus.getStateForActivity(activity);
                    if (!(stateForActivity == 6 || stateForActivity == 5)) {
                        ApplicationStatus.sActivity = activity;
                    }
                }
            }
        });
        baseChromiumApplication.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
                ApplicationStatus.onStateChange(activity, 6);
            }

            public final void onActivityPaused(Activity activity) {
                ApplicationStatus.onStateChange(activity, 4);
            }

            public final void onActivityResumed(Activity activity) {
                ApplicationStatus.onStateChange(activity, 3);
            }

            public final void onActivityStarted(Activity activity) {
                ApplicationStatus.onStateChange(activity, 2);
            }

            public final void onActivityStopped(Activity activity) {
                ApplicationStatus.onStateChange(activity, 5);
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                ApplicationStatus.onStateChange(activity, 1);
            }
        });
    }

    public static void unregisterActivityStateListener(ActivityStateListener activityStateListener) {
        sGeneralActivityStateListeners.removeObserver(activityStateListener);
        for (ActivityInfo listeners : sActivityInfo.values()) {
            listeners.getListeners().removeObserver(activityStateListener);
        }
    }

    @VisibleForTesting
    public static void onStateChangeForTesting(Activity activity, int i) {
        onStateChange(activity, i);
    }

    public static void registerStateListenerForActivity(ActivityStateListener activityStateListener, Activity activity) {
        sActivityInfo.get(activity).getListeners().addObserver(activityStateListener);
    }

    public static void onStateChange(Activity activity, int i) {
        if (activity != null) {
            if (sActivity == null || i == 1 || i == 3 || i == 2) {
                sActivity = activity;
            }
            int stateForApplication = getStateForApplication();
            if (i == 1) {
                sActivityInfo.put(activity, new ActivityInfo());
            }
            synchronized (sCachedApplicationStateLock) {
                sCachedApplicationState = null;
            }
            ActivityInfo activityInfo = sActivityInfo.get(activity);
            activityInfo.setStatus(i);
            if (i == 6) {
                sActivityInfo.remove(activity);
                if (activity == sActivity) {
                    sActivity = null;
                }
            }
            Iterator it2 = activityInfo.getListeners().iterator();
            while (it2.hasNext()) {
                ((ActivityStateListener) it2.next()).onActivityStateChange(activity, i);
            }
            Iterator it3 = sGeneralActivityStateListeners.iterator();
            while (it3.hasNext()) {
                ((ActivityStateListener) it3.next()).onActivityStateChange(activity, i);
            }
            int stateForApplication2 = getStateForApplication();
            if (stateForApplication2 != stateForApplication) {
                Iterator it4 = sApplicationStateListeners.iterator();
                while (it4.hasNext()) {
                    ((ApplicationStateListener) it4.next()).onApplicationStateChange(stateForApplication2);
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("null activity is not supported");
    }
}
