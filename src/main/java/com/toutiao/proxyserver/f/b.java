package com.toutiao.proxyserver.f;

import com.meituan.robust.ChangeQuickRedirect;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80071a;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f80071a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 91862(0x166d6, float:1.28726E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f80071a
            r13 = 1
            r14 = 91862(0x166d6, float:1.28726E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            r2 = 0
            if (r0 != 0) goto L_0x003b
            return r2
        L_0x003b:
            java.lang.String r3 = "connectivity"
            java.lang.Object r3 = r0.getSystemService(r3)     // Catch:{  }
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3     // Catch:{  }
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()     // Catch:{  }
            if (r3 == 0) goto L_0x0110
            boolean r4 = r3.isConnected()     // Catch:{  }
            if (r4 == 0) goto L_0x0110
            int r4 = r3.getType()     // Catch:{  }
            if (r4 != 0) goto L_0x0088
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ Error -> 0x0110 }
            if (r0 == 0) goto L_0x0110
        L_0x005b:
            boolean r1 = r0.hasMoreElements()     // Catch:{ Error -> 0x0110 }
            if (r1 == 0) goto L_0x0110
            java.lang.Object r1 = r0.nextElement()     // Catch:{ Error -> 0x0110 }
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch:{ Error -> 0x0110 }
            java.util.Enumeration r1 = r1.getInetAddresses()     // Catch:{ Error -> 0x0110 }
            if (r1 == 0) goto L_0x005b
        L_0x006d:
            boolean r3 = r1.hasMoreElements()     // Catch:{ Error -> 0x0110 }
            if (r3 == 0) goto L_0x005b
            java.lang.Object r3 = r1.nextElement()     // Catch:{ Error -> 0x0110 }
            java.net.InetAddress r3 = (java.net.InetAddress) r3     // Catch:{ Error -> 0x0110 }
            boolean r4 = r3 instanceof java.net.Inet4Address     // Catch:{ Error -> 0x0110 }
            if (r4 == 0) goto L_0x006d
            boolean r4 = r3.isLoopbackAddress()     // Catch:{ Error -> 0x0110 }
            if (r4 != 0) goto L_0x006d
            java.lang.String r0 = r3.getHostAddress()     // Catch:{ Error -> 0x0110 }
            return r0
        L_0x0088:
            int r3 = r3.getType()     // Catch:{  }
            if (r3 != r1) goto L_0x0110
            android.content.Context r0 = r17.getApplicationContext()     // Catch:{ Error -> 0x0110 }
            java.lang.String r3 = "wifi"
            java.lang.Object r0 = r0.getSystemService(r3)     // Catch:{ Error -> 0x0110 }
            android.net.wifi.WifiManager r0 = (android.net.wifi.WifiManager) r0     // Catch:{ Error -> 0x0110 }
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()     // Catch:{ Error -> 0x0110 }
            int r0 = r0.getIpAddress()     // Catch:{ Error -> 0x0110 }
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Error -> 0x0110 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ Error -> 0x0110 }
            r10[r9] = r3     // Catch:{ Error -> 0x0110 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f80071a     // Catch:{ Error -> 0x0110 }
            r13 = 1
            r14 = 91863(0x166d7, float:1.28727E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Error -> 0x0110 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Error -> 0x0110 }
            r15[r9] = r3     // Catch:{ Error -> 0x0110 }
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Error -> 0x0110 }
            if (r3 == 0) goto L_0x00dd
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch:{ Error -> 0x0110 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Error -> 0x0110 }
            r10[r9] = r0     // Catch:{ Error -> 0x0110 }
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f80071a     // Catch:{ Error -> 0x0110 }
            r13 = 1
            r14 = 91863(0x166d7, float:1.28727E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch:{ Error -> 0x0110 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Error -> 0x0110 }
            r15[r9] = r0     // Catch:{ Error -> 0x0110 }
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Error -> 0x0110 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Error -> 0x0110 }
            return r0
        L_0x00dd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Error -> 0x0110 }
            r1.<init>()     // Catch:{ Error -> 0x0110 }
            r3 = r0 & 255(0xff, float:3.57E-43)
            r1.append(r3)     // Catch:{ Error -> 0x0110 }
            java.lang.String r3 = "."
            r1.append(r3)     // Catch:{ Error -> 0x0110 }
            int r3 = r0 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r1.append(r3)     // Catch:{ Error -> 0x0110 }
            java.lang.String r3 = "."
            r1.append(r3)     // Catch:{ Error -> 0x0110 }
            int r3 = r0 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            r1.append(r3)     // Catch:{ Error -> 0x0110 }
            java.lang.String r3 = "."
            r1.append(r3)     // Catch:{ Error -> 0x0110 }
            int r0 = r0 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.append(r0)     // Catch:{ Error -> 0x0110 }
            java.lang.String r0 = r1.toString()     // Catch:{ Error -> 0x0110 }
            return r0
        L_0x0110:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.f.b.a(android.content.Context):java.lang.String");
    }
}
