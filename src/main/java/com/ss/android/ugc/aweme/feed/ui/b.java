package com.ss.android.ugc.aweme.feed.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import io.reactivex.functions.Consumer;
import java.util.Map;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46548a;

    /* renamed from: b  reason: collision with root package name */
    private final a f46549b;

    /* renamed from: c  reason: collision with root package name */
    private final long f46550c;

    /* renamed from: d  reason: collision with root package name */
    private final User f46551d;

    /* renamed from: e  reason: collision with root package name */
    private final Consumer f46552e;

    b(a aVar, long j, User user, Consumer consumer) {
        this.f46549b = aVar;
        this.f46550c = j;
        this.f46551d = user;
        this.f46552e = consumer;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f46548a, false, 42404, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f46548a, false, 42404, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f46549b;
        long j = this.f46550c;
        User user = this.f46551d;
        Consumer consumer = this.f46552e;
        Map map = (Map) obj;
        if (map != null) {
            Long l = (Long) map.get(Long.valueOf(j));
            if (l == null || l.longValue() == 0) {
                l = 0L;
                user.roomId = 0;
                aVar.d();
            } else {
                user.roomId = l.longValue();
            }
            if (consumer != null) {
                consumer.accept(new com.ss.android.ugc.aweme.live.feedpage.b(j, l.longValue()));
            }
        }
    }
}
