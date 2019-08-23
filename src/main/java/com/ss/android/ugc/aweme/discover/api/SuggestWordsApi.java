package com.ss.android.ugc.aweme.discover.api;

import a.i;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/api/SuggestWordsApi;", "", "getSuggestWords", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/SuggestWordResponse;", "businessId", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface SuggestWordsApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42100a = a.f42101a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/api/SuggestWordsApi$Companion;", "", "()V", "SUGGEST_WORDS_URL", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f42101a = new a();

        private a() {
        }
    }

    @NotNull
    @GET(a = "/api/suggest_words/")
    i<SuggestWordResponse> getSuggestWords(@NotNull @Query(a = "business_id") String str);
}
