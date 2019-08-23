package com.umeng;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.message.b.a;
import com.ss.android.push.b;
import com.ss.android.pushmanager.f;
import com.umeng.message.UmengDownloadResourceService;
import com.umeng.message.UmengMessageCallbackHandlerService;
import java.util.Arrays;
import java.util.List;

public class ManifestChecker {
    private static boolean checkKeys(String str) {
        b<String, String, String> e2 = f.a().e();
        if (e2 == null || TextUtils.isEmpty((CharSequence) e2.getLeft()) || TextUtils.isEmpty((CharSequence) e2.getMiddle())) {
            return false;
        }
        return true;
    }

    static boolean checkManifest(String str, Context context) throws PackageManager.NameNotFoundException {
        return checkComponents(context, str) & checkKeys(str) & checkPermission(context, str);
    }

    private static boolean checkPermission(Context context, String str) throws PackageManager.NameNotFoundException {
        return com.ss.android.message.b.f.a(context, str, "UmengPush 错误,", Arrays.asList(new String[]{"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.WAKE_LOCK", "android.permission.READ_PHONE_STATE", "android.permission.BROADCAST_PACKAGE_ADDED", "android.permission.BROADCAST_PACKAGE_CHANGED", "android.permission.BROADCAST_PACKAGE_INSTALL", "android.permission.BROADCAST_PACKAGE_REPLACED", "android.permission.RESTART_PACKAGES", "android.permission.GET_TASKS", "android.permission.RECEIVE_BOOT_COMPLETED", "android.permission.CHANGE_NETWORK_STATE", "android.permission.CHANGE_WIFI_STATE"}));
    }

    private static boolean checkComponents(Context context, String str) throws PackageManager.NameNotFoundException {
        a.C0361a d2 = a.C0361a.d("com.taobao.accs.ChannelService");
        a.C0361a d3 = a.C0361a.d("com.taobao.accs.internal.AccsJobService");
        a.C0361a d4 = a.C0361a.d("com.taobao.accs.ChannelService$KernelService");
        a.C0361a d5 = a.C0361a.d("com.umeng.message.UmengIntentService");
        a.C0361a d6 = a.C0361a.d("com.umeng.message.XiaomiIntentService");
        a.C0361a d7 = a.C0361a.d("com.umeng.message.UmengMessageIntentReceiverService");
        a.C0361a d8 = a.C0361a.d("com.umeng.UmengMessageHandler");
        boolean b2 = com.ss.android.message.b.f.b(context, str, "UmengPush", Arrays.asList(new a[]{d2.a(context.getPackageName() + ":pushservice").a(new a.b(Arrays.asList(new String[]{"com.taobao.accs.intent.action.SERVICE"}))).a(new a.b(Arrays.asList(new String[]{"com.taobao.accs.intent.action.ELECTION"}))).f29961b, a.C0361a.d("com.taobao.accs.data.MsgDistributeService").a(context.getPackageName()).a(new a.b(Arrays.asList(new String[]{"com.taobao.accs.intent.action.RECEIVE"}))).f29961b, d3.a(context.getPackageName() + ":pushservice").b("android.permission.BIND_JOB_SERVICE").f29961b, d4.a(context.getPackageName() + ":pushservice").f29961b, a.C0361a.d("org.android.agoo.accs.AgooService").a(context.getPackageName()).a(new a.b(Arrays.asList(new String[]{"com.taobao.accs.intent.action.RECEIVE"}))).f29961b, d5.a(context.getPackageName() + ":pushservice").a(new a.b(Arrays.asList(new String[]{"org.agoo.android.intent.action.RECEIVE"}))).f29961b, d6.a(context.getPackageName() + ":pushservice").a(new a.b(Arrays.asList(new String[]{"org.agoo.android.intent.action.RECEIVE"}))).f29961b, d7.a(context.getPackageName() + ":pushservice").a(new a.b(Arrays.asList(new String[]{"org.android.agoo.client.MessageReceiverService"}))).f29961b, a.C0361a.d(UmengMessageCallbackHandlerService.TAG).b("android.permission.BIND_JOB_SERVICE").a(context.getPackageName()).a(new a.b(Arrays.asList(new String[]{"com.umeng.messge.registercallback.action"}))).a(new a.b(Arrays.asList(new String[]{"com.umeng.message.enablecallback.action"}))).a(new a.b(Arrays.asList(new String[]{"com.umeng.message.disablecallback.action"}))).a(new a.b(Arrays.asList(new String[]{"com.umeng.message.message.handler.action"}))).a(new a.b(Arrays.asList(new String[]{"com.umeng.message.message.sendmessage.action"}))).f29961b, d8.a(context.getPackageName() + ":pushservice").b("android.permission.BIND_JOB_SERVICE").f29961b, a.C0361a.d(UmengDownloadResourceService.TAG).a(context.getPackageName()).b("android.permission.BIND_JOB_SERVICE").f29961b}));
        a.C0361a d9 = a.C0361a.d("com.taobao.accs.EventReceiver");
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(":pushservice");
        a.C0361a a2 = d9.a(sb.toString()).a(new a.b(Arrays.asList(new String[]{"android.intent.action.BOOT_COMPLETED"}))).a(new a.b(Arrays.asList(new String[]{"android.net.conn.CONNECTIVITY_CHANGE"})));
        List asList = Arrays.asList(new String[]{"android.intent.action.PACKAGE_REMOVED"});
        a.C0361a d10 = a.C0361a.d("com.taobao.accs.ServiceReceiver");
        a.C0361a d11 = a.C0361a.d("com.taobao.agoo.AgooCommondReceiver");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getPackageName());
        sb2.append(":pushservice");
        a.C0361a a3 = d11.a(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getPackageName());
        sb3.append(".intent.action.COMMAND");
        a.C0361a a4 = a3.a(new a.b(Arrays.asList(new String[]{sb3.toString()})));
        List asList2 = Arrays.asList(new String[]{"android.intent.action.PACKAGE_REMOVED"});
        boolean c2 = com.ss.android.message.b.f.c(context, str, "UmengPush", Arrays.asList(new a[]{a2.a(new a.b(asList, null, Uri.parse("package://" + context.getPackageName()))).a(new a.b(Arrays.asList(new String[]{"android.intent.action.USER_PRESENT"}))).f29961b, d10.a(context.getPackageName() + ":pushservice").a(new a.b(Arrays.asList(new String[]{"com.taobao.accs.intent.action.COMMAND"}))).a(new a.b(Arrays.asList(new String[]{"com.taobao.accs.intent.action.START_FROM_AGOO"}))).f29961b, a4.a(new a.b(asList2, null, Uri.parse("package://" + context.getPackageName()))).f29961b, a.C0361a.d("com.umeng.message.NotificationProxyBroadcastReceiver").a(context.getPackageName()).f29961b}));
        a.C0361a a5 = a.C0361a.d("com.umeng.message.provider.MessageProvider").a(context.getPackageName());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(context.getPackageName());
        sb4.append(".umeng.message");
        boolean e2 = com.ss.android.message.b.f.e(context, str, "UmengPush", Arrays.asList(new a[]{a5.c(sb4.toString()).f29961b}));
        if (!b2 || !e2 || !c2) {
            return false;
        }
        return true;
    }
}
