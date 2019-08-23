package com.ss.android.ugc.aweme.feed.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class b implements a<String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44617a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, Aweme> f44618b = new HashMap();

    public final void b() {
    }

    public final Collection<Aweme> a() {
        if (!PatchProxy.isSupport(new Object[0], this, f44617a, false, 40893, new Class[0], Collection.class)) {
            return this.f44618b.values();
        }
        return (Collection) PatchProxy.accessDispatch(new Object[0], this, f44617a, false, 40893, new Class[0], Collection.class);
    }

    public final /* synthetic */ Aweme a(Object obj) {
        String str = (String) obj;
        if (!PatchProxy.isSupport(new Object[]{str}, this, f44617a, false, 40890, new Class[]{String.class}, Aweme.class)) {
            return this.f44618b.get(str);
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[]{str}, this, f44617a, false, 40890, new Class[]{String.class}, Aweme.class);
    }

    public final /* synthetic */ boolean b(Object obj) {
        String str = (String) obj;
        if (!PatchProxy.isSupport(new Object[]{str}, this, f44617a, false, 40892, new Class[]{String.class}, Boolean.TYPE)) {
            return this.f44618b.containsKey(str);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f44617a, false, 40892, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final /* synthetic */ void a(Object obj, Aweme aweme) {
        Aweme aweme2 = aweme;
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{str, aweme2}, this, f44617a, false, 40891, new Class[]{String.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aweme2}, this, f44617a, false, 40891, new Class[]{String.class, Aweme.class}, Void.TYPE);
            return;
        }
        this.f44618b.put(str, aweme2);
    }
}
