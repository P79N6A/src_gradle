package com.ss.android.ugc.aweme.account.f;

import android.text.TextUtils;
import com.bytedance.sdk.account.api.b;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.account.c;
import com.ss.android.common.util.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31845a;

    public static com.ss.android.ugc.aweme.account.f.b.a a(String str) throws Exception {
        if (PatchProxy.isSupport(new Object[]{str}, null, f31845a, true, 19971, new Class[]{String.class}, com.ss.android.ugc.aweme.account.f.b.a.class)) {
            return (com.ss.android.ugc.aweme.account.f.b.a) PatchProxy.accessDispatch(new Object[]{str}, null, f31845a, true, 19971, new Class[]{String.class}, com.ss.android.ugc.aweme.account.f.b.a.class);
        }
        i iVar = new i(b.a.f22239a + b.a.a() + "/aweme/v1/user/sync/key/");
        iVar.a("product", b(str));
        String str2 = "";
        try {
            str2 = c.a().c().a(Integer.MAX_VALUE, iVar.toString());
        } catch (Exception unused) {
        }
        return (com.ss.android.ugc.aweme.account.f.b.a) new Gson().fromJson(str2, com.ss.android.ugc.aweme.account.f.b.a.class);
    }

    public static int b(String str) {
        String str2 = str;
        char c2 = 0;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f31845a, true, 19975, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f31845a, true, 19975, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (TextUtils.isEmpty(str)) {
            return -1;
        } else {
            if (str.hashCode() != 1817585384 || !str2.equals("HOTSOON")) {
                c2 = 65535;
            }
            if (c2 != 0) {
                return -1;
            }
            return 1112;
        }
    }
}
