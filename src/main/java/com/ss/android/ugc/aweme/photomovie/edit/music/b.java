package com.ss.android.ugc.aweme.photomovie.edit.music;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.common.collect.az;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.photomovie.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicListModel;
import com.ss.android.ugc.aweme.shortvideo.presenter.c;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import java.util.ArrayList;
import java.util.List;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58969a;

    /* renamed from: b  reason: collision with root package name */
    public a f58970b = new a();

    /* renamed from: c  reason: collision with root package name */
    public d f58971c;

    /* renamed from: d  reason: collision with root package name */
    public Context f58972d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.draft.a.c f58973e;

    public b(@NonNull Context context, @NonNull com.ss.android.ugc.aweme.draft.a.c cVar) {
        this.f58973e = cVar;
        this.f58972d = context;
        this.f58970b.a(new MusicListModel());
        this.f58970b.a(this);
    }

    public final void a(MusicList musicList, String str) {
        if (PatchProxy.isSupport(new Object[]{musicList, str}, this, f58969a, false, 64118, new Class[]{MusicList.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicList, str}, this, f58969a, false, 64118, new Class[]{MusicList.class, String.class}, Void.TYPE);
            return;
        }
        this.f58971c.hide();
        ArrayList arrayList = new ArrayList();
        if (!(musicList == null || this.f58973e.f43436d == null)) {
            arrayList.addAll(musicList.musicList);
        }
        List a2 = az.a(arrayList, c.f58975b);
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null) {
            iAVService.photoMovieService().startEditDraftActivity(this.f58972d, this.f58973e, a2);
        }
    }

    public final void a(Exception exc, String str) {
        if (PatchProxy.isSupport(new Object[]{exc, str}, this, f58969a, false, 64119, new Class[]{Exception.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, str}, this, f58969a, false, 64119, new Class[]{Exception.class, String.class}, Void.TYPE);
            return;
        }
        Music a2 = a.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        this.f58971c.hide();
        List a3 = az.a(arrayList, d.f58977b);
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null) {
            iAVService.photoMovieService().startEditDraftActivity(this.f58972d, this.f58973e, a3);
        }
    }
}
