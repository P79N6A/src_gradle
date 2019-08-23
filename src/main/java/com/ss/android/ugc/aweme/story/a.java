package com.ss.android.ugc.aweme.story;

import android.os.Environment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.story.live.c;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71766a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f71767b = (((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().cacheDir() + "story/");

    /* renamed from: c  reason: collision with root package name */
    public static final String f71768c = (f71767b + "tmp_story.mp4");

    /* renamed from: d  reason: collision with root package name */
    public static final String f71769d = (f71767b + "draft/");

    /* renamed from: e  reason: collision with root package name */
    public static final String f71770e = (Environment.getExternalStorageDirectory() + "/DCIM/Camera/");

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f71766a, true, 82138, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f71766a, true, 82138, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!c.a().b()) {
            z = true;
        }
        return z;
    }

    static {
        File file = new File(f71770e);
        File file2 = new File(f71767b);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file2.exists()) {
            file.mkdirs();
        }
    }
}
