package com.bytedance.android.livesdk.feed.live;

import android.widget.PopupWindow;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14263a;

    /* renamed from: b  reason: collision with root package name */
    private final LottieAnimationView f14264b;

    e(LottieAnimationView lottieAnimationView) {
        this.f14264b = lottieAnimationView;
    }

    public final void onDismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f14263a, false, 8723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14263a, false, 8723, new Class[0], Void.TYPE);
            return;
        }
        this.f14264b.cancelAnimation();
    }
}
