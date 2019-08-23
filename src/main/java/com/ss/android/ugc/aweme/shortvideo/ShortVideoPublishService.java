package com.ss.android.ugc.aweme.shortvideo;

import a.i;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.google.common.a.u;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.publish.Publish;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.property.f;
import com.ss.android.ugc.aweme.shortvideo.edit.cb;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.d;
import com.ss.android.ugc.aweme.shortvideo.publish.c;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;

public class ShortVideoPublishService extends Service implements s<at> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65406a;

    /* renamed from: b  reason: collision with root package name */
    el f65407b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<s> f65408c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    Object f65409d;

    /* renamed from: e  reason: collision with root package name */
    int f65410e;

    /* renamed from: f  reason: collision with root package name */
    String f65411f;
    boolean g;
    boolean h;
    @Nullable
    public String i;
    Factory j = ((Factory) ServiceManager.get().getService(Factory.class));

    @Keep
    public interface Factory {
        Object buildArgs(int i, Bundle bundle);

        s<? extends at> buildCallback(int i, Object obj);

        k buildFutureFactory(int i, int i2, Bundle bundle);
    }

    public class a extends Binder implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65415a;

        public final Object a() {
            return ShortVideoPublishService.this.f65409d;
        }

        public final int b() {
            return ShortVideoPublishService.this.f65410e;
        }

        @Nullable
        public final Bitmap c() {
            if (PatchProxy.isSupport(new Object[0], this, f65415a, false, 74674, new Class[0], Bitmap.class)) {
                return (Bitmap) PatchProxy.accessDispatch(new Object[0], this, f65415a, false, 74674, new Class[0], Bitmap.class);
            } else if (ShortVideoPublishService.this.f65407b == null) {
                return null;
            } else {
                el elVar = ShortVideoPublishService.this.f65407b;
                Object obj = ShortVideoPublishService.this.f65409d;
                if (!PatchProxy.isSupport(new Object[]{obj}, elVar, el.f67536a, false, 74471, new Class[]{Object.class}, Bitmap.class)) {
                    return elVar.f67541f.c(obj);
                }
                return (Bitmap) PatchProxy.accessDispatch(new Object[]{obj}, elVar, el.f67536a, false, 74471, new Class[]{Object.class}, Bitmap.class);
            }
        }

        private a() {
        }

        public final void a(s sVar) {
            if (PatchProxy.isSupport(new Object[]{sVar}, this, f65415a, false, 74672, new Class[]{s.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{sVar}, this, f65415a, false, 74672, new Class[]{s.class}, Void.TYPE);
            } else if (sVar != null) {
                ai.d("ShortVideoPublishService registerCallback");
                ShortVideoPublishService.this.f65408c.add(sVar);
                if (ShortVideoPublishService.this.h) {
                    i.a((Callable<TResult>) new fs<TResult>(this), i.f1052b);
                }
            }
        }

        public final void b(s sVar) {
            s sVar2 = sVar;
            if (PatchProxy.isSupport(new Object[]{sVar2}, this, f65415a, false, 74673, new Class[]{s.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{sVar2}, this, f65415a, false, 74673, new Class[]{s.class}, Void.TYPE);
                return;
            }
            ai.d("ShortVideoPublishService unregisterCallback");
            ShortVideoPublishService.this.f65408c.remove(sVar2);
        }

        /* synthetic */ a(ShortVideoPublishService shortVideoPublishService, byte b2) {
            this();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f65406a, false, 74670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65406a, false, 74670, new Class[0], Void.TYPE);
            return;
        }
        ai.d("ShortVideoPublishService onDestroy");
        if (this.f65407b != null) {
            el elVar = this.f65407b;
            if (PatchProxy.isSupport(new Object[0], elVar, el.f67536a, false, 74458, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], elVar, el.f67536a, false, 74458, new Class[0], Void.TYPE);
            } else {
                ai.d("Publisher cancelSynthetise");
                if (ej.a().d()) {
                    elVar.h.cancel();
                    elVar.k.b();
                    ej.a().a(10);
                }
            }
        }
        super.onDestroy();
    }

    private String a(Intent intent) {
        Intent intent2 = intent;
        if (!PatchProxy.isSupport(new Object[]{intent2}, this, f65406a, false, 74663, new Class[]{Intent.class}, String.class)) {
            return intent2.getStringExtra("shoot_way");
        }
        return (String) PatchProxy.accessDispatch(new Object[]{intent2}, this, f65406a, false, 74663, new Class[]{Intent.class}, String.class);
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f65406a, false, 74664, new Class[]{Intent.class}, IBinder.class)) {
            return (IBinder) PatchProxy.accessDispatch(new Object[]{intent}, this, f65406a, false, 74664, new Class[]{Intent.class}, IBinder.class);
        }
        ai.d("ShortVideoPublishService onBind");
        return new a(this, (byte) 0);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65406a, false, 74665, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65406a, false, 74665, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        Iterator it2 = new ArrayList(this.f65408c).iterator();
        while (it2.hasNext()) {
            ((s) it2.next()).a(i2);
        }
    }

    public final void a(at atVar) {
        if (PatchProxy.isSupport(new Object[]{atVar}, this, f65406a, false, 74666, new Class[]{at.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{atVar}, this, f65406a, false, 74666, new Class[]{at.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.a.a.a("service args is " + this.f65409d + " videoType is " + this.f65410e + " onSuccess start " + this.f65408c.size());
        if (this.f65410e == 0) {
            cb cbVar = (cb) this.f65409d;
            com.ss.android.ugc.aweme.port.in.a.t.a((BaseResponse) atVar, cbVar.getVideoLength());
            com.ss.android.ugc.aweme.port.in.a.t.a((BaseResponse) atVar, b.b(cbVar.mainBusinessData, d.TRACK_PAGE_EDIT));
            atVar.videoCoverPath = this.i;
        }
        Iterator it2 = new ArrayList(this.f65408c).iterator();
        while (it2.hasNext()) {
            ((s) it2.next()).a(atVar);
        }
        t tVar = new t();
        if (this.f65410e == 0) {
            cb cbVar2 = (cb) this.f65409d;
            t a2 = tVar.a("bitrate", String.valueOf(f.e())).a("duration", String.valueOf(cbVar2.mVideoLength));
            a2.a("resolution", cbVar2.mVideoWidth + "x" + cbVar2.mVideoHeight).a("shoot_way", this.f65411f);
            a(cbVar2.creationId, true);
        } else if (this.f65410e == 6) {
            PhotoMovieContext photoMovieContext = (PhotoMovieContext) this.f65409d;
            t a3 = tVar.a("bitrate", String.valueOf(f.e())).a("duration", String.valueOf(photoMovieContext.mVideoLength));
            a3.a("resolution", photoMovieContext.mWidth + "x" + photoMovieContext.mHeight).a("shoot_way", this.f65411f);
            a(photoMovieContext.creationId, true);
        }
        r.onEvent(MobClick.obtain().setEventName("publish").setLabelName("finish").setJsonObject(tVar.a()));
        com.ss.android.ugc.aweme.framework.a.a.a("service args is " + this.f65409d + " videoType is " + this.f65410e + " before stop");
        stopSelf();
    }

    public final void a(hn hnVar) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{hnVar}, this, f65406a, false, 74668, new Class[]{hn.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hnVar}, this, f65406a, false, 74668, new Class[]{hn.class}, Void.TYPE);
            return;
        }
        ai.d("ShortVideoPublishService onError " + hnVar.getMessage());
        if (this.f65410e == 6 || this.f65410e == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            hnVar.setRecover(true);
        }
        n.b("aweme_movie_publish_log", "publish_error", new t().a("exception", u.b(hnVar)).a());
        if (this.f65410e == 0) {
            a(((cb) this.f65409d).creationId, false);
        } else if (this.f65410e == 6) {
            a(((PhotoMovieContext) this.f65409d).creationId, false);
        }
        Iterator it2 = new ArrayList(this.f65408c).iterator();
        while (it2.hasNext()) {
            ((s) it2.next()).a(hnVar);
        }
        this.h = true;
        stopSelf();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f65406a, false, 74669, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f65406a, false, 74669, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Iterator it2 = new ArrayList(this.f65408c).iterator();
        while (it2.hasNext()) {
            ((s) it2.next()).a(str2);
        }
    }

    private void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f65406a, false, 74667, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f65406a, false, 74667, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.g) {
            r.a("publish_retry_status", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("is_success", z ? 1 : 0).a("creation_id", str2).f34114b);
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        Bundle bundle;
        int i4;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65406a, false, 74660, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{intent2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65406a, false, 74660, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        ai.d("ShortVideoPublishService onStartCommand");
        int onStartCommand = super.onStartCommand(intent, i2, i3);
        if (intent2 == null) {
            return onStartCommand;
        }
        this.f65411f = a(intent);
        this.g = intent2.getBooleanExtra("publish_retry", false);
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f65406a, false, 74662, new Class[]{Intent.class}, Bundle.class)) {
            bundle = (Bundle) PatchProxy.accessDispatch(new Object[]{intent2}, this, f65406a, false, 74662, new Class[]{Intent.class}, Bundle.class);
        } else {
            bundle = new Bundle();
            bundle.putString("shoot_way", a(intent));
        }
        Bundle bundle2 = bundle;
        if (intent2.hasExtra("extra_photo_publish_args")) {
            bundle2.putSerializable("args", (PhotoContext) intent2.getSerializableExtra("extra_photo_publish_args"));
            bundle2.putInt("video_type", 5);
        } else if (intent2.hasExtra("extra_video_publish_args")) {
            Serializable serializableExtra = intent2.getSerializableExtra("extra_video_publish_args");
            if (PatchProxy.isSupport(new Object[]{serializableExtra}, this, f65406a, false, 74661, new Class[]{Serializable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{serializableExtra}, this, f65406a, false, 74661, new Class[]{Serializable.class}, Void.TYPE);
            } else if (serializableExtra instanceof cb) {
                final cb cbVar = (cb) serializableExtra;
                if (cbVar.isMvThemeVideoType()) {
                    this.i = com.ss.android.ugc.aweme.shortvideo.edit.r.a();
                    i.a((Callable<TResult>) new Callable<Object>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f65412a;

                        public final Object call() throws Exception {
                            if (PatchProxy.isSupport(new Object[0], this, f65412a, false, 74671, new Class[0], Object.class)) {
                                return PatchProxy.accessDispatch(new Object[0], this, f65412a, false, 74671, new Class[0], Object.class);
                            }
                            com.ss.android.ugc.aweme.video.b.c(cbVar.mvCreateVideoData.videoCoverImgPath, ShortVideoPublishService.this.i);
                            return null;
                        }
                    });
                } else {
                    this.i = cbVar.getValidVideoCoverPath();
                }
            }
            bundle2.putSerializable("args", serializableExtra);
            bundle2.putInt("video_type", 0);
        } else if (intent2.hasExtra("photo_movie_publish_args")) {
            bundle2.putParcelable("args", intent2.getParcelableExtra("photo_movie_publish_args"));
            bundle2.putInt("video_type", 6);
        } else if (intent2.hasExtra("story_args")) {
            int intExtra = intent2.getIntExtra("story_type", -1);
            if (Publish.d(intExtra)) {
                bundle2.putSerializable("args", intent2.getSerializableExtra("story_args"));
                bundle2.putInt("video_type", intExtra);
            } else {
                throw new AssertionError("publish service not supported this publish " + intExtra);
            }
        } else {
            throw new AssertionError("publish service not supported this publish " + intent2);
        }
        if (intent2.getBooleanExtra("synthetise_only", false)) {
            bundle2.putBoolean("synthetise_only", true);
        }
        if (intent2.getBooleanExtra("parallel_synthesize_upload", false)) {
            bundle2.putBoolean("parallel_synthesize_upload", true);
            i4 = 1;
        } else {
            i4 = 0;
        }
        this.f65410e = bundle2.getInt("video_type");
        this.f65409d = this.j.buildArgs(this.f65410e, bundle2);
        k buildFutureFactory = this.j.buildFutureFactory(this.f65410e, i4, bundle2);
        s<? extends at> buildCallback = this.j.buildCallback(this.f65410e, this.f65409d);
        if (buildCallback != null) {
            this.f65408c.add(buildCallback);
        }
        if (this.f65407b == null) {
            el elVar = new el(buildFutureFactory, this.f65410e, i4, bundle2.getString("shoot_way"), this);
            this.f65407b = elVar;
        }
        if (!bundle2.getBoolean("synthetise_only")) {
            el elVar2 = this.f65407b;
            Object obj = this.f65409d;
            if (PatchProxy.isSupport(new Object[]{obj}, elVar2, el.f67536a, false, 74456, new Class[]{Object.class}, Void.TYPE)) {
                el elVar3 = elVar2;
                PatchProxy.accessDispatch(new Object[]{obj}, elVar3, el.f67536a, false, 74456, new Class[]{Object.class}, Void.TYPE);
            } else {
                elVar2.m.a("startPublish()");
                elVar2.n = true;
                if (elVar2.i == null) {
                    elVar2.m.a("startPublish() synthetise()");
                    elVar2.a(obj, true);
                    elVar2.l.a(false);
                } else {
                    boolean isDone = elVar2.i.isDone();
                    if (isDone) {
                        elVar2.m.a("synthetise() already done");
                    } else {
                        elVar2.m.a("synthetise() not finished.");
                    }
                    l.a(elVar2.i, new k<SynthetiseResult>(obj) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f67542a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ Object f67543b;

                        public final void onFailure(@NotNull Throwable th) {
                            if (PatchProxy.isSupport(new Object[]{th}, this, f67542a, false, 74476, new Class[]{Throwable.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{th}, this, f67542a, false, 74476, new Class[]{Throwable.class}, Void.TYPE);
                                return;
                            }
                            el.this.m.a("synthetise() failed");
                            if (el.this.f67537b != null) {
                                el.this.f67537b.a(new hn(th));
                            }
                            w a2 = com.ss.android.ugc.aweme.port.in.a.v.a(this.f67543b);
                            if (com.ss.android.ugc.aweme.port.in.a.v.a(a2)) {
                                com.ss.android.ugc.aweme.port.in.a.v.a(null, a2, "", 20016);
                            }
                        }

                        public final /* synthetic */ void onSuccess(Object obj) {
                            SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
                            if (PatchProxy.isSupport(new Object[]{synthetiseResult}, this, f67542a, false, 74475, new Class[]{SynthetiseResult.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{synthetiseResult}, this, f67542a, false, 74475, new Class[]{SynthetiseResult.class}, Void.TYPE);
                                return;
                            }
                            if (!el.this.h.isCanceled() && !el.this.j) {
                                if (el.this.f67537b != null) {
                                    el.this.f67537b.a(synthetiseResult.outputFile);
                                }
                                el.this.a(this.f67543b);
                            }
                        }

                        {
                            this.f67543b = r2;
                        }
                    }, com.ss.android.ugc.aweme.base.k.f34752b);
                    elVar2.k.b();
                    elVar2.l.a(isDone);
                }
            }
        } else {
            el elVar4 = this.f65407b;
            Object obj2 = this.f65409d;
            if (PatchProxy.isSupport(new Object[]{obj2}, elVar4, el.f67536a, false, 74455, new Class[]{Object.class}, Void.TYPE)) {
                el elVar5 = elVar4;
                PatchProxy.accessDispatch(new Object[]{obj2}, elVar5, el.f67536a, false, 74455, new Class[]{Object.class}, Void.TYPE);
            } else {
                elVar4.m.a("synthetiseOnly()");
                elVar4.a(obj2, false);
            }
        }
        return 2;
    }
}
