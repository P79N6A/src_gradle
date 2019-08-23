package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class VideoCoverFrameView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71393a;

    /* renamed from: b  reason: collision with root package name */
    int f71394b;

    /* renamed from: c  reason: collision with root package name */
    int f71395c;

    /* renamed from: d  reason: collision with root package name */
    float f71396d;

    /* renamed from: e  reason: collision with root package name */
    RectF f71397e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f71398f;

    public VideoCoverFrameView(Context context) {
        this(context, 0, 0);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f71393a, false, 81487, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f71393a, false, 81487, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        canvas.drawRoundRect(this.f71397e, this.f71396d, this.f71396d, this.f71398f);
    }

    public void setColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71393a, false, 81483, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71393a, false, 81483, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71398f.setColor(i);
    }

    public void setStrokeWidth(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71393a, false, 81484, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71393a, false, 81484, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71398f.setStrokeWidth((float) i);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71393a, false, 81485, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71393a, false, 81485, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f71394b, this.f71395c);
    }

    private VideoCoverFrameView(Context context, int i, int i2) {
        super(context);
        float f2;
        this.f71394b = 0;
        this.f71395c = 0;
        this.f71398f = new Paint();
        this.f71398f.setStyle(Paint.Style.STROKE);
        this.f71398f.setColor(-1);
        if (PatchProxy.isSupport(new Object[]{1}, this, f71393a, false, 81488, new Class[]{Integer.TYPE}, Float.TYPE)) {
            f2 = ((Float) PatchProxy.accessDispatch(new Object[]{1}, this, f71393a, false, 81488, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        } else {
            f2 = UIUtils.dip2Px(getContext(), 1.0f);
        }
        this.f71396d = f2;
        this.f71398f.setStrokeWidth(f2);
    }
}
