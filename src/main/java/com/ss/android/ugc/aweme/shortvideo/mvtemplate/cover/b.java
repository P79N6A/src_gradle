package com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.vesdk.m;
import com.ss.android.vesdk.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68695a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68696b;

    /* renamed from: c  reason: collision with root package name */
    private final String f68697c;

    /* renamed from: d  reason: collision with root package name */
    private final p f68698d;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.b f68699e;

    b(a aVar, String str, p pVar, com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.b bVar) {
        this.f68696b = aVar;
        this.f68697c = str;
        this.f68698d = pVar;
        this.f68699e = bVar;
    }

    public final void a(int i, int i2, float f2, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f68695a, false, 78063, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), str}, this, f68695a, false, 78063, new Class[]{Integer.TYPE, Integer.TYPE, Float.TYPE, String.class}, Void.TYPE);
            return;
        }
        a aVar = this.f68696b;
        String str2 = this.f68697c;
        p pVar = this.f68698d;
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.b bVar = this.f68699e;
        if (i == 4101 && !aVar.o) {
            aVar.o = true;
            i.a((Callable<TResult>) new d<TResult>(aVar, str2)).a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(aVar, pVar, bVar), i.f1052b);
        }
    }
}
