package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.a.a;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.util.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

public class d extends c<SubAliasStatus> {

    /* renamed from: a  reason: collision with root package name */
    private String f27283a;

    /* renamed from: b  reason: collision with root package name */
    private int f27284b;

    /* renamed from: c  reason: collision with root package name */
    private String f27285c;
    private Map<String, Boolean> m;

    public d(Context context, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    public d(Context context, a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.l = z;
    }

    public d(Context context, String str, String str2, a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.m = new HashMap();
    }

    public d(Context context, String str, String str2, String str3, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, str, str2, aVar, scheduledExecutorService);
        this.f27283a = str3;
    }

    private void b(boolean z) {
        Map<String, Boolean> map = this.m;
        map.put(this.h + "_" + this.f27284b, Boolean.valueOf(z));
    }

    private void f(String str) {
        b.g(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName(), str);
    }

    private String p() {
        return b.g(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName());
    }

    private boolean q() {
        Map<String, Boolean> map = this.m;
        Boolean bool = map.get(this.h + "_" + this.f27284b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private boolean r() {
        return !this.k && "com.meizu.cloud".equals(this.h);
    }

    public void a(int i) {
        this.f27284b = i;
    }

    /* access modifiers changed from: protected */
    public void a(SubAliasStatus subAliasStatus) {
        PlatformMessageSender.a(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName(), subAliasStatus);
    }

    public void a(String str) {
        this.f27285c = str;
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return !TextUtils.isEmpty(this.f27281f) && !TextUtils.isEmpty(this.g) && !TextUtils.isEmpty(this.f27283a);
    }

    /* access modifiers changed from: protected */
    public Intent c() {
        if (this.f27284b == 2) {
            return null;
        }
        Intent intent = new Intent();
        intent.putExtra("app_id", this.f27281f);
        intent.putExtra("app_key", this.g);
        intent.putExtra("strategy_package_name", this.f27280e.getPackageName());
        intent.putExtra("push_id", this.f27283a);
        intent.putExtra("strategy_type", g());
        intent.putExtra("strategy_child_type", this.f27284b);
        intent.putExtra("strategy_params", this.f27285c);
        return intent;
    }

    public void e(String str) {
        this.f27283a = str;
    }

    /* access modifiers changed from: protected */
    public int g() {
        return 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public SubAliasStatus b() {
        String str;
        SubAliasStatus subAliasStatus = new SubAliasStatus();
        subAliasStatus.setCode("20001");
        if (TextUtils.isEmpty(this.f27281f)) {
            str = "appId not empty";
        } else if (TextUtils.isEmpty(this.g)) {
            str = "appKey not empty";
        } else {
            if (TextUtils.isEmpty(this.f27283a)) {
                str = "pushId not empty";
            }
            return subAliasStatus;
        }
        subAliasStatus.setMessage(str);
        return subAliasStatus;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0073, code lost:
        r0.setAlias(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0094, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0095, code lost:
        if (r1 == null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        if (r1.b() == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        r0 = new com.meizu.cloud.pushsdk.platform.message.SubAliasStatus((java.lang.String) r1.a());
        com.meizu.cloud.pushinternal.DebugLogger.e("Strategy", "network subAliasStatus " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c5, code lost:
        if (com.meizu.cloud.pushsdk.platform.message.BasicPushStatus.SUCCESS_CODE.equals(r0.getCode()) == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c7, code lost:
        b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cc, code lost:
        r1 = r1.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d4, code lost:
        if (r1.a() == null) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d6, code lost:
        com.meizu.cloud.pushinternal.DebugLogger.e("Strategy", "status code=" + r1.b() + " data=" + r1.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f9, code lost:
        r0.setCode(java.lang.String.valueOf(r1.b()));
        r0.setMessage(r1.c());
        com.meizu.cloud.pushinternal.DebugLogger.e("Strategy", "subAliasStatus " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011e, code lost:
        return r0;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.meizu.cloud.pushsdk.platform.message.SubAliasStatus e() {
        /*
            r6 = this;
            com.meizu.cloud.pushsdk.platform.message.SubAliasStatus r0 = new com.meizu.cloud.pushsdk.platform.message.SubAliasStatus
            r0.<init>()
            java.lang.String r1 = r6.f27283a
            r0.setPushId(r1)
            java.lang.String r1 = ""
            r0.setMessage(r1)
            int r1 = r6.f27284b
            r2 = 1
            switch(r1) {
                case 0: goto L_0x005a;
                case 1: goto L_0x0025;
                case 2: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0094
        L_0x0017:
            java.lang.String r1 = r6.p()
            r0.setAlias(r1)
            java.lang.String r1 = "200"
            r0.setCode(r1)
            goto L_0x0094
        L_0x0025:
            java.lang.String r1 = r6.p()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x003d
            boolean r1 = r6.q()
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = "200"
            r0.setCode(r1)
            java.lang.String r1 = ""
            goto L_0x0073
        L_0x003d:
            r6.b(r2)
            boolean r1 = r6.r()
            if (r1 == 0) goto L_0x004b
            java.lang.String r1 = ""
            r6.f(r1)
        L_0x004b:
            com.meizu.cloud.pushsdk.platform.a.a r1 = r6.j
            java.lang.String r2 = r6.f27281f
            java.lang.String r3 = r6.g
            java.lang.String r4 = r6.f27283a
            java.lang.String r5 = r6.f27285c
            com.meizu.cloud.pushsdk.b.a.c r1 = r1.d(r2, r3, r4, r5)
            goto L_0x0095
        L_0x005a:
            java.lang.String r1 = r6.f27285c
            java.lang.String r3 = r6.p()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0077
            boolean r1 = r6.q()
            if (r1 != 0) goto L_0x0077
            java.lang.String r1 = "200"
            r0.setCode(r1)
            java.lang.String r1 = r6.f27285c
        L_0x0073:
            r0.setAlias(r1)
            goto L_0x0094
        L_0x0077:
            r6.b(r2)
            boolean r1 = r6.r()
            if (r1 == 0) goto L_0x0085
            java.lang.String r1 = r6.f27285c
            r6.f(r1)
        L_0x0085:
            com.meizu.cloud.pushsdk.platform.a.a r1 = r6.j
            java.lang.String r2 = r6.f27281f
            java.lang.String r3 = r6.g
            java.lang.String r4 = r6.f27283a
            java.lang.String r5 = r6.f27285c
            com.meizu.cloud.pushsdk.b.a.c r1 = r1.c(r2, r3, r4, r5)
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            if (r1 == 0) goto L_0x011e
            boolean r2 = r1.b()
            if (r2 == 0) goto L_0x00cc
            com.meizu.cloud.pushsdk.platform.message.SubAliasStatus r0 = new com.meizu.cloud.pushsdk.platform.message.SubAliasStatus
            java.lang.Object r1 = r1.a()
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            java.lang.String r1 = "Strategy"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "network subAliasStatus "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r1, r2)
            java.lang.String r1 = "200"
            java.lang.String r2 = r0.getCode()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x011e
            r1 = 0
            r6.b(r1)
            goto L_0x011e
        L_0x00cc:
            com.meizu.cloud.pushsdk.b.b.a r1 = r1.c()
            com.meizu.cloud.pushsdk.b.c.k r2 = r1.a()
            if (r2 == 0) goto L_0x00f9
            java.lang.String r2 = "Strategy"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "status code="
            r3.<init>(r4)
            int r4 = r1.b()
            r3.append(r4)
            java.lang.String r4 = " data="
            r3.append(r4)
            com.meizu.cloud.pushsdk.b.c.k r4 = r1.a()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r2, r3)
        L_0x00f9:
            int r2 = r1.b()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.setCode(r2)
            java.lang.String r1 = r1.c()
            r0.setMessage(r1)
            java.lang.String r1 = "Strategy"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "subAliasStatus "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r1, r2)
        L_0x011e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.platform.b.d.e():com.meizu.cloud.pushsdk.platform.message.SubAliasStatus");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public SubAliasStatus f() {
        if (this.f27284b != 2) {
            return null;
        }
        SubAliasStatus subAliasStatus = new SubAliasStatus();
        subAliasStatus.setCode(BasicPushStatus.SUCCESS_CODE);
        subAliasStatus.setPushId(this.f27283a);
        subAliasStatus.setAlias(p());
        subAliasStatus.setMessage("check alias success");
        return subAliasStatus;
    }
}
