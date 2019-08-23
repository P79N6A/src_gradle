package com.ss.android.ugc.aweme.story.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73235a;

    /* renamed from: b  reason: collision with root package name */
    public final int f73236b;

    /* renamed from: c  reason: collision with root package name */
    public final String f73237c = null;

    /* renamed from: d  reason: collision with root package name */
    public final String f73238d = null;

    /* renamed from: e  reason: collision with root package name */
    public final Aweme f73239e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f73240f;
    public String g;
    public String[] h;
    public CreateAwemeResponse.a i;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f73235a, false, 84797, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f73235a, false, 84797, new Class[0], String.class);
        }
        return "state:" + this.f73236b + "  materialId:" + this.f73237c + " videoPath:" + this.f73238d;
    }

    public b(int i2, String str, String str2, Aweme aweme) {
        this.f73236b = i2;
        this.f73239e = aweme;
    }
}
