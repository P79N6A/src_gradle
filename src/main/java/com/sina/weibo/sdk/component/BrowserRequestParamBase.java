package com.sina.weibo.sdk.component;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

public abstract class BrowserRequestParamBase {
    protected Context mContext;
    protected BrowserLauncher mLaucher;
    protected String mSpecifyTitle;
    protected String mUrl;

    public abstract void execRequest(Activity activity, int i);

    /* access modifiers changed from: protected */
    public abstract void onCreateRequestParamBundle(Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract void onSetupRequestParam(Bundle bundle);

    public BrowserLauncher getLauncher() {
        return this.mLaucher;
    }

    public String getSpecifyTitle() {
        return this.mSpecifyTitle;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public Bundle createRequestParamBundle() {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(this.mUrl)) {
            bundle.putString("key_url", this.mUrl);
        }
        if (this.mLaucher != null) {
            bundle.putSerializable("key_launcher", this.mLaucher);
        }
        if (!TextUtils.isEmpty(this.mSpecifyTitle)) {
            bundle.putString("key_specify_title", this.mSpecifyTitle);
        }
        onCreateRequestParamBundle(bundle);
        return bundle;
    }

    public void setLauncher(BrowserLauncher browserLauncher) {
        this.mLaucher = browserLauncher;
    }

    public void setSpecifyTitle(String str) {
        this.mSpecifyTitle = str;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public BrowserRequestParamBase(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void setupRequestParam(Bundle bundle) {
        this.mUrl = bundle.getString("key_url");
        this.mLaucher = (BrowserLauncher) bundle.getSerializable("key_launcher");
        this.mSpecifyTitle = bundle.getString("key_specify_title");
        onSetupRequestParam(bundle);
    }
}
