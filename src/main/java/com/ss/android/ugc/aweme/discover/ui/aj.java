package com.ss.android.ugc.aweme.discover.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.hotsearch.d.h;

public final class aj extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43116a;

    /* renamed from: b  reason: collision with root package name */
    public int f43117b;

    /* renamed from: c  reason: collision with root package name */
    private int f43118c = 17;

    /* renamed from: d  reason: collision with root package name */
    private View f43119d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f43120e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f43121f = true;
    private boolean g = true;

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f43116a, false, 37786, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43116a, false, 37786, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f43121f && this.f43119d != null) {
            return this.f43119d.getMeasuredWidth() + this.f43117b;
        } else {
            return 0;
        }
    }

    public aj(TextView textView, View view, int i, boolean z, boolean z2) {
        this.f43120e = textView;
        this.f43119d = view;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        if (!PatchProxy.isSupport(new Object[]{paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt}, this, f43116a, false, 37785, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)) {
            return a();
        }
        Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
        return ((Integer) PatchProxy.accessDispatch(objArr, this, f43116a, false, 37785, new Class[]{Paint.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Paint.FontMetricsInt.class}, Integer.TYPE)).intValue();
    }

    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, @NonNull Paint paint) {
        int i6;
        int i7 = 0;
        if (PatchProxy.isSupport(new Object[]{canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint}, this, f43116a, false, 37787, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint}, this, f43116a, false, 37787, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
        } else if (this.g) {
            int lineHeight = this.f43120e.getLineHeight();
            int i8 = lineHeight * ((int) (((((float) i3) * 1.0f) / ((float) lineHeight)) + 0.5f));
            int i9 = (int) f2;
            int width = canvas.getWidth();
            int i10 = i9;
            if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(lineHeight), Integer.valueOf(width)}, this, f43116a, false, 37788, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i8), Integer.valueOf(lineHeight), Integer.valueOf(width)}, this, f43116a, false, 37788, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f43119d != null) {
                int measuredHeight = this.f43119d.getMeasuredHeight();
                if (measuredHeight < lineHeight) {
                    int i11 = this.f43118c;
                    if (i11 == 48) {
                        i6 = i8;
                    } else if (i11 != 80) {
                        i6 = i8 + ((lineHeight - measuredHeight) / 2);
                    } else {
                        i6 = (i8 + lineHeight) - measuredHeight;
                    }
                } else {
                    i6 = 0;
                }
                boolean a2 = h.a(charSequence.toString(), this.f43120e);
                int[] iArr = new int[2];
                this.f43120e.getLocationInWindow(iArr);
                if (iArr[0] >= 0 && iArr[0] <= UIUtils.getScreenWidth(this.f43119d.getContext())) {
                    View view = this.f43119d;
                    int i12 = iArr[0] + i10;
                    if (a2) {
                        i7 = this.f43117b;
                    }
                    view.setX((float) (i12 + i7));
                    this.f43119d.setY((float) (iArr[1] + i6));
                }
            }
        }
    }
}
