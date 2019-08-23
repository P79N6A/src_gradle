package com.ss.android.ugc.aweme.newfollow.ui;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import java.util.ArrayList;

public class FriendTabPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57248a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<Fragment> f57249b = new ArrayList<>();

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f57248a, false, 61610, new Class[0], Integer.TYPE)) {
            return this.f57249b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57248a, false, 61610, new Class[0], Integer.TYPE)).intValue();
    }

    public Fragment getItem(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57248a, false, 61609, new Class[]{Integer.TYPE}, Fragment.class)) {
            return this.f57249b.get(i);
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57248a, false, 61609, new Class[]{Integer.TYPE}, Fragment.class);
    }

    @Nullable
    public CharSequence getPageTitle(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57248a, false, 61611, new Class[]{Integer.TYPE}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57248a, false, 61611, new Class[]{Integer.TYPE}, CharSequence.class);
        } else if (i2 == 0) {
            return k.a().getString(C0906R.string.ai7);
        } else {
            if (i2 == 1) {
                return k.a().getString(C0906R.string.ai8);
            }
            return "";
        }
    }

    public FriendTabPagerAdapter(FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
        super(fragmentManager);
        this.f57249b = arrayList;
    }
}
