package com.bytedance.frameworks.plugin.c;

import android.app.Instrumentation;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.bytedance.frameworks.plugin.component.a.b;
import com.bytedance.frameworks.plugin.component.broadcast.a;
import com.bytedance.frameworks.plugin.hook.InstrumentationHook;
import com.bytedance.frameworks.plugin.stub.RedirectService;
import java.lang.reflect.Method;
import java.util.List;

public class a extends j {

    /* renamed from: com.bytedance.frameworks.plugin.c.a$a  reason: collision with other inner class name */
    static final class C0166a extends i {
        C0166a() {
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            int i;
            Intent intent;
            Intent[] intentArr;
            if (objArr == 0 || objArr.length <= 0 || !(objArr[0] instanceof Integer)) {
                i = 0;
            } else {
                i = objArr[0].intValue();
            }
            if (objArr != 0 && objArr.length > 1 && (objArr[1] instanceof String) && com.bytedance.frameworks.plugin.pm.c.a(objArr[1])) {
                objArr[1] = com.bytedance.frameworks.plugin.e.a().getPackageName();
            }
            int i2 = 2;
            while (true) {
                intent = null;
                if (objArr != 0 && i2 < objArr.length) {
                    if (objArr[i2] != null && (objArr[i2] instanceof Intent[])) {
                        intentArr = objArr[i2];
                        break;
                    }
                    i2++;
                } else {
                    intentArr = null;
                    i2 = -1;
                }
            }
            intentArr = null;
            i2 = -1;
            if (intentArr != null && intentArr.length > 0) {
                intent = intentArr[0];
            }
            if (intent != null && i2 >= 0) {
                if (i == 2) {
                    List b2 = com.bytedance.frameworks.plugin.pm.c.b(intent, 0);
                    if (b2 != null && b2.size() > 0) {
                        Intent intent2 = new Intent(intent);
                        intent2.setClassName(com.bytedance.frameworks.plugin.e.a().getPackageName(), com.bytedance.frameworks.plugin.stub.c.class.getName());
                        intent2.putExtra("target_intent", intent);
                        objArr[i2] = new Intent[]{intent2};
                    }
                } else if (i == 4) {
                    List d2 = com.bytedance.frameworks.plugin.pm.c.d(intent, 0);
                    if (d2 != null && d2.size() > 0) {
                        Intent intent3 = new Intent(intent);
                        intent3.setClassName(com.bytedance.frameworks.plugin.e.a().getPackageName(), RedirectService.class.getName());
                        intent3.putExtra("target_intent", intent);
                        objArr[i2] = new Intent[]{intent3};
                    }
                }
            }
            return super.a(obj, method, objArr);
        }
    }

