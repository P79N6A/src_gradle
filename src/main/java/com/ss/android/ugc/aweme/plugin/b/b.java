package com.ss.android.ugc.aweme.plugin.b;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59227a;

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f59228b = {" ENOENT ", "No such file or directory", " ENOSPC ", "No space left on device", " EDQUOT ", " EROFS ", " EACCES ", " ENOTDIR ", " ENOTCONN ", " EBUSY "};

    public static boolean a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, null, f59227a, true, 64554, new Class[]{Exception.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{exc2}, null, f59227a, true, 64554, new Class[]{Exception.class}, Boolean.TYPE)).booleanValue();
        } else if (exc2 == null) {
            return false;
        } else {
            if (exc2 instanceof FileNotFoundException) {
                return true;
            }
            if (!(exc2 instanceof IOException)) {
                return false;
            }
            try {
                String message = exc.getMessage();
                if (TextUtils.isEmpty(message)) {
                    return false;
                }
                for (String indexOf : f59228b) {
                    if (message.indexOf(indexOf) > 0) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable unused) {
            }
        }
    }
}
