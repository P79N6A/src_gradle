package com.huawei.android.pushagent.utils.tools;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25194a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f25195b;

    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r5, int r6) {
        /*
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ctrlSocket cmd is "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = ", param is "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)
            r0 = 0
            java.lang.String r1 = "connectivity"
            android.os.IBinder r1 = android.os.ServiceManager.getService(r1)     // Catch:{ RemoteException -> 0x0088, Exception -> 0x0074, all -> 0x0071 }
            if (r1 != 0) goto L_0x002c
            java.lang.String r5 = "PushLogAC2815"
            java.lang.String r6 = "get connectivity service failed "
            com.huawei.android.pushagent.utils.a.e.c(r5, r6)     // Catch:{ RemoteException -> 0x0088, Exception -> 0x0074, all -> 0x0071 }
            return
        L_0x002c:
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0088, Exception -> 0x0074, all -> 0x0071 }
            int r3 = android.os.Process.myPid()     // Catch:{ RemoteException -> 0x006d, Exception -> 0x0069, all -> 0x0065 }
            r2.writeInt(r3)     // Catch:{ RemoteException -> 0x006d, Exception -> 0x0069, all -> 0x0065 }
            r2.writeInt(r5)     // Catch:{ RemoteException -> 0x006d, Exception -> 0x0069, all -> 0x0065 }
            r2.writeInt(r6)     // Catch:{ RemoteException -> 0x006d, Exception -> 0x0069, all -> 0x0065 }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x006d, Exception -> 0x0069, all -> 0x0065 }
            r6 = 1003(0x3eb, float:1.406E-42)
            r0 = 0
            r1.transact(r6, r2, r5, r0)     // Catch:{ RemoteException -> 0x005f, Exception -> 0x0059, all -> 0x0052 }
            if (r2 == 0) goto L_0x004c
            r2.recycle()
        L_0x004c:
            if (r5 == 0) goto L_0x00ab
            r5.recycle()
            return
        L_0x0052:
            r6 = move-exception
            r0 = r2
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x00ad
        L_0x0059:
            r6 = move-exception
            r0 = r2
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x0076
        L_0x005f:
            r6 = move-exception
            r0 = r2
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x008a
        L_0x0065:
            r5 = move-exception
            r6 = r0
            r0 = r2
            goto L_0x00ad
        L_0x0069:
            r5 = move-exception
            r6 = r0
            r0 = r2
            goto L_0x0076
        L_0x006d:
            r5 = move-exception
            r6 = r0
            r0 = r2
            goto L_0x008a
        L_0x0071:
            r5 = move-exception
            r6 = r0
            goto L_0x00ad
        L_0x0074:
            r5 = move-exception
            r6 = r0
        L_0x0076:
            java.lang.String r1 = "PushLogAC2815"
            java.lang.String r2 = "ctrlSocket error:"
            com.huawei.android.pushagent.utils.a.e.c(r1, r2, r5)     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0082
            r0.recycle()
        L_0x0082:
            if (r6 == 0) goto L_0x00ab
            r6.recycle()
            return
        L_0x0088:
            r5 = move-exception
            r6 = r0
        L_0x008a:
            java.lang.String r1 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ac }
            java.lang.String r3 = "ctrlSocket error:"
            r2.<init>(r3)     // Catch:{ all -> 0x00ac }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x00ac }
            r2.append(r5)     // Catch:{ all -> 0x00ac }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x00ac }
            com.huawei.android.pushagent.utils.a.e.d(r1, r5)     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x00a6
            r0.recycle()
        L_0x00a6:
            if (r6 == 0) goto L_0x00ab
            r6.recycle()
        L_0x00ab:
            return
        L_0x00ac:
            r5 = move-exception
        L_0x00ad:
            if (r0 == 0) goto L_0x00b2
            r0.recycle()
        L_0x00b2:
            if (r6 == 0) goto L_0x00b7
            r6.recycle()
        L_0x00b7:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.tools.d.a(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r5) {
        /*
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ctrlScoket registerPackage "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x001a
            return
        L_0x001a:
            r0 = 0
            java.lang.String r1 = "connectivity"
            android.os.IBinder r1 = android.os.ServiceManager.getService(r1)     // Catch:{ RemoteException -> 0x0076, Exception -> 0x0062, all -> 0x005f }
            if (r1 != 0) goto L_0x002b
            java.lang.String r5 = "PushLogAC2815"
            java.lang.String r1 = "get connectivity service failed "
            com.huawei.android.pushagent.utils.a.e.c(r5, r1)     // Catch:{ RemoteException -> 0x0076, Exception -> 0x0062, all -> 0x005f }
            return
        L_0x002b:
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0076, Exception -> 0x0062, all -> 0x005f }
            r2.writeString(r5)     // Catch:{ RemoteException -> 0x005b, Exception -> 0x0057, all -> 0x0053 }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x005b, Exception -> 0x0057, all -> 0x0053 }
            r0 = 1001(0x3e9, float:1.403E-42)
            r3 = 0
            r1.transact(r0, r2, r5, r3)     // Catch:{ RemoteException -> 0x004f, Exception -> 0x004b, all -> 0x0047 }
            if (r2 == 0) goto L_0x0041
            r2.recycle()
        L_0x0041:
            if (r5 == 0) goto L_0x0099
            r5.recycle()
            return
        L_0x0047:
            r0 = move-exception
            r1 = r5
            r5 = r0
            goto L_0x0055
        L_0x004b:
            r0 = move-exception
            r1 = r5
            r5 = r0
            goto L_0x0059
        L_0x004f:
            r0 = move-exception
            r1 = r5
            r5 = r0
            goto L_0x005d
        L_0x0053:
            r5 = move-exception
            r1 = r0
        L_0x0055:
            r0 = r2
            goto L_0x009b
        L_0x0057:
            r5 = move-exception
            r1 = r0
        L_0x0059:
            r0 = r2
            goto L_0x0064
        L_0x005b:
            r5 = move-exception
            r1 = r0
        L_0x005d:
            r0 = r2
            goto L_0x0078
        L_0x005f:
            r5 = move-exception
            r1 = r0
            goto L_0x009b
        L_0x0062:
            r5 = move-exception
            r1 = r0
        L_0x0064:
            java.lang.String r2 = "PushLogAC2815"
            java.lang.String r3 = "registerPackage error:"
            com.huawei.android.pushagent.utils.a.e.c(r2, r3, r5)     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0070
            r0.recycle()
        L_0x0070:
            if (r1 == 0) goto L_0x0099
            r1.recycle()
            return
        L_0x0076:
            r5 = move-exception
            r1 = r0
        L_0x0078:
            java.lang.String r2 = "PushLogAC2815"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            java.lang.String r4 = "registerPackage error:"
            r3.<init>(r4)     // Catch:{ all -> 0x009a }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x009a }
            r3.append(r5)     // Catch:{ all -> 0x009a }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x009a }
            com.huawei.android.pushagent.utils.a.e.d(r2, r5)     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0094
            r0.recycle()
        L_0x0094:
            if (r1 == 0) goto L_0x0099
            r1.recycle()
        L_0x0099:
            return
        L_0x009a:
            r5 = move-exception
        L_0x009b:
            if (r0 == 0) goto L_0x00a0
            r0.recycle()
        L_0x00a0:
            if (r1 == 0) goto L_0x00a5
            r1.recycle()
        L_0x00a5:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.tools.d.a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r5 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r5.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0073, code lost:
        if (r5 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0094, code lost:
        if (r5 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0097, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] a() {
        /*
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r3 = "connectivity"
            android.os.IBinder r3 = android.os.ServiceManager.getService(r3)     // Catch:{ RemoteException -> 0x0076, Exception -> 0x0065, all -> 0x0062 }
            if (r3 != 0) goto L_0x0014
            java.lang.String r0 = "PushLogAC2815"
            java.lang.String r3 = "get connectivity service failed "
            com.huawei.android.pushagent.utils.a.e.c(r0, r3)     // Catch:{ RemoteException -> 0x0076, Exception -> 0x0065, all -> 0x0062 }
            return r1
        L_0x0014:
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0076, Exception -> 0x0065, all -> 0x0062 }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x005e, Exception -> 0x005a, all -> 0x0056 }
            r2 = 1004(0x3ec, float:1.407E-42)
            r3.transact(r2, r4, r5, r0)     // Catch:{ RemoteException -> 0x0054, Exception -> 0x0052, all -> 0x0050 }
            java.lang.String r0 = r5.readString()     // Catch:{ RemoteException -> 0x0054, Exception -> 0x0052, all -> 0x0050 }
            java.lang.String r2 = "PushLogAC2815"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0054, Exception -> 0x0052, all -> 0x0050 }
            java.lang.String r6 = "ctrlSocket whitepackages is:"
            r3.<init>(r6)     // Catch:{ RemoteException -> 0x0054, Exception -> 0x0052, all -> 0x0050 }
            r3.append(r0)     // Catch:{ RemoteException -> 0x0054, Exception -> 0x0052, all -> 0x0050 }
            java.lang.String r3 = r3.toString()     // Catch:{ RemoteException -> 0x0054, Exception -> 0x0052, all -> 0x0050 }
            com.huawei.android.pushagent.utils.a.e.a(r2, r3)     // Catch:{ RemoteException -> 0x0054, Exception -> 0x0052, all -> 0x0050 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ RemoteException -> 0x0054, Exception -> 0x0052, all -> 0x0050 }
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = "\t"
            java.lang.String[] r0 = r0.split(r2)     // Catch:{ RemoteException -> 0x0054, Exception -> 0x0052, all -> 0x0050 }
            r1 = r0
        L_0x0045:
            if (r4 == 0) goto L_0x004a
            r4.recycle()
        L_0x004a:
            if (r5 == 0) goto L_0x0097
        L_0x004c:
            r5.recycle()
            goto L_0x0097
        L_0x0050:
            r0 = move-exception
            goto L_0x0058
        L_0x0052:
            r0 = move-exception
            goto L_0x005c
        L_0x0054:
            r0 = move-exception
            goto L_0x0060
        L_0x0056:
            r0 = move-exception
            r5 = r2
        L_0x0058:
            r2 = r4
            goto L_0x0099
        L_0x005a:
            r0 = move-exception
            r5 = r2
        L_0x005c:
            r2 = r4
            goto L_0x0067
        L_0x005e:
            r0 = move-exception
            r5 = r2
        L_0x0060:
            r2 = r4
            goto L_0x0078
        L_0x0062:
            r0 = move-exception
            r5 = r2
            goto L_0x0099
        L_0x0065:
            r0 = move-exception
            r5 = r2
        L_0x0067:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.String r4 = "ctrlSocket error:"
            com.huawei.android.pushagent.utils.a.e.c(r3, r4, r0)     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0073
            r2.recycle()
        L_0x0073:
            if (r5 == 0) goto L_0x0097
            goto L_0x004c
        L_0x0076:
            r0 = move-exception
            r5 = r2
        L_0x0078:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            java.lang.String r6 = "ctrlSocket error:"
            r4.<init>(r6)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0098 }
            r4.append(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0098 }
            com.huawei.android.pushagent.utils.a.e.d(r3, r0)     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0094
            r2.recycle()
        L_0x0094:
            if (r5 == 0) goto L_0x0097
            goto L_0x004c
        L_0x0097:
            return r1
        L_0x0098:
            r0 = move-exception
        L_0x0099:
            if (r2 == 0) goto L_0x009e
            r2.recycle()
        L_0x009e:
            if (r5 == 0) goto L_0x00a3
            r5.recycle()
        L_0x00a3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.tools.d.a():java.lang.String[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0053, code lost:
        if (r4 != null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0055, code lost:
        r4.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0077, code lost:
        if (r4 != null) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b() {
        /*
            r0 = -1
            r1 = 0
            java.lang.String r2 = "connectivity"
            android.os.IBinder r2 = android.os.ServiceManager.getService(r2)     // Catch:{ RemoteException -> 0x0059, Exception -> 0x0045, all -> 0x0042 }
            if (r2 != 0) goto L_0x0012
            java.lang.String r2 = "PushLogAC2815"
            java.lang.String r3 = "get connectivity service failed "
            com.huawei.android.pushagent.utils.a.e.c(r2, r3)     // Catch:{ RemoteException -> 0x0059, Exception -> 0x0045, all -> 0x0042 }
            return r0
        L_0x0012:
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0059, Exception -> 0x0045, all -> 0x0042 }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x003e, Exception -> 0x003a, all -> 0x0036 }
            r1 = 1005(0x3ed, float:1.408E-42)
            r5 = 0
            r2.transact(r1, r3, r4, r5)     // Catch:{ RemoteException -> 0x0034, Exception -> 0x0032, all -> 0x0030 }
            int r1 = r4.readInt()     // Catch:{ RemoteException -> 0x0034, Exception -> 0x0032, all -> 0x0030 }
            if (r3 == 0) goto L_0x0029
            r3.recycle()
        L_0x0029:
            if (r4 == 0) goto L_0x002e
            r4.recycle()
        L_0x002e:
            r0 = r1
            goto L_0x007a
        L_0x0030:
            r0 = move-exception
            goto L_0x0038
        L_0x0032:
            r2 = move-exception
            goto L_0x003c
        L_0x0034:
            r2 = move-exception
            goto L_0x0040
        L_0x0036:
            r0 = move-exception
            r4 = r1
        L_0x0038:
            r1 = r3
            goto L_0x008f
        L_0x003a:
            r2 = move-exception
            r4 = r1
        L_0x003c:
            r1 = r3
            goto L_0x0047
        L_0x003e:
            r2 = move-exception
            r4 = r1
        L_0x0040:
            r1 = r3
            goto L_0x005b
        L_0x0042:
            r0 = move-exception
            r4 = r1
            goto L_0x008f
        L_0x0045:
            r2 = move-exception
            r4 = r1
        L_0x0047:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.String r5 = "getCtrlSocketModel error:"
            com.huawei.android.pushagent.utils.a.e.c(r3, r5, r2)     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0053
            r1.recycle()
        L_0x0053:
            if (r4 == 0) goto L_0x007a
        L_0x0055:
            r4.recycle()
            goto L_0x007a
        L_0x0059:
            r2 = move-exception
            r4 = r1
        L_0x005b:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x008e }
            java.lang.String r6 = "getCtrlSocketModel error:"
            r5.<init>(r6)     // Catch:{ all -> 0x008e }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x008e }
            r5.append(r2)     // Catch:{ all -> 0x008e }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x008e }
            com.huawei.android.pushagent.utils.a.e.d(r3, r2)     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x0077
            r1.recycle()
        L_0x0077:
            if (r4 == 0) goto L_0x007a
            goto L_0x0055
        L_0x007a:
            java.lang.String r1 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ctrlSocket level is:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.a(r1, r2)
            return r0
        L_0x008e:
            r0 = move-exception
        L_0x008f:
            if (r1 == 0) goto L_0x0094
            r1.recycle()
        L_0x0094:
            if (r4 == 0) goto L_0x0099
            r4.recycle()
        L_0x0099:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.tools.d.b():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.lang.String r5) {
        /*
            java.lang.String r0 = "PushLogAC2815"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ctrlScoket deregisterPackage "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x001a
            return
        L_0x001a:
            r0 = 0
            java.lang.String r1 = "connectivity"
            android.os.IBinder r1 = android.os.ServiceManager.getService(r1)     // Catch:{ RemoteException -> 0x006f, Exception -> 0x005b, all -> 0x0058 }
            if (r1 != 0) goto L_0x0024
            return
        L_0x0024:
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x006f, Exception -> 0x005b, all -> 0x0058 }
            r2.writeString(r5)     // Catch:{ RemoteException -> 0x0054, Exception -> 0x0050, all -> 0x004c }
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x0054, Exception -> 0x0050, all -> 0x004c }
            r0 = 1002(0x3ea, float:1.404E-42)
            r3 = 0
            r1.transact(r0, r2, r5, r3)     // Catch:{ RemoteException -> 0x0048, Exception -> 0x0044, all -> 0x0040 }
            if (r2 == 0) goto L_0x003a
            r2.recycle()
        L_0x003a:
            if (r5 == 0) goto L_0x0092
            r5.recycle()
            return
        L_0x0040:
            r0 = move-exception
            r1 = r5
            r5 = r0
            goto L_0x004e
        L_0x0044:
            r0 = move-exception
            r1 = r5
            r5 = r0
            goto L_0x0052
        L_0x0048:
            r0 = move-exception
            r1 = r5
            r5 = r0
            goto L_0x0056
        L_0x004c:
            r5 = move-exception
            r1 = r0
        L_0x004e:
            r0 = r2
            goto L_0x0094
        L_0x0050:
            r5 = move-exception
            r1 = r0
        L_0x0052:
            r0 = r2
            goto L_0x005d
        L_0x0054:
            r5 = move-exception
            r1 = r0
        L_0x0056:
            r0 = r2
            goto L_0x0071
        L_0x0058:
            r5 = move-exception
            r1 = r0
            goto L_0x0094
        L_0x005b:
            r5 = move-exception
            r1 = r0
        L_0x005d:
            java.lang.String r2 = "PushLogAC2815"
            java.lang.String r3 = "deregisterPackage error:"
            com.huawei.android.pushagent.utils.a.e.c(r2, r3, r5)     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0069
            r0.recycle()
        L_0x0069:
            if (r1 == 0) goto L_0x0092
            r1.recycle()
            return
        L_0x006f:
            r5 = move-exception
            r1 = r0
        L_0x0071:
            java.lang.String r2 = "PushLogAC2815"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            java.lang.String r4 = "deregisterPackage error:"
            r3.<init>(r4)     // Catch:{ all -> 0x0093 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0093 }
            r3.append(r5)     // Catch:{ all -> 0x0093 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0093 }
            com.huawei.android.pushagent.utils.a.e.d(r2, r5)     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x008d
            r0.recycle()
        L_0x008d:
            if (r1 == 0) goto L_0x0092
            r1.recycle()
        L_0x0092:
            return
        L_0x0093:
            r5 = move-exception
        L_0x0094:
            if (r0 == 0) goto L_0x0099
            r0.recycle()
        L_0x0099:
            if (r1 == 0) goto L_0x009e
            r1.recycle()
        L_0x009e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.tools.d.b(java.lang.String):void");
    }

    public static synchronized boolean c() {
        boolean z;
        synchronized (d.class) {
            if (!f25194a) {
                f25194a = true;
                f25195b = "v2".equals(d());
            }
            z = f25195b;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0054, code lost:
        if (r4 != null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0056, code lost:
        r4.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0078, code lost:
        if (r4 != null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String d() {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String r2 = "connectivity"
            android.os.IBinder r2 = android.os.ServiceManager.getService(r2)     // Catch:{ RemoteException -> 0x005a, Exception -> 0x0046, all -> 0x0043 }
            if (r2 != 0) goto L_0x0013
            java.lang.String r2 = "PushLogAC2815"
            java.lang.String r3 = "get connectivity service failed "
            com.huawei.android.pushagent.utils.a.e.c(r2, r3)     // Catch:{ RemoteException -> 0x005a, Exception -> 0x0046, all -> 0x0043 }
            return r0
        L_0x0013:
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x005a, Exception -> 0x0046, all -> 0x0043 }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x003f, Exception -> 0x003b, all -> 0x0037 }
            r1 = 1006(0x3ee, float:1.41E-42)
            r5 = 0
            r2.transact(r1, r3, r4, r5)     // Catch:{ RemoteException -> 0x0035, Exception -> 0x0033, all -> 0x0031 }
            java.lang.String r1 = r4.readString()     // Catch:{ RemoteException -> 0x0035, Exception -> 0x0033, all -> 0x0031 }
            if (r3 == 0) goto L_0x002a
            r3.recycle()
        L_0x002a:
            if (r4 == 0) goto L_0x002f
            r4.recycle()
        L_0x002f:
            r0 = r1
            goto L_0x007b
        L_0x0031:
            r0 = move-exception
            goto L_0x0039
        L_0x0033:
            r2 = move-exception
            goto L_0x003d
        L_0x0035:
            r2 = move-exception
            goto L_0x0041
        L_0x0037:
            r0 = move-exception
            r4 = r1
        L_0x0039:
            r1 = r3
            goto L_0x0090
        L_0x003b:
            r2 = move-exception
            r4 = r1
        L_0x003d:
            r1 = r3
            goto L_0x0048
        L_0x003f:
            r2 = move-exception
            r4 = r1
        L_0x0041:
            r1 = r3
            goto L_0x005c
        L_0x0043:
            r0 = move-exception
            r4 = r1
            goto L_0x0090
        L_0x0046:
            r2 = move-exception
            r4 = r1
        L_0x0048:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.String r5 = "getCtrlSocketVersion error:"
            com.huawei.android.pushagent.utils.a.e.c(r3, r5, r2)     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x0054
            r1.recycle()
        L_0x0054:
            if (r4 == 0) goto L_0x007b
        L_0x0056:
            r4.recycle()
            goto L_0x007b
        L_0x005a:
            r2 = move-exception
            r4 = r1
        L_0x005c:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            java.lang.String r6 = "getCtrlSocketVersion error:"
            r5.<init>(r6)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x008f }
            r5.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x008f }
            com.huawei.android.pushagent.utils.a.e.d(r3, r2)     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x0078
            r1.recycle()
        L_0x0078:
            if (r4 == 0) goto L_0x007b
            goto L_0x0056
        L_0x007b:
            java.lang.String r1 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ctrlSocket version is:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.a(r1, r2)
            return r0
        L_0x008f:
            r0 = move-exception
        L_0x0090:
            if (r1 == 0) goto L_0x0095
            r1.recycle()
        L_0x0095:
            if (r4 == 0) goto L_0x009a
            r4.recycle()
        L_0x009a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.tools.d.d():java.lang.String");
    }
}
