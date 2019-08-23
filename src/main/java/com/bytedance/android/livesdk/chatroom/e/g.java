package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.c;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class g extends b<c> {
    public static ChangeQuickRedirect j;

    public final User e() {
        return null;
    }

    public final boolean f() {
        return false;
    }

    public final Spannable l() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5379, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5379, new Class[0], Spannable.class);
        }
        String str = this.f10013b.baseMessage.f18779f;
        j.q().l();
        return x.a(str, (int) C0906R.color.ae6);
    }

    public final Spannable m() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 5380, new Class[0], Spannable.class)) {
            return x.a(this.f10013b.baseMessage.f18779f, (int) C0906R.color.a98);
        }
        return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5380, new Class[0], Spannable.class);
    }

    public g(c cVar) {
        super(cVar);
    }
}
