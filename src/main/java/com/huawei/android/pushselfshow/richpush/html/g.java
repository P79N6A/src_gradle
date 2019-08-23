package com.huawei.android.pushselfshow.richpush.html;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HtmlViewer f25342a;

    g(HtmlViewer htmlViewer) {
        this.f25342a = htmlViewer;
    }

    public void run() {
        if (this.f25342a.b(this.f25342a.f25260d) < 1000) {
            this.f25342a.f25262f.b();
        } else {
            this.f25342a.f25258b.sendEmptyMessage(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
    }
}
