package com.vivo.push.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.vivo.push.b.k;
import com.vivo.push.sdk.a;
import com.vivo.push.util.o;
import com.vivo.push.util.r;
import com.vivo.push.v;
import com.vivo.push.y;
import java.util.List;

public final class f extends v {
    f(y yVar) {
        super(yVar);
    }

    private static List<ResolveInfo> c(Context context) {
        List<ResolveInfo> list;
        Intent intent = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            list = null;
        }
        if (list == null || list.size() <= 0) {
            Intent intent2 = new Intent("com.vivo.pushclient.action.RECEIVE");
            intent2.setPackage(context.getPackageName());
            try {
                return context.getPackageManager().queryBroadcastReceivers(intent2, 576);
            } catch (Exception unused2) {
            }
        }
        return list;
    }

    public static boolean a(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            o.a("OnChangePushStatusTask", "enableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) != 1) {
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
            o.d("OnChangePushStatusTask", "enableService push service.");
            return true;
        }
        o.d("OnChangePushStatusTask", "push service has enabled");
        return false;
    }

    public static boolean b(Context context) {
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            o.a("OnChangePushStatusTask", "disableService error: can not find push service.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
        if (packageManager.getComponentEnabledSetting(componentName) != 2) {
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
            o.d("OnChangePushStatusTask", "disableService push service.");
            return true;
        }
        o.d("OnChangePushStatusTask", "push service has disabled");
        return false;
    }

    public final void a(y yVar) {
        if (!this.f81705a.getPackageName().equals(r.b(this.f81705a))) {
            k kVar = (k) yVar;
            int d2 = kVar.d();
            int e2 = kVar.e();
            o.d("OnChangePushStatusTask", "OnChangePushStatusTask serviceStatus is " + d2 + " ; receiverStatus is " + e2);
            if (d2 == 2) {
                b(this.f81705a);
            } else if (d2 == 1) {
                a(this.f81705a);
            } else if (d2 == 0) {
                Context context = this.f81705a;
                Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    o.a("OnChangePushStatusTask", "defaultService error: can not find push service.");
                } else {
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
                    if (packageManager.getComponentEnabledSetting(componentName) != 0) {
                        packageManager.setComponentEnabledSetting(componentName, 0, 1);
                        o.d("OnChangePushStatusTask", "defaultService push service.");
                    } else {
                        o.d("OnChangePushStatusTask", "push service has defaulted");
                    }
                }
            }
            if (e2 == 2) {
                Context context2 = this.f81705a;
                List<ResolveInfo> c2 = c(context2);
                if (c2 == null || c2.size() <= 0) {
                    o.a("OnChangePushStatusTask", "disableReceiver error: can not find push service.");
                } else {
                    String str = c2.get(0).activityInfo.name;
                    if (TextUtils.isEmpty(str)) {
                        o.d("OnChangePushStatusTask", "disableReceiver error: className is null. ");
                    } else {
                        PackageManager packageManager2 = context2.getPackageManager();
                        ComponentName componentName2 = new ComponentName(context2, str);
                        if (packageManager2.getComponentEnabledSetting(componentName2) != 2) {
                            packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
                            o.d("OnChangePushStatusTask", "push service disableReceiver ");
                        } else {
                            o.d("OnChangePushStatusTask", "push service has disableReceiver ");
                        }
                    }
                }
                a.a().b();
            } else if (e2 == 1) {
                Context context3 = this.f81705a;
                List<ResolveInfo> c3 = c(context3);
                if (c3 == null || c3.size() <= 0) {
                    o.a("OnChangePushStatusTask", "enableReceiver error: can not find push service.");
                    return;
                }
                String str2 = c3.get(0).activityInfo.name;
                if (TextUtils.isEmpty(str2)) {
                    o.d("OnChangePushStatusTask", "enableReceiver error: className is null. ");
                    return;
                }
                PackageManager packageManager3 = context3.getPackageManager();
                ComponentName componentName3 = new ComponentName(context3, str2);
                if (packageManager3.getComponentEnabledSetting(componentName3) != 1) {
                    packageManager3.setComponentEnabledSetting(componentName3, 1, 1);
                    o.d("OnChangePushStatusTask", "push service enableReceiver ");
                    return;
                }
                o.d("OnChangePushStatusTask", "push service has enableReceiver ");
            } else {
                if (e2 == 0) {
                    Context context4 = this.f81705a;
                    List<ResolveInfo> c4 = c(context4);
                    if (c4 == null || c4.size() <= 0) {
                        o.a("OnChangePushStatusTask", "defaultReceiver error: can not find push service.");
                        return;
                    }
                    String str3 = c4.get(0).activityInfo.name;
                    if (TextUtils.isEmpty(str3)) {
                        o.d("OnChangePushStatusTask", "defaultReceiver error: className is null. ");
                        return;
                    }
                    PackageManager packageManager4 = context4.getPackageManager();
                    ComponentName componentName4 = new ComponentName(context4, str3);
                    if (packageManager4.getComponentEnabledSetting(componentName4) != 0) {
                        packageManager4.setComponentEnabledSetting(componentName4, 0, 1);
                        o.d("OnChangePushStatusTask", "push service defaultReceiver ");
                        return;
                    }
                    o.d("OnChangePushStatusTask", "push service has defaulted");
                }
            }
        }
    }
}
