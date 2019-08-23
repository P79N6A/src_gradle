package com.ss.android.ugc.aweme.notification.api;

import a.i;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notification.bean.Notice;
import com.ss.android.ugc.aweme.notification.bean.d;
import com.ss.android.ugc.aweme.utils.permission.e;
import io.reactivex.Observable;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class NoticeApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57956a;

    /* renamed from: b  reason: collision with root package name */
    private static NoticeApi f57957b = ((NoticeApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(NoticeApi.class));

    interface NoticeApi {
        @POST(a = "/aweme/v1/notice/del/")
        i<BaseResponse> deleteNotice(@Query(a = "notice_id") String str);

        @GET(a = "https://aweme.snssdk.com/aweme/v2/game/entry/")
        q<d> fetchGameCenter();

        @GET(a = "https://aweme.snssdk.com/aweme/v1/notice/")
        q<Notice> fetchNotice(@Query(a = "max_time") long j, @Query(a = "min_time") long j2, @Query(a = "count") int i, @Query(a = "notice_group") int i2, @Query(a = "top_group") Integer num, @Query(a = "is_mark_read") int i3, @Query(a = "address_book_access") Integer num2, @Query(a = "gps_access") Integer num3);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/notice/")
        Observable<Notice> markAsRead(@Query(a = "max_time") long j, @Query(a = "min_time") long j2, @Query(a = "count") int i, @Query(a = "notice_group") int i2, @Query(a = "top_group") Integer num, @Query(a = "is_mark_read") int i3, @Query(a = "address_book_access") Integer num2, @Query(a = "gps_access") Integer num3);

        @GET(a = "https://aweme.snssdk.com/aweme/v2/game/subscribe/")
        q<BaseResponse> reportSubscription(@Query(a = "op_type") int i);
    }

    public static d a() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f57956a, true, 63085, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f57956a, true, 63085, new Class[0], d.class);
        }
        try {
            return (d) f57957b.fetchGameCenter().get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static BaseResponse a(int i) throws Exception {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f57956a, true, 63084, new Class[]{Integer.TYPE}, BaseResponse.class)) {
            return (BaseResponse) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f57956a, true, 63084, new Class[]{Integer.TYPE}, BaseResponse.class);
        }
        try {
            return (BaseResponse) f57957b.reportSubscription(i).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static Observable<Notice> a(Integer num) {
        if (!PatchProxy.isSupport(new Object[]{num}, null, f57956a, true, 63083, new Class[]{Integer.class}, Observable.class)) {
            return f57957b.markAsRead(0, 0, 0, num.intValue(), null, 1, Integer.valueOf(e.a()), Integer.valueOf(e.b()));
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{num}, null, f57956a, true, 63083, new Class[]{Integer.class}, Observable.class);
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f57956a, true, 63086, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f57956a, true, 63086, new Class[]{String.class}, Void.TYPE);
            return;
        }
        f57957b.deleteNotice(str2);
    }

    public static Notice a(long j, long j2, int i, int i2, Integer num, int i3, int i4, int i5) throws Exception {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), Integer.valueOf(i), Integer.valueOf(i2), num, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, null, f57956a, true, 63082, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Notice.class)) {
            return (Notice) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), Integer.valueOf(i), Integer.valueOf(i2), num, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, null, f57956a, true, 63082, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Notice.class);
        }
        try {
            return (Notice) f57957b.fetchNotice(j, j2, i, i2, num, i3, Integer.valueOf(i4), Integer.valueOf(i5)).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }
}
