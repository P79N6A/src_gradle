package com.ss.android.ugc.aweme.share;

import android.graphics.Bitmap;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class ab implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64603a;

    /* renamed from: b  reason: collision with root package name */
    private final z f64604b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64605c;

    /* renamed from: d  reason: collision with root package name */
    private final Bitmap f64606d;

    ab(z zVar, a aVar, Bitmap bitmap) {
        this.f64604b = zVar;
        this.f64605c = aVar;
        this.f64606d = bitmap;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f64603a, false, 73018, new Class[0], Object.class)) {
            return this.f64604b.a(this.f64605c, this.f64606d);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f64603a, false, 73018, new Class[0], Object.class);
    }
}
