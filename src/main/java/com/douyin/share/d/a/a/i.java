package com.douyin.share.d.a.a;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final class i extends e implements g {

    /* renamed from: a  reason: collision with root package name */
    private h f23216a = ((h) this.f23211c);

    public final byte[] a() {
        h hVar = this.f23216a;
        return hVar.a(hVar.b());
    }

    public i(Context context, IShareService.ShareStruct shareStruct) {
        super(context, shareStruct, new h(context, shareStruct.thumbUrl));
    }
}
