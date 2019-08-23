package com.umeng.message.inapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UInAppMessage;

public class UmengInAppClickHandler implements UInAppHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81211a = "com.umeng.message.inapp.UmengInAppClickHandler";

    /* renamed from: b  reason: collision with root package name */
    private String f81212b;

    /* renamed from: c  reason: collision with root package name */
    private String f81213c;

    /* renamed from: d  reason: collision with root package name */
    private String f81214d;

    public void openActivity(Activity activity, String str) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str.trim())) {
                    String str2 = f81211a;
                    UMLog.mutlInfo(str2, 2, "打开Activity: " + str);
                    Intent intent = new Intent();
                    intent.setClassName(activity, str);
                    intent.setFlags(536870912);
                    activity.startActivity(intent);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void openUrl(Activity activity, String str) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str.trim())) {
                    String str2 = f81211a;
                    UMLog.mutlInfo(str2, 2, "打开链接: " + str);
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void handleInAppMessage(Activity activity, UInAppMessage uInAppMessage, int i) {
        switch (i) {
            case SearchJediMixFeedAdapter.f42514c:
                this.f81212b = uInAppMessage.action_type;
                this.f81213c = uInAppMessage.action_activity;
                this.f81214d = uInAppMessage.action_url;
                break;
            case 17:
                this.f81212b = uInAppMessage.bottom_action_type;
                this.f81213c = uInAppMessage.bottom_action_activity;
                this.f81214d = uInAppMessage.bottom_action_url;
                break;
            case 18:
                this.f81212b = uInAppMessage.plainTextActionType;
                this.f81213c = uInAppMessage.plainTextActivity;
                this.f81214d = uInAppMessage.plainTextUrl;
                break;
            case 19:
                this.f81212b = uInAppMessage.customButtonActionType;
                this.f81213c = uInAppMessage.customButtonActivity;
                this.f81214d = uInAppMessage.customButtonUrl;
                break;
        }
        if (!TextUtils.isEmpty(this.f81212b)) {
            if (TextUtils.equals("go_activity", this.f81212b)) {
                openActivity(activity, this.f81213c);
            } else if (TextUtils.equals("go_url", this.f81212b)) {
                openUrl(activity, this.f81214d);
            } else {
                TextUtils.equals("go_app", this.f81212b);
            }
        }
    }
}
