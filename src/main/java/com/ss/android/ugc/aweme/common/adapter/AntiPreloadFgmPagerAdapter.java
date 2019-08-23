package com.ss.android.ugc.aweme.common.adapter;

import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class AntiPreloadFgmPagerAdapter extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40166a;

    /* renamed from: b  reason: collision with root package name */
    protected final FragmentManager f40167b;

    /* renamed from: c  reason: collision with root package name */
    protected FragmentTransaction f40168c;

    /* renamed from: d  reason: collision with root package name */
    private Fragment f40169d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray<String> f40170e = new SparseArray<>();

    private static long b(int i) {
        return (long) i;
    }

    public abstract Fragment a(int i);

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void startUpdate(ViewGroup viewGroup) {
    }

    public AntiPreloadFgmPagerAdapter(FragmentManager fragmentManager) {
        this.f40167b = fragmentManager;
    }

    private String c(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40166a, false, 33369, new Class[]{Integer.TYPE}, String.class)) {
            return String.valueOf(b(i));
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40166a, false, 33369, new Class[]{Integer.TYPE}, String.class);
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f40166a, false, 33366, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f40166a, false, 33366, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        if (this.f40168c != null) {
            try {
                this.f40168c.commitAllowingStateLoss();
                this.f40168c = null;
                this.f40167b.executePendingTransactions();
            } catch (IllegalStateException unused) {
            }
        }
    }

    private String a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f40166a, false, 33368, new Class[]{Integer.TYPE, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f40166a, false, 33368, new Class[]{Integer.TYPE, Integer.TYPE}, String.class);
        }
        return "android:switcher:" + i + ":" + c(i2);
    }

    public boolean isViewFromObject(View view, Object obj) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, obj}, this, f40166a, false, 33367, new Class[]{View.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, obj}, this, f40166a, false, 33367, new Class[]{View.class, Object.class}, Boolean.TYPE)).booleanValue();
        } else if (((Fragment) obj).getView() == view2) {
            return true;
        } else {
            return false;
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f40166a, false, 33363, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f40166a, false, 33363, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        if (this.f40168c == null) {
            this.f40168c = this.f40167b.beginTransaction();
        }
        String a2 = a(viewGroup.getId(), i);
        Fragment findFragmentByTag = this.f40167b.findFragmentByTag(a2);
        if (findFragmentByTag != null) {
            this.f40168c.attach(findFragmentByTag);
        } else {
            findFragmentByTag = a(i);
            if (findFragmentByTag == this.f40169d) {
                this.f40168c.add(viewGroup.getId(), findFragmentByTag, a2);
                this.f40170e.put(i, a2);
            }
        }
        if (findFragmentByTag != this.f40169d) {
            findFragmentByTag.setMenuVisibility(false);
            findFragmentByTag.setUserVisibleHint(false);
        }
        return findFragmentByTag;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f40166a, false, 33364, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f40166a, false, 33364, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        if (this.f40168c == null) {
            this.f40168c = this.f40167b.beginTransaction();
        }
        this.f40168c.detach((Fragment) obj);
        int i2 = i;
        this.f40170e.remove(i);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f40166a, false, 33365, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f40166a, false, 33365, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f40169d) {
            if (TextUtils.isEmpty(fragment.getTag()) || !fragment.getTag().equals(this.f40170e.get(i, ""))) {
                String a2 = a(viewGroup.getId(), i);
                if (this.f40168c == null) {
                    this.f40168c = this.f40167b.beginTransaction();
                }
                this.f40168c.add(viewGroup.getId(), fragment, a2);
                this.f40170e.put(i, a2);
            }
            if (this.f40169d != null) {
                this.f40169d.setMenuVisibility(false);
                this.f40169d.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f40169d = fragment;
        }
    }
}
