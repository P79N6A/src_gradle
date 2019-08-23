package com.ss.android.ugc.aweme.music.util;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56802a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f56803b = (((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().musicDir() + "rhythm/");

    @Nullable
    public static String a(@NonNull MusicModel musicModel) {
        if (PatchProxy.isSupport(new Object[]{musicModel}, null, f56802a, true, 60628, new Class[]{MusicModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{musicModel}, null, f56802a, true, 60628, new Class[]{MusicModel.class}, String.class);
        }
        String str = null;
        UrlModel strongBeatUrl = musicModel.getStrongBeatUrl();
        if (strongBeatUrl != null && !CollectionUtils.isEmpty(strongBeatUrl.getUrlList())) {
            str = strongBeatUrl.getUrlList().get(0);
        }
        return str;
    }

    @NonNull
    private static String b(@NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f56802a, true, 60630, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f56802a, true, 60630, new Class[]{String.class}, String.class);
        }
        return DigestUtils.md5Hex(str) + ".json";
    }

    @NonNull
    public static String a(@NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f56802a, true, 60629, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, null, f56802a, true, 60629, new Class[]{String.class}, String.class);
        }
        return f56803b + b(str);
    }
}
