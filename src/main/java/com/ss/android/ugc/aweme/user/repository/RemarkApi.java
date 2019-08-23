package com.ss.android.ugc.aweme.user.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H'¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/RemarkApi;", "", "commitRemarkName", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/profile/model/CommitRemarkNameResponse;", "remarkName", "", "userId", "secUserId", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface RemarkApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75356a = a.f75358b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/user/repository/RemarkApi$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/user/repository/RemarkApi;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75357a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f75358b = new a();

        private a() {
        }
    }

    @FormUrlEncoded
    @NotNull
    @POST(a = "/aweme/v1/user/remark/name/")
    Observable<CommitRemarkNameResponse> commitRemarkName(@NotNull @Field(a = "remark_name") String str, @NotNull @Field(a = "user_id") String str2, @NotNull @Field(a = "sec_user_id") String str3);
}
