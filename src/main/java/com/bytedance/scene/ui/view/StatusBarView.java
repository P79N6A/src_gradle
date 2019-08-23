package com.bytedance.scene.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.ss.android.ugc.aweme.C0906R;

public class StatusBarView extends View {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f22223b = {C0906R.attr.eq};

    /* renamed from: a  reason: collision with root package name */
    public WindowInsetsCompat f22224a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22225c = true;

    /* renamed from: d  reason: collision with root package name */
    private Drawable f22226d;

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f22226d;
    }

    /* JADX INFO: finally extract failed */
    private void a() {
        ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener() {
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                StatusBarView.this.f22224a = new WindowInsetsCompat(windowInsetsCompat);
                StatusBarView.this.requestLayout();
                return new WindowInsetsCompat(windowInsetsCompat);
            }
        });
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(f22223b);
        try {
            this.f22226d = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            ViewCompat.setElevation(this, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f22226d = drawable;
        invalidate();
    }

    public StatusBarView(Context context) {
        super(context);
        a();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        this.f22226d = new ColorDrawable(i);
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = ContextCompat.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        this.f22226d = drawable;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.f22225c && this.f22226d != null) {
            if (Build.VERSION.SDK_INT < 21 || this.f22224a == null) {
                i = 0;
            } else {
                i = this.f22224a.getSystemWindowInsetTop();
            }
            if (i > 0) {
                this.f22226d.setBounds(0, 0, getWidth(), i);
                this.f22226d.draw(canvas);
            }
        }
    }

    public StatusBarView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private static int a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0 || mode != 1073741824) {
            return i;
        }
        return size;
    }

    private void b(int i, int i2) {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), i), a(getSuggestedMinimumHeight(), i2));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f22224a != null) {
            b(i, View.MeasureSpec.makeMeasureSpec(this.f22224a.getSystemWindowInsetTop(), 1073741824));
        } else {
            b(i, i2);
        }
    }

    public StatusBarView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
