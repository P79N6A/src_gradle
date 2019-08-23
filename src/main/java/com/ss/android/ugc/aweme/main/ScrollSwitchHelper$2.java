package com.ss.android.ugc.aweme.main;

import android.content.Context;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.page.PageManager;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragment;

class ScrollSwitchHelper$2 implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54272a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f54273b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ bu f54274c;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f2, int i2) {
    }

    public void onPageSelected(int i) {
        String str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54272a, false, 57704, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54272a, false, 57704, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if ("page_profile".equals(this.f54274c.a(i2))) {
            String str2 = this.f54274c.f54649b;
            if (this.f54274c.g == null) {
                str = "";
            } else {
                str = this.f54274c.g.getAid();
            }
            if (PatchProxy.isSupport(new Object[]{str2, str}, null, AwemeListFragment.f3784a, true, 67768, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, str}, null, AwemeListFragment.f3784a, true, 67768, new Class[]{String.class, String.class}, Void.TYPE);
            } else {
                AwemeListFragment.C = str2;
                AwemeListFragment.D = str;
                AwemeListFragment.B = SystemClock.uptimeMillis();
            }
        }
        Context context = this.f54273b;
        String a2 = this.f54274c.a(i2);
        if (PatchProxy.isSupport(new Object[]{context, a2}, null, PageManager.f54874a, true, 58155, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, a2}, null, PageManager.f54874a, true, 58155, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        if (context instanceof FragmentActivity) {
            PageManager.a((FragmentActivity) context).f54875b.setValue(a2);
        }
    }

    ScrollSwitchHelper$2(bu buVar, Context context) {
        this.f54274c = buVar;
        this.f54273b = context;
    }
}
