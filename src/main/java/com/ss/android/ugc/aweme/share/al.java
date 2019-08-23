package com.ss.android.ugc.aweme.share;

import android.graphics.Bitmap;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.concurrent.Callable;

public final /* synthetic */ class al implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64642a;

    /* renamed from: b  reason: collision with root package name */
    private final ah f64643b;

    /* renamed from: c  reason: collision with root package name */
    private final a f64644c;

    /* renamed from: d  reason: collision with root package name */
    private final Bitmap f64645d;

    al(ah ahVar, a aVar, Bitmap bitmap) {
        this.f64643b = ahVar;
        this.f64644c = aVar;
        this.f64645d = bitmap;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f64642a, false, 73047, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f64642a, false, 73047, new Class[0], Object.class);
        }
        ah ahVar = this.f64643b;
        a aVar = this.f64644c;
        Bitmap bitmap = this.f64645d;
        if (PatchProxy.isSupport(new Object[]{aVar, bitmap}, ahVar, ah.f64624a, false, 73043, new Class[]{a.class, Bitmap.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{aVar, bitmap}, ahVar, ah.f64624a, false, 73043, new Class[]{a.class, Bitmap.class}, File.class);
        }
        return ahVar.a(bitmap, "share_card_" + ahVar.f64625b);
    }
}
