package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.a;
import com.ss.android.ugc.aweme.shortvideo.sticker.unlock.b;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.ss.android.ugc.aweme.utils.BusiStickerShowLogger;
import com.ss.android.ugc.aweme.w.b.a;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.HashSet;
import java.util.List;

public class CategoryStickerFragment extends StickerFragment implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69550a;

    /* renamed from: b  reason: collision with root package name */
    public CategoryStickerAdapter f69551b;

    /* renamed from: c  reason: collision with root package name */
    public String f69552c;

    /* renamed from: d  reason: collision with root package name */
    public b f69553d;

    /* renamed from: e  reason: collision with root package name */
    public CategoryEffectModel f69554e;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView.OnChildAttachStateChangeListener f69555f;
    private String p;
    private BusiStickerShowLogger q;

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f69550a, false, 79095, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69550a, false, 79095, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            HashSet hashSet = this.j.f3972c.get(this.f69552c);
            if (hashSet != null) {
                hashSet.clear();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f69550a, false, 79089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69550a, false, 79089, new Class[0], Void.TYPE);
            return;
        }
        ((EffectStickerViewModel) ViewModelProviders.of((Fragment) this).get(EffectStickerViewModel.class)).a(this.j.g, this.k, this.p, 0, 0, 0, "").observe(this, new Observer<com.ss.android.ugc.aweme.w.b.a<CategoryEffectModel>>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69564a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                com.ss.android.ugc.aweme.w.b.a aVar = (com.ss.android.ugc.aweme.w.b.a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f69564a, false, 79106, new Class[]{com.ss.android.ugc.aweme.w.b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f69564a, false, 79106, new Class[]{com.ss.android.ugc.aweme.w.b.a.class}, Void.TYPE);
                    return;
                }
                if (aVar != null) {
                    CategoryStickerFragment.this.n = aVar.f76550c;
                    CategoryStickerFragment.this.f69554e = (CategoryEffectModel) aVar.f76549b;
                    CategoryStickerFragment.this.a();
                }
            }
        });
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f69550a, false, 79087, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69550a, false, 79087, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.q != null) {
            BusiStickerShowLogger busiStickerShowLogger = this.q;
            if (PatchProxy.isSupport(new Object[0], busiStickerShowLogger, BusiStickerShowLogger.f75442a, false, 88047, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], busiStickerShowLogger, BusiStickerShowLogger.f75442a, false, 88047, new Class[0], Void.TYPE);
                return;
            }
            busiStickerShowLogger.f75443b.removeOnScrollListener(busiStickerShowLogger);
            busiStickerShowLogger.f75443b.removeOnAttachStateChangeListener(busiStickerShowLogger);
            busiStickerShowLogger.f75443b.removeOnChildAttachStateChangeListener(busiStickerShowLogger);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69550a, false, 79090, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69550a, false, 79090, new Class[0], Void.TYPE);
        } else if (this.n == a.C0799a.LOADING) {
            this.o.d();
        } else if (this.n == a.C0799a.ERROR) {
            this.o.f();
        } else {
            if (this.n == a.C0799a.SUCCESS) {
                if (PatchProxy.isSupport(new Object[0], this, f69550a, false, 79091, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f69550a, false, 79091, new Class[0], Void.TYPE);
                } else if (this.f69554e == null || Lists.isEmpty(this.f69554e.effects)) {
                    this.o.e();
                } else {
                    this.o.b();
                    this.j.a(this.p, this.f69554e);
                    this.f69551b.setData(ah.a(this.f69554e.effects, this.f69552c));
                }
            }
        }
    }

    public final void b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f69550a, false, 79094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69550a, false, 79094, new Class[0], Void.TYPE);
        } else if (this.m != null && this.f69551b != null && this.j != null) {
            int findFirstVisibleItemPosition = this.m.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = this.m.findLastVisibleItemPosition();
            HashSet hashSet = this.j.f3972c.get(this.f69552c);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.j.f3972c.put(this.f69552c, hashSet);
            }
            while (true) {
                findFirstVisibleItemPosition++;
                if (findFirstVisibleItemPosition < findLastVisibleItemPosition + 1) {
                    ah ahVar = (ah) this.f69551b.b(findFirstVisibleItemPosition);
                    if (ahVar != null && !hashSet.contains(ahVar.f69295b.effect_id)) {
                        String str2 = ahVar.f69295b.effect_id;
                        r.onEvent(MobClick.obtain().setEventName("prop").setLabelName("show").setValue(str2).setJsonObject(e()));
                        d f2 = f();
                        if (f2 != null) {
                            com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                            d a2 = f2.a("enter_from", "video_shoot_page");
                            if (this.f69552c == null) {
                                str = "";
                            } else {
                                str = this.f69552c;
                            }
                            aVar.a("prop_show", a2.a("tab_name", str).a("prop_id", str2).a("parent_pop_id", ahVar.f69295b.parent).f34114b);
                        }
                        hashSet.add(str2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69550a, false, 79092, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69550a, false, 79092, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            b();
        } else {
            c();
        }
    }

    public final void a(int i) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69550a, false, 79093, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69550a, false, 79093, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        HashSet hashSet = this.j.f3972c.get(this.f69552c);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.j.f3972c.put(this.f69552c, hashSet);
        }
        ah ahVar = (ah) this.f69551b.b(i + 1);
        if (ahVar != null && !hashSet.contains(ahVar.f69295b.effect_id)) {
            String str2 = ahVar.f69295b.effect_id;
            r.onEvent(MobClick.obtain().setEventName("prop").setLabelName("show").setValue(str2).setJsonObject(e()));
            d f2 = f();
            if (f2 != null) {
                com.ss.android.ugc.aweme.utils.a aVar = com.ss.android.ugc.aweme.utils.a.f75468b;
                d a2 = f2.a("enter_from", "video_shoot_page");
                if (this.f69552c == null) {
                    str = "";
                } else {
                    str = this.f69552c;
                }
                aVar.a("prop_show", a2.a("tab_name", str).a("prop_id", str2).a("parent_pop_id", ahVar.f69295b.parent).f34114b);
            }
            hashSet.add(str2);
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        MutableLiveData<List<String>> mutableLiveData;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f69550a, false, 79086, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f69550a, false, 79086, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (this.j != null) {
            EffectCategoryModel effectCategoryModel = this.j.b().get(this.h);
            this.f69552c = effectCategoryModel.name;
            this.p = effectCategoryModel.key;
            if (!this.j.f3972c.containsKey(this.f69552c)) {
                this.j.f3972c.put(this.f69552c, new HashSet());
            }
            if (this.l.getAdapter() == null) {
                this.f69551b = new CategoryStickerAdapter(this.j, this.h);
                CategoryStickerAdapter categoryStickerAdapter = this.f69551b;
                if (PatchProxy.isSupport(new Object[0], this, f69550a, false, 79097, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f69550a, false, 79097, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (getActivity() != null && ((ShortVideoContextViewModel) ViewModelProviders.of(getActivity()).get(ShortVideoContextViewModel.class)).k()) {
                    z = false;
                }
                categoryStickerAdapter.f69547b = z;
                this.l.setAdapter(this.f69551b);
                this.f69551b.setShowFooter(false);
            } else {
                this.f69551b = (CategoryStickerAdapter) this.l.getAdapter();
            }
            this.f69551b.f69548c = this;
            CategoryEffectModel a2 = this.j.a(this.p);
            if (a2 != null) {
                this.f69551b.setData(ah.a(a2.effects, this.f69552c));
            } else if (this.p == null) {
                this.o.d();
            } else {
                d();
            }
            ((CurParentStickerViewModel) ViewModelProviders.of(getActivity()).get(CurParentStickerViewModel.class)).f70247b.observe(this, new Observer<Pair<Effect, Effect>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69556a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Pair pair = (Pair) obj;
                    if (PatchProxy.isSupport(new Object[]{pair}, this, f69556a, false, 79101, new Class[]{Pair.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{pair}, this, f69556a, false, 79101, new Class[]{Pair.class}, Void.TYPE);
                        return;
                    }
                    if (pair != null) {
                        Effect effect = (Effect) pair.first;
                        Effect effect2 = (Effect) pair.second;
                        int a2 = CategoryStickerFragment.this.f69551b.a(effect);
                        int a3 = CategoryStickerFragment.this.f69551b.a(effect2);
                        if (a2 >= 0) {
                            CategoryStickerFragment.this.f69551b.notifyItemChanged(a2 + 1, ah.a(effect, CategoryStickerFragment.this.f69552c, (g) CategoryStickerFragment.this.j.g));
                        }
                        if (a3 >= 0) {
                            CategoryStickerFragment.this.f69551b.notifyItemChanged(a3 + 1, ah.a(effect2, CategoryStickerFragment.this.f69552c, (g) CategoryStickerFragment.this.j.g));
                        }
                    }
                }
            });
            this.l.addOnScrollListener(new RecyclerView.OnScrollListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69558a;

                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f69558a, false, 79102, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f69558a, false, 79102, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    CategoryStickerFragment.this.l.removeOnChildAttachStateChangeListener(CategoryStickerFragment.this.f69555f);
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        CategoryStickerFragment.this.b();
                    }
                }
            });
            this.l.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69560a;

                public final void onViewDetachedFromWindow(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f69560a, false, 79104, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f69560a, false, 79104, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    CategoryStickerFragment.this.c();
                }

                public final void onViewAttachedToWindow(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f69560a, false, 79103, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f69560a, false, 79103, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (CategoryStickerFragment.this.getUserVisibleHint() && CategoryStickerFragment.this.j != null) {
                        CategoryStickerFragment.this.b();
                    }
                }
            });
            this.f69555f = new RecyclerView.OnChildAttachStateChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69562a;

                public void onChildViewDetachedFromWindow(@NonNull View view) {
                }

                public void onChildViewAttachedToWindow(@NonNull View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f69562a, false, 79105, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f69562a, false, 79105, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (CategoryStickerFragment.this.getUserVisibleHint()) {
                        CategoryStickerFragment.this.a(CategoryStickerFragment.this.l.getChildAdapterPosition(view));
                    }
                }
            };
            this.l.addOnChildAttachStateChangeListener(this.f69555f);
            if (PatchProxy.isSupport(new Object[0], this, f69550a, false, 79088, new Class[0], MutableLiveData.class)) {
                mutableLiveData = (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f69550a, false, 79088, new Class[0], MutableLiveData.class);
            } else {
                mutableLiveData = ((EffectStickerViewModel) ViewModelProviders.of((Fragment) this).get(EffectStickerViewModel.class)).a();
            }
            mutableLiveData.observe(this, new b(this));
            BusiStickerShowLogger busiStickerShowLogger = new BusiStickerShowLogger(this.p, this, this.l, this.m, this.f69551b);
            this.q = busiStickerShowLogger;
            BusiStickerShowLogger busiStickerShowLogger2 = this.q;
            if (PatchProxy.isSupport(new Object[0], busiStickerShowLogger2, BusiStickerShowLogger.f75442a, false, 88046, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], busiStickerShowLogger2, BusiStickerShowLogger.f75442a, false, 88046, new Class[0], Void.TYPE);
                return;
            }
            busiStickerShowLogger2.f75443b.addOnScrollListener(busiStickerShowLogger2);
            busiStickerShowLogger2.f75443b.addOnAttachStateChangeListener(busiStickerShowLogger2);
            busiStickerShowLogger2.f75443b.addOnChildAttachStateChangeListener(busiStickerShowLogger2);
        }
    }

    public final void a(int i, Effect effect) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), effect}, this, f69550a, false, 79098, new Class[]{Integer.TYPE, Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), effect}, this, f69550a, false, 79098, new Class[]{Integer.TYPE, Effect.class}, Void.TYPE);
            return;
        }
        if (this.f69553d != null) {
            this.f69553d.a(effect, this.h, i);
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f69550a, false, 79085, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f69550a, false, 79085, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.w3, viewGroup2, false);
        this.l = (RecyclerView) inflate.findViewById(C0906R.id.cvl);
        this.o = (DmtStatusView) inflate.findViewById(C0906R.id.aui);
        this.o.setBuilder(DmtStatusView.a.a(getContext()).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new a(this)).a((int) C0906R.string.b5r, (int) C0906R.string.dmu).c(1));
        this.o.setVisibility(0);
        return inflate;
    }
}
