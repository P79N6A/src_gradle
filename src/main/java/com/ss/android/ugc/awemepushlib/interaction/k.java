package com.ss.android.ugc.awemepushlib.interaction;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.awemepushlib.a.a;
import com.ss.android.ugc.awemepushlib.a.c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77027a;

    public static Map<String, String> a() {
        if (PatchProxy.isSupport(new Object[0], null, f77027a, true, 90221, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], null, f77027a, true, 90221, new Class[0], Map.class);
        }
        HashMap hashMap = new HashMap();
        AppLog.getSSIDs(hashMap);
        return hashMap;
    }

    public static void a(String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, null, f77027a, true, 90219, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, null, f77027a, true, 90219, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        j.a().monitorCommonLog(str2, jSONObject2);
    }

    public static void a(String str, int i, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), jSONObject2}, null, f77027a, true, 90220, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), jSONObject2}, null, f77027a, true, 90220, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        j.a().monitorStatusRate(str2, i, jSONObject2);
    }

    public static void a(c cVar, boolean z, int i) {
        String str;
        String str2;
        String str3;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, null, f77027a, true, 90215, new Class[]{c.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, Byte.valueOf(z), Integer.valueOf(i)}, null, f77027a, true, 90215, new Class[]{c.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Map<String, String> a2 = a.a(cVar2, i, j.a().isAppNotActive());
        if (z) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        a2.put("has_image", str);
        if (cVar2.extra.style == 5) {
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        }
        a2.put("mediastyle", str2);
        if (TextUtils.isEmpty(cVar2.extra.bg_color)) {
            str3 = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str3 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        }
        a2.put("colorized", str3);
        AppLogNewUtils.onEventV3("push_show", new JSONObject(a2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r20, java.lang.String r21, long r22, long r24, org.json.JSONObject... r26) {
        /*
            r3 = r22
            r5 = r24
            r1 = r26
            r7 = 5
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r15 = 0
            r8[r15] = r20
            r16 = 1
            r8[r16] = r21
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r3)
            r17 = 2
            r8[r17] = r9
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r5)
            r18 = 3
            r8[r18] = r9
            r19 = 4
            r8[r19] = r1
            com.meituan.robust.ChangeQuickRedirect r10 = f77027a
            java.lang.Class[] r13 = new java.lang.Class[r7]
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r13[r15] = r9
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r13[r16] = r9
            java.lang.Class r9 = java.lang.Long.TYPE
            r13[r17] = r9
            java.lang.Class r9 = java.lang.Long.TYPE
            r13[r18] = r9
            java.lang.Class<org.json.JSONObject[]> r9 = org.json.JSONObject[].class
            r13[r19] = r9
            java.lang.Class r14 = java.lang.Void.TYPE
            r9 = 0
            r11 = 1
            r12 = 90216(0x16068, float:1.2642E-40)
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13, r14)
            if (r8 == 0) goto L_0x0092
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r15] = r20
            r8[r16] = r21
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r3)
            r8[r17] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r5)
            r8[r18] = r0
            r8[r19] = r1
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r1 = f77027a
            r2 = 1
            r3 = 90216(0x16068, float:1.2642E-40)
            java.lang.Class[] r4 = new java.lang.Class[r7]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r15] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r16] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r4[r17] = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            r4[r18] = r5
            java.lang.Class<org.json.JSONObject[]> r5 = org.json.JSONObject[].class
            r4[r19] = r5
            java.lang.Class r5 = java.lang.Void.TYPE
            r20 = r8
            r21 = r0
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r4
            r26 = r5
            com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            return
        L_0x0092:
            if (r1 == 0) goto L_0x00a9
            int r7 = r1.length
            if (r7 <= 0) goto L_0x00a9
            java.lang.String r7 = "apn"
            r8 = r1[r15]
            r0 = r20
            r1 = r7
            r2 = r21
            r3 = r22
            r5 = r24
            r7 = r8
            com.ss.android.common.lib.a.a(r0, r1, r2, r3, r5, r7)
            return
        L_0x00a9:
            java.lang.String r1 = "apn"
            r0 = r20
            r2 = r21
            r3 = r22
            r5 = r24
            com.ss.android.common.lib.a.a(r0, r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.awemepushlib.interaction.k.a(android.content.Context, java.lang.String, long, long, org.json.JSONObject[]):void");
    }
}
