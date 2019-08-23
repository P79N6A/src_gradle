package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ae;
import com.xiaomi.push.aj;
import com.xiaomi.push.az;
import com.xiaomi.push.ip;
import com.xiaomi.push.jj;
import com.xiaomi.push.service.ag;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class be {
    public static void a(Context context) {
        SharedPreferences a2 = c.a(context, "mipush_extra", 0);
        long j = a2.getLong("last_sync_info", -1);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long a3 = (long) ag.a(context).a(ip.SyncInfoFrequency.a(), 1209600);
        if (j == -1) {
            a2.edit().putLong("last_sync_info", currentTimeMillis).commit();
        } else if (Math.abs(currentTimeMillis - j) > a3) {
            a(context, true);
            a2.edit().putLong("last_sync_info", currentTimeMillis).commit();
        }
    }

    public static void a(Context context, jj jjVar) {
        b.a("need to update local info with: " + jjVar.a());
        String str = (String) jjVar.a().get("accept_time");
        if (str != null) {
            MiPushClient.removeAcceptTime(context);
            String[] split = str.split("-");
            if (split.length == 2) {
                MiPushClient.addAcceptTime(context, split[0], split[1]);
                if (!"00:00".equals(split[0]) || !"00:00".equals(split[1])) {
                    d.a(context).a(false);
                } else {
                    d.a(context).a(true);
                }
            }
        }
        String str2 = (String) jjVar.a().get("aliases");
        if (str2 != null) {
            MiPushClient.removeAllAliases(context);
            if (!"".equals(str2)) {
                for (String addAlias : str2.split(",")) {
                    MiPushClient.addAlias(context, addAlias);
                }
            }
        }
        String str3 = (String) jjVar.a().get("topics");
        if (str3 != null) {
            MiPushClient.removeAllTopics(context);
            if (!"".equals(str3)) {
                for (String addTopic : str3.split(",")) {
                    MiPushClient.addTopic(context, addTopic);
                }
            }
        }
        String str4 = (String) jjVar.a().get("user_accounts");
        if (str4 != null) {
            MiPushClient.removeAllAccounts(context);
            if (!"".equals(str4)) {
                for (String addAccount : str4.split(",")) {
                    MiPushClient.addAccount(context, addAccount);
                }
            }
        }
    }

    public static void a(Context context, boolean z) {
        aj.a(context).a((Runnable) new bf(context, z));
    }

    /* access modifiers changed from: private */
    public static String c(List<String> list) {
        String a2 = az.a(d(list));
        return (TextUtils.isEmpty(a2) || a2.length() <= 4) ? "" : a2.substring(0, 4).toLowerCase();
    }

    /* access modifiers changed from: private */
    public static String d(List<String> list) {
        if (ae.a(list)) {
            return "";
        }
        ArrayList<String> arrayList = new ArrayList<>(list);
        Collections.sort(arrayList, Collator.getInstance(Locale.CHINA));
        String str = "";
        for (String str2 : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                str = str + ",";
            }
            str = str + str2;
        }
        return str;
    }
}
