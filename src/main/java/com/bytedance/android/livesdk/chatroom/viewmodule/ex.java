package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.core.c.a;
import com.bytedance.android.livesdk.chatroom.dutygift.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ugc.live.a.h;

public final /* synthetic */ class ex implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13253a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoWidget2 f13254b;

    ex(VideoWidget2 videoWidget2) {
        this.f13254b = videoWidget2;
    }

    public final void a(int i, int i2, int i3, String str) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f13253a, false, 7617, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f13253a, false, 7617, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        VideoWidget2 videoWidget2 = this.f13254b;
        String str3 = VideoWidget2.g;
        a.c(str3, "onMessageReceived what: " + i4 + ", arg1: " + i5 + ", arg2: " + i6);
        videoWidget2.dataCenter.lambda$put$1$DataCenter("receiver_effect_message", new m(i4, i5, i6, str2));
    }
}
