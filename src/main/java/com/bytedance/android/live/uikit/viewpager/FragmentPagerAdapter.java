package com.bytedance.android.live.uikit.viewpager;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class FragmentPagerAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8716a;

    /* renamed from: b  reason: collision with root package name */
    protected final FragmentManager f8717b;

    /* renamed from: c  reason: collision with root package name */
    protected FragmentTransaction f8718c;

    /* renamed from: d  reason: collision with root package name */
    private Fragment f8719d;

    public abstract Fragment a(int i);

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void startUpdate(ViewGroup viewGroup) {
    }

    public FragmentPagerAdapter(FragmentManager fragmentManager) {
        this.f8717b = fragmentManager;
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f8716a, false, 2476, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f8716a, false, 2476, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        if (this.f8718c != null) {
            try {
                this.f8718c.commitAllowingStateLoss();
                this.f8718c = null;
                this.f8717b.executePendingTransactions();
            } catch (IllegalStateException unused) {
            }
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, obj}, this, f8716a, false, 2477, new Class[]{View.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, obj}, this, f8716a, false, 2477, new Class[]{View.class, Object.class}, Boolean.TYPE)).booleanValue();
        } else if (((Fragment) obj).getView() == view2) {
            return true;
        } else {
            return false;
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        String str;
        String str2;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8716a, false, 2473, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8716a, false, 2473, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        if (this.f8718c == null) {
            this.f8718c = this.f8717b.beginTransaction();
        }
        int id = viewGroup.getId();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(id), Integer.valueOf(i)}, this, f8716a, false, 2478, new Class[]{Integer.TYPE, Integer.TYPE}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(id), Integer.valueOf(i)}, this, f8716a, false, 2478, new Class[]{Integer.TYPE, Integer.TYPE}, String.class);
        } else {
            StringBuilder sb = new StringBuilder("android:switcher:");
            sb.append(id);
            sb.append(":");
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8716a, false, 2479, new Class[]{Integer.TYPE}, String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8716a, false, 2479, new Class[]{Integer.TYPE}, String.class);
            } else {
                str2 = String.valueOf((long) i2);
            }
            sb.append(str2);
            str = sb.toString();
        }
        Fragment findFragmentByTag = this.f8717b.findFragmentByTag(str);
        if (findFragmentByTag != null) {
            this.f8718c.attach(findFragmentByTag);
        } else {
            findFragmentByTag = a(i);
            this.f8718c.add(viewGroup.getId(), findFragmentByTag, str);
        }
        if (findFragmentByTag != this.f8719d) {
            findFragmentByTag.setMenuVisibility(false);
            findFragmentByTag.setUserVisibleHint(false);
        }
        return findFragmentByTag;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f8716a, false, 2474, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f8716a, false, 2474, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        if (this.f8718c == null) {
            this.f8718c = this.f8717b.beginTransaction();
        }
        this.f8718c.detach((Fragment) obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f8716a, false, 2475, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f8716a, false, 2475, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f8719d) {
            if (this.f8719d != null) {
                this.f8719d.setMenuVisibility(false);
                this.f8719d.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f8719d = fragment;
        }
    }
}
