package com.ss.android.ugc.aweme.account.globallistener;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class GlobalListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31971a;

    /* renamed from: b  reason: collision with root package name */
    public static List<WeakReference<a>> f31972b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    public static List<b> f31973c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static com.ss.android.ugc.aweme.account.login.model.a f31974d;

    public @interface NotifyType {
    }

    public interface a {
        void a(com.ss.android.ugc.aweme.account.login.model.a aVar);
    }

    public interface b {
        void a(@NotifyType int i);
    }

    public static void a(@NonNull b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, f31971a, true, 19969, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, null, f31971a, true, 19969, new Class[]{b.class}, Void.TYPE);
            return;
        }
        f31973c.remove(bVar2);
    }

    public static void a(@NotifyType int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f31971a, true, 19970, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f31971a, true, 19970, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        for (b a2 : f31973c) {
            a2.a(i);
        }
    }

    public static void a(@NonNull com.ss.android.ugc.aweme.account.login.model.a aVar) {
        com.ss.android.ugc.aweme.account.login.model.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f31971a, true, 19967, new Class[]{com.ss.android.ugc.aweme.account.login.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f31971a, true, 19967, new Class[]{com.ss.android.ugc.aweme.account.login.model.a.class}, Void.TYPE);
            return;
        }
        synchronized (GlobalListener.class) {
            f31974d = aVar2;
            Iterator<WeakReference<a>> it2 = f31972b.iterator();
            while (it2.hasNext()) {
                WeakReference next = it2.next();
                if (next.get() == null) {
                    it2.remove();
                } else {
                    ((a) next.get()).a(aVar2);
                }
            }
        }
    }
}
