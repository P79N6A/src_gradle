package com.ss.android.ugc.aweme.effect;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

public class VEEffectSeekBar extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43605a;

    /* renamed from: b  reason: collision with root package name */
    private float f43606b;

    /* renamed from: c  reason: collision with root package name */
    private int f43607c;

    /* renamed from: d  reason: collision with root package name */
    private int f43608d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f43609e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f43610f;
    private ArrayList<EffectPointModel> g;
    private boolean h;
    private RectF i;
    private RectF j;
    private int k;
    @ColorInt
    private int l;
    @ColorInt
    private int m;
    private boolean n;

    public void setFromEnd(boolean z) {
        this.h = z;
    }

    public VEEffectSeekBar(Context context) {
        this(context, null);
    }

    public void setTime(int i2) {
        this.k = i2;
        this.f43606b = ((float) this.f43607c) / ((float) i2);
    }

    public void setEffectPointModels(ArrayList<EffectPointModel> arrayList) {
        ArrayList<EffectPointModel> arrayList2 = arrayList;
        if (PatchProxy.isSupport(new Object[]{arrayList2}, this, f43605a, false, 38757, new Class[]{ArrayList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arrayList2}, this, f43605a, false, 38757, new Class[]{ArrayList.class}, Void.TYPE);
            return;
        }
        this.g = arrayList2;
        postInvalidate();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43605a, false, 38762, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43605a, false, 38762, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.n != z) {
            this.n = z;
            invalidate();
        }
    }

    public void setNormalColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f43605a, false, 38763, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f43605a, false, 38763, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.l = i2;
        if (!this.n) {
            invalidate();
        }
    }

    public void setOverlayColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f43605a, false, 38761, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f43605a, false, 38761, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.m != i2) {
            this.m = i2;
            invalidate();
        }
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f43605a, false, 38760, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f43605a, false, 38760, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (this.n) {
            this.f43609e.setAlpha(230);
            this.f43609e.setColor(this.m);
            canvas.drawRect(this.i, this.f43609e);
            return;
        }
        this.f43609e.setColor(this.l);
        canvas.drawRoundRect(this.i, (float) (this.f43608d / 2), (float) (this.f43608d / 2), this.f43609e);
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            EffectPointModel effectPointModel = this.g.get(i2);
            if (effectPointModel.getSelectColor() != 0) {
                this.f43610f.setColor(effectPointModel.getSelectColor());
                this.f43610f.setAlpha(230);
                if (!effectPointModel.isFromEnd()) {
                    this.j.set(((float) effectPointModel.getStartPoint()) * this.f43606b, 0.0f, ((float) effectPointModel.getEndPoint()) * this.f43606b, (float) this.f43608d);
                } else {
                    this.j.set(((float) effectPointModel.getEndPoint()) * this.f43606b, 0.0f, ((float) effectPointModel.getStartPoint()) * this.f43606b, (float) this.f43608d);
                }
                if (effectPointModel.getStartPoint() == 0 && effectPointModel.getEndPoint() == this.k) {
                    canvas.drawRoundRect(this.j, (float) (this.f43608d / 2), (float) (this.f43608d / 2), this.f43610f);
                } else {
                    canvas.drawRect(this.j, this.f43610f);
                }
            }
        }
    }

    public VEEffectSeekBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f43605a, false, 38759, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f43605a, false, 38759, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.f43608d = View.MeasureSpec.getSize(i3);
        if (this.i == null) {
            this.i = new RectF();
        }
        this.i.set(0.0f, 0.0f, (float) this.f43607c, (float) this.f43608d);
    }

    public VEEffectSeekBar(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (PatchProxy.isSupport(new Object[0], this, f43605a, false, 38758, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43605a, false, 38758, new Class[0], Void.TYPE);
            return;
        }
        this.f43607c = c.f43714c;
        this.f43608d = (int) UIUtils.dip2Px(getContext(), 5.0f);
        this.f43609e = new Paint();
        this.f43609e.setAntiAlias(true);
        this.f43610f = new Paint();
        this.f43610f.setAntiAlias(true);
        this.g = new ArrayList<>();
        this.j = new RectF();
    }
}
