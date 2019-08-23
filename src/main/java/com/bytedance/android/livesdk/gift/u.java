package com.bytedance.android.livesdk.gift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15473a;

    /* renamed from: e  reason: collision with root package name */
    private static u f15474e;

    /* renamed from: b  reason: collision with root package name */
    public boolean f15475b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.l.a f15476c;

    /* renamed from: d  reason: collision with root package name */
    public final List<a> f15477d = new ArrayList();

    public interface a {
        void a(com.bytedance.android.livesdkapi.l.a aVar);
    }

    private u() {
    }

    public final long b() {
        if (this.f15476c != null) {
            return this.f15476c.f18837a;
        }
        return 0;
    }

    public static synchronized u a() {
        synchronized (u.class) {
            if (PatchProxy.isSupport(new Object[0], null, f15473a, true, 9316, new Class[0], u.class)) {
                u uVar = (u) PatchProxy.accessDispatch(new Object[0], null, f15473a, true, 9316, new Class[0], u.class);
                return uVar;
            }
            if (f15474e == null) {
                f15474e = new u();
            }
            u uVar2 = f15474e;
            return uVar2;
        }
    }
}
