package com.ss.android.ugc.aweme.forward.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OriginAwemeDetailFragment extends BaseAwemeDetailFragment {
    public static ChangeQuickRedirect o;
    public String p;

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 45794, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 45794, new Class[0], Void.TYPE);
        } else if (getArguments() != null) {
            Aweme aweme = (Aweme) getArguments().getSerializable("forward_item");
            if (aweme != null && aweme.getForwardItem() != null) {
                this.p = getArguments().getString("share_id");
                this.f3288c.o = this.p;
                this.f3288c.n = aweme;
                this.h = aweme.getForwardItem();
                Aweme b2 = a.a().b(this.h.getAid());
                if (b2 != null) {
                    this.h.setStatistics(b2.getStatistics());
                    this.h.setUserDigg(b2.getUserDigg());
                    this.h.setStatus(b2.getStatus());
                    this.h.setRepostFromGroupId(aweme.getAid());
                    this.h.setRepostFromUserId(aweme.getAuthorUid());
                }
                this.f3288c.m = this.h;
                this.f3288c.setData(this.f3288c.a(this.h, (List<Comment>) new ArrayList<Comment>()));
                String str = this.f3290e;
                if (PatchProxy.isSupport(new Object[]{str, aweme}, null, com.ss.android.ugc.aweme.forward.e.a.f48291a, true, 45511, new Class[]{String.class, Aweme.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, aweme}, null, com.ss.android.ugc.aweme.forward.e.a.f48291a, true, 45511, new Class[]{String.class, Aweme.class}, Void.TYPE);
                } else {
                    r.a("enter_repost_detail", (Map) d.a().a("repost_comment_id", aweme.getForwardCommentId()).a("from_group_id", aweme.getFromGroupId()).a(com.ss.android.ugc.aweme.forward.e.a.a(str, aweme)).f34114b);
                }
                p();
                q();
            }
        }
    }
}
