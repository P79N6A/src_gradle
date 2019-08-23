package com.ss.android.ugc.aweme.discover.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/model/SearchMovie;", "Ljava/io/Serializable;", "movie", "Lcom/ss/android/ugc/aweme/discover/model/Movie;", "(Lcom/ss/android/ugc/aweme/discover/model/Movie;)V", "getMovie", "()Lcom/ss/android/ugc/aweme/discover/model/Movie;", "setMovie", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMovie implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("movie")
    @NotNull
    private Movie movie;

    public static /* synthetic */ SearchMovie copy$default(SearchMovie searchMovie, Movie movie2, int i, Object obj) {
        if ((i & 1) != 0) {
            movie2 = searchMovie.movie;
        }
        return searchMovie.copy(movie2);
    }

    @NotNull
    public final Movie component1() {
        return this.movie;
    }

    @NotNull
    public final SearchMovie copy(@NotNull Movie movie2) {
        Movie movie3 = movie2;
        if (PatchProxy.isSupport(new Object[]{movie3}, this, changeQuickRedirect, false, 37106, new Class[]{Movie.class}, SearchMovie.class)) {
            return (SearchMovie) PatchProxy.accessDispatch(new Object[]{movie3}, this, changeQuickRedirect, false, 37106, new Class[]{Movie.class}, SearchMovie.class);
        }
        Intrinsics.checkParameterIsNotNull(movie3, "movie");
        return new SearchMovie(movie3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 37109, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof SearchMovie) && Intrinsics.areEqual((Object) this.movie, (Object) ((SearchMovie) obj).movie));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 37109, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37108, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37108, new Class[0], Integer.TYPE)).intValue();
        }
        Movie movie2 = this.movie;
        if (movie2 != null) {
            i = movie2.hashCode();
        }
        return i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37107, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37107, new Class[0], String.class);
        }
        return "SearchMovie(movie=" + this.movie + ")";
    }

    @NotNull
    public final Movie getMovie() {
        return this.movie;
    }

    public SearchMovie(@NotNull Movie movie2) {
        Intrinsics.checkParameterIsNotNull(movie2, "movie");
        this.movie = movie2;
    }

    public final void setMovie(@NotNull Movie movie2) {
        Movie movie3 = movie2;
        if (PatchProxy.isSupport(new Object[]{movie3}, this, changeQuickRedirect, false, 37105, new Class[]{Movie.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{movie3}, this, changeQuickRedirect, false, 37105, new Class[]{Movie.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(movie3, "<set-?>");
        this.movie = movie3;
    }
}
