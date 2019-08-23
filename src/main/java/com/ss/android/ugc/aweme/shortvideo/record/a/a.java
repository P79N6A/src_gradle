package com.ss.android.ugc.aweme.shortvideo.record.a;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.ey;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69048a;

    /* renamed from: b  reason: collision with root package name */
    Context f69049b;

    /* renamed from: c  reason: collision with root package name */
    ViewGroup f69050c;

    /* renamed from: d  reason: collision with root package name */
    View f69051d;

    /* renamed from: e  reason: collision with root package name */
    int f69052e;

    /* renamed from: f  reason: collision with root package name */
    int f69053f;
    int g;
    int h;
    FrameLayout.LayoutParams i;
    public TextView j;
    private int k;
    private int l;
    private int m;

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69048a, false, 78403, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69048a, false, 78403, new Class[0], Void.TYPE);
            return;
        }
        if (this.j == null) {
            this.j = new TextView(this.f69049b);
            this.j.setTextSize(14.0f);
            this.j.setGravity(17);
            this.j.setTextColor(this.f69049b.getResources().getColor(C0906R.color.hx));
            this.f69050c.addView(this.j, new ViewGroup.MarginLayoutParams(-2, -2));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
        marginLayoutParams.width = this.m;
        if (ey.a(this.f69049b)) {
            marginLayoutParams.setMargins(0, this.l, this.k, 0);
        } else {
            marginLayoutParams.setMargins(this.k, this.l, 0, 0);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            marginLayoutParams.setMarginStart(this.k);
        }
        this.j.requestLayout();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69048a, false, 78400, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69048a, false, 78400, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.j != null && this.j.getVisibility() == 0) {
            if (z) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(150);
                alphaAnimation.setAnimationListener(new Animation.AnimationListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f69056a;

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        if (PatchProxy.isSupport(new Object[]{animation}, this, f69056a, false, 78406, new Class[]{Animation.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animation}, this, f69056a, false, 78406, new Class[]{Animation.class}, Void.TYPE);
                            return;
                        }
                        a.this.j.setVisibility(8);
                    }
                });
                this.j.startAnimation(alphaAnimation);
                return;
            }
            this.j.setVisibility(8);
        }
    }

    public a(Context context, ViewGroup viewGroup) {
        this.f69049b = context;
        this.f69050c = viewGroup;
    }

    public final void a(int i2, int i3, int i4) {
        this.k = i2;
        this.l = i3;
        this.m = i4;
    }

    public final void a(int i2, int i3, int i4, int i5, FrameLayout.LayoutParams layoutParams) {
        this.f69052e = i2;
        this.f69053f = i3;
        this.g = i4;
        this.h = i5;
        this.i = layoutParams;
    }
}
