package com.taobao.accs.client;

import com.taobao.accs.utl.UtilityImpl;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GlobalClientInfo f78921a;

    public void run() {
        GlobalClientInfo.f78905c = UtilityImpl.p(GlobalClientInfo.f78903a);
    }

    c(GlobalClientInfo globalClientInfo) {
        this.f78921a = globalClientInfo;
    }
}
