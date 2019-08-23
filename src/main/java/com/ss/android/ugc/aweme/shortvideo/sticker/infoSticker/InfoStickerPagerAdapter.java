package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class InfoStickerPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69725a;

    /* renamed from: b  reason: collision with root package name */
    ViewPager f69726b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f69727c;

    public int getCount() {
        return 2;
    }

    public Fragment getItem(int i) {
        InfoStickerFragment infoStickerFragment;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69725a, false, 79309, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69725a, false, 79309, new Class[]{Integer.TYPE}, Fragment.class);
        }
        if (i == 1) {
            if (PatchProxy.isSupport(new Object[0], null, InfoStickerEmojiFragment.f69685a, true, 79259, new Class[0], InfoStickerEmojiFragment.class)) {
                infoStickerFragment = (InfoStickerEmojiFragment) PatchProxy.accessDispatch(new Object[0], null, InfoStickerEmojiFragment.f69685a, true, 79259, new Class[0], InfoStickerEmojiFragment.class);
            } else {
                infoStickerFragment = new InfoStickerEmojiFragment();
            }
        } else if (PatchProxy.isSupport(new Object[0], null, InfoStickerFragment.f69688d, true, 79270, new Class[0], InfoStickerFragment.class)) {
            infoStickerFragment = (InfoStickerFragment) PatchProxy.accessDispatch(new Object[0], null, InfoStickerFragment.f69688d, true, 79270, new Class[0], InfoStickerFragment.class);
        } else {
            infoStickerFragment = new InfoStickerFragment();
        }
        InfoStickerFragment infoStickerFragment2 = infoStickerFragment;
        infoStickerFragment2.k = this.f69727c;
        return infoStickerFragment2;
    }

    public InfoStickerPagerAdapter(FragmentManager fragmentManager, ViewPager viewPager) {
        super(fragmentManager);
        this.f69726b = viewPager;
    }
}
