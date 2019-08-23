package com.ss.android.ugc.aweme.share;

import android.graphics.Bitmap;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.concurrent.Callable;

public final /* synthetic */ class ar implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64670a;

    /* renamed from: b  reason: collision with root package name */
    private final ao f64671b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64672c;

    /* renamed from: d  reason: collision with root package name */
    private final Bitmap f64673d;

    ar(ao aoVar, a aVar, Bitmap bitmap) {
        this.f64671b = aoVar;
        this.f64672c = aVar;
        this.f64673d = bitmap;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f64670a, false, 73067, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f64670a, false, 73067, new Class[0], Object.class);
        }
        ao aoVar = this.f64671b;
        a aVar = this.f64672c;
        Bitmap bitmap = this.f64673d;
        if (PatchProxy.isSupport(new Object[]{aVar, bitmap}, aoVar, ao.f64654a, false, 73064, new Class[]{a.class, Bitmap.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{aVar, bitmap}, aoVar, ao.f64654a, false, 73064, new Class[]{a.class, Bitmap.class}, File.class);
        }
        return aoVar.a(bitmap, "share_card_" + aoVar.f64655b);
    }
}
