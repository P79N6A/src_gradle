package com.bytedance.android.livesdk.widget;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class LiveFragmentStatePagerAdapter extends PagerAdapter {
    public static ChangeQuickRedirect h;

    /* renamed from: a  reason: collision with root package name */
    private final FragmentManager f18238a;

    /* renamed from: b  reason: collision with root package name */
    private FragmentTransaction f18239b;

    /* renamed from: c  reason: collision with root package name */
    private Fragment f18240c;

    public abstract Fragment a(int i);

    public long c(int i) {
        return (long) i;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public LiveFragmentStatePagerAdapter(FragmentManager fragmentManager) {
        this.f18238a = fragmentManager;
    }

    public void finishUpdate(@NonNull ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, h, false, 14455, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup}, this, h, false, 14455, new Class[]{ViewGroup.class}, Void.TYPE);
        } else if (this.f18239b != null) {
            try {
                this.f18239b.commitNowAllowingStateLoss();
                this.f18238a.executePendingTransactions();
            } catch (IllegalStateException unused) {
            } catch (NullPointerException unused2) {
            } finally {
                this.f18239b = null;
            }
        }
    }

    public void startUpdate(@NonNull ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, h, false, 14451, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup}, this, h, false, 14451, new Class[]{ViewGroup.class}, Void.TYPE);
        } else if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    private static String a(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, null, h, true, 14457, new Class[]{Integer.TYPE, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, null, h, true, 14457, new Class[]{Integer.TYPE, Long.TYPE}, String.class);
        }
        return "android:switcher:" + i + ":" + j2;
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, obj}, this, h, false, 14456, new Class[]{View.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, obj}, this, h, false, 14456, new Class[]{View.class, Object.class}, Boolean.TYPE)).booleanValue();
        } else if (((Fragment) obj).getView() == view2) {
            return true;
        } else {
            return false;
        }
    }

    @SuppressLint({"CommitTransaction"})
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, h, false, 14452, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, h, false, 14452, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        if (this.f18239b == null) {
            this.f18239b = this.f18238a.beginTransaction();
        }
        long c2 = c(i);
        Fragment findFragmentByTag = this.f18238a.findFragmentByTag(a(viewGroup.getId(), c2));
        if (findFragmentByTag != null) {
            this.f18239b.attach(findFragmentByTag);
        } else {
            findFragmentByTag = a(i);
            this.f18239b.add(viewGroup.getId(), findFragmentByTag, a(viewGroup.getId(), c2));
        }
        if (findFragmentByTag != this.f18240c) {
            findFragmentByTag.setMenuVisibility(false);
            findFragmentByTag.setUserVisibleHint(false);
        }
        return findFragmentByTag;
    }

    @SuppressLint({"CommitTransaction"})
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, h, false, 14453, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, h, false, 14453, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        if (this.f18239b == null) {
            this.f18239b = this.f18238a.beginTransaction();
        }
        this.f18239b.remove((Fragment) obj);
    }

    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, h, false, 14454, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, h, false, 14454, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f18240c) {
            if (this.f18240c != null) {
                this.f18240c.setMenuVisibility(false);
                this.f18240c.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f18240c = fragment;
        }
    }
}
