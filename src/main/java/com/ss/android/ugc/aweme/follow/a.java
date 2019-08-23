package com.ss.android.ugc.aweme.follow;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47734a;

    public static List<AwemeLabelModel> a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f47734a, true, 44507, new Class[]{Aweme.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{aweme}, null, f47734a, true, 44507, new Class[]{Aweme.class}, List.class);
        } else if (aweme == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (AwemeLabelModel next : aweme.getVideoLabels()) {
                if (next != null && next.getLabelType() != 11 && next.getLabelType() != 12) {
                    arrayList.add(next);
                    return arrayList;
                }
            }
            return null;
        }
    }
}
