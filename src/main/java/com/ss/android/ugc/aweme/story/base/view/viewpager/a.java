package com.ss.android.ugc.aweme.story.base.view.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

public final class a extends Scroller {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72118a;

    public a(Context context) {
        super(context);
    }

    public final void a(ViewPager viewPager) {
        ViewPager viewPager2 = viewPager;
        if (PatchProxy.isSupport(new Object[]{viewPager2}, this, f72118a, false, 82688, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2}, this, f72118a, false, 82688, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            try {
                declaredField.set(viewPager2, this);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }

    public final void startScroll(int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f72118a, false, 82686, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f72118a, false, 82686, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.startScroll(i, i2, i3, i4);
    }

    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        int i6;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f72118a, false, 82687, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f72118a, false, 82687, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int i7 = i5;
        if (i7 == 200) {
            i6 = 500;
        } else {
            i6 = i7;
        }
        super.startScroll(i, i2, i3, i4, i6);
    }
}
