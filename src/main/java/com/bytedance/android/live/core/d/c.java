package com.bytedance.android.live.core.d;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.linkselector.c.a;
import com.ss.android.linkselector.c.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7838a;

    /* renamed from: b  reason: collision with root package name */
    private static final a f7839b = new a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f7840a;

        public final void a(b bVar) {
            b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{bVar2}, this, f7840a, false, 365, new Class[]{b.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bVar2}, this, f7840a, false, 365, new Class[]{b.class}, Void.TYPE);
                return;
            }
            if (bVar2.f29295a == 0) {
                com.ss.android.linkselector.c.c cVar = (com.ss.android.linkselector.c.c) bVar2.f29296b;
                if (!cVar.h) {
                    long j = cVar.f29300d;
                    long j2 = cVar.f29301e;
                    String str = cVar.f29297a;
                    String str2 = cVar.f29302f;
                    int i = cVar.f29299c;
                    Object[] objArr = {new Long(j), new Long(j2), str, null, str2, Integer.valueOf(i), null};
                    if (PatchProxy.isSupport(objArr, null, c.f7838a, true, 349, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
                        Object[] objArr2 = {new Long(j), new Long(j2), str, null, str2, Integer.valueOf(i), null};
                        Object[] objArr3 = objArr2;
                        PatchProxy.accessDispatch(objArr3, null, c.f7838a, true, 349, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
                    } else {
                        c.a().b(j, j2, str, null, str2, i, null);
                    }
                }
                long j3 = cVar.f29300d;
                long j4 = cVar.f29301e;
                String str3 = cVar.f29297a;
                String str4 = cVar.f29302f;
                int i2 = cVar.f29299c;
                if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str3, null, str4, Integer.valueOf(i2), null}, null, c.f7838a, true, 348, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str3, null, str4, Integer.valueOf(i2), null}, null, c.f7838a, true, 348, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
                    return;
                }
                c.a().a(j3, j4, str3, null, str4, i2, null);
            }
        }
    };

    public static com.bytedance.android.live.base.b.a a() {
        if (PatchProxy.isSupport(new Object[0], null, f7838a, true, 363, new Class[0], com.bytedance.android.live.base.b.a.class)) {
            return (com.bytedance.android.live.base.b.a) PatchProxy.accessDispatch(new Object[0], null, f7838a, true, 363, new Class[0], com.bytedance.android.live.base.b.a.class);
        }
        return (com.bytedance.android.live.base.b.a) com.bytedance.android.live.base.a.a(com.bytedance.android.live.base.b.a.class);
    }

    public static void a(String str, int i, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), jSONObject2}, null, f7838a, true, 359, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), jSONObject2}, null, f7838a, true, 359, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        a().a(str2, i, jSONObject2);
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, jSONObject}, null, f7838a, true, 358, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, jSONObject}, null, f7838a, true, 358, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = jSONObject;
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("service", str4);
            }
        } catch (JSONException unused) {
        }
        a().a(str3, jSONObject2);
    }
}
