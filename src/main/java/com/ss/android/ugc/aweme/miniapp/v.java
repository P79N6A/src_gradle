package com.ss.android.ugc.aweme.miniapp;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.miniapp_api.model.f;
import com.ss.android.ugc.aweme.miniapp_api.model.g;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class v extends a<f, g> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55920a;

    /* renamed from: b  reason: collision with root package name */
    private int f55921b;

    /* renamed from: c  reason: collision with root package name */
    private List<f> f55922c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f55923d = false;

    public final List<f> getItems() {
        return this.f55922c;
    }

    public final boolean isHasMore() {
        return this.f55923d;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f55920a, false, 59088, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f55920a, false, 59088, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(this.f55921b);
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f55920a, false, 59087, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f55920a, false, 59087, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(0);
    }

    private void a(final int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f55920a, false, 59089, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f55920a, false, 59089, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        m.a().a(this.mHandler, new Callable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55924a;

            public final Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f55924a, false, 59092, new Class[0], Object.class)) {
                    return ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).getMicroAppList(i, 30, 0);
                }
                return PatchProxy.accessDispatch(new Object[0], this, f55924a, false, 59092, new Class[0], Object.class);
            }
        }, 0);
    }

    public final /* synthetic */ void handleData(Object obj) {
        g gVar = (g) obj;
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f55920a, false, 59090, new Class[]{g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f55920a, false, 59090, new Class[]{g.class}, Void.TYPE);
            return;
        }
        if (gVar == null || CollectionUtils.isEmpty(gVar.f56031a)) {
            if (PatchProxy.isSupport(new Object[0], this, f55920a, false, 59091, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f55920a, false, 59091, new Class[0], Void.TYPE);
            } else {
                this.f55923d = false;
                this.f55921b = 0;
                this.f55922c.clear();
            }
        } else {
            this.f55923d = gVar.f56032b;
            this.f55921b = gVar.f56033c;
            if (this.mListQueryType == 1) {
                this.f55922c.clear();
            }
            this.f55922c.addAll(gVar.f56031a);
        }
    }
}
