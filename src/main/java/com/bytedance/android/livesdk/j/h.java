package com.bytedance.android.livesdk.j;

import com.bytedance.android.live.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15718a;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f15719b = new JSONObject();

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f15720c = new JSONObject();

    public final h a(JSONObject jSONObject) {
        this.f15720c = jSONObject;
        return this;
    }

    public final h b(JSONObject jSONObject) {
        this.f15719b = jSONObject;
        return this;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f15718a, false, 10906, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f15718a, false, 10906, new Class[]{String.class}, Void.TYPE);
            return;
        }
        a(str2, 0);
    }

    public final h a(String str, float f2) {
        if (PatchProxy.isSupport(new Object[]{str, Float.valueOf(f2)}, this, f15718a, false, 10905, new Class[]{String.class, Float.TYPE}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{str, Float.valueOf(f2)}, this, f15718a, false, 10905, new Class[]{String.class, Float.TYPE}, h.class);
        }
        try {
            this.f15719b.put(str, (double) f2);
        } catch (JSONException unused) {
        }
        return this;
    }

    public final h a(String str, Object obj) {
        if (PatchProxy.isSupport(new Object[]{str, obj}, this, f15718a, false, 10902, new Class[]{String.class, Object.class}, h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[]{str, obj}, this, f15718a, false, 10902, new Class[]{String.class, Object.class}, h.class);
        }
        try {
            this.f15720c.put(str, obj);
        } catch (JSONException unused) {
        }
        return this;
    }

    public final void a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f15718a, false, 10907, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f15718a, false, 10907, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        e.a(str, i, this.f15719b, this.f15720c);
    }
}
