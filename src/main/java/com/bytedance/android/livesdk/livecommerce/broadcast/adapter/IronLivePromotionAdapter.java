package com.bytedance.android.livesdk.livecommerce.broadcast.adapter;

import android.arch.core.util.Function;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.livecommerce.a.i;
import com.bytedance.android.livesdk.livecommerce.broadcast.ui.LiveRoomPromotionListViewModel;
import com.bytedance.android.livesdk.livecommerce.c;
import com.bytedance.android.livesdk.livecommerce.c.e;
import com.bytedance.android.livesdk.livecommerce.d.j;
import com.bytedance.android.livesdk.livecommerce.f.a;
import com.bytedance.android.livesdk.livecommerce.f.b;
import com.bytedance.android.livesdk.livecommerce.view.ECPromotionImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IronLivePromotionAdapter extends DataBinderAdapter<IronLivePromotionViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15996a;

    /* renamed from: b  reason: collision with root package name */
    private List<e> f15997b;

    /* renamed from: c  reason: collision with root package name */
    private LiveRoomPromotionListViewModel f15998c;

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f15999d = new HashSet();

    public final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f15996a, false, 10508, new Class[0], String.class)) {
            return a.a(this.f15997b, (Function<T, String>) new Function<e, String>() {
                public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                    e eVar = (e) obj;
                    if (eVar != null) {
                        return eVar.m;
                    }
                    return null;
                }
            });
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f15996a, false, 10508, new Class[0], String.class);
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f15996a, false, 10511, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f15996a, false, 10511, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f15997b != null) {
            return this.f15997b.size();
        } else {
            return 0;
        }
    }

    public final void a(List<e> list) {
        this.f15997b = list;
    }

    public IronLivePromotionAdapter(LiveRoomPromotionListViewModel liveRoomPromotionListViewModel) {
        this.f15998c = liveRoomPromotionListViewModel;
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f15996a, false, 10509, new Class[]{ViewGroup.class, Integer.TYPE}, IronLivePromotionViewHolder.class)) {
            return new IronLivePromotionViewHolder(viewGroup2, this.f15998c);
        }
        return (IronLivePromotionViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f15996a, false, 10509, new Class[]{ViewGroup.class, Integer.TYPE}, IronLivePromotionViewHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        SpannableString spannableString;
        SpannableString spannableString2;
        int i2 = i;
        IronLivePromotionViewHolder ironLivePromotionViewHolder = (IronLivePromotionViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{ironLivePromotionViewHolder, Integer.valueOf(i)}, this, f15996a, false, 10510, new Class[]{IronLivePromotionViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ironLivePromotionViewHolder, Integer.valueOf(i)}, this, f15996a, false, 10510, new Class[]{IronLivePromotionViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        e eVar = this.f15997b.get(i2);
        if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i)}, ironLivePromotionViewHolder, IronLivePromotionViewHolder.f16001a, false, 10513, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
            IronLivePromotionViewHolder ironLivePromotionViewHolder2 = ironLivePromotionViewHolder;
            PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i)}, ironLivePromotionViewHolder2, IronLivePromotionViewHolder.f16001a, false, 10513, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
        } else if (eVar != null) {
            ironLivePromotionViewHolder.j = eVar;
            ironLivePromotionViewHolder.k = i2;
            boolean equals = TextUtils.equals(eVar.m, ironLivePromotionViewHolder.i.a());
            if (!equals) {
                ironLivePromotionViewHolder.itemView.setBackgroundColor(-1);
            } else if (a.a()) {
                ironLivePromotionViewHolder.itemView.setBackgroundResource(2130838639);
            } else {
                ironLivePromotionViewHolder.itemView.setBackgroundResource(2130838638);
            }
            ECPromotionImageView eCPromotionImageView = ironLivePromotionViewHolder.f16002b;
            String str = eVar.n;
            int i3 = ironLivePromotionViewHolder.j.f16130e;
            if (PatchProxy.isSupport(new Object[]{eCPromotionImageView, str, Integer.valueOf(i3), Byte.valueOf(equals ? (byte) 1 : 0)}, null, com.bytedance.android.livesdk.livecommerce.b.a.f15959a, true, 10692, new Class[]{ECPromotionImageView.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eCPromotionImageView, str, Integer.valueOf(i3), Byte.valueOf(equals)}, null, com.bytedance.android.livesdk.livecommerce.b.a.f15959a, true, 10692, new Class[]{ECPromotionImageView.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            } else {
                com.bytedance.android.livesdk.livecommerce.b.a.a(eCPromotionImageView, str, i3, false, equals);
            }
            TextView textView = ironLivePromotionViewHolder.f16004d;
            e eVar2 = ironLivePromotionViewHolder.j;
            if (PatchProxy.isSupport(new Object[]{eVar2}, null, a.f16195a, true, 10719, new Class[]{e.class}, SpannableString.class)) {
                spannableString = (SpannableString) PatchProxy.accessDispatch(new Object[]{eVar2}, null, a.f16195a, true, 10719, new Class[]{e.class}, SpannableString.class);
            } else if (eVar2 == null) {
                spannableString = new SpannableString("");
            } else {
                if (TextUtils.isEmpty(eVar2.f16127b) || eVar2.f16128c == 0) {
                    spannableString2 = new SpannableString(eVar2.f16126a);
                } else {
                    spannableString2 = new SpannableString("#" + eVar2.f16126a);
                    Context c2 = c.c();
                    if (c2 != null) {
                        com.bytedance.android.livesdk.livecommerce.e.a aVar = new com.bytedance.android.livesdk.livecommerce.e.a(c2, eVar2.f16127b, eVar2.f16128c, eVar2.f16128c);
                        aVar.a(11.0f);
                        if (PatchProxy.isSupport(new Object[]{4}, aVar, com.bytedance.android.livesdk.livecommerce.e.a.f16189a, false, 10715, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            com.bytedance.android.livesdk.livecommerce.e.a aVar2 = aVar;
                            PatchProxy.accessDispatch(new Object[]{4}, aVar2, com.bytedance.android.livesdk.livecommerce.e.a.f16189a, false, 10715, new Class[]{Integer.TYPE}, Void.TYPE);
                        } else {
                            aVar.f16190b = aVar.b(4.0f);
                        }
                        if (PatchProxy.isSupport(new Object[]{spannableString2, aVar, 0, 1, 33}, null, b.f16196a, true, 10729, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{spannableString2, aVar, 0, 1, 33}, null, b.f16196a, true, 10729, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        } else {
                            spannableString2.setSpan(aVar, 0, 1, 33);
                        }
                    }
                }
                spannableString = spannableString2;
            }
            textView.setText(spannableString);
            ironLivePromotionViewHolder.f16005e.setPriceText(eVar.o);
            ironLivePromotionViewHolder.f16003c.setIndex(i2 + 1);
            ironLivePromotionViewHolder.f16006f.setText(ironLivePromotionViewHolder.j.i);
            ironLivePromotionViewHolder.f16006f.setEnabled(ironLivePromotionViewHolder.j.a());
            List<j> list = eVar.j;
            if (list == null || list.size() <= 0) {
                ironLivePromotionViewHolder.g.setVisibility(8);
                ironLivePromotionViewHolder.h.setVisibility(8);
            } else {
                ironLivePromotionViewHolder.g.setVisibility(0);
                ironLivePromotionViewHolder.g.setCouponText(list.get(0).f16174a);
                if (list.size() > 1) {
                    ironLivePromotionViewHolder.h.setVisibility(0);
                    ironLivePromotionViewHolder.h.setCouponText(list.get(1).f16174a);
                } else {
                    ironLivePromotionViewHolder.h.setVisibility(8);
                }
            }
        }
        if (!(this.f15998c == null || eVar == null || this.f15999d.contains(eVar.m))) {
            String str2 = this.f15998c.i;
            String str3 = this.f15998c.j;
            String str4 = eVar.m;
            String str5 = eVar.k;
            i iVar = new i(str2, str3, str4, str5, "live_cart_tag", eVar.l, com.bytedance.android.livesdk.livecommerce.b.a().g(), a.b());
            iVar.a();
            this.f15999d.add(eVar.m);
        }
    }
}
