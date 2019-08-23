package com.ss.android.ugc.aweme.audio;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34431a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f34432b = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static volatile i f34433d;

    /* renamed from: c  reason: collision with root package name */
    public List<a> f34434c;

    public interface a {
        boolean a(boolean z);
    }

    private i() {
        if (f34433d != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    public static i a() {
        if (PatchProxy.isSupport(new Object[0], null, f34431a, true, 23917, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], null, f34431a, true, 23917, new Class[0], i.class);
        }
        if (f34433d == null) {
            synchronized (f34432b) {
                if (f34433d == null) {
                    f34433d = new i();
                }
            }
        }
        return f34433d;
    }

    public final void a(@NonNull a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f34431a, false, 23918, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f34431a, false, 23918, new Class[]{a.class}, Void.TYPE);
            return;
        }
        synchronized (f34432b) {
            if (this.f34434c == null) {
                this.f34434c = new ArrayList();
            }
            if (!this.f34434c.contains(aVar)) {
                this.f34434c.add(aVar);
            }
        }
    }
}
