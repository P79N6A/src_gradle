package com.huawei.android.pushselfshow.utils.b;

import com.huawei.android.pushagent.utils.a.e;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f25380a;

    c(b bVar) {
        this.f25380a = bVar;
    }

    public void run() {
        try {
            if (!(this.f25380a.f25375b == null || this.f25380a.f25376c == null)) {
                String a2 = this.f25380a.a(this.f25380a.f25375b, this.f25380a.f25376c, this.f25380a.f25377d);
                e.a("PushSelfShowLog", "getDownloadFileWithHandler success, and localfile =  " + a2);
                if (a2 != null) {
                    this.f25380a.a(a2);
                    return;
                }
            }
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "getDownloadFileWithHandler failed ", e2);
        }
        this.f25380a.c();
    }
}
