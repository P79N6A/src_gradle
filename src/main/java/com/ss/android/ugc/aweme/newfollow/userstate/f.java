package com.ss.android.ugc.aweme.newfollow.userstate;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.forward.d.k;
import com.ss.android.ugc.aweme.newfollow.util.l;

public final class f extends k {
    public static ChangeQuickRedirect r;

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, r, false, 61821, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, r, false, 61821, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.f3282c == null || this.f3282c.getAuthor() == null || !TextUtils.equals(this.f3282c.getAuthor().getUid(), d.a().getCurUserId())) {
            super.a(j);
        }
    }

    public f(com.ss.android.ugc.aweme.forward.b.f fVar, com.ss.android.ugc.aweme.feed.d dVar, l lVar, int i) {
        super(fVar, dVar, lVar, i);
    }
}
