package com.ss.android.ugc.aweme.o;

import android.content.Context;
import android.support.annotation.NonNull;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.a.a;
import com.ss.android.ugc.aweme.port.in.ak;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.shootvideo.publish.upload.api.CreateStoryApi;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.aweme.video.local.g;
import java.util.LinkedHashMap;

public final class v implements ak {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58334a;

    public final q<? extends at> a(String str, LinkedHashMap<String, String> linkedHashMap) {
        String str2 = str;
        LinkedHashMap<String, String> linkedHashMap2 = linkedHashMap;
        if (!PatchProxy.isSupport(new Object[]{str2, linkedHashMap2}, this, f58334a, false, 54875, new Class[]{String.class, LinkedHashMap.class}, q.class)) {
            return CreateStoryApi.f73726a.createStory(str2, linkedHashMap2);
        }
        return (q) PatchProxy.accessDispatch(new Object[]{str2, linkedHashMap2}, this, f58334a, false, 54875, new Class[]{String.class, LinkedHashMap.class}, q.class);
    }

    public final void a(Context context, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{context, th}, this, f58334a, false, 54876, new Class[]{Context.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, th}, this, f58334a, false, 54876, new Class[]{Context.class, Throwable.class}, Void.TYPE);
            return;
        }
        a.a(context, th);
    }

    public final void a(String str, @NonNull LifeStory lifeStory) {
        g gVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, lifeStory}, this, f58334a, false, 54877, new Class[]{String.class, LifeStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, lifeStory}, this, f58334a, false, 54877, new Class[]{String.class, LifeStory.class}, Void.TYPE);
            return;
        }
        LocalVideoPlayerManager a2 = LocalVideoPlayerManager.a();
        if (PatchProxy.isSupport(new Object[]{str2, lifeStory}, a2, LocalVideoPlayerManager.f76123a, false, 89143, new Class[]{String.class, LifeStory.class}, Void.TYPE)) {
            Object[] objArr = {str2, lifeStory};
            Object[] objArr2 = objArr;
            LocalVideoPlayerManager localVideoPlayerManager = a2;
            ChangeQuickRedirect changeQuickRedirect = LocalVideoPlayerManager.f76123a;
            PatchProxy.accessDispatch(objArr2, localVideoPlayerManager, changeQuickRedirect, false, 89143, new Class[]{String.class, LifeStory.class}, Void.TYPE);
            return;
        }
        if (LocalVideoPlayerManager.d()) {
            a2.c();
            if (PatchProxy.isSupport(new Object[]{lifeStory}, a2, LocalVideoPlayerManager.f76123a, false, 89150, new Class[]{LifeStory.class}, g.class)) {
                Object[] objArr3 = {lifeStory};
                LocalVideoPlayerManager localVideoPlayerManager2 = a2;
                gVar = (g) PatchProxy.accessDispatch(objArr3, localVideoPlayerManager2, LocalVideoPlayerManager.f76123a, false, 89150, new Class[]{LifeStory.class}, g.class);
            } else {
                gVar = a2.a(lifeStory.getStoryId(), String.valueOf(lifeStory.getAuthorUserId()), false, lifeStory.getVideo());
            }
            gVar.localPath = str2;
            a2.f76126c.a(gVar);
            a2.b();
        }
    }
}
