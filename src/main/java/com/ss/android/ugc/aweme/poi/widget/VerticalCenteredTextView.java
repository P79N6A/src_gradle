package com.ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class VerticalCenteredTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61049a;

    public VerticalCenteredTextView(Context context) {
        super(context);
    }

    public VerticalCenteredTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f61049a, false, 67069, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f61049a, false, 67069, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        setTranslationY(((fontMetrics.descent - fontMetrics.ascent) / 2.0f) - ((float) (measuredHeight / 2)));
    }

    public VerticalCenteredTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
