package com.tt.appbrandimpl.friends;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.tt.appbrandimpl.friends.viewholder.GameShareDecorationViewHolder;
import com.tt.appbrandimpl.friends.viewholder.GameShareViewHolder;
import java.util.ArrayList;
import java.util.List;

public class GameShareFriendsAdapter extends BaseAdapter {
    public static final String TAG = "GameShareFriendsAdapter";
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<IMUser> friendsUser = new ArrayList();
    private List<User> recommendUser = new ArrayList();
    private IShareService.ShareStruct shareStruct;

    public int getBasicItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91913, new Class[0], Integer.TYPE)) {
            return this.friendsUser.size() + this.recommendUser.size() + 2;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91913, new Class[0], Integer.TYPE)).intValue();
    }

    public GameShareFriendsAdapter(IShareService.ShareStruct shareStruct2) {
        this.shareStruct = shareStruct2;
    }

    public void setFollowData(List<IMUser> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 91909, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 91909, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.friendsUser.clear();
        this.friendsUser.addAll(list);
        notifyDataSetChanged();
    }

    public void setRecommendData(List<User> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 91908, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 91908, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.recommendUser.clear();
        this.recommendUser.addAll(list);
        notifyDataSetChanged();
    }

    public int getBasicItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91912, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 91912, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i == 0) {
            return 0;
        } else {
            if (i > 0 && i < this.friendsUser.size() + 1) {
                return 1;
            }
            if (i <= 0 || i != this.friendsUser.size() + 1) {
                return 3;
            }
            return 2;
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91910, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91910, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (i == 0) {
            ((GameShareDecorationViewHolder) viewHolder).bind();
        } else if (i > 0 && i < this.friendsUser.size() + 1) {
            ((GameShareViewHolder) viewHolder).bind(this.friendsUser.get(i - 1));
        } else if (i <= 0 || i != this.friendsUser.size() + 1) {
            int size = i - (this.friendsUser.size() + 2);
            if (size >= 0 && size <= this.recommendUser.size()) {
                ((GameShareViewHolder) viewHolder).bind(this.recommendUser.get(size));
            }
        } else {
            ((GameShareDecorationViewHolder) viewHolder).bind();
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91911, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, changeQuickRedirect, false, 91911, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 0) {
            return new GameShareDecorationViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.v6, viewGroup, false));
        } else {
            if (i == 1) {
                return new GameShareViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.v7, viewGroup, false), 1, this.shareStruct);
            }
            if (i == 2) {
                return new GameShareDecorationViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.v5, viewGroup, false));
            }
            return new GameShareViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.v7, viewGroup, false), 3, this.shareStruct);
        }
    }
}
