package com.ss.android.ugc.aweme.newfollow.userstate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.forward.d.f;
import com.ss.android.ugc.aweme.forward.vh.ForwardImageViewHolder;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.utils.eo;

public class UserStateFlowItemForwardImageViewHolder extends ForwardImageViewHolder {
    public static ChangeQuickRedirect t;

    public final void w() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 61811, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 61811, new Class[0], Void.TYPE);
        } else if (a.c()) {
            this.mCreateTimeView.setText(eo.c(c(), this.f48319d.getCreateTime() * 1000));
        } else {
            super.w();
        }
    }

    public final f a(l lVar) {
        l lVar2 = lVar;
        if (!PatchProxy.isSupport(new Object[]{lVar2}, this, t, false, 61810, new Class[]{l.class}, f.class)) {
            return new e(this, lVar2);
        }
        return (f) PatchProxy.accessDispatch(new Object[]{lVar2}, this, t, false, 61810, new Class[]{l.class}, f.class);
    }

    public UserStateFlowItemForwardImageViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, BaseFollowViewHolder.a aVar2, com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, lVar, aVar2, aVar3);
    }
}
