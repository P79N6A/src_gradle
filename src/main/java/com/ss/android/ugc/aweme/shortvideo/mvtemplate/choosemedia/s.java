package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class s implements Function2 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68629a;

    /* renamed from: b  reason: collision with root package name */
    private final MvImageChooseAdapter f68630b;

    /* renamed from: c  reason: collision with root package name */
    private final MvImageChooseAdapter.a f68631c;

    s(MvImageChooseAdapter mvImageChooseAdapter, MvImageChooseAdapter.a aVar) {
        this.f68630b = mvImageChooseAdapter;
        this.f68631c = aVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f68629a, false, 78016, new Class[]{Object.class, Object.class}, Object.class)) {
            return this.f68630b.a(this.f68631c, (String) obj, (Long) obj2);
        }
        return PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f68629a, false, 78016, new Class[]{Object.class, Object.class}, Object.class);
    }
}
