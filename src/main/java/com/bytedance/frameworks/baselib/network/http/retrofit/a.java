package com.bytedance.frameworks.baselib.network.http.retrofit;

import com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue;
import java.util.concurrent.Executor;

public final class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private static RequestQueue f19858a = RequestQueue.getDefaultRequestQueue();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.bytedance.frameworks.baselib.network.http.retrofit.a$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.bytedance.frameworks.baselib.network.http.retrofit.a$2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.bytedance.frameworks.baselib.network.http.retrofit.a$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.bytedance.frameworks.baselib.network.http.retrofit.a$1} */
    /* JADX WARNING: type inference failed for: r0v6, types: [int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(final java.lang.Runnable r13) {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r0 = r0.r()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0069
            if (r13 == 0) goto L_0x0068
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r0 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.NORMAL
            boolean r5 = r13 instanceof com.bytedance.retrofit2.r
            if (r5 == 0) goto L_0x003b
            r0 = r13
            com.bytedance.retrofit2.r r0 = (com.bytedance.retrofit2.r) r0
            int r4 = r0.a()
            if (r4 != 0) goto L_0x0022
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r1 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.LOW
            goto L_0x0030
        L_0x0022:
            if (r3 == r4) goto L_0x002e
            if (r2 != r4) goto L_0x0029
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r1 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.HIGH
            goto L_0x0030
        L_0x0029:
            if (r1 != r4) goto L_0x002e
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r1 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.IMMEDIATE
            goto L_0x0030
        L_0x002e:
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r1 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.NORMAL
        L_0x0030:
            boolean r4 = r0.b()
            int r0 = r0.c()
            r9 = r0
            r8 = r1
            goto L_0x003d
        L_0x003b:
            r8 = r0
            r9 = 0
        L_0x003d:
            if (r9 <= 0) goto L_0x004a
            com.bytedance.frameworks.baselib.network.http.retrofit.a$1 r0 = new com.bytedance.frameworks.baselib.network.http.retrofit.a$1
            java.lang.String r7 = "SsHttpDelayedExecutor"
            r5 = r0
            r6 = r12
            r10 = r13
            r5.<init>(r7, r8, r9, r10)
            goto L_0x0051
        L_0x004a:
            com.bytedance.frameworks.baselib.network.http.retrofit.a$2 r0 = new com.bytedance.frameworks.baselib.network.http.retrofit.a$2
            java.lang.String r1 = "SsHttpExecutor"
            r0.<init>(r1, r8, r13)
        L_0x0051:
            com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue r13 = f19858a
            if (r13 != 0) goto L_0x005b
            com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue r13 = com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue.getDefaultRequestQueue()
            f19858a = r13
        L_0x005b:
            if (r4 == 0) goto L_0x0063
            com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue r13 = f19858a
            r13.addDownload(r0)
            goto L_0x00b1
        L_0x0063:
            com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue r13 = f19858a
            r13.add(r0)
        L_0x0068:
            return
        L_0x0069:
            if (r13 == 0) goto L_0x00b1
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r0 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.NORMAL
            boolean r5 = r13 instanceof com.bytedance.retrofit2.r
            if (r5 == 0) goto L_0x0098
            r0 = r13
            com.bytedance.retrofit2.r r0 = (com.bytedance.retrofit2.r) r0
            int r4 = r0.a()
            if (r4 != 0) goto L_0x007d
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r1 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.LOW
            goto L_0x008b
        L_0x007d:
            if (r3 == r4) goto L_0x0089
            if (r2 != r4) goto L_0x0084
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r1 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.HIGH
            goto L_0x008b
        L_0x0084:
            if (r1 != r4) goto L_0x0089
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r1 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.IMMEDIATE
            goto L_0x008b
        L_0x0089:
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r1 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.NORMAL
        L_0x008b:
            boolean r4 = r0.b()
            int r0 = r0.c()
            r11 = r4
            r4 = r0
            r0 = r1
            r1 = r11
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            com.ss.android.ugc.aweme.net.a r2 = new com.ss.android.ugc.aweme.net.a
            java.lang.String r3 = "NetExecutor"
            r2.<init>(r3, r0, r4, r13)
            if (r1 == 0) goto L_0x00aa
            com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue r13 = com.ss.android.ugc.aweme.net.ag.a()
            r13.addDownload(r2)
            return
        L_0x00aa:
            com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue r13 = com.ss.android.ugc.aweme.net.ag.a()
            r13.add(r2)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.retrofit.a.execute(java.lang.Runnable):void");
    }
}
