package com.tt.option.ext;

import com.tt.frontendapiinterface.IBaseRender;
import com.tt.miniapphost.AppbrandApplication;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import org.json.JSONException;
import org.json.JSONObject;

@MiniAppProcess
public abstract class WebBaseEventHandler implements WebEventCallback {
    protected String mArgs;
    protected int mCallBackId;
    protected IBaseRender mIBaseRender;

    @MiniAppProcess
    public abstract String act();

    @MiniAppProcess
    public boolean canOverride() {
        return true;
    }

    @MiniAppProcess
    public abstract String getApiName();

    @MiniAppProcess
    public void invokeHandler(String str) {
        AppbrandApplication.getInst().invokeHandler(this.mIBaseRender.getWebViewId(), this.mCallBackId, str);
    }

    @MiniAppProcess
    public JSONObject buildErrorMsg(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errMsg", buildErrorMsg(getApiName(), str));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    @MiniAppProcess
    public String buildErrorMsg(String str, String str2) {
        return str + ":" + str2;
    }

    @MiniAppProcess
    public WebBaseEventHandler(IBaseRender iBaseRender, String str, int i) {
        this.mArgs = str;
        this.mCallBackId = i;
        this.mIBaseRender = iBaseRender;
    }
}
