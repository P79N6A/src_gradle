package com.ss.android.ugc.aweme.following.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48154a;

    @NonNull
    static FollowerCardViewHolder a(Context context, RecyclerView recyclerView, b bVar) {
        RecyclerView recyclerView2 = recyclerView;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{context, recyclerView2, bVar2}, null, f48154a, true, 44974, new Class[]{Context.class, RecyclerView.class, b.class}, FollowerCardViewHolder.class)) {
            return (FollowerCardViewHolder) PatchProxy.accessDispatch(new Object[]{context, recyclerView2, bVar2}, null, f48154a, true, 44974, new Class[]{Context.class, RecyclerView.class, b.class}, FollowerCardViewHolder.class);
        }
        FollowerCardViewHolder followerCardViewHolder = new FollowerCardViewHolder(LayoutInflater.from(context).inflate(C0906R.layout.mm, recyclerView2, false), bVar2);
        followerCardViewHolder.a();
        return followerCardViewHolder;
    }
}
