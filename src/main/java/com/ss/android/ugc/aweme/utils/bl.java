package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.FileProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;

public final class bl {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75620a;

    public static Uri a(Context context, File file) {
        Uri uri;
        Context context2 = context;
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{context2, file2}, null, f75620a, true, 88304, new Class[]{Context.class, File.class}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{context2, file2}, null, f75620a, true, 88304, new Class[]{Context.class, File.class}, Uri.class);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            uri = FileProvider.getUriForFile(context2, context.getPackageName() + ".fileprovider", file2);
        } else {
            uri = Uri.fromFile(file);
        }
        return uri;
    }
}
