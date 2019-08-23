package com.ss.android.ugc.aweme.sticker.prop.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import java.util.List;

public class StickerPropFragmentAdapter<T extends AmeBaseFragment> extends FragmentPagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71665a;

    /* renamed from: b  reason: collision with root package name */
    private List<T> f71666b;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f71665a, false, 81996, new Class[0], Integer.TYPE)) {
            return this.f71666b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71665a, false, 81996, new Class[0], Integer.TYPE)).intValue();
    }

    public Fragment getItem(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71665a, false, 81995, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) this.f71666b.get(i);
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71665a, false, 81995, new Class[]{Integer.TYPE}, Fragment.class);
    }

    public StickerPropFragmentAdapter(FragmentManager fragmentManager, List<T> list) {
        super(fragmentManager);
        this.f71666b = list;
    }
}
