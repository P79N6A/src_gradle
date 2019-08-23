package com.ss.android.ugc.aweme.account.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.o;
import java.util.ArrayList;
import java.util.List;

public class a<T extends com.ss.android.ugc.aweme.common.a, K extends o> extends b<T, K> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2575a;

    /* renamed from: b  reason: collision with root package name */
    private List<Object> f2576b;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2575a, false, 19836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2575a, false, 19836, new Class[0], Void.TYPE);
        } else if (this.f2576b != null) {
            a(this.f2576b.toArray());
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2575a, false, 19837, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2575a, false, 19837, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.f2576b = null;
    }

    public boolean a(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f2575a, false, 19835, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f2575a, false, 19835, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        this.f2576b = new ArrayList();
        for (Object add : objArr) {
            this.f2576b.add(add);
        }
        return super.a(objArr);
    }
}
