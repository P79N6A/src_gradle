package com.ss.android.ugc.aweme.discover;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.activity.a;
import com.ss.android.ugc.aweme.discover.ui.HotSearchAndDiscoveryFragment2;
import com.ss.android.ugc.aweme.main.base.d;
import com.ss.android.ugc.aweme.main.base.mainpage.CommonContainerFragment;
import com.ss.android.ugc.aweme.main.bu;

public class DiscoverPageFragment extends CommonContainerFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41482a;

    public final String a() {
        return "tag_fragment_discover";
    }

    public final Fragment b() {
        if (!PatchProxy.isSupport(new Object[0], this, f41482a, false, 35422, new Class[0], Fragment.class)) {
            return new HotSearchAndDiscoveryFragment2();
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[0], this, f41482a, false, 35422, new Class[0], Fragment.class);
    }

    public boolean handleBackPress() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f41482a, false, 35424, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f41482a, false, 35424, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f54441c != null && ((a) this.f54441c).d()) {
            z = true;
        }
        return z;
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41482a, false, 35423, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41482a, false, 35423, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (this.f54441c != null) {
            if (z) {
                ((a) this.f54441c).a("", "");
            } else {
                ((a) this.f54441c).c();
            }
            this.f54441c.setUserVisibleHint(z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f41482a, false, 35421, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f41482a, false, 35421, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        ((bu) d.a(getActivity())).a((ViewPager.OnPageChangeListener) new ViewPager.OnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41483a;

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageSelected(int i) {
            }

            public void onPageScrolled(int i, float f2, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f41483a, false, 35425, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f41483a, false, 35425, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (DiscoverPageFragment.this.f54441c != null) {
                    ((a) DiscoverPageFragment.this.f54441c).a();
                }
            }
        });
    }
}
