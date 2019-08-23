package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.ap;
import com.bytedance.android.livesdkapi.h.d;
import com.bytedance.android.livesdkapi.h.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class m extends b<ap> {
    public static ChangeQuickRedirect j;

    public final boolean f() {
        return false;
    }

    public final Spannable l() {
        return null;
    }

    public final User e() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5394, new Class[0], User.class)) {
            return (User) PatchProxy.accessDispatch(new Object[0], this, j, false, 5394, new Class[0], User.class);
        }
        if (!(this.f10013b == null || ((ap) this.f10013b).baseMessage == null || ((ap) this.f10013b).baseMessage.j == null)) {
            for (g next : ((ap) this.f10013b).baseMessage.j.f18785d) {
                if (next.f18789a == d.USER.getPieceType() && next.f18792d != null) {
                    return next.f18792d.f18800a;
                }
            }
        }
        return null;
    }

    public m(ap apVar) {
        super(apVar);
    }
}
