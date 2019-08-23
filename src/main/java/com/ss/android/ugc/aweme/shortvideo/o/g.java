package com.ss.android.ugc.aweme.shortvideo.o;

import com.google.common.a.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.model.Segment;
import com.ss.android.ugc.aweme.shortvideo.i;
import javax.annotation.Nullable;

public final class g implements f<Segment, i> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68807a;

    @Nullable
    public final /* synthetic */ Object apply(@Nullable Object obj) {
        Segment segment = (Segment) obj;
        if (PatchProxy.isSupport(new Object[]{segment}, this, f68807a, false, 80106, new Class[]{Segment.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{segment}, this, f68807a, false, 80106, new Class[]{Segment.class}, i.class);
        } else if (segment == null) {
            return null;
        } else {
            i iVar = new i();
            iVar.f68173a = segment.begin;
            iVar.f68174b = segment.end;
            return iVar;
        }
    }
}
