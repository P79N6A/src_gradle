package com.ss.android.message;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import com.bytedance.common.utility.concurrent.AsyncTaskUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.app.f;
import com.ss.android.pushmanager.setting.b;
import java.io.File;
import java.io.IOException;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30004a;

    /* renamed from: b  reason: collision with root package name */
    Context f30005b = this.f30006c.getApplicationContext();

    /* renamed from: c  reason: collision with root package name */
    NotifyService f30006c;

    /* renamed from: d  reason: collision with root package name */
    public String f30007d;

    public final void b() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f30004a, false, 17853, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30004a, false, 17853, new Class[0], Void.TYPE);
            return;
        }
        f.a(this.f30005b.getApplicationContext(), new String[]{"noPushFile"});
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f30004a, false, 17852, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30004a, false, 17852, new Class[0], Void.TYPE);
            return;
        }
        String a2 = f.a(this.f30005b.getApplicationContext());
        if (a2 != null) {
            File file = new File(a2 + "/files/noPushFile");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException unused) {
                }
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f30004a, false, 17854, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30004a, false, 17854, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT < 21 && b.a().u() && f.a(this.f30005b.getApplicationContext()) != null) {
            AsyncTaskUtils.executeAsyncTask(new AsyncTask<Void, Void, Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f30008a;

                /* access modifiers changed from: private */
                /* JADX WARNING: Can't wrap try/catch for region: R(8:4|5|6|9|10|11|12|(29:14|(1:16)|17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(4:31|(1:33)|34|(1:36))|37|38|39|(1:43)|44|45|47|48|(4:51|(2:53|83)(1:82)|80|49)|81|54|(1:56)|57|(1:59)|60|61|78)(5:62|63|64|65|66)) */
                /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
                    r2.close();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:74:0x02b1, code lost:
                    r2 = null;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:76:0x02b2, code lost:
                    if (r2 != null) goto L_0x029f;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:7:0x003c, code lost:
                    r0 = th;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:8:0x003d, code lost:
                    r2 = null;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0040 */
                /* JADX WARNING: Removed duplicated region for block: B:14:0x0095 A[Catch:{ Throwable -> 0x02b2, all -> 0x02aa }] */
                /* JADX WARNING: Removed duplicated region for block: B:62:0x02a3 A[SYNTHETIC, Splitter:B:62:0x02a3] */
                /* JADX WARNING: Removed duplicated region for block: B:70:0x02ad A[SYNTHETIC, Splitter:B:70:0x02ad] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Void doInBackground(java.lang.Void... r13) {
                    /*
                        r12 = this;
                        r8 = 1
                        java.lang.Object[] r1 = new java.lang.Object[r8]
                        r9 = 0
                        r1[r9] = r13
                        com.meituan.robust.ChangeQuickRedirect r3 = f30008a
                        java.lang.Class[] r6 = new java.lang.Class[r8]
                        java.lang.Class<java.lang.Void[]> r2 = java.lang.Void[].class
                        r6[r9] = r2
                        java.lang.Class<java.lang.Void> r7 = java.lang.Void.class
                        r4 = 0
                        r5 = 17855(0x45bf, float:2.502E-41)
                        r2 = r12
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                        if (r1 == 0) goto L_0x0033
                        java.lang.Object[] r1 = new java.lang.Object[r8]
                        r1[r9] = r13
                        com.meituan.robust.ChangeQuickRedirect r3 = f30008a
                        r4 = 0
                        r5 = 17855(0x45bf, float:2.502E-41)
                        java.lang.Class[] r6 = new java.lang.Class[r8]
                        java.lang.Class<java.lang.Void[]> r0 = java.lang.Void[].class
                        r6[r9] = r0
                        java.lang.Class<java.lang.Void> r7 = java.lang.Void.class
                        r2 = r12
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                        java.lang.Void r0 = (java.lang.Void) r0
                        return r0
                    L_0x0033:
                        r1 = 0
                        java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0040 }
                        r2 = 1000(0x3e8, double:4.94E-321)
                        r0.sleep(r2)     // Catch:{ InterruptedException -> 0x0040 }
                        goto L_0x0040
                    L_0x003c:
                        r0 = move-exception
                        r2 = r1
                        goto L_0x02ab
                    L_0x0040:
                        android.net.LocalSocket r2 = new android.net.LocalSocket     // Catch:{ Throwable -> 0x02b1, all -> 0x003c }
                        r2.<init>()     // Catch:{ Throwable -> 0x02b1, all -> 0x003c }
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r0.<init>()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        com.ss.android.message.g r3 = com.ss.android.message.g.this     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        android.content.Context r3 = r3.f30005b     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = r3.getPackageName()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r0.append(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = "/"
                        r0.append(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        com.ss.android.message.g r3 = com.ss.android.message.g.this     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = r3.f30007d     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r0.append(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        android.net.LocalSocketAddress r3 = new android.net.LocalSocketAddress     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        android.net.LocalSocketAddress$Namespace r4 = android.net.LocalSocketAddress.Namespace.ABSTRACT     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r3.<init>(r0, r4)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r2.connect(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.io.OutputStream r3 = r2.getOutputStream()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r0.<init>(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r3.<init>()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        com.ss.android.pushmanager.setting.b r4 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.a((java.util.Map<java.lang.String, java.lang.String>) r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        com.ss.android.pushmanager.setting.b r4 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r4 = r4.g()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r5 != 0) goto L_0x02a3
                        com.ss.android.pushmanager.d r5 = com.ss.android.pushmanager.f.a()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        com.ss.android.message.g r6 = com.ss.android.message.g.this     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        android.content.Context r6 = r6.f30005b     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        android.content.Context r6 = r6.getApplicationContext()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r4 = r5.a((android.content.Context) r6, (java.lang.String) r4)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = "\""
                        r5.<init>(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r5.append(r4)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r6 = 63
                        int r4 = r4.indexOf(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r4 >= 0) goto L_0x00bf
                        java.lang.String r4 = "?"
                        r5.append(r4)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                    L_0x00bf:
                        java.util.TreeMap r4 = new java.util.TreeMap     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.<init>()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = com.ss.android.pushmanager.i.f30562a     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.Object r6 = r3.get(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r7 != 0) goto L_0x00db
                        java.lang.String r7 = "did"
                        java.lang.String r6 = com.bytedance.common.utility.StringUtils.strEncode(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r7, r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                    L_0x00db:
                        java.lang.String r6 = com.ss.android.pushmanager.i.f30563b     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.Object r6 = r3.get(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r7 != 0) goto L_0x00f2
                        java.lang.String r7 = "iid"
                        java.lang.String r6 = com.bytedance.common.utility.StringUtils.strEncode(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r7, r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                    L_0x00f2:
                        java.lang.String r6 = com.ss.android.pushmanager.i.f30564c     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.Object r6 = r3.get(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r7 != 0) goto L_0x0109
                        java.lang.String r7 = "user_id"
                        java.lang.String r6 = com.bytedance.common.utility.StringUtils.strEncode(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r7, r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                    L_0x0109:
                        java.lang.String r6 = com.ss.android.pushmanager.i.f30565d     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.Object r3 = r3.get(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r6 != 0) goto L_0x0120
                        java.lang.String r6 = "openudid"
                        java.lang.String r3 = com.bytedance.common.utility.StringUtils.strEncode(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r6, r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                    L_0x0120:
                        com.ss.android.pushmanager.app.e r3 = com.ss.android.pushmanager.app.e.a()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        com.ss.android.pushmanager.c r3 = r3.b()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r3 == 0) goto L_0x0194
                        java.lang.String r6 = "aid"
                        int r7 = r3.c()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r7 = com.bytedance.common.utility.StringUtils.strEncode(r7)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r6, r7)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = "channel"
                        java.lang.String r7 = r3.d()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r7 = com.bytedance.common.utility.StringUtils.strEncode(r7)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r6, r7)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = "app_version"
                        java.lang.String r7 = r3.e()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r7 = com.bytedance.common.utility.StringUtils.strEncode(r7)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r6, r7)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = "version_code"
                        int r7 = r3.f()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r7 = com.bytedance.common.utility.StringUtils.strEncode(r7)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r6, r7)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = r3.b()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r6 != 0) goto L_0x017d
                        java.lang.String r6 = "app_name"
                        java.lang.String r3 = r3.b()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = com.bytedance.common.utility.StringUtils.strEncode(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r6, r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                    L_0x017d:
                        com.ss.android.pushmanager.setting.b r3 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = r3.n()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        boolean r6 = com.ss.android.message.b.h.b(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r6 != 0) goto L_0x0194
                        java.lang.String r6 = "uuid"
                        java.lang.String r3 = com.bytedance.common.utility.StringUtils.strEncode(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r6, r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                    L_0x0194:
                        java.lang.String r3 = "device_model"
                        java.lang.String r6 = android.os.Build.MODEL     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = com.bytedance.common.utility.StringUtils.strEncode(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r3, r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = "os_api"
                        int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = com.bytedance.common.utility.StringUtils.strEncode(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r3, r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x01c7 }
                        if (r3 == 0) goto L_0x01be
                        int r6 = r3.length()     // Catch:{ Exception -> 0x01c7 }
                        r7 = 10
                        if (r6 <= r7) goto L_0x01be
                        java.lang.String r3 = r3.substring(r9, r7)     // Catch:{ Exception -> 0x01c7 }
                    L_0x01be:
                        java.lang.String r6 = "os_version"
                        java.lang.String r3 = com.bytedance.common.utility.StringUtils.strEncode(r3)     // Catch:{ Exception -> 0x01c7 }
                        r4.put(r6, r3)     // Catch:{ Exception -> 0x01c7 }
                    L_0x01c7:
                        java.lang.String r3 = "device_platform"
                        java.lang.String r6 = "android"
                        java.lang.String r6 = com.bytedance.common.utility.StringUtils.strEncode(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.put(r3, r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r3.<init>()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.util.Set r6 = r4.entrySet()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.util.Iterator r6 = r6.iterator()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r7 = 0
                    L_0x01e0:
                        boolean r10 = r6.hasNext()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r10 == 0) goto L_0x0210
                        java.lang.Object r10 = r6.next()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.Object r11 = r10.getKey()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r11 = (java.lang.String) r11     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r3.append(r11)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r11 = "="
                        r3.append(r11)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.Object r10 = r10.getValue()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r10 = (java.lang.String) r10     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r3.append(r10)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        int r7 = r7 + r8
                        int r10 = r4.size()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r7 == r10) goto L_0x01e0
                        java.lang.String r10 = "&"
                        r3.append(r10)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        goto L_0x01e0
                    L_0x0210:
                        java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.<init>()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = r3.toString()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r4.append(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r6 = "device_info_url_salt_650fa7"
                        r4.append(r6)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r5.append(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = "&sign="
                        r5.append(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = "MD5"
                        java.lang.String r3 = com.bytedance.common.utility.StringEncryptUtils.encrypt(r4, r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r5.append(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = "\""
                        r5.append(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = r5.toString()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r4 != 0) goto L_0x0266
                        byte[] r4 = com.ss.android.message.k.a(r9)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r0.write(r4)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        byte[] r4 = r3.getBytes()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        int r4 = r4.length     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        byte[] r4 = com.ss.android.message.k.a(r4)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r0.write(r4)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        byte[] r3 = r3.getBytes()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r0.write(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r0.flush()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                    L_0x0266:
                        int r3 = r5.length()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r5.delete(r9, r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        com.ss.android.message.g r3 = com.ss.android.message.g.this     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        android.content.Context r3 = r3.f30005b     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = com.ss.android.message.b.k.c(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r5.append(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        java.lang.String r3 = r5.toString()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        if (r4 != 0) goto L_0x029f
                        byte[] r4 = com.ss.android.message.k.a(r8)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r0.write(r4)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        byte[] r4 = r3.getBytes()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        int r4 = r4.length     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        byte[] r4 = com.ss.android.message.k.a(r4)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r0.write(r4)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        byte[] r3 = r3.getBytes()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r0.write(r3)     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r0.flush()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                    L_0x029f:
                        r2.close()     // Catch:{ IOException -> 0x02b5 }
                        goto L_0x02b5
                    L_0x02a3:
                        com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x02b2, all -> 0x02aa }
                        r2.close()     // Catch:{ IOException -> 0x02a9 }
                    L_0x02a9:
                        return r1
                    L_0x02aa:
                        r0 = move-exception
                    L_0x02ab:
                        if (r2 == 0) goto L_0x02b0
                        r2.close()     // Catch:{ IOException -> 0x02b0 }
                    L_0x02b0:
                        throw r0
                    L_0x02b1:
                        r2 = r1
                    L_0x02b2:
                        if (r2 == 0) goto L_0x02b5
                        goto L_0x029f
                    L_0x02b5:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.g.AnonymousClass1.doInBackground(java.lang.Void[]):java.lang.Void");
                }
            }, new Void[0]);
        }
    }

    public g(NotifyService notifyService) {
        this.f30006c = notifyService;
    }
}
