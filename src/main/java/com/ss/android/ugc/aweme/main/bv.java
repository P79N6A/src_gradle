package com.ss.android.ugc.aweme.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.ui.DetailPageFragment;
import com.ss.android.ugc.aweme.main.base.TabChangeManager;
import com.ss.android.ugc.aweme.main.base.mainpage.view.ScrollableViewPager;
import com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack;

public final /* synthetic */ class bv implements ScrollableViewPager.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54660a;

    /* renamed from: b  reason: collision with root package name */
    private final bu f54661b;

    bv(bu buVar) {
        this.f54661b = buVar;
    }

    public final boolean a(int i) {
        boolean z;
        boolean z2;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54660a, false, 57700, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54660a, false, 57700, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        bu buVar = this.f54661b;
        if (i2 == -1) {
            if (PatchProxy.isSupport(new Object[0], buVar, bu.f54648a, false, 57689, new Class[0], Boolean.TYPE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], buVar, bu.f54648a, false, 57689, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                int currentItem = buVar.j.getCurrentItem();
                if (currentItem < buVar.k.getCount()) {
                    Fragment a2 = buVar.k.a(currentItem);
                    if (a2 instanceof MainPageFragment) {
                        z2 = bu.a(((MainPageFragment) a2).getCurrentAweme());
                    } else if (a2 instanceof DetailPageFragment) {
                        z2 = bu.a(((DetailPageFragment) a2).getCurrentAweme());
                    } else if ((a2 instanceof HomeFragment) && (buVar.i instanceof FragmentActivity)) {
                        z2 = bu.a(AwemeChangeCallBack.a((FragmentActivity) buVar.i));
                    }
                }
                z2 = false;
            }
            if (z2) {
                return false;
            }
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, buVar, bu.f54648a, false, 57656, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, buVar, bu.f54648a, false, 57656, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            z = (buVar.i instanceof MainActivity) && TextUtils.equals("HOME", TabChangeManager.a((FragmentActivity) (MainActivity) buVar.i).f54419e) && i2 == -1 && MainPageExperimentHelper.j();
        }
        return !z;
    }
}
