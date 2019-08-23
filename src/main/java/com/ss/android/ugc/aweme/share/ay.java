package com.ss.android.ugc.aweme.share;

import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.share.ax;
import java.io.File;

public final /* synthetic */ class ay implements ax.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64693a;

    /* renamed from: b  reason: collision with root package name */
    private final ax f64694b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64695c;

    ay(ax axVar, a aVar) {
        this.f64694b = axVar;
        this.f64695c = aVar;
    }

    public final void a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f64693a, false, 73090, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file}, this, f64693a, false, 73090, new Class[]{File.class}, Void.TYPE);
            return;
        }
        this.f64694b.b(this.f64695c, file);
    }
}
