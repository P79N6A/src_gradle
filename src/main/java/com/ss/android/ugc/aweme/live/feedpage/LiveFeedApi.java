package com.ss.android.ugc.aweme.live.feedpage;

import com.meituan.robust.ChangeQuickRedirect;
import io.reactivex.Observable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Url;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/live/feedpage/LiveFeedApi;", "", "fetchLiveFeed", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/live/feedpage/LiveFeedResponse;", "url", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface LiveFeedApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f53376a = a.f53378b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/live/feedpage/LiveFeedApi$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/live/feedpage/LiveFeedApi;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53377a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f53378b = new a();

        private a() {
        }
    }

    @NotNull
    @GET
    Observable<a> fetchLiveFeed(@NotNull @Url String str);
}
