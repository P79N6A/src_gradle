package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.b.a.a;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o;

public final /* synthetic */ class br implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67139a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67140b;

    br(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f67140b = vEVideoPublishEditActivity;
    }

    public final void a(Object obj, Object obj2) {
        if (PatchProxy.isSupport(new Object[]{obj, obj2}, this, f67139a, false, 76494, new Class[]{Object.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f67139a, false, 76494, new Class[]{Object.class, Object.class}, Void.TYPE);
            return;
        }
        this.f67140b.a((o) obj2);
    }
}
