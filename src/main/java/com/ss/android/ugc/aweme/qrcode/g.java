package com.ss.android.ugc.aweme.qrcode;

import a.i;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.concurrent.Callable;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63484a;

    @Nullable
    static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f63484a, true, 70391, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f63484a, true, 70391, new Class[0], String.class);
        }
        File externalFilesDir = GlobalContext.getContext().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        b.a(externalFilesDir);
        return externalFilesDir.getAbsolutePath();
    }

    static final /* synthetic */ Object a(File file) throws Exception {
        try {
            file.delete();
        } catch (Exception unused) {
        }
        return null;
    }

    @Nullable
    public static File a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f63484a, true, 70389, new Class[]{Integer.TYPE}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f63484a, true, 70389, new Class[]{Integer.TYPE}, File.class);
        }
        String a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            File file = new File(a2, b(i));
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    @NonNull
    static String b(int i) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f63484a, true, 70390, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f63484a, true, 70390, new Class[]{Integer.TYPE}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(d.a().getCurUserId());
        if (i == 1) {
            str = "_qrcode_image_cache_for_invite";
        } else {
            str = "_qrcode_image_cache";
        }
        sb.append(str);
        return sb.toString();
    }

    public static boolean c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f63484a, true, 70393, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f63484a, true, 70393, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (a(i) != null) {
            return true;
        } else {
            return false;
        }
    }

    public static void d(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f63484a, true, 70397, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f63484a, true, 70397, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (c(i)) {
            File a2 = a(i);
            if (a2 != null && a2.exists()) {
                i.a((Callable<TResult>) new i<TResult>(a2));
            }
        }
    }

    public static void a(@NonNull String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f63484a, true, 70395, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f63484a, true, 70395, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new h<TResult>(str2, i));
    }
}
