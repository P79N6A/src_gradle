package com.ss.android.ugc.aweme.newfollow.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.widget.a;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedCommentLayout;
import com.ss.android.ugc.aweme.newfollow.vh.CommentFollowFeedMomentViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.CommentViewHolderFollowFeed;
import com.ss.android.ugc.aweme.newfollow.vh.j;
import com.ss.android.ugc.aweme.newfollow.vh.y;
import java.util.List;

public class FollowFeedCommentAdapter extends BaseAdapter<Comment> implements CommentViewHolder.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57069a;

    /* renamed from: b  reason: collision with root package name */
    public int f57070b;

    /* renamed from: c  reason: collision with root package name */
    public String f57071c;

    /* renamed from: d  reason: collision with root package name */
    private Aweme f57072d;

    /* renamed from: e  reason: collision with root package name */
    private FollowFeedCommentLayout.a f57073e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f57074f;

    public final void a(CommentReplyButtonStruct commentReplyButtonStruct, int i) {
    }

    public final void b() {
    }

    public final void c(Comment comment) {
    }

    public final void a(Comment comment, int i) {
        if (PatchProxy.isSupport(new Object[]{comment, Integer.valueOf(i)}, this, f57069a, false, 61125, new Class[]{Comment.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, Integer.valueOf(i)}, this, f57069a, false, 61125, new Class[]{Comment.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f57073e != null) {
            this.f57073e.a(this.f57072d, comment, i);
        }
    }

    public final void b(a aVar, Comment comment) {
        if (PatchProxy.isSupport(new Object[]{aVar, comment}, this, f57069a, false, 61124, new Class[]{a.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, comment}, this, f57069a, false, 61124, new Class[]{a.class, Comment.class}, Void.TYPE);
            return;
        }
        if (this.f57073e != null) {
            this.f57073e.a(this.f57072d, comment);
        }
    }

    public final void a(a aVar, Comment comment) {
        if (PatchProxy.isSupport(new Object[]{aVar, comment}, this, f57069a, false, 61123, new Class[]{a.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, comment}, this, f57069a, false, 61123, new Class[]{a.class, Comment.class}, Void.TYPE);
            return;
        }
        if (this.f57073e != null) {
            this.f57073e.a(this.f57072d, comment, "click_comment");
        }
    }

    public final void b(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f57069a, false, 61126, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f57069a, false, 61126, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.f57073e != null) {
            this.f57073e.b(this.f57072d, str, str2);
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f57069a, false, 61119, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f57069a, false, 61119, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof CommentFollowFeedMomentViewHolder) {
            CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = (CommentFollowFeedMomentViewHolder) viewHolder2;
            Comment comment = (Comment) getData().get(i2);
            if (PatchProxy.isSupport(new Object[]{comment}, commentFollowFeedMomentViewHolder, CommentFollowFeedMomentViewHolder.f57492a, false, 62097, new Class[]{Comment.class}, Void.TYPE)) {
                CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder2 = commentFollowFeedMomentViewHolder;
                PatchProxy.accessDispatch(new Object[]{comment}, commentFollowFeedMomentViewHolder2, CommentFollowFeedMomentViewHolder.f57492a, false, 62097, new Class[]{Comment.class}, Void.TYPE);
            } else {
                if (comment != null) {
                    commentFollowFeedMomentViewHolder.f57493b = comment;
                    if (commentFollowFeedMomentViewHolder.mTvComment != null) {
                        commentFollowFeedMomentViewHolder.mTvComment.post(new j(commentFollowFeedMomentViewHolder, comment));
                    }
                }
            }
        } else {
            ((CommentViewHolderFollowFeed) viewHolder2).a((Comment) getData().get(i2));
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f57069a, false, 61120, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f57069a, false, 61120, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (this.f57074f) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (y.a()) {
                i2 = C0906R.layout.w0;
            } else {
                i2 = C0906R.layout.uf;
            }
            CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder = new CommentFollowFeedMomentViewHolder(from.inflate(i2, viewGroup, false), this);
            commentFollowFeedMomentViewHolder.f57494c = this.f57071c;
            commentFollowFeedMomentViewHolder.f57496e = this.f57072d.getAuthorUid();
            commentFollowFeedMomentViewHolder.f57495d = this.f57072d.getAid();
            return commentFollowFeedMomentViewHolder;
        } else {
            CommentViewHolderFollowFeed commentViewHolderFollowFeed = new CommentViewHolderFollowFeed(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.ue, viewGroup, false), this, d.a().getCurUserId());
            commentViewHolderFollowFeed.a(this.f57071c);
            commentViewHolderFollowFeed.g = this.f57070b;
            commentViewHolderFollowFeed.f36318f = this.f57072d.getAuthorUid();
            commentViewHolderFollowFeed.f36317e = this.f57072d.getAid();
            return commentViewHolderFollowFeed;
        }
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f57069a, false, 61122, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f57069a, false, 61122, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.f57073e != null) {
            this.f57073e.a(this.f57072d, str, str2);
        }
    }

    public FollowFeedCommentAdapter(Aweme aweme, FollowFeedCommentLayout.a aVar, boolean z) {
        this.f57072d = aweme;
        this.f57073e = aVar;
        this.f57074f = z;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        List list2 = list;
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i), list2}, this, f57069a, false, 61121, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i), list2}, this, f57069a, false, 61121, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
        if (!this.f57074f && !list.isEmpty() && (list2.get(0) instanceof Integer) && ((Integer) list2.get(0)).intValue() == 0) {
            ((CommentViewHolderFollowFeed) viewHolder).f();
        }
    }
}
