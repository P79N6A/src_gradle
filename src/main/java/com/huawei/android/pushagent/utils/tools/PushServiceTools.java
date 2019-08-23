package com.huawei.android.pushagent.utils.tools;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;
import java.util.Iterator;
import java.util.List;

public class PushServiceTools {
    private static long a(ResolveInfo resolveInfo, String str) {
        long j = -1;
        if (resolveInfo == null) {
            return -1;
        }
        try {
            j = Long.parseLong(b(resolveInfo, str));
        } catch (NumberFormatException unused) {
            e.a("PushLogAC2815", str + " is not set in " + a(resolveInfo));
        }
        return j;
    }

    private static PackageInfo a(Context context, String str) {
        e.a("PushLogAC2815", "getPkgVersion(pkgName:" + str + " context:" + context);
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static ResolveInfo a(Context context, String str, String str2) {
        String str3;
        StringBuilder sb;
        List b2 = a.b(context, str);
        if (b2 == null || b2.size() == 0) {
            str3 = "PushLogAC2815";
            sb = new StringBuilder("no push service install, may be system Err!! pkgName:");
        } else {
            e.a("PushLogAC2815", "begin to get the hight Version package, have action:" + str);
            ResolveInfo a2 = a(b2, str2);
            if (a2 != null) {
                return a2;
            }
            str3 = "PushLogAC2815";
            sb = new StringBuilder("there is no hightVersion PushService, maybe system Err!! pkgName:");
        }
        sb.append(context.getPackageName());
        e.d(str3, sb.toString());
        return null;
    }

    private static ResolveInfo a(List list, String str) {
        ResolveInfo resolveInfo = null;
        if (!(list == null || list.size() == 0)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ResolveInfo resolveInfo2 = (ResolveInfo) it2.next();
                if (a(resolveInfo2, resolveInfo, str)) {
                    resolveInfo = resolveInfo2;
                }
            }
            if (resolveInfo != null) {
                String str2 = resolveInfo.serviceInfo != null ? resolveInfo.serviceInfo.packageName : resolveInfo.activityInfo.packageName;
                e.a("PushLogAC2815", "after getHighVersion pushService pkgName=" + str2);
            }
        }
        return resolveInfo;
    }

    private static String a(Context context) {
        String str;
        e.a("PushLogAC2815", " choose the high version for push service");
        if (a.o(context)) {
            return "android";
        }
        long b2 = b(context);
        if (228 > b2 || !a()) {
            ResolveInfo a2 = a(context, "com.huawei.android.push.intent.REGISTER", "CS_cloud_version");
            long a3 = a(a2, "CS_cloud_version");
            e.a("PushLogAC2815", "the getHightMetaPackageName return version is :" + a3 + " curApkVersion:" + b2);
            if (b2 >= a3) {
                str = "com.huawei.android.pushagent";
                e.a("PushLogAC2815", "the push APK version (" + b2 + ")is hight,use APK for push service");
            } else {
                str = a(a2);
                e.a("PushLogAC2815", "use the hight version(" + a3 + " )for push service, highPkgName is :" + str);
            }
        } else {
            e.b("PushLogAC2815", "support ctrlsocket.");
            str = "com.huawei.android.pushagent";
        }
        return str;
    }

    private static String a(ResolveInfo resolveInfo) {
        if (resolveInfo != null) {
            return resolveInfo.serviceInfo != null ? resolveInfo.serviceInfo.packageName : resolveInfo.activityInfo.packageName;
        }
        e.b("PushLogAC2815", "ResolveInfo is null , cannot get packageName");
        return null;
    }

    private static boolean a() {
        if (-2 != a.a(1, 3) && !d.c()) {
            return true;
        }
        e.a("PushLogAC2815", "not support ctrlsocket.");
        return false;
    }

    private static boolean a(ResolveInfo resolveInfo, ResolveInfo resolveInfo2, String str) {
        if (resolveInfo2 == null) {
            return true;
        }
        if (resolveInfo == null) {
            return false;
        }
        String a2 = a(resolveInfo);
        long a3 = a(resolveInfo, str);
        long a4 = a(resolveInfo2, str);
        String str2 = resolveInfo2.serviceInfo != null ? resolveInfo2.serviceInfo.packageName : resolveInfo2.activityInfo.packageName;
        e.a("PushLogAC2815", "the curPkgName(" + a2 + ")version is:" + a3 + "the oldPkgName (" + str2 + ")version is:" + a4);
        if (a3 > a4) {
            return true;
        }
        return a3 == a4 && a2 != null && a2.compareTo(str2) > 0;
    }

    private static long b(Context context) {
        long j = -1000;
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent("com.huawei.android.push.intent.REGISTER").setPackage("com.huawei.android.pushagent"), 640);
            if (queryBroadcastReceivers != null) {
                if (queryBroadcastReceivers.size() != 0) {
                    j = 228;
                    String str = queryBroadcastReceivers.get(0).serviceInfo != null ? queryBroadcastReceivers.get(0).serviceInfo.packageName : queryBroadcastReceivers.get(0).activityInfo.packageName;
                    if (str != null && str.equals("com.huawei.android.pushagent")) {
                        j = a(queryBroadcastReceivers.get(0), "CS_cloud_version");
                    }
                    e.a("PushLogAC2815", "start to get Apk version , the APK version is :" + j);
                    return j;
                }
            }
            return -1000;
        } catch (Exception e2) {
            e.d("PushLogAC2815", "get Apk version faild ,Exception e= " + e2.toString());
        }
    }

    private static String b(ResolveInfo resolveInfo, String str) {
        Bundle bundle = resolveInfo.serviceInfo != null ? resolveInfo.serviceInfo.metaData : resolveInfo.activityInfo.metaData;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    public static void broadcastOrStartSelfService(Context context, Intent intent) {
        if (context == null || intent == null) {
            e.b("PushLogAC2815", "context is " + context + ",intent is " + intent);
        } else if (a.o(context)) {
            intent.setPackage("android");
            context.sendBroadcast(intent);
        } else if (a.s(context)) {
            String r = a.r(context);
            if (!TextUtils.isEmpty(r)) {
                intent.setPackage(r);
            }
            context.sendBroadcast(intent);
        } else {
            b.a(context, intent);
        }
    }

    public static boolean isPkgInstall(Context context, String str) {
        e.a("PushLogAC2815", "isPkgInstall(pkgName:" + str + " context:" + context);
        return a(context, str) != null;
    }

    public static boolean isVotedSelf(Context context) {
        try {
            String a2 = a(context);
            new h(context, "pushConfig").a("votedPackageName", a2);
            if (!context.getPackageName().equals(a2) && a2 != null) {
                if ("android".equals(a2) || !a.s(context)) {
                    e.a("PushLogAC2815", "pushservice start by framework");
                } else {
                    e.a("PushLogAC2815", "start push service ,the highPkgName is :" + a2);
                    context.sendBroadcast(new Intent("com.huawei.intent.action.PUSH").putExtra("EXTRA_INTENT_TYPE", "com.huawei.intent.action.PUSH_ON").putExtra("Remote_Package_Name", a2).setFlags(32).setPackage(a2));
                }
            }
            return context.getPackageName().equals(a2);
        } catch (SecurityException e2) {
            e.c("PushLogAC2815", "startService SecurityException:" + e2.getMessage());
            return false;
        } catch (Exception e3) {
            e.c("PushLogAC2815", "isVotedSelf exception: " + e3.toString(), e3);
            return false;
        }
    }
}
