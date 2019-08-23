package com.ss.android.ugc.aweme.story.shootvideo.edit;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.view.c;
import java.util.ArrayList;
import java.util.Collection;

public final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73489a;

    /* renamed from: b  reason: collision with root package name */
    private final a f73490b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f73491c;

    /* renamed from: d  reason: collision with root package name */
    private final c f73492d;

    j(a aVar, ArrayList arrayList, c cVar) {
        this.f73490b = aVar;
        this.f73491c = arrayList;
        this.f73492d = cVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f73489a, false, 85249, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f73489a, false, 85249, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f73490b;
        i.b((Collection<? extends i<?>>) this.f73491c).a((g<TResult, TContinuationResult>) new g<TResult,TContinuationResult>(aVar, this.f73492d), i.f1052b);
        return null;
    }
}
