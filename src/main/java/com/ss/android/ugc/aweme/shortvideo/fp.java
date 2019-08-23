package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;

public final /* synthetic */ class fp implements s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67770a;

    /* renamed from: b  reason: collision with root package name */
    private final fo f67771b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f67772c;

    /* renamed from: d  reason: collision with root package name */
    private final VideoCreation f67773d;

    /* renamed from: e  reason: collision with root package name */
    private final SynthetiseResult f67774e;

    fp(fo foVar, Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        this.f67771b = foVar;
        this.f67772c = obj;
        this.f67773d = videoCreation;
        this.f67774e = synthetiseResult;
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f67770a, false, 74654, new Class[0], Object.class)) {
            return this.f67771b.a(this.f67772c, this.f67773d, this.f67774e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f67770a, false, 74654, new Class[0], Object.class);
    }
}
