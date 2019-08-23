package com.ss.android.ugc.aweme.translation.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class TranslationStatusView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74982a;

    /* renamed from: b  reason: collision with root package name */
    public DmtTextView f74983b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f74984c;

    /* renamed from: d  reason: collision with root package name */
    public b f74985d;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f74986e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f74987f;
    private a g;
    private ImageView h;
    private DmtTextView i;
    private int j;

    public interface a {
        void a(int i);
    }

    public interface b {
        void a(View view);

        void a(View view, boolean z);
    }

    public a getmUploadMobListener() {
        return this.g;
    }

    private FrameLayout.LayoutParams d() {
        if (PatchProxy.isSupport(new Object[0], this, f74982a, false, 87310, new Class[0], FrameLayout.LayoutParams.class)) {
            return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f74982a, false, 87310, new Class[0], FrameLayout.LayoutParams.class);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74982a, false, 87312, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74982a, false, 87312, new Class[0], Void.TYPE);
            return;
        }
        this.j = 0;
        this.f74983b.setAlpha(1.0f);
        this.f74983b.setVisibility(0);
        this.f74984c.setVisibility(8);
        this.f74987f.setVisibility(8);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f74982a, false, 87311, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74982a, false, 87311, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f74986e.cancel();
    }

    private DmtTextView c() {
        if (PatchProxy.isSupport(new Object[0], this, f74982a, false, 87309, new Class[0], DmtTextView.class)) {
            return (DmtTextView) PatchProxy.accessDispatch(new Object[0], this, f74982a, false, 87309, new Class[0], DmtTextView.class);
        }
        DmtTextView dmtTextView = new DmtTextView(getContext());
        dmtTextView.setTextSize(13.0f);
        dmtTextView.getPaint().setFakeBoldText(true);
        dmtTextView.setTextColor(getContext().getResources().getColor(C0906R.color.hx));
        return dmtTextView;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74982a, false, 87305, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74982a, false, 87305, new Class[0], Void.TYPE);
            return;
        }
        this.f74983b.getPaint().setFakeBoldText(false);
        this.f74987f.getPaint().setFakeBoldText(false);
        this.i.getPaint().setFakeBoldText(false);
    }

    public void setOnTranslationViewClickListener(b bVar) {
        this.f74985d = bVar;
    }

    public void setmUploadMobListener(a aVar) {
        this.g = aVar;
    }

    public TranslationStatusView(@NonNull Context context) {
        this(context, null);
    }

    private View a(int i2) {
        DmtTextView dmtTextView = this.f74983b;
        switch (i2) {
            case 0:
                return this.f74983b;
            case 1:
                return this.f74984c;
            case 2:
                return this.f74987f;
            default:
                return dmtTextView;
        }
    }

    public void setLoadingDrawable(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74982a, false, 87304, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74982a, false, 87304, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h.setImageResource(i2);
    }

    public void setStatusWithoutAnim(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74982a, false, 87307, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74982a, false, 87307, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.j != i2) {
            View a2 = a(this.j);
            View a3 = a(i2);
            a2.setVisibility(8);
            a3.setVisibility(0);
            a3.setAlpha(1.0f);
            this.j = i2;
            if (this.g != null) {
                this.g.a(this.j);
            }
        }
    }

    public void setTextColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74982a, false, 87303, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74982a, false, 87303, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i.setTextColor(getContext().getResources().getColor(i2));
        this.f74983b.setTextColor(getContext().getResources().getColor(i2));
        this.f74987f.setTextColor(getContext().getResources().getColor(i2));
    }

    public void setStatus(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74982a, false, 87306, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74982a, false, 87306, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a(i2);
        }
        if (this.j != i2) {
            final View a2 = a(this.j);
            final View a3 = a(i2);
            if (PatchProxy.isSupport(new Object[]{a2, a3}, this, f74982a, false, 87308, new Class[]{View.class, View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{a2, a3}, this, f74982a, false, 87308, new Class[]{View.class, View.class}, Void.TYPE);
            } else {
                ObjectAnimator duration = ObjectAnimator.ofFloat(a2, "alpha", new float[]{0.0f}).setDuration(150);
                duration.setInterpolator(new LinearInterpolator());
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(a3, "alpha", new float[]{0.0f, 1.0f}).setDuration(150);
                duration2.setInterpolator(new LinearInterpolator());
                duration.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f74992a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f74992a, false, 87315, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f74992a, false, 87315, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        a2.setVisibility(8);
                        a3.setVisibility(0);
                        if (a2 == TranslationStatusView.this.f74984c) {
                            TranslationStatusView.this.f74986e.cancel();
                        }
                        if (a3 == TranslationStatusView.this.f74984c) {
                            TranslationStatusView.this.f74986e.start();
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(new Animator[]{duration, duration2});
                animatorSet.start();
            }
            this.j = i2;
        }
    }

    public TranslationStatusView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TranslationStatusView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (PatchProxy.isSupport(new Object[0], this, f74982a, false, 87298, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74982a, false, 87298, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f74982a, false, 87300, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74982a, false, 87300, new Class[0], Void.TYPE);
        } else {
            this.f74983b = c();
            this.f74983b.setText(C0906R.string.c3j);
            this.f74983b.setLayoutParams(d());
            this.f74983b.setGravity(16);
            com.bytedance.ies.dmt.ui.e.b.a(this.f74983b);
            this.f74983b.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74988a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f74988a, false, 87313, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f74988a, false, 87313, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    TranslationStatusView.this.setStatus(1);
                    if (TranslationStatusView.this.f74985d != null) {
                        TranslationStatusView.this.f74985d.a(view, false);
                    }
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f74982a, false, 87301, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74982a, false, 87301, new Class[0], Void.TYPE);
        } else {
            this.f74984c = new LinearLayout(getContext());
            this.f74984c.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
            this.f74984c.setOrientation(0);
            this.h = new ImageView(getContext());
            this.h.setImageResource(2130839404);
            this.f74986e = ObjectAnimator.ofFloat(this.h, "rotation", new float[]{0.0f, 360.0f}).setDuration(800);
            this.f74986e.setInterpolator(new LinearInterpolator());
            this.f74986e.setRepeatCount(-1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            this.h.setLayoutParams(layoutParams);
            this.f74984c.addView(this.h);
            this.i = c();
            this.i.setText(C0906R.string.i3);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = (int) UIUtils.dip2Px(getContext(), 6.0f);
            layoutParams2.gravity = 16;
            this.i.setLayoutParams(layoutParams2);
            this.f74984c.addView(this.i);
        }
        if (PatchProxy.isSupport(new Object[0], this, f74982a, false, 87302, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74982a, false, 87302, new Class[0], Void.TYPE);
        } else {
            this.f74987f = c();
            this.f74987f.setText(C0906R.string.c3h);
            this.f74987f.setLayoutParams(d());
            this.f74987f.setGravity(16);
            com.bytedance.ies.dmt.ui.e.b.a(this.f74987f);
            this.f74987f.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74990a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f74990a, false, 87314, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f74990a, false, 87314, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    TranslationStatusView.this.setStatus(0);
                    if (TranslationStatusView.this.f74985d != null) {
                        TranslationStatusView.this.f74985d.a(view);
                    }
                }
            });
        }
        b();
        addView(this.f74987f);
        addView(this.f74984c);
        addView(this.f74983b);
    }
}
