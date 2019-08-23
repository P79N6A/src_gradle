package com.bytedance.android.livesdk.chatroom.interact;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10958a;

    /* renamed from: b  reason: collision with root package name */
    private final LinkDialog f10959b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup.LayoutParams f10960c;

    h(LinkDialog linkDialog, ViewGroup.LayoutParams layoutParams) {
        this.f10959b = linkDialog;
        this.f10960c = layoutParams;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f10958a, false, 4338, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f10958a, false, 4338, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        LinkDialog linkDialog = this.f10959b;
        ViewGroup.LayoutParams layoutParams = this.f10960c;
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        linkDialog.f10231c.setLayoutParams(layoutParams);
    }
}
