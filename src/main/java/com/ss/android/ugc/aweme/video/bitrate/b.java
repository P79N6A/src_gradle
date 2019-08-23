package com.ss.android.ugc.aweme.video.bitrate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import java.util.Comparator;

public final /* synthetic */ class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76017a;

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator f76018b = new b();

    private b() {
    }

    public final int compare(Object obj, Object obj2) {
        if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f76017a, false, 89076, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
            return ((BitRate) obj2).getBitRate() - ((BitRate) obj).getBitRate();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f76017a, false, 89076, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
    }
}
