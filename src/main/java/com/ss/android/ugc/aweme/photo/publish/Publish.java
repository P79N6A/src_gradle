package com.ss.android.ugc.aweme.photo.publish;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.services.IAVService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Publish {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58692a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Permission {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface UploadType {
    }

    public static String a(int i) {
        switch (i) {
            case 0:
                return "public";
            case 1:
                return PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE;
            case 2:
                return "friend";
            default:
                return "public";
        }
    }

    public static String b(int i) {
        if (i != 0) {
            switch (i) {
                case 5:
                case 8:
                    return "photo";
                case 6:
                    return "slideshow";
                case e.l:
                case 9:
                    break;
                default:
                    return null;
            }
        }
        return "video";
    }

    public static boolean c(int i) {
        return i == 0 || i == 7;
    }

    public static boolean d(int i) {
        return i == 8 || i == 7 || i == 9;
    }

    public static String a(int i, Object obj) {
        String str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), obj2}, null, f58692a, true, 63781, new Class[]{Integer.TYPE, Object.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), obj2}, null, f58692a, true, 63781, new Class[]{Integer.TYPE, Object.class}, String.class);
        }
        String str2 = null;
        if (i != 0) {
            switch (i) {
                case 5:
                    if (((PhotoContext) obj2).mPhotoFrom != 1) {
                        str = "upload";
                        break;
                    } else {
                        str = "shoot";
                        break;
                    }
                case 6:
                    str2 = "upload";
                    break;
                case e.l:
                case 8:
                case 9:
                    break;
            }
        }
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().converToExposureData(obj2).getOrigin() == 1) {
            str = "shoot";
        } else {
            str = "upload";
        }
        str2 = str;
        return str2;
    }
}
