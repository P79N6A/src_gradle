package com.ss.android.ugc.aweme.main.story.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.model.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54906a;

    /* renamed from: b  reason: collision with root package name */
    public String f54907b;

    /* renamed from: c  reason: collision with root package name */
    public c f54908c;

    public final com.ss.android.ugc.aweme.story.model.a a() {
        if (!PatchProxy.isSupport(new Object[0], this, f54906a, false, 58305, new Class[0], com.ss.android.ugc.aweme.story.model.a.class)) {
            return this.f54908c.a(this.f54907b);
        }
        return (com.ss.android.ugc.aweme.story.model.a) PatchProxy.accessDispatch(new Object[0], this, f54906a, false, 58305, new Class[0], com.ss.android.ugc.aweme.story.model.a.class);
    }

    public a(String str, c cVar) {
        this.f54907b = str;
        this.f54908c = cVar;
    }
}
