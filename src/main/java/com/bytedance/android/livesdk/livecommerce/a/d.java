package com.bytedance.android.livesdk.livecommerce.a;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livecommerce.b;
import com.bytedance.android.livesdk.livecommerce.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15897a;

    /* renamed from: b  reason: collision with root package name */
    public c f15898b;

    /* renamed from: c  reason: collision with root package name */
    private String f15899c;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f15897a, false, 10683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15897a, false, 10683, new Class[0], Void.TYPE);
        } else if (!TextUtils.isEmpty(this.f15899c)) {
            String d2 = b.a().d();
            if (!TextUtils.isEmpty(d2)) {
                a("request_id", d2);
            }
            c.a(this.f15899c, this.f15898b.f15892b);
        }
    }

    public d(String str) {
        this(str, null);
    }

    private d(String str, HashMap<String, String> hashMap) {
        this.f15899c = str;
        this.f15898b = new c();
        this.f15898b.a("EVENT_ORIGIN_FEATURE", "TEMAI");
        this.f15898b.a("enter_from_merge", "live");
        this.f15898b.a("_param_live_platform", "live");
    }

    public final d a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f15897a, false, 10682, new Class[]{String.class, Integer.TYPE}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f15897a, false, 10682, new Class[]{String.class, Integer.TYPE}, d.class);
        }
        this.f15898b.a(str, i);
        return this;
    }

    public final d a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f15897a, false, 10681, new Class[]{String.class, String.class}, d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f15897a, false, 10681, new Class[]{String.class, String.class}, d.class);
        }
        this.f15898b.a(str, str2);
        return this;
    }
}
