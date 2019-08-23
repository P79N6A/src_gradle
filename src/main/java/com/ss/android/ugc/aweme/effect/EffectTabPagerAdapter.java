package com.ss.android.ugc.aweme.effect;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.effect.FilterEffectTabFragment;
import com.ss.android.ugc.aweme.effect.StickerEffectTabFragment;
import com.ss.android.ugc.aweme.effect.a.a;
import com.ss.android.ugc.aweme.effect.a.a.c;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EffectTabPagerAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43522a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f43523b;

    /* renamed from: c  reason: collision with root package name */
    public List<Effect> f43524c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public a f43525d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f43526e = false;

    /* renamed from: f  reason: collision with root package name */
    private List<EffectCategoryResponse> f43527f;
    private Context g;
    private c h = new c() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43528a;

        @Nullable
        public final Effect a(@NotNull Queue<Effect> queue) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{queue}, this, f43528a, false, 38589, new Class[]{Queue.class}, Effect.class)) {
                return (Effect) PatchProxy.accessDispatch(new Object[]{queue}, this, f43528a, false, 38589, new Class[]{Queue.class}, Effect.class);
            }
            Effect effect = null;
            while (true) {
                if (i >= EffectTabPagerAdapter.this.f43524c.size()) {
                    break;
                }
                Effect effect2 = EffectTabPagerAdapter.this.f43524c.get(i);
                boolean a2 = EffectTabPagerAdapter.this.f43525d.a().a(effect2);
                boolean contains = queue.contains(effect2);
                if (!a2 && !contains) {
                    effect = effect2;
                    break;
                }
                if (a2) {
                    EffectTabPagerAdapter.this.f43525d.a(effect2, effect2);
                }
                i++;
            }
            return effect;
        }
    };

    public int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f43522a, false, 38586, new Class[0], Integer.TYPE)) {
            return this.f43527f.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f43522a, false, 38586, new Class[0], Integer.TYPE)).intValue();
    }

    public final EffectCategoryResponse a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43522a, false, 38585, new Class[]{Integer.TYPE}, EffectCategoryResponse.class)) {
            return (EffectCategoryResponse) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43522a, false, 38585, new Class[]{Integer.TYPE}, EffectCategoryResponse.class);
        } else if (i < this.f43527f.size()) {
            return this.f43527f.get(i);
        } else {
            return null;
        }
    }

    @android.support.annotation.Nullable
    public CharSequence getPageTitle(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43522a, false, 38588, new Class[]{Integer.TYPE}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43522a, false, 38588, new Class[]{Integer.TYPE}, CharSequence.class);
        } else if (i == getCount() - 1) {
            return this.g.getString(C0906R.string.chm);
        } else {
            return this.f43527f.get(i).name;
        }
    }

    public final void a(@android.support.annotation.Nullable List<EffectCategoryResponse> list) {
        List<EffectCategoryResponse> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f43522a, false, 38581, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f43522a, false, 38581, new Class[]{List.class}, Void.TYPE);
        } else if (list2 != null) {
            this.f43527f = list2;
            if (PatchProxy.isSupport(new Object[0], this, f43522a, false, 38582, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43522a, false, 38582, new Class[0], Void.TYPE);
            } else if (this.f43527f != null) {
                this.f43524c.clear();
                for (EffectCategoryResponse effectCategoryResponse : this.f43527f) {
                    List<Effect> list3 = effectCategoryResponse.totalEffects;
                    if (list3 != null) {
                        this.f43524c.addAll(list3);
                    }
                }
                a aVar = this.f43525d;
                if (PatchProxy.isSupport(new Object[0], aVar, a.f43645a, false, 38824, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f43645a, false, 38824, new Class[0], Void.TYPE);
                } else {
                    aVar.f43650f.set(true);
                    aVar.f43649e.set(true);
                    aVar.b();
                }
            }
            notifyDataSetChanged();
        }
    }

    public Fragment getItem(int i) {
        FilterEffectTabFragment filterEffectTabFragment;
        Object accessDispatch;
        StickerEffectTabFragment stickerEffectTabFragment;
        Object accessDispatch2;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43522a, false, 38584, new Class[]{Integer.TYPE}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43522a, false, 38584, new Class[]{Integer.TYPE}, Fragment.class);
        }
        if (i2 == getCount() - 1) {
            if (!this.f43526e) {
                return new TimeEffectTabFragment();
            }
        } else if (e.b(this.f43527f.get(i2).key)) {
            List<Effect> list = this.f43527f.get(i2).totalEffects;
            String str = this.f43527f.get(i2).key;
            if (PatchProxy.isSupport(new Object[]{list, str}, null, StickerEffectTabFragment.j, true, 38632, new Class[]{List.class, String.class}, StickerEffectTabFragment.class)) {
                accessDispatch2 = PatchProxy.accessDispatch(new Object[]{list, str}, null, StickerEffectTabFragment.j, true, 38632, new Class[]{List.class, String.class}, StickerEffectTabFragment.class);
            } else {
                StickerEffectTabFragment.a aVar = StickerEffectTabFragment.m;
                if (PatchProxy.isSupport(new Object[]{list, str}, aVar, StickerEffectTabFragment.a.f43541a, false, 38633, new Class[]{List.class, String.class}, StickerEffectTabFragment.class)) {
                    Object[] objArr = {list, str};
                    StickerEffectTabFragment.a aVar2 = aVar;
                    ChangeQuickRedirect changeQuickRedirect = StickerEffectTabFragment.a.f43541a;
                    accessDispatch2 = PatchProxy.accessDispatch(objArr, aVar2, changeQuickRedirect, false, 38633, new Class[]{List.class, String.class}, StickerEffectTabFragment.class);
                } else {
                    Intrinsics.checkParameterIsNotNull(list, "effects");
                    Intrinsics.checkParameterIsNotNull(str, "category");
                    Bundle bundle = new Bundle();
                    List mutableList = CollectionsKt.toMutableList((Collection<? extends T>) list);
                    if (mutableList != null) {
                        bundle.putParcelableArrayList("effect_list", (ArrayList) mutableList);
                        bundle.putString("effect_category", str);
                        stickerEffectTabFragment = new StickerEffectTabFragment();
                        stickerEffectTabFragment.setArguments(bundle);
                        stickerEffectTabFragment.f43510f = this.f43525d;
                        return stickerEffectTabFragment;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<out android.os.Parcelable>");
                }
            }
            stickerEffectTabFragment = (StickerEffectTabFragment) accessDispatch2;
            stickerEffectTabFragment.f43510f = this.f43525d;
            return stickerEffectTabFragment;
        }
        List<Effect> list2 = this.f43527f.get(i2).totalEffects;
        String str2 = this.f43527f.get(i2).key;
        if (PatchProxy.isSupport(new Object[]{list2, str2}, null, FilterEffectTabFragment.j, true, 38610, new Class[]{List.class, String.class}, FilterEffectTabFragment.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{list2, str2}, null, FilterEffectTabFragment.j, true, 38610, new Class[]{List.class, String.class}, FilterEffectTabFragment.class);
        } else {
            FilterEffectTabFragment.a aVar3 = FilterEffectTabFragment.n;
            if (PatchProxy.isSupport(new Object[]{list2, str2}, aVar3, FilterEffectTabFragment.a.f43530a, false, 38611, new Class[]{List.class, String.class}, FilterEffectTabFragment.class)) {
                Object[] objArr2 = {list2, str2};
                FilterEffectTabFragment.a aVar4 = aVar3;
                ChangeQuickRedirect changeQuickRedirect2 = FilterEffectTabFragment.a.f43530a;
                accessDispatch = PatchProxy.accessDispatch(objArr2, aVar4, changeQuickRedirect2, false, 38611, new Class[]{List.class, String.class}, FilterEffectTabFragment.class);
            } else {
                Intrinsics.checkParameterIsNotNull(list2, "effects");
                Intrinsics.checkParameterIsNotNull(str2, "category");
                Bundle bundle2 = new Bundle();
                List mutableList2 = CollectionsKt.toMutableList((Collection<? extends T>) list2);
                if (mutableList2 != null) {
                    bundle2.putParcelableArrayList("effect_list", (ArrayList) mutableList2);
                    bundle2.putString("effect_category", str2);
                    filterEffectTabFragment = new FilterEffectTabFragment();
                    filterEffectTabFragment.setArguments(bundle2);
                    filterEffectTabFragment.f43510f = this.f43525d;
                    return filterEffectTabFragment;
                }
                throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<out android.os.Parcelable>");
            }
        }
        filterEffectTabFragment = (FilterEffectTabFragment) accessDispatch;
        filterEffectTabFragment.f43510f = this.f43525d;
        return filterEffectTabFragment;
    }

    public EffectTabPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        a aVar;
        this.g = context;
        a.b bVar = new a.b();
        int i = 3;
        bVar.f43655b = 3;
        bVar.f43656c = this.h;
        if (PatchProxy.isSupport(new Object[0], bVar, a.b.f43653a, false, 38840, new Class[0], a.class)) {
            aVar = (a) PatchProxy.accessDispatch(new Object[0], bVar, a.b.f43653a, false, 38840, new Class[0], a.class);
        } else {
            Integer num = bVar.f43655b;
            aVar = new a(num != null ? num.intValue() : i, bVar.f43656c == null ? new com.ss.android.ugc.aweme.effect.a.a.a() : bVar.f43656c, (byte) 0);
        }
        this.f43525d = aVar;
        com.ss.android.ugc.aweme.port.in.a.e();
    }

    public void setPrimaryItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f43522a, false, 38587, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f43522a, false, 38587, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        this.f43523b = (Fragment) obj;
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
