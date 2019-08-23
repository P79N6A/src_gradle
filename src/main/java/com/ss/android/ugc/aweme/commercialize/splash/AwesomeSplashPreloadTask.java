package com.ss.android.ugc.aweme.commercialize.splash;

import a.i;
import android.content.Context;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lego.LegoTask;
import com.ss.android.ugc.aweme.lego.f;
import java.util.List;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

public class AwesomeSplashPreloadTask implements LegoTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<Aweme> awemeList;

    @NotNull
    public f type() {
        return f.BOOT_FINISH;
    }

    public AwesomeSplashPreloadTask(List<Aweme> list) {
        this.awemeList = list;
    }

    public void run(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 31992, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 31992, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        a.a("AwesomeSplashPreloadTask");
        a a2 = a.a();
        List<Aweme> list = this.awemeList;
        if (PatchProxy.isSupport(new Object[]{context2, list}, a2, a.f39437a, false, 31966, new Class[]{Context.class, List.class}, Void.TYPE)) {
            a aVar = a2;
            PatchProxy.accessDispatch(new Object[]{context2, list}, aVar, a.f39437a, false, 31966, new Class[]{Context.class, List.class}, Void.TYPE);
        } else if (a2.f()) {
            for (Aweme e2 : list) {
                g.e(context2, e2, "teenage_mode");
            }
        } else if (a2.e()) {
            for (Aweme e3 : list) {
                g.e(context2, e3, "low_device");
            }
        } else {
            if (!CollectionUtils.isEmpty(list)) {
                i.a((Callable<TResult>) new b<TResult>(a2, list, context2));
            }
        }
    }
}
