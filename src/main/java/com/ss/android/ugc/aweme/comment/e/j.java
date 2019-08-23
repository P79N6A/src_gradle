package com.ss.android.ugc.aweme.comment.e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.c.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.comment.f;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public final class j extends a<i, o> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f36427b;

    /* renamed from: c  reason: collision with root package name */
    public int f36428c;
    private Comment g;

    public j() {
        a(new i());
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f36427b, false, 27347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36427b, false, 27347, new Class[0], Void.TYPE);
            return;
        }
        super.n_();
        if (this.f2979f != null) {
            ((o) this.f2979f).c(this.g);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36427b, false, 27349, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36427b, false, 27349, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f2979f == null || this.f2978e == null || ((i) this.f2978e).getData() == null)) {
            Comment comment = ((CommentResponse) ((i) this.f2978e).getData()).comment;
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trackAppsFlyerEvent("mus_af_comment", comment.getAwemeId());
            if (this.f36428c != 1 || CollectionUtils.isEmpty(comment.getReplyComments())) {
                if (this.f36428c != 2 || CollectionUtils.isEmpty(comment.getReplyComments())) {
                    comment.setCommentType(this.f36428c);
                    if (comment.getReplyComments() == null) {
                        comment.setReplyComments(new ArrayList());
                    }
                } else {
                    Comment comment2 = comment.getReplyComments().get(0);
                    comment.setReplyToReplyId(comment2.getCid());
                    if (!TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                        comment.setReplyToUserName(ae.a(comment2.getUser()));
                    }
                    comment.setReplyComments(null);
                    comment.setCommentType(2);
                }
                ((o) this.f2979f).d(comment);
            } else {
                Comment comment3 = comment.getReplyComments().get(0);
                comment3.setCommentType(1);
                ArrayList arrayList = new ArrayList();
                comment.setReplyComments(null);
                comment.setCommentType(2);
                arrayList.add(comment);
                comment3.setReplyComments(arrayList);
                ((o) this.f2979f).d(comment3);
            }
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f36427b, false, 27346, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f36427b, false, 27346, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f2979f != null) {
            ((o) this.f2979f).a(exc, this.g);
        }
    }

    public final boolean b(Object... objArr) {
        Context context;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f36427b, false, 27348, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f36427b, false, 27348, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        this.g = new Comment();
        this.g.setAwemeId(objArr[0]);
        User curUser = d.a().getCurUser();
        Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(objArr[0]);
        if (b2 != null && TextUtils.equals(b2.getAuthorUid(), curUser.getUid())) {
            if (com.ss.android.ugc.aweme.framework.core.a.b().a() == null) {
                context = GlobalContext.getContext();
            } else {
                context = com.ss.android.ugc.aweme.framework.core.a.b().a();
            }
            this.g.setLabelText(context.getString(C0906R.string.hu));
            this.g.setLabelType(1);
        }
        this.g.setUser(curUser);
        String a2 = f.f36433c.a();
        this.g.setFakeId(a2);
        this.g.setText(objArr[1]);
        this.g.setCommentType(this.f36428c);
        this.g.setReplyComments(new ArrayList());
        if (objArr.length == 4 && (objArr[2] instanceof List)) {
            this.g.setReplyId(null);
            this.g.setTextExtra(objArr[2]);
            this.g.setReplyToReplyId(null);
            f.f36433c.b(this.g, 1);
        } else if (objArr.length == 5) {
            this.g.setReplyId(objArr[2]);
            this.g.setTextExtra(objArr[3]);
            this.g.setReplyToReplyId(objArr[2]);
            f.f36433c.b(this.g, 2);
        } else if (objArr.length == 6) {
            this.g.setReplyId(objArr[2]);
            this.g.setTextExtra(objArr[3]);
            this.g.setReplyToReplyId(objArr[4]);
            f.f36433c.b(this.g, 2);
        }
        Object[] objArr2 = new Object[(objArr.length + 1)];
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        objArr2[objArr2.length - 1] = a2;
        f.f36433c.k(this.g);
        f.f36433c.a(this.g, objArr2);
        return super.a(objArr2);
    }
}
