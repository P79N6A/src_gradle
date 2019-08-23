package com.ss.android.ugc.aweme.im.sdk.utils;

import android.os.Message;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;

public final class ag extends aq<Pair<IMUser, BaseContent>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52474a;

    /* renamed from: d  reason: collision with root package name */
    private static ExecutorService f52475d;

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    public final ExecutorService a() {
        ExecutorService executorService;
        if (PatchProxy.isSupport(new Object[0], this, f52474a, false, 53673, new Class[0], ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[0], this, f52474a, false, 53673, new Class[0], ExecutorService.class);
        }
        if (f52475d == null) {
            if (PatchProxy.isSupport(new Object[0], null, ah.f52476a, true, 53675, new Class[0], ExecutorService.class)) {
                executorService = (ExecutorService) PatchProxy.accessDispatch(new Object[0], null, ah.f52476a, true, 53675, new Class[0], ExecutorService.class);
            } else {
                executorService = h.a(m.a(p.FIXED).a(1).a());
            }
            f52475d = executorService;
        }
        return f52475d;
    }

    public final /* bridge */ /* synthetic */ void handleMsg(Message message) {
        super.handleMsg(message);
    }

    private ag(q<Pair<IMUser, BaseContent>> qVar, p<Pair<IMUser, BaseContent>> pVar) {
        super(qVar, pVar);
    }

    public static void a(q<Pair<IMUser, BaseContent>> qVar, p<Pair<IMUser, BaseContent>> pVar) {
        q<Pair<IMUser, BaseContent>> qVar2 = qVar;
        p<Pair<IMUser, BaseContent>> pVar2 = pVar;
        if (PatchProxy.isSupport(new Object[]{qVar2, pVar2}, null, f52474a, true, 53672, new Class[]{q.class, p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{qVar2, pVar2}, null, f52474a, true, 53672, new Class[]{q.class, p.class}, Void.TYPE);
            return;
        }
        new ag(qVar2, pVar2).b();
    }
}
