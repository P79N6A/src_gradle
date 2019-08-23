package com.ss.android.ugc.playerkit;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.playerkit.c.a;
import com.ss.android.ugc.playerkit.c.c;
import java.util.Iterator;
import java.util.List;

public final class b {
    public static boolean a(c.a aVar) {
        if (!a.r().d()) {
            return false;
        }
        if (c.a.TT.equals(aVar) || c.a.TT_HARDWARE.equals(aVar)) {
            return true;
        }
        return false;
    }

    public static boolean a(UrlModel urlModel) {
        if (urlModel == null) {
            return false;
        }
        List<String> urlList = urlModel.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            return false;
        }
        Iterator<String> it2 = urlList.iterator();
        while (it2.hasNext()) {
            if (TextUtils.isEmpty(it2.next())) {
                it2.remove();
            }
        }
        if (urlList.isEmpty() || TextUtils.isEmpty(urlModel.getUri())) {
            return false;
        }
        return true;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
