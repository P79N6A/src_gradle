package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.bytedance.common.utility.collection.WeakContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

@Keep
public final class ActivityStack {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Application.ActivityLifecycleCallbacks lifecycleCallbacks = new Application.ActivityLifecycleCallbacks() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75438a;

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, f75438a, false, 87852, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, this, f75438a, false, 87852, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            synchronized (ActivityStack.class) {
                ActivityStack.sActivityStack.remove(activity2);
            }
        }

        public final void onActivityResumed(Activity activity) {
            if (PatchProxy.isSupport(new Object[]{activity}, this, f75438a, false, 87853, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity}, this, f75438a, false, 87853, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            synchronized (ActivityStack.class) {
                if (ActivityStack.sAppBackGround) {
                    ActivityStack.sAppBackGround = false;
                    if (!ActivityStack.sAppBackgroundListeners.isEmpty()) {
                        Iterator it2 = ActivityStack.sAppBackgroundListeners.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                    }
                }
            }
        }

        public final void onActivityStarted(Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, f75438a, false, 87854, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, this, f75438a, false, 87854, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            synchronized (ActivityStack.class) {
                ActivityStack.sStartedActivities.add(activity2);
            }
        }

        public final void onActivityStopped(Activity activity) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2}, this, f75438a, false, 87855, new Class[]{Activity.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2}, this, f75438a, false, 87855, new Class[]{Activity.class}, Void.TYPE);
                return;
            }
            synchronized (ActivityStack.class) {
                ActivityStack.sStartedActivities.remove(activity2);
                if (!ActivityStack.sAppBackGround && ActivityStack.sStartedActivities.isEmpty()) {
                    ActivityStack.sAppBackGround = true;
                    if (!ActivityStack.sAppBackgroundListeners.isEmpty()) {
                        Iterator it2 = ActivityStack.sAppBackgroundListeners.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                    }
                }
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Activity activity2 = activity;
            if (PatchProxy.isSupport(new Object[]{activity2, bundle}, this, f75438a, false, 87851, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, bundle}, this, f75438a, false, 87851, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
                return;
            }
            synchronized (ActivityStack.class) {
                ActivityStack.sActivityStack.remove(activity2);
                ActivityStack.sActivityStack.add(activity2);
            }
            z.a(activity);
        }
    };
    static LinkedList<Activity> sActivityStack = new LinkedList<>();
    static boolean sAppBackGround = true;
    static WeakContainer<b> sAppBackgroundListeners = new WeakContainer<>();
    static WeakContainer<Activity> sStartedActivities = new WeakContainer<>();

    public interface a {
    }

    public interface b {
    }

    public static boolean isAppBackGround() {
        return sAppBackGround;
    }

    public static synchronized Activity[] getActivityStack() {
        synchronized (ActivityStack.class) {
            if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 87846, new Class[0], Activity[].class)) {
                Activity[] activityArr = (Activity[]) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 87846, new Class[0], Activity[].class);
                return activityArr;
            }
            Activity[] activityArr2 = (Activity[]) sActivityStack.toArray(new Activity[sActivityStack.size()]);
            return activityArr2;
        }
    }

    public static synchronized Activity getPreviousActivity() {
        synchronized (ActivityStack.class) {
            if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 87844, new Class[0], Activity.class)) {
                Activity activity = (Activity) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 87844, new Class[0], Activity.class);
                return activity;
            } else if (sActivityStack.size() < 2) {
                return null;
            } else {
                LinkedList<Activity> linkedList = sActivityStack;
                Activity activity2 = linkedList.get(linkedList.size() - 2);
                return activity2;
            }
        }
    }

    public static synchronized Activity[] getStartedActivitys() {
        synchronized (ActivityStack.class) {
            if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 87847, new Class[0], Activity[].class)) {
                Activity[] activityArr = (Activity[]) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 87847, new Class[0], Activity[].class);
                return activityArr;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = sStartedActivities.iterator();
            while (it2 != null && it2.hasNext()) {
                Activity activity = (Activity) it2.next();
                if (activity != null) {
                    arrayList.add(activity);
                }
            }
            Activity[] activityArr2 = (Activity[]) arrayList.toArray(new Activity[arrayList.size()]);
            return activityArr2;
        }
    }

    public static synchronized Activity getTopActivity() {
        synchronized (ActivityStack.class) {
            if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 87843, new Class[0], Activity.class)) {
                Activity activity = (Activity) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 87843, new Class[0], Activity.class);
                return activity;
            } else if (sActivityStack.isEmpty()) {
                return null;
            } else {
                Activity last = sActivityStack.getLast();
                return last;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.app.Activity getValidTopActivity() {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.utils.ActivityStack> r0 = com.ss.android.ugc.aweme.utils.ActivityStack.class
            monitor-enter(r0)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0043 }
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect     // Catch:{ all -> 0x0043 }
            r5 = 1
            r6 = 87845(0x15725, float:1.23097E-40)
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ all -> 0x0043 }
            java.lang.Class<android.app.Activity> r8 = android.app.Activity.class
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x002c
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0043 }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect     // Catch:{ all -> 0x0043 }
            r6 = 1
            r7 = 87845(0x15725, float:1.23097E-40)
            java.lang.Class[] r8 = new java.lang.Class[r1]     // Catch:{ all -> 0x0043 }
            java.lang.Class<android.app.Activity> r9 = android.app.Activity.class
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0043 }
            android.app.Activity r1 = (android.app.Activity) r1     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)
            return r1
        L_0x002c:
            android.app.Activity r1 = getTopActivity()     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0041
            boolean r2 = r1.isFinishing()     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0041
            java.util.LinkedList<android.app.Activity> r1 = sActivityStack     // Catch:{ all -> 0x0043 }
            r1.removeLast()     // Catch:{ all -> 0x0043 }
            android.app.Activity r1 = getValidTopActivity()     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r0)
            return r1
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ActivityStack.getValidTopActivity():android.app.Activity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void addAppBackGroundListener(com.ss.android.ugc.aweme.utils.ActivityStack.b r18) {
        /*
            r0 = r18
            java.lang.Class<com.ss.android.ugc.aweme.utils.ActivityStack> r1 = com.ss.android.ugc.aweme.utils.ActivityStack.class
            monitor-enter(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x004b }
            r10 = 0
            r3[r10] = r0     // Catch:{ all -> 0x004b }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect     // Catch:{ all -> 0x004b }
            r6 = 1
            r7 = 87848(0x15728, float:1.23101E-40)
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x004b }
            java.lang.Class<com.ss.android.ugc.aweme.utils.ActivityStack$b> r9 = com.ss.android.ugc.aweme.utils.ActivityStack.b.class
            r8[r10] = r9     // Catch:{ all -> 0x004b }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ all -> 0x004b }
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x004b }
            if (r3 == 0) goto L_0x003a
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x004b }
            r11[r10] = r0     // Catch:{ all -> 0x004b }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = changeQuickRedirect     // Catch:{ all -> 0x004b }
            r14 = 1
            r15 = 87848(0x15728, float:1.23101E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x004b }
            java.lang.Class<com.ss.android.ugc.aweme.utils.ActivityStack$b> r2 = com.ss.android.ugc.aweme.utils.ActivityStack.b.class
            r0[r10] = r2     // Catch:{ all -> 0x004b }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ all -> 0x004b }
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x004b }
            monitor-exit(r1)
            return
        L_0x003a:
            if (r0 == 0) goto L_0x0049
            com.bytedance.common.utility.collection.WeakContainer<com.ss.android.ugc.aweme.utils.ActivityStack$b> r2 = sAppBackgroundListeners     // Catch:{ all -> 0x004b }
            boolean r2 = r2.contains(r0)     // Catch:{ all -> 0x004b }
            if (r2 != 0) goto L_0x0049
            com.bytedance.common.utility.collection.WeakContainer<com.ss.android.ugc.aweme.utils.ActivityStack$b> r2 = sAppBackgroundListeners     // Catch:{ all -> 0x004b }
            r2.add(r0)     // Catch:{ all -> 0x004b }
        L_0x0049:
            monitor-exit(r1)
            return
        L_0x004b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ActivityStack.addAppBackGroundListener(com.ss.android.ugc.aweme.utils.ActivityStack$b):void");
    }

    @UiThread
    public static void finishAllFlipChatActivity(@NonNull Class<?> cls) {
        Class<?> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, null, changeQuickRedirect, true, 87850, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2}, null, changeQuickRedirect, true, 87850, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        Iterator it2 = sActivityStack.iterator();
        while (it2.hasNext()) {
            Activity activity = (Activity) it2.next();
            if (cls2.isInstance(activity) && !(activity instanceof a)) {
                activity.finish();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void removeAppBackGroundListener(com.ss.android.ugc.aweme.utils.ActivityStack.b r18) {
        /*
            r0 = r18
            java.lang.Class<com.ss.android.ugc.aweme.utils.ActivityStack> r1 = com.ss.android.ugc.aweme.utils.ActivityStack.class
            monitor-enter(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0043 }
            r10 = 0
            r3[r10] = r0     // Catch:{ all -> 0x0043 }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect     // Catch:{ all -> 0x0043 }
            r6 = 1
            r7 = 87849(0x15729, float:1.23103E-40)
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x0043 }
            java.lang.Class<com.ss.android.ugc.aweme.utils.ActivityStack$b> r9 = com.ss.android.ugc.aweme.utils.ActivityStack.b.class
            r8[r10] = r9     // Catch:{ all -> 0x0043 }
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ all -> 0x0043 }
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x003a
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x0043 }
            r11[r10] = r0     // Catch:{ all -> 0x0043 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = changeQuickRedirect     // Catch:{ all -> 0x0043 }
            r14 = 1
            r15 = 87849(0x15729, float:1.23103E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x0043 }
            java.lang.Class<com.ss.android.ugc.aweme.utils.ActivityStack$b> r2 = com.ss.android.ugc.aweme.utils.ActivityStack.b.class
            r0[r10] = r2     // Catch:{ all -> 0x0043 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ all -> 0x0043 }
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0043 }
            monitor-exit(r1)
            return
        L_0x003a:
            if (r0 == 0) goto L_0x0041
            com.bytedance.common.utility.collection.WeakContainer<com.ss.android.ugc.aweme.utils.ActivityStack$b> r2 = sAppBackgroundListeners     // Catch:{ all -> 0x0043 }
            r2.remove(r0)     // Catch:{ all -> 0x0043 }
        L_0x0041:
            monitor-exit(r1)
            return
        L_0x0043:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ActivityStack.removeAppBackGroundListener(com.ss.android.ugc.aweme.utils.ActivityStack$b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized android.app.Activity getPreviousActivity(android.app.Activity r18) {
        /*
            r0 = r18
            java.lang.Class<com.ss.android.ugc.aweme.utils.ActivityStack> r1 = com.ss.android.ugc.aweme.utils.ActivityStack.class
            monitor-enter(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x006a }
            r10 = 0
            r3[r10] = r0     // Catch:{ all -> 0x006a }
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect     // Catch:{ all -> 0x006a }
            r6 = 1
            r7 = 87842(0x15722, float:1.23093E-40)
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ all -> 0x006a }
            java.lang.Class<android.app.Activity> r9 = android.app.Activity.class
            r8[r10] = r9     // Catch:{ all -> 0x006a }
            java.lang.Class<android.app.Activity> r9 = android.app.Activity.class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x006a }
            if (r3 == 0) goto L_0x003d
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ all -> 0x006a }
            r11[r10] = r0     // Catch:{ all -> 0x006a }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = changeQuickRedirect     // Catch:{ all -> 0x006a }
            r14 = 1
            r15 = 87842(0x15722, float:1.23093E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ all -> 0x006a }
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r0[r10] = r2     // Catch:{ all -> 0x006a }
            java.lang.Class<android.app.Activity> r17 = android.app.Activity.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x006a }
            android.app.Activity r0 = (android.app.Activity) r0     // Catch:{ all -> 0x006a }
            monitor-exit(r1)
            return r0
        L_0x003d:
            java.util.LinkedList<android.app.Activity> r3 = sActivityStack     // Catch:{ all -> 0x006a }
            r4 = 0
            int r5 = r3.size()     // Catch:{ all -> 0x006a }
            int r5 = r5 - r2
        L_0x0045:
            if (r5 < 0) goto L_0x0068
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x006a }
            android.app.Activity r2 = (android.app.Activity) r2     // Catch:{ all -> 0x006a }
            if (r2 == r0) goto L_0x0059
            int r2 = r2.getTaskId()     // Catch:{ all -> 0x006a }
            int r6 = r18.getTaskId()     // Catch:{ all -> 0x006a }
            if (r2 == r6) goto L_0x0065
        L_0x0059:
            int r2 = r5 + -1
            if (r2 < 0) goto L_0x0065
            java.lang.Object r0 = r3.get(r2)     // Catch:{ all -> 0x006a }
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x0065:
            int r5 = r5 + -1
            goto L_0x0045
        L_0x0068:
            monitor-exit(r1)
            return r4
        L_0x006a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.ActivityStack.getPreviousActivity(android.app.Activity):android.app.Activity");
    }
}
