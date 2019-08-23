package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteResponse;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/api/VoteApi;", "", "vote", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/data/VoteResponse;", "awemeId", "", "optionId", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface VoteApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69855a = a.f69858c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/api/VoteApi$Companion;", "", "()V", "retrofitService", "Lcom/ss/android/ugc/aweme/framework/services/IRetrofitService;", "kotlin.jvm.PlatformType", "getRetrofitService", "()Lcom/ss/android/ugc/aweme/framework/services/IRetrofitService;", "create", "Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/api/VoteApi;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69856a;

        /* renamed from: b  reason: collision with root package name */
        public static final IRetrofitService f69857b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ a f69858c = new a();

        private a() {
        }
    }

    @FormUrlEncoded
    @NotNull
    @POST(a = "/aweme/v1/vote/option/")
    Observable<VoteResponse> vote(@Field(a = "vote_id") long j, @Field(a = "option_id") long j2);
}
