package com.ss.android.ugc.aweme.widget.flowlayout;

import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.List;

public abstract class a<T> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f76923d;

    /* renamed from: e  reason: collision with root package name */
    List<T> f76924e;

    /* renamed from: f  reason: collision with root package name */
    SparseArray<c> f76925f = new SparseArray<>();
    public C0803a g;
    @Deprecated
    public HashSet<Integer> h = new HashSet<>();

    /* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.a$a  reason: collision with other inner class name */
    interface C0803a {
    }

    public abstract View a(FlowLayout flowLayout, int i, T t);

    public a(List<T> list) {
        this.f76924e = list;
    }

    public final T a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76923d, false, 90128, new Class[]{Integer.TYPE}, Object.class)) {
            return this.f76924e.get(i);
        }
        return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76923d, false, 90128, new Class[]{Integer.TYPE}, Object.class);
    }
}
