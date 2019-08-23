package com.ss.android.ugc.aweme.o;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.port.internal.e;
import com.ss.android.ugc.aweme.port.internal.f;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.photo.IPhotoProcessService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.cs;
import java.util.Map;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58330a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f58331b;

    /* renamed from: c  reason: collision with root package name */
    private final FragmentActivity f58332c;

    /* renamed from: d  reason: collision with root package name */
    private final Intent f58333d;

    u(Aweme aweme, FragmentActivity fragmentActivity, Intent intent) {
        this.f58331b = aweme;
        this.f58332c = fragmentActivity;
        this.f58333d = intent;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f58330a, false, 54874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58330a, false, 54874, new Class[0], Void.TYPE);
            return;
        }
        Aweme aweme = this.f58331b;
        FragmentActivity fragmentActivity = this.f58332c;
        Intent intent = this.f58333d;
        if (aweme.getStatus().getPrivateStatus() == 1 || com.ss.android.ugc.aweme.utils.u.f75965b.d(aweme)) {
            if (PatchProxy.isSupport(new Object[]{fragmentActivity, aweme}, null, e.f61158a, true, 67177, new Class[]{Activity.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentActivity, aweme}, null, e.f61158a, true, 67177, new Class[]{Activity.class, Aweme.class}, Void.TYPE);
            } else {
                a.b(new f(fragmentActivity, aweme));
            }
            if (intent.getIntExtra("video_type", -1) == 5 && !com.ss.android.ugc.aweme.d.a.a(aweme)) {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).photoProcessService().savePhotoWithWaterMarker((PhotoContext) intent.getSerializableExtra("photoContext"), null);
            }
        } else {
            PhotoContext photoContext = (PhotoContext) intent.getSerializableExtra("photoContext");
            if (PatchProxy.isSupport(new Object[]{fragmentActivity, aweme, photoContext}, null, e.f61158a, true, 67178, new Class[]{Activity.class, Aweme.class, PhotoContext.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentActivity, aweme, photoContext}, null, e.f61158a, true, 67178, new Class[]{Activity.class, Aweme.class, PhotoContext.class}, Void.TYPE);
                return;
            }
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService != null) {
                if (AbTestManager.a().D()) {
                    iAVService.photoProcessService().savePhotoWithoutWaterMarker(photoContext, new IPhotoProcessService.IPhotoServiceListener(fragmentActivity, aweme) {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f61159a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ Activity f61160b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ Aweme f61161c;

                        public final void onWaterMakerAdded(@Nullable Bitmap bitmap) {
                        }

                        {
                            this.f61160b = r1;
                            this.f61161c = r2;
                        }

                        public final void onSaved(int i, @Nullable PhotoContext photoContext) {
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), photoContext}, this, f61159a, false, 67182, new Class[]{Integer.TYPE, PhotoContext.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), photoContext}, this, f61159a, false, 67182, new Class[]{Integer.TYPE, PhotoContext.class}, Void.TYPE);
                                return;
                            }
                            e.a(this.f61160b, this.f61161c, photoContext);
                        }
                    });
                    return;
                }
                iAVService.photoProcessService().savePhotoWithWaterMarker(photoContext, new IPhotoProcessService.IPhotoServiceListener(fragmentActivity, aweme) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f61162a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ Activity f61163b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ Aweme f61164c;

                    public final void onWaterMakerAdded(Bitmap bitmap) {
                    }

                    {
                        this.f61163b = r1;
                        this.f61164c = r2;
                    }

                    public final void onSaved(int i, @Nullable PhotoContext photoContext) {
                        PhotoContext photoContext2 = photoContext;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), photoContext2}, this, f61162a, false, 67183, new Class[]{Integer.TYPE, PhotoContext.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), photoContext2}, this, f61162a, false, 67183, new Class[]{Integer.TYPE, PhotoContext.class}, Void.TYPE);
                            return;
                        }
                        e.a(this.f61163b, this.f61164c, photoContext2);
                        if (PatchProxy.isSupport(new Object[0], null, cs.f65006a, true, 73415, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], null, cs.f65006a, true, 73415, new Class[0], Void.TYPE);
                            return;
                        }
                        r.a("add_watermark", (Map) d.a().a("enter_from", "download_video").f34114b);
                    }
                });
            }
        }
    }
}
