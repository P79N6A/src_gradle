package anet.channel.strategy;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f1348a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f1349b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f1350c;

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        if (anet.channel.util.ALog.isPrintLog(1) != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
        anet.channel.util.ALog.d("awcn.LocalDnsStrategyTable", "resolve ip by local dns failed", null, "host", r13.f1348a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d6, code lost:
        r13.f1350c.f1346a.put(r13.f1348a, java.util.Collections.EMPTY_LIST);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e5, code lost:
        monitor-enter(r13.f1350c.f1347b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r13.f1350c.f1347b.remove(r13.f1348a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f2, code lost:
        monitor-enter(r13.f1349b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r13.f1349b.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0104, code lost:
        monitor-enter(r13.f1350c.f1347b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r13.f1350c.f1347b.remove(r13.f1348a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0111, code lost:
        monitor-enter(r13.f1349b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r13.f1349b.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0118, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00bf */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037 A[Catch:{ Exception -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[Catch:{ Exception -> 0x00bf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            r0 = 2
            r1 = 0
            r2 = 0
            r3 = 1
            java.lang.String r4 = r13.f1348a     // Catch:{ Exception -> 0x00bf }
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r4)     // Catch:{ Exception -> 0x00bf }
            java.lang.String r4 = r4.getHostAddress()     // Catch:{ Exception -> 0x00bf }
            java.util.LinkedList r12 = new java.util.LinkedList     // Catch:{ Exception -> 0x00bf }
            r12.<init>()     // Catch:{ Exception -> 0x00bf }
            anet.channel.strategy.StrategyTemplate r5 = anet.channel.strategy.StrategyTemplate.getInstance()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r6 = r13.f1348a     // Catch:{ Exception -> 0x00bf }
            anet.channel.strategy.ConnProtocol r7 = r5.getConnProtocol(r6)     // Catch:{ Exception -> 0x00bf }
            if (r7 == 0) goto L_0x004e
            java.lang.String r5 = r7.protocol     // Catch:{ Exception -> 0x00bf }
            java.lang.String r6 = "https"
            boolean r5 = r5.equalsIgnoreCase(r6)     // Catch:{ Exception -> 0x00bf }
            if (r5 != 0) goto L_0x0034
            java.lang.String r5 = r7.publicKey     // Catch:{ Exception -> 0x00bf }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x00bf }
            if (r5 != 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r5 = 0
            goto L_0x0035
        L_0x0034:
            r5 = 1
        L_0x0035:
            if (r5 != 0) goto L_0x003c
            r5 = 80
            r6 = 80
            goto L_0x0040
        L_0x003c:
            r5 = 443(0x1bb, float:6.21E-43)
            r6 = 443(0x1bb, float:6.21E-43)
        L_0x0040:
            r8 = 0
            r9 = 0
            r10 = 1
            r11 = 45000(0xafc8, float:6.3058E-41)
            r5 = r4
            anet.channel.strategy.IPConnStrategy r5 = anet.channel.strategy.IPConnStrategy.a(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00bf }
            r12.add(r5)     // Catch:{ Exception -> 0x00bf }
        L_0x004e:
            r6 = 80
            anet.channel.strategy.ConnProtocol r7 = anet.channel.strategy.ConnProtocol.HTTP     // Catch:{ Exception -> 0x00bf }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r5 = r4
            anet.channel.strategy.IPConnStrategy r5 = anet.channel.strategy.IPConnStrategy.a(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00bf }
            r12.add(r5)     // Catch:{ Exception -> 0x00bf }
            r6 = 443(0x1bb, float:6.21E-43)
            anet.channel.strategy.ConnProtocol r7 = anet.channel.strategy.ConnProtocol.HTTPS     // Catch:{ Exception -> 0x00bf }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r5 = r4
            anet.channel.strategy.IPConnStrategy r5 = anet.channel.strategy.IPConnStrategy.a(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00bf }
            r12.add(r5)     // Catch:{ Exception -> 0x00bf }
            anet.channel.strategy.a r5 = r13.f1350c     // Catch:{ Exception -> 0x00bf }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<anet.channel.strategy.IPConnStrategy>> r5 = r5.f1346a     // Catch:{ Exception -> 0x00bf }
            java.lang.String r6 = r13.f1348a     // Catch:{ Exception -> 0x00bf }
            r5.put(r6, r12)     // Catch:{ Exception -> 0x00bf }
            boolean r5 = anet.channel.util.ALog.isPrintLog(r3)     // Catch:{ Exception -> 0x00bf }
            if (r5 == 0) goto L_0x009e
            java.lang.String r5 = "awcn.LocalDnsStrategyTable"
            java.lang.String r6 = "resolve ip by local dns"
            r7 = 6
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00bf }
            java.lang.String r8 = "host"
            r7[r2] = r8     // Catch:{ Exception -> 0x00bf }
            java.lang.String r8 = r13.f1348a     // Catch:{ Exception -> 0x00bf }
            r7[r3] = r8     // Catch:{ Exception -> 0x00bf }
            java.lang.String r8 = "ip"
            r7[r0] = r8     // Catch:{ Exception -> 0x00bf }
            r8 = 3
            r7[r8] = r4     // Catch:{ Exception -> 0x00bf }
            r4 = 4
            java.lang.String r8 = "list"
            r7[r4] = r8     // Catch:{ Exception -> 0x00bf }
            r4 = 5
            r7[r4] = r12     // Catch:{ Exception -> 0x00bf }
            anet.channel.util.ALog.d(r5, r6, r1, r7)     // Catch:{ Exception -> 0x00bf }
        L_0x009e:
            anet.channel.strategy.a r0 = r13.f1350c
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r0.f1347b
            monitor-enter(r0)
            anet.channel.strategy.a r1 = r13.f1350c     // Catch:{ all -> 0x00ba }
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r1.f1347b     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = r13.f1348a     // Catch:{ all -> 0x00ba }
            r1.remove(r2)     // Catch:{ all -> 0x00ba }
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            java.lang.Object r1 = r13.f1349b
            monitor-enter(r1)
            java.lang.Object r0 = r13.f1349b     // Catch:{ all -> 0x00b7 }
            r0.notifyAll()     // Catch:{ all -> 0x00b7 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            goto L_0x00f9
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b7 }
            throw r0
        L_0x00ba:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ba }
            throw r1
        L_0x00bd:
            r0 = move-exception
            goto L_0x0100
        L_0x00bf:
            boolean r4 = anet.channel.util.ALog.isPrintLog(r3)     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x00d6
            java.lang.String r4 = "awcn.LocalDnsStrategyTable"
            java.lang.String r5 = "resolve ip by local dns failed"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x00bd }
            java.lang.String r6 = "host"
            r0[r2] = r6     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = r13.f1348a     // Catch:{ all -> 0x00bd }
            r0[r3] = r2     // Catch:{ all -> 0x00bd }
            anet.channel.util.ALog.d(r4, r5, r1, r0)     // Catch:{ all -> 0x00bd }
        L_0x00d6:
            anet.channel.strategy.a r0 = r13.f1350c     // Catch:{ all -> 0x00bd }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<anet.channel.strategy.IPConnStrategy>> r0 = r0.f1346a     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r13.f1348a     // Catch:{ all -> 0x00bd }
            java.util.List r2 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x00bd }
            r0.put(r1, r2)     // Catch:{ all -> 0x00bd }
            anet.channel.strategy.a r0 = r13.f1350c
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r0.f1347b
            monitor-enter(r0)
            anet.channel.strategy.a r1 = r13.f1350c     // Catch:{ all -> 0x00fd }
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r1.f1347b     // Catch:{ all -> 0x00fd }
            java.lang.String r2 = r13.f1348a     // Catch:{ all -> 0x00fd }
            r1.remove(r2)     // Catch:{ all -> 0x00fd }
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            java.lang.Object r1 = r13.f1349b
            monitor-enter(r1)
            java.lang.Object r0 = r13.f1349b     // Catch:{ all -> 0x00fa }
            r0.notifyAll()     // Catch:{ all -> 0x00fa }
            monitor-exit(r1)     // Catch:{ all -> 0x00fa }
        L_0x00f9:
            return
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fa }
            throw r0
        L_0x00fd:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fd }
            throw r1
        L_0x0100:
            anet.channel.strategy.a r1 = r13.f1350c
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r1.f1347b
            monitor-enter(r1)
            anet.channel.strategy.a r2 = r13.f1350c     // Catch:{ all -> 0x011c }
            java.util.HashMap<java.lang.String, java.lang.Object> r2 = r2.f1347b     // Catch:{ all -> 0x011c }
            java.lang.String r3 = r13.f1348a     // Catch:{ all -> 0x011c }
            r2.remove(r3)     // Catch:{ all -> 0x011c }
            monitor-exit(r1)     // Catch:{ all -> 0x011c }
            java.lang.Object r2 = r13.f1349b
            monitor-enter(r2)
            java.lang.Object r1 = r13.f1349b     // Catch:{ all -> 0x0119 }
            r1.notifyAll()     // Catch:{ all -> 0x0119 }
            monitor-exit(r2)     // Catch:{ all -> 0x0119 }
            throw r0
        L_0x0119:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0119 }
            throw r0
        L_0x011c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x011c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.b.run():void");
    }

    b(a aVar, String str, Object obj) {
        this.f1350c = aVar;
        this.f1348a = str;
        this.f1349b = obj;
    }
}
