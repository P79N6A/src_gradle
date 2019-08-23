package com.ss.android.ugc.aweme.photomovie;

import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;

public final /* synthetic */ class k implements s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59008a;

    /* renamed from: b  reason: collision with root package name */
    private final j f59009b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f59010c;

    /* renamed from: d  reason: collision with root package name */
    private final VideoCreation f59011d;

    /* renamed from: e  reason: collision with root package name */
    private final SynthetiseResult f59012e;

    k(j jVar, Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        this.f59009b = jVar;
        this.f59010c = obj;
        this.f59011d = videoCreation;
        this.f59012e = synthetiseResult;
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f59008a, false, 63969, new Class[0], Object.class)) {
            return this.f59009b.a(this.f59010c, this.f59011d, this.f59012e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f59008a, false, 63969, new Class[0], Object.class);
    }
}
