package com.ss.android.ugc.aweme.friends.ui;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.friends.ui.ah;
import com.ss.android.ugc.aweme.profile.model.User;

public class RecommendFriendAdapter extends BaseAdapter<User> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49328a;

    /* renamed from: b  reason: collision with root package name */
    public ah.a f49329b;

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f49328a, false, 47405, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f49328a, false, 47405, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        ah ahVar = new ah(viewGroup.getContext());
        ahVar.setListener(this.f49329b);
        ahVar.setLayoutParams(new RecyclerView.LayoutParams(-1, (int) UIUtils.dip2Px(viewGroup.getContext(), 84.0f)));
        return new RecommendFriendViewHolder(ahVar);
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f49328a, false, 47404, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f49328a, false, 47404, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        RecommendFriendViewHolder recommendFriendViewHolder = (RecommendFriendViewHolder) viewHolder;
        User user = (User) this.mItems.get(i);
        if (PatchProxy.isSupport(new Object[]{user}, recommendFriendViewHolder, RecommendFriendViewHolder.f49333a, false, 47428, new Class[]{User.class}, Void.TYPE)) {
            RecommendFriendViewHolder recommendFriendViewHolder2 = recommendFriendViewHolder;
            PatchProxy.accessDispatch(new Object[]{user}, recommendFriendViewHolder2, RecommendFriendViewHolder.f49333a, false, 47428, new Class[]{User.class}, Void.TYPE);
            return;
        }
        recommendFriendViewHolder.f49334b.setData(user);
    }
}
