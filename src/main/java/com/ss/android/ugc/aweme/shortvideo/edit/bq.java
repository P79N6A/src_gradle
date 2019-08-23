package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.b.a.b;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o;

public final /* synthetic */ class bq implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67137a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67138b;

    bq(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f67138b = vEVideoPublishEditActivity;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67137a, false, 76493, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67137a, false, 76493, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f67138b.b((o) obj);
    }
}
