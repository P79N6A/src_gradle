package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.FileFilter;

public final /* synthetic */ class r implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71205a;

    /* renamed from: b  reason: collision with root package name */
    static final FileFilter f71206b = new r();

    private r() {
    }

    public final boolean accept(File file) {
        if (!PatchProxy.isSupport(new Object[]{file}, this, f71205a, false, 80962, new Class[]{File.class}, Boolean.TYPE)) {
            return file != null && file.exists() && file.getName() != null && !file.getName().startsWith("temp_") && file.getName().endsWith(".mp4");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f71205a, false, 80962, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
    }
}
