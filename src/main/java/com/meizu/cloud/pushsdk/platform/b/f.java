package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.a.a;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.util.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

public class f extends c<PushSwitchStatus> {

    /* renamed from: a  reason: collision with root package name */
    boolean f27289a;

    /* renamed from: b  reason: collision with root package name */
    private String f27290b;

    /* renamed from: c  reason: collision with root package name */
    private int f27291c;
    private Map<String, Boolean> m;

    public f(Context context, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    public f(Context context, a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.l = z;
    }

    public f(Context context, String str, String str2, a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.m = new HashMap();
    }

    public f(Context context, String str, String str2, String str3, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, str, str2, aVar, scheduledExecutorService);
        this.f27290b = str3;
    }

    private void c(boolean z) {
        b.a(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName(), z);
    }

    private void d(boolean z) {
        b.b(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName(), z);
    }

    private void e(boolean z) {
        b.a(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName(), z);
        b.b(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName(), z);
    }

    private void f(boolean z) {
        Map<String, Boolean> map = this.m;
        map.put(this.h + "_" + this.f27291c, Boolean.valueOf(z));
    }

    private boolean p() {
        return b.e(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName());
    }

    private boolean q() {
        return b.f(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName());
    }

    private boolean r() {
        return b.h(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName());
    }

    private boolean s() {
        return b.i(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName());
    }

    private boolean t() {
        Map<String, Boolean> map = this.m;
        Boolean bool = map.get(this.h + "_" + this.f27291c);
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        DebugLogger.e("Strategy", "isSyncPushStatus " + this.h + " switch type->" + this.f27291c + " flag->" + booleanValue);
        return booleanValue;
    }

    public void a(int i) {
        this.f27291c = i;
    }

    /* access modifiers changed from: protected */
    public void a(PushSwitchStatus pushSwitchStatus) {
        PlatformMessageSender.a(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName(), pushSwitchStatus);
    }

    public void a(String str) {
        this.f27290b = str;
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return !TextUtils.isEmpty(this.f27281f) && !TextUtils.isEmpty(this.g) && !TextUtils.isEmpty(this.f27290b);
    }

    public void b(boolean z) {
        this.f27289a = z;
    }

