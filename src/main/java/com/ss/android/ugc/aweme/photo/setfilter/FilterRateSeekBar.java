package com.ss.android.ugc.aweme.photo.setfilter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.tools.R$styleable;

public class FilterRateSeekBar extends AppCompatSeekBar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58756a;

    /* renamed from: b  reason: collision with root package name */
    private int f58757b;

    /* renamed from: c  reason: collision with root package name */
    private float f58758c;

    /* renamed from: d  reason: collision with root package name */
    private String f58759d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f58760e;

    /* renamed from: f  reason: collision with root package name */
    private int f58761f;
    private float g;
    private float h;
    private float i;
    private Context j;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int getProgress() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0048 }
            com.meituan.robust.ChangeQuickRedirect r3 = f58756a     // Catch:{ all -> 0x0048 }
            r4 = 0
            r5 = 63855(0xf96f, float:8.948E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0048 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0048 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x002e
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0048 }
            com.meituan.robust.ChangeQuickRedirect r4 = f58756a     // Catch:{ all -> 0x0048 }
            r5 = 0
            r6 = 63855(0xf96f, float:8.948E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0048 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0048 }
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0048 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0048 }
            monitor-exit(r9)
            return r0
        L_0x002e:
            int r0 = super.getProgress()     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0048 }
            r9.f58759d = r1     // Catch:{ all -> 0x0048 }
            android.graphics.Paint r1 = r9.f58760e     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0046
            android.graphics.Paint r1 = r9.f58760e     // Catch:{ all -> 0x0048 }
            java.lang.String r2 = r9.f58759d     // Catch:{ all -> 0x0048 }
            float r1 = r1.measureText(r2)     // Catch:{ all -> 0x0048 }
            r9.g = r1     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r9)
            return r0
        L_0x0048:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.photo.setfilter.FilterRateSeekBar.getProgress():int");
    }

    public FilterRateSeekBar(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f58756a, false, 63854, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f58756a, false, 63854, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        invalidate();
        return super.onTouchEvent(motionEvent);
    }

    public synchronized void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{canvas2}, this, f58756a, false, 63853, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2}, this, f58756a, false, 63853, new Class[]{Canvas.class}, Void.TYPE);
                return;
            }
            super.onDraw(canvas);
            float width = (float) ((getProgressDrawable().getBounds().width() * getProgress()) / getMax());
            canvas2.drawText(this.f58759d, (width - (this.g / 2.0f)) + this.i, UIUtils.dip2Px(this.j, 11.0f), this.f58760e);
            float f2 = this.i;
            float paddingTop = ((float) getPaddingTop()) + UIUtils.dip2Px(this.j, 3.5f);
            float paddingTop2 = ((float) getPaddingTop()) + UIUtils.dip2Px(this.j, 10.0f);
            float screenWidth = ((float) UIUtils.getScreenWidth(this.j)) - this.i;
            a(canvas, f2, paddingTop, f2, paddingTop2, screenWidth, paddingTop);
            float dip2Px = paddingTop2 + UIUtils.dip2Px(this.j, 2.0f);
            float dip2Px2 = dip2Px + UIUtils.dip2Px(this.j, 6.5f);
            a(canvas, f2, dip2Px, f2, dip2Px2, screenWidth, dip2Px2);
            float f3 = width + this.i;
            float dip2Px3 = paddingTop2 + UIUtils.dip2Px(this.j, 0.5f);
            float dip2Px4 = UIUtils.dip2Px(this.j, 11.0f);
            if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f3), Float.valueOf(dip2Px3), Float.valueOf(dip2Px4)}, this, f58756a, false, 63857, new Class[]{Canvas.class, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f3), Float.valueOf(dip2Px3), Float.valueOf(dip2Px4)}, this, f58756a, false, 63857, new Class[]{Canvas.class, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(getResources().getColor(C0906R.color.a08));
            canvas2.drawCircle(f3, dip2Px3, dip2Px4, paint);
        }
    }

    public FilterRateSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FilterRateSeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.j = context;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.FilterRateSeekBar, i2, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 1) {
                this.f58757b = obtainStyledAttributes.getColor(index, -1);
            } else if (index == 3) {
                this.f58758c = obtainStyledAttributes.getDimension(index, 15.0f);
            } else if (index == 2) {
                this.f58761f = obtainStyledAttributes.getInt(index, 1);
            }
        }
        obtainStyledAttributes.recycle();
        this.f58760e = new Paint();
        this.f58760e.setAntiAlias(true);
        this.f58760e.setColor(this.f58757b);
        this.f58760e.setTextSize(this.f58758c);
        Rect rect = new Rect();
        this.f58759d = String.valueOf(getProgress());
        this.f58760e.getTextBounds(this.f58759d, 0, this.f58759d.length(), rect);
        this.h = (float) rect.height();
        this.i = UIUtils.dip2Px(context, 52.5f);
        if (this.f58761f == 1) {
            setPadding((int) this.i, (int) (this.h + UIUtils.dip2Px(context, 9.0f)), (int) this.i, 0);
        } else {
            setPadding((int) this.i, 0, (int) this.i, (int) (this.h + UIUtils.dip2Px(context, 5.0f)));
        }
    }

    private void a(Canvas canvas, float f2, float f3, float f4, float f5, float f6, float f7) {
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7)}, this, f58756a, false, 63856, new Class[]{Canvas.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f6), Float.valueOf(f7)}, this, f58756a, false, 63856, new Class[]{Canvas.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getResources().getColor(C0906R.color.a17));
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        path.lineTo(f6, f7);
        path.close();
        canvas2.drawPath(path, paint);
    }
}
