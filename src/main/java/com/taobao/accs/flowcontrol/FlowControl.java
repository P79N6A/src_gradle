package com.taobao.accs.flowcontrol;

import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FlowControl {

    /* renamed from: a  reason: collision with root package name */
    private Context f78965a;

    /* renamed from: b  reason: collision with root package name */
    private FlowCtrlInfoHolder f78966b;

    public static class FlowControlInfo implements Serializable {
        private static final long serialVersionUID = -2259991484877844919L;
        public String bizId;
        public long delayTime;
        public long expireTime;
        public String serviceId;
        public long startTime;
        public int status;

        public boolean isExpired() {
            if (System.currentTimeMillis() - (this.startTime + this.expireTime) > 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("flow ctrl serviceId:");
            stringBuffer.append(this.serviceId);
            stringBuffer.append(" bizId:");
            stringBuffer.append(this.bizId);
            stringBuffer.append(" status:");
            stringBuffer.append(this.status);
            stringBuffer.append(" delayTime:");
            stringBuffer.append(this.delayTime);
            stringBuffer.append(" startTime:");
            stringBuffer.append(this.startTime);
            stringBuffer.append(" expireTime:");
            stringBuffer.append(this.expireTime);
            return stringBuffer.toString();
        }

        public FlowControlInfo(String str, String str2, int i, long j, long j2, long j3) {
            this.serviceId = str;
            this.bizId = str2;
            this.status = i;
            this.delayTime = j;
            long j4 = 0;
            this.expireTime = j2 <= 0 ? 0 : j2;
            this.startTime = j3 > 0 ? j3 : j4;
        }
    }

    public static class FlowCtrlInfoHolder implements Serializable {
        private static final long serialVersionUID = 6307563052429742524L;
        Map<String, FlowControlInfo> flowCtrlMap;

        public FlowControlInfo get(String str, String str2) {
            if (this.flowCtrlMap == null) {
                return null;
            }
            if (!TextUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            return this.flowCtrlMap.get(str);
        }

        public void put(String str, String str2, FlowControlInfo flowControlInfo) {
            if (!TextUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            if (this.flowCtrlMap == null) {
                this.flowCtrlMap = new HashMap();
            }
            this.flowCtrlMap.put(str, flowControlInfo);
        }
    }

    private void a() {
        if (this.f78966b != null && this.f78966b.flowCtrlMap != null) {
            synchronized (this) {
                Iterator<Map.Entry<String, FlowControlInfo>> it2 = this.f78966b.flowCtrlMap.entrySet().iterator();
                while (it2.hasNext()) {
                    if (((FlowControlInfo) it2.next().getValue()).isExpired()) {
                        it2.remove();
                    }
                }
            }
        }
    }

    public FlowControl(Context context) {
        this.f78965a = context;
    }

    private boolean a(long j, long j2) {
        if (j != 0 && j2 > 0) {
            return true;
        }
        ALog.e("FlowControl", "error flow ctrl info", new Object[0]);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            com.taobao.accs.flowcontrol.FlowControl$FlowCtrlInfoHolder r0 = r13.f78966b
            r1 = 0
            if (r0 == 0) goto L_0x00df
            com.taobao.accs.flowcontrol.FlowControl$FlowCtrlInfoHolder r0 = r13.f78966b
            java.util.Map<java.lang.String, com.taobao.accs.flowcontrol.FlowControl$FlowControlInfo> r0 = r0.flowCtrlMap
            if (r0 == 0) goto L_0x00df
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L_0x0014
            goto L_0x00df
        L_0x0014:
            monitor-enter(r13)
            com.taobao.accs.flowcontrol.FlowControl$FlowCtrlInfoHolder r0 = r13.f78966b     // Catch:{ all -> 0x00dc }
            java.lang.String r3 = "ALL"
            r4 = 0
            com.taobao.accs.flowcontrol.FlowControl$FlowControlInfo r0 = r0.get(r3, r4)     // Catch:{ all -> 0x00dc }
            com.taobao.accs.flowcontrol.FlowControl$FlowCtrlInfoHolder r3 = r13.f78966b     // Catch:{ all -> 0x00dc }
            java.lang.String r5 = "ALL_BRUSH"
            com.taobao.accs.flowcontrol.FlowControl$FlowControlInfo r3 = r3.get(r5, r4)     // Catch:{ all -> 0x00dc }
            com.taobao.accs.flowcontrol.FlowControl$FlowCtrlInfoHolder r5 = r13.f78966b     // Catch:{ all -> 0x00dc }
            com.taobao.accs.flowcontrol.FlowControl$FlowControlInfo r4 = r5.get(r14, r4)     // Catch:{ all -> 0x00dc }
            com.taobao.accs.flowcontrol.FlowControl$FlowCtrlInfoHolder r5 = r13.f78966b     // Catch:{ all -> 0x00dc }
            com.taobao.accs.flowcontrol.FlowControl$FlowControlInfo r5 = r5.get(r14, r15)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x003e
            boolean r6 = r0.isExpired()     // Catch:{ all -> 0x00dc }
            if (r6 == 0) goto L_0x003b
            goto L_0x003e
        L_0x003b:
            long r6 = r0.delayTime     // Catch:{ all -> 0x00dc }
            goto L_0x003f
        L_0x003e:
            r6 = r1
        L_0x003f:
            if (r3 == 0) goto L_0x004b
            boolean r8 = r3.isExpired()     // Catch:{ all -> 0x00dc }
            if (r8 == 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            long r8 = r3.delayTime     // Catch:{ all -> 0x00dc }
            goto L_0x004c
        L_0x004b:
            r8 = r1
        L_0x004c:
            if (r4 == 0) goto L_0x0058
            boolean r3 = r4.isExpired()     // Catch:{ all -> 0x00dc }
            if (r3 == 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            long r3 = r4.delayTime     // Catch:{ all -> 0x00dc }
            goto L_0x0059
        L_0x0058:
            r3 = r1
        L_0x0059:
            if (r5 == 0) goto L_0x0064
            boolean r10 = r5.isExpired()     // Catch:{ all -> 0x00dc }
            if (r10 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            long r1 = r5.delayTime     // Catch:{ all -> 0x00dc }
        L_0x0064:
            r10 = -1
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0088
            int r12 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x0088
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0073
            goto L_0x0088
        L_0x0073:
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x007a
            r8 = -1000(0xfffffffffffffc18, double:NaN)
            goto L_0x0089
        L_0x007a:
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x0080
            r8 = r6
            goto L_0x0081
        L_0x0080:
            r8 = r1
        L_0x0081:
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 <= 0) goto L_0x0086
            goto L_0x0089
        L_0x0086:
            r8 = r3
            goto L_0x0089
        L_0x0088:
            r8 = r10
        L_0x0089:
            if (r5 == 0) goto L_0x0091
            boolean r5 = r5.isExpired()     // Catch:{ all -> 0x00dc }
            if (r5 != 0) goto L_0x0099
        L_0x0091:
            if (r0 == 0) goto L_0x009c
            boolean r0 = r0.isExpired()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x009c
        L_0x0099:
            r13.a()     // Catch:{ all -> 0x00dc }
        L_0x009c:
            monitor-exit(r13)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "FlowControl"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r10 = "getFlowCtrlDelay service "
            r5.<init>(r10)
            r5.append(r14)
            java.lang.String r14 = " biz "
            r5.append(r14)
            r5.append(r15)
            java.lang.String r14 = " result:"
            r5.append(r14)
            r5.append(r8)
            java.lang.String r14 = " global:"
            r5.append(r14)
            r5.append(r6)
            java.lang.String r14 = " serviceDelay:"
            r5.append(r14)
            r5.append(r3)
            java.lang.String r14 = " bidDelay:"
            r5.append(r14)
            r5.append(r1)
            java.lang.String r14 = r5.toString()
            r15 = 0
            java.lang.Object[] r15 = new java.lang.Object[r15]
            com.taobao.accs.utl.ALog.e(r0, r14, r15)
            return r8
        L_0x00dc:
            r14 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00dc }
            throw r14
        L_0x00df:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.flowcontrol.FlowControl.a(java.lang.String, java.lang.String):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(java.util.Map<java.lang.Integer, java.lang.String> r22, java.lang.String r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = 422(0x1a6, float:5.91E-43)
            r3 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0138
            com.taobao.accs.base.TaoBaseService$ExtHeaderType r6 = com.taobao.accs.base.TaoBaseService.ExtHeaderType.TYPE_STATUS     // Catch:{ Throwable -> 0x012a }
            int r6 = r6.ordinal()     // Catch:{ Throwable -> 0x012a }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x012a }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ Throwable -> 0x012a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Throwable -> 0x012a }
            com.taobao.accs.base.TaoBaseService$ExtHeaderType r7 = com.taobao.accs.base.TaoBaseService.ExtHeaderType.TYPE_DELAY     // Catch:{ Throwable -> 0x012a }
            int r7 = r7.ordinal()     // Catch:{ Throwable -> 0x012a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Throwable -> 0x012a }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ Throwable -> 0x012a }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x012a }
            com.taobao.accs.base.TaoBaseService$ExtHeaderType r8 = com.taobao.accs.base.TaoBaseService.ExtHeaderType.TYPE_EXPIRE     // Catch:{ Throwable -> 0x012a }
            int r8 = r8.ordinal()     // Catch:{ Throwable -> 0x012a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x012a }
            java.lang.Object r8 = r0.get(r8)     // Catch:{ Throwable -> 0x012a }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Throwable -> 0x012a }
            com.taobao.accs.base.TaoBaseService$ExtHeaderType r9 = com.taobao.accs.base.TaoBaseService.ExtHeaderType.TYPE_BUSINESS     // Catch:{ Throwable -> 0x012a }
            int r9 = r9.ordinal()     // Catch:{ Throwable -> 0x012a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x012a }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ Throwable -> 0x012a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x012a }
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x012a }
            if (r9 == 0) goto L_0x0053
            r6 = 0
            goto L_0x005b
        L_0x0053:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x012a }
            int r6 = r6.intValue()     // Catch:{ Throwable -> 0x012a }
        L_0x005b:
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0126 }
            if (r9 == 0) goto L_0x0063
            r13 = r3
            goto L_0x006c
        L_0x0063:
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Throwable -> 0x0126 }
            long r9 = r7.longValue()     // Catch:{ Throwable -> 0x0126 }
            r13 = r9
        L_0x006c:
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x0122 }
            if (r7 == 0) goto L_0x0074
            r7 = r3
            goto L_0x007c
        L_0x0074:
            java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch:{ Throwable -> 0x0122 }
            long r7 = r7.longValue()     // Catch:{ Throwable -> 0x0122 }
        L_0x007c:
            r9 = 421(0x1a5, float:5.9E-43)
            r10 = 420(0x1a4, float:5.89E-43)
            if (r6 == r10) goto L_0x0086
            if (r6 == r9) goto L_0x0086
            if (r6 != r2) goto L_0x008c
        L_0x0086:
            boolean r11 = r1.a((long) r13, (long) r7)     // Catch:{ Throwable -> 0x0122 }
            if (r11 != 0) goto L_0x008d
        L_0x008c:
            return r5
        L_0x008d:
            monitor-enter(r21)     // Catch:{ Throwable -> 0x0122 }
            com.taobao.accs.flowcontrol.FlowControl$FlowCtrlInfoHolder r11 = r1.f78966b     // Catch:{ all -> 0x0119 }
            if (r11 != 0) goto L_0x0099
            com.taobao.accs.flowcontrol.FlowControl$FlowCtrlInfoHolder r11 = new com.taobao.accs.flowcontrol.FlowControl$FlowCtrlInfoHolder     // Catch:{ all -> 0x0119 }
            r11.<init>()     // Catch:{ all -> 0x0119 }
            r1.f78966b = r11     // Catch:{ all -> 0x0119 }
        L_0x0099:
            r11 = 0
            if (r6 != r10) goto L_0x00b8
            com.taobao.accs.flowcontrol.FlowControl$FlowControlInfo r0 = new com.taobao.accs.flowcontrol.FlowControl$FlowControlInfo     // Catch:{ all -> 0x0119 }
            java.lang.String r10 = "ALL"
            java.lang.String r11 = ""
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0119 }
            r9 = r0
            r12 = r6
            r19 = r13
            r15 = r7
            r9.<init>(r10, r11, r12, r13, r15, r17)     // Catch:{ all -> 0x0120 }
            com.taobao.accs.flowcontrol.FlowControl$FlowCtrlInfoHolder r7 = r1.f78966b     // Catch:{ all -> 0x0120 }
            java.lang.String r8 = "ALL"
            java.lang.String r9 = ""
            r7.put(r8, r9, r0)     // Catch:{ all -> 0x0120 }
            goto L_0x00fc
        L_0x00b8:
            r19 = r13
            if (r6 != r2) goto L_0x00d8
            com.taobao.accs.flowcontrol.FlowControl$FlowControlInfo r0 = new com.taobao.accs.flowcontrol.FlowControl$FlowControlInfo     // Catch:{ all -> 0x0120 }
            java.lang.String r10 = "ALL_BRUSH"
            java.lang.String r11 = ""
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0120 }
            r9 = r0
            r12 = r6
            r13 = r19
            r15 = r7
            r9.<init>(r10, r11, r12, r13, r15, r17)     // Catch:{ all -> 0x0120 }
            com.taobao.accs.flowcontrol.FlowControl$FlowCtrlInfoHolder r7 = r1.f78966b     // Catch:{ all -> 0x0120 }
            java.lang.String r8 = "ALL_BRUSH"
            java.lang.String r9 = ""
            r7.put(r8, r9, r0)     // Catch:{ all -> 0x0120 }
            goto L_0x00fc
        L_0x00d8:
            if (r6 != r9) goto L_0x00fb
            boolean r9 = android.text.TextUtils.isEmpty(r23)     // Catch:{ all -> 0x0120 }
            if (r9 != 0) goto L_0x00fb
            com.taobao.accs.flowcontrol.FlowControl$FlowControlInfo r15 = new com.taobao.accs.flowcontrol.FlowControl$FlowControlInfo     // Catch:{ all -> 0x0120 }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0120 }
            r9 = r15
            r10 = r23
            r11 = r0
            r12 = r6
            r13 = r19
            r2 = r15
            r15 = r7
            r9.<init>(r10, r11, r12, r13, r15, r17)     // Catch:{ all -> 0x0120 }
            com.taobao.accs.flowcontrol.FlowControl$FlowCtrlInfoHolder r7 = r1.f78966b     // Catch:{ all -> 0x0120 }
            r8 = r23
            r7.put(r8, r0, r2)     // Catch:{ all -> 0x0120 }
            r0 = r2
            goto L_0x00fc
        L_0x00fb:
            r0 = r11
        L_0x00fc:
            if (r0 == 0) goto L_0x0117
            java.lang.String r2 = "FlowControl"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
            java.lang.String r8 = "updateFlowCtrlInfo "
            r7.<init>(r8)     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0120 }
            r7.append(r0)     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0120 }
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0120 }
            com.taobao.accs.utl.ALog.e(r2, r0, r7)     // Catch:{ all -> 0x0120 }
        L_0x0117:
            monitor-exit(r21)     // Catch:{ all -> 0x0120 }
            goto L_0x013b
        L_0x0119:
            r0 = move-exception
            r19 = r13
        L_0x011c:
            monitor-exit(r21)     // Catch:{ all -> 0x0120 }
            throw r0     // Catch:{ Throwable -> 0x011e }
        L_0x011e:
            r0 = move-exception
            goto L_0x012e
        L_0x0120:
            r0 = move-exception
            goto L_0x011c
        L_0x0122:
            r0 = move-exception
            r19 = r13
            goto L_0x012e
        L_0x0126:
            r0 = move-exception
            r19 = r3
            goto L_0x012e
        L_0x012a:
            r0 = move-exception
            r19 = r3
            r6 = 0
        L_0x012e:
            java.lang.String r2 = "FlowControl"
            java.lang.String r7 = "updateFlowCtrlInfo"
            java.lang.Object[] r8 = new java.lang.Object[r5]
            com.taobao.accs.utl.ALog.e(r2, r7, r0, r8)
            goto L_0x013b
        L_0x0138:
            r19 = r3
            r6 = 0
        L_0x013b:
            int r0 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0141
            r0 = 1
            return r0
        L_0x0141:
            int r0 = (r19 > r3 ? 1 : (r19 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0146
            return r5
        L_0x0146:
            r2 = 422(0x1a6, float:5.91E-43)
            if (r2 != r6) goto L_0x014c
            r0 = 3
            return r0
        L_0x014c:
            r0 = 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.flowcontrol.FlowControl.a(java.util.Map, java.lang.String):int");
    }
}
