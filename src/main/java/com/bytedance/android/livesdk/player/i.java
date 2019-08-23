package com.bytedance.android.livesdk.player;

import android.os.SystemClock;
import com.bytedance.android.live.core.d.a;
import com.bytedance.android.live.core.d.e;
import com.bytedance.android.livesdk.j.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class i extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f16820b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.live.b.a f16821c;

    /* renamed from: d  reason: collision with root package name */
    public long f16822d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f16823e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f16824f;

    public final long a() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f16820b, false, 12725, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f16820b, false, 12725, new Class[0], Long.TYPE)).longValue();
        }
        if (this.f16821c != null) {
            j = this.f16821c.a();
        } else if (this.f16822d > 0) {
            j = SystemClock.uptimeMillis() - this.f16822d;
        } else {
            j = 0;
        }
        this.f16821c = null;
        this.f16822d = 0;
        return j;
    }

    public final void a(long j) {
        String str;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f16820b, false, 12728, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f16820b, false, 12728, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (!this.f16823e) {
            this.f16823e = true;
            if (this.f16821c != null) {
                str = this.f16821c.f15799b;
            } else {
                str = "other";
            }
            long a2 = a();
            JSONObject jSONObject = new JSONObject();
            a(jSONObject, "enter_room_type", str);
            a(jSONObject, "room_id", j);
            e.a("ttlive_audience_enter_room_all", 2, a2, jSONObject);
            e.a("ttlive_audience_enter_room_error", 2, jSONObject);
            com.bytedance.android.livesdk.j.a.a.a().a(b.Room.info, "ttlive_audience_enter_room", 2, jSONObject);
        }
    }

    public final void a(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f16820b, false, 12730, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f16820b, false, 12730, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else if (!this.f16824f) {
            this.f16824f = true;
            JSONObject jSONObject = new JSONObject();
            a(jSONObject, "exit_code", (long) i);
            a(jSONObject, "exit_msg", str);
            e.a("ttlive_audience_leave_room", 3, jSONObject);
        }
    }

    public final void b(int i, String str, long j) {
        int i2 = i;
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, new Long(j2)}, this, f16820b, false, 12729, new Class[]{Integer.TYPE, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, new Long(j2)}, this, f16820b, false, 12729, new Class[]{Integer.TYPE, String.class, Long.TYPE}, Void.TYPE);
        } else if (!this.f16824f) {
            if (i2 != 115) {
                this.f16824f = true;
            }
            JSONObject jSONObject = new JSONObject();
            a(jSONObject, "exit_code", (long) i2);
            a(jSONObject, "exit_msg", str2);
            a(jSONObject, "room_id", j2);
            e.a("ttlive_audience_leave_room", 3, jSONObject);
        }
    }

    public final void a(int i, String str, long j) {
        String str2;
        String str3 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, new Long(j2)}, this, f16820b, false, 12727, new Class[]{Integer.TYPE, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, new Long(j2)}, this, f16820b, false, 12727, new Class[]{Integer.TYPE, String.class, Long.TYPE}, Void.TYPE);
        } else if (!this.f16823e) {
            this.f16823e = true;
            if (this.f16821c != null) {
                str2 = this.f16821c.f15799b;
            } else {
                str2 = "other";
            }
            a();
            JSONObject jSONObject = new JSONObject();
            a(jSONObject, "enter_room_type", str2);
            a(jSONObject, "error_code", (long) i);
            a(jSONObject, "error_msg", str3);
            a(jSONObject, "room_id", j2);
            e.b("ttlive_audience_enter_room_all", 1, jSONObject);
            e.a("ttlive_audience_enter_room_error", 1, jSONObject);
            com.bytedance.android.livesdk.j.a.a.a().a(b.Room.info, "ttlive_audience_enter_room", 1, jSONObject);
        }
    }
}
