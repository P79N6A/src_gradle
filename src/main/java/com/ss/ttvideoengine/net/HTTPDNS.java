package com.ss.ttvideoengine.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttvideoengine.net.TTVNetClient;
import com.ss.ttvideoengine.utils.Error;
import org.json.JSONArray;
import org.json.JSONObject;

public class HTTPDNS extends BaseDNS {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static String mAccountID = "131950";
    private static String mServerIP = "203.107.1.4";

    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91560, new Class[0], Void.TYPE);
        } else if (!this.mCancelled) {
            this.mCancelled = true;
            this.mNetClient.cancel();
        }
    }

    public void start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91559, new Class[0], Void.TYPE);
            return;
        }
        this.mNetClient.startTask(_getURL(), new TTVNetClient.CompletionListener() {
            public static ChangeQuickRedirect changeQuickRedirect;

            public void onCompletion(JSONObject jSONObject, Error error) {
                JSONObject jSONObject2 = jSONObject;
                Error error2 = error;
                if (PatchProxy.isSupport(new Object[]{jSONObject2, error2}, this, changeQuickRedirect, false, 91563, new Class[]{JSONObject.class, Error.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{jSONObject2, error2}, this, changeQuickRedirect, false, 91563, new Class[]{JSONObject.class, Error.class}, Void.TYPE);
                    return;
                }
                HTTPDNS.this._handleResponse(jSONObject2, error2);
            }
        });
    }

    private String _getURL() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91561, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91561, new Class[0], String.class);
        }
        return "https://" + mServerIP + "/" + mAccountID + "/d?host=" + this.mHostname;
    }

    public HTTPDNS(String str, TTVNetClient tTVNetClient) {
        super(str, tTVNetClient);
    }

    public void _handleResponse(JSONObject jSONObject, Error error) {
        Error error2;
        String str;
        if (PatchProxy.isSupport(new Object[]{jSONObject, error}, this, changeQuickRedirect, false, 91562, new Class[]{JSONObject.class, Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, error}, this, changeQuickRedirect, false, 91562, new Class[]{JSONObject.class, Error.class}, Void.TYPE);
            return;
        }
        if (error != null) {
            error.domain = "kTTVideoErrorDomainHTTPDNS";
            error2 = error;
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("ips");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                error2 = new Error("kTTVideoErrorDomainHTTPDNS", -9997);
            } else {
                try {
                    str = optJSONArray.getString(0);
                } catch (Exception unused) {
                    str = null;
                }
                if (str == null) {
                    error2 = new Error("kTTVideoErrorDomainHTTPDNS", -9997);
                } else {
                    notifySuccess(str);
                    return;
                }
            }
        }
        notifyError(error2);
    }
}
