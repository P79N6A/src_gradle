package com.ss.android.ugc.aweme.commercialize.splash;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AwesomeSplashEvent {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39419a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39420b;

    /* renamed from: c  reason: collision with root package name */
    public final Aweme f39421c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Status {
    }

    private AwesomeSplashEvent(int i, Aweme aweme) {
        this.f39420b = i;
        this.f39421c = aweme;
    }

    public static void a(int i, Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aweme2}, null, f39419a, true, 31949, new Class[]{Integer.TYPE, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aweme2}, null, f39419a, true, 31949, new Class[]{Integer.TYPE, Aweme.class}, Void.TYPE);
            return;
        }
        bg.a(new AwesomeSplashEvent(i, aweme2));
    }
}
