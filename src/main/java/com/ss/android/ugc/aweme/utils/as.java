package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.FileFilter;

public final /* synthetic */ class as implements FileFilter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75533a;

    /* renamed from: b  reason: collision with root package name */
    static final FileFilter f75534b = new as();

    private as() {
    }

    public final boolean accept(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, this, f75533a, false, 88130, new Class[]{File.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f75533a, false, 88130, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
        }
        String name = file.getName();
        if (name.startsWith("cpu")) {
            int i = 3;
            while (i < name.length()) {
                if (Character.isDigit(name.charAt(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }
}
