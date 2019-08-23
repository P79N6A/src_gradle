package com.ss.android.ugc.aweme.services.photomovie;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContextOld;
import com.ss.android.ugc.aweme.shortvideo.e;
import java.util.List;

public interface IPhotoMovieService {
    void getPhotoMovieCover(@NonNull PhotoMovieContext photoMovieContext, @NonNull PhotoMovieContext.a aVar);

    void getPhotoMovieCover(@NonNull PhotoMovieContextOld photoMovieContextOld, @NonNull PhotoMovieContextOld.a aVar);

    void startEditDraftActivity(@NonNull Context context, @NonNull c cVar, @NonNull List<e> list);

    void toPhotoMovieEditActivity(@NonNull Context context, @NonNull PhotoMovieContext photoMovieContext, @NonNull List<e> list, @Nullable String str);
}
