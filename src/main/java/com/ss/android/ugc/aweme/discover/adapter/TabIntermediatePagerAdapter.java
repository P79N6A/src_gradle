package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.ui.ChallengeIntermediateFragment;
import com.ss.android.ugc.aweme.discover.ui.MixIntermediateFragment;
import com.ss.android.ugc.aweme.discover.ui.MusicIntermediateFragment;
import com.ss.android.ugc.aweme.discover.ui.SearchIntermediateFragment;
import com.ss.android.ugc.aweme.discover.ui.UserIntermediateFragment;
import com.ss.android.ugc.aweme.discover.ui.VideoIntermediateFragment;
import com.ss.android.ugc.aweme.discover.ui.am;
import com.ss.android.ugc.aweme.discover.ui.aw;

public class TabIntermediatePagerAdapter extends SearchPagerAdapter<SearchIntermediateFragment> {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f41925e;

    public final Fragment b(int i) {
        Fragment fragment;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41925e, false, 35956, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41925e, false, 35956, new Class[]{Integer.TYPE}, Fragment.class);
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, am.f43124a, true, 37913, new Class[]{Integer.TYPE}, SearchIntermediateFragment.class)) {
            return (SearchIntermediateFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, am.f43124a, true, 37913, new Class[]{Integer.TYPE}, SearchIntermediateFragment.class);
        }
        if (i2 == aw.f43134b) {
            fragment = new MixIntermediateFragment();
        } else if (i2 == aw.f43136d) {
            fragment = new UserIntermediateFragment();
        } else if (i2 == aw.f43138f) {
            fragment = new MusicIntermediateFragment();
        } else if (i2 == aw.g) {
            fragment = new ChallengeIntermediateFragment();
        } else if (i2 == aw.f43135c) {
            fragment = new VideoIntermediateFragment();
        } else {
            fragment = new UserIntermediateFragment();
        }
        return fragment;
    }

    public TabIntermediatePagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager, context);
    }
}
