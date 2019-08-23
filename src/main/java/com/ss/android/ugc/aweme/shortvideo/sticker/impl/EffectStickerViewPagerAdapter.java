package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.b;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.ss.android.ugc.aweme.themechange.base.a;
import com.ss.android.ugc.aweme.util.c;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryIconsModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;

public class EffectStickerViewPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69592a;

    /* renamed from: b  reason: collision with root package name */
    protected EffectStickerManager f69593b;

    /* renamed from: c  reason: collision with root package name */
    protected RecyclerView.RecycledViewPool f69594c = new RecyclerView.RecycledViewPool();

    /* renamed from: d  reason: collision with root package name */
    protected ViewPager f69595d;

    /* renamed from: e  reason: collision with root package name */
    protected String f69596e;

    /* renamed from: f  reason: collision with root package name */
    protected fh f69597f;
    public Activity g;
    public b h;

    public int getItemPosition(Object obj) {
        return -2;
    }

    public int getCount() {
        if (PatchProxy.isSupport(new Object[0], this, f69592a, false, 79157, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69592a, false, 79157, new Class[0], Integer.TYPE)).intValue();
        }
        c.a("effect page adapter instantiate: " + this.f69593b.b().size());
        return this.f69593b.b().size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.ss.android.ugc.aweme.shortvideo.sticker.impl.StickerFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.ss.android.ugc.aweme.shortvideo.sticker.impl.CategoryStickerFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.ss.android.ugc.aweme.shortvideo.sticker.impl.StickerFragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v4.app.Fragment a(int r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f69592a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class<android.support.v4.app.Fragment> r6 = android.support.v4.app.Fragment.class
            r3 = 0
            r4 = 79156(0x13534, float:1.10921E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003d
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f69592a
            r3 = 0
            r4 = 79156(0x13534, float:1.10921E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class<android.support.v4.app.Fragment> r6 = android.support.v4.app.Fragment.class
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            return r0
        L_0x003d:
            if (r10 != 0) goto L_0x0046
            com.ss.android.ugc.aweme.shortvideo.sticker.impl.FavoriteStickerFragment r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.impl.FavoriteStickerFragment
            r1.<init>()
        L_0x0044:
            r7 = r1
            goto L_0x0053
        L_0x0046:
            com.ss.android.ugc.aweme.shortvideo.sticker.impl.CategoryStickerFragment r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.impl.CategoryStickerFragment
            r1.<init>()
            r2 = r1
            com.ss.android.ugc.aweme.shortvideo.sticker.impl.CategoryStickerFragment r2 = (com.ss.android.ugc.aweme.shortvideo.sticker.impl.CategoryStickerFragment) r2
            com.ss.android.ugc.aweme.shortvideo.sticker.unlock.b r3 = r9.h
            r2.f69553d = r3
            goto L_0x0044
        L_0x0053:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r9.f69593b
            java.lang.String r3 = r9.f69596e
            android.support.v7.widget.RecyclerView$RecycledViewPool r4 = r9.f69594c
            com.ss.android.ugc.aweme.shortvideo.fh r6 = r9.f69597f
            r1 = r7
            r5 = r10
            r1.a(r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewPagerAdapter.a(int):android.support.v4.app.Fragment");
    }

    public Fragment getItem(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69592a, false, 79155, new Class[]{Integer.TYPE}, Fragment.class)) {
            return a(i);
        }
        return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69592a, false, 79155, new Class[]{Integer.TYPE}, Fragment.class);
    }

    public View b(final int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69592a, false, 79159, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69592a, false, 79159, new Class[]{Integer.TYPE}, View.class);
        }
        final a a2 = AVDmtTabLayout.w.a(this.g);
        a2.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69598a;

            public final void onClick(View view) {
                String str;
                Bundle bundle;
                if (PatchProxy.isSupport(new Object[]{view}, this, f69598a, false, 79160, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f69598a, false, 79160, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                String string = EffectStickerViewPagerAdapter.this.g.getString(C0906R.string.adx);
                if (i != 0 || com.ss.android.ugc.aweme.port.in.a.x.c()) {
                    EffectStickerViewPagerAdapter.this.f69595d.setCurrentItem(i, true);
                    com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                    MobClick value = MobClick.obtain().setEventName("click_prop_tab").setLabelName("prop").setValue(EffectStickerViewPagerAdapter.this.f69593b.b().get(i).id);
                    t tVar = new t();
                    if (EffectStickerViewPagerAdapter.this.f69593b.a().equals("livestreaming")) {
                        str = "live_set";
                    } else {
                        str = "shoot_page";
                    }
                    aVar.onEvent(value.setJsonObject(tVar.a("position", str).a()));
                    return;
                }
                f fVar = com.ss.android.ugc.aweme.port.in.a.x;
                Activity activity = EffectStickerViewPagerAdapter.this.g;
                if (com.ss.android.ugc.aweme.i18n.c.a()) {
                    bundle = null;
                } else {
                    bundle = ad.a().a("login_title", string).f75487b;
                }
                fVar.a(activity, "", "click_my_prop", bundle, (f.a) new f.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f69601a;

                    public final void b() {
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f69601a, false, 79161, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f69601a, false, 79161, new Class[0], Void.TYPE);
                            return;
                        }
                        EffectStickerManager effectStickerManager = EffectStickerViewPagerAdapter.this.f69593b;
                        if (PatchProxy.isSupport(new Object[0], effectStickerManager, EffectStickerManager.f3970a, false, 78608, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], effectStickerManager, EffectStickerManager.f3970a, false, 78608, new Class[0], Void.TYPE);
                            return;
                        }
                        if (effectStickerManager.m != null) {
                            effectStickerManager.m.a();
                        }
                    }
                });
            }
        });
        EffectCategoryModel effectCategoryModel = this.f69593b.b().get(i);
        EffectCategoryIconsModel effectCategoryIconsModel = effectCategoryModel.icon;
        if (effectCategoryIconsModel == null || TextUtils.isEmpty(effectCategoryIconsModel.uri)) {
            a2.setText(effectCategoryModel.name);
        } else {
            a2.a(effectCategoryModel.icon.uri, 2130839329);
        }
        this.f69593b.g.a(effectCategoryModel.id, effectCategoryModel.tags, effectCategoryModel.tags_updated_at, (m) new m() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69603a;

            public final void b() {
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f69603a, false, 79162, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f69603a, false, 79162, new Class[0], Void.TYPE);
                    return;
                }
                a2.b(true);
            }
        });
        return a2;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f69592a, false, 79158, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f69592a, false, 79158, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        super.destroyItem(viewGroup, i, obj);
        c.a("page adapter destroy: " + this.f69593b.b().size() + " position:" + i);
    }

    EffectStickerViewPagerAdapter(FragmentManager fragmentManager, ViewPager viewPager, EffectStickerManager effectStickerManager, String str, fh fhVar, Activity activity) {
        super(fragmentManager);
        this.f69595d = viewPager;
        this.f69596e = str;
        this.f69593b = effectStickerManager;
        this.f69597f = fhVar;
        this.g = activity;
    }
}
