package com.ss.android.ugc.aweme.draft;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.a.c;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43488a;

    /* renamed from: b  reason: collision with root package name */
    private final DraftBoxFragment f43489b;

    /* renamed from: c  reason: collision with root package name */
    private final List f43490c;

    k(DraftBoxFragment draftBoxFragment, List list) {
        this.f43489b = draftBoxFragment;
        this.f43490c = list;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43488a, false, 38424, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43488a, false, 38424, new Class[0], Void.TYPE);
            return;
        }
        DraftBoxFragment draftBoxFragment = this.f43489b;
        List list = this.f43490c;
        if (draftBoxFragment.isViewValid()) {
            draftBoxFragment.f43404d.setVisibility(8);
            int size = list.size();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(size)}, draftBoxFragment, DraftBoxFragment.f43401a, false, 38410, new Class[]{Integer.TYPE}, Void.TYPE)) {
                DraftBoxFragment draftBoxFragment2 = draftBoxFragment;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(size)}, draftBoxFragment2, DraftBoxFragment.f43401a, false, 38410, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (!draftBoxFragment.k) {
                r.a("click_draft_entrance", (Map) d.a().a("draft_cnt", size).f34114b);
                draftBoxFragment.k = true;
            }
            AwemeDraftAdapter awemeDraftAdapter = draftBoxFragment.h;
            if (PatchProxy.isSupport(new Object[]{list}, awemeDraftAdapter, AwemeDraftAdapter.f43351a, false, 38337, new Class[]{List.class}, Void.TYPE)) {
                AwemeDraftAdapter awemeDraftAdapter2 = awemeDraftAdapter;
                PatchProxy.accessDispatch(new Object[]{list}, awemeDraftAdapter2, AwemeDraftAdapter.f43351a, false, 38337, new Class[]{List.class}, Void.TYPE);
                return;
            }
            if (!(list == null || list.size() == 0)) {
                c cVar = new c();
                cVar.v = 2;
                list.add(0, cVar);
                awemeDraftAdapter.f43352b = true;
            }
            awemeDraftAdapter.setData(list);
        }
    }
}
