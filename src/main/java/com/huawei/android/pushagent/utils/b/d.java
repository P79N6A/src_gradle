package com.huawei.android.pushagent.utils.b;

import com.huawei.android.pushagent.utils.a.e;

public class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private static d f25183a;

    private d() {
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f25183a == null) {
                f25183a = new d();
            }
            dVar = f25183a;
        }
        return dVar;
    }

    private static Object b() {
        try {
            Class<?> cls = Class.forName("com.mediatek.telephony.TelephonyManagerEx");
            return cls.getDeclaredMethod("getDefault", new Class[0]).invoke(cls, new Object[0]);
        } catch (Exception e2) {
            e.e("mutiCardMTKImpl", " getDefaultTelephonyManagerEx wrong " + e2.toString());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(int r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r4 = 0
            r2[r4] = r3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r4] = r6
            java.lang.Object r6 = b()     // Catch:{ NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x0048, IllegalArgumentException -> 0x0039, InvocationTargetException -> 0x002a }
            if (r6 == 0) goto L_0x006f
            java.lang.Class r3 = r6.getClass()     // Catch:{ NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x0048, IllegalArgumentException -> 0x0039, InvocationTargetException -> 0x002a }
            java.lang.String r4 = "getDeviceId"
            java.lang.reflect.Method r2 = r3.getMethod(r4, r2)     // Catch:{ NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x0048, IllegalArgumentException -> 0x0039, InvocationTargetException -> 0x002a }
            java.lang.Object r6 = r2.invoke(r6, r1)     // Catch:{ NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x0048, IllegalArgumentException -> 0x0039, InvocationTargetException -> 0x002a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NoSuchMethodException -> 0x0057, IllegalAccessException -> 0x0048, IllegalArgumentException -> 0x0039, InvocationTargetException -> 0x002a }
            r0 = r6
            goto L_0x006f
        L_0x002a:
            r6 = move-exception
            java.lang.String r1 = "mutiCardMTKImpl"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getDeviceId exception:"
            r2.<init>(r3)
            java.lang.String r6 = r6.toString()
            goto L_0x0065
        L_0x0039:
            r6 = move-exception
            java.lang.String r1 = "mutiCardMTKImpl"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getDeviceId exception:"
            r2.<init>(r3)
            java.lang.String r6 = r6.toString()
            goto L_0x0065
        L_0x0048:
            r6 = move-exception
            java.lang.String r1 = "mutiCardMTKImpl"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getDeviceId exception:"
            r2.<init>(r3)
            java.lang.String r6 = r6.toString()
            goto L_0x0065
        L_0x0057:
            r6 = move-exception
            java.lang.String r1 = "mutiCardMTKImpl"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getDeviceId exception:"
            r2.<init>(r3)
            java.lang.String r6 = r6.toString()
        L_0x0065:
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.e(r1, r6)
        L_0x006f:
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = ""
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.b.d.a(int):java.lang.String");
    }
}
