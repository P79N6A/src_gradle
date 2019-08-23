package com.ss.android.ugc.aweme.friends.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.friends.friendlist.FriendListJediFragment;
import com.ss.android.ugc.aweme.friends.ui.FindFriendsJediFragment;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter;
import java.util.ArrayList;
import java.util.List;

public class FriendsPagerAdapter extends ProfileFragmentAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48729a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f48730b = ("android:switcher:" + C0906R.id.duu + ":");

    /* renamed from: f  reason: collision with root package name */
    private Context f48731f;
    private FriendListJediFragment g;
    private FindFriendsJediFragment h;
    private ArrayList<Fragment> i = new ArrayList<>();
    private List<Integer> j = new ArrayList();

    private void f(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48729a, false, 46302, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48729a, false, 46302, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        for (int i3 = 0; i3 < getCount(); i3++) {
            if (getItem(i3) instanceof ProfileListFragment) {
                ProfileListFragment profileListFragment = (ProfileListFragment) getItem(i3);
                if (!(profileListFragment == null || profileListFragment.getFragmentManager() == null)) {
                    if (i3 == i2) {
                        profileListFragment.setUserVisibleHint(true);
                    } else {
                        profileListFragment.setUserVisibleHint(false);
                    }
                    profileListFragment.l();
                }
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48729a, false, 46303, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48729a, false, 46303, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        f(i2);
        if (this.i != null && i2 >= 0 && i2 < this.i.size() && (this.i.get(i2) instanceof ProfileListFragment)) {
            ProfileListFragment profileListFragment = (ProfileListFragment) this.i.get(i2);
            if (profileListFragment != null) {
                profileListFragment.j = true;
            }
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48729a, false, 46304, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48729a, false, 46304, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        f(i2);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48729a, false, 46305, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48729a, false, 46305, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null && i2 >= 0 && i2 < this.i.size() && (this.i.get(i2) instanceof ProfileListFragment)) {
            ProfileListFragment profileListFragment = (ProfileListFragment) this.i.get(i2);
            if (profileListFragment != null && profileListFragment.j()) {
                profileListFragment.H_();
            }
        }
    }

    public FriendsPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.f48731f = context;
        this.g = (FriendListJediFragment) fragmentManager.findFragmentByTag(f48730b + 0);
        if (this.g == null) {
            this.g = new FriendListJediFragment();
        }
        this.i.add(this.g);
        this.j.add(17);
        this.h = (FindFriendsJediFragment) fragmentManager.findFragmentByTag(f48730b + 1);
        if (this.h == null) {
            this.h = new FindFriendsJediFragment();
        }
        this.i.add(this.h);
        this.j.add(18);
        a(this.i, this.j);
    }
}
