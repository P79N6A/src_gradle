package com.ss.android.newmedia.app;

import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SimpleViewPagerChangeListener extends ViewPager.SimpleOnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30158a;

    /* renamed from: b  reason: collision with root package name */
    protected long f30159b;

    /* renamed from: c  reason: collision with root package name */
    protected long f30160c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f30161d;

    public void onPageScrolled(int i, float f2, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f30158a, false, 18555, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f30158a, false, 18555, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i != 0 || i2 > 0) {
            this.f30161d = false;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f30160c > 800) {
                this.f30161d = false;
            }
            this.f30160c = currentTimeMillis;
            if (!this.f30161d) {
                this.f30161d = true;
            } else if (currentTimeMillis - this.f30159b > 2000) {
                this.f30159b = currentTimeMillis;
            }
        }
    }
}
