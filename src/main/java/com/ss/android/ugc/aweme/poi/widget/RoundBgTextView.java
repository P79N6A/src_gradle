package com.ss.android.ugc.aweme.poi.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class RoundBgTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61045a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f61046b;

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f61045a, false, 67066, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f61045a, false, 67066, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
            float f2 = (float) (height / 2);
            canvas2.drawRoundRect(rectF, f2, f2, this.f61046b);
        }
        super.onDraw(canvas);
    }
}
