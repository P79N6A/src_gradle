package com.bytedance.ies.dmt.ui.common.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.style.ReplacementSpan;

public final class b extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    private String f20335a;

    public b(String str) {
        this.f20335a = str;
    }

    public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(this.f20335a);
    }

    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, @NonNull Paint paint) {
        canvas.drawText(this.f20335a, f2, (float) (i4 - 10), paint);
    }
}
