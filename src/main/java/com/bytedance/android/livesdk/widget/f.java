package com.bytedance.android.livesdk.widget;

import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.uikit.d.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18464a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftUserInfoView f18465b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18466c;

    f(GiftUserInfoView giftUserInfoView, int i) {
        this.f18465b = giftUserInfoView;
        this.f18466c = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f18464a, false, 14389, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18464a, false, 14389, new Class[0], Void.TYPE);
            return;
        }
        GiftUserInfoView giftUserInfoView = this.f18465b;
        int i = this.f18466c;
        if (giftUserInfoView.f18226b.getScrollX() != 0 && c.a(giftUserInfoView.getContext())) {
            i = giftUserInfoView.f18226b.getScrollX() - i;
        }
        giftUserInfoView.f18227c = ObjectAnimator.ofInt(giftUserInfoView.f18226b, "scrollX", new int[]{i}).setDuration(2000);
        giftUserInfoView.f18227c.setInterpolator(new LinearInterpolator());
        giftUserInfoView.f18227c.start();
    }
}
