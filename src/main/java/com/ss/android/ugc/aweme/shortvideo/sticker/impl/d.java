package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.model.e;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69656a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectStickerViewImpl f69657b;

    /* renamed from: c  reason: collision with root package name */
    private final AppCompatActivity f69658c;

    /* renamed from: d  reason: collision with root package name */
    private final EffectStickerViewPagerAdapter f69659d;

    /* renamed from: e  reason: collision with root package name */
    private final String f69660e;

    /* renamed from: f  reason: collision with root package name */
    private final TabLayout f69661f;

    d(EffectStickerViewImpl effectStickerViewImpl, AppCompatActivity appCompatActivity, EffectStickerViewPagerAdapter effectStickerViewPagerAdapter, String str, TabLayout tabLayout) {
        this.f69657b = effectStickerViewImpl;
        this.f69658c = appCompatActivity;
        this.f69659d = effectStickerViewPagerAdapter;
        this.f69660e = str;
        this.f69661f = tabLayout;
    }

    public final void onChanged(Object obj) {
        int i;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f69656a, false, 79134, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f69656a, false, 79134, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        EffectStickerViewImpl effectStickerViewImpl = this.f69657b;
        AppCompatActivity appCompatActivity = this.f69658c;
        EffectStickerViewPagerAdapter effectStickerViewPagerAdapter = this.f69659d;
        String str = this.f69660e;
        TabLayout tabLayout = this.f69661f;
        a aVar = (a) obj;
        if (aVar != null && aVar.f76549b != null) {
            int currentItem = effectStickerViewImpl.o.getCurrentItem();
            effectStickerViewImpl.o.setAdapter(null);
            PanelInfoModel panelInfoModel = (PanelInfoModel) aVar.f76549b;
            if (aVar.f76550c == a.C0799a.SUCCESS) {
                CategoryEffectModel categoryEffectModel = panelInfoModel.category_effects;
                effectStickerViewImpl.f3996c.f3975f = panelInfoModel.category_list;
                List<Effect> list = categoryEffectModel.effects;
                List<Effect> list2 = list;
                if (PatchProxy.isSupport(new Object[]{list}, effectStickerViewImpl, EffectStickerViewImpl.f3994a, false, 79120, new Class[]{List.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{list2}, effectStickerViewImpl, EffectStickerViewImpl.f3994a, false, 79120, new Class[]{List.class}, Void.TYPE);
                } else {
                    fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of((FragmentActivity) effectStickerViewImpl.f3995b).get(ShortVideoContextViewModel.class)).f65401b;
                    boolean z = fhVar != null && (fhVar.b() || fhVar.c());
                    if (effectStickerViewImpl.i != null) {
                        Iterator<Effect> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (effectStickerViewImpl.i.contains(it2.next())) {
                                it2.remove();
                            }
                        }
                        for (int size = effectStickerViewImpl.i.size() - 1; size >= 0; size--) {
                            if (!ae.c(effectStickerViewImpl.i.get(size)) || !z) {
                                e e2 = com.ss.android.ugc.aweme.port.in.a.x.e();
                                if (!ae.m(effectStickerViewImpl.i.get(size)) || e2 == null || e2.j()) {
                                    list2.add(0, effectStickerViewImpl.i.get(size));
                                }
                            }
                        }
                    }
                }
                effectStickerViewImpl.f3996c.a(categoryEffectModel.category_key, categoryEffectModel);
                if (Lists.isEmpty(panelInfoModel.category_list) || !PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(panelInfoModel.category_list.get(0).id)) {
                    effectStickerViewImpl.a(appCompatActivity);
                }
                if (effectStickerViewImpl.g != null) {
                    effectStickerViewImpl.g.f70145c = effectStickerViewImpl.k;
                }
                if (effectStickerViewImpl.h != null) {
                    effectStickerViewImpl.f3996c.b(effectStickerViewImpl.h, 0, null);
                    effectStickerViewImpl.h = null;
                }
                effectStickerViewImpl.v = true;
                if (effectStickerViewImpl.u) {
                    effectStickerViewImpl.d();
                }
                effectStickerViewImpl.o.setAdapter(effectStickerViewPagerAdapter);
                List<EffectCategoryModel> list3 = panelInfoModel.category_list;
                if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(currentItem)}, effectStickerViewImpl, EffectStickerViewImpl.f3994a, false, 79119, new Class[]{List.class, Integer.TYPE}, Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[]{list3, Integer.valueOf(currentItem)}, effectStickerViewImpl, EffectStickerViewImpl.f3994a, false, 79119, new Class[]{List.class, Integer.TYPE}, Integer.TYPE)).intValue();
                } else {
                    i = ((!CollectionUtils.isEmpty(list3) || list3.size() <= 1) && !CollectionUtils.isEmpty(effectStickerViewImpl.i)) ? 1 : currentItem;
                }
                effectStickerViewImpl.o.setCurrentItem(i);
                effectStickerViewImpl.a(str, effectStickerViewPagerAdapter);
                if (tabLayout.a(i) != null) {
                    effectStickerViewImpl.n = true;
                    tabLayout.a(i).a();
                }
                if (effectStickerViewImpl.f3996c.b().size() > 1) {
                    com.ss.android.ugc.aweme.utils.a.f75468b.onEvent(MobClick.obtain().setEventName("click_prop_tab").setLabelName("prop").setValue(effectStickerViewImpl.f3996c.b().get(1).id).setJsonObject(new t().a("position", effectStickerViewImpl.f3996c.a().equals("livestreaming") ? "live_set" : "shoot_page").a()));
                }
            }
        }
    }
}
