package com.huawei.android.pushselfshow.richpush.html;

import android.view.MotionEvent;
import android.view.View;
import com.huawei.android.pushagent.utils.a.e;

public class c implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HtmlViewer f25338a;

    c(HtmlViewer htmlViewer) {
        this.f25338a = htmlViewer;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f25338a.f25261e != null && this.f25338a.f25261e.requestFocus()) {
            e.e("PushSelfShowLog", "webView.requestFocus");
        }
        return false;
    }
}
