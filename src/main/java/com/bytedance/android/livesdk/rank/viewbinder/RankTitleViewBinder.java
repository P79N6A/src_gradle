package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import me.drakeet.multitype.c;

public final class RankTitleViewBinder extends c<com.bytedance.android.livesdk.rank.model.c, RankTitleViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17067a;

    static class RankTitleViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17068a;

        RankTitleViewHolder(View view) {
            super(view);
        }
    }

    @NonNull
    public final /* synthetic */ RecyclerView.ViewHolder a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2}, this, f17067a, false, 13110, new Class[]{LayoutInflater.class, ViewGroup.class}, RankTitleViewHolder.class)) {
            return new RankTitleViewHolder(layoutInflater2.inflate(C0906R.layout.ak5, viewGroup2, false));
        }
        return (RankTitleViewHolder) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2}, this, f17067a, false, 13110, new Class[]{LayoutInflater.class, ViewGroup.class}, RankTitleViewHolder.class);
    }

    public final /* synthetic */ void a(@NonNull RecyclerView.ViewHolder viewHolder, @NonNull Object obj) {
        RankTitleViewHolder rankTitleViewHolder = (RankTitleViewHolder) viewHolder;
        com.bytedance.android.livesdk.rank.model.c cVar = (com.bytedance.android.livesdk.rank.model.c) obj;
        if (PatchProxy.isSupport(new Object[]{rankTitleViewHolder, cVar}, this, f17067a, false, 13111, new Class[]{RankTitleViewHolder.class, com.bytedance.android.livesdk.rank.model.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rankTitleViewHolder, cVar}, this, f17067a, false, 13111, new Class[]{RankTitleViewHolder.class, com.bytedance.android.livesdk.rank.model.c.class}, Void.TYPE);
            return;
        }
        String str = cVar.f17030a;
        int i = cVar.f17031b;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, rankTitleViewHolder, RankTitleViewHolder.f17068a, false, 13112, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            RankTitleViewHolder rankTitleViewHolder2 = rankTitleViewHolder;
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, rankTitleViewHolder2, RankTitleViewHolder.f17068a, false, 13112, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((TextView) rankTitleViewHolder.itemView).setText(str);
        rankTitleViewHolder.itemView.setBackgroundColor(i);
    }
}
