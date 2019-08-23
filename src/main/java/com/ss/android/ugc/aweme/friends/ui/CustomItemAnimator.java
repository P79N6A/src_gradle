package com.ss.android.ugc.aweme.friends.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.jedi.ext.adapter.multitype.MultiTypeViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.arch.JediBaseItemWidgetViewHolder;
import java.util.ArrayList;
import java.util.List;

public class CustomItemAnimator extends DefaultItemAnimator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49191a;

    /* renamed from: b  reason: collision with root package name */
    private final List<RecyclerView.ViewHolder> f49192b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<RecyclerView.ViewHolder> f49193c = new ArrayList();

    public CustomItemAnimator() {
        setAddDuration(300);
        setRemoveDuration(300);
        setMoveDuration(300);
    }

    public void endAnimations() {
        if (PatchProxy.isSupport(new Object[0], this, f49191a, false, 47104, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49191a, false, 47104, new Class[0], Void.TYPE);
            return;
        }
        for (int size = this.f49192b.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder viewHolder = this.f49192b.get(size);
            a(viewHolder.itemView);
            dispatchAddFinished(viewHolder);
            this.f49192b.remove(size);
        }
        for (int size2 = this.f49193c.size() - 1; size2 >= 0; size2--) {
            RecyclerView.ViewHolder viewHolder2 = this.f49193c.get(size2);
            a(viewHolder2.itemView);
            dispatchAddFinished(viewHolder2);
            this.f49193c.remove(size2);
        }
        super.endAnimations();
    }

    public boolean isRunning() {
        if (PatchProxy.isSupport(new Object[0], this, f49191a, false, 47105, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f49191a, false, 47105, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.f49192b.isEmpty() || !this.f49193c.isEmpty() || super.isRunning()) {
            return true;
        } else {
            return false;
        }
    }

    public void runPendingAnimations() {
        if (PatchProxy.isSupport(new Object[0], this, f49191a, false, 47102, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49191a, false, 47102, new Class[0], Void.TYPE);
            return;
        }
        super.runPendingAnimations();
        if (!this.f49192b.isEmpty()) {
            for (int size = this.f49192b.size() - 1; size >= 0; size--) {
                final RecyclerView.ViewHolder viewHolder = this.f49192b.get(size);
                viewHolder.itemView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(getAddDuration()).setListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49194a;

                    public final void onAnimationCancel(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f49194a, false, 47110, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f49194a, false, 47110, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        CustomItemAnimator.this.a(viewHolder.itemView);
                    }

                    public final void onAnimationStart(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f49194a, false, 47108, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f49194a, false, 47108, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        CustomItemAnimator.this.dispatchAddStarting(viewHolder);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f49194a, false, 47109, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f49194a, false, 47109, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        animator.getListeners().remove(this);
                        CustomItemAnimator.this.a(viewHolder.itemView);
                        CustomItemAnimator.this.dispatchAddFinished(viewHolder);
                        CustomItemAnimator.a(CustomItemAnimator.this);
                    }
                }).setInterpolator(new LinearOutSlowInInterpolator());
                this.f49192b.remove(size);
            }
        }
        if (!this.f49193c.isEmpty()) {
            for (int size2 = this.f49193c.size() - 1; size2 >= 0; size2--) {
                final RecyclerView.ViewHolder viewHolder2 = this.f49193c.get(size2);
                viewHolder2.itemView.animate().alpha(0.0f).translationX((float) (-viewHolder2.itemView.getWidth())).setDuration(getRemoveDuration()).setListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49197a;

                    public final void onAnimationCancel(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f49197a, false, 47113, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f49197a, false, 47113, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        CustomItemAnimator.this.a(viewHolder2.itemView);
                    }

                    public final void onAnimationStart(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f49197a, false, 47111, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f49197a, false, 47111, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        CustomItemAnimator.this.dispatchRemoveStarting(viewHolder2);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f49197a, false, 47112, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f49197a, false, 47112, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        animator.getListeners().remove(this);
                        CustomItemAnimator.this.a(viewHolder2.itemView);
                        CustomItemAnimator.this.dispatchRemoveFinished(viewHolder2);
                        CustomItemAnimator.a(CustomItemAnimator.this);
                    }
                }).setInterpolator(new LinearOutSlowInInterpolator());
                this.f49193c.remove(size2);
            }
        }
    }

    static /* synthetic */ void a(CustomItemAnimator customItemAnimator) {
        if (PatchProxy.isSupport(new Object[0], customItemAnimator, f49191a, false, 47106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], customItemAnimator, f49191a, false, 47106, new Class[0], Void.TYPE);
            return;
        }
        if (!customItemAnimator.isRunning()) {
            customItemAnimator.dispatchAnimationsFinished();
        }
    }

    public final void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f49191a, false, 47107, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f49191a, false, 47107, new Class[]{View.class}, Void.TYPE);
            return;
        }
        view2.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
    }

    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f49191a, false, 47100, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f49191a, false, 47100, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (!(viewHolder2 instanceof RecommendFriendItemViewV2Holder)) {
            return super.animateAdd(viewHolder);
        } else {
            viewHolder2.itemView.setAlpha(0.0f);
            viewHolder2.itemView.setTranslationY((float) viewHolder2.itemView.getHeight());
            viewHolder2.itemView.setScaleX(0.5f);
            viewHolder2.itemView.setScaleY(0.5f);
            this.f49192b.add(viewHolder2);
            return true;
        }
    }

    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f49191a, false, 47101, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f49191a, false, 47101, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (!(viewHolder2 instanceof RecommendFriendItemViewV2Holder) && !(viewHolder2 instanceof JediBaseItemWidgetViewHolder) && !(viewHolder2 instanceof MultiTypeViewHolder)) {
            return super.animateRemove(viewHolder);
        } else {
            viewHolder2.itemView.setAlpha(1.0f);
            viewHolder2.itemView.setTranslationX(0.0f);
            this.f49193c.add(viewHolder2);
            return true;
        }
    }

    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f49191a, false, 47103, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f49191a, false, 47103, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        viewHolder.itemView.animate().cancel();
        if (this.f49192b.remove(viewHolder)) {
            dispatchAddFinished(viewHolder);
            a(viewHolder.itemView);
        }
        if (this.f49193c.remove(viewHolder)) {
            dispatchRemoveFinished(viewHolder);
            a(viewHolder.itemView);
        }
        super.endAnimation(viewHolder);
    }
}
