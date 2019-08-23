package com.ss.android.ugc.aweme.newfollow.f;

import a.i;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter;
import com.ss.android.ugc.aweme.newfollow.vh.n;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.publish.IPublishService;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.hn;
import com.ss.android.ugc.aweme.shortvideo.publish.c;
import com.ss.android.ugc.aweme.shortvideo.s;
import java.util.Map;
import java.util.concurrent.Callable;

public class g implements s<CreateAwemeResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57132a;

    /* renamed from: b  reason: collision with root package name */
    public IPublishService.OnPublishCallback f57133b;

    /* renamed from: c  reason: collision with root package name */
    c f57134c;

    /* renamed from: d  reason: collision with root package name */
    public n f57135d;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f57136e;

    /* renamed from: f  reason: collision with root package name */
    volatile boolean f57137f;
    private int g;
    private Handler h = new Handler(Looper.getMainLooper());

    public final void a(String str) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57132a, false, 61306, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57132a, false, 61306, new Class[0], Void.TYPE);
            return;
        }
        if (this.f57134c != null) {
            b(this.g);
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57132a, false, 61307, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57132a, false, 61307, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        b(i);
    }

    private void b(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f57132a, false, 61302, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f57132a, false, 61302, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i2;
        if ((this.f57136e == null || this.f57136e.isRecycled()) && !this.f57137f && this.f57134c != null) {
            this.f57137f = true;
            i.a((Callable<TResult>) new h<TResult>(this)).a((a.g<TResult, TContinuationResult>) new i<TResult,TContinuationResult>(this), i.f1052b);
        }
        if (this.f57135d != null) {
            n nVar = this.f57135d;
            Bitmap bitmap = this.f57136e;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bitmap}, nVar, n.f57731a, false, 62255, new Class[]{Integer.TYPE, Bitmap.class}, Void.TYPE)) {
                n nVar2 = nVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bitmap}, nVar2, n.f57731a, false, 62255, new Class[]{Integer.TYPE, Bitmap.class}, Void.TYPE);
            } else if (nVar.j != null && nVar.p()) {
                nVar.a(4);
                if (nVar.mRecyclerView != null && nVar.mRecyclerView.getScrollState() == 0 && !nVar.mRecyclerView.isComputingLayout()) {
                    ((FollowFeedAdapter) nVar.j).a(i2, bitmap);
                }
            }
        }
    }

    public final /* synthetic */ void a(at atVar) {
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) atVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{createAwemeResponse}, this, f57132a, false, 61308, new Class[]{CreateAwemeResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{createAwemeResponse}, this, f57132a, false, 61308, new Class[]{CreateAwemeResponse.class}, Void.TYPE);
            return;
        }
        if (this.f57133b != null) {
            this.f57133b.onStopPublish();
        }
        if (this.f57134c != null) {
            this.f57134c.b(this);
        }
        FollowFeed followFeed = null;
        if (createAwemeResponse != null) {
            Aweme aweme = createAwemeResponse.aweme;
            if (aweme != null) {
                aweme.setRequestId(createAwemeResponse.getRequestId());
                followFeed = new FollowFeed(aweme);
                ai.a().a(createAwemeResponse.getRequestId(), createAwemeResponse.getLogPbBean());
            }
        }
        if (this.f57135d != null) {
            if (followFeed == null || followFeed.getAweme() == null || am.b(followFeed.getAweme())) {
                z = false;
            }
            this.f57135d.a(followFeed, z);
        }
        this.h.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57141a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f57141a, false, 61313, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f57141a, false, 61313, new Class[0], Void.TYPE);
                    return;
                }
                if (g.this.f57136e != null) {
                    g.this.f57136e.recycle();
                    g.this.f57136e = null;
                }
            }
        });
    }

    public final void a(hn hnVar) {
        if (PatchProxy.isSupport(new Object[]{hnVar}, this, f57132a, false, 61309, new Class[]{hn.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hnVar}, this, f57132a, false, 61309, new Class[]{hn.class}, Void.TYPE);
            return;
        }
        if (this.f57133b != null) {
            this.f57133b.onStopPublish();
        }
        if (this.f57135d != null) {
            this.f57135d.a((FollowFeed) null, false);
        }
        if (hnVar.isRecover()) {
            a(hnVar.isCauseByApiServerException());
        }
        if (this.f57134c != null) {
            this.f57134c.b(this);
        }
        this.h.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57143a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f57143a, false, 61314, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f57143a, false, 61314, new Class[0], Void.TYPE);
                    return;
                }
                if (g.this.f57136e != null) {
                    g.this.f57136e.recycle();
                    g.this.f57136e = null;
                }
            }
        });
    }

    public final void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f57132a, false, 61304, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f57132a, false, 61304, new Class[]{c.class}, Void.TYPE);
            return;
        }
        this.f57134c = cVar;
        if (this.f57134c != null) {
            this.f57134c.a(this);
        }
        b(0);
        if (this.f57135d != null) {
            this.f57135d.q();
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57132a, false, 61303, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57132a, false, 61303, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        final boolean z2 = z;
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().getRecoverDraftIfHave(k.a(), new IPublishService.OnGetRecoverDraftCallback() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f57138a;

            public final void onFail() {
            }

            public final void onSuccess(com.ss.android.ugc.aweme.draft.a.c cVar) {
                com.ss.android.ugc.aweme.draft.a.c cVar2 = cVar;
                if (PatchProxy.isSupport(new Object[]{cVar2}, this, f57138a, false, 61312, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar2}, this, f57138a, false, 61312, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE);
                    return;
                }
                if (g.this.f57135d != null) {
                    n nVar = g.this.f57135d;
                    boolean z = z2;
                    if (PatchProxy.isSupport(new Object[]{cVar2, Byte.valueOf(z ? (byte) 1 : 0)}, nVar, n.f57731a, false, 62259, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class, Boolean.TYPE}, Void.TYPE)) {
                        n nVar2 = nVar;
                        PatchProxy.accessDispatch(new Object[]{cVar2, Byte.valueOf(z)}, nVar2, n.f57731a, false, 62259, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class, Boolean.TYPE}, Void.TYPE);
                    } else if (nVar.j != null && nVar.p()) {
                        nVar.a(4);
                        ((FollowFeedAdapter) nVar.j).a(cVar2, z);
                        r.a("publish_retry_show", (Map) d.a().a("creation_id", cVar.p()).f34114b);
                        if (PatchProxy.isSupport(new Object[]{cVar2}, nVar, n.f57731a, false, 62261, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE)) {
                            n nVar3 = nVar;
                            PatchProxy.accessDispatch(new Object[]{cVar2}, nVar3, n.f57731a, false, 62261, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE);
                            return;
                        }
                        nVar.f57732b = new IDraftService.DraftListener(cVar2) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f57744a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ com.ss.android.ugc.aweme.draft.a.c f57745b;

                            public final void onDraftCheckedChanged(boolean z) {
                            }

                            public final void onDraftClean() {
                            }

                            public final void onDraftUpdate(@NonNull com.ss.android.ugc.aweme.draft.a.c cVar) {
                            }

                            public final void onDraftDelete(@Nullable com.ss.android.ugc.aweme.draft.a.c cVar) {
                                if (PatchProxy.isSupport(new Object[]{cVar}, this, f57744a, false, 62299, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f57744a, false, 62299, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE);
                                    return;
                                }
                                if (cVar != null && TextUtils.equals(cVar.S(), this.f57745b.S())) {
                                    n.this.f(false);
                                }
                            }

                            {
                                this.f57745b = r2;
                            }
                        };
                        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().registerDraftListener(nVar.f57732b);
                    }
                }
            }
        });
    }
}
