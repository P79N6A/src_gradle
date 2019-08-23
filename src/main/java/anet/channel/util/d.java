package anet.channel.util;

import anet.channel.statist.NetTypeStat;
import anet.channel.thread.ThreadPoolExecutorFactory;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f1442a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NetTypeStat f1443b;

    public final void run() {
        ThreadPoolExecutorFactory.submitPriorityTask(new e(this), ThreadPoolExecutorFactory.Priority.LOW);
    }

    d(String str, NetTypeStat netTypeStat) {
        this.f1442a = str;
        this.f1443b = netTypeStat;
    }
}
