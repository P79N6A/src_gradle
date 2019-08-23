package com.bytedance.frameworks.plugin.hook;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.Mira;
import com.bytedance.frameworks.plugin.a.b;
import com.bytedance.frameworks.plugin.am.d;
import com.bytedance.frameworks.plugin.b.f;
import com.bytedance.frameworks.plugin.c.j;
import com.bytedance.frameworks.plugin.c.k;
import com.bytedance.frameworks.plugin.core.PluginLoadIndicator;
import com.bytedance.frameworks.plugin.core.h;
import com.bytedance.frameworks.plugin.core.res.a;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.f.l;
import com.bytedance.frameworks.plugin.f.m;
import com.bytedance.frameworks.plugin.pm.c;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Iterator;
import java.util.List;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class InstrumentationHook extends Hook {

    static class AssetMrgChecker {
        private int assetCount;
        private AssetManager originAsset;

        private AssetMrgChecker() {
        }

        public boolean checkAssetDifference(AssetManager assetManager) {
            if (this.originAsset != assetManager) {
                return true;
            }
            if (!a.a() || l.a(assetManager) == this.assetCount) {
                return false;
            }
            return true;
        }

        public AssetMrgChecker setStartAsset(AssetManager assetManager) {
            this.originAsset = assetManager;
            if (a.a()) {
                this.assetCount = l.a(this.originAsset);
            }
            return this;
        }
    }

    public static class PluginInstrumentation extends Instrumentation {
        private com.bytedance.frameworks.plugin.am.a mAppThread = new com.bytedance.frameworks.plugin.am.a();
        private Instrumentation mBase;

        public class _lancet {
            private _lancet() {
            }

            @TargetClass
            @Proxy
            static void com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(int i) {
                String str = com.ss.android.ugc.aweme.framework.core.a.b().f3304b;
                if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                    System.exit(i);
                    return;
                }
                throw new RuntimeException("Process killed, status is " + i);
            }

            @TargetClass
            @Proxy
            static void com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(int i) {
                String str = com.ss.android.ugc.aweme.framework.core.a.b().f3304b;
                if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
                    Process.killProcess(i);
                    return;
                }
                throw new RuntimeException("Process killed, pid is " + i);
            }
        }

        public PluginInstrumentation(Instrumentation instrumentation) {
            this.mBase = instrumentation;
        }

        private void ensureClassLoaderCorrect(Bundle bundle) {
            if (bundle != null) {
                ClassLoader classLoader = getClass().getClassLoader();
                if (classLoader != bundle.getClassLoader()) {
                    bundle.setClassLoader(classLoader);
                }
            }
        }

        private void ensureSavedInstanceStateLegal(Bundle bundle) {
            if (bundle != null) {
                ensureClassLoaderCorrect(bundle);
                Bundle bundle2 = bundle.getBundle("android:viewHierarchyState");
                if (bundle2 != null) {
                    ensureClassLoaderCorrect(bundle2);
                }
            }
        }

        public void callActivityOnDestroy(Activity activity) {
            onActivityDestory(activity);
            if (this.mBase != null) {
                this.mBase.callActivityOnDestroy(activity);
            } else {
                super.callActivityOnDestroy(activity);
            }
        }

        private void amendOpPackageNameInContextImpl(Context context) {
            if (context != null && !TextUtils.equals(context.getPackageName(), e.a().getPackageName()) && Build.VERSION.SDK_INT >= 15) {
                try {
                    com.bytedance.frameworks.plugin.e.a.a((Object) context, "mOpPackageName", (Object) e.a().getPackageName());
                } catch (IllegalAccessException unused) {
                }
            }
        }

        private void amendPackageNameInContentResolver(Context context) {
            if (context != null && !TextUtils.equals(context.getPackageName(), e.a().getPackageName()) && Build.VERSION.SDK_INT >= 15) {
                try {
                    com.bytedance.frameworks.plugin.e.a.a(com.bytedance.frameworks.plugin.e.a.a((Object) context, "mContentResolver"), "mPackageName", (Object) e.a().getPackageName());
                } catch (IllegalAccessException unused) {
                }
            }
        }

        private String getPluginPackageNameFromIntent(Intent intent) {
            String stringExtra = intent.getStringExtra("plugin_package_name");
            if (!TextUtils.isEmpty(stringExtra)) {
                return stringExtra;
            }
            if (intent.getComponent() != null) {
                return intent.getComponent().getPackageName();
            }
            return intent.getPackage();
        }

        private void onActivityCreated(Activity activity) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                ActivityInfo activityInfo = (ActivityInfo) intent.getParcelableExtra("target_activityinfo");
                ActivityInfo activityInfo2 = (ActivityInfo) intent.getParcelableExtra("stub_activityinfo");
                if (!(activityInfo == null || activityInfo2 == null)) {
                    if (activity.getRequestedOrientation() == -1 && activityInfo.screenOrientation != -1) {
                        activity.setRequestedOrientation(activityInfo.screenOrientation);
                    }
                    try {
                        d.a().a(activityInfo2, activityInfo);
                    } catch (Exception e2) {
                        g.a("PluginActivityManager activityCreated fail.", (Throwable) e2);
                    }
                }
            }
        }

        private void onActivityDestory(Activity activity) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                ActivityInfo activityInfo = (ActivityInfo) intent.getParcelableExtra("target_activityinfo");
                ActivityInfo activityInfo2 = (ActivityInfo) intent.getParcelableExtra("stub_activityinfo");
                if (!(activityInfo == null || activityInfo2 == null)) {
                    try {
                        d.a().b(activityInfo2, activityInfo);
                    } catch (Exception e2) {
                        g.a("PluginActivityManager activityDestory fail.", (Throwable) e2);
                    }
                }
            }
        }

        private boolean shareResources(String str) {
            com.bytedance.c.a aVar = com.bytedance.c.a.a.a().f2107a;
            if ((aVar != null && !aVar.f2096c) || !Mira.b()) {
                return false;
            }
            if (e.a().getPackageName().equals(str)) {
                return true;
            }
            return c.d(str);
        }

        private boolean shouldInterrupt(Intent intent) {
            if (intent == null || intent.getBooleanExtra("start_only_for_android", false)) {
                return false;
            }
            String pluginPackageNameFromIntent = getPluginPackageNameFromIntent(intent);
            if (!c.a(pluginPackageNameFromIntent)) {
                return false;
            }
            k a2 = k.a();
            Class<com.bytedance.frameworks.plugin.c.a> cls = com.bytedance.frameworks.plugin.c.a.class;
            synchronized (a2.f2181a) {
                Iterator<j> it2 = a2.f2181a.iterator();
                while (it2.hasNext()) {
                    j next = it2.next();
                    if (cls.isInstance(next)) {
                        next.a();
                    }
                }
            }
            if (!c.b(pluginPackageNameFromIntent)) {
                return true;
            }
            c.e(pluginPackageNameFromIntent);
            return false;
        }

        private Intent wrapIntent(Intent intent) {
            List<ResolveInfo> queryIntentActivities = e.a().getPackageManager().queryIntentActivities(intent, 16842752);
            if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                return intent;
            }
            if (intent != null) {
                intent.putExtra("miraInstrumentationHasWrapIntent", true);
            }
            if (intent != null && !intent.getBooleanExtra("start_only_for_android", false)) {
                List b2 = c.b(intent, 0);
                if (b2 != null && b2.size() > 0) {
                    ActivityInfo activityInfo = ((ResolveInfo) b2.get(0)).activityInfo;
                    if (activityInfo != null) {
                        ActivityInfo a2 = d.a(activityInfo);
                        if (a2 != null) {
                            c.g(activityInfo.packageName);
                            intent.putExtra("target_activityinfo", activityInfo);
                            intent.putExtra("stub_activityinfo", a2);
                            Intent intent2 = new Intent();
                            intent2.setClassName(a2.packageName, a2.name);
                            intent2.setFlags(intent.getFlags());
                            intent2.putExtra("target_intent", intent);
                            intent2.putExtra("target_activityinfo", activityInfo);
                            intent2.putExtra("stub_activityinfo", a2);
                            intent2.putExtra("miraInstrumentationHasWrapIntent", true);
                            intent = intent2;
                        }
                    }
                }
            }
            return intent;
        }

        public void callApplicationOnCreate(Application application) {
            try {
                com.bytedance.frameworks.plugin.e.a.a((Object) application.getPackageManager(), "mPM", com.bytedance.frameworks.plugin.e.a.a(com.bytedance.frameworks.plugin.b.a.a(), "sPackageManager"));
            } catch (Exception unused) {
            }
            amendOpPackageNameInContextImpl(application.getBaseContext());
            amendPackageNameInContentResolver(application.getBaseContext());
            try {
                d.a().a(application.getApplicationInfo(), f.a(application), Process.myPid(), this.mAppThread);
            } catch (Exception e2) {
                g.a("PluginActivityManager applicationCreated fail.", (Throwable) e2);
            }
            com.bytedance.frameworks.plugin.f.k.f2265a.addAll(c.e());
            if (this.mBase != null) {
                this.mBase.callApplicationOnCreate(application);
            } else {
                super.callApplicationOnCreate(application);
            }
        }

        public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle) {
            ensureSavedInstanceStateLegal(bundle);
            super.callActivityOnRestoreInstanceState(activity, bundle);
        }

        public void callActivityOnNewIntent(Activity activity, Intent intent) {
            onActivityOnNewIntent(activity, intent);
            if (this.mBase != null) {
                this.mBase.callActivityOnNewIntent(activity, intent);
            } else {
                super.callActivityOnNewIntent(activity, intent);
            }
        }

        private void handleException(Intent intent, Exception exc) {
            if (exc instanceof InvocationTargetException) {
                Throwable targetException = ((InvocationTargetException) exc).getTargetException();
                if (targetException instanceof SecurityException) {
                    throw ((SecurityException) targetException);
                }
            }
            if (!intent.getBooleanExtra("start_only_for_android", false)) {
                g.a("execStartActivity error.", (Throwable) exc);
                return;
            }
            throw new RuntimeException(exc);
        }

        private void onActivityOnNewIntent(Activity activity, Intent intent) {
            Intent intent2 = activity.getIntent();
            if (intent2 != null) {
                ActivityInfo activityInfo = (ActivityInfo) intent2.getParcelableExtra("target_activityinfo");
                ActivityInfo activityInfo2 = (ActivityInfo) intent2.getParcelableExtra("stub_activityinfo");
                if (!(activityInfo == null || activityInfo2 == null)) {
                    try {
                        d.a().a(activityInfo2, activityInfo, intent);
                    } catch (Exception e2) {
                        g.a("PluginActivityManager activtyOnNewIntent fail.", (Throwable) e2);
                    }
                }
            }
        }

        public void callActivityOnPostCreate(Activity activity, Bundle bundle) {
            try {
                super.callActivityOnPostCreate(activity, bundle);
            } catch (RuntimeException e2) {
                if (e2.toString().contains("java.lang.UnsupportedOperationException")) {
                    g.c("callActivityOnPostCreate#update activity theme.");
                    h.a().a(activity);
                    super.callActivityOnPostCreate(activity, bundle);
                    return;
                }
                throw e2;
            }
        }

        public boolean onException(Object obj, Throwable th) {
            if (f.c(e.a()) && (obj instanceof Activity) && th.toString().contains("ClassCastException")) {
                g.a("Activity start error.", th);
                ((Activity) obj).finish();
                _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_killProcess(Process.myPid());
                _lancet.com_ss_android_ugc_aweme_lancet_ProcessLancet_exit(1);
                return true;
            } else if (th == null || !(th instanceof UndeclaredThrowableException)) {
                return super.onException(obj, th);
            } else {
                return true;
            }
        }

        public void callActivityOnCreate(Activity activity, Bundle bundle) {
            boolean z;
            String str;
            try {
                Object a2 = com.bytedance.frameworks.plugin.e.a.a(com.bytedance.frameworks.plugin.b.a.a(), "sPackageManager");
                activity.getPackageManager();
                activity.getApplication().getPackageManager();
                activity.getBaseContext().getPackageManager();
                com.bytedance.frameworks.plugin.e.a.a((Object) activity.getPackageManager(), "mPM", a2);
                com.bytedance.frameworks.plugin.e.a.a((Object) activity.getApplication().getPackageManager(), "mPM", a2);
                com.bytedance.frameworks.plugin.e.a.a((Object) activity.getBaseContext().getPackageManager(), "mPM", a2);
            } catch (Exception e2) {
                g.a("hook activity PackageManager fail.", (Throwable) e2);
            }
            ApplicationInfo applicationInfo = activity.getApplicationInfo();
            if (applicationInfo != null) {
                z = shareResources(applicationInfo.packageName);
                if (z) {
                    AssetManager d2 = h.a().d();
                    if (d2 == null) {
                        d2 = activity.getApplication().getAssets();
                    }
                    h.a().a(activity, false, d2);
                }
            } else {
                z = false;
            }
            onActivityCreated(activity);
            amendOpPackageNameInContextImpl(activity.getBaseContext());
            amendPackageNameInContentResolver(activity.getBaseContext());
            if (applicationInfo != null && !TextUtils.equals(applicationInfo.packageName, e.a().getPackageName())) {
                ActivityInfo a3 = c.a(new ComponentName(activity.getPackageName(), activity.getClass().getName()), 1);
                if (a3 != null) {
                    if (a3.applicationInfo == null) {
                        a3.applicationInfo = applicationInfo;
                    }
                    if (g.a()) {
                        g.a("set new activity theme.");
                    }
                    activity.setTheme(a3.getThemeResource());
                }
            }
            if (!TextUtils.equals(activity.getPackageName(), e.a().getPackageName())) {
                com.bytedance.frameworks.plugin.b.c.a(activity.getBaseContext());
            } else if (activity.getApplication() != e.a()) {
                try {
                    com.bytedance.frameworks.plugin.e.a.a((Object) activity, "mApplication", (Object) e.a());
                } catch (Exception unused) {
                    Field a4 = com.bytedance.frameworks.plugin.e.a.a(Activity.class, "mApplication");
                    if (a4 != null) {
                        try {
                            a4.set(activity, e.a());
                        } catch (IllegalAccessException e3) {
                            throw new RuntimeException(e3);
                        }
                    } else {
                        g.c("Replace mApplication Failed !!!");
                    }
                }
            }
            AssetMrgChecker assetMrgChecker = new AssetMrgChecker();
            assetMrgChecker.setStartAsset(activity.getAssets());
            m a5 = m.a("MiraPackageManager");
            try {
                activity.getPackageManager().getActivityInfo(activity.getComponentName(), SearchJediMixFeedAdapter.f42517f);
                a5.b("getActivityInfo");
            } catch (PackageManager.NameNotFoundException unused2) {
                if (f.b(e.a())) {
                    com.bytedance.frameworks.plugin.d.d.a().a(activity.getComponentName().getClassName());
                }
                a5.b("preload");
            }
            if (g.a()) {
                g.a(String.format("%s assets: %s", new Object[]{activity.getClass().getName(), l.c(activity.getResources().getAssets())}));
            }
            try {
                if (this.mBase != null) {
                    this.mBase.callActivityOnCreate(activity, bundle);
                } else {
                    super.callActivityOnCreate(activity, bundle);
                }
            } catch (RuntimeException e4) {
                if (e4.toString().contains("NameNotFoundException")) {
                    if (f.b(e.a())) {
                        Object a6 = com.bytedance.frameworks.plugin.e.a.a(com.bytedance.frameworks.plugin.b.a.a(), "sPackageManager");
                        PackageManager packageManager = activity.getPackageManager();
                        Object a7 = com.bytedance.frameworks.plugin.e.a.a(a6, "mPM");
                        Object a8 = com.bytedance.frameworks.plugin.e.a.a((Object) packageManager, "mPM");
                        Object obj = com.bytedance.frameworks.plugin.c.h.f2173a;
                        ActivityInfo a9 = c.a(activity.getComponentName(), (int) SearchJediMixFeedAdapter.f42517f);
                        String str2 = "[";
                        for (b bVar : com.bytedance.frameworks.plugin.d.b.a().c()) {
                            str2 = str2 + bVar.f2145a + ":" + bVar.o + " ";
                        }
                        String str3 = str2 + "]";
                        String str4 = "currentActivityThread sPackageManager=" + a6 + " activity packageManager=" + packageManager + " sPackageManager mPM=" + a7 + " activity mPM=" + a8 + " pmProxy=" + obj + " activityInfo=" + a9 + " pluginInfo=" + str3;
                        throw new RuntimeException("WTF：" + str4, e4);
                    }
                    throw new RuntimeException("WTF：" + e4.getMessage(), e4);
                } else if ((e4.toString().contains("android.content.res.Resources") || e4.toString().contains("Error inflating class") || e4.toString().contains("java.lang.ArrayIndexOutOfBoundsException")) && !e4.toString().contains("OutOfMemoryError")) {
                    HandleResourceNotFound(activity, bundle, e4);
                } else if (e4.toString().contains("You need to use a Theme.AppCompat theme")) {
                    try {
                        str = String.format("themeId:0x%x themeResources:0x%x", new Object[]{com.bytedance.frameworks.plugin.e.a.a((Object) activity, "mThemeId"), com.bytedance.frameworks.plugin.e.a.a((Object) activity, "mThemeResource")});
                    } catch (Exception unused3) {
                        str = "";
                    }
                    throw new RuntimeException(str, e4);
                } else {
                    throw e4;
                }
            } catch (Exception e5) {
                throw new RuntimeException("CATCH：" + e5.getMessage(), e4);
            }
            if (applicationInfo != null && z) {
                if (g.a()) {
                    g.a("monkey activity resources 2 " + activity.getClass().getSimpleName());
                }
                AssetManager d3 = h.a().d();
                if (d3 == null) {
                    d3 = activity.getApplication().getAssets();
                }
                if (assetMrgChecker.checkAssetDifference(d3)) {
                    h.a().a(activity, true, d3);
                }
            }
            h.a().f2199a = new WeakReference<>(activity);
        }

        public void callActivityOnRestoreInstanceState(Activity activity, Bundle bundle, PersistableBundle persistableBundle) {
            ensureSavedInstanceStateLegal(bundle);
            super.callActivityOnRestoreInstanceState(activity, bundle, persistableBundle);
        }

        private Intent getRedirectIntent(Intent intent, int i, Bundle bundle) {
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            Intent intent2 = new Intent(e.a(), PluginLoadIndicator.class);
            intent2.putExtra("target_intent", intent);
            intent2.putExtra("request_code", i);
            intent2.putExtra("plugin_package_name", getPluginPackageNameFromIntent(intent));
            return intent2;
        }

        public Application newApplication(ClassLoader classLoader, String str, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
            if (!com.bytedance.frameworks.plugin.f.h.a()) {
                return super.newApplication(classLoader, str, context);
            }
            Application application = (Application) classLoader.loadClass(str).newInstance();
            try {
                com.bytedance.frameworks.plugin.e.b.a((Object) application, "attach", context);
            } catch (Exception unused) {
            }
            return application;
        }

        public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
            if (f.b(e.a())) {
                if ("com.ss.android.reactnative.activity.HomepageReactNativeActivity".equals(str)) {
                    c.j("com.ss.android.rn");
                }
                if (com.bytedance.frameworks.plugin.f.h.a()) {
                    return (Activity) e.a().getClassLoader().loadClass(str).newInstance();
                }
                return super.newActivity(e.a().getClassLoader(), str, intent);
            } else if (com.bytedance.frameworks.plugin.f.h.a()) {
                return (Activity) classLoader.loadClass(str).newInstance();
            } else {
                return super.newActivity(classLoader, str, intent);
            }
        }

        private void HandleResourceNotFound(Activity activity, Bundle bundle, RuntimeException runtimeException) {
            boolean z;
            String str = "" + " activity            assets: " + l.c(activity.getAssets());
            String str2 = str + " activity resources  assets: " + l.c(activity.getResources().getAssets());
            String str3 = str2 + " activity contextImp assets: " + l.c(activity.getBaseContext().getAssets());
            String str4 = str3 + " plugin application  assets: " + l.c(activity.getApplication().getAssets());
            StringBuilder sb = new StringBuilder();
            sb.append(str4 + " plugin application res assets: " + l.c(activity.getApplication().getResources().getAssets()));
            sb.append(" plugin application res == base#Res: ");
            boolean z2 = false;
            if (activity.getApplication().getResources() == activity.getApplication().getBaseContext().getResources()) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            String sb2 = sb.toString();
            String str5 = sb2 + " application         assets: " + l.c(e.a().getAssets());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str5 + " application  res      assets: " + l.c(e.a().getResources().getAssets()));
            sb3.append(" application res == application#base#res ");
            if (e.a().getResources() == ((Application) e.a()).getBaseContext().getResources()) {
                z2 = true;
            }
            sb3.append(z2);
            throw new RuntimeException(sb3.toString(), runtimeException);
        }

        @TargetApi(14)
        public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i) {
            Intent wrapIntent;
            Intent intent2 = intent;
            if (shouldInterrupt(intent2)) {
                wrapIntent = getRedirectIntent(intent2, i, null);
            } else {
                int i2 = i;
                wrapIntent = wrapIntent(intent2);
            }
            Intent intent3 = wrapIntent;
            try {
                Method a2 = com.bytedance.frameworks.plugin.e.b.a((Class) Class.forName("android.app.Instrumentation"), "execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE);
                if (a2 != null) {
                    a2.invoke(this.mBase, new Object[]{context, iBinder, iBinder2, activity, intent3, Integer.valueOf(i)});
                }
            } catch (Exception e2) {
                handleException(intent3, e2);
            }
            return null;
        }

        public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i) {
            Intent wrapIntent;
            Intent intent2 = intent;
            if (shouldInterrupt(intent2)) {
                wrapIntent = getRedirectIntent(intent2, i, null);
            } else {
                int i2 = i;
                wrapIntent = wrapIntent(intent2);
            }
            Intent intent3 = wrapIntent;
            try {
                Method a2 = com.bytedance.frameworks.plugin.e.b.a((Class) Class.forName("android.app.Instrumentation"), "execStartActivity", Context.class, IBinder.class, IBinder.class, Fragment.class, Intent.class, Integer.TYPE);
                if (a2 != null) {
                    a2.invoke(this.mBase, new Object[]{context, iBinder, iBinder2, fragment, intent3, Integer.valueOf(i)});
                }
            } catch (Exception e2) {
                handleException(intent3, e2);
            }
            return null;
        }

        @TargetApi(16)
        public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
            Intent wrapIntent;
            Intent intent2 = intent;
            if (shouldInterrupt(intent2)) {
                wrapIntent = getRedirectIntent(intent2, i, null);
            } else {
                int i2 = i;
                wrapIntent = wrapIntent(intent2);
            }
            Intent intent3 = wrapIntent;
            try {
                Method a2 = com.bytedance.frameworks.plugin.e.b.a((Class) Class.forName("android.app.Instrumentation"), "execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class);
                if (a2 != null) {
                    a2.invoke(this.mBase, new Object[]{context, iBinder, iBinder2, activity, intent3, Integer.valueOf(i), bundle});
                }
            } catch (Exception e2) {
                handleException(intent3, e2);
            }
            return null;
        }

        public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Fragment fragment, Intent intent, int i, Bundle bundle) {
            Intent wrapIntent;
            Intent intent2 = intent;
            if (shouldInterrupt(intent2)) {
                wrapIntent = getRedirectIntent(intent2, i, null);
            } else {
                int i2 = i;
                wrapIntent = wrapIntent(intent2);
            }
            Intent intent3 = wrapIntent;
            try {
                Method a2 = com.bytedance.frameworks.plugin.e.b.a((Class) Class.forName("android.app.Instrumentation"), "execStartActivity", Context.class, IBinder.class, IBinder.class, Fragment.class, Intent.class, Integer.TYPE, Bundle.class);
                if (a2 != null) {
                    a2.invoke(this.mBase, new Object[]{context, iBinder, iBinder2, fragment, intent3, Integer.valueOf(i), bundle});
                }
            } catch (Exception e2) {
                handleException(intent3, e2);
            }
            return null;
        }

        @TargetApi(23)
        public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, String str, Intent intent, int i, Bundle bundle) {
            Intent wrapIntent;
            Intent intent2 = intent;
            if (shouldInterrupt(intent2)) {
                wrapIntent = getRedirectIntent(intent2, i, null);
            } else {
                int i2 = i;
                wrapIntent = wrapIntent(intent2);
            }
            Intent intent3 = wrapIntent;
            try {
                Method a2 = com.bytedance.frameworks.plugin.e.b.a((Class) Class.forName("android.app.Instrumentation"), "execStartActivity", Context.class, IBinder.class, IBinder.class, String.class, Intent.class, Integer.TYPE, Bundle.class);
                if (a2 != null) {
                    a2.invoke(this.mBase, new Object[]{context, iBinder, iBinder2, str, intent3, Integer.valueOf(i), bundle});
                }
            } catch (Exception e2) {
                handleException(intent3, e2);
            }
            return null;
        }
    }

    public void onHook() {
        try {
            Object a2 = com.bytedance.frameworks.plugin.b.a.a();
            Instrumentation instrumentation = (Instrumentation) com.bytedance.frameworks.plugin.e.a.a(a2, "mInstrumentation");
            if (!(instrumentation instanceof PluginInstrumentation)) {
                com.bytedance.frameworks.plugin.e.a.a(a2, "mInstrumentation", (Object) new PluginInstrumentation(instrumentation));
            }
        } catch (Exception e2) {
            g.a("Hook Method Instrumentation Failed!!!", (Throwable) e2);
        }
    }
}
