package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.base.mainpage.CommonPageFragment;
import com.ss.android.ugc.aweme.main.base.mainpage.MainPagerAdapter;

public final class bj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54590a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f54591b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f54592c;

    public static boolean a(MainPagerAdapter mainPagerAdapter) {
        MainPagerAdapter mainPagerAdapter2 = mainPagerAdapter;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{mainPagerAdapter2}, null, f54590a, true, 57582, new Class[]{MainPagerAdapter.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{mainPagerAdapter2}, null, f54590a, true, 57582, new Class[]{MainPagerAdapter.class}, Boolean.TYPE)).booleanValue();
        } else if (mainPagerAdapter2 == null) {
            return false;
        } else {
            CommonPageFragment d2 = mainPagerAdapter2.d("page_home");
            if (d2 instanceof HomeFragment) {
                z = ((HomeFragment) d2).a();
            }
            return z;
        }
    }
}
