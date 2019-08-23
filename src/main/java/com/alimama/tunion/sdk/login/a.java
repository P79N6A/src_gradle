package com.alimama.tunion.sdk.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ali.auth.third.core.MemberSDK;
import com.ali.auth.third.core.callback.InitResultCallback;
import com.ali.auth.third.core.callback.LoginCallback;
import com.ali.auth.third.core.config.AuthOption;
import com.ali.auth.third.core.config.Environment;
import com.ali.auth.third.core.model.Session;
import com.ali.auth.third.login.LoginService;
import com.ali.auth.third.login.callback.LogoutCallback;
import com.ali.auth.third.ui.context.CallbackContext;
import com.alimama.tunion.sdk.b.b;
import com.alimama.tunion.trade.TUnionTradeSDK;
import com.alimama.tunion.trade.abtest.TUnionABTestService;
import com.alimama.tunion.trade.abtest.TUnionABTestValue;
import com.alimama.tunion.utils.TULog;
import java.net.URLEncoder;
import org.json.JSONArray;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f5172a;

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f5172a == null) {
                f5172a = new a();
            }
            aVar = f5172a;
        }
        return aVar;
    }

    public boolean b() {
        LoginService loginService = (LoginService) MemberSDK.getService(LoginService.class);
        if (loginService == null || loginService.getSession() == null || !loginService.checkSessionValid()) {
            return false;
        }
        return true;
    }

    public String c() {
        LoginService loginService = (LoginService) MemberSDK.getService(LoginService.class);
        if (b()) {
            return loginService.getSession().nick;
        }
        return null;
    }

    public String d() {
        LoginService loginService = (LoginService) MemberSDK.getService(LoginService.class);
        if (b()) {
            return loginService.getSession().avatarUrl;
        }
        return null;
    }

    public boolean b(String str) {
        LoginService loginService = (LoginService) MemberSDK.getService(LoginService.class);
        if (loginService != null) {
            return loginService.isLogoutUrl(str);
        }
        return false;
    }

    /* access modifiers changed from: private */
    public String c(String str) {
        String str2;
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String host = Uri.parse(str).getHost();
            String aBTestValue = TUnionTradeSDK.getInstance().getABTestService().getABTestValue("config");
            if (!TextUtils.isEmpty(aBTestValue)) {
                String optString = new JSONObject(aBTestValue).optString("domain");
                TULog.d("abTestRequestUrl, url: " + str + " host: " + host + " domains: " + optString, new Object[0]);
                if (!TextUtils.isEmpty(host) && !TextUtils.isEmpty(optString)) {
                    JSONArray jSONArray = new JSONArray(optString);
                    if (jSONArray.length() > 0) {
                        int length = jSONArray.length();
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (host.contains(jSONArray.getString(i))) {
                                String encode = URLEncoder.encode(str, "utf-8");
                                try {
                                    TULog.d("abTestRequestUrl, loginJumpUrl :" + str2, new Object[0]);
                                } catch (Exception unused) {
                                }
                                str3 = str2;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return str3;
    }

    public boolean a(String str) {
        LoginService loginService = (LoginService) MemberSDK.getService(LoginService.class);
        if (loginService != null) {
            return loginService.isLoginUrl(str);
        }
        return false;
    }

    public void a(Context context, final TUnionLoginCallback tUnionLoginCallback) {
        MemberSDK.setEnvironment(Environment.ONLINE);
        MemberSDK.init(context, new InitResultCallback() {
            public void onSuccess() {
                if (tUnionLoginCallback != null) {
                    tUnionLoginCallback.onSuccess();
                }
            }

            public void onFailure(int i, String str) {
                if (tUnionLoginCallback != null) {
                    tUnionLoginCallback.onFailure(i, str);
                }
            }
        });
    }

    public void a(Activity activity, final TUnionLoginCallback tUnionLoginCallback) {
        b.c.a();
        LoginService loginService = (LoginService) MemberSDK.getService(LoginService.class);
        if (loginService != null) {
            loginService.logout(activity, new LogoutCallback() {
                public void onSuccess() {
                    if (tUnionLoginCallback != null) {
                        tUnionLoginCallback.onSuccess();
                    }
                }

                public void onFailure(int i, String str) {
                    if (tUnionLoginCallback != null) {
                        tUnionLoginCallback.onFailure(i, str);
                    }
                }
            });
        }
    }

    public void a(Activity activity, final String str, final TUnionLoginAuthCallback tUnionLoginAuthCallback) {
        TUnionABTestService aBTestService = TUnionTradeSDK.getInstance().getABTestService();
        TUnionABTestValue tUnionABTestValue = TUnionABTestValue.INVALID;
        if (aBTestService != null) {
            tUnionABTestValue = aBTestService.isSsoLoginServiceOn();
            switch (tUnionABTestValue) {
                case INVALID:
                    MemberSDK.setAuthOption(AuthOption.NORMAL);
                    break;
                case NO:
                    MemberSDK.setAuthOption(AuthOption.H5ONLY);
                    break;
                case YES:
                    MemberSDK.setAuthOption(AuthOption.NORMAL);
                    break;
            }
        }
        b.C0036b.a(tUnionABTestValue);
        LoginService loginService = (LoginService) MemberSDK.getService(LoginService.class);
        if (loginService != null) {
            loginService.auth(activity, new LoginCallback() {
                public void onSuccess(Session session) {
                    String str = "";
                    if (session != null) {
                        str = session.nick;
                    }
                    b.C0036b.a(str);
                    if (tUnionLoginAuthCallback != null) {
                        tUnionLoginAuthCallback.onSuccess(a.this.c(str));
                    }
                }

                public void onFailure(int i, String str) {
                    if (i == 10004) {
                        b.C0036b.a();
                    } else {
                        b.C0036b.b(str);
                    }
                    if (tUnionLoginAuthCallback != null) {
                        tUnionLoginAuthCallback.onFailure(i, str);
                    }
                }
            });
        }
    }

    public boolean a(int i, int i2, Intent intent) {
        return CallbackContext.onActivityResult(i, i2, intent);
    }
}
