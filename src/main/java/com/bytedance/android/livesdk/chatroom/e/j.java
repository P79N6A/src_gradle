package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class j extends b<v> {
    public static ChangeQuickRedirect j;

    public final boolean f() {
        return false;
    }

    public final User e() {
        return ((v) this.f10013b).f16693d;
    }

    public final Spannable m() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 5387, new Class[0], Spannable.class)) {
            return x.a(((v) this.f10013b).f16692c, (int) C0906R.color.a98);
        }
        return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5387, new Class[0], Spannable.class);
    }

    public final Spannable l() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5386, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5386, new Class[0], Spannable.class);
        }
        int i = ((v) this.f10013b).f16691b;
        int i2 = C0906R.color.aex;
        if ((i != 2 && ((v) this.f10013b).f16691b != 1) || !o() || e() == null || e().getNickName() == null || ((v) this.f10013b).f16692c == null) {
            if (!o()) {
                com.bytedance.android.livesdk.v.j.q().l();
                i2 = C0906R.color.ae6;
            }
            return x.a(((v) this.f10013b).f16692c, i2);
        }
        SpannableString spannableString = new SpannableString(((v) this.f10013b).f16692c);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(x.a((int) C0906R.color.ag6));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(x.a((int) C0906R.color.aex));
        spannableString.setSpan(foregroundColorSpan2, 0, 2, 18);
        spannableString.setSpan(foregroundColorSpan, 3, e().getNickName().length() + 3, 17);
        spannableString.setSpan(foregroundColorSpan2, e().getNickName().length() + 4, ((v) this.f10013b).f16692c.length(), 17);
        return spannableString;
    }

    public j(v vVar) {
        super(vVar);
    }
}
