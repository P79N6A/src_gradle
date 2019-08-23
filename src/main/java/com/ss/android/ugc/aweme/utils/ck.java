package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.net.ah;
import java.util.ArrayList;
import java.util.List;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;
import org.json.JSONObject;

public final class ck {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75689a;

    @Insert
    @TargetClass
    static void a(int i, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4}, null, f75689a, true, 88380, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3, str4}, null, f75689a, true, 88380, new Class[]{Integer.TYPE, String.class, String.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str) || (!str3.contains("check/in") && !str3.contains("story") && !str3.contains("rec/new") && !str3.contains("follow/feed"))) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (i == 8 && iUserService.isLogin()) {
                try {
                    iUserService.logout();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("errorDesc", "api return errorcode==8");
                    jSONObject.put("errorUrl", str3);
                    jSONObject.put("errorCookies", CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost()));
                    jSONObject.put("errorResponse", str4);
                    n.b("aweme_user_logout", "", jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Insert
    @TargetClass
    static void a(String str, a aVar) {
        String str2 = str;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2}, null, f75689a, true, 88381, new Class[]{String.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar2}, null, f75689a, true, 88381, new Class[]{String.class, a.class}, Void.TYPE);
            return;
        }
        if (aVar.getErrorCode() == 8) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService.isLogin()) {
                List a2 = ah.a().a(str2);
                if (a2 == null) {
                    a2 = new ArrayList();
                }
                com.ss.android.account.token.a.a(str2, a2, true, new j(iUserService, str2, aVar2));
            }
        }
    }
}
