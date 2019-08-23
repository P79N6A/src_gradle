package com.huawei.android.pushagent.b.e;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.android.pushagent.PushService;
import com.huawei.android.pushagent.a.b.i;
import com.huawei.android.pushagent.a.b.l;
import com.huawei.android.pushagent.a.b.m;
import com.huawei.android.pushagent.a.b.n;
import com.huawei.android.pushagent.a.b.o;
import com.huawei.android.pushagent.a.b.p;
import com.huawei.android.pushagent.a.b.q;
import com.huawei.android.pushagent.b.a;
import com.huawei.android.pushagent.utils.a.a.f;
import com.huawei.android.pushagent.utils.a.b;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;
import com.huawei.android.pushagent.utils.tools.PushServiceTools;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private static List f25100a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f25101b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private String[] f25102c;

    /* renamed from: d  reason: collision with root package name */
    private List f25103d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private List f25104e = new ArrayList();

    public d(Context context) {
        if (!com.huawei.android.pushagent.utils.tools.d.c()) {
            e.a("PushLogAC2815", "not support ctrlsocket v2 ");
        } else if (1 == com.huawei.android.pushagent.utils.tools.d.b()) {
            e.a("PushLogAC2815", "push is in socket ctrl model, only white packages app can use push");
            this.f25102c = com.huawei.android.pushagent.utils.tools.d.a();
        } else {
            e.a("PushLogAC2815", "all apps can use push");
            this.f25102c = new String[0];
        }
    }

    private void a(Context context) {
        if (-1 == b.a(context)) {
            e.d("PushLogAC2815", "sendAllMessagetoServer have no net work");
        } else if (!com.huawei.android.pushagent.b.a.a.e().a()) {
            e.d("PushLogAC2815", "sendAllMessagetoServer have no channel or no connection");
        } else {
            e.b("PushLogAC2815", "sendAllMessagetoServer get the client");
            ArrayList b2 = b.b(context);
            for (Map.Entry key : new h(context, "pclient_unRegist_info_v2").b().entrySet()) {
                b2.add(new p(f.b(context, (String) key.getKey())));
            }
            e.a("PushLogAC2815", "send all client registerToken message count to Sever is " + b2.size());
            if (b2.size() > 0) {
                Iterator it2 = b2.iterator();
                while (it2.hasNext()) {
                    try {
                        com.huawei.android.pushagent.b.a.a.e().a((com.huawei.android.pushagent.a.b) (com.huawei.android.pushagent.a.b.a.b) it2.next());
                    } catch (Exception e2) {
                        e.c("PushLogAC2815", "call ChannelMgr.getPushChannel().send cause:" + e2.toString(), e2);
                    }
                }
                return;
            }
            e.b("PushLogAC2815", "no more client need register and unregister");
        }
    }

    private void a(Context context, l lVar) {
        List list;
        com.huawei.android.pushagent.a.b.a aVar;
        String str;
        String str2;
        e.b("PushLogAC2815", "enter rspPushMessage");
        byte[] e2 = lVar.e();
        String str3 = "";
        if (e2 == null) {
            e.d("PushLogAC2815", "token is null, error!");
            return;
        }
        try {
            str3 = new String(e2, "UTF-8");
        } catch (Exception e3) {
            e.c("PushLogAC2815", e3.toString(), e3);
        }
        String str4 = "";
        byte[] d2 = lVar.d();
        byte[] h = lVar.h();
        if (h != null && h.length > 0) {
            if (h.length == lVar.g()) {
                try {
                    str4 = new String(h, "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    e.d("PushLogAC2815", "UnsupportedEncodingException occur");
                }
                e.a("PushLogAC2815", "rspPushMessage from srv response pkgname is :" + str4);
            }
        } else if (b.a(context).f25095a != null) {
            str4 = (String) b.a(context).f25095a.get(str3);
        }
        String a2 = com.huawei.android.pushagent.utils.a.a(d2);
        e.a("PushLogAC2815", "rspPushMessage token =" + com.huawei.android.pushagent.utils.a.a.e.a(str3) + " pkgname=" + str4 + " msgId=" + a2);
        boolean z = false;
        m mVar = new m(d2, (byte) 0);
        if (com.huawei.android.pushagent.utils.a.i(context).equals(str3)) {
            if (b(a2)) {
                str = "PushLogAC2815";
                str2 = "msgId duplicate, do not show it";
            } else {
                a(a2);
                if (this.f25102c != null && this.f25102c.length > 0) {
                    if (!TextUtils.isEmpty(str4)) {
                        String[] strArr = this.f25102c;
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (str4.equals(strArr[i])) {
                                z = true;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!z) {
                        e.a("PushLogAC2815", "push message's owner is not white app, send it when screen on");
                        list = this.f25104e;
                        aVar = new com.huawei.android.pushagent.a.b.a(str4, e2, lVar.f());
                        list.add(aVar);
                        com.huawei.android.pushagent.b.a.a.e().a((com.huawei.android.pushagent.a.b) mVar);
                        e.b("PushLogAC2815", "rspPushMessage the response msg is :" + mVar);
                    }
                }
                b(context, e2, lVar.f());
                com.huawei.android.pushagent.b.a.a.e().a((com.huawei.android.pushagent.a.b) mVar);
                e.b("PushLogAC2815", "rspPushMessage the response msg is :" + mVar);
            }
        } else if (str4 == null || !PushServiceTools.isPkgInstall(context, str4)) {
            e.d("PushLogAC2815", "pkgName" + str4 + " is null or not exist in local");
            mVar = new m(d2, (byte) 2);
            com.huawei.android.pushagent.b.a.a.e().a((com.huawei.android.pushagent.a.b) mVar);
            e.b("PushLogAC2815", "rspPushMessage the response msg is :" + mVar);
        } else if (b(a2)) {
            str = "PushLogAC2815";
            str2 = "msgId duplicate, do not sent it to other apps";
        } else {
            a(a2);
            if (this.f25102c != null && this.f25102c.length > 0) {
                String[] strArr2 = this.f25102c;
                int length2 = strArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    } else if (str4.equals(strArr2[i2])) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    e.a("PushLogAC2815", "push message's owner is not white app, send it when screen on");
                    list = this.f25103d;
                    aVar = new com.huawei.android.pushagent.a.b.a(str4, e2, lVar.f());
                    list.add(aVar);
                    com.huawei.android.pushagent.b.a.a.e().a((com.huawei.android.pushagent.a.b) mVar);
                    e.b("PushLogAC2815", "rspPushMessage the response msg is :" + mVar);
                }
            }
            a(context, str4, e2, lVar.f());
            com.huawei.android.pushagent.b.a.a.e().a((com.huawei.android.pushagent.a.b) mVar);
            e.b("PushLogAC2815", "rspPushMessage the response msg is :" + mVar);
        }
        e.b(str, str2);
        try {
            com.huawei.android.pushagent.b.a.a.e().a((com.huawei.android.pushagent.a.b) mVar);
        } catch (Exception e4) {
            e.c("PushLogAC2815", "call ChannelMgr.getPushChannel().send cause:" + e4.toString(), e4);
        }
        e.b("PushLogAC2815", "rspPushMessage the response msg is :" + mVar);
    }

    private void a(Context context, o oVar) {
        String str;
        String str2;
        if (oVar == null) {
            str = "PushLogAC2815";
            str2 = "responseRegisterToken have a wrong parm";
        } else {
            h hVar = new h(context, "pclient_request_info");
            if (!TextUtils.isEmpty(oVar.e())) {
                hVar.f(oVar.e());
            }
            if (oVar.f() == 1) {
                str = "PushLogAC2815";
                str2 = "responseRegisterToken FAILED:" + oVar.f();
            } else {
                String d2 = oVar.d();
                String e2 = oVar.e();
                e.a("PushLogAC2815", "pushSrv response register token to " + e2);
                if (TextUtils.isEmpty(e2) || TextUtils.isEmpty(d2)) {
                    str = "PushLogAC2815";
                    str2 = "pushSrv response registerToken a invalid message ";
                } else {
                    if (com.huawei.android.pushagent.utils.tools.d.c()) {
                        com.huawei.android.pushagent.utils.tools.d.a(e2);
                    }
                    b.a(context, d2, e2);
                    if (hVar.b().size() == 0) {
                        com.huawei.android.pushagent.utils.a.a.a(context, new Intent("com.huawei.action.CONNECT_PUSHSRV_POLLINGSRV").setPackage(context.getPackageName()));
                        PushService.a(new Intent("com.huawei.action.CONNECT_PUSHSRV_POLLINGSRV"));
                    }
                    a(context, e2, d2);
                    return;
                }
            }
        }
        e.d(str, str2);
    }

    private void a(Context context, q qVar) {
        e.b("PushLogAC2815", "unregister token from pushsrv success");
        if (qVar == null) {
            e.d("PushLogAC2815", "responseUnregisterToken have an wrong param");
            return;
        }
        String d2 = qVar.d();
        b.c(context, d2);
        com.huawei.android.pushagent.utils.a.f.b(context, d2);
        PushService.a(new Intent("com.huawei.action.CONNECT_PUSHSRV_POLLINGSRV"));
    }

    private void a(Context context, String str) {
        e.b("PushLogAC2815", "begin to get token from pushSrv, packagename = " + str);
        String a2 = com.huawei.android.pushagent.utils.a.a(context);
        new h(context, "pclient_request_info").a(str, "true");
        if (!com.huawei.android.pushagent.b.a.a.e().a()) {
            PushService.a(new Intent("com.huawei.action.CONNECT_PUSHSRV_PUSHSRV").setPackage(context.getPackageName()));
            return;
        }
        try {
            com.huawei.android.pushagent.b.a.a.e().a((com.huawei.android.pushagent.a.b) new n(a2, com.huawei.android.pushagent.utils.a.f(context, str)));
        } catch (Exception e2) {
            e.c("PushLogAC2815", "call ChannelMgr.getPushChannel().send cause:" + e2.toString(), e2);
        }
        com.huawei.android.pushagent.utils.a.a.b(context, new Intent("com.huawei.action.CONNECT_PUSHSRV_POLLINGSRV").setPackage(context.getPackageName()), com.huawei.android.pushagent.b.b.a.a(context).F() * 1000);
    }

    private synchronized void a(Context context, String str, Boolean bool) {
        SharedPreferences.Editor edit = c.a(context, "pushConfig", 4).edit();
        edit.putBoolean("cloudpush_ConnectStatus", bool.booleanValue()).commit();
        edit.putLong(str, System.currentTimeMillis()).commit();
    }

    public static void a(Context context, String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                Intent flags = new Intent("com.huawei.android.push.intent.REGISTRATION").setPackage(str).putExtra("device_token", str2.getBytes("UTF-8")).putExtra("belongId", com.huawei.android.pushagent.b.b.a.a(context).b()).setFlags(32);
                e.a("PushLogAC2815", "send registerToken to:" + str + " token:" + com.huawei.android.pushagent.utils.a.a.e.a(str2));
                context.sendBroadcast(flags);
            } catch (Exception e2) {
                e.c("PushLogAC2815", e2.toString(), e2);
            }
        }
    }

    private void a(Context context, String str, byte[] bArr, byte[] bArr2) {
        if (com.huawei.android.pushagent.utils.tools.d.c()) {
            com.huawei.android.pushagent.utils.tools.d.a(2, 180);
        } else {
            com.huawei.android.pushagent.utils.a.a(2, 180);
        }
        Intent intent = new Intent("com.huawei.android.push.intent.RECEIVE");
        intent.setPackage(str).putExtra("msg_data", bArr2).putExtra("device_token", bArr).setFlags(32);
        context.sendBroadcast(intent);
        PushService.a(new Intent("com.huawei.android.push.intent.MSG_BROAD_TO_APP").putExtra("appName", str));
        e.a("PushLogAC2815", "broadcast pushDataRspMessage to " + str + " over");
    }

    private static void a(SharedPreferences sharedPreferences, NetworkInfo networkInfo) {
        StringBuilder sb;
        String str;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String string = sharedPreferences.getString("cloudpush_arrayOfNetEventTime", "");
        String str2 = "";
        if (!TextUtils.isEmpty(string) || string.equals("null")) {
            String[] split = string.split("\\,");
            int length = split.length - 1;
            StringBuffer stringBuffer = new StringBuffer();
            if (length == 16) {
                int i = 0;
                while (i < 15) {
                    StringBuilder sb2 = new StringBuilder();
                    i++;
                    sb2.append(split[i]);
                    sb2.append(",");
                    stringBuffer.append(sb2.toString());
                }
                str2 = stringBuffer.toString();
            } else if (length < 16) {
                str2 = string + ",";
            }
        }
        String num = Integer.toString(networkInfo.getType());
        if (networkInfo.isConnected() || networkInfo.isConnectedOrConnecting()) {
            sb = new StringBuilder();
            sb.append(num);
            str = "-1-";
        } else {
            sb = new StringBuilder();
            sb.append(num);
            str = "-0-";
        }
        sb.append(str);
        sb.append(Long.toString(System.currentTimeMillis()));
        String sb3 = sb.toString();
        edit.putString("cloudpush_arrayOfNetEventTime", str2 + sb3).commit();
    }

    private void a(String str) {
        synchronized (f25101b) {
            if (f25100a.size() >= 10) {
                f25100a.remove(0);
            }
            f25100a.add(str);
        }
    }

    private void b(Context context, Intent intent) {
        com.huawei.android.pushagent.a.b.a.b bVar = (com.huawei.android.pushagent.a.b.a.b) intent.getSerializableExtra("push_msg");
        if (bVar == null) {
            e.b("PushLogAC2815", "msg is null");
            return;
        }
        byte a2 = bVar.a();
        if (a2 == -96) {
            com.huawei.android.pushagent.utils.a.a(context, 10000);
            a(context, (l) bVar);
        } else if (a2 == -45) {
            com.huawei.android.pushagent.a.b.d dVar = (com.huawei.android.pushagent.a.b.d) bVar;
            if (dVar.d() == 0) {
                e.b("PushLogAC2815", "PushCommandProcessor device register success");
                com.huawei.android.pushagent.b.b.c.a(context, new com.huawei.android.pushagent.a.a("cloudpush_arrayOfNetEventTime", String.class, ""));
                com.huawei.android.pushagent.b.a.a.b(context).a(false);
                com.huawei.android.pushagent.b.a.a.b(context).g();
                a(context);
                return;
            }
            e.d("PushLogAC2815", "PushCommandProcessor device register fail:" + dVar.d());
        } else if (a2 != -41) {
            if (a2 != -37) {
                if (a2 == -35) {
                    com.huawei.android.pushagent.utils.a.a(context, 10000);
                    a(context, (o) bVar);
                } else if (a2 != -33) {
                    switch (a2) {
                        case -91:
                            a.a().a(context, (com.huawei.android.pushagent.a.b.b) bVar);
                            return;
                        case -90:
                            try {
                                com.huawei.android.pushagent.b.a.a.e().a((com.huawei.android.pushagent.a.b) new com.huawei.android.pushagent.a.b.b((byte) -89));
                            } catch (Exception e2) {
                                e.c("PushLogAC2815", "send serverToAgentMsgRsp error:" + e2.getMessage(), e2);
                            }
                            a.a().a(context, (com.huawei.android.pushagent.a.b.b) bVar);
                            break;
                    }
                } else {
                    i iVar = (i) bVar;
                    if (iVar.d() == 0) {
                        e.b("PushLogAC2815", "PushCommandProcessor device register success");
                        com.huawei.android.pushagent.b.b.c.a(context, new com.huawei.android.pushagent.a.a("cloudpush_arrayOfNetEventTime", String.class, ""));
                        com.huawei.android.pushagent.b.a.a.b(context).a(false);
                        com.huawei.android.pushagent.b.a.a.b(context).g();
                        a(context);
                        return;
                    }
                    e.d("PushLogAC2815", "PushCommandProcessor device register fail:" + iVar.d());
                }
            }
        } else {
            a(context, (q) bVar);
        }
    }

    private void b(Context context, String str) {
        e.a("PushLogAC2815", str + " will be unregister.");
        String d2 = b.d(context, str);
        if (!TextUtils.isEmpty(d2)) {
            try {
                com.huawei.android.pushagent.b.a.a.e().a((com.huawei.android.pushagent.a.b) new p(d2));
            } catch (Exception e2) {
                e.c("PushLogAC2815", "call ChannelMgr.getPushChannel().send cause:" + e2.toString(), e2);
            }
        }
    }

    private void b(Context context, byte[] bArr, byte[] bArr2) {
        try {
            e.b("PushLogAC2815", "enter deposeMessageBySelf");
            if (bArr2 == null) {
                e.d("PushLogAC2815", "enter deposeMessageBySelf msg is null!");
                return;
            }
            String str = new String(bArr2, "UTF-8");
            if (TextUtils.isEmpty(str)) {
                e.d("PushLogAC2815", "enter deposeMessageBySelf jsonStr is null!");
                return;
            }
            if (com.huawei.android.pushagent.utils.tools.d.c()) {
                com.huawei.android.pushagent.utils.tools.d.a(2, 180);
            } else {
                com.huawei.android.pushagent.utils.a.a(2, 180);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(PushConstants.EXTRA_APPLICATION_PENDING_INTENT)) {
                    e.a("PushLogAC2815", "jsonStr has a mapping for app");
                    try {
                        int i = jSONObject.getInt(PushConstants.EXTRA_APPLICATION_PENDING_INTENT);
                        if (1 == i) {
                            c.a(context, str);
                            return;
                        }
                        e.b("PushLogAC2815", "the app value is not 1! it is " + i);
                    } catch (Exception e2) {
                        e.c("PushLogAC2815", e2.toString(), e2);
                    }
                } else {
                    e.a("PushLogAC2815", "jsonStr does not  have a mapping for app");
                }
            } catch (JSONException unused) {
                e.a("PushLogAC2815", str + " depose failed, maybe old selfShow message");
            }
            e.a("PushLogAC2815", "send selfShow message");
            a(context, bArr, bArr2);
        } catch (Exception e3) {
            e.c("PushLogAC2815", e3.toString(), e3);
        }
    }

    private boolean b(String str) {
        boolean contains;
        synchronized (f25101b) {
            contains = f25100a.contains(str);
        }
        return contains;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006c A[Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0072 A[Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0075 A[Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3 A[Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }, LOOP:0: B:21:0x00a0->B:23:0x00a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e9 A[Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.huawei.android.pushagent.a.b.h c(android.content.Context r17, java.lang.String r18) {
        /*
            r16 = this;
            java.lang.String r0 = "pushConfig"
            r1 = 0
            r2 = r17
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r2, r0, r1)
            java.lang.String r3 = com.huawei.android.pushagent.utils.a.g(r17)
            int r7 = java.lang.Integer.parseInt(r3)
            java.lang.String r3 = "cloudpush_off"
            r4 = 0
            long r8 = r0.getLong(r3, r4)
            java.lang.String r3 = "cloudpush_on"
            long r10 = r0.getLong(r3, r4)
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "cloudpush_arrayOfNetEventTime"
            java.lang.String r4 = ""
            java.lang.String r0 = r0.getString(r3, r4)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            if (r3 == 0) goto L_0x003c
            java.lang.String r3 = "null"
            boolean r3 = r0.equals(r3)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            if (r3 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r3 = 0
            goto L_0x0043
        L_0x003c:
            java.lang.String r3 = "\\,"
            java.lang.String[] r3 = r0.split(r3)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            int r3 = r3.length     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
        L_0x0043:
            java.lang.String r4 = "PushLogAC2815"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            java.lang.String r6 = "mDeviceTokenMgr.tokenMap.size:"
            r5.<init>(r6)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            com.huawei.android.pushagent.b.e.b r6 = com.huawei.android.pushagent.b.e.b.a(r17)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            java.util.HashMap r6 = r6.f25095a     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            int r6 = r6.size()     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r5.append(r6)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            java.lang.String r5 = r5.toString()     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            com.huawei.android.pushagent.utils.a.e.a(r4, r5)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            com.huawei.android.pushagent.b.e.b r4 = com.huawei.android.pushagent.b.e.b.a(r17)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            java.util.HashMap r4 = r4.f25095a     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            int r4 = r4.size()     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            if (r4 != 0) goto L_0x006e
            int r3 = r3 + 1
        L_0x006e:
            r4 = 16
            if (r3 <= r4) goto L_0x0075
            r14 = 16
            goto L_0x0076
        L_0x0075:
            r14 = r3
        L_0x0076:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            java.lang.String r5 = "netEventAccount is: "
            r4.<init>(r5)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r4.append(r14)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            com.huawei.android.pushagent.utils.a.e.a(r3, r4)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            com.huawei.android.pushagent.a.b.g[] r15 = new com.huawei.android.pushagent.a.b.g[r14]     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            if (r3 == 0) goto L_0x0099
            java.lang.String r3 = "null"
            boolean r3 = r0.equals(r3)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            if (r3 == 0) goto L_0x00dd
        L_0x0099:
            java.lang.String r3 = "\\,"
            java.lang.String[] r0 = r0.split(r3)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r3 = 0
        L_0x00a0:
            int r4 = r0.length     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            if (r3 >= r4) goto L_0x00dd
            r4 = r0[r3]     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            java.lang.String r5 = "\\-"
            java.lang.String[] r4 = r4.split(r5)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            com.huawei.android.pushagent.a.b.g r5 = new com.huawei.android.pushagent.a.b.g     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r5.<init>()     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r15[r3] = r5     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r5 = r15[r3]     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r6 = r4[r1]     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            byte r6 = (byte) r6     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r5.a((byte) r6)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r5 = r15[r3]     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r6 = 1
            r6 = r4[r6]     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            byte r6 = (byte) r6     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r5.b(r6)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r5 = r15[r3]     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r6 = 2
            r4 = r4[r6]     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            long r1 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r5.a((long) r1)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            int r3 = r3 + 1
            r1 = 0
            r2 = r17
            goto L_0x00a0
        L_0x00dd:
            com.huawei.android.pushagent.b.e.b r0 = com.huawei.android.pushagent.b.e.b.a(r17)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            java.util.HashMap r0 = r0.f25095a     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            int r0 = r0.size()     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            if (r0 != 0) goto L_0x011e
            int r0 = r14 + -1
            java.lang.String r1 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            java.lang.String r3 = "syncPos is: "
            r2.<init>(r3)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r2.append(r0)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            java.lang.String r2 = r2.toString()     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            com.huawei.android.pushagent.utils.a.e.a(r1, r2)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r1 = r15[r0]     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            if (r1 != 0) goto L_0x0109
            com.huawei.android.pushagent.a.b.g r1 = new com.huawei.android.pushagent.a.b.g     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r15[r0] = r1     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
        L_0x0109:
            r1 = r15[r0]     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r2 = -1
            r1.a((byte) r2)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r1 = r15[r0]     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r2 = 0
            r1.b(r2)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r0 = r15[r0]     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
            r0.a((long) r1)     // Catch:{ NumberFormatException -> 0x013c, Exception -> 0x012c }
        L_0x011e:
            com.huawei.android.pushagent.a.b.h r0 = new com.huawei.android.pushagent.a.b.h
            int r1 = com.huawei.android.pushagent.utils.a.b.a((android.content.Context) r17)
            byte r6 = (byte) r1
            r4 = r0
            r5 = r18
            r4.<init>(r5, r6, r7, r8, r10, r12, r14, r15)
            return r0
        L_0x012c:
            com.huawei.android.pushagent.a.b.h r0 = new com.huawei.android.pushagent.a.b.h
            int r1 = com.huawei.android.pushagent.utils.a.b.a((android.content.Context) r17)
            byte r6 = (byte) r1
            r14 = 0
            r15 = 0
            r4 = r0
            r5 = r18
            r4.<init>(r5, r6, r7, r8, r10, r12, r14, r15)
            return r0
        L_0x013c:
            com.huawei.android.pushagent.a.b.h r0 = new com.huawei.android.pushagent.a.b.h
            int r1 = com.huawei.android.pushagent.utils.a.b.a((android.content.Context) r17)
            byte r6 = (byte) r1
            r14 = 0
            r15 = 0
            r4 = r0
            r5 = r18
            r4.<init>(r5, r6, r7, r8, r10, r12, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.b.e.d.c(android.content.Context, java.lang.String):com.huawei.android.pushagent.a.b.h");
    }

    private void c(Context context, Intent intent) {
        com.huawei.android.pushagent.utils.a.a.a(context, new Intent("com.huawei.intent.action.PUSH_OFF").setPackage(context.getPackageName()).putExtra("Remote_Package_Name", context.getPackageName()));
        String stringExtra = intent.getStringExtra("pkg_name");
        e.a("PushLogAC2815", "PushCommandProcessor: get the packageName: " + stringExtra);
        if (TextUtils.isEmpty(stringExtra)) {
            e.d("PushLogAC2815", "PushCommandProcessor: get the wrong package name from the Client!");
        } else if (!PushServiceTools.isPkgInstall(context, stringExtra)) {
            e.d("PushLogAC2815", "rec register toke request , but the packageName:" + stringExtra + " was not install !!");
        } else {
            h hVar = new h(context, "pclient_unRegist_info_v2");
            Iterator it2 = hVar.b().entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (stringExtra.equals((String) entry.getValue())) {
                    e.a("PushLogAC2815", stringExtra + " need to register again");
                    hVar.f((String) entry.getKey());
                    break;
                }
            }
            if (b.a(context, stringExtra)) {
                e.a("PushLogAC2815", "PushCommandProcessor: this package:" + stringExtra + " have already registered ");
                a(context, stringExtra, b.d(context, stringExtra));
            } else {
                a(context, stringExtra);
            }
        }
    }

    private void d(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("pkg_name");
        if (TextUtils.isEmpty(stringExtra)) {
            e.a("PushLogAC2815", "packagename is null, cannot deregister");
            return;
        }
        e.a("PushLogAC2815", "responseClientUnRegistration: packagename = " + stringExtra);
        new h(context, "pclient_request_info").f(stringExtra);
        String stringExtra2 = intent.getStringExtra("device_token");
        if (intent.getBooleanExtra("isTokenEncrypt", false)) {
            stringExtra2 = f.b(context, stringExtra2);
        }
        if (TextUtils.isEmpty(stringExtra2)) {
            e.a("PushLogAC2815", "token is null, cannot deregister");
            return;
        }
        String d2 = b.d(context, stringExtra);
        if (!stringExtra2.equals(d2)) {
            e.b("PushLogAC2815", "token not match, cannot deregister. token is " + com.huawei.android.pushagent.utils.a.a.e.a(stringExtra2) + ", local token is " + com.huawei.android.pushagent.utils.a.a.e.a(d2));
            return;
        }
        if (com.huawei.android.pushagent.utils.tools.d.c()) {
            com.huawei.android.pushagent.utils.tools.d.b(stringExtra);
        }
        com.huawei.android.pushagent.utils.a.f.c(context, b.d(context, stringExtra), stringExtra);
        b(context, stringExtra);
        b.b(context, stringExtra);
    }

    private void e(Context context, Intent intent) {
        String str = "";
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        e.a("PushLogAC2815", "responseAddPackage pkgName= " + str);
        if (!TextUtils.isEmpty(str)) {
            e.a("PushLogAC2815", "responseAddPackage,isRegistered:" + b.a(context, str));
            if (b.a(context, str)) {
                if (com.huawei.android.pushagent.utils.a.c(context, str)) {
                    a(context, str);
                    return;
                }
                String d2 = b.d(context, str);
                Intent intent2 = new Intent();
                intent2.putExtra("pkg_name", str);
                intent2.putExtra("device_token", d2);
                d(context, intent);
            }
        }
    }

    private void f(Context context, Intent intent) {
        String str = "";
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.DATA_REMOVED", true);
        e.a("PushLogAC2815", "ACTION_PACKAGE_REMOVED : isRemoveData=" + booleanExtra + " remove pkgName:" + str);
        if (booleanExtra) {
            e.a("PushLogAC2815", "responseRemovePackage pkgName= " + str);
            if (com.huawei.android.pushagent.utils.a.c(context, str)) {
                e.a("PushLogAC2815", "received pkgRemove action, but pkg:" + str + " is exist and have com.huawei.android.push.intent.REGISTRATION" + ", register again");
                if (b.a(context, str)) {
                    a(context, str);
                }
                return;
            }
            String d2 = b.d(context, str);
            Intent intent2 = new Intent();
            intent2.putExtra("pkg_name", str);
            intent2.putExtra("device_token", d2);
            d(context, intent2);
        }
    }

    public void a(Context context, Intent intent) {
        String str;
        e.a("PushLogAC2815", "enter PushCommandProcessor:onReceive(intent:" + intent + " context:" + context);
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            SharedPreferences a2 = c.a(context, "pushConfig", 4);
            SharedPreferences.Editor edit = a2.edit();
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    str = "cloudpush_net_on";
                } else {
                    if (!networkInfo.isConnectedOrConnecting()) {
                        str = "cloudpush_net_off";
                    }
                    a(a2, networkInfo);
                }
                edit.putLong(str, System.currentTimeMillis()).commit();
                a(a2, networkInfo);
            } else {
                e.a("PushLogAC2815", "networkinfo is null");
            }
        } else if ("com.huawei.android.push.intent.CONNECTED".equals(action)) {
            a(context, "cloudpush_on", Boolean.TRUE);
            try {
                com.huawei.android.pushagent.b.a.a.e().a((com.huawei.android.pushagent.a.b) c(context, com.huawei.android.pushagent.utils.a.a(context)));
            } catch (Exception e2) {
                e.c("PushLogAC2815", "call ChannelMgr.getPushChannel().send cause:" + e2.toString(), e2);
            }
        } else if ("com.huawei.android.push.intent.CHANNEL_CLOSED".equals(action)) {
            a(context, "cloudpush_off", Boolean.FALSE);
        } else if ("com.huawei.android.push.intent.MSG_RECEIVED".equals(action)) {
            b(context, intent);
        } else if ("com.huawei.android.push.intent.REGISTER".equals(action)) {
            c(context, intent);
        } else if ("com.huawei.android.push.intent.DEREGISTER".equals(action)) {
            d(context, intent);
        } else if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
            e(context, intent);
        } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
            f(context, intent);
        } else if ("android.ctrlsocket.all.allowed".equals(action)) {
            this.f25102c = new String[0];
            e.b("PushLogAC2815", "all packages allow to use push, send cached messages to apps");
            for (com.huawei.android.pushagent.a.b.a aVar : this.f25103d) {
                if (!(aVar.b() == null || aVar.c() == null)) {
                    a(context, aVar.a(), aVar.b(), aVar.c());
                }
            }
            this.f25103d.clear();
            for (com.huawei.android.pushagent.a.b.a aVar2 : this.f25104e) {
                if (!(aVar2.b() == null || aVar2.c() == null)) {
                    b(context, aVar2.b(), aVar2.c());
                }
            }
            this.f25104e.clear();
        } else if ("android.scroff.ctrlsocket.status".equals(action)) {
            if (intent.getBooleanExtra("ctrl_socket_status", false)) {
                String stringExtra = intent.getStringExtra("ctrl_socket_list");
                e.b("PushLogAC2815", "only whitepackages can use push:" + stringExtra);
                if (!TextUtils.isEmpty(stringExtra)) {
                    this.f25102c = stringExtra.split("\t");
                }
                return;
            }
            this.f25102c = new String[0];
            e.a("PushLogAC2815", "not support push in sleep model");
        }
    }

    public void a(Context context, byte[] bArr, byte[] bArr2) {
        String str;
        StringBuilder sb;
        String jSONException;
        Intent intent;
        String str2 = "";
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr2, "UTF-8"));
            if (jSONObject.has("msgContent")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("msgContent");
                if (jSONObject2 != null && jSONObject2.has("dispPkgName")) {
                    str2 = jSONObject2.getString("dispPkgName");
                }
            }
            e.a("PushLogAC2815", "dispkgName is " + str2);
            if (TextUtils.isEmpty(str2)) {
                str2 = "com.huawei.android.pushagent";
            }
            if ("com.huawei.hwid".equals(context.getPackageName())) {
                e.a("PushLogAC2815", "try to send selfshow msg to HMS to depose selfshow msg");
                intent = new Intent("com.huawei.intent.action.PUSH");
                intent.putExtra("selfshow_info", bArr2);
                intent.putExtra("selfshow_token", bArr);
                intent.setFlags(32);
                intent.setPackage("com.huawei.hwid");
            } else if (context.getPackageName().equals(str2.trim())) {
                e.a("PushLogAC2815", "need current package " + context.getPackageName() + " to depose selfshow msg");
                Intent intent2 = new Intent("com.huawei.intent.action.PUSH");
                intent2.putExtra("selfshow_info", bArr2);
                intent2.putExtra("selfshow_token", bArr);
                intent2.setPackage(context.getPackageName());
                context.sendBroadcast(intent2);
            } else if (com.huawei.android.pushagent.utils.a.a(context, "com.huawei.android.push.intent.AD_INFO").contains(str2)) {
                e.a("PushLogAC2815", "need old package " + str2 + " to depose selfshow msg");
                intent = new Intent("com.huawei.android.push.intent.AD_INFO");
                intent.putExtra("ad_event_info", bArr2);
                intent.putExtra("ad_event_token", bArr);
                intent.setPackage(str2);
            } else {
                if (!com.huawei.android.pushagent.utils.a.d(context, str2)) {
                    if (!com.huawei.android.pushagent.utils.a.c(context, str2)) {
                        e.a("PushLogAC2815", "not find dispkgName " + str2 + " or is not pushclient");
                        Intent intent3 = new Intent("com.huawei.intent.action.PUSH");
                        intent3.putExtra("selfshow_info", bArr2);
                        intent3.putExtra("selfshow_token", bArr);
                        intent3.putExtra("selfshow_event_id", "5");
                        intent3.setPackage(context.getPackageName());
                        context.sendBroadcast(intent3);
                        return;
                    }
                }
                e.a("PushLogAC2815", "try to send selfshow msg to push client ,package " + str2 + " to depose selfshow msg");
                intent = new Intent("com.huawei.intent.action.PUSH");
                intent.putExtra("selfshow_info", bArr2);
                intent.putExtra("selfshow_token", bArr);
                intent.setFlags(32);
                intent.setPackage(str2);
            }
            context.sendBroadcast(intent);
        } catch (JSONException e2) {
            str = "PushLogAC2815";
            sb = new StringBuilder("deposeSelfShowMsg error:");
            jSONException = e2.toString();
            sb.append(jSONException);
            e.d(str, sb.toString());
        } catch (IOException e3) {
            str = "PushLogAC2815";
            sb = new StringBuilder("deposeSelfShowMsg error:");
            jSONException = e3.toString();
            sb.append(jSONException);
            e.d(str, sb.toString());
        } catch (Exception e4) {
            e.d("PushLogAC2815", "deposeSelfShowMsg error:" + e4.toString());
        }
    }
}
