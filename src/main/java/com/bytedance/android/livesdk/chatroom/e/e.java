package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.f;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class e extends b<f> {
    public static ChangeQuickRedirect j;

    public final boolean f() {
        return true;
    }

    public final User e() {
        return ((f) this.f10013b).f16619b;
    }

    public final Spannable l() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5372, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5372, new Class[0], Spannable.class);
        }
        User user = ((f) this.f10013b).f16619b;
        j.q().l();
        j.q().l();
        return x.b(user, "", " ", C0906R.color.ae6, C0906R.color.ae7, false);
    }

    public e(f fVar) {
        super(fVar);
    }
}
