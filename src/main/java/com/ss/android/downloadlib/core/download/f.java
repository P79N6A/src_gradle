package com.ss.android.downloadlib.core.download;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.ss.android.downloadlib.c.j;
import com.ss.android.ugc.aweme.q.c;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static String f28990a;

    /* renamed from: b  reason: collision with root package name */
    private static AsyncTask<Void, Integer, Void> f28991b;

    /* renamed from: c  reason: collision with root package name */
    private static AsyncTask<Void, Integer, Void> f28992c;

    public interface a {
        void a(SharedPreferences sharedPreferences);
    }

    public interface b {
        void a(SharedPreferences.Editor editor);
    }

    public static void a(final Context context, final a aVar) {
        if (!TextUtils.isEmpty(f28990a)) {
            if (!(f28992c == null || f28992c.getStatus() == AsyncTask.Status.FINISHED)) {
                f28992c.cancel(true);
            }
            try {
                AnonymousClass2 r0 = new AsyncTask<Void, Integer, Void>() {
                    private Void a() {
                        synchronized (f.f28990a) {
                            SharedPreferences a2 = c.a(context, f.f28990a, 0);
                            if (aVar != null) {
                                aVar.a(a2);
                            }
                        }
                        return null;
                    }

                    /* access modifiers changed from: protected */
                    public final /* synthetic */ Object doInBackground(Object[] objArr) {
                        return a();
                    }
                };
                f28992c = r0;
                com.ss.android.downloadlib.c.a.a.a(r0, new Void[0]);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context, final b bVar) {
        if (!TextUtils.isEmpty(f28990a)) {
            if (!(f28991b == null || f28991b.getStatus() == AsyncTask.Status.FINISHED)) {
                f28991b.cancel(true);
            }
            final Context applicationContext = context.getApplicationContext();
            try {
                AnonymousClass1 r0 = new AsyncTask<Void, Integer, Void>() {
                    private Void a() {
                        synchronized (f.f28990a) {
                            SharedPreferences.Editor edit = c.a(applicationContext, f.f28990a, 0).edit();
                            if (bVar != null) {
                                bVar.a(edit);
                            }
                            if (edit != null) {
                                j.f28897a.a(edit);
                            }
                        }
                        return null;
                    }

                    /* access modifiers changed from: protected */
                    public final /* synthetic */ Object doInBackground(Object[] objArr) {
                        return a();
                    }
                };
                f28991b = r0;
                com.ss.android.downloadlib.c.a.a.a(r0, new Void[0]);
            } catch (Throwable unused) {
            }
        }
    }
}
