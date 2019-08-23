package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter;
import java.util.List;

public final /* synthetic */ class q implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68623a;

    /* renamed from: b  reason: collision with root package name */
    private final MvImageAlbumAdapter f68624b;

    /* renamed from: c  reason: collision with root package name */
    private final int f68625c;

    q(MvImageAlbumAdapter mvImageAlbumAdapter, int i) {
        this.f68624b = mvImageAlbumAdapter;
        this.f68625c = i;
    }

    public final Object then(i iVar) {
        MvImageAlbumAdapter.a aVar;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f68623a, false, 77997, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f68623a, false, 77997, new Class[]{i.class}, Object.class);
        }
        MvImageAlbumAdapter mvImageAlbumAdapter = this.f68624b;
        int i = this.f68625c;
        if (iVar.c() || iVar.d()) {
            return null;
        }
        mvImageAlbumAdapter.f68551d = (1 << i) | mvImageAlbumAdapter.f68551d;
        mvImageAlbumAdapter.f68549b.addAll((List) iVar.e());
        mvImageAlbumAdapter.notifyDataSetChanged();
        if (mvImageAlbumAdapter.f68552e != null) {
            MvImageAlbumAdapter.b bVar = mvImageAlbumAdapter.f68552e;
            if (PatchProxy.isSupport(new Object[0], mvImageAlbumAdapter, MvImageAlbumAdapter.f68548a, false, 77991, new Class[0], MvImageAlbumAdapter.a.class)) {
                aVar = (MvImageAlbumAdapter.a) PatchProxy.accessDispatch(new Object[0], mvImageAlbumAdapter, MvImageAlbumAdapter.f68548a, false, 77991, new Class[0], MvImageAlbumAdapter.a.class);
            } else {
                aVar = mvImageAlbumAdapter.f68549b.size() > 0 ? mvImageAlbumAdapter.f68549b.get(0) : null;
            }
            bVar.a(aVar, false, mvImageAlbumAdapter.f68551d);
        }
        return null;
    }
}
