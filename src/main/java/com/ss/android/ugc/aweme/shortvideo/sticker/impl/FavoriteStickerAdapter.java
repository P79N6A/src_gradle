package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.effectplatform.g;
import com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.aweme.shortvideo.sticker.q;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;

public class FavoriteStickerAdapter extends StickerAdapter<ah> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69606a;

    /* renamed from: b  reason: collision with root package name */
    private EffectStickerManager f69607b;

    /* renamed from: c  reason: collision with root package name */
    private List<ah> f69608c;

    /* renamed from: f  reason: collision with root package name */
    private HashMap<String, Integer> f69609f = q.a(this.f69608c);

    /* access modifiers changed from: package-private */
    public final int a(int i) {
        return PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR;
    }

    public List<ah> getData() {
        return this.f69608c;
    }

    FavoriteStickerAdapter(@NonNull EffectStickerManager effectStickerManager) {
        this.f69607b = effectStickerManager;
    }

    public void setData(List<ah> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f69606a, false, 79166, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f69606a, false, 79166, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f69608c = list;
        this.f69609f = q.a(this.f69608c);
        super.setData(list);
    }

    public final int a(@Nullable Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, f69606a, false, 79165, new Class[]{Effect.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{effect2}, this, f69606a, false, 79165, new Class[]{Effect.class}, Integer.TYPE)).intValue();
        } else if (effect2 == null) {
            return -1;
        } else {
            Integer num = this.f69609f.get(effect2.effect_id);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }
    }

    /* access modifiers changed from: package-private */
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i) {
        if (!PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f69606a, false, 79163, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new FavoriteStickerViewHolder(this.f69607b, LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ts, viewGroup, false), this.f69608c);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f69606a, false, 79163, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    /* access modifiers changed from: package-private */
    public final void a(RecyclerView.ViewHolder viewHolder, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69606a, false, 79164, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69606a, false, 79164, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        FavoriteStickerViewHolder favoriteStickerViewHolder = (FavoriteStickerViewHolder) viewHolder;
        ah ahVar = (ah) b(i2);
        List<ah> data = getData();
        if (PatchProxy.isSupport(new Object[]{ahVar, data, Integer.valueOf(i)}, favoriteStickerViewHolder, FavoriteStickerViewHolder.f69628a, false, 79186, new Class[]{ah.class, List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ahVar, data, Integer.valueOf(i)}, favoriteStickerViewHolder, FavoriteStickerViewHolder.f69628a, false, 79186, new Class[]{ah.class, List.class, Integer.TYPE}, Void.TYPE);
        } else if (ahVar != null && !CollectionUtils.isEmpty(data)) {
            favoriteStickerViewHolder.a(ah.a(ahVar, (g) favoriteStickerViewHolder.h.g));
            favoriteStickerViewHolder.a(false);
            favoriteStickerViewHolder.f69202f = i2;
            favoriteStickerViewHolder.b();
            favoriteStickerViewHolder.f69200d.a(favoriteStickerViewHolder.a().f69295b.icon_url.url_list.get(0));
            favoriteStickerViewHolder.h.g.a(favoriteStickerViewHolder.a().f69295b.id, favoriteStickerViewHolder.a().f69295b.getTags(), favoriteStickerViewHolder.a().f69295b.tags_updated_at, (m) new m() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f69629a;

                public final void b() {
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f69629a, false, 79192, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f69629a, false, 79192, new Class[0], Void.TYPE);
                        return;
                    }
                    FavoriteStickerViewHolder favoriteStickerViewHolder = FavoriteStickerViewHolder.this;
                    Effect effect = FavoriteStickerViewHolder.this.a().f69295b;
                    if (PatchProxy.isSupport(new Object[]{effect}, favoriteStickerViewHolder, FavoriteStickerViewHolder.f69628a, false, 79188, new Class[]{Effect.class}, Void.TYPE)) {
                        Object[] objArr = {effect};
                        FavoriteStickerViewHolder favoriteStickerViewHolder2 = favoriteStickerViewHolder;
                        PatchProxy.accessDispatch(objArr, favoriteStickerViewHolder2, FavoriteStickerViewHolder.f69628a, false, 79188, new Class[]{Effect.class}, Void.TYPE);
                    } else if (effect == null || !effect.getTags().contains("new")) {
                        favoriteStickerViewHolder.b(false);
                    } else {
                        favoriteStickerViewHolder.b(true);
                    }
                }
            });
            if (favoriteStickerViewHolder.h.b(ahVar.f69295b)) {
                favoriteStickerViewHolder.a(true);
                favoriteStickerViewHolder.h.c(ahVar.f69295b);
                return;
            }
            favoriteStickerViewHolder.a(false);
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        List list2 = list;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i), list2}, this, f69606a, false, 79168, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i), list2}, this, f69606a, false, 79168, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(list)) {
            ah ahVar = (ah) list2.get(0);
            FavoriteStickerViewHolder favoriteStickerViewHolder = (FavoriteStickerViewHolder) viewHolder;
            if (this.f69607b.b(ahVar.f69295b)) {
                favoriteStickerViewHolder.a(true);
                this.f69607b.c(ahVar.f69295b);
            } else {
                favoriteStickerViewHolder.a(false);
            }
        } else {
            super.onBindViewHolder(viewHolder, i, list);
        }
    }
}
