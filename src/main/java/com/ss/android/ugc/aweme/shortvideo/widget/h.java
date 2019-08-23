package com.ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.a;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.videoprocess.OnGetVideoCoverCallback;
import java.util.Map;

public final class h extends PopupWindow implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71451a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f71452b;

    /* renamed from: c  reason: collision with root package name */
    FragmentActivity f71453c;

    /* renamed from: d  reason: collision with root package name */
    public c f71454d;

    /* renamed from: e  reason: collision with root package name */
    private View f71455e = ((LayoutInflater) k.a().getSystemService("layout_inflater")).inflate(C0906R.layout.a9t, null);

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f71456f;
    private ImageView g;
    private ImageView h;
    private PullUpLayout i;
    private IDraftService.DraftListener j;
    private boolean k;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f71451a, false, 81468, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71451a, false, 81468, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f71451a, false, 81465, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71451a, false, 81465, new Class[0], Void.TYPE);
            return;
        }
        this.j = new IDraftService.DraftListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71457a;

            public final void onDraftCheckedChanged(boolean z) {
            }

            public final void onDraftClean() {
            }

            public final void onDraftUpdate(@NonNull c cVar) {
            }

            public final void onDraftDelete(@Nullable c cVar) {
                if (PatchProxy.isSupport(new Object[]{cVar}, this, f71457a, false, 81474, new Class[]{c.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{cVar}, this, f71457a, false, 81474, new Class[]{c.class}, Void.TYPE);
                    return;
                }
                if (cVar != null && TextUtils.equals(cVar.S(), h.this.f71454d.S())) {
                    h.this.dismiss();
                }
            }
        };
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().registerDraftListener(this.j);
    }

    public final void b() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f71451a, false, 81464, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71451a, false, 81464, new Class[0], Void.TYPE);
        } else if (!this.f71453c.isFinishing()) {
            this.i.a();
            a(this.f71454d);
            this.h.setOnClickListener(new j(this));
            c();
            r.a("publish_retry_show", (Map) d.a().a("creation_id", this.f71454d.p()).f34114b);
            try {
                View decorView = this.f71453c.getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 19) {
                    i2 = -UIUtils.getStatusBarHeight(k.a());
                } else {
                    i2 = UIUtils.getStatusBarHeight(k.a());
                }
                showAtLocation(decorView, 48, 0, i2);
            } catch (Exception unused) {
            }
        }
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f71451a, false, 81467, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71451a, false, 81467, new Class[0], Void.TYPE);
            return;
        }
        if (isShowing()) {
            if (this.f71453c != null && !this.f71453c.isFinishing() && this.i.hasWindowFocus()) {
                this.i.a(0.0f, true);
            }
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService != null) {
                iAVService.getPublishService().setUploadRecoverPath(null);
            }
        }
        if (this.j != null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().unregisterDraftListener(this.j);
            this.j = null;
        }
        try {
            if (PatchProxy.isSupport(new Object[]{this}, null, m.f71470a, true, 81476, new Class[]{PopupWindow.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this}, null, m.f71470a, true, 81476, new Class[]{PopupWindow.class}, Void.TYPE);
                return;
            }
            if (com.ss.android.ugc.aweme.g.a.a()) {
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    throw new IllegalStateException("debug check! this method should be called from main thread!");
                }
            }
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    private void a(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f71451a, false, 81469, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f71451a, false, 81469, new Class[]{c.class}, Void.TYPE);
        } else if (cVar.L != 2) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoCover(cVar.f(), (int) (cVar.N * 1000.0f), new OnGetVideoCoverCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f71459a;

                public final void onGetVideoCoverFailed(int i) {
                }

                public final void onGetVideoCoverSuccess(@NonNull Bitmap bitmap) {
                    if (PatchProxy.isSupport(new Object[]{bitmap}, this, f71459a, false, 81475, new Class[]{Bitmap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bitmap}, this, f71459a, false, 81475, new Class[]{Bitmap.class}, Void.TYPE);
                        return;
                    }
                    if (h.this.f71452b != null) {
                        h.this.f71452b.setImageDrawable(new com.ss.android.ugc.aweme.newfollow.ui.a(bitmap));
                    }
                }
            });
        } else if (cVar.f43436d != null) {
            cVar.f43436d.getPhotoMovieCover(new k(this));
        }
    }

    public final void a(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71451a, false, 81466, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71451a, false, 81466, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z) {
            i2 = 8;
        }
        this.f71455e.setVisibility(i2);
    }

    public h(FragmentActivity fragmentActivity, c cVar, boolean z) {
        super(k.a());
        this.f71453c = fragmentActivity;
        this.f71454d = cVar;
        this.k = z;
        View view = this.f71455e;
        if (PatchProxy.isSupport(new Object[]{view}, this, f71451a, false, 81462, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71451a, false, 81462, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f71456f = (RelativeLayout) view.findViewById(C0906R.id.cgb);
            this.f71452b = (ImageView) view.findViewById(C0906R.id.b08);
            this.i = (PullUpLayout) view.findViewById(C0906R.id.c92);
            this.i.a((View) this.f71456f, false);
            this.i.setPullUpListener(this);
            this.g = (ImageView) view.findViewById(C0906R.id.azy);
            this.g.setOnClickListener(new i(this));
            this.h = (ImageView) view.findViewById(C0906R.id.b4b);
        }
        setBackgroundDrawable(new ColorDrawable(0));
        if (PatchProxy.isSupport(new Object[0], this, f71451a, false, 81463, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71451a, false, 81463, new Class[0], Void.TYPE);
            return;
        }
        setContentView(this.f71455e);
        setWidth(UIUtils.getScreenWidth(k.a()));
        setHeight(-2);
        update();
        setAnimationStyle(C0906R.style.tw);
    }
}
