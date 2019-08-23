package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.bb;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class u extends b<bb> {
    public static ChangeQuickRedirect j;

    public final User e() {
        return null;
    }

    public final boolean f() {
        return false;
    }

    public final Spannable m() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 5413, new Class[0], Spannable.class)) {
            return x.a(((bb) this.f10013b).f16542b, (int) C0906R.color.a98);
        }
        return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5413, new Class[0], Spannable.class);
    }

    public final Spannable l() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5412, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5412, new Class[0], Spannable.class);
        }
        if (o()) {
            i = C0906R.color.aex;
        } else {
            j.q().l();
            i = C0906R.color.ae6;
        }
        return x.a(((bb) this.f10013b).f16542b, i);
    }

    public u(bb bbVar) {
        super(bbVar);
    }
}
