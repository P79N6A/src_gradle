package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.FileFilter;

public final /* synthetic */ class v implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71213a;

    /* renamed from: b  reason: collision with root package name */
    static final FileFilter f71214b = new v();

    private v() {
    }

    public final boolean accept(File file) {
        if (!PatchProxy.isSupport(new Object[]{file}, this, f71213a, false, 80966, new Class[]{File.class}, Boolean.TYPE)) {
            return file != null && file.exists() && file.getName() != null && (file.getName().startsWith("synthetise_") || file.getName().endsWith("_synthetise"));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f71213a, false, 80966, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
    }
}
