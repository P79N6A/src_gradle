package com.ss.android.ugc.aweme.shortvideo.cut.gif.a;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66436a;

    /* renamed from: b  reason: collision with root package name */
    private final IVideo2GifService.ConvertListener f66437b;

    /* renamed from: c  reason: collision with root package name */
    private final p f66438c;

    d(IVideo2GifService.ConvertListener convertListener, p pVar) {
        this.f66437b = convertListener;
        this.f66438c = pVar;
    }

    public final void a(int i, int i2, float f2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f66436a, false, 75836, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f66436a, false, 75836, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new e<TResult>(this.f66437b, this.f66438c), i.f1052b);
    }
}
