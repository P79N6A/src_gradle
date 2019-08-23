package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.h;
import com.ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder;
import com.ss.android.ugc.aweme.friends.ui.RecommendFriendItemViewV2Holder;
import com.ss.android.ugc.aweme.friends.ui.ak;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\u001a\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0015H\u0014J\u001a\u0010\u001c\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0014J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010!\u001a\u00020\u00182\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bXD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u000ej\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b`\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/feed/adapter/FeedFollowEmptyGuideAdapter;", "Lcom/ss/android/ugc/aweme/base/widget/RecyclerHeaderViewAdapter;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "()V", "enterFrom", "", "getEnterFrom", "()Ljava/lang/String;", "setEnterFrom", "(Ljava/lang/String;)V", "isFirstRecommendFeed", "", "()Z", "mFollowClickMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recommendAwemeListener", "Lcom/ss/android/ugc/aweme/friends/adapter/RecommendAwemeViewHolder$RecommendAwemeClickListener;", "recommendItemListener", "Lcom/ss/android/ugc/aweme/base/activity/ViewEventListener;", "getBasicItemCount", "", "getTabEnterFrom", "onBindItemViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "position", "onCreateItemViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setRecommendAwemeListener", "setViewEventListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FeedFollowEmptyGuideAdapter extends RecyclerHeaderViewAdapter<User> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f44686f;
    public h<User> g;
    public RecommendAwemeViewHolder.a h;
    @NotNull
    public String i = "";
    public final boolean j = true;
    private final HashMap<String, Boolean> k = new HashMap<>();

    public final int getBasicItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f44686f, false, 40362, new Class[0], Integer.TYPE)) {
            return super.getBasicItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f44686f, false, 40362, new Class[0], Integer.TYPE)).intValue();
    }

    @NotNull
    public final RecyclerView.ViewHolder a(@Nullable ViewGroup viewGroup, int i2) {
        Context context;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f44686f, false, 40360, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f44686f, false, 40360, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        ak akVar = new ak(context, this.k);
        akVar.setEnterFrom(this.i);
        akVar.setListener(this.g);
        akVar.setRecommendAwemeClickListener(this.h);
        return new RecommendFriendItemViewV2Holder(akVar);
    }

    public final void a(@Nullable RecyclerView.ViewHolder viewHolder, int i2) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f44686f, false, 40361, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f44686f, false, 40361, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof RecommendFriendItemViewV2Holder) {
            ((RecommendFriendItemViewV2Holder) viewHolder2).a((User) this.mItems.get(i2), 0, false, 2);
        }
    }
}
