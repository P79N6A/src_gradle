package com.ss.android.ugc.aweme.live.sdk.chatroom.ui;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53522a;

    /* renamed from: b  reason: collision with root package name */
    private final b f53523b;

    c(b bVar) {
        this.f53523b = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f53522a, false, 55890, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f53522a, false, 55890, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        b bVar = this.f53523b;
        bVar.f53516c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (PatchProxy.isSupport(new Object[0], bVar, b.f53514a, false, 55887, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], bVar, b.f53514a, false, 55887, new Class[0], Void.TYPE);
            return;
        }
        if (bVar.f53515b != 0) {
            bVar.a((1.0f - bVar.f53516c) / 0.5f);
            bVar.f53518e.setAlpha(1.0f - ((1.0f - bVar.f53516c) / 0.5f));
        }
    }
}
