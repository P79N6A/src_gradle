package com.ss.android.ugc.aweme.newfollow.userstate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.forward.d.k;
import com.ss.android.ugc.aweme.forward.vh.ForwardVideoViewHolder;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.utils.eo;

public class UserStateFlowItemForwardVideoViewHolder extends ForwardVideoViewHolder {
    public static ChangeQuickRedirect t;

    public final void w() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 61813, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 61813, new Class[0], Void.TYPE);
        } else if (a.c()) {
            this.mCreateTimeView.setText(eo.c(c(), this.f48319d.getCreateTime() * 1000));
        } else {
            super.w();
        }
    }

    public final k a(d dVar, l lVar) {
        d dVar2 = dVar;
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, lVar2}, this, t, false, 61812, new Class[]{d.class, l.class}, k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[]{dVar2, lVar2}, this, t, false, 61812, new Class[]{d.class, l.class}, k.class);
        }
        return new f(this, dVar2, lVar2, R());
    }

    public UserStateFlowItemForwardVideoViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, d dVar, l lVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, dVar, lVar, aVar2, aVar3);
    }
}
