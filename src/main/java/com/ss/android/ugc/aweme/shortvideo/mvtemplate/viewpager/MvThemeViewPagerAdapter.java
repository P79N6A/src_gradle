package com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MvThemeViewPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68770a;

    /* renamed from: b  reason: collision with root package name */
    private List<MvItemFragment> f68771b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<j> f68772c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private FragmentManager f68773d;

    public int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f68770a, false, 78163, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68770a, false, 78163, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f68771b == null) {
            return 0;
        } else {
            return this.f68771b.size();
        }
    }

    public MvThemeViewPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f68773d = fragmentManager;
    }

    /* renamed from: a */
    public final MvItemFragment getItem(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68770a, false, 78162, new Class[]{Integer.TYPE}, MvItemFragment.class)) {
            return (MvItemFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68770a, false, 78162, new Class[]{Integer.TYPE}, MvItemFragment.class);
        } else if (i < 0 || i >= this.f68771b.size()) {
            return null;
        } else {
            return this.f68771b.get(i);
        }
    }

    public final j b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68770a, false, 78165, new Class[]{Integer.TYPE}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68770a, false, 78165, new Class[]{Integer.TYPE}, j.class);
        } else if (!com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) this.f68772c) && i >= 0 && i < this.f68772c.size()) {
            return this.f68772c.get(i);
        } else {
            return null;
        }
    }

    public final void a(List<j> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f68770a, false, 78164, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f68770a, false, 78164, new Class[]{List.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.base.utils.j.a((Collection<T>) list)) {
            this.f68772c.clear();
            this.f68772c.addAll(list);
            for (int i = 0; i < this.f68771b.size(); i++) {
                MvItemFragment mvItemFragment = this.f68771b.get(i);
                if (mvItemFragment != null && i < list.size()) {
                    mvItemFragment.f68759e = list.get(i);
                    mvItemFragment.a();
                }
            }
            for (int size = this.f68771b.size(); size < list.size(); size++) {
                if (list.get(size) != null) {
                    this.f68771b.add(MvItemFragment.a(list.get(size), size));
                }
            }
            notifyDataSetChanged();
        }
    }
}
