package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.UrlModelWrap;
import java.util.Comparator;

public final /* synthetic */ class by implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62557a;

    /* renamed from: b  reason: collision with root package name */
    static final Comparator f62558b = new by();

    private by() {
    }

    public final int compare(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f62557a, false, 68638, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return ((UrlModelWrap) obj).getPosition() - ((UrlModelWrap) obj2).getPosition();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f62557a, false, 68638, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
    }
}
