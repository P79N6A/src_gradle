package com.ss.android.ugc.aweme.notification.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.notification.NewsFragment;
import java.util.ArrayList;
import java.util.List;

public class MessagePagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57924a;

    /* renamed from: b  reason: collision with root package name */
    private List<Fragment> f57925b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f57926c;

    public int getCount() {
        if (this.f57926c) {
            return 2;
        }
        return 1;
    }

    public final Fragment a() {
        if (PatchProxy.isSupport(new Object[0], this, f57924a, false, 63058, new Class[0], Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[0], this, f57924a, false, 63058, new Class[0], Fragment.class);
        }
        for (int i = 0; i < this.f57925b.size(); i++) {
            if (this.f57925b.get(i) instanceof NewsFragment) {
                return this.f57925b.get(i);
            }
        }
        return null;
    }

    public long getItemId(int i) {
        if (!this.f57926c || i != 0) {
            return 1;
        }
        return 0;
    }

    public final Fragment a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57924a, false, 63057, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57924a, false, 63057, new Class[]{Integer.TYPE}, Fragment.class);
        } else if (i < this.f57925b.size()) {
            return this.f57925b.get(i);
        } else {
            return null;
        }
    }

    public Fragment getItem(int i) {
        Fragment fragment;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57924a, false, 63055, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57924a, false, 63055, new Class[]{Integer.TYPE}, Fragment.class);
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57924a, false, 63056, new Class[]{Integer.TYPE}, Fragment.class)) {
            fragment = (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57924a, false, 63056, new Class[]{Integer.TYPE}, Fragment.class);
        } else if (!this.f57926c) {
            fragment = new NewsFragment();
        } else if (i != 0) {
            fragment = new NewsFragment();
        } else {
            fragment = b.a().getRelationSelectFragment().b();
        }
        this.f57925b.add(fragment);
        return fragment;
    }

    public MessagePagerAdapter(FragmentManager fragmentManager, boolean z) {
        super(fragmentManager);
        this.f57926c = z;
    }
}
