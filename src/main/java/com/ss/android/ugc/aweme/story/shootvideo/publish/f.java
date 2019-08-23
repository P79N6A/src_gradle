package com.ss.android.ugc.aweme.story.shootvideo.publish;

import android.support.annotation.WorkerThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.a.c;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import com.ss.android.ugc.aweme.story.shootvideo.VideoStoryEditPublishActivity;
import com.ss.android.ugc.aweme.y.b;
import com.tencent.bugly.CrashModule;
import java.util.LinkedHashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73713a;

    /* renamed from: b  reason: collision with root package name */
    public cb f73714b;

    /* renamed from: c  reason: collision with root package name */
    public VideoStoryEditPublishActivity f73715c;

    /* renamed from: d  reason: collision with root package name */
    private LinkedHashMap<String, Object> f73716d = new LinkedHashMap<>();

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f73713a, false, 85428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73713a, false, 85428, new Class[0], Void.TYPE);
            return;
        }
        b.c();
        a.t.a(true);
        ((IAVStoryService) ServiceManager.get().getService(IAVStoryService.class)).startPublish(this.f73715c, h.a(this.f73714b));
        if (this.f73714b.isSaveLocal()) {
            com.ss.android.ugc.aweme.utils.a.f75468b.a("download", new d().a("scene_id", (int) CrashModule.MODULE_ID).a("group_id", "").a("enter_from", "video_post_page").a("download_type", "self").a("download_method", "download_with_publish").f34114b);
        }
        com.ss.android.ugc.aweme.utils.a.f75468b.onEvent(MobClick.obtain().setEventName("publish").setLabelName("submit"));
    }

    @WorkerThread
    public final void a(Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f73713a, false, 85423, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f73713a, false, 85423, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        c.f65441b.a(this.f73714b).a((com.ss.android.ugc.aweme.shortvideo.a.b) new g(null));
    }
}
