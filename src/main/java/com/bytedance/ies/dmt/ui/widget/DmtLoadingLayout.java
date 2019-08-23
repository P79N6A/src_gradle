package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.e;
import com.bytedance.ies.dmt.ui.e.a;
import com.ss.android.ugc.aweme.C0906R;

public class DmtLoadingLayout extends FrameLayout implements e, f {

    /* renamed from: a  reason: collision with root package name */
    private LottieAnimationView f20464a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f20465b;

    /* renamed from: c  reason: collision with root package name */
    private int f20466c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20467d;

    /* renamed from: e  reason: collision with root package name */
    private int f20468e;

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f20464a != null && this.f20464a.isAnimating()) {
            this.f20464a.cancelAnimation();
        }
    }

    private void a() {
        if (this.f20467d) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20465b.getLayoutParams();
            int a2 = ((a.a(getContext()) - this.f20468e) / 2) - (layoutParams.height / 2);
            layoutParams.gravity = 49;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            layoutParams.topMargin = a2 - iArr[1];
            this.f20465b.setLayoutParams(layoutParams);
        }
    }

    public DmtLoadingLayout(@NonNull Context context) {
        this(context, null);
    }

    public void onColorModeChange(int i) {
        if (this.f20466c != i) {
            this.f20466c = i;
        }
    }

    public void setUseScreenHeight(int i) {
        this.f20467d = true;
        this.f20468e = i;
        a();
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20464a.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.f20464a.setLayoutParams(layoutParams);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f20464a != null) {
            if (i == 0) {
                this.f20464a.playAnimation();
                return;
            }
            if (this.f20464a.isAnimating()) {
                this.f20464a.cancelAnimation();
            }
        }
    }

    public DmtLoadingLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtLoadingLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20466c = b.a().f20312a;
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.a5m, this, true);
        this.f20464a = (LottieAnimationView) inflate.findViewById(C0906R.id.c7l);
        this.f20465b = (FrameLayout) inflate.findViewById(C0906R.id.c7m);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
    }
}
