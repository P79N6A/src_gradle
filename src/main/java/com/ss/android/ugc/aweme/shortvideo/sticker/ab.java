package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.Map;

public final /* synthetic */ class ab implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69281a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerModule.AnonymousClass5 f69282b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f69283c;

    /* renamed from: d  reason: collision with root package name */
    private final FaceStickerBean f69284d;

    ab(StickerModule.AnonymousClass5 r1, Map map, FaceStickerBean faceStickerBean) {
        this.f69282b = r1;
        this.f69283c = map;
        this.f69284d = faceStickerBean;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f69281a, false, 78762, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f69281a, false, 78762, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f69282b.a(this.f69283c, this.f69284d);
    }
}
