package com.ss.android.ugc.aweme.main.base.tab;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.main.base.b;

public final class l extends b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f54508c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f54509d;

    /* renamed from: e  reason: collision with root package name */
    public View f54510e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f54511f;
    private ImageView g;
    private int h;
    private View i;
    private RelativeLayout j;
    private RelativeLayout k;
    private TextView l;
    private boolean m;
    private final int n;
    private final int o;

    public final TextView getTabTitle() {
        return this.f54509d;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f54508c, false, 57902, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54508c, false, 57902, new Class[0], Void.TYPE);
            return;
        }
        this.g.setVisibility(0);
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f54508c, false, 57903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54508c, false, 57903, new Class[0], Void.TYPE);
            return;
        }
        this.g.setVisibility(8);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f54508c, false, 57896, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54508c, false, 57896, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54544a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54544a, false, 57918, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54544a, false, 57918, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                l.this.f54510e.setTranslationY(((float) l.this.f54510e.getHeight()) * ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f54508c, false, 57897, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54508c, false, 57897, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54514a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54514a, false, 57919, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54514a, false, 57919, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue <= 0.66f) {
                    float f2 = ((floatValue / 0.66f) * 0.04f) + 1.0f;
                    l.this.f54509d.setScaleX(f2);
                    l.this.f54509d.setScaleY(f2);
                } else {
                    float f3 = 1.04f - (((floatValue - 0.66f) / 0.33f) * 0.04f);
                    l.this.f54509d.setScaleX(f3);
                    l.this.f54509d.setScaleY(f3);
                }
                l.this.f54509d.setAlpha((0.4f * floatValue) + 0.6f);
                l.this.f54510e.setTranslationY(((float) l.this.f54510e.getHeight()) - (floatValue * ((float) l.this.f54510e.getHeight())));
            }
        });
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f54508c, false, 57898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54508c, false, 57898, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54516a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54516a, false, 57920, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54516a, false, 57920, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                l.this.f54510e.setTranslationY(((float) l.this.f54510e.getHeight()) - (((Float) valueAnimator.getAnimatedValue()).floatValue() * ((float) l.this.f54510e.getHeight())));
            }
        });
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f54508c, false, 57901, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54508c, false, 57901, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(200);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54534a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54534a, false, 57913, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54534a, false, 57913, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float floatValue = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l.this.f54511f.setScaleX(floatValue);
                l.this.f54511f.setScaleY(floatValue);
                l.this.f54511f.setAlpha(floatValue);
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54536a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f54536a, false, 57914, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f54536a, false, 57914, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                l.this.f54511f.setVisibility(4);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(200);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54538a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54538a, false, 57915, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54538a, false, 57915, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l.this.f54509d.setScaleX(floatValue);
                l.this.f54509d.setScaleY(floatValue);
                if (!l.this.isSelected()) {
                    l.this.f54509d.setAlpha(floatValue * 0.6f);
                } else {
                    l.this.f54509d.setAlpha(floatValue);
                }
            }
        });
        ofFloat2.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54540a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f54540a, false, 57916, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f54540a, false, 57916, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                l.this.f54509d.setVisibility(0);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).before(ofFloat2);
        animatorSet.start();
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f54508c, false, 57904, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54508c, false, 57904, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54542a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54542a, false, 57917, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54542a, false, 57917, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue <= 0.66f) {
                    float f2 = ((floatValue / 0.66f) * 0.04f) + 1.0f;
                    l.this.f54511f.setScaleX(f2);
                    l.this.f54511f.setScaleY(f2);
                    return;
                }
                float f3 = 1.04f - (((floatValue - 0.66f) / 0.33f) * 0.04f);
                l.this.f54511f.setScaleX(f3);
                l.this.f54511f.setScaleY(f3);
            }
        });
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f54508c, false, 57895, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54508c, false, 57895, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54512a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54512a, false, 57910, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54512a, false, 57910, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l.this.f54509d.setAlpha(1.0f - (0.4f * floatValue));
                l.this.f54510e.setTranslationY(((float) l.this.f54510e.getHeight()) * floatValue);
            }
        });
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f54508c, false, 57899, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54508c, false, 57899, new Class[0], Void.TYPE);
        } else if (this.m) {
            if (PatchProxy.isSupport(new Object[0], this, f54508c, false, 57900, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54508c, false, 57900, new Class[0], Void.TYPE);
            } else {
                this.f54509d.setVisibility(8);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f54511f, "scaleX", new float[]{0.0f, 1.0f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f54511f, "scaleY", new float[]{0.0f, 1.0f});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f54511f, "alpha", new float[]{0.0f, 1.0f});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
                animatorSet.setDuration(100);
                animatorSet.start();
                this.f54511f.setVisibility(0);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f54511f, "scaleX", new float[]{1.0f, 0.8f, 1.0f});
            ofFloat4.setDuration(200);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f54511f, "scaleY", new float[]{1.0f, 0.8f, 1.0f});
            ofFloat5.setDuration(200);
            final ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f54511f, "rotation", new float[]{0.0f, -360.0f});
            ofFloat6.setDuration(650);
            ofFloat6.setRepeatMode(1);
            ofFloat6.setRepeatCount(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            ofFloat6.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54518a;

                public final void onAnimationRepeat(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f54518a, false, 57921, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f54518a, false, 57921, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    super.onAnimationRepeat(animator);
                    if (!l.this.f54425b) {
                        ofFloat6.setRepeatCount(0);
                    }
                }
            });
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ofFloat4).with(ofFloat5);
            animatorSet2.start();
            animatorSet2.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54521a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f54521a, false, 57922, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f54521a, false, 57922, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    super.onAnimationEnd(animator);
                    ofFloat6.start();
                }
            });
        } else {
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f54511f, "rotation", new float[]{0.0f, -360.0f});
            ofFloat7.setDuration(500);
            ofFloat7.setRepeatCount(-1);
            ofFloat7.setRepeatMode(1);
            ofFloat7.setInterpolator(new LinearInterpolator());
            ofFloat7.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54524a;

                public final void onAnimationStart(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f54524a, false, 57923, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f54524a, false, 57923, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    l.this.f54511f.setPivotY((float) (l.this.f54511f.getHeight() / 2));
                    l.this.f54511f.setPivotX((float) (l.this.f54511f.getWidth() / 2));
                    l.this.f54511f.setAlpha(0.0f);
                    l.this.f54511f.setRotation(0.0f);
                    l.this.f54511f.setVisibility(0);
                }
            });
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat8.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54526a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54526a, false, 57924, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54526a, false, 57924, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue < 0.6f) {
                        float f2 = ((floatValue / 0.6f) * 0.04f) + 1.0f;
                        l.this.f54509d.setScaleX(f2);
                        l.this.f54509d.setScaleY(f2);
                        return;
                    }
                    float f3 = (floatValue - 0.6f) / 0.4f;
                    float f4 = 1.04f - (f3 * 1.04f);
                    l.this.f54509d.setScaleX(f4);
                    l.this.f54509d.setScaleY(f4);
                    l.this.f54509d.setAlpha(1.0f - f3);
                }
            });
            ofFloat8.setDuration(150);
            ofFloat8.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54528a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f54528a, false, 57925, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f54528a, false, 57925, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    l.this.f54509d.setVisibility(4);
                }
            });
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat9.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54530a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54530a, false, 57911, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54530a, false, 57911, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (floatValue <= 0.6f) {
                        float f2 = floatValue / 0.6f;
                        float f3 = 1.04f * f2;
                        l.this.f54511f.setScaleX(f3);
                        l.this.f54511f.setScaleY(f3);
                        l.this.f54511f.setAlpha(f2);
                        return;
                    }
                    float f4 = 1.04f - ((floatValue - 1.5f) * 0.04f);
                    l.this.f54511f.setScaleX(f4);
                    l.this.f54511f.setScaleY(f4);
                }
            });
            ofFloat9.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54532a;

                public final void onAnimationStart(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f54532a, false, 57912, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f54532a, false, 57912, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    l.this.f54511f.setVisibility(0);
                }
            });
            ofFloat9.setDuration(150);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.play(ofFloat8).with(ofFloat7);
            animatorSet3.play(ofFloat8).before(ofFloat9);
            animatorSet3.start();
        }
    }

    private int b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f54508c, false, 57908, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f54508c, false, 57908, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        String string = getContext().getResources().getString(i2);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(UIUtils.dip2Px(getContext(), 16.0f));
        return (int) textPaint.measureText(string);
    }

    public final void a(int i2) {
        String valueOf;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f54508c, false, 57905, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f54508c, false, 57905, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(getTabType(), "NOTIFICATION") || TextUtils.equals(getTabType(), "FOLLOW")) {
            if (i2 <= 0) {
                this.l.setVisibility(4);
                return;
            }
            this.l.setVisibility(0);
            this.g.setVisibility(8);
            if (i2 > 99) {
                valueOf = "99+";
            } else {
                valueOf = String.valueOf(i2);
            }
            String str = valueOf;
            TextView textView = this.l;
            if (PatchProxy.isSupport(new Object[]{textView, str}, this, f54508c, false, 57906, new Class[]{TextView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textView, str}, this, f54508c, false, 57906, new Class[]{TextView.class, String.class}, Void.TYPE);
            } else {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(textView.getTextSize());
                layoutParams.width = Math.max(((int) (textPaint.measureText(str) + ((float) textView.getPaddingLeft()) + ((float) textView.getPaddingRight()))) + 2, textView.getMinWidth());
                textView.setLayoutParams(layoutParams);
            }
            this.l.setText(str);
        }
    }

    public l(@NonNull Context context, String str) {
        this(context, str, false);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(@android.support.annotation.NonNull android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11)
            r11 = 15
            r9.n = r11
            r11 = 10
            r9.o = r11
            r9.m = r12
            r11 = 1
            r12 = 2131690693(0x7f0f04c5, float:1.9010437E38)
            android.view.View r10 = com.bytedance.ies.x2c.d.a(r10, r12, r9, r11)
            r9.i = r10
            android.view.View r10 = r9.i
            r12 = 2131170251(0x7f0713cb, float:1.7954855E38)
            android.view.View r10 = r10.findViewById(r12)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.f54509d = r10
            android.view.View r10 = r9.i
            r12 = 2131166143(0x7f0703bf, float:1.7946523E38)
            android.view.View r10 = r10.findViewById(r12)
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            r9.k = r10
            android.view.View r10 = r9.i
            r12 = 2131170246(0x7f0713c6, float:1.7954845E38)
            android.view.View r10 = r10.findViewById(r12)
            android.widget.RelativeLayout r10 = (android.widget.RelativeLayout) r10
            r9.j = r10
            android.view.View r10 = r9.i
            r12 = 2131170235(0x7f0713bb, float:1.7954823E38)
            android.view.View r10 = r10.findViewById(r12)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r9.l = r10
            android.view.View r10 = r9.i
            r12 = 2131170234(0x7f0713ba, float:1.795482E38)
            android.view.View r10 = r10.findViewById(r12)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r9.g = r10
            android.view.View r10 = r9.i
            r12 = 2131170244(0x7f0713c4, float:1.795484E38)
            android.view.View r10 = r10.findViewById(r12)
            r9.f54510e = r10
            android.view.View r10 = r9.i
            r12 = 2131170245(0x7f0713c5, float:1.7954843E38)
            android.view.View r10 = r10.findViewById(r12)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r9.f54511f = r10
            com.ss.android.ugc.aweme.setting.AbTestManager r10 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Integer r10 = r10.G()
            int r10 = r10.intValue()
            r9.h = r10
            r10 = 0
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f54508c
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 57893(0xe225, float:8.1125E-41)
            r1 = r9
            boolean r12 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r12 == 0) goto L_0x00a3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f54508c
            r3 = 0
            r4 = 57893(0xe225, float:8.1125E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00ad
        L_0x00a3:
            android.widget.TextView r12 = r9.l
            r12.setClickable(r10)
            android.widget.TextView r12 = r9.l
            r12.setLines(r11)
        L_0x00ad:
            android.view.View r12 = r9.f54510e
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            android.view.View r0 = r9.f54510e
            boolean r1 = com.ss.android.ugc.aweme.profile.a.d()
            r2 = 8
            if (r1 == 0) goto L_0x00c0
            r1 = 8
            goto L_0x00c1
        L_0x00c0:
            r1 = 0
        L_0x00c1:
            com.ss.android.ugc.aweme.base.utils.v.a((android.view.View) r0, (int) r1)
            java.lang.String r0 = r9.getTabType()
            r1 = -1
            int r3 = r0.hashCode()
            r4 = 2
            switch(r3) {
                case -1382453013: goto L_0x00fa;
                case 2223327: goto L_0x00f0;
                case 2614219: goto L_0x00e6;
                case 482617583: goto L_0x00dc;
                case 2079338417: goto L_0x00d2;
                default: goto L_0x00d1;
            }
        L_0x00d1:
            goto L_0x0104
        L_0x00d2:
            java.lang.String r3 = "FOLLOW"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0104
            r0 = 1
            goto L_0x0105
        L_0x00dc:
            java.lang.String r3 = "PUBLISH"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0104
            r0 = 4
            goto L_0x0105
        L_0x00e6:
            java.lang.String r3 = "USER"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0104
            r0 = 3
            goto L_0x0105
        L_0x00f0:
            java.lang.String r3 = "HOME"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0104
            r0 = 0
            goto L_0x0105
        L_0x00fa:
            java.lang.String r3 = "NOTIFICATION"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0104
            r0 = 2
            goto L_0x0105
        L_0x0104:
            r0 = -1
        L_0x0105:
            r1 = 2131559641(0x7f0d04d9, float:1.8744632E38)
            switch(r0) {
                case 0: goto L_0x023b;
                case 1: goto L_0x01cd;
                case 2: goto L_0x01bd;
                case 3: goto L_0x01ad;
                case 4: goto L_0x010d;
                default: goto L_0x010b;
            }
        L_0x010b:
            goto L_0x0263
        L_0x010d:
            android.view.View r11 = r9.f54510e
            r11.setVisibility(r2)
            android.widget.TextView r11 = r9.f54509d
            r11.setVisibility(r2)
            android.widget.ImageView r11 = r9.f54511f
            r11.setVisibility(r10)
            android.widget.ImageView r11 = r9.f54511f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r1 = 0
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.main.base.tab.k.f54507a
            r3 = 1
            r4 = 57892(0xe224, float:8.1124E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0149
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r2 = 0
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.main.base.tab.k.f54507a
            r4 = 1
            r5 = 57892(0xe224, float:8.1124E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class r7 = java.lang.Integer.TYPE
            java.lang.Object r10 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            goto L_0x0198
        L_0x0149:
            com.ss.android.ugc.aweme.setting.AbTestManager r7 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r0 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r0)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r3 = 0
            r4 = 72026(0x1195a, float:1.0093E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r7
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x017d
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r3 = 0
            r4 = 72026(0x1195a, float:1.0093E-40)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r7
            java.lang.Object r10 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            goto L_0x0186
        L_0x017d:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r7.d()
            if (r0 != 0) goto L_0x0184
            goto L_0x0186
        L_0x0184:
            int r10 = r0.homeShotIcon
        L_0x0186:
            switch(r10) {
                case 1: goto L_0x0195;
                case 2: goto L_0x0191;
                case 3: goto L_0x018d;
                default: goto L_0x0189;
            }
        L_0x0189:
            r10 = 2130838981(0x7f0205c5, float:1.728296E38)
            goto L_0x0198
        L_0x018d:
            r10 = 2130838984(0x7f0205c8, float:1.7282966E38)
            goto L_0x0198
        L_0x0191:
            r10 = 2130838983(0x7f0205c7, float:1.7282964E38)
            goto L_0x0198
        L_0x0195:
            r10 = 2130838982(0x7f0205c6, float:1.7282962E38)
        L_0x0198:
            r11.setImageResource(r10)
            android.widget.ImageView r10 = r9.f54511f
            android.content.res.Resources r11 = r9.getResources()
            r0 = 2131562437(0x7f0d0fc5, float:1.8750303E38)
            java.lang.String r11 = r11.getString(r0)
            r10.setContentDescription(r11)
            goto L_0x0263
        L_0x01ad:
            android.widget.TextView r10 = r9.f54509d
            r11 = 2131561844(0x7f0d0d74, float:1.87491E38)
            r10.setText(r11)
            int r10 = r9.b(r11)
            r12.width = r10
            goto L_0x0263
        L_0x01bd:
            android.widget.TextView r10 = r9.f54509d
            r11 = 2131561517(0x7f0d0c2d, float:1.8748437E38)
            r10.setText(r11)
            int r10 = r9.b(r11)
            r12.width = r10
            goto L_0x0263
        L_0x01cd:
            int r0 = r9.h
            if (r0 != r4) goto L_0x022f
            com.ss.android.ugc.aweme.y.a r0 = com.ss.android.ugc.aweme.y.a.a()
            java.lang.String r0 = r0.c()
            android.widget.TextView r1 = r9.f54509d
            r1.setText(r0)
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f54508c
            r5 = 0
            r6 = 57909(0xe235, float:8.1148E-41)
            java.lang.Class[] r7 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r7[r10] = r1
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r1 == 0) goto L_0x0215
            java.lang.Object[] r2 = new java.lang.Object[r11]
            r2[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f54508c
            r5 = 0
            r6 = 57909(0xe235, float:8.1148E-41)
            java.lang.Class[] r7 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r7[r10] = r11
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = r9
            java.lang.Object r10 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            goto L_0x022c
        L_0x0215:
            android.text.TextPaint r10 = new android.text.TextPaint
            r10.<init>()
            android.content.Context r11 = r9.getContext()
            r1 = 1098907648(0x41800000, float:16.0)
            float r11 = com.bytedance.common.utility.UIUtils.dip2Px(r11, r1)
            r10.setTextSize(r11)
            float r10 = r10.measureText(r0)
            int r10 = (int) r10
        L_0x022c:
            r12.width = r10
            goto L_0x0263
        L_0x022f:
            android.widget.TextView r10 = r9.f54509d
            r10.setText(r1)
            int r10 = r9.b(r1)
            r12.width = r10
            goto L_0x0263
        L_0x023b:
            com.ss.android.ugc.aweme.setting.AbTestManager r10 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Integer r10 = r10.H()
            int r10 = r10.intValue()
            if (r10 != r11) goto L_0x0255
            android.widget.TextView r10 = r9.f54509d
            r10.setText(r1)
            int r10 = r9.b(r1)
            r12.width = r10
            goto L_0x0263
        L_0x0255:
            android.widget.TextView r10 = r9.f54509d
            r11 = 2131561139(0x7f0d0ab3, float:1.874767E38)
            r10.setText(r11)
            int r10 = r9.b(r11)
            r12.width = r10
        L_0x0263:
            if (r12 == 0) goto L_0x026a
            android.view.View r10 = r9.f54510e
            r10.setLayoutParams(r12)
        L_0x026a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.base.tab.l.<init>(android.content.Context, java.lang.String, boolean):void");
    }
}
