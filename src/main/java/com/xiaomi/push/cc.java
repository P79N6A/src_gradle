package com.xiaomi.push;

import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

public class cc extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ co f81884a;

    cc(co coVar) {
        this.f81884a = coVar;
    }

    public void handleMessage(Message message) {
        co coVar;
        synchronized (co.a(this.f81884a)) {
            int i = message.what;
            if (i != 3) {
                switch (i) {
                    case 0:
                        this.f81884a.a((HashMap) message.obj);
                        break;
                    case 1:
                        int unused = this.f81884a.f234a = 0;
                        if (co.a(this.f81884a) != null) {
                            co.a(this.f81884a).cancel(true);
                        }
                        coVar = this.f81884a;
                        break;
                }
            } else {
                if (message.obj != null) {
                    String str = (String) message.obj;
                    if (co.a(this.f81884a) != null) {
                        co.a(this.f81884a).d(str);
                    }
                }
                coVar = this.f81884a;
            }
            coVar.b();
        }
    }
}
