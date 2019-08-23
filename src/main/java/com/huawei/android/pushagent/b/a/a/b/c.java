package com.huawei.android.pushagent.b.a.a.b;

import com.huawei.android.pushagent.b.a.a.a;

public class c extends com.huawei.android.pushagent.b.a.a.c {
    public c(a aVar) {
        super(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x027c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() throws java.lang.Exception {
        /*
            r11 = this;
            r0 = 0
            com.huawei.android.pushagent.b.a.a.a r1 = r11.f25034c     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            if (r1 == 0) goto L_0x023e
            com.huawei.android.pushagent.b.a.a.a r1 = r11.f25034c     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            java.net.Socket r1 = r1.c()     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            if (r1 != 0) goto L_0x0013
            goto L_0x023e
        L_0x0013:
            com.huawei.android.pushagent.b.a.a.a r1 = r11.f25034c     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            java.net.Socket r1 = r1.c()     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            if (r1 == 0) goto L_0x0034
            java.lang.String r2 = "PushLogAC2815"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            java.lang.String r4 = "socket timeout is "
            r3.<init>(r4)     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            int r4 = r1.getSoTimeout()     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            r3.append(r4)     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            java.lang.String r3 = r3.toString()     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            com.huawei.android.pushagent.utils.a.e.a(r2, r3)     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
        L_0x0034:
            com.huawei.android.pushagent.b.a.a.a r2 = r11.f25034c     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            com.huawei.android.pushagent.b.a.b.b r2 = r2.f25013c     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            java.io.InputStream r2 = r2.d()     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            r0 = -1
            r3 = -1
            r4 = -1
        L_0x003f:
            boolean r5 = r11.isInterrupted()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            if (r5 != 0) goto L_0x0217
            com.huawei.android.pushagent.b.a.a.a r5 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.b.b r5 = r5.f25013c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            boolean r5 = r5.b()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            if (r5 == 0) goto L_0x0217
            if (r3 == r0) goto L_0x0054
            r4 = r3
            r3 = -1
            goto L_0x0062
        L_0x0054:
            if (r2 == 0) goto L_0x005b
            int r4 = r2.read()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            goto L_0x0062
        L_0x005b:
            java.lang.String r5 = "PushLogAC2815"
            java.lang.String r6 = "inputstream is null, cannot get cmdId"
            com.huawei.android.pushagent.utils.a.e.a(r5, r6)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
        L_0x0062:
            if (r0 != r4) goto L_0x006d
            java.lang.String r0 = "PushLogAC2815"
            java.lang.String r1 = "read -1 data, socket may be close"
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            goto L_0x0217
        L_0x006d:
            r5 = 1
            byte[] r5 = new byte[r5]     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            byte r6 = (byte) r4     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            r7 = 0
            r5[r7] = r6     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            java.lang.String r5 = com.huawei.android.pushagent.utils.a.a((byte[]) r5)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            java.lang.String r8 = "PushLogAC2815"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            java.lang.String r10 = "received a msg cmdId:"
            r9.<init>(r10)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            r9.append(r5)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            java.lang.String r9 = r9.toString()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.utils.a.e.a(r8, r9)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            byte r8 = com.huawei.android.pushagent.a.b.l.c()     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            if (r8 != r6) goto L_0x00c7
            java.lang.String r8 = "PushLogAC2815"
            java.lang.String r9 = "is PushDataReqMessage set read TimeOut 100"
            com.huawei.android.pushagent.utils.a.e.a(r8, r9)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            if (r1 == 0) goto L_0x00a0
            r8 = 100
            r1.setSoTimeout(r8)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            goto L_0x00a7
        L_0x00a0:
            java.lang.String r8 = "PushLogAC2815"
            java.lang.String r9 = "socket is null"
            com.huawei.android.pushagent.utils.a.e.a(r8, r9)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
        L_0x00a7:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            com.huawei.android.pushagent.a.b.a.b r6 = com.huawei.android.pushagent.a.b.a.a.a(r6, r2)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            if (r6 == 0) goto L_0x00cf
            r8 = r6
            com.huawei.android.pushagent.a.b.l r8 = (com.huawei.android.pushagent.a.b.l) r8     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            byte r9 = r8.i()     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            if (r9 == r0) goto L_0x00cf
            java.lang.String r9 = "PushLogAC2815"
            java.lang.String r10 = "is get next cmdId, so set it"
            com.huawei.android.pushagent.utils.a.e.a(r9, r10)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            byte r8 = r8.i()     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            r3 = r8
            goto L_0x00cf
        L_0x00c7:
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            com.huawei.android.pushagent.a.b.a.b r6 = com.huawei.android.pushagent.a.b.a.a.a(r6, r2)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
        L_0x00cf:
            if (r6 == 0) goto L_0x00e6
            com.huawei.android.pushagent.utils.a.b()     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            r5.<init>()     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            java.lang.String r8 = "push_msg"
            r5.putSerializable(r8, r6)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            com.huawei.android.pushagent.b.a.a.a r6 = r11.f25034c     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            com.huawei.android.pushagent.b.a.a.c$a r8 = com.huawei.android.pushagent.b.a.a.c.a.SocketEvent_MSG_RECEIVED     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            r6.a((com.huawei.android.pushagent.b.a.a.c.a) r8, (android.os.Bundle) r5)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            goto L_0x00f9
        L_0x00e6:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            java.lang.String r9 = "received invalid msg, cmdId"
            r8.<init>(r9)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            r8.append(r5)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            java.lang.String r5 = r8.toString()     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
            com.huawei.android.pushagent.utils.a.e.d(r6, r5)     // Catch:{ InstantiationException -> 0x018a, Exception -> 0x0139 }
        L_0x00f9:
            if (r1 == 0) goto L_0x003f
            com.huawei.android.pushagent.b.a.a$a r5 = com.huawei.android.pushagent.b.a.a.c()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a.a r6 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a$a r6 = r6.e()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            if (r5 != r6) goto L_0x0114
            com.huawei.android.pushagent.b.a.a.a r5 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.b.b r5 = r5.f25013c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            java.net.Socket r5 = r5.c()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
        L_0x010f:
            r5.setSoTimeout(r7)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            goto L_0x003f
        L_0x0114:
            com.huawei.android.pushagent.b.a.a.a r5 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.b.b r5 = r5.f25013c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            java.net.Socket r5 = r5.c()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a.a r6 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a.b r6 = r6.f25015e     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            long r6 = r6.b((boolean) r7)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            android.content.Context r8 = r11.f25033b     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.b.a r8 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r8)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            long r8 = r8.Q()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            r10 = 0
            long r6 = r6 + r8
            int r6 = (int) r6     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            r5.setSoTimeout(r6)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            goto L_0x003f
        L_0x0136:
            r0 = move-exception
            goto L_0x01dc
        L_0x0139:
            java.lang.String r5 = "PushLogAC2815"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0136 }
            java.lang.String r8 = "call getEntityByCmdId(cmd:"
            r6.<init>(r8)     // Catch:{ all -> 0x0136 }
            r6.append(r4)     // Catch:{ all -> 0x0136 }
            java.lang.String r8 = " Exception"
            r6.append(r8)     // Catch:{ all -> 0x0136 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0136 }
            com.huawei.android.pushagent.utils.a.e.d(r5, r6)     // Catch:{ all -> 0x0136 }
            if (r1 == 0) goto L_0x003f
            com.huawei.android.pushagent.b.a.a$a r5 = com.huawei.android.pushagent.b.a.a.c()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a.a r6 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a$a r6 = r6.e()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            if (r5 != r6) goto L_0x0168
            com.huawei.android.pushagent.b.a.a.a r5 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.b.b r5 = r5.f25013c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            java.net.Socket r5 = r5.c()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            goto L_0x010f
        L_0x0168:
            com.huawei.android.pushagent.b.a.a.a r5 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.b.b r5 = r5.f25013c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            java.net.Socket r5 = r5.c()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a.a r6 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a.b r6 = r6.f25015e     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            long r6 = r6.b((boolean) r7)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            android.content.Context r8 = r11.f25033b     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.b.a r8 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r8)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            long r8 = r8.Q()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            r10 = 0
            long r6 = r6 + r8
            int r6 = (int) r6     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            r5.setSoTimeout(r6)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            goto L_0x003f
        L_0x018a:
            java.lang.String r5 = "PushLogAC2815"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0136 }
            java.lang.String r8 = "call getEntityByCmdId(cmd:"
            r6.<init>(r8)     // Catch:{ all -> 0x0136 }
            r6.append(r4)     // Catch:{ all -> 0x0136 }
            java.lang.String r8 = " cause InstantiationException"
            r6.append(r8)     // Catch:{ all -> 0x0136 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0136 }
            com.huawei.android.pushagent.utils.a.e.d(r5, r6)     // Catch:{ all -> 0x0136 }
            if (r1 == 0) goto L_0x003f
            com.huawei.android.pushagent.b.a.a$a r5 = com.huawei.android.pushagent.b.a.a.c()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a.a r6 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a$a r6 = r6.e()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            if (r5 != r6) goto L_0x01ba
            com.huawei.android.pushagent.b.a.a.a r5 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.b.b r5 = r5.f25013c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            java.net.Socket r5 = r5.c()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            goto L_0x010f
        L_0x01ba:
            com.huawei.android.pushagent.b.a.a.a r5 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.b.b r5 = r5.f25013c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            java.net.Socket r5 = r5.c()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a.a r6 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a.b r6 = r6.f25015e     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            long r6 = r6.b((boolean) r7)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            android.content.Context r8 = r11.f25033b     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.b.a r8 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r8)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            long r8 = r8.Q()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            r10 = 0
            long r6 = r6 + r8
            int r6 = (int) r6     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            r5.setSoTimeout(r6)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            goto L_0x003f
        L_0x01dc:
            if (r1 == 0) goto L_0x0216
            com.huawei.android.pushagent.b.a.a$a r1 = com.huawei.android.pushagent.b.a.a.c()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a.a r3 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a$a r3 = r3.e()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            if (r1 != r3) goto L_0x01f6
            com.huawei.android.pushagent.b.a.a.a r1 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            java.net.Socket r1 = r1.c()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            r1.setSoTimeout(r7)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            goto L_0x0216
        L_0x01f6:
            com.huawei.android.pushagent.b.a.a.a r1 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.b.b r1 = r1.f25013c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            java.net.Socket r1 = r1.c()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a.a r3 = r11.f25034c     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.a.a.b r3 = r3.f25015e     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            long r3 = r3.b((boolean) r7)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            android.content.Context r5 = r11.f25033b     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            com.huawei.android.pushagent.b.b.a r5 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r5)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            long r5 = r5.Q()     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            r7 = 0
            long r3 = r3 + r5
            int r3 = (int) r3     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
            r1.setSoTimeout(r3)     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
        L_0x0216:
            throw r0     // Catch:{ SocketException -> 0x023b, IOException -> 0x0238, Exception -> 0x0235, all -> 0x0233 }
        L_0x0217:
            if (r2 == 0) goto L_0x021c
            r2.close()
        L_0x021c:
            com.huawei.android.pushagent.b.a.a.a r0 = r11.f25034c
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c
            if (r0 == 0) goto L_0x0229
            com.huawei.android.pushagent.b.a.a.a r0 = r11.f25034c
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c
            r0.a()
        L_0x0229:
            com.huawei.android.pushagent.a.c r0 = new com.huawei.android.pushagent.a.c
            com.huawei.android.pushagent.a.c$a r1 = com.huawei.android.pushagent.a.c.a.Err_Read
            java.lang.String r2 = " read normal Exit"
            r0.<init>((java.lang.String) r2, (com.huawei.android.pushagent.a.c.a) r1)
            throw r0
        L_0x0233:
            r1 = move-exception
            goto L_0x0271
        L_0x0235:
            r1 = move-exception
            r0 = r2
            goto L_0x0257
        L_0x0238:
            r1 = move-exception
            r0 = r2
            goto L_0x0260
        L_0x023b:
            r1 = move-exception
            r0 = r2
            goto L_0x0269
        L_0x023e:
            java.lang.String r1 = "PushLogAC2815"
            java.lang.String r2 = "no socket when in readSSLSocket"
            com.huawei.android.pushagent.utils.a.e.d(r1, r2)     // Catch:{ SocketException -> 0x0268, IOException -> 0x025f, Exception -> 0x0256 }
            com.huawei.android.pushagent.b.a.a.a r0 = r11.f25034c
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c
            if (r0 == 0) goto L_0x0252
            com.huawei.android.pushagent.b.a.a.a r0 = r11.f25034c
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c
            r0.a()
        L_0x0252:
            return
        L_0x0253:
            r1 = move-exception
            r2 = r0
            goto L_0x0271
        L_0x0256:
            r1 = move-exception
        L_0x0257:
            com.huawei.android.pushagent.a.c r2 = new com.huawei.android.pushagent.a.c     // Catch:{ all -> 0x0253 }
            com.huawei.android.pushagent.a.c$a r3 = com.huawei.android.pushagent.a.c.a.Err_Read     // Catch:{ all -> 0x0253 }
            r2.<init>((java.lang.Throwable) r1, (com.huawei.android.pushagent.a.c.a) r3)     // Catch:{ all -> 0x0253 }
            throw r2     // Catch:{ all -> 0x0253 }
        L_0x025f:
            r1 = move-exception
        L_0x0260:
            com.huawei.android.pushagent.a.c r2 = new com.huawei.android.pushagent.a.c     // Catch:{ all -> 0x0253 }
            com.huawei.android.pushagent.a.c$a r3 = com.huawei.android.pushagent.a.c.a.Err_Read     // Catch:{ all -> 0x0253 }
            r2.<init>((java.lang.Throwable) r1, (com.huawei.android.pushagent.a.c.a) r3)     // Catch:{ all -> 0x0253 }
            throw r2     // Catch:{ all -> 0x0253 }
        L_0x0268:
            r1 = move-exception
        L_0x0269:
            com.huawei.android.pushagent.a.c r2 = new com.huawei.android.pushagent.a.c     // Catch:{ all -> 0x0253 }
            com.huawei.android.pushagent.a.c$a r3 = com.huawei.android.pushagent.a.c.a.Err_Read     // Catch:{ all -> 0x0253 }
            r2.<init>((java.lang.Throwable) r1, (com.huawei.android.pushagent.a.c.a) r3)     // Catch:{ all -> 0x0253 }
            throw r2     // Catch:{ all -> 0x0253 }
        L_0x0271:
            if (r2 == 0) goto L_0x0276
            r2.close()
        L_0x0276:
            com.huawei.android.pushagent.b.a.a.a r0 = r11.f25034c
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c
            if (r0 == 0) goto L_0x0283
            com.huawei.android.pushagent.b.a.a.a r0 = r11.f25034c
            com.huawei.android.pushagent.b.a.b.b r0 = r0.f25013c
            r0.a()
        L_0x0283:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.b.a.a.b.c.b():void");
    }
}
