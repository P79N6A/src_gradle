package com.ss.android.ugc.aweme.shortvideo.ui;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

public class InfiniteLoopPagerAdapter extends PagerAdapter {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f70508b;

    /* renamed from: c  reason: collision with root package name */
    static Field f70509c;

    /* renamed from: d  reason: collision with root package name */
    PagerAdapter f70510d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f70511e = true;

    public int getItemPosition(Object obj) {
        return -2;
    }

    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f70509c = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f70508b, false, 80219, new Class[0], Integer.TYPE)) {
            return this.f70510d.getCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f70508b, false, 80219, new Class[0], Integer.TYPE)).intValue();
    }

    public void notifyDataSetChanged() {
        if (PatchProxy.isSupport(new Object[0], this, f70508b, false, 80221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70508b, false, 80221, new Class[0], Void.TYPE);
            return;
        }
        this.f70510d.notifyDataSetChanged();
    }

    public Parcelable saveState() {
        if (!PatchProxy.isSupport(new Object[0], this, f70508b, false, 80212, new Class[0], Parcelable.class)) {
            return this.f70510d.saveState();
        }
        return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f70508b, false, 80212, new Class[0], Parcelable.class);
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70508b, false, 80222, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70508b, false, 80222, new Class[0], Void.TYPE);
            return;
        }
        try {
            DataSetObserver dataSetObserver = (DataSetObserver) f70509c.get(this);
            DataSetObserver dataSetObserver2 = (DataSetObserver) f70509c.get(this.f70510d);
            if (dataSetObserver == null && dataSetObserver2 != null) {
                f70509c.set(this.f70510d, null);
            }
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f70508b, false, 80218, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f70508b, false, 80218, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            f70509c.set(this.f70510d, (DataSetObserver) f70509c.get(this));
            if (!this.f70511e || c() == 1) {
                return c();
            }
            return Integer.MAX_VALUE;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    public InfiniteLoopPagerAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            this.f70510d = pagerAdapter;
            return;
        }
        throw new NullPointerException();
    }

    public void finishUpdate(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f70508b, false, 80211, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f70508b, false, 80211, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f70510d.finishUpdate(view2);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        DataSetObserver dataSetObserver2 = dataSetObserver;
        if (PatchProxy.isSupport(new Object[]{dataSetObserver2}, this, f70508b, false, 80214, new Class[]{DataSetObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataSetObserver2}, this, f70508b, false, 80214, new Class[]{DataSetObserver.class}, Void.TYPE);
            return;
        }
        this.f70510d.registerDataSetObserver(dataSetObserver2);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        DataSetObserver dataSetObserver2 = dataSetObserver;
        if (PatchProxy.isSupport(new Object[]{dataSetObserver2}, this, f70508b, false, 80215, new Class[]{DataSetObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataSetObserver2}, this, f70508b, false, 80215, new Class[]{DataSetObserver.class}, Void.TYPE);
            return;
        }
        this.f70510d.unregisterDataSetObserver(dataSetObserver2);
    }

    public void finishUpdate(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f70508b, false, 80208, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f70508b, false, 80208, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        this.f70510d.finishUpdate(viewGroup2);
    }

    public CharSequence getPageTitle(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70508b, false, 80216, new Class[]{Integer.TYPE}, CharSequence.class)) {
            return this.f70510d.getPageTitle(i);
        }
        return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70508b, false, 80216, new Class[]{Integer.TYPE}, CharSequence.class);
    }

    public float getPageWidth(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70508b, false, 80217, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return this.f70510d.getPageWidth(i);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70508b, false, 80217, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
    }

    public void startUpdate(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f70508b, false, 80209, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f70508b, false, 80209, new Class[]{View.class}, Void.TYPE);
            return;
        }
        a();
        this.f70510d.startUpdate(view2);
    }

    public void startUpdate(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f70508b, false, 80206, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f70508b, false, 80206, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        a();
        this.f70510d.startUpdate(viewGroup2);
    }

    public Object instantiateItem(View view, int i) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f70508b, false, 80203, new Class[]{View.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f70508b, false, 80203, new Class[]{View.class, Integer.TYPE}, Object.class);
        }
        int count = this.f70510d.getCount();
        if (count == 0) {
            return null;
        }
        return this.f70510d.instantiateItem(view, i % count);
    }

    public boolean isViewFromObject(View view, Object obj) {
        View view2 = view;
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{view2, obj2}, this, f70508b, false, 80220, new Class[]{View.class, Object.class}, Boolean.TYPE)) {
            return this.f70510d.isViewFromObject(view2, obj2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, obj2}, this, f70508b, false, 80220, new Class[]{View.class, Object.class}, Boolean.TYPE)).booleanValue();
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        Parcelable parcelable2 = parcelable;
        ClassLoader classLoader2 = classLoader;
        if (PatchProxy.isSupport(new Object[]{parcelable2, classLoader2}, this, f70508b, false, 80213, new Class[]{Parcelable.class, ClassLoader.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable2, classLoader2}, this, f70508b, false, 80213, new Class[]{Parcelable.class, ClassLoader.class}, Void.TYPE);
            return;
        }
        this.f70510d.restoreState(parcelable2, classLoader2);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f70508b, false, 80202, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f70508b, false, 80202, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        int count = this.f70510d.getCount();
        if (count == 0) {
            return null;
        }
        return this.f70510d.instantiateItem(viewGroup, i % count);
    }

    public void destroyItem(View view, int i, Object obj) {
        View view2 = view;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), obj2}, this, f70508b, false, 80205, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), obj2}, this, f70508b, false, 80205, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        int count = this.f70510d.getCount();
        if (count != 0) {
            this.f70510d.destroyItem(view, i / count, obj2);
        }
    }

    public void setPrimaryItem(View view, int i, Object obj) {
        View view2 = view;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), obj2}, this, f70508b, false, 80210, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), obj2}, this, f70508b, false, 80210, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        this.f70510d.setPrimaryItem(view2, i, obj2);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f70508b, false, 80204, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f70508b, false, 80204, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        int count = this.f70510d.getCount();
        if (count != 0) {
            this.f70510d.destroyItem(viewGroup, i / count, obj2);
        }
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f70508b, false, 80207, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f70508b, false, 80207, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        this.f70510d.setPrimaryItem(viewGroup2, i, obj2);
    }
}
