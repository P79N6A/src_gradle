package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import android.graphics.Canvas;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PagerIndicator extends View implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50531a;

    /* renamed from: b  reason: collision with root package name */
    private int f50532b;

    /* renamed from: c  reason: collision with root package name */
    private int f50533c;

    /* renamed from: d  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f50534d;

    public void setCount(int i) {
        this.f50533c = i;
    }

    public void setIndex(int i) {
        this.f50532b = i;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f50534d = onPageChangeListener;
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f50531a, false, 50870, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f50531a, false, 50870, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
    }

    public void onPageScrollStateChanged(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50531a, false, 50873, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50531a, false, 50873, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f50534d != null) {
            this.f50534d.onPageScrollStateChanged(i);
        }
    }

    public void onPageSelected(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50531a, false, 50872, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50531a, false, 50872, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f50534d != null) {
            this.f50534d.onPageSelected(i);
        }
    }

    public void onPageScrolled(int i, float f2, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f50531a, false, 50871, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f50531a, false, 50871, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f50534d != null) {
            this.f50534d.onPageScrolled(i, f2, i2);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f50531a, false, 50869, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f50531a, false, 50869, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
