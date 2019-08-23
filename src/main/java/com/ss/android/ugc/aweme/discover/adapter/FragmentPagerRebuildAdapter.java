package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class FragmentPagerRebuildAdapter<T extends Fragment> extends FragmentPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41611a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f41612b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Integer, T> f41613c;

    public abstract void a(T t, int i);

    public abstract T b(int i);

    public int getCount() {
        return this.f41612b;
    }

    public final List<T> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f41611a, false, 35572, new Class[0], List.class)) {
            return new ArrayList(this.f41613c.values());
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f41611a, false, 35572, new Class[0], List.class);
    }

    public void notifyDataSetChanged() {
        if (PatchProxy.isSupport(new Object[0], this, f41611a, false, 35576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41611a, false, 35576, new Class[0], Void.TYPE);
            return;
        }
        if (this.f41613c != null) {
            this.f41613c.clear();
        }
        super.notifyDataSetChanged();
    }

    @Deprecated
    public Fragment getItem(int i) {
        Fragment b2 = b(i);
        if (b2 != null) {
            return b2;
        }
        throw new UnsupportedOperationException("createFragment(position=" + i + " 没有返回Fragment实例),检查代码确保createFragment方法覆盖所有position");
    }

    public final T a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41611a, false, 35573, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41611a, false, 35573, new Class[]{Integer.TYPE}, Fragment.class);
        } else if (this.f41613c == null || this.f41613c.isEmpty()) {
            return null;
        } else {
            return (Fragment) this.f41613c.get(Integer.valueOf(i));
        }
    }

    public FragmentPagerRebuildAdapter(FragmentManager fragmentManager, int i) {
        super(fragmentManager);
        this.f41612b = i;
        this.f41613c = new LinkedHashMap(i);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f41611a, false, 35575, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f41611a, false, 35575, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        Fragment fragment = (Fragment) instantiateItem;
        a(fragment, i);
        this.f41613c.put(Integer.valueOf(i), fragment);
        return instantiateItem;
    }
}
