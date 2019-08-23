package com.douyin.share.d.a.a;

import android.content.Context;
import com.douyin.share.a.b.b.d;
import com.douyin.share.i;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.u;

public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final IShareService.ShareStruct f23209a;

    /* renamed from: b  reason: collision with root package name */
    private Context f23210b;

    /* renamed from: c  reason: collision with root package name */
    protected final i f23211c;

    /* renamed from: d  reason: collision with root package name */
    public String f23212d;

    /* renamed from: e  reason: collision with root package name */
    public String f23213e;

    public final String d() {
        return this.f23212d;
    }

    public final String c() {
        return this.f23209a.appName;
    }

    public final String e() {
        return this.f23209a.description;
    }

    public final byte[] f() {
        return this.f23211c.a();
    }

    public final String g() {
        return this.f23211c.f23234c;
    }

    public final String h() {
        return this.f23211c.b();
    }

    public final String i() {
        return this.f23209a.shareText;
    }

    public final long j() {
        return this.f23209a.groupId;
    }

    public final long k() {
        return this.f23209a.itemId;
    }

    public final long l() {
        return this.f23209a.adId;
    }

    public final String b() {
        if (this.f23209a.isShareOrignalUrl) {
            return this.f23209a.url;
        }
        return u.a().a(this.f23209a, this.f23213e);
    }

    public e(Context context, IShareService.ShareStruct shareStruct) {
        this(context, shareStruct, null);
    }

    public e(Context context, IShareService.ShareStruct shareStruct, i iVar) {
        this.f23210b = context;
        this.f23209a = shareStruct;
        this.f23212d = shareStruct.title;
        this.f23211c = iVar == null ? new i(context, shareStruct.thumbUrl) : iVar;
        if (shareStruct.isUrlShareWithLocalThumbPath) {
            this.f23211c.f23235d = shareStruct.getThumbPath();
        }
    }
}
