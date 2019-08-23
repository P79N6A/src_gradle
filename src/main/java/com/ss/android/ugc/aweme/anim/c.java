package com.ss.android.ugc.aweme.anim;

import android.view.View;
import com.facebook.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;

public class c<T extends View> implements c.C0251c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33350a;

    /* renamed from: b  reason: collision with root package name */
    private LinkedList<T> f33351b;

    public c() {
        this.f33351b = new LinkedList<>();
        this.f33351b = new LinkedList<>();
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f33350a, false, 21634, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33350a, false, 21634, new Class[0], Void.TYPE);
            return;
        }
        if (this.f33351b != null && this.f33351b.size() > 0) {
            this.f33351b.removeFirst();
        }
    }
}
