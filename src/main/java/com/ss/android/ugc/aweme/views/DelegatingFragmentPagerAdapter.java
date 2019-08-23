package com.ss.android.ugc.aweme.views;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class DelegatingFragmentPagerAdapter extends FragmentPagerAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NonNull
    public final PagerAdapter mDelegate;

    static class a extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76311a;

        /* renamed from: b  reason: collision with root package name */
        final DelegatingFragmentPagerAdapter f76312b;

        public final void onChanged() {
            if (PatchProxy.isSupport(new Object[0], this, f76311a, false, 89439, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f76311a, false, 89439, new Class[0], Void.TYPE);
                return;
            }
            if (this.f76312b != null) {
                this.f76312b.superNotifyDataSetChanged();
            }
        }

        public final void onInvalidated() {
            if (PatchProxy.isSupport(new Object[0], this, f76311a, false, 89440, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f76311a, false, 89440, new Class[0], Void.TYPE);
                return;
            }
            onChanged();
        }

        private a(DelegatingFragmentPagerAdapter delegatingFragmentPagerAdapter) {
            this.f76312b = delegatingFragmentPagerAdapter;
        }

        /* synthetic */ a(DelegatingFragmentPagerAdapter delegatingFragmentPagerAdapter, byte b2) {
            this(delegatingFragmentPagerAdapter);
        }
    }

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89422, new Class[0], Integer.TYPE)) {
            return this.mDelegate.getCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89422, new Class[0], Integer.TYPE)).intValue();
    }

    public void notifyDataSetChanged() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89433, new Class[0], Void.TYPE);
            return;
        }
        this.mDelegate.notifyDataSetChanged();
    }

    public Parcelable saveState() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89430, new Class[0], Parcelable.class)) {
            return this.mDelegate.saveState();
        }
        return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89430, new Class[0], Parcelable.class);
    }

    /* access modifiers changed from: package-private */
    public void superNotifyDataSetChanged() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 89434, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 89434, new Class[0], Void.TYPE);
            return;
        }
        super.notifyDataSetChanged();
    }

    @Deprecated
    public void finishUpdate(View view) {
        this.mDelegate.finishUpdate(view);
    }

    @Deprecated
    public void startUpdate(View view) {
        this.mDelegate.startUpdate(view);
    }

    public DelegatingFragmentPagerAdapter(@NonNull PagerAdapter pagerAdapter) {
        super(null);
        this.mDelegate = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new a(this, (byte) 0));
    }

    public void finishUpdate(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 89428, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 89428, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        this.mDelegate.finishUpdate(viewGroup2);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        DataSetObserver dataSetObserver2 = dataSetObserver;
        if (PatchProxy.isSupport(new Object[]{dataSetObserver2}, this, changeQuickRedirect, false, 89435, new Class[]{DataSetObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataSetObserver2}, this, changeQuickRedirect, false, 89435, new Class[]{DataSetObserver.class}, Void.TYPE);
            return;
        }
        this.mDelegate.registerDataSetObserver(dataSetObserver2);
    }

    public void startUpdate(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 89424, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, changeQuickRedirect, false, 89424, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        this.mDelegate.startUpdate(viewGroup2);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        DataSetObserver dataSetObserver2 = dataSetObserver;
        if (PatchProxy.isSupport(new Object[]{dataSetObserver2}, this, changeQuickRedirect, false, 89436, new Class[]{DataSetObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataSetObserver2}, this, changeQuickRedirect, false, 89436, new Class[]{DataSetObserver.class}, Void.TYPE);
            return;
        }
        this.mDelegate.unregisterDataSetObserver(dataSetObserver2);
    }

    public Fragment getItem(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 89423, new Class[]{Integer.TYPE}, Fragment.class)) {
            return ((FragmentPagerAdapter) this.mDelegate).getItem(i);
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 89423, new Class[]{Integer.TYPE}, Fragment.class);
    }

    public int getItemPosition(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, changeQuickRedirect, false, 89432, new Class[]{Object.class}, Integer.TYPE)) {
            return this.mDelegate.getItemPosition(obj2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj2}, this, changeQuickRedirect, false, 89432, new Class[]{Object.class}, Integer.TYPE)).intValue();
    }

    public CharSequence getPageTitle(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 89437, new Class[]{Integer.TYPE}, CharSequence.class)) {
            return this.mDelegate.getPageTitle(i);
        }
        return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 89437, new Class[]{Integer.TYPE}, CharSequence.class);
    }

    public float getPageWidth(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 89438, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return this.mDelegate.getPageWidth(i);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 89438, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
    }

    @Deprecated
    public Object instantiateItem(View view, int i) {
        return this.mDelegate.instantiateItem(view, i);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 89425, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return this.mDelegate.instantiateItem(viewGroup2, i);
        }
        return PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 89425, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
    }

    public boolean isViewFromObject(View view, Object obj) {
        View view2 = view;
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{view2, obj2}, this, changeQuickRedirect, false, 89429, new Class[]{View.class, Object.class}, Boolean.TYPE)) {
            return this.mDelegate.isViewFromObject(view2, obj2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, obj2}, this, changeQuickRedirect, false, 89429, new Class[]{View.class, Object.class}, Boolean.TYPE)).booleanValue();
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        Parcelable parcelable2 = parcelable;
        ClassLoader classLoader2 = classLoader;
        if (PatchProxy.isSupport(new Object[]{parcelable2, classLoader2}, this, changeQuickRedirect, false, 89431, new Class[]{Parcelable.class, ClassLoader.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable2, classLoader2}, this, changeQuickRedirect, false, 89431, new Class[]{Parcelable.class, ClassLoader.class}, Void.TYPE);
            return;
        }
        this.mDelegate.restoreState(parcelable2, classLoader2);
    }

    @Deprecated
    public void destroyItem(View view, int i, Object obj) {
        this.mDelegate.destroyItem(view, i, obj);
    }

    @Deprecated
    public void setPrimaryItem(View view, int i, Object obj) {
        this.mDelegate.setPrimaryItem(view, i, obj);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, changeQuickRedirect, false, 89426, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, changeQuickRedirect, false, 89426, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        this.mDelegate.destroyItem(viewGroup2, i, obj2);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, changeQuickRedirect, false, 89427, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, changeQuickRedirect, false, 89427, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        this.mDelegate.setPrimaryItem(viewGroup2, i, obj2);
    }
}
