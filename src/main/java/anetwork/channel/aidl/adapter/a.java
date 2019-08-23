package anetwork.channel.aidl.adapter;

import android.os.RemoteException;
import anet.channel.util.ALog;
import anetwork.channel.Response;
import anetwork.channel.aidl.ParcelableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class a implements Future<Response> {

    /* renamed from: a  reason: collision with root package name */
    private ParcelableFuture f1482a;

    /* renamed from: b  reason: collision with root package name */
    private Response f1483b;

    public boolean isCancelled() {
        try {
            return this.f1482a.isCancelled();
        } catch (RemoteException e2) {
            ALog.w("anet.FutureResponse", "[isCancelled]", null, e2, new Object[0]);
            return false;
        }
    }

    public boolean isDone() {
        try {
            return this.f1482a.isDone();
        } catch (RemoteException e2) {
            ALog.w("anet.FutureResponse", "[isDone]", null, e2, new Object[0]);
            return true;
        }
    }

    /* renamed from: a */
    public Response get() throws InterruptedException, ExecutionException {
        if (this.f1483b != null) {
            return this.f1483b;
        }
        if (this.f1482a != null) {
            try {
                return this.f1482a.get(20000);
            } catch (RemoteException e2) {
                ALog.w("anet.FutureResponse", "[get]", null, e2, new Object[0]);
            }
        }
        return null;
    }

    public a(Response response) {
        this.f1483b = response;
    }

    public a(ParcelableFuture parcelableFuture) {
        this.f1482a = parcelableFuture;
    }

    public Response a(long j) throws InterruptedException, ExecutionException, TimeoutException {
        if (this.f1483b != null) {
            return this.f1483b;
        }
        if (this.f1482a != null) {
            try {
                return this.f1482a.get(j);
            } catch (RemoteException e2) {
                ALog.w("anet.FutureResponse", "[get(long timeout, TimeUnit unit)]", null, e2, new Object[0]);
            }
        }
        return null;
    }

    public boolean cancel(boolean z) {
        if (this.f1482a == null) {
            return false;
        }
        try {
            return this.f1482a.cancel(z);
        } catch (RemoteException e2) {
            ALog.w("anet.FutureResponse", "[cancel]", null, e2, new Object[0]);
            return false;
        }
    }

    public /* synthetic */ Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return a(j);
    }
}
