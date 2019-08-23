package com.ss.android.ugc.aweme.story.comment.widget;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72344a;

    /* renamed from: b  reason: collision with root package name */
    static final Field f72345b;

    static {
        try {
            Field declaredField = ViewPager.LayoutParams.class.getDeclaredField("position");
            f72345b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static View a(ViewPager viewPager) {
        ViewPager viewPager2 = viewPager;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{viewPager2}, null, f72344a, true, 83088, new Class[]{ViewPager.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{viewPager2}, null, f72344a, true, 83088, new Class[]{ViewPager.class}, View.class);
        }
        int currentItem = viewPager.getCurrentItem();
        while (i < viewPager.getChildCount()) {
            View childAt = viewPager2.getChildAt(i);
            ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) childAt.getLayoutParams();
            try {
                int intValue = ((Integer) f72345b.get(layoutParams)).intValue();
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
