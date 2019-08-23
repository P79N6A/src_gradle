package com.ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.b.b;
import com.ss.android.sdk.c.a.a;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.utils.p;
import org.json.JSONException;
import org.json.JSONObject;

public class MainServiceForJsb implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getPlayNameMobile() {
        return "mobile";
    }

    public String getSSLocalScheme() {
        return e.f34152b;
    }

    public String getJSSDKConfigUrl() {
        return com.ss.android.newmedia.a.E;
    }

    public long getUserId() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71414, new Class[0], Long.TYPE)) {
            return Long.parseLong(d.a().getCurUserId());
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71414, new Class[0], Long.TYPE)).longValue();
    }

    public boolean hasPlatformBinded() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71415, new Class[0], Boolean.TYPE)) {
            return b.a().b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71415, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean isLogin() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71413, new Class[0], Boolean.TYPE)) {
            return d.a().isLogin();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71413, new Class[0], Boolean.TYPE)).booleanValue();
    }

    @Deprecated
    public boolean isBrowserActivity(Context context) {
        return context instanceof CrossPlatformActivity;
    }

    public boolean isApiSuccess(JSONObject jSONObject) throws JSONException {
        if (!PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 71412, new Class[]{JSONObject.class}, Boolean.TYPE)) {
            return com.ss.android.newmedia.thread.a.a(jSONObject);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 71412, new Class[]{JSONObject.class}, Boolean.TYPE)).booleanValue();
    }

    public boolean isPlatformBinded(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71416, new Class[]{String.class}, Boolean.TYPE)) {
            return b.a().a(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71416, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public void startAdsAppActivity(Activity activity, String str) {
        if (PatchProxy.isSupport(new Object[]{activity, str}, this, changeQuickRedirect, false, 71411, new Class[]{Activity.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, str}, this, changeQuickRedirect, false, 71411, new Class[]{Activity.class, String.class}, Void.TYPE);
            return;
        }
        p.a((Context) activity, str);
    }
}
