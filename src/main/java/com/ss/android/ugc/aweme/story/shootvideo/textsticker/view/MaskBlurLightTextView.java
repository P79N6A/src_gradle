package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class MaskBlurLightTextView extends AppCompatTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74311a;

    public MaskBlurLightTextView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f74311a, false, 86337, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f74311a, false, 86337, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
    }

    public void setMaskBlurColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74311a, false, 86336, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74311a, false, 86336, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setShadowLayer(10.0f, 0.0f, 0.0f, i);
    }

    public MaskBlurLightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
