package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import org.jetbrains.annotations.NotNull;

public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67251a;

    @NotNull
    public final String a(String str, int i) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i)}, this, f67251a, false, 76912, new Class[]{String.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i)}, this, f67251a, false, 76912, new Class[]{String.class, Integer.TYPE}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        if (str3.endsWith(File.separator)) {
            str2 = "interact_sticker.png";
        } else {
            str2 = File.separator + "interact_sticker.png";
        }
        sb.append(str2);
        return sb.toString();
    }
}
