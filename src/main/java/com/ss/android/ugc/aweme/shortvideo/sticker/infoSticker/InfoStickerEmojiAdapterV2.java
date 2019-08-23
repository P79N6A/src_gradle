package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import java.util.ArrayList;
import java.util.List;

public class InfoStickerEmojiAdapterV2 extends InfoStickerAdapterV2 {
    public static ChangeQuickRedirect k;
    private String l;
    private List<ah> m = new ArrayList();

    public int getBasicItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, k, false, 79258, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, k, false, 79258, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f69672b) {
            return 1;
        } else {
            return this.m.size() + 2;
        }
    }

    public final int a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, k, false, 79257, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, k, false, 79257, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.g.get(i - 1)) {
            return 3;
        } else {
            return 2;
        }
    }

    public final void a(CategoryEffectModel categoryEffectModel) {
        CategoryEffectModel categoryEffectModel2 = categoryEffectModel;
        if (PatchProxy.isSupport(new Object[]{categoryEffectModel2}, this, k, false, 79254, new Class[]{CategoryEffectModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{categoryEffectModel2}, this, k, false, 79254, new Class[]{CategoryEffectModel.class}, Void.TYPE);
            return;
        }
        if (categoryEffectModel2 != null && categoryEffectModel2.effects != null) {
            this.m.addAll(ah.a(categoryEffectModel2.effects, ""));
        }
    }

    InfoStickerEmojiAdapterV2(FragmentActivity fragmentActivity, String str) {
        super(fragmentActivity, str);
        this.f69679e = fragmentActivity;
        this.l = str;
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, k, false, 79255, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, k, false, 79255, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        InfoStickerHolder infoStickerHolder = new InfoStickerHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.fg, viewGroup, false), this);
        infoStickerHolder.f69699d = this.f69673c;
        return infoStickerHolder;
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, k, false, 79256, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, k, false, 79256, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (a(i) == 2) {
            InfoStickerHolder infoStickerHolder = (InfoStickerHolder) viewHolder;
            int i2 = i - 1;
            infoStickerHolder.a(this.f69679e, this.m.get(i2), this.l);
            infoStickerHolder.g = i;
            if (this.m.get(i2).f69295b != null) {
                this.i.put(this.m.get(i2).f69295b.effect_id, infoStickerHolder);
            }
        }
    }
}
