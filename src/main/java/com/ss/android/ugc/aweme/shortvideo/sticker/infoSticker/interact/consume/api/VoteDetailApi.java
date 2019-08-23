package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteDetailResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH'¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/api/VoteDetailApi;", "", "getVoteDetail", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteDetailResponse;", "voteId", "", "optionId", "offset", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface VoteDetailApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69859a = a.f69862c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/api/VoteDetailApi$Companion;", "", "()V", "retrofitService", "Lcom/ss/android/ugc/aweme/framework/services/IRetrofitService;", "kotlin.jvm.PlatformType", "getRetrofitService", "()Lcom/ss/android/ugc/aweme/framework/services/IRetrofitService;", "create", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/api/VoteDetailApi;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69860a;

        /* renamed from: b  reason: collision with root package name */
        public static final IRetrofitService f69861b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ a f69862c = new a();

        private a() {
        }
    }

    @NotNull
    @GET(a = "/aweme/v1/vote/option/userlist/")
    Observable<VoteDetailResponse> getVoteDetail(@Query(a = "vote_id") long j, @Query(a = "option_id") long j2, @Query(a = "offset") int i);
}
