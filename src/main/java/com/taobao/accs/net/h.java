package com.taobao.accs.net;

import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import java.util.concurrent.TimeUnit;

public class h implements HttpDispatcher.IDispatchEventListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f79009a;

    h(g gVar) {
        this.f79009a = gVar;
    }

    public void onEvent(DispatchEvent dispatchEvent) {
        ThreadPoolExecutorFactory.schedule(new i(this), 2000, TimeUnit.MILLISECONDS);
    }
}
