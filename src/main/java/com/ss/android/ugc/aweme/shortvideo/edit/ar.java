package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.helper.MusicDragHelper;

public final /* synthetic */ class ar implements MusicDragHelper.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66983a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66984b;

    ar(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f66984b = vEVideoPublishEditActivity;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f66983a, false, 76468, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66983a, false, 76468, new Class[0], Void.TYPE);
            return;
        }
        this.f66984b.ae();
    }
}
