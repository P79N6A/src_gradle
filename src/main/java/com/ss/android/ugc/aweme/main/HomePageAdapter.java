package com.ss.android.ugc.aweme.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.lazy.LazyFragmentPagerAdapter;
import java.util.ArrayList;

public class HomePageAdapter extends LazyFragmentPagerAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f54138e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<Fragment> f54139f;

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f54138e, false, 57084, new Class[0], Integer.TYPE)) {
            return this.f54139f.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f54138e, false, 57084, new Class[0], Integer.TYPE)).intValue();
    }

    public HomePageAdapter(FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
        super(fragmentManager);
        this.f54139f = arrayList;
    }

    public final /* synthetic */ Object b(ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f54138e, false, 57083, new Class[]{ViewGroup.class, Integer.TYPE}, Fragment.class)) {
            return this.f54139f.get(i);
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f54138e, false, 57083, new Class[]{ViewGroup.class, Integer.TYPE}, Fragment.class);
    }
}
