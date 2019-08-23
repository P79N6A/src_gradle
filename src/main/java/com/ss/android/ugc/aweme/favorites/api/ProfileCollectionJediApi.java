package com.ss.android.ugc.aweme.favorites.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.favorites.a.i;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/api/ProfileCollectionJediApi;", "", "getProfileCollection", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/favorites/bean/UserCollectionResponse;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface ProfileCollectionJediApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f44266a = a.f44268b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/api/ProfileCollectionJediApi$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/favorites/api/ProfileCollectionJediApi;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f44267a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f44268b = new a();

        private a() {
        }
    }

    @NotNull
    @GET(a = "/aweme/v1/user/collectionlist/")
    Observable<i> getProfileCollection();
}