    static class b extends i {
        b() {
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            int i = 0;
            while (true) {
                if (objArr != null && i < objArr.length) {
                    if (objArr[i] != null && (objArr[i] instanceof String)) {
                        objArr[i] = com.bytedance.frameworks.plugin.e.a().getPackageName();
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            return super.a(obj, method, objArr);
        }
    }

    static class c extends i {
        c() {
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            Intent intent;
            int i = 0;
            while (true) {
                if (objArr != null && i < objArr.length) {
                    if (objArr[i] != null && (objArr[i] instanceof Intent)) {
                        intent = (Intent) objArr[i];
                        break;
                    }
                    i++;
                } else {
                    intent = null;
                    i = 0;
                }
            }
            if (intent != null) {
                com.bytedance.frameworks.plugin.f.g.c("beforeInvoke intent=" + intent.getComponent());
            }
            try {
                Object a2 = com.bytedance.frameworks.plugin.b.a.a();
                Instrumentation instrumentation = (Instrumentation) com.bytedance.frameworks.plugin.e.a.a(a2, "mInstrumentation");
                if (!(instrumentation instanceof InstrumentationHook.PluginInstrumentation)) {
                    com.bytedance.frameworks.plugin.e.a.a(a2, "mInstrumentation", (Object) new InstrumentationHook.PluginInstrumentation(instrumentation));
                    com.bytedance.frameworks.plugin.f.g.c("ReHook Instrumentation");
                }
            } catch (Exception e2) {
                com.bytedance.frameworks.plugin.f.g.a("Hook Method Instrumentation Failed!!!", (Throwable) e2);
            }
            if (intent == null || intent.getBooleanExtra("miraInstrumentationHasWrapIntent", false)) {
                return super.a(obj, method, objArr);
            }
            List<ResolveInfo> queryIntentActivities = com.bytedance.frameworks.plugin.e.a().getPackageManager().queryIntentActivities(intent, 16842752);
            if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
                return super.a(obj, method, objArr);
            }
            if (intent != null && !intent.getBooleanExtra("start_only_for_android", false)) {
                List b2 = com.bytedance.frameworks.plugin.pm.c.b(intent, 0);
                if (b2 != null && b2.size() > 0) {
                    ActivityInfo activityInfo = ((ResolveInfo) b2.get(0)).activityInfo;
                    if (activityInfo != null) {
                        ActivityInfo a3 = com.bytedance.frameworks.plugin.am.d.a(activityInfo);
                        if (a3 != null) {
                            com.bytedance.frameworks.plugin.pm.c.g(activityInfo.packageName);
                            intent.putExtra("target_activityinfo", activityInfo);
                            intent.putExtra("stub_activityinfo", a3);
                            Intent intent2 = new Intent();
                            com.bytedance.frameworks.plugin.f.g.c("beforeInvoke stubActivityInfo.name=" + a3.name);
                            intent2.setClassName(a3.packageName, a3.name);
                            intent2.setFlags(intent.getFlags());
                            intent2.putExtra("target_intent", intent);
                            intent2.putExtra("target_activityinfo", activityInfo);
                            intent2.putExtra("stub_activityinfo", a3);
                            objArr[i] = intent2;
                            if (Build.VERSION.SDK_INT >= 18) {
                                objArr[1] = a3.packageName;
                            }
                        }
                    }
                }
            }
            return super.a(obj, method, objArr);
        }
    }

    static class d extends c {
        d() {
        }
    }

    static class e extends c {
        e() {
        }
    }

    static class f extends c {
        f() {
        }
    }

    static class g extends c {
        g() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ Exception -> 0x0062 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0062 }
            r1 = 25
            if (r0 > r1) goto L_0x001c
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0062 }
            if (r0 != r1) goto L_0x000f
            int r0 = android.os.Build.VERSION.PREVIEW_SDK_INT     // Catch:{ Exception -> 0x0062 }
            if (r0 <= 0) goto L_0x000f
            goto L_0x001c
        L_0x000f:
            java.lang.String r0 = "android.app.ActivityManagerNative"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r1 = "gDefault"
            java.lang.Object r0 = com.bytedance.frameworks.plugin.e.a.b((java.lang.Class<?>) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0028
        L_0x001c:
            java.lang.String r0 = "android.app.ActivityManager"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r1 = "IActivityManagerSingleton"
            java.lang.Object r0 = com.bytedance.frameworks.plugin.e.a.b((java.lang.Class<?>) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x0062 }
        L_0x0028:
            java.lang.String r1 = "android.util.Singleton"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0062 }
            boolean r1 = r1.isInstance(r0)     // Catch:{ Exception -> 0x0062 }
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = "mInstance"
            java.lang.Object r1 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x0062 }
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = "get"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0062 }
            com.bytedance.frameworks.plugin.e.b.a((java.lang.Object) r0, (java.lang.String) r1, (java.lang.Object[]) r2)     // Catch:{ Exception -> 0x0062 }
            java.lang.String r1 = "mInstance"
            java.lang.Object r1 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r0, (java.lang.String) r1)     // Catch:{ Exception -> 0x0062 }
        L_0x004a:
            java.lang.Object r2 = r3.f2179f     // Catch:{ Exception -> 0x0062 }
            if (r2 == 0) goto L_0x0053
            java.lang.Object r2 = r3.f2179f     // Catch:{ Exception -> 0x0062 }
            if (r1 != r2) goto L_0x0053
            return
        L_0x0053:
            r3.b(r1)     // Catch:{ Exception -> 0x0062 }
            java.lang.Object r1 = com.bytedance.frameworks.plugin.c.l.a((java.lang.Object) r1, (java.lang.reflect.InvocationHandler) r3)     // Catch:{ Exception -> 0x0062 }
            r3.f2179f = r1     // Catch:{ Exception -> 0x0062 }
            java.lang.String r2 = "mInstance"
            com.bytedance.frameworks.plugin.e.a.a((java.lang.Object) r0, (java.lang.String) r2, (java.lang.Object) r1)     // Catch:{ Exception -> 0x0062 }
        L_0x0061:
            return
        L_0x0062:
            r0 = move-exception
            java.lang.String r1 = "Hook proxy InputMethodManager Failed!!!"
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r1, (java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.c.a.a():void");
    }

    static {
        f2174b.put("startActivity", new c());
        f2174b.put("startActivityAsUser", new f());
        f2174b.put("startActivityAsCaller", new e());
        f2174b.put("startActivityAndWait", new d());
        f2174b.put("startActivityWithConfig", new g());
        f2174b.put("startService", com.bytedance.frameworks.plugin.component.service.a.a());
        f2174b.put("stopService", com.bytedance.frameworks.plugin.component.service.a.b());
        f2174b.put("bindService", com.bytedance.frameworks.plugin.component.service.a.a());
        f2174b.put("unbindService", com.bytedance.frameworks.plugin.component.service.a.b());
        f2174b.put("broadcastIntent", new a.C0170a());
        f2174b.put("registerReceiver", new a.b());
        f2174b.put("getContentProvider", new b.a());
        f2174b.put("overridePendingTransition", new b());
        f2174b.put("getIntentSender", new C0166a());
    }

    /* access modifiers changed from: protected */
    public final boolean a(Method method) {
        if (method == null || !"startActivity".equals(method.getName())) {
            return super.a(method);
        }
        return false;
    }
}
