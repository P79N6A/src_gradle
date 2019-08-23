package com.ss.android.ugc.aweme.main.story.live;

import android.view.View;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.framework.services.IEventBusHelperService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.ss.android.ugc.aweme.main.story.live.view.a;

public class c implements a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f54976b;

    /* renamed from: a  reason: collision with root package name */
    private a.C0633a f54977a = new a.C0633a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54981a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f54981a, false, 58271, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54981a, false, 58271, new Class[0], Void.TYPE);
                return;
            }
            c.this.f54979d.b();
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f54981a, false, 58272, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f54981a, false, 58272, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (!c.this.f54980e) {
                c.this.f54978c.setVisibility(8);
            } else if (i == 0) {
                c.this.b();
            } else if (i == 4) {
                c.this.f54979d.c();
            } else {
                if (i == 8) {
                    c.this.a();
                }
            }
        }
    };

    /* renamed from: c  reason: collision with root package name */
    protected AbsLiveStoryItemView f54978c;

    /* renamed from: d  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.main.story.live.a.a f54979d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f54980e;

    public final View c() {
        return this.f54978c;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f54976b, false, 58268, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54976b, false, 58268, new Class[0], Void.TYPE);
            return;
        }
        this.f54979d.b();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f54976b, false, 58269, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54976b, false, 58269, new Class[0], Void.TYPE);
            return;
        }
        this.f54979d.a();
    }

    public final void a(String str) {
        this.f54978c.f54989d = str;
    }

    public final void a(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f54976b, false, 58270, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f54976b, false, 58270, new Class[]{d.class}, Void.TYPE);
        } else if (dVar == null || CollectionUtils.isEmpty(dVar.f54983a)) {
            this.f54978c.setVisibility(8);
        } else if (!dVar.f54984b || this.f54979d == null) {
            this.f54978c.setVisibility(8);
        } else {
            this.f54979d.a(dVar.f54983a);
            this.f54980e = true;
            this.f54978c.setVisibility(0);
            this.f54978c.setRequestId(dVar.getRequestId());
            IEventBusHelperService iEventBusHelperService = (IEventBusHelperService) ServiceManager.get().getService(IEventBusHelperService.class);
            if (iEventBusHelperService != null) {
                iEventBusHelperService.postWithParameter("LiveEvent", PushConstants.PUSH_TYPE_UPLOAD_LOG);
            }
        }
    }

    public c(AbsLiveStoryItemView absLiveStoryItemView, com.ss.android.ugc.aweme.main.story.live.a.a aVar) {
        this.f54978c = absLiveStoryItemView;
        this.f54979d = aVar;
        this.f54978c.setListener(this.f54977a);
    }
}
