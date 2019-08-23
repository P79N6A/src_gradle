package com.ss.android.ugc.aweme.shortvideo.edit;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;

public final /* synthetic */ class bn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67127a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67128b;

    /* renamed from: c  reason: collision with root package name */
    private final RTLImageView f67129c;

    /* renamed from: d  reason: collision with root package name */
    private final View f67130d;

    bn(VEVideoPublishEditActivity vEVideoPublishEditActivity, RTLImageView rTLImageView, View view) {
        this.f67128b = vEVideoPublishEditActivity;
        this.f67129c = rTLImageView;
        this.f67130d = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67127a, false, 76490, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67127a, false, 76490, new Class[0], Void.TYPE);
            return;
        }
        VEVideoPublishEditActivity vEVideoPublishEditActivity = this.f67128b;
        RTLImageView rTLImageView = this.f67129c;
        rTLImageView.animate().translationYBy(3000.0f).setDuration(1500).withEndAction(new bo(vEVideoPublishEditActivity, rTLImageView, this.f67130d)).start();
    }
}
