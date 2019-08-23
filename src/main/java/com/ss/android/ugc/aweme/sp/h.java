package com.ss.android.ugc.aweme.sp;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.IBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

public final class h extends Instrumentation {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4104a;

    /* renamed from: b  reason: collision with root package name */
    private static Field f4105b;

    /* renamed from: c  reason: collision with root package name */
    private Instrumentation f4106c;

    static {
        try {
            Field declaredField = Class.forName("android.content.ContextWrapper").getDeclaredField("mBase");
            f4105b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        } catch (ClassNotFoundException unused2) {
        }
    }

    public h(Instrumentation instrumentation) {
        this.f4106c = instrumentation;
    }

    public final void callActivityOnDestroy(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f4104a, false, 81785, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f4104a, false, 81785, new Class[]{Activity.class}, Void.TYPE);
        } else if (this.f4106c != null) {
            this.f4106c.callActivityOnDestroy(activity);
        } else {
            super.callActivityOnDestroy(activity);
        }
    }

    public final void callActivityOnPause(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f4104a, false, 81778, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f4104a, false, 81778, new Class[]{Activity.class}, Void.TYPE);
        } else if (this.f4106c != null) {
            this.f4106c.callActivityOnPause(activity);
        } else {
            super.callActivityOnPause(activity);
        }
    }

    public final void callActivityOnRestart(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f4104a, false, 81780, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f4104a, false, 81780, new Class[]{Activity.class}, Void.TYPE);
        } else if (this.f4106c != null) {
            this.f4106c.callActivityOnRestart(activity);
        } else {
            super.callActivityOnRestart(activity);
        }
    }

    public final void callActivityOnResume(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f4104a, false, 81777, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f4104a, false, 81777, new Class[]{Activity.class}, Void.TYPE);
        } else if (this.f4106c != null) {
            this.f4106c.callActivityOnResume(activity);
        } else {
            super.callActivityOnResume(activity);
        }
    }

    public final void callActivityOnStart(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f4104a, false, 81779, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f4104a, false, 81779, new Class[]{Activity.class}, Void.TYPE);
        } else if (this.f4106c != null) {
            this.f4106c.callActivityOnStart(activity);
        } else {
            super.callActivityOnStart(activity);
        }
    }

    public final void callActivityOnStop(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f4104a, false, 81784, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f4104a, false, 81784, new Class[]{Activity.class}, Void.TYPE);
        } else if (this.f4106c != null) {
            this.f4106c.callActivityOnStop(activity);
        } else {
            super.callActivityOnStop(activity);
        }
    }

    public final void callActivityOnUserLeaving(Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f4104a, false, 81788, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f4104a, false, 81788, new Class[]{Activity.class}, Void.TYPE);
        } else if (this.f4106c != null) {
            this.f4106c.callActivityOnUserLeaving(activity);
        } else {
            super.callActivityOnUserLeaving(activity);
        }
    }

    public final void callApplicationOnCreate(Application application) {
        if (PatchProxy.isSupport(new Object[]{application}, this, f4104a, false, 81774, new Class[]{Application.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{application}, this, f4104a, false, 81774, new Class[]{Application.class}, Void.TYPE);
        } else if (this.f4106c != null) {
            this.f4106c.callApplicationOnCreate(application);
        } else {
            super.callApplicationOnCreate(application);
        }
    }

    public final void callActivityOnNewIntent(Activity activity, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{activity, intent}, this, f4104a, false, 81782, new Class[]{Activity.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, intent}, this, f4104a, false, 81782, new Class[]{Activity.class, Intent.class}, Void.TYPE);
        } else if (this.f4106c != null) {
            this.f4106c.callActivityOnNewIntent(activity, intent);
        } else {
            super.callActivityOnNewIntent(activity, intent);
        }
    }

    public final void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{activity, bundle}, this, f4104a, false, 81783, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, bundle}, this, f4104a, false, 81783, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
        } else if (this.f4106c != null) {
            this.f4106c.callActivityOnRestoreInstanceState(activity, bundle);
        } else {
            super.callActivityOnRestoreInstanceState(activity, bundle);
        }
    }

    public final void callActivityOnSaveInstanceState(Activity activity, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{activity, bundle}, this, f4104a, false, 81781, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, bundle}, this, f4104a, false, 81781, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
        } else if (this.f4106c != null) {
            this.f4106c.callActivityOnSaveInstanceState(activity, bundle);
        } else {
            super.callActivityOnSaveInstanceState(activity, bundle);
        }
    }

    public final boolean onException(Object obj, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{obj, th}, this, f4104a, false, 81786, new Class[]{Object.class, Throwable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj, th}, this, f4104a, false, 81786, new Class[]{Object.class, Throwable.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f4106c != null) {
            return this.f4106c.onException(obj, th);
        } else {
            return super.onException(obj, th);
        }
    }

    public final void callActivityOnCreate(Activity activity, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{activity, bundle}, this, f4104a, false, 81776, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, bundle}, this, f4104a, false, 81776, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{activity}, this, f4104a, false, 81772, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f4104a, false, 81772, new Class[]{Activity.class}, Void.TYPE);
        } else {
            try {
                if (f4105b != null) {
                    if (!(((Context) f4105b.get(activity)) instanceof g)) {
                        f4105b.set(activity, new g(activity.getBaseContext()));
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (this.f4106c != null) {
            this.f4106c.callActivityOnCreate(activity, bundle);
        } else {
            super.callActivityOnCreate(activity, bundle);
        }
    }

    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader classLoader2 = classLoader;
        String str2 = str;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{classLoader2, str2, intent2}, this, f4104a, false, 81773, new Class[]{ClassLoader.class, String.class, Intent.class}, Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[]{classLoader2, str2, intent2}, this, f4104a, false, 81773, new Class[]{ClassLoader.class, String.class, Intent.class}, Activity.class);
        } else if (this.f4106c == null) {
            return super.newActivity(classLoader, str, intent);
        } else {
            return this.f4106c.newActivity(classLoader2, str2, intent2);
        }
    }

    public final Application newApplication(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        ClassLoader classLoader2 = classLoader;
        String str2 = str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{classLoader2, str2, context2}, this, f4104a, false, 81775, new Class[]{ClassLoader.class, String.class, Context.class}, Application.class)) {
            return (Application) PatchProxy.accessDispatch(new Object[]{classLoader2, str2, context2}, this, f4104a, false, 81775, new Class[]{ClassLoader.class, String.class, Context.class}, Application.class);
        } else if (this.f4106c != null) {
            return this.f4106c.newApplication(classLoader2, str2, context2);
        } else {
            return super.newApplication(classLoader, str, context);
        }
    }

    public final Activity newActivity(Class<?> cls, Context context, IBinder iBinder, Application application, Intent intent, ActivityInfo activityInfo, CharSequence charSequence, Activity activity, String str, Object obj) throws IllegalAccessException, InstantiationException {
        if (PatchProxy.isSupport(new Object[]{cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj}, this, f4104a, false, 81787, new Class[]{Class.class, Context.class, IBinder.class, Application.class, Intent.class, ActivityInfo.class, CharSequence.class, Activity.class, String.class, Object.class}, Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[]{cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj}, this, f4104a, false, 81787, new Class[]{Class.class, Context.class, IBinder.class, Application.class, Intent.class, ActivityInfo.class, CharSequence.class, Activity.class, String.class, Object.class}, Activity.class);
        } else if (this.f4106c != null) {
            return this.f4106c.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        } else {
            return super.newActivity(cls, context, iBinder, application, intent, activityInfo, charSequence, activity, str, obj);
        }
    }
}
