package com.ss.android.ugc.aweme.tools.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4267a;

    /* renamed from: b  reason: collision with root package name */
    final c f4268b;

    public d(c cVar) {
        this.f4268b = cVar;
    }

    public final String a(String str, e eVar, e eVar2) {
        String str2 = str;
        e eVar3 = eVar;
        e eVar4 = eVar2;
        if (PatchProxy.isSupport(new Object[]{str2, eVar3, eVar4}, this, f4267a, false, 87028, new Class[]{String.class, e.class, e.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, eVar3, eVar4}, this, f4267a, false, 87028, new Class[]{String.class, e.class, e.class}, String.class);
        } else if (str2 == null || str.length() <= 5000) {
            return this.f4268b.a(str2, eVar3, eVar4);
        } else {
            throw new IllegalArgumentException("Struct in tools line is too long! MAX_LENGTH is 5000, while input.length() is " + str.length() + "!");
        }
    }
}
