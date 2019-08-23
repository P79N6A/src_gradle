package com.huawei.android.pushagent.b.c;

import android.content.Context;
import android.content.Intent;
import com.huawei.android.pushagent.PushService;
import com.huawei.android.pushagent.b.b.c;
import com.huawei.android.pushagent.utils.a.b;
import com.huawei.android.pushagent.utils.a.e;
import java.io.Serializable;

public class a extends com.huawei.android.pushagent.b.a {

    /* renamed from: a  reason: collision with root package name */
    int f25068a = -1;

    public a(Context context) {
        try {
            this.f25068a = b.a(context);
            if (com.huawei.android.pushagent.b.e.b.b(context).size() != 0) {
                a(context, new Intent("com.huawei.action.CONNECT_PUSHSRV_PUSHSRV").setPackage(context.getPackageName()));
            } else {
                a(context, new Intent("com.huawei.action.CONNECT_PUSHSRV").setPackage(context.getPackageName()));
            }
        } catch (Exception e2) {
            e.c("PushLogAC2815", "call switchChannel cause Exception", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", "call channel.close cause exceptino:" + r4.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x02a5, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x02a6, code lost:
        com.huawei.android.pushagent.utils.a.e.d("PushLogAC2815", "call connectSrv cause Exceptino:" + r10.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x02bd, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02a5 A[ExcHandler: c (r10v1 'e' com.huawei.android.pushagent.a.c A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "cloudpush_isNoDelayConnect"
            r1 = 0
            boolean r0 = com.huawei.android.pushagent.b.b.c.a((android.content.Context) r10, (java.lang.String) r0, (boolean) r1)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.util.ArrayList r2 = com.huawei.android.pushagent.b.e.b.b(r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r0 != 0) goto L_0x0056
            int r3 = r2.size()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r3 != 0) goto L_0x0056
            com.huawei.android.pushagent.b.e.b r3 = com.huawei.android.pushagent.b.e.b.a(r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.util.HashMap r3 = r3.f25095a     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            int r3 = r3.size()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r3 != 0) goto L_0x0056
            com.huawei.android.pushagent.b.a.a r11 = com.huawei.android.pushagent.b.a.a.a((android.content.Context) r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r11.b()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r11 = "PushLogAC2815"
            java.lang.String r0 = "no push client, stop push apk service"
            com.huawei.android.pushagent.utils.a.e.b(r11, r0)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            android.content.Intent r11 = new android.content.Intent     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r0 = "com.huawei.intent.action.PUSH_OFF"
            r11.<init>(r0)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r0 = r10.getPackageName()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            android.content.Intent r11 = r11.setPackage(r0)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r0 = "Remote_Package_Name"
            java.lang.String r1 = r10.getPackageName()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            android.content.Intent r11 = r11.putExtra(r0, r1)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.b.a r0 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            long r0 = r0.P()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            com.huawei.android.pushagent.utils.a.a.b(r10, r11, r0)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            return
        L_0x0056:
            com.huawei.android.pushagent.b.b.a r3 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            boolean r3 = r3.V()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r3 != 0) goto L_0x006e
            java.lang.String r3 = "PushLogAC2815"
            java.lang.String r4 = "TRS is invalid, so need to query TRS"
            com.huawei.android.pushagent.utils.a.e.b(r3, r4)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.b.a r3 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r3.c(r1)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
        L_0x006e:
            java.lang.String r3 = "com.huawei.android.push.intent.TRS_QUERY_SUCCESS"
            boolean r3 = r3.equals(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r3 == 0) goto L_0x008b
            com.huawei.android.pushagent.b.a.a.a r3 = com.huawei.android.pushagent.b.a.a.f()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.a.a.b r3 = r3.f25015e     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r3.f()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.a.a.a r3 = com.huawei.android.pushagent.b.a.a.e()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.a.a.b r3 = r3.f25015e     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r3.f()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.d.a.c(r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
        L_0x008b:
            int r3 = com.huawei.android.pushagent.utils.a.b.a((android.content.Context) r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r4 = -1
            if (r4 == r3) goto L_0x0096
            int r5 = r9.f25068a     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r3 == r5) goto L_0x0133
        L_0x0096:
            if (r4 != r3) goto L_0x00cc
            java.lang.String r4 = "cloudpush_isSupportCollectSocketInfo"
            boolean r4 = com.huawei.android.pushagent.b.b.c.a((android.content.Context) r10, (java.lang.String) r4, (boolean) r1)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r4 == 0) goto L_0x00c4
            com.huawei.android.pushagent.b.a.a.a r4 = com.huawei.android.pushagent.b.a.a.e()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            boolean r4 = r4.a()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r4 != 0) goto L_0x00c4
            android.content.Intent r4 = new android.content.Intent     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r5 = "com.huawei.android.push.intent.SOCKET_INFO"
            r4.<init>(r5)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r5 = "socket_add_info"
            java.lang.String r6 = "no network."
            android.content.Intent r4 = r4.putExtra(r5, r6)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r5 = r10.getPackageName()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            android.content.Intent r4 = r4.setPackage(r5)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r10.sendBroadcast(r4)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
        L_0x00c4:
            java.lang.String r4 = "PushLogAC2815"
            java.lang.String r5 = "no network in ConnectMgrProcessor:connect, so close socket"
        L_0x00c8:
            com.huawei.android.pushagent.utils.a.e.a(r4, r5)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            goto L_0x0113
        L_0x00cc:
            java.lang.String r4 = "cloudpush_isSupportCollectSocketInfo"
            boolean r4 = com.huawei.android.pushagent.b.b.c.a((android.content.Context) r10, (java.lang.String) r4, (boolean) r1)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r4 == 0) goto L_0x00f8
            com.huawei.android.pushagent.b.a.a.a r4 = com.huawei.android.pushagent.b.a.a.e()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            boolean r4 = r4.a()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r4 != 0) goto L_0x00f8
            android.content.Intent r4 = new android.content.Intent     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r5 = "com.huawei.android.push.intent.SOCKET_INFO"
            r4.<init>(r5)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r5 = "socket_add_info"
            java.lang.String r6 = "network switch."
            android.content.Intent r4 = r4.putExtra(r5, r6)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r5 = r10.getPackageName()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            android.content.Intent r4 = r4.setPackage(r5)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r10.sendBroadcast(r4)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
        L_0x00f8:
            java.lang.String r4 = "PushLogAC2815"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r6 = "net work switch from:"
            r5.<init>(r6)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            int r6 = r9.f25068a     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r5.append(r6)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r6 = " to "
            r5.append(r6)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r5.append(r3)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r5 = r5.toString()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            goto L_0x00c8
        L_0x0113:
            com.huawei.android.pushagent.b.a.a r4 = com.huawei.android.pushagent.b.a.a.a((android.content.Context) r10)     // Catch:{ Exception -> 0x011b, c -> 0x02a5 }
            r4.b()     // Catch:{ Exception -> 0x011b, c -> 0x02a5 }
            goto L_0x0133
        L_0x011b:
            r4 = move-exception
            java.lang.String r5 = "PushLogAC2815"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r7 = "call channel.close cause exceptino:"
            r6.<init>(r7)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r7 = r4.toString()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r6.append(r7)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r6 = r6.toString()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.utils.a.e.c(r5, r6, r4)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
        L_0x0133:
            int r4 = r9.f25068a     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r5 = 1
            if (r4 == r3) goto L_0x013a
            r4 = 1
            goto L_0x013b
        L_0x013a:
            r4 = 0
        L_0x013b:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r8 = "lastnetWorkType:"
            r7.<init>(r8)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            int r8 = r9.f25068a     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r7.append(r8)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r8 = " curNetWorkType:"
            r7.append(r8)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r7.append(r3)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r7 = r7.toString()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.utils.a.e.b(r6, r7)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r9.f25068a = r3     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r0 == 0) goto L_0x016d
            com.huawei.android.pushagent.b.a.a r10 = com.huawei.android.pushagent.b.a.a.a((android.content.Context) r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.a.a$a r11 = com.huawei.android.pushagent.b.a.a.C0287a.ConnectEntity_Push     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r10.a((com.huawei.android.pushagent.b.a.a.C0287a) r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.a.a.a r10 = com.huawei.android.pushagent.b.a.a.e()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r10.a((boolean) r5)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            return
        L_0x016d:
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r0.equals(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r0 != 0) goto L_0x017d
            java.lang.String r0 = "com.huawei.android.push.intent.TRS_QUERY_SUCCESS"
            boolean r0 = r0.equals(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r0 == 0) goto L_0x01cb
        L_0x017d:
            com.huawei.android.pushagent.b.a.a.a r0 = com.huawei.android.pushagent.b.a.a.e()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            boolean r0 = r0.a()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r0 != 0) goto L_0x01cb
            com.huawei.android.pushagent.b.a.a$a r0 = com.huawei.android.pushagent.b.a.a.c()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.a.a$a r3 = com.huawei.android.pushagent.b.a.a.C0287a.ConnectEntity_Push     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r0 == r3) goto L_0x01cb
            int r0 = r2.size()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r0 == 0) goto L_0x01cb
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r3 = "received "
            r1.<init>(r3)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r1.append(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r11 = ", cur ConType:"
            r1.append(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.a.a$a r11 = com.huawei.android.pushagent.b.a.a.c()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r1.append(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r11 = ", but have need depose size:"
            r1.append(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            int r11 = r2.size()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r1.append(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r11 = r1.toString()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.utils.a.e.b(r0, r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            android.content.Intent r11 = new android.content.Intent     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r0 = "com.huawei.action.CONNECT_PUSHSRV_PUSHSRV"
            r11.<init>(r0)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r9.a((android.content.Context) r10, (android.content.Intent) r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            return
        L_0x01cb:
            java.lang.String r0 = "com.huawei.action.CONNECT_PUSHSRV_PUSHSRV"
            boolean r0 = r0.equals(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r0 == 0) goto L_0x0203
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r3 = "get "
            r1.<init>(r3)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r1.append(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r11 = " so get a pushSrv to connect"
            r1.append(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r11 = r1.toString()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.utils.a.e.a(r0, r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            int r11 = r2.size()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r11 == 0) goto L_0x01fa
            com.huawei.android.pushagent.b.a.a r10 = com.huawei.android.pushagent.b.a.a.a((android.content.Context) r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.a.a$a r11 = com.huawei.android.pushagent.b.a.a.C0287a.ConnectEntity_Push     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r10.a((com.huawei.android.pushagent.b.a.a.C0287a) r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
        L_0x01fa:
            com.huawei.android.pushagent.b.a.a.a r10 = com.huawei.android.pushagent.b.a.a.e()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
        L_0x01fe:
            r10.a((boolean) r5)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            goto L_0x02a4
        L_0x0203:
            java.lang.String r0 = "com.huawei.action.CONNECT_PUSHSRV_POLLINGSRV"
            boolean r0 = r0.equals(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r0 == 0) goto L_0x0228
            java.lang.String r10 = "PushLogAC2815"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r1 = "get "
            r0.<init>(r1)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r0.append(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r11 = " so get a pollingSrv to connect"
            r0.append(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r11 = r0.toString()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.utils.a.e.a(r10, r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.a.a.a r10 = com.huawei.android.pushagent.b.a.a.f()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            goto L_0x01fe
        L_0x0228:
            com.huawei.android.pushagent.b.a.a r0 = com.huawei.android.pushagent.b.a.a.a((android.content.Context) r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.a.a.a r0 = r0.d()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            boolean r0 = r0.a()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r0 != 0) goto L_0x026a
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r3 = "get "
            r2.<init>(r3)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r2.append(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r11 = " so get a srv to connect"
            r2.append(r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r11 = r2.toString()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.utils.a.e.a(r0, r11)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            if (r4 == 0) goto L_0x025e
            com.huawei.android.pushagent.b.d.b r11 = com.huawei.android.pushagent.b.d.b.a(r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.d.b$b r0 = com.huawei.android.pushagent.b.d.b.C0290b.NETWORK_CHANGE     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r2.<init>()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r11.a(r10, r0, r2)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
        L_0x025e:
            com.huawei.android.pushagent.b.a.a r10 = com.huawei.android.pushagent.b.a.a.a((android.content.Context) r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.b.a.a.a r10 = r10.d()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r10.a((boolean) r1)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            goto L_0x02a4
        L_0x026a:
            com.huawei.android.pushagent.b.a.a.b r10 = com.huawei.android.pushagent.b.a.a.b(r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            long r10 = r10.e()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r2 = "pushChannel already connect, so needn't handle, nextSendHearBeatTime:"
            r1.<init>(r2)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss SSS"
            java.lang.String r10 = com.huawei.android.pushagent.utils.a.a((long) r10, (java.lang.String) r2)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            r1.append(r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            java.lang.String r10 = r1.toString()     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            com.huawei.android.pushagent.utils.a.e.a(r0, r10)     // Catch:{ c -> 0x02a5, Exception -> 0x028c }
            return
        L_0x028c:
            r10 = move-exception
            java.lang.String r11 = "PushLogAC2815"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "call connectSrv cause Exceptino:"
            r0.<init>(r1)
            java.lang.String r10 = r10.toString()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.huawei.android.pushagent.utils.a.e.d(r11, r10)
        L_0x02a4:
            return
        L_0x02a5:
            r10 = move-exception
            java.lang.String r11 = "PushLogAC2815"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "call connectSrv cause Exceptino:"
            r0.<init>(r1)
            java.lang.String r10 = r10.toString()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.huawei.android.pushagent.utils.a.e.d(r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.b.c.a.a(android.content.Context, java.lang.String):void");
    }

    private boolean a(Context context, Intent intent, String str, String str2) {
        return ("com.huawei.intent.action.PUSH".equals(str) && "com.huawei.android.push.intent.HEARTBEAT_REQ".equals(str2)) || "com.huawei.android.push.intent.REFRESH_PUSH_CHANNEL".equals(str) || "android.intent.action.TIME_SET".equals(str) || "android.intent.action.TIMEZONE_CHANGED".equals(str);
    }

    private boolean a(Context context, String str, String str2) {
        return "android.net.conn.CONNECTIVITY_CHANGE".equals(str) || "com.huawei.action.CONNECT_PUSHSRV".equals(str) || "com.huawei.action.CONNECT_PUSHSRV_PUSHSRV".equals(str) || "com.huawei.action.CONNECT_PUSHSRV_POLLINGSRV".equals(str) || "com.huawei.android.push.intent.TRS_QUERY_SUCCESS".equals(str) || ("com.huawei.intent.action.PUSH".equals(str) && "com.huawei.intent.action.PUSH_ON".equals(str2));
    }

    public void a(Context context, Intent intent) {
        Intent intent2;
        try {
            e.a("PushLogAC2815", "enter ConnectMgrProcessor:onReceive(intent:" + intent + " context:" + context);
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra("EXTRA_INTENT_TYPE");
            if ("com.huawei.android.push.intent.HEARTBEAT_RSP_TIMEOUT".equals(action)) {
                if (c.a(context, "cloudpush_isSupportCollectSocketInfo", false)) {
                    context.sendBroadcast(new Intent("com.huawei.android.push.intent.SOCKET_INFO").putExtra("socket_add_info", "heart beat time out.").setPackage(context.getPackageName()));
                }
                com.huawei.android.pushagent.b.a.a.a(context).a(intent);
                return;
            }
            if (a(context, intent, action, stringExtra)) {
                com.huawei.android.pushagent.b.a.a.a(context).a(intent);
            } else if (a(context, action, stringExtra)) {
                a(context, action);
            } else if ("com.huawei.android.push.intent.CHANNEL_CLOSED".equals(action)) {
                e.b("PushLogAC2815", "receive the channal closed action.");
                String str = "";
                Serializable serializableExtra = intent.getSerializableExtra("push_exception");
                if (serializableExtra != null) {
                    str = serializableExtra.toString();
                }
                context.sendBroadcast(new Intent("com.huawei.android.push.intent.SOCKET_INFO").putExtra("socket_event_type", 0).putExtra("socket_next_connect_time", "").putExtra("socket_exception", str).setPackage(context.getPackageName()));
            } else {
                if ("com.huawei.android.push.intent.CONNECTING".equals(action)) {
                    intent2 = new Intent("com.huawei.android.push.intent.SOCKET_INFO").putExtra("socket_event_type", 2).setPackage(context.getPackageName());
                } else if ("com.huawei.android.push.intent.CONNECTED".equals(action)) {
                    intent2 = new Intent("com.huawei.android.push.intent.SOCKET_INFO").putExtra("socket_event_type", 1).setPackage(context.getPackageName());
                } else {
                    if (!"com.huawei.intent.action.PUSH_OFF".equals(action)) {
                        if (!"com.huawei.android.push.intent.inner.STOP_SERVICE".equals(action)) {
                            if ("android.intent.action.BATTERY_CHANGED".equals(action)) {
                                int intExtra = intent.getIntExtra("status", 1);
                                com.huawei.android.pushagent.b.a.a.b(context).a(intExtra);
                                if (2 != intExtra) {
                                    if (5 != intExtra) {
                                        e.a("PushLogAC2815", "current battery no charging :" + intExtra);
                                    }
                                }
                                e.a("PushLogAC2815", "current battery is charging!");
                            }
                            return;
                        }
                    }
                    String stringExtra2 = intent.getStringExtra("Remote_Package_Name");
                    if (stringExtra2 != null) {
                        if (stringExtra2.equals(context.getPackageName())) {
                            if (c.a(context, "cloudpush_isSupportCollectSocketInfo", false)) {
                                context.sendBroadcast(new Intent("com.huawei.android.push.intent.SOCKET_INFO").putExtra("socket_add_info", "receive push off action.").setPackage(context.getPackageName()));
                            }
                            com.huawei.android.pushagent.b.a.a.a(context).b();
                            if ("com.huawei.intent.action.PUSH_OFF".equals(action)) {
                                PushService.b();
                            }
                        }
                    }
                    e.a("PushLogAC2815", "need stop PkgName:" + stringExtra2 + " is not me, need not stop!");
                    return;
                }
                context.sendBroadcast(intent2);
            }
        } catch (Exception e2) {
            e.a("PushLogAC2815", e2.toString(), (Throwable) e2);
        }
    }
}
