package com.ss.android.ugc.aweme.comment.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.g.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/comment/ui/CommentOnTouchListener;", "Lcom/ss/android/ugc/aweme/shortvideo/listener/OnTouchAnimListener;", "()V", "onClick", "", "view", "Landroid/view/View;", "onTouchDownAnim", "Landroid/animation/Animator;", "onTouchUp", "event", "Landroid/view/MotionEvent;", "onTouchUpAnim", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class d extends a {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f36575d;

    public abstract void a(@NotNull View view);

    @NotNull
    public final Animator b(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f36575d, false, 27486, new Class[]{View.class}, Animator.class)) {
            return (Animator) PatchProxy.accessDispatch(new Object[]{view2}, this, f36575d, false, 27486, new Class[]{View.class}, Animator.class);
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.75f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
        ofFloat.setDuration(150);
        return ofFloat;
    }

    @NotNull
    public final Animator c(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f36575d, false, 27487, new Class[]{View.class}, Animator.class)) {
            return (Animator) PatchProxy.accessDispatch(new Object[]{view2}, this, f36575d, false, 27487, new Class[]{View.class}, Animator.class);
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.75f, 1.0f});
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "animator");
        ofFloat.setDuration(150);
        return ofFloat;
    }

    public final void a(@NotNull View view, @NotNull MotionEvent motionEvent) {
        View view2 = view;
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent2}, this, f36575d, false, 27488, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, motionEvent2}, this, f36575d, false, 27488, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(motionEvent2, "event");
        a(view);
    }
}
