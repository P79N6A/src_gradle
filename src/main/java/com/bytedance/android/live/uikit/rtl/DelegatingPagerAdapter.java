package com.bytedance.android.live.uikit.rtl;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class DelegatingPagerAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8651a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final PagerAdapter f8652b;

    static class a extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8653a;

        /* renamed from: b  reason: collision with root package name */
        final DelegatingPagerAdapter f8654b;

        public final void onChanged() {
            if (PatchProxy.isSupport(new Object[0], this, f8653a, false, 2243, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8653a, false, 2243, new Class[0], Void.TYPE);
                return;
            }
            if (this.f8654b != null) {
                this.f8654b.a();
            }
        }

        public final void onInvalidated() {
            if (PatchProxy.isSupport(new Object[0], this, f8653a, false, 2244, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f8653a, false, 2244, new Class[0], Void.TYPE);
                return;
            }
            onChanged();
        }

        private a(DelegatingPagerAdapter delegatingPagerAdapter) {
            this.f8654b = delegatingPagerAdapter;
        }

        /* synthetic */ a(DelegatingPagerAdapter delegatingPagerAdapter, byte b2) {
            this(delegatingPagerAdapter);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f8651a, false, 2238, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8651a, false, 2238, new Class[0], Void.TYPE);
            return;
        }
        super.notifyDataSetChanged();
    }

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f8651a, false, 2227, new Class[0], Integer.TYPE)) {
            return this.f8652b.getCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f8651a, false, 2227, new Class[0], Integer.TYPE)).intValue();
    }

    public void notifyDataSetChanged() {
        if (PatchProxy.isSupport(new Object[0], this, f8651a, false, 2237, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8651a, false, 2237, new Class[0], Void.TYPE);
            return;
        }
        this.f8652b.notifyDataSetChanged();
    }

    public Parcelable saveState() {
        if (!PatchProxy.isSupport(new Object[0], this, f8651a, false, 2234, new Class[0], Parcelable.class)) {
            return this.f8652b.saveState();
        }
        return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f8651a, false, 2234, new Class[0], Parcelable.class);
    }

    @Deprecated
    public void finishUpdate(View view) {
        this.f8652b.finishUpdate(view);
    }

    @Deprecated
    public void startUpdate(View view) {
        this.f8652b.startUpdate(view);
    }

    public DelegatingPagerAdapter(@NonNull PagerAdapter pagerAdapter) {
        this.f8652b = pagerAdapter;
        pagerAdapter.registerDataSetObserver(new a(this, (byte) 0));
    }

    public void finishUpdate(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f8651a, false, 2232, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f8651a, false, 2232, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        this.f8652b.finishUpdate(viewGroup2);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        DataSetObserver dataSetObserver2 = dataSetObserver;
        if (PatchProxy.isSupport(new Object[]{dataSetObserver2}, this, f8651a, false, 2239, new Class[]{DataSetObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataSetObserver2}, this, f8651a, false, 2239, new Class[]{DataSetObserver.class}, Void.TYPE);
            return;
        }
        this.f8652b.registerDataSetObserver(dataSetObserver2);
    }

    public void startUpdate(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f8651a, false, 2228, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f8651a, false, 2228, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        this.f8652b.startUpdate(viewGroup2);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        DataSetObserver dataSetObserver2 = dataSetObserver;
        if (PatchProxy.isSupport(new Object[]{dataSetObserver2}, this, f8651a, false, 2240, new Class[]{DataSetObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataSetObserver2}, this, f8651a, false, 2240, new Class[]{DataSetObserver.class}, Void.TYPE);
            return;
        }
        this.f8652b.unregisterDataSetObserver(dataSetObserver2);
    }

    public int getItemPosition(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, this, f8651a, false, 2236, new Class[]{Object.class}, Integer.TYPE)) {
            return this.f8652b.getItemPosition(obj2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj2}, this, f8651a, false, 2236, new Class[]{Object.class}, Integer.TYPE)).intValue();
    }

    public CharSequence getPageTitle(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8651a, false, 2241, new Class[]{Integer.TYPE}, CharSequence.class)) {
            return this.f8652b.getPageTitle(i);
        }
        return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8651a, false, 2241, new Class[]{Integer.TYPE}, CharSequence.class);
    }

    public float getPageWidth(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8651a, false, 2242, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return this.f8652b.getPageWidth(i);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8651a, false, 2242, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
    }

    @Deprecated
    public Object instantiateItem(View view, int i) {
        return this.f8652b.instantiateItem(view, i);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f8651a, false, 2229, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return this.f8652b.instantiateItem(viewGroup2, i);
        }
        return PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f8651a, false, 2229, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
    }

    public boolean isViewFromObject(View view, Object obj) {
        View view2 = view;
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{view2, obj2}, this, f8651a, false, 2233, new Class[]{View.class, Object.class}, Boolean.TYPE)) {
            return this.f8652b.isViewFromObject(view2, obj2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, obj2}, this, f8651a, false, 2233, new Class[]{View.class, Object.class}, Boolean.TYPE)).booleanValue();
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        Parcelable parcelable2 = parcelable;
        ClassLoader classLoader2 = classLoader;
        if (PatchProxy.isSupport(new Object[]{parcelable2, classLoader2}, this, f8651a, false, 2235, new Class[]{Parcelable.class, ClassLoader.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable2, classLoader2}, this, f8651a, false, 2235, new Class[]{Parcelable.class, ClassLoader.class}, Void.TYPE);
            return;
        }
        this.f8652b.restoreState(parcelable2, classLoader2);
    }

    @Deprecated
    public void destroyItem(View view, int i, Object obj) {
        this.f8652b.destroyItem(view, i, obj);
    }

    @Deprecated
    public void setPrimaryItem(View view, int i, Object obj) {
        this.f8652b.setPrimaryItem(view, i, obj);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f8651a, false, 2230, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f8651a, false, 2230, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        this.f8652b.destroyItem(viewGroup2, i, obj2);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f8651a, false, 2231, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj2}, this, f8651a, false, 2231, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        this.f8652b.setPrimaryItem(viewGroup2, i, obj2);
    }
}
