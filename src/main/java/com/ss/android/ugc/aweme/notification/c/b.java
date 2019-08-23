package com.ss.android.ugc.aweme.notification.c;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.commerce.a;
import java.util.HashMap;
import java.util.Map;

public abstract class b extends h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58022a;

    /* renamed from: b  reason: collision with root package name */
    private String f58023b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, String> f58024c;

    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58022a, false, 63183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58022a, false, 63183, new Class[0], Void.TYPE);
            return;
        }
        this.f58023b = (String) x.a().O().c();
        this.f58024c = new HashMap<>();
        HashMap<String, String> hashMap = this.f58024c;
        hashMap.put("groupID", i());
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f58022a, false, 63184, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58022a, false, 63184, new Class[0], Void.TYPE);
            return;
        }
        String str = this.f58023b;
        HashMap<String, String> hashMap = this.f58024c;
        if (PatchProxy.isSupport(new Object[]{str, hashMap}, null, a.f36660a, true, 27862, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, hashMap}, null, a.f36660a, true, 27862, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        a.a(str, (Map<String, String>) hashMap, (Context) null);
    }
}
