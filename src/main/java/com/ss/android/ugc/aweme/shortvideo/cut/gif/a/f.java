package com.ss.android.ugc.aweme.shortvideo.cut.gif.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.vesdk.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66442a;

    /* renamed from: b  reason: collision with root package name */
    private final int f66443b;

    /* renamed from: c  reason: collision with root package name */
    private final IVideo2GifService.ConvertListener f66444c;

    /* renamed from: d  reason: collision with root package name */
    private final float f66445d;

    /* renamed from: e  reason: collision with root package name */
    private final p f66446e;

    f(int i, IVideo2GifService.ConvertListener convertListener, float f2, p pVar) {
        this.f66443b = i;
        this.f66444c = convertListener;
        this.f66445d = f2;
        this.f66446e = pVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f66442a, false, 75838, new Class[0], Object.class)) {
            return b.a(this.f66443b, this.f66444c, this.f66445d, this.f66446e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f66442a, false, 75838, new Class[0], Object.class);
    }
}
