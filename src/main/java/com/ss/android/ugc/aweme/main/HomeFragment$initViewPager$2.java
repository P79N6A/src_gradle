package com.ss.android.ugc.aweme.main;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.feed.f.u;
import com.ss.android.ugc.aweme.lego.a;
import com.ss.android.ugc.aweme.legoImp.service.DouDouService;
import com.ss.android.ugc.aweme.main.base.HomeViewPager;
import com.ss.android.ugc.aweme.main.c.d;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/main/HomeFragment$initViewPager$2", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "p0", "", "onPageScrolled", "p1", "", "p2", "onPageSelected", "i", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HomeFragment$initViewPager$2 implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54136a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HomeFragment f54137b;

    public final void onPageScrolled(int i, float f2, int i2) {
    }

    HomeFragment$initViewPager$2(HomeFragment homeFragment) {
        this.f54137b = homeFragment;
    }

    public final void onPageScrollStateChanged(int i) {
        this.f54137b.f3513e = i;
    }

    public final void onPageSelected(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54136a, false, 57079, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54136a, false, 57079, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        DouDouService douDouService = (DouDouService) a.i.a(DouDouService.class);
        if (i == 0) {
            bg.a(new d());
            bg.a(new u(false));
            HomeViewPager homeViewPager = this.f54137b.f3510b;
            if (homeViewPager != null) {
                homeViewPager.setCanScroll(true);
            }
            b.b().a((Context) k.a(), "is_enter_story", true);
            douDouService.enableDouDetection(false);
            MutableLiveData<Boolean> mutableLiveData = this.f54137b.g;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(Boolean.TRUE);
            }
            return;
        }
        this.f54137b.e();
        douDouService.enableDouDetection(true);
        MutableLiveData<Boolean> mutableLiveData2 = this.f54137b.g;
        if (mutableLiveData2 != null) {
            mutableLiveData2.setValue(Boolean.FALSE);
        }
    }
}