    /* access modifiers changed from: protected */
    public Intent c() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.f27281f);
        intent.putExtra("app_key", this.g);
        intent.putExtra("strategy_package_name", this.f27280e.getPackageName());
        intent.putExtra("push_id", this.f27290b);
        intent.putExtra("strategy_type", g());
        intent.putExtra("strategy_child_type", this.f27291c);
        intent.putExtra("strategy_params", this.f27289a ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
        return intent;
    }

    /* access modifiers changed from: protected */
    public int g() {
        return 16;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public PushSwitchStatus b() {
        String str;
        PushSwitchStatus pushSwitchStatus = new PushSwitchStatus();
        pushSwitchStatus.setCode("20001");
        if (TextUtils.isEmpty(this.f27281f)) {
            str = "appId not empty";
        } else if (TextUtils.isEmpty(this.g)) {
            str = "appKey not empty";
        } else {
            if (TextUtils.isEmpty(this.f27290b)) {
                str = "pushId not empty";
            }
            return pushSwitchStatus;
        }
        pushSwitchStatus.setMessage(str);
        return pushSwitchStatus;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        r0.setSwitchNotificationMessage(r1);
        r1 = r9.f27289a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
        r0.setSwitchNotificationMessage(r1);
        r1 = r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        r0.setSwitchThroughMessage(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c7, code lost:
        r1 = r9.j.a(r9.f27281f, r9.g, r9.f27290b, r9.f27291c, r9.f27289a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        if (r1 == null) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e0, code lost:
        if (r1.b() == false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e2, code lost:
        r4 = new com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus((java.lang.String) r1.a());
        com.meizu.cloud.pushinternal.DebugLogger.e("Strategy", "network pushSwitchStatus " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010a, code lost:
        if (com.meizu.cloud.pushsdk.platform.message.BasicPushStatus.SUCCESS_CODE.equals(r0.getCode()) == false) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010c, code lost:
        f(false);
        com.meizu.cloud.pushinternal.DebugLogger.e("Strategy", "update local switch preference");
        r0.setSwitchNotificationMessage(r4.isSwitchNotificationMessage());
        r0.setSwitchThroughMessage(r4.isSwitchThroughMessage());
        c(r4.isSwitchNotificationMessage());
        d(r4.isSwitchThroughMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0133, code lost:
        r1 = r1.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x013b, code lost:
        if (r1.a() == null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013d, code lost:
        com.meizu.cloud.pushinternal.DebugLogger.e("Strategy", "status code=" + r1.b() + " data=" + r1.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0160, code lost:
        r0.setCode(java.lang.String.valueOf(r1.b()));
        r0.setMessage(r1.c());
        com.meizu.cloud.pushinternal.DebugLogger.e("Strategy", "pushSwitchStatus " + r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0185, code lost:
        com.meizu.cloud.pushinternal.DebugLogger.e("Strategy", "enableRPC " + r9.l + " isSupportRemoteInvoke " + r9.k);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01a6, code lost:
        if (r9.l == false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01aa, code lost:
        if (r9.k != false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01ac, code lost:
        r1 = r9.f27291c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01af, code lost:
        if (r1 == 3) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b1, code lost:
        switch(r1) {
            case 0: goto L_0x01b5;
            case 1: goto L_0x01b5;
            default: goto L_0x01b4;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b5, code lost:
        r1 = r9.f27280e;
        r2 = r9.f27291c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01b9, code lost:
        com.meizu.cloud.pushsdk.platform.PlatformMessageSender.a(r1, r2, r9.f27289a, r9.h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c1, code lost:
        com.meizu.cloud.pushsdk.platform.PlatformMessageSender.a(r9.f27280e, 0, r9.f27289a, r9.h);
        r1 = r9.f27280e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01cd, code lost:
        return r0;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus e() {
        /*
            r9 = this;
            com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus r0 = new com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus
            r0.<init>()
            java.lang.String r1 = r9.f27290b
            r0.setPushId(r1)
            java.lang.String r1 = "200"
            r0.setCode(r1)
            int r1 = r9.f27291c
            r2 = 1
            switch(r1) {
                case 0: goto L_0x009f;
                case 1: goto L_0x0079;
                case 2: goto L_0x004d;
                case 3: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x00d8
        L_0x0017:
            java.lang.String r1 = "SWITCH_ALL"
            r0.setMessage(r1)
            boolean r1 = r9.p()
            boolean r3 = r9.f27289a
            if (r1 != r3) goto L_0x0035
            boolean r1 = r9.r()
            boolean r3 = r9.f27289a
            if (r1 != r3) goto L_0x0035
            boolean r1 = r9.t()
            if (r1 != 0) goto L_0x0035
            boolean r1 = r9.f27289a
            goto L_0x0090
        L_0x0035:
            r9.f(r2)
            boolean r1 = r9.f27289a
            r9.e(r1)
            com.meizu.cloud.pushsdk.platform.a.a r1 = r9.j
            java.lang.String r3 = r9.f27281f
            java.lang.String r4 = r9.g
            java.lang.String r5 = r9.f27290b
            boolean r6 = r9.f27289a
            com.meizu.cloud.pushsdk.b.a.c r1 = r1.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (boolean) r6)
            goto L_0x00d9
        L_0x004d:
            java.lang.String r1 = "CHECK_PUSH"
            r0.setMessage(r1)
            boolean r1 = r9.q()
            if (r1 == 0) goto L_0x0069
            boolean r1 = r9.s()
            if (r1 == 0) goto L_0x0069
            boolean r1 = r9.t()
            if (r1 != 0) goto L_0x0069
            boolean r1 = r9.p()
            goto L_0x00b4
        L_0x0069:
            r9.f(r2)
            com.meizu.cloud.pushsdk.platform.a.a r1 = r9.j
            java.lang.String r3 = r9.f27281f
            java.lang.String r4 = r9.g
            java.lang.String r5 = r9.f27290b
            com.meizu.cloud.pushsdk.b.a.c r1 = r1.c(r3, r4, r5)
            goto L_0x00d9
        L_0x0079:
            java.lang.String r1 = "SWITCH_THROUGH_MESSAGE"
            r0.setMessage(r1)
            boolean r1 = r9.r()
            boolean r3 = r9.f27289a
            if (r1 != r3) goto L_0x0096
            boolean r1 = r9.t()
            if (r1 != 0) goto L_0x0096
            boolean r1 = r9.p()
        L_0x0090:
            r0.setSwitchNotificationMessage(r1)
            boolean r1 = r9.f27289a
            goto L_0x00bb
        L_0x0096:
            r9.f(r2)
            boolean r1 = r9.f27289a
            r9.d(r1)
            goto L_0x00c7
        L_0x009f:
            java.lang.String r1 = "SWITCH_NOTIFICATION"
            r0.setMessage(r1)
            boolean r1 = r9.p()
            boolean r3 = r9.f27289a
            if (r1 != r3) goto L_0x00bf
            boolean r1 = r9.t()
            if (r1 != 0) goto L_0x00bf
            boolean r1 = r9.f27289a
        L_0x00b4:
            r0.setSwitchNotificationMessage(r1)
            boolean r1 = r9.r()
        L_0x00bb:
            r0.setSwitchThroughMessage(r1)
            goto L_0x00d8
        L_0x00bf:
            r9.f(r2)
            boolean r1 = r9.f27289a
            r9.c(r1)
        L_0x00c7:
            com.meizu.cloud.pushsdk.platform.a.a r3 = r9.j
            java.lang.String r4 = r9.f27281f
            java.lang.String r5 = r9.g
            java.lang.String r6 = r9.f27290b
            int r7 = r9.f27291c
            boolean r8 = r9.f27289a
            com.meizu.cloud.pushsdk.b.a.c r1 = r3.a(r4, r5, r6, r7, r8)
            goto L_0x00d9
        L_0x00d8:
            r1 = 0
        L_0x00d9:
            r3 = 0
            if (r1 == 0) goto L_0x0185
            boolean r4 = r1.b()
            if (r4 == 0) goto L_0x0133
            com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus r4 = new com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus
            java.lang.Object r1 = r1.a()
            java.lang.String r1 = (java.lang.String) r1
            r4.<init>(r1)
            java.lang.String r1 = "Strategy"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "network pushSwitchStatus "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r1, r5)
            java.lang.String r1 = "200"
            java.lang.String r5 = r0.getCode()
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0185
            r9.f(r3)
            java.lang.String r1 = "Strategy"
            java.lang.String r5 = "update local switch preference"
            com.meizu.cloud.pushinternal.DebugLogger.e(r1, r5)
            boolean r1 = r4.isSwitchNotificationMessage()
            r0.setSwitchNotificationMessage(r1)
            boolean r1 = r4.isSwitchThroughMessage()
            r0.setSwitchThroughMessage(r1)
            boolean r1 = r4.isSwitchNotificationMessage()
            r9.c(r1)
            boolean r1 = r4.isSwitchThroughMessage()
            r9.d(r1)
            goto L_0x0185
        L_0x0133:
            com.meizu.cloud.pushsdk.b.b.a r1 = r1.c()
            com.meizu.cloud.pushsdk.b.c.k r4 = r1.a()
            if (r4 == 0) goto L_0x0160
            java.lang.String r4 = "Strategy"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "status code="
            r5.<init>(r6)
            int r6 = r1.b()
            r5.append(r6)
            java.lang.String r6 = " data="
            r5.append(r6)
            com.meizu.cloud.pushsdk.b.c.k r6 = r1.a()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r4, r5)
        L_0x0160:
            int r4 = r1.b()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.setCode(r4)
            java.lang.String r1 = r1.c()
            r0.setMessage(r1)
            java.lang.String r1 = "Strategy"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "pushSwitchStatus "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r1, r4)
        L_0x0185:
            java.lang.String r1 = "Strategy"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "enableRPC "
            r4.<init>(r5)
            boolean r5 = r9.l
            r4.append(r5)
            java.lang.String r5 = " isSupportRemoteInvoke "
            r4.append(r5)
            boolean r5 = r9.k
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.meizu.cloud.pushinternal.DebugLogger.e(r1, r4)
            boolean r1 = r9.l
            if (r1 == 0) goto L_0x01cd
            boolean r1 = r9.k
            if (r1 != 0) goto L_0x01cd
            int r1 = r9.f27291c
            r4 = 3
            if (r1 == r4) goto L_0x01c1
            switch(r1) {
                case 0: goto L_0x01b5;
                case 1: goto L_0x01b5;
                default: goto L_0x01b4;
            }
        L_0x01b4:
            goto L_0x01cd
        L_0x01b5:
            android.content.Context r1 = r9.f27280e
            int r2 = r9.f27291c
        L_0x01b9:
            boolean r3 = r9.f27289a
            java.lang.String r4 = r9.h
            com.meizu.cloud.pushsdk.platform.PlatformMessageSender.a(r1, r2, r3, r4)
            goto L_0x01cd
        L_0x01c1:
            android.content.Context r1 = r9.f27280e
            boolean r4 = r9.f27289a
            java.lang.String r5 = r9.h
            com.meizu.cloud.pushsdk.platform.PlatformMessageSender.a(r1, r3, r4, r5)
            android.content.Context r1 = r9.f27280e
            goto L_0x01b9
        L_0x01cd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.platform.b.f.e():com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public PushSwitchStatus f() {
        switch (this.f27291c) {
            case 0:
                c(this.f27289a);
                break;
            case 1:
                d(this.f27289a);
                break;
            case 3:
                e(this.f27289a);
                break;
        }
        return null;
    }
}
