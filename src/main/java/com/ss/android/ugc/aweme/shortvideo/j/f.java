package com.ss.android.ugc.aweme.shortvideo.j;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.b.l;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class f implements Function1 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68267a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f68268b;

    /* renamed from: c  reason: collision with root package name */
    private final c f68269c;

    f(WeakReference weakReference, c cVar) {
        this.f68268b = weakReference;
        this.f68269c = cVar;
    }

    public final Object invoke(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f68267a, false, 78475, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f68267a, false, 78475, new Class[]{Object.class}, Object.class);
        }
        WeakReference weakReference = this.f68268b;
        c cVar = this.f68269c;
        l lVar = (l) obj;
        if (((c) weakReference.get()) != null) {
            new Handler(Looper.getMainLooper()).post(new g(cVar, lVar));
        }
        return Unit.INSTANCE;
    }
}
