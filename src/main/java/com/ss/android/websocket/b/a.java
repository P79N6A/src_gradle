package com.ss.android.websocket.b;

import android.content.Context;
import android.content.Intent;
import com.ss.android.websocket.b.b;
import com.ss.android.websocket.b.b.g;
import com.ss.android.websocket.b.d.c;
import com.ss.android.websocket.b.d.d;
import com.ss.android.websocket.b.d.e;
import com.ss.android.websocket.internal.WebSocketService;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f4341c;

    /* renamed from: a  reason: collision with root package name */
    public final C0832a f4342a;

    /* renamed from: b  reason: collision with root package name */
    private Context f4343b;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, b.a> f4344d = new HashMap();

    /* renamed from: com.ss.android.websocket.b.a$a  reason: collision with other inner class name */
    public static class C0832a {

        /* renamed from: a  reason: collision with root package name */
        public d f78185a;

        /* renamed from: b  reason: collision with root package name */
        public e f78186b;

        /* renamed from: c  reason: collision with root package name */
        public d f78187c;

        /* renamed from: d  reason: collision with root package name */
        public d f78188d;

        public final d a() {
            if (this.f78185a == null) {
                return this.f78188d;
            }
            return this.f78185a;
        }
    }

    public final d b() {
        return this.f4342a.a();
    }

    public final void a() {
        try {
            this.f4343b.startService(new Intent(this.f4343b, WebSocketService.class));
        } catch (Throwable unused) {
        }
    }

    public final b.a a(String str) {
        b.a aVar = this.f4344d.get(str);
        if (aVar == null) {
            return b.a.CLOSED;
        }
        return aVar;
    }

    @Subscribe
    public final void onEvent(g gVar) {
        if (gVar.f78219b != null) {
            this.f4344d.put(gVar.f78218a, gVar.f78219b);
        } else {
            this.f4344d.remove(gVar.f78218a);
        }
    }

    public static a a(Context context) {
        if (f4341c != null) {
            return f4341c;
        }
        synchronized (a.class) {
            if (f4341c == null) {
                C0832a aVar = new C0832a();
                aVar.f78188d = new com.ss.android.websocket.b.d.a(context);
                aVar.f78187c = new c(context);
                f4341c = new a(context, aVar);
            }
        }
        return f4341c;
    }

    private a(Context context, C0832a aVar) {
        this.f4343b = context;
        this.f4342a = aVar;
        if (!org.greenrobot.eventbus.c.a().b((Object) this)) {
            org.greenrobot.eventbus.c.a().a((Object) this);
        }
    }
}
