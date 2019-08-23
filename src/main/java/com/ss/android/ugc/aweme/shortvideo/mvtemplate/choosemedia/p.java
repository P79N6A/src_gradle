package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageAlbumAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class p implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68618a;

    /* renamed from: b  reason: collision with root package name */
    private final MvImageAlbumAdapter f68619b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f68620c;

    /* renamed from: d  reason: collision with root package name */
    private final int f68621d;

    /* renamed from: e  reason: collision with root package name */
    private final List f68622e;

    p(MvImageAlbumAdapter mvImageAlbumAdapter, boolean z, int i, List list) {
        this.f68619b = mvImageAlbumAdapter;
        this.f68620c = z;
        this.f68621d = i;
        this.f68622e = list;
    }

    public final Object call() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f68618a, false, 77996, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f68618a, false, 77996, new Class[0], Object.class);
        }
        MvImageAlbumAdapter mvImageAlbumAdapter = this.f68619b;
        boolean z = this.f68620c;
        int i2 = this.f68621d;
        List<MvImageChooseAdapter.b> list = this.f68622e;
        if (z) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, mvImageAlbumAdapter, MvImageAlbumAdapter.f68548a, false, 77994, new Class[]{Integer.TYPE}, Void.TYPE)) {
                MvImageAlbumAdapter mvImageAlbumAdapter2 = mvImageAlbumAdapter;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, mvImageAlbumAdapter2, MvImageAlbumAdapter.f68548a, false, 77994, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                Iterator<MvImageAlbumAdapter.a> it2 = mvImageAlbumAdapter.f68549b.iterator();
                while (it2.hasNext()) {
                    MvImageAlbumAdapter.a next = it2.next();
                    if (i2 == 4) {
                        next.f68563d.clear();
                    } else if (i2 == 3) {
                        next.f68562c.clear();
                    }
                    if (PatchProxy.isSupport(new Object[0], next, MvImageAlbumAdapter.a.f68560a, false, 77998, new Class[0], Integer.TYPE)) {
                        i = ((Integer) PatchProxy.accessDispatch(new Object[0], next, MvImageAlbumAdapter.a.f68560a, false, 77998, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        i = next.f68562c.size() + next.f68563d.size();
                    }
                    if (i == 0) {
                        it2.remove();
                        mvImageAlbumAdapter.f68550c.remove(next.f68561b);
                    }
                }
            }
        }
        MvImageAlbumAdapter.a aVar = mvImageAlbumAdapter.f68549b.get(0);
        ArrayList arrayList = new ArrayList();
        for (MvImageChooseAdapter.b bVar : list) {
            mvImageAlbumAdapter.a(aVar, bVar, i2);
            String[] split = bVar.f56315e.split(File.separator);
            String str = "";
            if (split.length >= 2) {
                str = split[split.length - 2];
            }
            MvImageAlbumAdapter.a aVar2 = mvImageAlbumAdapter.f68550c.get(str);
            if (aVar2 == null) {
                aVar2 = new MvImageAlbumAdapter.a();
                aVar2.f68561b = str;
                arrayList.add(aVar2);
                mvImageAlbumAdapter.f68550c.put(str, aVar2);
            }
            mvImageAlbumAdapter.a(aVar2, bVar, i2);
        }
        return arrayList;
    }
}
