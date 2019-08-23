package com.bytedance.ies.dmt.ui.common.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.annotation.ColorInt;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class BadgeView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    private int f20323a;

    /* renamed from: b  reason: collision with root package name */
    private int f20324b;

    /* renamed from: c  reason: collision with root package name */
    private int f20325c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f20326d;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    private void a() {
        int measuredHeight = getMeasuredHeight();
        if (this.f20325c != measuredHeight) {
            this.f20325c = measuredHeight;
            a(this.f20325c, this.f20323a);
        }
    }

    private void c() {
        int i;
        int i2;
        if (this.f20324b == 2) {
            i2 = (int) UIUtils.dip2Px(getContext(), 4.0f);
            i = i2;
        } else {
            i2 = 0;
            i = 0;
        }
        super.setPadding(i2, 0, i, 0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r3 = this;
            int r0 = r3.f20324b
            switch(r0) {
                case 1: goto L_0x0028;
                case 2: goto L_0x0012;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.content.Context r0 = r3.getContext()
            r1 = 1086324736(0x40c00000, float:6.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
        L_0x0010:
            r1 = r0
            goto L_0x0034
        L_0x0012:
            android.content.Context r0 = r3.getContext()
            r1 = 1098907648(0x41800000, float:16.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            int r1 = r3.getMeasuredWidth()
            if (r1 >= r0) goto L_0x0024
            goto L_0x0010
        L_0x0024:
            r2 = r1
            r1 = r0
            r0 = r2
            goto L_0x0034
        L_0x0028:
            android.content.Context r0 = r3.getContext()
            r1 = 1090519040(0x41000000, float:8.0)
            float r0 = com.bytedance.common.utility.UIUtils.dip2Px(r0, r1)
            int r0 = (int) r0
            goto L_0x0010
        L_0x0034:
            r3.setMeasuredDimension(r0, r1)
            r3.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.common.views.BadgeView.b():void");
    }

    public BadgeView(Context context) {
        this(context, null);
    }

    public void setCount(int i) {
        setText(String.valueOf(i));
    }

    public void setBadgeColor(@ColorInt int i) {
        this.f20323a = i;
        a(this.f20325c, this.f20323a);
    }

    private void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.BadgeView);
        this.f20323a = obtainStyledAttributes.getColor(0, getContext().getResources().getColor(C0906R.color.xz));
        setMode(obtainStyledAttributes.getInt(1, 0));
        obtainStyledAttributes.recycle();
    }

    public void setMode(int i) {
        if (this.f20324b != i) {
            this.f20324b = i;
            if (this.f20324b != 2) {
                this.f20326d = getText();
                setText("");
            } else if (TextUtils.isEmpty(getText()) && !TextUtils.isEmpty(this.f20326d)) {
                setText(this.f20326d);
            }
            c();
            b();
        }
    }

    public final void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        b(attributeSet);
        setTextSize(1, 12.0f);
        setGravity(17);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b();
    }

    public void setTextSize(int i, float f2) {
        super.setTextSize(1, 12.0f);
    }

    private BadgeView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private void a(int i, int i2) {
        float dip2Px = (float) ((int) UIUtils.dip2Px(getContext(), (float) i));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{dip2Px, dip2Px, dip2Px, dip2Px, dip2Px, dip2Px, dip2Px, dip2Px}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        setBackground(shapeDrawable);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        SpannableStringBuilder spannableStringBuilder;
        if (this.f20324b != 2 || TextUtils.isEmpty(charSequence)) {
            this.f20326d = charSequence;
            spannableStringBuilder = "";
        } else {
            try {
                Integer valueOf = Integer.valueOf(charSequence.toString());
                if (valueOf.intValue() > 99) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("99+");
                    spannableStringBuilder2.setSpan(new b("+"), 2, 3, 17);
                    spannableStringBuilder = spannableStringBuilder2;
                } else if (valueOf.intValue() < 0) {
                    spannableStringBuilder = "";
                } else {
                    spannableStringBuilder = charSequence;
                }
            } catch (Exception unused) {
                throw new IllegalArgumentException("Excepted a int but get " + charSequence);
            }
        }
        super.setText(spannableStringBuilder, bufferType);
    }

    private BadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f20324b = -1;
        a(attributeSet);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        c();
    }
}
