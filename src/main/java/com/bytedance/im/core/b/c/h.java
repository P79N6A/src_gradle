package com.bytedance.im.core.b.c;

import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.im.core.a.a;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.c.a.b;
import com.bytedance.im.core.b.e.d;
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
import org.json.JSONException;
import org.json.JSONObject;

public final class h implements c, l.a {

    /* renamed from: a  reason: collision with root package name */
    private l f21168a;

    /* renamed from: b  reason: collision with root package name */
    private l f21169b;

    /* renamed from: c  reason: collision with root package name */
    private l f21170c;

    /* renamed from: d  reason: collision with root package name */
    private final ConcurrentLinkedQueue<f> f21171d = new ConcurrentLinkedQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private f f21172e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Long, f> f21173f = new ConcurrentHashMap();

    private synchronized void b() {
        if (this.f21171d != null) {
            this.f21171d.clear();
        }
        if (this.f21173f != null) {
            this.f21173f.clear();
        }
    }

    h() {
        HandlerThread handlerThread = new HandlerThread("IM-CORE-QUEUE");
        handlerThread.start();
        this.f21168a = new l(handlerThread.getLooper(), this);
        this.f21169b = new l(handlerThread.getLooper(), this);
    }

    private void d() {
        if (!this.f21168a.hasMessages(103) && !this.f21171d.isEmpty()) {
            this.f21168a.sendEmptyMessageDelayed(103, (long) c.a().b().m);
        }
    }

    public final void a() {
        this.f21168a.removeMessages(BaseLoginOrRegisterActivity.o);
        this.f21168a.removeMessages(102);
        this.f21168a.removeMessages(103);
        this.f21168a.removeMessages(105);
        this.f21169b.removeMessages(102);
        this.f21168a.sendEmptyMessage(104);
    }

    private void c() {
        if (!this.f21171d.isEmpty()) {
            f fVar = null;
            if (this.f21172e == null) {
                fVar = this.f21171d.peek();
                this.f21172e = fVar;
                if (fVar != null) {
                    fVar.k = SystemClock.uptimeMillis();
                }
            } else if (this.f21172e.f()) {
                d.d("request send timeout: " + this.f21172e.f21162a);
                this.f21172e.i = -1002;
                com.bytedance.im.core.c.d.a("im_ws_timeout", this.f21172e.d(), 1.0f);
                e(this.f21172e);
            } else {
                fVar = this.f21172e;
            }
            if (fVar != null) {
                fVar.b();
                fVar.c();
                if (fVar.e()) {
                    d(fVar);
                    return;
                }
                c(fVar);
            }
        }
    }

    public final void a(l lVar) {
        this.f21170c = lVar;
    }

    private void f(f fVar) {
        if (this.f21170c != null) {
            Message obtain = Message.obtain(this.f21170c, fVar.d());
            obtain.obj = fVar;
            this.f21170c.sendMessage(obtain);
        }
    }

    public final void a(Response response) {
        if (response != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = response;
            obtain.arg1 = 1;
            this.f21169b.sendMessage(obtain);
        }
    }

    private f b(Response response) {
        if (response == null) {
            return null;
        }
        Iterator<f> it2 = this.f21171d.iterator();
        while (it2.hasNext()) {
            f next = it2.next();
            if (next.f21167f != null && next.f21163b == response.sequence_id.longValue()) {
                return next;
            }
        }
        return null;
    }

    private void e(f fVar) {
        if (!this.f21171d.isEmpty()) {
            this.f21171d.remove(fVar);
            this.f21172e = null;
            f(fVar);
            this.f21168a.removeMessages(103);
            if (!this.f21171d.isEmpty()) {
                c();
            }
        }
    }

    public final void a(f fVar) {
        if (fVar != null && fVar.f21167f != null && fVar.f21167f.cmd.intValue() > IMCMD.IMCMD_NOT_USED.getValue()) {
            Message obtain = Message.obtain();
            obtain.what = BaseLoginOrRegisterActivity.o;
            obtain.obj = fVar;
            this.f21168a.sendMessage(obtain);
        }
    }

    public final void b(f fVar) {
        if (fVar != null) {
            Message obtain = Message.obtain();
            obtain.what = 102;
            obtain.obj = fVar;
            obtain.arg1 = 2;
            this.f21168a.sendMessage(obtain);
        }
    }

