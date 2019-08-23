package com.ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class CompoundDrawableAndTextLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60982a;

    /* renamed from: b  reason: collision with root package name */
    private RemoteImageView f60983b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f60984c;

    /* renamed from: d  reason: collision with root package name */
    private int f60985d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f60986e;

    /* renamed from: f  reason: collision with root package name */
    private int f60987f;
    private int g;

    public CompoundDrawableAndTextLayout(Context context) {
        this(context, null);
    }

    public void setImageResource(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60982a, false, 66971, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60982a, false, 66971, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f60983b != null) {
            this.f60983b.setImageResource(i);
            requestLayout();
        }
    }

    public void setText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f60982a, false, 66969, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f60982a, false, 66969, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f60984c.setText(str2);
        requestLayout();
    }

    public void setTextRes(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60982a, false, 66970, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60982a, false, 66970, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f60984c.setText(i);
        requestLayout();
    }

    public CompoundDrawableAndTextLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CompoundDrawableAndTextLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.f60987f = 12;
        this.g = -1;
        setOrientation(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CompoundDrawableAndTextLayout);
        if (obtainStyledAttributes.hasValue(1)) {
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.f60983b = new RemoteImageView(context);
            if (dimensionPixelSize > 0) {
                i2 = dimensionPixelSize;
            } else {
                i2 = -2;
            }
            addView(this.f60983b, new LinearLayout.LayoutParams(i2, dimensionPixelSize <= 0 ? -2 : dimensionPixelSize));
            this.f60983b.setImageResource(resourceId);
        }
        this.f60985d = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        this.f60986e = obtainStyledAttributes.getBoolean(0, false);
        this.f60987f = obtainStyledAttributes.getDimensionPixelSize(6, 12);
        this.g = obtainStyledAttributes.getColor(4, -1);
        boolean z = obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.recycle();
        this.f60984c = new DmtTextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.leftMargin = this.f60985d;
        addView(this.f60984c, layoutParams);
        this.f60984c.setTextColor(this.g);
        this.f60984c.setTextSize(0, (float) this.f60987f);
        if (z) {
            this.f60984c.setMaxLines(1);
            this.f60984c.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (PatchProxy.isSupport(new Object[0], this, f60982a, false, 66968, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60982a, false, 66968, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.f60984c.setTextAlignment(5);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f60982a, false, 66973, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f60982a, false, 66973, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f60983b == null) {
            super.onLayout(z, i, i2, i3, i4);
        } else {
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int paddingLeft = getPaddingLeft();
            int i6 = ((i4 - i2) - paddingTop) - paddingBottom;
            int measuredWidth = this.f60983b.getMeasuredWidth();
            int measuredHeight = this.f60983b.getMeasuredHeight();
            int measuredHeight2 = this.f60984c.getMeasuredHeight();
            int measuredWidth2 = this.f60984c.getMeasuredWidth();
            if (this.f60986e) {
                i5 = ((i6 - measuredHeight) / 2) + paddingTop;
            } else {
                int lineHeight = this.f60984c.getLineHeight();
                i5 = ((measuredHeight2 - (this.f60984c.getLineCount() * lineHeight)) / 2) + ((lineHeight - measuredHeight) / 2) + paddingTop;
            }
            int i7 = measuredWidth + paddingLeft;
            this.f60983b.layout(paddingLeft, i5, i7, measuredHeight + i5);
            int i8 = i7 + ((LinearLayout.LayoutParams) this.f60984c.getLayoutParams()).leftMargin;
            int i9 = ((i6 - measuredHeight2) / 2) + paddingTop;
            this.f60984c.layout(i8, i9, measuredWidth2 + i8, measuredHeight2 + i9);
        }
    }
}
