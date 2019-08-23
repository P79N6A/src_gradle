package com.ss.android.ugc.aweme.user.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ_\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\tH'¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/FollowApi;", "", "follow", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;", "userId", "", "secUserId", "type", "", "channelId", "from", "itemId", "fromPreviousPage", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)Lio/reactivex/Observable;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface FollowApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75353a = a.f75355b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/FollowApi$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/user/repository/FollowApi;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75354a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f75355b = new a();

        private a() {
        }
    }

    @NotNull
    @GET(a = "/aweme/v1/commit/follow/user/")
    Observable<FollowStatus> follow(@NotNull @Query(a = "user_id") String str, @NotNull @Query(a = "sec_user_id") String str2, @Query(a = "type") int i, @Query(a = "channel_id") int i2, @Nullable @Query(a = "from") Integer num, @Nullable @Query(a = "item_id") String str3, @Nullable @Query(a = "from_pre") Integer num2);
}
