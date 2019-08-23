package com.bytedance.ies.dmt.ui.d;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.common.utility.UIUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.g.a;

public final class c extends PopupWindow {

    /* renamed from: e  reason: collision with root package name */
    private static int f20336e;

    /* renamed from: a  reason: collision with root package name */
    public RelativeLayout f20337a;

    /* renamed from: b  reason: collision with root package name */
    private Context f20338b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f20339c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f20340d;

    /* renamed from: f  reason: collision with root package name */
    private int f20341f;
    private int g;
    private View h = ((LayoutInflater) this.f20338b.getSystemService("layout_inflater")).inflate(C0906R.layout.a9m, null);

    private boolean b() {
        if (this.g == 1) {
            return true;
        }
        return false;
    }

    private boolean a() {
        if (this.f20338b == null || !(this.f20338b instanceof Activity)) {
            return false;
        }
        return true;
    }

    public final void dismiss() {
        try {
            if (a.a()) {
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    throw new IllegalStateException("debug check! this method should be called from main thread!");
                }
            }
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    private void c() {
        int i;
        try {
            if (this.f20338b != null && !isShowing()) {
                this.f20337a.setAlpha(0.0f);
                View decorView = ((Activity) this.f20338b).getWindow().getDecorView();
                if (b()) {
                    i = f20336e;
                } else {
                    i = (int) UIUtils.dip2Px(this.f20338b, 35.0f);
                }
                showAtLocation(decorView, 48, 0, i + UIUtils.getStatusBarHeight(this.f20338b));
                a(true);
                int i2 = 2000;
                if (this.f20341f == 0) {
                    i2 = 1500;
                }
                new Handler().postDelayed(new Runnable() {
                    public final void run() {
                        c.this.a(false);
                        new Handler().postDelayed(new Runnable() {
                            public final void run() {
                                c.this.dismiss();
                            }
                        }, 1500);
                    }
                }, (long) i2);
            }
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z) {
        b(z);
    }

    public static c a(Context context) {
        return new c(context);
    }

    private void a(int i) {
        f20336e = ((int) UIUtils.dip2Px(this.f20338b, 52.0f)) + i;
    }

    private void b(final boolean z) {
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                int i;
                float f2;
                final int height = c.this.f20337a.getHeight();
                if (z) {
                    i = 250;
                } else {
                    i = 150;
                }
                RelativeLayout relativeLayout = c.this.f20337a;
                float[] fArr = new float[2];
                float f3 = 1.0f;
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                fArr[0] = f2;
                if (!z) {
                    f3 = 0.0f;
                }
                fArr[1] = f3;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "alpha", fArr);
                ofFloat.setDuration((long) i);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int i;
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        if (z) {
                            i = (int) (-(((float) height) - (((float) height) * animatedFraction)));
                        } else {
                            i = -((int) (((float) height) * animatedFraction));
                        }
                        c.this.f20337a.setTranslationY((float) i);
                    }
                });
                ofFloat.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
                ofFloat.start();
            }
        }, 5);
    }

    private c(Context context) {
        super(context);
        this.f20338b = context;
        if (a()) {
            setContentView(this.h);
            setWidth(UIUtils.getScreenWidth(this.f20338b));
            setHeight(-2);
            setBackgroundDrawable(new ColorDrawable(this.f20338b.getResources().getColor(C0906R.color.ano)));
            setFocusable(false);
            setOutsideTouchable(true);
            setTouchable(false);
            setAnimationStyle(C0906R.style.r8);
            update();
        }
        View view = this.h;
        if (view != null) {
            this.f20337a = (RelativeLayout) view.findViewById(C0906R.id.cgb);
            this.f20339c = (ImageView) view.findViewById(C0906R.id.b2_);
            this.f20340d = (TextView) view.findViewById(C0906R.id.da0);
        }
    }

    private void a(String str, int i) {
        int i2;
        if (g.a().a(str)) {
            this.f20340d.setText(str);
            this.f20341f = i;
            int dip2Px = (int) UIUtils.dip2Px(this.f20338b, 16.0f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20337a.getLayoutParams();
            if (!b()) {
                layoutParams.setMargins(dip2Px, f20336e - ((int) UIUtils.dip2Px(this.f20338b, 35.0f)), dip2Px, 0);
            } else {
                layoutParams.setMargins(0, 0, 0, 0);
            }
            if (a()) {
                c();
                return;
            }
            this.f20337a.setAlpha(1.0f);
            Toast toast = new Toast(this.f20338b);
            toast.setDuration(0);
            if (b()) {
                i2 = f20336e;
            } else {
                i2 = 0;
            }
            toast.setGravity(55, 0, i2);
            toast.setView(this.h);
            d.a(toast);
        }
    }

    public final c a(String str, int i, int i2, int i3) {
        this.g = i2;
        a(i3);
        if (b()) {
            this.f20337a.setBackgroundColor(this.f20338b.getResources().getColor(C0906R.color.anm));
        } else {
            this.f20337a.setBackgroundResource(2130841621);
        }
        this.f20339c.setImageResource(2130841641);
        a(str, i);
        return this;
    }

    public final c b(String str, int i, int i2, int i3) {
        this.g = i2;
        a(i3);
        if (b()) {
            this.f20337a.setBackgroundColor(this.f20338b.getResources().getColor(C0906R.color.anl));
        } else {
            this.f20337a.setBackgroundResource(2130841620);
        }
        this.f20339c.setImageResource(2130841642);
        a(str, i);
        return this;
    }

    public final c c(String str, int i, int i2, int i3) {
        this.g = i2;
        a(i3);
        if (b()) {
            this.f20337a.setBackgroundColor(this.f20338b.getResources().getColor(C0906R.color.ank));
        } else {
            this.f20337a.setBackgroundResource(2130841619);
        }
        this.f20339c.setVisibility(8);
        a(str, i);
        return this;
    }
}
