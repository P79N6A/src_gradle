package com.bytedance.ies.dmt.ui.common.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.style.ReplacementSpan;

public final class a extends ReplacementSpan {

    /* renamed from: a  reason: collision with root package name */
    public C0187a f20334a;

    /* renamed from: com.bytedance.ies.dmt.ui.common.views.a$a  reason: collision with other inner class name */
    public interface C0187a {
        void a(int i, int i2);
    }

    public final int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        return 0;
    }

    public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, @NonNull Paint paint) {
        if (this.f20334a != null) {
            this.f20334a.a((int) f2, i3);
        }
    }
}
