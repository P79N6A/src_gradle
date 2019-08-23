package com.bytedance.android.livesdk.chatroom.e;

import android.graphics.Bitmap;
import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.message.model.aa;
import com.bytedance.android.livesdk.n.c;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class k extends b<aa> {
    public static ChangeQuickRedirect j;

    public final boolean f() {
        return true;
    }

    public final User e() {
        return ((aa) this.f10013b).f16425a;
    }

    public final Spannable m() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5389, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5389, new Class[0], Spannable.class);
        }
        Bitmap giftIconBitmap = ((IGiftService) b.a(IGiftService.class)).getGiftIconBitmap(((aa) this.f10013b).f16426b);
        String str = ((aa) this.f10013b).f16427c;
        if (giftIconBitmap != null) {
            str = str + "  ";
        }
        return x.a(x.b(((aa) this.f10013b).f16425a, "：", str, C0906R.color.a98, C0906R.color.si, false), giftIconBitmap);
    }

    public final List<Integer> k() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5390, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, j, false, 5390, new Class[0], List.class);
        } else if (a.d()) {
            return super.k();
        } else {
            if (!a.f()) {
                return super.k();
            }
            ArrayList arrayList = new ArrayList();
            if (!(((aa) this.f10013b).f16425a == null || ((aa) this.f10013b).f16425a.getUserAttr() == null)) {
                if (((aa) this.f10013b).f16425a.getUserAttr().f7775d) {
                    c cVar = (c) j.q().k().a(c.class);
                    if (cVar != null) {
                        arrayList.add(Integer.valueOf(cVar.g()));
                    }
                } else if (((aa) this.f10013b).f16425a.getUserAttr().f7774c) {
                    arrayList.add(Integer.valueOf(z.c0m));
                }
            }
            return arrayList;
        }
    }

    public final Spannable l() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5388, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5388, new Class[0], Spannable.class);
        }
        Bitmap giftIconBitmap = ((IGiftService) b.a(IGiftService.class)).getGiftIconBitmap(((aa) this.f10013b).f16426b);
        String str = ((aa) this.f10013b).f16427c;
        if (giftIconBitmap != null) {
            str = str + "  ";
        }
        String str2 = str;
        if (o()) {
            i = C0906R.color.ag6;
        } else {
            j.q().l();
            i = C0906R.color.ae6;
        }
        if (o()) {
            i2 = C0906R.color.acv;
        } else {
            j.q().l();
            i2 = C0906R.color.ae9;
        }
        return x.a(x.b(((aa) this.f10013b).f16425a, "：", str2, i, i2, false), giftIconBitmap);
    }

    public k(aa aaVar) {
        super(aaVar);
    }
}
