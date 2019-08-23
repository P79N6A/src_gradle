package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.push.aj;
import com.xiaomi.push.service.ag;
import java.io.File;
import java.util.List;

public class fc extends aj.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f82006a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f322a;

    /* renamed from: a  reason: collision with other field name */
    private ag f323a;

    public fc(Context context) {
        this.f82006a = context;
        this.f322a = c.a(context, "mipush_extra", 0);
        this.f323a = ag.a(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        r11 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00a0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00b7 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.xiaomi.push.is> a(java.io.File r11) {
        /*
            r10 = this;
            com.xiaomi.push.ek r0 = com.xiaomi.push.ek.a()
            com.xiaomi.push.ej r0 = r0.a()
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = ""
            goto L_0x0011
        L_0x000d:
            java.lang.String r0 = r0.a()
        L_0x0011:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 == 0) goto L_0x001b
            r1 = r2
            goto L_0x00bc
        L_0x001b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 4
            byte[] r4 = new byte[r3]
            java.lang.Object r5 = com.xiaomi.push.ep.f81985a
            monitor-enter(r5)
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x00a7, all -> 0x0092 }
            android.content.Context r7 = r10.f82006a     // Catch:{ Exception -> 0x00a7, all -> 0x0092 }
            java.io.File r7 = r7.getExternalFilesDir(r2)     // Catch:{ Exception -> 0x00a7, all -> 0x0092 }
            java.lang.String r8 = "push_cdata.lock"
            r6.<init>(r7, r8)     // Catch:{ Exception -> 0x00a7, all -> 0x0092 }
            com.xiaomi.push.z.a((java.io.File) r6)     // Catch:{ Exception -> 0x00a7, all -> 0x0092 }
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00a7, all -> 0x0092 }
            java.lang.String r8 = "rw"
            r7.<init>(r6, r8)     // Catch:{ Exception -> 0x00a7, all -> 0x0092 }
            java.nio.channels.FileChannel r6 = r7.getChannel()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            java.nio.channels.FileLock r6 = r6.lock()     // Catch:{ Exception -> 0x0090, all -> 0x008d }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008a, all -> 0x0086 }
            r8.<init>(r11)     // Catch:{ Exception -> 0x008a, all -> 0x0086 }
        L_0x004a:
            int r11 = r8.read(r4)     // Catch:{ Exception -> 0x008b, all -> 0x0084 }
            if (r11 == r3) goto L_0x0051
            goto L_0x0072
        L_0x0051:
            int r11 = com.xiaomi.push.ad.a((byte[]) r4)     // Catch:{ Exception -> 0x008b, all -> 0x0084 }
            byte[] r2 = new byte[r11]     // Catch:{ Exception -> 0x008b, all -> 0x0084 }
            int r9 = r8.read(r2)     // Catch:{ Exception -> 0x008b, all -> 0x0084 }
            if (r9 != r11) goto L_0x0072
            byte[] r11 = com.xiaomi.push.eo.a(r0, r2)     // Catch:{ Exception -> 0x008b, all -> 0x0084 }
            if (r11 == 0) goto L_0x004a
            int r2 = r11.length     // Catch:{ Exception -> 0x008b, all -> 0x0084 }
            if (r2 == 0) goto L_0x004a
            com.xiaomi.push.is r2 = new com.xiaomi.push.is     // Catch:{ Exception -> 0x008b, all -> 0x0084 }
            r2.<init>()     // Catch:{ Exception -> 0x008b, all -> 0x0084 }
            com.xiaomi.push.ju.a(r2, (byte[]) r11)     // Catch:{ Exception -> 0x008b, all -> 0x0084 }
            r1.add(r2)     // Catch:{ Exception -> 0x008b, all -> 0x0084 }
            goto L_0x004a
        L_0x0072:
            if (r6 == 0) goto L_0x007d
            boolean r11 = r6.isValid()     // Catch:{ all -> 0x00b5 }
            if (r11 == 0) goto L_0x007d
            r6.release()     // Catch:{ IOException -> 0x007d }
        L_0x007d:
            com.xiaomi.push.z.a((java.io.Closeable) r8)     // Catch:{ all -> 0x00b5 }
        L_0x0080:
            com.xiaomi.push.z.a((java.io.Closeable) r7)     // Catch:{ all -> 0x00b5 }
            goto L_0x00bb
        L_0x0084:
            r11 = move-exception
            goto L_0x0088
        L_0x0086:
            r11 = move-exception
            r8 = r2
        L_0x0088:
            r2 = r6
            goto L_0x0095
        L_0x008a:
            r8 = r2
        L_0x008b:
            r2 = r6
            goto L_0x00a9
        L_0x008d:
            r11 = move-exception
            r8 = r2
            goto L_0x0095
        L_0x0090:
            r8 = r2
            goto L_0x00a9
        L_0x0092:
            r11 = move-exception
            r7 = r2
            r8 = r7
        L_0x0095:
            if (r2 == 0) goto L_0x00a0
            boolean r0 = r2.isValid()     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x00a0
            r2.release()     // Catch:{ IOException -> 0x00a0 }
        L_0x00a0:
            com.xiaomi.push.z.a((java.io.Closeable) r8)     // Catch:{ all -> 0x00b5 }
            com.xiaomi.push.z.a((java.io.Closeable) r7)     // Catch:{ all -> 0x00b5 }
            throw r11     // Catch:{ all -> 0x00b5 }
        L_0x00a7:
            r7 = r2
            r8 = r7
        L_0x00a9:
            if (r2 == 0) goto L_0x00b7
            boolean r11 = r2.isValid()     // Catch:{ all -> 0x00b5 }
            if (r11 == 0) goto L_0x00b7
            r2.release()     // Catch:{ IOException -> 0x00b7 }
            goto L_0x00b7
        L_0x00b5:
            r11 = move-exception
            goto L_0x00bd
        L_0x00b7:
            com.xiaomi.push.z.a((java.io.Closeable) r8)     // Catch:{ all -> 0x00b5 }
            goto L_0x0080
        L_0x00bb:
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
        L_0x00bc:
            return r1
        L_0x00bd:
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fc.a(java.io.File):java.util.List");
    }

    private void a() {
        SharedPreferences.Editor edit = this.f322a.edit();
        edit.putLong("last_upload_data_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    /* renamed from: a  reason: collision with other method in class */
    private boolean m223a() {
        if (!at.d(this.f82006a)) {
            if (at.f(this.f82006a) && !c()) {
                return true;
            }
            if ((at.g(this.f82006a) && !b()) || at.h(this.f82006a)) {
                return true;
            }
        }
        return false;
    }

    private boolean b() {
        if (!this.f323a.a(ip.Upload3GSwitch.a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f322a.getLong("last_upload_data_timestamp", -1)) > ((long) Math.max(86400, this.f323a.a(ip.Upload3GFrequency.a(), 432000)));
    }

    private boolean c() {
        if (!this.f323a.a(ip.Upload4GSwitch.a(), true)) {
            return false;
        }
        return Math.abs((System.currentTimeMillis() / 1000) - this.f322a.getLong("last_upload_data_timestamp", -1)) > ((long) Math.max(86400, this.f323a.a(ip.Upload4GFrequency.a(), 259200)));
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m224a() {
        return 1;
    }

    public void run() {
        File file = new File(this.f82006a.getExternalFilesDir(null), "push_cdata.data");
        if (!at.c(this.f82006a)) {
            if (file.length() > 1863680) {
                file.delete();
            }
        } else if (!a() && file.exists()) {
            List<is> a2 = a(file);
            if (!ae.a(a2)) {
                int size = a2.size();
                if (size > 4000) {
                    a2 = a2.subList(size - 4000, size);
                }
                jd jdVar = new jd();
                jdVar.a(a2);
                byte[] a3 = z.a(ju.a(jdVar));
                jj jjVar = new jj("-1", false);
                jjVar.c(iu.DataCollection.f570a);
                jjVar.a(a3);
                ej a4 = ek.a().a();
                if (a4 != null) {
                    a4.a(jjVar, ik.Notification, null);
                }
                a();
            }
            file.delete();
            this.f322a.edit().remove("ltapn").commit();
        }
    }
}
