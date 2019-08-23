package com.ss.android.ugc.aweme.commerce.service.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class RemoteCardHeadImageView extends RemoteImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38293a;

    /* renamed from: b  reason: collision with root package name */
    private Paint f38294b;

    /* renamed from: c  reason: collision with root package name */
    private RectF f38295c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38296d;

    public RemoteCardHeadImageView(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f38293a, false, 30094, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f38293a, false, 30094, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.f38296d && this.f38294b != null) {
            float f2 = ((float) (-getHeight())) / 8.0f;
            float width = ((float) (-getWidth())) - (((float) getWidth()) / 24.0f);
            float width2 = ((float) getWidth()) / 4.0f;
            float width3 = ((float) getWidth()) + (((float) getWidth()) / 8.0f);
            if (this.f38295c != null) {
                this.f38295c.set(width, f2, width2, width3);
                canvas.drawArc(this.f38295c, -90.0f, 180.0f, false, this.f38294b);
            }
        }
    }

    public void setClip(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38293a, false, 30093, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38293a, false, 30093, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f38296d = z;
        if (z) {
            setLayerType(2, null);
            this.f38294b = new Paint();
            this.f38294b.setAntiAlias(true);
            this.f38294b.setColor(getResources().getColor(C0906R.color.a7l));
            this.f38294b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.f38295c = new RectF();
        }
    }

    public RemoteCardHeadImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundColor(0);
    }
}
