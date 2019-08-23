package com.amap.api.mapcore2d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.autonavi.amap.mapcore2d.Inner_3dMap_location;

public final class fo extends Handler {

    /* renamed from: a  reason: collision with root package name */
    fm f6158a;

    public fo(Looper looper, fm fmVar) {
        super(looper);
        this.f6158a = fmVar;
    }

    public fo(fm fmVar) {
        this.f6158a = fmVar;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            try {
                if (this.f6158a != null) {
                    this.f6158a.a((Inner_3dMap_location) message.obj);
                }
            } catch (Throwable th) {
                gc.a(th, "ClientResultHandler", "RESULT_LOCATION_FINISH");
            }
        }
    }
}
