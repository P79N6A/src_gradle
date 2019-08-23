package com.ss.android.ugc.aweme.services;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.ar;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.port.in.a;
import java.util.List;

public class FilterServiceImpl implements ar {
    public static ChangeQuickRedirect changeQuickRedirect;

    public List<h> getFilterListData() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71375, new Class[0], List.class)) {
            return (List) a.d().a().getValue();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71375, new Class[0], List.class);
    }

    public void refreshData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71373, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71373, new Class[0], Void.TYPE);
            return;
        }
        w.a();
    }

    public h getFilter(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71374, new Class[]{Integer.TYPE}, h.class)) {
            return w.a(i);
        }
        return (h) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71374, new Class[]{Integer.TYPE}, h.class);
    }

    public String getFilterEnName(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71380, new Class[]{Integer.TYPE}, String.class)) {
            return w.b(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71380, new Class[]{Integer.TYPE}, String.class);
    }

    public String getFilterFilePath(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71376, new Class[]{Integer.TYPE}, String.class)) {
            return w.c(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71376, new Class[]{Integer.TYPE}, String.class);
    }

    public String getFilterFolder(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71377, new Class[]{Integer.TYPE}, String.class)) {
            return w.d(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71377, new Class[]{Integer.TYPE}, String.class);
    }

    public String getFilterName(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71379, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71379, new Class[]{Integer.TYPE}, String.class);
        }
        String str = "";
        h a2 = w.a(i);
        if (a2 != null) {
            str = a2.f47599c;
        }
        return str;
    }

    public Uri getThumbnailUri(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71378, new Class[]{Integer.TYPE}, Uri.class)) {
            return (Uri) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71378, new Class[]{Integer.TYPE}, Uri.class);
        }
        Uri parse = Uri.parse("");
        h a2 = w.a(i);
        if (a2 != null) {
            parse = a2.g;
        }
        return parse;
    }
}
