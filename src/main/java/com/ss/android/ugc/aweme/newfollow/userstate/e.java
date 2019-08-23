package com.ss.android.ugc.aweme.newfollow.userstate;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.forward.d.f;
import com.ss.android.ugc.aweme.newfollow.util.l;

public final class e extends f {
    public static ChangeQuickRedirect m;

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, m, false, 61820, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, m, false, 61820, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.f3282c == null || this.f3282c.getAuthor() == null || !TextUtils.equals(this.f3282c.getAuthor().getUid(), d.a().getCurUserId())) {
            super.a(j);
        }
    }

    public e(com.ss.android.ugc.aweme.forward.b.e eVar, l lVar) {
        super(eVar, lVar);
    }
}
