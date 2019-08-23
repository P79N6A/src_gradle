package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.aj;
import com.xiaomi.push.az;
import com.xiaomi.push.cv;
import com.xiaomi.push.fz;
import com.xiaomi.push.ik;
import com.xiaomi.push.iu;
import com.xiaomi.push.iw;
import com.xiaomi.push.ix;
import com.xiaomi.push.iy;
import com.xiaomi.push.ja;
import com.xiaomi.push.jb;
import com.xiaomi.push.jg;
import com.xiaomi.push.jj;
import com.xiaomi.push.jn;
import com.xiaomi.push.ju;
import com.xiaomi.push.jv;
import com.xiaomi.push.ka;
import com.xiaomi.push.s;
import com.xiaomi.push.service.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;

public class av {

    /* renamed from: a  reason: collision with root package name */
    private static av f81763a;

    /* renamed from: a  reason: collision with other field name */
    private static Object f98a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private static Queue<String> f99a;

    /* renamed from: a  reason: collision with other field name */
    private Context f100a;

    private av(Context context) {
        this.f100a = context.getApplicationContext();
        if (this.f100a == null) {
            this.f100a = context;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047 A[SYNTHETIC, Splitter:B:14:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent a(android.content.Context r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x0166
            java.lang.String r1 = "notify_effect"
            boolean r1 = r7.containsKey(r1)
            if (r1 != 0) goto L_0x000d
            goto L_0x0166
        L_0x000d:
            java.lang.String r1 = "notify_effect"
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "intent_flag"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ NumberFormatException -> 0x0028 }
            if (r3 != 0) goto L_0x003e
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0028 }
            goto L_0x003f
        L_0x0028:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cause by intent_flag: "
            r3.<init>(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r2)
        L_0x003e:
            r2 = -1
        L_0x003f:
            java.lang.String r3 = com.xiaomi.push.service.ap.f82515a
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x006b
            android.content.pm.PackageManager r7 = r5.getPackageManager()     // Catch:{ Exception -> 0x0052 }
            android.content.Intent r6 = r7.getLaunchIntentForPackage(r6)     // Catch:{ Exception -> 0x0052 }
            r7 = r6
            goto L_0x0136
        L_0x0052:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Cause: "
            r7.<init>(r1)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r6)
        L_0x0068:
            r7 = r0
            goto L_0x0136
        L_0x006b:
            java.lang.String r3 = com.xiaomi.push.service.ap.f82516b
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00c9
            java.lang.String r1 = "intent_uri"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x00aa
            java.lang.String r1 = "intent_uri"
            java.lang.Object r7 = r7.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0068
            r1 = 1
            android.content.Intent r7 = android.content.Intent.parseUri(r7, r1)     // Catch:{ URISyntaxException -> 0x0091 }
            r7.setPackage(r6)     // Catch:{ URISyntaxException -> 0x008f }
            goto L_0x0136
        L_0x008f:
            r6 = move-exception
            goto L_0x0093
        L_0x0091:
            r6 = move-exception
            r7 = r0
        L_0x0093:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Cause: "
            r1.<init>(r3)
            java.lang.String r6 = r6.getMessage()
        L_0x009e:
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r6)
            goto L_0x0136
        L_0x00aa:
            java.lang.String r1 = "class_name"
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x0068
            java.lang.String r1 = "class_name"
            java.lang.Object r7 = r7.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.ComponentName r3 = new android.content.ComponentName
            r3.<init>(r6, r7)
            r1.setComponent(r3)
            r7 = r1
            goto L_0x0136
        L_0x00c9:
            java.lang.String r6 = com.xiaomi.push.service.ap.f82517c
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x0068
            java.lang.String r6 = "web_uri"
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0068
            java.lang.String r6 = r6.trim()
            java.lang.String r7 = "http://"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x00fd
            java.lang.String r7 = "https://"
            boolean r7 = r6.startsWith(r7)
            if (r7 != 0) goto L_0x00fd
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "http://"
            r7.<init>(r1)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        L_0x00fd:
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0127 }
            r7.<init>(r6)     // Catch:{ MalformedURLException -> 0x0127 }
            java.lang.String r7 = r7.getProtocol()     // Catch:{ MalformedURLException -> 0x0127 }
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r7)     // Catch:{ MalformedURLException -> 0x0127 }
            if (r1 != 0) goto L_0x0116
            java.lang.String r1 = "https"
            boolean r7 = r1.equals(r7)     // Catch:{ MalformedURLException -> 0x0127 }
            if (r7 == 0) goto L_0x0068
        L_0x0116:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ MalformedURLException -> 0x0127 }
            java.lang.String r1 = "android.intent.action.VIEW"
            r7.<init>(r1)     // Catch:{ MalformedURLException -> 0x0127 }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ MalformedURLException -> 0x0125 }
            r7.setData(r6)     // Catch:{ MalformedURLException -> 0x0125 }
            goto L_0x0136
        L_0x0125:
            r6 = move-exception
            goto L_0x0129
        L_0x0127:
            r6 = move-exception
            r7 = r0
        L_0x0129:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Cause: "
            r1.<init>(r3)
            java.lang.String r6 = r6.getMessage()
            goto L_0x009e
        L_0x0136:
            if (r7 == 0) goto L_0x0166
            if (r2 < 0) goto L_0x013d
            r7.setFlags(r2)
        L_0x013d:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r7.addFlags(r6)
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ Exception -> 0x0150 }
            r6 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r5 = r5.resolveActivity(r7, r6)     // Catch:{ Exception -> 0x0150 }
            if (r5 == 0) goto L_0x0166
            r0 = r7
            goto L_0x0166
        L_0x0150:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Cause: "
            r6.<init>(r7)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r5)
        L_0x0166:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.av.a(android.content.Context, java.lang.String, java.util.Map):android.content.Intent");
    }

    /* JADX WARNING: type inference failed for: r4v17, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r10v5, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r10v8, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r10v10, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0716, code lost:
        r0.b(r2, r3, r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:?, code lost:
        return com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r11, r12, r13, r15, r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:?, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.xiaomi.mipush.sdk.PushMessageHandler.a a(com.xiaomi.push.jg r20, boolean r21, byte[] r22, java.lang.String r23, int r24) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r0 = r21
            r3 = r22
            r8 = r23
            r9 = r24
            r10 = 0
            android.content.Context r4 = r1.f100a     // Catch:{ v -> 0x0994, ka -> 0x098a }
            com.xiaomi.push.jv r4 = com.xiaomi.mipush.sdk.ar.a((android.content.Context) r4, (com.xiaomi.push.jg) r2)     // Catch:{ v -> 0x0994, ka -> 0x098a }
            if (r4 != 0) goto L_0x0042
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ v -> 0x0994, ka -> 0x098a }
            r0.<init>()     // Catch:{ v -> 0x0994, ka -> 0x098a }
            java.lang.String r3 = "receiving an un-recognized message. "
            r0.append(r3)     // Catch:{ v -> 0x0994, ka -> 0x098a }
            com.xiaomi.push.ik r3 = r2.f691a     // Catch:{ v -> 0x0994, ka -> 0x098a }
            r0.append(r3)     // Catch:{ v -> 0x0994, ka -> 0x098a }
            java.lang.String r0 = r0.toString()     // Catch:{ v -> 0x0994, ka -> 0x098a }
            com.xiaomi.channel.commonutils.logger.b.d(r0)     // Catch:{ v -> 0x0994, ka -> 0x098a }
            android.content.Context r0 = r1.f100a     // Catch:{ v -> 0x0994, ka -> 0x098a }
            com.xiaomi.push.fz r0 = com.xiaomi.push.fz.a((android.content.Context) r0)     // Catch:{ v -> 0x0994, ka -> 0x098a }
            android.content.Context r3 = r1.f100a     // Catch:{ v -> 0x0994, ka -> 0x098a }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ v -> 0x0994, ka -> 0x098a }
            java.lang.String r4 = com.xiaomi.push.fy.a((int) r24)     // Catch:{ v -> 0x0994, ka -> 0x098a }
            java.lang.String r5 = "receiving an un-recognized message."
            r0.b(r3, r4, r8, r5)     // Catch:{ v -> 0x0994, ka -> 0x098a }
            goto L_0x09ae
        L_0x0042:
            com.xiaomi.push.ik r5 = r20.a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "processing a message, action="
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r6)
            int[] r6 = com.xiaomi.mipush.sdk.ax.f81765a
            int r5 = r5.ordinal()
            r5 = r6[r5]
            r6 = 1
            r11 = 0
            r7 = 0
            switch(r5) {
                case 1: goto L_0x071b;
                case 2: goto L_0x066b;
                case 3: goto L_0x0650;
                case 4: goto L_0x0616;
                case 5: goto L_0x05e1;
                case 6: goto L_0x04bb;
                case 7: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x09ae
        L_0x0068:
            android.content.Context r0 = r1.f100a
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r5 = r1.f100a
            com.xiaomi.push.ik r8 = com.xiaomi.push.ik.Notification
            int r3 = r3.length
            com.xiaomi.push.dz.a(r0, r5, r4, r8, r3)
            boolean r0 = r4 instanceof com.xiaomi.push.jb
            if (r0 == 0) goto L_0x0219
            com.xiaomi.push.jb r4 = (com.xiaomi.push.jb) r4
            java.lang.String r0 = r4.a()
            com.xiaomi.push.iu r2 = com.xiaomi.push.iu.DisablePushMessage
            java.lang.String r2 = r2.f570a
            java.lang.String r3 = r4.f656d
            boolean r2 = r2.equalsIgnoreCase(r3)
            r3 = 10
            if (r2 == 0) goto L_0x014d
            long r4 = r4.f649a
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x00ed
            java.lang.Class<com.xiaomi.mipush.sdk.ao> r2 = com.xiaomi.mipush.sdk.ao.class
            monitor-enter(r2)
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x00e8 }
            boolean r2 = r2.a((java.lang.String) r0)     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x00e3
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x00e8 }
            r2.c(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "syncing"
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.bd r3 = com.xiaomi.mipush.sdk.bd.DISABLE_PUSH     // Catch:{ all -> 0x00e8 }
            java.lang.String r2 = r2.a((com.xiaomi.mipush.sdk.bd) r3)     // Catch:{ all -> 0x00e8 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00e3
            android.content.Context r0 = r1.f100a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.ao r0 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r0)     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.bd r2 = com.xiaomi.mipush.sdk.bd.DISABLE_PUSH     // Catch:{ all -> 0x00e8 }
            java.lang.String r3 = "synced"
            r0.a(r2, r3)     // Catch:{ all -> 0x00e8 }
            android.content.Context r0 = r1.f100a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.MiPushClient.clearNotification(r0)     // Catch:{ all -> 0x00e8 }
            android.content.Context r0 = r1.f100a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.MiPushClient.clearLocalNotificationType(r0)     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.PushMessageHandler.a()     // Catch:{ all -> 0x00e8 }
            android.content.Context r0 = r1.f100a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.ay r0 = com.xiaomi.mipush.sdk.ay.a((android.content.Context) r0)     // Catch:{ all -> 0x00e8 }
            r0.b()     // Catch:{ all -> 0x00e8 }
        L_0x00e3:
            java.lang.Class<com.xiaomi.mipush.sdk.ao> r0 = com.xiaomi.mipush.sdk.ao.class
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            goto L_0x09ae
        L_0x00e8:
            r0 = move-exception
            java.lang.Class<com.xiaomi.mipush.sdk.ao> r2 = com.xiaomi.mipush.sdk.ao.class
            monitor-exit(r2)     // Catch:{ all -> 0x00e8 }
            throw r0
        L_0x00ed:
            java.lang.String r2 = "syncing"
            android.content.Context r4 = r1.f100a
            com.xiaomi.mipush.sdk.ao r4 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r4)
            com.xiaomi.mipush.sdk.bd r5 = com.xiaomi.mipush.sdk.bd.DISABLE_PUSH
            java.lang.String r4 = r4.a((com.xiaomi.mipush.sdk.bd) r5)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0142
            java.lang.Class<com.xiaomi.mipush.sdk.ao> r2 = com.xiaomi.mipush.sdk.ao.class
            monitor-enter(r2)
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x013d }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x013d }
            boolean r2 = r2.a((java.lang.String) r0)     // Catch:{ all -> 0x013d }
            if (r2 == 0) goto L_0x0138
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x013d }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x013d }
            int r2 = r2.a((java.lang.String) r0)     // Catch:{ all -> 0x013d }
            if (r2 >= r3) goto L_0x012f
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x013d }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x013d }
            r2.b(r0)     // Catch:{ all -> 0x013d }
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x013d }
            com.xiaomi.mipush.sdk.ay r2 = com.xiaomi.mipush.sdk.ay.a((android.content.Context) r2)     // Catch:{ all -> 0x013d }
            r2.a((boolean) r6, (java.lang.String) r0)     // Catch:{ all -> 0x013d }
            goto L_0x0138
        L_0x012f:
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x013d }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x013d }
            r2.c(r0)     // Catch:{ all -> 0x013d }
        L_0x0138:
            java.lang.Class<com.xiaomi.mipush.sdk.ao> r0 = com.xiaomi.mipush.sdk.ao.class
            monitor-exit(r0)     // Catch:{ all -> 0x013d }
            goto L_0x09ae
        L_0x013d:
            r0 = move-exception
            java.lang.Class<com.xiaomi.mipush.sdk.ao> r2 = com.xiaomi.mipush.sdk.ao.class
            monitor-exit(r2)     // Catch:{ all -> 0x013d }
            throw r0
        L_0x0142:
            android.content.Context r2 = r1.f100a
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)
            r2.c(r0)
            goto L_0x09ae
        L_0x014d:
            com.xiaomi.push.iu r2 = com.xiaomi.push.iu.EnablePushMessage
            java.lang.String r2 = r2.f570a
            java.lang.String r5 = r4.f656d
            boolean r2 = r2.equalsIgnoreCase(r5)
            if (r2 == 0) goto L_0x01f7
            long r4 = r4.f649a
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x01a2
            java.lang.Class<com.xiaomi.mipush.sdk.ao> r2 = com.xiaomi.mipush.sdk.ao.class
            monitor-enter(r2)
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x019d }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x019d }
            boolean r2 = r2.a((java.lang.String) r0)     // Catch:{ all -> 0x019d }
            if (r2 == 0) goto L_0x0198
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x019d }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x019d }
            r2.c(r0)     // Catch:{ all -> 0x019d }
            java.lang.String r0 = "syncing"
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x019d }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x019d }
            com.xiaomi.mipush.sdk.bd r3 = com.xiaomi.mipush.sdk.bd.ENABLE_PUSH     // Catch:{ all -> 0x019d }
            java.lang.String r2 = r2.a((com.xiaomi.mipush.sdk.bd) r3)     // Catch:{ all -> 0x019d }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x019d }
            if (r0 == 0) goto L_0x0198
            android.content.Context r0 = r1.f100a     // Catch:{ all -> 0x019d }
            com.xiaomi.mipush.sdk.ao r0 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r0)     // Catch:{ all -> 0x019d }
            com.xiaomi.mipush.sdk.bd r2 = com.xiaomi.mipush.sdk.bd.ENABLE_PUSH     // Catch:{ all -> 0x019d }
            java.lang.String r3 = "synced"
            r0.a(r2, r3)     // Catch:{ all -> 0x019d }
        L_0x0198:
            java.lang.Class<com.xiaomi.mipush.sdk.ao> r0 = com.xiaomi.mipush.sdk.ao.class
            monitor-exit(r0)     // Catch:{ all -> 0x019d }
            goto L_0x09ae
        L_0x019d:
            r0 = move-exception
            java.lang.Class<com.xiaomi.mipush.sdk.ao> r2 = com.xiaomi.mipush.sdk.ao.class
            monitor-exit(r2)     // Catch:{ all -> 0x019d }
            throw r0
        L_0x01a2:
            java.lang.String r2 = "syncing"
            android.content.Context r4 = r1.f100a
            com.xiaomi.mipush.sdk.ao r4 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r4)
            com.xiaomi.mipush.sdk.bd r5 = com.xiaomi.mipush.sdk.bd.ENABLE_PUSH
            java.lang.String r4 = r4.a((com.xiaomi.mipush.sdk.bd) r5)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0142
            java.lang.Class<com.xiaomi.mipush.sdk.ao> r2 = com.xiaomi.mipush.sdk.ao.class
            monitor-enter(r2)
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x01f2 }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x01f2 }
            boolean r2 = r2.a((java.lang.String) r0)     // Catch:{ all -> 0x01f2 }
            if (r2 == 0) goto L_0x01ed
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x01f2 }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x01f2 }
            int r2 = r2.a((java.lang.String) r0)     // Catch:{ all -> 0x01f2 }
            if (r2 >= r3) goto L_0x01e4
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x01f2 }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x01f2 }
            r2.b(r0)     // Catch:{ all -> 0x01f2 }
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x01f2 }
            com.xiaomi.mipush.sdk.ay r2 = com.xiaomi.mipush.sdk.ay.a((android.content.Context) r2)     // Catch:{ all -> 0x01f2 }
            r2.a((boolean) r7, (java.lang.String) r0)     // Catch:{ all -> 0x01f2 }
            goto L_0x01ed
        L_0x01e4:
            android.content.Context r2 = r1.f100a     // Catch:{ all -> 0x01f2 }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.ao.a((android.content.Context) r2)     // Catch:{ all -> 0x01f2 }
            r2.c(r0)     // Catch:{ all -> 0x01f2 }
        L_0x01ed:
            java.lang.Class<com.xiaomi.mipush.sdk.ao> r0 = com.xiaomi.mipush.sdk.ao.class
            monitor-exit(r0)     // Catch:{ all -> 0x01f2 }
            goto L_0x09ae
        L_0x01f2:
            r0 = move-exception
            java.lang.Class<com.xiaomi.mipush.sdk.ao> r2 = com.xiaomi.mipush.sdk.ao.class
            monitor-exit(r2)     // Catch:{ all -> 0x01f2 }
            throw r0
        L_0x01f7:
            com.xiaomi.push.iu r0 = com.xiaomi.push.iu.ThirdPartyRegUpdate
            java.lang.String r0 = r0.f570a
            java.lang.String r2 = r4.f656d
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0208
            r1.b((com.xiaomi.push.jb) r4)
            goto L_0x09ae
        L_0x0208:
            com.xiaomi.push.iu r0 = com.xiaomi.push.iu.UploadTinyData
            java.lang.String r0 = r0.f570a
            java.lang.String r2 = r4.f656d
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x09ae
            r1.a((com.xiaomi.push.jb) r4)
            goto L_0x09ae
        L_0x0219:
            boolean r0 = r4 instanceof com.xiaomi.push.jj
            if (r0 == 0) goto L_0x09ae
            com.xiaomi.push.jj r4 = (com.xiaomi.push.jj) r4
            java.lang.String r0 = "registration id expired"
            java.lang.String r3 = r4.f715d
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x02b3
            android.content.Context r0 = r1.f100a
            java.util.List r0 = com.xiaomi.mipush.sdk.MiPushClient.getAllAlias(r0)
            android.content.Context r2 = r1.f100a
            java.util.List r2 = com.xiaomi.mipush.sdk.MiPushClient.getAllTopic(r2)
            android.content.Context r3 = r1.f100a
            java.util.List r3 = com.xiaomi.mipush.sdk.MiPushClient.getAllUserAccount(r3)
            android.content.Context r4 = r1.f100a
            java.lang.String r4 = com.xiaomi.mipush.sdk.MiPushClient.getAcceptTime(r4)
            android.content.Context r5 = r1.f100a
            com.xiaomi.push.iy r8 = com.xiaomi.push.iy.RegIdExpired
            com.xiaomi.mipush.sdk.MiPushClient.reInitialize(r5, r8)
            java.util.Iterator r0 = r0.iterator()
        L_0x024c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0263
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            android.content.Context r8 = r1.f100a
            com.xiaomi.mipush.sdk.MiPushClient.removeAlias(r8, r5)
            android.content.Context r8 = r1.f100a
            com.xiaomi.mipush.sdk.MiPushClient.setAlias(r8, r5, r10)
            goto L_0x024c
        L_0x0263:
            java.util.Iterator r0 = r2.iterator()
        L_0x0267:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x027e
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            android.content.Context r5 = r1.f100a
            com.xiaomi.mipush.sdk.MiPushClient.removeTopic(r5, r2)
            android.content.Context r5 = r1.f100a
            com.xiaomi.mipush.sdk.MiPushClient.subscribe(r5, r2, r10)
            goto L_0x0267
        L_0x027e:
            java.util.Iterator r0 = r3.iterator()
        L_0x0282:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0299
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            android.content.Context r3 = r1.f100a
            com.xiaomi.mipush.sdk.MiPushClient.removeAccount(r3, r2)
            android.content.Context r3 = r1.f100a
            com.xiaomi.mipush.sdk.MiPushClient.setUserAccount(r3, r2, r10)
            goto L_0x0282
        L_0x0299:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r4.split(r0)
            int r2 = r0.length
            r3 = 2
            if (r2 != r3) goto L_0x09ae
            android.content.Context r2 = r1.f100a
            com.xiaomi.mipush.sdk.MiPushClient.removeAcceptTime(r2)
            android.content.Context r2 = r1.f100a
            r3 = r0[r7]
            r0 = r0[r6]
            com.xiaomi.mipush.sdk.MiPushClient.addAcceptTime(r2, r3, r0)
            goto L_0x09ae
        L_0x02b3:
            java.lang.String r0 = "client_info_update_ok"
            java.lang.String r3 = r4.f715d
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x02e6
            java.util.Map r0 = r4.a()
            if (r0 == 0) goto L_0x09ae
            java.util.Map r0 = r4.a()
            java.lang.String r2 = "app_version"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x09ae
            java.util.Map r0 = r4.a()
            java.lang.String r2 = "app_version"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r2 = r1.f100a
            com.xiaomi.mipush.sdk.d r2 = com.xiaomi.mipush.sdk.d.a((android.content.Context) r2)
            r2.a((java.lang.String) r0)
            goto L_0x09ae
        L_0x02e6:
            com.xiaomi.push.iu r0 = com.xiaomi.push.iu.AwakeApp
            java.lang.String r0 = r0.f570a
            java.lang.String r3 = r4.f715d
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0337
            boolean r0 = r20.b()
            if (r0 == 0) goto L_0x09ae
            java.util.Map r0 = r4.a()
            if (r0 == 0) goto L_0x09ae
            java.util.Map r0 = r4.a()
            java.lang.String r2 = "awake_info"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x09ae
            java.util.Map r0 = r4.a()
            java.lang.String r2 = "awake_info"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r2 = r1.f100a
            android.content.Context r3 = r1.f100a
            com.xiaomi.mipush.sdk.d r3 = com.xiaomi.mipush.sdk.d.a((android.content.Context) r3)
            java.lang.String r3 = r3.a()
            android.content.Context r4 = r1.f100a
            com.xiaomi.push.service.ag r4 = com.xiaomi.push.service.ag.a((android.content.Context) r4)
            com.xiaomi.push.ip r5 = com.xiaomi.push.ip.AwakeInfoUploadWaySwitch
            int r5 = r5.a()
            int r4 = r4.a((int) r5, (int) r7)
            com.xiaomi.mipush.sdk.p.a((android.content.Context) r2, (java.lang.String) r3, (int) r4, (java.lang.String) r0)
            goto L_0x09ae
        L_0x0337:
            com.xiaomi.push.iu r0 = com.xiaomi.push.iu.NormalClientConfigUpdate
            java.lang.String r0 = r0.f570a
            java.lang.String r2 = r4.f715d
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0360
            com.xiaomi.push.ji r0 = new com.xiaomi.push.ji
            r0.<init>()
            byte[] r2 = r4.a()     // Catch:{ ka -> 0x035a }
            com.xiaomi.push.ju.a(r0, (byte[]) r2)     // Catch:{ ka -> 0x035a }
            android.content.Context r2 = r1.f100a     // Catch:{ ka -> 0x035a }
            com.xiaomi.push.service.ag r2 = com.xiaomi.push.service.ag.a((android.content.Context) r2)     // Catch:{ ka -> 0x035a }
            com.xiaomi.push.service.ah.a((com.xiaomi.push.service.ag) r2, (com.xiaomi.push.ji) r0)     // Catch:{ ka -> 0x035a }
            goto L_0x09ae
        L_0x035a:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)
            goto L_0x09ae
        L_0x0360:
            com.xiaomi.push.iu r0 = com.xiaomi.push.iu.CustomClientConfigUpdate
            java.lang.String r0 = r0.f570a
            java.lang.String r2 = r4.f715d
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0383
            com.xiaomi.push.jh r0 = new com.xiaomi.push.jh
            r0.<init>()
            byte[] r2 = r4.a()     // Catch:{ ka -> 0x035a }
            com.xiaomi.push.ju.a(r0, (byte[]) r2)     // Catch:{ ka -> 0x035a }
            android.content.Context r2 = r1.f100a     // Catch:{ ka -> 0x035a }
            com.xiaomi.push.service.ag r2 = com.xiaomi.push.service.ag.a((android.content.Context) r2)     // Catch:{ ka -> 0x035a }
            com.xiaomi.push.service.ah.a((com.xiaomi.push.service.ag) r2, (com.xiaomi.push.jh) r0)     // Catch:{ ka -> 0x035a }
            goto L_0x09ae
        L_0x0383:
            com.xiaomi.push.iu r0 = com.xiaomi.push.iu.SyncInfoResult
            java.lang.String r0 = r0.f570a
            java.lang.String r2 = r4.f715d
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0396
            android.content.Context r0 = r1.f100a
            com.xiaomi.mipush.sdk.be.a((android.content.Context) r0, (com.xiaomi.push.jj) r4)
            goto L_0x09ae
        L_0x0396:
            com.xiaomi.push.iu r0 = com.xiaomi.push.iu.ForceSync
            java.lang.String r0 = r0.f570a
            java.lang.String r2 = r4.f715d
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x03ae
            java.lang.String r0 = "receive force sync notification"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
            android.content.Context r0 = r1.f100a
            com.xiaomi.mipush.sdk.be.a((android.content.Context) r0, (boolean) r7)
            goto L_0x09ae
        L_0x03ae:
            com.xiaomi.push.iu r0 = com.xiaomi.push.iu.CancelPushMessage
            java.lang.String r0 = r0.f570a
            java.lang.String r2 = r4.f715d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x042c
            java.util.Map r0 = r4.a()
            if (r0 == 0) goto L_0x09ae
            java.util.Map r0 = r4.a()
            java.lang.String r2 = com.xiaomi.push.service.ap.J
            boolean r0 = r0.containsKey(r2)
            r2 = -2
            if (r0 == 0) goto L_0x03e6
            java.util.Map r0 = r4.a()
            java.lang.String r3 = com.xiaomi.push.service.ap.J
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x03e6
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03e5 }
            r2 = r0
            goto L_0x03e6
        L_0x03e5:
        L_0x03e6:
            r0 = -1
            if (r2 < r0) goto L_0x03f0
            android.content.Context r0 = r1.f100a
            com.xiaomi.mipush.sdk.MiPushClient.clearNotification(r0, r2)
            goto L_0x09ae
        L_0x03f0:
            java.lang.String r0 = ""
            java.util.Map r2 = r4.a()
            java.lang.String r3 = com.xiaomi.push.service.ap.H
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x040a
            java.util.Map r0 = r4.a()
            java.lang.String r2 = com.xiaomi.push.service.ap.H
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
        L_0x040a:
            java.util.Map r2 = r4.a()
            java.lang.String r3 = com.xiaomi.push.service.ap.I
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x0423
            java.util.Map r2 = r4.a()
            java.lang.String r3 = com.xiaomi.push.service.ap.I
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0425
        L_0x0423:
            java.lang.String r2 = ""
        L_0x0425:
            android.content.Context r3 = r1.f100a
            com.xiaomi.mipush.sdk.MiPushClient.clearNotification(r3, r0, r2)
            goto L_0x09ae
        L_0x042c:
            com.xiaomi.push.iu r0 = com.xiaomi.push.iu.HybridRegisterResult
            java.lang.String r0 = r0.f570a
            java.lang.String r2 = r4.f715d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x044b
            com.xiaomi.push.jl r0 = new com.xiaomi.push.jl     // Catch:{ ka -> 0x035a }
            r0.<init>()     // Catch:{ ka -> 0x035a }
            byte[] r2 = r4.a()     // Catch:{ ka -> 0x035a }
            com.xiaomi.push.ju.a(r0, (byte[]) r2)     // Catch:{ ka -> 0x035a }
            android.content.Context r2 = r1.f100a     // Catch:{ ka -> 0x035a }
            com.xiaomi.mipush.sdk.MiPushClient4Hybrid.onReceiveRegisterResult(r2, r0)     // Catch:{ ka -> 0x035a }
            goto L_0x09ae
        L_0x044b:
            com.xiaomi.push.iu r0 = com.xiaomi.push.iu.HybridUnregisterResult
            java.lang.String r0 = r0.f570a
            java.lang.String r2 = r4.f715d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x046a
            com.xiaomi.push.jr r0 = new com.xiaomi.push.jr     // Catch:{ ka -> 0x035a }
            r0.<init>()     // Catch:{ ka -> 0x035a }
            byte[] r2 = r4.a()     // Catch:{ ka -> 0x035a }
            com.xiaomi.push.ju.a(r0, (byte[]) r2)     // Catch:{ ka -> 0x035a }
            android.content.Context r2 = r1.f100a     // Catch:{ ka -> 0x035a }
            com.xiaomi.mipush.sdk.MiPushClient4Hybrid.onReceiveUnregisterResult(r2, r0)     // Catch:{ ka -> 0x035a }
            goto L_0x09ae
        L_0x046a:
            com.xiaomi.push.iu r0 = com.xiaomi.push.iu.PushLogUpload
            java.lang.String r0 = r0.f570a
            java.lang.String r2 = r4.f715d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x09ae
            java.util.Map r0 = r4.a()
            if (r0 == 0) goto L_0x09ae
            java.util.Map r0 = r4.a()
            java.lang.String r2 = "packages"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x09ae
            java.util.Map r0 = r4.a()
            java.lang.String r2 = "packages"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2)
            android.content.Context r2 = r1.f100a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = "com.xiaomi.xmsf"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x04b4
            android.content.Context r2 = r1.f100a
            com.xiaomi.mipush.sdk.Logger.uploadLogFile(r2, r6)
            android.content.Context r2 = r1.f100a
            r1.a((android.content.Context) r2, (java.lang.String[]) r0)
            goto L_0x09ae
        L_0x04b4:
            android.content.Context r0 = r1.f100a
            com.xiaomi.mipush.sdk.Logger.uploadLogFile(r0, r7)
            goto L_0x09ae
        L_0x04bb:
            android.content.Context r0 = r1.f100a
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r2 = r1.f100a
            com.xiaomi.push.ik r5 = com.xiaomi.push.ik.Command
            int r3 = r3.length
            com.xiaomi.push.dz.a(r0, r2, r4, r5, r3)
            com.xiaomi.push.jf r4 = (com.xiaomi.push.jf) r4
            java.lang.String r13 = r4.a()
            java.util.List r0 = r4.a()
            long r2 = r4.f679a
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x05cf
            com.xiaomi.push.ge r2 = com.xiaomi.push.ge.COMMAND_SET_ACCEPT_TIME
            java.lang.String r2 = r2.f413a
            boolean r2 = android.text.TextUtils.equals(r13, r2)
            if (r2 == 0) goto L_0x0537
            if (r0 == 0) goto L_0x0537
            int r2 = r0.size()
            if (r2 <= r6) goto L_0x0537
            android.content.Context r2 = r1.f100a
            java.lang.Object r3 = r0.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r0.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.xiaomi.mipush.sdk.MiPushClient.addAcceptTime(r2, r3, r5)
            java.lang.String r2 = "00:00"
            java.lang.Object r3 = r0.get(r7)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x051e
            java.lang.String r2 = "00:00"
            java.lang.Object r3 = r0.get(r6)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x051e
            android.content.Context r2 = r1.f100a
            com.xiaomi.mipush.sdk.d r2 = com.xiaomi.mipush.sdk.d.a((android.content.Context) r2)
            r2.a((boolean) r6)
            goto L_0x0527
        L_0x051e:
            android.content.Context r2 = r1.f100a
            com.xiaomi.mipush.sdk.d r2 = com.xiaomi.mipush.sdk.d.a((android.content.Context) r2)
            r2.a((boolean) r7)
        L_0x0527:
            java.lang.String r2 = "GMT+08"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()
            java.util.List r0 = r1.a((java.util.TimeZone) r2, (java.util.TimeZone) r3, (java.util.List<java.lang.String>) r0)
            goto L_0x05cf
        L_0x0537:
            com.xiaomi.push.ge r2 = com.xiaomi.push.ge.COMMAND_SET_ALIAS
            java.lang.String r2 = r2.f413a
            boolean r2 = android.text.TextUtils.equals(r13, r2)
            if (r2 == 0) goto L_0x0556
            if (r0 == 0) goto L_0x0556
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0556
            android.content.Context r2 = r1.f100a
            java.lang.Object r3 = r0.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            com.xiaomi.mipush.sdk.MiPushClient.addAlias(r2, r3)
            goto L_0x05cf
        L_0x0556:
            com.xiaomi.push.ge r2 = com.xiaomi.push.ge.COMMAND_UNSET_ALIAS
            java.lang.String r2 = r2.f413a
            boolean r2 = android.text.TextUtils.equals(r13, r2)
            if (r2 == 0) goto L_0x0574
            if (r0 == 0) goto L_0x0574
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0574
            android.content.Context r2 = r1.f100a
            java.lang.Object r3 = r0.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            com.xiaomi.mipush.sdk.MiPushClient.removeAlias(r2, r3)
            goto L_0x05cf
        L_0x0574:
            com.xiaomi.push.ge r2 = com.xiaomi.push.ge.COMMAND_SET_ACCOUNT
            java.lang.String r2 = r2.f413a
            boolean r2 = android.text.TextUtils.equals(r13, r2)
            if (r2 == 0) goto L_0x0592
            if (r0 == 0) goto L_0x0592
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0592
            android.content.Context r2 = r1.f100a
            java.lang.Object r3 = r0.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            com.xiaomi.mipush.sdk.MiPushClient.addAccount(r2, r3)
            goto L_0x05cf
        L_0x0592:
            com.xiaomi.push.ge r2 = com.xiaomi.push.ge.COMMAND_UNSET_ACCOUNT
            java.lang.String r2 = r2.f413a
            boolean r2 = android.text.TextUtils.equals(r13, r2)
            if (r2 == 0) goto L_0x05b0
            if (r0 == 0) goto L_0x05b0
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x05b0
            android.content.Context r2 = r1.f100a
            java.lang.Object r3 = r0.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            com.xiaomi.mipush.sdk.MiPushClient.removeAccount(r2, r3)
            goto L_0x05cf
        L_0x05b0:
            com.xiaomi.push.ge r2 = com.xiaomi.push.ge.COMMAND_CHK_VDEVID
            java.lang.String r2 = r2.f413a
            boolean r2 = android.text.TextUtils.equals(r13, r2)
            if (r2 == 0) goto L_0x05cf
            if (r0 == 0) goto L_0x09ae
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x09ae
            android.content.Context r2 = r1.f100a
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            com.xiaomi.push.j.a((android.content.Context) r2, (java.lang.String) r0)
            goto L_0x09ae
        L_0x05cf:
            r14 = r0
            long r2 = r4.f679a
            java.lang.String r0 = r4.f687d
            java.lang.String r18 = r4.b()
            r15 = r2
            r17 = r0
            com.xiaomi.mipush.sdk.MiPushCommandMessage r10 = com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r13, r14, r15, r17, r18)
            goto L_0x09ae
        L_0x05e1:
            com.xiaomi.push.jt r4 = (com.xiaomi.push.jt) r4
            long r2 = r4.f849a
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x05f2
            android.content.Context r0 = r1.f100a
            java.lang.String r2 = r4.a()
            com.xiaomi.mipush.sdk.MiPushClient.removeTopic(r0, r2)
        L_0x05f2:
            java.lang.String r0 = r4.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0608
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r0 = r4.a()
            r10.add(r0)
        L_0x0608:
            r12 = r10
            com.xiaomi.push.ge r0 = com.xiaomi.push.ge.COMMAND_UNSUBSCRIBE_TOPIC
            java.lang.String r11 = r0.f413a
            long r13 = r4.f849a
            java.lang.String r15 = r4.f855d
            java.lang.String r16 = r4.b()
            goto L_0x064a
        L_0x0616:
            com.xiaomi.push.jp r4 = (com.xiaomi.push.jp) r4
            long r2 = r4.f804a
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0627
            android.content.Context r0 = r1.f100a
            java.lang.String r2 = r4.a()
            com.xiaomi.mipush.sdk.MiPushClient.addTopic(r0, r2)
        L_0x0627:
            java.lang.String r0 = r4.a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x063d
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r0 = r4.a()
            r10.add(r0)
        L_0x063d:
            r12 = r10
            com.xiaomi.push.ge r0 = com.xiaomi.push.ge.COMMAND_SUBSCRIBE_TOPIC
            java.lang.String r11 = r0.f413a
            long r13 = r4.f804a
            java.lang.String r15 = r4.f810d
            java.lang.String r16 = r4.b()
        L_0x064a:
            com.xiaomi.mipush.sdk.MiPushCommandMessage r10 = com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r11, r12, r13, r15, r16)
            goto L_0x09ae
        L_0x0650:
            com.xiaomi.push.jr r4 = (com.xiaomi.push.jr) r4
            long r2 = r4.f829a
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0666
            android.content.Context r0 = r1.f100a
            com.xiaomi.mipush.sdk.d r0 = com.xiaomi.mipush.sdk.d.a((android.content.Context) r0)
            r0.a()
            android.content.Context r0 = r1.f100a
            com.xiaomi.mipush.sdk.MiPushClient.clearExtras(r0)
        L_0x0666:
            com.xiaomi.mipush.sdk.PushMessageHandler.a()
            goto L_0x09ae
        L_0x066b:
            r0 = r4
            com.xiaomi.push.jl r0 = (com.xiaomi.push.jl) r0
            android.content.Context r2 = r1.f100a
            com.xiaomi.mipush.sdk.d r2 = com.xiaomi.mipush.sdk.d.a((android.content.Context) r2)
            java.lang.String r2 = r2.f118a
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x06ff
            java.lang.String r3 = r0.a()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L_0x0688
            goto L_0x06ff
        L_0x0688:
            android.content.Context r2 = r1.f100a
            com.xiaomi.mipush.sdk.d r2 = com.xiaomi.mipush.sdk.d.a((android.content.Context) r2)
            r2.f118a = r10
            long r2 = r0.f753a
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x06bf
            android.content.Context r2 = r1.f100a
            com.xiaomi.mipush.sdk.d r2 = com.xiaomi.mipush.sdk.d.a((android.content.Context) r2)
            java.lang.String r3 = r0.f763e
            java.lang.String r4 = r0.f764f
            java.lang.String r5 = r0.f770l
            r2.b(r3, r4, r5)
            android.content.Context r2 = r1.f100a
            com.xiaomi.push.fz r2 = com.xiaomi.push.fz.a((android.content.Context) r2)
            android.content.Context r3 = r1.f100a
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = com.xiaomi.push.fy.a((int) r24)
            r6 = 6006(0x1776, float:8.416E-42)
            java.lang.String r7 = "receive register result success"
        L_0x06b9:
            r5 = r23
            r2.a(r3, r4, r5, r6, r7)
            goto L_0x06d4
        L_0x06bf:
            android.content.Context r2 = r1.f100a
            com.xiaomi.push.fz r2 = com.xiaomi.push.fz.a((android.content.Context) r2)
            android.content.Context r3 = r1.f100a
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = com.xiaomi.push.fy.a((int) r24)
            r6 = 6006(0x1776, float:8.416E-42)
            java.lang.String r7 = "receive register result fail"
            goto L_0x06b9
        L_0x06d4:
            java.lang.String r2 = r0.f763e
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x06e6
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r2 = r0.f763e
            r10.add(r2)
        L_0x06e6:
            r4 = r10
            com.xiaomi.push.ge r2 = com.xiaomi.push.ge.COMMAND_REGISTER
            java.lang.String r3 = r2.f413a
            long r5 = r0.f753a
            java.lang.String r7 = r0.f762d
            r8 = 0
            com.xiaomi.mipush.sdk.MiPushCommandMessage r10 = com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r3, r4, r5, r7, r8)
            android.content.Context r0 = r1.f100a
            com.xiaomi.mipush.sdk.ay r0 = com.xiaomi.mipush.sdk.ay.a((android.content.Context) r0)
            r0.d()
            goto L_0x09ae
        L_0x06ff:
            java.lang.String r0 = "bad Registration result:"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
            android.content.Context r0 = r1.f100a
            com.xiaomi.push.fz r0 = com.xiaomi.push.fz.a((android.content.Context) r0)
            android.content.Context r2 = r1.f100a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = com.xiaomi.push.fy.a((int) r24)
            java.lang.String r4 = "bad Registration result:"
        L_0x0716:
            r0.b(r2, r3, r8, r4)
            goto L_0x09ae
        L_0x071b:
            android.content.Context r5 = r1.f100a
            com.xiaomi.mipush.sdk.d r5 = com.xiaomi.mipush.sdk.d.a((android.content.Context) r5)
            boolean r5 = r5.d()
            if (r5 == 0) goto L_0x0745
            if (r0 != 0) goto L_0x0745
            java.lang.String r0 = "receive a message in pause state. drop it"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
            android.content.Context r0 = r1.f100a
            com.xiaomi.push.fz r0 = com.xiaomi.push.fz.a((android.content.Context) r0)
            android.content.Context r2 = r1.f100a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = com.xiaomi.push.fy.a((int) r24)
            java.lang.String r4 = "receive a message in pause state. drop it"
        L_0x0740:
            r0.a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r4)
            goto L_0x09ae
        L_0x0745:
            com.xiaomi.push.jn r4 = (com.xiaomi.push.jn) r4
            com.xiaomi.push.iw r5 = r4.a()
            if (r5 != 0) goto L_0x0765
            java.lang.String r0 = "receive an empty message without push content, drop it"
            com.xiaomi.channel.commonutils.logger.b.d(r0)
            android.content.Context r0 = r1.f100a
            com.xiaomi.push.fz r0 = com.xiaomi.push.fz.a((android.content.Context) r0)
            android.content.Context r2 = r1.f100a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = com.xiaomi.push.fy.a((int) r24)
            java.lang.String r4 = "receive an empty message without push content, drop it"
            goto L_0x0716
        L_0x0765:
            if (r0 == 0) goto L_0x0792
            boolean r6 = com.xiaomi.push.service.z.a((com.xiaomi.push.jg) r20)
            if (r6 == 0) goto L_0x0781
            android.content.Context r6 = r1.f100a
            java.lang.String r7 = r5.a()
            com.xiaomi.push.ix r13 = r20.a()
            java.lang.String r14 = r2.f698b
            java.lang.String r15 = r5.b()
            com.xiaomi.mipush.sdk.MiPushClient.reportIgnoreRegMessageClicked(r6, r7, r13, r14, r15)
            goto L_0x0792
        L_0x0781:
            android.content.Context r6 = r1.f100a
            java.lang.String r7 = r5.a()
            com.xiaomi.push.ix r13 = r20.a()
            java.lang.String r14 = r5.b()
            com.xiaomi.mipush.sdk.MiPushClient.reportMessageClicked(r6, r7, r13, r14)
        L_0x0792:
            if (r0 != 0) goto L_0x07d7
            java.lang.String r6 = r4.d()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x07b6
            android.content.Context r6 = r1.f100a
            java.lang.String r7 = r4.d()
            long r6 = com.xiaomi.mipush.sdk.MiPushClient.aliasSetTime(r6, r7)
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x07b6
            android.content.Context r6 = r1.f100a
            java.lang.String r7 = r4.d()
            com.xiaomi.mipush.sdk.MiPushClient.addAlias(r6, r7)
            goto L_0x07d7
        L_0x07b6:
            java.lang.String r6 = r4.c()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x07d7
            android.content.Context r6 = r1.f100a
            java.lang.String r7 = r4.c()
            long r6 = com.xiaomi.mipush.sdk.MiPushClient.topicSubscribedTime(r6, r7)
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x07d7
            android.content.Context r6 = r1.f100a
            java.lang.String r7 = r4.c()
            com.xiaomi.mipush.sdk.MiPushClient.addTopic(r6, r7)
        L_0x07d7:
            com.xiaomi.push.ix r6 = r2.f692a
            if (r6 == 0) goto L_0x07f0
            com.xiaomi.push.ix r6 = r2.f692a
            java.util.Map r6 = r6.a()
            if (r6 == 0) goto L_0x07f0
            com.xiaomi.push.ix r6 = r2.f692a
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f605a
            java.lang.String r7 = "jobkey"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x07f1
        L_0x07f0:
            r6 = r10
        L_0x07f1:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x07fb
            java.lang.String r6 = r5.a()
        L_0x07fb:
            if (r0 != 0) goto L_0x0839
            android.content.Context r7 = r1.f100a
            boolean r7 = a((android.content.Context) r7, (java.lang.String) r6)
            if (r7 == 0) goto L_0x0839
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "drop a duplicate message, key="
            r3.<init>(r5)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r3)
            android.content.Context r3 = r1.f100a
            com.xiaomi.push.fz r3 = com.xiaomi.push.fz.a((android.content.Context) r3)
            android.content.Context r5 = r1.f100a
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r7 = com.xiaomi.push.fy.a((int) r24)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "drop a duplicate message, key="
            r9.<init>(r11)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r3.c(r5, r7, r8, r6)
            goto L_0x097e
        L_0x0839:
            com.xiaomi.push.ix r7 = r20.a()
            com.xiaomi.mipush.sdk.MiPushMessage r7 = com.xiaomi.mipush.sdk.PushMessageHelper.generateMessage(r4, r7, r0)
            int r11 = r7.getPassThrough()
            if (r11 != 0) goto L_0x085a
            if (r0 != 0) goto L_0x085a
            java.util.Map r11 = r7.getExtra()
            boolean r11 = com.xiaomi.push.service.z.a((java.util.Map<java.lang.String, java.lang.String>) r11)
            if (r11 == 0) goto L_0x085a
            android.content.Context r0 = r1.f100a
            com.xiaomi.push.service.z.a((android.content.Context) r0, (com.xiaomi.push.jg) r2, (byte[]) r3)
            goto L_0x09ae
        L_0x085a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r11 = "receive a message, msgid="
            r3.<init>(r11)
            java.lang.String r11 = r5.a()
            r3.append(r11)
            java.lang.String r11 = ", jobkey="
            r3.append(r11)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r3)
            if (r0 == 0) goto L_0x097d
            java.util.Map r3 = r7.getExtra()
            if (r3 == 0) goto L_0x097d
            java.util.Map r3 = r7.getExtra()
            java.lang.String r6 = "notify_effect"
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x097d
            java.util.Map r0 = r7.getExtra()
            java.lang.String r3 = "notify_effect"
            java.lang.Object r3 = r0.get(r3)
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            boolean r3 = com.xiaomi.push.service.z.a((com.xiaomi.push.jg) r20)
            if (r3 == 0) goto L_0x0906
            android.content.Context r3 = r1.f100a
            java.lang.String r2 = r2.f698b
            android.content.Intent r0 = a((android.content.Context) r3, (java.lang.String) r2, (java.util.Map) r0)
            java.lang.String r2 = "eventMessageType"
            r0.putExtra(r2, r9)
            java.lang.String r2 = "messageId"
            r0.putExtra(r2, r8)
            if (r0 != 0) goto L_0x08cb
            java.lang.String r0 = "Getting Intent fail from ignore reg message. "
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
            android.content.Context r0 = r1.f100a
            com.xiaomi.push.fz r0 = com.xiaomi.push.fz.a((android.content.Context) r0)
            android.content.Context r2 = r1.f100a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = com.xiaomi.push.fy.a((int) r24)
            java.lang.String r4 = "Getting Intent fail from ignore reg message."
            goto L_0x0716
        L_0x08cb:
            java.lang.String r2 = r5.c()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x08da
            java.lang.String r3 = "payload"
            r0.putExtra(r3, r2)
        L_0x08da:
            android.content.Context r2 = r1.f100a
            r2.startActivity(r0)
            android.content.Context r0 = r1.f100a
            com.xiaomi.push.fz r2 = com.xiaomi.push.fz.a((android.content.Context) r0)
            android.content.Context r0 = r1.f100a
            java.lang.String r3 = r0.getPackageName()
            java.lang.String r4 = com.xiaomi.push.fy.a((int) r24)
            r6 = 3006(0xbbe, float:4.212E-42)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "business message is clicked typeId "
            r0.<init>(r5)
            r0.append(r11)
            java.lang.String r7 = r0.toString()
            r5 = r23
            r2.a(r3, r4, r5, r6, r7)
            goto L_0x09ae
        L_0x0906:
            android.content.Context r2 = r1.f100a
            android.content.Context r3 = r1.f100a
            java.lang.String r3 = r3.getPackageName()
            android.content.Intent r0 = a((android.content.Context) r2, (java.lang.String) r3, (java.util.Map) r0)
            if (r0 == 0) goto L_0x09ae
            java.lang.String r2 = com.xiaomi.push.service.ap.f82517c
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x092b
            java.lang.String r2 = "key_message"
            r0.putExtra(r2, r7)
            java.lang.String r2 = "eventMessageType"
            r0.putExtra(r2, r9)
            java.lang.String r2 = "messageId"
            r0.putExtra(r2, r8)
        L_0x092b:
            android.content.Context r2 = r1.f100a
            r2.startActivity(r0)
            android.content.Context r0 = r1.f100a
            com.xiaomi.push.fz r2 = com.xiaomi.push.fz.a((android.content.Context) r0)
            android.content.Context r0 = r1.f100a
            java.lang.String r3 = r0.getPackageName()
            java.lang.String r4 = com.xiaomi.push.fy.a((int) r24)
            r6 = 1006(0x3ee, float:1.41E-42)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "notification message is clicked typeId "
            r0.<init>(r5)
            r0.append(r11)
            java.lang.String r7 = r0.toString()
            r5 = r23
            r2.a(r3, r4, r5, r6, r7)
            java.lang.String r0 = com.xiaomi.push.service.ap.f82517c
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x09ae
            android.content.Context r0 = r1.f100a
            com.xiaomi.push.fz r0 = com.xiaomi.push.fz.a((android.content.Context) r0)
            android.content.Context r2 = r1.f100a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = com.xiaomi.push.fy.a((int) r24)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "try open web page typeId "
            r4.<init>(r5)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            goto L_0x0740
        L_0x097d:
            r10 = r7
        L_0x097e:
            com.xiaomi.push.ix r3 = r20.a()
            if (r3 != 0) goto L_0x09ae
            if (r0 != 0) goto L_0x09ae
            r1.a((com.xiaomi.push.jn) r4, (com.xiaomi.push.jg) r2)
            goto L_0x09ae
        L_0x098a:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)
            java.lang.String r2 = "receive a message which action string is not valid. is the reg expired?"
            com.xiaomi.channel.commonutils.logger.b.d(r2)
            goto L_0x099b
        L_0x0994:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r0)
            r19.a((com.xiaomi.push.jg) r20)
        L_0x099b:
            android.content.Context r2 = r1.f100a
            com.xiaomi.push.fz r2 = com.xiaomi.push.fz.a((android.content.Context) r2)
            android.content.Context r3 = r1.f100a
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = com.xiaomi.push.fy.a((int) r24)
            r2.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r8, (java.lang.Throwable) r0)
        L_0x09ae:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.av.a(com.xiaomi.push.jg, boolean, byte[], java.lang.String, int):com.xiaomi.mipush.sdk.PushMessageHandler$a");
    }

    private PushMessageHandler.a a(jg jgVar, byte[] bArr) {
        String str;
        String str2 = null;
        try {
            jv a2 = ar.a(this.f100a, jgVar);
            if (a2 == null) {
                b.d("message arrived: receiving an un-recognized message. " + jgVar.f691a);
                return null;
            }
            ik a3 = jgVar.a();
            b.a("message arrived: processing an arrived message, action=" + a3);
            if (ax.f81765a[a3.ordinal()] != 1) {
                return null;
            }
            jn jnVar = (jn) a2;
            iw a4 = jnVar.a();
            if (a4 == null) {
                str = "message arrived: receive an empty message without push content, drop it";
                b.d(str);
                return null;
            }
            if (!(jgVar.f692a == null || jgVar.f692a.a() == null)) {
                str2 = jgVar.f692a.f605a.get("jobkey");
            }
            MiPushMessage generateMessage = PushMessageHelper.generateMessage(jnVar, jgVar.a(), false);
            generateMessage.setArrivedMessage(true);
            b.a("message arrived: receive a message, msgid=" + a4.a() + ", jobkey=" + str2);
            return generateMessage;
        } catch (v e2) {
            b.a((Throwable) e2);
            str = "message arrived: receive a message but decrypt failed. report when click.";
        } catch (ka e3) {
            b.a((Throwable) e3);
            str = "message arrived: receive a message which action string is not valid. is the reg expired?";
        }
    }

    public static av a(Context context) {
        if (f81763a == null) {
            f81763a = new av(context);
        }
        return f81763a;
    }

    private void a() {
        SharedPreferences a2 = c.a(this.f100a, "mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - a2.getLong("last_reinitialize", 0)) > 1800000) {
            MiPushClient.reInitialize(this.f100a, iy.PackageUnregistered);
            a2.edit().putLong("last_reinitialize", currentTimeMillis).commit();
        }
    }

    /* access modifiers changed from: private */
    public void a(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            int length = serviceInfoArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                ServiceInfo serviceInfo = serviceInfoArr[i];
                if (!serviceInfo.exported || !serviceInfo.enabled || !"com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) || context.getPackageName().equals(serviceInfo.packageName)) {
                    i++;
                } else {
                    try {
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.SYNC_LOG");
                        PushMessageHandler.a(context, intent);
                        break;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void a(Context context, String str) {
        synchronized (f98a) {
            f99a.remove(str);
            d.a(context);
            SharedPreferences a2 = d.a(context);
            String a3 = az.a((Collection<?>) f99a, ",");
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("pref_msg_ids", a3);
            s.a(edit);
        }
    }

    private void a(Context context, String[] strArr) {
        aj.a(context).a((Runnable) new aw(this, strArr, context));
    }

    private void a(jb jbVar) {
        String a2 = jbVar.a();
        b.b("receive ack " + a2);
        Map a3 = jbVar.a();
        if (a3 != null) {
            String str = (String) a3.get("real_source");
            if (!TextUtils.isEmpty(str)) {
                b.b("receive ack : messageId = " + a2 + "  realSource = " + str);
                cv.a(this.f100a).a(a2, str, Boolean.valueOf(jbVar.f649a == 0));
            }
        }
    }

    private void a(jg jgVar) {
        b.a("receive a message but decrypt failed. report now.");
        jj jjVar = new jj(jgVar.a().f603a, false);
        jjVar.c(iu.DecryptMessageFail.f570a);
        jjVar.b(jgVar.a());
        jjVar.d(jgVar.f698b);
        jjVar.f710a = new HashMap();
        jjVar.f710a.put("regid", MiPushClient.getRegId(this.f100a));
        ay.a(this.f100a).a(jjVar, ik.Notification, false, (ix) null);
    }

    private void a(jn jnVar, jg jgVar) {
        ix a2 = jgVar.a();
        ja jaVar = new ja();
        jaVar.b(jnVar.b());
        jaVar.a(jnVar.a());
        jaVar.a(jnVar.a().a());
        if (!TextUtils.isEmpty(jnVar.c())) {
            jaVar.c(jnVar.c());
        }
        if (!TextUtils.isEmpty(jnVar.d())) {
            jaVar.d(jnVar.d());
        }
        jaVar.a(ju.a(this.f100a, jgVar));
        ay.a(this.f100a).a(jaVar, ik.AckMessage, a2);
    }

    private void a(String str, long j, f fVar) {
        bd a2 = m.a(fVar);
        if (a2 != null) {
            if (j == 0) {
                synchronized (ao.class) {
                    try {
                        if (ao.a(this.f100a).a(str)) {
                            ao.a(this.f100a).c(str);
                            if ("syncing".equals(ao.a(this.f100a).a(a2))) {
                                ao.a(this.f100a).a(a2, "synced");
                            }
                        }
                    } catch (Throwable th) {
                        Class<ao> cls = ao.class;
                        throw th;
                    }
                }
            } else if ("syncing".equals(ao.a(this.f100a).a(a2))) {
                synchronized (ao.class) {
                    try {
                        if (ao.a(this.f100a).a(str)) {
                            if (ao.a(this.f100a).a(str) < 10) {
                                ao.a(this.f100a).b(str);
                                ay.a(this.f100a).a(str, a2, fVar);
                            } else {
                                ao.a(this.f100a).c(str);
                            }
                        }
                    } catch (Throwable th2) {
                        Class<ao> cls2 = ao.class;
                        throw th2;
                    }
                }
            } else {
                ao.a(this.f100a).c(str);
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m38a(Context context, String str) {
        synchronized (f98a) {
            d.a(context);
            SharedPreferences a2 = d.a(context);
            if (f99a == null) {
                String[] split = a2.getString("pref_msg_ids", "").split(",");
                f99a = new LinkedList();
                for (String add : split) {
                    f99a.add(add);
                }
            }
            if (f99a.contains(str)) {
                return true;
            }
            f99a.add(str);
            if (f99a.size() > 25) {
                f99a.poll();
            }
            String a3 = az.a((Collection<?>) f99a, ",");
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("pref_msg_ids", a3);
            s.a(edit);
            return false;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m39a(jg jgVar) {
        if (!TextUtils.equals("com.miui.hybrid", jgVar.b()) && !TextUtils.equals("com.miui.hybrid.loader", jgVar.b())) {
            return false;
        }
        Map a2 = jgVar.a() == null ? null : jgVar.a().a();
        if (a2 == null) {
            return false;
        }
        String str = (String) a2.get("push_server_action");
        return TextUtils.equals(str, "hybrid_message") || TextUtils.equals(str, "platform_message");
    }

    private void b(jb jbVar) {
        long j;
        f fVar;
        b.c("ASSEMBLE_PUSH : " + jbVar.toString());
        String a2 = jbVar.a();
        Map a3 = jbVar.a();
        if (a3 != null) {
            String str = (String) a3.get("RegInfo");
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("brand:" + ap.FCM.name())) {
                    b.a("ASSEMBLE_PUSH : receive fcm token sync ack");
                    j.b(this.f100a, f.ASSEMBLE_PUSH_FCM, str);
                    a(a2, jbVar.f649a, f.ASSEMBLE_PUSH_FCM);
                } else {
                    if (str.contains("brand:" + ap.HUAWEI.name())) {
                        b.a("ASSEMBLE_PUSH : receive hw token sync ack");
                        j.b(this.f100a, f.ASSEMBLE_PUSH_HUAWEI, str);
                        j = jbVar.f649a;
                        fVar = f.ASSEMBLE_PUSH_HUAWEI;
                    } else {
                        if (str.contains("brand:" + ap.OPPO.name())) {
                            b.a("ASSEMBLE_PUSH : receive COS token sync ack");
                            j.b(this.f100a, f.ASSEMBLE_PUSH_COS, str);
                            j = jbVar.f649a;
                            fVar = f.ASSEMBLE_PUSH_COS;
                        } else {
                            if (str.contains("brand:" + ap.VIVO.name())) {
                                b.a("ASSEMBLE_PUSH : receive FTOS token sync ack");
                                j.b(this.f100a, f.ASSEMBLE_PUSH_FTOS, str);
                                j = jbVar.f649a;
                                fVar = f.ASSEMBLE_PUSH_FTOS;
                            }
                        }
                    }
                    a(a2, j, fVar);
                }
            }
        }
    }

    private void b(jg jgVar) {
        ix a2 = jgVar.a();
        ja jaVar = new ja();
        jaVar.b(jgVar.a());
        jaVar.a(a2.a());
        jaVar.a(a2.a());
        if (!TextUtils.isEmpty(a2.b())) {
            jaVar.c(a2.b());
        }
        jaVar.a(ju.a(this.f100a, jgVar));
        ay.a(this.f100a).a(jaVar, ik.AckMessage, false, jgVar.a());
    }

    public PushMessageHandler.a a(Intent intent) {
        String str;
        String str2;
        fz a2;
        String packageName;
        String format;
        String action = intent.getAction();
        b.a("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        MiPushCommandMessage miPushCommandMessage = null;
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                b.d("receiving an empty message, drop");
                fz.a(this.f100a).a(this.f100a.getPackageName(), intent, "receiving an empty message, drop");
                return null;
            }
            jg jgVar = new jg();
            try {
                ju.a(jgVar, byteArrayExtra);
                d a3 = d.a(this.f100a);
                ix a4 = jgVar.a();
                if (jgVar.a() == ik.SendMessage && a4 != null && !a3.d() && !booleanExtra) {
                    a4.a("mrt", stringExtra);
                    a4.a("mat", Long.toString(System.currentTimeMillis()));
                    if (!a(jgVar)) {
                        b(jgVar);
                    } else {
                        b.b("this is a mina's message, ack later");
                        a4.a("__hybrid_message_ts", String.valueOf(a4.a()));
                        a4.a("__hybrid_device_status", String.valueOf(ju.a(this.f100a, jgVar)));
                    }
                }
                if (jgVar.a() == ik.SendMessage && !jgVar.b()) {
                    if (!z.a(jgVar)) {
                        b.a(String.format("drop an un-encrypted messages. %1$s, %2$s", new Object[]{jgVar.b(), a4 != null ? a4.a() : ""}));
                        a2 = fz.a(this.f100a);
                        packageName = this.f100a.getPackageName();
                        format = String.format("drop an un-encrypted messages. %1$s, %2$s", new Object[]{jgVar.b(), a4 != null ? a4.a() : ""});
                    } else if (!booleanExtra || a4.a() == null || !a4.a().containsKey("notify_effect")) {
                        b.a(String.format("drop an un-encrypted messages. %1$s, %2$s", new Object[]{jgVar.b(), a4.a()}));
                        a2 = fz.a(this.f100a);
                        packageName = this.f100a.getPackageName();
                        format = String.format("drop an un-encrypted messages. %1$s, %2$s", new Object[]{jgVar.b(), a4 != null ? a4.a() : ""});
                    }
                    a2.a(packageName, intent, format);
                    return null;
                }
                if (a3.c() || jgVar.f691a == ik.Registration) {
                    if (a3.c() && a3.e()) {
                        if (jgVar.f691a == ik.UnRegistration) {
                            a3.a();
                            MiPushClient.clearExtras(this.f100a);
                            PushMessageHandler.a();
                            return null;
                        }
                        MiPushClient.unregisterPush(this.f100a);
                        return null;
                    }
                } else if (!z.a(jgVar)) {
                    b.d("receive message without registration. need re-register!");
                    fz.a(this.f100a).a(this.f100a.getPackageName(), intent, "receive message without registration. need re-register!");
                    a();
                    return null;
                }
                return a(jgVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra);
            } catch (ka | Exception e2) {
                fz.a(this.f100a).a(this.f100a.getPackageName(), intent, e2);
                b.a(e2);
                return null;
            }
        } else {
            if ("com.xiaomi.mipush.ERROR".equals(action)) {
                miPushCommandMessage = new MiPushCommandMessage();
                jg jgVar2 = new jg();
                try {
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                    if (byteArrayExtra2 != null) {
                        ju.a(jgVar2, byteArrayExtra2);
                    }
                } catch (ka unused) {
                }
                miPushCommandMessage.setCommand(String.valueOf(jgVar2.a()));
                miPushCommandMessage.setResultCode((long) intent.getIntExtra("mipush_error_code", 0));
                miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
                str = "receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg");
            } else if (!"com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
                return null;
            } else {
                byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra3 == null) {
                    str = "message arrived: receiving an empty message, drop";
                } else {
                    jg jgVar3 = new jg();
                    try {
                        ju.a(jgVar3, byteArrayExtra3);
                        d a5 = d.a(this.f100a);
                        if (z.a(jgVar3)) {
                            str2 = "message arrived: receive ignore reg message, ignore!";
                        } else if (!a5.c()) {
                            str2 = "message arrived: receive message without registration. need unregister or re-register!";
                        } else if (!a5.c() || !a5.e()) {
                            return a(jgVar3, byteArrayExtra3);
                        } else {
                            str2 = "message arrived: app info is invalidated";
                        }
                        b.d(str2);
                        return null;
                    } catch (ka | Exception e3) {
                        b.a(e3);
                        return null;
                    }
                }
            }
            b.d(str);
            return miPushCommandMessage;
        }
    }

    public List<String> a(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        List<String> list2 = list;
        if (timeZone.equals(timeZone2)) {
            return list2;
        }
        long rawOffset = (long) (((timeZone.getRawOffset() - timeZone2.getRawOffset()) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) / 60);
        long parseLong = Long.parseLong(list2.get(0).split(":")[0]);
        long parseLong2 = Long.parseLong(list2.get(0).split(":")[1]);
        long j = ((((parseLong * 60) + parseLong2) - rawOffset) + 1440) % 1440;
        long parseLong3 = (((Long.parseLong(list2.get(1).split(":")[1]) + (Long.parseLong(list2.get(1).split(":")[0]) * 60)) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}));
        arrayList.add(String.format("%1$02d:%2$02d", new Object[]{Long.valueOf(parseLong3 / 60), Long.valueOf(parseLong3 % 60)}));
        return arrayList;
    }
}
