package com.ss.android.ugc.aweme.mediachoose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.mediachoose.MediaAdapterB;
import com.ss.android.ugc.aweme.music.b.a.a;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55293a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaAdapterB f55294b;

    /* renamed from: c  reason: collision with root package name */
    private final MediaAdapterB.ViewHolder f55295c;

    /* renamed from: d  reason: collision with root package name */
    private final int f55296d;

    /* renamed from: e  reason: collision with root package name */
    private final a f55297e;

    g(MediaAdapterB mediaAdapterB, MediaAdapterB.ViewHolder viewHolder, int i, a aVar) {
        this.f55294b = mediaAdapterB;
        this.f55295c = viewHolder;
        this.f55296d = i;
        this.f55297e = aVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f55293a, false, 58536, new Class[]{Object.class, Object.class}, Object.class)) {
            return this.f55294b.a(this.f55295c, this.f55296d, this.f55297e, (String) obj, (Long) obj2);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f55293a, false, 58536, new Class[]{Object.class, Object.class}, Object.class);
    }
}
