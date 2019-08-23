package com.ss.android.http;

import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.message.e;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

public final class b implements WeakHandler.IHandler, e {

    /* renamed from: d  reason: collision with root package name */
    private static volatile int f29151d;

    /* renamed from: a  reason: collision with root package name */
    public a f29152a;

    /* renamed from: b  reason: collision with root package name */
    public Context f29153b;

    /* renamed from: c  reason: collision with root package name */
    final WeakHandler f29154c = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: e  reason: collision with root package name */
    private ContentObserver f29155e = new ContentObserver(this.f29154c) {
        public final void onChange(boolean z) {
            Logger.debug();
            b.this.b();
        }
    };

    public final void a(Intent intent) {
    }

    public final void handleMsg(Message message) {
    }

    public final void a() {
        if (this.f29152a != null && this.f29152a.c()) {
            try {
                this.f29152a.b();
            } catch (Throwable unused) {
            }
        }
        this.f29153b.getContentResolver().unregisterContentObserver(this.f29155e);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031 A[Catch:{ Exception -> 0x0054 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            android.content.Context r0 = r3.f29153b     // Catch:{ Exception -> 0x0054 }
            com.ss.android.http.c r0 = com.ss.android.http.c.a(r0)     // Catch:{ Exception -> 0x0054 }
            int r0 = r0.a()     // Catch:{ Exception -> 0x0054 }
            int r1 = f29151d     // Catch:{ Exception -> 0x0054 }
            if (r0 != r1) goto L_0x000f
            return
        L_0x000f:
            f29151d = r0     // Catch:{ Exception -> 0x0054 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0054 }
            com.ss.android.http.a r0 = r3.f29152a     // Catch:{ Exception -> 0x0054 }
            if (r0 == 0) goto L_0x0025
            com.ss.android.http.a r0 = r3.f29152a     // Catch:{ Exception -> 0x0054 }
            boolean r0 = r0.c()     // Catch:{ Exception -> 0x0054 }
            if (r0 == 0) goto L_0x0025
            com.ss.android.http.a r0 = r3.f29152a     // Catch:{ Throwable -> 0x0025 }
            r0.b()     // Catch:{ Throwable -> 0x0025 }
        L_0x0025:
            android.content.Context r0 = r3.f29153b     // Catch:{ Exception -> 0x0054 }
            com.ss.android.http.c r0 = com.ss.android.http.c.a(r0)     // Catch:{ Exception -> 0x0054 }
            boolean r0 = r0.b()     // Catch:{ Exception -> 0x0054 }
            if (r0 == 0) goto L_0x0053
            com.ss.android.http.a r0 = new com.ss.android.http.a     // Catch:{ Exception -> 0x0054 }
            android.content.Context r1 = r3.f29153b     // Catch:{ Exception -> 0x0054 }
            int r2 = f29151d     // Catch:{ Exception -> 0x0054 }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0054 }
            r3.f29152a = r0     // Catch:{ Exception -> 0x0054 }
            com.ss.android.http.a r0 = r3.f29152a     // Catch:{ Exception -> 0x0054 }
            com.ss.android.http.b$1 r1 = new com.ss.android.http.b$1     // Catch:{ Exception -> 0x0054 }
            r1.<init>()     // Catch:{ Exception -> 0x0054 }
            r0.f29166c = r1     // Catch:{ Exception -> 0x0054 }
            com.ss.android.http.a r0 = r3.f29152a     // Catch:{ Exception -> 0x0054 }
            boolean r0 = r0.c()     // Catch:{ Exception -> 0x0054 }
            if (r0 != 0) goto L_0x0053
            com.ss.android.http.a r0 = r3.f29152a     // Catch:{ Throwable -> 0x0053 }
            r0.a()     // Catch:{ Throwable -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            return
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.http.b.b():void");
    }

    public final void a(Context context) {
        this.f29153b = context.getApplicationContext();
        b();
        this.f29153b.getContentResolver().registerContentObserver(PushMultiProcessSharedProvider.a(context, "http_monitor_port", "integer"), true, this.f29155e);
    }
}
