package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.FileFilter;

public final /* synthetic */ class s implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71207a;

    /* renamed from: b  reason: collision with root package name */
    static final FileFilter f71208b = new s();

    private s() {
    }

    public final boolean accept(File file) {
        if (!PatchProxy.isSupport(new Object[]{file}, this, f71207a, false, 80963, new Class[]{File.class}, Boolean.TYPE)) {
            return file != null && file.exists() && file.getName() != null && file.getName().endsWith("-concat-v") && !file.getName().startsWith("synthetise_");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f71207a, false, 80963, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
    }
}
