package com.xiaomi.push;

import android.content.Context;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.push.am;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class eg implements LoggerInterface {

    /* renamed from: a  reason: collision with root package name */
    private static am f81977a = new am(true);

    /* renamed from: a  reason: collision with other field name */
    public static String f311a = "/MiPushLog";

    /* renamed from: a  reason: collision with other field name */
    private static final SimpleDateFormat f312a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");

    /* renamed from: a  reason: collision with other field name */
    private static List<Pair<String, Throwable>> f313a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a  reason: collision with other field name */
    private Context f314a;

    /* renamed from: b  reason: collision with root package name */
    private String f81978b;

    /* renamed from: c  reason: collision with root package name */
    private String f81979c = "";

    public eg(Context context) {
        this.f314a = context;
        if (context.getApplicationContext() != null) {
            this.f314a = context.getApplicationContext();
        }
        this.f81978b = this.f314a.getPackageName();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:22|23|(5:27|(2:29|95)(1:96)|30|25|24)|94|31|32|33|(3:35|(1:39)|40)|(2:44|45)|46|47|48) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x011d */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0135 A[SYNTHETIC, Splitter:B:63:0x0135] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0149 A[SYNTHETIC, Splitter:B:73:0x0149] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0151 A[SYNTHETIC, Splitter:B:80:0x0151] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0165 A[SYNTHETIC, Splitter:B:90:0x0165] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = r10.f81979c     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            if (r1 == 0) goto L_0x0023
            android.content.Context r1 = r10.f314a     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            java.io.File r1 = r1.getExternalFilesDir(r0)     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            if (r1 == 0) goto L_0x0023
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            r2.<init>()     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            r2.append(r1)     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            r10.f81979c = r1     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
        L_0x0023:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            r2.<init>()     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            java.lang.String r3 = r10.f81979c     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            r2.append(r3)     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            java.lang.String r3 = f311a     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            r2.append(r3)     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            if (r2 == 0) goto L_0x0047
            boolean r2 = r1.isDirectory()     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            if (r2 != 0) goto L_0x004f
        L_0x0047:
            boolean r2 = r1.mkdirs()     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            if (r2 != 0) goto L_0x004f
            goto L_0x0168
        L_0x004f:
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            java.lang.String r3 = "log.lock"
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            boolean r3 = r2.exists()     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            if (r3 == 0) goto L_0x0062
            boolean r3 = r2.isDirectory()     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            if (r3 == 0) goto L_0x0065
        L_0x0062:
            r2.createNewFile()     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
        L_0x0065:
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            java.lang.String r4 = "rw"
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x014d, all -> 0x0130 }
            java.nio.channels.FileChannel r2 = r3.getChannel()     // Catch:{ Exception -> 0x012e, all -> 0x012b }
            java.nio.channels.FileLock r2 = r2.lock()     // Catch:{ Exception -> 0x012e, all -> 0x012b }
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r8 = "log1.txt"
            r7.<init>(r1, r8)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r8 = 1
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
        L_0x008b:
            java.util.List<android.util.Pair<java.lang.String, java.lang.Throwable>> r5 = f313a     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            if (r5 != 0) goto L_0x00e1
            java.util.List<android.util.Pair<java.lang.String, java.lang.Throwable>> r5 = f313a     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            r6 = 0
            java.lang.Object r5 = r5.remove(r6)     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.lang.Object r6 = r5.first     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.lang.Object r7 = r5.second     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            if (r7 == 0) goto L_0x00cc
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            r7.<init>()     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            r7.append(r6)     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.lang.String r6 = "\n"
            r7.append(r6)     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            r7.<init>()     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            r7.append(r6)     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.lang.Object r5 = r5.second     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.lang.String r5 = android.util.Log.getStackTraceString(r5)     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            r7.append(r5)     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.lang.String r6 = r7.toString()     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
        L_0x00cc:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            r5.<init>()     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            r5.append(r6)     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.lang.String r6 = "\n"
            r5.append(r6)     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            r4.write(r5)     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            goto L_0x008b
        L_0x00e1:
            r4.flush()     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            r4.close()     // Catch:{ Exception -> 0x0129, all -> 0x0125 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r5 = "log1.txt"
            r4.<init>(r1, r5)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            long r5 = r4.length()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            r7 = 1048576(0x100000, double:5.180654E-318)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0112
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            java.lang.String r6 = "log0.txt"
            r5.<init>(r1, r6)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            boolean r1 = r5.exists()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r1 == 0) goto L_0x010f
            boolean r1 = r5.isFile()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
            if (r1 == 0) goto L_0x010f
            r5.delete()     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
        L_0x010f:
            r4.renameTo(r5)     // Catch:{ Exception -> 0x0123, all -> 0x0121 }
        L_0x0112:
            if (r2 == 0) goto L_0x011d
            boolean r0 = r2.isValid()
            if (r0 == 0) goto L_0x011d
            r2.release()     // Catch:{ IOException -> 0x011d }
        L_0x011d:
            r3.close()     // Catch:{ IOException -> 0x0120 }
        L_0x0120:
            return
        L_0x0121:
            r1 = move-exception
            goto L_0x0133
        L_0x0123:
            goto L_0x014f
        L_0x0125:
            r0 = move-exception
            r1 = r0
            r0 = r4
            goto L_0x0133
        L_0x0129:
            r0 = r4
            goto L_0x014f
        L_0x012b:
            r1 = move-exception
            r2 = r0
            goto L_0x0133
        L_0x012e:
            r2 = r0
            goto L_0x014f
        L_0x0130:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L_0x0133:
            if (r0 == 0) goto L_0x013a
            r0.close()     // Catch:{ IOException -> 0x0139 }
            goto L_0x013a
        L_0x0139:
        L_0x013a:
            if (r2 == 0) goto L_0x0147
            boolean r0 = r2.isValid()
            if (r0 == 0) goto L_0x0147
            r2.release()     // Catch:{ IOException -> 0x0146 }
            goto L_0x0147
        L_0x0146:
        L_0x0147:
            if (r3 == 0) goto L_0x014c
            r3.close()     // Catch:{ IOException -> 0x014c }
        L_0x014c:
            throw r1
        L_0x014d:
            r2 = r0
            r3 = r2
        L_0x014f:
            if (r0 == 0) goto L_0x0156
            r0.close()     // Catch:{ IOException -> 0x0155 }
            goto L_0x0156
        L_0x0155:
        L_0x0156:
            if (r2 == 0) goto L_0x0163
            boolean r0 = r2.isValid()
            if (r0 == 0) goto L_0x0163
            r2.release()     // Catch:{ IOException -> 0x0162 }
            goto L_0x0163
        L_0x0162:
        L_0x0163:
            if (r3 == 0) goto L_0x0168
            r3.close()     // Catch:{ IOException -> 0x0168 }
        L_0x0168:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.eg.a():void");
    }

    public final void log(String str) {
        log(str, null);
    }

    public final void log(String str, Throwable th) {
        f313a.add(new Pair(String.format("%1$s %2$s %3$s ", new Object[]{f312a.format(new Date()), this.f81978b, str}), th));
        f81977a.a((am.b) new eh(this));
    }

    public final void setTag(String str) {
        this.f81978b = str;
    }
}
