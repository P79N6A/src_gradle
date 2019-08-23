package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.views.RtlViewPager;
import java.lang.reflect.Field;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34796a;

    /* renamed from: b  reason: collision with root package name */
    static final Field f34797b;

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a$a  reason: collision with other inner class name */
    static class C0449a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34798a;

        C0449a() {
        }

        public final View a(ViewPager viewPager) {
            ViewPager viewPager2 = viewPager;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{viewPager2}, this, f34798a, false, 24708, new Class[]{ViewPager.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{viewPager2}, this, f34798a, false, 24708, new Class[]{ViewPager.class}, View.class);
            } else if (viewPager2 == null) {
                return null;
            } else {
                int currentItem = viewPager.getCurrentItem();
                while (i < viewPager.getChildCount()) {
                    View childAt = viewPager2.getChildAt(i);
                    ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                    try {
                        int intValue = ((Integer) a.f34797b.get(layoutParams)).intValue();
                        if (!layoutParams.isDecor && currentItem == intValue) {
                            return childAt;
                        }
                        i++;
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                return null;
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34799a;

        b() {
        }

        public final View a(ViewPager viewPager) {
            ViewPager viewPager2 = viewPager;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{viewPager2}, this, f34799a, false, 24709, new Class[]{ViewPager.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{viewPager2}, this, f34799a, false, 24709, new Class[]{ViewPager.class}, View.class);
            } else if (viewPager2 == null || !(viewPager2 instanceof RtlViewPager)) {
                return null;
            } else {
                RtlViewPager rtlViewPager = (RtlViewPager) viewPager2;
                int currentItem = viewPager.getCurrentItem();
                while (i < viewPager.getChildCount()) {
                    View childAt = viewPager2.getChildAt(i);
                    ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
                    try {
                        int intValue = ((Integer) a.f34797b.get(layoutParams)).intValue();
                        if (rtlViewPager.a()) {
                            intValue = (rtlViewPager.getItemCount() - intValue) - 1;
                        }
                        if (!layoutParams.isDecor && currentItem == intValue) {
                            return childAt;
                        }
                        i++;
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                return null;
            }
        }
    }

    static {
        try {
            Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
            f34797b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static View a(ViewPager viewPager) {
        ViewPager viewPager2 = viewPager;
        if (PatchProxy.isSupport(new Object[]{viewPager2}, null, f34796a, true, 24707, new Class[]{ViewPager.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{viewPager2}, null, f34796a, true, 24707, new Class[]{ViewPager.class}, View.class);
        } else if (viewPager2 == null || !(viewPager2 instanceof RtlViewPager)) {
            return new C0449a().a(viewPager2);
        } else {
            return new b().a(viewPager2);
        }
    }
}
