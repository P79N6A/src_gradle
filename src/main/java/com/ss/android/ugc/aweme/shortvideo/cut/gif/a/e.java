package com.ss.android.ugc.aweme.shortvideo.cut.gif.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.vesdk.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66439a;

    /* renamed from: b  reason: collision with root package name */
    private final IVideo2GifService.ConvertListener f66440b;

    /* renamed from: c  reason: collision with root package name */
    private final p f66441c;

    e(IVideo2GifService.ConvertListener convertListener, p pVar) {
        this.f66440b = convertListener;
        this.f66441c = pVar;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f66439a, false, 75837, new Class[0], Object.class)) {
            return b.a(this.f66440b, this.f66441c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f66439a, false, 75837, new Class[0], Object.class);
    }
}
