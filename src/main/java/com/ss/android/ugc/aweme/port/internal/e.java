package com.ss.android.ugc.aweme.port.internal;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.photo.PhotoContext;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61158a;

    public static void a(Activity activity, @NonNull Aweme aweme, @Nullable PhotoContext photoContext) {
        Activity activity2 = activity;
        Aweme aweme2 = aweme;
        PhotoContext photoContext2 = photoContext;
        if (PatchProxy.isSupport(new Object[]{activity2, aweme2, photoContext2}, null, f61158a, true, 67179, new Class[]{Activity.class, Aweme.class, PhotoContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, aweme2, photoContext2}, null, f61158a, true, 67179, new Class[]{Activity.class, Aweme.class, PhotoContext.class}, Void.TYPE);
            return;
        }
        a.b(new g(photoContext2, activity2, aweme2));
    }
}
