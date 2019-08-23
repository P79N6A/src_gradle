package com.ss.android.pushmanager;

import android.content.res.Resources;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.a;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30518a;

    public String a() {
        return a.f30469b;
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f30518a, false, 18928, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f30518a, false, 18928, new Class[0], String.class);
        }
        String str = "";
        try {
            str = ((TelephonyManager) a.a().getSystemService("phone")).getSimCountryIso();
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = Resources.getSystem().getConfiguration().locale.getCountry();
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase();
        }
        return "";
    }
}
