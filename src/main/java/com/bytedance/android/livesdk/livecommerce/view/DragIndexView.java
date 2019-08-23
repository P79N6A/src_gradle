package com.bytedance.android.livesdk.livecommerce.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;

public class DragIndexView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16232a;

    /* renamed from: b  reason: collision with root package name */
    public int f16233b = 2;

    /* renamed from: c  reason: collision with root package name */
    Path f16234c = new Path();

    /* renamed from: d  reason: collision with root package name */
    Paint f16235d = new Paint();

    /* renamed from: e  reason: collision with root package name */
    float f16236e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    boolean f16237f = false;
    private Paint g = new Paint();
    private int h = 0;
    private int i = 0;
    private float j;
    private String k = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
    private float l;
    private float m;
    private float n;
    private final float o = 0.25f;
    private int p = 0;
    private a q;
    private long r = 0;

    public interface a {
        void a(View view, boolean z);
    }

    public void setOnClickIndexListener(a aVar) {
        this.q = aVar;
    }

    public DragIndexView(Context context) {
        super(context);
        a(context);
    }

    public void setNum(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f16232a, false, 10768, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f16232a, false, 10768, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 > 0) {
            this.k = String.valueOf(i2);
            requestLayout();
        }
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f16232a, false, 10763, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f16232a, false, 10763, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        setClickable(true);
        Resources resources = context.getResources();
        this.m = UIUtils.dip2Px(context, 10.0f);
        this.n = UIUtils.dip2Px(context, 8.0f);
        this.h = resources.getColor(C0906R.color.l1);
        this.l = UIUtils.dip2Px(context, 4.0f);
        this.g.setAntiAlias(true);
        this.g.setTypeface(Typeface.DEFAULT_BOLD);
        this.i = resources.getColor(C0906R.color.lr);
        this.j = UIUtils.dip2Px(context, 16.0f);
        this.g.setTextSize(this.j);
        this.g.setColor(this.i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f16232a, false, 10771, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f16232a, false, 10771, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f16233b == 2) {
            int measuredHeight = getMeasuredHeight();
            switch (motionEvent.getAction()) {
                case 0:
                    this.f16236e = motionEvent.getY();
                    if (this.f16236e * 2.0f < ((float) measuredHeight)) {
                        this.f16237f = true;
                    } else {
                        this.f16237f = false;
                    }
                    this.r = System.currentTimeMillis();
                    break;
                case 1:
                    long currentTimeMillis = System.currentTimeMillis() - this.r;
                    if (motionEvent.getY() * 2.0f >= ((float) measuredHeight)) {
                        z = false;
                    }
                    if (z == this.f16237f && currentTimeMillis < 300 && this.q != null) {
                        this.q.a(this, this.f16237f);
                        break;
                    }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f16232a, false, 10765, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f16232a, false, 10765, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.f16233b == 2) {
            this.f16235d.setAntiAlias(true);
            this.f16235d.setColor(this.h);
            this.f16235d.setStyle(Paint.Style.FILL);
            canvas.save();
            canvas2.translate(0.0f, (float) this.p);
            if (PatchProxy.isSupport(new Object[]{canvas2}, this, f16232a, false, 10766, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2}, this, f16232a, false, 10766, new Class[]{Canvas.class}, Void.TYPE);
            } else {
                float measuredWidth2 = (((float) getMeasuredWidth()) - this.m) / 2.0f;
                float f2 = this.n;
                float f3 = this.m + measuredWidth2;
                float f4 = (measuredWidth2 + f3) / 2.0f;
                float f5 = f2 - this.n;
                float f6 = this.m * 0.25f;
                float f7 = f6 * 0.5f;
                float f8 = f2 - (this.n * 0.25f);
                this.f16234c.moveTo(f7 + measuredWidth2, f8);
                this.f16234c.quadTo(measuredWidth2, f2, f6 + measuredWidth2, f2);
                this.f16234c.lineTo(f3 - f6, f2);
                this.f16234c.quadTo(f3, f2, f3 - f7, f8);
                float f9 = (this.n * 0.25f) + f5;
                this.f16234c.lineTo(f4 + f7, f9);
                this.f16234c.quadTo(f4, f5, f4 - f7, f9);
                this.f16234c.close();
                canvas2.drawPath(this.f16234c, this.f16235d);
            }
            canvas.restore();
            canvas.save();
            canvas2.translate(0.0f, (float) (-this.p));
            if (PatchProxy.isSupport(new Object[]{canvas2}, this, f16232a, false, 10767, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2}, this, f16232a, false, 10767, new Class[]{Canvas.class}, Void.TYPE);
            } else {
                int measuredWidth3 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                float f10 = (((float) measuredWidth3) - this.m) / 2.0f;
                float f11 = (float) measuredHeight2;
                float f12 = f11 - this.n;
                float f13 = this.m + f10;
                float f14 = (f10 + f13) / 2.0f;
                float f15 = this.m * 0.25f;
                float f16 = f15 * 0.5f;
                float f17 = (this.n * 0.25f) + f12;
                this.f16234c.moveTo(f16 + f10, f17);
                this.f16234c.quadTo(f10, f12, f15 + f10, f12);
                this.f16234c.lineTo(f13 - f15, f12);
                this.f16234c.quadTo(f13, f12, f13 - f16, f17);
                float f18 = f11 - (this.n * 0.25f);
                this.f16234c.lineTo(f14 + f16, f18);
                this.f16234c.quadTo(f14, f11, f14 - f16, f18);
                this.f16234c.close();
                canvas2.drawPath(this.f16234c, this.f16235d);
            }
            canvas.restore();
        }
        float measureText = this.g.measureText(this.k);
        Paint.FontMetrics fontMetrics = this.g.getFontMetrics();
        float f19 = ((((float) measuredHeight) / 2.0f) + ((fontMetrics.descent - fontMetrics.ascent) / 2.0f)) - fontMetrics.descent;
        canvas2.drawText(this.k, (((float) measuredWidth) - measureText) / 2.0f, f19, this.g);
    }

    public DragIndexView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f16232a, false, 10764, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f16232a, false, 10764, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        float measureText = this.g.measureText(this.k);
        int i4 = (int) ((this.n * 2.0f) + this.j + (this.l * 2.0f));
        if (measureText <= this.m) {
            measureText = this.m;
        }
        int i5 = (int) measureText;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            int measuredWidth = getMeasuredWidth();
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        if (View.MeasureSpec.getMode(i3) == 1073741824) {
            int measuredHeight = getMeasuredHeight();
            if (measuredHeight > i4) {
                this.p = (int) (((float) (measuredHeight - i4)) * 0.5f);
                i4 = measuredHeight;
            }
        }
        setMeasuredDimension(i5, i4);
    }

    public DragIndexView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }
}
