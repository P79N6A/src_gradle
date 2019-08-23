package com.ss.android.ugc.aweme.update;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import com.meituan.robust.ChangeQuickRedirect;

@TargetApi(9)
public class DownloadCompleteReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75180a;

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r20, android.content.Intent r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f75180a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<android.content.Intent> r4 = android.content.Intent.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 87355(0x1553b, float:1.2241E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f75180a
            r15 = 0
            r16 = 87355(0x1553b, float:1.2241E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            if (r1 == 0) goto L_0x0163
            if (r0 != 0) goto L_0x004d
            goto L_0x0163
        L_0x004d:
            java.lang.String r2 = r21.getAction()
            java.lang.String r3 = "android.intent.action.DOWNLOAD_COMPLETE"
            boolean r3 = r3.equals(r2)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            if (r3 == 0) goto L_0x014c
            java.lang.String r3 = "download"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.app.DownloadManager r3 = (android.app.DownloadManager) r3
            java.lang.String r5 = "extra_download_id"
            r6 = -1
            long r5 = r1.getLongExtra(r5, r6)
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0072
            return
        L_0x0072:
            com.ss.android.newmedia.BaseAppData.a()     // Catch:{ Exception -> 0x0075 }
        L_0x0075:
            r1 = 0
            android.app.DownloadManager$Query r7 = new android.app.DownloadManager$Query     // Catch:{ Exception -> 0x0147, all -> 0x013f }
            r7.<init>()     // Catch:{ Exception -> 0x0147, all -> 0x013f }
            long[] r8 = new long[r11]     // Catch:{ Exception -> 0x0147, all -> 0x013f }
            r8[r10] = r5     // Catch:{ Exception -> 0x0147, all -> 0x013f }
            r7.setFilterById(r8)     // Catch:{ Exception -> 0x0147, all -> 0x013f }
            android.database.Cursor r3 = r3.query(r7)     // Catch:{ Exception -> 0x0147, all -> 0x013f }
            boolean r1 = r3.moveToNext()     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            if (r1 == 0) goto L_0x0135
            java.lang.String r1 = "local_uri"
            int r1 = r3.getColumnIndex(r1)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            java.lang.String r7 = "media_type"
            int r7 = r3.getColumnIndex(r7)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            java.lang.String r7 = r3.getString(r7)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            java.lang.String r8 = com.ss.android.newmedia.e.a((android.content.Context) r0, (android.net.Uri) r1)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            java.lang.String r9 = "media_type"
            int r9 = r3.getColumnIndex(r9)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            java.lang.String r9 = r3.getString(r9)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            boolean r12 = com.bytedance.common.utility.StringUtils.isEmpty(r9)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            if (r12 != 0) goto L_0x00c0
            java.lang.String r12 = "application/vnd.android.package-archive"
            boolean r9 = r12.equals(r9)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            if (r9 != 0) goto L_0x00ce
        L_0x00c0:
            boolean r9 = com.bytedance.common.utility.StringUtils.isEmpty(r8)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            if (r9 != 0) goto L_0x00e2
            java.lang.String r9 = ".apk"
            boolean r8 = r8.endsWith(r9)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            if (r8 == 0) goto L_0x00e2
        L_0x00ce:
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            java.lang.String r6 = "android.intent.action.VIEW"
            r5.<init>(r6)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r5.addFlags(r4)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r5.addFlags(r11)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r5.setDataAndType(r1, r7)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r0.startActivity(r5)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            goto L_0x0135
        L_0x00e2:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r9 = 11
            if (r8 >= r9) goto L_0x0135
            android.content.Intent r8 = new android.content.Intent     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            java.lang.String r9 = "android.intent.action.VIEW"
            r8.<init>(r9)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r8.addFlags(r4)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r8.addFlags(r11)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r8.setDataAndType(r1, r7)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            java.lang.String r1 = "title"
            int r1 = r3.getColumnIndex(r1)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r7 = 2131559704(0x7f0d0518, float:1.874476E38)
            java.lang.String r7 = r0.getString(r7)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            java.lang.String r9 = "notification"
            java.lang.Object r9 = r0.getSystemService(r9)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            android.support.v4.app.NotificationCompat$Builder r12 = new android.support.v4.app.NotificationCompat$Builder     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            java.lang.String r13 = "update_notification"
            r12.<init>(r0, r13)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r12.setAutoCancel(r11)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r12.setContentTitle(r1)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r12.setContentText(r7)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r1 = 2130840575(0x7f020bff, float:1.7286193E38)
            r12.setSmallIcon(r1)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            android.app.Notification r1 = r12.build()     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            android.app.PendingIntent r7 = android.app.PendingIntent.getActivity(r0, r10, r8, r10)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r1.contentIntent = r7     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            int r5 = (int) r5     // Catch:{ Exception -> 0x013d, all -> 0x013b }
            r9.notify(r5, r1)     // Catch:{ Exception -> 0x013d, all -> 0x013b }
        L_0x0135:
            if (r3 == 0) goto L_0x014c
            r3.close()
            goto L_0x014c
        L_0x013b:
            r0 = move-exception
            goto L_0x0141
        L_0x013d:
            r1 = r3
            goto L_0x0147
        L_0x013f:
            r0 = move-exception
            r3 = r1
        L_0x0141:
            if (r3 == 0) goto L_0x0146
            r3.close()
        L_0x0146:
            throw r0
        L_0x0147:
            if (r1 == 0) goto L_0x014c
            r1.close()
        L_0x014c:
            java.lang.String r1 = "android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0162
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW_DOWNLOADS"
            r1.<init>(r2)
            r1.addFlags(r4)     // Catch:{ Exception -> 0x0162 }
            r0.startActivity(r1)     // Catch:{ Exception -> 0x0162 }
            return
        L_0x0162:
            return
        L_0x0163:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.update.DownloadCompleteReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
