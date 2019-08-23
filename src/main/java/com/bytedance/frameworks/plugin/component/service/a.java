package com.bytedance.frameworks.plugin.component.service;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.am.d;
import com.bytedance.frameworks.plugin.c.i;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.pm.c;
import java.lang.reflect.Method;
import java.util.List;

public final class a {

    /* renamed from: com.bytedance.frameworks.plugin.component.service.a$a  reason: collision with other inner class name */
    static abstract class C0171a extends i {
        C0171a() {
        }

        /* access modifiers changed from: protected */
        public final void a(Object[] objArr, boolean z) {
            Intent intent;
            String str = null;
            if (objArr != null && objArr.length != 0) {
                int length = objArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Intent intent2 = objArr[i];
                    if (intent2 instanceof Intent) {
                        intent = intent2;
                        break;
                    }
                    i++;
                }
            }
            intent = null;
            if (z) {
                List<ResolveInfo> queryIntentServices = e.a().getPackageManager().queryIntentServices(intent, 16842752);
                if (queryIntentServices != null && queryIntentServices.size() > 0) {
                    boolean z2 = true;
                    for (ResolveInfo next : queryIntentServices) {
                        if (next.serviceInfo != null && !com.bytedance.frameworks.plugin.f.a.a(next.serviceInfo.name)) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        return;
                    }
                }
            }
            if (intent != null && !intent.getBooleanExtra("start_only_for_android", false)) {
                if (intent.getComponent() != null) {
                    str = intent.getComponent().getPackageName();
                }
                if (TextUtils.isEmpty(str)) {
                    str = intent.getPackage();
                }
                if (!TextUtils.isEmpty(str)) {
                    if (c.a(str)) {
                        c.j(str);
                        if (!c.i(str) && intent.getComponent() != null) {
                            intent.setPackage(e.a().getPackageName());
                            intent.setClassName(e.a().getPackageName(), intent.getComponent().getClassName());
                        }
                    }
                    List<ResolveInfo> d2 = c.d(intent, 0);
                    if (d2 != null && d2.size() > 0) {
                        if (d2.size() == 1 && d2.get(0).serviceInfo != null) {
                            ServiceInfo serviceInfo = d2.get(0).serviceInfo;
                            ServiceInfo a2 = d.a(serviceInfo);
                            if (a2 != null) {
                                if (z) {
                                    try {
                                        d.a().a(a2, serviceInfo);
                                    } catch (Exception e2) {
                                        g.a("PluginActivityManager serviceCreated fail.", (Throwable) e2);
                                    }
                                }
                                intent.setClassName(a2.packageName, a2.name);
                            } else {
                                g.c("There is no other stub services to use !!!");
                            }
                        } else if (d2.size() > 1) {
                            g.c("There are more than one Services registered in AndroidManifest.xml: " + intent.getComponent());
                        }
                    }
                }
            }
        }
    }

    public static i a() {
        return new C0171a() {
            public final Object a(Object obj, Method method, Object[] objArr) {
                a(objArr, true);
                return super.a(obj, method, objArr);
            }
        };
    }

    public static i b() {
        return new C0171a() {
            public final Object a(Object obj, Method method, Object[] objArr) {
                a(objArr, false);
                return super.a(obj, method, objArr);
            }
        };
    }
}
