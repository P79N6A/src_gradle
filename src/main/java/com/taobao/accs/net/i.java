package com.taobao.accs.net;

import anet.channel.strategy.StrategyCenter;

public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f79010a;

    public void run() {
        StrategyCenter.getInstance().saveData();
    }

    i(h hVar) {
        this.f79010a = hVar;
    }
}
