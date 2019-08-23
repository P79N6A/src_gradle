package com.ss.android.ugc.aweme.services;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.au;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.framework.services.IMedialibConfigService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;

public class MedialibConfigService implements IMedialibConfigService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public String getMusicEffectName(int i) {
        return "";
    }

    @Deprecated
    public String getMusicEffectPath(int i) {
        return "";
    }

    @Deprecated
    public String getMusicEffectPngPath(int i) {
        return "";
    }

    public String getSenseMeLic() {
        return null;
    }

    public boolean isOwnFaceDetectEnabled() {
        return true;
    }

    @NonNull
    public String getFaceReshapePath() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71467, new Class[0], String.class)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterFaceReshapeDir();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71467, new Class[0], String.class);
    }

    public List<h> getFilterList() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71460, new Class[0], List.class)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().getFilterListData();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71460, new Class[0], List.class);
    }

    public String getStickerDir() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71459, new Class[0], String.class)) {
            return au.h;
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71459, new Class[0], String.class);
    }

    public void refreshFilterData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71466, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71466, new Class[0], Void.TYPE);
            return;
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().refreshData();
    }

    public String getBeautyFacePath(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71457, new Class[]{Integer.TYPE}, String.class)) {
            return au.b(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71457, new Class[]{Integer.TYPE}, String.class);
    }

    public String getBeautyFacePath1_1(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71458, new Class[]{Integer.TYPE}, String.class)) {
            return au.c(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71458, new Class[]{Integer.TYPE}, String.class);
    }

    public String getFilterEnName(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71465, new Class[]{Integer.TYPE}, String.class)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().getFilterEnName(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71465, new Class[]{Integer.TYPE}, String.class);
    }

    public String getFilterFileFolder(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71462, new Class[]{Integer.TYPE}, String.class)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().getFilterFolder(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71462, new Class[]{Integer.TYPE}, String.class);
    }

    public String getFilterFilePath(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71461, new Class[]{Integer.TYPE}, String.class)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().getFilterFilePath(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71461, new Class[]{Integer.TYPE}, String.class);
    }

    public String getFilterName(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71464, new Class[]{Integer.TYPE}, String.class)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().getFilterName(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71464, new Class[]{Integer.TYPE}, String.class);
    }

    public String getFilterPath(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71455, new Class[]{Integer.TYPE}, String.class)) {
            return au.a(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71455, new Class[]{Integer.TYPE}, String.class);
    }

    public String getFilterPngPath(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71456, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71456, new Class[]{Integer.TYPE}, String.class);
        }
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, au.f47524a, true, 44421, new Class[]{Integer.TYPE}, String.class)) {
            return w.c(i);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, au.f47524a, true, 44421, new Class[]{Integer.TYPE}, String.class);
    }

    public Uri getFilterThumbnailUri(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71463, new Class[]{Integer.TYPE}, Uri.class)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().getThumbnailUri(i);
        }
        return (Uri) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 71463, new Class[]{Integer.TYPE}, Uri.class);
    }
}
