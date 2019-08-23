package com.ss.android.download;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.bytedance.common.utility.concurrent.AsyncTaskUtils;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.ss.android.ugc.aweme.q.c;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    static String f28559a;

    /* renamed from: b  reason: collision with root package name */
    private static AsyncTask<Void, Integer, Void> f28560b;

    /* renamed from: c  reason: collision with root package name */
    private static AsyncTask<Void, Integer, Void> f28561c;

    public interface a {
        void a(SharedPreferences sharedPreferences);
    }

    public interface b {
        void a(SharedPreferences.Editor editor);
    }

    public static void a(final Context context, final a aVar) {
        if (!TextUtils.isEmpty(f28559a)) {
            if (!(f28561c == null || f28561c.getStatus() == AsyncTask.Status.FINISHED)) {
                f28561c.cancel(true);
            }
            try {
                AnonymousClass2 r0 = new AsyncTask<Void, Integer, Void>() {
                    private Void a() {
                        synchronized (g.f28559a) {
                            SharedPreferences a2 = c.a(context, g.f28559a, 0);
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
                f28561c = r0;
                AsyncTaskUtils.executeAsyncTask(r0, new Void[0]);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context, final b bVar) {
        if (!TextUtils.isEmpty(f28559a)) {
            if (!(f28560b == null || f28560b.getStatus() == AsyncTask.Status.FINISHED)) {
                f28560b.cancel(true);
            }
            final Context applicationContext = context.getApplicationContext();
            try {
                AnonymousClass1 r0 = new AsyncTask<Void, Integer, Void>() {
                    private Void a() {
                        synchronized (g.f28559a) {
                            SharedPreferences.Editor edit = c.a(applicationContext, g.f28559a, 0).edit();
                            if (bVar != null) {
                                bVar.a(edit);
                            }
                            SharedPrefsEditorCompat.apply(edit);
                        }
                        return null;
                    }

                    /* access modifiers changed from: protected */
                    public final /* synthetic */ Object doInBackground(Object[] objArr) {
                        return a();
                    }
                };
                f28560b = r0;
                AsyncTaskUtils.executeAsyncTask(r0, new Void[0]);
            } catch (Throwable unused) {
            }
        }
    }
}
