package com.vivo.push.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.vivo.push.b;
import com.vivo.push.util.o;
import com.vivo.push.util.r;
import com.vivo.push.y;
import java.util.List;

public final class a {
    public static void a(Context context, y yVar, String str) {
        String str2;
        String str3;
        try {
            boolean b2 = r.b(context, str);
            if (b2) {
                str2 = "com.vivo.pushclient.action.RECEIVE";
            } else {
                str2 = "com.vivo.pushservice.action.RECEIVE";
            }
            if (TextUtils.isEmpty(str)) {
                o.c(context, "消息接受者包名为空！");
                throw new Exception("消息接受者包名为空！");
            } else if (a(context, str2, str)) {
                if (TextUtils.isEmpty(yVar.a())) {
                    yVar.a(context.getPackageName());
                }
                Intent intent = new Intent();
                intent.setFlags(1048576);
                if (!TextUtils.isEmpty(str2)) {
                    intent.setAction(str2);
                }
                intent.setPackage(str);
                if (b2) {
                    str3 = "com.vivo.push.sdk.service.CommandClientService";
                } else {
                    str3 = "com.vivo.push.sdk.service.CommandService";
                }
                intent.setClassName(str, str3);
                yVar.b(intent);
                intent.putExtra("command_type", "reflect_receiver");
                a(context, intent, b2);
            } else {
                throw new Exception("校验action异常");
            }
        } catch (Exception e2) {
            o.a("CommandBridge", "CommandBridge sendCommandToClient exception", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (r7 == false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.content.Context r16, android.content.Intent r17, boolean r18) throws java.lang.Exception {
        /*
            r1 = r16
            r2 = r17
            if (r1 == 0) goto L_0x00e8
            java.lang.String r0 = r17.getPackage()
            java.lang.String r3 = r16.getPackageName()
            boolean r3 = r3.equals(r0)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0088
            com.vivo.push.cache.b r3 = com.vivo.push.cache.b.a()
            com.vivo.push.cache.e r3 = r3.a(r1)
            if (r3 == 0) goto L_0x002c
            java.lang.String r3 = r3.getSuitTag()
            java.lang.String r6 = "CommandBridge"
            java.lang.String r7 = "get app suit Tag success"
            com.vivo.push.util.o.d(r6, r7)
            goto L_0x0034
        L_0x002c:
            java.lang.String r3 = "CommandBridge"
            java.lang.String r6 = "get app suit Tag is null"
            com.vivo.push.util.o.d(r3, r6)
            r3 = r4
        L_0x0034:
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r3)
            r7 = 0
            if (r6 != 0) goto L_0x005a
            java.lang.String r6 = "0"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0047
        L_0x0045:
            r3 = 1
            goto L_0x005b
        L_0x0047:
            boolean r3 = com.vivo.push.util.j.b()
            if (r3 == 0) goto L_0x0053
            boolean r3 = com.vivo.push.util.y.c(r1, r0)
            if (r3 != 0) goto L_0x0045
        L_0x0053:
            boolean r3 = com.vivo.push.util.j.c()
            if (r3 == 0) goto L_0x005a
            goto L_0x0045
        L_0x005a:
            r3 = 0
        L_0x005b:
            if (r3 != 0) goto L_0x0087
            long r8 = com.vivo.push.util.y.a((android.content.Context) r1, (java.lang.String) r0)
            r10 = 100
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x006f
            r12 = 200(0xc8, double:9.9E-322)
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 >= 0) goto L_0x006f
            long r8 = r8 - r10
            goto L_0x007d
        L_0x006f:
            r10 = 1000(0x3e8, double:4.94E-321)
            long r12 = r8 / r10
            r14 = 2
            long r12 = r12 % r14
            r14 = 1
            int r6 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x007d
            long r8 = r8 - r10
        L_0x007d:
            r10 = 50
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x0084
            r7 = 1
        L_0x0084:
            if (r7 != 0) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r5 = r3
        L_0x0088:
            if (r5 == 0) goto L_0x009e
            r16.startService(r17)     // Catch:{ Exception -> 0x008e }
            return
        L_0x008e:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "CommandBridge"
            java.lang.String r5 = "start service error"
            com.vivo.push.util.o.a(r0, r5, r3)
            r2.setComponent(r4)
            r16.sendBroadcast(r17)
            return
        L_0x009e:
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x00cd }
            r3.<init>()     // Catch:{ Exception -> 0x00cd }
            if (r18 == 0) goto L_0x00b1
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ Exception -> 0x00cd }
            java.lang.Class<com.vivo.push.sdk.LinkProxyClientActivity> r6 = com.vivo.push.sdk.LinkProxyClientActivity.class
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x00cd }
            r5.<init>(r0, r6)     // Catch:{ Exception -> 0x00cd }
            goto L_0x00bc
        L_0x00b1:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ Exception -> 0x00cd }
            java.lang.Class<com.vivo.push.sdk.service.LinkProxyActivity> r6 = com.vivo.push.sdk.service.LinkProxyActivity.class
            java.lang.String r6 = r6.getName()     // Catch:{ Exception -> 0x00cd }
            r5.<init>(r0, r6)     // Catch:{ Exception -> 0x00cd }
        L_0x00bc:
            r3.setComponent(r5)     // Catch:{ Exception -> 0x00cd }
            r0 = 402653184(0x18000000, float:1.6543612E-24)
            r3.addFlags(r0)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r0 = "previous_intent"
            r3.putExtra(r0, r2)     // Catch:{ Exception -> 0x00cd }
            r1.startActivity(r3)     // Catch:{ Exception -> 0x00cd }
            return
        L_0x00cd:
            java.lang.String r0 = "CommandBridge"
            java.lang.String r3 = "start activity error"
            com.vivo.push.util.o.d(r0, r3)
            r16.startService(r17)     // Catch:{ Exception -> 0x00d8 }
            return
        L_0x00d8:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "CommandBridge"
            java.lang.String r5 = "start service error"
            com.vivo.push.util.o.a(r0, r5, r3)
            r2.setComponent(r4)
            r16.sendBroadcast(r17)
            return
        L_0x00e8:
            java.lang.String r0 = "CommandBridge"
            java.lang.String r1 = "enter startLinkProxyActivityOrService context is null"
            com.vivo.push.util.o.d(r0, r1)
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "context is null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.a.a.a(android.content.Context, android.content.Intent, boolean):void");
    }

    public static void a(Context context, String str, y yVar) {
        String str2;
        String str3;
        boolean c2 = yVar.c();
        if (c2) {
            str2 = "com.vivo.vms.upstageservice";
        } else {
            str2 = "com.vivo.vms.aidlservice";
        }
        b a2 = b.a(context, str2);
        boolean a3 = a2.a();
        if (TextUtils.isEmpty(yVar.a())) {
            yVar.a(context.getPackageName());
        }
        if (a3 && !"com.vivo.pushservice".equals(context.getPackageName())) {
            com.vivo.push.a aVar = new com.vivo.push.a(yVar.a(), str, new Bundle());
            yVar.a(aVar);
            if (!a2.a(aVar.b())) {
                o.b("CommandBridge", "send command error by aidl");
                o.c(context, "send command error by aidl");
            } else {
                return;
            }
        }
        Intent intent = new Intent("com.vivo.pushservice.action.METHOD");
        intent.setPackage(str);
        if (c2) {
            str3 = "com.vivo.push.sdk.service.UpstageService";
        } else {
            str3 = "com.vivo.push.sdk.service.PushService";
        }
        intent.setClassName(str, str3);
        yVar.a(intent);
        try {
            a(context, intent, false);
        } catch (Exception e2) {
            o.a("CommandBridge", "CommandBridge startService exception: ", e2);
        }
    }

    private static boolean a(Context context, String str, String str2) {
        Intent intent = new Intent(str);
        intent.setPackage(str2);
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 576);
            if (queryBroadcastReceivers != null) {
                if (queryBroadcastReceivers.size() > 0) {
                    return true;
                }
            }
            o.b("CommandBridge", "action check error：action>>" + str + ";pkgname>>" + str2);
            return false;
        } catch (Exception unused) {
            o.b("CommandBridge", "queryBroadcastReceivers error");
            return false;
        }
    }
}
