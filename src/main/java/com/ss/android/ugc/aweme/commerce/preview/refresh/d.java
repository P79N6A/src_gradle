package com.ss.android.ugc.aweme.commerce.preview.refresh;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.preview.refresh.a.b;

public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37635a;

    /* renamed from: b  reason: collision with root package name */
    public b f37636b;

    /* renamed from: c  reason: collision with root package name */
    d f37637c;

    d() {
    }

    public final boolean a() {
        if (this.f37636b != null) {
            return true;
        }
        return false;
    }

    public final void a(PtrFrameLayout ptrFrameLayout) {
        PtrFrameLayout ptrFrameLayout2 = ptrFrameLayout;
        if (PatchProxy.isSupport(new Object[]{ptrFrameLayout2}, this, f37635a, false, 29172, new Class[]{PtrFrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ptrFrameLayout2}, this, f37635a, false, 29172, new Class[]{PtrFrameLayout.class}, Void.TYPE);
            return;
        }
        d dVar = this;
        do {
            b bVar = dVar.f37636b;
            if (bVar != null) {
                bVar.a(ptrFrameLayout2);
            }
            dVar = dVar.f37637c;
        } while (dVar != null);
    }

    public final void b(PtrFrameLayout ptrFrameLayout) {
        PtrFrameLayout ptrFrameLayout2 = ptrFrameLayout;
        if (PatchProxy.isSupport(new Object[]{ptrFrameLayout2}, this, f37635a, false, 29173, new Class[]{PtrFrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ptrFrameLayout2}, this, f37635a, false, 29173, new Class[]{PtrFrameLayout.class}, Void.TYPE);
        } else if (a()) {
            d dVar = this;
            do {
                b bVar = dVar.f37636b;
                if (bVar != null) {
                    bVar.b(ptrFrameLayout2);
                }
                dVar = dVar.f37637c;
            } while (dVar != null);
        }
    }

    public final void c(PtrFrameLayout ptrFrameLayout) {
        PtrFrameLayout ptrFrameLayout2 = ptrFrameLayout;
        if (PatchProxy.isSupport(new Object[]{ptrFrameLayout2}, this, f37635a, false, 29174, new Class[]{PtrFrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ptrFrameLayout2}, this, f37635a, false, 29174, new Class[]{PtrFrameLayout.class}, Void.TYPE);
            return;
        }
        d dVar = this;
        do {
            b bVar = dVar.f37636b;
            if (bVar != null) {
                bVar.c(ptrFrameLayout2);
            }
            dVar = dVar.f37637c;
        } while (dVar != null);
    }

    public final void d(PtrFrameLayout ptrFrameLayout) {
        PtrFrameLayout ptrFrameLayout2 = ptrFrameLayout;
        if (PatchProxy.isSupport(new Object[]{ptrFrameLayout2}, this, f37635a, false, 29175, new Class[]{PtrFrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ptrFrameLayout2}, this, f37635a, false, 29175, new Class[]{PtrFrameLayout.class}, Void.TYPE);
            return;
        }
        d dVar = this;
        do {
            b bVar = dVar.f37636b;
            if (bVar != null) {
                bVar.d(ptrFrameLayout2);
            }
            dVar = dVar.f37637c;
        } while (dVar != null);
    }

    public final void a(PtrFrameLayout ptrFrameLayout, boolean z, byte b2, c cVar) {
        PtrFrameLayout ptrFrameLayout2 = ptrFrameLayout;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{ptrFrameLayout2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(b2), cVar2}, this, f37635a, false, 29176, new Class[]{PtrFrameLayout.class, Boolean.TYPE, Byte.TYPE, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ptrFrameLayout2, Byte.valueOf(z), Byte.valueOf(b2), cVar2}, this, f37635a, false, 29176, new Class[]{PtrFrameLayout.class, Boolean.TYPE, Byte.TYPE, c.class}, Void.TYPE);
            return;
        }
        d dVar = this;
        do {
            b bVar = dVar.f37636b;
            if (bVar != null) {
                bVar.a(ptrFrameLayout2, z, b2, cVar2);
            } else {
                boolean z2 = z;
                byte b3 = b2;
            }
            dVar = dVar.f37637c;
        } while (dVar != null);
    }
}
