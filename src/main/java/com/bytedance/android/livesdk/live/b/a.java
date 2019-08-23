package com.bytedance.android.livesdk.live.b;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15798a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15799b;

    /* renamed from: c  reason: collision with root package name */
    private final long f15800c = SystemClock.elapsedRealtime();

    public final long a() {
        if (!PatchProxy.isSupport(new Object[0], this, f15798a, false, 10321, new Class[0], Long.TYPE)) {
            return SystemClock.elapsedRealtime() - this.f15800c;
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f15798a, false, 10321, new Class[0], Long.TYPE)).longValue();
    }

    public a(String str) {
        this.f15799b = str;
    }
}
