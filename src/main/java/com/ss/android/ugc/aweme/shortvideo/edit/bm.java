package com.ss.android.ugc.aweme.shortvideo.edit;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;

public final /* synthetic */ class bm implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67123a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67124b;

    /* renamed from: c  reason: collision with root package name */
    private final View f67125c;

    /* renamed from: d  reason: collision with root package name */
    private final RTLImageView f67126d;

    bm(VEVideoPublishEditActivity vEVideoPublishEditActivity, View view, RTLImageView rTLImageView) {
        this.f67124b = vEVideoPublishEditActivity;
        this.f67125c = view;
        this.f67126d = rTLImageView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67123a, false, 76489, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67123a, false, 76489, new Class[0], Void.TYPE);
            return;
        }
        this.f67124b.a(this.f67125c, this.f67126d);
    }
}
