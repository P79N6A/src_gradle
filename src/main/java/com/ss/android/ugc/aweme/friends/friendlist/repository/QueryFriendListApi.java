package com.ss.android.ugc.aweme.friends.friendlist.repository;

import com.meituan.robust.ChangeQuickRedirect;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/friendlist/repository/QueryFriendListApi;", "", "getFriendList", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/story/shootvideo/friends/model/KnowFriendList;", "count", "", "cursor", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface QueryFriendListApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f48939a = a.f48941b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/friendlist/repository/QueryFriendListApi$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/friends/friendlist/repository/QueryFriendListApi;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48940a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f48941b = new a();

        private a() {
        }
    }

    @NotNull
    @GET(a = "/aweme/v1/friends/")
    Observable<com.ss.android.ugc.aweme.story.shootvideo.friends.a.a> getFriendList(@Query(a = "count") int i, @Query(a = "cursor") int i2);
}
