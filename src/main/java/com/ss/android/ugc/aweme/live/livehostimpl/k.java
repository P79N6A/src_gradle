package com.ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.live.base.b.a;
import com.bytedance.android.live.utility.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import org.json.JSONObject;

public final class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53445a;

    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject, jSONObject2}, this, f53445a, false, 55786, new Class[]{String.class, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject, jSONObject2}, this, f53445a, false, 55786, new Class[]{String.class, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        n.a(str, jSONObject, jSONObject2);
    }

    public k() {
        b.a(a.class, this);
    }

    public final void a(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f53445a, false, 55788, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f53445a, false, 55788, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        n.a(str, jSONObject);
    }

    public final void a(String str, int i, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), jSONObject}, this, f53445a, false, 55800, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), jSONObject}, this, f53445a, false, 55800, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        n.a(str, i, jSONObject);
    }

    public final void a(String str, String str2, float f2) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Float.valueOf(f2)}, this, f53445a, false, 55797, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, Float.valueOf(f2)}, this, f53445a, false, 55797, new Class[]{String.class, String.class, Float.TYPE}, Void.TYPE);
            return;
        }
        n.b(str, str2, f2);
    }

    public final void a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), jSONObject, jSONObject2}, this, f53445a, false, 55787, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), jSONObject, jSONObject2}, this, f53445a, false, 55787, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        n.a(str, i, jSONObject, jSONObject2);
    }

    public final void a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str, str2, str3, Integer.valueOf(i), jSONObject}, this, f53445a, false, 55790, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str, str2, str3, Integer.valueOf(i), jSONObject}, this, f53445a, false, 55790, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        n.a(j, j2, str, str2, str3, i, jSONObject);
    }

    public final void b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str, str2, str3, Integer.valueOf(i), jSONObject}, this, f53445a, false, 55791, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str, str2, str3, Integer.valueOf(i), jSONObject}, this, f53445a, false, 55791, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        n.b(j, j2, str, str2, str3, i, jSONObject);
    }
}
