package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.at;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class s extends b<at> {
    public static ChangeQuickRedirect j;

    public final User e() {
        return null;
    }

    public final boolean f() {
        return false;
    }

    public final Spannable l() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5408, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5408, new Class[0], Spannable.class);
        } else if (((at) this.f10013b).f16497b == null || TextUtils.isEmpty(((at) this.f10013b).f16497b.f16499b)) {
            return x.f10027b;
        } else {
            String str = ((at) this.f10013b).f16497b.f16499b;
            j.q().l();
            return x.a(str, (int) C0906R.color.ae6);
        }
    }

    public final Spannable m() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5409, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5409, new Class[0], Spannable.class);
        } else if (((at) this.f10013b).f16497b == null || TextUtils.isEmpty(((at) this.f10013b).f16497b.f16499b)) {
            return x.f10027b;
        } else {
            return x.a(((at) this.f10013b).f16497b.f16499b, (int) C0906R.color.a98);
        }
    }

    public s(at atVar) {
        super(atVar);
    }
}
