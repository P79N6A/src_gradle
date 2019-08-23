package anet.channel.appmonitor;

import android.text.TextUtils;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import anetwork.channel.config.NetworkConfigCenter;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class a implements IAppMonitor {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1160a;

    /* renamed from: b  reason: collision with root package name */
    private static Map<Class<?>, List<Field>> f1161b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static Map<Class<?>, List<Field>> f1162c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static Map<Field, String> f1163d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static Random f1164e = new Random();

    /* renamed from: f  reason: collision with root package name */
    private static Set<Class<?>> f1165f = Collections.newSetFromMap(new ConcurrentHashMap());

    @Deprecated
    public void register() {
    }

    @Deprecated
    public void register(Class<?> cls) {
    }

    public a() {
        try {
            Class.forName("com.alibaba.mtl.appmonitor.AppMonitor");
            f1160a = true;
        } catch (Exception unused) {
            f1160a = false;
        }
    }

    public void commitAlarm(AlarmObject alarmObject) {
        if (f1160a && alarmObject != null && !TextUtils.isEmpty(alarmObject.module) && !TextUtils.isEmpty(alarmObject.modulePoint)) {
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.DefaultAppMonitor", "commit alarm: " + alarmObject, null, new Object[0]);
            }
            if (!alarmObject.isSuccess) {
                AppMonitor.Alarm.commitFail(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg), StringUtils.stringNull2Empty(alarmObject.errorCode), StringUtils.stringNull2Empty(alarmObject.errorMsg));
            } else {
                AppMonitor.Alarm.commitSuccess(alarmObject.module, alarmObject.modulePoint, StringUtils.stringNull2Empty(alarmObject.arg));
            }
        }
    }

    public void commitCount(CountObject countObject) {
        if (f1160a && countObject != null && !TextUtils.isEmpty(countObject.module) && !TextUtils.isEmpty(countObject.modulePoint)) {
            if (ALog.isPrintLog(2)) {
                ALog.i("awcn.DefaultAppMonitor", "commit count: " + countObject, null, new Object[0]);
            }
            AppMonitor.Counter.commit(countObject.module, countObject.modulePoint, StringUtils.stringNull2Empty(countObject.arg), countObject.value);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(java.lang.Class<?> r17) {
        /*
            r16 = this;
            r0 = r17
            monitor-enter(r16)
            if (r0 == 0) goto L_0x00f8
            boolean r1 = f1160a     // Catch:{ all -> 0x00f5 }
            if (r1 != 0) goto L_0x000b
            goto L_0x00f8
        L_0x000b:
            r1 = 0
            java.util.Set<java.lang.Class<?>> r2 = f1165f     // Catch:{ Exception -> 0x00e8 }
            boolean r2 = r2.contains(r0)     // Catch:{ Exception -> 0x00e8 }
            if (r2 == 0) goto L_0x0016
            monitor-exit(r16)
            return
        L_0x0016:
            java.lang.Class<anet.channel.statist.Monitor> r2 = anet.channel.statist.Monitor.class
            java.lang.annotation.Annotation r2 = r0.getAnnotation(r2)     // Catch:{ Exception -> 0x00e8 }
            anet.channel.statist.Monitor r2 = (anet.channel.statist.Monitor) r2     // Catch:{ Exception -> 0x00e8 }
            if (r2 != 0) goto L_0x0022
            monitor-exit(r16)
            return
        L_0x0022:
            java.lang.reflect.Field[] r3 = r17.getFields()     // Catch:{ Exception -> 0x00e8 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e8 }
            r4.<init>()     // Catch:{ Exception -> 0x00e8 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e8 }
            r5.<init>()     // Catch:{ Exception -> 0x00e8 }
            com.alibaba.mtl.appmonitor.model.DimensionSet r6 = com.alibaba.mtl.appmonitor.model.DimensionSet.create()     // Catch:{ Exception -> 0x00e8 }
            com.alibaba.mtl.appmonitor.model.MeasureSet r7 = com.alibaba.mtl.appmonitor.model.MeasureSet.create()     // Catch:{ Exception -> 0x00e8 }
            r8 = 0
        L_0x0039:
            int r9 = r3.length     // Catch:{ Exception -> 0x00e8 }
            if (r8 >= r9) goto L_0x00cc
            r9 = r3[r8]     // Catch:{ Exception -> 0x00e8 }
            java.lang.Class<anet.channel.statist.Dimension> r10 = anet.channel.statist.Dimension.class
            java.lang.annotation.Annotation r10 = r9.getAnnotation(r10)     // Catch:{ Exception -> 0x00e8 }
            anet.channel.statist.Dimension r10 = (anet.channel.statist.Dimension) r10     // Catch:{ Exception -> 0x00e8 }
            r11 = 1
            if (r10 == 0) goto L_0x006d
            r9.setAccessible(r11)     // Catch:{ Exception -> 0x00e8 }
            r4.add(r9)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r11 = r10.name()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r12 = ""
            boolean r11 = r11.equals(r12)     // Catch:{ Exception -> 0x00e8 }
            if (r11 == 0) goto L_0x0060
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x00e8 }
            goto L_0x0064
        L_0x0060:
            java.lang.String r10 = r10.name()     // Catch:{ Exception -> 0x00e8 }
        L_0x0064:
            java.util.Map<java.lang.reflect.Field, java.lang.String> r11 = f1163d     // Catch:{ Exception -> 0x00e8 }
            r11.put(r9, r10)     // Catch:{ Exception -> 0x00e8 }
            r6.addDimension(r10)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00c8
        L_0x006d:
            java.lang.Class<anet.channel.statist.Measure> r10 = anet.channel.statist.Measure.class
            java.lang.annotation.Annotation r10 = r9.getAnnotation(r10)     // Catch:{ Exception -> 0x00e8 }
            anet.channel.statist.Measure r10 = (anet.channel.statist.Measure) r10     // Catch:{ Exception -> 0x00e8 }
            if (r10 == 0) goto L_0x00c8
            r9.setAccessible(r11)     // Catch:{ Exception -> 0x00e8 }
            r5.add(r9)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r11 = r10.name()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r12 = ""
            boolean r11 = r11.equals(r12)     // Catch:{ Exception -> 0x00e8 }
            if (r11 == 0) goto L_0x008e
            java.lang.String r11 = r9.getName()     // Catch:{ Exception -> 0x00e8 }
            goto L_0x0092
        L_0x008e:
            java.lang.String r11 = r10.name()     // Catch:{ Exception -> 0x00e8 }
        L_0x0092:
            java.util.Map<java.lang.reflect.Field, java.lang.String> r12 = f1163d     // Catch:{ Exception -> 0x00e8 }
            r12.put(r9, r11)     // Catch:{ Exception -> 0x00e8 }
            double r12 = r10.max()     // Catch:{ Exception -> 0x00e8 }
            r14 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x00c5
            com.alibaba.mtl.appmonitor.model.Measure r9 = new com.alibaba.mtl.appmonitor.model.Measure     // Catch:{ Exception -> 0x00e8 }
            double r12 = r10.constantValue()     // Catch:{ Exception -> 0x00e8 }
            java.lang.Double r12 = java.lang.Double.valueOf(r12)     // Catch:{ Exception -> 0x00e8 }
            double r13 = r10.min()     // Catch:{ Exception -> 0x00e8 }
            java.lang.Double r13 = java.lang.Double.valueOf(r13)     // Catch:{ Exception -> 0x00e8 }
            double r14 = r10.max()     // Catch:{ Exception -> 0x00e8 }
            java.lang.Double r10 = java.lang.Double.valueOf(r14)     // Catch:{ Exception -> 0x00e8 }
            r9.<init>(r11, r12, r13, r10)     // Catch:{ Exception -> 0x00e8 }
            r7.addMeasure(r9)     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00c8
        L_0x00c5:
            r7.addMeasure(r11)     // Catch:{ Exception -> 0x00e8 }
        L_0x00c8:
            int r8 = r8 + 1
            goto L_0x0039
        L_0x00cc:
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Field>> r3 = f1161b     // Catch:{ Exception -> 0x00e8 }
            r3.put(r0, r4)     // Catch:{ Exception -> 0x00e8 }
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Field>> r3 = f1162c     // Catch:{ Exception -> 0x00e8 }
            r3.put(r0, r5)     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r3 = r2.module()     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r2 = r2.monitorPoint()     // Catch:{ Exception -> 0x00e8 }
            com.alibaba.mtl.appmonitor.AppMonitor.register(r3, r2, r7, r6)     // Catch:{ Exception -> 0x00e8 }
            java.util.Set<java.lang.Class<?>> r2 = f1165f     // Catch:{ Exception -> 0x00e8 }
            r2.add(r0)     // Catch:{ Exception -> 0x00e8 }
            monitor-exit(r16)
            return
        L_0x00e8:
            r0 = move-exception
            java.lang.String r2 = "awcn.DefaultAppMonitor"
            java.lang.String r3 = "register fail"
            r4 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00f5 }
            anet.channel.util.ALog.e(r2, r3, r4, r0, r1)     // Catch:{ all -> 0x00f5 }
            monitor-exit(r16)
            return
        L_0x00f5:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        L_0x00f8:
            monitor-exit(r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.appmonitor.a.a(java.lang.Class):void");
    }

    public void commitStat(StatObject statObject) {
        HashMap hashMap;
        String str;
        if (f1160a && statObject != null) {
            Class<?> cls = statObject.getClass();
            Monitor monitor = (Monitor) cls.getAnnotation(Monitor.class);
            if (monitor != null) {
                if (!f1165f.contains(cls)) {
                    a(cls);
                }
                if (statObject.beforeCommit()) {
                    if (monitor.monitorPoint().equals("network")) {
                        int requestStatisticSampleRate = NetworkConfigCenter.getRequestStatisticSampleRate();
                        if (requestStatisticSampleRate > 10000 || requestStatisticSampleRate < 0) {
                            requestStatisticSampleRate = 10000;
                        }
                        if (requestStatisticSampleRate != 10000 && f1164e.nextInt(10000) >= requestStatisticSampleRate) {
                            return;
                        }
                    }
                    try {
                        DimensionValueSet create = DimensionValueSet.create();
                        MeasureValueSet create2 = MeasureValueSet.create();
                        List<Field> list = f1161b.get(cls);
                        if (ALog.isPrintLog(1)) {
                            hashMap = new HashMap();
                        } else {
                            hashMap = null;
                        }
                        if (list != null) {
                            for (Field field : list) {
                                Object obj = field.get(statObject);
                                String str2 = f1163d.get(field);
                                if (obj == null) {
                                    str = "";
                                } else {
                                    str = obj.toString();
                                }
                                create.setValue(str2, str);
                            }
                            for (Field field2 : f1162c.get(cls)) {
                                Double valueOf = Double.valueOf(field2.getDouble(statObject));
                                create2.setValue(f1163d.get(field2), valueOf.doubleValue());
                                if (hashMap != null) {
                                    hashMap.put(f1163d.get(field2), valueOf);
                                }
                            }
                        }
                        AppMonitor.Stat.commit(monitor.module(), monitor.monitorPoint(), create, create2);
                        if (ALog.isPrintLog(1)) {
                            ALog.d("awcn.DefaultAppMonitor", "commit stat: " + monitor.monitorPoint(), null, "\nDimensions", create.getMap().toString(), "\nMeasures", hashMap.toString());
                        }
                    } catch (Throwable th) {
                        ALog.e("awcn.DefaultAppMonitor", "commit monitor point failed", null, th, new Object[0]);
                    }
                }
            }
        }
    }
}
