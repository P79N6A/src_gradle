package com.ss.android.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.loginlog.a;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.r;
import java.util.List;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28334a;

    @Insert
    @TargetClass
    static String a(int i, String str, List list) throws Exception {
        String str2;
        String a2;
        String str3;
        a aVar;
        String str4;
        String str5;
        boolean z;
        String str6 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str6, list}, null, f28334a, true, 16091, new Class[]{Integer.TYPE, String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str6, list}, null, f28334a, true, 16091, new Class[]{Integer.TYPE, String.class, List.class}, String.class);
        }
        String executePost$___twin___ = NetworkUtils.executePost$___twin___(i, str, list);
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str6.contains("/user/mobile/login")) {
                    str2 = "login";
                } else if (str6.contains("/user/mobile/register")) {
                    str2 = "register";
                } else if (str6.contains("/mobile/send_code")) {
                    str2 = "send_code";
                }
                String str7 = str2;
                if (TextUtils.isEmpty(executePost$___twin___)) {
                    n.a("mobile_login_or_rigist_rate", 1, c.a().a("apiType", str7).a("errorDesc", "response==null").a("errorUrl", str6).b());
                    r.a((Context) k.a(), "mobile_login_or_rigist_rate", str7, PushConstants.PUSH_TYPE_NOTIFY, 0, c.a().a("apiType", str7).a("errorDesc", "response==null").a("isSuccess", "false").a("errorUrl", str6).b());
                    a a3 = a.a();
                    a2 = com.ss.android.ugc.aweme.login.a.a(list);
                    str3 = "api error";
                    aVar = a3;
                    str4 = "response==null";
                    str5 = str;
                    z = false;
                } else if (com.ss.android.ugc.aweme.app.api.a.a(new JSONObject(executePost$___twin___))) {
                    a.a().a("", str, true, str7, com.ss.android.ugc.aweme.login.a.a(list), "api success");
                    r.a((Context) k.a(), "mobile_login_or_rigist_rate", str7, PushConstants.PUSH_TYPE_NOTIFY, 0, c.a().a("isSuccess", "true").b());
                    n.a("mobile_login_or_rigist_rate", 0, c.a().a("apiType", str7).b());
                } else {
                    n.a("mobile_login_or_rigist_rate", 1, c.a().a("apiType", str7).a("errorDesc", executePost$___twin___).a("errorUrl", str6).b());
                    r.a((Context) k.a(), "mobile_login_or_rigist_rate", str7, PushConstants.PUSH_TYPE_NOTIFY, 0, c.a().a("apiType", str7).a("errorDesc", executePost$___twin___).a("isSuccess", "false").a("errorUrl", str6).b());
                    a a4 = a.a();
                    z = false;
                    a2 = com.ss.android.ugc.aweme.login.a.a(list);
                    str3 = "api error";
                    aVar = a4;
                    str4 = executePost$___twin___;
                    str5 = str;
                }
                aVar.a(str4, str5, z, str7, a2, str3);
            }
        } catch (Exception unused) {
        }
        return executePost$___twin___;
    }
}
