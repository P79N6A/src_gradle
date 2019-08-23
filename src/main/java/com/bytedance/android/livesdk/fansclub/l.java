package com.bytedance.android.livesdk.fansclub;

import com.bytedance.android.livesdk.message.model.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13891a;

    /* renamed from: b  reason: collision with root package name */
    LinkedList<v> f13892b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    List<a> f13893c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    boolean f13894d;

    /* renamed from: e  reason: collision with root package name */
    private v f13895e;

    public interface a {
        void a(v vVar);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13891a, false, 8329, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13891a, false, 8329, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f13892b.isEmpty() && (this.f13895e == null || !this.f13895e.f16695f)) {
            this.f13895e = this.f13892b.poll();
            if (this.f13895e != null) {
                this.f13895e.f16695f = true;
                for (a next : this.f13893c) {
                    if (next != null) {
                        next.a(this.f13895e);
                    }
                }
            }
        }
    }

    public l(boolean z) {
        this.f13894d = z;
    }
}
