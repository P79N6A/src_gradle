package com.ss.android.ugc.aweme.store;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.store.d;

public class TaskRecord {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71737a;

    /* renamed from: b  reason: collision with root package name */
    public final int f71738b;

    /* renamed from: c  reason: collision with root package name */
    public final Aweme f71739c;

    /* renamed from: d  reason: collision with root package name */
    public final d.a f71740d;
    @Status

    /* renamed from: e  reason: collision with root package name */
    public volatile int f71741e;

    public @interface Status {
    }

    public final void a(@Status int i) {
        if (i > this.f71741e && this.f71741e != 2 && this.f71741e != 5 && this.f71741e != 6) {
            this.f71741e = i;
        }
    }

    public TaskRecord(Aweme aweme, int i, d.a aVar) {
        this.f71739c = aweme;
        this.f71738b = i;
        this.f71740d = aVar;
    }
}
