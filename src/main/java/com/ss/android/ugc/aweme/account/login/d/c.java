package com.ss.android.ugc.aweme.account.login.d;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.b.a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.g;

public class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f32209d;

    /* renamed from: e  reason: collision with root package name */
    public d f32210e;

    public final void a(String str, int i) {
    }

    public c(@NonNull Context context, com.ss.android.mobilelib.c.c cVar) {
        super(context, cVar);
        this.f32210e = com.bytedance.sdk.account.d.d.a(context);
    }

    public final void a(String str, String str2, i iVar) {
        String str3 = str;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{str3, null, iVar2}, this, f32209d, false, 20323, new Class[]{String.class, String.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, null, iVar2}, this, f32209d, false, 20323, new Class[]{String.class, String.class, i.class}, Void.TYPE);
            return;
        }
        this.f32210e.a(str3, (String) null, g.u, iVar2);
    }

    public final void b(String str, String str2, i iVar) {
        String str3 = str;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{str3, null, iVar2}, this, f32209d, false, 20324, new Class[]{String.class, String.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, null, iVar2}, this, f32209d, false, 20324, new Class[]{String.class, String.class, i.class}, Void.TYPE);
            return;
        }
        this.f32210e.b(str3, null, g.u, iVar2);
    }
}
