package com.ss.android.ugc.aweme.photo;

import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;

public final /* synthetic */ class m implements s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58614a;

    /* renamed from: b  reason: collision with root package name */
    private final l f58615b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f58616c;

    /* renamed from: d  reason: collision with root package name */
    private final VideoCreation f58617d;

    /* renamed from: e  reason: collision with root package name */
    private final SynthetiseResult f58618e;

    m(l lVar, Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        this.f58615b = lVar;
        this.f58616c = obj;
        this.f58617d = videoCreation;
        this.f58618e = synthetiseResult;
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f58614a, false, 63588, new Class[0], Object.class)) {
            return this.f58615b.a(this.f58616c, this.f58617d, this.f58618e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f58614a, false, 63588, new Class[0], Object.class);
    }
}
