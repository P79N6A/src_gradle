package com.ss.android.ugc.aweme.mediachoose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.mediachoose.ImageAlbumAdapter;
import com.ss.android.ugc.aweme.mediachoose.ImageChooseAdapterB;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55277a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageAlbumAdapter f55278b;

    /* renamed from: c  reason: collision with root package name */
    private final List f55279c;

    public c(ImageAlbumAdapter imageAlbumAdapter, List list) {
        this.f55278b = imageAlbumAdapter;
        this.f55279c = list;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f55277a, false, 58433, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f55277a, false, 58433, new Class[0], Object.class);
        }
        ImageAlbumAdapter imageAlbumAdapter = this.f55278b;
        List<ImageChooseAdapterB.a> list = this.f55279c;
        ImageAlbumAdapter.a aVar = new ImageAlbumAdapter.a();
        aVar.f55081a = imageAlbumAdapter.f55070c.getResources().getString(C0906R.string.e7);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        for (ImageChooseAdapterB.a aVar2 : list) {
            aVar.f55082b.add(aVar2);
            String[] split = aVar2.f56315e.split(File.separator);
            String str = "";
            if (split.length >= 2) {
                str = split[split.length - 2];
            }
            ImageAlbumAdapter.a aVar3 = null;
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ImageAlbumAdapter.a aVar4 = (ImageAlbumAdapter.a) it2.next();
                if (aVar4.f55081a.equals(str)) {
                    aVar3 = aVar4;
                    break;
                }
            }
            if (aVar3 == null) {
                aVar3 = new ImageAlbumAdapter.a();
                aVar3.f55081a = str;
                arrayList.add(aVar3);
            }
            aVar3.f55082b.add(aVar2);
        }
        return arrayList;
    }
}
