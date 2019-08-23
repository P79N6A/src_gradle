package com.ss.android.ugc.aweme.face2face.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.p.a;

public class Face2FaceFriendsItemAnimator extends DefaultItemAnimator {
    public static ChangeQuickRedirect i;
    private Interpolator j = new a();

    public Face2FaceFriendsItemAnimator() {
        setAddDuration(150);
        setRemoveDuration(150);
        setMoveDuration(150);
    }

    /* access modifiers changed from: package-private */
    public final void a(final RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, i, false, 39242, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, i, false, 39242, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator animate = view.animate();
        if (Build.VERSION.SDK_INT >= 21) {
            animate.translationZ(-40.0f);
        }
        this.g.add(viewHolder);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setInterpolator(new OvershootInterpolator()).setListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44045a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f44045a, false, 39246, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f44045a, false, 39246, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                Face2FaceFriendsItemAnimator.this.dispatchRemoveStarting(viewHolder);
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f44045a, false, 39247, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f44045a, false, 39247, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                animate.setListener(null);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                ViewCompat.setTranslationZ(view, 0.0f);
                Face2FaceFriendsItemAnimator.this.dispatchRemoveFinished(viewHolder);
                Face2FaceFriendsItemAnimator.this.g.remove(viewHolder);
                Face2FaceFriendsItemAnimator.this.a();
            }
        }).start();
    }

    /* access modifiers changed from: package-private */
    public final void b(final RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, i, false, 39241, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, i, false, 39241, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        viewHolder.itemView.setAlpha(0.0f);
        viewHolder.itemView.setScaleX(0.7f);
        viewHolder.itemView.setScaleY(0.7f);
        ViewCompat.setTranslationZ(viewHolder.itemView, -40.0f);
        final View view = viewHolder.itemView;
        final ViewPropertyAnimator animate = view.animate();
        if (Build.VERSION.SDK_INT >= 21) {
            animate.translationZ(0.0f);
        }
        this.f43981e.add(viewHolder);
        animate.alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator()).setDuration(getAddDuration()).setListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f44040a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f44040a, false, 39243, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f44040a, false, 39243, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                Face2FaceFriendsItemAnimator.this.dispatchAddStarting(viewHolder);
            }

            public final void onAnimationCancel(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f44040a, false, 39244, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f44040a, false, 39244, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                ViewCompat.setTranslationZ(view, 0.0f);
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f44040a, false, 39245, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f44040a, false, 39245, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                animate.setListener(null);
                Face2FaceFriendsItemAnimator.this.dispatchAddFinished(viewHolder);
                Face2FaceFriendsItemAnimator.this.f43981e.remove(viewHolder);
                Face2FaceFriendsItemAnimator.this.a();
            }
        }).start();
    }
}
