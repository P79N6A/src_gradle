package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import org.jetbrains.annotations.NotNull;

public final class k extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67283a;

    @NotNull
    public final String a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f67283a, false, 76983, new Class[]{String.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f67283a, false, 76983, new Class[]{String.class, Integer.TYPE}, String.class);
        }
        if (!str2.endsWith(File.separator)) {
            str2 = str2 + File.separator;
        }
        return str2 + "text_sticker_" + i + ".png";
    }
}
