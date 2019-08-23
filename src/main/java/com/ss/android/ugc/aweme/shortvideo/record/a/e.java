package com.ss.android.ugc.aweme.shortvideo.record.a;

import android.animation.ValueAnimator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.f;

public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69076a;

    /* renamed from: b  reason: collision with root package name */
    static final ValueAnimator.AnimatorUpdateListener f69077b = new e();

    private e() {
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f69076a, false, 78425, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f69076a, false, 78425, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        f.a().a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
