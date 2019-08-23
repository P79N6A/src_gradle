package com.huawei.android.pushselfshow.richpush.html.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.richpush.html.api.NativeToJsMessageQueue;
import com.huawei.android.pushselfshow.richpush.html.api.d;
import com.huawei.android.pushselfshow.utils.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f25281a;

    /* renamed from: b  reason: collision with root package name */
    public int f25282b;

    /* renamed from: c  reason: collision with root package name */
    public int f25283c;

    /* renamed from: d  reason: collision with root package name */
    private NativeToJsMessageQueue f25284d;

    /* renamed from: e  reason: collision with root package name */
    private String f25285e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Activity f25286f;

    public d(Activity activity) {
        e.e("PushSelfShowLog", "init App");
        this.f25286f = activity;
    }

    private void a(String str, String str2, boolean z) {
        try {
            e.a("PushSelfShowLog", "enter launchApp , appPackageName =" + str + ",and msg.intentUri is " + str2 + " boolean appmarket is " + z);
            if (str != null) {
                if (str.trim().length() != 0) {
                    Intent a2 = a.a((Context) this.f25286f, str);
                    if (a2 == null) {
                        if (z) {
                            a(str);
                        } else {
                            e.e("PushSelfShowLog", "APP_NOT_EXIST and appmaeket is false");
                            this.f25284d.a(this.f25285e, d.a.APP_NOT_EXIST, "error", null);
                        }
                        return;
                    }
                    if (str2 != null) {
                        try {
                            Intent parseUri = Intent.parseUri(str2, 0);
                            e.e("PushSelfShowLog", "Intent.parseUri(intentUri, 0)，" + a2.toURI());
                            if (a.a((Context) this.f25286f, str, parseUri).booleanValue()) {
                                a2 = parseUri;
                            }
                        } catch (Exception e2) {
                            e.a("PushSelfShowLog", "intentUri error ", (Throwable) e2);
                        }
                    }
                    if (!a.a((Context) this.f25286f, a2)) {
                        e.c("PushSelfShowLog", "no permission to start Activity");
                        this.f25284d.a(this.f25285e, d.a.ILLEGAL_ACCESS_EXCEPTION, "error", null);
                        return;
                    }
                    if (this.f25281a) {
                        e.e("PushSelfShowLog", " APP_OPEN startActivityForResult " + a2.toURI());
                        this.f25286f.startActivityForResult(a2, this.f25282b);
                    } else {
                        e.e("PushSelfShowLog", " APP_OPEN start " + a2.toURI());
                        this.f25286f.startActivity(a2);
                    }
                    this.f25284d.a(this.f25285e, d.a.OK, "success", null);
                    return;
                }
            }
            this.f25284d.a(this.f25285e, d.a.JSON_EXCEPTION, "error", null);
        } catch (Exception e3) {
            e.c("PushSelfShowLog", e3.toString(), e3);
        }
    }

    private void a(JSONObject jSONObject) {
        boolean z;
        String str;
        String str2 = null;
        if (jSONObject == null || !jSONObject.has("package-name")) {
            this.f25284d.a(this.f25285e, d.a.JSON_EXCEPTION, "error", null);
            return;
        }
        try {
            str = jSONObject.getString("package-name");
            try {
                if (jSONObject.has("intent-uri")) {
                    str2 = jSONObject.getString("intent-uri");
                }
                z = jSONObject.has("appmarket") ? jSONObject.getBoolean("appmarket") : false;
            } catch (Exception e2) {
                e = e2;
                z = false;
                e.d("PushSelfShowLog", "openApp param failed ", e);
                e.b("PushSelfShowLog", "packageName is %s , appmarket is %s ,bResult is %s ", str, Boolean.valueOf(z), Boolean.valueOf(this.f25281a));
                a(str, str2, z);
            }
            try {
                if (jSONObject.has("requestCode") && jSONObject.has("resultCode")) {
                    this.f25282b = jSONObject.getInt("requestCode");
                    this.f25283c = jSONObject.getInt("resultCode");
                    this.f25281a = true;
                }
            } catch (Exception e3) {
                e = e3;
                e.d("PushSelfShowLog", "openApp param failed ", e);
                e.b("PushSelfShowLog", "packageName is %s , appmarket is %s ,bResult is %s ", str, Boolean.valueOf(z), Boolean.valueOf(this.f25281a));
                a(str, str2, z);
            }
        } catch (Exception e4) {
            e = e4;
            str = null;
            z = false;
            e.d("PushSelfShowLog", "openApp param failed ", e);
            e.b("PushSelfShowLog", "packageName is %s , appmarket is %s ,bResult is %s ", str, Boolean.valueOf(z), Boolean.valueOf(this.f25281a));
            a(str, str2, z);
        }
        e.b("PushSelfShowLog", "packageName is %s , appmarket is %s ,bResult is %s ", str, Boolean.valueOf(z), Boolean.valueOf(this.f25281a));
        a(str, str2, z);
    }

    private void b(JSONObject jSONObject) {
        NativeToJsMessageQueue nativeToJsMessageQueue;
        String str;
        d.a aVar;
        if (jSONObject == null || !jSONObject.has("package-name")) {
            nativeToJsMessageQueue = this.f25284d;
            str = this.f25285e;
            aVar = d.a.JSON_EXCEPTION;
        } else {
            try {
                String string = jSONObject.getString("package-name");
                JSONObject jSONObject2 = new JSONObject();
                PackageManager packageManager = this.f25286f.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(string, 0);
                String charSequence = packageInfo.applicationInfo.loadLabel(packageManager).toString();
                String str2 = packageInfo.versionName;
                int i = packageInfo.versionCode;
                jSONObject2.put("appName", charSequence);
                jSONObject2.put("versionCode", i);
                jSONObject2.put("versionName", str2);
                this.f25284d.a(this.f25285e, d.a.OK, "success", jSONObject2);
                return;
            } catch (Exception e2) {
                e.d("PushSelfShowLog", "getAppInfo param failed ", e2);
                nativeToJsMessageQueue = this.f25284d;
                str = this.f25285e;
                aVar = d.a.APP_NOT_EXIST;
            }
        }
        nativeToJsMessageQueue.a(str, aVar, "error", null);
    }

    private String c(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        d.a aVar;
        if (jSONObject == null || !jSONObject.has("package-name")) {
            aVar = d.a.JSON_EXCEPTION;
        } else {
            try {
                String string = jSONObject.getString("package-name");
                PackageManager packageManager = this.f25286f.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(string, 0);
                String charSequence = packageInfo.applicationInfo.loadLabel(packageManager).toString();
                String str = packageInfo.versionName;
                int i = packageInfo.versionCode;
                jSONObject2 = com.huawei.android.pushselfshow.richpush.html.api.d.a(d.a.OK);
                jSONObject2.put("appName", charSequence);
                jSONObject2.put("versionCode", i);
                jSONObject2.put("versionName", str);
            } catch (Exception e2) {
                e.d("PushSelfShowLog", "getAppInfo param failed ", e2);
                aVar = d.a.APP_NOT_EXIST;
            }
            return jSONObject2.toString();
        }
        jSONObject2 = com.huawei.android.pushselfshow.richpush.html.api.d.a(aVar);
        return jSONObject2.toString();
    }

    public String a(String str, JSONObject jSONObject) {
        try {
            return "getAppInfo".equals(str) ? c(jSONObject) : com.huawei.android.pushselfshow.richpush.html.api.d.a(d.a.METHOD_NOT_FOUND_EXCEPTION).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public void a(int i, int i2, Intent intent) {
        e.e("PushSelfShowLog", "onActivityResult and requestCode is " + i + " resultCode is " + i2 + " intent data is " + intent);
        try {
            if (this.f25281a && i2 == this.f25283c && intent != null) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        jSONObject2.put(str, extras.get(str));
                    }
                    if (jSONObject2.length() > 0) {
                        jSONObject.put(PushConstants.EXTRA, jSONObject2);
                        this.f25284d.a(this.f25285e, d.a.OK, "status", jSONObject);
                    }
                }
            }
        } catch (Exception | JSONException unused) {
            e.e("PushSelfShowLog", "onActivityResult error");
        }
    }

    public void a(NativeToJsMessageQueue nativeToJsMessageQueue, String str, String str2, JSONObject jSONObject) {
        if (nativeToJsMessageQueue == null) {
            e.a("PushSelfShowLog", "jsMessageQueue is null while run into App exec");
            return;
        }
        this.f25284d = nativeToJsMessageQueue;
        if ("openApp".equals(str)) {
            d();
            if (str2 != null) {
                this.f25285e = str2;
                a(jSONObject);
                return;
            }
            e.a("PushSelfShowLog", "Audio exec callback is null ");
        } else if (!"getAppInfo".equals(str)) {
            nativeToJsMessageQueue.a(str2, d.a.METHOD_NOT_FOUND_EXCEPTION, "error", null);
        } else if (str2 != null) {
            this.f25285e = str2;
            b(jSONObject);
        } else {
            e.a("PushSelfShowLog", "Audio exec callback is null ");
        }
    }

    public void a(String str) {
        Intent intent;
        NativeToJsMessageQueue nativeToJsMessageQueue;
        String str2;
        d.a aVar;
        String str3;
        if (a.a((Context) this.f25286f, "com.huawei.appmarket", new Intent("com.huawei.appmarket.intent.action.AppDetail")).booleanValue()) {
            e.a("PushSelfShowLog", "app not exist && appmarkt exist ,so open appmarket");
            intent = new Intent("com.huawei.appmarket.intent.action.AppDetail");
            intent.putExtra("APP_PACKAGENAME", str);
            intent.setPackage("com.huawei.appmarket");
            intent.setFlags(402653184);
            e.a("PushSelfShowLog", "hwAppmarket only support com.huawei.appmarket.intent.action.AppDetail!");
        } else if (a.c(this.f25286f).size() > 0) {
            e.a("PushSelfShowLog", "app not exist && other appmarkt exist ,so open appmarket");
            intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse("market://details?id=" + str));
            intent.setFlags(402653184);
        } else {
            e.a("PushSelfShowLog", "app not exist && other appmarkt not exist ,so do nothing");
            try {
                new e(this).start();
            } catch (Exception unused) {
                e.a("PushSelfShowLog", "show Toast.makeText error");
            }
            intent = null;
        }
        if (intent != null) {
            e.e("PushSelfShowLog", "intent is not null " + intent.toURI());
            this.f25286f.startActivity(intent);
            e.e("PushSelfShowLog", "APP_OPEN_APPMARKET and open with appmaeket");
            nativeToJsMessageQueue = this.f25284d;
            str2 = this.f25285e;
            aVar = d.a.APP_OPEN_APPMARKET;
            str3 = "success";
        } else {
            e.a("PushSelfShowLog", "intent is null ");
            e.e("PushSelfShowLog", "APP_OPEN_APPMARKET and not find any  appmaeket");
            nativeToJsMessageQueue = this.f25284d;
            str2 = this.f25285e;
            aVar = d.a.APP_NOT_APPMARKET;
            str3 = "error";
        }
        nativeToJsMessageQueue.a(str2, aVar, str3, null);
    }

    public void b() {
    }

    public void c() {
        d();
    }

    public void d() {
        this.f25285e = null;
        this.f25281a = false;
        this.f25282b = 0;
        this.f25283c = 0;
    }
}
