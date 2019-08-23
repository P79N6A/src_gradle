package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class BarrageView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18194a;

    /* renamed from: b  reason: collision with root package name */
    View f18195b;

    /* renamed from: c  reason: collision with root package name */
    View f18196c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18197d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f18198e;

    public View getDanmuContainer() {
        return this.f18195b;
    }

    public View getDanmuInput() {
        return this.f18196c;
    }

    private int getLayoutId() {
        if (PatchProxy.isSupport(new Object[0], this, f18194a, false, 14311, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f18194a, false, 14311, new Class[0], Integer.TYPE)).intValue();
        } else if (c.a(getContext())) {
            return C0906R.layout.alw;
        } else {
            return C0906R.layout.alv;
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18194a, false, 14310, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18194a, false, 14310, new Class[0], Void.TYPE);
            return;
        }
        inflate(getContext(), getLayoutId(), this);
        this.f18195b = findViewById(C0906R.id.a2i);
        this.f18196c = findViewById(C0906R.id.a2g);
    }

    public BarrageView(@NonNull Context context) {
        super(context);
        a();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f18194a, false, 14317, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f18194a, false, 14317, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!this.f18197d && !this.f18198e) {
            if (c.a(getContext())) {
                f(true);
            } else {
                d(true);
            }
        }
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f18194a, false, 14313, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f18194a, false, 14313, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f18196c.setSelected(true);
        if (z) {
            ((TransitionDrawable) this.f18195b.getBackground()).startTransition(100);
            ((TransitionDrawable) this.f18196c.getBackground()).startTransition(100);
            this.f18196c.animate().translationXBy(UIUtils.dip2Px(getContext(), 22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f18195b.getBackground()).startTransition(0);
        ((TransitionDrawable) this.f18196c.getBackground()).startTransition(0);
        this.f18196c.setTranslationX(UIUtils.dip2Px(getContext(), 22.0f));
    }

    private void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f18194a, false, 14314, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f18194a, false, 14314, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f18196c.setSelected(false);
        if (z) {
            ((TransitionDrawable) this.f18195b.getBackground()).reverseTransition(100);
            ((TransitionDrawable) this.f18196c.getBackground()).reverseTransition(100);
            this.f18196c.animate().translationXBy(-UIUtils.dip2Px(getContext(), 22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f18195b.getBackground()).reverseTransition(0);
        ((TransitionDrawable) this.f18196c.getBackground()).reverseTransition(0);
        this.f18196c.setTranslationX(0.0f);
    }

    private void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f18194a, false, 14315, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f18194a, false, 14315, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f18196c.setSelected(true);
        if (z) {
            ((TransitionDrawable) this.f18195b.getBackground()).startTransition(100);
            ((TransitionDrawable) this.f18196c.getBackground()).startTransition(100);
            this.f18196c.animate().setListener(new Animator.AnimatorListener() {
                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    BarrageView.this.f18197d = false;
                }

                public final void onAnimationStart(Animator animator) {
                    BarrageView.this.f18197d = true;
                }
            }).translationXBy(UIUtils.dip2Px(getContext(), -22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f18195b.getBackground()).startTransition(0);
        ((TransitionDrawable) this.f18196c.getBackground()).startTransition(0);
        this.f18196c.setTranslationX(UIUtils.dip2Px(getContext(), -22.0f));
    }

    private void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f18194a, false, 14316, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f18194a, false, 14316, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f18196c.setSelected(false);
        if (z) {
            ((TransitionDrawable) this.f18195b.getBackground()).reverseTransition(100);
            ((TransitionDrawable) this.f18196c.getBackground()).reverseTransition(100);
            this.f18196c.animate().setListener(new Animator.AnimatorListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18200a;

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationStart(Animator animator) {
                    BarrageView.this.f18198e = true;
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f18200a, false, 14318, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f18200a, false, 14318, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    BarrageView.this.f18198e = false;
                    BarrageView.this.f18196c.setTranslationX(0.0f);
                }
            }).translationXBy(UIUtils.dip2Px(getContext(), 22.0f)).setDuration(100).start();
            return;
        }
        ((TransitionDrawable) this.f18195b.getBackground()).reverseTransition(0);
        ((TransitionDrawable) this.f18196c.getBackground()).reverseTransition(0);
        this.f18196c.setTranslationX(0.0f);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f18194a, false, 14312, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f18194a, false, 14312, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!this.f18197d && !this.f18198e) {
            if (c.a(getContext())) {
                e(z);
            } else {
                c(z);
            }
        }
    }

    public BarrageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public BarrageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    @RequiresApi(api = 21)
    public BarrageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }
}
