package com.ss.android.ugc.aweme.shortvideo.ui;

import com.google.common.a.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.b.a;

public final /* synthetic */ class bn implements s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70825a;

    /* renamed from: b  reason: collision with root package name */
    private final a f70826b;

    bn(a aVar) {
        this.f70826b = aVar;
    }

    public final Object get() {
        if (!PatchProxy.isSupport(new Object[0], this, f70825a, false, 80638, new Class[0], Object.class)) {
            return this.f70826b.b();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f70825a, false, 80638, new Class[0], Object.class);
    }
}
