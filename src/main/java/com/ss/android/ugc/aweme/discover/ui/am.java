package com.ss.android.ugc.aweme.discover.ui;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.alading.SearchAwemeCardViewHolder;
import com.ss.android.ugc.aweme.discover.alading.SearchEffectCardViewHolder;
import com.ss.android.ugc.aweme.discover.alading.SearchMusicCardViewHolder;
import com.ss.android.ugc.aweme.discover.model.SearchUser;

public final class am {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43124a;

    public static RecyclerView.ViewHolder a(ViewGroup viewGroup, SearchUser searchUser) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, searchUser}, null, f43124a, true, 37915, new Class[]{ViewGroup.class, SearchUser.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, searchUser}, null, f43124a, true, 37915, new Class[]{ViewGroup.class, SearchUser.class}, RecyclerView.ViewHolder.class);
        }
        RecyclerView.ViewHolder viewHolder = null;
        if (searchUser.cardType() == 1) {
            viewHolder = SearchAwemeCardViewHolder.a(viewGroup, searchUser);
        } else if (searchUser.cardType() == 2) {
            viewHolder = SearchMusicCardViewHolder.a(viewGroup, searchUser);
        } else if (searchUser.cardType() == 3) {
            viewHolder = SearchEffectCardViewHolder.a(viewGroup, searchUser);
        }
        return viewHolder;
    }
}
