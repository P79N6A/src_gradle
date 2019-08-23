package com.ss.android.ugc.aweme.property;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.a;
import java.util.Comparator;

public final /* synthetic */ class j implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63297a;

    /* renamed from: b  reason: collision with root package name */
    static final Comparator f63298b = new j();

    private j() {
    }

    public final int compare(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f63297a, false, 70283, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return ((a.C0682a) obj).key().compareTo(((a.C0682a) obj2).key());
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f63297a, false, 70283, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
    }
}
