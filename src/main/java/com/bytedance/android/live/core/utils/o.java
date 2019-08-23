package com.bytedance.android.live.core.utils;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8308a;

    /* renamed from: e  reason: collision with root package name */
    private static o f8309e = new o();

    /* renamed from: b  reason: collision with root package name */
    ExecutorService f8310b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f8311c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8312d = new Object();

    public static o a() {
        return f8309e;
    }

    private o() {
        ExecutorService executorService;
        if (PatchProxy.isSupport(new Object[]{1}, null, p.f8316a, true, 1146, new Class[]{Integer.TYPE}, ExecutorService.class)) {
            executorService = (ExecutorService) PatchProxy.accessDispatch(new Object[]{1}, null, p.f8316a, true, 1146, new Class[]{Integer.TYPE}, ExecutorService.class);
        } else {
            executorService = h.a(m.a(p.FIXED).a(1).a());
        }
        this.f8310b = executorService;
        this.f8311c = new LinkedList();
    }

    public final boolean a(ImageModel imageModel) {
        if (PatchProxy.isSupport(new Object[]{imageModel}, this, f8308a, false, 1142, new Class[]{ImageModel.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{imageModel}, this, f8308a, false, 1142, new Class[]{ImageModel.class}, Boolean.TYPE)).booleanValue();
        } else if (imageModel == null || Lists.isEmpty(imageModel.getUrls())) {
            return false;
        } else {
            synchronized (this.f8312d) {
                for (String contains : imageModel.getUrls()) {
                    if (this.f8311c.contains(contains)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }
}
