package com.bytedance.im.core.b.d;

import android.os.Looper;
import android.os.Message;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.b.e.l;
import com.bytedance.im.core.c.d;
import java.util.concurrent.Executor;

public final class e<T> implements l.a, Runnable {

    /* renamed from: a  reason: collision with root package name */
    private d<T> f21182a;

    /* renamed from: b  reason: collision with root package name */
    private c<T> f21183b;

    /* renamed from: c  reason: collision with root package name */
    private T f21184c;

    /* renamed from: d  reason: collision with root package name */
    private l f21185d = new l(Looper.getMainLooper(), this);

    /* renamed from: e  reason: collision with root package name */
    private Executor f21186e;

    private void a() {
        this.f21186e.execute(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r2 = this;
            com.bytedance.im.core.b.d.d<T> r0 = r2.f21182a
            if (r0 == 0) goto L_0x000f
            com.bytedance.im.core.b.d.d<T> r0 = r2.f21182a     // Catch:{ Exception -> 0x000b }
            java.lang.Object r0 = r0.a()     // Catch:{ Exception -> 0x000b }
            goto L_0x0010
        L_0x000b:
            r0 = move-exception
            com.bytedance.im.core.c.d.a(r0)
        L_0x000f:
            r0 = 0
        L_0x0010:
            r2.f21184c = r0
            com.bytedance.im.core.b.e.l r0 = r2.f21185d
            if (r0 == 0) goto L_0x0026
            android.os.Message r0 = android.os.Message.obtain()
            r1 = 100001(0x186a1, float:1.40131E-40)
            r0.what = r1
            r0.obj = r2
            com.bytedance.im.core.b.e.l r1 = r2.f21185d
            r1.sendMessage(r0)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.d.e.run():void");
    }

    public final void a(Message message) {
        if (message.obj instanceof e) {
            e eVar = (e) message.obj;
            if (message.what == 100001 && eVar.f21183b != null) {
                try {
                    eVar.f21183b.a(eVar.f21184c);
                } catch (Exception e2) {
                    d.a(e2);
                }
            }
        }
    }

    public static <T> void a(d<T> dVar, c<T> cVar) {
        if (c.a().f20881e) {
            new e(dVar, cVar, a.a()).a();
        }
    }

    private e(d<T> dVar, c<T> cVar, Executor executor) {
        this.f21182a = dVar;
        this.f21183b = cVar;
        this.f21186e = executor;
    }

    public static <T> void a(d<T> dVar, c<T> cVar, Executor executor) {
        if (c.a().f20881e) {
            new e(dVar, cVar, executor).a();
        }
    }
}
