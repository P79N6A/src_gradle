package com.ss.android.ugc.aweme.opensdk.share.share;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.services.IAVService;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58423a;

    public static w a(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, null, f58423a, true, 63451, new Class[]{Intent.class}, w.class)) {
            return (w) PatchProxy.accessDispatch(new Object[]{intent}, null, f58423a, true, 63451, new Class[]{Intent.class}, w.class);
        }
        Bundle b2 = b(intent);
        if (b2 == null) {
            return null;
        }
        return new w(b2);
    }

    @Nullable
    private static Bundle b(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, null, f58423a, true, 63452, new Class[]{Intent.class}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{intent}, null, f58423a, true, 63452, new Class[]{Intent.class}, Bundle.class);
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !TextUtils.isEmpty(extras.getString("_aweme_open_sdk_params_client_key"))) {
            return extras;
        }
        return null;
    }

    public static boolean a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, f58423a, true, 63457, new Class[]{c.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar2}, null, f58423a, true, 63457, new Class[]{c.class}, Boolean.TYPE)).booleanValue();
        } else if (cVar2 == null || TextUtils.isEmpty(cVar.getShareRequestBundle().getString("_aweme_open_sdk_params_client_key")) || !cVar2.mNeedShowDialog) {
            return false;
        } else {
            return true;
        }
    }

    public static w a(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, null, f58423a, true, 63458, new Class[]{Object.class}, w.class)) {
            return (w) PatchProxy.accessDispatch(new Object[]{obj2}, null, f58423a, true, 63458, new Class[]{Object.class}, w.class);
        }
        w wVar = null;
        if (obj2 == null) {
            return null;
        }
        if (obj2 instanceof PhotoContext) {
            String str = ((PhotoContext) obj2).mainBusinessData;
            if (!StringUtils.isEmpty(str)) {
                wVar = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMainBusinessContextShareContext(str);
            }
        } else if (obj2 instanceof PhotoMovieContext) {
            String str2 = ((PhotoMovieContext) obj2).mainBusinessData;
            if (!StringUtils.isEmpty(str2)) {
                wVar = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMainBusinessContextShareContext(str2);
            }
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).getShortVideoContextClass().isInstance(obj2)) {
            String shortVideoContextMainBusinessData = ((IAVService) ServiceManager.get().getService(IAVService.class)).getShortVideoContextMainBusinessData(obj2);
            if (!StringUtils.isEmpty(shortVideoContextMainBusinessData)) {
                wVar = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMainBusinessContextShareContext(shortVideoContextMainBusinessData);
            }
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().instanceOfVideoPublishEditModel(obj2)) {
            String mainBusinessData = ((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().converToExposureData(obj2).getMainBusinessData();
            if (!StringUtils.isEmpty(mainBusinessData)) {
                wVar = ((IAVService) ServiceManager.get().getService(IAVService.class)).getMainBusinessContextShareContext(mainBusinessData);
            }
        }
        return wVar;
    }
}
