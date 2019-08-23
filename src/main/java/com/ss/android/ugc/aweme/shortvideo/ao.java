package com.ss.android.ugc.aweme.shortvideo;

import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCreation;

public final /* synthetic */ class ao implements s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65646a;

    /* renamed from: b  reason: collision with root package name */
    private final an f65647b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f65648c;

    /* renamed from: d  reason: collision with root package name */
    private final VideoCreation f65649d;

    /* renamed from: e  reason: collision with root package name */
    private final SynthetiseResult f65650e;

    ao(an anVar, Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        this.f65647b = anVar;
        this.f65648c = obj;
        this.f65649d = videoCreation;
        this.f65650e = synthetiseResult;
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f65646a, false, 74032, new Class[0], Object.class)) {
            return this.f65647b.a(this.f65648c, this.f65649d, this.f65650e);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f65646a, false, 74032, new Class[0], Object.class);
    }
}
