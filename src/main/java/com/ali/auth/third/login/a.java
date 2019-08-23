package com.ali.auth.third.login;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ali.auth.third.core.context.KernelContext;
import com.ali.auth.third.core.trace.SDKLogger;

public class a extends AsyncTask<Object, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5008a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f5009b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LoginComponent f5010c;

    a(LoginComponent loginComponent, String str, Activity activity) {
        this.f5010c = loginComponent;
        this.f5008a = str;
        this.f5009b = activity;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        SDKLogger.d("login", "showLogin doInBackground");
        return TextUtils.isEmpty(this.f5008a) ? "" : this.f5010c.generateTopAppLinkToken(this.f5008a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        SDKLogger.d("login", "showLogin onPostExecute signResult = " + str);
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent();
            intent.setAction("com.taobao.open.intent.action.GETWAY");
            intent.setData(Uri.parse("tbopen://m.taobao.com/getway/oauth?&appkey=" + KernelContext.getAppKey() + "&pluginName=taobao.oauth.code.create" + "&apkSign=" + this.f5008a + "&sign=" + str));
            if (this.f5009b.getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
                this.f5009b.startActivityForResult(intent, RequestCode.OPEN_TAOBAO);
            } else {
                this.f5010c.showH5Login(this.f5009b);
            }
        } else {
            this.f5010c.showH5Login(this.f5009b);
        }
    }
}
