package com.ss.android.ugc.aweme.forward.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.comment.adapter.CommentReplyButtonViewHolder;
import com.ss.android.ugc.aweme.comment.adapter.CommentReplyViewHolder;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.g.c;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.model.b;
import com.ss.android.ugc.aweme.forward.vh.BaseForwardViewHolder;
import com.ss.android.ugc.aweme.forward.vh.ForwardImageViewHolder;
import com.ss.android.ugc.aweme.forward.vh.ForwardTextViewHolder;
import com.ss.android.ugc.aweme.forward.vh.ForwardVideoViewHolder;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.newfollow.b.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.CommentViewHolderFollowFeed;
import com.ss.android.ugc.aweme.newfollow.vh.FollowImageViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.b.d;
import com.ss.android.ugc.aweme.story.api.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeedDetailAdapter extends BaseAdapter<b> implements Observer<d>, com.ss.android.ugc.aweme.newfollow.b.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48259a;

    /* renamed from: b  reason: collision with root package name */
    public BaseFollowViewHolder.a f48260b;

    /* renamed from: c  reason: collision with root package name */
    public CommentViewHolder.a f48261c;

    /* renamed from: d  reason: collision with root package name */
    public a f48262d;

    /* renamed from: e  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.feed.d f48263e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.forward.a.a f48264f;
    public BaseFollowViewHolder g;
    public BaseForwardViewHolder h;
    public String i;
    public String j;
    public String k;
    public int l;
    public Aweme m;
    public Aweme n;
    public String o;
    public c p;
    private l q;
    private RecyclerView r;
    private HashMap<Long, Long> s = new HashMap<>();
    private i t;

    public final void M_() {
        if (PatchProxy.isSupport(new Object[0], this, f48259a, false, 45360, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48259a, false, 45360, new Class[0], Void.TYPE);
        }
    }

    public final void a(Exception exc, Aweme aweme, int i2) {
        Exception exc2 = exc;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{exc2, aweme2, Integer.valueOf(i2)}, this, f48259a, false, 45351, new Class[]{Exception.class, Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, aweme2, Integer.valueOf(i2)}, this, f48259a, false, 45351, new Class[]{Exception.class, Aweme.class, Integer.TYPE}, Void.TYPE);
        } else if (aweme2 != null && this.g != null) {
            this.g.c(aweme2);
            com.ss.android.ugc.aweme.app.api.a.a.a(this.f48264f.d(), exc, i2 == 1 ? C0906R.string.a5i : C0906R.string.dnt);
        }
    }

    public boolean a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48259a, false, 45352, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48259a, false, 45352, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        int basicItemViewType = getBasicItemViewType(i2);
        return basicItemViewType == 0 || basicItemViewType == 1 || basicItemViewType == 2;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48259a, false, 45359, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48259a, false, 45359, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.s != null) {
            for (Map.Entry next : this.s.entrySet()) {
                Long l2 = (Long) next.getKey();
                if (z) {
                    a(l2.longValue(), System.currentTimeMillis());
                } else {
                    Comment comment = new Comment();
                    comment.setCid(String.valueOf(l2));
                    int indexOf = this.mItems.indexOf(new b(comment));
                    if (indexOf >= 0 && indexOf < this.mItems.size()) {
                        a(((b) this.mItems.get(indexOf)).getComment());
                    }
                    next.setValue(0L);
                }
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f48259a, false, 45341, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48259a, false, 45341, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.S();
        }
        if (this.h != null) {
            this.h.d();
        }
        a(false);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f48259a, false, 45343, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48259a, false, 45343, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null) {
            this.q.f();
        }
        if (this.t != null) {
            this.t.b().removeObserver(this);
        }
    }

    public final void B_() {
        if (PatchProxy.isSupport(new Object[0], this, f48259a, false, 45342, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48259a, false, 45342, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.V();
        }
        if (this.h != null) {
            this.h.B_();
        }
        if (this.q != null) {
            this.q.h();
        }
        a(true);
    }

    public int getLoadMoreHeight(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f48259a, false, 45339, new Class[]{View.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, f48259a, false, 45339, new Class[]{View.class}, Integer.TYPE)).intValue();
        } else if (view == null) {
            return 0;
        } else {
            return (int) UIUtils.dip2Px(view.getContext(), 75.0f);
        }
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        d dVar = (d) obj;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f48259a, false, 45332, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f48259a, false, 45332, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (!CollectionUtils.isEmpty(this.mItems)) {
            for (b aweme : this.mItems) {
                Aweme aweme2 = aweme.getAweme();
                if (!(aweme2 == null || aweme2.getAuthor() == null || !TextUtils.equals(dVar.f71831a, aweme2.getAuthor().getUid()))) {
                    aweme2.getAuthor().setHasUnreadStory(!dVar.f71832b);
                }
            }
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        long j2;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f48259a, false, 45354, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f48259a, false, 45354, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        Comment comment = null;
        if (viewHolder2 instanceof CommentViewHolder) {
            comment = ((CommentViewHolder) viewHolder2).f36314b;
        } else if (viewHolder2 instanceof CommentReplyViewHolder) {
            comment = ((CommentReplyViewHolder) viewHolder2).f36297c;
        }
        if (comment != null && comment.getUser() != null) {
            try {
                j2 = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j2 = 0;
            }
            if (j2 != 0) {
                a(j2, System.currentTimeMillis());
            }
        }
    }

    private void a(Comment comment) {
        long j2;
        String str;
        String str2;
        int i2;
        String cid;
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f48259a, false, 45357, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f48259a, false, 45357, new Class[]{Comment.class}, Void.TYPE);
        } else if (comment2 != null && !TextUtils.isEmpty(this.i)) {
            try {
                j2 = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j2 = 0;
            }
            if (this.s != null && this.s.get(Long.valueOf(j2)) != null && this.s.get(Long.valueOf(j2)).longValue() > 10) {
                long currentTimeMillis = System.currentTimeMillis() - this.s.get(Long.valueOf(j2)).longValue();
                if (currentTimeMillis > 30) {
                    int i3 = -1;
                    if (comment.getCommentType() == 2) {
                        String replyId = comment.getReplyId();
                        int e2 = this.p.e(replyId);
                        String cid2 = comment.getCid();
                        List<Comment> b2 = this.p.b(String.valueOf(e2));
                        if (b2 != null) {
                            i3 = b2.indexOf(comment2);
                        }
                        str2 = replyId;
                        str = cid2;
                        i2 = e2;
                    } else {
                        if (comment.getCommentType() == 1) {
                            cid = comment.getCid();
                            i2 = this.p.e(cid);
                        } else {
                            cid = comment.getCid();
                            i2 = this.mItems.indexOf(new b(comment2)) - 1;
                        }
                        str = "";
                        str2 = cid;
                    }
                    com.ss.android.ugc.aweme.comment.f.a.a(this.i, this.m.getAid(), str2, i2 + 1, str, i3 + 1, currentTimeMillis, "");
                }
            }
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f48259a, false, 45355, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f48259a, false, 45355, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        Comment comment = null;
        if (viewHolder instanceof CommentViewHolderFollowFeed) {
            comment = ((CommentViewHolderFollowFeed) viewHolder).f36314b;
        } else if (viewHolder instanceof CommentReplyViewHolder) {
            comment = ((CommentReplyViewHolder) viewHolder).f36297c;
        }
        Comment comment2 = comment;
        if (comment2 != null) {
            if (PatchProxy.isSupport(new Object[]{comment2}, this, f48259a, false, 45356, new Class[]{Comment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{comment2}, this, f48259a, false, 45356, new Class[]{Comment.class}, Void.TYPE);
            } else if (comment2 != null && comment2.getUser() != null) {
                try {
                    j2 = Long.parseLong(comment2.getCid());
                } catch (Exception unused) {
                    j2 = 0;
                }
                a(comment2);
                this.s.remove(Long.valueOf(j2));
            }
        }
    }

    public int getBasicItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f48259a, false, 45338, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f48259a, false, 45338, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        b bVar = (b) this.mItems.get(i2);
        if (bVar == null) {
            return -1;
        }
        if (bVar.getType() == 1) {
            if (bVar.getComment() != null) {
                int commentType = bVar.getComment().getCommentType();
                if (commentType == 11) {
                    return 11;
                }
                switch (commentType) {
                    case 0:
                        return 0;
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                }
            }
            return 0;
        }
        if (bVar.getType() == 0) {
            Aweme aweme = bVar.getAweme();
            if (aweme.getAwemeType() == 0 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53) {
                return 16;
            }
            if (aweme.getAwemeType() == 2) {
                return 17;
            }
            if (aweme.getAwemeType() == 13) {
                if (aweme.getForwardItem() == null) {
                    return 20;
                }
                if (aweme.getForwardItem().getAwemeType() == 0 || aweme.getForwardItem().getAwemeType() == 51 || aweme.getForwardItem().getAwemeType() == 52 || aweme.getForwardItem().getAwemeType() == 54 || aweme.getForwardItem().getAwemeType() == 53) {
                    return 18;
                }
                if (aweme.getForwardItem().getAwemeType() == 2) {
                    return 19;
                }
            }
        }
        return -1;
    }

    public final List<b> a(List<Comment> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f48259a, false, 45334, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f48259a, false, 45334, new Class[]{List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(list)) {
            for (Comment bVar : list) {
                arrayList.add(new b(bVar));
            }
        }
        return arrayList;
    }

    public FeedDetailAdapter(RecyclerView recyclerView, com.ss.android.ugc.aweme.feed.d dVar) {
        this.r = recyclerView;
        this.q = new l(recyclerView);
        this.f48263e = dVar;
        if (PatchProxy.isSupport(new Object[0], this, f48259a, false, 45331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48259a, false, 45331, new Class[0], Void.TYPE);
            return;
        }
        this.t = (i) ServiceManager.get().getService(i.class);
        if (this.t != null) {
            this.t.b().observe((LifecycleOwner) v.a(this.r.getContext()), this);
        }
    }

    private void a(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f48259a, false, 45358, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f48259a, false, 45358, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        this.s.put(Long.valueOf(j2), Long.valueOf(j3));
    }

    public final int b(String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2)}, this, f48259a, false, 45353, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2)}, this, f48259a, false, 45353, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (getBasicItemCount() == 0) {
            return -1;
        } else {
            for (int i3 = 0; i3 < getData().size(); i3++) {
                Comment comment = ((b) getData().get(i3)).getComment();
                if (getBasicItemViewType(i3) == i2 && comment != null && TextUtils.equals(comment.getCid(), str2)) {
                    return i3;
                }
            }
            return -1;
        }
    }

    public final int a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f48259a, false, 45347, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f48259a, false, 45347, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (getBasicItemCount() == 0 || TextUtils.isEmpty(str)) {
            return -1;
        } else {
            for (int i3 = 0; i3 < getData().size(); i3++) {
                if (a(i3)) {
                    Comment comment = ((b) getData().get(i3)).getComment();
                    if (comment != null && StringUtils.equal(comment.getCid(), str)) {
                        if (i2 > 1) {
                            List list = this.mItems;
                            list.subList(i3, Math.min(list.size(), i2 + i3)).clear();
                            notifyItemRangeRemoved(i3, i2);
                        } else {
                            if (i3 > 0) {
                                notifyItemChanged(i3 - 1);
                            }
                            this.mItems.remove(i3);
                            notifyItemRemoved(i3);
                        }
                        notifyItemRangeChanged(i3, getData().size() - i3);
                        return i3;
                    }
                }
            }
            return -1;
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f48259a, false, 45336, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i2)}, this, f48259a, false, 45336, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        int basicItemViewType = getBasicItemViewType(i2);
        if (basicItemViewType != 2) {
            if (basicItemViewType != 11) {
                switch (basicItemViewType) {
                    case SearchJediMixFeedAdapter.f42514c:
                    case 17:
                        BaseFollowViewHolder baseFollowViewHolder = (BaseFollowViewHolder) viewHolder;
                        baseFollowViewHolder.s = this.l;
                        baseFollowViewHolder.t = "detail";
                        baseFollowViewHolder.r = this.i;
                        baseFollowViewHolder.F = this.o;
                        baseFollowViewHolder.a(((b) this.mItems.get(i2)).getAweme(), new ArrayList(), null, this.f48260b);
                        baseFollowViewHolder.G = this.j;
                        baseFollowViewHolder.I = this.k;
                        baseFollowViewHolder.a(this.n);
                        return;
                    case 18:
                    case 19:
                    case 20:
                        if (((b) this.mItems.get(i2)).getAweme() != null) {
                            BaseForwardViewHolder baseForwardViewHolder = (BaseForwardViewHolder) viewHolder;
                            baseForwardViewHolder.i = this.i;
                            baseForwardViewHolder.a(((b) this.mItems.get(i2)).getAweme(), (List<Comment>) new ArrayList<Comment>(), (List<User>) null, this.i, this.j);
                            return;
                        }
                        break;
                    default:
                        CommentViewHolderFollowFeed commentViewHolderFollowFeed = (CommentViewHolderFollowFeed) viewHolder;
                        if (getBasicItemViewType(i2) != 1 || i2 >= getBasicItemCount() - 1 || getBasicItemViewType(i2 + 1) == 1) {
                            commentViewHolderFollowFeed.itemView.setPadding(0, 0, 0, 0);
                        } else {
                            commentViewHolderFollowFeed.itemView.setPadding(0, 0, 0, u.a(10.0d));
                        }
                        commentViewHolderFollowFeed.a(((b) getData().get(i2)).getComment());
                        break;
                }
            } else {
                ((CommentReplyButtonViewHolder) viewHolder).a((CommentReplyButtonStruct) ((b) this.mItems.get(i2)).getComment());
            }
        } else if (this.mItems.get(i2) != null) {
            CommentReplyViewHolder commentReplyViewHolder = (CommentReplyViewHolder) viewHolder;
            commentReplyViewHolder.a(((b) this.mItems.get(i2)).getComment());
            commentReplyViewHolder.f36299e = this.i;
        }
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        int i3 = i2;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f48259a, false, 45337, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f48259a, false, 45337, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i3 == 11) {
            return new CommentReplyButtonViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.t2, viewGroup2, false), this.f48261c);
        } else {
            switch (i3) {
                case 1:
                    z = false;
                    break;
                case 2:
                    CommentReplyViewHolder commentReplyViewHolder = new CommentReplyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.t1, viewGroup2, false), this.f48261c);
                    commentReplyViewHolder.g = this.m.getAuthorUid();
                    commentReplyViewHolder.f36300f = this.m.getAid();
                    commentReplyViewHolder.f36299e = this.i;
                    return commentReplyViewHolder;
                default:
                    switch (i3) {
                        case SearchJediMixFeedAdapter.f42514c:
                            FollowVideoViewHolder followVideoViewHolder = new FollowVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.f48264f, this.q, this.f48262d, this.f48263e);
                            followVideoViewHolder.D = false;
                            this.g = followVideoViewHolder;
                            return followVideoViewHolder;
                        case 17:
                            FollowImageViewHolder followImageViewHolder = new FollowImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.f48264f, this.q, this.f48262d);
                            followImageViewHolder.D = false;
                            this.g = followImageViewHolder;
                            return followImageViewHolder;
                        case 18:
                            ForwardVideoViewHolder forwardVideoViewHolder = new ForwardVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.f48264f, this.f48263e, this.q, this.f48260b, this.f48262d);
                            forwardVideoViewHolder.c(1);
                            this.h = forwardVideoViewHolder;
                            return forwardVideoViewHolder;
                        case 19:
                            ForwardImageViewHolder forwardImageViewHolder = new ForwardImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.f48264f, this.q, this.f48260b, this.f48262d);
                            forwardImageViewHolder.c(1);
                            this.h = forwardImageViewHolder;
                            return forwardImageViewHolder;
                        case 20:
                            ForwardTextViewHolder forwardTextViewHolder = new ForwardTextViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.um, viewGroup2, false), this.f48264f, this.q, this.f48260b, this.f48262d);
                            forwardTextViewHolder.c(1);
                            this.h = forwardTextViewHolder;
                            return forwardTextViewHolder;
                    }
            }
            CommentViewHolderFollowFeed commentViewHolderFollowFeed = new CommentViewHolderFollowFeed(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.uz, viewGroup2, false), this.f48261c, com.ss.android.ugc.aweme.account.d.a().getCurUserId());
            commentViewHolderFollowFeed.i = z;
            commentViewHolderFollowFeed.a(this.i);
            commentViewHolderFollowFeed.g = this.l;
            commentViewHolderFollowFeed.f36318f = this.m.getAuthorUid();
            commentViewHolderFollowFeed.f36317e = this.m.getAid();
            return commentViewHolderFollowFeed;
        }
    }

    public final List<b> a(Aweme aweme, List<Comment> list) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2, list}, this, f48259a, false, 45333, new Class[]{Aweme.class, List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{aweme2, list}, this, f48259a, false, 45333, new Class[]{Aweme.class, List.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b(aweme2));
        if (!CollectionUtils.isEmpty(list)) {
            for (Comment bVar : list) {
                arrayList.add(new b(bVar));
            }
        }
        return arrayList;
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i2, @NonNull List list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list2 = list;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2), list2}, this, f48259a, false, 45335, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2), list2}, this, f48259a, false, 45335, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        super.onBindViewHolder(viewHolder, i2, list);
        if (!list.isEmpty() && (list2.get(0) instanceof Integer) && ((Integer) list2.get(0)).intValue() == 0) {
            if (viewHolder2 instanceof CommentViewHolderFollowFeed) {
                ((CommentViewHolderFollowFeed) viewHolder2).f();
            } else if (viewHolder2 instanceof CommentReplyViewHolder) {
                ((CommentReplyViewHolder) viewHolder2).b();
            }
        }
    }
}
