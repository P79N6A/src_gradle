package com.ss.android.ugc.b.c;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.b.a.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public e f77147a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f77148b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f77149c = true;

    public a(e eVar) {
        this.f77147a = eVar;
    }

    public final void a(final String str, boolean z) {
        this.f77148b = z;
        new AsyncTask() {
            /* access modifiers changed from: protected */
            public final Object doInBackground(Object[] objArr) {
                try {
                    return NetworkUtils.executeGet(0, str);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* access modifiers changed from: protected */
            public final void onPostExecute(Object obj) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    if (a.this.f77147a != null) {
                        a.this.f77147a.a(null, str, 4, a.this.f77148b);
                    }
                } else if (a.this.f77147a != null) {
                    a.this.f77147a.a(1);
                }
            }
        }.execute(null);
    }
}
