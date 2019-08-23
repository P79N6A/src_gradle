package com.ss.android.ugc.aweme.newfollow.adapter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.FollowImageViewHolder;
import com.ss.android.ugc.aweme.utils.eo;

public class FollowFlowItemImageViewHolder extends FollowImageViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57075a;

    public void E_() {
        if (PatchProxy.isSupport(new Object[0], this, f57075a, false, 61131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57075a, false, 61131, new Class[0], Void.TYPE);
        } else if (a.c()) {
            this.mCreateTimeView.setText(eo.c(X(), this.j.getCreateTime() * 1000));
        } else {
            super.E_();
        }
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f57075a, false, 61130, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f57075a, false, 61130, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.j == null || this.j.getAuthor() == null || !TextUtils.equals(this.j.getAuthor().getUid(), d.a().getCurUserId())) {
            super.a(j);
        }
    }

    public FollowFlowItemImageViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, com.ss.android.ugc.aweme.newfollow.b.a aVar2) {
        super(followFeedLayout, aVar, lVar, aVar2);
    }
}
