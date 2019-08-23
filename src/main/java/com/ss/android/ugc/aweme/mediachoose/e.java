package com.ss.android.ugc.aweme.mediachoose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.mediachoose.MediaAdapter;
import com.ss.android.ugc.aweme.music.b.a.a;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class e implements Function2 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55285a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaAdapter f55286b;

    /* renamed from: c  reason: collision with root package name */
    private final MediaAdapter.ViewHolder f55287c;

    /* renamed from: d  reason: collision with root package name */
    private final int f55288d;

    /* renamed from: e  reason: collision with root package name */
    private final a f55289e;

    e(MediaAdapter mediaAdapter, MediaAdapter.ViewHolder viewHolder, int i, a aVar) {
        this.f55286b = mediaAdapter;
        this.f55287c = viewHolder;
        this.f55288d = i;
        this.f55289e = aVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f55285a, false, 58506, new Class[]{Object.class, Object.class}, Object.class)) {
            return this.f55286b.a(this.f55287c, this.f55288d, this.f55289e, (String) obj, (Long) obj2);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f55285a, false, 58506, new Class[]{Object.class, Object.class}, Object.class);
    }
}
