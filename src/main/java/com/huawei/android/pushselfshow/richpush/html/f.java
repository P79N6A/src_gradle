package com.huawei.android.pushselfshow.richpush.html;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HtmlViewer f25341a;

    f(HtmlViewer htmlViewer) {
        this.f25341a = htmlViewer;
    }

    public void run() {
        if (this.f25341a.b(this.f25341a.f25260d) < 1000) {
            this.f25341a.f25262f.b();
        } else {
            this.f25341a.f25258b.sendEmptyMessage(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
    }
}
