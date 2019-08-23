package com.ss.android.message.log;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30043a;

    public static void a(String str, Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{str, bundle2}, null, f30043a, true, 17966, new Class[]{String.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, bundle2}, null, f30043a, true, 17966, new Class[]{String.class, Bundle.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle2.get(str2));
                }
            } catch (Throwable unused) {
            }
            a(null, "event_v3", str, null, 0, 0, jSONObject);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r23, java.lang.String r24, java.lang.String r25, org.json.JSONObject... r26) {
        /*
            r1 = r26
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r23
            r13 = 1
            r5[r13] = r24
            r14 = 2
            r5[r14] = r25
            r15 = 3
            r5[r15] = r1
            com.meituan.robust.ChangeQuickRedirect r7 = f30043a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r10[r12] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r13] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r14] = r6
            java.lang.Class<org.json.JSONObject[]> r6 = org.json.JSONObject[].class
            r10[r15] = r6
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = 0
            r8 = 1
            r9 = 17963(0x462b, float:2.5172E-41)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x005f
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r23
            r5[r13] = r24
            r5[r14] = r25
            r5[r15] = r1
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f30043a
            r19 = 1
            r20 = 17963(0x462b, float:2.5172E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r12] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r14] = r1
            java.lang.Class<org.json.JSONObject[]> r1 = org.json.JSONObject[].class
            r0[r15] = r1
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r5
            r21 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x005f:
            int r4 = r1.length
            if (r4 <= 0) goto L_0x0078
            java.lang.String r4 = "umeng"
            r5 = 0
            r7 = 0
            r9 = r1[r12]
            r0 = r23
            r1 = r4
            r2 = r24
            r3 = r25
            r4 = r5
            r6 = r7
            r8 = r9
            a(r0, r1, r2, r3, r4, r6, r8)
            return
        L_0x0078:
            java.lang.String r1 = "umeng"
            r4 = 0
            r6 = 0
            r8 = 0
            r0 = r23
            r2 = r24
            r3 = r25
            a(r0, r1, r2, r3, r4, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.log.c.a(android.content.Context, java.lang.String, java.lang.String, org.json.JSONObject[]):void");
    }

    public static void a(Context context, String str, String str2, String str3, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4)}, null, f30043a, true, 17962, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4)}, null, f30043a, true, 17962, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        a(context, str, str2, str3, j, j2, null);
    }

    public static void a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4), jSONObject}, null, f30043a, true, 17961, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, str3, new Long(j3), new Long(j4), jSONObject}, null, f30043a, true, 17961, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            final long j5 = j;
            final long j6 = j2;
            final JSONObject jSONObject2 = jSONObject;
            final Context context2 = context;
            AnonymousClass1 r0 = new ThreadPlus() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f30044a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f30044a, false, 17968, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f30044a, false, 17968, new Class[0], Void.TYPE);
                        return;
                    }
                    try {
                        b bVar = new b();
                        bVar.f30037a = str4;
                        bVar.f30038b = str5;
                        bVar.f30039c = str6;
                        bVar.f30040d = j5;
                        bVar.f30041e = j6;
                        if (jSONObject2 != null) {
                            bVar.f30042f = jSONObject2.toString();
                        }
                        Logger.debug();
                        a a2 = a.a(context2);
                        if (a2 != null) {
                            a2.a(bVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            };
            r0.start();
        }
    }
}
