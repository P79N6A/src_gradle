package io.fabric.sdk.android;

import com.taobao.android.dexposed.ClassUtils;
import io.fabric.sdk.android.services.b.x;
import io.fabric.sdk.android.services.concurrency.d;
import io.fabric.sdk.android.services.concurrency.e;
import io.fabric.sdk.android.services.concurrency.l;

public final class h<Result> extends e<Void, Void, Result> {

    /* renamed from: a  reason: collision with root package name */
    final i<Result> f83148a;

    public final d getPriority() {
        return d.HIGH;
    }

    public final void a() {
        super.a();
        x a2 = a("onPreExecute");
        try {
            boolean onPreExecute = this.f83148a.onPreExecute();
            a2.b();
            if (!onPreExecute) {
                a(true);
            }
        } catch (l e2) {
            throw e2;
        } catch (Exception unused) {
            a2.b();
            a(true);
        } catch (Throwable th) {
            a2.b();
            a(true);
            throw th;
        }
    }

    public h(i<Result> iVar) {
        this.f83148a = iVar;
    }

    public final void a(Result result) {
        this.f83148a.onPostExecute(result);
        this.f83148a.initializationCallback.a();
    }

    public final /* synthetic */ Object a(Object[] objArr) {
        Object obj;
        x a2 = a("doInBackground");
        if (!b()) {
            obj = this.f83148a.doInBackground();
        } else {
            obj = null;
        }
        a2.b();
        return obj;
    }

    private x a(String str) {
        x xVar = new x(this.f83148a.getIdentifier() + ClassUtils.PACKAGE_SEPARATOR + str, "KitInitialization");
        xVar.a();
        return xVar;
    }

    public final void b(Result result) {
        this.f83148a.onCancelled(result);
        new g(this.f83148a.getIdentifier() + " Initialization was cancelled");
    }
}
