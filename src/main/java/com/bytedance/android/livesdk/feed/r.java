package com.bytedance.android.livesdk.feed;

import android.os.SystemClock;
import com.bytedance.android.live.core.d.a;
import com.bytedance.android.live.core.d.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public final class r extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f14325b;

    /* renamed from: c  reason: collision with root package name */
    public long f14326c;

    /* renamed from: d  reason: collision with root package name */
    private long f14327d;

    private long c() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f14325b, false, 8431, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f14325b, false, 8431, new Class[0], Long.TYPE)).longValue();
        }
        if (this.f14327d > 0) {
            j = SystemClock.uptimeMillis() - this.f14327d;
        } else {
            j = 0;
        }
        this.f14327d = 0;
        return j;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14325b, false, 8430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14325b, false, 8430, new Class[0], Void.TYPE);
            return;
        }
        this.f14327d = SystemClock.uptimeMillis();
    }

    public final long b() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f14325b, false, 8437, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f14325b, false, 8437, new Class[0], Long.TYPE)).longValue();
        }
        if (this.f14326c > 0) {
            j = SystemClock.uptimeMillis() - this.f14326c;
        } else {
            j = 0;
        }
        this.f14326c = 0;
        return j;
    }

    public static void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, null, f14325b, true, 8442, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, null, f14325b, true, 8442, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (PatchProxy.isSupport(new Object[]{jSONObject, "feed_fps", Float.valueOf(f2)}, null, a.f7836a, true, 339, new Class[]{JSONObject.class, String.class, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, "feed_fps", Float.valueOf(f2)}, null, a.f7836a, true, 339, new Class[]{JSONObject.class, String.class, Float.TYPE}, Void.TYPE);
        } else {
            try {
                jSONObject.put("feed_fps", (double) f2);
            } catch (JSONException unused) {
            }
        }
        e.b("ttlive_feed_list_fps_all", 0, jSONObject);
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f14325b, false, 8432, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f14325b, false, 8432, new Class[]{String.class}, Void.TYPE);
            return;
        }
        long c2 = c();
        if (PatchProxy.isSupport(new Object[]{new Long(c2), str2}, null, f14325b, true, 8433, new Class[]{Long.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(c2), str2}, null, f14325b, true, 8433, new Class[]{Long.TYPE, String.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        a(jSONObject, "request_type", str2);
        e.a("ttlive_request_feed_api_all", 0, c2, jSONObject);
    }

    public final void a(String str, Throwable th) {
        String str2;
        String str3 = str;
        Throwable th2 = th;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str3, th2}, this, f14325b, false, 8434, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, th2}, this, f14325b, false, 8434, new Class[]{String.class, Throwable.class}, Void.TYPE);
            return;
        }
        c();
        if (PatchProxy.isSupport(new Object[]{-1L, str3, th2}, null, f14325b, true, 8435, new Class[]{Long.TYPE, String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{-1L, str3, th2}, null, f14325b, true, 8435, new Class[]{Long.TYPE, String.class, Throwable.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (th2 instanceof com.bytedance.android.live.a.a.a) {
            i = ((com.bytedance.android.live.a.a.a) th2).getErrorCode();
        }
        if (th2 != null) {
            str2 = th.getMessage();
        } else {
            str2 = "";
        }
        a(jSONObject, "error_code", (long) i);
        a(jSONObject, "error_msg", str2);
        a(jSONObject, "request_type", str3);
        e.b("ttlive_request_feed_api_all", 1, jSONObject);
        e.a("ttlive_request_feed_api_error", 1, jSONObject);
    }
}
