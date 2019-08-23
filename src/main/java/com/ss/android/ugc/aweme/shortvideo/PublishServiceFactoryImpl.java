package com.ss.android.ugc.aweme.shortvideo;

import android.os.Bundle;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.photo.l;
import com.ss.android.ugc.aweme.photo.publish.Publish;
import com.ss.android.ugc.aweme.photomovie.j;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishService;
import com.ss.android.ugc.aweme.story.shootvideo.publish.upload.f;
import com.ss.android.ugc.aweme.story.shootvideo.publish.upload.i;
import com.ss.android.ugc.aweme.story.shootvideo.publish.upload.m;

@Keep
public class PublishServiceFactoryImpl implements ShortVideoPublishService.Factory {
    public static ChangeQuickRedirect changeQuickRedirect;

    public s<? extends at> buildCallback(int i, Object obj) {
        int i2 = i;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), obj2}, this, changeQuickRedirect, false, 74444, new Class[]{Integer.TYPE, Object.class}, s.class)) {
            return (s) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), obj2}, this, changeQuickRedirect, false, 74444, new Class[]{Integer.TYPE, Object.class}, s.class);
        } else if (i2 == 7 || i2 == 9 || i2 == 8) {
            return new i(obj2);
        } else {
            if (i2 == 0 || i2 == 6) {
                return new fr(i2, obj2);
            }
            return null;
        }
    }

    public Object buildArgs(int i, Bundle bundle) {
        int i2 = i;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bundle2}, this, changeQuickRedirect, false, 74443, new Class[]{Integer.TYPE, Bundle.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bundle2}, this, changeQuickRedirect, false, 74443, new Class[]{Integer.TYPE, Bundle.class}, Object.class);
        } else if (i2 == 0) {
            return bundle2.getSerializable("args");
        } else {
            if (i2 == 5) {
                return bundle2.getSerializable("args");
            }
            if (i2 == 6) {
                return bundle2.getParcelable("args");
            }
            if (Publish.d(i)) {
                return bundle2.getSerializable("args");
            }
            a.a("video publish not surpported " + i2);
            return null;
        }
    }

    public k buildFutureFactory(int i, int i2, Bundle bundle) {
        int i3 = i;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), bundle2}, this, changeQuickRedirect, false, 74445, new Class[]{Integer.TYPE, Integer.TYPE, Bundle.class}, k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), bundle2}, this, changeQuickRedirect, false, 74445, new Class[]{Integer.TYPE, Integer.TYPE, Bundle.class}, k.class);
        } else if (i3 == 0) {
            if (i2 == 1) {
                return new an(new TTUploaderService(0), bundle2.getString("shoot_way"), bundle2.getBoolean("synthetise_only"));
            }
            return new fo(new TTUploaderService(0));
        } else if (i3 == 5) {
            return new l(new TTUploaderService(0));
        } else {
            if (i3 == 6) {
                return new j(new TTUploaderService(0));
            }
            if (i3 == 7 || i3 == 9) {
                return new m(new TTUploaderService(1));
            }
            if (i3 == 8) {
                return new f(new TTUploaderService(1));
            }
            throw new AssertionError("videoType == " + i3);
        }
    }
}
