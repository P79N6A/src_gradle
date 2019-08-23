package com.ss.android.downloadlib.core.download;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.d;
import com.ss.android.downloadlib.c.k;
import com.ss.android.downloadlib.core.download.a;
import com.ss.android.downloadlib.core.download.d;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import java.io.File;

public final class m {
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

    public static void a(Context context, long j, int i) {
        a(context, j, i, (String) null);
    }

    public static Intent a(Context context, String str, Cursor cursor) {
        Intent intent;
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(cursor.getColumnIndexOrThrow("local_filename"));
                    if (TextUtils.isEmpty(string)) {
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused) {
                            }
                        }
                        return null;
                    }
                    if (k.c(context, string)) {
                        PackageManager packageManager = context.getPackageManager();
                        PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(new File(string).getAbsolutePath(), 0);
                        if (packageArchiveInfo != null) {
                            intent = packageManager.getLaunchIntentForPackage(packageArchiveInfo.packageName);
                        } else {
                            intent = null;
                        }
                    } else if (TextUtils.isEmpty(str) || !k.b(context, str)) {
                        Uri b2 = b(cursor, "local_uri");
                        String a2 = a(cursor, "media_type");
                        if (!(b2 == null || a2 == null)) {
                            if (new File(string).exists()) {
                                Intent intent2 = new Intent("android.intent.action.VIEW");
                                if (Build.VERSION.SDK_INT >= 24) {
                                    intent2.addFlags(1);
                                }
                                if ("application/vnd.android.package-archive".equals(a2)) {
                                    intent2.setDataAndType(b2, a2);
                                } else if ("file".equals(b2.getScheme())) {
                                    intent2.setDataAndType(b2, a2);
                                } else {
                                    intent2.setDataAndType(b2, a2);
                                }
                                intent = intent2;
                            }
                        }
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused2) {
                            }
                        }
                        return null;
                    } else {
                        intent = context.getPackageManager().getLaunchIntentForPackage(str);
                    }
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return intent;
                }
            } catch (Exception unused4) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Exception unused5) {
                    }
                }
                return null;
            } catch (Throwable th) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Exception unused6) {
                    }
                }
                throw th;
            }
        }
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused7) {
            }
        }
        return null;
    }

    private static void a(Context context, long j, int i, String str) {
        a(context, j, new int[]{i}, (String) null);
    }

    public static void a(Context context, long j, int[] iArr, String str) {
        if (d.a().a(context, j, str) && !AppDownloader.startInstall(context, (int) j)) {
            d a2 = d.a(context);
            d.b a3 = new d.b().a(j);
            final Context context2 = context;
            final String str2 = str;
            final long j2 = j;
            final int[] iArr2 = iArr;
            AnonymousClass1 r2 = new a.C0346a() {
                public final void a(Cursor cursor) {
                    Intent a2 = m.a(context2, str2, cursor);
                    if (a2 != null) {
                        if (iArr2 != null && iArr2.length > 0) {
                            for (int addFlags : iArr2) {
                                a2.addFlags(addFlags);
                            }
                        }
                        try {
                            context2.startActivity(a2);
                        } catch (Throwable unused) {
                        }
                    }
                }
            };
            a2.a(a3, (Object) r2);
        }
    }
}
