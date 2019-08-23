package com.bytedance.android.live.uikit.viewpager;

import android.view.View;
import com.bytedance.android.live.uikit.b.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ImageViewTouchViewPager extends SSViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8729a;

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f8729a, false, 2489, new Class[]{View.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f8729a, false, 2489, new Class[]{View.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (view2 instanceof a) {
            return ((a) view2).a(i);
        } else {
            int i4 = i;
            return super.canScroll(view, z, i, i2, i3);
        }
    }
}
