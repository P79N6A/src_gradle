package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74355a;

    /* renamed from: b  reason: collision with root package name */
    Paint f74356b;

    /* renamed from: c  reason: collision with root package name */
    int f74357c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f74358d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f74359e;

    /* renamed from: f  reason: collision with root package name */
    private int f74360f;

    public int getColor() {
        return this.f74357c;
    }

    public b(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f74355a, false, 86326, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f74355a, false, 86326, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        int width = getWidth() / 2;
        float f2 = (float) width;
        canvas.drawCircle(f2, f2, (float) ((width - this.f74360f) - 4), this.f74359e);
        canvas.drawCircle(f2, f2, (float) (width - (this.f74360f * 2)), this.f74356b);
    }

    private b(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null);
        this.f74360f = 6;
        this.f74357c = -1;
        if (PatchProxy.isSupport(new Object[0], this, f74355a, false, 86323, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74355a, false, 86323, new Class[0], Void.TYPE);
            return;
        }
        this.f74359e = new Paint();
        this.f74359e.setColor(-1);
        this.f74359e.setAntiAlias(true);
        this.f74359e.setStyle(Paint.Style.STROKE);
        this.f74359e.setStrokeWidth((float) this.f74360f);
        this.f74356b = new Paint();
        this.f74356b.setColor(this.f74357c);
        this.f74356b.setAntiAlias(true);
        this.f74356b.setStyle(Paint.Style.FILL);
        this.f74356b.setStrokeWidth((float) this.f74360f);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f74355a, false, 86322, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f74355a, false, 86322, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
    }
}
