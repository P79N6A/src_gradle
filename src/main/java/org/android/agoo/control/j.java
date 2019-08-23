package org.android.agoo.control;

import com.taobao.accs.client.a;
import org.android.agoo.message.MessageService;

public class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseIntentService f84018a;

    public void run() {
        a.g.incrementAndGet();
        this.f84018a.notifyManager = new NotifManager();
        this.f84018a.notifyManager.init(this.f84018a.getApplicationContext());
        this.f84018a.messageService = new MessageService();
        this.f84018a.messageService.a(this.f84018a.getApplicationContext());
        this.f84018a.agooFactory = new AgooFactory();
        this.f84018a.agooFactory.init(this.f84018a.getApplicationContext(), this.f84018a.notifyManager, this.f84018a.messageService);
    }

    j(BaseIntentService baseIntentService) {
        this.f84018a = baseIntentService;
    }
}
