package com.ss.android.ugc.aweme.utils.permission;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.g;
import java.util.concurrent.Callable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public class PermissionStateReporter implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75921a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile PermissionStateReporter f75922c;

    /* renamed from: b  reason: collision with root package name */
    ReportPermissionApi f75923b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f75924d = true;

    public interface ReportPermissionApi {
        @FormUrlEncoded
        @POST(a = "/aweme/v1/app/data/access/")
        i<BaseResponse> report(@Field(a = "address_book_access") Integer num, @Field(a = "gps_access") Integer num2);

        @FormUrlEncoded
        @POST(a = "/aweme/v1/app/data/access/")
        i<BaseResponse> report(@Field(a = "address_book_access") Integer num, @Field(a = "gps_access") Integer num2, @Field(a = "upload_type") int i, @Field(a = "impression_ids") String str);
    }

    public final void b() {
    }

    public final void c() {
    }

    private PermissionStateReporter() {
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f75921a, false, 88781, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75921a, false, 88781, new Class[0], Void.TYPE);
        } else if (this.f75924d) {
            this.f75924d = false;
        } else {
            if (this.f75923b == null) {
                this.f75923b = d.a();
            }
            i.a((Callable<TResult>) new c<TResult>(this));
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75921a, false, 88783, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75921a, false, 88783, new Class[0], Void.TYPE);
            return;
        }
        f();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f75921a, false, 88782, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75921a, false, 88782, new Class[0], Void.TYPE);
            return;
        }
        f();
    }

    public static PermissionStateReporter d() {
        if (PatchProxy.isSupport(new Object[0], null, f75921a, true, 88780, new Class[0], PermissionStateReporter.class)) {
            return (PermissionStateReporter) PatchProxy.accessDispatch(new Object[0], null, f75921a, true, 88780, new Class[0], PermissionStateReporter.class);
        }
        if (f75922c == null) {
            synchronized (PermissionStateReporter.class) {
                if (f75922c == null) {
                    f75922c = new PermissionStateReporter();
                }
            }
        }
        return f75922c;
    }
}
