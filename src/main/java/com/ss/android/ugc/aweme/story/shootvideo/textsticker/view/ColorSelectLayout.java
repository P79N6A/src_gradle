package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class ColorSelectLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74305a;
    private static final int[] g = {-1, -16777216, -44462, -4253993, -10987818, -13461258, -11282583, -13312, -27843, -8795994, -86617, -5601196, -16159855, -14200006, -7235425, -13421773};

    /* renamed from: b  reason: collision with root package name */
    a f74306b;

    /* renamed from: c  reason: collision with root package name */
    d f74307c;

    /* renamed from: d  reason: collision with root package name */
    private Context f74308d;

    /* renamed from: e  reason: collision with root package name */
    private int f74309e;

    /* renamed from: f  reason: collision with root package name */
    private int f74310f;
    private List<b> h;
    private LinearLayout i;

    public interface a {
        void a(int i);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74305a, false, 86332, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74305a, false, 86332, new Class[0], Void.TYPE);
            return;
        }
        for (b next : this.h) {
            if (next.f74358d) {
                a((View) next, true);
                next.f74358d = false;
            }
        }
    }

    private void b() {
        b bVar;
        if (PatchProxy.isSupport(new Object[0], this, f74305a, false, 86328, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74305a, false, 86328, new Class[0], Void.TYPE);
            return;
        }
        this.i = new LinearLayout(getContext());
        this.f74307c = new d(getContext(), null);
        this.f74307c.addView(this.i, new FrameLayout.LayoutParams(-1, -1));
        this.f74307c.setHorizontalScrollBarEnabled(false);
        addView(this.f74307c, new FrameLayout.LayoutParams(-1, -1));
        this.h.clear();
        for (int i2 = 0; i2 < g.length; i2++) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f74310f, this.f74310f);
            b bVar2 = new b(this.f74308d);
            int i3 = g[i2];
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, bVar2, b.f74355a, false, 86324, new Class[]{Integer.TYPE}, b.class)) {
                b bVar3 = bVar2;
                bVar = (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, bVar3, b.f74355a, false, 86324, new Class[]{Integer.TYPE}, b.class);
            } else {
                bVar2.f74357c = i3;
                bVar2.f74356b.setColor(bVar2.f74357c);
                bVar = bVar2;
            }
            if (PatchProxy.isSupport(new Object[0], bVar, b.f74355a, false, 86325, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, b.f74355a, false, 86325, new Class[0], Void.TYPE);
            } else {
                bVar.invalidate();
            }
            bVar2.setTag(Integer.valueOf(g[i2]));
            if (i2 == g.length - 1) {
                layoutParams.rightMargin = (int) UIUtils.dip2Px(this.f74308d, 12.0f);
            } else {
                layoutParams.rightMargin = this.f74309e;
            }
            if (i2 == 0) {
                layoutParams.leftMargin = (int) UIUtils.dip2Px(this.f74308d, 12.0f);
            } else {
                layoutParams.leftMargin = (int) UIUtils.dip2Px(this.f74308d, 2.0f);
            }
            layoutParams.gravity = 16;
            this.i.addView(bVar2, layoutParams);
            this.h.add(bVar2);
            bVar2.setOnClickListener(new c(this, bVar2));
        }
        setSelectColorView(-1);
    }

    public void setColorChangeListener(a aVar) {
        this.f74306b = aVar;
    }

    public ColorSelectLayout(Context context) {
        this(context, null);
    }

    public void setSelectColorView(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74305a, false, 86331, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74305a, false, 86331, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a();
        for (b next : this.h) {
            if (next != null && next.getColor() == i2) {
                a((View) next, false);
                next.f74358d = true;
                this.f74307c.a(next);
                return;
            }
        }
    }

    public ColorSelectLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f74310f = 80;
        this.h = new ArrayList();
        this.f74308d = context;
        this.f74309e = (int) UIUtils.dip2Px(context, 6.0f);
        this.f74310f = (int) UIUtils.dip2Px(context, 30.0f);
        b();
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74305a, false, 86327, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f74305a, false, 86327, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.f74310f = getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    public void a(View view, boolean z) {
        float f2;
        float f3;
        float f4;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f74305a, false, 86329, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z)}, this, f74305a, false, 86329, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f5 = 1.0f;
        if (z) {
            f2 = 1.2f;
        } else {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = 1.2f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "scaleX", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f4 = 1.2f;
        } else {
            f4 = 1.0f;
        }
        fArr2[0] = f4;
        if (!z) {
            f5 = 1.2f;
        }
        fArr2[1] = f5;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", fArr2);
        animatorSet.setDuration(200);
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public final void a(boolean z, int i2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f74305a, false, 86330, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2)}, this, f74305a, false, 86330, new Class[]{Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a();
        if (z) {
            setSelectColorView(i2);
        }
    }
}
