package com.ss.android.ugc.aweme.profile.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.ss.android.ugc.aweme.newfollow.userstate.UserStateFragment;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.eg;

public class ProfileFragmentAdapter2<T extends AmeBaseFragment> extends FragmentPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62232a;

    /* renamed from: b  reason: collision with root package name */
    boolean f62233b;

    /* renamed from: c  reason: collision with root package name */
    String f62234c;

    /* renamed from: d  reason: collision with root package name */
    public int f62235d;

    /* renamed from: e  reason: collision with root package name */
    private int f62236e;

    private int a() {
        if (PatchProxy.isSupport(new Object[0], this, f62232a, false, 68833, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f62232a, false, 68833, new Class[0], Integer.TYPE)).intValue();
        } else if (b()) {
            return 0;
        } else {
            return -1;
        }
    }

    private boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f62232a, false, 68839, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62232a, false, 68839, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!AbTestManager.a().aU()) {
            z = true;
        }
        return z;
    }

    public int getCount() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f62232a, false, 68832, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f62232a, false, 68832, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f62233b) {
            i = a() + 4;
        } else {
            i = a() + 3;
        }
        if (this.f62236e != i) {
            this.f62236e = i;
            notifyDataSetChanged();
        }
        return this.f62236e;
    }

    private String a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62232a, false, 68838, new Class[]{Integer.TYPE}, String.class)) {
            return eg.a((int) getItemId(i));
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62232a, false, 68838, new Class[]{Integer.TYPE}, String.class);
    }

    public int getItemPosition(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62232a, false, 68834, new Class[]{Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f62232a, false, 68834, new Class[]{Object.class}, Integer.TYPE)).intValue();
        }
        int i = -2;
        if ((obj instanceof OriginMusicListFragment) && this.f62233b) {
            i = 0;
        }
        if (!(obj instanceof AwemeListFragment)) {
            return i;
        }
        if (this.f62233b) {
            if (((AwemeListFragment) obj).f3787d == 0) {
                return 1;
            }
            return a() + 3;
        } else if (((AwemeListFragment) obj).f3787d == 0) {
            return 0;
        } else {
            return a() + 2;
        }
    }

    public long getItemId(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62232a, false, 68835, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62232a, false, 68835, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
        }
        if (this.f62233b) {
            if (i2 == 0) {
                return 3;
            }
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                if (AbTestManager.a().aV()) {
                    return 8;
                }
                return 5;
            } else if (i2 == 3) {
                return 1;
            }
        } else if (i2 == 0) {
            return 0;
        } else {
            if (i2 == 1) {
                if (AbTestManager.a().aV()) {
                    return 8;
                }
                return 5;
            } else if (i2 == 2) {
                return 1;
            }
        }
        return 0;
    }

    public Fragment getItem(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62232a, false, 68831, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62232a, false, 68831, new Class[]{Integer.TYPE}, Fragment.class);
        } else if (i2 == 0) {
            if (this.f62233b) {
                OriginMusicListFragment a2 = OriginMusicListFragment.a("", false);
                a2.k = a(i);
                return a2;
            }
            IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            String str = this.f62234c;
            if (this.f62235d == i2) {
                z4 = true;
            } else {
                z4 = false;
            }
            AwemeListFragment createAwemeListFragment = iBridgeService.createAwemeListFragment(-1, 0, str, "", false, z4);
            createAwemeListFragment.k = a(i);
            return createAwemeListFragment;
        } else if (i2 == 1) {
            if (this.f62233b) {
                IBridgeService iBridgeService2 = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
                String str2 = this.f62234c;
                if (this.f62235d == i2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AwemeListFragment createAwemeListFragment2 = iBridgeService2.createAwemeListFragment(-1, 0, str2, "", false, z3);
                createAwemeListFragment2.k = a(i);
                return createAwemeListFragment2;
            }
            UserStateFragment a3 = UserStateFragment.a("others_homepage", this.f62234c, "");
            a3.k = a(i);
            return a3;
        } else if (i2 == 2) {
            if (this.f62233b) {
                UserStateFragment a4 = UserStateFragment.a("others_homepage", this.f62234c, "");
                a4.k = a(i);
                return a4;
            } else if (!b()) {
                return null;
            } else {
                IBridgeService iBridgeService3 = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
                String str3 = this.f62234c;
                if (this.f62235d == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                AwemeListFragment createAwemeListFragment3 = iBridgeService3.createAwemeListFragment(-1, 1, str3, "", false, z2);
                createAwemeListFragment3.k = a(i);
                return createAwemeListFragment3;
            }
        } else if (i2 != 3 || !b()) {
            return null;
        } else {
            IBridgeService iBridgeService4 = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
            String str4 = this.f62234c;
            if (this.f62235d == i2) {
                z = true;
            } else {
                z = false;
            }
            AwemeListFragment createAwemeListFragment4 = iBridgeService4.createAwemeListFragment(-1, 1, str4, "", false, z);
            createAwemeListFragment4.k = a(i);
            return createAwemeListFragment4;
        }
    }
}
