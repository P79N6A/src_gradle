package com.taobao.accs.b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.k;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Calendar;
import java.util.concurrent.locks.ReentrantLock;

public class a implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static String f78889a = "startservice -n {packname}/com.taobao.accs.ChannelService";

    /* renamed from: c  reason: collision with root package name */
    private static final String f78890c = "com.taobao.accs.b.a";
    private static int g = 7200;
    private static int h = 2500;
    private static final ReentrantLock i = new ReentrantLock();
    private static a j = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f78891b;

    /* renamed from: d  reason: collision with root package name */
    private Context f78892d;

    /* renamed from: e  reason: collision with root package name */
    private String f78893e;

    /* renamed from: f  reason: collision with root package name */
    private int f78894f = 1800;
    private String k = "100001";
    private String l = "tb_accs_eudemon_1.1.3";
    private String m = "";
    private String n = "21646297";
    private int o;
    private String p = "100.69.165.28";
    private String q = "http://100.69.165.28/agoo/report";
    private int r = 80;
    private boolean s = true;
    private Handler t;
    private HandlerThread u;

    public void a() {
        Message obtain = Message.obtain();
        obtain.what = 0;
        this.t.sendMessage(obtain);
    }

    private void b() {
        this.u = new HandlerThread("soManager-threads");
        this.u.setPriority(5);
        this.u.start();
        this.t = new Handler(this.u.getLooper(), this);
    }

    private String c() {
        if (this.f78893e.startsWith("arm")) {
            return "armeabi/";
        }
        return this.f78893e + "/";
    }

    private String g() {
        StringBuilder sb = new StringBuilder();
        sb.append(f78889a.replaceAll("\\{packname\\}", this.f78892d.getApplicationContext().getPackageName()));
        if (Build.VERSION.SDK_INT > 15) {
            sb.append(" --user 0");
        }
        return sb.toString();
    }

    private void i() {
        String str = f78890c;
        ALog.d(str, "api level is:" + Build.VERSION.SDK_INT, new Object[0]);
        b(this.f78892d);
        if (Build.VERSION.SDK_INT < 20) {
            try {
                String d2 = d();
                h();
                a(d2);
            } catch (IOException unused) {
            }
        }
        UTMini.getInstance().commitEvent(66001, "EUDEMON_START", "");
    }

    private void j() {
        File file = new File("/data/data/" + this.f78892d.getPackageName(), "daemonserver.pid");
        if (file.exists()) {
            file.delete();
        }
    }

    private String f() {
        String l2 = UtilityImpl.l(this.f78892d);
        if (TextUtils.isEmpty(l2)) {
            l2 = "null";
        }
        String str = "{\"package\":\"" + this.f78892d.getPackageName() + "\",\"appKey\":\"" + this.n + "\",\"utdid\":\"" + l2 + "\",\"sdkVersion\":\"" + this.o + "\"}";
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            ALog.e(f78890c, "getReportData failed for url encode, data:" + str, new Object[0]);
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6 A[SYNTHETIC, Splitter:B:35:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be A[SYNTHETIC, Splitter:B:44:0x00be] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x00b4=Splitter:B:39:0x00b4, B:26:0x0089=Splitter:B:26:0x0089} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String d() throws java.io.IOException {
        /*
            r9 = this;
            java.io.File r0 = new java.io.File
            android.content.Context r1 = r9.f78892d
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "DaemonServer"
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0016
            r0.delete()
        L_0x0016:
            java.lang.String r1 = f78890c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "open assets from = "
            r2.<init>(r3)
            java.lang.String r3 = r9.c()
            r2.append(r3)
            java.lang.String r3 = "DaemonServer"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.taobao.accs.utl.ALog.w(r1, r2, r4)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            r2 = 0
            boolean r4 = r9.f78891b     // Catch:{ Exception -> 0x009a }
            if (r4 == 0) goto L_0x0076
            android.content.Context r4 = r9.f78892d     // Catch:{ Exception -> 0x009a }
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ Exception -> 0x009a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009a }
            r5.<init>()     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = r9.c()     // Catch:{ Exception -> 0x009a }
            r5.append(r6)     // Catch:{ Exception -> 0x009a }
            java.lang.String r6 = "DaemonServer"
            r5.append(r6)     // Catch:{ Exception -> 0x009a }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x009a }
            java.io.InputStream r4 = r4.open(r5)     // Catch:{ Exception -> 0x009a }
            r2 = 100
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0071, all -> 0x006e }
        L_0x0062:
            int r5 = r4.read(r2)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            if (r5 <= 0) goto L_0x006c
            r1.write(r2, r3, r5)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            goto L_0x0062
        L_0x006c:
            r2 = r4
            goto L_0x0079
        L_0x006e:
            r0 = move-exception
            r2 = r4
            goto L_0x00bc
        L_0x0071:
            r2 = move-exception
            r8 = r4
            r4 = r2
            r2 = r8
            goto L_0x009b
        L_0x0076:
            r9.a((java.io.FileOutputStream) r1, (java.io.File) r0)     // Catch:{ Exception -> 0x009a }
        L_0x0079:
            if (r2 == 0) goto L_0x0089
            r2.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x0089
        L_0x007f:
            r2 = move-exception
            java.lang.String r4 = f78890c
            java.lang.String r5 = "error in close input file"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.taobao.accs.utl.ALog.e(r4, r5, r2, r6)
        L_0x0089:
            r1.close()     // Catch:{ IOException -> 0x008d }
            goto L_0x00b7
        L_0x008d:
            r1 = move-exception
            java.lang.String r2 = f78890c
            java.lang.String r4 = "error in close io"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.taobao.accs.utl.ALog.e(r2, r4, r1, r3)
            goto L_0x00b7
        L_0x0098:
            r0 = move-exception
            goto L_0x00bc
        L_0x009a:
            r4 = move-exception
        L_0x009b:
            java.lang.String r5 = f78890c     // Catch:{ all -> 0x0098 }
            java.lang.String r6 = "error in copy daemon files"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0098 }
            com.taobao.accs.utl.ALog.e(r5, r6, r4, r7)     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x00b4
            r2.close()     // Catch:{ IOException -> 0x00aa }
            goto L_0x00b4
        L_0x00aa:
            r2 = move-exception
            java.lang.String r4 = f78890c
            java.lang.String r5 = "error in close input file"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.taobao.accs.utl.ALog.e(r4, r5, r2, r6)
        L_0x00b4:
            r1.close()     // Catch:{ IOException -> 0x008d }
        L_0x00b7:
            java.lang.String r0 = r0.getCanonicalPath()
            return r0
        L_0x00bc:
            if (r2 == 0) goto L_0x00cc
            r2.close()     // Catch:{ IOException -> 0x00c2 }
            goto L_0x00cc
        L_0x00c2:
            r2 = move-exception
            java.lang.String r4 = f78890c
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "error in close input file"
            com.taobao.accs.utl.ALog.e(r4, r6, r2, r5)
        L_0x00cc:
            r1.close()     // Catch:{ IOException -> 0x00d0 }
            goto L_0x00da
        L_0x00d0:
            r1 = move-exception
            java.lang.String r2 = f78890c
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "error in close io"
            com.taobao.accs.utl.ALog.e(r2, r4, r1, r3)
        L_0x00da:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.b.a.d():java.lang.String");
    }

    private String e() {
        StringBuilder sb = new StringBuilder();
        String str = "/data/data/" + this.f78892d.getPackageName();
        sb.append("-s \"");
        sb.append(str);
        sb.append("/lib/\" ");
        sb.append("-n \"runServer\" ");
        sb.append("-p \"");
        sb.append(g());
        sb.append("\" ");
        sb.append("-f \"");
        sb.append(str);
        sb.append("\" ");
        sb.append("-t \"");
        sb.append(this.f78894f);
        sb.append("\" ");
        sb.append("-c \"agoo.pid\" ");
        if (this.m != null) {
            sb.append("-P ");
            sb.append(this.m);
            sb.append(" ");
        }
        if (this.k != null) {
            sb.append("-K ");
            sb.append(this.k);
            sb.append(" ");
        }
        if (this.l != null) {
            sb.append("-U ");
            sb.append(this.l);
            sb.append(" ");
        }
        if (this.q != null) {
            sb.append("-L ");
            sb.append(this.q);
            sb.append(" ");
        }
        sb.append("-D ");
        sb.append(f());
        sb.append(" ");
        if (this.p != null) {
            sb.append("-I ");
            sb.append(this.p);
            sb.append(" ");
        }
        if (this.r > 0) {
            sb.append("-O ");
            sb.append(this.r);
            sb.append(" ");
        }
        String a2 = UtilityImpl.a(this.f78892d);
        int b2 = UtilityImpl.b(this.f78892d);
        if (a2 != null && b2 > 0) {
            sb.append("-X ");
            sb.append(a2);
            sb.append(" ");
            sb.append("-Y ");
            sb.append(b2);
            sb.append(" ");
        }
        if (this.s) {
            sb.append("-T ");
        }
        sb.append("-Z ");
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:5|6|7|8|9|10|(2:11|(3:13|(4:15|(2:17|(2:19|95)(1:20))|21|96)(1:94)|92)(1:93))|22|23|24|25|26|27|28|29|30|31|32|33) */
    /* JADX WARNING: Can't wrap try/catch for region: R(21:3|4|5|6|7|8|9|10|(2:11|(3:13|(4:15|(2:17|(2:19|95)(1:20))|21|96)(1:94)|92)(1:93))|22|23|24|25|26|27|28|29|30|31|32|33) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00c8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00cb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00ce */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ef A[SYNTHETIC, Splitter:B:54:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f6 A[SYNTHETIC, Splitter:B:58:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fd A[SYNTHETIC, Splitter:B:62:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0104 A[SYNTHETIC, Splitter:B:66:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010f A[SYNTHETIC, Splitter:B:75:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0116 A[SYNTHETIC, Splitter:B:79:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011d A[SYNTHETIC, Splitter:B:83:0x011d] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0124 A[SYNTHETIC, Splitter:B:87:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0128 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
            r17 = this;
            r8 = r17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "/data/data/"
            r0.<init>(r1)
            android.content.Context r1 = r8.f78892d
            java.lang.String r1 = r1.getPackageName()
            r0.append(r1)
            java.lang.String r1 = "/eudemon"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x0027
            return
        L_0x0027:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0108, all -> 0x00e7 }
            r10.<init>(r1)     // Catch:{ Exception -> 0x0108, all -> 0x00e7 }
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00e5, all -> 0x00e3 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x00e5, all -> 0x00e3 }
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00e1, all -> 0x00df }
            r12.<init>(r11)     // Catch:{ Exception -> 0x00e1, all -> 0x00df }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            r13.<init>()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
        L_0x003b:
            java.lang.String r1 = r12.readLine()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r1 == 0) goto L_0x00ad
            java.lang.String r2 = "\\|"
            java.lang.String[] r2 = r1.split(r2)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            int r3 = r2.length     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            r4 = 5
            if (r3 != r4) goto L_0x003b
            r3 = 0
            r3 = r2[r3]     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r3 = r3.trim()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            r4 = 1
            r4 = r2[r4]     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r4 = r4.trim()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            r5 = 2
            r6 = r2[r5]     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r6 = r6.trim()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            int r7 = r6 - r4
            r14 = 3
            r14 = r2[r14]     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r14 = r14.trim()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            r15 = 4
            r2 = r2[r15]     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r15 = r2.trim()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r2 = "0"
            boolean r2 = r15.equals(r2)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r2 == 0) goto L_0x00a2
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r9 = "/proc"
            r2.<init>(r9, r3)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            if (r2 == 0) goto L_0x009e
            r13.append(r1)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r1 = "\n"
            r13.append(r1)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            goto L_0x003b
        L_0x009e:
            int r1 = r8.f78894f     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            int r1 = r1 / r5
            int r7 = r7 + r1
        L_0x00a2:
            r1 = r17
            r2 = r3
            r3 = r4
            r4 = r6
            r5 = r14
            r6 = r15
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            goto L_0x003b
        L_0x00ad:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            r9.<init>(r1)     // Catch:{ Exception -> 0x00db, all -> 0x00d9 }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x00d6, all -> 0x00d2 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x00d6, all -> 0x00d2 }
            r9.write(r0)     // Catch:{ Exception -> 0x00d6, all -> 0x00d2 }
            r12.close()     // Catch:{ Exception -> 0x00d6, all -> 0x00d2 }
            r12.close()     // Catch:{ Throwable -> 0x00c8 }
        L_0x00c8:
            r11.close()     // Catch:{ Throwable -> 0x00cb }
        L_0x00cb:
            r10.close()     // Catch:{ IOException -> 0x00ce }
        L_0x00ce:
            r9.close()     // Catch:{ IOException -> 0x00d1 }
        L_0x00d1:
            return
        L_0x00d2:
            r0 = move-exception
            r16 = r9
            goto L_0x00ed
        L_0x00d6:
            r16 = r12
            goto L_0x010d
        L_0x00d9:
            r0 = move-exception
            goto L_0x00eb
        L_0x00db:
            r16 = r12
            r9 = 0
            goto L_0x010d
        L_0x00df:
            r0 = move-exception
            goto L_0x00ea
        L_0x00e1:
            r9 = 0
            goto L_0x010b
        L_0x00e3:
            r0 = move-exception
            goto L_0x00e9
        L_0x00e5:
            r9 = 0
            goto L_0x010a
        L_0x00e7:
            r0 = move-exception
            r10 = 0
        L_0x00e9:
            r11 = 0
        L_0x00ea:
            r12 = 0
        L_0x00eb:
            r16 = 0
        L_0x00ed:
            if (r12 == 0) goto L_0x00f4
            r12.close()     // Catch:{ Throwable -> 0x00f3 }
            goto L_0x00f4
        L_0x00f3:
        L_0x00f4:
            if (r11 == 0) goto L_0x00fb
            r11.close()     // Catch:{ Throwable -> 0x00fa }
            goto L_0x00fb
        L_0x00fa:
        L_0x00fb:
            if (r10 == 0) goto L_0x0102
            r10.close()     // Catch:{ IOException -> 0x0101 }
            goto L_0x0102
        L_0x0101:
        L_0x0102:
            if (r16 == 0) goto L_0x0107
            r16.close()     // Catch:{ IOException -> 0x0107 }
        L_0x0107:
            throw r0
        L_0x0108:
            r9 = 0
            r10 = 0
        L_0x010a:
            r11 = 0
        L_0x010b:
            r16 = 0
        L_0x010d:
            if (r16 == 0) goto L_0x0114
            r16.close()     // Catch:{ Throwable -> 0x0113 }
            goto L_0x0114
        L_0x0113:
        L_0x0114:
            if (r11 == 0) goto L_0x011b
            r11.close()     // Catch:{ Throwable -> 0x011a }
            goto L_0x011b
        L_0x011a:
        L_0x011b:
            if (r10 == 0) goto L_0x0122
            r10.close()     // Catch:{ IOException -> 0x0121 }
            goto L_0x0122
        L_0x0121:
        L_0x0122:
            if (r9 == 0) goto L_0x0128
            r9.close()     // Catch:{ IOException -> 0x0127 }
        L_0x0127:
            return
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.b.a.h():void");
    }

    public boolean handleMessage(Message message) {
        try {
            if (message.what == 0) {
                i();
            } else if (message.what == -1) {
                j();
            }
        } catch (Throwable th) {
            ALog.e(f78890c, "handleMessage error", th, new Object[0]);
        }
        return true;
    }

    public static final PendingIntent a(Context context) {
        Intent intent = new Intent();
        intent.setAction(context.getApplicationContext().getPackageName() + ".intent.action.COCKROACH");
        intent.putExtra("cockroach", "cockroach-PPreotect");
        intent.putExtra("pack", context.getApplicationContext().getPackageName());
        return PendingIntent.getService(context, 0, intent, 134217728);
    }

    public static void b(Context context) {
        int i2 = Calendar.getInstance().get(11);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager != null) {
            PendingIntent a2 = a(context);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (i2 > 23 || i2 < 6) {
                ALog.w(f78890c, "time is night, do not wakeup cpu", new Object[0]);
                b(alarmManager, a2, elapsedRealtime);
                return;
            }
            ALog.w(f78890c, "time is daytime, wakeup cpu for keeping connecntion", new Object[0]);
            a(alarmManager, a2, elapsedRealtime);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0069 A[SYNTHETIC, Splitter:B:25:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070 A[SYNTHETIC, Splitter:B:30:0x0070] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(android.content.Context r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x007f }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ Throwable -> 0x007f }
            java.lang.String r2 = "agoo.pid"
            r1.<init>(r5, r2)     // Catch:{ Throwable -> 0x007f }
            java.lang.String r5 = f78890c     // Catch:{ Throwable -> 0x007f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x007f }
            java.lang.String r3 = "pid path:"
            r2.<init>(r3)     // Catch:{ Throwable -> 0x007f }
            java.lang.String r3 = r1.getAbsolutePath()     // Catch:{ Throwable -> 0x007f }
            r2.append(r3)     // Catch:{ Throwable -> 0x007f }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x007f }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x007f }
            com.taobao.accs.utl.ALog.d(r5, r2, r3)     // Catch:{ Throwable -> 0x007f }
            boolean r5 = r1.exists()     // Catch:{ Throwable -> 0x007f }
            if (r5 == 0) goto L_0x002e
            r1.delete()     // Catch:{ Throwable -> 0x007f }
        L_0x002e:
            r1.createNewFile()     // Catch:{ Throwable -> 0x007f }
            r5 = 0
            int r2 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x005b, all -> 0x0057 }
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ Throwable -> 0x005b, all -> 0x0057 }
            r3.<init>(r1)     // Catch:{ Throwable -> 0x005b, all -> 0x0057 }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x0055 }
            char[] r5 = r5.toCharArray()     // Catch:{ Throwable -> 0x0055 }
            r3.write(r5)     // Catch:{ Throwable -> 0x0055 }
            r3.close()     // Catch:{ Throwable -> 0x004a }
            return
        L_0x004a:
            r5 = move-exception
            java.lang.String r1 = f78890c
            java.lang.String r2 = "error"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.e(r1, r2, r5, r0)
            return
        L_0x0055:
            r5 = move-exception
            goto L_0x005e
        L_0x0057:
            r1 = move-exception
            r3 = r5
            r5 = r1
            goto L_0x006e
        L_0x005b:
            r1 = move-exception
            r3 = r5
            r5 = r1
        L_0x005e:
            java.lang.String r1 = f78890c     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "save pid error"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x006d }
            com.taobao.accs.utl.ALog.e(r1, r2, r5, r4)     // Catch:{ all -> 0x006d }
            if (r3 == 0) goto L_0x006c
            r3.close()     // Catch:{ Throwable -> 0x004a }
        L_0x006c:
            return
        L_0x006d:
            r5 = move-exception
        L_0x006e:
            if (r3 == 0) goto L_0x007e
            r3.close()     // Catch:{ Throwable -> 0x0074 }
            goto L_0x007e
        L_0x0074:
            r1 = move-exception
            java.lang.String r2 = f78890c
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "error"
            com.taobao.accs.utl.ALog.e(r2, r3, r1, r0)
        L_0x007e:
            throw r5
        L_0x007f:
            r5 = move-exception
            java.lang.String r1 = f78890c
            java.lang.String r2 = "error in create file"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.e(r1, r2, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.b.a.c(android.content.Context):void");
    }

    private void a(String str) {
        StringBuilder sb = new StringBuilder();
        a("", "chmod 500 " + str, sb);
        a("", str + " " + e(), sb);
        String str2 = f78890c;
        ALog.w(str2, str + " " + e(), new Object[0]);
    }

    private static String a(Build build, String str) {
        try {
            return Build.class.getField(str).get(build).toString();
        } catch (Throwable unused) {
            return "Unknown";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[SYNTHETIC, Splitter:B:32:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab A[SYNTHETIC, Splitter:B:39:0x00ab] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.io.FileOutputStream r9, java.io.File r10) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = r8.f78893e
            java.lang.String r0 = com.taobao.accs.b.b.a(r0)
            java.lang.String r1 = f78890c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ">>>soDataSize:datasize:"
            r2.<init>(r3)
            int r3 = r0.length()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.taobao.accs.utl.ALog.d(r1, r2, r4)
            byte[] r0 = r0.getBytes()
            byte[] r0 = android.util.Base64.decode(r0, r3)
            java.lang.String r1 = f78890c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = ">>>soDataSize:"
            r2.<init>(r4)
            int r4 = r0.length
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.taobao.accs.utl.ALog.d(r1, r2, r4)
            int r1 = r0.length
            if (r1 > 0) goto L_0x0042
            return
        L_0x0042:
            if (r9 != 0) goto L_0x0045
            return
        L_0x0045:
            r1 = 0
            android.os.StatFs r2 = new android.os.StatFs
            java.lang.String r10 = r10.getCanonicalPath()
            r2.<init>(r10)
            int r10 = r2.getBlockSize()
            int r2 = r2.getAvailableBlocks()
            long r4 = (long) r2
            long r6 = (long) r10
            long r6 = r6 * r4
            int r10 = r0.length
            long r4 = (long) r10
            int r10 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x0062
            return
        L_0x0062:
            java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0089 }
            r10.<init>(r0)     // Catch:{ IOException -> 0x0089 }
            r0 = 100
            byte[] r1 = new byte[r0]     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
        L_0x006b:
            int r2 = r10.read(r1, r3, r0)     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            if (r2 < 0) goto L_0x0075
            r9.write(r1, r3, r2)     // Catch:{ IOException -> 0x0084, all -> 0x0081 }
            goto L_0x006b
        L_0x0075:
            java.io.FileDescriptor r9 = r9.getFD()
            r9.sync()
            r10.close()     // Catch:{ IOException -> 0x0080 }
            return
        L_0x0080:
            return
        L_0x0081:
            r0 = move-exception
            r1 = r10
            goto L_0x00a2
        L_0x0084:
            r0 = move-exception
            r1 = r10
            goto L_0x008a
        L_0x0087:
            r0 = move-exception
            goto L_0x00a2
        L_0x0089:
            r0 = move-exception
        L_0x008a:
            java.lang.String r10 = f78890c     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = "error in write files"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0087 }
            com.taobao.accs.utl.ALog.e(r10, r2, r0, r3)     // Catch:{ all -> 0x0087 }
            java.io.FileDescriptor r9 = r9.getFD()
            r9.sync()
            if (r1 == 0) goto L_0x00a1
            r1.close()     // Catch:{ IOException -> 0x00a0 }
            goto L_0x00a1
        L_0x00a0:
            return
        L_0x00a1:
            return
        L_0x00a2:
            java.io.FileDescriptor r9 = r9.getFD()
            r9.sync()
            if (r1 == 0) goto L_0x00ae
            r1.close()     // Catch:{ IOException -> 0x00ae }
        L_0x00ae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.b.a.a(java.io.FileOutputStream, java.io.File):void");
    }

    private static void b(AlarmManager alarmManager, PendingIntent pendingIntent, long j2) {
        alarmManager.cancel(pendingIntent);
        alarmManager.setRepeating(3, j2 + ((long) (g * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)), (long) (g * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), pendingIntent);
    }

    public static a a(Context context, int i2, boolean z) {
        try {
            i.lock();
            if (j == null) {
                j = new a(context, i2, z);
            }
        } catch (Exception e2) {
            ALog.e(f78890c, "getInstance", e2, new Object[0]);
        } catch (Throwable th) {
            i.unlock();
            throw th;
        }
        i.unlock();
        return j;
    }

    public a(Context context, int i2, boolean z) {
        String str;
        b();
        f78889a = "startservice -n {packname}/com.taobao.accs.ChannelService";
        this.f78892d = context;
        this.f78894f = i2;
        this.f78891b = z;
        this.f78893e = a(new Build(), "CPU_ABI");
        this.m = "/data/data/" + context.getPackageName();
        this.o = 221;
        String[] s2 = UtilityImpl.s(this.f78892d);
        if (s2 == null || s2.length == 0) {
            str = "";
        } else {
            str = s2[0];
        }
        this.n = str;
        if (k.b(context) == 0) {
            this.p = "agoodm.m.taobao.com";
            this.r = 80;
            this.q = "http://agoodm.m.taobao.com/agoo/report";
            this.k = "1009527";
        } else if (k.b(context) == 1) {
            this.p = "110.75.98.154";
            this.r = 80;
            this.q = "http://agoodm.wapa.taobao.com/agoo/report";
            this.k = "1009527";
        } else {
            this.p = "100.69.168.33";
            this.r = 80;
            this.q = "http://100.69.168.33/agoo/report";
            this.f78894f = 60;
            this.k = "9527";
        }
    }

    private static void a(AlarmManager alarmManager, PendingIntent pendingIntent, long j2) {
        if (pendingIntent != null) {
            alarmManager.cancel(pendingIntent);
            alarmManager.setRepeating(2, ((long) (h * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)) + j2, (long) (h * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), pendingIntent);
        }
    }

    public static boolean a(String str, String str2, StringBuilder sb) {
        try {
            Process exec = Runtime.getRuntime().exec("sh");
            DataInputStream dataInputStream = new DataInputStream(exec.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(exec.getOutputStream());
            if (str != null && !"".equals(str.trim())) {
                dataOutputStream.writeBytes("cd " + str + "\n");
            }
            dataOutputStream.writeBytes(str2 + " &\n");
            dataOutputStream.writeBytes("exit \n");
            dataOutputStream.flush();
            exec.waitFor();
            byte[] bArr = new byte[dataInputStream.available()];
            dataInputStream.read(bArr);
            String str3 = new String(bArr);
            if (str3.length() != 0) {
                sb.append(str3);
            }
            return true;
        } catch (Exception e2) {
            sb.append("Exception:");
            sb.append(e2.getMessage());
            return false;
        }
    }

    private void a(String str, int i2, int i3, String str2, String str3, int i4) {
        UTMini.getInstance().commitEvent(66001, "EUDEMON_ENDSTAT", "AndroidVer=" + Build.VERSION.RELEASE + "&Model=" + Build.MODEL + "&AndroidSdk=" + Build.VERSION.SDK_INT + "&AccsVer=221" + "&Appkey=" + this.n + "&PullCount=" + str2 + "&Pid=" + str + "&StartTime=" + i2 + "&EndTime=" + i3 + "&ExitCode=" + str3 + "&AliveTime=" + i4);
    }
}
