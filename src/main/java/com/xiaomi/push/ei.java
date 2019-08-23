package com.xiaomi.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

public class ei implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private Context f81981a;

    /* renamed from: a  reason: collision with other field name */
    private String f315a = "";

    /* renamed from: b  reason: collision with root package name */
    private String f81982b;

    public ei(Context context, String str) {
        this.f81981a = context;
        this.f315a = str;
    }

    private void a(String str) {
        is isVar = new is();
        isVar.a(str);
        isVar.a(System.currentTimeMillis());
        isVar.a(im.ActivityActiveTimeStamp);
        ex.a(this.f81981a, isVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (!TextUtils.isEmpty(this.f315a) && !TextUtils.isEmpty(localClassName)) {
            this.f81982b = "";
            if (TextUtils.isEmpty(this.f81982b) || TextUtils.equals(this.f81982b, localClassName)) {
                a(this.f81981a.getPackageName() + "|" + localClassName + ":" + this.f315a + "," + String.valueOf(System.currentTimeMillis() / 1000));
                this.f315a = "";
                this.f81982b = "";
            } else {
                this.f315a = "";
            }
        }
    }

    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.f81982b)) {
            this.f81982b = activity.getLocalClassName();
        }
        this.f315a = String.valueOf(System.currentTimeMillis() / 1000);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
