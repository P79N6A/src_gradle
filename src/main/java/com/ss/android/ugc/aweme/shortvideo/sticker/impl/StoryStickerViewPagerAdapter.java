package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.ss.android.ugc.aweme.utils.a;

public class StoryStickerViewPagerAdapter extends EffectStickerViewPagerAdapter {
    public static ChangeQuickRedirect i;

    public final Fragment a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 79230, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 79230, new Class[]{Integer.TYPE}, Fragment.class);
        }
        StoryCategoryStickerFragment storyCategoryStickerFragment = new StoryCategoryStickerFragment();
        storyCategoryStickerFragment.a(this.f69593b, this.f69596e, this.f69594c, i2, this.f69597f);
        return storyCategoryStickerFragment;
    }

    public final View b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, i, false, 79231, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, i, false, 79231, new Class[]{Integer.TYPE}, View.class);
        }
        View b2 = super.b(i2);
        b2.setOnClickListener(new h(this, i2));
        return b2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(int i2) {
        String str;
        this.f69595d.setCurrentItem(i2, true);
        a aVar = a.f75468b;
        MobClick value = MobClick.obtain().setEventName("click_prop_tab").setLabelName("prop").setValue(this.f69593b.b().get(i2).id);
        t tVar = new t();
        if (this.f69593b.a().equals("livestreaming")) {
            str = "live_set";
        } else {
            str = "shoot_page";
        }
        aVar.onEvent(value.setJsonObject(tVar.a("position", str).a()));
    }

    StoryStickerViewPagerAdapter(FragmentManager fragmentManager, ViewPager viewPager, EffectStickerManager effectStickerManager, String str, fh fhVar, Activity activity) {
        super(fragmentManager, viewPager, effectStickerManager, str, fhVar, activity);
    }
}
