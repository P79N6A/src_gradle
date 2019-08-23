package com.ss.android.downloadlib.core.download;

import android.app.Service;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import com.ss.android.downloadlib.addownload.AdDownloadDeleteActivity;

public class DownloadHandlerService extends Service {

    /* renamed from: a  reason: collision with root package name */
    q f28903a;

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
    }

    private static void a(Context context, long j) {
        m.a(context, j, 268435456);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r28, int r29, int r30) {
        /*
            r27 = this;
            r9 = r27
            r2 = r28
            super.onStartCommand(r28, r29, r30)
            com.ss.android.downloadlib.core.download.q r0 = r9.f28903a
            if (r0 != 0) goto L_0x0011
            com.ss.android.downloadlib.core.download.n r0 = com.ss.android.downloadlib.core.download.n.a((android.content.Context) r27)
            r9.f28903a = r0
        L_0x0011:
            java.lang.String r0 = r28.getAction()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r10 = 2
            if (r1 != 0) goto L_0x0119
            java.lang.String r1 = "status"
            r3 = -1
            int r16 = r2.getIntExtra(r1, r3)
            java.lang.String r1 = "time_cost"
            r4 = 0
            long r17 = r2.getLongExtra(r1, r4)
            int r1 = r0.hashCode()
            r4 = 0
            r5 = 1
            switch(r1) {
                case -1462061628: goto L_0x0067;
                case -1461846324: goto L_0x005d;
                case -704888403: goto L_0x0053;
                case -212078405: goto L_0x0049;
                case -164658367: goto L_0x003f;
                case 1916206374: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x0071
        L_0x0035:
            java.lang.String r1 = "android.ss.intent.action.DOWNLOAD_CLICK"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 4
            goto L_0x0072
        L_0x003f:
            java.lang.String r1 = "android.ss.intent.action.DOWNLOAD_WAKEUP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 0
            goto L_0x0072
        L_0x0049:
            java.lang.String r1 = "android.ss.intent.action.DOWNLOAD_COMPLETE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 5
            goto L_0x0072
        L_0x0053:
            java.lang.String r1 = "android.ss.intent.action.DOWNLOAD_DELETE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 2
            goto L_0x0072
        L_0x005d:
            java.lang.String r1 = "android.ss.intent.action.DOWNLOAD_OPEN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 1
            goto L_0x0072
        L_0x0067:
            java.lang.String r1 = "android.ss.intent.action.DOWNLOAD_HIDE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0071
            r0 = 3
            goto L_0x0072
        L_0x0071:
            r0 = -1
        L_0x0072:
            switch(r0) {
                case 0: goto L_0x0116;
                case 1: goto L_0x0108;
                case 2: goto L_0x0108;
                case 3: goto L_0x0108;
                case 4: goto L_0x00ce;
                case 5: goto L_0x0077;
                default: goto L_0x0075;
            }
        L_0x0075:
            goto L_0x0119
        L_0x0077:
            java.lang.String r0 = "extra_download_id"
            r6 = -1
            long r12 = r2.getLongExtra(r0, r6)
            com.ss.android.downloadlib.core.download.e r0 = com.ss.android.downloadlib.core.download.e.a((android.content.Context) r27)
            boolean r0 = r0.b((long) r12)
            if (r0 != 0) goto L_0x0119
            java.lang.String r0 = "extra_download_visibility"
            int r0 = r2.getIntExtra(r0, r5)
            int r1 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0119
            if (r0 == r10) goto L_0x0119
            com.ss.android.download.api.config.c r0 = com.ss.android.downloadlib.addownload.k.k()
            if (r0 == 0) goto L_0x00a3
            com.ss.android.download.api.config.c r0 = com.ss.android.downloadlib.addownload.k.k()
            boolean r4 = r0.a()
        L_0x00a3:
            if (r4 != 0) goto L_0x00aa
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            com.ss.android.downloadlib.core.download.m.a((android.content.Context) r9, (long) r12, (int) r0)
        L_0x00aa:
            java.lang.String r0 = "extra_app_package"
            java.lang.String r15 = r2.getStringExtra(r0)
            boolean r0 = com.ss.android.download.api.a.a.C0337a.a(r16)
            if (r0 == 0) goto L_0x00bf
            com.ss.android.downloadlib.core.download.l r11 = com.ss.android.downloadlib.core.download.k.a()
            r14 = 1
            r11.a(r12, r14, r15, r16, r17)
            goto L_0x0119
        L_0x00bf:
            boolean r0 = com.ss.android.download.api.a.a.C0337a.b(r16)
            if (r0 == 0) goto L_0x0119
            com.ss.android.downloadlib.core.download.l r11 = com.ss.android.downloadlib.core.download.k.a()
            r14 = 5
            r11.a(r12, r14, r15, r16, r17)
            goto L_0x0119
        L_0x00ce:
            android.net.Uri r0 = r28.getData()
            long r3 = android.content.ContentUris.parseId(r0)
            java.lang.String r0 = "extra_notification_tag"
            java.lang.String r7 = r2.getStringExtra(r0)
            android.net.Uri r0 = com.ss.android.downloadlib.core.download.j.a.f29029a
            android.net.Uri r22 = android.content.ContentUris.withAppendedId(r0, r3)
            com.ss.android.downloadlib.core.download.d r0 = com.ss.android.downloadlib.core.download.d.a((android.content.Context) r27)
            com.ss.android.downloadlib.core.download.a r11 = r0.f28953c
            r20 = 0
            com.ss.android.downloadlib.core.download.DownloadHandlerService$1 r21 = new com.ss.android.downloadlib.core.download.DownloadHandlerService$1
            r0 = r21
            r1 = r27
            r2 = r3
            r4 = r17
            r6 = r27
            r8 = r16
            r0.<init>(r2, r4, r6, r7, r8)
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r19 = r11
            r19.a(r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0119
        L_0x0108:
            r0 = r27
            r1 = r27
            r2 = r28
            r3 = r16
            r4 = r17
            r0.a(r1, r2, r3, r4)
            goto L_0x0119
        L_0x0116:
            com.ss.android.downloadlib.core.download.DownloadService.a((android.content.Context) r27)
        L_0x0119:
            r27.stopSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.DownloadHandlerService.onStartCommand(android.content.Intent, int, int):int");
    }

    private void a(Context context, Intent intent, int i, long j) {
        String action = intent.getAction();
        try {
            if ("android.ss.intent.action.DOWNLOAD_DELETE".equals(action)) {
                Uri data = intent.getData();
                Intent intent2 = new Intent(context, AdDownloadDeleteActivity.class);
                intent2.setData(data);
                intent2.addFlags(268435456);
                context.startActivity(intent2);
                long parseId = ContentUris.parseId(intent.getData());
                e.a(context).a(context, parseId);
                k.a().a(parseId, 7, null, i, j);
            } else if ("android.ss.intent.action.DOWNLOAD_OPEN".equals(action)) {
                long parseId2 = ContentUris.parseId(intent.getData());
                a(context, parseId2);
                e.a(context).a(context, parseId2);
                k.a().a(parseId2, 6, null, i, j);
            } else {
                if ("android.ss.intent.action.DOWNLOAD_HIDE".equals(action)) {
                    e.a(context).a(context, ContentUris.parseId(intent.getData()));
                }
            }
        } catch (Exception unused) {
        }
    }
}
