package com.ss.android.push.daemon.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.common.utility.Logger;
import com.ss.android.push.daemon.b;
import com.ss.android.push.daemon.f;

public class a implements f {

    /* renamed from: a  reason: collision with root package name */
    protected Context f30402a;

    /* renamed from: b  reason: collision with root package name */
    protected b f30403b;

    /* renamed from: c  reason: collision with root package name */
    private ServiceConnection f30404c = new ServiceConnection() {
        public final void onServiceDisconnected(ComponentName componentName) {
            if (a.this.f30402a != null && a.this.f30403b != null) {
                try {
                    Logger.debug();
                    a.this.a();
                } catch (Throwable unused) {
                }
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Logger.debug();
            } catch (Throwable unused) {
            }
        }
    };

    public void a() {
    }

    public void a(Context context, b bVar) {
        this.f30402a = context.getApplicationContext();
        this.f30403b = bVar;
        try {
            Intent intent = new Intent(this.f30402a, Class.forName(bVar.f30411b.f30414b));
            intent.setAction("start_by_daemon_action");
            this.f30402a.startService(intent);
            this.f30402a.bindService(intent, this.f30404c, 1);
        } catch (Throwable unused) {
        }
    }

    public void b(Context context, b bVar) {
        this.f30402a = context.getApplicationContext();
        this.f30403b = bVar;
        try {
            Intent intent = new Intent(this.f30402a, Class.forName(bVar.f30410a.f30414b));
            intent.setAction("start_by_daemon_action");
            this.f30402a.startService(intent);
            this.f30402a.bindService(intent, this.f30404c, 1);
        } catch (Throwable unused) {
        }
    }
}
