package com.ss.android.ugc.aweme.draft;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.AwemeDraftMusicHolder;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.f;
import com.ss.android.ugc.aweme.shortvideo.e;

public final /* synthetic */ class b implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43466a;

    /* renamed from: b  reason: collision with root package name */
    private final AwemeDraftMusicHolder.AnonymousClass2 f43467b;

    /* renamed from: c  reason: collision with root package name */
    private final String f43468c;

    /* renamed from: d  reason: collision with root package name */
    private final int f43469d;

    /* renamed from: e  reason: collision with root package name */
    private final String f43470e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f43471f;
    private final Context g;
    private final e h;
    private final int i;

    b(AwemeDraftMusicHolder.AnonymousClass2 r1, String str, int i2, String str2, float[] fArr, Context context, e eVar, int i3) {
        this.f43467b = r1;
        this.f43468c = str;
        this.f43469d = i2;
        this.f43470e = str2;
        this.f43471f = fArr;
        this.g = context;
        this.h = eVar;
        this.i = i3;
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f43466a, false, 38361, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f43466a, false, 38361, new Class[]{com.ss.android.ugc.aweme.shortvideo.f.class}, Void.TYPE);
            return;
        }
        this.f43467b.a(this.f43468c, this.f43469d, this.f43470e, this.f43471f, this.g, this.h, this.i, fVar);
    }
}
