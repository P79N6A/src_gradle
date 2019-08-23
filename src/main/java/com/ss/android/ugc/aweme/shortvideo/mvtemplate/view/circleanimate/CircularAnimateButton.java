package com.ss.android.ugc.aweme.shortvideo.mvtemplate.view.circleanimate;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;

public class CircularAnimateButton extends AppCompatButton {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68734a;

    /* renamed from: b  reason: collision with root package name */
    public int f68735b;

    /* renamed from: c  reason: collision with root package name */
    public int f68736c;

    /* renamed from: d  reason: collision with root package name */
    public int f68737d;

    /* renamed from: e  reason: collision with root package name */
    public int f68738e;

    /* renamed from: f  reason: collision with root package name */
    private c f68739f;

    public CircularAnimateButton(Context context) {
        this(context, null);
    }

    private c a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68734a, false, 78114, new Class[]{Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68734a, false, 78114, new Class[]{Integer.TYPE}, c.class);
        }
        GradientDrawable gradientDrawable = (GradientDrawable) bc.a(i, i, 0, this.f68735b);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius((float) this.f68735b);
        c cVar = new c(gradientDrawable);
        cVar.b(i);
        cVar.a(0);
        return cVar;
    }

    public void setBackgroundColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68734a, false, 78112, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68734a, false, 78112, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f68736c = i;
        this.f68739f = a(i);
        setBackgroundCompat(this.f68739f.f68754d);
    }

    @SuppressLint({"NewApi"})
    public void setBackgroundCompat(Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f68734a, false, 78115, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f68734a, false, 78115, new Class[]{Drawable.class}, Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f68734a, false, 78118, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f68734a, false, 78118, new Class[]{b.class}, Void.TYPE);
            return;
        }
        a a2 = a((float) this.f68738e, (float) this.f68735b, this.f68738e, this.f68737d);
        a2.f68745f = this.f68736c;
        a2.g = this.f68736c;
        a2.h = 0;
        a2.i = 0;
        a2.a();
    }

    public CircularAnimateButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68736c = context.getResources().getColor(C0906R.color.y_);
        this.f68735b = (int) UIUtils.dip2Px(context, 22.0f);
        this.f68737d = (int) UIUtils.dip2Px(context, 230.0f);
        this.f68738e = (int) UIUtils.dip2Px(context, 44.0f);
        if (this.f68739f == null) {
            this.f68739f = a(this.f68736c);
        }
        setBackgroundCompat(this.f68739f.f68754d);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f68734a, false, 78113, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f68734a, false, 78113, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        setMeasuredDimension(this.f68737d, this.f68738e);
    }

    public a a(float f2, float f3, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i), Integer.valueOf(i2)}, this, f68734a, false, 78116, new Class[]{Float.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i), Integer.valueOf(i2)}, this, f68734a, false, 78116, new Class[]{Float.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, a.class);
        }
        a aVar = new a(this, this.f68739f);
        aVar.j = f2;
        aVar.k = f3;
        aVar.f68743d = i;
        aVar.f68744e = i2;
        aVar.f68742c = c.f69428f;
        return aVar;
    }
}
