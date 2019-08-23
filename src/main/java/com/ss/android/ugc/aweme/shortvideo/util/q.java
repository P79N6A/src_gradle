package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.FileFilter;

public final /* synthetic */ class q implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71203a;

    /* renamed from: b  reason: collision with root package name */
    static final FileFilter f71204b = new q();

    private q() {
    }

    public final boolean accept(File file) {
        if (!PatchProxy.isSupport(new Object[]{file}, this, f71203a, false, 80961, new Class[]{File.class}, Boolean.TYPE)) {
            return file != null && file.exists() && file.getName() != null && file.getName().startsWith("temp_");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f71203a, false, 80961, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
    }
}
