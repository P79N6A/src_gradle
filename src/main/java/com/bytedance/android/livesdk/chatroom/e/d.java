package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.message.model.e;
import com.bytedance.android.livesdk.n.c;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class d extends b<e> {
    public static ChangeQuickRedirect j;

    public final boolean f() {
        return true;
    }

    public final User e() {
        return ((e) this.f10013b).f16615d;
    }

    public final Spannable m() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 5370, new Class[0], Spannable.class)) {
            return x.b(((e) this.f10013b).f16615d, "：", ((e) this.f10013b).f16614c, C0906R.color.a98, C0906R.color.si, false);
        }
        return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5370, new Class[0], Spannable.class);
    }

    public final Spannable l() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5369, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5369, new Class[0], Spannable.class);
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
        return x.b(((e) this.f10013b).f16615d, "：", ((e) this.f10013b).f16614c, i, i2, false);
    }

    public final List<Integer> k() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5371, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, j, false, 5371, new Class[0], List.class);
        } else if (a.d() || a.g()) {
            return super.k();
        } else {
            if (a.f()) {
                ArrayList arrayList = new ArrayList();
                if (!(((e) this.f10013b).f16615d == null || ((e) this.f10013b).f16615d.getUserAttr() == null)) {
                    if (((e) this.f10013b).f16615d.getUserAttr().f7775d) {
                        c cVar = (c) j.q().k().a(c.class);
                        if (cVar != null) {
                            arrayList.add(Integer.valueOf(cVar.g()));
                        }
                    } else if (((e) this.f10013b).f16615d.getUserAttr().f7774c) {
                        arrayList.add(Integer.valueOf(z.c0m));
                    }
                }
                return arrayList;
            } else if (!a.a()) {
                return super.k();
            } else {
                ArrayList arrayList2 = new ArrayList();
                if (((e) this.f10013b).f16615d.getUserAttr().f7774c) {
                    arrayList2.add(Integer.valueOf(z.c0m));
                }
                return arrayList2;
            }
        }
    }

    public d(e eVar) {
        super(eVar);
    }
}
