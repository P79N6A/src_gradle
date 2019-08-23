package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.Comparator;

public final /* synthetic */ class x implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71217a;

    /* renamed from: b  reason: collision with root package name */
    static final Comparator f71218b = new x();

    private x() {
    }

    public final int compare(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f71217a, false, 80968, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return (((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f71217a, false, 80968, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
    }
}
