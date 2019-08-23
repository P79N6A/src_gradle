package com.bytedance.crash.h;

import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.shortvideo.ea;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private List<a> f19462a = new ArrayList(3);

    public final void a() {
        new StringBuilder("[ScheduleTaskManager] execute, task size=").append(this.f19462a.size());
        for (a next : this.f19462a) {
            try {
                if (next.f19459b > 0) {
                    next.f19458a.postDelayed(next, next.f19459b);
                } else {
                    next.f19458a.post(next);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static d a(Handler handler, Context context) {
        return new d(handler, context);
    }

    private d(Handler handler, Context context) {
        List<a> list = this.f19462a;
        Handler handler2 = handler;
        c cVar = new c(handler2, 0, ea.f66827f);
        list.add(cVar);
        List<a> list2 = this.f19462a;
        b bVar = new b(handler2, 0, ea.f66827f, context);
        list2.add(bVar);
    }
}
