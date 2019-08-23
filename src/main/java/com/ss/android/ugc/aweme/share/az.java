package com.ss.android.ugc.aweme.share;

import android.graphics.Bitmap;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class az implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64696a;

    /* renamed from: b  reason: collision with root package name */
    private final ax f64697b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64698c;

    /* renamed from: d  reason: collision with root package name */
    private final Bitmap f64699d;

    az(ax axVar, a aVar, Bitmap bitmap) {
        this.f64697b = axVar;
        this.f64698c = aVar;
        this.f64699d = bitmap;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f64696a, false, 73091, new Class[0], Object.class)) {
            return this.f64697b.a(this.f64698c, this.f64699d);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f64696a, false, 73091, new Class[0], Object.class);
    }
}
