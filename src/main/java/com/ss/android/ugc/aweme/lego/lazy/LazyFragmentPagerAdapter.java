package com.ss.android.ugc.aweme.lego.lazy;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class LazyFragmentPagerAdapter extends LazyPagerAdapter<Fragment> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53068a;

    /* renamed from: e  reason: collision with root package name */
    private final FragmentManager f53069e;

    /* renamed from: f  reason: collision with root package name */
    private FragmentTransaction f53070f;

    public interface a {
    }

    private static long b(int i) {
        return (long) i;
    }

    public void startUpdate(@NonNull ViewGroup viewGroup) {
    }

    public LazyFragmentPagerAdapter(FragmentManager fragmentManager) {
        this.f53069e = fragmentManager;
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{viewGroup}, this, f53068a, false, 55131, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f53068a, false, 55131, new Class[]{ViewGroup.class}, Void.TYPE);
            return;
        }
        if (this.f53070f != null) {
            this.f53070f.commitAllowingStateLoss();
            this.f53070f = null;
            this.f53069e.executePendingTransactions();
        }
    }

    private static String a(int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, null, f53068a, true, 55134, new Class[]{Integer.TYPE, Long.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, null, f53068a, true, 55134, new Class[]{Integer.TYPE, Long.TYPE}, String.class);
        }
        return "android:switcher:" + i + ":" + j2;
    }

    public boolean isViewFromObject(View view, Object obj) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, obj}, this, f53068a, false, 55133, new Class[]{View.class, Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, obj}, this, f53068a, false, 55133, new Class[]{View.class, Object.class}, Boolean.TYPE)).booleanValue();
        } else if (((Fragment) obj).getView() == view2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Fragment a(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f53068a, false, 55130, new Class[]{ViewGroup.class, Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f53068a, false, 55130, new Class[]{ViewGroup.class, Integer.TYPE}, Fragment.class);
        }
        Fragment fragment = (Fragment) this.f53072c.get(i);
        if (fragment == null) {
            return null;
        }
        String a2 = a(viewGroup.getId(), b(i));
        if (this.f53069e.findFragmentByTag(a2) == null) {
            if (this.f53070f == null) {
                this.f53070f = this.f53069e.beginTransaction();
            }
            this.f53070f.add(viewGroup.getId(), fragment, a2);
            this.f53072c.remove(i);
        }
        return fragment;
    }

    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f53068a, false, 55128, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f53068a, false, 55128, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
        }
        if (this.f53070f == null) {
            this.f53070f = this.f53069e.beginTransaction();
        }
        String a2 = a(viewGroup.getId(), b(i));
        Fragment findFragmentByTag = this.f53069e.findFragmentByTag(a2);
        if (findFragmentByTag != null) {
            this.f53070f.attach(findFragmentByTag);
        } else {
            findFragmentByTag = (Fragment) b(viewGroup, i);
            if (findFragmentByTag instanceof a) {
                this.f53072c.put(i, findFragmentByTag);
            } else {
                this.f53070f.add(viewGroup.getId(), findFragmentByTag, a2);
            }
        }
        if (findFragmentByTag != this.f53073d) {
            findFragmentByTag.setMenuVisibility(false);
            findFragmentByTag.setUserVisibleHint(false);
        }
        return findFragmentByTag;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f53068a, false, 55129, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f53068a, false, 55129, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        if (this.f53070f == null) {
            this.f53070f = this.f53069e.beginTransaction();
        }
        if (this.f53069e.findFragmentByTag(a(viewGroup.getId(), b(i))) == null) {
            this.f53070f.detach((Fragment) obj);
            return;
        }
        int i2 = i;
        this.f53072c.remove(i);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f53068a, false, 55132, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f53068a, false, 55132, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        int i2 = i;
        if (a(i)) {
            startUpdate(viewGroup);
            a(viewGroup, i);
            finishUpdate(viewGroup);
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f53073d) {
            if (this.f53073d != null) {
                ((Fragment) this.f53073d).setMenuVisibility(false);
                ((Fragment) this.f53073d).setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f53073d = fragment;
        }
    }
}
