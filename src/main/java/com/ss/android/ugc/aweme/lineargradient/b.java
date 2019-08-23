package com.ss.android.ugc.aweme.lineargradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.PixelUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53156a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f53157b = new Paint(1);

    /* renamed from: c  reason: collision with root package name */
    private Path f53158c;

    /* renamed from: d  reason: collision with root package name */
    private RectF f53159d;

    /* renamed from: e  reason: collision with root package name */
    private float[] f53160e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f53161f = {0.0f, 0.0f};
    private float[] g = {0.0f, 1.0f};
    private int[] h;
    private int[] i = {0, 0};
    private float[] j = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53156a, false, 55346, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53156a, false, 55346, new Class[0], Void.TYPE);
        } else if (this.h != null && (this.f53160e == null || this.h.length == this.f53160e.length)) {
            LinearGradient linearGradient = new LinearGradient(this.f53161f[0] * ((float) this.i[0]), ((float) this.i[1]) * this.f53161f[1], this.g[0] * ((float) this.i[0]), this.g[1] * ((float) this.i[1]), this.h, this.f53160e, Shader.TileMode.CLAMP);
            this.f53157b.setShader(linearGradient);
            invalidate();
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f53156a, false, 55347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53156a, false, 55347, new Class[0], Void.TYPE);
            return;
        }
        if (this.f53158c == null) {
            this.f53158c = new Path();
            this.f53159d = new RectF();
        }
        this.f53158c.reset();
        this.f53159d.set(0.0f, 0.0f, (float) this.i[0], (float) this.i[1]);
        this.f53158c.addRoundRect(this.f53159d, this.j, Path.Direction.CW);
    }

    public b(Context context) {
        super(context);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f53156a, false, 55348, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f53156a, false, 55348, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.f53158c == null) {
            canvas.drawPaint(this.f53157b);
        } else {
            canvas.drawPath(this.f53158c, this.f53157b);
        }
    }

    public void setBorderRadii(ReadableArray readableArray) {
        ReadableArray readableArray2 = readableArray;
        if (PatchProxy.isSupport(new Object[]{readableArray2}, this, f53156a, false, 55344, new Class[]{ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{readableArray2}, this, f53156a, false, 55344, new Class[]{ReadableArray.class}, Void.TYPE);
            return;
        }
        float[] fArr = new float[readableArray.size()];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = PixelUtil.toPixelFromDIP((float) readableArray2.getDouble(i2));
        }
        this.j = fArr;
        b();
        a();
    }

    public void setColors(ReadableArray readableArray) {
        ReadableArray readableArray2 = readableArray;
        if (PatchProxy.isSupport(new Object[]{readableArray2}, this, f53156a, false, 55342, new Class[]{ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{readableArray2}, this, f53156a, false, 55342, new Class[]{ReadableArray.class}, Void.TYPE);
            return;
        }
        int[] iArr = new int[readableArray.size()];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = readableArray2.getInt(i2);
        }
        this.h = iArr;
        a();
    }

    public void setEndPosition(ReadableArray readableArray) {
        ReadableArray readableArray2 = readableArray;
        if (PatchProxy.isSupport(new Object[]{readableArray2}, this, f53156a, false, 55341, new Class[]{ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{readableArray2}, this, f53156a, false, 55341, new Class[]{ReadableArray.class}, Void.TYPE);
            return;
        }
        this.g = new float[]{(float) readableArray2.getDouble(0), (float) readableArray2.getDouble(1)};
        a();
    }

    public void setLocations(ReadableArray readableArray) {
        ReadableArray readableArray2 = readableArray;
        if (PatchProxy.isSupport(new Object[]{readableArray2}, this, f53156a, false, 55343, new Class[]{ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{readableArray2}, this, f53156a, false, 55343, new Class[]{ReadableArray.class}, Void.TYPE);
            return;
        }
        float[] fArr = new float[readableArray.size()];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr[i2] = (float) readableArray2.getDouble(i2);
        }
        this.f53160e = fArr;
        a();
    }

    public void setStartPosition(ReadableArray readableArray) {
        ReadableArray readableArray2 = readableArray;
        if (PatchProxy.isSupport(new Object[]{readableArray2}, this, f53156a, false, 55340, new Class[]{ReadableArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{readableArray2}, this, f53156a, false, 55340, new Class[]{ReadableArray.class}, Void.TYPE);
            return;
        }
        this.f53161f = new float[]{(float) readableArray2.getDouble(0), (float) readableArray2.getDouble(1)};
        a();
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f53156a, false, 55345, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f53156a, false, 55345, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i = new int[]{i2, i3};
        b();
        a();
    }
}
