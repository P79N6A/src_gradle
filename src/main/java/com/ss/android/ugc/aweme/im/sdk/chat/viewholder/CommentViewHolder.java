package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.app.Activity;
import android.view.View;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sdk.chat.k;
import com.ss.android.ugc.aweme.im.sdk.chat.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.utils.ay;
import com.ss.android.ugc.aweme.im.sdk.widget.EnableEndEllipsizeTextView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

public class CommentViewHolder extends BaseViewHolder<CommentContent> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f51057b;

    /* renamed from: a  reason: collision with root package name */
    private RemoteImageView f51058a;
    protected EnableEndEllipsizeTextView p;
    protected k.b q;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f51057b, false, 51445, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51057b, false, 51445, new Class[0], Void.TYPE);
            return;
        }
        super.b();
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51057b, false, 51444, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51057b, false, 51444, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f51058a = (RemoteImageView) this.itemView.findViewById(C0906R.id.by9);
        this.p = (EnableEndEllipsizeTextView) this.itemView.findViewById(C0906R.id.d41);
        this.i = this.itemView.findViewById(C0906R.id.yp);
    }

    public CommentViewHolder(View view, int i) {
        super(view);
        if (PatchProxy.isSupport(new Object[0], this, f51057b, false, 51448, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51057b, false, 51448, new Class[0], Void.TYPE);
            return;
        }
        if (this.q == null) {
            this.q = new k.b(GlobalContext.getContext().getResources().getColor(C0906R.color.qa));
        }
    }

    public final void a(IMUser iMUser, n nVar, int i) {
        if (PatchProxy.isSupport(new Object[]{iMUser, nVar, Integer.valueOf(i)}, this, f51057b, false, 51447, new Class[]{IMUser.class, n.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMUser, nVar, Integer.valueOf(i)}, this, f51057b, false, 51447, new Class[]{IMUser.class, n.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(iMUser, nVar, i);
        String nickName = iMUser.getNickName();
        if (nickName == null) {
            nickName = "";
        }
        if (nickName.length() > 4) {
            nickName = nickName.substring(0, 4) + "...";
        }
        String str = GlobalContext.getContext().getResources().getString(C0906R.string.av7, new Object[]{GlobalContext.getContext().getResources().getString(C0906R.string.ap0) + nickName}) + ((CommentContent) this.k).getComment();
        this.q.f50690b = iMUser.getUid();
        k.a(this.p, str, GlobalContext.getContext().getResources().getString(C0906R.string.ap0) + nickName, this.q, new k.b.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51059a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f51059a, false, 51450, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f51059a, false, 51450, new Class[0], Void.TYPE);
                    return;
                }
                h.a().a((Activity) CommentViewHolder.this.itemView.getContext(), j.a("aweme://aweme/detail/" + ((CommentContent) CommentViewHolder.this.k).getAwemeId()).a("refer", "chat").a("video_from", "from_chat").a("cid", ((CommentContent) CommentViewHolder.this.k).getCommentId()).a());
            }

            public final void b(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f51059a, false, 51451, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f51059a, false, 51451, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                CommentViewHolder.this.i.performLongClick();
            }

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f51059a, false, 51449, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f51059a, false, 51449, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ay.f52524b.a(CommentViewHolder.this.q.f50690b);
            }
        });
    }

    public void a(n nVar, n nVar2, CommentContent commentContent, int i) {
        if (PatchProxy.isSupport(new Object[]{nVar, nVar2, commentContent, Integer.valueOf(i)}, this, f51057b, false, 51446, new Class[]{n.class, n.class, CommentContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar, nVar2, commentContent, Integer.valueOf(i)}, this, f51057b, false, 51446, new Class[]{n.class, n.class, CommentContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(nVar, nVar2, commentContent, i);
        c.b(this.f51058a, commentContent.getCoverUrl());
        this.i.setTag(50331648, 14);
    }
}
