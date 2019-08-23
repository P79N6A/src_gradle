package com.ss.android.ugc.aweme.shortvideo;

import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.as;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import com.ss.android.ugc.aweme.tools.o;
import java.lang.reflect.Type;

public final class ak implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65583a;

    /* renamed from: b  reason: collision with root package name */
    public ShortVideoRecordingOperationPanelFragment f65584b;

    ak(ShortVideoRecordingOperationPanelFragment shortVideoRecordingOperationPanelFragment) {
        this.f65584b = shortVideoRecordingOperationPanelFragment;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        Type type2 = type;
        if (PatchProxy.isSupport(new Object[]{bdVar, type2}, this, f65583a, false, 73989, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type2}, this, f65583a, false, 73989, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type2 != o.class) {
            return null;
        } else {
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65585a;

                /* renamed from: b  reason: collision with root package name */
                LinearLayout f65586b;

                /* renamed from: c  reason: collision with root package name */
                DmtTextView f65587c;

                /* renamed from: d  reason: collision with root package name */
                long f65588d = FaceStickerBean.NONE.getStickerId();

                public final void a(Object obj, T t) {
                    if (PatchProxy.isSupport(new Object[]{obj, t}, this, f65585a, false, 73990, new Class[]{Object.class, bc.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj, t}, this, f65585a, false, 73990, new Class[]{Object.class, bc.class}, Void.TYPE);
                        return;
                    }
                    o oVar = (o) t;
                    if (this.f65586b == null) {
                        this.f65586b = (LinearLayout) ak.this.f65584b.getView().findViewById(C0906R.id.xj);
                    }
                    if (this.f65587c == null) {
                        this.f65587c = (DmtTextView) ak.this.f65584b.getView().findViewById(C0906R.id.xk);
                        if (a.a()) {
                            this.f65587c.setFontType("ProximaNova-Semibold");
                        } else {
                            this.f65587c.setFontType("PingFangSC-Medium");
                        }
                    }
                    this.f65586b.setVisibility(oVar.f74894a);
                    if (oVar.f74894a == 0) {
                        FaceStickerBean faceStickerBean = oVar.f74896c;
                        if (faceStickerBean == null || !faceStickerBean.shouldShowCommerceStickerTag()) {
                            this.f65586b.setVisibility(8);
                        } else if (this.f65588d != faceStickerBean.getStickerId()) {
                            com.ss.android.ugc.aweme.utils.a.f75468b.a("show_transform_link", d.a().a("prop_id", oVar.f74896c.getStickerId()).a("shoot_way", oVar.f74895b).a("carrier_type", "video_shoot_page").f34114b);
                            this.f65588d = oVar.f74896c.getStickerId();
                            this.f65587c.setText(faceStickerBean.getFaceStickerCommerceBean().f71643d);
                            this.f65586b.setOnClickListener(new al(this, oVar, faceStickerBean));
                            ak.this.f65584b.k().a(obj, (bc) new as(8));
                        }
                    }
                }
            };
        }
    }
}
