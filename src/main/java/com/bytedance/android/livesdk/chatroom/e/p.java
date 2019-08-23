package com.bytedance.android.livesdk.chatroom.e;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.message.model.as;
import com.bytedance.android.livesdk.n.c;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public final class p extends b<as> {
    public static ChangeQuickRedirect j;

    public final User e() {
        return ((as) this.f10013b).f16486c;
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5402, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, j, false, 5402, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (1 == ((as) this.f10013b).a() || 2 == ((as) this.f10013b).a()) {
            return true;
        } else {
            return false;
        }
    }

    public final List<Integer> k() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5403, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, j, false, 5403, new Class[0], List.class);
        } else if (this.f10013b == null || ((int) ((as) this.f10013b).a()) != 1) {
            return null;
        } else {
            if (a.d()) {
                return super.k();
            }
            if (!a.f()) {
                return super.k();
            }
            ArrayList arrayList = new ArrayList();
            if (!(((as) this.f10013b).f16486c == null || ((as) this.f10013b).f16486c.getUserAttr() == null)) {
                if (((as) this.f10013b).f16486c.getUserAttr().f7775d) {
                    c cVar = (c) j.q().k().a(c.class);
                    if (cVar != null) {
                        arrayList.add(Integer.valueOf(cVar.g()));
                    }
                } else if (((as) this.f10013b).f16486c.getUserAttr().f7774c) {
                    arrayList.add(Integer.valueOf(z.c0m));
                }
            }
            return arrayList;
        }
    }

    public final Spannable m() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5401, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5401, new Class[0], Spannable.class);
        }
        switch ((int) ((as) this.f10013b).a()) {
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
                return x.a(((as) this.f10013b).d(), (int) C0906R.color.a98);
            case 5:
            case 6:
                return x.a(((as) this.f10013b).d(), (int) C0906R.color.a98);
            case 8:
                String str = "Top" + ((as) this.f10013b).b();
                String d2 = ((as) this.f10013b).d();
                if (com.bytedance.android.live.uikit.d.c.a(ac.e())) {
                    str = ((as) this.f10013b).b() + "Top";
                    d2 = new StringBuffer(d2).reverse().toString();
                }
                String[] split = d2.split(str);
                if (split[0].length() == ((as) this.f10013b).d().length()) {
                    return x.f10027b;
                }
                SpannableString spannableString = new SpannableString(((as) this.f10013b).d());
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(x.a((int) C0906R.color.a98));
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(x.a((int) C0906R.color.a98));
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(x.a((int) C0906R.color.a98));
                spannableString.setSpan(foregroundColorSpan, 0, split[0].length(), 18);
                spannableString.setSpan(foregroundColorSpan2, split[0].length(), split[0].length() + str.length(), 18);
                spannableString.setSpan(foregroundColorSpan3, split[0].length() + str.length(), ((as) this.f10013b).d().length(), 18);
                return spannableString;
            default:
                return x.a(((as) this.f10013b).f16486c, "  ", ((as) this.f10013b).d(), C0906R.color.a98, C0906R.color.si, false);
        }
    }

    public final Spannable l() {
        int i;
        int i2;
        ForegroundColorSpan foregroundColorSpan;
        ForegroundColorSpan foregroundColorSpan2;
        ForegroundColorSpan foregroundColorSpan3;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 5400, new Class[0], Spannable.class)) {
            return (Spannable) PatchProxy.accessDispatch(new Object[0], this, j, false, 5400, new Class[0], Spannable.class);
        }
        switch ((int) ((as) this.f10013b).a()) {
            case 1:
                if (o()) {
                    i = C0906R.color.ag6;
                } else {
                    j.q().l();
                    i = C0906R.color.ae6;
                }
                if (o()) {
                    i2 = C0906R.color.a8e;
                } else {
                    i2 = C0906R.color.a8d;
                }
                return x.a(((as) this.f10013b).f16486c, "  ", ((as) this.f10013b).d(), i, i2, false);
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
                if (!o() || ((as) this.f10013b).d() == null || e() == null || com.bytedance.android.livesdk.message.c.a(e()) == null) {
                    String d2 = ((as) this.f10013b).d();
                    j.q().l();
                    return x.a(d2, (int) C0906R.color.ag1);
                }
                SpannableString spannableString = new SpannableString(((as) this.f10013b).d());
                ForegroundColorSpan foregroundColorSpan4 = new ForegroundColorSpan(x.a((int) C0906R.color.ag6));
                ForegroundColorSpan foregroundColorSpan5 = new ForegroundColorSpan(x.a((int) C0906R.color.aex));
                spannableString.setSpan(foregroundColorSpan4, 0, com.bytedance.android.livesdk.message.c.a(e()).length(), 18);
                spannableString.setSpan(foregroundColorSpan5, com.bytedance.android.livesdk.message.c.a(e()).length(), ((as) this.f10013b).d().length(), 18);
                return spannableString;
            case 8:
                String str = "Top" + ((as) this.f10013b).b();
                String d3 = ((as) this.f10013b).d();
                if (com.bytedance.android.live.uikit.d.c.a(ac.e())) {
                    str = ((as) this.f10013b).b() + "Top";
                    d3 = new StringBuffer(d3).reverse().toString();
                }
                String[] split = d3.split(str);
                if (split[0].length() == ((as) this.f10013b).d().length()) {
                    return x.f10027b;
                }
                SpannableString spannableString2 = new SpannableString(((as) this.f10013b).d());
                j.q().l();
                int a2 = x.a((int) C0906R.color.ag1);
                if (o()) {
                    foregroundColorSpan3 = new ForegroundColorSpan(x.a((int) C0906R.color.ag6));
                    foregroundColorSpan2 = new ForegroundColorSpan(x.a((int) C0906R.color.aex));
                    foregroundColorSpan = new ForegroundColorSpan(x.a((int) C0906R.color.aex));
                } else {
                    ForegroundColorSpan foregroundColorSpan6 = new ForegroundColorSpan(a2);
                    foregroundColorSpan2 = new ForegroundColorSpan(a2);
                    foregroundColorSpan = new ForegroundColorSpan(a2);
                    foregroundColorSpan3 = foregroundColorSpan6;
                }
                spannableString2.setSpan(foregroundColorSpan2, 0, split[0].length(), 18);
                spannableString2.setSpan(foregroundColorSpan3, split[0].length(), split[0].length() + str.length(), 18);
                spannableString2.setSpan(foregroundColorSpan, split[0].length() + str.length(), ((as) this.f10013b).d().length(), 18);
                return spannableString2;
            default:
                User user = ((as) this.f10013b).f16486c;
                String d4 = ((as) this.f10013b).d();
                j.q().l();
                j.q().l();
                return x.a(user, "  ", d4, C0906R.color.ae6, C0906R.color.aea, false);
        }
    }

    public p(as asVar) {
        super(asVar);
    }
}
