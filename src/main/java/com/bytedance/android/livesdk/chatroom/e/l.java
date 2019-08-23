package com.bytedance.android.livesdk.chatroom.e;

import android.graphics.Bitmap;
import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.message.model.ab;
import com.bytedance.android.livesdk.n.c;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class l extends b<ab> {
    public static ChangeQuickRedirect j;

    public final boolean f() {
        return true;
    }

    public final User e() {
        return ((ab) this.f10013b).f16430b;
    }

    public final List<Integer> k() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5393, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, j, false, 5393, new Class[0], List.class);
        } else if (a.d()) {
            return super.k();
        } else {
            if (!a.f()) {
                return super.k();
            }
            ArrayList arrayList = new ArrayList();
            if (!(((ab) this.f10013b).f16430b == null || ((ab) this.f10013b).f16430b.getUserAttr() == null)) {
                if (((ab) this.f10013b).f16430b.getUserAttr().f7775d) {
                    c cVar = (c) j.q().k().a(c.class);
                    if (cVar != null) {
                        arrayList.add(Integer.valueOf(cVar.g()));
                    }
                } else if (((ab) this.f10013b).f16430b.getUserAttr().f7774c) {
                    arrayList.add(Integer.valueOf(z.c0m));
                }
            }
            return arrayList;
        }
    }

    public final Spannable l() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5391, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5391, new Class[0], Spannable.class);
        }
        Bitmap giftIconBitmap = ((IGiftService) b.a(IGiftService.class)).getGiftIconBitmap(((ab) this.f10013b).f16432d);
        String str = null;
        try {
            String a2 = com.bytedance.android.livesdk.message.c.a(((ab) this.f10013b).f16430b);
            String str2 = ((ab) this.f10013b).baseMessage.f18779f;
            if (str2.startsWith(a2 + ":")) {
                str = str2.substring(a2.length() + 1);
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = ((ab) this.f10013b).baseMessage.f18779f;
        }
        if (giftIconBitmap != null) {
            str = str + "  ";
        }
        String str3 = str;
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
        return x.a(x.b(((ab) this.f10013b).f16430b, "：", str3, i, i2, false), giftIconBitmap);
    }

    public final Spannable m() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5392, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5392, new Class[0], Spannable.class);
        }
        Bitmap giftIconBitmap = ((IGiftService) b.a(IGiftService.class)).getGiftIconBitmap(((ab) this.f10013b).f16432d);
        String str = null;
        try {
            String a2 = com.bytedance.android.livesdk.message.c.a(((ab) this.f10013b).f16430b);
            String str2 = ((ab) this.f10013b).baseMessage.f18779f;
            if (str2.startsWith(a2 + ":")) {
                str = str2.substring(a2.length() + 1);
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = ((ab) this.f10013b).baseMessage.f18779f;
        }
        if (giftIconBitmap != null) {
            str = str + "  ";
        }
        return x.a(x.b(((ab) this.f10013b).f16430b, "：", str, C0906R.color.a98, C0906R.color.a9l, false), giftIconBitmap);
    }

    public l(ab abVar) {
        super(abVar);
    }
}
