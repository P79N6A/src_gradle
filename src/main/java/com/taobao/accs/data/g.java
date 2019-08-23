package com.taobao.accs.data;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.IAppReceiverV1;
import com.taobao.accs.a.a;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static Set<String> f78953a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile g f78954b;

    /* access modifiers changed from: protected */
    public String b() {
        return "com.taobao.accs.data.MsgDistributeService";
    }

    /* access modifiers changed from: protected */
    public boolean a(Context context, String str, String str2, Intent intent, IAppReceiver iAppReceiver) {
        boolean z = false;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            String str3 = null;
            if (iAppReceiver != null) {
                str3 = iAppReceiver.getService(str);
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = GlobalClientInfo.getInstance(context).getService(str);
            }
            if (TextUtils.isEmpty(str3) && !UtilityImpl.isMainProcess(context)) {
                if ("accs".equals(str)) {
                    ALog.e("MsgDistribute", "start MsgDistributeService", "dataId", str2);
                } else {
                    ALog.i("MsgDistribute", "start MsgDistributeService", "dataId", str2);
                }
                intent.setClassName(intent.getPackage(), b());
                a.a(context, intent, false);
                z = true;
            }
            return z;
        } catch (Throwable th) {
            ALog.e("MsgDistribute", "handleMsgInChannelProcess", th, new Object[0]);
        }
    }

    public static g a() {
        if (f78954b == null) {
            synchronized (g.class) {
                if (f78954b == null) {
                    f78954b = new g();
                }
            }
        }
        return f78954b;
    }

    public static void a(Context context, Intent intent) {
        a(context, null, intent);
    }

    /* access modifiers changed from: protected */
    public boolean a(int i, String str) {
        if (i != 100 && !"agooSend".equals(str)) {
            long a2 = UtilityImpl.a();
            if (a2 != -1 && a2 <= 5242880) {
                b.a("accs", "send_fail", str, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "space low " + a2);
                ALog.e("MsgDistribute", "user space low, don't distribute", "size", Long.valueOf(a2), "serviceId", str);
                return true;
            }
        }
        return false;
    }

    public static void a(Context context, com.taobao.accs.net.b bVar, Intent intent) {
        try {
            ThreadPoolExecutorFactory.getScheduledExecutor().execute(new h(context, bVar, intent));
        } catch (Throwable th) {
            if (!(bVar == null || intent == null)) {
                String stringExtra = intent.getStringExtra("configTag");
                String stringExtra2 = intent.getStringExtra("dataId");
                if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                    bVar.b(Message.a(stringExtra2, intent.getStringExtra("serviceId"), bVar.b((String) null), 3), true);
                }
            }
            ALog.e("MsgDistribute", "distribMessage", th, new Object[0]);
            UTMini instance = UTMini.getInstance();
            instance.commitEvent(66001, "MsgToBuss8", "distribMessage" + th.toString(), 221);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0244  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r27, com.taobao.accs.net.b r28, android.content.Intent r29) {
        /*
            r26 = this;
            r13 = r26
            r0 = r27
            r14 = r28
            r15 = r29
            java.lang.String r1 = "dataId"
            java.lang.String r12 = r15.getStringExtra(r1)
            java.lang.String r1 = "serviceId"
            java.lang.String r11 = r15.getStringExtra(r1)
            java.lang.String r1 = r29.getAction()
            com.taobao.accs.utl.ALog$Level r2 = com.taobao.accs.utl.ALog.Level.D
            boolean r2 = com.taobao.accs.utl.ALog.isPrintLog(r2)
            r3 = 5
            r10 = 4
            r9 = 2
            r8 = 3
            r7 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0042
            java.lang.String r2 = "MsgDistribute"
            java.lang.String r4 = "distribute ready"
            r5 = 6
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r16 = "action"
            r5[r7] = r16
            r5[r6] = r1
            java.lang.String r16 = "dataId"
            r5[r9] = r16
            r5[r8] = r12
            java.lang.String r16 = "serviceId"
            r5[r10] = r16
            r5[r3] = r11
            com.taobao.accs.utl.ALog.d(r2, r4, r5)
        L_0x0042:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r4 = 221(0xdd, float:3.1E-43)
            r5 = 66001(0x101d1, float:9.2487E-41)
            r9 = 0
            if (r2 == 0) goto L_0x0074
            if (r14 == 0) goto L_0x005b
            java.lang.String r0 = r14.b((java.lang.String) r9)
            com.taobao.accs.data.Message r0 = com.taobao.accs.data.Message.a((java.lang.String) r12, (java.lang.String) r11, (java.lang.String) r0, (int) r8)
            r14.b((com.taobao.accs.data.Message) r0, (boolean) r6)
        L_0x005b:
            java.lang.String r0 = "MsgDistribute"
            java.lang.String r1 = "action null"
            java.lang.Object[] r2 = new java.lang.Object[r7]
            com.taobao.accs.utl.ALog.e(r0, r1, r2)
            com.taobao.accs.utl.UTMini r0 = com.taobao.accs.utl.UTMini.getInstance()
            java.lang.String r1 = "MsgToBuss9"
            java.lang.String r2 = "action null"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0.commitEvent(r5, r1, r2, r3)
            return
        L_0x0074:
            java.lang.String r2 = "com.taobao.accs.intent.action.RECEIVE"
            boolean r2 = android.text.TextUtils.equals(r1, r2)     // Catch:{ Throwable -> 0x0223 }
            if (r2 == 0) goto L_0x01e0
            java.lang.String r1 = "command"
            r2 = -1
            int r5 = r15.getIntExtra(r1, r2)     // Catch:{ Throwable -> 0x01d7 }
            java.lang.String r1 = "userInfo"
            java.lang.String r16 = r15.getStringExtra(r1)     // Catch:{ Throwable -> 0x01ce }
            java.lang.String r1 = "errorCode"
            int r18 = r15.getIntExtra(r1, r7)     // Catch:{ Throwable -> 0x01ce }
            java.lang.String r1 = "appKey"
            java.lang.String r19 = r15.getStringExtra(r1)     // Catch:{ Throwable -> 0x01ce }
            java.lang.String r1 = "configTag"
            java.lang.String r4 = r15.getStringExtra(r1)     // Catch:{ Throwable -> 0x01ce }
            java.lang.String r1 = r29.getPackage()     // Catch:{ Throwable -> 0x01ce }
            if (r1 != 0) goto L_0x00b1
            java.lang.String r1 = r27.getPackageName()     // Catch:{ Throwable -> 0x00a9 }
            r15.setPackage(r1)     // Catch:{ Throwable -> 0x00a9 }
            goto L_0x00b1
        L_0x00a9:
            r0 = move-exception
            r13 = r9
            r6 = r11
            r2 = r12
            r16 = 2
            goto L_0x022a
        L_0x00b1:
            java.lang.String r1 = "accs"
            boolean r1 = r1.equals(r11)     // Catch:{ Throwable -> 0x01ce }
            if (r1 == 0) goto L_0x00d1
            java.lang.String r1 = "MsgDistribute"
            java.lang.String r2 = "distribute start"
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r20 = "appkey"
            r3[r7] = r20     // Catch:{ Throwable -> 0x00a9 }
            r3[r6] = r19     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r20 = "config"
            r17 = 2
            r3[r17] = r20     // Catch:{ Throwable -> 0x00a9 }
            r3[r8] = r4     // Catch:{ Throwable -> 0x00a9 }
            com.taobao.accs.utl.ALog.e(r1, r2, r3)     // Catch:{ Throwable -> 0x00a9 }
            goto L_0x00e8
        L_0x00d1:
            java.lang.String r1 = "MsgDistribute"
            java.lang.String r2 = "distribute start"
            java.lang.Object[] r3 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x01ce }
            java.lang.String r20 = "appkey"
            r3[r7] = r20     // Catch:{ Throwable -> 0x01ce }
            r3[r6] = r19     // Catch:{ Throwable -> 0x01ce }
            java.lang.String r20 = "config"
            r17 = 2
            r3[r17] = r20     // Catch:{ Throwable -> 0x01ce }
            r3[r8] = r4     // Catch:{ Throwable -> 0x01ce }
            com.taobao.accs.utl.ALog.d(r1, r2, r3)     // Catch:{ Throwable -> 0x01ce }
        L_0x00e8:
            boolean r1 = r13.a((android.content.Context) r0, (android.content.Intent) r15, (java.lang.String) r12, (java.lang.String) r11)     // Catch:{ Throwable -> 0x01ce }
            if (r1 == 0) goto L_0x00ef
            return
        L_0x00ef:
            if (r5 >= 0) goto L_0x011b
            if (r14 == 0) goto L_0x00fe
            java.lang.String r0 = r14.b((java.lang.String) r9)     // Catch:{ Throwable -> 0x00a9 }
            com.taobao.accs.data.Message r0 = com.taobao.accs.data.Message.a((java.lang.String) r12, (java.lang.String) r11, (java.lang.String) r0, (int) r8)     // Catch:{ Throwable -> 0x00a9 }
            r14.b((com.taobao.accs.data.Message) r0, (boolean) r6)     // Catch:{ Throwable -> 0x00a9 }
        L_0x00fe:
            java.lang.String r0 = "MsgDistribute"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r2 = "command error:"
            r1.<init>(r2)     // Catch:{ Throwable -> 0x00a9 }
            r1.append(r5)     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x00a9 }
            r3 = 2
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x00a9 }
            java.lang.String r4 = "serviceId"
            r2[r7] = r4     // Catch:{ Throwable -> 0x00a9 }
            r2[r6] = r11     // Catch:{ Throwable -> 0x00a9 }
            com.taobao.accs.utl.ALog.e(r0, r1, r2)     // Catch:{ Throwable -> 0x00a9 }
            return
        L_0x011b:
            r3 = 2
            boolean r1 = r13.a((int) r5, (java.lang.String) r11)     // Catch:{ Throwable -> 0x01ce }
            if (r1 == 0) goto L_0x0130
            if (r14 == 0) goto L_0x012f
            java.lang.String r0 = r14.b((java.lang.String) r9)     // Catch:{ Throwable -> 0x00a9 }
            com.taobao.accs.data.Message r0 = com.taobao.accs.data.Message.a((java.lang.String) r12, (java.lang.String) r11, (java.lang.String) r0, (int) r8)     // Catch:{ Throwable -> 0x00a9 }
            r14.b((com.taobao.accs.data.Message) r0, (boolean) r6)     // Catch:{ Throwable -> 0x00a9 }
        L_0x012f:
            return
        L_0x0130:
            boolean r1 = r13.b(r0, r15, r12, r11)     // Catch:{ Throwable -> 0x01ce }
            if (r1 == 0) goto L_0x0137
            return
        L_0x0137:
            com.taobao.accs.client.GlobalClientInfo r1 = com.taobao.accs.client.GlobalClientInfo.getInstance(r27)     // Catch:{ Throwable -> 0x01ce }
            java.util.Map r2 = r1.getAppReceiver()     // Catch:{ Throwable -> 0x01ce }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x01ce }
            if (r1 != 0) goto L_0x0152
            if (r2 == 0) goto L_0x014e
            java.lang.Object r1 = r2.get(r4)     // Catch:{ Throwable -> 0x00a9 }
            com.taobao.accs.IAppReceiver r1 = (com.taobao.accs.IAppReceiver) r1     // Catch:{ Throwable -> 0x00a9 }
            goto L_0x014f
        L_0x014e:
            r1 = r9
        L_0x014f:
            r17 = r1
            goto L_0x0154
        L_0x0152:
            r17 = r9
        L_0x0154:
            r1 = r26
            r20 = r2
            r2 = r27
            r21 = 2
            r3 = r11
            r22 = r4
            r4 = r12
            r23 = r5
            r5 = r29
            r13 = 1
            r6 = r17
            boolean r1 = r1.a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r4, (android.content.Intent) r5, (com.taobao.accs.IAppReceiver) r6)     // Catch:{ Throwable -> 0x01c4 }
            if (r1 == 0) goto L_0x016e
            return
        L_0x016e:
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r22
            r6 = r19
            r7 = r23
            r8 = r16
            r13 = r9
            r16 = 2
            r9 = r11
            r10 = r12
            r24 = r11
            r11 = r17
            r25 = r12
            r12 = r18
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Throwable -> 0x01bc }
            boolean r1 = android.text.TextUtils.isEmpty(r24)     // Catch:{ Throwable -> 0x01bc }
            if (r1 != 0) goto L_0x01ab
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r17
            r5 = r29
            r6 = r24
            r7 = r25
            r8 = r23
            r9 = r18
            r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x01bc }
            goto L_0x021d
        L_0x01ab:
            r1 = r26
            r2 = r27
            r3 = r20
            r4 = r29
            r5 = r23
            r6 = r18
            r1.a((android.content.Context) r2, (java.util.Map<java.lang.String, com.taobao.accs.IAppReceiver>) r3, (android.content.Intent) r4, (int) r5, (int) r6)     // Catch:{ Throwable -> 0x01bc }
            goto L_0x026d
        L_0x01bc:
            r0 = move-exception
            r5 = r23
            r6 = r24
            r2 = r25
            goto L_0x01de
        L_0x01c4:
            r0 = move-exception
            r13 = r9
            r16 = 2
            r6 = r11
            r2 = r12
            r5 = r23
            goto L_0x022a
        L_0x01ce:
            r0 = move-exception
            r23 = r5
            r13 = r9
            r16 = 2
            r6 = r11
            r2 = r12
            goto L_0x022a
        L_0x01d7:
            r0 = move-exception
            r13 = r9
            r16 = 2
            r6 = r11
            r2 = r12
        L_0x01dd:
            r5 = 0
        L_0x01de:
            r7 = 0
            goto L_0x022a
        L_0x01e0:
            r13 = r9
            r24 = r11
            r25 = r12
            r16 = 2
            if (r14 == 0) goto L_0x0202
            java.lang.String r0 = r14.b((java.lang.String) r13)     // Catch:{ Throwable -> 0x01fc }
            r6 = r24
            r2 = r25
            com.taobao.accs.data.Message r0 = com.taobao.accs.data.Message.a((java.lang.String) r2, (java.lang.String) r6, (java.lang.String) r0, (int) r3)     // Catch:{ Throwable -> 0x01fa }
            r3 = 1
            r14.b((com.taobao.accs.data.Message) r0, (boolean) r3)     // Catch:{ Throwable -> 0x01fa }
            goto L_0x0206
        L_0x01fa:
            r0 = move-exception
            goto L_0x01dd
        L_0x01fc:
            r0 = move-exception
            r6 = r24
            r2 = r25
            goto L_0x01dd
        L_0x0202:
            r6 = r24
            r2 = r25
        L_0x0206:
            java.lang.String r0 = "MsgDistribute"
            java.lang.String r3 = "distribMessage action error"
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ Throwable -> 0x021e }
            com.taobao.accs.utl.ALog.e(r0, r3, r8)     // Catch:{ Throwable -> 0x021e }
            com.taobao.accs.utl.UTMini r0 = com.taobao.accs.utl.UTMini.getInstance()     // Catch:{ Throwable -> 0x021e }
            java.lang.String r3 = "MsgToBuss10"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x021e }
            r0.commitEvent(r5, r3, r1, r4)     // Catch:{ Throwable -> 0x021e }
        L_0x021d:
            return
        L_0x021e:
            r0 = move-exception
            goto L_0x0229
        L_0x0220:
            r0 = move-exception
            r7 = 0
            goto L_0x0229
        L_0x0223:
            r0 = move-exception
            r13 = r9
            r6 = r11
            r2 = r12
            r16 = 2
        L_0x0229:
            r5 = 0
        L_0x022a:
            java.lang.String r1 = "MsgDistribute"
            java.lang.String r3 = "distribMessage"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r8 = "dataId"
            r4[r7] = r8
            r7 = 1
            r4[r7] = r2
            java.lang.String r8 = "serviceId"
            r4[r16] = r8
            r8 = 3
            r4[r8] = r6
            com.taobao.accs.utl.ALog.e(r1, r3, r0, r4)
            if (r14 == 0) goto L_0x024f
            java.lang.String r1 = r14.b((java.lang.String) r13)
            com.taobao.accs.data.Message r1 = com.taobao.accs.data.Message.a((java.lang.String) r2, (java.lang.String) r6, (java.lang.String) r1, (int) r8)
            r14.b((com.taobao.accs.data.Message) r1, (boolean) r7)
        L_0x024f:
            java.lang.String r1 = "accs"
            java.lang.String r2 = "send_fail"
            java.lang.String r3 = "1"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "distribute error "
            r4.<init>(r7)
            r4.append(r5)
            java.lang.String r0 = com.taobao.accs.utl.UtilityImpl.a((java.lang.Throwable) r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.taobao.accs.utl.b.a(r1, r2, r6, r3, r0)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.data.g.b(android.content.Context, com.taobao.accs.net.b, android.content.Intent):void");
    }

    private boolean a(Context context, Intent intent, String str, String str2) {
        boolean z;
        boolean booleanExtra = intent.getBooleanExtra("routingAck", false);
        boolean booleanExtra2 = intent.getBooleanExtra("routingMsg", false);
        if (booleanExtra) {
            ALog.e("MsgDistribute", "recieve routiong ack", "dataId", str, "serviceId", str2);
            if (f78953a != null) {
                f78953a.remove(str);
            }
            b.a("accs", "ele_routing_rate", "");
            z = true;
        } else {
            z = false;
        }
        if (booleanExtra2) {
            try {
                String stringExtra = intent.getStringExtra("packageName");
                ALog.e("MsgDistribute", "send routiong ack", "dataId", str, "to pkg", stringExtra, "serviceId", str2);
                Intent intent2 = new Intent("com.taobao.accs.intent.action.COMMAND");
                intent2.putExtra("command", 106);
                intent2.setClassName(stringExtra, "com.taobao.accs.ChannelService");
                intent2.putExtra("routingAck", true);
                intent2.putExtra("packageName", stringExtra);
                intent2.putExtra("dataId", str);
                a.a(context, intent, false);
            } catch (Throwable th) {
                ALog.e("MsgDistribute", "send routing ack", th, "serviceId", str2);
            }
        }
        return z;
    }

    private boolean b(Context context, Intent intent, String str, String str2) {
        if (context.getPackageName().equals(intent.getPackage())) {
            return false;
        }
        try {
            ALog.e("MsgDistribute", "start MsgDistributeService", "receive pkg", context.getPackageName(), "target pkg", intent.getPackage(), "serviceId", str2);
            intent.setClassName(intent.getPackage(), "com.taobao.accs.data.MsgDistributeService");
            intent.putExtra("routingMsg", true);
            intent.putExtra("packageName", context.getPackageName());
            context.startService(intent);
            if (f78953a == null) {
                f78953a = new HashSet();
            }
            f78953a.add(str);
            ThreadPoolExecutorFactory.schedule(new i(this, str, str2, intent), 10, TimeUnit.SECONDS);
        } catch (Throwable th) {
            b.a("accs", "ele_routing_rate", "", "exception", th.toString());
            ALog.e("MsgDistribute", "routing msg error, try election", th, "serviceId", str2, "dataId", str);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(Context context, Map<String, IAppReceiver> map, Intent intent, int i, int i2) {
        Context context2 = context;
        Intent intent2 = intent;
        int i3 = i;
        ALog.i("MsgDistribute", "handBroadCastMsg", "command", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        if (map != null) {
            for (Map.Entry<String, IAppReceiver> value : map.entrySet()) {
                Map<String, String> allServices = ((IAppReceiver) value.getValue()).getAllServices();
                if (allServices != null) {
                    hashMap.putAll(allServices);
                }
            }
        }
        if (i3 == 103) {
            for (String str : hashMap.keySet()) {
                if ("accs".equals(str) || "windvane".equals(str) || "motu-remote".equals(str)) {
                    String str2 = (String) hashMap.get(str);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = GlobalClientInfo.getInstance(context).getService(str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        intent2.setClassName(context2, str2);
                        a.a(context2, intent2, true);
                    }
                }
            }
            boolean booleanExtra = intent2.getBooleanExtra("connect_avail", false);
            String stringExtra = intent2.getStringExtra("host");
            String stringExtra2 = intent2.getStringExtra("errorDetail");
            boolean booleanExtra2 = intent2.getBooleanExtra("type_inapp", false);
            boolean booleanExtra3 = intent2.getBooleanExtra("is_center_host", false);
            TaoBaseService.ConnectInfo connectInfo = null;
            if (!TextUtils.isEmpty(stringExtra)) {
                if (booleanExtra) {
                    connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3);
                } else {
                    connectInfo = new TaoBaseService.ConnectInfo(stringExtra, booleanExtra2, booleanExtra3, i2, stringExtra2);
                }
                connectInfo.connected = booleanExtra;
            }
            if (connectInfo != null) {
                ALog.d("MsgDistribute", "handBroadCastMsg ACTION_CONNECT_INFO", connectInfo);
                Intent intent3 = new Intent("com.taobao.accs.intent.action.CONNECTINFO");
                intent3.setPackage(context.getPackageName());
                intent3.putExtra("connect_info", connectInfo);
                context2.sendBroadcast(intent3);
            } else {
                ALog.e("MsgDistribute", "handBroadCastMsg connect info null, host empty", new Object[0]);
            }
        } else if (i3 == 104) {
            for (String str3 : hashMap.keySet()) {
                String str4 = (String) hashMap.get(str3);
                if (TextUtils.isEmpty(str4)) {
                    str4 = GlobalClientInfo.getInstance(context).getService(str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    intent2.setClassName(context2, str4);
                    a.a(context2, intent2, true);
                }
            }
        } else {
            ALog.w("MsgDistribute", "handBroadCastMsg not handled command", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public void a(Context context, com.taobao.accs.net.b bVar, IAppReceiver iAppReceiver, Intent intent, String str, String str2, int i, int i2) {
        String str3;
        Context context2 = context;
        com.taobao.accs.net.b bVar2 = bVar;
        IAppReceiver iAppReceiver2 = iAppReceiver;
        Intent intent2 = intent;
        String str4 = str;
        String str5 = str2;
        int i3 = i;
        ALog.i("MsgDistribute", "handleBusinessMsg start", "dataId", str5, "serviceId", str4, "command", Integer.valueOf(i));
        if (iAppReceiver2 != null) {
            str3 = iAppReceiver2.getService(str4);
        } else {
            str3 = null;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = GlobalClientInfo.getInstance(context).getService(str4);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d("MsgDistribute", "handleBusinessMsg to start service", "className", str3);
            }
            intent2.setClassName(context2, str3);
            a.a(context2, intent2, true);
        } else {
            AccsAbstractDataListener listener = GlobalClientInfo.getInstance(context).getListener(str4);
            if (listener != null) {
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d("MsgDistribute", "handleBusinessMsg getListener not null", new Object[0]);
                }
                AccsAbstractDataListener.onReceiveData(context2, intent2, listener);
            } else {
                if (bVar2 != null) {
                    bVar2.b(Message.a(str5, str4, bVar2.b((String) null), 0), true);
                }
                ALog.e("MsgDistribute", "handleBusinessMsg getListener also null", new Object[0]);
                b.a("accs", "send_fail", str4, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "service is null");
            }
        }
        UTMini.getInstance().commitEvent(66001, "MsgToBuss", "commandId=" + i3, "serviceId=" + str4 + " errorCode=" + i2 + " dataId=" + str5, 221);
        StringBuilder sb = new StringBuilder("2commandId=");
        sb.append(i3);
        sb.append("serviceId=");
        sb.append(str4);
        b.a("accs", "to_buss", sb.toString(), 0.0d);
    }

    private void a(Context context, com.taobao.accs.net.b bVar, Intent intent, String str, String str2, int i, String str3, String str4, String str5, IAppReceiver iAppReceiver, int i2) {
        String str6;
        com.taobao.accs.net.b bVar2 = bVar;
        String str7 = str2;
        int i3 = i;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        IAppReceiver iAppReceiver2 = iAppReceiver;
        int i4 = i2;
        if (ALog.isPrintLog(ALog.Level.D)) {
            Object[] objArr = new Object[12];
            objArr[0] = "configTag";
            objArr[1] = str;
            objArr[2] = "dataId";
            objArr[3] = str10;
            objArr[4] = "serviceId";
            objArr[5] = str9;
            objArr[6] = "command";
            objArr[7] = Integer.valueOf(i);
            objArr[8] = "errorCode";
            objArr[9] = Integer.valueOf(i2);
            objArr[10] = "appReceiver";
            if (iAppReceiver2 == null) {
                str6 = null;
            } else {
                str6 = iAppReceiver.getClass().getName();
            }
            objArr[11] = str6;
            ALog.d("MsgDistribute", "handleControlMsg", objArr);
        }
        if (iAppReceiver2 != null) {
            switch (i3) {
                case 1:
                    if (!(iAppReceiver2 instanceof IAppReceiverV1)) {
                        iAppReceiver.onBindApp(i2);
                        break;
                    } else {
                        ((IAppReceiverV1) iAppReceiver2).onBindApp(i4, null);
                        break;
                    }
                case 2:
                    if (i4 == 200) {
                        UtilityImpl.disableService(context);
                    }
                    iAppReceiver.onUnbindApp(i2);
                    break;
                case 3:
                    iAppReceiver2.onBindUser(str8, i4);
                    break;
                case 4:
                    iAppReceiver.onUnbindUser(i2);
                    break;
                default:
                    switch (i3) {
                        case 100:
                            if (TextUtils.isEmpty(str4)) {
                                iAppReceiver2.onSendData(str10, i4);
                                break;
                            }
                            break;
                        case BaseLoginOrRegisterActivity.o:
                            if (TextUtils.isEmpty(str4)) {
                                ALog.d("MsgDistribute", "handleControlMsg serviceId isEmpty", new Object[0]);
                                byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                                if (byteArrayExtra != null) {
                                    iAppReceiver2.onData(str8, str10, byteArrayExtra);
                                    break;
                                }
                            }
                            break;
                    }
            }
        }
        if (i3 != 1 || GlobalClientInfo.f78904b == null || str7 == null || !str7.equals(GlobalClientInfo.f78904b.getAppkey())) {
            if (!(iAppReceiver2 != null || i3 == 104 || i3 == 103 || i3 == 100)) {
                if (bVar2 != null) {
                    bVar2.b(Message.a(str10, str9, bVar2.b((String) null), 0), true);
                }
                b.a("accs", "send_fail", str9, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "appReceiver null return");
                UTMini.getInstance().commitEvent(66001, "MsgToBuss7", "commandId=" + i3, "serviceId=" + str9 + " errorCode=" + i4 + " dataId=" + str10, 221);
            }
            return;
        }
        ALog.d("MsgDistribute", "handleControlMsg agoo receiver onBindApp", new Object[0]);
        GlobalClientInfo.f78904b.onBindApp(i4, null);
    }
}
