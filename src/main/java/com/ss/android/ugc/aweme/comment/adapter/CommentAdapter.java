package com.ss.android.ugc.aweme.comment.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.d.b;
import com.ss.android.ugc.aweme.comment.f.a;
import com.ss.android.ugc.aweme.comment.g.c;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.commercialize.adapter.AdCommentViewHolder;
import com.ss.android.ugc.aweme.commercialize.c.e;
import com.ss.android.ugc.aweme.commercialize.views.AdCommentView;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentAdapter extends BaseAdapter<Comment> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36281a;

    /* renamed from: b  reason: collision with root package name */
    public String f36282b;

    /* renamed from: c  reason: collision with root package name */
    public e f36283c;

    /* renamed from: d  reason: collision with root package name */
    public b f36284d;

    /* renamed from: e  reason: collision with root package name */
    public String f36285e;

    /* renamed from: f  reason: collision with root package name */
    public c f36286f;
    public boolean g;
    private CommentViewHolder.a h;
    @Deprecated
    private String i;
    @SuppressLint({"all"})
    private HashMap<Long, Long> j = new HashMap<>();
    @Deprecated
    private Aweme k;
    private boolean l = false;
    private int m = 0;
    private final int n;
    private final int o;
    private final int p;

    private static boolean b(int i2) {
        return i2 == 1 || i2 == 0 || i2 == 10;
    }

    public List<Comment> getData() {
        return this.mItems;
    }

    public final void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f36281a, false, 27188, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f36281a, false, 27188, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.k = aweme;
        if (PatchProxy.isSupport(new Object[0], this, f36281a, false, 27193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36281a, false, 27193, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null && this.k.isAd()) {
            AwemeRawAd awemeRawAd = this.k.getAwemeRawAd();
            com.ss.android.ugc.aweme.commercialize.model.c commentArea = awemeRawAd.getCommentArea();
            this.l = awemeRawAd.isCommentAreaSwitch();
            if (commentArea != null) {
                this.m = commentArea.getShowButtonNumber();
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36281a, false, 27209, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36281a, false, 27209, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.j != null) {
            for (Map.Entry next : this.j.entrySet()) {
                Long l2 = (Long) next.getKey();
                Comment comment = null;
                Comment comment2 = new Comment();
                comment2.setCid(String.valueOf(l2));
                int indexOf = this.mItems.indexOf(comment2);
                if (indexOf >= 0) {
                    comment = (Comment) this.mItems.get(indexOf);
                }
                if (comment != null) {
                    if (z) {
                        a(l2.longValue(), System.currentTimeMillis());
                        if (comment.isAuthorDigged()) {
                            a.b(this.f36282b, this.f36284d.getAid(), this.f36284d.getAuthorUid(), comment.getCid());
                        }
                    } else {
                        a((Comment) this.mItems.get(indexOf));
                        next.setValue(0L);
                    }
                }
            }
        }
    }

    public int getLoadMoreHeight(View view) {
        if (!PatchProxy.isSupport(new Object[]{view}, this, f36281a, false, 27199, new Class[]{View.class}, Integer.TYPE)) {
            return (int) UIUtils.dip2Px(view.getContext(), 45.0f);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{view}, this, f36281a, false, 27199, new Class[]{View.class}, Integer.TYPE)).intValue();
    }

    public void onBindFooterViewHolder(RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f36281a, false, 27195, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f36281a, false, 27195, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onBindFooterViewHolder(viewHolder);
        viewHolder.itemView.setPadding(this.p, viewHolder.itemView.getPaddingTop(), this.p, viewHolder.itemView.getPaddingBottom());
    }

    private Rect a(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f36281a, false, 27191, new Class[]{Integer.TYPE}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f36281a, false, 27191, new Class[]{Integer.TYPE}, Rect.class);
        } else if (!Comment.isSupportReplyComment()) {
            return new Rect(-1, -1, -1, -1);
        } else {
            int i4 = this.o;
            int basicItemViewType = getBasicItemViewType(i2);
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f36281a, false, 27190, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                i3 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f36281a, false, 27190, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
            } else if (i2 >= getBasicItemCount() - 1) {
                i3 = -1;
            } else {
                i3 = getBasicItemViewType(i2 + 1);
            }
            if (b(basicItemViewType) && !b(i3)) {
                i4 = this.n;
            }
            return new Rect(-1, this.o, -1, i4);
        }
    }

    public int getBasicItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f36281a, false, 27197, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f36281a, false, 27197, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (getData() != null) {
            int commentType = getData().get(i2).getCommentType();
            switch (commentType) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                default:
                    switch (commentType) {
                        case 10:
                            return 10;
                        case 11:
                            return 11;
                    }
            }
        } else {
            int i3 = i2;
        }
        return super.getBasicItemViewType(i2);
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, f36281a, false, 27206, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, f36281a, false, 27206, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        Comment comment = null;
        if (viewHolder instanceof CommentViewHolder) {
            comment = ((CommentViewHolder) viewHolder).f36314b;
        } else if (viewHolder instanceof CommentReplyViewHolder) {
            comment = ((CommentReplyViewHolder) viewHolder).f36297c;
        }
        Comment comment2 = comment;
        if (comment2 != null) {
            if (PatchProxy.isSupport(new Object[]{comment2}, this, f36281a, false, 27207, new Class[]{Comment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{comment2}, this, f36281a, false, 27207, new Class[]{Comment.class}, Void.TYPE);
            } else if (comment2 != null && comment2.getUser() != null) {
                try {
                    j2 = Long.parseLong(comment2.getCid());
                } catch (Exception unused) {
                    j2 = 0;
                }
                a(comment2);
                this.j.remove(Long.valueOf(j2));
            }
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        long j2;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f36281a, false, 27204, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f36281a, false, 27204, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        Comment comment = null;
        if (viewHolder2 instanceof CommentViewHolder) {
            CommentViewHolder commentViewHolder = (CommentViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], commentViewHolder, CommentViewHolder.f36313a, false, 27254, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], commentViewHolder, CommentViewHolder.f36313a, false, 27254, new Class[0], Void.TYPE);
            } else if (!(commentViewHolder.f36314b == null || !commentViewHolder.f36314b.isNeedHint() || commentViewHolder.mBgView == null)) {
                commentViewHolder.mBgView.postDelayed(new i(commentViewHolder), 150);
            }
            comment = commentViewHolder.f36314b;
        } else if (viewHolder2 instanceof CommentReplyViewHolder) {
            CommentReplyViewHolder commentReplyViewHolder = (CommentReplyViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[0], commentReplyViewHolder, CommentReplyViewHolder.f36295a, false, 27239, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], commentReplyViewHolder, CommentReplyViewHolder.f36295a, false, 27239, new Class[0], Void.TYPE);
            } else if (!(commentReplyViewHolder.f36297c == null || !commentReplyViewHolder.f36297c.isNeedHint() || commentReplyViewHolder.mBgView == null)) {
                commentReplyViewHolder.mBgView.postDelayed(new g(commentReplyViewHolder), 150);
            }
            comment = commentReplyViewHolder.f36297c;
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
            if (comment.isAuthorDigged()) {
                a.b(this.f36282b, this.f36284d.getAid(), this.f36284d.getAuthorUid(), comment.getCid());
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
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36281a, false, 27208, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f36281a, false, 27208, new Class[]{Comment.class}, Void.TYPE);
        } else if (comment2 != null && !TextUtils.isEmpty(this.f36282b)) {
            try {
                j2 = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j2 = 0;
            }
            if (this.j != null && this.j.get(Long.valueOf(j2)) != null && this.j.get(Long.valueOf(j2)).longValue() > 10) {
                long currentTimeMillis = System.currentTimeMillis() - this.j.get(Long.valueOf(j2)).longValue();
                if (currentTimeMillis > 30) {
                    int i3 = -1;
                    if (comment.getCommentType() == 2) {
                        String replyId = comment.getReplyId();
                        int e2 = this.f36286f.e(replyId);
                        String cid2 = comment.getCid();
                        List b2 = this.f36286f.b(String.valueOf(e2));
                        if (b2 != null) {
                            i3 = b2.indexOf(comment2);
                        }
                        str2 = replyId;
                        str = cid2;
                        i2 = e2;
                    } else {
                        if (comment.getCommentType() == 1) {
                            cid = comment.getCid();
                            i2 = this.f36286f.e(cid);
                        } else {
                            cid = comment.getCid();
                            i2 = this.mItems.indexOf(comment2);
                        }
                        str = "";
                        str2 = cid;
                    }
                    a.a(this.f36282b, this.f36284d.getAid(), str2, i2 + 1, str, i3 + 1, currentTimeMillis, this.f36285e, this.f36284d.getIsLongItem());
                }
            }
        }
    }

    public CommentAdapter(CommentViewHolder.a aVar, b bVar) {
        float f2;
        float f3;
        Context context = GlobalContext.getContext();
        if (com.ss.android.g.a.a()) {
            f2 = 5.0f;
        } else {
            f2 = 5.5f;
        }
        this.n = (int) UIUtils.dip2Px(context, f2);
        Context context2 = GlobalContext.getContext();
        if (com.ss.android.g.a.a()) {
            f3 = 11.0f;
        } else {
            f3 = 10.0f;
        }
        this.o = (int) UIUtils.dip2Px(context2, f3);
        this.p = (int) UIUtils.dip2Px(GlobalContext.getContext(), 16.0f);
        this.g = false;
        this.h = aVar;
        this.f36284d = bVar;
        this.i = bVar.getAuthorUid();
        setLoadEmptyTextResId(C0906R.string.a3f);
    }

    private void a(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f36281a, false, 27205, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f36281a, false, 27205, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        this.j.put(Long.valueOf(j2), Long.valueOf(j3));
    }

    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
        View view;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f36281a, false, 27198, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i2)}, this, f36281a, false, 27198, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        switch (i2) {
            case 1:
                z = false;
                break;
            case 2:
                CommentReplyViewHolder commentReplyViewHolder = new CommentReplyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.t1, viewGroup, false), this.h);
                commentReplyViewHolder.g = this.f36284d.getAuthorUid();
                commentReplyViewHolder.f36300f = this.f36284d.getAid();
                commentReplyViewHolder.f36299e = this.f36282b;
                return commentReplyViewHolder;
            case 10:
                return new AdCommentViewHolder(new AdCommentView(viewGroup.getContext()), this.h);
            case 11:
                return new CommentReplyButtonViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.t2, viewGroup, false), this.h);
        }
        if (Comment.isSupportReplyComment()) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.t0, viewGroup, false);
        } else {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sz, viewGroup, false);
        }
        CommentViewHolderNewStyle commentViewHolderNewStyle = new CommentViewHolderNewStyle(view, this.h, this.i);
        commentViewHolderNewStyle.i = z;
        commentViewHolderNewStyle.f36318f = this.f36284d.getAuthorUid();
        commentViewHolderNewStyle.f36317e = this.f36284d.getAid();
        commentViewHolderNewStyle.g = this.f36284d.getPageType();
        commentViewHolderNewStyle.a(this.f36282b);
        return commentViewHolderNewStyle;
    }

    public static void a(Rect rect, View view) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Rect rect2 = rect;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{rect2, view2}, null, f36281a, true, 27211, new Class[]{Rect.class, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2}, null, f36281a, true, 27211, new Class[]{Rect.class, View.class}, Void.TYPE);
            return;
        }
        if (rect2 != null) {
            if (rect2.top >= 0) {
                i2 = rect2.top;
            } else {
                i2 = view.getPaddingTop();
            }
            if (rect2.bottom >= 0) {
                i3 = rect2.bottom;
            } else {
                i3 = view.getPaddingBottom();
            }
            if (Build.VERSION.SDK_INT >= 17) {
                if (rect2.left >= 0) {
                    i6 = rect2.left;
                } else {
                    i6 = view.getPaddingStart();
                }
                if (rect2.right >= 0) {
                    i7 = rect2.right;
                } else {
                    i7 = view.getPaddingEnd();
                }
                view2.setPaddingRelative(i6, i2, i7, i3);
                return;
            }
            if (rect2.left >= 0) {
                i4 = rect2.left;
            } else {
                i4 = view.getPaddingLeft();
            }
            if (rect2.right >= 0) {
                i5 = rect2.right;
            } else {
                i5 = view.getPaddingRight();
            }
            if (ey.a(GlobalContext.getContext())) {
                view2.setPadding(i5, i2, i4, i3);
                return;
            }
            view2.setPadding(i4, i2, i5, i3);
        }
    }

    public void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f36281a, false, 27192, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f36281a, false, 27192, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        int itemViewType = getItemViewType(i3);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f36281a, false, 27194, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f36281a, false, 27194, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.l && this.f36283c != null && this.m > 0 && i3 == this.m) {
            this.f36283c.p();
        }
        if (itemViewType != 2) {
            switch (itemViewType) {
                case 10:
                    AdCommentViewHolder adCommentViewHolder = (AdCommentViewHolder) viewHolder2;
                    com.ss.android.ugc.aweme.commercialize.model.c cVar = (com.ss.android.ugc.aweme.commercialize.model.c) getData().get(i3);
                    Rect a2 = a(i3);
                    if (PatchProxy.isSupport(new Object[]{cVar, a2}, adCommentViewHolder, AdCommentViewHolder.f38479a, false, 30404, new Class[]{com.ss.android.ugc.aweme.commercialize.model.c.class, Rect.class}, Void.TYPE)) {
                        Object[] objArr = {cVar, a2};
                        AdCommentViewHolder adCommentViewHolder2 = adCommentViewHolder;
                        ChangeQuickRedirect changeQuickRedirect = AdCommentViewHolder.f38479a;
                        PatchProxy.accessDispatch(objArr, adCommentViewHolder2, changeQuickRedirect, false, 30404, new Class[]{com.ss.android.ugc.aweme.commercialize.model.c.class, Rect.class}, Void.TYPE);
                        break;
                    } else {
                        adCommentViewHolder.f38480b.setData(cVar);
                        a(a2, (View) adCommentViewHolder.f38480b);
                        if (adCommentViewHolder.f38481c.get() != null) {
                            adCommentViewHolder.f38480b.setOnInternalEventListener((CommentViewHolder.a) adCommentViewHolder.f38481c.get());
                        }
                        return;
                    }
                case 11:
                    ((CommentReplyButtonViewHolder) viewHolder2).a((CommentReplyButtonStruct) this.mItems.get(i3));
                    return;
                default:
                    ((CommentViewHolder) viewHolder2).a((Comment) this.mItems.get(i3), a(i3));
                    if (viewHolder2 instanceof CommentViewHolderNewStyle) {
                        ((CommentViewHolderNewStyle) viewHolder2).a(this.f36282b);
                        break;
                    }
                    break;
            }
            return;
        }
        CommentReplyViewHolder commentReplyViewHolder = (CommentReplyViewHolder) viewHolder2;
        commentReplyViewHolder.a((Comment) this.mItems.get(i3));
        commentReplyViewHolder.f36299e = this.f36282b;
    }

    public final int a(String str, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2)}, this, f36281a, false, 27210, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2)}, this, f36281a, false, 27210, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (getBasicItemCount() == 0) {
            return -1;
        } else {
            for (int i3 = 0; i3 < getData().size(); i3++) {
                Comment comment = getData().get(i3);
                if (comment == null) {
                    int i4 = i2;
                } else if (comment.getCommentType() == i2 && StringUtils.equal(comment.getCid(), str2)) {
                    return i3;
                }
            }
            return -1;
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list2 = list;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2), list2}, this, f36281a, false, 27196, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2), list2}, this, f36281a, false, 27196, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
        } else if (getItemViewType(i2) == Integer.MIN_VALUE) {
            onBindFooterViewHolder(viewHolder);
        } else if (list.isEmpty()) {
            onBindBasicViewHolder(viewHolder, i2);
        } else {
            int intValue = ((Integer) list2.get(0)).intValue();
            if (intValue == 0) {
                if (viewHolder2 instanceof CommentViewHolderNewStyle) {
                    CommentViewHolderNewStyle commentViewHolderNewStyle = (CommentViewHolderNewStyle) viewHolder2;
                    commentViewHolderNewStyle.f();
                    commentViewHolderNewStyle.a(this.f36282b);
                }
                if (viewHolder2 instanceof CommentReplyViewHolder) {
                    CommentReplyViewHolder commentReplyViewHolder = (CommentReplyViewHolder) viewHolder2;
                    commentReplyViewHolder.b();
                    commentReplyViewHolder.f36299e = this.f36282b;
                }
            } else if (intValue == 1) {
                if (viewHolder2 instanceof CommentViewHolderNewStyle) {
                    ((CommentViewHolderNewStyle) viewHolder2).c();
                }
                if (viewHolder2 instanceof CommentReplyViewHolder) {
                    ((CommentReplyViewHolder) viewHolder2).a();
                }
            }
        }
    }
}
