package com.loc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Build;
import com.ss.android.ugc.aweme.q.c;

public final class cl {
    public static void a(Context context, String str, String str2, int i) {
        try {
            SharedPreferences.Editor edit = c.a(context, str, 0).edit();
            edit.putInt(str2, i);
            a(edit);
        } catch (Throwable th) {
            ce.a(th, "SpUtil", "setPrefsInt");
        }
    }

    public static void a(Context context, String str, String str2, long j) {
        try {
            SharedPreferences.Editor edit = c.a(context, str, 0).edit();
            edit.putLong(str2, j);
            a(edit);
        } catch (Throwable th) {
            ce.a(th, "SpUtil", "setPrefsLong");
        }
    }

    public static void a(Context context, String str, String str2, String str3) {
        try {
            SharedPreferences.Editor edit = c.a(context, str, 0).edit();
            edit.putString(str2, str3);
            a(edit);
        } catch (Throwable th) {
            ce.a(th, "SpUtil", "setPrefsStr");
        }
    }

    public static void a(Context context, String str, String str2, boolean z) {
        try {
            SharedPreferences.Editor edit = c.a(context, str, 0).edit();
            edit.putBoolean(str2, z);
            a(edit);
        } catch (Throwable th) {
            ce.a(th, "SpUtil", "updatePrefsBoolean");
        }
    }

    @SuppressLint({"NewApi"})
    public static void a(final SharedPreferences.Editor editor) {
        if (editor != null) {
            if (Build.VERSION.SDK_INT >= 9) {
                editor.apply();
                return;
            }
            try {
                new AsyncTask<Void, Void, Void>() {
                    private Void a() {
                        try {
                            if (editor != null) {
                                editor.commit();
                            }
                        } catch (Throwable th) {
                            ce.a(th, "SpUtil", "commit");
                        }
                        return null;
                    }

                    /* access modifiers changed from: protected */
                    public final /* synthetic */ Object doInBackground(Object[] objArr) {
                        return a();
                    }
                }.execute(new Void[]{null, null, null});
            } catch (Throwable th) {
                ce.a(th, "SpUtil", "commit1");
            }
        }
    }

    public static int b(Context context, String str, String str2, int i) {
        try {
            return c.a(context, str, 0).getInt(str2, i);
        } catch (Throwable th) {
            ce.a(th, "SpUtil", "getPrefsInt");
            return i;
        }
    }

    public static long b(Context context, String str, String str2, long j) {
        try {
            return c.a(context, str, 0).getLong(str2, j);
        } catch (Throwable th) {
            ce.a(th, "SpUtil", "getPrefsLong");
            return j;
        }
    }

    public static String b(Context context, String str, String str2, String str3) {
        try {
            return c.a(context, str, 0).getString(str2, str3);
        } catch (Throwable th) {
            ce.a(th, "SpUtil", "getPrefsInt");
            return str3;
        }
    }

    public static boolean b(Context context, String str, String str2, boolean z) {
        try {
            return c.a(context, str, 0).getBoolean(str2, z);
        } catch (Throwable th) {
            ce.a(th, "SpUtil", "getPrefsBoolean");
            return z;
        }
    }
}
