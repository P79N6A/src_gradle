package com.bytedance.frameworks.apm.trace;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.frameworks.apm.trace.g;

public class MethodTracer implements c {
    private static HandlerThread sAnalyseThread;
    private static Context sContext;
    private static MethodTracer sInstance;
    private boolean isSupport = true;
    private Handler sAnalyseHandler = new Handler(sAnalyseThread.getLooper());

    public static MethodTracer getInstance() {
        if (sInstance == null) {
            synchronized (MethodTracer.class) {
                if (sInstance == null) {
                    sInstance = new MethodTracer();
                }
            }
        }
        return sInstance;
    }

    private MethodTracer() {
        HandlerThread handlerThread = new HandlerThread("trace-analyse-thread", 10);
        sAnalyseThread = handlerThread;
        handlerThread.start();
    }

    public static void release() {
        ActivityLifeObserver.getInstance().unregister(e.a());
        e.g.remove(getInstance());
        e a2 = e.a();
        if (e.f19655b) {
            e.f19655b = false;
            d.c("MethodCollector", "[onDestroy]", new Object[0]);
            e.g.clear();
            e.f19654a = 0;
            e.f19659f = null;
            e.h.removeMessages(1);
            ActivityLifeObserver.getInstance().unregister(a2);
        }
    }

    public static void init(Application application) {
        Object[] objArr = new Object[0];
        if (d.f19652a != null) {
            d.f19652a.b("method tracer init", objArr);
        }
        sContext = application;
        ActivityLifeObserver.getInstance().register(e.a());
        MethodTracer instance = getInstance();
        if (!e.g.contains(instance)) {
            e.g.add(instance);
        }
        e a2 = e.a();
        if (!e.f19655b) {
            e.h.removeMessages(1);
            e.h.sendEmptyMessage(1);
            ActivityLifeObserver.getInstance().register(a2);
            e.f19659f = new long[1000000];
            e.f19655b = true;
        }
    }

    public void pushFullBuffer(int i, int i2, long[] jArr) {
        b bVar = new b(i.FULL, ((System.nanoTime() / 1000000) - e.f19658e) - (jArr[0] & 8796093022207L), System.currentTimeMillis(), "");
        handleBuffer(i, i2, jArr, bVar);
    }

    public void doFrame(boolean z, String str, long j, g.a aVar) {
        if (this.isSupport) {
            int i = e.f19654a;
            if (z) {
                b bVar = new b(i.NORMAL, j, System.currentTimeMillis(), str);
                bVar.f19651e = aVar;
                d.a("MethodTracer", "[doFrame] dropped frame too much! lastIndex:%s index:%s", 0, Integer.valueOf(i));
                handleBuffer(0, i - 1, e.f19659f, bVar);
            }
            e.b();
        }
    }

    private void handleBuffer(int i, int i2, long[] jArr, b bVar) {
        if (jArr == null) {
            d.a("MethodTracer", "null == buffer", new Object[0]);
        } else if (bVar.f19648b < 0 || bVar.f19648b >= 6000) {
            d.a("MethodTracer", "[analyse] trace cost invalid:%d", Long.valueOf(bVar.f19648b));
        } else {
            int max = Math.max(0, i);
            int min = Math.min(jArr.length - 1, i2);
            if (max <= min) {
                int i3 = (min - max) + 1;
                long[] jArr2 = new long[i3];
                System.arraycopy(jArr, max, jArr2, 0, i3);
                if (this.sAnalyseHandler != null) {
                    this.sAnalyseHandler.post(new a(jArr2, bVar));
                }
            }
        }
    }
}
