package com.ss.android.ugc.aweme.friends.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.ui.FriendListFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.b.d;
import com.ss.android.ugc.aweme.story.api.i;

public class FriendListAdapter extends BaseAdapter<c> implements Observer<d> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48714a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f48715b;

    /* renamed from: c  reason: collision with root package name */
    private FriendListFragment f48716c;

    /* renamed from: d  reason: collision with root package name */
    private i f48717d = ((i) ServiceManager.get().getService(i.class));

    public long getItemId(int i) {
        return (long) i;
    }

    public FriendListAdapter(FriendListFragment friendListFragment) {
        this.f48716c = friendListFragment;
        setLoadEmptyTextResId(C0906R.string.a3f);
        if (this.f48717d != null) {
            this.f48717d.b().observe((LifecycleOwner) v.a(this.f48716c.getContext()), this);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        d dVar = (d) obj;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f48714a, false, 46277, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f48714a, false, 46277, new Class[]{d.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.mItems) && dVar.f71832b) {
            for (c user : this.mItems) {
                User user2 = user.getUser();
                if (user2 != null && TextUtils.equals(dVar.f71831a, user2.getUid())) {
                    user2.setHasUnreadStory(false);
                }
            }
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f48714a, false, 46276, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f48714a, false, 46276, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ((FriendListViewHolder) viewHolder).a((c) getData().get(i), this.f48716c, this.f48715b);
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48714a, false, 46275, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48714a, false, 46275, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        if (!PatchProxy.isSupport(new Object[]{viewGroup2}, null, FriendListViewHolder.f48718a, true, 46281, new Class[]{ViewGroup.class}, FriendListViewHolder.class)) {
            return new FriendListViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.v0, viewGroup2, false));
        }
        return (FriendListViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, null, FriendListViewHolder.f48718a, true, 46281, new Class[]{ViewGroup.class}, FriendListViewHolder.class);
    }
}
