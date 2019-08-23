package anetwork.channel.unified;

import anet.channel.thread.ThreadPoolExecutorFactory;

public class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f1575a;

    public void run() {
        ThreadPoolExecutorFactory.submitPriorityTask(this.f1575a, ThreadPoolExecutorFactory.Priority.HIGH);
    }

    f(e eVar) {
        this.f1575a = eVar;
    }
}
