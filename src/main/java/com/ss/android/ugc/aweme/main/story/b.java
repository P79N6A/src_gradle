package com.ss.android.ugc.aweme.main.story;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.story.live.d;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54909a;

    /* renamed from: b  reason: collision with root package name */
    private final HorizontalFeeder f54910b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54911c;

    /* renamed from: d  reason: collision with root package name */
    private final String f54912d;

    b(HorizontalFeeder horizontalFeeder, String str, String str2) {
        this.f54910b = horizontalFeeder;
        this.f54911c = str;
        this.f54912d = str2;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f54909a, false, 58193, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f54909a, false, 58193, new Class[0], Object.class);
        }
        HorizontalFeeder horizontalFeeder = this.f54910b;
        return (d) HorizontalFeeder.f54893e.fetchRecommendAvatars(horizontalFeeder.f54894c, this.f54911c, this.f54912d).get();
    }
}
