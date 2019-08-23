package com.ss.android.ugc.aweme.discover.ui;

import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.SearchHistory;
import com.ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler;", "", "IGuessWordHandler", "IHotSearchHandler", "ISearchHistoryHandler", "ISearchSugHandler", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface ak {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchHistoryHandler;", "", "handleDeleteAllSearchHistory", "", "handleDeleteSearchHistoryItem", "history", "Lcom/ss/android/ugc/aweme/discover/model/SearchHistory;", "position", "", "handleSearchHistoryItemClick", "handleShowAllSearchHistory", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface c {
        void a(@NotNull SearchHistory searchHistory, int i);

        void b(@NotNull SearchHistory searchHistory, int i);

        void f();

        void g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$ISearchSugHandler;", "", "handleSearchSugItemClick", "", "entity", "Lcom/ss/android/ugc/aweme/discover/model/SearchSugEntity;", "requestId", "", "position", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface d {
        void a(@NotNull SearchSugEntity searchSugEntity, @NotNull String str, int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IGuessWordHandler;", "", "handleGuessWordItemClick", "", "word", "Lcom/ss/android/ugc/aweme/discover/model/suggest/Word;", "position", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(@NotNull Word word, int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IHotSearchHandler;", "", "handleHotSearchItemClick", "", "item", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "position", "", "enterFrom", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a(@NotNull HotSearchItem hotSearchItem, int i, @NotNull String str);
    }
}
