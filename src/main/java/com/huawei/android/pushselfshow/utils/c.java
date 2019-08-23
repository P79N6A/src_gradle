package com.huawei.android.pushselfshow.utils;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

public class c extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference f25383a;

    public interface a {
        void handleMessage(Message message);
    }

    public c(a aVar) {
        this.f25383a = new WeakReference(aVar);
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        a aVar = (a) this.f25383a.get();
        if (aVar != null) {
            aVar.handleMessage(message);
        }
    }
}
