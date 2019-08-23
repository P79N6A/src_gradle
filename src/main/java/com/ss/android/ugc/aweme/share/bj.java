package com.ss.android.ugc.aweme.share;

import android.graphics.Bitmap;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class bj implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64792a;

    /* renamed from: b  reason: collision with root package name */
    private final bh f64793b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64794c;

    /* renamed from: d  reason: collision with root package name */
    private final Bitmap f64795d;

    bj(bh bhVar, a aVar, Bitmap bitmap) {
        this.f64793b = bhVar;
        this.f64794c = aVar;
        this.f64795d = bitmap;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f64792a, false, 73157, new Class[0], Object.class)) {
            return this.f64793b.a(this.f64794c, this.f64795d);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f64792a, false, 73157, new Class[0], Object.class);
    }
}
