package com.ss.android.ugc.aweme.draft;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.AwemeDraftAdapter;

public final /* synthetic */ class i implements AwemeDraftAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43484a;

    /* renamed from: b  reason: collision with root package name */
    private final DraftBoxFragment f43485b;

    i(DraftBoxFragment draftBoxFragment) {
        this.f43485b = draftBoxFragment;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43484a, false, 38422, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43484a, false, 38422, new Class[0], Void.TYPE);
            return;
        }
        this.f43485b.getActivity().finish();
    }
}
