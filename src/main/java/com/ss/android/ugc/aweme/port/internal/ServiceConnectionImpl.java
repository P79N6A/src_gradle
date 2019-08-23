package com.ss.android.ugc.aweme.port.internal;

import a.i;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.Toast;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.commerce.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.publish.Publish;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.at;
import com.ss.android.ugc.aweme.shortvideo.f.e;
import com.ss.android.ugc.aweme.shortvideo.hn;
import com.ss.android.ugc.aweme.shortvideo.publish.c;
import com.ss.android.ugc.aweme.shortvideo.s;
import com.ss.android.ugc.aweme.story.model.b;
import com.ss.android.ugc.aweme.story.shootvideo.publish.upload.model.CreateStoryResponse;
import com.ss.android.ugc.aweme.utils.bf;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.eq;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

public class ServiceConnectionImpl implements LifecycleObserver, ServiceConnection, s<at> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3768a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    c f3769b;

    /* renamed from: c  reason: collision with root package name */
    private FragmentActivity f3770c;

    /* renamed from: d  reason: collision with root package name */
    private a f3771d;

    public final void a(int i) {
    }

    public final void a(String str) {
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3768a, false, 67199, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3768a, false, 67199, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.f3769b.b(this);
            this.f3770c.unbindService(this);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3768a, false, 67200, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3768a, false, 67200, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    public ServiceConnectionImpl(FragmentActivity fragmentActivity) {
        this.f3770c = fragmentActivity;
        fragmentActivity.getLifecycle().addObserver(this);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (PatchProxy.isSupport(new Object[]{componentName}, this, f3768a, false, 67195, new Class[]{ComponentName.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{componentName}, this, f3768a, false, 67195, new Class[]{ComponentName.class}, Void.TYPE);
            return;
        }
        if (this.f3769b != null) {
            this.f3769b.b(this);
            this.f3769b = null;
        }
        this.f3771d = null;
    }

    public final void a(hn hnVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{hnVar}, this, f3768a, false, 67198, new Class[]{hn.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hnVar}, this, f3768a, false, 67198, new Class[]{hn.class}, Void.TYPE);
            return;
        }
        if (this.f3771d != null) {
            a aVar = this.f3771d;
            int b2 = this.f3769b.b();
            Object a2 = this.f3769b.a();
            if (PatchProxy.isSupport(new Object[]{hnVar, Integer.valueOf(b2), a2}, aVar, a.f61150a, false, 67165, new Class[]{hn.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{hnVar, Integer.valueOf(b2), a2}, aVar, a.f61150a, false, 67165, new Class[]{hn.class, Integer.TYPE, Object.class}, Void.TYPE);
            } else {
                a.a("onError " + b2 + " and args is " + a2);
                FragmentActivity fragmentActivity = aVar.f61151b;
                if (PatchProxy.isSupport(new Object[]{fragmentActivity, Integer.valueOf(b2), hnVar}, aVar, a.f61150a, false, 67169, new Class[]{FragmentActivity.class, Integer.TYPE, hn.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fragmentActivity, Integer.valueOf(b2), hnVar}, aVar, a.f61150a, false, 67169, new Class[]{FragmentActivity.class, Integer.TYPE, hn.class}, Void.TYPE);
                } else {
                    bg.a(new b(1, null, null, null));
                    if (hnVar.isCauseByApiServerException()) {
                        str = ((com.ss.android.ugc.aweme.base.api.a.b.a) hnVar.getCause()).getErrorMsg();
                    } else {
                        str = null;
                    }
                    if (b2 != 5) {
                        if (TextUtils.isEmpty(str)) {
                            str = fragmentActivity.getString(C0906R.string.bt4);
                        }
                        e eVar = new e(9, 99, null, str);
                        eVar.g = hnVar.isRecover();
                        eVar.h = hnVar.isCauseByApiServerException();
                        bg.a(eVar);
                    } else if (TextUtils.isEmpty(str)) {
                        str = fragmentActivity.getString(C0906R.string.dp_);
                    }
                    if (aVar.f61153d) {
                        com.bytedance.ies.dmt.ui.d.a.b(fragmentActivity.getApplicationContext(), str, 0).a();
                    }
                }
            }
        }
        a();
        this.f3769b = null;
        this.f3771d = null;
    }

    public final void a(at atVar) {
        String str;
        int i;
        at atVar2 = atVar;
        if (PatchProxy.isSupport(new Object[]{atVar2}, this, f3768a, false, 67196, new Class[]{at.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{atVar2}, this, f3768a, false, 67196, new Class[]{at.class}, Void.TYPE);
            return;
        }
        if (atVar2 instanceof CreateStoryResponse) {
            if (this.f3769b != null) {
                i = this.f3769b.b();
            } else {
                i = -1;
            }
            a.a((Throwable) new Exception("CreateStoryResponse cannot be cast to CreateAwemeResponse, and type is " + i));
        }
        if (this.f3771d != null && (atVar2 instanceof CreateAwemeResponse)) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) atVar2;
            if (PatchProxy.isSupport(new Object[]{createAwemeResponse}, this, f3768a, false, 67197, new Class[]{CreateAwemeResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{createAwemeResponse}, this, f3768a, false, 67197, new Class[]{CreateAwemeResponse.class}, Void.TYPE);
            } else if (!(createAwemeResponse == null || createAwemeResponse.aweme == null || createAwemeResponse.aweme.getVideo() == null)) {
                String videoCoverPath = createAwemeResponse.getVideoCoverPath();
                if (videoCoverPath != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Uri.fromFile(new File(videoCoverPath)).toString());
                    Video video = createAwemeResponse.aweme.getVideo();
                    if (video.getCover() != null) {
                        video.getCover().setUrlList(arrayList);
                    }
                    if (video.getDynamicCover() != null) {
                        video.getDynamicCover().setUrlList(arrayList);
                    }
                }
            }
            a aVar = this.f3771d;
            int b2 = this.f3769b.b();
            Object a2 = this.f3769b.a();
            if (PatchProxy.isSupport(new Object[]{createAwemeResponse, Integer.valueOf(b2), a2}, aVar, a.f61150a, false, 67164, new Class[]{CreateAwemeResponse.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{createAwemeResponse, Integer.valueOf(b2), a2}, aVar2, a.f61150a, false, 67164, new Class[]{CreateAwemeResponse.class, Integer.TYPE, Object.class}, Void.TYPE);
            } else {
                a.a("onSuccess " + b2 + " and response is " + createAwemeResponse.status_code + " extra is " + createAwemeResponse.extra);
                Aweme aweme = createAwemeResponse.aweme;
                bg.a(new b(0, null, null, null));
                b bVar = new b(2, null, null, aweme);
                bVar.h = createAwemeResponse.notify;
                bVar.i = createAwemeResponse.notifyExtra;
                boolean z = a2 instanceof BaseShortVideoContext;
                if (z) {
                    bVar.g = ((BaseShortVideoContext) a2).mSyncPlatforms;
                } else if (a2 instanceof PhotoContext) {
                    bVar.g = ((PhotoContext) a2).mSyncPlatforms;
                }
                bg.a(bVar);
                bg.a(new ar(15, aweme));
                if (PatchProxy.isSupport(new Object[]{aweme, "publish"}, null, com.ss.android.ugc.aweme.commerce.b.f36688a, true, 27890, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme, "publish"}, null, com.ss.android.ugc.aweme.commerce.b.f36688a, true, 27890, new Class[]{Aweme.class, String.class}, Void.TYPE);
                } else {
                    b.a aVar3 = com.ss.android.ugc.aweme.commerce.b.f36689b;
                    if (PatchProxy.isSupport(new Object[]{aweme, "publish"}, aVar3, b.a.f36690a, false, 27891, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
                        Object[] objArr = {aweme, "publish"};
                        b.a aVar4 = aVar3;
                        PatchProxy.accessDispatch(objArr, aVar4, b.a.f36690a, false, 27891, new Class[]{Aweme.class, String.class}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull("publish", "originType");
                        if (!(aweme == null || aweme.getPromotion() == null)) {
                            i.a((Callable<TResult>) new b.a.C0461a<TResult>(aweme, "publish"));
                        }
                    }
                }
                bf.a();
                a.a("result is " + aweme);
                if (aweme == null) {
                    com.ss.android.ugc.aweme.app.d.c a3 = com.ss.android.ugc.aweme.app.d.c.a();
                    n.a("aweme_publish_error", a3.a("user_info", "videoType:" + b2 + "response: " + createAwemeResponse.status_code + " " + createAwemeResponse.extra).b());
                }
                if (z) {
                    com.ss.android.ugc.aweme.discover.hitrank.c.f42388e.a((BaseShortVideoContext) a2);
                }
                if (b2 != 0) {
                    switch (b2) {
                        case 5:
                            if (!PatchProxy.isSupport(new Object[]{createAwemeResponse, a2, aweme}, aVar, a.f61150a, false, 67168, new Class[]{CreateAwemeResponse.class, Object.class, Aweme.class}, Void.TYPE)) {
                                Intent intent = new Intent(aVar.f61151b, ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService().a());
                                intent.setFlags(335544320);
                                intent.putExtra("aweme", aweme);
                                intent.putExtra("aweme_response", createAwemeResponse);
                                intent.putExtra("photoContext", (PhotoContext) a2);
                                intent.putExtra("video_type", 5);
                                aVar.f61151b.startActivity(intent);
                                break;
                            } else {
                                a aVar5 = aVar;
                                PatchProxy.accessDispatch(new Object[]{createAwemeResponse, a2, aweme}, aVar5, a.f61150a, false, 67168, new Class[]{CreateAwemeResponse.class, Object.class, Aweme.class}, Void.TYPE);
                                break;
                            }
                        case 6:
                            if (!PatchProxy.isSupport(new Object[]{createAwemeResponse, a2, aweme}, aVar, a.f61150a, false, 67166, new Class[]{CreateAwemeResponse.class, Object.class, Aweme.class}, Void.TYPE)) {
                                LocalVideoPlayerManager.a().a(((PhotoMovieContext) a2).mOutputVideoPath, aweme);
                                e eVar = new e(10, 100, aweme);
                                eVar.i = createAwemeResponse;
                                bg.a(eVar);
                                break;
                            } else {
                                a aVar6 = aVar;
                                PatchProxy.accessDispatch(new Object[]{createAwemeResponse, a2, aweme}, aVar6, a.f61150a, false, 67166, new Class[]{CreateAwemeResponse.class, Object.class, Aweme.class}, Void.TYPE);
                                break;
                            }
                    }
                } else {
                    if (PatchProxy.isSupport(new Object[]{createAwemeResponse, a2, aweme}, aVar, a.f61150a, false, 67167, new Class[]{CreateAwemeResponse.class, Object.class, Aweme.class}, Void.TYPE)) {
                        a aVar7 = aVar;
                        PatchProxy.accessDispatch(new Object[]{createAwemeResponse, a2, aweme}, aVar7, a.f61150a, false, 67167, new Class[]{CreateAwemeResponse.class, Object.class, Aweme.class}, Void.TYPE);
                    } else {
                        LocalVideoPlayerManager.a().a(((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().converToExposureData(a2).getOutPutFile(), aweme);
                        e eVar2 = new e(10, 100, aweme);
                        eVar2.i = createAwemeResponse;
                        if (PatchProxy.isSupport(new Object[]{aweme, eVar2}, aVar, a.f61150a, false, 67171, new Class[]{Aweme.class, e.class}, Void.TYPE)) {
                            a aVar8 = aVar;
                            PatchProxy.accessDispatch(new Object[]{aweme, eVar2}, aVar8, a.f61150a, false, 67171, new Class[]{Aweme.class, e.class}, Void.TYPE);
                        } else if (!(aweme == null || aweme.getAuthor() == null || aweme.getVideo() == null || !com.ss.android.ugc.aweme.festival.christmas.a.a(aweme.getStickerIDs()))) {
                            if (PatchProxy.isSupport(new Object[]{aweme}, aVar, a.f61150a, false, 67170, new Class[]{Aweme.class}, Void.TYPE)) {
                                a aVar9 = aVar;
                                PatchProxy.accessDispatch(new Object[]{aweme}, aVar9, a.f61150a, false, 67170, new Class[]{Aweme.class}, Void.TYPE);
                            } else {
                                if (aVar.f61152c == null) {
                                    aVar.f61152c = new com.ss.android.ugc.aweme.festival.christmas.d.a();
                                }
                                aVar.f61152c.a(aweme.getAid(), 1);
                            }
                            eVar2.j = true;
                        }
                        bg.a(eVar2);
                        if (aVar.f61153d) {
                            com.bytedance.ies.dmt.ui.d.a.b(aVar.f61151b.getApplicationContext(), (int) C0906R.string.dp8, 0).a();
                        }
                        d a4 = d.a().a("creation_id", ((IAVService) ServiceManager.get().getService(IAVService.class)).videoModelCoverService().converToExposureData(a2).getCreationId());
                        if (createAwemeResponse.aweme == null) {
                            str = "";
                        } else {
                            str = createAwemeResponse.aweme.getAid();
                        }
                        r.a("video_publish_done", (Map) a4.a("group_id", str).f34114b);
                    }
                }
            }
        }
        a();
        this.f3769b = null;
        this.f3771d = null;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (PatchProxy.isSupport(new Object[]{componentName, iBinder}, this, f3768a, false, 67194, new Class[]{ComponentName.class, IBinder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{componentName, iBinder}, this, f3768a, false, 67194, new Class[]{ComponentName.class, IBinder.class}, Void.TYPE);
            return;
        }
        try {
            this.f3769b = (c) iBinder;
            this.f3769b.a(this);
            if (!Publish.d(this.f3769b.b())) {
                this.f3771d = new a(this.f3770c);
                a.a("args is " + this.f3769b.a() + " when construct");
            } else {
                this.f3771d = null;
            }
            if ((this.f3770c instanceof MainActivity) && !Publish.d(this.f3769b.b())) {
                ((MainActivity) this.f3770c).onPublishServiceConnected(this.f3769b, this, this.f3769b.a());
            }
        } catch (ClassCastException e2) {
            a.a((Exception) e2);
            Toast makeText = Toast.makeText(this.f3770c, C0906R.string.ad8, 0);
            if (PatchProxy.isSupport(new Object[]{makeText}, null, k.f61181a, true, 67201, new Class[]{Toast.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{makeText}, null, k.f61181a, true, 67201, new Class[]{Toast.class}, Void.TYPE);
                return;
            }
            if (Build.VERSION.SDK_INT == 25) {
                eq.a(makeText);
            }
            makeText.show();
        }
    }
}
