package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.a.a;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public abstract class c<T extends BasicPushStatus> {

    /* renamed from: a  reason: collision with root package name */
    private String f27278a;

    /* renamed from: d  reason: collision with root package name */
    protected ScheduledExecutorService f27279d;

    /* renamed from: e  reason: collision with root package name */
    protected Context f27280e;

    /* renamed from: f  reason: collision with root package name */
    protected String f27281f;
    protected String g;
    protected String h;
    protected volatile String i;
    protected a j;
    protected boolean k = true;
    protected boolean l = true;

    public c(Context context, String str, String str2, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this.f27279d = scheduledExecutorService;
        this.f27280e = context;
        this.f27281f = str;
        this.g = str2;
        this.j = aVar;
    }

    private boolean a(int i2) {
        return i2 >= 110000 && i2 <= 200000;
    }

    private boolean b(T t) {
        int intValue = Integer.valueOf(t.getCode()).intValue();
        return (intValue > 200 && intValue < 600) || (intValue > 1000 && intValue < 2000) || intValue == 0;
    }

    private boolean h() {
        return this.l && !this.f27280e.getPackageName().equals(this.f27278a);
    }

    /* access modifiers changed from: protected */
    public String a(Context context, String str) {
        String str2 = null;
        if (!TextUtils.isEmpty(str)) {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(str), 0);
            if (queryIntentServices != null) {
                Iterator<ResolveInfo> it2 = queryIntentServices.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    ResolveInfo next = it2.next();
                    if ("com.meizu.cloud".equals(next.serviceInfo.packageName)) {
                        this.f27278a = next.serviceInfo.packageName;
                        str2 = next.serviceInfo.name;
                        break;
                    }
                }
                if (TextUtils.isEmpty(str2) && queryIntentServices.size() > 0) {
                    this.f27278a = queryIntentServices.get(0).serviceInfo.packageName;
                    str2 = queryIntentServices.get(0).serviceInfo.name;
                }
            }
        }
        DebugLogger.i("Strategy", "current process packageName " + this.f27278a);
        return str2;
    }

    /* access modifiers changed from: protected */
    public void a(Intent intent) {
        try {
            intent.setPackage(this.f27278a);
            intent.setAction(PushConstants.MZ_PUSH_MANAGER_SERVICE_ACTION);
            this.f27280e.startService(intent);
        } catch (Exception e2) {
            DebugLogger.e("Strategy", "start RemoteService error " + e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public void a(boolean z) {
        this.k = z;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a();

    /* access modifiers changed from: protected */
    public abstract T b();

    public void b(String str) {
        this.f27281f = str;
    }

    /* access modifiers changed from: protected */
    public abstract Intent c();

    public void c(String str) {
        this.g = str;
    }

    public void d(String str) {
        this.h = str;
    }

    /* access modifiers changed from: protected */
    public Intent[] d() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract T e();

    /* access modifiers changed from: protected */
    public abstract T f();

    /* access modifiers changed from: protected */
    public abstract int g();

    /* access modifiers changed from: protected */
    public boolean k() {
        return this.l && this.k && !TextUtils.isEmpty(a(this.f27280e, PushConstants.MZ_PUSH_MANAGER_SERVICE_ACTION));
    }

    /* access modifiers changed from: protected */
    public boolean l() {
        return 2 == g() || 32 == g();
    }

    public boolean m() {
        if (this.f27279d == null) {
            return n();
        }
        this.f27279d.execute(new Runnable() {
            public void run() {
                c.this.n();
            }
        });
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean n() {
        /*
            r7 = this;
            boolean r0 = r7.a()
            r1 = 1
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "Strategy"
            java.lang.String r2 = "Missing required parameters"
            com.meizu.cloud.pushinternal.DebugLogger.e(r0, r2)
            com.meizu.cloud.pushsdk.platform.message.BasicPushStatus r0 = r7.b()
        L_0x0012:
            r7.a((T) r0)
            goto L_0x010e
        L_0x0017:
            boolean r0 = r7.k()
            if (r0 != 0) goto L_0x00a1
            com.meizu.cloud.pushsdk.platform.message.BasicPushStatus r0 = r7.e()
            java.lang.String r2 = "Strategy"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "real response status "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.meizu.cloud.pushinternal.DebugLogger.i(r2, r3)
            if (r0 == 0) goto L_0x010e
            boolean r2 = r7.l()
            if (r2 == 0) goto L_0x0049
            java.lang.String r2 = "20000"
            java.lang.String r3 = r0.getCode()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0049
            return r1
        L_0x0049:
            boolean r2 = r7.h()
            if (r2 == 0) goto L_0x0057
            java.lang.String r2 = "Strategy"
            java.lang.String r3 = "response all request in local app"
            com.meizu.cloud.pushinternal.DebugLogger.e(r2, r3)
            goto L_0x0012
        L_0x0057:
            java.lang.String r2 = r0.getCode()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L_0x0063
            java.lang.String r2 = "0"
        L_0x0063:
            java.lang.String r3 = "200"
            java.lang.String r4 = r0.getCode()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0072
            r7.a((T) r0)
        L_0x0072:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r2 = r2.intValue()
            boolean r3 = r7.a((int) r2)
            if (r3 == 0) goto L_0x010e
            java.lang.String r3 = "Strategy"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "service error so notify pushManager invoker code="
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = " message "
            r4.append(r2)
            java.lang.String r2 = r0.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r3, r2)
            goto L_0x0012
        L_0x00a1:
            java.lang.String r0 = "Strategy"
            java.lang.String r2 = "send message to remote service"
            com.meizu.cloud.pushinternal.DebugLogger.i(r0, r2)
            boolean r0 = r7.l()
            r2 = 0
            if (r0 != 0) goto L_0x00cc
            com.meizu.cloud.pushsdk.platform.message.BasicPushStatus r0 = r7.f()
            if (r0 == 0) goto L_0x00cd
            java.lang.String r3 = "Strategy"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "local response "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r3, r4)
            r7.a((T) r0)
            goto L_0x00cd
        L_0x00cc:
            r0 = r2
        L_0x00cd:
            android.content.Intent r3 = r7.c()
            if (r3 == 0) goto L_0x00d6
            r7.a((android.content.Intent) r3)
        L_0x00d6:
            android.content.Intent[] r3 = r7.d()
            if (r3 == 0) goto L_0x00fc
            java.lang.String r4 = "Strategy"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "send sendRpcRequests length "
            r5.<init>(r6)
            int r6 = r3.length
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r4, r5)
            int r4 = r3.length
            r5 = 0
        L_0x00f2:
            if (r5 >= r4) goto L_0x00fc
            r6 = r3[r5]
            r7.a((android.content.Intent) r6)
            int r5 = r5 + 1
            goto L_0x00f2
        L_0x00fc:
            android.content.Context r3 = r7.f27280e
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "com.meizu.cloud.pushservice.action.PUSH_SERVICE_START"
            r4.<init>(r5)
            android.content.Context r5 = r7.f27280e
            java.lang.String r5 = r5.getPackageName()
            com.meizu.cloud.pushsdk.util.MzSystemUtils.sendMessageFromBroadcast(r3, r4, r2, r5)
        L_0x010e:
            if (r0 == 0) goto L_0x012c
            java.lang.String r2 = "Strategy"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "current status code "
            r3.<init>(r4)
            java.lang.String r4 = r0.getCode()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r2, r3)
            boolean r0 = r7.b((T) r0)
            r1 = r1 ^ r0
        L_0x012c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.platform.b.c.n():boolean");
    }

    /* access modifiers changed from: protected */
    public String o() {
        if (TextUtils.isEmpty(this.i)) {
            this.i = MzSystemUtils.getDeviceId(this.f27280e);
            DebugLogger.e("Strategy", "deviceId " + this.i);
        }
        return this.i;
    }
}
