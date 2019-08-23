package dmt.av.video;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ac implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82853a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditFragment f82854b;

    ac(VEVideoPublishEditFragment vEVideoPublishEditFragment) {
        this.f82854b = vEVideoPublishEditFragment;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f82853a, false, 92067, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f82853a, false, 92067, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        this.f82854b.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
