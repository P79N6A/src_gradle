package com.ss.android.ugc.aweme.story.shootvideo.publish.upload;

import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;

public final /* synthetic */ class g implements s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73736a;

    /* renamed from: b  reason: collision with root package name */
    private final f f73737b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f73738c;

    /* renamed from: d  reason: collision with root package name */
    private final VideoCreation f73739d;

    /* renamed from: e  reason: collision with root package name */
    private final SynthetiseResult f73740e;

    g(f fVar, Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        this.f73737b = fVar;
        this.f73738c = obj;
        this.f73739d = videoCreation;
        this.f73740e = synthetiseResult;
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f73736a, false, 85475, new Class[0], Object.class)) {
            return this.f73737b.a(this.f73738c, this.f73739d, this.f73740e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f73736a, false, 85475, new Class[0], Object.class);
    }
}
