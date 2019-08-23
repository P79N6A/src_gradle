package com.sina.weibo.sdk.component;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.utils.MD5;
import com.sina.weibo.sdk.utils.Utility;
import com.ss.android.ugc.aweme.web.jsbridge.q;

public class WidgetRequestParam extends BrowserRequestParamBase {
    private String mAppKey;
    private String mAppPackage;
    private String mAttentionFuid;
    private WeiboAuthListener mAuthListener;
    private String mAuthListenerKey;
    private String mCommentCategory;
    private String mCommentContent;
    private String mCommentTopic;
    private String mHashKey;
    private String mToken;
    private WidgetRequestCallback mWidgetRequestCallback;
    private String mWidgetRequestCallbackKey;

    public interface WidgetRequestCallback {
        void onWebViewResult(String str);
    }

    public String getAppKey() {
        return this.mAppKey;
    }

    public String getAttentionFuid() {
        return this.mAttentionFuid;
    }

    public WeiboAuthListener getAuthListener() {
        return this.mAuthListener;
    }

    public String getAuthListenerKey() {
        return this.mAuthListenerKey;
    }

    public String getCommentCategory() {
        return this.mCommentCategory;
    }

    public String getCommentContent() {
        return this.mCommentContent;
    }

    public String getCommentTopic() {
        return this.mCommentTopic;
    }

    public String getToken() {
        return this.mToken;
    }

    public WidgetRequestCallback getWidgetRequestCallback() {
        return this.mWidgetRequestCallback;
    }

    public String getWidgetRequestCallbackKey() {
        return this.mWidgetRequestCallbackKey;
    }

    public void setAppKey(String str) {
        this.mAppKey = str;
    }

    public void setAttentionFuid(String str) {
        this.mAttentionFuid = str;
    }

    public void setAuthListener(WeiboAuthListener weiboAuthListener) {
        this.mAuthListener = weiboAuthListener;
    }

    public void setCommentCategory(String str) {
        this.mCommentCategory = str;
    }

    public void setCommentContent(String str) {
        this.mCommentContent = str;
    }

    public void setCommentTopic(String str) {
        this.mCommentTopic = str;
    }

    public void setToken(String str) {
        this.mToken = str;
    }

    public void setWidgetRequestCallback(WidgetRequestCallback widgetRequestCallback) {
        this.mWidgetRequestCallback = widgetRequestCallback;
    }

    public WidgetRequestParam(Context context) {
        super(context);
        this.mLaucher = BrowserLauncher.WIDGET;
    }

    private String buildUrl(String str) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("version", "0030105000");
        if (!TextUtils.isEmpty(this.mAppKey)) {
            buildUpon.appendQueryParameter("source", this.mAppKey);
        }
        if (!TextUtils.isEmpty(this.mToken)) {
            buildUpon.appendQueryParameter("access_token", this.mToken);
        }
        String aid = Utility.getAid(this.mContext, this.mAppKey);
        if (!TextUtils.isEmpty(aid)) {
            buildUpon.appendQueryParameter("aid", aid);
        }
        if (!TextUtils.isEmpty(this.mAppPackage)) {
            buildUpon.appendQueryParameter("packagename", this.mAppPackage);
        }
        if (!TextUtils.isEmpty(this.mHashKey)) {
            buildUpon.appendQueryParameter("key_hash", this.mHashKey);
        }
        if (!TextUtils.isEmpty(this.mAttentionFuid)) {
            buildUpon.appendQueryParameter("fuid", this.mAttentionFuid);
        }
        if (!TextUtils.isEmpty(this.mCommentTopic)) {
            buildUpon.appendQueryParameter(q.f76814b, this.mCommentTopic);
        }
        if (!TextUtils.isEmpty(this.mCommentContent)) {
            buildUpon.appendQueryParameter(PushConstants.CONTENT, this.mCommentContent);
        }
        if (!TextUtils.isEmpty(this.mCommentCategory)) {
            buildUpon.appendQueryParameter("category", this.mCommentCategory);
        }
        return buildUpon.build().toString();
    }

    public void onCreateRequestParamBundle(Bundle bundle) {
        this.mAppPackage = this.mContext.getPackageName();
        if (!TextUtils.isEmpty(this.mAppPackage)) {
            this.mHashKey = MD5.hexdigest(Utility.getSign(this.mContext, this.mAppPackage));
        }
        bundle.putString("access_token", this.mToken);
        bundle.putString("source", this.mAppKey);
        bundle.putString("packagename", this.mAppPackage);
        bundle.putString("key_hash", this.mHashKey);
        bundle.putString("fuid", this.mAttentionFuid);
        bundle.putString(q.f76814b, this.mCommentTopic);
        bundle.putString(PushConstants.CONTENT, this.mCommentContent);
        bundle.putString("category", this.mCommentCategory);
        WeiboCallbackManager instance = WeiboCallbackManager.getInstance(this.mContext);
        if (this.mAuthListener != null) {
            this.mAuthListenerKey = instance.genCallbackKey();
            instance.setWeiboAuthListener(this.mAuthListenerKey, this.mAuthListener);
            bundle.putString("key_listener", this.mAuthListenerKey);
        }
        if (this.mWidgetRequestCallback != null) {
            this.mWidgetRequestCallbackKey = instance.genCallbackKey();
            instance.setWidgetRequestCallback(this.mWidgetRequestCallbackKey, this.mWidgetRequestCallback);
            bundle.putString("key_widget_callback", this.mWidgetRequestCallbackKey);
        }
    }

    /* access modifiers changed from: protected */
    public void onSetupRequestParam(Bundle bundle) {
        this.mAppKey = bundle.getString("source");
        this.mAppPackage = bundle.getString("packagename");
        this.mHashKey = bundle.getString("key_hash");
        this.mToken = bundle.getString("access_token");
        this.mAttentionFuid = bundle.getString("fuid");
        this.mCommentTopic = bundle.getString(q.f76814b);
        this.mCommentContent = bundle.getString(PushConstants.CONTENT);
        this.mCommentCategory = bundle.getString("category");
        this.mAuthListenerKey = bundle.getString("key_listener");
        if (!TextUtils.isEmpty(this.mAuthListenerKey)) {
            this.mAuthListener = WeiboCallbackManager.getInstance(this.mContext).getWeiboAuthListener(this.mAuthListenerKey);
        }
        this.mWidgetRequestCallbackKey = bundle.getString("key_widget_callback");
        if (!TextUtils.isEmpty(this.mWidgetRequestCallbackKey)) {
            this.mWidgetRequestCallback = WeiboCallbackManager.getInstance(this.mContext).getWidgetRequestCallback(this.mWidgetRequestCallbackKey);
        }
        this.mUrl = buildUrl(this.mUrl);
    }

    public void execRequest(Activity activity, int i) {
        if (i == 3) {
            WeiboSdkBrowser.closeBrowser(activity, this.mAuthListenerKey, this.mWidgetRequestCallbackKey);
        }
    }
}
