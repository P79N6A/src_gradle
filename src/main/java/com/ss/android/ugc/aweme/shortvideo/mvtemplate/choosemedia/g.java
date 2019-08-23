package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68599a;

    /* renamed from: b  reason: collision with root package name */
    private final MvChooseAlbumFragment f68600b;

    /* renamed from: c  reason: collision with root package name */
    private final int f68601c;

    g(MvChooseAlbumFragment mvChooseAlbumFragment, int i) {
        this.f68600b = mvChooseAlbumFragment;
        this.f68601c = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f68599a, false, 77944, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f68599a, false, 77944, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        this.f68600b.f68521d.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) this.f68601c));
    }
}
