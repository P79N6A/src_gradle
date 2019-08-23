package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.push.service.ag;

public final class em implements eq {
    em() {
    }

    private void a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            try {
                if (ah.a(context, "12", 1)) {
                    is isVar = new is();
                    isVar.a(str + ":" + str2);
                    isVar.a(System.currentTimeMillis());
                    isVar.a(im.BroadcastAction);
                    ex.a(context, isVar);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(Context context, Intent intent) {
        try {
            String dataString = intent.getDataString();
            if (!TextUtils.isEmpty(dataString)) {
                String[] split = dataString.split(":");
                if (split.length >= 2 && !TextUtils.isEmpty(split[1])) {
                    String str = split[1];
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean a2 = ag.a(context).a(ip.BroadcastActionCollectionSwitch.a(), true);
                    if (TextUtils.equals("android.intent.action.PACKAGE_RESTARTED", intent.getAction())) {
                        if (ah.a(context, "12", 1) && a2) {
                            if (TextUtils.isEmpty(ew.f81989a)) {
                                ew.f81989a += ep.f319a + ":";
                            }
                            ew.f81989a += str + "(" + currentTimeMillis + "),";
                        }
                    } else if (TextUtils.equals("android.intent.action.PACKAGE_CHANGED", intent.getAction())) {
                        if (ah.a(context, "12", 1) && a2) {
                            if (TextUtils.isEmpty(ew.f81990b)) {
                                ew.f81990b += ep.f81986b + ":";
                            }
                            ew.f81990b += str + "(" + currentTimeMillis + "),";
                        }
                    } else if (TextUtils.equals("android.intent.action.PACKAGE_ADDED", intent.getAction())) {
                        if (!intent.getExtras().getBoolean("android.intent.extra.REPLACING") && a2) {
                            a(context, String.valueOf(im.BroadcastActionAdded.a()), str);
                        }
                    } else if (TextUtils.equals("android.intent.action.PACKAGE_REMOVED", intent.getAction())) {
                        if (!intent.getExtras().getBoolean("android.intent.extra.REPLACING") && a2) {
                            a(context, String.valueOf(im.BroadcastActionRemoved.a()), str);
                        }
                    } else if (TextUtils.equals("android.intent.action.PACKAGE_REPLACED", intent.getAction())) {
                        if (a2) {
                            a(context, String.valueOf(im.BroadcastActionReplaced.a()), str);
                        }
                    } else if (TextUtils.equals("android.intent.action.PACKAGE_DATA_CLEARED", intent.getAction()) && a2) {
                        a(context, String.valueOf(im.BroadcastActionDataCleared.a()), str);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(Context context, Intent intent) {
        if (intent != null) {
            aj.a(context).a((Runnable) new en(this, context, intent));
        }
    }
}
