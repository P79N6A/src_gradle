package com.ss.android.ugc.aweme.im.sdk.module.session.a.a;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.d.e;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.d;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.f;
import com.ss.android.ugc.aweme.im.sdk.utils.at;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.session.a;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51898a;

    /* renamed from: b  reason: collision with root package name */
    private a f51899b;

    public final String c() {
        if (!PatchProxy.isSupport(new Object[0], this, f51898a, false, 52497, new Class[0], String.class)) {
            return at.a(GlobalContext.getContext(), this.f51899b.l);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f51898a, false, 52497, new Class[0], String.class);
    }

    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f51898a, false, 52494, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51898a, false, 52494, new Class[0], String.class);
        }
        String str = null;
        int b2 = this.f51899b.b();
        if (b2 == 0) {
            IMUser b3 = e.a().b(String.valueOf(com.bytedance.im.core.d.e.a(((com.ss.android.ugc.aweme.im.sdk.module.session.a.a) this.f51899b).O_())));
            if (b3 != null) {
                str = b3.getDisplayName();
            }
        } else if (b2 == 2) {
            return GlobalContext.getContext().getString(C0906R.string.ay0);
        } else {
            str = this.f51899b.j;
        }
        return str;
    }

    public final String b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f51898a, false, 52495, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51898a, false, 52495, new Class[0], String.class);
        } else if (this.f51899b.b() != 2) {
            return this.f51899b.k;
        } else {
            f fVar = (f) this.f51899b;
            StringBuilder sb = new StringBuilder();
            String str2 = fVar.j;
            if (PatchProxy.isSupport(new Object[]{str2}, null, f51898a, true, 52496, new Class[]{String.class}, String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f51898a, true, 52496, new Class[]{String.class}, String.class);
            } else {
                if (!TextUtils.isEmpty(str2) && str2.length() > 6) {
                    String substring = str2.substring(0, 6);
                    str2 = substring + "...";
                }
                str = str2;
            }
            sb.append(str);
            sb.append("：");
            sb.append(fVar.k);
            return sb.toString();
        }
    }

    public final Drawable d() {
        if (PatchProxy.isSupport(new Object[0], this, f51898a, false, 52498, new Class[0], Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[0], this, f51898a, false, 52498, new Class[0], Drawable.class);
        }
        int b2 = this.f51899b.b();
        Drawable drawable = null;
        if (b2 == 0 || b2 == 20) {
            switch (((d) this.f51899b).f51917c) {
                case FAILED:
                    drawable = com.ss.android.ugc.bytex.a.a.a.a(GlobalContext.getContext().getResources(), 2130839805);
                    break;
                case SENDING:
                    drawable = com.ss.android.ugc.bytex.a.a.a.a(GlobalContext.getContext().getResources(), 2130839806);
                    break;
            }
            return drawable;
        } else if (this.f51899b.n == 1) {
            return com.ss.android.ugc.bytex.a.a.a.a(GlobalContext.getContext().getResources(), 2130839636);
        } else {
            return null;
        }
    }

    public b(a aVar) {
        this.f51899b = aVar;
    }
}
