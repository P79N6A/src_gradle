package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.q;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class i extends b<q> {
    public static ChangeQuickRedirect j;

    public final boolean f() {
        return true;
    }

    public final User e() {
        return ((q) this.f10013b).f16671b;
    }

    public final Spannable l() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5384, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5384, new Class[0], Spannable.class);
        }
        String str = ((q) this.f10013b).baseMessage.f18779f;
        User user = ((q) this.f10013b).f16671b;
        j.q().l();
        j.q().l();
        return x.b(user, "：", str, C0906R.color.ae6, C0906R.color.ae9, false);
    }

    public final Spannable m() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5385, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5385, new Class[0], Spannable.class);
        }
        return x.b(((q) this.f10013b).f16671b, "：", ((q) this.f10013b).baseMessage.f18779f, C0906R.color.a98, C0906R.color.si, false);
    }

    public i(q qVar) {
        super(qVar);
    }
}
