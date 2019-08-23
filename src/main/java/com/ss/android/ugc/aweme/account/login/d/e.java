package com.ss.android.ugc.aweme.account.login.d;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bytedance.sdk.account.api.d;
import com.bytedance.sdk.account.f.b.a.h;
import com.bytedance.sdk.account.f.b.a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.c.b;
import com.ss.android.ugc.aweme.account.g;
import com.ss.android.ugc.aweme.account.login.a.q;

public class e extends b {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f32213d;

    /* renamed from: e  reason: collision with root package name */
    private d f32214e;

    public final void a(String str, int i) {
    }

    public e(@NonNull Context context, b bVar) {
        super(context, bVar);
        this.f32214e = com.bytedance.sdk.account.d.d.a(context);
    }

    public final void a(String str, String str2, i iVar) {
        String str3 = str;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{str3, null, iVar2}, this, f32213d, false, 20332, new Class[]{String.class, String.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, null, iVar2}, this, f32213d, false, 20332, new Class[]{String.class, String.class, i.class}, Void.TYPE);
        } else if (this.f30078a) {
            this.f32214e.a(str3, (String) null, g.f31963d, iVar2);
        }
    }

    public final void b(String str, String str2, i iVar) {
        String str3 = str;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{str3, null, iVar2}, this, f32213d, false, 20333, new Class[]{String.class, String.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, null, iVar2}, this, f32213d, false, 20333, new Class[]{String.class, String.class, i.class}, Void.TYPE);
        } else if (this.f30078a) {
            this.f32214e.b(str3, null, g.f31963d, iVar2);
        }
    }

    public final void a(String str, String str2, String str3, String str4, q qVar) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, qVar}, this, f32213d, false, 20335, new Class[]{String.class, String.class, String.class, String.class, q.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str3, str4, qVar}, this, f32213d, false, 20335, new Class[]{String.class, String.class, String.class, String.class, q.class}, Void.TYPE);
            return;
        }
        if (this.f30078a) {
            b();
            this.f32214e.a(str, str2, str3, str4, (h) qVar);
        }
    }
}
