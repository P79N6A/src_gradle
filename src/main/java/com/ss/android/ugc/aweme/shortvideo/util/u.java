package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.IShortVideoConfig;
import java.io.File;
import java.io.FileFilter;

public final /* synthetic */ class u implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71211a;

    /* renamed from: b  reason: collision with root package name */
    private final IShortVideoConfig f71212b;

    u(IShortVideoConfig iShortVideoConfig) {
        this.f71212b = iShortVideoConfig;
    }

    public final boolean accept(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f71211a, false, 80965, new Class[]{File.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f71211a, false, 80965, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
        }
        return file != null && file.exists() && file.getName() != null && file.getName().endsWith(this.f71212b.suffixMix());
    }
}
