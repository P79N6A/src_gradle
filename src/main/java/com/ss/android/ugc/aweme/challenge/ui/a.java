package com.ss.android.ugc.aweme.challenge.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35579a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseDetailFragment.AnonymousClass1 f35580b;

    /* renamed from: c  reason: collision with root package name */
    private final String f35581c;

    /* renamed from: d  reason: collision with root package name */
    private final MusicModel f35582d;

    a(BaseDetailFragment.AnonymousClass1 r1, String str, MusicModel musicModel) {
        this.f35580b = r1;
        this.f35581c = str;
        this.f35582d = musicModel;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f35579a, false, 25989, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f35579a, false, 25989, new Class[0], Object.class);
        }
        BaseDetailFragment.AnonymousClass1 r0 = this.f35580b;
        BaseDetailFragment.this.a(this.f35581c, this.f35582d);
        return null;
    }
}
