package com.ss.android.ugc.aweme.shortvideo.sticker;

import com.bef.effectsdk.message.MessageCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements MessageCenter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70333a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerModule f70334b;

    w(StickerModule stickerModule) {
        this.f70334b = stickerModule;
    }

    public final void onMessageReceived(int i, int i2, int i3, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f70333a, false, 78748, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f70333a, false, 78748, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        this.f70334b.a(i, i2, i3, str2);
    }
}
