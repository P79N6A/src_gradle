package com.ss.android.ugc.aweme.photomovie;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.e;
import java.util.List;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59053a;

    public static void a(@NonNull Context context, @NonNull PhotoMovieContext photoMovieContext, @NonNull List<e> list, @Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{context, photoMovieContext, list, str}, null, f59053a, true, 64044, new Class[]{Context.class, PhotoMovieContext.class, List.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, photoMovieContext, list, str};
            PatchProxy.accessDispatch(objArr, null, f59053a, true, 64044, new Class[]{Context.class, PhotoMovieContext.class, List.class, String.class}, Void.TYPE);
            return;
        }
        PhotoMovieEditActivity.a(context, photoMovieContext, list, str);
    }
}
