package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.shortvideo.ak;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.o;
import com.ss.android.ugc.aweme.utils.a;

public final /* synthetic */ class al implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65590a;

    /* renamed from: b  reason: collision with root package name */
    private final ak.AnonymousClass1 f65591b;

    /* renamed from: c  reason: collision with root package name */
    private final o f65592c;

    /* renamed from: d  reason: collision with root package name */
    private final FaceStickerBean f65593d;

    al(ak.AnonymousClass1 r1, o oVar, FaceStickerBean faceStickerBean) {
        this.f65591b = r1;
        this.f65592c = oVar;
        this.f65593d = faceStickerBean;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f65590a, false, 73991, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f65590a, false, 73991, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        ak.AnonymousClass1 r0 = this.f65591b;
        o oVar = this.f65592c;
        FaceStickerBean faceStickerBean = this.f65593d;
        a.f75468b.a("click_transform_link", d.a().a("prop_id", oVar.f74896c.getStickerId()).a("shoot_way", oVar.f74895b).a("carrier_type", "video_shoot_page").f34114b);
        if (!com.ss.android.ugc.aweme.port.in.a.n.a((Context) ak.this.f65584b.getActivity(), faceStickerBean.getFaceStickerCommerceBean().f71642c, false)) {
            com.ss.android.ugc.aweme.port.in.a.n.a((Context) ak.this.f65584b.getActivity(), faceStickerBean.getFaceStickerCommerceBean().f71641b, (String) null);
        }
    }
}
