package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.ViewPagerIndicatorLayout;

public class IndicatorView extends ViewPagerIndicatorLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43307a;

    public IndicatorView(Context context) {
        this(context, null);
    }

    public final void a(ViewPager viewPager) {
        if (PatchProxy.isSupport(new Object[]{viewPager}, this, f43307a, false, 38260, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager}, this, f43307a, false, 38260, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        setUpViewPager(viewPager);
    }

    public IndicatorView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IndicatorView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
