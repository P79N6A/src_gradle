package com.ss.android.downloadlib.addownload.c;

import android.os.AsyncTask;
import com.ss.android.downloadlib.addownload.d.d;
import com.ss.android.downloadlib.c.k;
import java.util.List;

public final class a extends AsyncTask<Void, Void, Void> {

    /* renamed from: a  reason: collision with root package name */
    private List<d> f28748a;

    /* renamed from: b  reason: collision with root package name */
    private C0343a f28749b;

    /* renamed from: com.ss.android.downloadlib.addownload.c.a$a  reason: collision with other inner class name */
    public interface C0343a {
        void a(List<d> list);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        if (this.f28749b != null) {
            this.f28749b.a(this.f28748a);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (this.f28748a != null) {
            for (d next : this.f28748a) {
                next.a(k.b(next.g, next.f28774e, next.f28775f));
            }
        }
        return null;
    }

    public a(List<d> list, C0343a aVar) {
        this.f28748a = list;
        this.f28749b = aVar;
    }
}
