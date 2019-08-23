package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.presenter.MediaRecordPresenter;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.photomovie.transition.ITransition;
import com.ss.android.ugc.aweme.port.in.ap;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.net.NetStateReceiver;
import com.ss.android.ugc.aweme.shortvideo.net.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.FaceMattingPresenter;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.PixaloopARPresenter;
import com.ss.android.ugc.aweme.shortvideo.sticker.c.c;
import com.ss.android.ugc.aweme.shortvideo.sticker.i;
import com.ss.android.ugc.aweme.shortvideo.sticker.m;
import com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.MultiStickerPresenter;
import com.ss.android.ugc.aweme.shortvideo.sticker.q;
import com.ss.android.ugc.aweme.shortvideo.sticker.r;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.j;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.TabSelectViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.b.g;
import com.ss.android.ugc.effectmanager.effect.b.p;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.List;

public class EffectStickerViewImpl implements LifecycleObserver, m, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3994a;
    int A = -1;
    public boolean B = false;
    public m.a C = new m.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69575a;

        public final void a(@NonNull FaceStickerBean faceStickerBean) {
            FaceStickerBean faceStickerBean2 = faceStickerBean;
            if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f69575a, false, 79144, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f69575a, false, 79144, new Class[]{FaceStickerBean.class}, Void.TYPE);
                return;
            }
            for (m.a a2 : EffectStickerViewImpl.this.x) {
                faceStickerBean2.setPropSource("prop_panel_" + FaceStickerBean.sCurPropSource);
                a2.a(faceStickerBean2);
            }
        }

        public final void b(@NonNull FaceStickerBean faceStickerBean) {
            FaceStickerBean faceStickerBean2 = faceStickerBean;
            if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f69575a, false, 79145, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f69575a, false, 79145, new Class[]{FaceStickerBean.class}, Void.TYPE);
                return;
            }
            for (m.a b2 : EffectStickerViewImpl.this.x) {
                b2.b(faceStickerBean2);
            }
        }

        public final void c(@NonNull FaceStickerBean faceStickerBean) {
            FaceStickerBean faceStickerBean2 = faceStickerBean;
            if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, this, f69575a, false, 79146, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, this, f69575a, false, 79146, new Class[]{FaceStickerBean.class}, Void.TYPE);
                return;
            }
            for (m.a c2 : EffectStickerViewImpl.this.x) {
                c2.c(faceStickerBean2);
            }
        }

        public final void a(@Nullable FaceStickerBean faceStickerBean, @Nullable String str) {
            FaceStickerBean faceStickerBean2 = faceStickerBean;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{faceStickerBean2, str2}, this, f69575a, false, 79142, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{faceStickerBean2, str2}, this, f69575a, false, 79142, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE);
                return;
            }
            for (m.a a2 : EffectStickerViewImpl.this.x) {
                a2.a(faceStickerBean2, str2);
            }
        }

        public final void b(@Nullable FaceStickerBean faceStickerBean, @Nullable String str) {
            FaceStickerBean faceStickerBean2 = faceStickerBean;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{faceStickerBean2, str2}, this, f69575a, false, 79143, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{faceStickerBean2, str2}, this, f69575a, false, 79143, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE);
                return;
            }
            for (m.a b2 : EffectStickerViewImpl.this.x) {
                b2.b(faceStickerBean2, str2);
            }
        }
    };
    private View D;
    private EffectPlatform E;
    private a F;
    private com.ss.android.ugc.aweme.shortvideo.sticker.c.b G;
    private ViewGroup H;
    private CheckableImageView I;
    private AVDmtTabLayout J;
    private m.a K = new m.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69566a;

        public final void a(@NonNull FaceStickerBean faceStickerBean) {
        }

        public final void b(@NonNull FaceStickerBean faceStickerBean) {
        }

        public final void c(@NonNull FaceStickerBean faceStickerBean) {
        }

        public final void b(@Nullable FaceStickerBean faceStickerBean, @Nullable String str) {
            EffectStickerViewImpl.this.u = false;
        }

        public final void a(@Nullable FaceStickerBean faceStickerBean, @Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{faceStickerBean, str}, this, f69566a, false, 79138, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{faceStickerBean, str}, this, f69566a, false, 79138, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE);
                return;
            }
            EffectStickerViewImpl.this.u = true;
            if (EffectStickerViewImpl.this.v) {
                EffectStickerViewImpl.this.d();
            }
        }
    };
    private boolean L = false;
    private com.ss.android.ugc.aweme.sticker.b M;
    private OnUnlockShareFinishListener N = new OnUnlockShareFinishListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69573a;

        public final void onShareAppFailed() {
            if (PatchProxy.isSupport(new Object[0], this, f69573a, false, 79140, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f69573a, false, 79140, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.port.in.a.J.a(EffectStickerViewImpl.this.f3995b);
        }

        public final void onShareAppSucceed(Effect effect) {
            EffectStickerViewImpl.this.B = true;
        }

        public final void onVKShareSucceed(Effect effect) {
            if (PatchProxy.isSupport(new Object[]{effect}, this, f69573a, false, 79141, new Class[]{Effect.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{effect}, this, f69573a, false, 79141, new Class[]{Effect.class}, Void.TYPE);
                return;
            }
            EffectStickerViewImpl.this.f();
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public AppCompatActivity f3995b;

    /* renamed from: c  reason: collision with root package name */
    public EffectStickerManager f3996c;

    /* renamed from: d  reason: collision with root package name */
    public FaceMattingPresenter f3997d;

    /* renamed from: e  reason: collision with root package name */
    public PixaloopARPresenter f3998e;

    /* renamed from: f  reason: collision with root package name */
    public MediaRecordPresenter f3999f;
    MultiStickerPresenter g;
    Effect h;
    public List<Effect> i;
    public boolean j;
    public Effect k;
    ImageView l;
    public fh m;
    public boolean n;
    ViewPager o;
    public boolean p = true;
    public r q;
    public View.OnClickListener r;
    public i s;
    public int t;
    public boolean u;
    public boolean v;
    boolean w = true;
    public List<m.a> x = new ArrayList();
    Effect y;
    int z = -1;

    public final void a(@Nullable Effect effect) {
        if (PatchProxy.isSupport(new Object[]{effect}, this, f3994a, false, 79114, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect}, this, f3994a, false, 79114, new Class[]{Effect.class}, Void.TYPE);
            return;
        }
        this.h = effect;
        if (this.f3996c != null) {
            this.f3996c.c(effect);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, EffectStickerViewPagerAdapter effectStickerViewPagerAdapter) {
        if (PatchProxy.isSupport(new Object[]{str, effectStickerViewPagerAdapter}, this, f3994a, false, 79121, new Class[]{String.class, EffectStickerViewPagerAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, effectStickerViewPagerAdapter}, this, f3994a, false, 79121, new Class[]{String.class, EffectStickerViewPagerAdapter.class}, Void.TYPE);
            return;
        }
        this.J.b();
        if (!"livestreaming".equals(str)) {
            this.J.setMaxTabModeForCount(effectStickerViewPagerAdapter.getCount());
        }
        for (int i2 = 0; i2 < effectStickerViewPagerAdapter.getCount(); i2++) {
            this.J.a(this.J.a().a(effectStickerViewPagerAdapter.b(i2)));
        }
    }

    public final void a(Effect effect, int i2, int i3) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3994a, false, 79130, new Class[]{Effect.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3994a, false, 79130, new Class[]{Effect.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.A = i2;
        this.z = i3;
        this.y = effect2;
        this.L = true;
        h();
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3994a, false, 79131, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3994a, false, 79131, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.w = z2;
        if (this.l != null) {
            this.l.setImageAlpha(z2 ? 255 : 127);
        }
    }

    public final int e() {
        if (this.p) {
            return 0;
        }
        return -1;
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f3994a, false, 79116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3994a, false, 79116, new Class[0], Void.TYPE);
            return;
        }
        this.J.a(new TabLayout.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69584a;

            public final void b(TabLayout.e eVar) {
            }

            public final void c(TabLayout.e eVar) {
            }

            public final void a(TabLayout.e eVar) {
                TabLayout.e eVar2 = eVar;
                if (PatchProxy.isSupport(new Object[]{eVar2}, this, f69584a, false, 79153, new Class[]{TabLayout.e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar2}, this, f69584a, false, 79153, new Class[]{TabLayout.e.class}, Void.TYPE);
                    return;
                }
                EffectStickerViewImpl.this.a(eVar2, false);
                if (EffectStickerViewImpl.this.m != null && EffectStickerViewImpl.this.n) {
                    FaceStickerBean.sCurPropSource = EffectStickerViewImpl.this.f3996c.b().get(eVar2.f70400f).name;
                    com.ss.android.ugc.aweme.utils.a.f75468b.a("click_prop_tab", d.a().a("creation_id", EffectStickerViewImpl.this.m.q).a("shoot_way", EffectStickerViewImpl.this.m.r).a("draft_id", EffectStickerViewImpl.this.m.v).a("tab_name", EffectStickerViewImpl.this.f3996c.b().get(eVar2.f70400f).name).f34114b);
                    TabSelectViewModel tabSelectViewModel = (TabSelectViewModel) ViewModelProviders.of((FragmentActivity) EffectStickerViewImpl.this.f3995b).get(TabSelectViewModel.class);
                    EffectCategoryModel effectCategoryModel = EffectStickerViewImpl.this.f3996c.b().get(eVar2.f70400f);
                    if (PatchProxy.isSupport(new Object[]{effectCategoryModel}, tabSelectViewModel, TabSelectViewModel.f70305a, false, 79943, new Class[]{EffectCategoryModel.class}, Void.TYPE)) {
                        TabSelectViewModel tabSelectViewModel2 = tabSelectViewModel;
                        PatchProxy.accessDispatch(new Object[]{effectCategoryModel}, tabSelectViewModel2, TabSelectViewModel.f70305a, false, 79943, new Class[]{EffectCategoryModel.class}, Void.TYPE);
                        return;
                    }
                    tabSelectViewModel.f70306b.setValue(effectCategoryModel);
                }
            }
        });
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3994a, false, 79111, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3994a, false, 79111, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.themechange.base.b.a((String) null);
        if (this.G != null) {
            this.G.b(new c());
        }
    }

    public final boolean b() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3994a, false, 79112, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3994a, false, 79112, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!(this.D == null || this.D.getParent() == null)) {
            z2 = true;
        }
        return z2;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3994a, false, 79113, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3994a, false, 79113, new Class[0], Void.TYPE);
            return;
        }
        onDestroy();
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f3994a, false, 79129, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3994a, false, 79129, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3996c == null) {
            return false;
        } else {
            this.f3996c.a((Effect) null);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3994a, false, 79126, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3994a, false, 79126, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a() && this.B) {
            f();
        }
    }

    private void h() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3994a, false, 79108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3994a, false, 79108, new Class[0], Void.TYPE);
            return;
        }
        ap apVar = com.ss.android.ugc.aweme.port.in.a.J;
        if (this.L) {
            str = "click_locked_prop";
        } else {
            str = "click_prop_entrance";
        }
        this.M = apVar.a(str, this.f3995b, this.y, this.N, true, true);
        this.M.a();
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3994a, false, 79125, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3994a, false, 79125, new Class[0], Void.TYPE);
            return;
        }
        this.H.setVisibility(0);
        this.H.findViewById(C0906R.id.azh).setVisibility(0);
        this.l.setOnClickListener(new e(this));
    }

    public final void f() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3994a, false, 79127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3994a, false, 79127, new Class[0], Void.TYPE);
            return;
        }
        ap apVar = com.ss.android.ugc.aweme.port.in.a.J;
        AppCompatActivity appCompatActivity = this.f3995b;
        if (this.L) {
            str = "click_locked_prop";
        } else {
            str = "click_prop_entrance";
        }
        apVar.a(appCompatActivity, str, this.y);
        a();
        this.f3996c.b(this.y, this.z, null);
        this.B = false;
        this.L = false;
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3994a, false, 79128, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3994a, false, 79128, new Class[0], Void.TYPE);
            return;
        }
        this.D = null;
        this.x.clear();
        if (this.I != null) {
            this.I.setOnStateChangeListener(null);
            this.I.clearAnimation();
        }
        if (this.F != null) {
            NetStateReceiver.b(this.F);
            this.F = null;
        }
        NetStateReceiver.b((Context) this.f3995b);
        this.f3995b = null;
    }

    public final void d() {
        Pair pair;
        if (PatchProxy.isSupport(new Object[0], this, f3994a, false, 79107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3994a, false, 79107, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            f fVar = com.ss.android.ugc.aweme.port.in.a.x;
            if (fVar.c() && !TextUtils.isEmpty(fVar.d())) {
                EffectStickerManager effectStickerManager = this.f3996c;
                if (PatchProxy.isSupport(new Object[]{effectStickerManager}, null, ae.f69286a, true, 78805, new Class[]{EffectStickerManager.class}, Pair.class)) {
                    pair = (Pair) PatchProxy.accessDispatch(new Object[]{effectStickerManager}, null, ae.f69286a, true, 78805, new Class[]{EffectStickerManager.class}, Pair.class);
                } else {
                    Pair pair2 = new Pair(null, -1);
                    if (!Lists.isEmpty(effectStickerManager.b())) {
                        int i2 = 0;
                        loop0:
                        while (true) {
                            if (i2 >= effectStickerManager.b().size()) {
                                break;
                            }
                            CategoryEffectModel a2 = effectStickerManager.a(effectStickerManager.b().get(i2).name);
                            if (a2 != null) {
                                for (int i3 = 0; i3 < a2.effects.size(); i3++) {
                                    Effect effect = a2.effects.get(i3);
                                    if (ae.g(effect)) {
                                        pair = new Pair(effect, Integer.valueOf(i3));
                                        break loop0;
                                    }
                                }
                                continue;
                            }
                            i2++;
                        }
                    }
                    pair = pair2;
                }
                Effect effect2 = (Effect) pair.first;
                int intValue = ((Integer) pair.second).intValue();
                if (effect2 != null) {
                    List<String> a3 = ae.a((Context) this.f3995b, fVar.d());
                    if (a3 != null && !a3.contains(effect2.effect_id) && ae.i(effect2)) {
                        AppCompatActivity appCompatActivity = this.f3995b;
                        String d2 = fVar.d();
                        String str = effect2.effect_id;
                        if (PatchProxy.isSupport(new Object[]{appCompatActivity, d2, str}, null, ae.f69286a, true, 78800, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
                            Object[] objArr = {appCompatActivity, d2, str};
                            Object[] objArr2 = objArr;
                            PatchProxy.accessDispatch(objArr2, null, ae.f69286a, true, 78800, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
                        } else {
                            if (ae.f69287b.keySet().contains(d2)) {
                                ae.f69287b.get(d2).add(str);
                            } else {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(str);
                                ae.f69287b.put(d2, arrayList);
                            }
                            j jVar = new j(appCompatActivity, d2);
                            if (PatchProxy.isSupport(new Object[]{str}, jVar, j.f70218a, false, 79864, new Class[]{String.class}, Void.TYPE)) {
                                j jVar2 = jVar;
                                PatchProxy.accessDispatch(new Object[]{str}, jVar2, j.f70218a, false, 79864, new Class[]{String.class}, Void.TYPE);
                            } else if (jVar.f70223f.add(str)) {
                                jVar.f70222e.putStringSet("remindedIds", jVar.f70223f);
                                jVar.f70222e.apply();
                            }
                        }
                        this.y = effect2;
                        this.z = intValue;
                        h();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(AppCompatActivity appCompatActivity) {
        if (PatchProxy.isSupport(new Object[]{appCompatActivity}, this, f3994a, false, 79122, new Class[]{AppCompatActivity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appCompatActivity}, this, f3994a, false, 79122, new Class[]{AppCompatActivity.class}, Void.TYPE);
        } else if (this.p && this.f3996c != null) {
            this.f3996c.b().add(0, q.a.b(appCompatActivity));
        }
    }

    private void a(AppCompatActivity appCompatActivity, TabLayout tabLayout) {
        final TabLayout tabLayout2 = tabLayout;
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, tabLayout2}, this, f3994a, false, 79124, new Class[]{AppCompatActivity.class, TabLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appCompatActivity, tabLayout2}, this, f3994a, false, 79124, new Class[]{AppCompatActivity.class, TabLayout.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.port.in.a.L.a(e.a.StickerCollectionFirst)) {
            final FavoriteStickerViewModel favoriteStickerViewModel = (FavoriteStickerViewModel) ViewModelProviders.of((FragmentActivity) appCompatActivity).get(FavoriteStickerViewModel.class);
            favoriteStickerViewModel.f70297b = new FavoriteStickerViewModel.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69569a;

                public final void a(@NonNull Effect effect) {
                    if (PatchProxy.isSupport(new Object[]{effect}, this, f69569a, false, 79139, new Class[]{Effect.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{effect}, this, f69569a, false, 79139, new Class[]{Effect.class}, Void.TYPE);
                        return;
                    }
                    favoriteStickerViewModel.f70297b = null;
                    EffectStickerViewImpl.this.a(tabLayout2.a(EffectStickerViewImpl.this.e()), true);
                    com.ss.android.ugc.aweme.port.in.a.L.a(e.a.StickerCollectionFirstShown, true);
                    com.ss.android.ugc.aweme.port.in.a.L.a(e.a.StickerCollectionFirst, false);
                }
            };
        }
    }

    public final void a(@Nullable TabLayout.e eVar, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{eVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3994a, false, 79123, new Class[]{TabLayout.e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Byte.valueOf(z2)}, this, f3994a, false, 79123, new Class[]{TabLayout.e.class, Boolean.TYPE}, Void.TYPE);
        } else if (eVar != null && eVar.g != null) {
            if (eVar.f70400f == e() && com.ss.android.ugc.aweme.port.in.a.L.a(e.a.StickerCollectionFirstShown)) {
                com.ss.android.ugc.aweme.port.in.a.L.a(e.a.StickerCollectionFirstShown, false);
            }
            View view = eVar.g;
            if (view instanceof com.ss.android.ugc.aweme.themechange.base.a) {
                ((com.ss.android.ugc.aweme.themechange.base.a) view).b(z2);
            }
            this.f3996c.g.a(this.f3996c.b().get(eVar.f70400f).id, this.f3996c.b().get(eVar.f70400f).tags_updated_at, (p) new p() {
                public final void a() {
                }
            });
        }
    }

    private void a(AppCompatActivity appCompatActivity, EffectPlatform effectPlatform, String str) {
        final AppCompatActivity appCompatActivity2 = appCompatActivity;
        final EffectPlatform effectPlatform2 = effectPlatform;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{appCompatActivity2, effectPlatform2, str2}, this, f3994a, false, 79117, new Class[]{AppCompatActivity.class, EffectPlatform.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appCompatActivity2, effectPlatform2, str2}, this, f3994a, false, 79117, new Class[]{AppCompatActivity.class, EffectPlatform.class, String.class}, Void.TYPE);
            return;
        }
        NetStateReceiver.a((Context) appCompatActivity);
        this.F = new a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69586a;

            /* renamed from: f  reason: collision with root package name */
            private boolean f69591f = true;

            public final void a() {
                this.f69591f = false;
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69586a, false, 79154, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69586a, false, 79154, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (!this.f69591f) {
                    EffectStickerViewModel effectStickerViewModel = (EffectStickerViewModel) ViewModelProviders.of((FragmentActivity) appCompatActivity2).get(EffectStickerViewModel.class);
                    if (PatchProxy.isSupport(new Object[0], effectStickerViewModel, EffectStickerViewModel.f70266a, false, 79907, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], effectStickerViewModel, EffectStickerViewModel.f70266a, false, 79907, new Class[0], Void.TYPE);
                    } else if (!(effectStickerViewModel.f70268c == null || effectStickerViewModel.f70269d == null)) {
                        EffectPlatform effectPlatform = effectStickerViewModel.f70268c;
                        String str = effectStickerViewModel.f70267b;
                        if (PatchProxy.isSupport(new Object[]{effectPlatform, str}, effectStickerViewModel, EffectStickerViewModel.f70266a, false, 79904, new Class[]{EffectPlatform.class, String.class}, Void.TYPE)) {
                            EffectStickerViewModel effectStickerViewModel2 = effectStickerViewModel;
                            PatchProxy.accessDispatch(new Object[]{effectPlatform, str}, effectStickerViewModel2, EffectStickerViewModel.f70266a, false, 79904, new Class[]{EffectPlatform.class, String.class}, Void.TYPE);
                        } else {
                            effectPlatform.a(str, false, (g) new g(str, effectPlatform) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f70272a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ String f70273b;

                                /* renamed from: c  reason: collision with root package name */
                                final /* synthetic */ EffectPlatform f70274c;

                                public final void a(EffectChannelResponse effectChannelResponse) {
                                    if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f70272a, false, 79916, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f70272a, false, 79916, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                                        return;
                                    }
                                    if (!CollectionUtils.isEmpty(effectChannelResponse.urlPrefix)) {
                                        EffectStickerViewModel.this.a().setValue(effectChannelResponse.urlPrefix);
                                    }
                                    com.ss.android.ugc.aweme.story.shootvideo.record.a.a.b.f73856c.a(this.f70273b, System.currentTimeMillis());
                                    EffectStickerViewModel.this.f70269d.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.SUCCESS, effectChannelResponse.categoryResponseList));
                                }

                                public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f70272a, false, 79917, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f70272a, false, 79917, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                                        return;
                                    }
                                    EffectStickerViewModel effectStickerViewModel = EffectStickerViewModel.this;
                                    EffectPlatform effectPlatform = this.f70274c;
                                    String str = this.f70273b;
                                    if (PatchProxy.isSupport(new Object[]{effectPlatform, str}, effectStickerViewModel, EffectStickerViewModel.f70266a, false, 79909, new Class[]{EffectPlatform.class, String.class}, Void.TYPE)) {
                                        Object[] objArr = {effectPlatform, str};
                                        EffectStickerViewModel effectStickerViewModel2 = effectStickerViewModel;
                                        PatchProxy.accessDispatch(objArr, effectStickerViewModel2, EffectStickerViewModel.f70266a, false, 79909, new Class[]{EffectPlatform.class, String.class}, Void.TYPE);
                                    } else {
                                        if (PatchProxy.isSupport(new Object[]{effectPlatform, str, null}, effectStickerViewModel, EffectStickerViewModel.f70266a, false, 79908, new Class[]{EffectPlatform.class, String.class, g.class}, Void.TYPE)) {
                                            Object[] objArr2 = {effectPlatform, str, null};
                                            EffectStickerViewModel effectStickerViewModel3 = effectStickerViewModel;
                                            PatchProxy.accessDispatch(objArr2, effectStickerViewModel3, EffectStickerViewModel.f70266a, false, 79908, new Class[]{EffectPlatform.class, String.class, g.class}, Void.TYPE);
                                        } else {
                                            if (effectStickerViewModel.f70269d == null) {
                                                effectStickerViewModel.f70269d = new MutableLiveData<>();
                                            }
                                            effectPlatform.a(str, (g) new g(null) {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f70284a;

                                                /* renamed from: b  reason: collision with root package name */
                                                final /* synthetic */ g f70285b;

                                                public final void a(com.ss.android.ugc.effectmanager.common.e.c cVar) {
                                                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f70284a, false, 79925, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f70284a, false, 79925, new Class[]{com.ss.android.ugc.effectmanager.common.e.c.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    EffectStickerViewModel.this.f70269d.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.ERROR, cVar.f77317c));
                                                    if (this.f70285b != null) {
                                                        this.f70285b.a(cVar);
                                                    }
                                                }

                                                public final void a(EffectChannelResponse effectChannelResponse) {
                                                    if (PatchProxy.isSupport(new Object[]{effectChannelResponse}, this, f70284a, false, 79924, new Class[]{EffectChannelResponse.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{effectChannelResponse}, this, f70284a, false, 79924, new Class[]{EffectChannelResponse.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    if (!CollectionUtils.isEmpty(effectChannelResponse.urlPrefix)) {
                                                        EffectStickerViewModel.this.a().setValue(effectChannelResponse.urlPrefix);
                                                    }
                                                    EffectStickerViewModel.this.f70269d.setValue(com.ss.android.ugc.aweme.w.b.a.a(a.C0799a.SUCCESS, effectChannelResponse.categoryResponseList));
                                                    if (this.f70285b != null) {
                                                        this.f70285b.a(effectChannelResponse);
                                                    }
                                                }

                                                {
                                                    this.f70285b = r2;
                                                }
                                            });
                                        }
                                    }
                                    com.ss.android.ugc.aweme.framework.a.a.a("EffectStickerViewModel", "uniformFetchList fail : " + cVar.toString());
                                }

                                {
                                    this.f70273b = r2;
                                    this.f70274c = r3;
                                }
                            });
                        }
                    }
                    if (EffectStickerViewImpl.this.p) {
                        ((FavoriteStickerViewModel) ViewModelProviders.of((FragmentActivity) appCompatActivity2).get(FavoriteStickerViewModel.class)).a(effectPlatform2, str2);
                    }
                    this.f69591f = true;
                }
            }
        };
        NetStateReceiver.a(this.F);
    }

    private void a(AppCompatActivity appCompatActivity, LifecycleOwner lifecycleOwner, String str, EffectStickerViewPagerAdapter effectStickerViewPagerAdapter, TabLayout tabLayout, boolean z2) {
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, lifecycleOwner2, str2, effectStickerViewPagerAdapter, tabLayout, (byte) 0}, this, f3994a, false, 79118, new Class[]{AppCompatActivity.class, LifecycleOwner.class, String.class, EffectStickerViewPagerAdapter.class, TabLayout.class, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {appCompatActivity, lifecycleOwner2, str2, effectStickerViewPagerAdapter, tabLayout, (byte) 0};
            PatchProxy.accessDispatch(objArr, this, f3994a, false, 79118, new Class[]{AppCompatActivity.class, LifecycleOwner.class, String.class, EffectStickerViewPagerAdapter.class, TabLayout.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        MutableLiveData a2 = ((EffectStickerViewModel) ViewModelProviders.of((FragmentActivity) appCompatActivity).get(EffectStickerViewModel.class)).a(this.f3996c.g, str2);
        d dVar = new d(this, appCompatActivity, effectStickerViewPagerAdapter, str, tabLayout);
        a2.observe(lifecycleOwner2, dVar);
    }

    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r0v42, types: [com.ss.android.ugc.aweme.shortvideo.sticker.impl.StoryStickerViewPagerAdapter] */
    /* JADX WARNING: type inference failed for: r0v43, types: [com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewPagerAdapter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.support.v7.app.AppCompatActivity r24, android.arch.lifecycle.LifecycleOwner r25, android.support.v4.app.FragmentManager r26, java.lang.String r27, android.widget.FrameLayout r28, com.ss.android.ugc.aweme.shortvideo.sticker.m.a r29) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = 6
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r15 = 0
            r0[r15] = r8
            r6 = 1
            r0[r6] = r25
            r16 = 2
            r0[r16] = r26
            r5 = 3
            r0[r5] = r11
            r17 = 4
            r0[r17] = r12
            r18 = 5
            r0[r18] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f3994a
            java.lang.Class[] r4 = new java.lang.Class[r14]
            java.lang.Class<android.support.v7.app.AppCompatActivity> r1 = android.support.v7.app.AppCompatActivity.class
            r4[r15] = r1
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r1 = android.arch.lifecycle.LifecycleOwner.class
            r4[r6] = r1
            java.lang.Class<android.support.v4.app.FragmentManager> r1 = android.support.v4.app.FragmentManager.class
            r4[r16] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r4[r5] = r1
            java.lang.Class<android.widget.FrameLayout> r1 = android.widget.FrameLayout.class
            r4[r17] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.m$a> r1 = com.ss.android.ugc.aweme.shortvideo.sticker.m.a.class
            r4[r18] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r3 = 0
            r20 = 79115(0x1350b, float:1.10864E-40)
            r1 = r23
            r21 = r4
            r4 = r20
            r5 = r21
            r6 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x008d
            java.lang.Object[] r0 = new java.lang.Object[r14]
            r0[r15] = r8
            r6 = 1
            r0[r6] = r25
            r0[r16] = r26
            r5 = 3
            r0[r5] = r11
            r0[r17] = r12
            r0[r18] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f3994a
            r3 = 0
            r4 = 79115(0x1350b, float:1.10864E-40)
            java.lang.Class[] r8 = new java.lang.Class[r14]
            java.lang.Class<android.support.v7.app.AppCompatActivity> r1 = android.support.v7.app.AppCompatActivity.class
            r8[r15] = r1
            java.lang.Class<android.arch.lifecycle.LifecycleOwner> r1 = android.arch.lifecycle.LifecycleOwner.class
            r8[r6] = r1
            java.lang.Class<android.support.v4.app.FragmentManager> r1 = android.support.v4.app.FragmentManager.class
            r8[r16] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r8[r5] = r1
            java.lang.Class<android.widget.FrameLayout> r1 = android.widget.FrameLayout.class
            r8[r17] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.sticker.m$a> r1 = com.ss.android.ugc.aweme.shortvideo.sticker.m.a.class
            r8[r18] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            r5 = r8
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x008d:
            r5 = 3
            r6 = 1
            android.view.View r0 = r7.D
            if (r0 != 0) goto L_0x03ad
            r7.f3995b = r8
            android.arch.lifecycle.Lifecycle r0 = r25.getLifecycle()
            r0.addObserver(r7)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r24)
            r1 = 2131691053(0x7f0f062d, float:1.9011167E38)
            android.view.View r0 = r0.inflate(r1, r12, r15)
            r7.D = r0
            android.view.View r0 = r7.D
            r1 = 2131170113(0x7f071341, float:1.7954575E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.view.View r1 = r7.D
            r2 = 2131170249(0x7f0713c9, float:1.795485E38)
            android.view.View r1 = r1.findViewById(r2)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r1 = (com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout) r1
            r7.J = r1
            android.view.View r1 = r7.D
            r2 = 2131171464(0x7f071888, float:1.7957315E38)
            android.view.View r1 = r1.findViewById(r2)
            android.support.v4.view.ViewPager r1 = (android.support.v4.view.ViewPager) r1
            r7.o = r1
            android.view.View r1 = r7.D
            r2 = 2131167950(0x7f070ace, float:1.7950188E38)
            android.view.View r1 = r1.findViewById(r2)
            r14 = r1
            android.widget.FrameLayout r14 = (android.widget.FrameLayout) r14
            android.view.View r1 = r7.D
            r2 = 2131167946(0x7f070aca, float:1.795018E38)
            android.view.View r1 = r1.findViewById(r2)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.view.View r1 = r7.D
            r2 = 2131166084(0x7f070384, float:1.7946403E38)
            android.view.View r1 = r1.findViewById(r2)
            r3 = r1
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            android.view.View r1 = r7.D
            r2 = 2131166086(0x7f070386, float:1.7946407E38)
            android.view.View r1 = r1.findViewById(r2)
            r2 = r1
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.view.View r1 = r7.D
            r5 = 2131170257(0x7f0713d1, float:1.7954867E38)
            android.view.View r1 = r1.findViewById(r5)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            android.view.View r5 = r7.D
            r6 = 2131167844(0x7f070a64, float:1.7949973E38)
            android.view.View r5 = r5.findViewById(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r7.H = r5
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r24)
            r6 = 2131690456(0x7f0f03d8, float:1.9009956E38)
            r22 = r2
            android.view.ViewGroup r2 = r7.H
            android.view.View r2 = r5.inflate(r6, r2, r15)
            android.view.ViewGroup r5 = r7.H
            r5.addView(r2)
            android.view.ViewGroup r2 = r7.H
            r5 = 2131167629(0x7f07098d, float:1.7949537E38)
            android.view.View r2 = r2.findViewById(r5)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r7.l = r2
            android.view.ViewGroup r2 = r7.H
            r5 = 2131170807(0x7f0715f7, float:1.7955983E38)
            android.view.View r2 = r2.findViewById(r5)
            android.support.v7.app.AppCompatActivity r5 = r7.f3995b
            boolean r5 = com.ss.android.ugc.aweme.shortvideo.ha.a(r5)
            if (r5 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r15 = 8
        L_0x014b:
            r2.setVisibility(r15)
            int r2 = r7.t
            if (r2 <= 0) goto L_0x0168
            android.widget.ImageView r2 = r7.l
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r7.t
            r2.topMargin = r6
            int r2 = r7.t
            r5.topMargin = r2
        L_0x0168:
            boolean r2 = com.ss.android.ugc.aweme.shortvideo.fc.a()
            if (r2 == 0) goto L_0x018a
            android.widget.ImageView r2 = r7.l
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r5 = r2.topMargin
            int r6 = com.ss.android.ugc.aweme.shortvideo.fb.f67664c
            int r5 = r5 + r6
            r2.topMargin = r5
            int r2 = r1.topMargin
            int r5 = com.ss.android.ugc.aweme.shortvideo.fb.f67664c
            int r2 = r2 + r5
            r1.topMargin = r2
        L_0x018a:
            android.view.View r1 = r7.D
            r2 = 2131167315(0x7f070853, float:1.79489E38)
            android.view.View r1 = r1.findViewById(r2)
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r1 = (com.ss.android.ugc.aweme.music.ui.CheckableImageView) r1
            r7.I = r1
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.m$a> r1 = r7.x
            r1.add(r13)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.m$a> r1 = r7.x
            com.ss.android.ugc.aweme.shortvideo.sticker.m$a r2 = r7.K
            r1.add(r2)
            java.lang.String r1 = "livestreaming"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x0203
            android.view.View r1 = r7.D
            r2 = 2131167954(0x7f070ad2, float:1.7950196E38)
            android.view.View r1 = r1.findViewById(r2)
            android.content.res.Resources r2 = r24.getResources()
            r5 = 2130840608(0x7f020c20, float:1.728626E38)
            android.graphics.drawable.Drawable r2 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r2, (int) r5)
            r1.setBackground(r2)
            android.view.View r1 = r7.D
            r2 = 2131167955(0x7f070ad3, float:1.7950198E38)
            android.view.View r1 = r1.findViewById(r2)
            android.content.res.Resources r2 = r24.getResources()
            r5 = 2130838261(0x7f0202f5, float:1.72815E38)
            android.graphics.drawable.Drawable r2 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r2, (int) r5)
            r1.setBackground(r2)
            boolean r1 = com.ss.android.g.a.a()
            if (r1 == 0) goto L_0x0203
            android.view.View r1 = r7.D
            r2 = 2131167951(0x7f070acf, float:1.795019E38)
            android.view.View r1 = r1.findViewById(r2)
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            if (r2 == 0) goto L_0x0203
            com.ss.android.ugc.aweme.themechange.base.b r5 = com.ss.android.ugc.aweme.themechange.base.b.f74589e
            android.support.v7.app.AppCompatActivity r6 = r7.f3995b
            android.content.res.Resources r6 = r6.getResources()
            r13 = 2131624177(0x7f0e00f1, float:1.8875526E38)
            int r6 = r6.getColor(r13)
            r5.a((android.graphics.drawable.Drawable) r2, (int) r6)
            r1.setBackground(r2)
        L_0x0203:
            java.lang.String r1 = "livestreaming"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x0227
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.FaceMattingPresenter r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.ar.FaceMattingPresenter
            android.view.View r2 = r7.D
            r5 = 2131170153(0x7f071369, float:1.7954656E38)
            android.view.View r2 = r2.findViewById(r5)
            android.support.v7.widget.ViewStubCompat r2 = (android.support.v7.widget.ViewStubCompat) r2
            r1.<init>(r8, r2)
            r7.f3997d = r1
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.m$a> r1 = r7.x
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.FaceMattingPresenter r2 = r7.f3997d
            r1.add(r2)
            r23.j()
        L_0x0227:
            java.lang.String r1 = "livestreaming"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x0260
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.PixaloopARPresenter r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.PixaloopARPresenter
            android.view.View r2 = r7.D
            r5 = 2131170168(0x7f071378, float:1.7954687E38)
            android.view.View r2 = r2.findViewById(r5)
            android.support.v7.widget.ViewStubCompat r2 = (android.support.v7.widget.ViewStubCompat) r2
            r1.<init>(r8, r2)
            r7.f3998e = r1
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.PixaloopARPresenter r1 = r7.f3998e
            com.ss.android.ugc.aweme.shortvideo.fh r2 = r7.m
            r1.a((com.ss.android.ugc.aweme.shortvideo.fh) r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.PixaloopARPresenter r1 = r7.f3998e
            com.ss.android.medialib.presenter.MediaRecordPresenter r2 = r7.f3999f
            r1.a((com.ss.android.medialib.presenter.MediaRecordPresenter) r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.PixaloopARPresenter r1 = r7.f3998e
            com.ss.android.ugc.aweme.shortvideo.sticker.impl.c r2 = new com.ss.android.ugc.aweme.shortvideo.sticker.impl.c
            r2.<init>(r7)
            r1.a((com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.c.a) r2)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.m$a> r1 = r7.x
            com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.PixaloopARPresenter r2 = r7.f3998e
            r1.add(r2)
        L_0x0260:
            com.ss.android.ugc.aweme.shortvideo.sticker.c.b r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.c.b
            android.view.View r2 = r7.D
            r1.<init>(r12, r2, r0)
            r7.G = r1
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r0 = new com.ss.android.ugc.aweme.effectplatform.EffectPlatform
            com.ss.android.ugc.aweme.port.in.y r1 = com.ss.android.ugc.aweme.port.in.a.h
            java.lang.String r1 = r1.c()
            com.ss.android.ugc.aweme.port.in.ab r2 = com.ss.android.ugc.aweme.port.in.a.D
            okhttp3.OkHttpClient r2 = r2.getOKHttpClient()
            r0.<init>(r8, r1, r2)
            r7.E = r0
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r0 = r7.E
            r0.a((android.arch.lifecycle.LifecycleOwner) r8)
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r12 = new com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r5 = r7.E
            com.ss.android.ugc.aweme.shortvideo.sticker.m$a r6 = r7.C
            com.ss.android.ugc.aweme.shortvideo.fh r13 = r7.m
            r0 = r12
            r1 = r24
            r15 = r22
            r2 = r25
            r9 = r3
            r3 = r5
            r5 = r4
            r4 = r6
            r6 = r5
            r10 = 3
            r5 = r27
            r10 = r6
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f3996c = r12
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r7.f3996c
            r0.a((android.widget.LinearLayout) r10)
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r7.f3996c
            android.view.View r1 = r7.D
            android.content.Context r1 = r1.getContext()
            r0.a((android.widget.LinearLayout) r9, (android.content.Context) r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r7.f3996c
            android.view.View r1 = r7.D
            android.content.Context r1 = r1.getContext()
            r0.b((android.widget.LinearLayout) r15, (android.content.Context) r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r7.f3996c
            com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewImpl$5 r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewImpl$5
            r1.<init>()
            r0.a((com.ss.android.ugc.aweme.shortvideo.sticker.ad) r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r7.f3996c
            com.ss.android.ugc.aweme.shortvideo.sticker.r r1 = r7.q
            r0.o = r1
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r7.f3996c
            java.util.List r1 = com.ss.android.ugc.aweme.shortvideo.sticker.q.a.a(r24)
            r0.f3975f = r1
            boolean r0 = r7.p
            if (r0 == 0) goto L_0x02e9
            com.ss.android.ugc.aweme.shortvideo.sticker.i$a r9 = new com.ss.android.ugc.aweme.shortvideo.sticker.i$a
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r1 = r7.f3996c
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r5 = r7.I
            com.ss.android.ugc.aweme.shortvideo.fh r6 = r7.m
            r0 = r9
            r2 = r27
            r3 = r24
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.s = r9
        L_0x02e9:
            r23.a((android.support.v7.app.AppCompatActivity) r24)
            java.lang.String r0 = "livestreaming"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0308
            com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.MultiStickerPresenter r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.MultiStickerPresenter
            android.view.View r1 = r7.D
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r7.f3996c
            com.ss.android.ugc.aweme.shortvideo.fh r3 = r7.m
            r0.<init>(r8, r1, r2, r3)
            r7.g = r0
            java.util.List<com.ss.android.ugc.aweme.shortvideo.sticker.m$a> r0 = r7.x
            com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker.MultiStickerPresenter r1 = r7.g
            r0.add(r1)
        L_0x0308:
            boolean r0 = r7.j
            if (r0 == 0) goto L_0x0312
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r0 = r7.f3996c
            r9 = 1
            r0.j = r9
            goto L_0x0313
        L_0x0312:
            r9 = 1
        L_0x0313:
            boolean r0 = r7.p
            if (r0 == 0) goto L_0x032d
            com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewPagerAdapter r10 = new com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewPagerAdapter
            android.support.v4.view.ViewPager r2 = r7.o
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r3 = r7.f3996c
            com.ss.android.ugc.aweme.shortvideo.fh r5 = r7.m
            android.support.v7.app.AppCompatActivity r6 = r7.f3995b
            r0 = r10
            r1 = r26
            r4 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.h = r7
        L_0x032b:
            r4 = r10
            goto L_0x0340
        L_0x032d:
            com.ss.android.ugc.aweme.shortvideo.sticker.impl.StoryStickerViewPagerAdapter r10 = new com.ss.android.ugc.aweme.shortvideo.sticker.impl.StoryStickerViewPagerAdapter
            android.support.v4.view.ViewPager r2 = r7.o
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r3 = r7.f3996c
            com.ss.android.ugc.aweme.shortvideo.fh r5 = r7.m
            android.support.v7.app.AppCompatActivity r6 = r7.f3995b
            r0 = r10
            r1 = r26
            r4 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x032b
        L_0x0340:
            android.support.v4.view.ViewPager r0 = r7.o
            r0.setAdapter(r4)
            android.support.v4.view.ViewPager r0 = r7.o
            r1 = 3
            r0.setOffscreenPageLimit(r1)
            android.support.v4.view.ViewPager r0 = r7.o
            com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$TabLayoutOnPageChangeListener r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$TabLayoutOnPageChangeListener
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r2 = r7.J
            r1.<init>(r2)
            r0.addOnPageChangeListener(r1)
            r23.i()
            r7.a((java.lang.String) r11, (com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewPagerAdapter) r4)
            android.support.v4.view.ViewPager r0 = r7.o
            int r1 = r23.e()
            int r1 = r1 + r9
            r0.setCurrentItem(r1)
            android.view.View r0 = r7.D
            r1 = 2131167260(0x7f07081c, float:1.7948789E38)
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.h.a r2 = new com.ss.android.ugc.aweme.h.a
            r3 = 1056964608(0x3f000000, float:0.5)
            r5 = 200(0xc8, double:9.9E-322)
            r9 = 0
            r2.<init>(r3, r5, r9)
            r0.setOnTouchListener(r2)
            android.view.View r0 = r7.D
            android.view.View r0 = r0.findViewById(r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewImpl$6 r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewImpl$6
            r1.<init>()
            r0.setOnClickListener(r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.c.b r0 = r7.G
            com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewImpl$7 r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewImpl$7
            r1.<init>(r14)
            r0.a((com.ss.android.ugc.aweme.photomovie.transition.f) r1)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r0 = r7.J
            r7.a((android.support.v7.app.AppCompatActivity) r8, (com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout) r0)
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform r0 = r7.E
            r7.a((android.support.v7.app.AppCompatActivity) r8, (com.ss.android.ugc.aweme.effectplatform.EffectPlatform) r0, (java.lang.String) r11)
            com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout r5 = r7.J
            r6 = 0
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r27
            r0.a((android.support.v7.app.AppCompatActivity) r1, (android.arch.lifecycle.LifecycleOwner) r2, (java.lang.String) r3, (com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewPagerAdapter) r4, (com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout) r5, (boolean) r6)
        L_0x03ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.impl.EffectStickerViewImpl.b(android.support.v7.app.AppCompatActivity, android.arch.lifecycle.LifecycleOwner, android.support.v4.app.FragmentManager, java.lang.String, android.widget.FrameLayout, com.ss.android.ugc.aweme.shortvideo.sticker.m$a):void");
    }

    public final void a(@NonNull AppCompatActivity appCompatActivity, @NonNull LifecycleOwner lifecycleOwner, @NonNull FragmentManager fragmentManager, @NonNull String str, @NonNull FrameLayout frameLayout, @NonNull m.a aVar) {
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, lifecycleOwner, fragmentManager, str, frameLayout, aVar}, this, f3994a, false, 79110, new Class[]{AppCompatActivity.class, LifecycleOwner.class, FragmentManager.class, String.class, FrameLayout.class, m.a.class}, Void.TYPE)) {
            Object[] objArr = {appCompatActivity, lifecycleOwner, fragmentManager, str, frameLayout, aVar};
            PatchProxy.accessDispatch(objArr, this, f3994a, false, 79110, new Class[]{AppCompatActivity.class, LifecycleOwner.class, FragmentManager.class, String.class, FrameLayout.class, m.a.class}, Void.TYPE);
            return;
        }
        frameLayout.removeAllViews();
        com.ss.android.ugc.aweme.themechange.base.b.a(str);
        b(appCompatActivity, lifecycleOwner, fragmentManager, str, frameLayout, aVar);
        this.G.a((ITransition) new c());
    }
}
