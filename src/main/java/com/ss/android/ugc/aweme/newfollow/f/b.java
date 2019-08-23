package com.ss.android.ugc.aweme.newfollow.f;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.comment.CommentInputManager;
import com.ss.android.ugc.aweme.comment.a;
import com.ss.android.ugc.aweme.comment.e;
import com.ss.android.ugc.aweme.comment.e.f;
import com.ss.android.ugc.aweme.comment.e.m;
import com.ss.android.ugc.aweme.comment.e.n;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.h.t;
import com.ss.android.ugc.aweme.feed.h.y;
import com.ss.android.ugc.aweme.feed.h.z;
import com.ss.android.ugc.aweme.feed.listener.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IReportService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedArticleViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.utils.ad;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

public abstract class b<M extends a, V extends FlowFeedViewHolder> extends com.ss.android.ugc.aweme.common.b<M, V> implements CommentInputManager.b, m, n, aa<ar>, t, c, com.ss.android.ugc.aweme.forward.b.b, FlowFeedArticleViewHolder.a, FollowVideoViewHolder.b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f3643c;
    public d g;
    protected com.ss.android.ugc.aweme.commercialize.a h;
    protected z i;
    protected com.ss.android.ugc.aweme.forward.d.c j;
    protected f k;
    protected com.ss.android.ugc.aweme.comment.e.d l;
    protected CommentInputManager m;
    protected Aweme n;
    protected Comment o;
    protected boolean p;
    protected boolean q;
    public Comment r;

    public final void a_(Exception exc) {
    }

    public final void b(Comment comment) {
    }

    public void b(Aweme aweme) {
    }

    public final void b(boolean z) {
    }

    public abstract Fragment c();

    public final void d(boolean z) {
    }

    public final void e(Exception exc) {
    }

    public final void f(Exception exc) {
    }

    public final boolean h() {
        if (!PatchProxy.isSupport(new Object[0], this, f3643c, false, 61271, new Class[0], Boolean.TYPE)) {
            return e.a(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3643c, false, 61271, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public String n() {
        return "";
    }

    public Aweme getCommentInputAweme() {
        return this.n;
    }

    public Comment getCommentInputReplyComment() {
        return this.o;
    }

    public final /* synthetic */ void a(Object obj) {
        ar arVar = (ar) obj;
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f3643c, false, 61222, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f3643c, false, 61222, new Class[]{ar.class}, Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null && ((FlowFeedViewHolder) this.f2979f).isViewValid()) {
            int i2 = arVar.f45292b;
            if (i2 != 28) {
                switch (i2) {
                    case 1:
                        if (com.ss.android.ugc.aweme.base.utils.m.a().c()) {
                            Aweme aweme = (Aweme) arVar.f45293c;
                            if (aweme != null && aweme.getAuthor() != null && this.g != null) {
                                this.g.h(aweme);
                                break;
                            } else {
                                return;
                            }
                        } else {
                            if (((FlowFeedViewHolder) this.f2979f).getContext() != null) {
                                com.bytedance.ies.dmt.ui.d.a.b(((FlowFeedViewHolder) this.f2979f).getContext(), (int) C0906R.string.bgf).a();
                            }
                            return;
                        }
                    case 2:
                        if (!com.ss.android.ugc.aweme.base.utils.m.a().c()) {
                            com.bytedance.ies.dmt.ui.d.a.b(((FlowFeedViewHolder) this.f2979f).getContext(), (int) C0906R.string.bgf).a();
                            return;
                        }
                        Aweme aweme2 = (Aweme) arVar.f45293c;
                        if (aweme2 != null && !TextUtils.isEmpty(aweme2.getAid())) {
                            if (aweme2.getAwemeType() == 13) {
                                if (this.j == null) {
                                    this.j = new com.ss.android.ugc.aweme.forward.d.c();
                                    this.j.a(new com.ss.android.ugc.aweme.forward.model.a());
                                    this.j.a(this);
                                }
                                this.j.f48282b = aweme2.getAid();
                                this.j.a(aweme2.getAid());
                                return;
                            }
                            if (this.i == null) {
                                this.i = new z();
                                this.i.a(new y());
                                this.i.a(this);
                            }
                            this.i.a(aweme2.getAid());
                            return;
                        }
                        return;
                }
                return;
            }
            ((FlowFeedViewHolder) this.f2979f).a(false, (Aweme) null);
        }
    }

    public final void a(V v) {
        if (PatchProxy.isSupport(new Object[]{v}, this, f3643c, false, 61212, new Class[]{FlowFeedViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{v}, this, f3643c, false, 61212, new Class[]{FlowFeedViewHolder.class}, Void.TYPE);
            return;
        }
        super.a(v);
        if (this.g != null) {
            this.g.a();
        }
    }

    public final void a(M m2) {
        if (PatchProxy.isSupport(new Object[]{m2}, this, f3643c, false, 61213, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{m2}, this, f3643c, false, 61213, new Class[]{a.class}, Void.TYPE);
            return;
        }
        super.a(m2);
        if (this.f2978e instanceof com.ss.android.ugc.aweme.follow.presenter.a) {
            ((com.ss.android.ugc.aweme.follow.presenter.a) this.f2978e).h = this;
        }
    }

    public void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3643c, false, 61218, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3643c, false, 61218, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        if (this.f2978e != null && this.f2979f != null && ((FlowFeedViewHolder) this.f2979f).isViewValid()) {
            ((FlowFeedViewHolder) this.f2979f).b(false);
            int i2 = ((a) this.f2978e).mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    ((FlowFeedViewHolder) this.f2979f).c(1);
                }
                return;
            }
            ((FlowFeedViewHolder) this.f2979f).a(1);
        }
    }

    public void a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme) {
        View view3 = view;
        TextExtraStruct textExtraStruct2 = textExtraStruct;
        View view4 = view2;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{view3, textExtraStruct2, view4, aweme2}, this, f3643c, false, 61227, new Class[]{View.class, TextExtraStruct.class, View.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, textExtraStruct2, view4, aweme2}, this, f3643c, false, 61227, new Class[]{View.class, TextExtraStruct.class, View.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.a(view3, textExtraStruct2, view4, aweme2, a(true))) {
            com.ss.android.ugc.aweme.newfollow.g.a.a(view.getContext(), textExtraStruct2, aweme2, a(true));
        }
    }

    public final void a(Aweme aweme, List<String> list) {
        Aweme aweme2 = aweme;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{aweme2, list2}, this, f3643c, false, 61229, new Class[]{Aweme.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, list2}, this, f3643c, false, 61229, new Class[]{Aweme.class, List.class}, Void.TYPE);
        } else if (aweme2 != null && !CollectionUtils.isEmpty(list)) {
            com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(r());
            aVar.a((CharSequence[]) list2.toArray(new String[list.size()]), (DialogInterface.OnClickListener) new c(this, aweme2, list2));
            aVar.b();
            String a2 = a(true);
            if (PatchProxy.isSupport(new Object[]{a2, aweme2}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61404, new Class[]{String.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{a2, aweme2}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61404, new Class[]{String.class, Aweme.class}, Void.TYPE);
                return;
            }
            r.a("click_more_menu", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", a2).a("group_id", aweme.getAid()).a("author_id", aweme.getAuthorUid()).f34114b);
        }
    }

    public final void a(User user, List<String> list, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener) {
        User user2 = user;
        List<String> list2 = list;
        DialogInterface.OnShowListener onShowListener2 = onShowListener;
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        if (PatchProxy.isSupport(new Object[]{user2, list2, onShowListener2, onDismissListener2}, this, f3643c, false, 61231, new Class[]{User.class, List.class, DialogInterface.OnShowListener.class, DialogInterface.OnDismissListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2, list2, onShowListener2, onDismissListener2}, this, f3643c, false, 61231, new Class[]{User.class, List.class, DialogInterface.OnShowListener.class, DialogInterface.OnDismissListener.class}, Void.TYPE);
        } else if (user2 != null && !CollectionUtils.isEmpty(list)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(r(), C0906R.style.q9);
            builder.setItems((CharSequence[]) list2.toArray(new String[list.size()]), (DialogInterface.OnClickListener) new d(this, user2, list2));
            builder.setOnDismissListener(onDismissListener2);
            AlertDialog create = builder.create();
            create.setOnShowListener(onShowListener2);
            create.show();
            String a2 = a(true);
            if (PatchProxy.isSupport(new Object[]{a2, user2}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61405, new Class[]{String.class, User.class}, Void.TYPE)) {
                Object[] objArr = {a2, user2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61405, new Class[]{String.class, User.class}, Void.TYPE);
                return;
            }
            r.a("click_more_menu", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", a2).a("author_id", user.getUid()).f34114b);
        }
    }

    public final void a(Aweme aweme, Comment comment, String str) {
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, comment, str2}, this, f3643c, false, 61240, new Class[]{Aweme.class, Comment.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, comment, str2}, this, f3643c, false, 61240, new Class[]{Aweme.class, Comment.class, String.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            d dVar = this.g;
            a.C0457a a2 = new a.C0457a(aweme).a(comment.getCid()).a(true);
            a2.f36274b = true;
            dVar.a(a2.c(str2).d(n()).a());
        } else {
            com.ss.android.ugc.aweme.comment.a.a.b("onExposedCommentClick mDialogController is null");
        }
        ((FlowFeedViewHolder) this.f2979f).a(true, aweme);
    }

    public void a(View view, Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{view, aweme}, this, f3643c, false, 61241, new Class[]{View.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, aweme}, this, f3643c, false, 61241, new Class[]{View.class, Aweme.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            com.ss.android.ugc.aweme.login.e.a(r(), "homepage_hot", "click_comment_emotion", ad.a().a("login_title", r().getString(C0906R.string.uz)).a("log_pb", com.ss.android.ugc.aweme.u.aa.g(aweme != null ? aweme.getAid() : "")).f75487b);
        } else {
            this.n = aweme;
            q();
            ((FlowFeedViewHolder) this.f2979f).a(true, aweme);
        }
    }

    public final void a(View view, Aweme aweme, boolean z, String str) {
        Aweme aweme2 = aweme;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view, aweme2, Byte.valueOf(z ? (byte) 1 : 0), str2}, this, f3643c, false, 61242, new Class[]{View.class, Aweme.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, aweme2, Byte.valueOf(z), str2}, this, f3643c, false, 61242, new Class[]{View.class, Aweme.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a(new a.C0457a(aweme2).b(z || this.q).c(str2).d(n()).a());
        } else {
            com.ss.android.ugc.aweme.comment.a.a.b("onExpandCommentClick mDialogController is null");
        }
        ((FlowFeedViewHolder) this.f2979f).a(true, aweme2);
        com.ss.android.ugc.aweme.newfollow.g.a.b(aweme2, a(true), "list");
        this.q = false;
    }

    public void a(Aweme aweme, String str, String str2) {
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3, str4}, this, f3643c, false, 61243, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str3, str4}, this, f3643c, false, 61243, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Activity r2 = r();
        String a2 = a(true);
        if (PatchProxy.isSupport(new Object[]{aweme2, str3, str4, r2, a2, "list"}, null, com.ss.android.ugc.aweme.newfollow.a.a.f57054a, true, 61141, new Class[]{Aweme.class, String.class, String.class, Activity.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str3, str4, r2, a2, "list"}, null, com.ss.android.ugc.aweme.newfollow.a.a.f57054a, true, 61141, new Class[]{Aweme.class, String.class, String.class, Activity.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            h a3 = h.a();
            a3.a(r2, j.a("aweme://user/profile/" + str3).a("enter_from", a2).a("sec_user_id", str4).a());
            com.ss.android.ugc.aweme.newfollow.g.a.a(aweme2, str3, "head", a2, "list");
            com.ss.android.ugc.aweme.newfollow.g.a.c(aweme2, a2);
        }
    }

    public final void a(final Aweme aweme, final Comment comment) {
        if (PatchProxy.isSupport(new Object[]{aweme, comment}, this, f3643c, false, 61244, new Class[]{Aweme.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, comment}, this, f3643c, false, 61244, new Class[]{Aweme.class, Comment.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{aweme, comment}, this, f3643c, false, 61245, new Class[]{Aweme.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, comment}, this, f3643c, false, 61245, new Class[]{Aweme.class, Comment.class}, Void.TYPE);
        } else if (aweme != null && comment != null) {
            this.n = aweme;
            if (this.m == null) {
                this.m = new CommentInputManager(c(), hashCode(), this);
            }
            this.m.a(TextUtils.equals(comment.getUser() != null ? comment.getUser().getUid() : "", com.ss.android.ugc.aweme.account.d.a().getCurUserId()), TextUtils.equals(aweme.getAuthorUid(), com.ss.android.ugc.aweme.account.d.a().getCurUserId()), false, new CommentInputManager.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57120a;

                public final void h() {
                }

                public final void i() {
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f57120a, false, 61278, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57120a, false, 61278, new Class[0], Void.TYPE);
                        return;
                    }
                    b.this.a(aweme, comment, "");
                }

                public final void c() {
                    if (PatchProxy.isSupport(new Object[0], this, f57120a, false, 61279, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57120a, false, 61279, new Class[0], Void.TYPE);
                        return;
                    }
                    b.this.o = comment;
                    b.this.c(aweme);
                }

                public final void f() {
                    if (PatchProxy.isSupport(new Object[0], this, f57120a, false, 61282, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57120a, false, 61282, new Class[0], Void.TYPE);
                        return;
                    }
                    b.this.m.a(comment, b.this.a(true));
                }

                public final void g() {
                    if (PatchProxy.isSupport(new Object[0], this, f57120a, false, 61283, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57120a, false, 61283, new Class[0], Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.comment.f.a.a(b.this.a(true));
                    ((FlowFeedViewHolder) b.this.f2979f).a(false, (Aweme) null);
                }

                public final void d() {
                    if (PatchProxy.isSupport(new Object[0], this, f57120a, false, 61280, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57120a, false, 61280, new Class[0], Void.TYPE);
                        return;
                    }
                    ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(b.this.r(), "comment", comment.getCid(), comment.getUser().getUid(), b.this.n.getAuthorUid(), null);
                    com.ss.android.ugc.aweme.comment.f.a.a(b.this.a(true), b.this.getCommentInputAweme(), comment.getCid(), "list", "click_report_button");
                }

                public final void e() {
                    if (PatchProxy.isSupport(new Object[0], this, f57120a, false, 61281, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57120a, false, 61281, new Class[0], Void.TYPE);
                        return;
                    }
                    b.this.m.a(comment);
                    com.ss.android.ugc.aweme.comment.f.a.a(b.this.a(true), comment.getUser().getUid(), comment.getCid(), b.this.n);
                }

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f57120a, false, 61277, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57120a, false, 61277, new Class[0], Void.TYPE);
                    } else if (b.this.r() != null) {
                        if (!NetworkUtils.isNetworkAvailable(((FlowFeedViewHolder) b.this.f2979f).getContext())) {
                            com.bytedance.ies.dmt.ui.d.a.b(((FlowFeedViewHolder) b.this.f2979f).getContext(), (int) C0906R.string.bgf);
                            return;
                        }
                        if (b.this.l == null) {
                            b.this.l = new com.ss.android.ugc.aweme.comment.e.d();
                            b.this.l.a(new com.ss.android.ugc.aweme.comment.e.c());
                            b.this.l.a(b.this);
                        }
                        if (!TextUtils.isEmpty(comment.getCid())) {
                            ((com.ss.android.ugc.aweme.comment.e.c) b.this.l.i()).f36399e = aweme.getAid();
                            b.this.l.a(comment.getCid());
                            b.this.r = comment;
                        }
                    }
                }
            });
        }
    }

    public final void a(Aweme aweme, Comment comment, int i2) {
        String str;
        Aweme aweme2 = aweme;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{aweme2, comment, Integer.valueOf(i2)}, this, f3643c, false, 61247, new Class[]{Aweme.class, Comment.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, comment, Integer.valueOf(i2)}, this, f3643c, false, 61247, new Class[]{Aweme.class, Comment.class, Integer.TYPE}, Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(((FlowFeedViewHolder) this.f2979f).getContext())) {
            com.bytedance.ies.dmt.ui.d.a.b(((FlowFeedViewHolder) this.f2979f).getContext(), (int) C0906R.string.bgf).a();
        } else if (aweme2 != null && comment != null) {
            this.n = aweme2;
            String str2 = comment.getUserDigged() == 0 ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_UPLOAD_LOG;
            String uid = comment.getUser() != null ? comment.getUser().getUid() : "";
            if (this.k == null) {
                this.k = new f();
                this.k.a(this);
                this.k.a(new com.ss.android.ugc.aweme.comment.e.e());
            }
            this.k.a(comment.getCid(), comment.getAwemeId(), str2, getEventType());
            if (TextUtils.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, str2)) {
                Aweme aweme3 = this.n;
                String cid = comment.getCid();
                int labelType = comment.getLabelType();
                String a2 = a(true);
                if (PatchProxy.isSupport(new Object[]{aweme3, cid, uid, Integer.valueOf(labelType), a2, "list", Integer.valueOf(i2)}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61373, new Class[]{Aweme.class, String.class, String.class, Integer.TYPE, String.class, String.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme3, cid, uid, Integer.valueOf(labelType), a2, "list", Integer.valueOf(i2)}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61373, new Class[]{Aweme.class, String.class, String.class, Integer.TYPE, String.class, String.class, Integer.TYPE}, Void.TYPE);
                } else if (TextUtils.equals("poi_page", a2)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", a2);
                    hashMap.put("group_id", aweme3.getAid());
                    hashMap.put("comment_id", cid);
                    if (i3 >= 0) {
                        str = i3;
                    } else {
                        str = "";
                    }
                    hashMap.put("position", str);
                    r.a("like_comment", (Map) hashMap);
                } else {
                    String str3 = "common";
                    if (1 == labelType) {
                        str3 = "author";
                    } else if (2 == labelType) {
                        str3 = "following";
                    }
                    r.onEvent(MobClick.obtain().setEventName("like_comment").setLabelName(a2).setValue(cid).setExtValueString(uid).setJsonObject(com.ss.android.ugc.aweme.app.d.c.a().a("attribute", str3).b()));
                    com.ss.android.ugc.aweme.app.d.d a3 = com.ss.android.ugc.aweme.app.d.d.a();
                    a3.a("comment_id", cid);
                    a3.a(com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme3));
                    a3.a(com.ss.android.ugc.aweme.forward.e.a.b(aweme3, "list"));
                    if (com.ss.android.ugc.aweme.u.aa.d(a2)) {
                        a3.a("log_pb", ai.a().a(com.ss.android.ugc.aweme.u.aa.c(aweme3)));
                        r.a("like_comment", com.ss.android.ugc.aweme.u.aa.a(a3.f34114b));
                        return;
                    }
                    r.a("like_comment", (Map) a3.f34114b);
                }
            }
        }
    }

    public void a(com.ss.android.ugc.aweme.newfollow.e.a aVar, int i2) {
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i2)}, this, f3643c, false, 61249, new Class[]{com.ss.android.ugc.aweme.newfollow.e.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i2)}, this, f3643c, false, 61249, new Class[]{com.ss.android.ugc.aweme.newfollow.e.a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.a(r(), aVar, a(true))) {
            com.ss.android.ugc.aweme.newfollow.g.a.a(a(true), aVar, "", i2 + 1);
        }
    }

    public final void a(Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f3643c, false, 61256, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f3643c, false, 61256, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.g();
        }
        FlowFeedViewHolder flowFeedViewHolder = (FlowFeedViewHolder) this.f2979f;
        String aid = this.n.getAid();
        if (PatchProxy.isSupport(new Object[]{aid, comment2}, flowFeedViewHolder, FlowFeedViewHolder.i, false, 62172, new Class[]{String.class, Comment.class}, Void.TYPE)) {
            FlowFeedViewHolder flowFeedViewHolder2 = flowFeedViewHolder;
            PatchProxy.accessDispatch(new Object[]{aid, comment2}, flowFeedViewHolder2, FlowFeedViewHolder.i, false, 62172, new Class[]{String.class, Comment.class}, Void.TYPE);
        } else {
            flowFeedViewHolder.j.a(aid, comment2);
        }
        this.q = true;
        if (TextUtils.equals(this.n.getAid(), comment.getAwemeId()) && com.ss.android.ugc.aweme.commercialize.utils.c.t(this.n)) {
            com.ss.android.ugc.aweme.commercialize.log.d.a().b(this.n).a("result_ad").b("comment").a((Context) r());
        }
    }

    public final void a(Exception exc, int i2, Comment comment) {
        Exception exc2 = exc;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{exc2, Integer.valueOf(i2), comment}, this, f3643c, false, 61258, new Class[]{Exception.class, Integer.TYPE, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, Integer.valueOf(i2), comment}, this, f3643c, false, 61258, new Class[]{Exception.class, Integer.TYPE, Comment.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.comment.api.a.a(((FlowFeedViewHolder) this.f2979f).getContext(), exc, i3 == 3 ? C0906R.string.ahn : C0906R.string.v7);
        if (i3 == 3) {
            com.ss.android.ugc.aweme.forward.e.a.a(a(true), getCommentInputAweme(), "list", this.p ? "click_repost_button" : "click_comment", false);
        }
    }

    public final void a(String str, int i2) {
        String authorUid;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2)}, this, f3643c, false, 61260, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2)}, this, f3643c, false, 61260, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Aweme commentInputAweme = getCommentInputAweme();
        String a2 = a(true);
        String aid = commentInputAweme == null ? "" : commentInputAweme.getAid();
        if (commentInputAweme == null) {
            authorUid = "";
        } else {
            authorUid = commentInputAweme.getAuthorUid();
        }
        com.ss.android.ugc.aweme.comment.f.a.a(str2, i2, a2, aid, authorUid);
    }

    public final void a(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f3643c, false, 61261, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, this, f3643c, false, 61261, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Aweme commentInputAweme = getCommentInputAweme();
        String a2 = a(true);
        String aid = commentInputAweme == null ? "" : commentInputAweme.getAid();
        if (commentInputAweme == null) {
            str2 = "";
        } else {
            str2 = commentInputAweme.getAuthorUid();
        }
        com.ss.android.ugc.aweme.comment.f.a.a(str3, a2, aid, str2);
    }

    public /* synthetic */ com.ss.android.ugc.aweme.common.f.a e() {
        return (com.ss.android.ugc.aweme.common.f.a) super.i();
    }

    public int getCommentInputViewType() {
        if (this.p) {
            return 4;
        }
        return 2;
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f3643c, false, 61252, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3643c, false, 61252, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f3643c, false, 61253, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3643c, false, 61253, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            return false;
        } else {
            return true;
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f3643c, false, 61214, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3643c, false, 61214, new Class[0], Void.TYPE);
            return;
        }
        super.j();
        if (this.f2978e instanceof com.ss.android.ugc.aweme.follow.presenter.a) {
            ((com.ss.android.ugc.aweme.follow.presenter.a) this.f2978e).h = null;
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3643c, false, 61216, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3643c, false, 61216, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.b();
        }
        if (this.h != null) {
            this.h.b();
        }
    }

    public void q() {
        if (PatchProxy.isSupport(new Object[0], this, f3643c, false, 61251, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3643c, false, 61251, new Class[0], Void.TYPE);
            return;
        }
        if (this.m == null) {
            this.m = new CommentInputManager(c(), hashCode(), this);
        }
        this.m.e();
    }

    public final Activity r() {
        if (PatchProxy.isSupport(new Object[0], this, f3643c, false, 61262, new Class[0], Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[0], this, f3643c, false, 61262, new Class[0], Activity.class);
        } else if (c() != null) {
            return c().getActivity();
        } else {
            return null;
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f3643c, false, 61219, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3643c, false, 61219, new Class[0], Void.TYPE);
        } else if (this.f2978e != null && this.f2979f != null && ((FlowFeedViewHolder) this.f2979f).isViewValid()) {
            int i2 = ((com.ss.android.ugc.aweme.common.f.a) this.f2978e).mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    ((FlowFeedViewHolder) this.f2979f).c(2);
                }
                return;
            }
            ((FlowFeedViewHolder) this.f2979f).a(2);
        }
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f3643c, false, 61217, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3643c, false, 61217, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.j();
            this.k.k();
        }
        if (this.m != null) {
            this.m.j();
            this.m = null;
        }
        if (this.l != null) {
            this.l.j();
            this.l.k();
        }
        if (this.i != null) {
            this.i.j();
            this.i.k();
        }
        if (this.j != null) {
            this.j.j();
            this.j.k();
        }
        bg.d(this);
    }

    public final void a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f3643c, false, 61238, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f3643c, false, 61238, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        c(aweme);
    }

    public final void a_(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f3643c, false, 61223, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f3643c, false, 61223, new Class[]{String.class}, Void.TYPE);
            return;
        }
        bg.a(new ar(2, str2));
        ((FlowFeedViewHolder) this.f2979f).a(str2);
    }

    public final void c(Aweme aweme) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f3643c, false, 61239, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f3643c, false, 61239, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        this.n = aweme;
        this.p = true;
        q();
        ((FlowFeedViewHolder) this.f2979f).a(true, aweme);
        String a2 = a(true);
        Aweme commentInputAweme = getCommentInputAweme();
        if (this.o != null) {
            str = "click_reply_comment";
        } else {
            str = "click_repost_button";
        }
        com.ss.android.ugc.aweme.forward.e.a.a(a2, commentInputAweme, "list", str);
    }

    public final void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3643c, false, 61259, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3643c, false, 61259, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            com.ss.android.ugc.aweme.forward.e.a.b(a(true), getCommentInputAweme(), "list", "click_original");
        }
    }

    @Subscribe
    public void onDeleteItemEvent(com.ss.android.ugc.aweme.newfollow.c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3643c, false, 61265, new Class[]{com.ss.android.ugc.aweme.newfollow.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3643c, false, 61265, new Class[]{com.ss.android.ugc.aweme.newfollow.c.a.class}, Void.TYPE);
        } else if (this.f2979f != null && ((FlowFeedViewHolder) this.f2979f).isViewValid()) {
            ((FlowFeedViewHolder) this.f2979f).a(aVar);
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onReportCommentEvent(BroadcastMethod.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3643c, false, 61270, new Class[]{BroadcastMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3643c, false, 61270, new Class[]{BroadcastMethod.a.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            try {
                if (TextUtils.equals("commentReportSuccess", aVar.f44432b.getString("eventName")) && this.f2979f != null) {
                    ((FlowFeedViewHolder) this.f2979f).b(this.n.getAid(), aVar.f44432b.getJSONObject("data").getString("object_id"));
                }
            } catch (JSONException unused) {
            }
        }
    }

    @Subscribe
    public void onCommentDialogEvent(com.ss.android.ugc.aweme.feed.f.f fVar) {
        com.ss.android.ugc.aweme.feed.f.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f3643c, false, 61266, new Class[]{com.ss.android.ugc.aweme.feed.f.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f3643c, false, 61266, new Class[]{com.ss.android.ugc.aweme.feed.f.f.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null && ((FlowFeedViewHolder) this.f2979f).isViewValid() && fVar2.f45302a == 0) {
            ((FlowFeedViewHolder) this.f2979f).a(false, (Aweme) null);
            FlowFeedViewHolder flowFeedViewHolder = (FlowFeedViewHolder) this.f2979f;
            String str = fVar2.f45304c;
            int i2 = fVar2.f45303b;
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, flowFeedViewHolder, FlowFeedViewHolder.i, false, 62176, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                FlowFeedViewHolder flowFeedViewHolder2 = flowFeedViewHolder;
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, flowFeedViewHolder2, FlowFeedViewHolder.i, false, 62176, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            flowFeedViewHolder.j.a(str, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d4, code lost:
        return;
     */
    @org.greenrobot.eventbus.Subscribe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCommentEvent(com.ss.android.ugc.aweme.comment.b.a r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3643c
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.comment.b.a> r1 = com.ss.android.ugc.aweme.comment.b.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 61268(0xef54, float:8.5855E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3643c
            r3 = 0
            r4 = 61268(0xef54, float:8.5855E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.comment.b.a> r1 = com.ss.android.ugc.aweme.comment.b.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.common.o r0 = r7.f2979f
            if (r0 == 0) goto L_0x00d7
            com.ss.android.ugc.aweme.common.o r0 = r7.f2979f
            com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder r0 = (com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder) r0
            boolean r0 = r0.isViewValid()
            if (r0 != 0) goto L_0x0048
            goto L_0x00d7
        L_0x0048:
            java.lang.Object r0 = r8.f36371b
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            if (r0 == 0) goto L_0x00d6
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L_0x0054
            goto L_0x00d6
        L_0x0054:
            int r1 = r8.f36370a     // Catch:{ Exception -> 0x00d5 }
            switch(r1) {
                case 2: goto L_0x00bd;
                case 3: goto L_0x006b;
                case 4: goto L_0x005b;
                default: goto L_0x0059;
            }     // Catch:{ Exception -> 0x00d5 }
        L_0x0059:
            goto L_0x00d4
        L_0x005b:
            com.ss.android.ugc.aweme.common.o r1 = r7.f2979f     // Catch:{ Exception -> 0x00d5 }
            com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder r1 = (com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder) r1     // Catch:{ Exception -> 0x00d5 }
            r2 = r0[r10]     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00d5 }
            r0 = r0[r9]     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00d5 }
            r1.b((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00d5
        L_0x006b:
            com.ss.android.ugc.aweme.common.o r1 = r7.f2979f     // Catch:{ Exception -> 0x00d5 }
            com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder r1 = (com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder) r1     // Catch:{ Exception -> 0x00d5 }
            r3 = r0[r10]     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00d5 }
            r0 = r0[r9]     // Catch:{ Exception -> 0x00d5 }
            com.ss.android.ugc.aweme.comment.model.Comment r0 = (com.ss.android.ugc.aweme.comment.model.Comment) r0     // Catch:{ Exception -> 0x00d5 }
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00d5 }
            r11[r10] = r3     // Catch:{ Exception -> 0x00d5 }
            r11[r9] = r0     // Catch:{ Exception -> 0x00d5 }
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder.i     // Catch:{ Exception -> 0x00d5 }
            r14 = 0
            r15 = 62173(0xf2dd, float:8.7123E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r10] = r5     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class<com.ss.android.ugc.aweme.comment.model.Comment> r5 = com.ss.android.ugc.aweme.comment.model.Comment.class
            r4[r9] = r5     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00d5 }
            r12 = r1
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00d5 }
            if (r4 == 0) goto L_0x00b7
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00d5 }
            r11[r10] = r3     // Catch:{ Exception -> 0x00d5 }
            r11[r9] = r0     // Catch:{ Exception -> 0x00d5 }
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder.i     // Catch:{ Exception -> 0x00d5 }
            r14 = 0
            r15 = 62173(0xf2dd, float:8.7123E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r10] = r2     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class<com.ss.android.ugc.aweme.comment.model.Comment> r2 = com.ss.android.ugc.aweme.comment.model.Comment.class
            r0[r9] = r2     // Catch:{ Exception -> 0x00d5 }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00d5 }
            r12 = r1
            r16 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00d4
        L_0x00b7:
            T r1 = r1.j     // Catch:{ Exception -> 0x00d5 }
            r1.b(r3, r0)     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00d5
        L_0x00bd:
            r1 = r0[r9]     // Catch:{ Exception -> 0x00d5 }
            com.ss.android.ugc.aweme.comment.model.Comment r1 = (com.ss.android.ugc.aweme.comment.model.Comment) r1     // Catch:{ Exception -> 0x00d5 }
            com.ss.android.ugc.aweme.common.o r2 = r7.f2979f     // Catch:{ Exception -> 0x00d5 }
            com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder r2 = (com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder) r2     // Catch:{ Exception -> 0x00d5 }
            r0 = r0[r10]     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r3 = r1.getCid()     // Catch:{ Exception -> 0x00d5 }
            int r1 = r1.getDiggCount()     // Catch:{ Exception -> 0x00d5 }
            r2.a(r0, r3, r1)     // Catch:{ Exception -> 0x00d5 }
        L_0x00d4:
            return
        L_0x00d5:
            return
        L_0x00d6:
            return
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.f.b.onCommentEvent(com.ss.android.ugc.aweme.comment.b.a):void");
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.forward.c.a aVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3643c, false, 61257, new Class[]{com.ss.android.ugc.aweme.forward.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3643c, false, 61257, new Class[]{com.ss.android.ugc.aweme.forward.c.a.class}, Void.TYPE);
        } else if (aVar != null) {
            if (aVar.f48271e == 1) {
                if (aVar.f48272f == hashCode() && c().isVisible() && c().isResumed()) {
                    String a2 = a(true);
                    Aweme aweme = aVar.f48270d;
                    if (this.p) {
                        str = "click_repost_button";
                    } else {
                        str = "click_comment";
                    }
                    com.ss.android.ugc.aweme.forward.e.a.a(a2, aweme, "list", str, true);
                }
                if (this.m != null) {
                    this.m.g();
                }
                ((FlowFeedViewHolder) this.f2979f).a(aVar.f48269c, aVar.f48268b);
            } else if (aVar.f48271e == 2) {
                ((FlowFeedViewHolder) this.f2979f).a(aVar.f48269c);
            }
            this.q = true;
        }
    }

    @Subscribe
    public void onPrivateModelEvent(com.ss.android.ugc.aweme.feed.f.ad adVar) {
        com.ss.android.ugc.aweme.feed.f.ad adVar2 = adVar;
        if (PatchProxy.isSupport(new Object[]{adVar2}, this, f3643c, false, 61267, new Class[]{com.ss.android.ugc.aweme.feed.f.ad.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adVar2}, this, f3643c, false, 61267, new Class[]{com.ss.android.ugc.aweme.feed.f.ad.class}, Void.TYPE);
        } else if (adVar2.f45279b != null && this.f2979f != null && ((FlowFeedViewHolder) this.f2979f).isViewValid()) {
            FlowFeedViewHolder flowFeedViewHolder = (FlowFeedViewHolder) this.f2979f;
            if (PatchProxy.isSupport(new Object[]{adVar2}, flowFeedViewHolder, FlowFeedViewHolder.i, false, 62178, new Class[]{com.ss.android.ugc.aweme.feed.f.ad.class}, Void.TYPE)) {
                FlowFeedViewHolder flowFeedViewHolder2 = flowFeedViewHolder;
                PatchProxy.accessDispatch(new Object[]{adVar2}, flowFeedViewHolder2, FlowFeedViewHolder.i, false, 62178, new Class[]{com.ss.android.ugc.aweme.feed.f.ad.class}, Void.TYPE);
                return;
            }
            flowFeedViewHolder.j.a(adVar2);
        }
    }

    @Subscribe
    public void onUnFollowUserEvent(com.ss.android.ugc.aweme.newfollow.c.e eVar) {
        com.ss.android.ugc.aweme.newfollow.c.e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f3643c, false, 61264, new Class[]{com.ss.android.ugc.aweme.newfollow.c.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f3643c, false, 61264, new Class[]{com.ss.android.ugc.aweme.newfollow.c.e.class}, Void.TYPE);
        } else if (this.f2979f != null && ((FlowFeedViewHolder) this.f2979f).isViewValid()) {
            FlowFeedViewHolder flowFeedViewHolder = (FlowFeedViewHolder) this.f2979f;
            if (PatchProxy.isSupport(new Object[]{eVar2}, flowFeedViewHolder, FlowFeedViewHolder.i, false, 62167, new Class[]{com.ss.android.ugc.aweme.newfollow.c.e.class}, Void.TYPE)) {
                FlowFeedViewHolder flowFeedViewHolder2 = flowFeedViewHolder;
                PatchProxy.accessDispatch(new Object[]{eVar2}, flowFeedViewHolder2, FlowFeedViewHolder.i, false, 62167, new Class[]{com.ss.android.ugc.aweme.newfollow.c.e.class}, Void.TYPE);
                return;
            }
            if (!(flowFeedViewHolder.j == null || eVar2 == null)) {
                flowFeedViewHolder.j.a(eVar2.f57087a);
            }
        }
    }

    @Subscribe
    public void onVideoEvent(ar arVar) {
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f3643c, false, 61269, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f3643c, false, 61269, new Class[]{ar.class}, Void.TYPE);
        } else if (this.f2979f != null && ((FlowFeedViewHolder) this.f2979f).isViewValid()) {
            int i2 = arVar.f45292b;
            if (i2 != 13) {
                if (i2 == 21 && (arVar.f45293c instanceof Aweme)) {
                    Aweme aweme = (Aweme) arVar.f45293c;
                    if (arVar.k) {
                        ((FlowFeedViewHolder) this.f2979f).a(aweme, arVar.f45296f);
                    }
                    ((FlowFeedViewHolder) this.f2979f).a(aweme, !arVar.j, arVar.f45296f, arVar.g);
                }
                return;
            }
            ((FlowFeedViewHolder) this.f2979f).c((String) arVar.f45293c);
        }
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3643c, false, 61221, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3643c, false, 61221, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((FlowFeedViewHolder) this.f2979f).a(this.n.getAid(), str, -1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.ss.android.ugc.aweme.feed.model.Aweme} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.ss.android.ugc.aweme.feed.model.Aweme} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.greenrobot.eventbus.Subscribe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPreloadEvent(com.ss.android.ugc.aweme.newfollow.c.d r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3643c
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.newfollow.c.d> r1 = com.ss.android.ugc.aweme.newfollow.c.d.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 61263(0xef4f, float:8.5848E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f3643c
            r3 = 0
            r4 = 61263(0xef4f, float:8.5848E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.newfollow.c.d> r1 = com.ss.android.ugc.aweme.newfollow.c.d.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f57086a
            if (r0 == 0) goto L_0x01a7
            com.ss.android.ugc.aweme.common.o r0 = r7.f2979f
            if (r0 == 0) goto L_0x01a7
            com.ss.android.ugc.aweme.common.o r0 = r7.f2979f
            com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder r0 = (com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder) r0
            boolean r0 = r0.isViewValid()
            if (r0 != 0) goto L_0x004c
            goto L_0x01a7
        L_0x004c:
            com.ss.android.ugc.aweme.common.o r0 = r7.f2979f
            com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder r0 = (com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder) r0
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder.i
            r14 = 0
            r15 = 62192(0xf2f0, float:8.715E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x007f
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder.i
            r14 = 0
            r15 = 62192(0xf2f0, float:8.715E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r17 = java.lang.Integer.TYPE
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x008b
        L_0x007f:
            T r1 = r0.j
            if (r1 != 0) goto L_0x0085
            r0 = 0
            goto L_0x008b
        L_0x0085:
            T r0 = r0.j
            int r0 = r0.getBasicItemCount()
        L_0x008b:
            if (r0 != 0) goto L_0x008e
            return
        L_0x008e:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f57086a
            int r1 = r0.getAwemeType()
            r2 = 13
            if (r1 != r2) goto L_0x009c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getForwardItem()
        L_0x009c:
            com.ss.android.ugc.aweme.common.o r1 = r7.f2979f
            com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder r1 = (com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder) r1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder.i
            r14 = 0
            r15 = 62191(0xf2ef, float:8.7148E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r10] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r17 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r12 = r1
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            r3 = 0
            if (r2 == 0) goto L_0x00da
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder.i
            r14 = 0
            r15 = 62191(0xf2ef, float:8.7148E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r17 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r12 = r1
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            r3 = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            goto L_0x0180
        L_0x00da:
            T r2 = r1.j
            if (r2 == 0) goto L_0x0180
            T r1 = r1.j
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter.i
            r14 = 0
            r15 = 61034(0xee6a, float:8.5527E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r4 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r2[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r17 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r12 = r1
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r2 == 0) goto L_0x0118
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter.i
            r14 = 0
            r15 = 61034(0xee6a, float:8.5527E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r17 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r12 = r1
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            r3 = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            goto L_0x0180
        L_0x0118:
            java.util.List r2 = r1.mItems
            boolean r2 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0180
            if (r0 != 0) goto L_0x0123
            goto L_0x0180
        L_0x0123:
            java.util.List r2 = r1.mItems
            int r2 = r2.size()
            r4 = 16
            r5 = -1
            if (r10 >= r2) goto L_0x0154
            java.util.List r2 = r1.mItems
            java.lang.Object r2 = r2.get(r10)
            com.ss.android.ugc.aweme.newfollow.e.b r2 = (com.ss.android.ugc.aweme.newfollow.e.b) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r2.getAweme()
            if (r6 == 0) goto L_0x0151
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r2.getAweme()
            int r6 = r1.b((com.ss.android.ugc.aweme.feed.model.Aweme) r6)
            if (r6 != r4) goto L_0x0151
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.getAweme()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0151
            goto L_0x0155
        L_0x0151:
            int r10 = r10 + 1
            goto L_0x0123
        L_0x0154:
            r10 = -1
        L_0x0155:
            if (r10 == r5) goto L_0x0180
            int r10 = r10 + r9
        L_0x0158:
            java.util.List r0 = r1.mItems
            int r0 = r0.size()
            if (r10 >= r0) goto L_0x0180
            java.util.List r0 = r1.mItems
            java.lang.Object r0 = r0.get(r10)
            com.ss.android.ugc.aweme.newfollow.e.b r0 = (com.ss.android.ugc.aweme.newfollow.e.b) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.getAweme()
            if (r2 == 0) goto L_0x017d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r0.getAweme()
            int r2 = r1.b((com.ss.android.ugc.aweme.feed.model.Aweme) r2)
            if (r2 != r4) goto L_0x017d
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.getAweme()
            goto L_0x0180
        L_0x017d:
            int r10 = r10 + 1
            goto L_0x0158
        L_0x0180:
            if (r3 != 0) goto L_0x0183
            return
        L_0x0183:
            com.ss.android.ugc.aweme.video.preload.g r0 = com.ss.android.ugc.aweme.video.preload.g.f()
            r0.b()
            com.ss.android.ugc.aweme.feed.model.Video r0 = r3.getVideo()
            if (r0 != 0) goto L_0x0191
            return
        L_0x0191:
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.getProperPlayAddr()
            if (r1 != 0) goto L_0x0198
            return
        L_0x0198:
            java.lang.String r1 = r3.getAid()
            r0.setRationAndSourceId(r1)
            com.ss.android.ugc.aweme.video.preload.g r0 = com.ss.android.ugc.aweme.video.preload.g.f()
            r0.a((com.ss.android.ugc.aweme.feed.model.Aweme) r3)
            return
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.f.b.onPreloadEvent(com.ss.android.ugc.aweme.newfollow.c.d):void");
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3643c, false, 61254, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3643c, false, 61254, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            this.p = false;
            this.o = null;
            ((FlowFeedViewHolder) this.f2979f).a(false, (Aweme) null);
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3643c, false, 61220, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3643c, false, 61220, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.q = true;
        ((FlowFeedViewHolder) this.f2979f).b(this.n.getAid(), str);
        com.ss.android.ugc.aweme.setting.commentfilter.b.a.f63900a.a(r(), this.n, this.r);
    }

    public final void a(Fragment fragment, int i2) {
        if (PatchProxy.isSupport(new Object[]{fragment, Integer.valueOf(i2)}, this, f3643c, false, 61215, new Class[]{Fragment.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment, Integer.valueOf(i2)}, this, f3643c, false, 61215, new Class[]{Fragment.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = new d(a(true), i2, this, this);
        this.g.a(fragment.getActivity(), fragment);
        this.h = new com.ss.android.ugc.aweme.commercialize.a(a(true), i2);
        this.h.a(fragment.getActivity(), fragment);
        bg.c(this);
    }

    public void b(com.ss.android.ugc.aweme.newfollow.e.a aVar, int i2) {
        com.ss.android.ugc.aweme.newfollow.e.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, Integer.valueOf(i2)}, this, f3643c, false, 61250, new Class[]{com.ss.android.ugc.aweme.newfollow.e.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, Integer.valueOf(i2)}, this, f3643c, false, 61250, new Class[]{com.ss.android.ugc.aweme.newfollow.e.a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.g.a.b(a(true), aVar2, "", i2 + 1);
    }

    public void b(View view, View view2, Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2}, this, f3643c, false, 61226, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme2}, this, f3643c, false, 61226, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.b(view, view2, aweme)) {
            com.ss.android.ugc.aweme.newfollow.g.a.d(aweme2, a(true), "list");
        }
    }

    public void d(View view, View view2, Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2}, this, f3643c, false, 61237, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme2}, this, f3643c, false, 61237, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE);
        } else if (aweme2 != null) {
            ((FlowFeedViewHolder) this.f2979f).a(true, aweme2);
            if (this.h != null) {
                this.h.b(new ar(24, aweme2), "click_video_tag", "video_cart_tag", a(true));
                com.ss.android.ugc.aweme.newfollow.g.a.d(aweme2, a(true));
            }
        }
    }

    public final void a(int i2, int i3, String str) {
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f3643c, false, 61255, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f3643c, false, 61255, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.g.a.b(this.n, a(true), "list", "");
        Aweme aweme = this.n;
        String a2 = a(true);
        String a3 = com.ss.android.ugc.aweme.comment.f.a.a(this.o);
        if (this.o != null) {
            str2 = this.o.getCid();
        } else {
            str2 = "";
        }
        String str4 = str2;
        String valueOf = String.valueOf(i3);
        if (i2 != 3) {
            str3 = "click_comment_box";
        } else {
            str3 = "repost_comment";
        }
        com.ss.android.ugc.aweme.comment.f.a.a(aweme, str, a2, a3, str4, "list", valueOf, 0, str3);
    }

    public final void c(View view, View view2, Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2}, this, f3643c, false, 61228, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme2}, this, f3643c, false, 61228, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE);
        } else if (this.f2979f != null && ((FlowFeedViewHolder) this.f2979f).isViewValid() && this.g != null && aweme2 != null) {
            new com.ss.android.ugc.aweme.u.h().i(aweme.getAuthorUid()).e(a(true)).f(a(true)).f(aweme2).g("list").e();
            this.g.a((Activity) null, aweme2);
            ((FlowFeedViewHolder) this.f2979f).a(true, aweme2);
        }
    }

    public void a(View view, View view2, Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2}, this, f3643c, false, 61225, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme2}, this, f3643c, false, 61225, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.a(view, view2, aweme)) {
            com.ss.android.ugc.aweme.newfollow.g.a.d(aweme2, a(true), "list");
        }
    }

    public final void b(Aweme aweme, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{aweme, str3, str4}, this, f3643c, false, 61248, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str3, str4}, this, f3643c, false, 61248, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        UserProfileActivity.a(((FlowFeedViewHolder) this.f2979f).getContext(), str3, str4, a(true));
    }

    public final void a(View view, View view2, User user) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{view, view2, user}, this, f3643c, false, 61236, new Class[]{View.class, View.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, user}, this, f3643c, false, 61236, new Class[]{View.class, View.class, User.class}, Void.TYPE);
            return;
        }
        Activity r2 = r();
        String a2 = a(true);
        if (PatchProxy.isSupport(new Object[]{user, r2, a2}, null, com.ss.android.ugc.aweme.newfollow.a.a.f57054a, true, 61145, new Class[]{User.class, Activity.class, String.class}, Boolean.TYPE)) {
            ((Boolean) PatchProxy.accessDispatch(new Object[]{user, r2, a2}, null, com.ss.android.ugc.aweme.newfollow.a.a.f57054a, true, 61145, new Class[]{User.class, Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (user != null && !TextUtils.isEmpty(user.getUid())) {
            j a3 = j.a("aweme://user/profile/" + user.getUid());
            a3.a("enter_from", a2);
            a3.a("sec_user_id", user.getSecUid());
            if (PatchProxy.isSupport(new Object[]{user, a2}, null, com.ss.android.ugc.aweme.newfollow.a.a.f57054a, true, 61147, new Class[]{User.class, String.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{user, a2}, null, com.ss.android.ugc.aweme.newfollow.a.a.f57054a, true, 61147, new Class[]{User.class, String.class}, Boolean.TYPE)).booleanValue();
            } else if (user != null && user.getFollowStatus() == 0 && "homepage_follow".equals(a2)) {
                z = true;
            }
            if (z) {
                a3.a("extra_previous_page_position", "content_card_button");
            } else {
                a3.a("extra_previous_page_position", "main_head");
            }
            h.a().a(r2, a3.a());
        }
    }

    public void b(View view, View view2, Aweme aweme, User user) {
        Aweme aweme2 = aweme;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2, user2}, this, f3643c, false, 61235, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme2, user2}, this, f3643c, false, 61235, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.b(aweme2, user2, r(), a(true))) {
            com.ss.android.ugc.aweme.newfollow.g.a.c(aweme2, a(true));
            com.ss.android.ugc.aweme.newfollow.g.a.a(aweme2, user.getUid(), "name", a(true), "list");
        }
    }

    public void a(View view, View view2, Aweme aweme, User user) {
        Aweme aweme2 = aweme;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{view, view2, aweme2, user2}, this, f3643c, false, 61233, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, view2, aweme2, user2}, this, f3643c, false, 61233, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.ugc.aweme.newfollow.a.a.a(aweme2, user2, r(), a(true)) && !com.ss.android.ugc.aweme.newfollow.a.b.a(user)) {
            com.ss.android.ugc.aweme.newfollow.g.a.c(aweme2, a(true));
            com.ss.android.ugc.aweme.newfollow.g.a.a(aweme2, user.getUid(), "head", a(true), "list");
        }
    }

    public final void a(View view, View view2, User user, String str, String str2) {
        User user2 = user;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{view, view2, user2, str3, str4}, this, f3643c, false, 61234, new Class[]{View.class, View.class, User.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {view, view2, user2, str3, str4};
            PatchProxy.accessDispatch(objArr, this, f3643c, false, 61234, new Class[]{View.class, View.class, User.class, String.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.a.a.a(user2, r(), str3, str4);
    }
}
