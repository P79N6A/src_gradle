package com.ss.android.ugc.aweme.profile.ui;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.util.List;

public class ProfileFragmentAdapter<T extends AmeBaseFragment> extends FragmentPagerAdapter {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f62229c;

    /* renamed from: d  reason: collision with root package name */
    public List<T> f62230d;

    /* renamed from: e  reason: collision with root package name */
    public List<Integer> f62231e;

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f62229c, false, 68824, new Class[0], Integer.TYPE)) {
            return this.f62230d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f62229c, false, 68824, new Class[0], Integer.TYPE)).intValue();
    }

    public ProfileFragmentAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public final int c(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62229c, false, 68826, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f62231e.get(i).intValue();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62229c, false, 68826, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final int d(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62229c, false, 68827, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f62231e.indexOf(Integer.valueOf(i));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62229c, false, 68827, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final Fragment e(int i) {
        if (PatchProxy.isSupport(new Object[]{0}, this, f62229c, false, 68828, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{0}, this, f62229c, false, 68828, new Class[]{Integer.TYPE}, Fragment.class);
        }
        int indexOf = this.f62231e.indexOf(0);
        if (indexOf < 0 || indexOf >= this.f62230d.size()) {
            return null;
        }
        return (Fragment) this.f62230d.get(indexOf);
    }

    public Fragment getItem(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62229c, false, 68823, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) this.f62230d.get(i);
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62229c, false, 68823, new Class[]{Integer.TYPE}, Fragment.class);
    }

    public long getItemId(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62229c, false, 68825, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return (long) this.f62231e.get(i).intValue();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62229c, false, 68825, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
    }

    public int getItemPosition(@NonNull Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62229c, false, 68829, new Class[]{Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f62229c, false, 68829, new Class[]{Object.class}, Integer.TYPE)).intValue();
        } else if (this.f62230d.contains(obj)) {
            return this.f62230d.indexOf(obj);
        } else {
            return -2;
        }
    }

    public CharSequence getPageTitle(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62229c, false, 68830, new Class[]{Integer.TYPE}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62229c, false, 68830, new Class[]{Integer.TYPE}, CharSequence.class);
        }
        Integer num = this.f62231e.get(i);
        if (this.f62230d.get(i) instanceof CommerceChallengeFragment) {
            String str = ((CommerceChallengeFragment) this.f62230d.get(i)).f2868b;
            if (str == null) {
                str = "";
            }
            return str;
        }
        switch (num.intValue()) {
            case 0:
            case 2:
                if (this.f62230d.get(i) == null || !((AmeBaseFragment) this.f62230d.get(i)).isCommerce) {
                    return o.b(C0906R.string.amh);
                }
                return o.b(C0906R.string.yw);
            case 1:
            case 3:
                return o.b(C0906R.string.ahy);
            case 8:
                return o.b(C0906R.string.ub);
            case 9:
                return o.b(C0906R.string.bnt);
            case 10:
                return o.b(C0906R.string.u7);
            case 11:
                return o.b(C0906R.string.u9);
            case SearchNilInfo.HIT_TYPE_SENSITIVE:
                return o.b(C0906R.string.aej);
            case SearchJediMixFeedAdapter.f42514c:
                return o.b(C0906R.string.u5);
            case 17:
                return o.b(C0906R.string.ai1);
            case 18:
                return o.b(C0906R.string.d4);
            case 19:
                return o.b(C0906R.string.ak_);
            default:
                return "";
        }
    }

    public final void a(List<T> list, List<Integer> list2) {
        this.f62230d = list;
        this.f62231e = list2;
    }

    public ProfileFragmentAdapter(FragmentManager fragmentManager, List<T> list, List<Integer> list2) {
        super(fragmentManager);
        this.f62230d = list;
        this.f62231e = list2;
    }
}
