package com.umeng.message.proguard;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.utils.eq;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.PushAgent;
import com.umeng.message.UmengDownloadResourceService;
import com.umeng.message.UmengMessageCallbackHandlerService;
import com.umeng.message.entity.Ucode;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f81267a = System.getProperty("line.separator");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final String f81268b = h.class.getName();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicInteger f81269c = new AtomicInteger(1);

    public static void a(Context context, String str) {
        context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
    }

    public static boolean a(Context context) {
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.importance == 100 && next.processName.equals(packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static boolean a(Context context, Handler handler) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        boolean z30;
        boolean z31;
        boolean z32;
        boolean z33;
        final Context context2 = context;
        Handler handler2 = handler;
        if (!PushAgent.getInstance(context).isPushCheck()) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(PushAgent.getInstance(context).getMessageAppkey())) {
                handler2.post(new Runnable() {

                    /* renamed from: com.umeng.message.proguard.h$1$_lancet */
                    public class _lancet {
                        private _lancet() {
                        }

                        @TargetClass
                        @Proxy
                        static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                            if (Build.VERSION.SDK_INT == 25) {
                                eq.a(toast);
                            }
                            toast.show();
                        }
                    }

                    public final void run() {
                        _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please set umeng appkey!", 1));
                    }
                });
                return false;
            } else if (TextUtils.isEmpty(PushAgent.getInstance(context).getMessageSecret())) {
                handler2.post(new Runnable() {

                    /* renamed from: com.umeng.message.proguard.h$12$_lancet */
                    public class _lancet {
                        private _lancet() {
                        }

                        @TargetClass
                        @Proxy
                        static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                            if (Build.VERSION.SDK_INT == 25) {
                                eq.a(toast);
                            }
                            toast.show();
                        }
                    }

                    public final void run() {
                        _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please set umeng appsecret!", 1));
                    }
                });
                return false;
            } else {
                Intent intent = new Intent();
                intent.setPackage(context.getPackageName());
                intent.setAction("com.taobao.accs.intent.action.SERVICE");
                Iterator<ResolveInfo> it2 = context.getPackageManager().queryIntentServices(intent, 64).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    ResolveInfo next = it2.next();
                    if (next.serviceInfo.name.equals("com.taobao.accs.ChannelService")) {
                        String str = next.serviceInfo.processName;
                        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, context.getPackageName()) && next.serviceInfo.exported) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$18$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct ChannelService in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent2 = new Intent();
                intent2.setPackage(context.getPackageName());
                intent2.setAction("com.taobao.accs.intent.action.ELECTION");
                Iterator<ResolveInfo> it3 = context.getPackageManager().queryIntentServices(intent2, 64).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z2 = false;
                        break;
                    }
                    ResolveInfo next2 = it3.next();
                    if (next2.serviceInfo.name.equals("com.taobao.accs.ChannelService")) {
                        String str2 = next2.serviceInfo.processName;
                        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, context.getPackageName()) && next2.serviceInfo.exported) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (!z2) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$19$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct ChannelService in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent3 = new Intent();
                intent3.setPackage(context.getPackageName());
                intent3.setAction("com.taobao.accs.intent.action.RECEIVE");
                Iterator<ResolveInfo> it4 = context.getPackageManager().queryIntentServices(intent3, 64).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z3 = false;
                        break;
                    }
                    ResolveInfo next3 = it4.next();
                    if (next3.serviceInfo.name.equals("com.taobao.accs.data.MsgDistributeService") && next3.serviceInfo.exported) {
                        z3 = true;
                        break;
                    }
                }
                if (!z3) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$20$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct MsgDistributeService in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent4 = new Intent();
                intent4.setPackage(context.getPackageName());
                intent4.setAction("android.intent.action.BOOT_COMPLETED");
                Iterator<ResolveInfo> it5 = context.getPackageManager().queryBroadcastReceivers(intent4, 64).iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        z4 = false;
                        break;
                    }
                    ResolveInfo next4 = it5.next();
                    if (next4.activityInfo.name.equals("com.taobao.accs.EventReceiver")) {
                        String str3 = next4.activityInfo.processName;
                        if (!TextUtils.isEmpty(str3) && !TextUtils.equals(str3, context.getPackageName())) {
                            z4 = true;
                            break;
                        }
                    }
                }
                if (!z4) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$21$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct EventReceiver in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent5 = new Intent();
                intent5.setPackage(context.getPackageName());
                intent5.setAction("android.net.conn.CONNECTIVITY_CHANGE");
                Iterator<ResolveInfo> it6 = context.getPackageManager().queryBroadcastReceivers(intent5, 64).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z5 = false;
                        break;
                    }
                    ResolveInfo next5 = it6.next();
                    if (next5.activityInfo.name.equals("com.taobao.accs.EventReceiver")) {
                        String str4 = next5.activityInfo.processName;
                        if (!TextUtils.isEmpty(str4) && !TextUtils.equals(str4, context.getPackageName())) {
                            z5 = true;
                            break;
                        }
                    }
                }
                if (!z5) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$22$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct EventReceiver in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent6 = new Intent();
                intent6.setPackage(context.getPackageName());
                intent6.setAction("android.intent.action.PACKAGE_REMOVED");
                intent6.setData(Uri.parse("package:"));
                Iterator<ResolveInfo> it7 = context.getPackageManager().queryBroadcastReceivers(intent6, 64).iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        z6 = false;
                        break;
                    }
                    ResolveInfo next6 = it7.next();
                    if (next6.activityInfo.name.equals("com.taobao.accs.EventReceiver")) {
                        String str5 = next6.activityInfo.processName;
                        if (!TextUtils.isEmpty(str5) && !TextUtils.equals(str5, context.getPackageName())) {
                            z6 = true;
                            break;
                        }
                    }
                }
                if (!z6) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$23$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct EventReceiver in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent7 = new Intent();
                intent7.setPackage(context.getPackageName());
                intent7.setAction("android.intent.action.USER_PRESENT");
                Iterator<ResolveInfo> it8 = context.getPackageManager().queryBroadcastReceivers(intent7, 64).iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        z7 = false;
                        break;
                    }
                    ResolveInfo next7 = it8.next();
                    if (next7.activityInfo.name.equals("com.taobao.accs.EventReceiver")) {
                        String str6 = next7.activityInfo.processName;
                        if (!TextUtils.isEmpty(str6) && !TextUtils.equals(str6, context.getPackageName())) {
                            z7 = true;
                            break;
                        }
                    }
                }
                if (!z7) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$24$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct EventReceiver in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent8 = new Intent();
                intent8.setPackage(context.getPackageName());
                intent8.setAction("com.taobao.accs.intent.action.COMMAND");
                Iterator<ResolveInfo> it9 = context.getPackageManager().queryBroadcastReceivers(intent8, 64).iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        z8 = false;
                        break;
                    }
                    ResolveInfo next8 = it9.next();
                    if (next8.activityInfo.name.equals("com.taobao.accs.ServiceReceiver")) {
                        String str7 = next8.activityInfo.processName;
                        if (!TextUtils.isEmpty(str7) && !TextUtils.equals(str7, context.getPackageName())) {
                            z8 = true;
                            break;
                        }
                    }
                }
                if (!z8) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$2$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct ServiceReceiver in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent9 = new Intent();
                intent9.setPackage(context.getPackageName());
                intent9.setAction("com.taobao.accs.intent.action.START_FROM_AGOO");
                Iterator<ResolveInfo> it10 = context.getPackageManager().queryBroadcastReceivers(intent9, 64).iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        z9 = false;
                        break;
                    }
                    ResolveInfo next9 = it10.next();
                    if (next9.activityInfo.name.equals("com.taobao.accs.ServiceReceiver")) {
                        String str8 = next9.activityInfo.processName;
                        if (!TextUtils.isEmpty(str8) && !TextUtils.equals(str8, context.getPackageName())) {
                            z9 = true;
                            break;
                        }
                    }
                }
                if (!z9) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$3$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct ServiceReceiver in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent10 = new Intent();
                intent10.setPackage(context.getPackageName());
                intent10.setAction("com.taobao.accs.intent.action.RECEIVE");
                Iterator<ResolveInfo> it11 = context.getPackageManager().queryIntentServices(intent10, 64).iterator();
                while (true) {
                    if (!it11.hasNext()) {
                        z10 = false;
                        break;
                    }
                    ResolveInfo next10 = it11.next();
                    if (next10.serviceInfo.name.equals("org.android.agoo.accs.AgooService") && next10.serviceInfo.exported) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$4$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct AgooService in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent11 = new Intent();
                intent11.setPackage(context.getPackageName());
                intent11.setAction("org.agoo.android.intent.action.RECEIVE");
                Iterator<ResolveInfo> it12 = context.getPackageManager().queryIntentServices(intent11, 64).iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        z11 = false;
                        break;
                    }
                    ResolveInfo next11 = it12.next();
                    if (next11.serviceInfo.name.equals("com.umeng.message.UmengIntentService") && next11.serviceInfo.exported) {
                        z11 = true;
                        break;
                    }
                }
                if (!z11) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$5$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct UmengIntentService in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent12 = new Intent();
                intent12.setPackage(context.getPackageName());
                intent12.setAction(context.getPackageName() + ".intent.action.COMMAND");
                Iterator<ResolveInfo> it13 = context.getPackageManager().queryBroadcastReceivers(intent12, 64).iterator();
                while (true) {
                    if (!it13.hasNext()) {
                        z12 = false;
                        break;
                    }
                    ResolveInfo next12 = it13.next();
                    if (next12.activityInfo.name.equals("com.taobao.agoo.AgooCommondReceiver") && next12.activityInfo.exported) {
                        z12 = true;
                        break;
                    }
                }
                if (!z12) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$6$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please replace '${applicationId}.intent.action.COMMAND' with application's applicationId for AgooCommondReceiver in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent13 = new Intent();
                intent13.setPackage(context.getPackageName());
                intent13.setAction("android.intent.action.PACKAGE_REMOVED");
                intent13.setData(Uri.parse("package:"));
                Iterator<ResolveInfo> it14 = context.getPackageManager().queryBroadcastReceivers(intent13, 64).iterator();
                while (true) {
                    if (!it14.hasNext()) {
                        z13 = false;
                        break;
                    }
                    ResolveInfo next13 = it14.next();
                    if (next13.activityInfo.name.equals("com.taobao.agoo.AgooCommondReceiver") && next13.activityInfo.exported) {
                        z13 = true;
                        break;
                    }
                }
                if (!z13) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$7$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct AgooCommondReceiver in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent14 = new Intent();
                intent14.setClassName(context.getPackageName(), "com.umeng.message.NotificationProxyBroadcastReceiver");
                Iterator<ResolveInfo> it15 = context.getPackageManager().queryBroadcastReceivers(intent14, 65536).iterator();
                while (true) {
                    if (!it15.hasNext()) {
                        z14 = false;
                        break;
                    }
                    ResolveInfo next14 = it15.next();
                    if (next14.activityInfo.name.equals("com.umeng.message.NotificationProxyBroadcastReceiver") && TextUtils.equals(next14.activityInfo.processName, context.getPackageName()) && !next14.activityInfo.exported) {
                        z14 = true;
                        break;
                    }
                }
                if (!z14) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$8$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct NotificationProxyBroadcastReceiver in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent15 = new Intent();
                intent15.setPackage(context.getPackageName());
                intent15.setAction("com.umeng.messge.registercallback.action");
                Iterator<ResolveInfo> it16 = context.getPackageManager().queryIntentServices(intent15, 64).iterator();
                while (true) {
                    if (!it16.hasNext()) {
                        z15 = false;
                        break;
                    }
                    ResolveInfo next15 = it16.next();
                    if (next15.serviceInfo.name.equals(UmengMessageCallbackHandlerService.TAG) && TextUtils.equals(context.getPackageName(), next15.serviceInfo.processName) && !next15.serviceInfo.exported) {
                        z15 = true;
                        break;
                    }
                }
                if (!z15) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$9$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct UmengMessageCallbackHandlerService in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent16 = new Intent();
                intent16.setPackage(context.getPackageName());
                intent16.setAction("com.umeng.message.enablecallback.action");
                Iterator<ResolveInfo> it17 = context.getPackageManager().queryIntentServices(intent16, 64).iterator();
                while (true) {
                    if (!it17.hasNext()) {
                        z16 = false;
                        break;
                    }
                    ResolveInfo next16 = it17.next();
                    if (next16.serviceInfo.name.equals(UmengMessageCallbackHandlerService.TAG) && !next16.serviceInfo.exported) {
                        z16 = true;
                        break;
                    }
                }
                if (!z16) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$10$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct UmengMessageCallbackHandlerService in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent17 = new Intent();
                intent17.setPackage(context.getPackageName());
                intent17.setAction("com.umeng.message.disablecallback.action");
                Iterator<ResolveInfo> it18 = context.getPackageManager().queryIntentServices(intent17, 64).iterator();
                while (true) {
                    if (!it18.hasNext()) {
                        z17 = false;
                        break;
                    }
                    ResolveInfo next17 = it18.next();
                    if (next17.serviceInfo.name.equals(UmengMessageCallbackHandlerService.TAG) && !next17.serviceInfo.exported) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$11$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct UmengMessageCallbackHandlerService in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent18 = new Intent();
                intent18.setPackage(context.getPackageName());
                intent18.setAction("com.umeng.message.message.handler.action");
                Iterator<ResolveInfo> it19 = context.getPackageManager().queryIntentServices(intent18, 64).iterator();
                while (true) {
                    if (!it19.hasNext()) {
                        z18 = false;
                        break;
                    }
                    ResolveInfo next18 = it19.next();
                    if (next18.serviceInfo.name.equals(UmengMessageCallbackHandlerService.TAG) && !next18.serviceInfo.exported) {
                        z18 = true;
                        break;
                    }
                }
                if (!z18) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$13$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct UmengMessageCallbackHandlerService in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent19 = new Intent();
                intent19.setClassName(context.getPackageName(), UmengDownloadResourceService.TAG);
                Iterator<ResolveInfo> it20 = context.getPackageManager().queryIntentServices(intent19, 65536).iterator();
                while (true) {
                    if (it20.hasNext()) {
                        if (it20.next().serviceInfo.name.equals(UmengDownloadResourceService.TAG)) {
                            z19 = true;
                            break;
                        }
                    } else {
                        z19 = false;
                        break;
                    }
                }
                if (!z19) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$14$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct UmengDownloadResourceService in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                Intent intent20 = new Intent();
                intent20.setPackage(context.getPackageName());
                intent20.setAction("org.android.agoo.client.MessageReceiverService");
                Iterator<ResolveInfo> it21 = context.getPackageManager().queryIntentServices(intent20, 64).iterator();
                while (true) {
                    if (!it21.hasNext()) {
                        z20 = false;
                        break;
                    }
                    ResolveInfo next19 = it21.next();
                    if (next19.serviceInfo.name.equals("com.umeng.message.UmengMessageIntentReceiverService") && next19.serviceInfo.exported) {
                        String str9 = next19.serviceInfo.processName;
                        if (!TextUtils.isEmpty(str9) && !TextUtils.equals(str9, context.getPackageName())) {
                            z20 = true;
                            break;
                        }
                    }
                }
                if (!z20) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$15$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add or correct UmengMessageIntentReceiverService in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    z33 = false;
                    z32 = false;
                    z31 = false;
                    z30 = false;
                    z29 = false;
                    z28 = false;
                    z27 = false;
                    z26 = false;
                    z25 = false;
                    z24 = false;
                    z23 = false;
                    z22 = false;
                    z21 = false;
                    for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                        if ("android.permission.INTERNET".equals(packageInfo.requestedPermissions[i])) {
                            z33 = true;
                        } else if ("android.permission.ACCESS_WIFI_STATE".equals(packageInfo.requestedPermissions[i])) {
                            z31 = true;
                        } else if ("android.permission.ACCESS_NETWORK_STATE".equals(packageInfo.requestedPermissions[i])) {
                            z32 = true;
                        } else if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(packageInfo.requestedPermissions[i])) {
                            z30 = true;
                        } else if ("android.permission.WAKE_LOCK".equals(packageInfo.requestedPermissions[i])) {
                            z29 = true;
                        } else if ("android.permission.READ_PHONE_STATE".equals(packageInfo.requestedPermissions[i])) {
                            z28 = true;
                        } else if ("android.permission.BROADCAST_PACKAGE_ADDED".equals(packageInfo.requestedPermissions[i])) {
                            z27 = true;
                        } else if ("android.permission.BROADCAST_PACKAGE_CHANGED".equals(packageInfo.requestedPermissions[i])) {
                            z26 = true;
                        } else if ("android.permission.BROADCAST_PACKAGE_INSTALL".equals(packageInfo.requestedPermissions[i])) {
                            z25 = true;
                        } else if ("android.permission.BROADCAST_PACKAGE_REPLACED".equals(packageInfo.requestedPermissions[i])) {
                            z24 = true;
                        } else if ("android.permission.RESTART_PACKAGES".equals(packageInfo.requestedPermissions[i])) {
                            z23 = true;
                        } else if ("android.permission.GET_TASKS".equals(packageInfo.requestedPermissions[i])) {
                            z22 = true;
                        } else if ("android.permission.RECEIVE_BOOT_COMPLETED".equals(packageInfo.requestedPermissions[i])) {
                            z21 = true;
                        }
                    }
                } else {
                    z33 = false;
                    z32 = false;
                    z31 = false;
                    z30 = false;
                    z29 = false;
                    z28 = false;
                    z27 = false;
                    z26 = false;
                    z25 = false;
                    z24 = false;
                    z23 = false;
                    z22 = false;
                    z21 = false;
                }
                if (!(z33 && z31 && z32 && z30 && z29 && z28 && z27 && z26 && z25 && z24 && z23 && z22 && z21)) {
                    handler2.post(new Runnable() {

                        /* renamed from: com.umeng.message.proguard.h$16$_lancet */
                        public class _lancet {
                            private _lancet() {
                            }

                            @TargetClass
                            @Proxy
                            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                if (Build.VERSION.SDK_INT == 25) {
                                    eq.a(toast);
                                }
                                toast.show();
                            }
                        }

                        public final void run() {
                            _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context2, "Please add required permission in AndroidManifest!", 1));
                        }
                    });
                    return false;
                }
                return true;
            }
        } catch (Exception unused) {
        }
    }

    public static String a() {
        return a(new Date());
    }

    public static String b() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static int c() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            i = f81269c.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f81269c.compareAndSet(i, i2));
        return i;
    }

    public static void a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static String a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
            return new String(d.c(byteArrayOutputStream.toByteArray()));
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean c(Context context) {
        if (context.getPackageManager().checkPermission("android.permission.GET_TASKS", context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    public static boolean d(Context context) {
        String a2 = a(context, Process.myPid());
        if (a2 != null) {
            return a2.equals(context.getPackageName());
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return null;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:6:? A[ExcHandler: IOException | StreamCorruptedException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:3:0x0012] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object f(java.lang.String r1) {
        /*
            byte[] r1 = r1.getBytes()
            byte[] r1 = com.umeng.message.proguard.d.h(r1)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{  }
            r1.<init>(r0)     // Catch:{  }
            java.lang.Object r1 = r1.readObject()     // Catch:{ IOException | StreamCorruptedException -> 0x0017, IOException | StreamCorruptedException -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.h.f(java.lang.String):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028 A[SYNTHETIC, Splitter:B:17:0x0028] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(java.io.File r3) throws java.io.IOException {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0024 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0024 }
            r2.<init>(r3)     // Catch:{ all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ all -> 0x0024 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0022 }
            r3.<init>()     // Catch:{ all -> 0x0022 }
        L_0x0010:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x001a
            r3.append(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x0010
        L_0x001a:
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0022 }
            r1.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            return r3
        L_0x0022:
            r3 = move-exception
            goto L_0x0026
        L_0x0024:
            r3 = move-exception
            r1 = r0
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.h.b(java.io.File):java.lang.String");
    }

    public static boolean e(String str) {
        if (d(str)) {
            return false;
        }
        String lowerCase = str.trim().toLowerCase(Locale.US);
        if (lowerCase.startsWith("http://") || lowerCase.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public static List<Ucode> g(String str) throws IOException, ClassNotFoundException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(URLDecoder.decode(str, "UTF-8").getBytes("ISO-8859-1"));
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        List<Ucode> list = (List) objectInputStream.readObject();
        objectInputStream.close();
        byteArrayInputStream.close();
        return list;
    }

    public static String a(File file) {
        byte[] bArr = new byte[1024];
        try {
            if (!file.isFile()) {
                return "";
            }
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return String.format("%1$032x", new Object[]{new BigInteger(1, instance.digest())});
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b2 : digest) {
                stringBuffer.append(Integer.toHexString(b2 & 255));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            UMLog.mutlInfo(f81268b, 2, "getMD5 error");
            return "";
        }
    }

    public static String c(String str) {
        String str2;
        try {
            long longValue = Long.valueOf(str).longValue();
            if (longValue < 1024) {
                str2 = ((int) longValue) + "B";
            } else if (longValue < 1048576) {
                DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                StringBuilder sb = new StringBuilder();
                double d2 = (double) ((float) longValue);
                Double.isNaN(d2);
                sb.append(decimalFormat.format(d2 / 1024.0d));
                sb.append("K");
                str2 = sb.toString();
            } else if (longValue < 1073741824) {
                DecimalFormat decimalFormat2 = new DecimalFormat("#0.00");
                StringBuilder sb2 = new StringBuilder();
                double d3 = (double) ((float) longValue);
                Double.isNaN(d3);
                sb2.append(decimalFormat2.format(d3 / 1048576.0d));
                sb2.append("M");
                str2 = sb2.toString();
            } else {
                DecimalFormat decimalFormat3 = new DecimalFormat("#0.00");
                StringBuilder sb3 = new StringBuilder();
                double d4 = (double) ((float) longValue);
                Double.isNaN(d4);
                sb3.append(decimalFormat3.format(d4 / 1.073741824E9d));
                sb3.append("G");
                str2 = sb3.toString();
            }
            return str2;
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bytes = str.getBytes();
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bytes);
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte valueOf : digest) {
                stringBuffer.append(String.format("%02X", new Object[]{Byte.valueOf(valueOf)}));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return str.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
        }
    }

    public static String a(Date date) {
        if (date == null) {
            return "";
        }
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }

    public static boolean b(Context context) {
        String packageName = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningTasks(1).get(0).topActivity.getPackageName();
        if (packageName == null || !packageName.equals(context.getPackageName())) {
            return false;
        }
        return true;
    }

    public static String a(List<Ucode> list) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        String encode = URLEncoder.encode(byteArrayOutputStream.toString("ISO-8859-1"), "UTF-8");
        objectOutputStream.close();
        byteArrayOutputStream.close();
        return encode;
    }

    public static String a(Context context, int i) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == i) {
                return next.processName;
            }
        }
        return "";
    }

    public static String d(Context context, String str) {
        String str2 = context.getCacheDir() + "/umeng_push_inapp/";
        if (str == null) {
            return str2;
        }
        return str2 + str + "/";
    }

    public static boolean c(Context context, String str) {
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningServices(Integer.MAX_VALUE);
        boolean z = false;
        if (runningServices == null || runningServices.isEmpty()) {
            return false;
        }
        int i = 0;
        while (true) {
            if (i < runningServices.size()) {
                if (runningServices.get(i).service.getClassName().equals(str) && TextUtils.equals(runningServices.get(i).service.getPackageName(), context.getPackageName())) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return z;
    }

    public static String a(Context context, long j) {
        if (j < 1000) {
            return ((int) j) + "B";
        } else if (j < 1000000) {
            StringBuilder sb = new StringBuilder();
            double d2 = (double) ((float) j);
            Double.isNaN(d2);
            sb.append(Math.round(d2 / 1000.0d));
            sb.append("K");
            return sb.toString();
        } else if (j < 1000000000) {
            DecimalFormat decimalFormat = new DecimalFormat("#0.0");
            StringBuilder sb2 = new StringBuilder();
            double d3 = (double) ((float) j);
            Double.isNaN(d3);
            sb2.append(decimalFormat.format(d3 / 1000000.0d));
            sb2.append("M");
            return sb2.toString();
        } else {
            DecimalFormat decimalFormat2 = new DecimalFormat("#0.00");
            StringBuilder sb3 = new StringBuilder();
            double d4 = (double) ((float) j);
            Double.isNaN(d4);
            sb3.append(decimalFormat2.format(d4 / 1.0E9d));
            sb3.append("G");
            return sb3.toString();
        }
    }

    public static void b(final Context context, final Handler handler) {
        MessageSharedPrefs.getInstance(context).setRegisterTimes(MessageSharedPrefs.getInstance(context).getRegisterTimes() + 1);
        if (d(context)) {
            handler.postDelayed(new Runnable() {
                public final void run() {
                    if (MessageSharedPrefs.getInstance(context).getRegisterTimes() <= 1) {
                        UMLog.mutlInfo(h.f81268b, 0, "mPushAgent.register方法应该在主进程和channel进程中都被调用!");
                        UMLog.aq(k.f81298b, 0, "\\|");
                        for (int i = 0; i < 3; i++) {
                            handler.postDelayed(new Runnable() {

                                /* renamed from: com.umeng.message.proguard.h$17$1$_lancet */
                                public class _lancet {
                                    private _lancet() {
                                    }

                                    @TargetClass
                                    @Proxy
                                    static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                                        if (Build.VERSION.SDK_INT == 25) {
                                            eq.a(toast);
                                        }
                                        toast.show();
                                    }
                                }

                                public void run() {
                                    _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(context, "mPushAgent.register方法应该在主进程和channel进程中都被调用!", 1));
                                }
                            }, (long) (i * 3500));
                        }
                    }
                }
            }, 20000);
        }
    }

    public static final void b(Context context, Class<?> cls) {
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (cls != null) {
                    try {
                        ComponentName componentName = new ComponentName(context, cls);
                        if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                            String str = f81268b;
                            UMLog.mutlInfo(str, 2, "rebootReceiver[" + componentName.toString() + "]--->[ENABLED]");
                            packageManager.setComponentEnabledSetting(componentName, 1, 1);
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public static boolean b(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void a(Context context, Class<?> cls) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && packageManager.getApplicationEnabledSetting(context.getPackageName()) >= 0) {
                ComponentName componentName = new ComponentName(context, cls);
                int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
                if (componentEnabledSetting != 1) {
                    if (componentEnabledSetting != 0) {
                        packageManager.setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
