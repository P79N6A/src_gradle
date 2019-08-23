package com.ss.android.ugc.aweme.im.sdk.module.stranger;

import android.os.Message;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.im.sdk.model.StrangerSessionList;
import com.ss.android.ugc.aweme.im.sdk.model.e;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.g;
import com.ss.android.ugc.aweme.im.sdk.utils.aj;
import com.ss.android.ugc.aweme.im.sdk.utils.r;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public final class b implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51958a;

    /* renamed from: b  reason: collision with root package name */
    public WeakHandler f51959b;

    /* renamed from: c  reason: collision with root package name */
    public C0605b f51960c;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f51966a = new b((byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.b$b  reason: collision with other inner class name */
    public interface C0605b {
        void onFetch(g gVar);
    }

    public static b a() {
        return a.f51966a;
    }

    private b() {
        this.f51959b = new WeakHandler(this);
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(C0605b bVar) {
        C0605b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f51958a, false, 52531, new Class[]{C0605b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f51958a, false, 52531, new Class[]{C0605b.class}, Void.TYPE);
            return;
        }
        this.f51960c = bVar2;
        a(0, 1, false);
    }

    public final void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f51958a, false, 52533, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f51958a, false, 52533, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        Object obj = message2.obj;
        int i = message2.what;
        if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            UIUtils.displayToast(GlobalContext.getContext(), ((com.ss.android.ugc.aweme.base.api.a.b.a) obj).getErrorMsg());
        } else if (obj instanceof Exception) {
            UIUtils.displayToast(GlobalContext.getContext(), GlobalContext.getContext().getString(C0906R.string.avf));
        } else {
            if (i == 1) {
                StrangerSessionList strangerSessionList = (StrangerSessionList) obj;
                if (strangerSessionList != null) {
                    C0605b bVar = this.f51960c;
                    if (bVar != null) {
                        List a2 = e.a(strangerSessionList.getLastMsg());
                        if (a2 == null || a2.isEmpty()) {
                            bVar.onFetch(null);
                        } else {
                            bVar.onFetch((g) a2.get(0));
                            return;
                        }
                    }
                }
            }
        }
    }

    private void a(long j, long j2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{0L, 1L, (byte) 0}, this, f51958a, false, 52532, new Class[]{Long.TYPE, Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0L, 1L, (byte) 0}, this, f51958a, false, 52532, new Class[]{Long.TYPE, Long.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        m a2 = m.a();
        WeakHandler weakHandler = this.f51959b;
        AnonymousClass1 r1 = new Callable(0, 1, false) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51961a;

            public final Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f51961a, false, 52534, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f51961a, false, 52534, new Class[0], Object.class);
                }
                try {
                    return r.a(0, 1, false);
                } catch (ExecutionException e2) {
                    throw aj.a(e2);
                }
            }
        };
        a2.a(weakHandler, r1, 1);
    }
}
