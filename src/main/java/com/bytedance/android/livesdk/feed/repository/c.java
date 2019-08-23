package com.bytedance.android.livesdk.feed.repository;

import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class c implements FeedRepository.a.C0101a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14337a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedRepository f14338b;

    c(FeedRepository feedRepository) {
        this.f14338b = feedRepository;
    }

    public final void a(List list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f14337a, false, 8845, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f14337a, false, 8845, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        }
    }
}
