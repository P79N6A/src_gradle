package com.ss.android.ugc.effectmanager.effect.e.b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.d.a;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.common.i;
import com.ss.android.ugc.effectmanager.effect.e.a.e;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.g;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public final class d extends com.ss.android.ugc.effectmanager.common.e.d implements i.a {

    /* renamed from: e  reason: collision with root package name */
    private static Field f77436e;

    /* renamed from: f  reason: collision with root package name */
    private a f77437f;
    private com.ss.android.ugc.effectmanager.a.a g;
    private g h = this.g.f77204a;
    private Queue<Effect> i;
    private List<Effect> j;
    private Handler k;

    public final void a() {
        Looper.prepare();
        Looper myLooper = Looper.myLooper();
        try {
            this.k = new i(myLooper, this);
            Effect poll = this.i.poll();
            if (poll != null) {
                b(poll);
                Looper.loop();
            }
        } catch (Throwable th) {
            myLooper.quit();
            a(Thread.currentThread());
            throw th;
        }
        myLooper.quit();
        a(Thread.currentThread());
    }

    private void b(final Effect effect) {
        this.k.post(new Runnable() {
            public final void run() {
                d.this.a(effect);
            }
        });
    }

    private static void a(Thread thread) {
        Field field;
        try {
            if (f77436e != null) {
                field = f77436e;
            } else {
                if (Build.VERSION.SDK_INT >= 24) {
                    field = Thread.class.getDeclaredField("threadLocals");
                } else {
                    field = Thread.class.getDeclaredField("localValues");
                }
                f77436e = field;
            }
            field.setAccessible(true);
            field.set(thread, null);
        } catch (Exception unused) {
        }
    }

    public final void a(Message message) {
        if (message.what == 15) {
            e eVar = (e) message.obj;
            Effect effect = eVar.f77398b;
            c cVar = eVar.f77399c;
            if (cVar != null) {
                a(17, new com.ss.android.ugc.effectmanager.effect.e.a.d(this.j, cVar));
                Looper.myLooper().quit();
                return;
            }
            this.j.add(effect);
            if (!this.i.isEmpty()) {
                b(this.i.poll());
            } else {
                a(17, new com.ss.android.ugc.effectmanager.effect.e.a.d(this.j, null));
                Looper.myLooper().quit();
            }
        }
    }

    public final void a(Effect effect) {
        if (TextUtils.isEmpty(effect.zipPath) || TextUtils.isEmpty(effect.unzipPath)) {
            effect.zipPath = this.h.i + File.separator + effect.id + ".zip";
            StringBuilder sb = new StringBuilder();
            sb.append(this.h.i);
            sb.append(File.separator);
            sb.append(effect.id);
            effect.unzipPath = sb.toString();
        }
        if (!this.f77437f.d(effect.id)) {
            try {
                new e(effect, this.g, this.f77322b, this.k).a();
            } catch (RuntimeException e2) {
                throw e2;
            }
        } else {
            e eVar = new e(effect, null);
            Message obtainMessage = this.k.obtainMessage(15);
            obtainMessage.obj = eVar;
            obtainMessage.sendToTarget();
        }
    }

    public d(com.ss.android.ugc.effectmanager.a.a aVar, List<Effect> list, String str, Handler handler) {
        super(handler, str, "NETWORK");
        this.g = aVar;
        this.f77437f = aVar.f77204a.r;
        this.i = new ArrayDeque(list);
        this.j = new ArrayList();
    }
}
