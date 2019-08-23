package com.ss.android.ugc.aweme.effect;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.effect.EffectListItemViewHolder;
import com.ss.android.ugc.aweme.feed.model.NewFaceSticker;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/effect/StickerListAdapter;", "Lcom/ss/android/ugc/aweme/common/adapter/BaseAdapter;", "Lcom/ss/android/ugc/aweme/feed/model/NewFaceSticker;", "mIsMe", "", "(Z)V", "getMIsMe", "()Z", "setMIsMe", "getData", "position", "", "onBindBasicViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "onCreateBasicViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StickerListAdapter extends BaseAdapter<NewFaceSticker> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43548a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f43549b;

    public StickerListAdapter(boolean z) {
        this.f43549b = z;
    }

    @Nullable
    public final NewFaceSticker a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f43548a, false, 38639, new Class[]{Integer.TYPE}, NewFaceSticker.class)) {
            return (NewFaceSticker) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f43548a, false, 38639, new Class[]{Integer.TYPE}, NewFaceSticker.class);
        } else if (i >= this.mItems.size() || this.mItems == null) {
            return null;
        } else {
            List list = this.mItems;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            return (NewFaceSticker) list.get(i);
        }
    }

    @Nullable
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(@NotNull ViewGroup viewGroup, int i) {
        View inflate;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f43548a, false, 38638, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f43548a, false, 38638, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        EffectListItemViewHolder.a aVar = EffectListItemViewHolder.h;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, aVar, EffectListItemViewHolder.a.f43519a, false, 38567, new Class[]{ViewGroup.class}, View.class)) {
            EffectListItemViewHolder.a aVar2 = aVar;
            inflate = (View) PatchProxy.accessDispatch(new Object[]{viewGroup2}, aVar2, EffectListItemViewHolder.a.f43519a, false, 38567, new Class[]{ViewGroup.class}, View.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "viewGroup");
            inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.tq, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(view…layout, viewGroup, false)");
        }
        return new EffectListItemViewHolder(inflate, this.f43549b);
    }

    public final void onBindBasicViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f43548a, false, 38637, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f43548a, false, 38637, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        EffectListItemViewHolder effectListItemViewHolder = (EffectListItemViewHolder) viewHolder2;
        NewFaceSticker a2 = a(i);
        if (PatchProxy.isSupport(new Object[]{a2}, effectListItemViewHolder, EffectListItemViewHolder.f43513a, false, 38564, new Class[]{NewFaceSticker.class}, Void.TYPE)) {
            EffectListItemViewHolder effectListItemViewHolder2 = effectListItemViewHolder;
            PatchProxy.accessDispatch(new Object[]{a2}, effectListItemViewHolder2, EffectListItemViewHolder.f43513a, false, 38564, new Class[]{NewFaceSticker.class}, Void.TYPE);
            return;
        }
        if (a2 != null) {
            effectListItemViewHolder.f43518f = a2;
            TextView textView = effectListItemViewHolder.f43514b;
            if (textView == null) {
                Intrinsics.throwNpe();
            }
            NewFaceSticker newFaceSticker = effectListItemViewHolder.f43518f;
            if (newFaceSticker == null) {
                Intrinsics.throwNpe();
            }
            textView.setText(newFaceSticker.getName());
            TextView textView2 = effectListItemViewHolder.f43515c;
            if (textView2 == null) {
                Intrinsics.throwNpe();
            }
            NewFaceSticker newFaceSticker2 = effectListItemViewHolder.f43518f;
            if (newFaceSticker2 == null) {
                Intrinsics.throwNpe();
            }
            if (TextUtils.isEmpty(newFaceSticker2.getDesc())) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView2.setVisibility(i2);
            TextView textView3 = effectListItemViewHolder.f43515c;
            if (textView3 == null) {
                Intrinsics.throwNpe();
            }
            NewFaceSticker newFaceSticker3 = effectListItemViewHolder.f43518f;
            if (newFaceSticker3 == null) {
                Intrinsics.throwNpe();
            }
            textView3.setText(newFaceSticker3.getDesc());
            TextView textView4 = effectListItemViewHolder.f43516d;
            if (textView4 == null) {
                Intrinsics.throwNpe();
            }
            Context context = effectListItemViewHolder.g;
            Object[] objArr = new Object[1];
            NewFaceSticker newFaceSticker4 = effectListItemViewHolder.f43518f;
            if (newFaceSticker4 == null) {
                Intrinsics.throwNpe();
            }
            objArr[0] = Integer.valueOf(newFaceSticker4.getUserCount());
            textView4.setText(context.getString(C0906R.string.bkr, objArr));
            RemoteImageView remoteImageView = effectListItemViewHolder.f43517e;
            NewFaceSticker newFaceSticker5 = effectListItemViewHolder.f43518f;
            if (newFaceSticker5 == null) {
                Intrinsics.throwNpe();
            }
            c.b(remoteImageView, newFaceSticker5.getIconUrl());
        }
    }
}
