package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.shortvideo.bj;
import com.ss.android.ugc.aweme.sticker.model.b;
import com.ss.android.ugc.aweme.sticker.model.d;
import com.ss.android.ugc.aweme.utils.a;

public final /* synthetic */ class ag implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69290a;

    /* renamed from: b  reason: collision with root package name */
    private final d f69291b;

    /* renamed from: c  reason: collision with root package name */
    private final String f69292c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f69293d;

    ag(d dVar, String str, Context context) {
        this.f69291b = dVar;
        this.f69292c = str;
        this.f69293d = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f69290a, false, 78807, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f69290a, false, 78807, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        d dVar = this.f69291b;
        String str = this.f69292c;
        Context context = this.f69293d;
        a.f75468b.a("confirm_toast", bj.a().a("prop_id", dVar.id).a("scene_id", "1001").a("enter_from", str).f65805b);
        if (PatchProxy.isSupport(new Object[]{context, dVar}, null, ae.f69286a, true, 78804, new Class[]{Context.class, d.class}, Boolean.TYPE)) {
            ((Boolean) PatchProxy.accessDispatch(new Object[]{context, dVar}, null, ae.f69286a, true, 78804, new Class[]{Context.class, d.class}, Boolean.TYPE)).booleanValue();
        } else if (context != null && dVar != null && !ae.a(dVar.id) && ae.b(dVar)) {
            com.ss.android.ugc.aweme.sticker.model.a aVar = dVar.commerceSticker;
            if (aVar != null) {
                b commerceStickerUnlockInfo = aVar.getCommerceStickerUnlockInfo();
                if (commerceStickerUnlockInfo != null && !h.a().a(commerceStickerUnlockInfo.openUrl)) {
                    String str2 = commerceStickerUnlockInfo.webUrl;
                    if (!com.ss.android.ugc.aweme.port.in.a.n.a(context, commerceStickerUnlockInfo.openUrl, false)) {
                        com.ss.android.ugc.aweme.port.in.a.n.a(context, str2, "");
                    }
                }
            }
        }
    }
}
