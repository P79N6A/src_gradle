package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.ugc.bytex.a.a.a;

public class GoLiveTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76337a;

    /* renamed from: b  reason: collision with root package name */
    private Path f76338b;

    public GoLiveTextView(Context context) {
        super(context);
    }

    private int a(float f2) {
        if (!PatchProxy.isSupport(new Object[]{Float.valueOf(10.0f)}, this, f76337a, false, 89474, new Class[]{Float.TYPE}, Integer.TYPE)) {
            return (int) ((getResources().getDisplayMetrics().density * 10.0f) + 0.5f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(10.0f)}, this, f76337a, false, 89474, new Class[]{Float.TYPE}, Integer.TYPE)).intValue();
    }

    public void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f76337a, false, 89471, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f76337a, false, 89471, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f76337a, false, 89472, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f76337a, false, 89472, new Class[]{Canvas.class}, Void.TYPE);
        } else {
            int width = getWidth();
            int height = getHeight();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(width), Integer.valueOf(height)}, this, f76337a, false, 89473, new Class[]{Integer.TYPE, Integer.TYPE}, Bitmap.class)) {
                bitmap = (Bitmap) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(width), Integer.valueOf(height)}, this, f76337a, false, 89473, new Class[]{Integer.TYPE, Integer.TYPE}, Bitmap.class);
            } else {
                if (this.f76338b == null) {
                    this.f76338b = new Path();
                }
                bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas3 = new Canvas(bitmap);
                this.f76338b.lineTo(0.0f, (float) getHeight());
                this.f76338b.lineTo((float) (getWidth() - a(10.0f)), (float) getHeight());
                this.f76338b.lineTo((float) getWidth(), (float) (getHeight() / 2));
                this.f76338b.lineTo((float) (getWidth() - a(10.0f)), 0.0f);
                this.f76338b.lineTo(0.0f, 0.0f);
                this.f76338b.close();
                Paint paint = new Paint(1);
                paint.setColor(-16711936);
                canvas3.drawPath(this.f76338b, paint);
                if (ey.a(getContext())) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(-1.0f, 1.0f);
                    bitmap = Bitmap.createBitmap(bitmap, 0, 0, getWidth(), getHeight(), matrix, true);
                }
            }
            Drawable a2 = a.a(getResources(), 2130838004);
            Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas4 = new Canvas(createBitmap);
            a2.setBounds(0, 0, canvas4.getWidth(), canvas4.getHeight());
            a2.draw(canvas4);
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(-16711936);
            paint2.setFilterBitmap(true);
            if (Build.VERSION.SDK_INT < 19) {
                setLayerType(1, null);
            } else {
                setLayerType(2, paint2);
            }
            canvas2.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
            if (createBitmap != null && !createBitmap.isRecycled()) {
                createBitmap.recycle();
            }
            if (bitmap != null && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
        super.onDraw(canvas);
    }

    public GoLiveTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GoLiveTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
