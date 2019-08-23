package com.bytedance.android.livesdk;

import android.widget.PopupWindow;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ae implements PopupWindow.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9001a;

    /* renamed from: b  reason: collision with root package name */
    private final LottieAnimationView f9002b;

    ae(LottieAnimationView lottieAnimationView) {
        this.f9002b = lottieAnimationView;
    }

    public final void onDismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f9001a, false, 2723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9001a, false, 2723, new Class[0], Void.TYPE);
            return;
        }
        this.f9002b.cancelAnimation();
    }
}
