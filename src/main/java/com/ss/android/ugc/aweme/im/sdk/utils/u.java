package com.ss.android.ugc.aweme.im.sdk.utils;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.io.FileUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52648a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f52649b = (Environment.getExternalStorageDirectory() + "/" + GlobalContext.getContext().getString(C0906R.string.ak) + "/");

    public interface a {
        void a();

        void b();
    }

    public static boolean a(String str) {
        boolean z;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52648a, true, 53495, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f52648a, true, 53495, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        String str3 = f52649b + com.ss.android.ugc.aweme.im.sdk.h.a.a(".jpg");
        if (!FileUtils.exists(str3)) {
            z = FileUtils.copyFile(str2, f52649b, new File(str3).getName());
            if (!z) {
                return false;
            }
        } else {
            z = false;
        }
        b(str3);
        c(str3);
        return z;
    }

    private static void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52648a, true, 53493, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f52648a, true, 53493, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(str2);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            GlobalContext.getContext().sendBroadcast(intent);
        }
    }

    private static void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f52648a, true, 53494, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f52648a, true, 53494, new Class[]{String.class}, Void.TYPE);
            return;
        }
        String str3 = Build.BRAND;
        if (!TextUtils.isEmpty(str3) && str3.toLowerCase().equals("vivo")) {
            String str4 = Environment.getExternalStorageDirectory() + "/相机/" + new File(str2).getName();
            b.c(str2, str4);
            com.ss.android.ugc.aweme.framework.a.a.a("vivo: " + str4);
            b(str4);
        }
    }
}
