package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.e;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.fh;
import com.ss.android.ugc.aweme.shortvideo.sticker.ae;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurParentStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.FavoriteStickerViewModel;
import com.ss.android.ugc.aweme.utils.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FavoriteStickerFragment extends StickerFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69614a;

    /* renamed from: b  reason: collision with root package name */
    public FavoriteStickerAdapter f69615b;

    /* renamed from: c  reason: collision with root package name */
    public String f69616c;

    /* renamed from: d  reason: collision with root package name */
    public RecyclerView.OnChildAttachStateChangeListener f69617d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f69614a, false, 79176, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69614a, false, 79176, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            HashSet hashSet = this.j.f3972c.get(this.f69616c);
            if (hashSet != null) {
                hashSet.clear();
            }
        }
    }

    public final void b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f69614a, false, 79177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69614a, false, 79177, new Class[0], Void.TYPE);
        } else if (this.m != null && this.f69615b != null && this.j != null) {
            int findFirstVisibleItemPosition = this.m.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = this.m.findLastVisibleItemPosition();
            HashSet hashSet = this.j.f3972c.get(this.f69616c);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.j.f3972c.put(this.f69616c, hashSet);
            }
            while (true) {
                findFirstVisibleItemPosition++;
                if (findFirstVisibleItemPosition < findLastVisibleItemPosition + 1) {
                    ah ahVar = (ah) this.f69615b.b(findFirstVisibleItemPosition);
                    if (ahVar != null && !hashSet.contains(ahVar.f69295b.effect_id)) {
                        String str2 = ahVar.f69295b.effect_id;
                        r.onEvent(MobClick.obtain().setEventName("prop").setLabelName("show").setValue(str2).setJsonObject(e()));
                        d f2 = f();
                        if (f2 != null) {
                            a aVar = a.f75468b;
                            d a2 = f2.a("enter_from", "video_shoot_page");
                            if (this.f69616c == null) {
                                str = "";
                            } else {
                                str = this.f69616c;
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
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69614a, false, 79174, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69614a, false, 79174, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            b();
        } else {
            a();
        }
    }

    public final void a(int i) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69614a, false, 79175, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69614a, false, 79175, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        HashSet hashSet = this.j.f3972c.get(this.f69616c);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.j.f3972c.put(this.f69616c, hashSet);
        }
        ah ahVar = (ah) this.f69615b.b(i + 1);
        if (ahVar != null && !hashSet.contains(ahVar.f69295b.effect_id)) {
            String str2 = ahVar.f69295b.effect_id;
            r.onEvent(MobClick.obtain().setEventName("prop").setLabelName("show").setValue(str2).setJsonObject(e()));
            d f2 = f();
            if (f2 != null) {
                a aVar = a.f75468b;
                d a2 = f2.a("enter_from", "video_shoot_page");
                if (this.f69616c == null) {
                    str = "";
                } else {
                    str = this.f69616c;
                }
                aVar.a("prop_show", a2.a("tab_name", str).a("prop_id", str2).a("parent_pop_id", ahVar.f69295b.parent).f34114b);
            }
            hashSet.add(str2);
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f69614a, false, 79173, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f69614a, false, 79173, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (this.j != null) {
            this.f69616c = this.j.b().get(this.h).name;
            if (!this.j.f3972c.containsKey(this.f69616c)) {
                this.j.f3972c.put(this.f69616c, new HashSet());
            }
            this.f69615b = new FavoriteStickerAdapter(this.j);
            this.l.setAdapter(this.f69615b);
            this.f69615b.setShowFooter(false);
            ((FavoriteStickerViewModel) ViewModelProviders.of(getActivity()).get(FavoriteStickerViewModel.class)).f70299d.observe(this, new Observer<com.ss.android.ugc.aweme.w.b.a<List<Effect>>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69618a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    com.ss.android.ugc.aweme.w.b.a aVar = (com.ss.android.ugc.aweme.w.b.a) obj;
                    if (PatchProxy.isSupport(new Object[]{aVar}, this, f69618a, false, 79180, new Class[]{com.ss.android.ugc.aweme.w.b.a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{aVar}, this, f69618a, false, 79180, new Class[]{com.ss.android.ugc.aweme.w.b.a.class}, Void.TYPE);
                        return;
                    }
                    if (aVar != null) {
                        FavoriteStickerFragment favoriteStickerFragment = FavoriteStickerFragment.this;
                        List list = (List) aVar.f76549b;
                        if (PatchProxy.isSupport(new Object[]{list}, favoriteStickerFragment, FavoriteStickerFragment.f69614a, false, 79179, new Class[]{List.class}, Void.TYPE)) {
                            FavoriteStickerFragment favoriteStickerFragment2 = favoriteStickerFragment;
                            PatchProxy.accessDispatch(new Object[]{list}, favoriteStickerFragment2, FavoriteStickerFragment.f69614a, false, 79179, new Class[]{List.class}, Void.TYPE);
                        } else if (!(favoriteStickerFragment.getActivity() == null || list == null || list.isEmpty())) {
                            fh fhVar = ((ShortVideoContextViewModel) ViewModelProviders.of(favoriteStickerFragment.getActivity()).get(ShortVideoContextViewModel.class)).f65401b;
                            if (fhVar != null && (fhVar.b() || fhVar.c())) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (ae.c((Effect) it2.next())) {
                                        it2.remove();
                                    }
                                }
                            }
                        }
                        FavoriteStickerFragment favoriteStickerFragment3 = FavoriteStickerFragment.this;
                        List list2 = (List) aVar.f76549b;
                        if (PatchProxy.isSupport(new Object[]{list2}, favoriteStickerFragment3, FavoriteStickerFragment.f69614a, false, 79178, new Class[]{List.class}, Void.TYPE)) {
                            FavoriteStickerFragment favoriteStickerFragment4 = favoriteStickerFragment3;
                            PatchProxy.accessDispatch(new Object[]{list2}, favoriteStickerFragment4, FavoriteStickerFragment.f69614a, false, 79178, new Class[]{List.class}, Void.TYPE);
                        } else if (!(favoriteStickerFragment3.getActivity() == null || list2 == null || list2.isEmpty())) {
                            e e2 = com.ss.android.ugc.aweme.port.in.a.x.e();
                            if (e2 != null && !e2.j()) {
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    if (((Effect) it3.next()).getTags().contains("douyin_card")) {
                                        it3.remove();
                                    }
                                }
                            }
                        }
                        List data = FavoriteStickerFragment.this.f69615b.getData();
                        List<ah> a2 = ah.a((List) aVar.f76549b, FavoriteStickerFragment.this.f69616c);
                        if (Lists.isEmpty(data)) {
                            FavoriteStickerFragment.this.f69615b.f69636e = false;
                        }
                        if (a2.size() == 0) {
                            FavoriteStickerFragment.this.f69615b.f69636e = true;
                        }
                        if (data != null) {
                            DiffUtil.calculateDiff(new FavoriteStickerDiff(FavoriteStickerFragment.this.j.f3971b, data, a2), true).dispatchUpdatesTo((RecyclerView.Adapter) FavoriteStickerFragment.this.f69615b);
                        }
                        FavoriteStickerFragment.this.f69615b.setData(a2);
                    }
                }
            });
            ((CurParentStickerViewModel) ViewModelProviders.of(getActivity()).get(CurParentStickerViewModel.class)).f70247b.observe(this, new Observer<Pair<Effect, Effect>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69620a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    Pair pair = (Pair) obj;
                    if (PatchProxy.isSupport(new Object[]{pair}, this, f69620a, false, 79181, new Class[]{Pair.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{pair}, this, f69620a, false, 79181, new Class[]{Pair.class}, Void.TYPE);
                        return;
                    }
                    if (pair != null) {
                        Effect effect = (Effect) pair.first;
                        Effect effect2 = (Effect) pair.second;
                        int a2 = FavoriteStickerFragment.this.f69615b.a(effect);
                        int a3 = FavoriteStickerFragment.this.f69615b.a(effect2);
                        if (a2 >= 0) {
                            FavoriteStickerFragment.this.f69615b.notifyItemChanged(a2 + 1, ah.a(effect, FavoriteStickerFragment.this.f69616c, (g) FavoriteStickerFragment.this.j.g));
                        }
                        if (a3 >= 0) {
                            FavoriteStickerFragment.this.f69615b.notifyItemChanged(a3 + 1, ah.a(effect2, FavoriteStickerFragment.this.f69616c, (g) FavoriteStickerFragment.this.j.g));
                        }
                    }
                }
            });
            this.l.addOnScrollListener(new RecyclerView.OnScrollListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69622a;

                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f69622a, false, 79182, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f69622a, false, 79182, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    FavoriteStickerFragment.this.l.removeOnChildAttachStateChangeListener(FavoriteStickerFragment.this.f69617d);
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        FavoriteStickerFragment.this.b();
                    }
                }
            });
            this.l.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69624a;

                public final void onViewDetachedFromWindow(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f69624a, false, 79184, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f69624a, false, 79184, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    FavoriteStickerFragment.this.a();
                }

                public final void onViewAttachedToWindow(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f69624a, false, 79183, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f69624a, false, 79183, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (FavoriteStickerFragment.this.getUserVisibleHint() && FavoriteStickerFragment.this.j != null) {
                        FavoriteStickerFragment.this.b();
                    }
                }
            });
            this.f69617d = new RecyclerView.OnChildAttachStateChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69626a;

                public void onChildViewDetachedFromWindow(@NonNull View view) {
                }

                public void onChildViewAttachedToWindow(@NonNull View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f69626a, false, 79185, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f69626a, false, 79185, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (FavoriteStickerFragment.this.getUserVisibleHint()) {
                        FavoriteStickerFragment.this.a(FavoriteStickerFragment.this.l.getChildAdapterPosition(view));
                    }
                }
            };
            this.l.addOnChildAttachStateChangeListener(this.f69617d);
        }
    }
}
