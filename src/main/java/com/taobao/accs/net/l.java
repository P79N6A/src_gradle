package com.taobao.accs.net;

import com.taobao.accs.data.Message;

public class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Message f79016a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j f79017b;

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0286  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r1 = r17
            com.taobao.accs.data.Message r0 = r1.f79016a
            if (r0 == 0) goto L_0x03a5
            com.taobao.accs.data.Message r0 = r1.f79016a
            com.taobao.accs.ut.monitor.NetPerformanceMonitor r0 = r0.e()
            if (r0 == 0) goto L_0x0017
            com.taobao.accs.data.Message r0 = r1.f79016a
            com.taobao.accs.ut.monitor.NetPerformanceMonitor r0 = r0.e()
            r0.onTakeFromQueue()
        L_0x0017:
            com.taobao.accs.data.Message r0 = r1.f79016a
            int r0 = r0.a()
            r2 = 3
            r3 = 4
            r4 = 2
            r5 = 0
            r6 = 1
            com.taobao.accs.utl.ALog$Level r7 = com.taobao.accs.utl.ALog.Level.D     // Catch:{ Throwable -> 0x02b6 }
            boolean r7 = com.taobao.accs.utl.ALog.isPrintLog(r7)     // Catch:{ Throwable -> 0x02b6 }
            if (r7 == 0) goto L_0x004b
            com.taobao.accs.net.j r7 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r7 = r7.d()     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r8 = "sendMessage start"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r10 = "dataId"
            r9[r5] = r10     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r10 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r10 = r10.q     // Catch:{ Throwable -> 0x02b6 }
            r9[r6] = r10     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r10 = "type"
            r9[r4] = r10     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r10 = com.taobao.accs.data.Message.c.b(r0)     // Catch:{ Throwable -> 0x02b6 }
            r9[r2] = r10     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.utl.ALog.d(r7, r8, r9)     // Catch:{ Throwable -> 0x02b6 }
        L_0x004b:
            if (r0 != r6) goto L_0x01f6
            com.taobao.accs.data.Message r7 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.net.URL r7 = r7.f78931f     // Catch:{ Throwable -> 0x02b6 }
            if (r7 != 0) goto L_0x005f
            com.taobao.accs.net.j r7 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.d r7 = r7.f78993e     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r8 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            r9 = -5
            r7.a((com.taobao.accs.data.Message) r8, (int) r9)     // Catch:{ Throwable -> 0x02b6 }
            goto L_0x01f2
        L_0x005f:
            com.taobao.accs.net.j r7 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.AccsClientConfig r7 = r7.i     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r7 = r7.getAppKey()     // Catch:{ Throwable -> 0x02b6 }
            anet.channel.SessionCenter r7 = anet.channel.SessionCenter.getInstance((java.lang.String) r7)     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.net.j r8 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r9 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.net.URL r9 = r9.f78931f     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r9 = r9.getHost()     // Catch:{ Throwable -> 0x02b6 }
            r8.a((anet.channel.SessionCenter) r7, (java.lang.String) r9, (boolean) r5)     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r8 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.net.URL r8 = r8.f78931f     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x02b6 }
            anet.channel.entity.ConnType$TypeLevel r9 = anet.channel.entity.ConnType.TypeLevel.SPDY     // Catch:{ Throwable -> 0x02b6 }
            r10 = 60000(0xea60, double:2.9644E-319)
            anet.channel.Session r7 = r7.get((java.lang.String) r8, (anet.channel.entity.ConnType.TypeLevel) r9, (long) r10)     // Catch:{ Throwable -> 0x02b6 }
            if (r7 == 0) goto L_0x01f4
            com.taobao.accs.data.Message r8 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.net.j r9 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            android.content.Context r9 = r9.f78992d     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.net.j r10 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            int r10 = r10.f78991c     // Catch:{ Throwable -> 0x02b6 }
            byte[] r8 = r8.a((android.content.Context) r9, (int) r10)     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r9 = "accs"
            com.taobao.accs.data.Message r10 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r10 = r10.H     // Catch:{ Throwable -> 0x02b6 }
            boolean r9 = r9.equals(r10)     // Catch:{ Throwable -> 0x02b6 }
            r11 = 8
            r12 = 7
            r13 = 6
            r14 = 5
            r15 = 10
            if (r9 == 0) goto L_0x00f5
            com.taobao.accs.net.j r9 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r9 = r9.d()     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r10 = "sendMessage"
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r16 = "dataId"
            r15[r5] = r16     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r5 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r5 = r5.b()     // Catch:{ Throwable -> 0x02b6 }
            r15[r6] = r5     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r5 = "command"
            r15[r4] = r5     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r5 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.lang.Integer r5 = r5.t     // Catch:{ Throwable -> 0x02b6 }
            r15[r2] = r5     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r5 = "host"
            r15[r3] = r5     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r5 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.net.URL r5 = r5.f78931f     // Catch:{ Throwable -> 0x02b6 }
            r15[r14] = r5     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r5 = "len"
            r15[r13] = r5     // Catch:{ Throwable -> 0x02b6 }
            if (r8 != 0) goto L_0x00de
            r5 = 0
            goto L_0x00df
        L_0x00de:
            int r5 = r8.length     // Catch:{ Throwable -> 0x02b6 }
        L_0x00df:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x02b6 }
            r15[r12] = r5     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r5 = "utdid"
            r15[r11] = r5     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.net.j r5 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r5 = r5.j     // Catch:{ Throwable -> 0x02b6 }
            r11 = 9
            r15[r11] = r5     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.utl.ALog.e(r9, r10, r15)     // Catch:{ Throwable -> 0x02b6 }
            goto L_0x0147
        L_0x00f5:
            com.taobao.accs.utl.ALog$Level r5 = com.taobao.accs.utl.ALog.Level.I     // Catch:{ Throwable -> 0x02b6 }
            boolean r5 = com.taobao.accs.utl.ALog.isPrintLog(r5)     // Catch:{ Throwable -> 0x02b6 }
            if (r5 == 0) goto L_0x0147
            com.taobao.accs.net.j r5 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r5 = r5.d()     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r9 = "sendMessage"
            java.lang.Object[] r10 = new java.lang.Object[r15]     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r15 = "dataId"
            r16 = 0
            r10[r16] = r15     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r15 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r15 = r15.b()     // Catch:{ Throwable -> 0x02b6 }
            r10[r6] = r15     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r15 = "command"
            r10[r4] = r15     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r15 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.lang.Integer r15 = r15.t     // Catch:{ Throwable -> 0x02b6 }
            r10[r2] = r15     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r15 = "host"
            r10[r3] = r15     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r15 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.net.URL r15 = r15.f78931f     // Catch:{ Throwable -> 0x02b6 }
            r10[r14] = r15     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r14 = "len"
            r10[r13] = r14     // Catch:{ Throwable -> 0x02b6 }
            if (r8 != 0) goto L_0x0131
            r13 = 0
            goto L_0x0132
        L_0x0131:
            int r13 = r8.length     // Catch:{ Throwable -> 0x02b6 }
        L_0x0132:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x02b6 }
            r10[r12] = r13     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r12 = "utdid"
            r10[r11] = r12     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.net.j r11 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r11 = r11.j     // Catch:{ Throwable -> 0x02b6 }
            r12 = 9
            r10[r12] = r11     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.utl.ALog.d(r5, r9, r10)     // Catch:{ Throwable -> 0x02b6 }
        L_0x0147:
            com.taobao.accs.data.Message r5 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x02b6 }
            r5.a((long) r9)     // Catch:{ Throwable -> 0x02b6 }
            int r5 = r8.length     // Catch:{ Throwable -> 0x02b6 }
            r9 = 16384(0x4000, float:2.2959E-41)
            if (r5 <= r9) goto L_0x016d
            com.taobao.accs.data.Message r5 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.lang.Integer r5 = r5.t     // Catch:{ Throwable -> 0x02b6 }
            int r5 = r5.intValue()     // Catch:{ Throwable -> 0x02b6 }
            r9 = 102(0x66, float:1.43E-43)
            if (r5 == r9) goto L_0x016d
            com.taobao.accs.net.j r5 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.d r5 = r5.f78993e     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r7 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            r8 = -4
            r5.a((com.taobao.accs.data.Message) r7, (int) r8)     // Catch:{ Throwable -> 0x02b6 }
            goto L_0x01f2
        L_0x016d:
            com.taobao.accs.net.j r5 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.d r5 = r5.f78993e     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r9 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            r5.a((com.taobao.accs.data.Message) r9)     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r5 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            boolean r5 = r5.f78928c     // Catch:{ Throwable -> 0x02b6 }
            if (r5 == 0) goto L_0x0188
            com.taobao.accs.data.Message r5 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message$a r5 = r5.d()     // Catch:{ Throwable -> 0x02b6 }
            int r5 = r5.a()     // Catch:{ Throwable -> 0x02b6 }
            int r5 = -r5
            goto L_0x0192
        L_0x0188:
            com.taobao.accs.data.Message r5 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message$a r5 = r5.d()     // Catch:{ Throwable -> 0x02b6 }
            int r5 = r5.a()     // Catch:{ Throwable -> 0x02b6 }
        L_0x0192:
            com.taobao.accs.data.Message r9 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            boolean r9 = r9.f78928c     // Catch:{ Throwable -> 0x02b6 }
            if (r9 == 0) goto L_0x01a5
            com.taobao.accs.net.j r9 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            java.util.LinkedHashMap r9 = r9.l     // Catch:{ Throwable -> 0x02b6 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r11 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            r9.put(r10, r11)     // Catch:{ Throwable -> 0x02b6 }
        L_0x01a5:
            r9 = 200(0xc8, float:2.8E-43)
            r7.sendCustomFrame(r5, r8, r9)     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r5 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.ut.monitor.NetPerformanceMonitor r5 = r5.e()     // Catch:{ Throwable -> 0x02b6 }
            if (r5 == 0) goto L_0x01bb
            com.taobao.accs.data.Message r5 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.ut.monitor.NetPerformanceMonitor r5 = r5.e()     // Catch:{ Throwable -> 0x02b6 }
            r5.onSendData()     // Catch:{ Throwable -> 0x02b6 }
        L_0x01bb:
            com.taobao.accs.net.j r5 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r7 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r7 = r7.b()     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.net.j r9 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.AccsClientConfig r9 = r9.i     // Catch:{ Throwable -> 0x02b6 }
            boolean r9 = r9.isQuickReconnect()     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r10 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            int r10 = r10.S     // Catch:{ Throwable -> 0x02b6 }
            long r10 = (long) r10     // Catch:{ Throwable -> 0x02b6 }
            r5.a((java.lang.String) r7, (boolean) r9, (long) r10)     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.net.j r5 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.d r5 = r5.f78993e     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.ut.monitor.TrafficsMonitor$a r7 = new com.taobao.accs.ut.monitor.TrafficsMonitor$a     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r9 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r10 = r9.H     // Catch:{ Throwable -> 0x02b6 }
            boolean r11 = anet.channel.GlobalAppRuntimeInfo.isAppBackground()     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.data.Message r9 = r1.f79016a     // Catch:{ Throwable -> 0x02b6 }
            java.net.URL r9 = r9.f78931f     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r12 = r9.toString()     // Catch:{ Throwable -> 0x02b6 }
            int r8 = r8.length     // Catch:{ Throwable -> 0x02b6 }
            long r13 = (long) r8     // Catch:{ Throwable -> 0x02b6 }
            r9 = r7
            r9.<init>(r10, r11, r12, r13)     // Catch:{ Throwable -> 0x02b6 }
            r5.a((com.taobao.accs.ut.monitor.TrafficsMonitor.a) r7)     // Catch:{ Throwable -> 0x02b6 }
        L_0x01f2:
            r5 = 1
            goto L_0x020f
        L_0x01f4:
            r5 = 0
            goto L_0x020f
        L_0x01f6:
            com.taobao.accs.net.j r5 = r1.f79017b     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r5 = r5.d()     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r7 = "sendMessage skip"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r9 = "type"
            r10 = 0
            r8[r10] = r9     // Catch:{ Throwable -> 0x02b6 }
            java.lang.String r9 = com.taobao.accs.data.Message.c.b(r0)     // Catch:{ Throwable -> 0x02b6 }
            r8[r6] = r9     // Catch:{ Throwable -> 0x02b6 }
            com.taobao.accs.utl.ALog.e(r5, r7, r8)     // Catch:{ Throwable -> 0x02b6 }
            goto L_0x01f2
        L_0x020f:
            if (r5 != 0) goto L_0x0255
            r7 = -11
            if (r0 != r6) goto L_0x024c
            com.taobao.accs.data.Message r0 = r1.f79016a
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0229
            com.taobao.accs.net.j r0 = r1.f79017b
            com.taobao.accs.data.Message r8 = r1.f79016a
            r9 = 2000(0x7d0, float:2.803E-42)
            boolean r0 = r0.a((com.taobao.accs.data.Message) r8, (int) r9)
            if (r0 != 0) goto L_0x0232
        L_0x0229:
            com.taobao.accs.net.j r0 = r1.f79017b
            com.taobao.accs.data.d r0 = r0.f78993e
            com.taobao.accs.data.Message r8 = r1.f79016a
            r0.a((com.taobao.accs.data.Message) r8, (int) r7)
        L_0x0232:
            com.taobao.accs.data.Message r0 = r1.f79016a
            int r0 = r0.R
            if (r0 != r6) goto L_0x0255
            com.taobao.accs.data.Message r0 = r1.f79016a
            com.taobao.accs.ut.monitor.NetPerformanceMonitor r0 = r0.e()
            if (r0 == 0) goto L_0x0255
            java.lang.String r0 = "accs"
            java.lang.String r7 = "resend"
            java.lang.String r8 = "total_accs"
            r9 = 0
            com.taobao.accs.utl.b.a(r0, r7, r8, r9)
            goto L_0x0255
        L_0x024c:
            com.taobao.accs.net.j r0 = r1.f79017b
            com.taobao.accs.data.d r0 = r0.f78993e
            com.taobao.accs.data.Message r8 = r1.f79016a
            r0.a((com.taobao.accs.data.Message) r8, (int) r7)
        L_0x0255:
            java.lang.String r0 = "accs"
            com.taobao.accs.data.Message r7 = r1.f79016a
            java.lang.String r7 = r7.H
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0286
            com.taobao.accs.net.j r0 = r1.f79017b
            java.lang.String r0 = r0.d()
            java.lang.String r7 = "sendMessage end"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r8 = "dataId"
            r9 = 0
            r3[r9] = r8
            com.taobao.accs.data.Message r8 = r1.f79016a
            java.lang.String r8 = r8.b()
            r3[r6] = r8
            java.lang.String r6 = "status"
            r3[r4] = r6
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r3[r2] = r4
            com.taobao.accs.utl.ALog.e(r0, r7, r3)
            return
        L_0x0286:
            com.taobao.accs.utl.ALog$Level r0 = com.taobao.accs.utl.ALog.Level.D
            boolean r0 = com.taobao.accs.utl.ALog.isPrintLog(r0)
            if (r0 == 0) goto L_0x03a5
            com.taobao.accs.net.j r0 = r1.f79017b
            java.lang.String r0 = r0.d()
            java.lang.String r7 = "sendMessage end"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r8 = "dataId"
            r9 = 0
            r3[r9] = r8
            com.taobao.accs.data.Message r8 = r1.f79016a
            java.lang.String r8 = r8.b()
            r3[r6] = r8
            java.lang.String r6 = "status"
            r3[r4] = r6
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r5)
            r3[r2] = r4
            com.taobao.accs.utl.ALog.d(r0, r7, r3)
            return
        L_0x02b3:
            r0 = move-exception
            goto L_0x0347
        L_0x02b6:
            r0 = move-exception
            java.lang.String r5 = "accs"
            java.lang.String r7 = "send_fail"
            com.taobao.accs.data.Message r8 = r1.f79016a     // Catch:{ all -> 0x02b3 }
            java.lang.String r8 = r8.H     // Catch:{ all -> 0x02b3 }
            java.lang.String r9 = ""
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b3 }
            r10.<init>()     // Catch:{ all -> 0x02b3 }
            com.taobao.accs.net.j r11 = r1.f79017b     // Catch:{ all -> 0x02b3 }
            int r11 = r11.f78991c     // Catch:{ all -> 0x02b3 }
            r10.append(r11)     // Catch:{ all -> 0x02b3 }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x02b3 }
            r10.append(r11)     // Catch:{ all -> 0x02b3 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x02b3 }
            com.taobao.accs.utl.b.a(r5, r7, r8, r9, r10)     // Catch:{ all -> 0x02b3 }
            com.taobao.accs.net.j r5 = r1.f79017b     // Catch:{ all -> 0x02b3 }
            java.lang.String r5 = r5.d()     // Catch:{ all -> 0x02b3 }
            java.lang.String r7 = "sendMessage"
            r8 = 0
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x02b3 }
            com.taobao.accs.utl.ALog.e(r5, r7, r0, r9)     // Catch:{ all -> 0x02b3 }
            java.lang.String r0 = "accs"
            com.taobao.accs.data.Message r5 = r1.f79016a
            java.lang.String r5 = r5.H
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x031a
            com.taobao.accs.net.j r0 = r1.f79017b
            java.lang.String r0 = r0.d()
            java.lang.String r5 = "sendMessage end"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r7 = "dataId"
            r8 = 0
            r3[r8] = r7
            com.taobao.accs.data.Message r7 = r1.f79016a
            java.lang.String r7 = r7.b()
            r3[r6] = r7
            java.lang.String r7 = "status"
            r3[r4] = r7
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            r3[r2] = r4
            com.taobao.accs.utl.ALog.e(r0, r5, r3)
            return
        L_0x031a:
            com.taobao.accs.utl.ALog$Level r0 = com.taobao.accs.utl.ALog.Level.D
            boolean r0 = com.taobao.accs.utl.ALog.isPrintLog(r0)
            if (r0 == 0) goto L_0x03a5
            com.taobao.accs.net.j r0 = r1.f79017b
            java.lang.String r0 = r0.d()
            java.lang.String r5 = "sendMessage end"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r7 = "dataId"
            r8 = 0
            r3[r8] = r7
            com.taobao.accs.data.Message r7 = r1.f79016a
            java.lang.String r7 = r7.b()
            r3[r6] = r7
            java.lang.String r7 = "status"
            r3[r4] = r7
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            r3[r2] = r4
            com.taobao.accs.utl.ALog.d(r0, r5, r3)
            return
        L_0x0347:
            java.lang.String r5 = "accs"
            com.taobao.accs.data.Message r7 = r1.f79016a
            java.lang.String r7 = r7.H
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0380
            com.taobao.accs.utl.ALog$Level r5 = com.taobao.accs.utl.ALog.Level.D
            boolean r5 = com.taobao.accs.utl.ALog.isPrintLog(r5)
            if (r5 == 0) goto L_0x03a4
            com.taobao.accs.net.j r5 = r1.f79017b
            java.lang.String r5 = r5.d()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r7 = "dataId"
            r8 = 0
            r3[r8] = r7
            com.taobao.accs.data.Message r7 = r1.f79016a
            java.lang.String r7 = r7.b()
            r3[r6] = r7
            java.lang.String r7 = "status"
            r3[r4] = r7
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            r3[r2] = r4
            java.lang.String r2 = "sendMessage end"
            com.taobao.accs.utl.ALog.d(r5, r2, r3)
            goto L_0x03a4
        L_0x0380:
            com.taobao.accs.net.j r5 = r1.f79017b
            java.lang.String r5 = r5.d()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r7 = "dataId"
            r8 = 0
            r3[r8] = r7
            com.taobao.accs.data.Message r7 = r1.f79016a
            java.lang.String r7 = r7.b()
            r3[r6] = r7
            java.lang.String r7 = "status"
            r3[r4] = r7
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
            r3[r2] = r4
            java.lang.String r2 = "sendMessage end"
            com.taobao.accs.utl.ALog.e(r5, r2, r3)
        L_0x03a4:
            throw r0
        L_0x03a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.l.run():void");
    }

    l(j jVar, Message message) {
        this.f79017b = jVar;
        this.f79016a = message;
    }
}
