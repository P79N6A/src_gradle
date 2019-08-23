package com.ss.android.ugc.aweme.miniapp.c.a;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.tt.miniapphost.process.handler.IAsyncHostDataHandler;

public final class b implements IAsyncHostDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55603a;

    /* renamed from: b  reason: collision with root package name */
    private final d f55604b;

    @NonNull
    public final String getType() {
        return "hostActionAsync";
    }

    public b(Context context) {
        this.f55604b = new d(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0125, code lost:
        if (r7.equals("unbind") != false) goto L_0x0129;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void action(@android.support.annotation.Nullable com.tt.miniapphost.process.data.CrossProcessDataEntity r20, @android.support.annotation.NonNull com.tt.miniapphost.process.helper.AsyncIpcHandler r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f55603a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.tt.miniapphost.process.data.CrossProcessDataEntity> r4 = com.tt.miniapphost.process.data.CrossProcessDataEntity.class
            r8[r10] = r4
            java.lang.Class<com.tt.miniapphost.process.helper.AsyncIpcHandler> r4 = com.tt.miniapphost.process.helper.AsyncIpcHandler.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 59356(0xe7dc, float:8.3175E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f55603a
            r15 = 0
            r16 = 59356(0xe7dc, float:8.3175E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.tt.miniapphost.process.data.CrossProcessDataEntity> r1 = com.tt.miniapphost.process.data.CrossProcessDataEntity.class
            r0[r10] = r1
            java.lang.Class<com.tt.miniapphost.process.helper.AsyncIpcHandler> r1 = com.tt.miniapphost.process.helper.AsyncIpcHandler.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            if (r0 != 0) goto L_0x0051
            java.lang.String r0 = "HostActionAsyncHandler"
            java.lang.String r1 = "callData == null"
            com.tt.miniapphost.util.DebugUtil.outputError(r0, r1)
            return
        L_0x0051:
            java.lang.String r3 = "hostActionType"
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r4 = "hostActionData"
            com.tt.miniapphost.process.data.CrossProcessDataEntity r0 = r0.getCrossProcessDataEntity(r4)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x006b
            java.lang.String r0 = "HostActionAsyncHandler"
            java.lang.String r1 = "TextUtils.isEmpty(hostCallType)"
            com.tt.miniapphost.util.DebugUtil.outputError(r0, r1)
            return
        L_0x006b:
            int r4 = r3.hashCode()
            r5 = -1769851281(0xffffffff9682366f, float:-2.1036985E-25)
            r6 = -1
            if (r4 == r5) goto L_0x0076
            goto L_0x0080
        L_0x0076:
            java.lang.String r4 = "operateAdDownload"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0080
            r3 = 0
            goto L_0x0081
        L_0x0080:
            r3 = -1
        L_0x0081:
            if (r3 == 0) goto L_0x0087
            r3 = r19
            goto L_0x01d5
        L_0x0087:
            r3 = r19
            com.ss.android.ugc.aweme.miniapp.c.a.d r4 = r3.f55604b
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.miniapp.c.a.d.f55607a
            r15 = 0
            r16 = 59362(0xe7e2, float:8.3184E-41)
            java.lang.Class[] r5 = new java.lang.Class[r2]
            java.lang.Class<com.tt.miniapphost.process.data.CrossProcessDataEntity> r7 = com.tt.miniapphost.process.data.CrossProcessDataEntity.class
            r5[r10] = r7
            java.lang.Class<com.tt.miniapphost.process.helper.AsyncIpcHandler> r7 = com.tt.miniapphost.process.helper.AsyncIpcHandler.class
            r5[r11] = r7
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r4
            r17 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r5 == 0) goto L_0x00cb
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.miniapp.c.a.d.f55607a
            r15 = 0
            r16 = 59362(0xe7e2, float:8.3184E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.tt.miniapphost.process.data.CrossProcessDataEntity> r1 = com.tt.miniapphost.process.data.CrossProcessDataEntity.class
            r0[r10] = r1
            java.lang.Class<com.tt.miniapphost.process.helper.AsyncIpcHandler> r1 = com.tt.miniapphost.process.helper.AsyncIpcHandler.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r4
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x00cb:
            r5 = 0
            if (r0 != 0) goto L_0x00dd
            r1.callback(r5)
            java.lang.String r0 = "OperateAdDownloadBindHandler"
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.String r2 = "callData == null."
            r1[r10] = r2
            com.tt.miniapphost.AppBrandLogger.e(r0, r1)
            return
        L_0x00dd:
            java.lang.String r7 = "downloadUrl"
            java.lang.String r13 = r0.getString(r7)
            java.lang.String r7 = "adDownloadOperateType"
            java.lang.String r7 = r0.getString(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r13)
            if (r8 != 0) goto L_0x01d6
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 == 0) goto L_0x00f7
            goto L_0x01d6
        L_0x00f7:
            int r5 = r7.hashCode()
            r8 = -840745386(0xffffffffcde33e56, float:-4.7656416E8)
            if (r5 == r8) goto L_0x011f
            r2 = 3023933(0x2e243d, float:4.237433E-39)
            if (r5 == r2) goto L_0x0115
            r2 = 1427818632(0x551ac888, float:1.06366291E13)
            if (r5 == r2) goto L_0x010b
            goto L_0x0128
        L_0x010b:
            java.lang.String r2 = "download"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0128
            r2 = 1
            goto L_0x0129
        L_0x0115:
            java.lang.String r2 = "bind"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0128
            r2 = 0
            goto L_0x0129
        L_0x011f:
            java.lang.String r5 = "unbind"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x0128
            goto L_0x0129
        L_0x0128:
            r2 = -1
        L_0x0129:
            switch(r2) {
                case 0: goto L_0x014d;
                case 1: goto L_0x0133;
                case 2: goto L_0x012e;
                default: goto L_0x012c;
            }
        L_0x012c:
            goto L_0x01d5
        L_0x012e:
            r4.a(r0, r13)
            goto L_0x01d5
        L_0x0133:
            java.lang.String r1 = "downloadEvent"
            java.lang.String r0 = r0.getString(r1)
            com.ss.android.download.api.b.b r17 = com.ss.android.ugc.aweme.miniapp.c.a.d.a((java.lang.String) r0)
            android.content.Context r0 = r4.f55608b
            com.ss.android.downloadlib.h r0 = com.ss.android.downloadlib.h.a((android.content.Context) r0)
            com.ss.android.downloadlib.d r12 = r0.f29058b
            r14 = 0
            r16 = 2
            r12.a((java.lang.String) r13, (long) r14, (int) r16, (com.ss.android.download.api.b.b) r17)
            return
        L_0x014d:
            java.lang.String r2 = "adId"
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r5 = "downloadToken"
            java.lang.String r5 = r0.getString(r5)
            java.lang.String r6 = "logExtra"
            java.lang.String r6 = r0.getString(r6)
            java.lang.String r7 = "packageName"
            java.lang.String r7 = r0.getString(r7)
            java.lang.String r8 = "appName"
            java.lang.String r8 = r0.getString(r8)
            java.lang.String r9 = "trackUrl"
            java.lang.String r0 = r0.getString(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x017f
            r9.add(r0)
        L_0x017f:
            r14 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x018c }
            long r16 = r0.longValue()     // Catch:{ NumberFormatException -> 0x018c }
            r14 = r16
            goto L_0x0197
        L_0x018c:
            r0 = move-exception
            r2 = 5
            java.lang.String r12 = "OperateAdDownloadBindHandler"
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r2, r12, r0)
        L_0x0197:
            com.ss.android.downloadad.api.a.c$a r0 = new com.ss.android.downloadad.api.a.c$a
            r0.<init>()
            com.ss.android.downloadad.api.a.c$a r0 = r0.a((long) r14)
            com.ss.android.downloadad.api.a.c$a r0 = r0.a((boolean) r11)
            com.ss.android.downloadad.api.a.c$a r0 = r0.a((java.lang.String) r6)
            com.ss.android.downloadad.api.a.c$a r0 = r0.d(r13)
            com.ss.android.downloadad.api.a.c$a r0 = r0.b((java.lang.String) r7)
            com.ss.android.downloadad.api.a.c$a r0 = r0.e(r8)
            com.ss.android.downloadad.api.a.c$a r0 = r0.b((boolean) r10)
            com.ss.android.downloadad.api.a.c$a r0 = r0.a((java.util.List<java.lang.String>) r9)
            com.ss.android.downloadad.api.a.c r0 = r0.a()
            int r2 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x01c5 }
            goto L_0x01c6
        L_0x01c5:
            r2 = 0
        L_0x01c6:
            android.content.Context r5 = r4.f55608b
            com.ss.android.downloadlib.h r5 = com.ss.android.downloadlib.h.a((android.content.Context) r5)
            com.ss.android.ugc.aweme.miniapp.c.a.d$1 r6 = new com.ss.android.ugc.aweme.miniapp.c.a.d$1
            r6.<init>(r1)
            r5.a((int) r2, (com.ss.android.download.api.b.d) r6, (com.ss.android.download.api.b.c) r0)
            return
        L_0x01d5:
            return
        L_0x01d6:
            r1.callback(r5)
            java.lang.String r1 = "OperateAdDownloadBindHandler"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "TextUtils.isEmpty( downloadUrl) || TextUtils.isEmpty(adDownloadOperateType). callData: "
            r2[r10] = r4
            r2[r11] = r0
            com.tt.miniapphost.AppBrandLogger.e(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.c.a.b.action(com.tt.miniapphost.process.data.CrossProcessDataEntity, com.tt.miniapphost.process.helper.AsyncIpcHandler):void");
    }
}
