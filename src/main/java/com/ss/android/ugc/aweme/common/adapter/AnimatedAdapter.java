package com.ss.android.ugc.aweme.common.adapter;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;

public abstract class AnimatedAdapter extends RecyclerHeaderViewAdapter<Aweme> {
    public static ChangeQuickRedirect h;

    public final int a(String str) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, h, false, 33350, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, h, false, 33350, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.mItems == null || this.mItems.isEmpty() || TextUtils.isEmpty(str)) {
            return -1;
        } else {
            int size = this.mItems.size();
            while (i < size) {
                Aweme aweme = (Aweme) this.mItems.get(i);
                if (aweme == null || !StringUtils.equal(str, aweme.getAid())) {
                    i++;
                } else if (this.f35105d != null) {
                    return i + 1;
                } else {
                    return i;
                }
            }
            return -1;
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, h, false, 33348, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, h, false, 33348, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder.getItemViewType() == 0) {
            ((AnimatedViewHolder) viewHolder).a(true);
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, h, false, 33349, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, h, false, 33349, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder.getItemViewType() == 0) {
            AnimatedViewHolder animatedViewHolder = (AnimatedViewHolder) viewHolder;
            animatedViewHolder.a(false);
            animatedViewHolder.g();
        }
    }

    public final void a(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, h, false, 33351, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, h, false, 33351, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (this.mItems != null && !this.mItems.isEmpty() && followStatus != null && !TextUtils.isEmpty(followStatus.userId)) {
            for (Aweme aweme : this.mItems) {
                if (aweme != null) {
                    User author = aweme.getAuthor();
                    if (author != null && followStatus.userId.equals(author.getUid())) {
                        author.setFollowStatus(followStatus.followStatus);
                    }
                }
            }
        }
    }
}
