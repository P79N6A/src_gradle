package com.bytedance.android.livesdk.chatroom.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.message.model.p;
import com.bytedance.android.livesdk.n.c;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.utils.n;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class h extends b<p> {
    public static ChangeQuickRedirect j;

    public final boolean f() {
        return true;
    }

    public final User e() {
        return ((p) this.f10013b).f16668e;
    }

    public final List<Integer> k() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5383, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, j, false, 5383, new Class[0], List.class);
        } else if (a.d()) {
            return super.k();
        } else {
            if (!a.f()) {
                return super.k();
            }
            ArrayList arrayList = new ArrayList();
            if (!(((p) this.f10013b).f16668e == null || ((p) this.f10013b).f16668e.getUserAttr() == null)) {
                if (((p) this.f10013b).f16668e.getUserAttr().f7775d) {
                    c cVar = (c) j.q().k().a(c.class);
                    if (cVar != null) {
                        arrayList.add(Integer.valueOf(cVar.g()));
                    }
                } else if (((p) this.f10013b).f16668e.getUserAttr().f7774c) {
                    arrayList.add(Integer.valueOf(z.c0m));
                }
            }
            return arrayList;
        }
    }

    public final Spannable l() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5381, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5381, new Class[0], Spannable.class);
        }
        Bitmap a2 = com.bytedance.android.livesdk.widget.h.a(ac.e(), ((p) this.f10013b).f16669f);
        String a3 = ((p) this.f10013b).a();
        if (a2 != null) {
            a3 = a3 + "  ";
        }
        String str = a3;
        if (o()) {
            i = C0906R.color.ag6;
        } else {
            j.q().l();
            i = C0906R.color.ae6;
        }
        if (o()) {
            i2 = C0906R.color.a8e;
        } else {
            i2 = C0906R.color.aea;
        }
        return x.a(x.b(((p) this.f10013b).f16668e, " ", str, i, i2, false), a2);
    }

    public final Spannable m() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5382, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5382, new Class[0], Spannable.class);
        }
        Context e2 = ac.e();
        int dimensionPixelSize = e2.getResources().getDimensionPixelSize(C0906R.dimen.p2);
        int dimensionPixelSize2 = e2.getResources().getDimensionPixelSize(C0906R.dimen.p1);
        int i2 = ((p) this.f10013b).f16667d;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, ak.f17581a, true, 13750, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, ak.f17581a, true, 13750, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            i = Color.parseColor(n.a("#%06X", Integer.valueOf(i2 & 16777215)));
        }
        Bitmap a2 = com.bytedance.android.livesdk.widget.h.a(e2, i, dimensionPixelSize, dimensionPixelSize2);
        String a3 = ((p) this.f10013b).a();
        if (a2 != null) {
            a3 = a3 + "  ";
        }
        return x.a(x.b(((p) this.f10013b).f16668e, "：", a3, C0906R.color.a98, C0906R.color.si, false), a2);
    }

    public h(p pVar) {
        super(pVar);
    }
}
