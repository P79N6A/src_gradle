package com.taobao.accs.net;

import com.taobao.accs.data.Message;

public class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Message f79036a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f79037b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s f79038c;

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(1:5)(4:6|(2:8|(1:10)(2:11|(1:20)(2:15|(1:19))))|21|(1:23))|24|(2:29|30)|31|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            com.taobao.accs.net.s r0 = r5.f79038c
            java.util.LinkedList r0 = r0.t
            monitor-enter(r0)
            com.taobao.accs.net.s r1 = r5.f79038c     // Catch:{ all -> 0x00b1 }
            com.taobao.accs.data.Message r2 = r5.f79036a     // Catch:{ all -> 0x00b1 }
            r1.a((com.taobao.accs.data.Message) r2)     // Catch:{ all -> 0x00b1 }
            com.taobao.accs.net.s r1 = r5.f79038c     // Catch:{ all -> 0x00b1 }
            java.util.LinkedList r1 = r1.t     // Catch:{ all -> 0x00b1 }
            int r1 = r1.size()     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x0027
            com.taobao.accs.net.s r1 = r5.f79038c     // Catch:{ all -> 0x00b1 }
            java.util.LinkedList r1 = r1.t     // Catch:{ all -> 0x00b1 }
            com.taobao.accs.data.Message r2 = r5.f79036a     // Catch:{ all -> 0x00b1 }
            r1.add(r2)     // Catch:{ all -> 0x00b1 }
            goto L_0x0099
        L_0x0027:
            com.taobao.accs.net.s r1 = r5.f79038c     // Catch:{ all -> 0x00b1 }
            java.util.LinkedList r1 = r1.t     // Catch:{ all -> 0x00b1 }
            java.lang.Object r1 = r1.getFirst()     // Catch:{ all -> 0x00b1 }
            com.taobao.accs.data.Message r1 = (com.taobao.accs.data.Message) r1     // Catch:{ all -> 0x00b1 }
            com.taobao.accs.data.Message r2 = r5.f79036a     // Catch:{ all -> 0x00b1 }
            int r2 = r2.a()     // Catch:{ all -> 0x00b1 }
            r3 = 1
            r4 = 2
            if (r2 == r3) goto L_0x007f
            com.taobao.accs.data.Message r2 = r5.f79036a     // Catch:{ all -> 0x00b1 }
            int r2 = r2.a()     // Catch:{ all -> 0x00b1 }
            if (r2 != 0) goto L_0x0046
            goto L_0x007f
        L_0x0046:
            com.taobao.accs.data.Message r2 = r5.f79036a     // Catch:{ all -> 0x00b1 }
            int r2 = r2.a()     // Catch:{ all -> 0x00b1 }
            if (r2 != r4) goto L_0x0073
            int r2 = r1.a()     // Catch:{ all -> 0x00b1 }
            if (r2 != r4) goto L_0x0073
            boolean r1 = r1.f78929d     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x0099
            com.taobao.accs.data.Message r1 = r5.f79036a     // Catch:{ all -> 0x00b1 }
            boolean r1 = r1.f78929d     // Catch:{ all -> 0x00b1 }
            if (r1 == 0) goto L_0x0099
            com.taobao.accs.net.s r1 = r5.f79038c     // Catch:{ all -> 0x00b1 }
            java.util.LinkedList r1 = r1.t     // Catch:{ all -> 0x00b1 }
            r1.removeFirst()     // Catch:{ all -> 0x00b1 }
            com.taobao.accs.net.s r1 = r5.f79038c     // Catch:{ all -> 0x00b1 }
            java.util.LinkedList r1 = r1.t     // Catch:{ all -> 0x00b1 }
            com.taobao.accs.data.Message r2 = r5.f79036a     // Catch:{ all -> 0x00b1 }
            r1.addFirst(r2)     // Catch:{ all -> 0x00b1 }
            goto L_0x0099
        L_0x0073:
            com.taobao.accs.net.s r1 = r5.f79038c     // Catch:{ all -> 0x00b1 }
            java.util.LinkedList r1 = r1.t     // Catch:{ all -> 0x00b1 }
            com.taobao.accs.data.Message r2 = r5.f79036a     // Catch:{ all -> 0x00b1 }
            r1.addLast(r2)     // Catch:{ all -> 0x00b1 }
            goto L_0x0099
        L_0x007f:
            com.taobao.accs.net.s r2 = r5.f79038c     // Catch:{ all -> 0x00b1 }
            java.util.LinkedList r2 = r2.t     // Catch:{ all -> 0x00b1 }
            com.taobao.accs.data.Message r3 = r5.f79036a     // Catch:{ all -> 0x00b1 }
            r2.addLast(r3)     // Catch:{ all -> 0x00b1 }
            int r1 = r1.a()     // Catch:{ all -> 0x00b1 }
            if (r1 != r4) goto L_0x0099
            com.taobao.accs.net.s r1 = r5.f79038c     // Catch:{ all -> 0x00b1 }
            java.util.LinkedList r1 = r1.t     // Catch:{ all -> 0x00b1 }
            r1.removeFirst()     // Catch:{ all -> 0x00b1 }
        L_0x0099:
            boolean r1 = r5.f79037b     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x00a6
            com.taobao.accs.net.s r1 = r5.f79038c     // Catch:{ all -> 0x00b1 }
            int r1 = r1.s     // Catch:{ all -> 0x00b1 }
            r2 = 3
            if (r1 != r2) goto L_0x00af
        L_0x00a6:
            com.taobao.accs.net.s r1 = r5.f79038c     // Catch:{ Exception -> 0x00af }
            java.util.LinkedList r1 = r1.t     // Catch:{ Exception -> 0x00af }
            r1.notifyAll()     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
            return
        L_0x00b1:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b1 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.t.run():void");
    }

    t(s sVar, Message message, boolean z) {
        this.f79038c = sVar;
        this.f79036a = message;
        this.f79037b = z;
    }
}
