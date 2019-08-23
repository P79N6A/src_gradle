package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.message.model.bj;
import com.bytedance.android.livesdk.n.c;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class w extends b<bj> {
    public static ChangeQuickRedirect j;

    public final boolean f() {
        return true;
    }

    public final User e() {
        return ((bj) this.f10013b).f16576c;
    }

    public final Spannable l() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5417, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5417, new Class[0], Spannable.class);
        }
        if (o()) {
            i = C0906R.color.ag6;
        } else {
            j.q().l();
            i = C0906R.color.ae6;
        }
        if (o()) {
            i2 = C0906R.color.aex;
        } else {
            j.q().l();
            i2 = C0906R.color.ae6;
        }
        return x.a(((bj) this.f10013b).f16576c, "  ", ((bj) this.f10013b).a(), i, i2, false);
    }

    public final Spannable m() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 5418, new Class[0], Spannable.class)) {
            return x.a(((bj) this.f10013b).f16576c, "  ", ((bj) this.f10013b).a(), C0906R.color.a98, C0906R.color.si, false);
        }
        return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5418, new Class[0], Spannable.class);
    }

    public final List<Integer> k() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5419, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, j, false, 5419, new Class[0], List.class);
        } else if (this.f10013b == null) {
            return super.k();
        } else {
            if (!a.f() || (((bj) this.f10013b).f16575b != 1 && ((bj) this.f10013b).f16575b != 2)) {
                return super.k();
            }
            ArrayList arrayList = new ArrayList();
            if (!(((bj) this.f10013b).f16576c == null || ((bj) this.f10013b).f16576c.getUserAttr() == null)) {
                if (((bj) this.f10013b).f16576c.getUserAttr().f7775d) {
                    c cVar = (c) j.q().k().a(c.class);
                    if (cVar != null) {
                        arrayList.add(Integer.valueOf(cVar.g()));
                    }
                } else if (((bj) this.f10013b).f16576c.getUserAttr().f7774c) {
                    arrayList.add(Integer.valueOf(z.c0m));
                }
            }
            return arrayList;
        }
    }

    public w(bj bjVar) {
        super(bjVar);
    }
}
