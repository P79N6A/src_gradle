package com.ss.android.ugc.aweme.poi.preview.view.indicator;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Locale;

public class NumberIndicator extends AppCompatTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60275a;

    /* renamed from: b  reason: collision with root package name */
    public ViewPager f60276b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewPager.OnPageChangeListener f60277c;

    public NumberIndicator(Context context) {
        this(context, null);
    }

    public void setViewPager(ViewPager viewPager) {
        if (PatchProxy.isSupport(new Object[]{viewPager}, this, f60275a, false, 65604, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager}, this, f60275a, false, 65604, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        if (!(viewPager == null || viewPager.getAdapter() == null)) {
            this.f60276b = viewPager;
            this.f60276b.removeOnPageChangeListener(this.f60277c);
            this.f60276b.addOnPageChangeListener(this.f60277c);
            this.f60277c.onPageSelected(this.f60276b.getCurrentItem());
        }
    }

    public NumberIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NumberIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f60277c = new ViewPager.OnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60278a;

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f2, int i2) {
            }

            public void onPageSelected(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60278a, false, 65605, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60278a, false, 65605, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (NumberIndicator.this.f60276b.getAdapter() != null && NumberIndicator.this.f60276b.getAdapter().getCount() > 0) {
                    NumberIndicator.this.setText(String.format(Locale.getDefault(), "%s/%s", new Object[]{Integer.valueOf(i + 1), Integer.valueOf(NumberIndicator.this.f60276b.getAdapter().getCount())}));
                }
            }
        };
        if (PatchProxy.isSupport(new Object[0], this, f60275a, false, 65603, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60275a, false, 65603, new Class[0], Void.TYPE);
            return;
        }
        setTextColor(-2130706433);
        setTextSize(14.0f);
    }
}
