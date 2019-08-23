package com.ss.android.ugc.aweme.utils;

import android.annotation.SuppressLint;
import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/utils/RealFpsMonitor$startViewPager$1", "Landroid/support/v4/view/ViewPager$SimpleOnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RealFpsMonitor$startViewPager$1 extends ViewPager.SimpleOnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75455a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ dg f75456b;

    @SuppressLint({"LogNotTimber"})
    public final void onPageScrollStateChanged(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f75455a, false, 88513, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f75455a, false, 88513, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i != 0) {
            this.f75456b.f75746b.a();
        } else {
            this.f75456b.f75746b.b();
        }
    }
}
