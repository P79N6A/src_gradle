package com.bytedance.android.livesdk.gift.panel;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.a.a;
import com.bytedance.android.livesdk.gift.model.a.b;
import com.bytedance.android.livesdk.gift.model.a.h;
import com.bytedance.android.livesdk.gift.model.a.j;
import com.bytedance.android.livesdk.gift.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class GiftListDiffUtilCallback extends DiffUtil.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15160a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f15161b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f15162c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15163d;

    public int getNewListSize() {
        if (!PatchProxy.isSupport(new Object[0], this, f15160a, false, 9904, new Class[0], Integer.TYPE)) {
            return this.f15162c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f15160a, false, 9904, new Class[0], Integer.TYPE)).intValue();
    }

    public int getOldListSize() {
        if (!PatchProxy.isSupport(new Object[0], this, f15160a, false, 9903, new Class[0], Integer.TYPE)) {
            return this.f15161b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f15160a, false, 9903, new Class[0], Integer.TYPE)).intValue();
    }

    private boolean a(ImageModel imageModel, ImageModel imageModel2) {
        ImageModel imageModel3 = imageModel;
        ImageModel imageModel4 = imageModel2;
        if (PatchProxy.isSupport(new Object[]{imageModel3, imageModel4}, this, f15160a, false, 9909, new Class[]{ImageModel.class, ImageModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{imageModel3, imageModel4}, this, f15160a, false, 9909, new Class[]{ImageModel.class, ImageModel.class}, Boolean.TYPE)).booleanValue();
        } else if (imageModel3 == imageModel4) {
            return true;
        } else {
            if (imageModel3 == null || imageModel4 == null || !imageModel.getUri().equals(imageModel2.getUri())) {
                return false;
            }
            return true;
        }
    }

    public boolean areItemsTheSame(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f15160a, false, 9905, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f15160a, false, 9905, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.f15161b.get(i).o() == this.f15162c.get(i2).o()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean a(b bVar, b bVar2) {
        if (PatchProxy.isSupport(new Object[]{bVar, bVar2}, this, f15160a, false, 9908, new Class[]{b.class, b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar, bVar2}, this, f15160a, false, 9908, new Class[]{b.class, b.class}, Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.equals(bVar.i(), bVar2.i()) || !TextUtils.equals(bVar.k(), bVar2.k()) || !a(bVar.n(), bVar2.n()) || !a(bVar.m(), bVar2.m())) {
            return false;
        } else {
            return true;
        }
    }

    public boolean areContentsTheSame(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f15160a, false, 9906, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f15160a, false, 9906, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        b bVar = this.f15161b.get(i);
        b bVar2 = this.f15162c.get(i2);
        if ((bVar instanceof j) && (bVar2 instanceof j)) {
            return false;
        }
        if (!(bVar instanceof h) || !(bVar2 instanceof h)) {
            if ((bVar instanceof a) && (bVar2 instanceof a) && ((a) bVar).a() != ((a) bVar2).a()) {
                return false;
            }
        } else if (((Prop) ((h) bVar).f15098d).count != ((Prop) ((h) bVar2).f15098d).count) {
            return false;
        }
        return a(bVar, bVar2);
    }

    @Nullable
    public Object getChangePayload(int i, int i2) {
        long j;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f15160a, false, 9907, new Class[]{Integer.TYPE, Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f15160a, false, 9907, new Class[]{Integer.TYPE, Integer.TYPE}, Object.class);
        }
        b bVar = this.f15161b.get(i);
        b bVar2 = this.f15162c.get(i2);
        if (!a(bVar, bVar2)) {
            return super.getChangePayload(i, i2);
        }
        if ((bVar instanceof j) && (bVar2 instanceof j)) {
            Bundle bundle = new Bundle();
            if (((com.bytedance.android.live.e.a) com.bytedance.android.live.utility.b.a(com.bytedance.android.live.e.a.class)).user().c()) {
                j = u.a().b();
            } else {
                j = 0;
            }
            bundle.putString("key_task_gift_count", String.valueOf(j));
            return bundle;
        } else if (!(bVar instanceof h) || !(bVar2 instanceof h)) {
            return super.getChangePayload(i, i2);
        } else {
            h hVar = (h) bVar2;
            Bundle bundle2 = new Bundle();
            if (((Prop) ((h) bVar).f15098d).count != ((Prop) hVar.f15098d).count) {
                bundle2.putString("key_prop_count", String.valueOf(((Prop) hVar.f15098d).count));
                bundle2.putBoolean("key_prop_show_item_combo", this.f15163d);
            }
            return bundle2;
        }
    }

    public GiftListDiffUtilCallback(@NonNull List<b> list, @NonNull List<b> list2, boolean z) {
        this.f15161b = list;
        this.f15162c = list2;
        this.f15163d = z;
    }
}
