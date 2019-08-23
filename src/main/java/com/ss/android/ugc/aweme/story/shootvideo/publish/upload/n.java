package com.ss.android.ugc.aweme.story.shootvideo.publish.upload;

import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;

public final /* synthetic */ class n implements s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73762a;

    /* renamed from: b  reason: collision with root package name */
    private final m f73763b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f73764c;

    /* renamed from: d  reason: collision with root package name */
    private final VideoCreation f73765d;

    /* renamed from: e  reason: collision with root package name */
    private final SynthetiseResult f73766e;

    n(m mVar, Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        this.f73763b = mVar;
        this.f73764c = obj;
        this.f73765d = videoCreation;
        this.f73766e = synthetiseResult;
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f73762a, false, 85507, new Class[0], Object.class)) {
            return this.f73763b.a(this.f73764c, this.f73765d, this.f73766e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f73762a, false, 85507, new Class[0], Object.class);
    }
}
