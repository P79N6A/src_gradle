package com.ss.android.ugc.aweme.face2face.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.Observer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.face2face.net.f;
import java.util.ArrayList;
import java.util.List;

public class Face2FaceAvatarWidget implements LifecycleObserver, Observer<List<f>>, View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44124a;

    /* renamed from: b  reason: collision with root package name */
    View f44125b;

    /* renamed from: c  reason: collision with root package name */
    View f44126c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f44127d;

    /* renamed from: e  reason: collision with root package name */
    AnimationImageView f44128e;

    /* renamed from: f  reason: collision with root package name */
    AvatarImageView f44129f;
    public a g;
    private View h;
    private AnimationImageView i;
    private FragmentActivity j;
    private boolean k;
    private List<f> l = new ArrayList();
    private int m = 0;

    public interface a {
        void a();

        void b();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f44124a, false, 39297, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f44124a, false, 39297, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view.getId() == C0906R.id.atu) {
            if (PatchProxy.isSupport(new Object[0], this, f44124a, false, 39300, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44124a, false, 39300, new Class[0], Void.TYPE);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new com.ss.android.ugc.aweme.p.a());
            animatorSet.setDuration(300);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.9f, 1.0f});
            ofFloat.addUpdateListener(new a(this));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 1.2f, 1.0f});
            ofFloat2.addUpdateListener(new b(this));
            animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
            animatorSet.start();
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list}, this, f44124a, false, 39299, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f44124a, false, 39299, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (CollectionUtils.isEmpty(list)) {
            if (PatchProxy.isSupport(new Object[0], this, f44124a, false, 39295, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44124a, false, 39295, new Class[0], Void.TYPE);
            } else {
                if (this.k) {
                    if (PatchProxy.isSupport(new Object[0], this, f44124a, false, 39302, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f44124a, false, 39302, new Class[0], Void.TYPE);
                    } else {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setInterpolator(new com.ss.android.ugc.aweme.p.a());
                        animatorSet.setDuration(300);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f44125b.getTranslationY(), 0.0f});
                        ofFloat.addUpdateListener(new f(this));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.85714287f, 1.0f});
                        ofFloat2.addUpdateListener(new g(this));
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(new int[]{this.j.getResources().getColor(C0906R.color.p), this.j.getResources().getColor(C0906R.color.a7l)});
                        valueAnimator.setEvaluator(new ArgbEvaluator());
                        valueAnimator.addUpdateListener(new h(this));
                        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, valueAnimator});
                        animatorSet.addListener(new AnimatorListenerAdapter() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f44132a;

                            public final void onAnimationStart(Animator animator) {
                                if (PatchProxy.isSupport(new Object[]{animator}, this, f44132a, false, 39312, new Class[]{Animator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animator}, this, f44132a, false, 39312, new Class[]{Animator.class}, Void.TYPE);
                                    return;
                                }
                                super.onAnimationStart(animator);
                                Face2FaceAvatarWidget.this.g.b();
                            }
                        });
                        animatorSet.start();
                    }
                }
                this.k = false;
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f44124a, false, 39294, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44124a, false, 39294, new Class[0], Void.TYPE);
                return;
            }
            if (!this.k) {
                if (PatchProxy.isSupport(new Object[0], this, f44124a, false, 39301, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f44124a, false, 39301, new Class[0], Void.TYPE);
                } else {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setInterpolator(new com.ss.android.ugc.aweme.p.a());
                    animatorSet2.setDuration(300);
                    ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, (this.h.getY() - this.f44125b.getY()) + ((float) this.h.getMeasuredHeight())});
                    ofFloat3.addUpdateListener(new c(this));
                    ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{1.0f, 0.85714287f});
                    ofFloat4.addUpdateListener(new d(this));
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    valueAnimator2.setIntValues(new int[]{this.j.getResources().getColor(C0906R.color.a7l), this.j.getResources().getColor(C0906R.color.p)});
                    valueAnimator2.setEvaluator(new ArgbEvaluator());
                    valueAnimator2.addUpdateListener(new e(this));
                    animatorSet2.playTogether(new Animator[]{ofFloat3, ofFloat4, valueAnimator2});
                    animatorSet2.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f44130a;

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f44130a, false, 39311, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f44130a, false, 39311, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            super.onAnimationEnd(animator);
                            Face2FaceAvatarWidget.this.g.a();
                        }
                    });
                    animatorSet2.start();
                }
            }
            this.k = true;
        }
    }

    public Face2FaceAvatarWidget(@NonNull FragmentActivity fragmentActivity, @NonNull a aVar, @NonNull View view, @NonNull View view2) {
        fragmentActivity.getLifecycle().addObserver(this);
        this.g = aVar;
        this.j = fragmentActivity;
        this.f44125b = view;
        this.h = view2;
        if (PatchProxy.isSupport(new Object[0], this, f44124a, false, 39293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44124a, false, 39293, new Class[0], Void.TYPE);
            return;
        }
        this.f44128e = (AnimationImageView) ViewCompat.requireViewById(this.f44125b, C0906R.id.asu);
        this.i = (AnimationImageView) ViewCompat.requireViewById(this.f44125b, C0906R.id.ast);
        this.f44129f = (AvatarImageView) ViewCompat.requireViewById(this.f44125b, C0906R.id.atu);
        this.f44127d = (TextView) ViewCompat.requireViewById(this.f44125b, C0906R.id.b7v);
        this.f44126c = ViewCompat.requireViewById(this.f44125b, C0906R.id.abi);
        this.f44129f.setOnClickListener(this);
        this.f44128e.loop(true);
        this.i.setVisibility(8);
        this.f44128e.setAnimation("scan_lines_lottie_android_common.json");
        this.f44128e.playAnimation();
        c.b(this.f44129f, d.a().getCurUser().getAvatarMedium());
    }
}
