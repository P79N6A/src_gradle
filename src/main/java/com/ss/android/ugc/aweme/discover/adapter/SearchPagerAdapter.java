package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.mixfeed.ui.SearchMixFeedFragment;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.presenter.SearchChallengeFragment;
import com.ss.android.ugc.aweme.discover.presenter.SearchFeedFragment;
import com.ss.android.ugc.aweme.discover.presenter.SearchMusicFragment;
import com.ss.android.ugc.aweme.discover.presenter.SearchPoiFragment;
import com.ss.android.ugc.aweme.discover.presenter.SearchUserFragment;
import com.ss.android.ugc.aweme.discover.ui.SearchBaseFragment;
import com.ss.android.ugc.aweme.discover.ui.SearchCommodityFragment;
import com.ss.android.ugc.aweme.discover.ui.SearchFragment;
import com.ss.android.ugc.aweme.discover.ui.am;
import com.ss.android.ugc.aweme.discover.ui.aw;

public class SearchPagerAdapter<T> extends FragmentPagerRebuildAdapter {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f41859c;

    /* renamed from: d  reason: collision with root package name */
    public T f41860d;

    /* renamed from: e  reason: collision with root package name */
    private Context f41861e;

    /* renamed from: f  reason: collision with root package name */
    private SearchResultParam f41862f;

    public final void a(Fragment fragment, int i) {
    }

    public final SearchPagerAdapter a(SearchResultParam searchResultParam) {
        this.f41862f = searchResultParam;
        return this;
    }

    public Fragment b(int i) {
        SearchFragment searchFragment;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41859c, false, 35865, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41859c, false, 35865, new Class[]{Integer.TYPE}, Fragment.class);
        }
        SearchResultParam searchResultParam = this.f41862f;
        if (PatchProxy.isSupport(new Object[]{searchResultParam, Integer.valueOf(i)}, null, am.f43124a, true, 37912, new Class[]{SearchResultParam.class, Integer.TYPE}, SearchFragment.class)) {
            searchFragment = (SearchFragment) PatchProxy.accessDispatch(new Object[]{searchResultParam, Integer.valueOf(i)}, null, am.f43124a, true, 37912, new Class[]{SearchResultParam.class, Integer.TYPE}, SearchFragment.class);
        } else {
            if (i2 == aw.f43134b) {
                searchFragment = new SearchMixFeedFragment();
            } else if (i2 == aw.f43136d) {
                searchFragment = new SearchUserFragment();
            } else if (i2 == aw.f43138f) {
                searchFragment = new SearchMusicFragment();
            } else if (i2 == aw.g) {
                searchFragment = new SearchChallengeFragment();
            } else if (i2 == aw.f43135c) {
                searchFragment = new SearchFeedFragment();
            } else if (i2 == aw.f43137e) {
                searchFragment = new SearchPoiFragment();
            } else if (i2 == aw.h) {
                searchFragment = new SearchCommodityFragment();
            } else {
                searchFragment = new SearchUserFragment();
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable(SearchBaseFragment.q, searchResultParam);
            searchFragment.setArguments(bundle);
        }
        if (searchFragment instanceof SearchBaseFragment) {
            searchFragment.n = i2;
        }
        return searchFragment;
    }

    public CharSequence getPageTitle(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41859c, false, 35863, new Class[]{Integer.TYPE}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41859c, false, 35863, new Class[]{Integer.TYPE}, CharSequence.class);
        } else if (i == aw.f43134b) {
            Context context = this.f41861e;
            if (a.a()) {
                i2 = C0906R.string.bbw;
            } else {
                i2 = C0906R.string.bbv;
            }
            return context.getString(i2);
        } else if (i == aw.f43136d) {
            return this.f41861e.getString(C0906R.string.dps);
        } else {
            if (i == aw.f43138f) {
                return this.f41861e.getString(C0906R.string.be9);
            }
            if (i == aw.g) {
                return this.f41861e.getString(C0906R.string.r9);
            }
            if (i == aw.f43135c) {
                String string = this.f41861e.getString(C0906R.string.c23);
                if (a.b()) {
                    return string.toUpperCase();
                }
                return string;
            } else if (i == aw.f43137e) {
                return this.f41861e.getString(C0906R.string.c2k);
            } else {
                if (i == aw.h) {
                    return this.f41861e.getString(C0906R.string.c25);
                }
                return super.getPageTitle(i);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchPagerAdapter(android.support.v4.app.FragmentManager r10, android.content.Context r11) {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.discover.ui.am.f43124a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = 0
            r4 = 1
            r5 = 37914(0x941a, float:5.3129E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.discover.ui.am.f43124a
            r5 = 1
            r6 = 37914(0x941a, float:5.3129E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Integer.TYPE
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0030
        L_0x002c:
            int r0 = com.ss.android.ugc.aweme.discover.ui.aw.a()
        L_0x0030:
            r9.<init>(r10, r0)
            r9.f41861e = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.adapter.SearchPagerAdapter.<init>(android.support.v4.app.FragmentManager, android.content.Context):void");
    }

    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj2}, this, f41859c, false, 35864, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj2}, this, f41859c, false, 35864, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        this.f41860d = obj2;
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
