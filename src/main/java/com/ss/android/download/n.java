package com.ss.android.download;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.download.b.f;
import com.ss.android.download.e;
import java.io.File;

public final class n {
    private static String a(Cursor cursor, String str) {
        return cursor.getString(cursor.getColumnIndexOrThrow(str));
    }

    private static Uri b(Cursor cursor, String str) {
        try {
            return Uri.parse(a(cursor, str));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    private static Intent a(Context context, long j, boolean z) {
        Intent intent;
        boolean z2 = false;
        Cursor a2 = e.a(context).a(new e.c().a(j));
        try {
            if (!a2.moveToFirst()) {
                return null;
            }
            String string = a2.getString(a2.getColumnIndexOrThrow("local_filename"));
            if (StringUtils.isEmpty(string)) {
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception unused) {
                    }
                }
                return null;
            }
            if (f.a(context, string)) {
                PackageManager packageManager = context.getPackageManager();
                intent = packageManager.getLaunchIntentForPackage(packageManager.getPackageArchiveInfo(new File(string).getAbsolutePath(), 1).packageName);
            } else {
                Uri b2 = b(a2, "local_uri");
                String a3 = a(a2, "media_type");
                if (!(b2 == null || a3 == null)) {
                    if (new File(string).exists()) {
                        intent = new Intent("android.intent.action.VIEW");
                        if ("application/vnd.android.package-archive".equals(a3)) {
                            intent.setDataAndType(b2, a3);
                        } else if ("file".equals(b2.getScheme())) {
                            intent.setDataAndType(b2, a3);
                        } else {
                            intent.setDataAndType(b2, a3);
                        }
                        l lVar = k.f28597c;
                        if (lVar != null) {
                            z2 = lVar.a();
                        }
                    }
                }
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception unused2) {
                    }
                }
                return null;
            }
            if (z2) {
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            }
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused4) {
                }
            }
            return intent;
        } finally {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Exception unused5) {
                }
            }
        }
    }

    public static boolean a(Context context, long j, int i, boolean z) {
        Intent a2 = a(context, j, z);
        if (a2 == null) {
            return false;
        }
        a2.addFlags(268435456);
        try {
            context.startActivity(a2);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
