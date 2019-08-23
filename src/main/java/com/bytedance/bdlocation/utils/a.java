package com.bytedance.bdlocation.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.bdlocation.Util;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static int f19324a;

    /* renamed from: b  reason: collision with root package name */
    public static List<C0149a> f19325b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public static Application.ActivityLifecycleCallbacks f19326c = new Application.ActivityLifecycleCallbacks() {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
            if (a.f19324a == 0) {
                a.a(false);
            }
            a.f19324a++;
        }

        public final void onActivityStopped(Activity activity) {
            int i = a.f19324a - 1;
            a.f19324a = i;
            if (i == 0) {
                a.a(true);
            }
        }
    };

    /* renamed from: com.bytedance.bdlocation.utils.a$a  reason: collision with other inner class name */
    public interface C0149a {
        void a(boolean z);
    }

    private a() {
    }

    public static void a(boolean z) {
        synchronized (a.class) {
            if (!Util.isEmpty(f19325b)) {
                for (C0149a a2 : f19325b) {
                    a2.a(z);
                }
            }
        }
    }
}
