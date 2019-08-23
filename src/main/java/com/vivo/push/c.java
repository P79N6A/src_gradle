package com.vivo.push;

import android.os.Handler;
import android.os.Message;
import com.vivo.push.util.o;

public final class c implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f81531a;

    c(b bVar) {
        this.f81531a = bVar;
    }

    public final boolean handleMessage(Message message) {
        if (message == null) {
            o.a("AidlManager", "handleMessage error : msg is null");
            return false;
        }
        switch (message.what) {
            case 1:
                o.a("AidlManager", "In connect, bind core service time out");
                if (this.f81531a.f81489f.get() == 2) {
                    this.f81531a.a(1);
                    break;
                }
                break;
            case 2:
                if (this.f81531a.f81489f.get() == 4) {
                    this.f81531a.e();
                }
                this.f81531a.a(1);
                break;
            default:
                o.b("AidlManager", "unknow msg what [" + message.what + "]");
                break;
        }
        return true;
    }
}
