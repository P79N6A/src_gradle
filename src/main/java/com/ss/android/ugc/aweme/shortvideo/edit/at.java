package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.e;

public final /* synthetic */ class at implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66987a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f66988b;

    /* renamed from: c  reason: collision with root package name */
    private final e f66989c;

    at(VEVideoPublishEditActivity vEVideoPublishEditActivity, e eVar) {
        this.f66988b = vEVideoPublishEditActivity;
        this.f66989c = eVar;
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f66987a, false, 76470, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f66987a, false, 76470, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, Void.TYPE);
            return;
        }
        this.f66988b.a(this.f66989c, fVar);
    }
}
