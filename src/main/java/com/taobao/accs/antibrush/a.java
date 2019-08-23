package com.taobao.accs.antibrush;

import com.taobao.accs.utl.ALog;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AntiBrush f78886a;

    public void run() {
        ALog.e("AntiBrush", "anti bursh timeout", new Object[0]);
        AntiBrush.onResult(this.f78886a.mContext, false);
    }

    a(AntiBrush antiBrush) {
        this.f78886a = antiBrush;
    }
}
