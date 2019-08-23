package com.ss.android.ugc.aweme.shortvideo.edit;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView;

public final /* synthetic */ class av implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67077a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67078b;

    /* renamed from: c  reason: collision with root package name */
    private final View f67079c;

    /* renamed from: d  reason: collision with root package name */
    private final RTLImageView f67080d;

    av(VEVideoPublishEditActivity vEVideoPublishEditActivity, View view, RTLImageView rTLImageView) {
        this.f67078b = vEVideoPublishEditActivity;
        this.f67079c = view;
        this.f67080d = rTLImageView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f67077a, false, 76472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67077a, false, 76472, new Class[0], Void.TYPE);
            return;
        }
        VEVideoPublishEditActivity vEVideoPublishEditActivity = this.f67078b;
        View view = this.f67079c;
        view.animate().setStartDelay(50).scaleX(1.2f).scaleY(1.2f).setDuration(100).withEndAction(new bm(vEVideoPublishEditActivity, view, this.f67080d)).start();
    }
}
