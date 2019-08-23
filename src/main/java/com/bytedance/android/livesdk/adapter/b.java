package com.bytedance.android.livesdk.adapter;

import android.app.ProgressDialog;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.adapter.FansClubAutoLightAdapter;
import com.bytedance.android.livesdk.chatroom.model.k;
import com.bytedance.android.livesdk.chatroom.model.l;
import com.bytedance.android.livesdk.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8924a;

    /* renamed from: b  reason: collision with root package name */
    private final FansClubAutoLightAdapter.FansClubAutoLightViewHolder.AnonymousClass2 f8925b;

    /* renamed from: c  reason: collision with root package name */
    private final ProgressDialog f8926c;

    /* renamed from: d  reason: collision with root package name */
    private final k.a f8927d;

    b(FansClubAutoLightAdapter.FansClubAutoLightViewHolder.AnonymousClass2 r1, ProgressDialog progressDialog, k.a aVar) {
        this.f8925b = r1;
        this.f8926c = progressDialog;
        this.f8927d = aVar;
    }

    public final void accept(Object obj) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8924a, false, 3049, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8924a, false, 3049, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FansClubAutoLightAdapter.FansClubAutoLightViewHolder.AnonymousClass2 r0 = this.f8925b;
        ProgressDialog progressDialog = this.f8926c;
        k.a aVar = this.f8927d;
        d dVar = (d) obj;
        progressDialog.dismiss();
        if (!(dVar == null || dVar.f7871b == null || ((l) dVar.f7871b).f11137a == null)) {
            i = ((l) dVar.f7871b).f11137a.f11133a;
            aVar.f11131a = ((l) dVar.f7871b).f11137a;
        }
        ai.a(i == 1 ? C0906R.string.d28 : C0906R.string.d25);
        FansClubAutoLightAdapter.this.notifyDataSetChanged();
    }
}
