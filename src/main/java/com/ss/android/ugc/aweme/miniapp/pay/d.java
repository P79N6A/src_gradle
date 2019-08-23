package com.ss.android.ugc.aweme.miniapp.pay;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55893a;

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f55893a, true, 59504, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f55893a, true, 59504, new Class[]{String.class}, String.class);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errMsg", "requestPayment:" + str2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
