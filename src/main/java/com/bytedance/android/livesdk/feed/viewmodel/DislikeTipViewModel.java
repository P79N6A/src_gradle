package com.bytedance.android.livesdk.feed.viewmodel;

import android.content.Context;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.feed.d.g;
import com.bytedance.android.livesdk.feed.k;
import com.bytedance.android.livesdk.feed.l.c;
import com.bytedance.ies.e.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class DislikeTipViewModel extends RxViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14458a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14459b;

    /* renamed from: c  reason: collision with root package name */
    public int f14460c;

    /* renamed from: d  reason: collision with root package name */
    public Context f14461d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14462e;

    public DislikeTipViewModel(k kVar, long j, Context context) {
        boolean z;
        g a2 = kVar.a(j);
        if (!c.a() && a2 != null && a2.j > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f14459b = z;
        this.f14461d = context;
        if (PatchProxy.isSupport(new Object[0], this, f14458a, false, 9006, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14458a, false, 9006, new Class[0], Void.TYPE);
            return;
        }
        this.f14462e = b.a(this.f14461d, "ttlive_live_user").a("HAVE_SHOW_DISLIKE_GUIDE", false);
    }
}
