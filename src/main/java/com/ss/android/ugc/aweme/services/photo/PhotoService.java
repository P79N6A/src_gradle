package com.ss.android.ugc.aweme.services.photo;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity;
import com.ss.android.ugc.aweme.photo.j;
import com.ss.android.ugc.aweme.photo.t;

public class PhotoService implements IPhotoService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean isPhotoEditEnabled() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71526, new Class[0], Boolean.TYPE)) {
            return j.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71526, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public int[] getImageWidthHeight(String str) {
        if (!PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 71527, new Class[]{String.class}, int[].class)) {
            return j.a(str);
        }
        return (int[]) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 71527, new Class[]{String.class}, int[].class);
    }

    public PhotoContext compress(@NonNull String str, @NonNull t tVar) {
        if (!PatchProxy.isSupport(new Object[]{str, tVar}, this, changeQuickRedirect, false, 71524, new Class[]{String.class, t.class}, PhotoContext.class)) {
            return j.a(str, tVar);
        }
        return (PhotoContext) PatchProxy.accessDispatch(new Object[]{str, tVar}, this, changeQuickRedirect, false, 71524, new Class[]{String.class, t.class}, PhotoContext.class);
    }

    public void toPhotoEditActivity(Context context, PhotoContext photoContext) {
        if (PatchProxy.isSupport(new Object[]{context, photoContext}, this, changeQuickRedirect, false, 71528, new Class[]{Context.class, PhotoContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, photoContext}, this, changeQuickRedirect, false, 71528, new Class[]{Context.class, PhotoContext.class}, Void.TYPE);
            return;
        }
        PhotoEditActivity.a(context, photoContext);
    }

    public PhotoContext compress(@NonNull String str, @NonNull t tVar, int i, int i2) {
        if (!PatchProxy.isSupport(new Object[]{str, tVar, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 71525, new Class[]{String.class, t.class, Integer.TYPE, Integer.TYPE}, PhotoContext.class)) {
            return j.a(str, tVar, i, i2);
        }
        return (PhotoContext) PatchProxy.accessDispatch(new Object[]{str, tVar, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 71525, new Class[]{String.class, t.class, Integer.TYPE, Integer.TYPE}, PhotoContext.class);
    }
}
