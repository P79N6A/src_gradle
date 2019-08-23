package com.ss.android.ugc.aweme.shortvideo.sticker;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule;
import com.ss.android.ugc.aweme.utils.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

public final /* synthetic */ class aa implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69278a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerModule.AnonymousClass5 f69279b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f69280c;

    aa(StickerModule.AnonymousClass5 r1, Map map) {
        this.f69279b = r1;
        this.f69280c = map;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f69278a, false, 78761, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f69278a, false, 78761, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        StickerModule.AnonymousClass5 r0 = this.f69279b;
        Map map = this.f69280c;
        map.put("to_status", "cancel");
        a.f75468b.a("shoot_video_delete_confirm", map);
        if (StickerModule.this.h != null) {
            StickerModule.this.h.a((Effect) null);
        }
    }
}
