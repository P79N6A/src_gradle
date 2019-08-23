package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.ah;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

public class FavoriteStickerDiff extends DiffUtil.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69610a;

    /* renamed from: b  reason: collision with root package name */
    private Effect f69611b;

    /* renamed from: c  reason: collision with root package name */
    private List<ah> f69612c;

    /* renamed from: d  reason: collision with root package name */
    private List<ah> f69613d;

    public int getNewListSize() {
        if (!PatchProxy.isSupport(new Object[0], this, f69610a, false, 79170, new Class[0], Integer.TYPE)) {
            return this.f69613d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69610a, false, 79170, new Class[0], Integer.TYPE)).intValue();
    }

    public int getOldListSize() {
        if (!PatchProxy.isSupport(new Object[0], this, f69610a, false, 79169, new Class[0], Integer.TYPE)) {
            return this.f69612c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69610a, false, 79169, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean areItemsTheSame(int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f69610a, false, 79171, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return this.f69612c.get(i).f69295b.effect_id.equals(this.f69613d.get(i2).f69295b.effect_id);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f69610a, false, 79171, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    public boolean areContentsTheSame(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f69610a, false, 79172, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f69610a, false, 79172, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f69611b == null || this.f69612c.get(i).f69295b.effect_id.equals(this.f69611b.effect_id) == this.f69613d.get(i2).f69295b.effect_id.equals(this.f69611b.effect_id)) {
            return true;
        } else {
            return false;
        }
    }

    public FavoriteStickerDiff(Effect effect, List<ah> list, List<ah> list2) {
        this.f69611b = effect;
        this.f69612c = list;
        this.f69613d = list2;
    }
}
