package com.ss.android.ugc.aweme.story.base.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.R$styleable;

public class StoryCircleView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71983a;

    /* renamed from: b  reason: collision with root package name */
    private float f71984b;

    /* renamed from: c  reason: collision with root package name */
    private int f71985c;

    /* renamed from: d  reason: collision with root package name */
    private int f71986d;

    /* renamed from: e  reason: collision with root package name */
    private Context f71987e;

    /* renamed from: f  reason: collision with root package name */
    private c f71988f;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f71983a, false, 82433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71983a, false, 82433, new Class[0], Void.TYPE);
            return;
        }
        this.f71988f.f72020e = Float.valueOf(1.0f);
        c cVar = this.f71988f;
        if (PatchProxy.isSupport(new Object[0], cVar, c.f72016a, false, 82381, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, c.f72016a, false, 82381, new Class[0], Void.TYPE);
            return;
        }
        cVar.b();
        cVar.f72021f = true;
        cVar.g = false;
        cVar.invalidateSelf();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f71983a, false, 82434, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71983a, false, 82434, new Class[0], Void.TYPE);
        } else if (this.f71988f != null) {
            c cVar = this.f71988f;
            if (PatchProxy.isSupport(new Object[]{(byte) 0}, cVar, c.f72016a, false, 82380, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                c cVar2 = cVar;
                PatchProxy.accessDispatch(new Object[]{(byte) 0}, cVar2, c.f72016a, false, 82380, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            boolean z = false & cVar.f72021f;
            cVar.b();
            if (z) {
                cVar.f72020e = Float.valueOf((float) (Math.floor((double) cVar.f72019d) + 1.0d));
                return;
            }
            cVar.a();
            cVar.invalidateSelf();
        }
    }

    public StoryCircleView(Context context) {
        this(context, null);
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f71983a, false, 82436, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f71983a, false, 82436, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
    }

    public void setColor(@ColorInt int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71983a, false, 82431, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71983a, false, 82431, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int i2 = i;
        a(i2, i2);
    }

    public void setStrokeWidth(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f71983a, false, 82430, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f71983a, false, 82430, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (f2 >= 0.0f) {
            this.f71984b = f2;
            this.f71988f.a(f2);
            this.f71988f.invalidateSelf();
        }
    }

    public StoryCircleView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71983a, false, 82435, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71983a, false, 82435, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void a(@ColorInt int i, @ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71983a, false, 82432, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71983a, false, 82432, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f71985c = i;
        this.f71986d = i2;
        this.f71988f.a(new int[]{i, i2});
        this.f71988f.invalidateSelf();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoryCircleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, f71983a, false, 82429, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, f71983a, false, 82429, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        this.f71987e = context2;
        if (this.f71988f == null) {
            this.f71988f = new c();
            this.f71988f.f72020e = Float.valueOf(1.0f);
            if (PatchProxy.isSupport(new Object[]{this}, null, c.f72016a, true, 82388, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this}, null, c.f72016a, true, 82388, new Class[]{View.class}, Void.TYPE);
            } else {
                setLayerType(1, null);
                setDrawingCacheEnabled(false);
            }
            setBackground(this.f71988f);
        }
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, R$styleable.StoryCircleView);
        this.f71984b = (float) ((int) obtainStyledAttributes.getDimension(2, UIUtils.dip2Px(context2, 2.0f)));
        this.f71985c = obtainStyledAttributes.getColor(1, Color.parseColor("#10DFF9"));
        this.f71986d = obtainStyledAttributes.getColor(0, Color.parseColor("#0BB8F0"));
        obtainStyledAttributes.recycle();
        this.f71988f.a(this.f71984b);
        this.f71988f.a(new int[]{this.f71985c, this.f71986d});
    }
}
