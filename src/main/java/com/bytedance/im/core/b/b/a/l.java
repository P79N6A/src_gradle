package com.bytedance.im.core.b.b.a;

import android.os.Build;
import android.os.SystemClock;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.b.c.e;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.b.e.k;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.proto.IMCMD;
import com.bytedance.im.core.proto.Refer;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class l<T> {

    /* renamed from: c  reason: collision with root package name */
    protected int f21059c;

    /* renamed from: d  reason: collision with root package name */
    b<T> f21060d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static a f21063a;

        /* renamed from: b  reason: collision with root package name */
        private long f21064b;

        private a() {
            if (this.f21064b == 0) {
                this.f21064b = (long) new Random().nextInt(1000000);
            }
        }

        public static a a() {
            if (f21063a == null) {
                synchronized (a.class) {
                    if (f21063a == null) {
                        f21063a = new a();
                    }
                }
            }
            return f21063a;
        }

        public final synchronized long b() {
            long j;
            if (this.f21064b <= 0) {
                this.f21064b = 1;
            }
            j = this.f21064b;
            this.f21064b = 1 + j;
            return j;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(f fVar, Runnable runnable);

    /* access modifiers changed from: protected */
    public boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(f fVar);

    public l(int i) {
        this.f21059c = i;
    }

    /* access modifiers changed from: package-private */
    public final void a(T t) {
        if (this.f21060d != null) {
            this.f21060d.a(t);
        }
    }

    public final void b(f fVar) {
        if (this.f21060d != null) {
            this.f21060d.a(j.a(fVar));
        }
    }

    public final void c(final f fVar) {
        SendMessageRequestBody sendMessageRequestBody;
        k.a();
        if (!fVar.g()) {
            if (fVar.i == d.b.f20890b || fVar.i == d.b.f20891c) {
                c.a().f20879c.a(fVar.i);
            } else if (fVar.i == d.b.f20892d && this.f21059c == IMCMD.SEND_MESSAGE.getValue()) {
                if (fVar.f21167f.body != null) {
                    sendMessageRequestBody = fVar.f21167f.body.send_message_body;
                } else {
                    sendMessageRequestBody = null;
                }
                if (sendMessageRequestBody != null) {
                    m.a();
                    m.b(sendMessageRequestBody.conversation_id);
                }
            }
        }
        a(fVar, (Runnable) new Runnable() {
            public final void run() {
                if (fVar.f21165d != null) {
                    if (!fVar.g() || !l.this.a(fVar)) {
                        fVar.f21165d.b(fVar);
                    } else {
                        fVar.f21165d.a(fVar);
                    }
                }
            }
        });
    }

    public l(int i, b<T> bVar) {
        this.f21059c = i;
        if (bVar != null) {
            this.f21060d = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(T t, f fVar) {
        if (this.f21060d != null) {
            try {
                if (!(this.f21060d instanceof com.bytedance.im.core.a.a.c) || fVar == null) {
                    this.f21060d.a(t);
                    return;
                }
                ((com.bytedance.im.core.a.a.c) this.f21060d).a(t, j.a(fVar));
            } catch (Exception e2) {
                com.bytedance.im.core.c.d.a(e2);
            }
        }
    }

    public final long a(int i, RequestBody requestBody, e eVar, Object... objArr) {
        int i2 = this.f21059c;
        Map f2 = c.a().f20879c.f();
        if (f2 == null) {
            f2 = new HashMap();
        }
        if (c.a().b().A) {
            f2.put("expected_user_id", String.valueOf(c.a().f20879c.a()));
        }
        Request build = new Request.Builder().sequence_id(Long.valueOf(a.a().b())).sdk_version("4.0.3").token(c.a().f20879c.b()).refer(Refer.ANDROID).device_id(c.a().f20879c.c()).inbox_type(Integer.valueOf(i)).build_number("403").channel(c.a().b().f20898d).device_platform("android").device_type(Build.MODEL).os_version(Build.VERSION.RELEASE).version_code(String.valueOf(c.a().b().f20897c)).cmd(Integer.valueOf(i2)).body(requestBody).headers(f2).build();
        f fVar = new f(build.sequence_id.longValue(), this);
        fVar.f21167f = build;
        fVar.f21166e = objArr;
        fVar.f21164c = a();
        fVar.f21165d = eVar;
        fVar.j = SystemClock.uptimeMillis();
        com.bytedance.im.core.b.c.b a2 = com.bytedance.im.core.b.c.b.a();
        if (fVar.d() == IMCMD.SEND_MESSAGE.getValue()) {
            a2.f21151a.a(fVar);
        } else {
            a2.f21152b.a(fVar);
        }
        return fVar.f21162a;
    }
}
