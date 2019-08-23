package com.ss.android.ugc.aweme.account.login.d;

import android.content.Context;
import android.os.Message;
import android.support.annotation.NonNull;
import com.bytedance.sdk.account.f.b.a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.c.b;
import com.ss.android.ugc.aweme.account.g;

public class d extends b {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f32211d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.account.api.d f32212e;

    public final void a(String str, int i) {
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f32211d, false, 20331, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f32211d, false, 20331, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        super.handleMsg(message);
    }

    public d(@NonNull Context context, b bVar) {
        super(context, bVar);
        this.f32212e = com.bytedance.sdk.account.d.d.a(context);
    }

    public final void a(String str, String str2, i iVar) {
        String str3 = str;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{str3, null, iVar2}, this, f32211d, false, 20328, new Class[]{String.class, String.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, null, iVar2}, this, f32211d, false, 20328, new Class[]{String.class, String.class, i.class}, Void.TYPE);
            return;
        }
        this.f32212e.a(str3, (String) null, g.u, iVar2);
    }

    public final void b(String str, String str2, i iVar) {
        String str3 = str;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{str3, null, iVar2}, this, f32211d, false, 20329, new Class[]{String.class, String.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, null, iVar2}, this, f32211d, false, 20329, new Class[]{String.class, String.class, i.class}, Void.TYPE);
            return;
        }
        this.f32212e.b(str3, null, g.u, iVar2);
    }

    public final void a(String str, String str2, String str3, com.bytedance.sdk.account.f.b.a.d dVar) {
        String str4 = str;
        String str5 = str2;
        com.bytedance.sdk.account.f.b.a.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{str4, str5, null, dVar2}, this, f32211d, false, 20327, new Class[]{String.class, String.class, String.class, com.bytedance.sdk.account.f.b.a.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, null, dVar2}, this, f32211d, false, 20327, new Class[]{String.class, String.class, String.class, com.bytedance.sdk.account.f.b.a.d.class}, Void.TYPE);
        } else if (this.f30078a) {
            b();
            this.f32212e.a(str4, str5, (String) null, dVar2);
        }
    }
}
