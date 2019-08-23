package com.bytedance.android.livesdk.widget.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Predicate;
import java.io.File;

public final /* synthetic */ class d implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18396a;

    /* renamed from: b  reason: collision with root package name */
    static final Predicate f18397b = new d();

    private d() {
    }

    public final boolean test(Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f18396a, false, 14820, new Class[]{Object.class}, Boolean.TYPE)) {
            return !((File) obj).isDirectory();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f18396a, false, 14820, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }
}
