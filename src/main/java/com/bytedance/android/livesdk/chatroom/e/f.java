package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class f extends b<j> {
    public static ChangeQuickRedirect j;

    public final User e() {
        return null;
    }

    public final boolean f() {
        return false;
    }

    public final Spannable m() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 5378, new Class[0], Spannable.class)) {
            return x.a(((j) this.f10013b).a(), (int) C0906R.color.a98);
        }
        return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5378, new Class[0], Spannable.class);
    }

    public final Spannable l() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5377, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5377, new Class[0], Spannable.class);
        }
        if (o()) {
            i = C0906R.color.aex;
        } else {
            com.bytedance.android.livesdk.v.j.q().l();
            i = C0906R.color.ae6;
        }
        return x.a(((j) this.f10013b).a(), i);
    }

    public f(j jVar) {
        super(jVar);
    }
}
