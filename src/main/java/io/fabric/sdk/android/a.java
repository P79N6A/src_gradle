package io.fabric.sdk.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public C0881a f83123a;

    /* renamed from: b  reason: collision with root package name */
    private final Application f83124b;

    /* renamed from: io.fabric.sdk.android.a$a  reason: collision with other inner class name */
    public static class C0881a {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Application.ActivityLifecycleCallbacks> f83125a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public final Application f83126b;

        C0881a(Application application) {
            this.f83126b = application;
        }

        @TargetApi(14)
        public final boolean a(final b bVar) {
            if (this.f83126b == null) {
                return false;
            }
            AnonymousClass1 r0 = new Application.ActivityLifecycleCallbacks() {
                public final void onActivityDestroyed(Activity activity) {
                    bVar.onActivityDestroyed(activity);
                }

                public final void onActivityPaused(Activity activity) {
                    bVar.onActivityPaused(activity);
                }

                public final void onActivityResumed(Activity activity) {
                    bVar.onActivityResumed(activity);
                }

                public final void onActivityStarted(Activity activity) {
                    bVar.onActivityStarted(activity);
                }

                public final void onActivityStopped(Activity activity) {
                    bVar.onActivityStopped(activity);
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    bVar.onActivityCreated(activity, bundle);
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    bVar.onActivitySaveInstanceState(activity, bundle);
                }
            };
            this.f83126b.registerActivityLifecycleCallbacks(r0);
            this.f83125a.add(r0);
            return true;
        }
    }

    public static abstract class b {
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public final boolean a(b bVar) {
        if (this.f83123a == null || !this.f83123a.a(bVar)) {
            return false;
        }
        return true;
    }

    public a(Context context) {
        this.f83124b = (Application) context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 14) {
            this.f83123a = new C0881a(this.f83124b);
        }
    }
}
