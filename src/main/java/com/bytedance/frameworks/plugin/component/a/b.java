package com.bytedance.frameworks.plugin.component.a;

import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.plugin.c.i;
import com.bytedance.frameworks.plugin.c.j;
import com.bytedance.frameworks.plugin.c.l;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    public static class a extends i {

        /* renamed from: a  reason: collision with root package name */
        private ThreadLocal<Pair<String, String>> f20014a = new ThreadLocal<>();

        /* renamed from: b  reason: collision with root package name */
        private ThreadLocal<Boolean> f20015b = new ThreadLocal<>();

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
            /*
                r5 = this;
                java.lang.ThreadLocal<android.util.Pair<java.lang.String, java.lang.String>> r0 = r5.f20014a
                r1 = 0
                r0.set(r1)
                java.lang.ThreadLocal<java.lang.Boolean> r0 = r5.f20015b
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.set(r1)
                r0 = 0
                if (r8 == 0) goto L_0x002f
                int r1 = r8.length
                if (r1 <= 0) goto L_0x002f
                r1 = 0
            L_0x0014:
                int r2 = r8.length
                if (r1 >= r2) goto L_0x002f
                r2 = r8[r1]
                if (r2 == 0) goto L_0x002c
                r2 = r8[r1]
                boolean r2 = r2 instanceof java.lang.String
                if (r2 == 0) goto L_0x002c
                r2 = r8[r1]
                java.lang.String r2 = (java.lang.String) r2
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x002c
                goto L_0x0030
            L_0x002c:
                int r1 = r1 + 1
                goto L_0x0014
            L_0x002f:
                r1 = -1
            L_0x0030:
                if (r1 >= 0) goto L_0x0037
                java.lang.Object r6 = super.a(r6, r7, r8)
                return r6
            L_0x0037:
                r2 = r8[r1]
                java.lang.String r2 = (java.lang.String) r2
                android.content.Context r3 = com.bytedance.frameworks.plugin.e.a()
                android.content.pm.PackageManager r3 = r3.getPackageManager()
                r4 = 16777216(0x1000000, float:2.3509887E-38)
                android.content.pm.ProviderInfo r3 = r3.resolveContentProvider(r2, r4)
                if (r3 == 0) goto L_0x009c
                java.lang.String r0 = r3.packageName
                android.content.Context r4 = com.bytedance.frameworks.plugin.e.a()
                java.lang.String r4 = r4.getPackageName()
                boolean r0 = r0.equals(r4)
                if (r0 != 0) goto L_0x0060
                java.lang.Object r6 = super.a(r6, r7, r8)
                return r6
            L_0x0060:
                java.lang.String r0 = r3.name
                boolean r0 = com.bytedance.frameworks.plugin.f.a.a(r0)
                if (r0 == 0) goto L_0x006d
                java.lang.Object r6 = super.a(r6, r7, r8)
                return r6
            L_0x006d:
                android.content.Context r0 = com.bytedance.frameworks.plugin.e.a()
                java.lang.String r0 = com.bytedance.frameworks.plugin.b.f.a(r0)
                java.lang.String r4 = r3.processName
                boolean r0 = r0.equals(r4)
                if (r0 != 0) goto L_0x0094
                android.content.pm.ProviderInfo r0 = com.bytedance.frameworks.plugin.am.d.a((android.content.pm.ProviderInfo) r3)
                if (r0 == 0) goto L_0x00b8
                java.lang.String r3 = r0.authority
                r8[r1] = r3
                java.lang.ThreadLocal<android.util.Pair<java.lang.String, java.lang.String>> r1 = r5.f20014a
                android.util.Pair r3 = new android.util.Pair
                java.lang.String r0 = r0.authority
                r3.<init>(r2, r0)
                r1.set(r3)
                goto L_0x00b8
            L_0x0094:
                java.lang.ThreadLocal<java.lang.Boolean> r0 = r5.f20015b
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                r0.set(r1)
                goto L_0x00b8
            L_0x009c:
                android.content.pm.ProviderInfo r0 = com.bytedance.frameworks.plugin.pm.c.c((java.lang.String) r2, (int) r0)
                if (r0 == 0) goto L_0x00b8
                android.content.pm.ProviderInfo r0 = com.bytedance.frameworks.plugin.am.d.a((android.content.pm.ProviderInfo) r0)
                if (r0 == 0) goto L_0x00b8
                java.lang.String r3 = r0.authority
                r8[r1] = r3
                java.lang.ThreadLocal<android.util.Pair<java.lang.String, java.lang.String>> r1 = r5.f20014a
                android.util.Pair r3 = new android.util.Pair
                java.lang.String r0 = r0.authority
                r3.<init>(r2, r0)
                r1.set(r3)
            L_0x00b8:
                java.lang.Object r6 = super.a(r6, r7, r8)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.component.a.b.a.a(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (obj2 == null) {
                return super.a(obj, method, objArr, obj2);
            }
            try {
                Object a2 = com.bytedance.frameworks.plugin.e.a.a(obj2, "provider");
                Pair pair = this.f20014a.get();
                if (a2 != null) {
                    C0169b bVar = new C0169b();
                    bVar.b(a2);
                    if (pair != null) {
                        C0169b.f20016a.put(a2, pair);
                    }
                    com.bytedance.frameworks.plugin.e.a.a(obj2, "provider", l.a(a2, (InvocationHandler) bVar));
                }
                if (this.f20015b.get().booleanValue()) {
                    ((ProviderInfo) com.bytedance.frameworks.plugin.e.a.a(obj2, "info")).name = a.class.getName();
                }
            } catch (Exception unused) {
            }
            return super.a(obj, method, objArr, obj2);
        }
    }

    /* renamed from: com.bytedance.frameworks.plugin.component.a.b$b  reason: collision with other inner class name */
    static class C0169b extends j {

        /* renamed from: a  reason: collision with root package name */
        public static Map<Object, Pair<String, String>> f20016a = new ConcurrentHashMap();

        /* renamed from: com.bytedance.frameworks.plugin.component.a.b$b$a */
        static class a extends i {
            a() {
            }

            private static void a(Object[] objArr, String str) {
                if (objArr != null && objArr.length != 0 && !TextUtils.isEmpty(str)) {
                    int i = -1;
                    Uri uri = null;
                    int i2 = 0;
                    while (true) {
                        if (i2 < objArr.length) {
                            if (objArr[i2] != null && (objArr[i2] instanceof Uri)) {
                                uri = objArr[i2];
                                i = i2;
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                    if (i >= 0 && uri != null) {
                        objArr[i] = new Uri.Builder().scheme(uri.getScheme()).authority(str).path(uri.getPath()).query(uri.getQuery()).fragment(uri.getFragment()).appendQueryParameter("target_authority", uri.getAuthority()).build();
                    }
                }
            }

            public final Object a(Object obj, Method method, Object[] objArr) {
                Bundle bundle;
                if (Build.VERSION.SDK_INT > 25 && objArr != null && objArr.length > 0 && (objArr[0] instanceof String)) {
                    String obj2 = objArr[0].toString();
                    if (!obj2.equals(obj2) && k.f2265a.contains(obj2)) {
                        objArr[0] = e.a().getPackageName();
                    }
                }
                Pair pair = C0169b.f20016a.get(obj);
                if (pair != null) {
                    String str = (String) pair.first;
                    String str2 = (String) pair.second;
                    if (!"call".equals(method.getName())) {
                        a(objArr, str2);
                    } else if (objArr != null && objArr.length > 3) {
                        if (objArr[3] == null || !(objArr[3] instanceof Bundle)) {
                            bundle = new Bundle();
                            objArr[3] = bundle;
                        } else {
                            bundle = (Bundle) objArr[3];
                        }
                        bundle.putString("stub_authority", str2);
                        bundle.putString("target_authority", str);
                    }
                }
                return super.a(obj, method, objArr);
            }
        }

        public final void a() {
        }

        C0169b() {
        }

        static {
            a aVar = new a();
            f2174b.put("query", aVar);
            f2174b.put("getType", aVar);
            f2174b.put("insert", aVar);
            f2174b.put("bulkInsert", aVar);
            f2174b.put("delete", aVar);
            f2174b.put("update", aVar);
            f2174b.put("openFile", aVar);
            f2174b.put("openAssetFile", aVar);
            f2174b.put("call", aVar);
        }
    }
}
