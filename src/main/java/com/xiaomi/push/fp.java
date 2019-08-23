package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import org.json.JSONException;
import org.json.JSONObject;

public class fp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f82070a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ fo f398a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f399a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f82071b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f82072c;

    fp(fo foVar, String str, Context context, String str2, String str3) {
        this.f398a = foVar;
        this.f399a = str;
        this.f82070a = context;
        this.f82071b = str2;
        this.f82072c = str3;
    }

    public void run() {
        Context context;
        String str;
        String str2;
        if (!TextUtils.isEmpty(this.f399a)) {
            try {
                fk.a(this.f82070a, this.f399a, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, "get message");
                JSONObject jSONObject = new JSONObject(this.f399a);
                String optString = jSONObject.optString("action");
                String optString2 = jSONObject.optString("awakened_app_packagename");
                String optString3 = jSONObject.optString("awake_app_packagename");
                String optString4 = jSONObject.optString("awake_app");
                String optString5 = jSONObject.optString("awake_type");
                if (this.f82071b.equals(optString3)) {
                    if (this.f82072c.equals(optString4)) {
                        if (TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString4) || TextUtils.isEmpty(optString2)) {
                            fk.a(this.f82070a, this.f399a, 1008, "A receive a incorrect message with empty type");
                            return;
                        }
                        this.f398a.b(optString3);
                        this.f398a.a(optString4);
                        fn fnVar = new fn();
                        fnVar.b(optString);
                        fnVar.a(optString2);
                        fnVar.d(this.f399a);
                        if ("service".equals(optString5)) {
                            if (!TextUtils.isEmpty(optString)) {
                                this.f398a.a(fq.SERVICE_ACTION, this.f82070a, fnVar);
                                return;
                            }
                            fnVar.c("com.xiaomi.mipush.sdk.PushMessageHandler");
                            this.f398a.a(fq.SERVICE_COMPONENT, this.f82070a, fnVar);
                            return;
                        } else if (fq.ACTIVITY.f401a.equals(optString5)) {
                            this.f398a.a(fq.ACTIVITY, this.f82070a, fnVar);
                            return;
                        } else if (fq.PROVIDER.f401a.equals(optString5)) {
                            this.f398a.a(fq.PROVIDER, this.f82070a, fnVar);
                            return;
                        } else {
                            Context context2 = this.f82070a;
                            String str3 = this.f399a;
                            fk.a(context2, str3, 1008, "A receive a incorrect message with unknown type " + optString5);
                            return;
                        }
                    }
                }
                Context context3 = this.f82070a;
                String str4 = this.f399a;
                fk.a(context3, str4, 1008, "A receive a incorrect message with incorrect package info" + optString3);
            } catch (JSONException e2) {
                b.a((Throwable) e2);
                context = this.f82070a;
                str = this.f399a;
                str2 = "A meet a exception when receive the message";
            }
        } else {
            context = this.f82070a;
            str = "null";
            str2 = "A receive a incorrect message with empty info";
            fk.a(context, str, 1008, str2);
        }
    }
}
