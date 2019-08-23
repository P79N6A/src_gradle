package com.rocket.android.commonsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.bytedance.common.utility.collection.WeakContainer;
import com.ss.android.common.applog.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@Keep
public final class ActivityStack {
    public static final Application.ActivityLifecycleCallbacks lifecycleCallbacks = new Application.ActivityLifecycleCallbacks() {
        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            synchronized (ActivityStack.class) {
                ActivityStack.sActivityStack.remove(activity);
            }
        }

        public final void onActivityStarted(Activity activity) {
            synchronized (ActivityStack.class) {
                ActivityStack.sStartedActivities.add(activity);
            }
        }

        public final void onActivityResumed(Activity activity) {
            synchronized (ActivityStack.class) {
                if (ActivityStack.sAppBackGround) {
                    ActivityStack.sAppBackGround = false;
                    if (!ActivityStack.sAppBackgroundListeners.isEmpty()) {
                        Iterator it2 = ActivityStack.sAppBackgroundListeners.iterator();
                        while (it2.hasNext()) {
                            OnAppBackGroundListener onAppBackGroundListener = (OnAppBackGroundListener) it2.next();
                            if (onAppBackGroundListener != null) {
                                onAppBackGroundListener.onAppForeground();
                            }
                        }
                    }
                }
            }
        }

        public final void onActivityStopped(Activity activity) {
            synchronized (ActivityStack.class) {
                ActivityStack.sStartedActivities.remove(activity);
                if (!ActivityStack.sAppBackGround && ActivityStack.sStartedActivities.isEmpty()) {
                    ActivityStack.sAppBackGround = true;
                    if (!ActivityStack.sAppBackgroundListeners.isEmpty()) {
                        Iterator it2 = ActivityStack.sAppBackgroundListeners.iterator();
                        while (it2.hasNext()) {
                            OnAppBackGroundListener onAppBackGroundListener = (OnAppBackGroundListener) it2.next();
                            if (onAppBackGroundListener != null) {
                                onAppBackGroundListener.onAppBackground();
                            }
                        }
                    }
                }
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            synchronized (ActivityStack.class) {
                ActivityStack.sActivityStack.remove(activity);
                ActivityStack.sActivityStack.add(activity);
            }
            z.a(activity);
        }
    };
    static final LinkedList<Activity> sActivityStack = new LinkedList<>();
    static boolean sAppBackGround = true;
    static final WeakContainer<OnAppBackGroundListener> sAppBackgroundListeners = new WeakContainer<>();
    static final WeakContainer<Activity> sStartedActivities = new WeakContainer<>();

    public interface MayDelayFinishActivity {
        void shouldFinish();
    }

    public interface OnAppBackGroundListener {
        void onAppBackground();

        void onAppForeground();
    }

    public static boolean isAppBackGround() {
        return sAppBackGround;
    }

    public static synchronized Activity[] getActivityStack() {
        Activity[] activityArr;
        synchronized (ActivityStack.class) {
            activityArr = (Activity[]) sActivityStack.toArray(new Activity[sActivityStack.size()]);
        }
        return activityArr;
    }

    public static synchronized Activity getTopActivity() {
        synchronized (ActivityStack.class) {
            if (sActivityStack.isEmpty()) {
                return null;
            }
            Activity last = sActivityStack.getLast();
            return last;
        }
    }

    public static synchronized Activity getValidTopActivity() {
        Activity topActivity;
        synchronized (ActivityStack.class) {
            topActivity = getTopActivity();
            if (topActivity != null && topActivity.isFinishing()) {
                sActivityStack.removeLast();
                topActivity = getValidTopActivity();
            }
        }
        return topActivity;
    }

    public static synchronized Activity getPreviousActivity() {
        synchronized (ActivityStack.class) {
            if (sActivityStack.size() < 2) {
                return null;
            }
            LinkedList<Activity> linkedList = sActivityStack;
            Activity activity = linkedList.get(linkedList.size() - 2);
            return activity;
        }
    }

    public static synchronized Activity[] getStartedActivitys() {
        Activity[] activityArr;
        synchronized (ActivityStack.class) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = sStartedActivities.iterator();
            while (it2 != null && it2.hasNext()) {
                Activity activity = (Activity) it2.next();
                if (activity != null) {
                    arrayList.add(activity);
                }
            }
            activityArr = (Activity[]) arrayList.toArray(new Activity[arrayList.size()]);
        }
        return activityArr;
    }

    public static synchronized void removeAppBackGroundListener(OnAppBackGroundListener onAppBackGroundListener) {
        synchronized (ActivityStack.class) {
            if (onAppBackGroundListener != null) {
                sAppBackgroundListeners.remove(onAppBackGroundListener);
            }
        }
    }

    public static synchronized void addAppBackGroundListener(OnAppBackGroundListener onAppBackGroundListener) {
        synchronized (ActivityStack.class) {
            if (onAppBackGroundListener != null) {
                if (!sAppBackgroundListeners.contains(onAppBackGroundListener)) {
                    sAppBackgroundListeners.add(onAppBackGroundListener);
                }
            }
        }
    }

    @UiThread
    public static void finishAllFlipChatActivity(@NonNull Class<?> cls) {
        Iterator it2 = sActivityStack.iterator();
        while (it2.hasNext()) {
            Activity activity = (Activity) it2.next();
            if (cls.isInstance(activity)) {
                if (activity instanceof MayDelayFinishActivity) {
                    ((MayDelayFinishActivity) activity).shouldFinish();
                } else {
                    activity.finish();
                }
            }
        }
    }

    public static synchronized Activity getPreviousActivity(Activity activity) {
        Activity activity2;
        synchronized (ActivityStack.class) {
            LinkedList<Activity> linkedList = sActivityStack;
            activity2 = null;
            int size = linkedList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Activity activity3 = linkedList.get(size);
                if (activity3 == activity || activity3.getTaskId() != activity.getTaskId()) {
                    int i = size - 1;
                    if (i >= 0) {
                        activity2 = linkedList.get(i);
                        break;
                    }
                }
                size--;
            }
        }
        return activity2;
    }
}
