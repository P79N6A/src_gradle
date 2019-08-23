package com.ss.android.ugc.aweme.lego.lazy;

import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class LazyPagerAdapter<T> extends PagerAdapter {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f53071b;

    /* renamed from: c  reason: collision with root package name */
    protected SparseArray<T> f53072c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    protected T f53073d;

    public abstract T a(ViewGroup viewGroup, int i);

    public abstract T b(ViewGroup viewGroup, int i);

    public final boolean a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53071b, false, 55135, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53071b, false, 55135, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f53072c.get(i) != null) {
            return true;
        } else {
            return false;
        }
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f53071b, false, 55136, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f53071b, false, 55136, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        this.f53073d = a(viewGroup, i);
    }
}
