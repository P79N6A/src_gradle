package com.ss.android.ugc.aweme.share;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CircleImageView extends com.ss.android.ugc.aweme.shortvideo.ui.CircleImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64491a;

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f64491a, false, 72999, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f64491a, false, 72999, new Class[]{Canvas.class}, Void.TYPE);
        } else if (getDrawable() != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            super.onDraw(canvas);
        }
    }
}
