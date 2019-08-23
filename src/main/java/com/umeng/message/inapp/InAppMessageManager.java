package com.umeng.message.inapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.common.d;
import com.umeng.message.entity.UInAppMessage;
import com.umeng.message.provider.a;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class InAppMessageManager {

    /* renamed from: a  reason: collision with root package name */
    static boolean f81176a = false;

    /* renamed from: b  reason: collision with root package name */
    static int f81177b = 1800000;

    /* renamed from: c  reason: collision with root package name */
    static int f81178c = 1000;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final String f81179d = "com.umeng.message.inapp.InAppMessageManager";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e  reason: collision with root package name */
    private static InAppMessageManager f81180e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Context f81181f;
    private String g;
    private UInAppHandler h = new UmengInAppClickHandler();

    public UInAppHandler getInAppHandler() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return a("KEY_LAST_SPLASH_ID", "");
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return a("KEY_CARD_LABEL_LIST", "");
    }

    /* access modifiers changed from: package-private */
    public String g() {
        return a("KEY_LAST_VERSION_CODE", "");
    }

    /* access modifiers changed from: package-private */
    public long i() {
        return Long.parseLong(a("KEY_LAST_SHOW_SPLASH_TS", PushConstants.PUSH_TYPE_NOTIFY));
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return Long.valueOf(a("KEY_SPLASH_TS", PushConstants.PUSH_TYPE_NOTIFY)).longValue();
    }

    /* access modifiers changed from: package-private */
    public void h() {
        b("KEY_LAST_SHOW_SPLASH_TS", System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public void c() {
        b("KEY_SPLASH_TS", System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public String[] b() {
        String a2 = a("KEY_PLAIN_TEXT_SIZE", "");
        if (!TextUtils.isEmpty(a2)) {
            return a2.split(",");
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.umeng.message.inapp.a> j() {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.content.Context r2 = r9.f81181f     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            android.content.Context r2 = r9.f81181f     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            com.umeng.message.provider.a.a(r2)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            android.net.Uri r4 = com.umeng.message.provider.a.k     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            r1 = 0
            if (r2 == 0) goto L_0x0026
            boolean r1 = r2.moveToFirst()     // Catch:{ Exception -> 0x0035, all -> 0x0023 }
            goto L_0x0026
        L_0x0023:
            r0 = move-exception
            r1 = r2
            goto L_0x003e
        L_0x0026:
            if (r1 == 0) goto L_0x0037
            com.umeng.message.inapp.a r1 = new com.umeng.message.inapp.a     // Catch:{ Exception -> 0x0035, all -> 0x0023 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0035, all -> 0x0023 }
            r0.add(r1)     // Catch:{ Exception -> 0x0035, all -> 0x0023 }
            boolean r1 = r2.moveToNext()     // Catch:{ Exception -> 0x0035, all -> 0x0023 }
            goto L_0x0026
        L_0x0035:
            r1 = r2
            goto L_0x0044
        L_0x0037:
            if (r2 == 0) goto L_0x0049
            r2.close()
            goto L_0x0049
        L_0x003d:
            r0 = move-exception
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()
        L_0x0043:
            throw r0
        L_0x0044:
            if (r1 == 0) goto L_0x0049
            r1.close()
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.InAppMessageManager.j():java.util.ArrayList");
    }

    public void setInAppHandler(UInAppHandler uInAppHandler) {
        this.h = uInAppHandler;
    }

    public void setInAppMsgDebugMode(boolean z) {
        f81176a = z;
    }

    public void setMainActivityPath(String str) {
        this.g = str;
    }

    /* access modifiers changed from: package-private */
    public void d(String str) {
        b("KEY_CARD_LABEL_LIST", str);
    }

    /* access modifiers changed from: package-private */
    public void e(String str) {
        b("KEY_LAST_VERSION_CODE", str);
    }

    private InAppMessageManager(Context context) {
        this.f81181f = context;
    }

    private int j(String str) {
        return Integer.valueOf(a(str, PushConstants.PUSH_TYPE_NOTIFY)).intValue();
    }

    public static InAppMessageManager getInstance(Context context) {
        if (f81180e == null) {
            synchronized (InAppMessageManager.class) {
                if (f81180e == null) {
                    f81180e = new InAppMessageManager(context.getApplicationContext());
                }
            }
        }
        return f81180e;
    }

    /* access modifiers changed from: package-private */
    public void a(UInAppMessage uInAppMessage) {
        if (uInAppMessage == null) {
            b("KEY_LAST_SPLASH_ID", "");
            return;
        }
        if (uInAppMessage.getRaw() != null) {
            b("KEY_LAST_SPLASH_ID", uInAppMessage.getRaw().toString());
        }
    }

    /* access modifiers changed from: package-private */
    public long b(String str) {
        return Long.valueOf(a("KEY_CARD_TS_" + str, PushConstants.PUSH_TYPE_NOTIFY)).longValue();
    }

    /* access modifiers changed from: package-private */
    public String c(String str) {
        return a("KEY_LAST_CARD_ID_" + str, "");
    }

    /* access modifiers changed from: package-private */
    public long g(String str) {
        return Long.parseLong(a("KEY_LAST_SHOW_CARD_TS_" + str, PushConstants.PUSH_TYPE_NOTIFY));
    }

    /* access modifiers changed from: package-private */
    public void i(final String str) {
        d.a(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r9 = this;
                    r0 = 0
                    android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    r1.<init>()     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    java.lang.String r2 = "tempkey"
                    java.lang.String r3 = r2     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    r1.put(r2, r3)     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    com.umeng.message.inapp.InAppMessageManager r1 = com.umeng.message.inapp.InAppMessageManager.this     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    android.content.Context r1 = r1.f81181f     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    com.umeng.message.inapp.InAppMessageManager r1 = com.umeng.message.inapp.InAppMessageManager.this     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    android.content.Context r1 = r1.f81181f     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    com.umeng.message.provider.a.a(r1)     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    android.net.Uri r3 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    r1 = 1
                    java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    java.lang.String r5 = "tempvalue"
                    r8 = 0
                    r4[r8] = r5     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    if (r2 == 0) goto L_0x005a
                    java.lang.String r0 = "tempkey=?"
                    java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    java.lang.String r3 = r2     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    r1[r8] = r3     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    com.umeng.message.inapp.InAppMessageManager r3 = com.umeng.message.inapp.InAppMessageManager.this     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    android.content.Context r3 = r3.f81181f     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    com.umeng.message.inapp.InAppMessageManager r4 = com.umeng.message.inapp.InAppMessageManager.this     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    android.content.Context r4 = r4.f81181f     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    com.umeng.message.provider.a.a(r4)     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    android.net.Uri r4 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    r3.delete(r4, r0, r1)     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    goto L_0x005a
                L_0x0054:
                    r0 = move-exception
                    r1 = r0
                    r0 = r2
                    goto L_0x0061
                L_0x0058:
                    r0 = r2
                    goto L_0x0067
                L_0x005a:
                    if (r2 == 0) goto L_0x006d
                    r2.close()
                    return
                L_0x0060:
                    r1 = move-exception
                L_0x0061:
                    if (r0 == 0) goto L_0x0066
                    r0.close()
                L_0x0066:
                    throw r1
                L_0x0067:
                    if (r0 == 0) goto L_0x006d
                    r0.close()
                    return
                L_0x006d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.InAppMessageManager.AnonymousClass3.run():void");
            }
        });
    }

    /* access modifiers changed from: private */
    public a k(String str) {
        a aVar;
        ContentResolver contentResolver = this.f81181f.getContentResolver();
        a.a(this.f81181f);
        Cursor query = contentResolver.query(a.k, null, "MsgId=?", new String[]{str}, null);
        if (query.moveToFirst()) {
            aVar = new a(query);
        } else {
            aVar = null;
        }
        if (query != null) {
            query.close();
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public boolean b(UInAppMessage uInAppMessage) {
        try {
            if (System.currentTimeMillis() < new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).parse(uInAppMessage.expire_time).getTime()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(String str) {
        b("KEY_LAST_SHOW_CARD_TS_" + str, System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    public boolean h(String str) {
        String[] strArr = {str};
        ContentResolver contentResolver = this.f81181f.getContentResolver();
        a.a(this.f81181f);
        if (contentResolver.delete(a.k, "MsgId=?", strArr) == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean c(UInAppMessage uInAppMessage) {
        if (uInAppMessage.show_times != 0 && j(uInAppMessage.msg_id) >= uInAppMessage.show_times) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(final File file) {
        d.a(new Runnable() {
            public void run() {
                if (file != null && file.exists() && file.canWrite() && file.isDirectory()) {
                    for (File file : file.listFiles()) {
                        if (!file.isDirectory()) {
                            file.delete();
                        }
                    }
                    file.delete();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        b("KEY_CARD_TS_" + str, System.currentTimeMillis());
    }

    private void b(final String str, final String str2) {
        d.a(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:20:0x00c4  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x00ca  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r10 = this;
                    r0 = 0
                    java.lang.String r7 = "tempkey=?"
                    r1 = 1
                    java.lang.String[] r8 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    java.lang.String r2 = r2     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    r3 = 0
                    r8[r3] = r2     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    com.umeng.message.inapp.InAppMessageManager r2 = com.umeng.message.inapp.InAppMessageManager.this     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    android.content.Context r2 = r2.f81181f     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    com.umeng.message.inapp.InAppMessageManager r4 = com.umeng.message.inapp.InAppMessageManager.this     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    android.content.Context r4 = r4.f81181f     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    com.umeng.message.provider.a.a(r4)     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    android.net.Uri r4 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    java.lang.String r1 = "tempvalue"
                    r5[r3] = r1     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    r6 = 0
                    r1 = r2
                    r2 = r4
                    r3 = r5
                    r4 = r7
                    r5 = r8
                    android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    if (r1 != 0) goto L_0x0060
                    android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    java.lang.String r2 = "tempkey"
                    java.lang.String r3 = r2     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.put(r2, r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    java.lang.String r2 = "tempvalue"
                    java.lang.String r3 = r3     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.put(r2, r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.inapp.InAppMessageManager r2 = com.umeng.message.inapp.InAppMessageManager.this     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.Context r2 = r2.f81181f     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.inapp.InAppMessageManager r3 = com.umeng.message.inapp.InAppMessageManager.this     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.Context r3 = r3.f81181f     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.provider.a.a(r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.net.Uri r3 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r2.insert(r3, r0)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    goto L_0x00b6
                L_0x005e:
                    r0 = move-exception
                    goto L_0x00c2
                L_0x0060:
                    boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    if (r0 == 0) goto L_0x008b
                    android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    java.lang.String r2 = "tempvalue"
                    java.lang.String r3 = r3     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.put(r2, r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.inapp.InAppMessageManager r2 = com.umeng.message.inapp.InAppMessageManager.this     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.Context r2 = r2.f81181f     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.inapp.InAppMessageManager r3 = com.umeng.message.inapp.InAppMessageManager.this     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.Context r3 = r3.f81181f     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.provider.a.a(r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.net.Uri r3 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r2.update(r3, r0, r7, r8)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    goto L_0x00b6
                L_0x008b:
                    android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    java.lang.String r2 = "tempkey"
                    java.lang.String r3 = r2     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.put(r2, r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    java.lang.String r2 = "tempvalue"
                    java.lang.String r3 = r3     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.put(r2, r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.inapp.InAppMessageManager r2 = com.umeng.message.inapp.InAppMessageManager.this     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.Context r2 = r2.f81181f     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.inapp.InAppMessageManager r3 = com.umeng.message.inapp.InAppMessageManager.this     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.Context r3 = r3.f81181f     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.provider.a.a(r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.net.Uri r3 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r2.insert(r3, r0)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                L_0x00b6:
                    if (r1 == 0) goto L_0x00ce
                    r1.close()
                    return
                L_0x00bc:
                    r0 = r1
                    goto L_0x00c8
                L_0x00be:
                    r1 = move-exception
                    r9 = r1
                    r1 = r0
                    r0 = r9
                L_0x00c2:
                    if (r1 == 0) goto L_0x00c7
                    r1.close()
                L_0x00c7:
                    throw r0
                L_0x00c8:
                    if (r0 == 0) goto L_0x00ce
                    r0.close()
                    return
                L_0x00ce:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.InAppMessageManager.AnonymousClass2.run():void");
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void a(UInAppMessage uInAppMessage, String str) {
        if (uInAppMessage == null) {
            b("KEY_LAST_CARD_ID_" + str, "");
            return;
        }
        if (uInAppMessage.getRaw() != null) {
            b("KEY_LAST_CARD_ID_" + str, uInAppMessage.getRaw().toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r10 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r10 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        return r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 0
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            r1.<init>()     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String r2 = "tempkey"
            r1.put(r2, r10)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String r6 = "tempkey=?"
            r1 = 1
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            r2 = 0
            r7[r2] = r10     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            android.content.Context r10 = r9.f81181f     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            android.content.Context r10 = r9.f81181f     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            com.umeng.message.provider.a.a(r10)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            android.net.Uri r4 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String r10 = "tempvalue"
            r5[r2] = r10     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            if (r10 != 0) goto L_0x0033
            if (r10 == 0) goto L_0x0032
            r10.close()
        L_0x0032:
            return r11
        L_0x0033:
            boolean r0 = r10.moveToFirst()     // Catch:{ Exception -> 0x0055, all -> 0x004a }
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "tempvalue"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ Exception -> 0x0055, all -> 0x004a }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ Exception -> 0x0055, all -> 0x004a }
            r11 = r0
        L_0x0044:
            if (r10 == 0) goto L_0x0058
        L_0x0046:
            r10.close()
            goto L_0x0058
        L_0x004a:
            r11 = move-exception
            r0 = r10
            goto L_0x004e
        L_0x004d:
            r11 = move-exception
        L_0x004e:
            if (r0 == 0) goto L_0x0053
            r0.close()
        L_0x0053:
            throw r11
        L_0x0054:
            r10 = r0
        L_0x0055:
            if (r10 == 0) goto L_0x0058
            goto L_0x0046
        L_0x0058:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.inapp.InAppMessageManager.a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public void a(String str, int i) {
        if (i == 0) {
            b(str, PushConstants.PUSH_TYPE_NOTIFY);
        }
        if (i == 1) {
            b(str, (j(str) + 1));
        }
    }

    public void showCardMessage(Activity activity, String str, IUmengInAppMsgCloseCallback iUmengInAppMsgCloseCallback) {
        new b(activity, str, iUmengInAppMsgCloseCallback).a();
    }

    public void setPlainTextSize(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0 || i3 <= 0) {
            UMLog.mutlInfo(f81179d, 0, "纯文本字体大小不能小于0");
            return;
        }
        b("KEY_PLAIN_TEXT_SIZE", i + "," + i2 + "," + i3);
    }

    /* access modifiers changed from: package-private */
    public void a(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!TextUtils.isEmpty(str)) {
            final String str2 = str;
            final int i9 = i;
            final int i10 = i2;
            final int i11 = i3;
            final int i12 = i4;
            final int i13 = i5;
            final int i14 = i6;
            final int i15 = i7;
            final int i16 = i8;
            AnonymousClass1 r1 = new Runnable() {
                public void run() {
                    try {
                        a a2 = InAppMessageManager.this.k(str2);
                        if (a2 != null) {
                            a aVar = new a(str2, i9, a2.f81231d + i10, a2.f81232e + i11, a2.f81233f + i12, a2.g + i13, a2.h + i14, a2.i + i15, a2.j);
                            String[] strArr = {str2};
                            ContentResolver contentResolver = InAppMessageManager.this.f81181f.getContentResolver();
                            a.a(InAppMessageManager.this.f81181f);
                            contentResolver.update(a.k, aVar.a(), "MsgId=?", strArr);
                        } else {
                            a aVar2 = new a(str2, i9, i10, i11, i12, i13, i14, i15, i16);
                            ContentResolver contentResolver2 = InAppMessageManager.this.f81181f.getContentResolver();
                            a.a(InAppMessageManager.this.f81181f);
                            contentResolver2.insert(a.k, aVar2.a());
                        }
                        UMLog.mutlInfo(InAppMessageManager.f81179d, 2, "store in app cache log success");
                    } catch (Exception unused) {
                        UMLog.mutlInfo(InAppMessageManager.f81179d, 0, "store in app cache log fail");
                    }
                }
            };
            d.a(r1);
        }
    }
}
