package com.ss.android.ugc.aweme.shortvideo.cut.gif.a;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66433a;

    /* renamed from: b  reason: collision with root package name */
    private final IVideo2GifService.ConvertListener f66434b;

    /* renamed from: c  reason: collision with root package name */
    private final p f66435c;

    c(IVideo2GifService.ConvertListener convertListener, p pVar) {
        this.f66434b = convertListener;
        this.f66435c = pVar;
    }

    public final void a(int i, int i2, float f2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f66433a, false, 75835, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f66433a, false, 75835, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
            return;
        }
        int i3 = i;
        i.a((Callable<TResult>) new f<TResult>(i, this.f66434b, f2, this.f66435c), i.f1052b);
    }
}
