package com.ss.android.ugc.aweme.newfollow.adapter;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.FollowVideoViewHolder;
import com.ss.android.ugc.aweme.utils.eo;

public class FollowFlowItemVideoViewHolder extends FollowVideoViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3641a;

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3641a, false, 61136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3641a, false, 61136, new Class[0], Void.TYPE);
            return;
        }
        this.mLineDivider.setVisibility(4);
    }

    public void E_() {
        if (PatchProxy.isSupport(new Object[0], this, f3641a, false, 61137, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3641a, false, 61137, new Class[0], Void.TYPE);
        } else if (a.c()) {
            String c2 = eo.c(X(), this.j.getCreateTime() * 1000);
            if (!TextUtils.isEmpty(this.j.getOpenPlatformName()) && this.j.getOpenPlatformStruct() == null) {
                c2 = c2 + "  " + this.j.getOpenPlatformName();
            }
            this.mCreateTimeView.setText(c2);
        } else {
            super.E_();
        }
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f3641a, false, 61135, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f3641a, false, 61135, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.j == null || this.j.getAuthor() == null || !TextUtils.equals(this.j.getAuthor().getUid(), d.a().getCurUserId())) {
            super.a(j);
        }
    }

    public FollowFlowItemVideoViewHolder(FollowFeedLayout followFeedLayout, com.ss.android.ugc.aweme.forward.a.a aVar, l lVar, com.ss.android.ugc.aweme.newfollow.b.a aVar2, com.ss.android.ugc.aweme.feed.d dVar) {
        super(followFeedLayout, aVar, lVar, aVar2, dVar);
    }
}
