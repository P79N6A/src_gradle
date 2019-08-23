package com.ss.android.ugc.aweme.hotsearch.share;

import a.i;
import android.graphics.Bitmap;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.hotsearch.share.g;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class q implements Function0 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49856a;

    /* renamed from: b  reason: collision with root package name */
    private final g f49857b;

    /* renamed from: c  reason: collision with root package name */
    private final a f49858c;

    q(g gVar, a aVar) {
        this.f49857b = gVar;
        this.f49858c = aVar;
    }

    public final Object invoke() {
        if (PatchProxy.isSupport(new Object[0], this, f49856a, false, 49790, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f49856a, false, 49790, new Class[0], Object.class);
        }
        g gVar = this.f49857b;
        a aVar = this.f49858c;
        Bitmap bitmap = gVar.f49831d;
        j jVar = new j(gVar, aVar);
        if (PatchProxy.isSupport(new Object[]{bitmap, jVar}, gVar, g.f49828a, false, 49776, new Class[]{Bitmap.class, g.a.class}, Void.TYPE)) {
            g gVar2 = gVar;
            PatchProxy.accessDispatch(new Object[]{bitmap, jVar}, gVar2, g.f49828a, false, 49776, new Class[]{Bitmap.class, g.a.class}, Void.TYPE);
        } else {
            i.a((Callable<TResult>) new o<TResult>(gVar, bitmap)).a((a.g<TResult, TContinuationResult>) new p<TResult,TContinuationResult>(jVar), i.f1052b);
        }
        return null;
    }
}
