package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.m;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class c extends d {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f50915c;

    /* renamed from: d  reason: collision with root package name */
    protected Map<String, aa> f50916d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    protected Queue<aa> f50917e = new LinkedBlockingQueue();

    /* renamed from: f  reason: collision with root package name */
    protected Thread f50918f = new z("upload_thread", this.f50917e, this.f50916d);

    public ab a(n nVar, BaseContent baseContent) {
        return null;
    }

    public c() {
        this.f50918f.start();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f50915c, false, 51232, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50915c, false, 51232, new Class[0], Void.TYPE);
            return;
        }
        super.d();
    }

    public final void a(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f50915c, false, 51230, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, f50915c, false, 51230, new Class[]{n.class}, Void.TYPE);
            return;
        }
        BaseContent content = m.content(nVar);
        if (content != null) {
            a(a(nVar, content));
        }
    }

    public final void a(ab abVar) {
        if (PatchProxy.isSupport(new Object[]{abVar}, this, f50915c, false, 51231, new Class[]{ab.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{abVar}, this, f50915c, false, 51231, new Class[]{ab.class}, Void.TYPE);
            return;
        }
        if (abVar != null) {
            this.f50917e.offer(abVar);
        }
        synchronized (this.f50917e) {
            this.f50917e.notify();
        }
    }
}
