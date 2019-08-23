package com.bytedance.android.live.core.c;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7835a;

    public abstract JSONObject a();

    private JSONObject a(Map<String, Object> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f7835a, false, 299, new Class[]{Map.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{map}, this, f7835a, false, 299, new Class[]{Map.class}, JSONObject.class);
        } else if (map == null) {
            return null;
        } else {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), next.getValue());
                } catch (Exception unused) {
                }
            }
            return jSONObject;
        }
    }

    public final void b(String str, Map<String, Object> map) {
        if (PatchProxy.isSupport(new Object[]{str, map}, this, f7835a, false, 287, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map}, this, f7835a, false, 287, new Class[]{String.class, Map.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && map != null) {
            a.b(str, a(str, a(map), null));
        }
    }

    public final void c(String str, Map<String, Object> map) {
        if (PatchProxy.isSupport(new Object[]{str, map}, this, f7835a, false, 291, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map}, this, f7835a, false, 291, new Class[]{String.class, Map.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && map != null) {
            a.b(str, a(str, a(map), null));
        }
    }

    public final void b(String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, this, f7835a, false, 286, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, this, f7835a, false, 286, new Class[]{String.class, JSONObject.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str) || jSONObject2 == null) {
        } else {
            a.b(str2, a(str2, jSONObject2, null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r20, java.lang.StackTraceElement[] r21) {
        /*
            r19 = this;
            r0 = r21
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r10 = 0
            r2[r10] = r3
            r11 = 1
            r2[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f7835a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class<java.lang.StackTraceElement[]> r3 = java.lang.StackTraceElement[].class
            r7[r11] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 298(0x12a, float:4.18E-43)
            r3 = r19
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004c
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r12[r10] = r2
            r12[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r14 = f7835a
            r15 = 0
            r16 = 298(0x12a, float:4.18E-43)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class<java.lang.StackTraceElement[]> r1 = java.lang.StackTraceElement[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x004c:
            java.lang.String r1 = "ttlive_exception"
            com.bytedance.android.live.core.c.a.a((int) r9, (java.lang.String) r1, (java.lang.StackTraceElement[]) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.c.b.a(int, java.lang.StackTraceElement[]):void");
    }

    public final void a(String str, Map<String, Object> map) {
        if (PatchProxy.isSupport(new Object[]{str, map}, this, f7835a, false, 282, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map}, this, f7835a, false, 282, new Class[]{String.class, Map.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && map != null) {
            a(str, a(map));
        }
    }

    public final void a(String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, this, f7835a, false, 283, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, this, f7835a, false, 283, new Class[]{String.class, JSONObject.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str) || jSONObject2 == null) {
        } else {
            a.b(str2, a(str2, jSONObject2, null));
        }
    }

    private String a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject, null}, this, f7835a, false, c.f69428f, new Class[]{String.class, JSONObject.class, JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, jSONObject, null}, this, f7835a, false, c.f69428f, new Class[]{String.class, JSONObject.class, JSONObject.class}, String.class);
        }
        JSONObject jSONObject3 = new JSONObject();
        JSONObject a2 = a();
        try {
            jSONObject3.put("tag", str2);
            if (a2 != null) {
                jSONObject3.put("params", a());
            }
            jSONObject3.put("data", jSONObject.toString());
        } catch (JSONException unused) {
        }
        return jSONObject3.toString();
    }
}
