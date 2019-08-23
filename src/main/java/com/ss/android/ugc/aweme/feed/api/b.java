package com.ss.android.ugc.aweme.feed.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.aweme.proto.aweme_v2_feed_response;
import io.reactivex.functions.Function;

public final /* synthetic */ class b implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45059a;

    /* renamed from: b  reason: collision with root package name */
    private final int f45060b;

    /* renamed from: c  reason: collision with root package name */
    private final long f45061c;

    /* renamed from: d  reason: collision with root package name */
    private final long f45062d;

    /* renamed from: e  reason: collision with root package name */
    private final int f45063e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f45064f;
    private final String g;
    private final int h;
    private final String i;
    private final String j;

    b(int i2, long j2, long j3, int i3, Integer num, String str, int i4, String str2, String str3) {
        this.f45060b = i2;
        this.f45061c = j2;
        this.f45062d = j3;
        this.f45063e = i3;
        this.f45064f = num;
        this.g = str;
        this.h = i4;
        this.i = str2;
        this.j = str3;
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f45059a, false, 40881, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f45059a, false, 40881, new Class[]{Object.class}, Object.class);
        }
        int i2 = this.f45060b;
        long j2 = this.f45061c;
        long j3 = this.f45062d;
        int i3 = this.f45063e;
        Integer num = this.f45064f;
        String str = this.g;
        int i4 = this.h;
        return FeedApi.a(i2, j2, j3, i3, num, str, i4, this.i, this.j, (aweme_v2_feed_response) obj);
    }
}
