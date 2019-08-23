package com.ss.android.ugc.aweme.commercialize.symphony;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.feed.adapter.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/symphony/ScaleInOutTouchListener;", "Landroid/view/View$OnTouchListener;", "()V", "normal", "", "ratio", "normalView", "", "v", "Landroid/view/View;", "onTouch", "", "event", "Landroid/view/MotionEvent;", "shrinkView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39549a;

    /* renamed from: b  reason: collision with root package name */
    private final float f39550b = 0.92f;

    /* renamed from: c  reason: collision with root package name */
    private final float f39551c = 1.0f;

    private final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f39549a, false, 32089, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39549a, false, 32089, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{this.f39551c});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{this.f39551c});
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet duration = animatorSet.setDuration(60);
        Intrinsics.checkExpressionValueIsNotNull(duration, "set.setDuration(60)");
        duration.setInterpolator(new c());
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f39549a, false, 32087, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f39549a, false, 32087, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view, NotifyType.VIBRATE);
        Intrinsics.checkParameterIsNotNull(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    if (!PatchProxy.isSupport(new Object[]{view}, this, f39549a, false, 32088, new Class[]{View.class}, Void.TYPE)) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{this.f39550b});
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{this.f39550b});
                        AnimatorSet animatorSet = new AnimatorSet();
                        AnimatorSet duration = animatorSet.setDuration(100);
                        Intrinsics.checkExpressionValueIsNotNull(duration, "set.setDuration(100)");
                        duration.setInterpolator(new c());
                        animatorSet.play(ofFloat).with(ofFloat2);
                        animatorSet.start();
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f39549a, false, 32088, new Class[]{View.class}, Void.TYPE);
                        break;
                    }
                case 1:
                    a(view);
                    view.performClick();
                    return true;
            }
            return true;
        }
        a(view);
        return false;
    }
}
