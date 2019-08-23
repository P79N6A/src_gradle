package com.bytedance.android.livesdk.a;

import android.support.v4.app.Fragment;
import com.bytedance.android.livesdk.j.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.b;

@Aspect
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8888a;

    /* renamed from: b  reason: collision with root package name */
    static Map<String, Boolean> f8889b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ a f8890c;

    /* renamed from: d  reason: collision with root package name */
    private static /* synthetic */ Throwable f8891d;

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f8888a, true, 3112, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f8888a, true, 3112, new Class[0], a.class);
        }
        if (f8890c != null) {
            return f8890c;
        }
        throw new b("com.bytedance.android.livesdk.aop.PageTraceAspect", f8891d);
    }

    static {
        HashMap hashMap = new HashMap(2);
        f8889b = hashMap;
        hashMap.put("com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment", Boolean.FALSE);
        f8889b.put("android.support.v4.app.LiveDialogFragment", Boolean.FALSE);
        try {
            if (PatchProxy.isSupport(new Object[0], null, f8888a, true, 3113, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f8888a, true, 3113, new Class[0], Void.TYPE);
            } else {
                f8890c = new a();
            }
        } catch (Throwable th) {
            f8891d = th;
        }
    }

    private void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f8888a, false, 3111, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f8888a, false, 3111, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page_name", str2);
        c.b().b("ttlive_page", (Map<String, Object>) hashMap);
    }

    @After
    public final void b(org.aspectj.lang.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f8888a, false, 3107, new Class[]{org.aspectj.lang.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f8888a, false, 3107, new Class[]{org.aspectj.lang.a.class}, Void.TYPE);
            return;
        }
        if (((Fragment) aVar.a()).getUserVisibleHint() && !f8889b.containsKey(aVar.a().getClass().getName())) {
            a(aVar.a().getClass().getName());
        }
    }

    @After
    public final void c(org.aspectj.lang.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f8888a, false, 3108, new Class[]{org.aspectj.lang.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f8888a, false, 3108, new Class[]{org.aspectj.lang.a.class}, Void.TYPE);
            return;
        }
        a(aVar.a().getClass().getName());
    }

    @After
    public final void a(org.aspectj.lang.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f8888a, false, 3106, new Class[]{org.aspectj.lang.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f8888a, false, 3106, new Class[]{org.aspectj.lang.a.class}, Void.TYPE);
            return;
        }
        if (((Fragment) aVar.a()).getUserVisibleHint()) {
            a(aVar.a().getClass().getName());
        }
    }
}
