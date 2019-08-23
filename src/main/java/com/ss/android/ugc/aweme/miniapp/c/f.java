package com.ss.android.ugc.aweme.miniapp.c;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.application.l;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp_api.a.d;
import com.ss.android.ugc.aweme.net.a.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

public final class f implements ISyncHostDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55622a;

    public final String getType() {
        return "getUserInfo";
    }

    public final CrossProcessDataEntity action(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity}, this, f55622a, false, 59352, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class)) {
            return (CrossProcessDataEntity) PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity}, this, f55622a, false, 59352, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class);
        }
        IAccountUserService userService = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService();
        if (userService == null) {
            return null;
        }
        User curUser = userService.getCurUser();
        String avatarUrl = userService.getAvatarUrl();
        if (curUser != null) {
            str = curUser.getNickname();
        } else {
            str = "";
        }
        if (curUser != null) {
            str2 = String.valueOf(curUser.getGender());
        } else {
            str2 = "";
        }
        boolean isLogin = userService.isLogin();
        if (curUser != null) {
            str3 = curUser.getUid();
        } else {
            str3 = "";
        }
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        String a2 = l.a();
        if (TextUtils.isEmpty(a2)) {
            String str4 = "";
            if (j.a() != null) {
                str4 = CookieManager.getInstance().getCookie(j.a().l);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cookies", str4);
            d dVar = q.a().k;
            if (dVar != null) {
                dVar.a("mini_app_session", new JSONObject(hashMap));
            }
        }
        return CrossProcessDataEntity.Builder.create().put("avatarUrl", avatarUrl).put("nickName", str).put("gender", str2).put("language", language).put("country", country).put("isLogin", Boolean.valueOf(isLogin)).put("userId", str3).put("sessionId", a2).build();
    }
}
