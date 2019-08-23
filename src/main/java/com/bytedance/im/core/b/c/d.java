package com.bytedance.im.core.b.c;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.a.a;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.c.a.b;
import com.bytedance.im.core.b.e.h;
import com.bytedance.im.core.b.e.l;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class d implements c, l.a {

    /* renamed from: a  reason: collision with root package name */
    private l f21153a;

    /* renamed from: b  reason: collision with root package name */
    private l f21154b;

    /* renamed from: c  reason: collision with root package name */
    private l f21155c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue<f> f21156d = new ConcurrentLinkedQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private Map<Long, f> f21157e = new ConcurrentHashMap();

    private synchronized void b() {
        if (this.f21156d != null) {
            this.f21156d.clear();
        }
        if (this.f21157e != null) {
            this.f21157e.clear();
        }
    }

    d() {
        HandlerThread handlerThread = new HandlerThread("IM-CORE-QUEUE");
        handlerThread.start();
        this.f21153a = new l(handlerThread.getLooper(), this);
        this.f21154b = new l(handlerThread.getLooper(), this);
    }

    public final void a() {
        this.f21153a.removeMessages(BaseLoginOrRegisterActivity.o);
        this.f21154b.removeMessages(102);
        this.f21153a.removeMessages(103);
        this.f21153a.removeMessages(105);
        this.f21153a.sendEmptyMessage(104);
    }

    public final void a(l lVar) {
        this.f21155c = lVar;
    }

    private void e(f fVar) {
        this.f21156d.add(fVar);
        Message obtain = Message.obtain();
        obtain.what = 103;
        obtain.obj = fVar;
        this.f21153a.sendMessageDelayed(obtain, (long) c.a().b().m);
    }

    private void f(f fVar) {
        if (!this.f21156d.isEmpty()) {
            this.f21156d.remove(fVar);
            g(fVar);
        }
    }

    private void g(f fVar) {
        if (this.f21155c != null) {
            Message obtain = Message.obtain(this.f21155c, fVar.d());
            obtain.obj = fVar;
            this.f21155c.sendMessage(obtain);
        }
    }

    public final void a(Response response) {
        if (response != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = response;
            obtain.arg1 = 1;
            this.f21154b.sendMessage(obtain);
        }
    }

    private f b(Response response) {
        if (response == null) {
            return null;
        }
        Iterator<f> it2 = this.f21156d.iterator();
        while (it2.hasNext()) {
            f next = it2.next();
            if (next.f21167f != null && next.f21163b == response.sequence_id.longValue()) {
                return next;
            }
        }
        return null;
    }

    public final void a(f fVar) {
        if (fVar != null && fVar.f21167f != null && fVar.f21167f.cmd.intValue() > IMCMD.IMCMD_NOT_USED.getValue()) {
            Message obtain = Message.obtain();
            obtain.what = BaseLoginOrRegisterActivity.o;
            obtain.obj = fVar;
            this.f21153a.sendMessage(obtain);
        }
    }

    public final void b(f fVar) {
        if (fVar != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = fVar;
            obtain.arg1 = 2;
            this.f21154b.sendMessage(obtain);
        }
    }

    private void c(f fVar) {
        try {
            Request request = fVar.f21167f;
            h.a("Start Send Request By WS: " + request.cmd, request);
            Pair<String, byte[]> a2 = g.a(request);
            c.a().f20879c.a(request.cmd.intValue(), request.sequence_id.longValue(), (String) a2.first, (byte[]) a2.second);
            fVar.a();
            e(fVar);
        } catch (a e2) {
            if (e2.getErrorCode() == -2004) {
                fVar.f21164c = true;
                d(fVar);
            } else {
                fVar.i = e2.getErrorCode();
                f(fVar);
                com.bytedance.im.core.b.e.d.a("sendByWs cmd:" + fVar.d(), (Throwable) e2);
                com.bytedance.im.core.c.d.a("im_pb_encode_error", fVar.d(), 1.0f);
            }
            com.bytedance.im.core.c.c.a().a("network").b("ws").a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.k)).a("error", e2).a("error_stack", com.bytedance.im.core.c.d.b(e2)).a("cmd", Integer.valueOf(fVar.d())).b();
        }
    }

    private void d(f fVar) {
        Request request = fVar.f21167f;
        h.a("Start Send Request By HTTP: " + request.cmd, request);
        b.a a2 = new b.a().a(i.a(request.cmd.intValue()));
        if (c.a().b().k == 0) {
            a2.b("application/x-protobuf");
            if (c.a().b().r == 0) {
                a2.a(request.encode());
            } else {
                a2.a(request);
            }
        } else {
            a2.b("application/json");
            if (c.a().b().r == 0) {
                a2.a(com.bytedance.im.core.b.e.c.f21187a.toJson((Object) request).getBytes());
            } else {
                a2.a(request);
            }
        }
        this.f21156d.add(fVar);
        b bVar = a2.f21144a;
        final long currentTimeMillis = System.currentTimeMillis();
        a aVar = c.a().f20879c;
        final f fVar2 = fVar;
        final b bVar2 = bVar;
        AnonymousClass1 r2 = new com.bytedance.im.core.b.c.a.a() {
            public final void a(com.bytedance.im.core.b.c.a.c cVar, String str, String str2, int i) {
                com.bytedance.im.core.b.c.a.c cVar2 = cVar;
                fVar2.a(cVar);
                d.this.b(fVar2);
                long uptimeMillis = SystemClock.uptimeMillis();
                com.bytedance.im.core.c.d.a(uptimeMillis - fVar2.k, currentTimeMillis, bVar2.f21140a, str, str2, 200, null);
                com.bytedance.im.core.c.c.a().a("network").b("http").a("duration", Long.valueOf(uptimeMillis - fVar2.k)).a("cmd", Integer.valueOf(fVar2.d())).a(PushConstants.WEB_URL, bVar2.f21140a).a("success", 1).b();
            }

            public final void a(Exception exc, String str, String str2, int i) {
                String str3;
                Exception exc2 = exc;
                f fVar = fVar2;
                if (exc2 == null) {
                    str3 = "";
                } else {
                    str3 = exc.getMessage();
                }
                fVar.a(-1000, str3);
                c.a();
                d.this.b(fVar2);
                com.bytedance.im.core.b.e.d.a("sendByHttp cmd:" + fVar2.d() + " url:" + bVar2.f21140a, (Throwable) exc2);
                long uptimeMillis = SystemClock.uptimeMillis();
                com.bytedance.im.core.c.d.b(uptimeMillis - fVar2.k, currentTimeMillis, bVar2.f21140a, str, str2, -1000, null);
                com.bytedance.im.core.c.c.a().a("network").b("http").a("duration", Long.valueOf(uptimeMillis - fVar2.k)).a("error", exc2).a("error_stack", com.bytedance.im.core.c.d.b(exc)).a("cmd", Integer.valueOf(fVar2.d())).a(PushConstants.WEB_URL, bVar2.f21140a).a("success", 0).b();
            }
        };
        aVar.a(bVar, r2);
    }

    public final void a(List<Long> list) {
        if (list != null && !list.isEmpty() && !this.f21156d.isEmpty()) {
            for (Long next : list) {
                Iterator<f> it2 = this.f21156d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    f next2 = it2.next();
                    if (next.longValue() == next2.f21162a) {
                        next2.f21165d = null;
                        break;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        r3 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Message r12) {
        /*
            r11 = this;
            int r0 = r12.what
            switch(r0) {
                case 101: goto L_0x0183;
                case 102: goto L_0x005d;
                case 103: goto L_0x0043;
                case 104: goto L_0x003f;
                case 105: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x01a4
        L_0x0007:
            java.lang.Object r12 = r12.obj
            java.lang.Long r12 = (java.lang.Long) r12
            long r0 = r12.longValue()
            java.util.Map<java.lang.Long, com.bytedance.im.core.b.c.f> r12 = r11.f21157e
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x003e
            java.util.Map<java.lang.Long, com.bytedance.im.core.b.c.f> r12 = r11.f21157e
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            boolean r12 = r12.containsKey(r2)
            if (r12 != 0) goto L_0x0024
            goto L_0x003e
        L_0x0024:
            java.util.Map<java.lang.Long, com.bytedance.im.core.b.c.f> r12 = r11.f21157e
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object r12 = r12.get(r2)
            com.bytedance.im.core.b.c.f r12 = (com.bytedance.im.core.b.c.f) r12
            r11.a((com.bytedance.im.core.b.c.f) r12)
            java.util.Map<java.lang.Long, com.bytedance.im.core.b.c.f> r12 = r11.f21157e
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.remove(r0)
            goto L_0x01a4
        L_0x003e:
            return
        L_0x003f:
            r11.b()
            return
        L_0x0043:
            java.lang.Object r12 = r12.obj
            com.bytedance.im.core.b.c.f r12 = (com.bytedance.im.core.b.c.f) r12
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.im.core.b.c.f> r0 = r11.f21156d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01a4
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.im.core.b.c.f> r0 = r11.f21156d
            boolean r0 = r0.contains(r12)
            if (r0 != 0) goto L_0x0059
            goto L_0x01a4
        L_0x0059:
            r11.a((com.bytedance.im.core.b.c.f) r12)
            return
        L_0x005d:
            java.lang.Object r0 = r12.obj
            boolean r0 = r0 instanceof com.bytedance.im.core.proto.Response
            r1 = 0
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r12.obj
            com.bytedance.im.core.proto.Response r0 = (com.bytedance.im.core.proto.Response) r0
            r2 = r1
            goto L_0x007c
        L_0x006a:
            java.lang.Object r0 = r12.obj
            boolean r0 = r0 instanceof com.bytedance.im.core.b.c.f
            if (r0 == 0) goto L_0x007a
            java.lang.Object r0 = r12.obj
            com.bytedance.im.core.b.c.f r0 = (com.bytedance.im.core.b.c.f) r0
            com.bytedance.im.core.proto.Response r2 = r0.g
            r10 = r2
            r2 = r0
            r0 = r10
            goto L_0x007c
        L_0x007a:
            r0 = r1
            r2 = r0
        L_0x007c:
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x00c4
            com.bytedance.im.core.a.c r5 = com.bytedance.im.core.a.c.a()
            com.bytedance.im.core.a.e r5 = r5.b()
            int[] r5 = r5.o
            int r6 = r5.length
            r7 = 0
        L_0x008c:
            if (r7 >= r6) goto L_0x00a2
            r8 = r5[r7]
            java.lang.Integer r9 = r0.inbox_type
            if (r9 == 0) goto L_0x00a0
            java.lang.Integer r9 = r0.inbox_type
            int r9 = r9.intValue()
            if (r8 != r9) goto L_0x009d
            goto L_0x00a0
        L_0x009d:
            int r7 = r7 + 1
            goto L_0x008c
        L_0x00a0:
            r3 = 1
            goto L_0x00c4
        L_0x00a2:
            com.bytedance.im.core.a.c r5 = com.bytedance.im.core.a.c.a()
            com.bytedance.im.core.a.e r5 = r5.b()
            int[] r5 = r5.p
            if (r5 == 0) goto L_0x00c4
            int r6 = r5.length
            r7 = 0
        L_0x00b0:
            if (r7 >= r6) goto L_0x00c4
            r8 = r5[r7]
            java.lang.Integer r9 = r0.inbox_type
            if (r9 == 0) goto L_0x00a0
            java.lang.Integer r9 = r0.inbox_type
            int r9 = r9.intValue()
            if (r8 != r9) goto L_0x00c1
            goto L_0x00a0
        L_0x00c1:
            int r7 = r7 + 1
            goto L_0x00b0
        L_0x00c4:
            if (r3 == 0) goto L_0x0182
            com.bytedance.im.core.b.c.f r3 = com.bytedance.im.core.b.c.f.b(r0)
            if (r3 == 0) goto L_0x00e4
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "On Get Notify By WS: "
            r12.<init>(r1)
            java.lang.Integer r1 = r0.cmd
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.bytedance.im.core.b.e.h.a(r12, r0)
            r11.g(r3)
            goto L_0x01a4
        L_0x00e4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "On Get Response By NetType ("
            r3.<init>(r5)
            int r12 = r12.arg1
            r3.append(r12)
            java.lang.String r12 = "): "
            r3.append(r12)
            java.lang.Integer r12 = r0.cmd
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            com.bytedance.im.core.b.e.h.a(r12, r0)
            if (r2 != 0) goto L_0x017a
            com.bytedance.im.core.b.c.f r2 = r11.b((com.bytedance.im.core.proto.Response) r0)
            if (r2 == 0) goto L_0x017a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r3 = "find local waiting request item sequence_id: "
            r12.<init>(r3)
            long r5 = r2.f21163b
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            com.bytedance.im.core.b.e.d.a(r12)
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            java.lang.String r3 = "duration"
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ JSONException -> 0x0136 }
            long r7 = r2.k     // Catch:{ JSONException -> 0x0136 }
            r9 = 0
            long r5 = r5 - r7
            r12.put(r3, r5)     // Catch:{ JSONException -> 0x0136 }
            java.lang.String r3 = "retry"
            int r5 = r2.l     // Catch:{ JSONException -> 0x0136 }
            int r5 = r5 - r4
            r12.put(r3, r5)     // Catch:{ JSONException -> 0x0136 }
        L_0x0136:
            java.lang.String r3 = "im_ws_duration"
            com.bytedance.im.core.c.d.a((java.lang.String) r3, (org.json.JSONObject) r12, (org.json.JSONObject) r1)
            com.bytedance.im.core.c.c r12 = com.bytedance.im.core.c.c.a()
            java.lang.String r1 = "network"
            com.bytedance.im.core.c.c r12 = r12.a(r1)
            java.lang.String r1 = "ws"
            com.bytedance.im.core.c.c r12 = r12.b(r1)
            java.lang.String r1 = "duration"
            long r5 = android.os.SystemClock.uptimeMillis()
            long r7 = r2.k
            long r5 = r5 - r7
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            com.bytedance.im.core.c.c r12 = r12.a(r1, r3)
            java.lang.String r1 = "cmd"
            int r3 = r2.d()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.bytedance.im.core.c.c r12 = r12.a(r1, r3)
            java.lang.String r1 = "retry"
            int r3 = r2.l
            int r3 = r3 - r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.bytedance.im.core.c.c r12 = r12.a(r1, r3)
            r12.b()
        L_0x017a:
            if (r2 == 0) goto L_0x0182
            r2.a((com.bytedance.im.core.proto.Response) r0)
            r11.f(r2)
        L_0x0182:
            return
        L_0x0183:
            java.lang.Object r0 = r12.obj
            boolean r0 = r0 instanceof com.bytedance.im.core.b.c.f
            if (r0 == 0) goto L_0x01a3
            java.lang.Object r12 = r12.obj
            com.bytedance.im.core.b.c.f r12 = (com.bytedance.im.core.b.c.f) r12
            long r0 = android.os.SystemClock.uptimeMillis()
            r12.k = r0
            r12.b()
            boolean r0 = r12.e()
            if (r0 == 0) goto L_0x01a0
            r11.d(r12)
            goto L_0x01a4
        L_0x01a0:
            r11.c(r12)
        L_0x01a3:
            return
        L_0x01a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.c.d.a(android.os.Message):void");
    }
}
