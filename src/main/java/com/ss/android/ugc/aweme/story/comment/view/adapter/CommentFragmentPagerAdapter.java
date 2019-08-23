package com.ss.android.ugc.aweme.story.comment.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class CommentFragmentPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72233a;

    /* renamed from: b  reason: collision with root package name */
    private FragmentManager f72234b;

    /* renamed from: c  reason: collision with root package name */
    private List<Fragment> f72235c;

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f72233a, false, 82970, new Class[0], Integer.TYPE)) {
            return this.f72235c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72233a, false, 82970, new Class[0], Integer.TYPE)).intValue();
    }

    public Fragment getItem(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72233a, false, 82971, new Class[]{Integer.TYPE}, Fragment.class)) {
            return this.f72235c.get(i);
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72233a, false, 82971, new Class[]{Integer.TYPE}, Fragment.class);
    }

    public CommentFragmentPagerAdapter(FragmentManager fragmentManager, List<Fragment> list) {
        super(fragmentManager);
        this.f72234b = fragmentManager;
        this.f72235c = list;
    }
}
