package com.ss.android.ugc.aweme.forward.d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.c.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.comment.f;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;

public final class i extends a<g, l> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f48287b;

    /* renamed from: c  reason: collision with root package name */
    public int f48288c;
    private Comment g;

    public i() {
        a(new g());
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f48287b, false, 45437, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48287b, false, 45437, new Class[0], Void.TYPE);
            return;
        }
        super.n_();
        if (this.f2979f != null) {
            ((l) this.f2979f).e(this.g);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f48287b, false, 45439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48287b, false, 45439, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (!(this.f2979f == null || this.f2978e == null || ((g) this.f2978e).getData() == null)) {
            Comment comment = ((ForwardDetail) ((g) this.f2978e).getData()).getComment();
            if (comment == null) {
                ((l) this.f2979f).a((ForwardDetail) ((g) this.f2978e).getData());
            } else if (this.f48288c == 1 && !CollectionUtils.isEmpty(comment.getReplyComments())) {
                Comment comment2 = comment.getReplyComments().get(0);
                comment2.setCommentType(1);
                ArrayList arrayList = new ArrayList();
                comment.setReplyComments(null);
                comment.setCommentType(2);
                arrayList.add(comment);
                comment2.setReplyComments(arrayList);
                ((ForwardDetail) ((g) this.f2978e).getData()).setComment(comment2);
                ((l) this.f2979f).a((ForwardDetail) ((g) this.f2978e).getData());
            } else if (this.f48288c != 2 || CollectionUtils.isEmpty(comment.getReplyComments())) {
                comment.setCommentType(this.f48288c);
                ((l) this.f2979f).a((ForwardDetail) ((g) this.f2978e).getData());
            } else {
                Comment comment3 = comment.getReplyComments().get(0);
                comment.setReplyToReplyId(comment3.getCid());
                if (!TextUtils.equals(comment.getReplyId(), comment.getReplyToReplyCommentId())) {
                    comment.setReplyToUserName(ae.a(comment3.getUser()));
                }
                comment.setReplyComments(null);
                comment.setCommentType(2);
                ((l) this.f2979f).a((ForwardDetail) ((g) this.f2978e).getData());
            }
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f48287b, false, 45440, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f48287b, false, 45440, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.a(exc);
        if (this.f2979f != null) {
            ((l) this.f2979f).b(exc, this.g);
        }
    }

    public final boolean b(Object... objArr) {
        Context context;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f48287b, false, 45438, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f48287b, false, 45438, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        this.g = new Comment();
        this.g.setText(objArr[0]);
        User curUser = d.a().getCurUser();
        Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(objArr[1]);
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
        String str = objArr[3];
        Comment comment = this.g;
        if (TextUtils.isEmpty(str)) {
            str = a2;
        }
        comment.setForwardId(str);
        String str2 = objArr[4];
        this.g.setReplyId(str2);
        this.g.setTextExtra(objArr[5]);
        String str3 = objArr[6];
        Comment comment2 = this.g;
        if (str3 != null) {
            str2 = str3;
        }
        comment2.setReplyToReplyId(str2);
        this.g.setCommentType(this.f48288c);
        this.g.setReplyComments(new ArrayList());
        Object[] objArr2 = new Object[8];
        System.arraycopy(objArr, 0, objArr2, 0, 7);
        objArr2[7] = a2;
        f.f36433c.b(this.g, 3);
        f.f36433c.k(this.g);
        f.f36433c.a(this.g, objArr2);
        return super.a(objArr2);
    }
}