    private void c(f fVar) {
        try {
            Request request = fVar.f21167f;
            com.bytedance.im.core.b.e.h.a("Start Send Request By WS: " + request.cmd, request);
            Pair<String, byte[]> a2 = g.a(request);
            c.a().f20879c.a(request.cmd.intValue(), request.sequence_id.longValue(), (String) a2.first, (byte[]) a2.second);
            fVar.a();
            d();
        } catch (a e2) {
            if (e2.getErrorCode() == -2004) {
                fVar.f21164c = true;
                d(fVar);
            } else {
                fVar.i = e2.getErrorCode();
                e(fVar);
                d.a("sendByWs cmd:" + fVar.d(), (Throwable) e2);
                com.bytedance.im.core.c.d.a("im_pb_encode_error", fVar.d(), 1.0f);
            }
            com.bytedance.im.core.c.c.a().a("network").b("ws").a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.k)).a("error", e2).a("error_stack", com.bytedance.im.core.c.d.b(e2)).a("cmd", Integer.valueOf(fVar.d())).b();
        }
    }

    private void d(f fVar) {
        Request request = fVar.f21167f;
        com.bytedance.im.core.b.e.h.a("Start Send Request By HTTP: " + request.cmd, request);
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
        b bVar = a2.f21144a;
        final long currentTimeMillis = System.currentTimeMillis();
        a aVar = c.a().f20879c;
        final f fVar2 = fVar;
        final b bVar2 = bVar;
        AnonymousClass1 r2 = new com.bytedance.im.core.b.c.a.a() {
            public final void a(com.bytedance.im.core.b.c.a.c cVar, String str, String str2, int i) {
                com.bytedance.im.core.b.c.a.c cVar2 = cVar;
                fVar2.a(cVar);
                h.this.b(fVar2);
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
                h.this.b(fVar2);
                d.a("sendByHttp cmd:" + fVar2.d() + " url:" + bVar2.f21140a, (Throwable) exc2);
                long uptimeMillis = SystemClock.uptimeMillis();
                com.bytedance.im.core.c.d.b(uptimeMillis - fVar2.k, currentTimeMillis, bVar2.f21140a, str, str2, -1000, null);
                com.bytedance.im.core.c.c.a().a("network").b("http").a("duration", Long.valueOf(uptimeMillis - fVar2.k)).a("error", exc2).a("error_stack", com.bytedance.im.core.c.d.b(exc)).a("cmd", Integer.valueOf(fVar2.d())).a(PushConstants.WEB_URL, bVar2.f21140a).a("success", 0).b();
            }
        };
        aVar.a(bVar, r2);
    }

    public final void a(List<Long> list) {
        if (list != null && !list.isEmpty() && !this.f21171d.isEmpty()) {
            for (Long next : list) {
                Iterator<f> it2 = this.f21171d.iterator();
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

    public final void a(Message message) {
        f fVar;
        Response response;
        switch (message.what) {
            case BaseLoginOrRegisterActivity.o /*101*/:
                if (message.obj instanceof f) {
                    f fVar2 = (f) message.obj;
                    this.f21171d.add(fVar2);
                    if (!this.f21168a.hasMessages(103) && (this.f21171d.peek().f21162a == fVar2.f21162a || (this.f21172e != null && this.f21172e.f()))) {
                        this.f21168a.sendEmptyMessage(103);
                    }
                }
                return;
            case 102:
                if (message.obj instanceof Response) {
                    response = (Response) message.obj;
                    fVar = null;
                } else if (message.obj instanceof f) {
                    f fVar3 = (f) message.obj;
                    fVar = fVar3;
                    response = fVar3.g;
                } else {
                    response = null;
                    fVar = null;
                }
                boolean z = false;
                if (response != null) {
                    int[] iArr = c.a().b().o;
                    int length = iArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            int i2 = iArr[i];
                            if (!(response.inbox_type == null || i2 == response.inbox_type.intValue())) {
                                i++;
                            }
                        } else {
                            int[] iArr2 = c.a().b().p;
                            if (iArr2 != null) {
                                int length2 = iArr2.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < length2) {
                                        int i4 = iArr2[i3];
                                        if (!(response.inbox_type == null || i4 == response.inbox_type.intValue())) {
                                            i3++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                }
                if (z) {
                    f b2 = f.b(response);
                    if (b2 != null) {
                        com.bytedance.im.core.b.e.h.a("On Get Notify By WS: " + response.cmd, response);
                        f(b2);
                        break;
                    } else {
                        com.bytedance.im.core.b.e.h.a("On Get Response By NetType (" + message.arg1 + "): " + response.cmd, response);
                        if (fVar == null) {
                            fVar = b(response);
                            if (fVar != null) {
                                d.a("find local waiting request item sequence_id: " + fVar.f21163b);
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("duration", SystemClock.uptimeMillis() - fVar.k);
                                    jSONObject.put("retry", fVar.l - 1);
                                } catch (JSONException unused) {
                                }
                                com.bytedance.im.core.c.d.a("im_ws_duration", jSONObject, (JSONObject) null);
                                com.bytedance.im.core.c.c.a().a("network").b("ws").a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.k)).a("cmd", Integer.valueOf(fVar.d())).a("retry", Integer.valueOf(fVar.l - 1)).b();
                            }
                        }
                        if (fVar != null) {
                            fVar.a(response);
                            e(fVar);
                        }
                    }
                }
                return;
            case 103:
                c();
                return;
            case 104:
                b();
                return;
            case 105:
                long longValue = ((Long) message.obj).longValue();
                if (!this.f21173f.isEmpty() && this.f21173f.containsKey(Long.valueOf(longValue))) {
                    a(this.f21173f.get(Long.valueOf(longValue)));
                    this.f21173f.remove(Long.valueOf(longValue));
                    break;
                } else {
                    return;
                }
        }
    }
}
