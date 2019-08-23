package com.bytedance.android.livesdk.chatroom.a.c;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9734a;

    /* renamed from: b  reason: collision with root package name */
    private final a f9735b;

    /* renamed from: c  reason: collision with root package name */
    private final FansClubData f9736c;

    c(a aVar, FansClubData fansClubData) {
        this.f9735b = aVar;
        this.f9736c = fansClubData;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9734a, false, 3937, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9734a, false, 3937, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f9735b;
        FansClubData fansClubData = this.f9736c;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            aVar.f9725f.setVisibility(8);
            aVar.g.setVisibility(8);
            return;
        }
        aVar.f9725f.setImageBitmap(bitmap.copy(Bitmap.Config.ARGB_8888, true));
        aVar.g.setText(fansClubData.clubName);
        aVar.f9725f.setVisibility(0);
        aVar.g.setVisibility(0);
        if (aVar.f9722c != null) {
            aVar.f9722c.a(aVar.f9721b);
        }
    }
}
