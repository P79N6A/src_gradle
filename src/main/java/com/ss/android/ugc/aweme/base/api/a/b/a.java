package com.ss.android.ugc.aweme.base.api.a.b;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.core.b;
import com.ss.android.ugc.aweme.utils.cj;
import org.json.JSONObject;

public class a extends com.ss.android.ugc.aweme.base.api.a.a {
    public static String LOG_OUT = (b.f3311b + "/2/user/logout/");

    /* renamed from: a  reason: collision with root package name */
    private static Gson f34526a;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int blockCode;
    protected String mErrorMsg;
    protected String mPrompt;
    private Object mResponse;
    protected String mUrl;

    public int getBlockCode() {
        return this.blockCode;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public String getPrompt() {
        return this.mPrompt;
    }

    public Object getRawResponse() {
        return this.mResponse;
    }

    public String getResponse() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24141, new Class[0], String.class)) {
            return convertResponseToString();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24141, new Class[0], String.class);
    }

    public void addMonitor$___twin___() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24145, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24145, new Class[0], Void.TYPE);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(PushConstants.WEB_URL, this.mUrl);
            jSONObject.put("errorCode", getErrorCode());
            jSONObject.put("prompt", this.mPrompt);
            jSONObject.put("errorDesc", this.mErrorMsg);
            n.b("api_error_web_return_log", "", jSONObject);
        } catch (Exception unused) {
        }
    }

    public String convertResponseToString() {
        Gson gson;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24142, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24142, new Class[0], String.class);
        } else if (this.mResponse instanceof String) {
            return (String) this.mResponse;
        } else {
            if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 24139, new Class[0], Gson.class)) {
                gson = (Gson) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 24139, new Class[0], Gson.class);
            } else {
                if (f34526a == null) {
                    f34526a = new Gson();
                }
                gson = f34526a;
            }
            this.mResponse = gson.toJson(this.mResponse);
            return (String) this.mResponse;
        }
    }

    public a(int i) {
        super(i);
    }

    public void setBlockCode(int i) {
        this.blockCode = i;
    }

    public a setErrorMsg(String str) {
        this.mErrorMsg = str;
        return this;
    }

    public a setPrompt(String str) {
        this.mPrompt = str;
        return this;
    }

    public a setResponse(Object obj) {
        this.mResponse = obj;
        return this;
    }

    public a setResponse(String str) {
        this.mResponse = str;
        return this;
    }

    public a setUrl(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 24140, new Class[]{String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 24140, new Class[]{String.class}, a.class);
        }
        this.mUrl = str;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24144, new Class[0], Void.TYPE);
        }
        int errorCode = getErrorCode();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(errorCode)}, this, changeQuickRedirect, false, 24143, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(errorCode)}, this, changeQuickRedirect, false, 24143, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            cj.a(this.mUrl, this);
        }
        return this;
    }
}
