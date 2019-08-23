package com.bytedance.android.livesdk.adapter;

import android.app.ProgressDialog;
import android.text.TextUtils;
import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.livesdk.adapter.FansClubAutoLightAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8928a;

    /* renamed from: b  reason: collision with root package name */
    private final FansClubAutoLightAdapter.FansClubAutoLightViewHolder.AnonymousClass2 f8929b;

    /* renamed from: c  reason: collision with root package name */
    private final ProgressDialog f8930c;

    c(FansClubAutoLightAdapter.FansClubAutoLightViewHolder.AnonymousClass2 r1, ProgressDialog progressDialog) {
        this.f8929b = r1;
        this.f8930c = progressDialog;
    }

    public final void accept(Object obj) {
        String str;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f8928a, false, 3050, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f8928a, false, 3050, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        FansClubAutoLightAdapter.FansClubAutoLightViewHolder.AnonymousClass2 r0 = this.f8929b;
        Throwable th = (Throwable) obj;
        this.f8930c.dismiss();
        if (th instanceof a) {
            a aVar = (a) th;
            if (TextUtils.isEmpty(aVar.getPrompt())) {
                str = TextUtils.isEmpty(aVar.getErrorMsg()) ? "" : aVar.getErrorMsg();
            } else {
                str = aVar.getPrompt();
            }
            if (!TextUtils.isEmpty(str)) {
                com.bytedance.android.live.uikit.d.a.a(FansClubAutoLightAdapter.FansClubAutoLightViewHolder.this.itemView.getContext(), str);
            }
        }
    }
}
