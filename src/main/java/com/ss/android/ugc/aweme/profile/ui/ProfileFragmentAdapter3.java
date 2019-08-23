package com.ss.android.ugc.aweme.profile.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import java.util.List;

public class ProfileFragmentAdapter3<T extends AmeBaseFragment> extends FragmentPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62237a;

    /* renamed from: b  reason: collision with root package name */
    public int f62238b;

    /* renamed from: c  reason: collision with root package name */
    private List<T> f62239c;

    /* renamed from: d  reason: collision with root package name */
    private List<Integer> f62240d;

    /* renamed from: e  reason: collision with root package name */
    private String f62241e;

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f62237a, false, 68842, new Class[0], Integer.TYPE)) {
            return this.f62239c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f62237a, false, 68842, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f62237a, false, 68841, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f62237a, false, 68841, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f62241e = str2;
        notifyDataSetChanged();
    }

    public Fragment getItem(int i) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62237a, false, 68840, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62237a, false, 68840, new Class[]{Integer.TYPE}, Fragment.class);
        }
        Fragment fragment = (Fragment) this.f62239c.get(i);
        if ((fragment instanceof ProfileListFragment) && (fragment instanceof AwemeListFragment)) {
            AwemeListFragment awemeListFragment = (AwemeListFragment) fragment;
            if (this.f62238b != i) {
                z = false;
            }
            awemeListFragment.u = z;
        }
        return fragment;
    }

    public long getItemId(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62237a, false, 68844, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return (long) this.f62240d.get(i).intValue();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62237a, false, 68844, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
    }

    public int getItemPosition(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62237a, false, 68843, new Class[]{Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f62237a, false, 68843, new Class[]{Object.class}, Integer.TYPE)).intValue();
        } else if (this.f62239c.contains(obj)) {
            return this.f62239c.indexOf(obj);
        } else {
            return -2;
        }
    }

    public ProfileFragmentAdapter3(FragmentManager fragmentManager, List<T> list, List<Integer> list2) {
        super(fragmentManager);
        this.f62239c = list;
        this.f62240d = list2;
    }
}
