package com.ss.android.ugc.aweme.base.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.util.an;
import com.ss.android.ugc.aweme.shortvideo.util.aq;
import com.ss.android.ugc.aweme.utils.bg;
import org.greenrobot.eventbus.Subscribe;

public class PoiCardWebPageContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2781a = null;

    /* renamed from: f */
    public static final int bzf = 2131168893;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2782b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f2783c;

    /* renamed from: d  reason: collision with root package name */
    public FragmentManager f2784d;

    /* renamed from: e  reason: collision with root package name */
    public PoiCardWebPageFragment f2785e;
    private View[] g;

    private PoiCardWebPageFragment getFragment() {
        if (PatchProxy.isSupport(new Object[0], this, f2781a, false, 25095, new Class[0], PoiCardWebPageFragment.class)) {
            return (PoiCardWebPageFragment) PatchProxy.accessDispatch(new Object[0], this, f2781a, false, 25095, new Class[0], PoiCardWebPageFragment.class);
        }
        Fragment findFragmentById = this.f2784d.findFragmentById(bzf);
        if (findFragmentById == null || !(findFragmentById instanceof PoiCardWebPageFragment)) {
            return null;
        }
        return (PoiCardWebPageFragment) findFragmentById;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2781a, false, 25093, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2781a, false, 25093, new Class[0], Void.TYPE);
            return;
        }
        bg.d(this);
        this.f2782b = false;
        if (this.f2784d == null || getFragment() == null) {
            removeAllViews();
            return;
        }
        FragmentTransaction beginTransaction = this.f2784d.beginTransaction();
        beginTransaction.remove(getFragment());
        beginTransaction.commitAllowingStateLoss();
        if (this.f2784d.getBackStackEntryCount() > 0 && !this.f2784d.isStateSaved()) {
            this.f2784d.popBackStack();
        }
        removeAllViews();
    }

    public PoiCardWebPageContainer(@NonNull Context context) {
        this(context, null);
    }

    @Subscribe
    public void onEvent(AbsAdCardAction.d dVar) {
        switch (dVar.f40018a) {
            case 0:
                this.f2782b = false;
                return;
            case 1:
                this.f2782b = true;
                return;
            default:
                this.f2782b = false;
                return;
        }
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f2781a, false, 25088, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f2781a, false, 25088, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (getTranslationX() < 0.0f || j == 0) {
            if (this.g != null) {
                for (View translationX : this.g) {
                    translationX.setTranslationX(0.0f);
                }
            }
            setTranslationX(UIUtils.dip2Px(getContext(), (float) (-(getWidth() + ((ViewGroup.MarginLayoutParams) getLayoutParams()).leftMargin))));
            setAlpha(0.0f);
            a();
        } else {
            a(j, getTranslationX(), UIUtils.dip2Px(getContext(), (float) (-(getWidth() + ((ViewGroup.MarginLayoutParams) getLayoutParams()).leftMargin))), 0.0f, 0.0f, new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34977a;

                public final void onAnimationCancel(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f34977a, false, 25099, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f34977a, false, 25099, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    PoiCardWebPageContainer.this.a();
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f34977a, false, 25098, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f34977a, false, 25098, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    PoiCardWebPageContainer.this.a();
                }
            });
            animate().alpha(0.0f).setDuration(j).start();
            a(false, this.g);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2781a, false, 25092, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2781a, false, 25092, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            an.a(this, getAlpha(), 0.0f);
        } else {
            an.a(this, getAlpha(), 1.0f);
        }
    }

    public PoiCardWebPageContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(boolean z, View... viewArr) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), viewArr}, this, f2781a, false, 25091, new Class[]{Boolean.TYPE, View[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), viewArr}, this, f2781a, false, 25091, new Class[]{Boolean.TYPE, View[].class}, Void.TYPE);
        } else if (viewArr != null && viewArr.length != 0 && this.f2782b) {
            this.g = viewArr;
            if (z) {
                int length = viewArr.length;
                while (i < length) {
                    View view = viewArr[i];
                    aq.a(view, 0.0f, (float) aq.a(getContext(), view), 400);
                    i++;
                }
                return;
            }
            int length2 = viewArr.length;
            while (i < length2) {
                View view2 = viewArr[i];
                aq.a(view2, view2.getTranslationX(), 0.0f, 400);
                i++;
            }
        }
    }

    public PoiCardWebPageContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void a(long j, float f2, float f3, float f4, float f5, Animator.AnimatorListener animatorListener) {
        long j2 = j;
        Animator.AnimatorListener animatorListener2 = animatorListener;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(0.0f), Float.valueOf(0.0f), animatorListener2}, this, f2781a, false, 25090, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Animator.AnimatorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(0.0f), Float.valueOf(0.0f), animatorListener2}, this, f2781a, false, 25090, new Class[]{Long.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Animator.AnimatorListener.class}, Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationX", new float[]{f2, f3});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "translationY", new float[]{0.0f, 0.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(j2);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.addListener(animatorListener2);
        animatorSet.start();
    }
}
