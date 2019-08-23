package com.ss.android.ugc.aweme.commerce.service.widgets;

import android.graphics.Canvas;
import android.support.v7.widget.AppCompatTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class MarketPriceView extends AppCompatTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38268a;

    /* renamed from: b  reason: collision with root package name */
    private int f38269b;

    public void setDelLineHeight(int i) {
        this.f38269b = i;
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f38268a, false, 30063, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f38268a, false, 30063, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        float paddingTop = (float) (getPaddingTop() + (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2));
        canvas.drawLine((float) paddingLeft, paddingTop, (float) measuredWidth, paddingTop, getPaint());
    }
}
