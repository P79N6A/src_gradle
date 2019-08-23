package com.ss.android.ugc.aweme.shortvideo.edit;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;

public final /* synthetic */ class bo implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67131a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67132b;

    /* renamed from: c  reason: collision with root package name */
    private final RTLImageView f67133c;

    /* renamed from: d  reason: collision with root package name */
    private final View f67134d;

    bo(VEVideoPublishEditActivity vEVideoPublishEditActivity, RTLImageView rTLImageView, View view) {
        this.f67132b = vEVideoPublishEditActivity;
        this.f67133c = rTLImageView;
        this.f67134d = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67131a, false, 76491, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67131a, false, 76491, new Class[0], Void.TYPE);
            return;
        }
        this.f67132b.a(this.f67133c, this.f67134d);
    }
}
