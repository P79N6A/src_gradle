package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.h;
import com.ss.android.ugc.aweme.share.seconditem.j;

public final class ag implements h {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f64620c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f64621d;

    /* renamed from: e  reason: collision with root package name */
    public Aweme f64622e;

    /* renamed from: f  reason: collision with root package name */
    public IShareService.ShareStruct f64623f;
    public a g;

    public interface a {
        j a(Aweme aweme, IShareService.ShareStruct shareStruct, boolean z);
    }

    public static String a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f64620c, true, 73034, new Class[]{Aweme.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, f64620c, true, 73034, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null) {
            return "";
        } else {
            User author = aweme.getAuthor();
            if (author == null) {
                return "";
            }
            return author.getUid();
        }
    }

    public ag(Activity activity, Aweme aweme, IShareService.ShareStruct shareStruct, a aVar) {
        this.f64621d = activity;
        this.f64622e = aweme;
        this.f64623f = shareStruct;
        this.g = aVar;
    }
}
