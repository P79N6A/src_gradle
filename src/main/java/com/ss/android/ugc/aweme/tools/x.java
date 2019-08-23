package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class x implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74948a;

    /* renamed from: b  reason: collision with root package name */
    public float f74949b = -1.0f;

    /* renamed from: c  reason: collision with root package name */
    public boolean f74950c;

    /* renamed from: d  reason: collision with root package name */
    public Object f74951d;

    /* renamed from: e  reason: collision with root package name */
    public int f74952e;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74948a, false, 86968, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74948a, false, 86968, new Class[0], String.class);
        }
        return "GesturePresenterStateEvent{fraction=" + this.f74949b + ", animationRunning=" + this.f74950c + ", listener=" + this.f74951d + ", type=" + this.f74952e + '}';
    }

    public static x a(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, null, f74948a, true, 86967, new Class[]{Object.class}, x.class)) {
            return (x) PatchProxy.accessDispatch(new Object[]{obj2}, null, f74948a, true, 86967, new Class[]{Object.class}, x.class);
        }
        x xVar = new x();
        xVar.f74951d = obj2;
        xVar.f74952e = 3;
        return xVar;
    }

    public static x a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f74948a, true, 86966, new Class[]{Boolean.TYPE}, x.class)) {
            return (x) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f74948a, true, 86966, new Class[]{Boolean.TYPE}, x.class);
        }
        x xVar = new x();
        xVar.f74950c = z;
        xVar.f74952e = 2;
        return xVar;
    }
}
