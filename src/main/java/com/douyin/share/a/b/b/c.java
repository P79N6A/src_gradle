package com.douyin.share.a.b.b;

import android.app.Activity;
import android.content.Context;
import com.douyin.share.d.a.a.e;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final class c extends e {

    /* renamed from: a  reason: collision with root package name */
    public final IShareService.ShareStruct f23135a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f23136b;

    public final String a() {
        return this.f23135a.authorName;
    }

    public c(Context context, Activity activity, IShareService.ShareStruct shareStruct) {
        super(context, shareStruct);
        this.f23135a = shareStruct;
        this.f23136b = activity;
    }
}
