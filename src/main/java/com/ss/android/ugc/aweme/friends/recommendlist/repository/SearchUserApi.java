package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJT\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\u000e\u001a\u00020\bH'¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/SearchUserApi;", "", "searchUserList", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/discover/model/SearchUserList;", "cursor", "", "keyword", "", "count", "", "type", "pullRefresh", "hotSearch", "source", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface SearchUserApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f48984a = a.f48986b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/SearchUserApi$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/SearchUserApi;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48985a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f48986b = new a();

        private a() {
        }
    }

    @NotNull
    @GET(a = "/aweme/v1/discover/search/")
    Observable<SearchUserList> searchUserList(@Query(a = "cursor") long j, @NotNull @Query(a = "keyword") String str, @Query(a = "count") int i, @Query(a = "type") int i2, @Query(a = "is_pull_refresh") int i3, @Query(a = "hot_search") int i4, @NotNull @Query(a = "search_source") String str2);
}
