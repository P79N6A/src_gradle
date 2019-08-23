package com.bytedance.android.livesdk.app.dataholder;

import com.bytedance.android.livesdkapi.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9039a;

    /* renamed from: b  reason: collision with root package name */
    protected List<WeakReference<c<T>>> f9040b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public T f9041c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9042d = true;

    public final void a(c<T> cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f9039a, false, 3127, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f9039a, false, 3127, new Class[]{c.class}, Void.TYPE);
        } else if (cVar != null) {
            Iterator<WeakReference<c<T>>> it2 = this.f9040b.iterator();
            while (it2.hasNext()) {
                WeakReference next = it2.next();
                if (next.get() == null) {
                    it2.remove();
                } else if (next.get() == cVar) {
                    return;
                }
            }
            this.f9040b.add(new WeakReference(cVar));
            if (this.f9042d) {
                cVar.a(this.f9041c);
            }
        }
    }

    public final void b(c<T> cVar) {
        c<T> cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f9039a, false, 3128, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f9039a, false, 3128, new Class[]{c.class}, Void.TYPE);
            return;
        }
        Iterator<WeakReference<c<T>>> it2 = this.f9040b.iterator();
        while (it2.hasNext()) {
            WeakReference next = it2.next();
            if (next.get() == null) {
                it2.remove();
            } else if (next.get() == cVar2) {
                it2.remove();
                return;
            }
        }
    }

    public void a(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f9039a, false, 3126, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f9039a, false, 3126, new Class[]{Object.class}, Void.TYPE);
        } else if (t != this.f9041c) {
            this.f9041c = t;
            if (PatchProxy.isSupport(new Object[0], this, f9039a, false, 3129, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f9039a, false, 3129, new Class[0], Void.TYPE);
                return;
            }
            Iterator<WeakReference<c<T>>> it2 = this.f9040b.iterator();
            while (it2.hasNext()) {
                WeakReference next = it2.next();
                if (next.get() == null) {
                    it2.remove();
                } else {
                    ((c) next.get()).a(this.f9041c);
                }
            }
        }
    }
}
