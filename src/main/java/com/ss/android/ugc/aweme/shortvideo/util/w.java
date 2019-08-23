package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.util.Comparator;

public final /* synthetic */ class w implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71215a;

    /* renamed from: b  reason: collision with root package name */
    static final Comparator f71216b = new w();

    private w() {
    }

    public final int compare(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f71215a, false, 80967, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return (((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f71215a, false, 80967, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
    }
}
