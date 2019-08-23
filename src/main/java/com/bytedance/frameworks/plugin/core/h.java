package com.bytedance.frameworks.plugin.core;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.DisplayMetrics;
import com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.e.b;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.f.l;
import com.bytedance.frameworks.plugin.pm.c;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class h {

    /* renamed from: b  reason: collision with root package name */
    private static volatile h f2198b;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f2199a;

    /* renamed from: c  reason: collision with root package name */
    private volatile AssetManager f2200c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.frameworks.plugin.core.res.a f2201d = new com.bytedance.frameworks.plugin.core.res.a();

    /* renamed from: e  reason: collision with root package name */
    private Map<Resources, String> f2202e = new WeakHashMap();

    /* renamed from: f  reason: collision with root package name */
    private Handler f2203f = new Handler(Looper.getMainLooper());

    static abstract class a<T> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private T f2207a;

        public abstract void a(T t);

        public void run() {
            a(this.f2207a);
        }

        public a(T t) {
            this.f2207a = t;
        }
    }

    public final synchronized void a(Configuration configuration, DisplayMetrics displayMetrics) {
        Configuration configuration2 = b().getConfiguration();
        if (configuration2.uiMode != configuration.uiMode) {
            Configuration configuration3 = new Configuration(configuration);
            configuration3.uiMode = configuration2.uiMode;
            configuration = configuration3;
        }
        b().updateConfiguration(configuration, displayMetrics);
        if (this.f2202e.size() > 0) {
            for (Map.Entry next : this.f2202e.entrySet()) {
                if (next.getKey() != null) {
                    ((Resources) next.getKey()).updateConfiguration(configuration, displayMetrics);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|(2:8|(2:10|(1:12)(8:13|14|15|(1:17)(1:18)|23|(1:25)|26|(2:32|33))))|34|35|(3:37|38|39)) */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0112, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x009e */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a8 A[Catch:{ IllegalAccessException -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.app.Activity r5, boolean r6, android.content.res.AssetManager r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r7 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            if (r6 != 0) goto L_0x00b7
            android.content.res.Resources r6 = r5.getResources()     // Catch:{ all -> 0x00b5 }
            android.content.res.Resources r7 = b()     // Catch:{ all -> 0x00b5 }
            if (r6 == r7) goto L_0x009e
            android.content.res.Resources r6 = b()     // Catch:{ all -> 0x00b5 }
            if (r6 == 0) goto L_0x009e
            android.content.res.Resources r7 = r5.getResources()     // Catch:{ all -> 0x00b5 }
            if (r7 != r6) goto L_0x001f
            goto L_0x009e
        L_0x001f:
            android.content.res.Resources r7 = r5.getResources()     // Catch:{ all -> 0x00b5 }
            a((android.content.res.Resources) r6, (android.content.res.Resources) r7)     // Catch:{ all -> 0x00b5 }
            android.content.Context r0 = r5.getBaseContext()     // Catch:{ IllegalAccessException -> 0x0046 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ IllegalAccessException -> 0x0046 }
            java.lang.String r1 = "mResources"
            java.lang.reflect.Field r0 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Class<?>) r0, (java.lang.String) r1)     // Catch:{ IllegalAccessException -> 0x0046 }
            if (r0 == 0) goto L_0x003e
            android.content.Context r1 = r5.getBaseContext()     // Catch:{ IllegalAccessException -> 0x0046 }
            r0.set(r1, r6)     // Catch:{ IllegalAccessException -> 0x0046 }
            goto L_0x004e
        L_0x003e:
            java.lang.String r0 = "ResourcesManager"
            java.lang.String r1 = "ReplaceActivityResources activity#baseContext has no mResources field!!!"
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ IllegalAccessException -> 0x0046 }
            goto L_0x004e
        L_0x0046:
            r0 = move-exception
            java.lang.String r1 = "ResourcesManager"
            java.lang.String r2 = "ReplaceActivityResources activity.getBaseContext() failed."
            com.bytedance.frameworks.plugin.f.g.a(r1, r2, r0)     // Catch:{ all -> 0x00b5 }
        L_0x004e:
            r0 = 0
            a((android.app.Activity) r5, (android.content.res.Resources) r0)     // Catch:{ all -> 0x00b5 }
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ all -> 0x00b5 }
            java.lang.Class r2 = r1.getClass()     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = "android.support.v7.widget.VectorEnabledTintResources"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x006e
            com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper r2 = new com.bytedance.frameworks.plugin.core.res.MiraResourcesWrapper     // Catch:{ all -> 0x00b5 }
            r2.<init>(r1)     // Catch:{ all -> 0x00b5 }
            a((android.app.Activity) r5, (android.content.res.Resources) r2)     // Catch:{ all -> 0x00b5 }
        L_0x006e:
            r4.a((android.app.Activity) r5)     // Catch:{ all -> 0x00b5 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b5 }
            r2 = 26
            if (r1 < r2) goto L_0x009e
            java.lang.Class r1 = r6.getClass()     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "android.content.res.HwResources"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x009e
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()     // Catch:{ all -> 0x00b5 }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ all -> 0x00b5 }
            boolean r6 = r7.equals(r6)     // Catch:{ all -> 0x00b5 }
            if (r6 != 0) goto L_0x009e
            android.content.Context r6 = r5.getBaseContext()     // Catch:{ Exception -> 0x009e }
            java.lang.String r7 = "mDisplay"
            com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r6, (java.lang.String) r7, (java.lang.Object) r0)     // Catch:{ Exception -> 0x009e }
        L_0x009e:
            android.content.res.Resources r6 = r5.getResources()     // Catch:{ all -> 0x00b5 }
            android.content.res.Resources r7 = b()     // Catch:{ all -> 0x00b5 }
            if (r6 == r7) goto L_0x0111
            java.util.Map<android.content.res.Resources, java.lang.String> r6 = r4.f2202e     // Catch:{ all -> 0x00b5 }
            android.content.res.Resources r5 = r5.getResources()     // Catch:{ all -> 0x00b5 }
            java.lang.String r7 = "ResourcesManager"
            r6.put(r5, r7)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r4)
            return
        L_0x00b5:
            r5 = move-exception
            goto L_0x0113
        L_0x00b7:
            android.content.res.Resources r6 = r5.getResources()     // Catch:{ all -> 0x00b5 }
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ all -> 0x00b5 }
            if (r6 == r7) goto L_0x010e
            android.content.res.Resources r6 = r5.getResources()     // Catch:{ all -> 0x00b5 }
            java.lang.Class r0 = r6.getClass()     // Catch:{ all -> 0x00b5 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = "android.support.v7.widget.TintResources"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = "mResources"
            java.lang.Object r6 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r6, (java.lang.String) r0)     // Catch:{ Exception -> 0x00de }
            android.content.res.Resources r6 = (android.content.res.Resources) r6     // Catch:{ Exception -> 0x00de }
            goto L_0x00e9
        L_0x00de:
            r6 = move-exception
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = "Get android.support.v7.widget.TintResources mResources failed."
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r1, (java.lang.Throwable) r6)     // Catch:{ all -> 0x00b5 }
            r6 = r0
        L_0x00e9:
            android.content.Context r0 = r5.getBaseContext()     // Catch:{ all -> 0x00b5 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x00b5 }
            if (r6 == r0) goto L_0x00fe
            android.content.Context r0 = r5.getBaseContext()     // Catch:{ all -> 0x00b5 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ all -> 0x00b5 }
            r4.b(r0, r7)     // Catch:{ all -> 0x00b5 }
        L_0x00fe:
            r4.b(r6, r7)     // Catch:{ all -> 0x00b5 }
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x00b5 }
            if (r0 == r6) goto L_0x010e
            android.content.res.Resources r6 = r5.getResources()     // Catch:{ all -> 0x00b5 }
            r4.b(r6, r7)     // Catch:{ all -> 0x00b5 }
        L_0x010e:
            r4.a((android.app.Activity) r5)     // Catch:{ all -> 0x00b5 }
        L_0x0111:
            monitor-exit(r4)
            return
        L_0x0113:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.h.a(android.app.Activity, boolean, android.content.res.AssetManager):void");
    }

    public final void a(Activity activity) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            b(activity);
        } else {
            this.f2203f.post(new a<Activity>(activity) {
                public final /* synthetic */ void a(Object obj) {
                    h.this.b((Activity) obj);
                }
            });
        }
    }

    public static Resources b() {
        return e.a().getResources();
    }

    private h() {
    }

    public final synchronized AssetManager d() {
        if (this.f2200c == null) {
            this.f2200c = e.a().getAssets();
        }
        return this.f2200c;
    }

    public static final h a() {
        if (f2198b == null) {
            synchronized (h.class) {
                if (f2198b == null) {
                    f2198b = new h();
                }
            }
        }
        return f2198b;
    }

    private static List<Application> e() {
        ArrayList arrayList = new ArrayList();
        try {
            Object a2 = com.bytedance.frameworks.plugin.b.a.a();
            List<Application> list = (List) com.bytedance.frameworks.plugin.e.a.a(a2.getClass(), "mAllApplications").get(a2);
            if (list != null && list.size() > 0) {
                for (Application application : list) {
                    if (application != null) {
                        ApplicationInfo applicationInfo = application.getApplicationInfo();
                        if (applicationInfo != null) {
                            if (TextUtils.equals(applicationInfo.packageName, e.a().getPackageName())) {
                                arrayList.add(application);
                            } else if (!c.i(applicationInfo.packageName) && c.d(applicationInfo.packageName)) {
                                arrayList.add(application);
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return arrayList;
    }

    @TargetApi(19)
    private Set<Activity> f() {
        HashSet hashSet = new HashSet();
        try {
            Object a2 = com.bytedance.frameworks.plugin.b.a.a();
            Object obj = com.bytedance.frameworks.plugin.e.a.a(a2.getClass(), "mActivities").get(a2);
            ArrayList arrayList = new ArrayList();
            if (obj instanceof HashMap) {
                arrayList.addAll(((HashMap) obj).values());
            } else if (Build.VERSION.SDK_INT >= 19 && (obj instanceof ArrayMap)) {
                arrayList.addAll(((ArrayMap) obj).values());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Activity activity = (Activity) com.bytedance.frameworks.plugin.e.a.a(next.getClass(), PushConstants.INTENT_ACTIVITY_NAME).get(next);
                if (activity != null && c(activity)) {
                    hashSet.add(activity);
                }
            }
        } catch (Throwable unused) {
        }
        return hashSet;
    }

    public final String c() {
        com.bytedance.frameworks.plugin.core.res.a aVar = this.f2201d;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> append : aVar.f2213a.entrySet()) {
            sb.append(append);
            sb.append(",");
        }
        if (sb.length() > 0) {
            return sb.substring(0, sb.length() - 1);
        }
        return sb.toString();
    }

    private void b(Context context) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            a(context);
        } else {
            this.f2203f.post(new a<Context>(context) {
                public final /* bridge */ /* synthetic */ void a(Object obj) {
                    h.a((Context) obj);
                }
            });
        }
    }

    private static boolean c(Activity activity) {
        ApplicationInfo applicationInfo = activity.getApplicationInfo();
        if (applicationInfo != null) {
            if (TextUtils.equals(applicationInfo.packageName, e.a().getPackageName())) {
                return true;
            }
            if (!c.i(applicationInfo.packageName) && c.d(applicationInfo.packageName)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void b(Activity activity) {
        int i;
        if (activity != null) {
            try {
                int intValue = ((Integer) com.bytedance.frameworks.plugin.e.a.a((Object) activity.getBaseContext(), "mThemeResource")).intValue();
                com.bytedance.frameworks.plugin.e.a.a((Object) activity.getBaseContext(), "mTheme", (Object) null);
                com.bytedance.frameworks.plugin.e.a.a((Object) activity.getBaseContext(), "mThemeResource", (Object) 0);
                activity.getBaseContext().setTheme(intValue);
                Object a2 = com.bytedance.frameworks.plugin.e.a.a((Object) activity, "mThemeId");
                if (a2 != null) {
                    i = ((Integer) a2).intValue();
                } else {
                    i = ((Integer) com.bytedance.frameworks.plugin.e.a.a((Object) activity, "mThemeResource")).intValue();
                }
                com.bytedance.frameworks.plugin.e.a.a((Object) activity, "mTheme", (Object) null);
                com.bytedance.frameworks.plugin.e.a.a((Object) activity, "mThemeResource", (Object) 0);
                activity.setTheme(i);
            } catch (Exception e2) {
                g.a("ResourcesManager", "UpdateActivityTheme failed.", e2);
            }
        }
    }

    public static void a(Application application) {
        final Resources resources = application.getResources();
        if (!(resources instanceof MiraResourcesWrapper)) {
            MiraResourcesWrapper miraResourcesWrapper = new MiraResourcesWrapper(a().a(resources, resources.getAssets()));
            try {
                com.bytedance.frameworks.plugin.e.a.a(com.bytedance.frameworks.plugin.e.a.a(b.a((Class) Class.forName("android.app.ContextImpl"), "getImpl", application), "mPackageInfo"), "mResources", (Object) miraResourcesWrapper);
                com.bytedance.frameworks.plugin.e.a.a((Object) application.getBaseContext(), "mResources", (Object) miraResourcesWrapper);
            } catch (Exception unused) {
            }
        }
        application.registerComponentCallbacks(new ComponentCallbacks() {
            public final void onLowMemory() {
            }

            public final void onConfigurationChanged(Configuration configuration) {
                h.a().a(configuration, resources.getDisplayMetrics());
            }
        });
    }

    public static void a(Context context) {
        if (context != null) {
            try {
                int intValue = ((Integer) com.bytedance.frameworks.plugin.e.a.a((Object) context, "mThemeResource")).intValue();
                com.bytedance.frameworks.plugin.e.a.a((Object) context, "mTheme", (Object) null);
                com.bytedance.frameworks.plugin.e.a.a((Object) context, "mThemeResource", (Object) 0);
                context.setTheme(intValue);
            } catch (Exception unused) {
            }
        }
    }

    private void a(AssetManager assetManager) {
        for (Application next : e()) {
            if (next.getResources().getAssets() != assetManager) {
                b(next.getResources(), assetManager);
            }
            b(next.getBaseContext());
        }
        Set<Activity> f2 = f();
        if (!(this.f2199a == null || this.f2199a.get() == null || !c((Activity) this.f2199a.get()))) {
            f2.add(this.f2199a.get());
        }
        for (Activity a2 : f2) {
            a(a2, true, assetManager);
        }
        try {
            Object b2 = com.bytedance.frameworks.plugin.e.a.b(Class.forName("android.support.v7.widget.TintContextWrapper"), "sCache");
            if (b2 != null) {
                for (WeakReference weakReference : (List) b2) {
                    if (!(weakReference == null || weakReference.get() == null)) {
                        ContextWrapper contextWrapper = (ContextWrapper) weakReference.get();
                        if (contextWrapper.getResources() instanceof MiraResourcesWrapper) {
                            Resources resources = ((MiraResourcesWrapper) contextWrapper.getResources()).getResources();
                            if ("android.support.v7.widget.VectorEnabledTintResources".equals(resources.getClass().getName())) {
                                b(resources, assetManager);
                                b((Context) contextWrapper);
                            }
                        }
                        if ("android.support.v7.widget.VectorEnabledTintResources".equals(contextWrapper.getResources().getClass().getName())) {
                            b(contextWrapper.getResources(), assetManager);
                            b((Context) contextWrapper);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized Resources a(String str) {
        AssetManager assetManager;
        if (!TextUtils.isEmpty(str)) {
            Resources resources = e.a().getResources();
            if (this.f2201d == null) {
                this.f2201d = new com.bytedance.frameworks.plugin.core.res.a();
            }
            com.bytedance.frameworks.plugin.core.res.a aVar = this.f2201d;
            AssetManager assets = resources.getAssets();
            if (com.bytedance.frameworks.plugin.core.res.a.a()) {
                g.a("Support expand AssetManager.");
                assetManager = com.bytedance.frameworks.plugin.core.res.a.b(assets, str);
            } else {
                g.a("Not support expand AssetManager.");
                assetManager = aVar.a(assets, str);
            }
            aVar.f2213a.put(str, 0);
            g.a("Updated AssetsManager: " + l.c(assetManager));
            if (assetManager == null) {
                return resources;
            }
            this.f2200c = assetManager;
            if (resources.getAssets() != this.f2200c) {
                b(resources, assetManager);
            }
            a(assetManager);
            return resources;
        }
        throw new IllegalArgumentException();
    }

    private synchronized Resources a(Resources resources, AssetManager assetManager) {
        if (resources instanceof MiraResourcesWrapper) {
            resources = ((MiraResourcesWrapper) resources).getResources();
        }
        return com.bytedance.frameworks.plugin.core.res.c.a(resources, assetManager);
    }

    private void b(Resources resources, AssetManager assetManager) {
        if (resources.getAssets() != assetManager) {
            c(resources, assetManager);
            if (resources instanceof MiraResourcesWrapper) {
                Resources resources2 = ((MiraResourcesWrapper) resources).getResources();
                c(resources2, assetManager);
                com.bytedance.frameworks.plugin.core.res.b.a(resources2);
            }
            com.bytedance.frameworks.plugin.core.res.b.a(resources);
            resources.updateConfiguration(resources.getConfiguration(), resources.getDisplayMetrics());
        }
    }

    private static void c(Resources resources, AssetManager assetManager) {
        try {
            com.bytedance.frameworks.plugin.e.a.a(Resources.class, "mAssets").set(resources, assetManager);
        } catch (Exception unused) {
            try {
                Object obj = com.bytedance.frameworks.plugin.e.a.a(Resources.class, "mResourcesImpl").get(resources);
                com.bytedance.frameworks.plugin.e.a.a(obj.getClass(), "mAssets").set(obj, assetManager);
            } catch (Exception unused2) {
            }
        }
    }

    private static void a(Activity activity, Resources resources) {
        Class cls = activity.getClass();
        do {
            try {
                Field declaredField = cls.getDeclaredField("mResources");
                if (declaredField != null) {
                    com.bytedance.frameworks.plugin.e.a.a(declaredField, (Object) activity, (Object) resources);
                }
            } catch (NoSuchFieldException unused) {
            } catch (IllegalAccessException e2) {
                g.a("ResourcesManager", "ReplaceActivityResources activity) failed.", e2);
            }
            cls = cls.getSuperclass();
        } while (cls != Object.class);
    }

    private static void a(Resources resources, Resources resources2) {
        try {
            Object a2 = b.a((Object) resources2, "getCompatibilityInfo", new Object[0]);
            Object a3 = b.a((Object) resources, "getCompatibilityInfo", new Object[0]);
            if (!(a2 == null || a2 == a3)) {
                b.a((Object) resources, "updateConfiguration", resources2.getConfiguration(), resources2.getDisplayMetrics(), a2);
            }
        } catch (Exception unused) {
        }
    }
}
