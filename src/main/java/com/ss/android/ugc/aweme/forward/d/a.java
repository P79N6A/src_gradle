package com.ss.android.ugc.aweme.forward.d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.utils.m;
import com.ss.android.ugc.aweme.comment.adapter.CommentViewHolder;
import com.ss.android.ugc.aweme.comment.e.f;
import com.ss.android.ugc.aweme.comment.e.l;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.h.y;
import com.ss.android.ugc.aweme.feed.h.z;
import com.ss.android.ugc.aweme.feed.listener.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.b.a;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.newfollow.a.b;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.u.h;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class a implements aa<ar>, c, a.C0024a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3274a;

    /* renamed from: b  reason: collision with root package name */
    public d f3275b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.a f3276c;

    /* renamed from: d  reason: collision with root package name */
    public a.b f3277d;

    /* renamed from: e  reason: collision with root package name */
    public f f3278e;

    /* renamed from: f  reason: collision with root package name */
    public l f3279f;
    public final boolean g = AbTestManager.a().Z();
    public String h;
    public int i;
    public String j;
    public com.ss.android.ugc.aweme.comment.g.c k;
    private z l;
    private c m;
    private BaseFollowViewHolder.a n = new FollowVideoViewHolder.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48273a;

        public final void a(View view, View view2, User user) {
            if (PatchProxy.isSupport(new Object[]{view, view2, user}, this, f48273a, false, 45389, new Class[]{View.class, View.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, view2, user}, this, f48273a, false, 45389, new Class[]{View.class, View.class, User.class}, Void.TYPE);
            }
        }

        public final void a(View view, View view2, User user, String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{view, view2, user, str, str2}, this, f48273a, false, 45388, new Class[]{View.class, View.class, User.class, String.class, String.class}, Void.TYPE)) {
                Object[] objArr = {view, view2, user, str, str2};
                PatchProxy.accessDispatch(objArr, this, f48273a, false, 45388, new Class[]{View.class, View.class, User.class, String.class, String.class}, Void.TYPE);
            }
        }

        public final void a(View view, Aweme aweme) {
        }

        public final void a(Aweme aweme, Comment comment) {
        }

        public final void a(Aweme aweme, Comment comment, int i) {
        }

        public final void a(Aweme aweme, Comment comment, String str) {
        }

        public final void a(Aweme aweme, String str, String str2) {
        }

        public final void a(Aweme aweme, List<String> list) {
        }

        public final void a(User user, List list, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener) {
            if (PatchProxy.isSupport(new Object[]{user, list, onShowListener, onDismissListener}, this, f48273a, false, 45391, new Class[]{User.class, List.class, DialogInterface.OnShowListener.class, DialogInterface.OnDismissListener.class}, Void.TYPE)) {
                Object[] objArr = {user, list, onShowListener, onDismissListener};
                PatchProxy.accessDispatch(objArr, this, f48273a, false, 45391, new Class[]{User.class, List.class, DialogInterface.OnShowListener.class, DialogInterface.OnDismissListener.class}, Void.TYPE);
            }
        }

        public final void b(Aweme aweme) {
        }

        public final void b(Aweme aweme, String str, String str2) {
        }

        public final com.ss.android.ugc.aweme.common.f.a e() {
            if (!PatchProxy.isSupport(new Object[0], this, f48273a, false, 45390, new Class[0], com.ss.android.ugc.aweme.common.f.a.class)) {
                return null;
            }
            return (com.ss.android.ugc.aweme.common.f.a) PatchProxy.accessDispatch(new Object[0], this, f48273a, false, 45390, new Class[0], com.ss.android.ugc.aweme.common.f.a.class);
        }

        public final void a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme) {
            View view3 = view;
            TextExtraStruct textExtraStruct2 = textExtraStruct;
            View view4 = view2;
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{view3, textExtraStruct2, view4, aweme2}, this, f48273a, false, 45381, new Class[]{View.class, TextExtraStruct.class, View.class, Aweme.class}, Void.TYPE)) {
                Object[] objArr = {view3, textExtraStruct2, view4, aweme2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f48273a, false, 45381, new Class[]{View.class, TextExtraStruct.class, View.class, Aweme.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.newfollow.a.a.a(view3, textExtraStruct2, view4, aweme2, "homepage_follow")) {
                com.ss.android.ugc.aweme.newfollow.g.a.a(view.getContext(), textExtraStruct2, aweme2, "homepage_follow");
            }
        }

        public final void a(Aweme aweme) {
            if (PatchProxy.isSupport(new Object[]{aweme}, this, f48273a, false, 45386, new Class[]{Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aweme}, this, f48273a, false, 45386, new Class[]{Aweme.class}, Void.TYPE);
                return;
            }
            a.this.f3277d.a(true);
        }

        public final void a(View view, View view2, Aweme aweme) {
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{view, view2, aweme2}, this, f48273a, false, 45379, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, view2, aweme2}, this, f48273a, false, 45379, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.newfollow.a.a.a(view, view2, aweme)) {
                com.ss.android.ugc.aweme.newfollow.g.a.d(aweme2, a.this.h, "detail");
            }
        }

        public final void b(View view, View view2, Aweme aweme) {
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{view, view2, aweme2}, this, f48273a, false, 45380, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, view2, aweme2}, this, f48273a, false, 45380, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.newfollow.a.a.b(view, view2, aweme)) {
                com.ss.android.ugc.aweme.newfollow.g.a.d(aweme2, a.this.h, "detail");
            }
        }

        public final void d(View view, View view2, Aweme aweme) {
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{view, view2, aweme2}, this, f48273a, false, 45385, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, view2, aweme2}, this, f48273a, false, 45385, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE);
                return;
            }
            if (a.this.f3276c != null) {
                a.this.f3276c.b(new ar(24, aweme2), "click_follow", "video_cart_tag", a.this.a(true));
                com.ss.android.ugc.aweme.newfollow.g.a.d(aweme2, a.this.h);
            }
        }

        public final void c(View view, View view2, Aweme aweme) {
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{view, view2, aweme2}, this, f48273a, false, 45382, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, view2, aweme2}, this, f48273a, false, 45382, new Class[]{View.class, View.class, Aweme.class}, Void.TYPE);
            } else if (a.this.f3277d != null && a.this.f3277d.isViewValid() && a.this.f3275b != null) {
                if (b.c(aweme) || !am.a(aweme)) {
                    new h().i(aweme.getAuthorUid()).e(a.this.h).f(a.this.h).f(aweme2).g("detail").e();
                    a.this.f3275b.a((Activity) null, aweme2);
                    return;
                }
                com.bytedance.ies.dmt.ui.d.a.c((Context) a.this.f3277d.i(), (int) C0906R.string.du6).a();
            }
        }

        public final void a(View view, View view2, Aweme aweme, User user) {
            Aweme aweme2 = aweme;
            User user2 = user;
            if (PatchProxy.isSupport(new Object[]{view, view2, aweme2, user2}, this, f48273a, false, 45383, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, view2, aweme2, user2}, this, f48273a, false, 45383, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.newfollow.a.a.a(aweme2, user2, a.this.f3277d.i(), a.this.h) && !b.a(user)) {
                com.ss.android.ugc.aweme.newfollow.g.a.c(aweme2, a.this.h);
                com.ss.android.ugc.aweme.newfollow.g.a.a(aweme2, user.getUid(), "head", a.this.h, "detail");
            }
        }

        public final void b(View view, View view2, Aweme aweme, User user) {
            Aweme aweme2 = aweme;
            User user2 = user;
            if (PatchProxy.isSupport(new Object[]{view, view2, aweme2, user2}, this, f48273a, false, 45384, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, view2, aweme2, user2}, this, f48273a, false, 45384, new Class[]{View.class, View.class, Aweme.class, User.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.newfollow.a.a.b(aweme2, user2, a.this.f3277d.i(), a.this.h)) {
                com.ss.android.ugc.aweme.newfollow.g.a.c(aweme2, a.this.h);
                com.ss.android.ugc.aweme.newfollow.g.a.a(aweme2, user.getUid(), "name", a.this.h, "detail");
            }
        }

        public final void a(View view, Aweme aweme, boolean z, String str) {
            if (PatchProxy.isSupport(new Object[]{view, aweme, Byte.valueOf(z ? (byte) 1 : 0), str}, this, f48273a, false, 45387, new Class[]{View.class, Aweme.class, Boolean.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, aweme, Byte.valueOf(z), str}, this, f48273a, false, 45387, new Class[]{View.class, Aweme.class, Boolean.TYPE, String.class}, Void.TYPE);
                return;
            }
            a.this.f3277d.a(false);
            String a2 = a.this.a(true);
            if (PatchProxy.isSupport(new Object[]{a2, aweme, "detail", 0, "", str}, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27368, new Class[]{String.class, Aweme.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                Object[] objArr = {a2, aweme, "detail", 0, "", str};
                PatchProxy.accessDispatch(objArr, null, com.ss.android.ugc.aweme.comment.f.a.f36440a, true, 27368, new Class[]{String.class, Aweme.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.comment.f.a.a(a2, aweme, "detail", 0, "", str, "", "", "", "");
        }
    };
    private CommentViewHolder.a o = new CommentViewHolder.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48275a;

        public final void b() {
        }

        public final void c(Comment comment) {
            if (PatchProxy.isSupport(new Object[]{comment}, this, f48275a, false, 45398, new Class[]{Comment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{comment}, this, f48275a, false, 45398, new Class[]{Comment.class}, Void.TYPE);
                return;
            }
            if (a.this.f3277d != null) {
                a.this.f3277d.c(comment);
            }
        }

        public final void a(com.ss.android.ugc.aweme.comment.widget.a aVar, Comment comment) {
            if (PatchProxy.isSupport(new Object[]{aVar, comment}, this, f48275a, false, 45393, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar, comment}, this, f48275a, false, 45393, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE);
                return;
            }
            if (a.this.g) {
                if (a.this.f3277d != null) {
                    a.this.f3277d.d(comment);
                }
            } else if (a.this.f3277d != null) {
                a.this.f3277d.a(aVar, comment);
            }
        }

        public final void b(com.ss.android.ugc.aweme.comment.widget.a aVar, Comment comment) {
            if (PatchProxy.isSupport(new Object[]{aVar, comment}, this, f48275a, false, 45394, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar, comment}, this, f48275a, false, 45394, new Class[]{com.ss.android.ugc.aweme.comment.widget.a.class, Comment.class}, Void.TYPE);
                return;
            }
            if (a.this.g && a.this.f3277d != null) {
                a.this.f3277d.a(aVar, comment);
            }
        }

        public final void a(CommentReplyButtonStruct commentReplyButtonStruct, int i) {
            String str;
            if (PatchProxy.isSupport(new Object[]{commentReplyButtonStruct, Integer.valueOf(i)}, this, f48275a, false, 45397, new Class[]{CommentReplyButtonStruct.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{commentReplyButtonStruct, Integer.valueOf(i)}, this, f48275a, false, 45397, new Class[]{CommentReplyButtonStruct.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (a.this.f3279f == null) {
                a.this.f3279f = new l();
                l lVar = a.this.f3279f;
                if (a.this.f3277d.n() != null) {
                    str = a.this.f3277d.n().getAid();
                } else {
                    str = "";
                }
                lVar.a(str);
                a.this.f3279f.a(a.this.k);
                a.this.f3279f.f36430b = a.this.f3277d.m();
            }
            a.this.f3279f.a(commentReplyButtonStruct, a.this.f3277d.a(i));
        }

        public final void b(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f48275a, false, 45396, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f48275a, false, 45396, new Class[]{String.class, String.class}, Void.TYPE);
                return;
            }
            UserProfileActivity.a((Context) a.this.f3277d.i(), str3, str4, "like_banner");
        }

        public final void a(Comment comment, int i) {
            String str;
            if (PatchProxy.isSupport(new Object[]{comment, Integer.valueOf(i)}, this, f48275a, false, 45395, new Class[]{Comment.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{comment, Integer.valueOf(i)}, this, f48275a, false, 45395, new Class[]{Comment.class, Integer.TYPE}, Void.TYPE);
            } else if (!NetworkUtils.isNetworkAvailable(a.this.f3277d.i())) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) a.this.f3277d.i(), (int) C0906R.string.bgf).a();
            } else if (!com.ss.android.ugc.aweme.account.d.a().isLogin()) {
                e.a(a.this.f3277d.i(), a.this.h, "like_comment");
            } else if (comment != null) {
                if (comment.getUserDigged() == 0) {
                    str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str = PushConstants.PUSH_TYPE_UPLOAD_LOG;
                }
                if (a.this.f3278e == null) {
                    a.this.f3278e = new f();
                    a.this.f3278e.a(a.this.f3277d.l());
                    a.this.f3278e.a(new com.ss.android.ugc.aweme.comment.e.e());
                }
                if (a.this.f3278e != null && a.this.f3278e.l()) {
                    a.this.f3278e.a(comment.getCid(), comment.getAwemeId(), str, a.this.h);
                }
                if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(str)) {
                    a.this.j = comment.getCid();
                    return;
                }
                a.this.j = "";
            }
        }

        public final void a(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f48275a, false, 45392, new Class[]{String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f48275a, false, 45392, new Class[]{String.class, String.class}, Void.TYPE);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
                Activity i = a.this.f3277d.i();
                a2.a(i, j.a("aweme://user/profile/" + str3).a("sec_user_id", str4).a());
            }
        }
    };

    public final BaseFollowViewHolder.a a() {
        return this.n;
    }

    public final CommentViewHolder.a b() {
        return this.o;
    }

    public final d c() {
        return this.f3275b;
    }

    public final String f() {
        return this.j;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f3274a, false, 45375, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3274a, false, 45375, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3275b != null) {
            this.f3275b.a();
        }
        this.f3275b = new d(this.h, this.i, this, this);
        this.f3275b.a(this.f3277d.i(), this.f3277d.b());
        this.f3276c = new com.ss.android.ugc.aweme.commercialize.a(this.h, this.i);
        this.f3276c.a(this.f3277d.i(), this.f3277d.b());
        bg.c(this);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3274a, false, 45376, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3274a, false, 45376, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3275b != null) {
            this.f3275b.b();
        }
        if (this.f3276c != null) {
            this.f3276c.b();
        }
        if (this.l != null) {
            this.l.j();
            this.l.k();
        }
        bg.d(this);
    }

    public final String a(boolean z) {
        return this.h;
    }

    @Subscribe
    public void onVideoEvent(ar arVar) {
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f3274a, false, 45378, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f3274a, false, 45378, new Class[]{ar.class}, Void.TYPE);
            return;
        }
        if (this.f3277d != null && this.f3277d.isViewValid() && arVar.f45292b == 13) {
            this.f3277d.a((String) arVar.f45293c, TextUtils.equals(arVar.f45295e, this.h));
        }
    }

    public final /* synthetic */ void a(Object obj) {
        ar arVar = (ar) obj;
        if (PatchProxy.isSupport(new Object[]{arVar}, this, f3274a, false, 45377, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar}, this, f3274a, false, 45377, new Class[]{ar.class}, Void.TYPE);
        } else if (this.f3277d != null && this.f3277d.isViewValid()) {
            int i2 = arVar.f45292b;
            if (i2 != 28) {
                switch (i2) {
                    case 1:
                        if (m.a().c()) {
                            Aweme aweme = (Aweme) arVar.f45293c;
                            if (aweme != null && aweme.getAuthor() != null && this.f3275b != null) {
                                this.f3275b.h(aweme);
                                break;
                            } else {
                                return;
                            }
                        } else {
                            if (this.f3277d.i() != null) {
                                com.bytedance.ies.dmt.ui.d.a.b((Context) this.f3277d.i(), (int) C0906R.string.bgf).a();
                            }
                            return;
                        }
                    case 2:
                        if (!m.a().c()) {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) this.f3277d.i(), (int) C0906R.string.bgf).a();
                            return;
                        }
                        Aweme aweme2 = (Aweme) arVar.f45293c;
                        if (aweme2 != null && !TextUtils.isEmpty(aweme2.getAid())) {
                            if (aweme2.getAwemeType() == 13) {
                                if (this.m == null) {
                                    this.m = new c();
                                    this.m.a(new com.ss.android.ugc.aweme.forward.model.a());
                                    this.m.a(this.f3277d.k());
                                }
                                this.m.f48282b = aweme2.getAid();
                                this.m.a(aweme2.getAid());
                                return;
                            }
                            if (this.l == null) {
                                this.l = new z();
                                this.l.a(new y());
                                this.l.a(this.f3277d.j());
                            }
                            this.l.a(aweme2.getAid());
                            return;
                        }
                        return;
                }
            }
        }
    }

    public a(a.b bVar, String str, com.ss.android.ugc.aweme.comment.g.c cVar) {
        this.f3277d = bVar;
        this.h = str;
        this.k = cVar;
    }
}
