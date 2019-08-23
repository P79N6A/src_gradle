package com.ss.android.newmedia.thread;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Url;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.aj.b;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.k;

public final class AlertThread extends a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f30360e;
    static String g;
    private final Handler h;
    private final String i;
    private final Context j;
    private final boolean k;

    interface AlertThreadGetApi {
        @GET
        Call<String> getResponse(@Url String str);
    }

    static {
        String str;
        if (a.b()) {
            str = com.ss.android.newmedia.a.j;
        } else {
            str = com.ss.android.newmedia.a.i + "/service/2/app_alert/";
        }
        g = str;
    }

    public static int c() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], null, f30360e, true, 18863, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f30360e, true, 18863, new Class[0], Integer.TYPE)).intValue();
        }
        int b2 = b.b().b((Context) k.a(), "is_active", 0);
        if (d()) {
            i2 = b2;
        }
        return i2;
    }

    private static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f30360e, true, 18864, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f30360e, true, 18864, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String a2 = b.b().a(k.a(), "last_active_version");
        String a3 = b.b().a(k.a(), "last_channel");
        String a4 = b.b().a(k.a(), "last_device_id");
        String a5 = b.b().a(k.a(), "last_install_id");
        if (!TextUtils.equals(i.a().getVersion(), a2) || !TextUtils.equals(i.a().getChannel(), a3) || !TextUtils.equals(AppLog.getServerDeviceId(), a4) || !TextUtils.equals(AppLog.getInstallId(), a5)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:8|9|(1:11)|12|13|(1:15)|16|(1:18)|19|20|21|22|23|(2:27|(8:29|30|(2:32|(1:34))|35|37|38|(3:40|(1:42)|43)|(5:47|(3:49|(2:51|(2:53|62)(1:64))(1:63)|54)|61|55|56)))) */
    /* JADX WARNING: Can't wrap try/catch for region: R(17:7|8|9|(1:11)|12|13|(1:15)|16|(1:18)|19|20|21|22|23|(2:27|(8:29|30|(2:32|(1:34))|35|37|38|(3:40|(1:42)|43)|(5:47|(3:49|(2:51|(2:53|62)(1:64))(1:63)|54)|61|55|56)))|59|60) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x009f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00a4 */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d8 A[SYNTHETIC, Splitter:B:29:0x00d8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f30360e
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 18862(0x49ae, float:2.6431E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0023
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f30360e
            r5 = 0
            r6 = 18862(0x49ae, float:2.6431E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0023:
            int r1 = c()
            android.os.Handler r2 = r9.h
            if (r2 != 0) goto L_0x002c
            return
        L_0x002c:
            r2 = 18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r4 = g     // Catch:{ Throwable -> 0x01a1 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r4 = "?has_market="
            r3.append(r4)     // Catch:{ Throwable -> 0x01a1 }
            boolean r4 = r9.k     // Catch:{ Throwable -> 0x01a1 }
            r3.append(r4)     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r4 = r9.i     // Catch:{ Throwable -> 0x01a1 }
            boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x01a1 }
            if (r5 != 0) goto L_0x0053
            java.lang.String r5 = "&lang="
            r3.append(r5)     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r4 = android.net.Uri.encode(r4)     // Catch:{ Throwable -> 0x01a1 }
            r3.append(r4)     // Catch:{ Throwable -> 0x01a1 }
        L_0x0053:
            android.content.Context r4 = r9.j     // Catch:{ Exception -> 0x009f }
            java.lang.String r5 = "phone"
            java.lang.Object r4 = r4.getSystemService(r5)     // Catch:{ Exception -> 0x009f }
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch:{ Exception -> 0x009f }
            java.lang.String r5 = r4.getNetworkOperatorName()     // Catch:{ Exception -> 0x009f }
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Exception -> 0x009f }
            if (r6 != 0) goto L_0x0073
            java.lang.String r6 = "&carrier="
            r3.append(r6)     // Catch:{ Exception -> 0x009f }
            java.lang.String r5 = android.net.Uri.encode(r5)     // Catch:{ Exception -> 0x009f }
            r3.append(r5)     // Catch:{ Exception -> 0x009f }
        L_0x0073:
            java.lang.String r4 = r4.getNetworkOperator()     // Catch:{ Exception -> 0x009f }
            boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Exception -> 0x009f }
            if (r5 != 0) goto L_0x0089
            java.lang.String r5 = "&mcc_mnc="
            r3.append(r5)     // Catch:{ Exception -> 0x009f }
            java.lang.String r4 = android.net.Uri.encode(r4)     // Catch:{ Exception -> 0x009f }
            r3.append(r4)     // Catch:{ Exception -> 0x009f }
        L_0x0089:
            android.content.Context r4 = r9.j     // Catch:{ Exception -> 0x009f }
            java.lang.String r4 = com.ss.android.common.util.NetworkUtils.getNetworkAccessType((android.content.Context) r4)     // Catch:{ Exception -> 0x009f }
            java.lang.String r5 = "&access="
            r3.append(r5)     // Catch:{ Exception -> 0x009f }
            r3.append(r4)     // Catch:{ Exception -> 0x009f }
            java.lang.String r4 = "&is_activated="
            r3.append(r4)     // Catch:{ Exception -> 0x009f }
            r3.append(r1)     // Catch:{ Exception -> 0x009f }
        L_0x009f:
            android.content.Context r1 = r9.j     // Catch:{ Throwable -> 0x00a4 }
            com.ss.android.j.f.a((android.content.Context) r1, (java.lang.StringBuilder) r3)     // Catch:{ Throwable -> 0x00a4 }
        L_0x00a4:
            java.lang.String r1 = r3.toString()     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r3 = "https://aweme.snssdk.com"
            r4 = 0
            com.ss.android.ugc.aweme.framework.services.IRetrofit r3 = com.ss.android.ugc.aweme.app.api.m.a(r3, r4)     // Catch:{ Throwable -> 0x01a1 }
            java.lang.Class<com.ss.android.newmedia.thread.AlertThread$AlertThreadGetApi> r4 = com.ss.android.newmedia.thread.AlertThread.AlertThreadGetApi.class
            java.lang.Object r3 = r3.create(r4)     // Catch:{ Throwable -> 0x01a1 }
            com.ss.android.newmedia.thread.AlertThread$AlertThreadGetApi r3 = (com.ss.android.newmedia.thread.AlertThread.AlertThreadGetApi) r3     // Catch:{ Throwable -> 0x01a1 }
            com.bytedance.retrofit2.Call r1 = r3.getResponse(r1)     // Catch:{ Throwable -> 0x01a1 }
            com.bytedance.retrofit2.SsResponse r1 = r1.execute()     // Catch:{ Throwable -> 0x01a1 }
            java.lang.Object r1 = r1.body()     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x01a1 }
            if (r1 == 0) goto L_0x01a8
            int r3 = r1.length()     // Catch:{ Throwable -> 0x01a1 }
            if (r3 == 0) goto L_0x01a8
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x01a1 }
            r3.<init>(r1)     // Catch:{ Throwable -> 0x01a1 }
            boolean r1 = a(r3)     // Catch:{ Throwable -> 0x01a1 }
            if (r1 == 0) goto L_0x01a8
            boolean r1 = com.ss.android.newmedia.o.f30257a     // Catch:{ Throwable -> 0x00e8 }
            if (r1 == 0) goto L_0x00e8
            android.content.Context r1 = r9.j     // Catch:{ Throwable -> 0x00e8 }
            boolean r4 = com.ss.android.j.a.f29273a     // Catch:{ Throwable -> 0x00e8 }
            if (r4 != 0) goto L_0x00e8
            boolean r1 = com.ss.android.j.a.a(r1)     // Catch:{ Throwable -> 0x00e8 }
            com.ss.android.j.a.f29273a = r1     // Catch:{ Throwable -> 0x00e8 }
        L_0x00e8:
            java.lang.String r1 = "datalist"
            org.json.JSONArray r1 = r3.optJSONArray(r1)     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r4 = "data"
            org.json.JSONObject r3 = r3.optJSONObject(r4)     // Catch:{ Throwable -> 0x01a1 }
            if (r3 == 0) goto L_0x0167
            java.lang.String r4 = "is_activated"
            int r3 = r3.optInt(r4)     // Catch:{ Throwable -> 0x01a1 }
            r4 = 1
            if (r3 != r4) goto L_0x010e
            com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Throwable -> 0x01a1 }
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r5 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r4 = r4.getService(r5)     // Catch:{ Throwable -> 0x01a1 }
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r4 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r4     // Catch:{ Throwable -> 0x01a1 }
            r4.setHasActive()     // Catch:{ Throwable -> 0x01a1 }
        L_0x010e:
            com.ss.android.ugc.aweme.aj.b r4 = com.ss.android.ugc.aweme.aj.b.b()     // Catch:{ Throwable -> 0x01a1 }
            com.ss.android.ugc.aweme.app.k r5 = com.ss.android.ugc.aweme.app.k.a()     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r6 = "is_active"
            r4.a((android.content.Context) r5, (java.lang.String) r6, (int) r3)     // Catch:{ Throwable -> 0x01a1 }
            com.ss.android.ugc.aweme.aj.b r3 = com.ss.android.ugc.aweme.aj.b.b()     // Catch:{ Throwable -> 0x01a1 }
            com.ss.android.ugc.aweme.app.k r4 = com.ss.android.ugc.aweme.app.k.a()     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r5 = "last_active_version"
            com.ss.android.ugc.aweme.app.i r6 = com.ss.android.ugc.aweme.app.i.a()     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r6 = r6.getVersion()     // Catch:{ Throwable -> 0x01a1 }
            r3.a((android.content.Context) r4, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Throwable -> 0x01a1 }
            com.ss.android.ugc.aweme.aj.b r3 = com.ss.android.ugc.aweme.aj.b.b()     // Catch:{ Throwable -> 0x01a1 }
            com.ss.android.ugc.aweme.app.k r4 = com.ss.android.ugc.aweme.app.k.a()     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r5 = "last_channel"
            com.ss.android.ugc.aweme.app.i r6 = com.ss.android.ugc.aweme.app.i.a()     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r6 = r6.getChannel()     // Catch:{ Throwable -> 0x01a1 }
            r3.a((android.content.Context) r4, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Throwable -> 0x01a1 }
            com.ss.android.ugc.aweme.aj.b r3 = com.ss.android.ugc.aweme.aj.b.b()     // Catch:{ Throwable -> 0x01a1 }
            com.ss.android.ugc.aweme.app.k r4 = com.ss.android.ugc.aweme.app.k.a()     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r5 = "last_device_id"
            java.lang.String r6 = com.ss.android.common.applog.AppLog.getServerDeviceId()     // Catch:{ Throwable -> 0x01a1 }
            r3.a((android.content.Context) r4, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Throwable -> 0x01a1 }
            com.ss.android.ugc.aweme.aj.b r3 = com.ss.android.ugc.aweme.aj.b.b()     // Catch:{ Throwable -> 0x01a1 }
            com.ss.android.ugc.aweme.app.k r4 = com.ss.android.ugc.aweme.app.k.a()     // Catch:{ Throwable -> 0x01a1 }
            java.lang.String r5 = "last_install_id"
            java.lang.String r6 = com.ss.android.common.applog.AppLog.getInstallId()     // Catch:{ Throwable -> 0x01a1 }
            r3.a((android.content.Context) r4, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ Throwable -> 0x01a1 }
        L_0x0167:
            if (r1 == 0) goto L_0x01a8
            int r3 = r1.length()     // Catch:{ Throwable -> 0x01a1 }
            if (r3 <= 0) goto L_0x01a8
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x01a1 }
            r2.<init>()     // Catch:{ Throwable -> 0x01a1 }
            int r3 = r1.length()     // Catch:{ Throwable -> 0x01a1 }
        L_0x0178:
            if (r0 >= r3) goto L_0x0191
            org.json.JSONObject r4 = r1.optJSONObject(r0)     // Catch:{ Throwable -> 0x01a1 }
            if (r4 == 0) goto L_0x018e
            com.ss.android.newmedia.a.a r5 = new com.ss.android.newmedia.a.a     // Catch:{ Throwable -> 0x01a1 }
            r5.<init>()     // Catch:{ Throwable -> 0x01a1 }
            boolean r4 = r5.a(r4)     // Catch:{ Throwable -> 0x01a1 }
            if (r4 == 0) goto L_0x018e
            r2.add(r5)     // Catch:{ Throwable -> 0x01a1 }
        L_0x018e:
            int r0 = r0 + 1
            goto L_0x0178
        L_0x0191:
            android.os.Handler r0 = r9.h     // Catch:{ Throwable -> 0x01a1 }
            r1 = 10003(0x2713, float:1.4017E-41)
            android.os.Message r0 = r0.obtainMessage(r1)     // Catch:{ Throwable -> 0x01a1 }
            r0.obj = r2     // Catch:{ Throwable -> 0x01a1 }
            android.os.Handler r1 = r9.h     // Catch:{ Throwable -> 0x01a1 }
            r1.sendMessage(r0)     // Catch:{ Throwable -> 0x01a1 }
            return
        L_0x01a1:
            r0 = move-exception
            android.content.Context r1 = r9.j
            int r2 = com.ss.android.newmedia.e.a((android.content.Context) r1, (java.lang.Throwable) r0)
        L_0x01a8:
            android.os.Handler r0 = r9.h
            r1 = 10004(0x2714, float:1.4019E-41)
            android.os.Message r0 = r0.obtainMessage(r1)
            r0.arg1 = r2
            android.os.Handler r1 = r9.h
            r1.sendMessage(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.thread.AlertThread.run():void");
    }

    public AlertThread(Context context, Handler handler, boolean z) {
        this.h = handler;
        this.j = context.getApplicationContext();
        this.i = context.getResources().getConfiguration().locale.getLanguage();
        this.k = z;
    }
}
