package com.ss.android.ugc.aweme.forward.view;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.comment.CommentInputManager;
import com.ss.android.ugc.aweme.comment.adapter.CommentReplyButtonViewHolder;
import com.ss.android.ugc.aweme.comment.e;
import com.ss.android.ugc.aweme.comment.e.d;
import com.ss.android.ugc.aweme.comment.e.g;
import com.ss.android.ugc.aweme.comment.e.h;
import com.ss.android.ugc.aweme.comment.e.m;
import com.ss.android.ugc.aweme.comment.e.n;
import com.ss.android.ugc.aweme.comment.e.p;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.detail.ui.FadeImageView;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.feed.h.aa;
import com.ss.android.ugc.aweme.feed.h.t;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.forward.adapter.FeedDetailAdapter;
import com.ss.android.ugc.aweme.forward.b.a;
import com.ss.android.ugc.aweme.forward.b.b;
import com.ss.android.ugc.aweme.framework.services.IReportService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.newfollow.f.f;
import com.ss.android.ugc.aweme.newfollow.ui.j;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONException;

public class BaseAwemeDetailFragment extends AmeBaseFragment implements CommentInputManager.b, m, n, p, LoadMoreRecyclerViewAdapter.a, c<Comment>, t, a.b, b, j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3286a;

    /* renamed from: b  reason: collision with root package name */
    public h f3287b;

    /* renamed from: c  reason: collision with root package name */
    protected FeedDetailAdapter f3288c;

    /* renamed from: d  reason: collision with root package name */
    public f f3289d;

    /* renamed from: e  reason: collision with root package name */
    public String f3290e = "homepage_follow";

    /* renamed from: f  reason: collision with root package name */
    public String f3291f = "";
    public String g = "";
    public Aweme h;
    public Comment i;
    boolean j;
    public CommentInputManager k;
    d l;
    public String m;
    @BindView(2131493133)
    FadeImageView mAtView;
    @BindView(2131498380)
    LiveCircleView mAuthorAvatarBorderView;
    @BindView(2131498345)
    AvatarImageView mAuthorAvatarImageView;
    @BindView(2131495235)
    ViewGroup mAuthorAvatarLayout;
    @BindView(2131498352)
    AvatarImageView mAuthorAvatarLiveView;
    @BindView(2131498222)
    TextView mAuthorNameView;
    @BindView(2131493631)
    MentionEditText mEditText;
    @BindView(2131494099)
    FadeImageView mEmojiView;
    @BindView(2131498525)
    RecyclerView mRecyclerView;
    Comment n;
    private com.ss.android.ugc.aweme.newfollow.b.b o;
    private a.C0024a p;
    private com.ss.android.ugc.aweme.feed.ui.a q;
    private String r;
    private com.ss.android.ugc.aweme.comment.g.c s;
    private boolean t;
    private Consumer<com.ss.android.ugc.aweme.live.feedpage.b> u;
    private long v;

    public final void a(f fVar) {
    }

    public final void a_(Exception exc) {
    }

    public final AbsFragment b() {
        return this;
    }

    public final void c(List list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public final void e(Exception exc) {
    }

    public final boolean h() {
        if (!PatchProxy.isSupport(new Object[0], this, f3286a, false, 45753, new Class[0], Boolean.TYPE)) {
            return e.a(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45753, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final t j() {
        return this;
    }

    public final b k() {
        return this;
    }

    public final n l() {
        return this;
    }

    public final p m() {
        return this;
    }

    public void o() {
    }

    public final void z_() {
    }

    public Comment getCommentInputReplyComment() {
        return this.i;
    }

    public String getEventType() {
        return this.f3290e;
    }

    public final Aweme n() {
        return this.h;
    }

    public final void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3286a, false, 45686, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f3286a, false, 45686, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        FeedDetailAdapter feedDetailAdapter = this.f3288c;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z)}, feedDetailAdapter, FeedDetailAdapter.f48259a, false, 45340, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            FeedDetailAdapter feedDetailAdapter2 = feedDetailAdapter;
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, feedDetailAdapter2, FeedDetailAdapter.f48259a, false, 45340, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str2);
        if (!(b2 == null || feedDetailAdapter.m == null)) {
            feedDetailAdapter.m.setUserDigg(b2.getUserDigg());
            feedDetailAdapter.m.setStatistics(b2.getStatistics());
            if (!z) {
                if (feedDetailAdapter.g != null) {
                    feedDetailAdapter.g.G();
                }
                if (feedDetailAdapter.h != null) {
                    feedDetailAdapter.h.G();
                }
            }
        }
    }

    public final void a(boolean z) {
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3286a, false, 45691, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3286a, false, 45691, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            if (this.k.j != 0) {
                z2 = false;
            }
            if (!z2) {
                com.bytedance.ies.dmt.ui.d.a.c(GlobalContext.getContext(), (int) C0906R.string.w8).a();
                return;
            }
            this.j = z;
            this.k.e();
            if (z) {
                this.m = "click_repost_button";
                com.ss.android.ugc.aweme.forward.e.a.a(this.f3290e, getCommentInputAweme(), "detail", "click_repost_button");
                return;
            }
            this.m = "click_comment";
        }
    }

    public void a(List<Comment> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3286a, false, 45705, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3286a, false, 45705, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Aweme n2 = n();
        if (n2 == null || !n2.getAwemeControl().canShowComment()) {
            list.clear();
            y_();
        }
        this.f3288c.setShowFooter(true);
        if (!z) {
            this.f3288c.showLoadMoreEmpty();
        } else {
            this.f3288c.resetLoadMoreState();
        }
        if (this.k != null) {
            this.k.b();
            this.k.i = ((CommentItemList) ((g) this.f3287b.i()).getData()).replyStyle;
        }
        this.f3288c.setDataAfterLoadMore(this.f3288c.a(this.h, list));
        this.f3288c.a(true);
    }

    public final void a(final Exception exc, final Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{exc, aweme}, this, f3286a, false, 45709, new Class[]{Exception.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, aweme}, this, f3286a, false, 45709, new Class[]{Exception.class, Aweme.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (com.ss.android.ugc.aweme.captcha.c.b.a(exc)) {
                com.ss.android.ugc.aweme.captcha.c.b.a(getChildFragmentManager(), (com.ss.android.ugc.aweme.base.api.a.b.a) exc, new com.ss.android.ugc.aweme.captcha.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48421a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f48421a, false, 45771, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48421a, false, 45771, new Class[0], Void.TYPE);
                            return;
                        }
                        BaseAwemeDetailFragment.this.f3289d.a();
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f48421a, false, 45772, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48421a, false, 45772, new Class[0], Void.TYPE);
                            return;
                        }
                        BaseAwemeDetailFragment.this.f3288c.a(exc, aweme, BaseAwemeDetailFragment.this.f3289d.c());
                    }
                });
            } else {
                this.f3288c.a(exc, aweme, this.f3289d.c());
            }
        }
    }

    public final void a(Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f3286a, false, 45710, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2}, this, f3286a, false, 45710, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        FeedDetailAdapter feedDetailAdapter = this.f3288c;
        if (PatchProxy.isSupport(new Object[]{aweme2}, feedDetailAdapter, FeedDetailAdapter.f48259a, false, 45350, new Class[]{Aweme.class}, Void.TYPE)) {
            FeedDetailAdapter feedDetailAdapter2 = feedDetailAdapter;
            PatchProxy.accessDispatch(new Object[]{aweme2}, feedDetailAdapter2, FeedDetailAdapter.f48259a, false, 45350, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (feedDetailAdapter.g != null) {
            feedDetailAdapter.g.b(aweme2);
        }
    }

    public final void a(Exception exc, int i2, Comment comment) {
        Exception exc2 = exc;
        int i3 = i2;
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{exc2, Integer.valueOf(i2), comment2}, this, f3286a, false, 45729, new Class[]{Exception.class, Integer.TYPE, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, Integer.valueOf(i2), comment2}, this, f3286a, false, 45729, new Class[]{Exception.class, Integer.TYPE, Comment.class}, Void.TYPE);
            return;
        }
        int i4 = i3 == 3 ? C0906R.string.ahn : C0906R.string.w7;
        int[] t2 = t();
        if (i3 == 3) {
            com.ss.android.ugc.aweme.forward.e.a.a(this.f3290e, this.h, "detail", this.m, false);
        }
        if (!com.ss.android.ugc.aweme.comment.f.f36433c.a(comment2)) {
            f(comment2);
        }
        com.ss.android.ugc.aweme.comment.f.f36433c.c(comment2);
        if (com.ss.android.ugc.aweme.comment.api.a.a(this.mRecyclerView.getContext(), exc2, i4, a(comment2, t2[0], t2[1]))) {
            com.ss.android.ugc.aweme.comment.f.f36433c.g(comment2);
            String fakeId = comment.getFakeId();
            int c2 = this.s.c(fakeId);
            int a2 = this.f3288c.a(fakeId, c2);
            if (a2 > 0) {
                int i5 = a2 - 1;
                this.s.a(i5, c2 + i5);
            }
            return;
        }
        g(comment2);
    }

    public final void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f3286a, false, 45736, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f3286a, false, 45736, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        String str2 = this.f3290e;
        String str3 = null;
        String aid = this.h == null ? null : this.h.getAid();
        if (this.h != null) {
            str3 = this.h.getAuthorUid();
        }
        com.ss.android.ugc.aweme.comment.f.a.a(str, i2, str2, aid, str3);
    }

    public final void a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f3286a, false, 45737, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3286a, false, 45737, new Class[]{String.class}, Void.TYPE);
            return;
        }
        String str3 = this.f3290e;
        String aid = this.h == null ? "" : this.h.getAid();
        if (this.h == null) {
            str2 = "";
        } else {
            str2 = this.h.getAuthorUid();
        }
        com.ss.android.ugc.aweme.comment.f.a.a(str, str3, aid, str2);
    }

    public final void a(String str, List<Comment> list) {
        if (PatchProxy.isSupport(new Object[]{str, list}, this, f3286a, false, 45750, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list}, this, f3286a, false, 45750, new Class[]{String.class, List.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && !CollectionUtils.isEmpty(list)) {
            int b2 = this.f3288c.b(str, 11);
            String str2 = "";
            if (b2 > 0 && this.s != null) {
                com.ss.android.ugc.aweme.forward.model.b bVar = (com.ss.android.ugc.aweme.forward.model.b) this.f3288c.getData().get(b2);
                if (bVar != null && (bVar.getComment() instanceof CommentReplyButtonStruct)) {
                    str2 = ((CommentReplyButtonStruct) bVar.getComment()).getCommentId();
                }
                this.s.a(b2 - 1, list);
                this.f3288c.getData().addAll(b2, this.f3288c.a(list));
                this.f3288c.notifyItemRangeInserted(b2, list.size());
                FeedDetailAdapter feedDetailAdapter = this.f3288c;
                feedDetailAdapter.notifyItemRangeChanged(b2, feedDetailAdapter.getItemCount() - b2);
            }
            com.ss.android.ugc.aweme.comment.f.a.c(this.f3290e, this.h.getAid(), str2);
        }
    }

    @Nullable
    public final /* synthetic */ Activity i() {
        return super.getActivity();
    }

    public int getCommentInputViewType() {
        if (this.j) {
            return 4;
        }
        if (this.i != null) {
            return 3;
        }
        return 2;
    }

    private void u() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45738, new Class[0], Void.TYPE);
            return;
        }
        this.i = null;
        this.j = false;
        if (this.k != null) {
            this.k.i();
        }
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45716, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45716, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45717, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45717, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            return false;
        } else {
            return true;
        }
    }

    public Aweme getCommentInputAweme() {
        if (!PatchProxy.isSupport(new Object[0], this, f3286a, false, 45715, new Class[0], Aweme.class)) {
            return n();
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45715, new Class[0], Aweme.class);
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45700, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45700, new Class[0], Void.TYPE);
            return;
        }
        r();
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45702, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.c();
        }
    }

    @OnClick({2131493213})
    public void onBack() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45712, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45712, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45749, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45749, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.o != null) {
            this.o.e();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45748, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45748, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.o != null) {
            this.o.d();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45747, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45747, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.o != null) {
            this.o.B_();
        }
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45706, new Class[0], Void.TYPE);
            return;
        }
        this.f3288c.showLoadMoreLoading();
    }

    public void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45704, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.b();
        }
        if (this.f3288c.mShowFooter) {
            this.f3288c.setShowFooter(false);
            this.f3288c.notifyDataSetChanged();
        }
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45718, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45718, new Class[0], Void.TYPE);
        } else if (this.v > 0) {
            this.v = 0;
            com.ss.android.ugc.aweme.comment.f.a.a(this.f3290e, this.h, System.currentTimeMillis() - this.v, "detail");
        }
    }

    private int[] t() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45725, new Class[0], int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45725, new Class[0], int[].class);
        }
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        int i3 = -1;
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i3 = linearLayoutManager.findFirstVisibleItemPosition();
            i2 = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            i2 = -1;
        }
        return new int[]{i3, i2};
    }

    @OnClick({2131495235})
    public void onAvatarClick() {
        User user;
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45713, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45713, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.p == null || this.p.a() == null)) {
            BaseFollowViewHolder.a a2 = this.p.a();
            Aweme n2 = n();
            if (n() != null) {
                user = n().getAuthor();
            } else {
                user = null;
            }
            a2.a((View) null, (View) null, n2, user);
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45699, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.f3287b != null) {
            this.f3287b.k();
            this.f3287b.j();
        }
        if (this.f3289d != null) {
            this.f3289d.k();
            this.f3289d.j();
            this.f3289d.e();
        }
        if (this.p != null) {
            this.p.e();
        }
        if (this.k != null) {
            this.k.j();
        }
    }

    @OnClick({2131498222})
    public void onNickNameClick() {
        User user;
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45714, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45714, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.p == null || this.p.a() == null)) {
            BaseFollowViewHolder.a a2 = this.p.a();
            Aweme n2 = n();
            if (n() != null) {
                user = n().getAuthor();
            } else {
                user = null;
            }
            a2.b(null, null, n2, user);
        }
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45698, new Class[0], Void.TYPE);
        } else if (this.h != null) {
            if (NetworkUtils.isNetworkAvailable(getContext())) {
                this.f3287b.a(1, this.h.getAid(), 2, "", this.r);
                return;
            }
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48419a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f48419a, false, 45770, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f48419a, false, 45770, new Class[0], Void.TYPE);
                    } else if (BaseAwemeDetailFragment.this.isViewValid()) {
                        UIUtils.displayToast(BaseAwemeDetailFragment.this.getContext(), (int) C0906R.string.bgf);
                    }
                }
            }, 100);
        }
    }

    public final void r() {
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45701, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45701, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null && !this.t) {
            this.t = true;
            if (this.f3287b != null) {
                this.f3287b.a(4, this.h.getAid(), 2, "", "");
            }
        }
    }

    public final void p() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45696, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45696, new Class[0], Void.TYPE);
        } else if (this.h != null) {
            this.mAuthorAvatarLayout.setVisibility(0);
            if (this.h.getAuthor() == null || !this.h.getAuthor().isLive()) {
                z = false;
            } else {
                z = true;
            }
            if (this.q == null) {
                this.q = new com.ss.android.ugc.aweme.feed.ui.a(z, this.mAuthorAvatarLiveView, this.mAuthorAvatarImageView, this.mAuthorAvatarBorderView);
            }
            if (this.u == null) {
                this.u = new Consumer<com.ss.android.ugc.aweme.live.feedpage.b>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48417a;

                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        com.ss.android.ugc.aweme.live.feedpage.b bVar = (com.ss.android.ugc.aweme.live.feedpage.b) obj;
                        if (PatchProxy.isSupport(new Object[]{bVar}, this, f48417a, false, 45769, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar}, this, f48417a, false, 45769, new Class[]{com.ss.android.ugc.aweme.live.feedpage.b.class}, Void.TYPE);
                            return;
                        }
                        if (TextUtils.equals(BaseAwemeDetailFragment.this.h.getAuthor().getUid(), String.valueOf(bVar.f53380a))) {
                            BaseAwemeDetailFragment.this.h.getAuthor().roomId = bVar.f53381b;
                            if (!BaseAwemeDetailFragment.this.h.getAuthor().isLive()) {
                                BaseAwemeDetailFragment.this.p();
                            }
                        }
                    }
                };
            }
            this.q.a(this.h.getAuthor(), getClass(), this.u);
            int dip2Px = (int) UIUtils.dip2Px(getContext(), 27.0f);
            if (com.ss.android.ugc.aweme.newfollow.a.b.a(this.h)) {
                this.q.b(0);
                com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.mAuthorAvatarLiveView, this.h.getAuthor().getAvatarThumb(), dip2Px, dip2Px);
                com.ss.android.ugc.aweme.newfollow.g.a.c(this.h);
            } else {
                this.q.b(8);
                if (this.h.getAuthor() != null) {
                    com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.mAuthorAvatarImageView, this.h.getAuthor().getAvatarThumb(), dip2Px, dip2Px);
                }
            }
            if (this.h.getAuthor() != null) {
                this.mAuthorNameView.setText(this.h.getAuthor().getNickname());
            }
        }
    }

    public final void a(Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f3286a, false, 45731, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f3286a, false, 45731, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        a(comment2, false);
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3286a, false, 45707, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3286a, false, 45707, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.t = false;
        this.f3288c.showLoadMoreError();
    }

    public final void d(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f3286a, false, 45690, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f3286a, false, 45690, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        this.m = "click_reply_comment";
        e(comment);
    }

    private void g(Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f3286a, false, 45728, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f3286a, false, 45728, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        int h2 = com.ss.android.ugc.aweme.comment.f.f36433c.h(comment2);
        RecyclerView.Adapter adapter = this.mRecyclerView.getAdapter();
        if (h2 >= 0 && adapter != null) {
            adapter.notifyItemChanged(h2, 1);
        }
    }

    public final CommentReplyButtonViewHolder a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3286a, false, 45692, new Class[]{Integer.TYPE}, CommentReplyButtonViewHolder.class)) {
            return (CommentReplyButtonViewHolder) this.mRecyclerView.findViewHolderForAdapterPosition(i2);
        }
        return (CommentReplyButtonViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3286a, false, 45692, new Class[]{Integer.TYPE}, CommentReplyButtonViewHolder.class);
    }

    public final void a_(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3286a, false, 45711, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3286a, false, 45711, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3286a, false, 45703, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3286a, false, 45703, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.b();
        }
        if (this.f3288c.mShowFooter) {
            this.f3288c.setShowFooter(false);
            this.f3288c.notifyDataSetChanged();
        }
    }

    public final void c(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f3286a, false, 45733, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f3286a, false, 45733, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        String text = comment.getText();
        a(com.ss.android.ugc.aweme.comment.f.f36433c.l(comment), com.ss.android.ugc.aweme.comment.f.f36433c.j(comment), com.bytedance.ies.dmt.ui.input.emoji.g.a(text), text);
        if (this.k != null) {
            this.k.b(comment);
        }
    }

    public final void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3286a, false, 45721, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3286a, false, 45721, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            s();
        }
    }

    public final void e(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f3286a, false, 45741, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f3286a, false, 45741, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        if (isAdded()) {
            if (this.i == null || !this.i.equals(comment)) {
                this.i = comment;
                if (this.k != null) {
                    this.k.a(comment.getUser());
                }
            } else {
                this.i = comment;
                this.mEditText.performClick();
            }
        }
    }

    public final void f(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3286a, false, 45745, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3286a, false, 45745, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.p.f())) {
            com.ss.android.ugc.aweme.comment.f.a.a(this.f3290e, this.h, (String) null, false, "detail");
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3286a, false, 45694, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3286a, false, 45694, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(2);
        }
    }

    private void f(Comment comment) {
        int i2;
        int i3 = 1;
        if (PatchProxy.isSupport(new Object[]{comment}, this, f3286a, false, 45727, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f3286a, false, 45727, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.forward.model.b bVar = new com.ss.android.ugc.aweme.forward.model.b(comment);
        if (comment.getCommentType() == 2) {
            FeedDetailAdapter feedDetailAdapter = this.f3288c;
            String replyToReplyCommentId = comment.getReplyToReplyCommentId();
            if (TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            int b2 = feedDetailAdapter.b(replyToReplyCommentId, i2);
            if (b2 > 0) {
                int i4 = b2 + 1;
                while (true) {
                    if (i4 >= this.f3288c.getData().size()) {
                        i4 = -1;
                        break;
                    } else if (this.f3288c.getItemViewType(i4) != 2) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 <= 0) {
                    i4 = this.f3288c.getData().size();
                }
                boolean a2 = this.s.a(comment.getReplyId(), (i4 - this.f3288c.b(comment.getReplyId(), 1)) - 1, comment);
                int i5 = i4 - 1;
                this.s.b(i5, comment);
                this.f3288c.insertData(bVar, i4);
                if (i4 > 0) {
                    this.f3288c.notifyItemChanged(i5);
                }
                if (a2) {
                    this.f3288c.notifyItemChanged(i4 + 1);
                }
                this.mRecyclerView.scrollToPosition(i4 + 1);
                i3 = i4;
            } else {
                i3 = 0;
            }
        } else {
            this.s.a(0, comment);
            this.s.b(0, comment);
            this.f3288c.insertData(bVar, 1);
            this.mRecyclerView.scrollToPosition(1);
        }
        com.ss.android.ugc.aweme.comment.f.f36433c.a(comment, i3);
    }

    public final void b(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f3286a, false, 45726, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f3286a, false, 45726, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        if (this.i != null && (!this.j || !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId()) || comment.getCommentType() == 0)) {
            comment.setReplyToUserId(this.i.getUser().getUid());
            if (this.j && comment.getCommentType() != 0) {
                comment.setReplyToUserName(ae.a(this.i.getUser()));
            } else if (comment.getCommentType() == 2 && !TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                comment.setReplyToUserName(ae.a(this.i.getUser()));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.i);
            comment.setReplyComments(arrayList);
        }
        if (!com.ss.android.ugc.aweme.comment.f.f36433c.e(comment)) {
            com.ss.android.ugc.aweme.comment.f.f36433c.a(comment, this.i);
        }
        boolean z = !com.ss.android.ugc.aweme.comment.f.f36433c.a(comment);
        if (z) {
            f(comment);
        }
        if (!com.ss.android.ugc.aweme.comment.f.f36433c.e(comment)) {
            com.ss.android.ugc.aweme.comment.f.f36433c.d(comment);
        }
        if (!z) {
            g(comment);
        }
        u();
    }

    public final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3286a, false, 45746, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3286a, false, 45746, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f3288c != null) {
            FeedDetailAdapter feedDetailAdapter = this.f3288c;
            if (PatchProxy.isSupport(new Object[]{str2}, feedDetailAdapter, FeedDetailAdapter.f48259a, false, 45344, new Class[]{String.class}, Void.TYPE)) {
                FeedDetailAdapter feedDetailAdapter2 = feedDetailAdapter;
                PatchProxy.accessDispatch(new Object[]{str2}, feedDetailAdapter2, FeedDetailAdapter.f48259a, false, 45344, new Class[]{String.class}, Void.TYPE);
            } else if (feedDetailAdapter.getBasicItemCount() != 0) {
                int i2 = 0;
                while (true) {
                    if (i2 >= feedDetailAdapter.getData().size()) {
                        break;
                    }
                    if (feedDetailAdapter.a(i2)) {
                        Comment comment = ((com.ss.android.ugc.aweme.forward.model.b) feedDetailAdapter.getData().get(i2)).getComment();
                        if (comment != null && StringUtils.equal(comment.getCid(), str2)) {
                            com.ss.android.ugc.aweme.comment.a.b.a(comment, feedDetailAdapter.m.getAuthorUid());
                            feedDetailAdapter.notifyItemChanged(i2, 0);
                            bg.a(new com.ss.android.ugc.aweme.comment.b.a(2, new Object[]{feedDetailAdapter.m.getAid(), comment}));
                            break;
                        }
                    }
                    i2++;
                }
            }
        }
        if (!TextUtils.isEmpty(this.p.f())) {
            com.ss.android.ugc.aweme.comment.f.a.a(this.f3290e, this.h, str2, true, "detail");
        }
    }

    public final void e(boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3286a, false, 45735, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3286a, false, 45735, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            String str2 = this.f3290e;
            Aweme commentInputAweme = getCommentInputAweme();
            if (this.i != null) {
                str = "click_reply";
            } else {
                str = "click_original";
            }
            com.ss.android.ugc.aweme.forward.e.a.b(str2, commentInputAweme, "detail", str);
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.forward.c.a aVar) {
        com.ss.android.ugc.aweme.forward.c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3286a, false, 45734, new Class[]{com.ss.android.ugc.aweme.forward.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3286a, false, 45734, new Class[]{com.ss.android.ugc.aweme.forward.c.a.class}, Void.TYPE);
        } else if (aVar2 != null) {
            if (aVar2.f48271e == 1 && aVar2.f48268b != null) {
                if (aVar2.f48272f == hashCode()) {
                    com.ss.android.ugc.aweme.forward.e.a.a(this.f3290e, aVar2.f48270d, "detail", this.m, true);
                }
                if (this.k != null) {
                    this.k.g();
                }
                u();
                if (hashCode() == aVar2.f48272f) {
                    a(aVar2.f48268b.getComment(), true);
                }
                FeedDetailAdapter feedDetailAdapter = this.f3288c;
                if (PatchProxy.isSupport(new Object[0], feedDetailAdapter, FeedDetailAdapter.f48259a, false, 45349, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], feedDetailAdapter, FeedDetailAdapter.f48259a, false, 45349, new Class[0], Void.TYPE);
                } else {
                    if (feedDetailAdapter.m != null) {
                        AwemeStatistics statistics = feedDetailAdapter.m.getStatistics();
                        if (statistics != null) {
                            statistics.setForwardCount(statistics.getForwardCount() + 1);
                        } else {
                            statistics = new AwemeStatistics();
                            statistics.setForwardCount(1);
                        }
                        feedDetailAdapter.m.setStatistics(statistics);
                    }
                    if (feedDetailAdapter.g != null) {
                        feedDetailAdapter.g.x();
                    }
                    if (feedDetailAdapter.h != null) {
                        feedDetailAdapter.h.D();
                    }
                }
            } else if (aVar2.f48271e == 2 && getActivity() != null) {
                getActivity().finish();
            }
        }
    }

    @Subscribe
    public void onReportCommentEvent(BroadcastMethod.a aVar) {
        BroadcastMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3286a, false, 45752, new Class[]{BroadcastMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3286a, false, 45752, new Class[]{BroadcastMethod.a.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            try {
                if (TextUtils.equals("commentReportSuccess", aVar2.f44432b.getString("eventName"))) {
                    String string = aVar2.f44432b.getJSONObject("data").getString("object_id");
                    int d2 = this.s.d(string);
                    int a2 = this.f3288c.a(string, d2);
                    if (a2 > 0) {
                        int i2 = a2 - 1;
                        this.s.a(i2, d2 + i2);
                    }
                    FeedDetailAdapter feedDetailAdapter = this.f3288c;
                    if (PatchProxy.isSupport(new Object[]{string}, feedDetailAdapter, FeedDetailAdapter.f48259a, false, 45346, new Class[]{String.class}, Void.TYPE)) {
                        FeedDetailAdapter feedDetailAdapter2 = feedDetailAdapter;
                        PatchProxy.accessDispatch(new Object[]{string}, feedDetailAdapter2, FeedDetailAdapter.f48259a, false, 45346, new Class[]{String.class}, Void.TYPE);
                    } else if (feedDetailAdapter.getBasicItemCount() != 0) {
                        if (!TextUtils.isEmpty(string)) {
                            Iterator it2 = feedDetailAdapter.mItems.iterator();
                            boolean z = false;
                            while (it2.hasNext()) {
                                Comment comment = ((com.ss.android.ugc.aweme.forward.model.b) it2.next()).getComment();
                                if (comment != null && !CollectionUtils.isEmpty(comment.getReplyComments())) {
                                    Comment comment2 = comment.getReplyComments().get(0);
                                    if (comment2 != null && TextUtils.equals(comment2.getCid(), string)) {
                                        it2.remove();
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                feedDetailAdapter.notifyDataSetChanged();
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3286a, false, 45744, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3286a, false, 45744, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int d2 = this.s.d(str);
        int a2 = this.f3288c.a(str, d2);
        if (a2 > 0) {
            int i2 = a2 - 1;
            this.s.a(i2, d2 + i2);
        }
        com.ss.android.ugc.aweme.setting.commentfilter.b.a.f63900a.a(getActivity(), n(), this.n);
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3286a, false, 45720, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3286a, false, 45720, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            this.i = null;
            this.j = false;
        }
        s();
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3286a, false, 45719, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3286a, false, 45719, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            this.m = "click_comment";
        }
        com.ss.android.ugc.aweme.comment.f.a.a(this.f3290e, this.h, com.ss.android.ugc.aweme.comment.f.a.a(this.i), "detail");
        this.v = System.currentTimeMillis();
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3286a, false, 45695, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3286a, false, 45695, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (getArguments() == null) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        this.f3290e = getArguments().getString("refer");
        this.f3291f = getArguments().getString("tab_name");
        this.g = getArguments().getString("content_source");
        this.r = getArguments().getString("cid");
        this.f3289d = new f(this.f3290e, 0);
        this.f3289d.d();
        this.f3289d.a(new aa());
        this.f3289d.a((j) this);
        this.s = new com.ss.android.ugc.aweme.comment.g.c();
        this.p = new com.ss.android.ugc.aweme.forward.d.a(this, this.f3290e, this.s);
        this.p.d();
        this.f3288c = new FeedDetailAdapter(this.mRecyclerView, this.p.c());
        this.f3288c.i = this.f3290e;
        this.f3288c.j = this.f3291f;
        this.f3288c.k = this.g;
        this.f3288c.setShowFooter(false);
        this.f3288c.f48262d = this.f3289d;
        this.f3288c.f48261c = this.p.b();
        this.f3288c.f48260b = this.p.a();
        this.f3288c.setLoadMoreListener(this);
        this.f3288c.p = this.s;
        this.f3288c.f48264f = new com.ss.android.ugc.aweme.forward.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48413a;

            public final Object a() {
                if (!PatchProxy.isSupport(new Object[0], this, f48413a, false, 45766, new Class[0], Object.class)) {
                    return null;
                }
                return PatchProxy.accessDispatch(new Object[0], this, f48413a, false, 45766, new Class[0], Object.class);
            }

            public final String e() {
                return "key_container_forward_detail";
            }

            public final boolean b() {
                if (!PatchProxy.isSupport(new Object[0], this, f48413a, false, 45763, new Class[0], Boolean.TYPE)) {
                    return BaseAwemeDetailFragment.this.isViewValid();
                }
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48413a, false, 45763, new Class[0], Boolean.TYPE)).booleanValue();
            }

            public final boolean c() {
                if (!PatchProxy.isSupport(new Object[0], this, f48413a, false, 45764, new Class[0], Boolean.TYPE)) {
                    return BaseAwemeDetailFragment.this.getLifecycle().getCurrentState().equals(Lifecycle.State.RESUMED);
                }
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f48413a, false, 45764, new Class[0], Boolean.TYPE)).booleanValue();
            }

            public final Context d() {
                if (!PatchProxy.isSupport(new Object[0], this, f48413a, false, 45765, new Class[0], Context.class)) {
                    return BaseAwemeDetailFragment.this.getActivity();
                }
                return (Context) PatchProxy.accessDispatch(new Object[0], this, f48413a, false, 45765, new Class[0], Context.class);
            }
        };
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.setOrientation(1);
        this.mRecyclerView.setLayoutManager(wrapLinearLayoutManager);
        this.mRecyclerView.setAdapter(this.f3288c);
        this.mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f48415a;

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f48415a, false, 45767, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f48415a, false, 45767, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
            }

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f48415a, false, 45768, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f48415a, false, 45768, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                int findLastVisibleItemPosition = ((LinearLayoutManager) BaseAwemeDetailFragment.this.mRecyclerView.getLayoutManager()).findLastVisibleItemPosition();
                int itemCount = BaseAwemeDetailFragment.this.mRecyclerView.getLayoutManager().getItemCount();
                if (findLastVisibleItemPosition >= 8 && itemCount - findLastVisibleItemPosition < 8 && ((g) BaseAwemeDetailFragment.this.f3287b.i()).isHasMore()) {
                    BaseAwemeDetailFragment.this.r();
                }
            }
        });
        if (PatchProxy.isSupport(new Object[0], this, f3286a, false, 45697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3286a, false, 45697, new Class[0], Void.TYPE);
        } else {
            this.f3287b = new h();
            this.f3287b.a(new g());
            this.f3287b.a(this);
            ((g) this.f3287b.i()).f36414f = this.s;
        }
        o();
        this.k = new CommentInputManager(this, hashCode(), this);
        CommentInputManager commentInputManager = this.k;
        MentionEditText mentionEditText = this.mEditText;
        FadeImageView fadeImageView = this.mAtView;
        FadeImageView fadeImageView2 = this.mEmojiView;
        if (this.h != null) {
            str = this.h.getAid();
        } else {
            str = "";
        }
        commentInputManager.a(mentionEditText, fadeImageView, fadeImageView2, str, this.f3290e);
        this.mEditText.setCursorVisible(false);
        this.o = this.f3288c;
    }

    private void a(Comment comment, boolean z) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{comment, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3286a, false, 45732, new Class[]{Comment.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, Byte.valueOf(z)}, this, f3286a, false, 45732, new Class[]{Comment.class, Boolean.TYPE}, Void.TYPE);
        } else if (comment != null) {
            if (!com.ss.android.ugc.aweme.comment.f.f36433c.a(comment)) {
                f(comment);
            }
            com.ss.android.ugc.aweme.comment.f.f36433c.k(comment);
            com.ss.android.ugc.aweme.comment.f.f36433c.f(comment);
            int h2 = com.ss.android.ugc.aweme.comment.f.f36433c.h(comment);
            List data = this.f3288c.getData();
            if (h2 >= 0 && h2 <= data.size() - 1) {
                ((com.ss.android.ugc.aweme.forward.model.b) data.get(h2)).setComment(comment);
                this.f3288c.notifyItemChanged(h2);
            }
            List<CommentReplyListItem> list = this.s.f36458b;
            if (list != null) {
                Iterator<CommentReplyListItem> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CommentReplyListItem next = it2.next();
                    if (TextUtils.equals(next.mComment.getFakeId(), comment.getFakeId())) {
                        next.mComment = comment;
                    } else if (TextUtils.equals(next.mComment.getCid(), comment.getReplyId())) {
                        List<Comment> list2 = next.mReplyComments;
                        if (list2 == null) {
                            i3 = 0;
                        } else {
                            i3 = list2.size();
                        }
                        int i4 = 0;
                        while (true) {
                            if (i4 >= i3) {
                                break;
                            } else if (TextUtils.equals(list2.get(i4).getFakeId(), comment.getFakeId())) {
                                list2.set(i4, comment);
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
            }
            int[] t2 = t();
            if (a(comment, t2[0], t2[1])) {
                Context context = GlobalContext.getContext();
                if (z) {
                    i2 = C0906R.string.aho;
                } else {
                    i2 = C0906R.string.wa;
                }
                com.bytedance.ies.dmt.ui.d.a.a(context, i2).a();
            }
            com.ss.android.ugc.aweme.comment.f.f36433c.g(comment);
            this.mRecyclerView.setVisibility(0);
            com.ss.android.ugc.aweme.feed.a.a().c(n().getAid());
        }
    }

    public final void b(String str, List<Comment> list) {
        if (PatchProxy.isSupport(new Object[]{str, list}, this, f3286a, false, 45751, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, list}, this, f3286a, false, 45751, new Class[]{String.class, List.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str) && !CollectionUtils.isEmpty(list)) {
            int b2 = this.f3288c.b(str, 11);
            String str2 = "";
            if (b2 - list.size() >= 0) {
                com.ss.android.ugc.aweme.forward.model.b bVar = (com.ss.android.ugc.aweme.forward.model.b) this.f3288c.getData().get(b2);
                if (bVar != null && (bVar.getComment() instanceof CommentReplyButtonStruct)) {
                    str2 = ((CommentReplyButtonStruct) bVar.getComment()).getCommentId();
                }
                this.s.b(list);
                this.f3288c.getData().removeAll(this.f3288c.a(list));
                int size = b2 - list.size();
                this.f3288c.notifyItemRangeRemoved(size, list.size());
                FeedDetailAdapter feedDetailAdapter = this.f3288c;
                feedDetailAdapter.notifyItemRangeChanged(size, feedDetailAdapter.getItemCount() - size);
            }
            com.ss.android.ugc.aweme.comment.f.a.b(this.f3290e, this.h.getAid(), str2);
        }
    }

    public final void b(List<Comment> list, boolean z) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3286a, false, 45708, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3286a, false, 45708, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.t = false;
        if (list != null && !list.isEmpty()) {
            z2 = z;
        }
        if (!z2) {
            this.f3288c.showLoadMoreEmpty();
        } else {
            this.f3288c.resetLoadMoreState();
        }
        this.f3288c.setDataAfterLoadMore(this.f3288c.a(this.h, list));
    }

    public final void a(final com.ss.android.ugc.aweme.comment.widget.a aVar, final Comment comment) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{aVar, comment}, this, f3286a, false, 45687, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, comment}, this, f3286a, false, 45687, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE);
        } else if (comment != null) {
            if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                if (this.h != null) {
                    str3 = this.h.getAid();
                } else {
                    str3 = "";
                }
                com.ss.android.ugc.aweme.login.e.a((Fragment) this, this.f3290e, "reply_comment", ad.a().a("group_id", str3).a("log_pb", com.ss.android.ugc.aweme.u.aa.g(str3)).f75487b);
                return;
            }
            if (comment.getUser() != null) {
                str = comment.getUser().getUid();
            } else {
                str = "";
            }
            boolean equals = TextUtils.equals(str, com.ss.android.ugc.aweme.account.d.a().getCurUserId());
            if (n() == null) {
                str2 = "";
            } else {
                str2 = n().getAuthorUid();
            }
            boolean equals2 = TextUtils.equals(str2, com.ss.android.ugc.aweme.account.d.a().getCurUserId());
            if (this.k != null) {
                this.k.a(equals, equals2, !comment.isTranslated(), new CommentInputManager.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f48409a;

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f48409a, false, 45755, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48409a, false, 45755, new Class[0], Void.TYPE);
                            return;
                        }
                        BaseAwemeDetailFragment.this.m = "click_reply_comment";
                        BaseAwemeDetailFragment.this.e(comment);
                    }

                    public final void f() {
                        if (PatchProxy.isSupport(new Object[0], this, f48409a, false, 45759, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48409a, false, 45759, new Class[0], Void.TYPE);
                            return;
                        }
                        BaseAwemeDetailFragment.this.k.a(comment, BaseAwemeDetailFragment.this.f3290e);
                    }

                    public final void g() {
                        if (PatchProxy.isSupport(new Object[0], this, f48409a, false, 45760, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48409a, false, 45760, new Class[0], Void.TYPE);
                            return;
                        }
                        com.ss.android.ugc.aweme.comment.f.a.a(BaseAwemeDetailFragment.this.f3290e);
                    }

                    public final void e() {
                        if (PatchProxy.isSupport(new Object[0], this, f48409a, false, 45758, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48409a, false, 45758, new Class[0], Void.TYPE);
                            return;
                        }
                        BaseAwemeDetailFragment.this.k.a(comment);
                        com.ss.android.ugc.aweme.comment.f.a.a(BaseAwemeDetailFragment.this.f3290e, comment.getUser().getUid(), comment.getCid(), BaseAwemeDetailFragment.this.n());
                    }

                    public final void h() {
                        if (PatchProxy.isSupport(new Object[0], this, f48409a, false, 45761, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48409a, false, 45761, new Class[0], Void.TYPE);
                            return;
                        }
                        BaseAwemeDetailFragment baseAwemeDetailFragment = BaseAwemeDetailFragment.this;
                        com.ss.android.ugc.aweme.comment.widget.a aVar = aVar;
                        Comment comment = comment;
                        if (PatchProxy.isSupport(new Object[]{aVar, comment}, baseAwemeDetailFragment, BaseAwemeDetailFragment.f3286a, false, 45688, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE)) {
                            Object[] objArr = {aVar, comment};
                            BaseAwemeDetailFragment baseAwemeDetailFragment2 = baseAwemeDetailFragment;
                            PatchProxy.accessDispatch(objArr, baseAwemeDetailFragment2, BaseAwemeDetailFragment.f3286a, false, 45688, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE);
                            return;
                        }
                        if (aVar != null) {
                            aVar.a();
                        }
                    }

                    public final void i() {
                        if (PatchProxy.isSupport(new Object[0], this, f48409a, false, 45762, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48409a, false, 45762, new Class[0], Void.TYPE);
                            return;
                        }
                        BaseAwemeDetailFragment baseAwemeDetailFragment = BaseAwemeDetailFragment.this;
                        com.ss.android.ugc.aweme.comment.widget.a aVar = aVar;
                        Comment comment = comment;
                        if (PatchProxy.isSupport(new Object[]{aVar, comment}, baseAwemeDetailFragment, BaseAwemeDetailFragment.f3286a, false, 45689, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE)) {
                            Object[] objArr = {aVar, comment};
                            BaseAwemeDetailFragment baseAwemeDetailFragment2 = baseAwemeDetailFragment;
                            PatchProxy.accessDispatch(objArr, baseAwemeDetailFragment2, BaseAwemeDetailFragment.f3286a, false, 45689, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE);
                            return;
                        }
                        if (aVar != null) {
                            aVar.b();
                        }
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f48409a, false, 45754, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48409a, false, 45754, new Class[0], Void.TYPE);
                            return;
                        }
                        BaseAwemeDetailFragment baseAwemeDetailFragment = BaseAwemeDetailFragment.this;
                        Comment comment = comment;
                        if (PatchProxy.isSupport(new Object[]{comment}, baseAwemeDetailFragment, BaseAwemeDetailFragment.f3286a, false, 45739, new Class[]{Comment.class}, Void.TYPE)) {
                            Object[] objArr = {comment};
                            BaseAwemeDetailFragment baseAwemeDetailFragment2 = baseAwemeDetailFragment;
                            PatchProxy.accessDispatch(objArr, baseAwemeDetailFragment2, BaseAwemeDetailFragment.f3286a, false, 45739, new Class[]{Comment.class}, Void.TYPE);
                            return;
                        }
                        FragmentActivity activity = baseAwemeDetailFragment.getActivity();
                        if (activity != null && comment != null) {
                            if (!NetworkUtils.isNetworkAvailable(activity)) {
                                com.bytedance.ies.dmt.ui.d.a.c((Context) activity, (int) C0906R.string.bgf).a();
                                return;
                            }
                            if (baseAwemeDetailFragment.l == null) {
                                baseAwemeDetailFragment.l = new d();
                                baseAwemeDetailFragment.l.a(new com.ss.android.ugc.aweme.comment.e.c());
                                baseAwemeDetailFragment.l.a(baseAwemeDetailFragment);
                            }
                            if (!TextUtils.isEmpty(comment.getCid())) {
                                ((com.ss.android.ugc.aweme.comment.e.c) baseAwemeDetailFragment.l.i()).f36399e = baseAwemeDetailFragment.h.getAid();
                                baseAwemeDetailFragment.l.a(comment.getCid());
                                baseAwemeDetailFragment.n = comment;
                            }
                        }
                    }

                    public final void c() {
                        if (PatchProxy.isSupport(new Object[0], this, f48409a, false, 45756, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48409a, false, 45756, new Class[0], Void.TYPE);
                            return;
                        }
                        BaseAwemeDetailFragment.this.m = "click_reply_comment";
                        BaseAwemeDetailFragment baseAwemeDetailFragment = BaseAwemeDetailFragment.this;
                        Comment comment = comment;
                        if (PatchProxy.isSupport(new Object[]{comment}, baseAwemeDetailFragment, BaseAwemeDetailFragment.f3286a, false, 45740, new Class[]{Comment.class}, Void.TYPE)) {
                            BaseAwemeDetailFragment baseAwemeDetailFragment2 = baseAwemeDetailFragment;
                            PatchProxy.accessDispatch(new Object[]{comment}, baseAwemeDetailFragment2, BaseAwemeDetailFragment.f3286a, false, 45740, new Class[]{Comment.class}, Void.TYPE);
                            return;
                        }
                        if (baseAwemeDetailFragment.isAdded() && baseAwemeDetailFragment.k != null) {
                            baseAwemeDetailFragment.j = true;
                            baseAwemeDetailFragment.i = comment;
                            baseAwemeDetailFragment.k.e();
                            com.ss.android.ugc.aweme.forward.e.a.a(baseAwemeDetailFragment.f3290e, baseAwemeDetailFragment.getCommentInputAweme(), "detail", "click_reply_comment");
                        }
                    }

                    public final void d() {
                        if (PatchProxy.isSupport(new Object[0], this, f48409a, false, 45757, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f48409a, false, 45757, new Class[0], Void.TYPE);
                            return;
                        }
                        BaseAwemeDetailFragment baseAwemeDetailFragment = BaseAwemeDetailFragment.this;
                        Comment comment = comment;
                        if (PatchProxy.isSupport(new Object[]{comment}, baseAwemeDetailFragment, BaseAwemeDetailFragment.f3286a, false, 45742, new Class[]{Comment.class}, Void.TYPE)) {
                            Object[] objArr = {comment};
                            BaseAwemeDetailFragment baseAwemeDetailFragment2 = baseAwemeDetailFragment;
                            PatchProxy.accessDispatch(objArr, baseAwemeDetailFragment2, BaseAwemeDetailFragment.f3286a, false, 45742, new Class[]{Comment.class}, Void.TYPE);
                            return;
                        }
                        ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(baseAwemeDetailFragment.getActivity(), "comment", comment.getCid(), comment.getUser().getUid(), baseAwemeDetailFragment.h.getAuthorUid(), null);
                        com.ss.android.ugc.aweme.comment.f.a.a(baseAwemeDetailFragment.f3290e, baseAwemeDetailFragment.getCommentInputAweme(), comment.getCid(), "detail", "click_report_button");
                    }
                });
            }
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3286a, false, 45693, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3286a, false, 45693, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.pd, viewGroup2, false);
        com.ss.android.ugc.aweme.common.ui.b.a(inflate.findViewById(C0906R.id.cv0));
        return inflate;
    }

    private boolean a(Comment comment, int i2, int i3) {
        Comment comment2 = comment;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{comment2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3286a, false, 45730, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{comment2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f3286a, false, 45730, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        int h2 = com.ss.android.ugc.aweme.comment.f.f36433c.h(comment2);
        if (h2 != -1 && i4 >= 0 && i5 >= 0 && h2 >= i4 && h2 <= i5) {
            return false;
        }
        return true;
    }

    public final void a(int i2, int i3, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f3286a, false, 45724, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f3286a, false, 45724, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        int i4 = i2;
        int i5 = i3;
        a(this.i, i2, i3, str2);
    }

    private void a(Comment comment, int i2, int i3, String str) {
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{comment, Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f3286a, false, 45722, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f3286a, false, 45722, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{comment, Integer.valueOf(i2), Integer.valueOf(i3), str, (byte) 0}, this, f3286a, false, 45723, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, Integer.valueOf(i2), Integer.valueOf(i3), str, (byte) 0}, this, f3286a, false, 45723, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Aweme aweme = this.h;
        String str4 = this.f3290e;
        if (this.i != null) {
            str2 = comment.getCid();
        } else {
            str2 = "";
        }
        com.ss.android.ugc.aweme.newfollow.g.a.b(aweme, str4, "detail", str2);
        Aweme aweme2 = this.h;
        String str5 = this.f3290e;
        String a2 = com.ss.android.ugc.aweme.comment.f.a.a(comment);
        if (comment != null) {
            str3 = comment.getCid();
        } else {
            str3 = "";
        }
        com.ss.android.ugc.aweme.comment.f.a.a(aweme2, str, str5, a2, str3, "detail", String.valueOf(i3), 0, "");
    }
}
