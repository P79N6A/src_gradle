package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.List;

public class ProgressSegmentView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71347a;

    /* renamed from: b  reason: collision with root package name */
    private List<TimeSpeedModelExtension> f71348b;

    /* renamed from: c  reason: collision with root package name */
    private long f71349c;

    /* renamed from: d  reason: collision with root package name */
    private Paint f71350d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f71351e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f71352f;
    private Paint g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private String o;

    private boolean a() {
        if (this.l <= 30000 || this.f71349c >= this.k) {
            return false;
        }
        return true;
    }

    private long getLongVideoAnchorPosition() {
        if (!PatchProxy.isSupport(new Object[0], this, f71347a, false, 81333, new Class[0], Long.TYPE)) {
            return a(this.k);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f71347a, false, 81333, new Class[0], Long.TYPE)).longValue();
    }

    public void setAnchorDuration(long j2) {
        this.k = j2;
    }

    public void setNeedDrawAnchor(boolean z) {
        this.n = z;
    }

    private long a(long j2) {
        double d2 = (double) j2;
        Double.isNaN(d2);
        double d3 = (double) this.h;
        Double.isNaN(d3);
        double d4 = d2 * 1.0d * d3;
        double d5 = (double) this.l;
        Double.isNaN(d5);
        return (long) (d4 / d5);
    }

    public void setAnchorString(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f71347a, false, 81328, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f71347a, false, 81328, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.o = str;
        this.m = (long) this.g.measureText(this.o);
    }

    private void a(Canvas canvas) {
        Canvas canvas2 = canvas;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f71347a, false, 81332, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f71347a, false, 81332, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (a()) {
            long longVideoAnchorPosition = getLongVideoAnchorPosition();
            long j2 = longVideoAnchorPosition - 2;
            canvas.drawRect((float) j2, 0.0f, (float) (longVideoAnchorPosition + 2), (float) this.i, this.f71352f);
            String str = this.o;
            float f2 = (float) (j2 - (this.m / 2));
            float y = getY() + ((float) (this.i * 2));
            if (fc.a()) {
                i2 = fc.c(getContext());
            }
            canvas2.drawText(str, f2, y - ((float) i2), this.g);
        }
    }

    public void setMaxDuration(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f71347a, false, 81327, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f71347a, false, 81327, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.l = j3;
        requestLayout();
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f71347a, false, 81331, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f71347a, false, 81331, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        long a2 = a(this.f71349c);
        if (this.f71349c < this.l) {
            canvas.drawLine((float) a2, (float) this.j, (float) this.h, (float) this.j, this.f71350d);
        }
        if (a2 > 0) {
            canvas.save();
            canvas2.clipRect(0.0f, 0.0f, (float) this.j, (float) this.i);
            canvas2.drawCircle((float) this.j, (float) this.j, (float) this.j, this.f71351e);
            canvas.restore();
            canvas.drawRect((float) this.j, 0.0f, (float) Math.min(a2, this.h - this.j), (float) this.i, this.f71351e);
        }
        if (this.f71349c >= this.l) {
            canvas.save();
            canvas2.clipRect((float) (this.h - this.j), 0.0f, (float) this.h, (float) this.i);
            canvas2.drawCircle((float) (this.h - this.j), (float) this.j, (float) this.j, this.f71351e);
            canvas.restore();
        }
        if (this.f71348b != null) {
            long j2 = 0;
            while (i2 < this.f71348b.size()) {
                TimeSpeedModelExtension timeSpeedModelExtension = this.f71348b.get(i2);
                long calculateRealTime = j2 + ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension.getDuration(), timeSpeedModelExtension.getSpeed()));
                int a3 = (int) a(calculateRealTime);
                if (((long) a3) < this.h) {
                    canvas.drawRect((float) (a3 - 4), 0.0f, (float) a3, (float) this.i, this.f71352f);
                }
                i2++;
                j2 = calculateRealTime;
            }
            a(canvas);
            return;
        }
        if (this.n) {
            a(canvas);
        }
    }

    public ProgressSegmentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71347a, false, 81330, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71347a, false, 81330, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.h = (long) getMeasuredWidth();
        this.i = (long) (getMeasuredHeight() / 3);
        this.j = this.i >> 1;
    }

    public final void a(List<TimeSpeedModelExtension> list, long j2) {
        List<TimeSpeedModelExtension> list2 = list;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{list2, new Long(j3)}, this, f71347a, false, 81329, new Class[]{List.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, new Long(j3)}, this, f71347a, false, 81329, new Class[]{List.class, Long.TYPE}, Void.TYPE);
            return;
        }
        this.f71348b = list2;
        this.f71349c = j3;
        postInvalidate();
    }

    public ProgressSegmentView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = ea.f66827f;
        this.l = ea.f66827f;
        this.o = "15s";
        this.f71350d = new Paint(1);
        this.f71350d.setStyle(Paint.Style.STROKE);
        this.f71350d.setStrokeCap(Paint.Cap.ROUND);
        this.f71350d.setStrokeWidth(UIUtils.dip2Px(context, 6.0f));
        this.f71350d.setColor(getResources().getColor(C0906R.color.yf));
        this.f71351e = new Paint(1);
        this.f71351e.setColor(getResources().getColor(C0906R.color.zp));
        this.f71352f = new Paint(1);
        this.f71352f.setStyle(Paint.Style.FILL);
        this.f71352f.setColor(getResources().getColor(C0906R.color.vf));
        this.g = new Paint(1);
        this.g.setStyle(Paint.Style.FILL);
        this.g.setColor(getResources().getColor(C0906R.color.vf));
        this.g.setTextSize(UIUtils.sp2px(getContext(), 12.0f));
        this.g.setShadowLayer(4.0f, 0.0f, 2.0f, getResources().getColor(C0906R.color.a2m));
        this.m = (long) this.g.measureText(this.o);
    }
}
