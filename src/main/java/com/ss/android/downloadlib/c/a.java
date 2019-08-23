package com.ss.android.downloadlib.c;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.k;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public final class a {

    /* renamed from: com.ss.android.downloadlib.c.a$a  reason: collision with other inner class name */
    static class C0344a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private Object f28871a;

        private C0344a(Object obj) {
            this.f28871a = obj;
        }

        /* synthetic */ C0344a(Object obj, byte b2) {
            this(obj);
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                if ("startActivity".contains(method.getName())) {
                    boolean z = true;
                    if ((objArr[1] instanceof String) && (objArr[2] instanceof Intent)) {
                        Intent intent = objArr[2];
                        if ("android.intent.action.VIEW".equals(intent.getAction()) && "application/vnd.android.package-archive".equals(intent.getType())) {
                            if (i.a("VIVO")) {
                                String optString = k.g().optString("hook_vivo_arg", "com.android.settings");
                                if (!"null".equals(optString)) {
                                    objArr[1] = optString;
                                }
                            } else if (i.a("OPPO")) {
                                String optString2 = k.g().optString("hook_oppo_arg1", "com.android.settings");
                                if (!"null".equals(optString2)) {
                                    objArr[1] = optString2;
                                }
                                String optString3 = k.g().optString("hook_oppo_arg2", "com.android.browser");
                                String optString4 = k.g().optString("hook_oppo_arg3", "m.store.oppomobile.com");
                                intent.putExtra("oppo_extra_pkg_name", optString3);
                                intent.putExtra("refererHost", optString4);
                                if (k.g().optInt("hook_oppo_arg4", 0) != 1) {
                                    z = false;
                                }
                                if (z) {
                                    Intent intent2 = new Intent();
                                    intent2.putExtra("oppo_extra_pkg_name", optString3);
                                    intent2.putExtra("refererHost", optString4);
                                    intent.putExtra("android.intent.extra.INTENT", intent2);
                                }
                            } else if (i.a("EMUI")) {
                                String optString5 = k.g().optString("hook_huawei_arg1", "com.android.settings");
                                if (!"null".equals(optString5)) {
                                    objArr[1] = optString5;
                                }
                                intent.putExtra("caller_package", k.g().optString("hook_huawei_arg2", "com.huawei.appmarket"));
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return method.invoke(this.f28871a, objArr);
        }
    }

    public static void a() {
        Field field;
        try {
            if (Build.VERSION.SDK_INT < 26) {
                field = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
            } else {
                field = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
            }
            field.setAccessible(true);
            Object obj = field.get(null);
            Field declaredField = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                Class<?> cls = Class.forName("android.app.IActivityManager");
                if (cls != null) {
                    C0344a aVar = new C0344a(obj2, (byte) 0);
                    declaredField.set(obj, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, aVar));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static String b(String str) {
        return a(c(str));
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" not exists");
            return null;
        }
        new StringBuilder("file size = ").append(file.length());
        if (file.length() > 70000000) {
            return null;
        }
        return k.a(file);
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<ApplicationInfo> installedApplications = k.a().getPackageManager().getInstalledApplications(0);
        if (installedApplications == null || installedApplications.isEmpty()) {
            return null;
        }
        for (ApplicationInfo next : installedApplications) {
            if (next != null && str.equals(next.packageName)) {
                return next.sourceDir;
            }
        }
        return null;
    }
}
