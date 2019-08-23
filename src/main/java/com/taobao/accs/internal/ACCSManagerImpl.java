package com.taobao.accs.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import anet.channel.SessionCenter;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.b;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.data.Message;
import com.taobao.accs.data.g;
import com.taobao.accs.net.j;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ACCSManagerImpl implements b {

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.accs.net.b f78973a;

    /* renamed from: b  reason: collision with root package name */
    private int f78974b;

    /* renamed from: c  reason: collision with root package name */
    private String f78975c;

    /* renamed from: d  reason: collision with root package name */
    private String f78976d = "ACCSMgrImpl_";

    /* JADX WARNING: Can't wrap try/catch for region: R(3:43|44|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        com.taobao.accs.utl.ALog.w(r8.f78976d, "no orange sdk", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0135, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x012c */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0 A[Catch:{ Throwable -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d4 A[Catch:{ Throwable -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0101 A[Catch:{ Throwable -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0117 A[Catch:{ Throwable -> 0x012c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r9, java.lang.String r10, java.lang.String r11, com.taobao.accs.IAppReceiver r12) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r8.f78976d
            java.lang.String r1 = "bindApp"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "appKey"
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r10
            com.taobao.accs.utl.ALog.i(r0, r1, r2)
            java.lang.String r0 = r9.getPackageName()
            com.taobao.accs.data.Message r0 = com.taobao.accs.data.Message.a((java.lang.String) r0, (int) r3)
            boolean r1 = com.taobao.accs.utl.UtilityImpl.d((android.content.Context) r9)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r8.f78976d
            java.lang.String r2 = "accs disabled, try enable"
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.taobao.accs.utl.ALog.e(r1, r2, r5)
            com.taobao.accs.utl.UtilityImpl.focusEnableService(r9)
        L_0x002f:
            com.taobao.accs.net.b r1 = r8.f78973a
            boolean r1 = r1.k()
            if (r1 == 0) goto L_0x004d
            com.taobao.accs.net.b r1 = r8.f78973a
            com.taobao.accs.AccsClientConfig r1 = r1.i
            java.lang.String r1 = r1.getAppSecret()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x004d
            com.taobao.accs.net.b r9 = r8.f78973a
            r10 = -15
            r9.b((com.taobao.accs.data.Message) r0, (int) r10)
            return
        L_0x004d:
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto L_0x005b
            com.taobao.accs.net.b r9 = r8.f78973a
            r10 = -14
            r9.b((com.taobao.accs.data.Message) r0, (int) r10)
            return
        L_0x005b:
            com.taobao.accs.net.b r0 = r8.f78973a
            r0.f78989a = r11
            com.taobao.accs.net.b r0 = r8.f78973a
            r0.f78990b = r10
            com.taobao.accs.net.b r0 = r8.f78973a
            com.taobao.accs.AccsClientConfig r0 = r0.i
            r0.getAppSecret()
            com.taobao.accs.utl.UtilityImpl.d(r9, r10)
            if (r12 == 0) goto L_0x0078
            com.taobao.accs.client.GlobalClientInfo r0 = com.taobao.accs.client.GlobalClientInfo.getInstance(r9)
            java.lang.String r1 = r8.f78975c
            r0.setAppReceiver(r1, r12)
        L_0x0078:
            com.taobao.accs.utl.UtilityImpl.enableService(r9)
            android.content.Intent r12 = r8.b((android.content.Context) r9, (int) r3)
            if (r12 != 0) goto L_0x0082
            return
        L_0x0082:
            com.taobao.accs.client.GlobalClientInfo r0 = com.taobao.accs.client.GlobalClientInfo.getInstance(r9)     // Catch:{ Throwable -> 0x0136 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo()     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r0 = r0.versionName     // Catch:{ Throwable -> 0x0136 }
            boolean r1 = com.taobao.accs.utl.UtilityImpl.c((android.content.Context) r9)     // Catch:{ Throwable -> 0x0136 }
            if (r1 != 0) goto L_0x009d
            java.lang.String r1 = "ACCS_SDK"
            boolean r1 = com.taobao.accs.utl.UtilityImpl.a((java.lang.String) r1, (android.content.Context) r9)     // Catch:{ Throwable -> 0x0136 }
            if (r1 == 0) goto L_0x009b
            goto L_0x009d
        L_0x009b:
            r1 = 0
            goto L_0x009e
        L_0x009d:
            r1 = 1
        L_0x009e:
            if (r1 == 0) goto L_0x00b2
            java.lang.String r2 = r8.f78976d     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r5 = "bindApp"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r7 = "need force bind"
            r6[r4] = r7     // Catch:{ Throwable -> 0x0136 }
            com.taobao.accs.utl.ALog.d(r2, r5, r6)     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r2 = "fouce_bind"
            r12.putExtra(r2, r3)     // Catch:{ Throwable -> 0x0136 }
        L_0x00b2:
            java.lang.String r2 = "appKey"
            r12.putExtra(r2, r10)     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r10 = "ttid"
            r12.putExtra(r10, r11)     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r10 = "appVersion"
            r12.putExtra(r10, r0)     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r10 = "app_sercet"
            com.taobao.accs.net.b r11 = r8.f78973a     // Catch:{ Throwable -> 0x0136 }
            com.taobao.accs.AccsClientConfig r11 = r11.i     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r11 = r11.getAppSecret()     // Catch:{ Throwable -> 0x0136 }
            r12.putExtra(r10, r11)     // Catch:{ Throwable -> 0x0136 }
            boolean r10 = com.taobao.accs.utl.UtilityImpl.isMainProcess(r9)     // Catch:{ Throwable -> 0x0136 }
            if (r10 == 0) goto L_0x0101
            com.taobao.accs.net.b r10 = r8.f78973a     // Catch:{ Throwable -> 0x0136 }
            com.taobao.accs.data.Message r10 = com.taobao.accs.data.Message.a((com.taobao.accs.net.b) r10, (android.content.Context) r9, (android.content.Intent) r12)     // Catch:{ Throwable -> 0x0136 }
            com.taobao.accs.ut.monitor.NetPerformanceMonitor r11 = r10.e()     // Catch:{ Throwable -> 0x0136 }
            if (r11 == 0) goto L_0x00fd
            com.taobao.accs.ut.monitor.NetPerformanceMonitor r11 = r10.e()     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r12 = r10.q     // Catch:{ Throwable -> 0x0136 }
            r11.setDataId(r12)     // Catch:{ Throwable -> 0x0136 }
            com.taobao.accs.ut.monitor.NetPerformanceMonitor r11 = r10.e()     // Catch:{ Throwable -> 0x0136 }
            r11.setMsgType(r3)     // Catch:{ Throwable -> 0x0136 }
            com.taobao.accs.ut.monitor.NetPerformanceMonitor r11 = r10.e()     // Catch:{ Throwable -> 0x0136 }
            java.net.URL r12 = r10.f78931f     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r12 = r12.toString()     // Catch:{ Throwable -> 0x0136 }
            r11.setHost(r12)     // Catch:{ Throwable -> 0x0136 }
        L_0x00fd:
            r8.a((android.content.Context) r9, (com.taobao.accs.data.Message) r10, (int) r3, (boolean) r1)     // Catch:{ Throwable -> 0x0136 }
            goto L_0x010a
        L_0x0101:
            java.lang.String r10 = r8.f78976d     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r11 = "bindApp only allow in main process"
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0136 }
            com.taobao.accs.utl.ALog.w(r10, r11, r12)     // Catch:{ Throwable -> 0x0136 }
        L_0x010a:
            com.taobao.accs.net.b r10 = r8.f78973a     // Catch:{ Throwable -> 0x0136 }
            android.content.Context r9 = r9.getApplicationContext()     // Catch:{ Throwable -> 0x0136 }
            r10.b((android.content.Context) r9)     // Catch:{ Throwable -> 0x0136 }
            boolean r9 = com.taobao.accs.utl.h.f79102a     // Catch:{ Throwable -> 0x012c }
            if (r9 == 0) goto L_0x0140
            java.lang.String[] r9 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x012c }
            java.lang.String r10 = "accs"
            r9[r4] = r10     // Catch:{ Throwable -> 0x012c }
            com.taobao.accs.utl.h$a r10 = new com.taobao.accs.utl.h$a     // Catch:{ Throwable -> 0x012c }
            r10.<init>()     // Catch:{ Throwable -> 0x012c }
            com.taobao.accs.utl.h.a((java.lang.String[]) r9, (com.taobao.orange.OrangeConfigListenerV1) r10)     // Catch:{ Throwable -> 0x012c }
            com.taobao.accs.utl.h.e()     // Catch:{ Throwable -> 0x012c }
            com.taobao.accs.utl.h.d()     // Catch:{ Throwable -> 0x012c }
            goto L_0x0140
        L_0x012c:
            java.lang.String r9 = r8.f78976d     // Catch:{ Throwable -> 0x0136 }
            java.lang.String r10 = "no orange sdk"
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0136 }
            com.taobao.accs.utl.ALog.w(r9, r10, r11)     // Catch:{ Throwable -> 0x0136 }
            return
        L_0x0136:
            r9 = move-exception
            java.lang.String r10 = r8.f78976d
            java.lang.String r11 = "bindApp exception"
            java.lang.Object[] r12 = new java.lang.Object[r4]
            com.taobao.accs.utl.ALog.e(r10, r11, r9, r12)
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.a(android.content.Context, java.lang.String, java.lang.String, com.taobao.accs.IAppReceiver):void");
    }

    public void a(Context context, String str, boolean z) {
        try {
            ALog.i(this.f78976d, "bindUser", "userId", str);
            if (UtilityImpl.d(context)) {
                ALog.e(this.f78976d, "accs disabled", new Object[0]);
                return;
            }
            Intent b2 = b(context, 3);
            if (b2 == null) {
                ALog.e(this.f78976d, "intent null", new Object[0]);
                a(context, 3, (String) null, (String) null);
                return;
            }
            String i = this.f78973a.i();
            if (TextUtils.isEmpty(i)) {
                ALog.e(this.f78976d, "appKey null", new Object[0]);
                return;
            }
            if (UtilityImpl.c(context) || z) {
                ALog.i(this.f78976d, "force bind User", new Object[0]);
                b2.putExtra("fouce_bind", true);
                z = true;
            }
            b2.putExtra("appKey", i);
            b2.putExtra("userInfo", str);
            if (UtilityImpl.isMainProcess(context)) {
                Message c2 = Message.c(this.f78973a, b2);
                if (c2.e() != null) {
                    c2.e().setDataId(c2.q);
                    c2.e().setMsgType(2);
                    c2.e().setHost(c2.f78931f.toString());
                }
                a(context, c2, 3, z);
            }
            this.f78973a.b(context.getApplicationContext());
        } catch (Throwable th) {
            ALog.e(this.f78976d, "bindUser", th, new Object[0]);
        }
    }

    public void a(Context context) {
        if (!UtilityImpl.d(context) && !UtilityImpl.d(context)) {
            Intent b2 = b(context, 4);
            if (b2 == null) {
                a(context, 4, (String) null, (String) null);
                return;
            }
            String i = this.f78973a.i();
            if (!TextUtils.isEmpty(i)) {
                b2.putExtra("appKey", i);
                if (UtilityImpl.isMainProcess(context)) {
                    a(context, Message.d(this.f78973a, b2), 4, false);
                }
            }
        }
    }

    public void a(Context context, String str, int i) {
        SharedPreferences.Editor edit = c.a(context, "ACCS_SDK", 0).edit();
        if (!TextUtils.isEmpty(str)) {
            edit.putString("proxy_host", str);
        }
        edit.putInt("proxy_port", i);
        edit.apply();
    }

    public void a(Context context, ILoginInfo iLoginInfo) {
        GlobalClientInfo.getInstance(context).setLoginInfoImpl(this.f78973a.m, iLoginInfo);
    }

    public boolean a(String str) {
        return this.f78973a.a(str);
    }

    public boolean a(int i) {
        return ErrorCode.isChannelError(i);
    }

    public void a(Context context, String str, String str2) {
        GlobalClientInfo.getInstance(context).registerService(str, str2);
    }

    public void a(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        GlobalClientInfo.getInstance(context).registerListener(str, accsAbstractDataListener);
    }

    public void a(String str, String str2, String str3, short s, String str4, Map<Integer, String> map) {
        this.f78973a.b(Message.a(this.f78973a, str, str2, str3, true, s, str4, map), true);
    }

    public void a(AccsClientConfig accsClientConfig) {
        if (this.f78973a instanceof j) {
            ((j) this.f78973a).a(accsClientConfig);
        }
    }

    public Map<String, Boolean> b() throws Exception {
        SessionCenter.getInstance(this.f78973a.i.getAppKey()).forceRecreateAccsSession();
        return a();
    }

    public Map<String, Boolean> a() throws Exception {
        String b2 = this.f78973a.b((String) null);
        HashMap hashMap = new HashMap();
        hashMap.put(b2, Boolean.FALSE);
        if (SessionCenter.getInstance(this.f78973a.i.getAppKey()).getThrowsException(b2, 60000) != null) {
            hashMap.put(b2, Boolean.TRUE);
        }
        String str = this.f78976d;
        ALog.d(str, "getChannelState " + hashMap.toString(), new Object[0]);
        return hashMap;
    }

    public void c(Context context) {
        UtilityImpl.focusDisableService(context);
    }

    public void d(Context context) {
        UtilityImpl.focusEnableService(context);
    }

    public void e(Context context) {
        GlobalClientInfo.getInstance(context).clearLoginInfoImpl();
    }

    public boolean b(Context context) {
        return UtilityImpl.k(context);
    }

    @Deprecated
    public void a(Context context, int i) {
        ACCSClient.setEnvironment(context, i);
    }

    public void a(Context context, String str) {
        a(context, str, false);
    }

    public String b(Context context, ACCSManager.AccsRequest accsRequest) {
        return a(context, accsRequest, (String) null, true);
    }

    public void d(Context context, String str) {
        GlobalClientInfo.getInstance(context).unRegisterService(str);
    }

    public void e(Context context, String str) {
        GlobalClientInfo.getInstance(context).unregisterListener(str);
    }

    public ACCSManagerImpl(Context context, String str) {
        GlobalClientInfo.f78903a = context.getApplicationContext();
        this.f78973a = new j(GlobalClientInfo.f78903a, 1, str);
        this.f78975c = str;
        this.f78976d += this.f78973a.m;
    }

    public void c(Context context, String str) {
        if (!UtilityImpl.d(context)) {
            Intent b2 = b(context, 6);
            if (b2 == null) {
                a(context, 6, str, (String) null);
                return;
            }
            String i = this.f78973a.i();
            if (!TextUtils.isEmpty(i)) {
                b2.putExtra("appKey", i);
                b2.putExtra("serviceId", str);
                if (UtilityImpl.isMainProcess(context)) {
                    a(context, Message.b(this.f78973a, b2), 6, false);
                }
            }
        }
    }

    private Intent b(Context context, int i) {
        if (i == 1 || !UtilityImpl.d(context)) {
            Intent intent = new Intent();
            intent.setAction("com.taobao.accs.intent.action.COMMAND");
            intent.setClassName(context.getPackageName(), "com.taobao.accs.ChannelService");
            intent.putExtra("packageName", context.getPackageName());
            intent.putExtra("command", i);
            intent.putExtra("appKey", this.f78973a.f78990b);
            intent.putExtra("configTag", this.f78975c);
            return intent;
        }
        ALog.e(this.f78976d, "getIntent null command:" + i + " accs enabled:" + UtilityImpl.d(context), new Object[0]);
        return null;
    }

    public void b(Context context, String str) {
        if (!UtilityImpl.d(context) && !UtilityImpl.d(context)) {
            Intent b2 = b(context, 5);
            if (b2 == null) {
                a(context, 5, str, (String) null);
                return;
            }
            String i = this.f78973a.i();
            if (!TextUtils.isEmpty(i)) {
                b2.putExtra("appKey", i);
                b2.putExtra("serviceId", str);
                if (UtilityImpl.isMainProcess(context)) {
                    Message a2 = Message.a(this.f78973a, b2);
                    if (a2.e() != null) {
                        a2.e().setDataId(a2.q);
                        a2.e().setMsgType(3);
                        a2.e().setHost(a2.f78931f.toString());
                    }
                    a(context, a2, 5, false);
                }
                this.f78973a.b(context.getApplicationContext());
            }
        }
    }

    public String a(Context context, ACCSManager.AccsRequest accsRequest) {
        try {
            boolean d2 = UtilityImpl.d(context);
            if (!UtilityImpl.isMainProcess(context)) {
                ALog.e(this.f78976d, "sendData not in mainprocess", new Object[0]);
                return null;
            }
            if (!d2) {
                if (accsRequest != null) {
                    if (TextUtils.isEmpty(accsRequest.dataId)) {
                        synchronized (ACCSManagerImpl.class) {
                            this.f78974b++;
                            accsRequest.dataId = this.f78974b;
                        }
                    }
                    if (TextUtils.isEmpty(this.f78973a.i())) {
                        com.taobao.accs.utl.b.a("accs", "send_fail", accsRequest.serviceId, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "data appkey null");
                        ALog.e(this.f78976d, "sendData appkey null", "dataId", accsRequest.dataId);
                        return null;
                    }
                    this.f78973a.a();
                    Message a2 = Message.a(this.f78973a, context, context.getPackageName(), accsRequest);
                    if (a2.e() != null) {
                        a2.e().onSend();
                    }
                    this.f78973a.b(a2, true);
                    return accsRequest.dataId;
                }
            }
            if (d2) {
                com.taobao.accs.utl.b.a("accs", "send_fail", accsRequest.serviceId, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "accs disable");
            } else {
                com.taobao.accs.utl.b.a("accs", "send_fail", "", PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "data null");
            }
            ALog.e(this.f78976d, "sendData dataInfo null or disable:" + d2, new Object[0]);
            return null;
        } catch (Throwable th) {
            com.taobao.accs.utl.b.a("accs", "send_fail", accsRequest.serviceId, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "data " + th.toString());
            ALog.e(this.f78976d, "sendData", th, "dataid", accsRequest.dataId);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e8 A[Catch:{ Throwable -> 0x0227 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x014b A[Catch:{ Throwable -> 0x0227 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(android.content.Context r18, com.taobao.accs.ACCSManager.AccsRequest r19, com.taobao.accs.base.TaoBaseService.ExtraInfo r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 6
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            if (r0 == 0) goto L_0x01fb
            if (r2 != 0) goto L_0x0014
            goto L_0x01fb
        L_0x0014:
            java.lang.String r12 = "accs"
            java.lang.String r13 = "send_fail"
            java.lang.String r14 = "push response total"
            com.taobao.accs.utl.b.a(r12, r13, r14)     // Catch:{ Throwable -> 0x0227 }
            boolean r12 = com.taobao.accs.utl.UtilityImpl.d((android.content.Context) r18)     // Catch:{ Throwable -> 0x0227 }
            if (r12 == 0) goto L_0x0031
            java.lang.String r0 = "accs"
            java.lang.String r3 = "send_fail"
            java.lang.String r4 = r2.serviceId     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r5 = "1"
            java.lang.String r6 = "sendPushResponse accs disable"
            com.taobao.accs.utl.b.a(r0, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0227 }
            return r9
        L_0x0031:
            com.taobao.accs.net.b r12 = r1.f78973a     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r12 = r12.i()     // Catch:{ Throwable -> 0x0227 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Throwable -> 0x0227 }
            if (r13 == 0) goto L_0x0062
            java.lang.String r0 = "accs"
            java.lang.String r3 = "send_fail"
            java.lang.String r4 = r2.serviceId     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r5 = "1"
            java.lang.String r6 = "sendPushResponse appkey null"
            com.taobao.accs.utl.b.a(r0, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r0 = r1.f78976d     // Catch:{ Throwable -> 0x0227 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r4 = "sendPushResponse appkey null dataid:"
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r4 = r2.dataId     // Catch:{ Throwable -> 0x0227 }
            r3.append(r4)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0227 }
            java.lang.Object[] r4 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x0227 }
            com.taobao.accs.utl.ALog.e(r0, r3, r4)     // Catch:{ Throwable -> 0x0227 }
            return r9
        L_0x0062:
            java.lang.String r13 = r2.dataId     // Catch:{ Throwable -> 0x0227 }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Throwable -> 0x0227 }
            if (r13 == 0) goto L_0x0087
            java.lang.Class<com.taobao.accs.internal.ACCSManagerImpl> r13 = com.taobao.accs.internal.ACCSManagerImpl.class
            monitor-enter(r13)     // Catch:{ Throwable -> 0x0227 }
            int r14 = r1.f78974b     // Catch:{ all -> 0x0084 }
            int r14 = r14 + r10
            r1.f78974b = r14     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r14.<init>()     // Catch:{ all -> 0x0084 }
            int r15 = r1.f78974b     // Catch:{ all -> 0x0084 }
            r14.append(r15)     // Catch:{ all -> 0x0084 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0084 }
            r2.dataId = r14     // Catch:{ all -> 0x0084 }
            monitor-exit(r13)     // Catch:{ all -> 0x0084 }
            goto L_0x0087
        L_0x0084:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ Throwable -> 0x0227 }
        L_0x0087:
            if (r20 != 0) goto L_0x008f
            com.taobao.accs.base.TaoBaseService$ExtraInfo r3 = new com.taobao.accs.base.TaoBaseService$ExtraInfo     // Catch:{ Throwable -> 0x0227 }
            r3.<init>()     // Catch:{ Throwable -> 0x0227 }
            goto L_0x0091
        L_0x008f:
            r3 = r20
        L_0x0091:
            r2.host = r9     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r13 = r18.getPackageName()     // Catch:{ Throwable -> 0x0227 }
            r3.fromPackage = r13     // Catch:{ Throwable -> 0x0227 }
            int r13 = r3.connType     // Catch:{ Throwable -> 0x0227 }
            if (r13 == 0) goto L_0x00a4
            java.lang.String r13 = r3.fromHost     // Catch:{ Throwable -> 0x0227 }
            if (r13 != 0) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r9 = 1
            goto L_0x00b8
        L_0x00a4:
            r3.connType = r11     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r13 = r1.f78976d     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r14 = "pushresponse use channel"
            java.lang.Object[] r15 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r16 = "host"
            r15[r11] = r16     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r9 = r3.fromHost     // Catch:{ Throwable -> 0x0227 }
            r15[r10] = r9     // Catch:{ Throwable -> 0x0227 }
            com.taobao.accs.utl.ALog.w(r13, r14, r15)     // Catch:{ Throwable -> 0x0227 }
            r9 = 0
        L_0x00b8:
            java.lang.String r13 = r1.f78976d     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r14 = "sendPushResponse"
            r15 = 8
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r16 = "sendbyInapp"
            r15[r11] = r16     // Catch:{ Throwable -> 0x0227 }
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r9)     // Catch:{ Throwable -> 0x0227 }
            r15[r10] = r16     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r16 = "host"
            r15[r8] = r16     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r10 = r3.fromHost     // Catch:{ Throwable -> 0x0227 }
            r15[r6] = r10     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r10 = "pkg"
            r15[r5] = r10     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r10 = r3.fromPackage     // Catch:{ Throwable -> 0x0227 }
            r15[r4] = r10     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r10 = "dataId"
            r15[r7] = r10     // Catch:{ Throwable -> 0x0227 }
            r10 = 7
            java.lang.String r4 = r2.dataId     // Catch:{ Throwable -> 0x0227 }
            r15[r10] = r4     // Catch:{ Throwable -> 0x0227 }
            com.taobao.accs.utl.ALog.i(r13, r14, r15)     // Catch:{ Throwable -> 0x0227 }
            if (r9 == 0) goto L_0x014b
            java.lang.String r4 = r1.f78976d     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r5 = "sendPushResponse inapp by"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r7 = "app"
            r6[r11] = r7     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r7 = r3.fromPackage     // Catch:{ Throwable -> 0x0227 }
            r8 = 1
            r6[r8] = r7     // Catch:{ Throwable -> 0x0227 }
            com.taobao.accs.utl.ALog.i(r4, r5, r6)     // Catch:{ Throwable -> 0x0227 }
            java.net.URL r4 = new java.net.URL     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r5 = r3.fromHost     // Catch:{ Throwable -> 0x0227 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0227 }
            r2.host = r4     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r4 = r18.getPackageName()     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r5 = r3.fromPackage     // Catch:{ Throwable -> 0x0227 }
            boolean r4 = r4.equals(r5)     // Catch:{ Throwable -> 0x0227 }
            if (r4 == 0) goto L_0x011e
            boolean r4 = com.taobao.accs.utl.UtilityImpl.isMainProcess(r18)     // Catch:{ Throwable -> 0x0227 }
            if (r4 == 0) goto L_0x011e
            java.lang.String r3 = r18.getPackageName()     // Catch:{ Throwable -> 0x0227 }
            r1.a((android.content.Context) r0, (com.taobao.accs.ACCSManager.AccsRequest) r2, (java.lang.String) r3, (boolean) r11)     // Catch:{ Throwable -> 0x0227 }
            goto L_0x025c
        L_0x011e:
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r5 = "com.taobao.accs.intent.action.SEND"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = r3.fromPackage     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r5 = "com.taobao.accs.data.MsgDistributeService"
            r4.setClassName(r3, r5)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = "packageName"
            java.lang.String r5 = r18.getPackageName()     // Catch:{ Throwable -> 0x0227 }
            r4.putExtra(r3, r5)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = "reqdata"
            r4.putExtra(r3, r2)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = "appKey"
            r4.putExtra(r3, r12)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = "configTag"
            java.lang.String r5 = r1.f78975c     // Catch:{ Throwable -> 0x0227 }
            r4.putExtra(r3, r5)     // Catch:{ Throwable -> 0x0227 }
            com.taobao.accs.a.a.a(r0, r4, r11)     // Catch:{ Throwable -> 0x0227 }
            goto L_0x025c
        L_0x014b:
            r4 = 100
            android.content.Intent r9 = r1.b((android.content.Context) r0, (int) r4)     // Catch:{ Throwable -> 0x0227 }
            if (r9 != 0) goto L_0x0186
            java.lang.String r9 = "accs"
            java.lang.String r10 = "send_fail"
            java.lang.String r12 = r2.serviceId     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r13 = "1"
            java.lang.String r14 = "push response intent null"
            com.taobao.accs.utl.b.a(r9, r10, r12, r13, r14)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r9 = r2.serviceId     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r10 = r2.dataId     // Catch:{ Throwable -> 0x0227 }
            r1.a((android.content.Context) r0, (int) r4, (java.lang.String) r9, (java.lang.String) r10)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r4 = r1.f78976d     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r9 = "sendPushResponse input null"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r10 = "context"
            r7[r11] = r10     // Catch:{ Throwable -> 0x0227 }
            r10 = 1
            r7[r10] = r0     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r0 = "response"
            r7[r8] = r0     // Catch:{ Throwable -> 0x0227 }
            r7[r6] = r2     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r0 = "extraInfo"
            r7[r5] = r0     // Catch:{ Throwable -> 0x0227 }
            r0 = 5
            r7[r0] = r3     // Catch:{ Throwable -> 0x0227 }
            com.taobao.accs.utl.ALog.e(r4, r9, r7)     // Catch:{ Throwable -> 0x0227 }
            r3 = 0
            return r3
        L_0x0186:
            java.lang.String r4 = r1.f78976d     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r5 = "sendPushResponse channel by"
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r7 = "app"
            r6[r11] = r7     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r7 = r3.fromPackage     // Catch:{ Throwable -> 0x0227 }
            r8 = 1
            r6[r8] = r7     // Catch:{ Throwable -> 0x0227 }
            com.taobao.accs.utl.ALog.i(r4, r5, r6)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = r3.fromPackage     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r4 = "com.taobao.accs.ChannelService"
            r9.setClassName(r3, r4)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = "send_type"
            com.taobao.accs.data.Message$ReqType r4 = com.taobao.accs.data.Message.ReqType.REQ     // Catch:{ Throwable -> 0x0227 }
            r9.putExtra(r3, r4)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = "appKey"
            r9.putExtra(r3, r12)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = "userInfo"
            java.lang.String r4 = r2.userId     // Catch:{ Throwable -> 0x0227 }
            r9.putExtra(r3, r4)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = "serviceId"
            java.lang.String r4 = r2.serviceId     // Catch:{ Throwable -> 0x0227 }
            r9.putExtra(r3, r4)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = "data"
            byte[] r4 = r2.data     // Catch:{ Throwable -> 0x0227 }
            r9.putExtra(r3, r4)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = "dataId"
            java.lang.String r4 = r2.dataId     // Catch:{ Throwable -> 0x0227 }
            r9.putExtra(r3, r4)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = "configTag"
            java.lang.String r4 = r1.f78975c     // Catch:{ Throwable -> 0x0227 }
            r9.putExtra(r3, r4)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r3 = r2.businessId     // Catch:{ Throwable -> 0x0227 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0227 }
            if (r3 != 0) goto L_0x01dd
            java.lang.String r3 = "businessId"
            java.lang.String r4 = r2.businessId     // Catch:{ Throwable -> 0x0227 }
            r9.putExtra(r3, r4)     // Catch:{ Throwable -> 0x0227 }
        L_0x01dd:
            java.lang.String r3 = r2.tag     // Catch:{ Throwable -> 0x0227 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0227 }
            if (r3 != 0) goto L_0x01ec
            java.lang.String r3 = "extTag"
            java.lang.String r4 = r2.tag     // Catch:{ Throwable -> 0x0227 }
            r9.putExtra(r3, r4)     // Catch:{ Throwable -> 0x0227 }
        L_0x01ec:
            java.lang.String r3 = r2.target     // Catch:{ Throwable -> 0x0227 }
            if (r3 == 0) goto L_0x01f7
            java.lang.String r3 = "target"
            java.lang.String r4 = r2.target     // Catch:{ Throwable -> 0x0227 }
            r9.putExtra(r3, r4)     // Catch:{ Throwable -> 0x0227 }
        L_0x01f7:
            com.taobao.accs.a.a.a(r0, r9, r11)     // Catch:{ Throwable -> 0x0227 }
            goto L_0x025c
        L_0x01fb:
            java.lang.String r4 = r1.f78976d     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r9 = "sendPushResponse input null"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r10 = "context"
            r7[r11] = r10     // Catch:{ Throwable -> 0x0227 }
            r10 = 1
            r7[r10] = r0     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r0 = "response"
            r7[r8] = r0     // Catch:{ Throwable -> 0x0227 }
            r7[r6] = r2     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r0 = "extraInfo"
            r7[r5] = r0     // Catch:{ Throwable -> 0x0227 }
            r0 = 5
            r7[r0] = r20     // Catch:{ Throwable -> 0x0227 }
            com.taobao.accs.utl.ALog.e(r4, r9, r7)     // Catch:{ Throwable -> 0x0227 }
            java.lang.String r0 = "accs"
            java.lang.String r3 = "send_fail"
            java.lang.String r4 = ""
            java.lang.String r5 = "1"
            java.lang.String r6 = "sendPushResponse null"
            com.taobao.accs.utl.b.a(r0, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0227 }
            r3 = 0
            return r3
        L_0x0227:
            r0 = move-exception
            java.lang.String r3 = "accs"
            java.lang.String r4 = "send_fail"
            java.lang.String r5 = r2.serviceId
            java.lang.String r6 = "1"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "push response "
            r7.<init>(r8)
            java.lang.String r8 = r0.toString()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.taobao.accs.utl.b.a(r3, r4, r5, r6, r7)
            java.lang.String r3 = r1.f78976d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "sendPushResponse dataid:"
            r4.<init>(r5)
            java.lang.String r2 = r2.dataId
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[r11]
            com.taobao.accs.utl.ALog.e(r3, r2, r0, r4)
        L_0x025c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.a(android.content.Context, com.taobao.accs.ACCSManager$AccsRequest, com.taobao.accs.base.TaoBaseService$ExtraInfo):java.lang.String");
    }

    private void a(Context context, int i, String str, String str2) {
        int i2;
        Intent intent = new Intent("com.taobao.accs.intent.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", i);
        intent.putExtra("serviceId", str);
        intent.putExtra("dataId", str2);
        intent.putExtra("appKey", this.f78973a.f78990b);
        intent.putExtra("configTag", this.f78975c);
        if (i == 2) {
            i2 = 200;
        } else {
            i2 = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;
        }
        intent.putExtra("errorCode", i2);
        g.a(context, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a4, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00cd, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ce, code lost:
        if (r8 == false) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d0, code lost:
        com.taobao.accs.utl.ALog.i(r7.f78976d, "sendControlMessage", "command", java.lang.Integer.valueOf(r10));
        r7.f78973a.b(r9, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r8, com.taobao.accs.data.Message r9, int r10, boolean r11) {
        /*
            r7 = this;
            com.taobao.accs.net.b r0 = r7.f78973a
            r0.a()
            r0 = 0
            if (r9 != 0) goto L_0x0020
            java.lang.String r9 = r7.f78976d
            java.lang.String r11 = "message is null"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.e(r9, r11, r0)
            java.lang.String r8 = r8.getPackageName()
            com.taobao.accs.data.Message r8 = com.taobao.accs.data.Message.a((java.lang.String) r8, (int) r10)
            com.taobao.accs.net.b r9 = r7.f78973a
            r10 = -2
            r9.b((com.taobao.accs.data.Message) r8, (int) r10)
            return
        L_0x0020:
            r8 = 200(0xc8, float:2.8E-43)
            r1 = 2
            r2 = 1
            switch(r10) {
                case 1: goto L_0x00a6;
                case 2: goto L_0x0073;
                case 3: goto L_0x0029;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x00cd
        L_0x0029:
            com.taobao.accs.net.b r3 = r7.f78973a
            com.taobao.accs.client.b r3 = r3.j()
            java.lang.String r4 = r9.f()
            java.lang.String r5 = r9.G
            boolean r3 = r3.b(r4, r5)
            if (r3 == 0) goto L_0x00cd
            if (r11 != 0) goto L_0x00cd
            java.lang.String r3 = r7.f78976d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r9.f()
            r4.append(r5)
            java.lang.String r5 = "/"
            r4.append(r5)
            java.lang.String r5 = r9.G
            r4.append(r5)
            java.lang.String r5 = " isUserBinded"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = "isForceBind"
            r5[r0] = r6
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r5[r2] = r11
            com.taobao.accs.utl.ALog.i(r3, r4, r5)
            com.taobao.accs.net.b r11 = r7.f78973a
            r11.b((com.taobao.accs.data.Message) r9, (int) r8)
            goto L_0x00a4
        L_0x0073:
            com.taobao.accs.net.b r11 = r7.f78973a
            com.taobao.accs.client.b r11 = r11.j()
            java.lang.String r3 = r9.f()
            boolean r11 = r11.d(r3)
            if (r11 == 0) goto L_0x00cd
            java.lang.String r11 = r7.f78976d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r9.f()
            r3.append(r4)
            java.lang.String r4 = " isAppUnbinded"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.i(r11, r3, r4)
            com.taobao.accs.net.b r11 = r7.f78973a
            r11.b((com.taobao.accs.data.Message) r9, (int) r8)
        L_0x00a4:
            r8 = 0
            goto L_0x00ce
        L_0x00a6:
            java.lang.String r3 = r9.f()
            com.taobao.accs.net.b r4 = r7.f78973a
            com.taobao.accs.client.b r4 = r4.j()
            boolean r4 = r4.c(r3)
            if (r4 == 0) goto L_0x00cd
            if (r11 != 0) goto L_0x00cd
            java.lang.String r11 = r7.f78976d
            java.lang.String r4 = "isAppBinded"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r6 = "package"
            r5[r0] = r6
            r5[r2] = r3
            com.taobao.accs.utl.ALog.i(r11, r4, r5)
            com.taobao.accs.net.b r11 = r7.f78973a
            r11.b((com.taobao.accs.data.Message) r9, (int) r8)
            goto L_0x00a4
        L_0x00cd:
            r8 = 1
        L_0x00ce:
            if (r8 == 0) goto L_0x00e8
            java.lang.String r8 = r7.f78976d
            java.lang.String r11 = "sendControlMessage"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "command"
            r1[r0] = r3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1[r2] = r10
            com.taobao.accs.utl.ALog.i(r8, r11, r1)
            com.taobao.accs.net.b r8 = r7.f78973a
            r8.b((com.taobao.accs.data.Message) r9, (boolean) r2)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.a(android.content.Context, com.taobao.accs.data.Message, int, boolean):void");
    }

    public void b(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        GlobalClientInfo.getInstance(context).setAppReceiver(this.f78975c, iAppReceiver);
        if (!UtilityImpl.isMainProcess(context)) {
            ALog.d(this.f78976d, "inapp only init in main process!", new Object[0]);
            return;
        }
        String str3 = this.f78976d;
        ALog.d(str3, "startInAppConnection APPKEY:" + str, new Object[0]);
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(this.f78973a.i(), str)) {
                this.f78973a.f78989a = str2;
                this.f78973a.f78990b = str;
                this.f78973a.i.getAppSecret();
                UtilityImpl.d(context, str);
            }
            this.f78973a.a();
        }
    }

    public String a(Context context, ACCSManager.AccsRequest accsRequest, String str, boolean z) {
        if (accsRequest == null) {
            try {
                ALog.e(this.f78976d, "sendRequest request null", new Object[0]);
                com.taobao.accs.utl.b.a("accs", "send_fail", null, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "request null");
                return null;
            } catch (Throwable th) {
                if (accsRequest != null) {
                    com.taobao.accs.utl.b.a("accs", "send_fail", accsRequest.serviceId, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "request " + th.toString());
                    ALog.e(this.f78976d, "sendRequest", th, "dataId", accsRequest.dataId);
                }
            }
        } else if (!UtilityImpl.isMainProcess(context)) {
            ALog.e(this.f78976d, "sendRequest not in mainprocess", new Object[0]);
            return null;
        } else if (UtilityImpl.d(context)) {
            ALog.e(this.f78976d, "sendRequest disable", new Object[0]);
            com.taobao.accs.utl.b.a("accs", "send_fail", accsRequest.serviceId, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "accs disable");
            return null;
        } else {
            if (TextUtils.isEmpty(accsRequest.dataId)) {
                synchronized (ACCSManagerImpl.class) {
                    this.f78974b++;
                    accsRequest.dataId = this.f78974b;
                }
            }
            if (TextUtils.isEmpty(this.f78973a.i())) {
                com.taobao.accs.utl.b.a("accs", "send_fail", accsRequest.serviceId, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "request appkey null");
                ALog.e(this.f78976d, "sendRequest appkey null", "dataId", accsRequest.dataId);
                return null;
            }
            this.f78973a.a();
            if (str == null) {
                str = context.getPackageName();
            }
            Message a2 = Message.a(this.f78973a, context, str, "2|", accsRequest, z);
            if (a2.e() != null) {
                a2.e().onSend();
            }
            this.f78973a.b(a2, true);
            return accsRequest.dataId;
        }
    }

    public String a(Context context, String str, String str2, byte[] bArr, String str3) {
        return a(context, str, str2, bArr, str3, (String) null);
    }

    public String b(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return b(context, str, str2, bArr, str3, str4, null);
    }

    public String a(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return a(context, str, str2, bArr, str3, str4, null);
    }

    public String b(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null);
        Context context2 = context;
        return b(context, accsRequest);
    }

    public String a(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null);
        Context context2 = context;
        return a(context, accsRequest);
    }
}
