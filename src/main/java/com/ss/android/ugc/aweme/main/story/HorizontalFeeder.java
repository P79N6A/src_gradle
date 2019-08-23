package com.ss.android.ugc.aweme.main.story;

import a.g;
import a.i;
import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.e.c;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.commercialize.d.b;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.story.live.d;
import com.ss.android.ugc.aweme.story.a;
import com.ss.android.ugc.aweme.story.model.StoryResponse;
import com.ss.android.ugc.aweme.thread.h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class HorizontalFeeder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54891a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f54892b = true;

    /* renamed from: e  reason: collision with root package name */
    public static HorizontalFeedApi f54893e = ((HorizontalFeedApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(HorizontalFeedApi.class));

    /* renamed from: c  reason: collision with root package name */
    public int f54894c = 2;

    /* renamed from: d  reason: collision with root package name */
    public long f54895d;

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FeederType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @interface SkylightStatus {
    }

    public HorizontalFeeder(int i) {
        this.f54894c = i;
    }

    public final void a(long j) {
        long j2;
        long j3 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f54891a, false, 58191, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f54891a, false, 58191, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f54891a, false, 58192, new Class[0], Long.TYPE)) {
            j2 = ((Long) PatchProxy.accessDispatch(new Object[0], this, f54891a, false, 58192, new Class[0], Long.TYPE)).longValue();
        } else {
            j2 = e.c().a("last_update_time", -1);
        }
        if (j3 != j2) {
            e.c().b("last_update_time", j3);
        }
    }

    public final void a(final c<StoryResponse> cVar) {
        final String str;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f54891a, false, 58190, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f54891a, false, 58190, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (f54892b) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        i.a((Callable<TResult>) new Callable<StoryResponse>(PushConstants.PUSH_TYPE_NOTIFY) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54899a;

            public final /* synthetic */ Object call() throws Exception {
                if (PatchProxy.isSupport(new Object[0], this, f54899a, false, 58197, new Class[0], StoryResponse.class)) {
                    return (StoryResponse) PatchProxy.accessDispatch(new Object[0], this, f54899a, false, 58197, new Class[0], StoryResponse.class);
                }
                StoryResponse storyResponse = (StoryResponse) HorizontalFeeder.f54893e.getStory(HorizontalFeeder.this.f54895d, 20, HorizontalFeeder.this.f54894c, str, PushConstants.PUSH_TYPE_NOTIFY).get();
                HorizontalFeeder.this.a((long) storyResponse.getLatestTime());
                HorizontalFeeder.this.f54895d = storyResponse.getCursor();
                b.a(storyResponse.getCommerceStoryFeed());
                return storyResponse;
            }
        }).a((g<TResult, TContinuationResult>) new g<StoryResponse, Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54896a;

            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f54896a, false, 58196, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f54896a, false, 58196, new Class[]{i.class}, Void.class);
                }
                if (cVar != null) {
                    if (iVar.d() || iVar.c()) {
                        cVar.a(iVar.f());
                    } else {
                        cVar.a(iVar.e());
                    }
                }
                return null;
            }
        }, i.f1052b);
    }

    public final void a(boolean z, c<a> cVar) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), cVar}, this, f54891a, false, 58189, new Class[]{Boolean.TYPE, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), cVar}, this, f54891a, false, 58189, new Class[]{Boolean.TYPE, c.class}, Void.TYPE);
            return;
        }
        if (f54892b) {
            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        } else {
            str = PushConstants.PUSH_TYPE_NOTIFY;
        }
        if (f54892b || !z) {
            str2 = PushConstants.PUSH_TYPE_NOTIFY;
        } else {
            str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        }
        i.a((Callable<TResult>) new b<TResult>(this, str, str2), (Executor) h.c()).a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(this, str, str2)).a((g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(cVar), i.f1052b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ a a(String str, String str2, i iVar) throws Exception {
        a aVar = new a();
        if (iVar.b() && a.a()) {
            aVar.f54905c = (d) iVar.e();
        }
        this.f54895d = 0;
        try {
            aVar.f54904b = (StoryResponse) f54893e.getStory(0, 20, this.f54894c, str, str2).get();
            a((long) aVar.f54904b.getLatestTime());
            this.f54895d = aVar.f54904b.getCursor();
            b.a(aVar.f54904b.getCommerceStoryFeed());
        } catch (Exception e2) {
            if (!aVar.b()) {
                throw e2;
            }
        }
        f54892b = false;
        return aVar;
    }
}
