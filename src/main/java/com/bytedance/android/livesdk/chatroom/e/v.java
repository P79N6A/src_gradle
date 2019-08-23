package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.message.model.bi;
import com.bytedance.android.livesdk.n.c;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class v extends b<bi> {
    public static ChangeQuickRedirect j;

    public final boolean f() {
        return true;
    }

    public final User e() {
        return ((bi) this.f10013b).f16570c;
    }

    public final Spannable l() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5414, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5414, new Class[0], Spannable.class);
        }
        if (o()) {
            i = C0906R.color.ag6;
        } else {
            j.q().l();
            i = C0906R.color.ae6;
        }
        if (o()) {
            i2 = C0906R.color.a8e;
        } else {
            j.q().l();
            i2 = C0906R.color.ae7;
        }
        return x.b(((bi) this.f10013b).f16570c, "：", ((bi) this.f10013b).f16569b, i, i2, false);
    }

    public final Spannable m() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5415, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5415, new Class[0], Spannable.class);
        }
        User user = ((bi) this.f10013b).f16570c;
        String str = ((bi) this.f10013b).f16569b;
        j.q().l();
        j.q().l();
        return x.b(user, "：", str, C0906R.color.ae6, C0906R.color.ae7, false);
    }

    public final List<Integer> k() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5416, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, j, false, 5416, new Class[0], List.class);
        } else if (a.d() || a.g()) {
            return super.k();
        } else {
            if (!a.f()) {
                return super.k();
            }
            ArrayList arrayList = new ArrayList();
            if (!(((bi) this.f10013b).f16570c == null || ((bi) this.f10013b).f16570c.getUserAttr() == null)) {
                if (((bi) this.f10013b).f16570c.getUserAttr().f7775d) {
                    c cVar = (c) j.q().k().a(c.class);
                    if (cVar != null) {
                        arrayList.add(Integer.valueOf(cVar.g()));
                    }
                } else if (((bi) this.f10013b).f16570c.getUserAttr().f7774c) {
                    arrayList.add(Integer.valueOf(z.c0m));
                }
            }
            return arrayList;
        }
    }

    public v(bi biVar) {
        super(biVar);
    }
}
