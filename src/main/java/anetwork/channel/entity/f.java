package anetwork.channel.entity;

import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.ParcelableNetworkListener;

public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DefaultFinishEvent f1544a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ParcelableNetworkListener f1545b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f1546c;

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e5 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b A[Catch:{ Throwable -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b2 A[Catch:{ Throwable -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4 A[Catch:{ Exception -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c5 A[Catch:{ Exception -> 0x00e5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            anetwork.channel.aidl.DefaultFinishEvent r0 = r9.f1544a
            r1 = 0
            if (r0 == 0) goto L_0x000a
            anetwork.channel.aidl.DefaultFinishEvent r0 = r9.f1544a
            r0.setContext(r1)
        L_0x000a:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.aidl.DefaultFinishEvent r0 = r9.f1544a     // Catch:{ Throwable -> 0x00fd }
            anet.channel.statist.RequestStatistic r0 = r0.rs     // Catch:{ Throwable -> 0x00fd }
            if (r0 == 0) goto L_0x002e
            long r4 = r0.rspEnd     // Catch:{ Throwable -> 0x00fd }
            r6 = 0
            long r4 = r2 - r4
            r0.lastProcessTime = r4     // Catch:{ Throwable -> 0x00fd }
            long r4 = r0.retryCostTime     // Catch:{ Throwable -> 0x00fd }
            long r6 = r0.start     // Catch:{ Throwable -> 0x00fd }
            r8 = 0
            long r6 = r2 - r6
            long r4 = r4 + r6
            r0.oneWayTime = r4     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.aidl.DefaultFinishEvent r4 = r9.f1544a     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.statist.StatisticData r4 = r4.getStatisticData()     // Catch:{ Throwable -> 0x00fd }
            r4.filledBy(r0)     // Catch:{ Throwable -> 0x00fd }
        L_0x002e:
            anetwork.channel.aidl.ParcelableNetworkListener r4 = r9.f1545b     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.aidl.DefaultFinishEvent r5 = r9.f1544a     // Catch:{ Throwable -> 0x00fd }
            r4.onFinished(r5)     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.entity.c r4 = r9.f1546c     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.aidl.adapter.ParcelableInputStreamImpl r4 = r4.f1532c     // Catch:{ Throwable -> 0x00fd }
            if (r4 == 0) goto L_0x0046
            anetwork.channel.entity.c r4 = r9.f1546c     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.aidl.adapter.ParcelableInputStreamImpl r4 = r4.f1532c     // Catch:{ Throwable -> 0x00fd }
            r4.writeEnd()     // Catch:{ Throwable -> 0x00fd }
        L_0x0046:
            if (r0 == 0) goto L_0x00fc
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00fd }
            r6 = 0
            long r4 = r4 - r2
            r0.callbackTime = r4     // Catch:{ Throwable -> 0x00fd }
            int r2 = r0.ret     // Catch:{ Throwable -> 0x00fd }
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x0074
            int r2 = r0.statusCode     // Catch:{ Throwable -> 0x00fd }
            if (r2 > 0) goto L_0x005b
            goto L_0x0074
        L_0x005b:
            r2 = 2
            boolean r2 = anet.channel.util.ALog.isPrintLog(r2)     // Catch:{ Throwable -> 0x00fd }
            if (r2 == 0) goto L_0x0085
            java.lang.String r2 = "anet.Repeater"
            java.lang.String r5 = r0.toString()     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.entity.c r6 = r9.f1546c     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r6 = r6.f1531b     // Catch:{ Throwable -> 0x00fd }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x00fd }
            anet.channel.util.ALog.i(r2, r5, r6, r7)     // Catch:{ Throwable -> 0x00fd }
            goto L_0x0085
        L_0x0074:
            java.lang.String r2 = "anet.Repeater"
            java.lang.String r5 = r0.toString()     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.entity.c r6 = r9.f1546c     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r6 = r6.f1531b     // Catch:{ Throwable -> 0x00fd }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x00fd }
            anet.channel.util.ALog.e(r2, r5, r6, r7)     // Catch:{ Throwable -> 0x00fd }
        L_0x0085:
            java.util.concurrent.CopyOnWriteArrayList r2 = anet.channel.GlobalAppRuntimeInfo.getBucketInfo()     // Catch:{ Throwable -> 0x00fd }
            if (r2 == 0) goto L_0x00a5
            int r5 = r2.size()     // Catch:{ Throwable -> 0x00fd }
        L_0x008f:
            int r6 = r5 + -1
            if (r3 >= r6) goto L_0x00a5
            java.lang.Object r6 = r2.get(r3)     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x00fd }
            int r7 = r3 + 1
            java.lang.Object r7 = r2.get(r7)     // Catch:{ Throwable -> 0x00fd }
            r0.putExtra(r6, r7)     // Catch:{ Throwable -> 0x00fd }
            int r3 = r3 + 2
            goto L_0x008f
        L_0x00a5:
            anet.channel.appmonitor.IAppMonitor r2 = anet.channel.appmonitor.AppMonitor.getInstance()     // Catch:{ Throwable -> 0x00fd }
            r2.commitStat(r0)     // Catch:{ Throwable -> 0x00fd }
            boolean r2 = anetwork.channel.config.NetworkConfigCenter.isRequestInMonitorList(r0)     // Catch:{ Throwable -> 0x00fd }
            if (r2 == 0) goto L_0x00be
            anet.channel.statist.RequestMonitor r2 = new anet.channel.statist.RequestMonitor     // Catch:{ Throwable -> 0x00fd }
            r2.<init>(r0)     // Catch:{ Throwable -> 0x00fd }
            anet.channel.appmonitor.IAppMonitor r3 = anet.channel.appmonitor.AppMonitor.getInstance()     // Catch:{ Throwable -> 0x00fd }
            r3.commitStat(r2)     // Catch:{ Throwable -> 0x00fd }
        L_0x00be:
            java.lang.String r2 = r0.ip     // Catch:{ Exception -> 0x00e5 }
            org.json.JSONObject r3 = r0.extra     // Catch:{ Exception -> 0x00e5 }
            if (r3 != 0) goto L_0x00c5
            goto L_0x00cd
        L_0x00c5:
            org.json.JSONObject r1 = r0.extra     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r3 = "firstIp"
            java.lang.String r1 = r1.optString(r3)     // Catch:{ Exception -> 0x00e5 }
        L_0x00cd:
            boolean r2 = anet.channel.strategy.utils.c.b(r2)     // Catch:{ Exception -> 0x00e5 }
            if (r2 != 0) goto L_0x00d9
            boolean r1 = anet.channel.strategy.utils.c.b(r1)     // Catch:{ Exception -> 0x00e5 }
            if (r1 == 0) goto L_0x00e5
        L_0x00d9:
            anet.channel.statist.RequestMonitor r1 = new anet.channel.statist.RequestMonitor     // Catch:{ Exception -> 0x00e5 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00e5 }
            anet.channel.appmonitor.IAppMonitor r0 = anet.channel.appmonitor.AppMonitor.getInstance()     // Catch:{ Exception -> 0x00e5 }
            r0.commitStat(r1)     // Catch:{ Exception -> 0x00e5 }
        L_0x00e5:
            anetwork.channel.stat.INetworkStat r0 = anetwork.channel.stat.NetworkStat.getNetworkStat()     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.entity.c r1 = r9.f1546c     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.entity.g r1 = r1.f1534e     // Catch:{ Throwable -> 0x00fd }
            java.lang.String r1 = r1.g()     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.aidl.DefaultFinishEvent r2 = r9.f1544a     // Catch:{ Throwable -> 0x00fd }
            anetwork.channel.statist.StatisticData r2 = r2.getStatisticData()     // Catch:{ Throwable -> 0x00fd }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00fd }
        L_0x00fc:
            return
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: anetwork.channel.entity.f.run():void");
    }

    f(c cVar, DefaultFinishEvent defaultFinishEvent, ParcelableNetworkListener parcelableNetworkListener) {
        this.f1546c = cVar;
        this.f1544a = defaultFinishEvent;
        this.f1545b = parcelableNetworkListener;
    }
}
