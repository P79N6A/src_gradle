package com.ss.android.ugc.aweme.draft;

import android.widget.CompoundButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;

public final /* synthetic */ class e implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43476a;

    /* renamed from: b  reason: collision with root package name */
    private final AwemeDraftViewHolder f43477b;

    e(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f43477b = awemeDraftViewHolder;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f43476a, false, 38384, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f43476a, false, 38384, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ((c) this.f43477b.g).w = z2;
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().notifyDraftCheckedChanged(z2);
    }
}
