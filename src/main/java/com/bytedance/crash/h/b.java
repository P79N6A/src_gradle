package com.bytedance.crash.h;

import android.content.Context;
import android.os.Handler;
import com.bytedance.crash.j;
import com.bytedance.crash.runtime.a;
import com.ss.android.ugc.aweme.shortvideo.ea;
import java.util.Map;

public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    private Context f19461d;

    public final void run() {
        try {
            Map<String, Object> a2 = j.a().f19511a.a();
            if (a2 != null) {
                if (!a.a(a2)) {
                    com.bytedance.crash.runtime.j.a(this.f19461d, a2).a();
                    return;
                }
            }
            a(this.f19460c);
        } catch (Throwable unused) {
        }
    }

    b(Handler handler, long j, long j2, Context context) {
        super(handler, 0, ea.f66827f);
        this.f19461d = context;
    }
}
