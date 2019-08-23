package com.ss.android.ugc.aweme.iesapi.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.iesapi.a;
import com.ss.android.ugc.aweme.shortvideo.view.c;

public abstract class a implements com.ss.android.ugc.aweme.iesapi.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50009a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f50010b;

    /* renamed from: c  reason: collision with root package name */
    protected a.C0592a f50011c;

    /* renamed from: d  reason: collision with root package name */
    private c f50012d;

    /* renamed from: com.ss.android.ugc.aweme.iesapi.a.a$a  reason: collision with other inner class name */
    class C0593a implements a.C0592a {
        public final void a() {
        }

        public final void a(String str) {
        }

        C0593a() {
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50009a, false, 49980, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50009a, false, 49980, new Class[0], Void.TYPE);
            return;
        }
        this.f50012d = c.a(this.f50010b, this.f50010b.getString(C0906R.string.brl));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50009a, false, 49981, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50009a, false, 49981, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50012d != null) {
            this.f50012d.dismiss();
        }
    }

    public a(Context context) {
        this.f50010b = context;
    }

    public void a(a.C0592a aVar) {
        a.C0592a aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f50009a, false, 49978, new Class[]{a.C0592a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f50009a, false, 49978, new Class[]{a.C0592a.class}, Void.TYPE);
        } else if (this.f50010b != null) {
            if (aVar == null) {
                aVar2 = new C0593a();
            } else {
                aVar2 = aVar;
            }
            this.f50011c = aVar2;
        }
    }

    public void b(a.C0592a aVar) {
        a.C0592a aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f50009a, false, 49979, new Class[]{a.C0592a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f50009a, false, 49979, new Class[]{a.C0592a.class}, Void.TYPE);
            return;
        }
        if (aVar == null) {
            aVar2 = new C0593a();
        } else {
            aVar2 = aVar;
        }
        this.f50011c = aVar2;
    }
}
