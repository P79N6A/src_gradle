package com.ss.android.ugc.aweme.photo.edit;

import android.app.Activity;
import android.app.ActivityOptions;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.support.v4.app.ActivityCompat;
import android.transition.Slide;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.medialib.b.c;
import com.ss.android.medialib.b.d;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.PhotoView;
import com.ss.android.ugc.aweme.photo.edit.b.a;
import com.ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity;
import com.ss.android.ugc.aweme.photo.setfilter.PhotoSetFilterActivity;
import com.ss.android.ugc.aweme.shortvideo.cv;
import com.ss.android.ugc.aweme.shortvideo.edit.n;
import com.ss.android.ugc.aweme.shortvideo.fb;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.view.c;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import java.util.Map;

public class PhotoEditActivity extends AmeActivity implements View.OnClickListener, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58506a;

    /* renamed from: b  reason: collision with root package name */
    com.ss.android.ugc.aweme.photo.edit.a.a f58507b;

    /* renamed from: c  reason: collision with root package name */
    public PhotoView f58508c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f58509d;

    /* renamed from: e  reason: collision with root package name */
    private RelativeLayout f58510e;

    /* renamed from: f  reason: collision with root package name */
    private RelativeLayout f58511f;
    private ViewGroup g;
    private TextView h;
    private ImageView i;
    private View j;
    private d k;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58506a, false, 63627, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58506a, false, 63627, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58506a, false, 63628, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58506a, false, 63628, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final PhotoView b() {
        return this.f58508c;
    }

    public final ViewGroup c() {
        return this.g;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58506a, false, 63620, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58506a, false, 63620, new Class[0], Void.TYPE);
            return;
        }
        this.k = c.a(this, getResources().getString(C0906R.string.b0x));
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f58506a, false, 63621, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58506a, false, 63621, new Class[0], Void.TYPE);
            return;
        }
        if (this.f58508c != null) {
            this.k.dismiss();
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f58506a, false, 63626, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58506a, false, 63626, new Class[0], Void.TYPE);
            return;
        }
        this.i.performClick();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f58506a, false, 63615, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58506a, false, 63615, new Class[0], Void.TYPE);
        } else if (fc.a()) {
            switch (fb.f67663b) {
                case 1:
                    b(true);
                    c(true);
                    return;
                case 2:
                    b(false);
                    c(true);
                    return;
                case 3:
                    b(true);
                    c(false);
                    return;
                case 4:
                    b(true);
                    c(true);
                    return;
                case 5:
                    b(false);
                    c(true);
                    return;
                case 6:
                    b(true);
                    c(false);
                    return;
                case e.l:
                    b(false);
                    c(false);
                    return;
                default:
                    b(false);
                    c(false);
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        com.ss.android.ugc.aweme.photo.edit.a.a aVar = this.f58507b;
        if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.photo.edit.a.a.f58523a, false, 63639, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.photo.edit.a.a.f58523a, false, 63639, new Class[0], Void.TYPE);
        } else {
            r.a((Context) (Activity) aVar.f58524b, "add_filter", "mid_page", PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, aVar.a());
            if (com.ss.android.g.a.b()) {
                Activity activity = (Activity) aVar.f58524b;
                PhotoContext photoContext = aVar.f58525c;
                boolean z = aVar.f58527e;
                PhotoView b2 = aVar.f58524b.b();
                if (PatchProxy.isSupport(new Object[]{activity, photoContext, Byte.valueOf(z ? (byte) 1 : 0), b2, 1}, null, PhotoSetFilterActivity.f58762a, true, 63858, new Class[]{Activity.class, PhotoContext.class, Boolean.TYPE, View.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity, photoContext, Byte.valueOf(z), b2, 1}, null, PhotoSetFilterActivity.f58762a, true, 63858, new Class[]{Activity.class, PhotoContext.class, Boolean.TYPE, View.class, Integer.TYPE}, Void.TYPE);
                } else {
                    Intent intent = new Intent();
                    intent.setClass(activity, PhotoSetFilterActivity.class);
                    intent.putExtra("photo_model", photoContext);
                    intent.putExtra("is_first_open_filter", z);
                    if (Build.VERSION.SDK_INT >= 21) {
                        b2.setTransitionName("photo");
                        Slide slide = new Slide();
                        slide.setDuration(300);
                        activity.getWindow().setExitTransition(slide);
                        activity.getWindow().setReenterTransition(slide);
                        activity.startActivityForResult(intent, 1, ActivityOptions.makeSceneTransitionAnimation(activity, b2, "photo").toBundle());
                    } else {
                        activity.startActivityForResult(intent, 1);
                    }
                }
            } else {
                Activity activity2 = (Activity) aVar.f58524b;
                PhotoContext photoContext2 = aVar.f58525c;
                boolean z2 = aVar.f58527e;
                PhotoView b3 = aVar.f58524b.b();
                if (PatchProxy.isSupport(new Object[]{activity2, photoContext2, Byte.valueOf(z2 ? (byte) 1 : 0), b3, 1}, null, EffectPhotoSetFilterActivity.f58730a, true, 63798, new Class[]{Activity.class, PhotoContext.class, Boolean.TYPE, View.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity2, photoContext2, Byte.valueOf(z2), b3, 1}, null, EffectPhotoSetFilterActivity.f58730a, true, 63798, new Class[]{Activity.class, PhotoContext.class, Boolean.TYPE, View.class, Integer.TYPE}, Void.TYPE);
                } else {
                    Intent intent2 = new Intent();
                    intent2.setClass(activity2, EffectPhotoSetFilterActivity.class);
                    intent2.putExtra("photo_model", photoContext2);
                    intent2.putExtra("is_first_open_filter", z2);
                    if (Build.VERSION.SDK_INT >= 21) {
                        b3.setTransitionName("photo");
                        Slide slide2 = new Slide();
                        slide2.setDuration(300);
                        activity2.getWindow().setExitTransition(slide2);
                        activity2.getWindow().setReenterTransition(slide2);
                        activity2.startActivityForResult(intent2, 1, ActivityOptions.makeSceneTransitionAnimation(activity2, b3, "photo").toBundle());
                    } else {
                        activity2.startActivityForResult(intent2, 1);
                    }
                }
            }
        }
        r.a("click_modify_entrance", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f58507b.f58525c.creationId).a("shoot_way", this.f58507b.f58525c.mShootWay).a("enter_from", "video_edit_page").a("content_type", "photo").a("content_source", "upload").a("enter_from", "video_edit_page").a("scene_id", "1004").f34114b);
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58506a, false, 63617, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58506a, false, 63617, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0906R.dimen.cf);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f58511f.getLayoutParams();
        if (!z) {
            dimensionPixelSize = 0;
        }
        layoutParams.bottomMargin = dimensionPixelSize;
        this.f58511f.setLayoutParams(layoutParams);
    }

    private void b(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58506a, false, 63616, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58506a, false, 63616, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int c2 = fc.c(this);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f58510e.getLayoutParams();
        if (z) {
            i2 = c2;
        } else {
            i2 = 0;
        }
        layoutParams.topMargin = i2;
        this.f58510e.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0906R.id.d3v);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams2.topMargin = (int) (((float) c2) + UIUtils.dip2Px(this, 28.0f));
        relativeLayout.setLayoutParams(layoutParams2);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0906R.id.a1j);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        if (!z) {
            c2 = 0;
        }
        layoutParams3.topMargin = c2;
        linearLayout.setLayoutParams(layoutParams3);
    }

    public void onClick(View view) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view}, this, f58506a, false, 63623, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58506a, false, 63623, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.bqm) {
            com.ss.android.ugc.aweme.photo.edit.a.a aVar = this.f58507b;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.photo.edit.a.a.f58523a, false, 63638, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.photo.edit.a.a.f58523a, false, 63638, new Class[0], Void.TYPE);
            } else {
                r.a((Context) (Activity) aVar.f58524b, "next", "mid_page", PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, aVar.a());
                aVar.f58524b.d();
                aVar.f58524b.a(aVar.f58525c.getTmpPhotoPath(com.ss.android.ugc.aweme.port.in.a.f61119b), aVar);
            }
        } else if (id == C0906R.id.iu) {
            r.a((Context) this, "back_to_shoot", "mid_page", PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, new t().a("is_photo", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a());
            if (this.f58507b.f58525c.mPhotoFrom != 2) {
                z = false;
            }
            if (z) {
                new a.C0185a(this).b((int) C0906R.string.a5y).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) null).a((int) C0906R.string.a5x, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58515a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58515a, false, 63633, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f58515a, false, 63633, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        Intent intent = new Intent(PhotoEditActivity.this, com.ss.android.ugc.aweme.port.in.a.f61121d.a());
                        intent.setFlags(335544320);
                        PhotoEditActivity.this.startActivity(intent);
                        PhotoEditActivity.this.finish();
                    }
                }).a().a();
            } else {
                com.ss.android.ugc.aweme.port.in.a.K.a(this, this.f58507b.f58525c);
                finish();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        final FrameLayout.LayoutParams layoutParams;
        int i2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58506a, false, 63612, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58506a, false, 63612, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onCreate", true);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.cs);
        if (fc.a()) {
            getWindow().clearFlags(1024);
            if (ToolUtils.isFlyme()) {
                StatusBarUtils.setTranslucent(this);
            } else {
                StatusBarUtils.setTransparent(this);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(-16777216);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f58506a, false, 63613, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58506a, false, 63613, new Class[0], Void.TYPE);
        } else {
            this.g = (ViewGroup) findViewById(C0906R.id.chu);
            this.i = (ImageView) findViewById(C0906R.id.iu);
            this.i.setOnClickListener(this);
            this.h = (TextView) findViewById(C0906R.id.bqm);
            this.h.setOnClickListener(this);
            this.f58508c = (PhotoView) findViewById(C0906R.id.bxq);
            this.j = findViewById(C0906R.id.ade);
            this.j.setOnClickListener(new b(this));
            if (fc.a()) {
                this.f58510e = (RelativeLayout) findViewById(C0906R.id.a07);
                this.f58511f = (RelativeLayout) findViewById(C0906R.id.a06);
                this.f58511f.setVisibility(0);
                this.f58510e.setVisibility(0);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f58506a, false, 63618, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58506a, false, 63618, new Class[0], Void.TYPE);
        } else {
            w.a();
            this.f58507b = new com.ss.android.ugc.aweme.photo.edit.a.a(this);
            Intent intent = getIntent();
            com.ss.android.ugc.aweme.photo.edit.a.a aVar = this.f58507b;
            if (PatchProxy.isSupport(new Object[]{intent}, aVar, com.ss.android.ugc.aweme.photo.edit.a.a.f58523a, false, 63636, new Class[]{Intent.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.photo.edit.a.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{intent}, aVar2, com.ss.android.ugc.aweme.photo.edit.a.a.f58523a, false, 63636, new Class[]{Intent.class}, Void.TYPE);
            } else {
                aVar.f58525c = (PhotoContext) intent.getSerializableExtra("photo_model");
                aVar.f58524b.a(true);
                aVar.f58524b.b().a((LifecycleOwner) aVar.f58524b, aVar.f58525c);
                if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.photo.edit.a.a.f58523a, false, 63637, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.photo.edit.a.a.f58523a, false, 63637, new Class[0], Void.TYPE);
                } else {
                    aVar.f58526d = new n(aVar.f58524b.c(), (Context) aVar.f58524b, (LifecycleOwner) aVar.f58524b, w.a(aVar.f58525c.mFilterIndex));
                    aVar.f58526d.a(1);
                    aVar.f58526d.f67470c = aVar;
                }
                aVar.f58527e = true;
            }
            if (fc.a()) {
                layoutParams = fb.a((Context) this, this.f58507b.b(), this.f58507b.c());
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f58506a, false, 63614, new Class[0], FrameLayout.LayoutParams.class)) {
                    layoutParams = (FrameLayout.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f58506a, false, 63614, new Class[0], FrameLayout.LayoutParams.class);
                } else {
                    int e2 = fc.e(this);
                    int b2 = fc.b(this);
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    if (this.f58507b.c() * 9 < this.f58507b.b() * 16 || e2 * 9 < b2 * 16) {
                        layoutParams2.width = b2;
                        layoutParams2.height = (this.f58507b.c() * b2) / this.f58507b.b();
                        layoutParams2.topMargin = (e2 - layoutParams2.height) / 2;
                        if (layoutParams2.topMargin >= 0) {
                            i2 = layoutParams2.topMargin;
                        } else {
                            i2 = 0;
                        }
                        layoutParams2.topMargin = i2;
                        layoutParams2.leftMargin = 0;
                    } else {
                        layoutParams2.width = (this.f58507b.b() * e2) / this.f58507b.c();
                        layoutParams2.height = e2;
                        layoutParams2.leftMargin = (b2 - layoutParams2.width) / 2;
                        layoutParams2.topMargin = 0;
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        layoutParams2.setMarginStart(layoutParams2.leftMargin);
                    }
                    layoutParams = layoutParams2;
                }
            }
            this.f58508c.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58512a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f58512a, false, 63632, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58512a, false, 63632, new Class[0], Void.TYPE);
                        return;
                    }
                    PhotoEditActivity.this.f58508c.setLayoutParams(layoutParams);
                    if (fc.a()) {
                        PhotoEditActivity.this.a();
                    }
                }
            });
        }
        if (fc.a()) {
            new cv(this).a(new a(this));
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f58507b.f58525c.creationId).a("shoot_way", this.f58507b.f58525c.mShootWay).a("draft_id", this.f58507b.f58525c.draftId).a("filter_list", this.f58507b.f58525c.mFilterName).a("filter_id_list", this.f58507b.f58525c.mFilterId).a("content_type", "photo");
        if (this.f58507b.f58525c.mPhotoFrom == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        r.a("enter_video_edit_page", (Map) a2.a("content_source", str).f34114b);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onCreate", false);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f58506a, false, 63619, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f58506a, false, 63619, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j.setVisibility(0);
    }

    public void onActivityReenter(int i2, Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), intent}, this, f58506a, false, 63624, new Class[]{Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), intent}, this, f58506a, false, 63624, new Class[]{Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityReenter(i2, intent);
        this.f58509d = false;
        this.f58508c.c();
        PhotoContext photoContext = (PhotoContext) intent.getSerializableExtra("photo_model");
        int intExtra = intent.getIntExtra("set_filter_result", 0);
        if (photoContext != null) {
            this.f58507b.a(photoContext, intExtra);
        }
        ActivityCompat.postponeEnterTransition(this);
        this.f58508c.setDrawFrameCallback(new c.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58517a;

            @WorkerThread
            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f58517a, false, 63634, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f58517a, false, 63634, new Class[0], Void.TYPE);
                    return;
                }
                PhotoEditActivity.this.f58508c.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58519a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f58519a, false, 63635, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f58519a, false, 63635, new Class[0], Void.TYPE);
                        } else if (!PhotoEditActivity.this.f58509d) {
                            PhotoEditActivity.this.f58509d = true;
                            ActivityCompat.startPostponedEnterTransition(PhotoEditActivity.this);
                            PhotoEditActivity.this.f58508c.setDrawFrameCallback(null);
                        }
                    }
                });
            }
        });
    }

    public static void a(Context context, PhotoContext photoContext) {
        Context context2 = context;
        PhotoContext photoContext2 = photoContext;
        if (PatchProxy.isSupport(new Object[]{context2, photoContext2}, null, f58506a, true, 63610, new Class[]{Context.class, PhotoContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, photoContext2}, null, f58506a, true, 63610, new Class[]{Context.class, PhotoContext.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent();
        intent.setClass(context2, PhotoEditActivity.class);
        intent.putExtra("photo_model", photoContext2);
        context2.startActivity(intent);
    }

    public final void a(@NonNull String str, @NonNull d.a aVar) {
        String str2 = str;
        d.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str2, aVar2}, this, f58506a, false, 63622, new Class[]{String.class, d.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, aVar2}, this, f58506a, false, 63622, new Class[]{String.class, d.a.class}, Void.TYPE);
            return;
        }
        PhotoView photoView = this.f58508c;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        if (PatchProxy.isSupport(new Object[]{str2, compressFormat, aVar2}, photoView, com.ss.android.medialib.b.d.m, false, 17435, new Class[]{String.class, Bitmap.CompressFormat.class, d.a.class}, Void.TYPE)) {
            PhotoView photoView2 = photoView;
            PatchProxy.accessDispatch(new Object[]{str2, compressFormat, aVar2}, photoView2, com.ss.android.medialib.b.d.m, false, 17435, new Class[]{String.class, Bitmap.CompressFormat.class, d.a.class}, Void.TYPE);
            return;
        }
        com.ss.android.medialib.b.c cVar = photoView.n;
        d.AnonymousClass2 r6 = new c.a(str2, compressFormat, aVar2) {

            /* renamed from: a */
            public static ChangeQuickRedirect f29397a;

            /* renamed from: b */
            final /* synthetic */ String f29398b;

            /* renamed from: c */
            final /* synthetic */ Bitmap.CompressFormat f29399c;

            /* renamed from: d */
            final /* synthetic */ a f29400d;

            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(
/*
Method generation error in method: com.ss.android.medialib.b.d.2.a(int, int, java.nio.ByteBuffer):void, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.medialib.b.d.2.a(int, int, java.nio.ByteBuffer):void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/
        };
        cVar.f29387c = true;
        cVar.f29388d = r6;
        photoView.a();
    }

    public static void a(Activity activity, PhotoContext photoContext, int i2) {
        Activity activity2 = activity;
        PhotoContext photoContext2 = photoContext;
        if (PatchProxy.isSupport(new Object[]{activity2, photoContext2, Integer.valueOf(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR)}, null, f58506a, true, 63611, new Class[]{Activity.class, PhotoContext.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, photoContext2, Integer.valueOf(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR)}, null, f58506a, true, 63611, new Class[]{Activity.class, PhotoContext.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(activity2, PhotoEditActivity.class);
        intent.putExtra("photo_model", photoContext2);
        activity2.startActivityForResult(intent, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f58506a, false, 63625, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f58506a, false, 63625, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i4 == 1 && i5 == -1 && Build.VERSION.SDK_INT < 21) {
            PhotoContext photoContext = (PhotoContext) intent2.getSerializableExtra("photo_model");
            int intExtra = intent2.getIntExtra("set_filter_result", 0);
            if (photoContext != null) {
                this.f58507b.a(photoContext, intExtra);
            }
        }
        if (i4 == 1 && i5 == -1) {
            com.ss.android.ugc.aweme.photo.edit.a.a aVar = this.f58507b;
            PhotoContext photoContext2 = (PhotoContext) intent2.getSerializableExtra("photo_model");
            aVar.f58525c.mText = photoContext2.mText;
            aVar.f58525c.mExtras = photoContext2.mExtras;
            aVar.f58525c.mIsPrivate = photoContext2.mIsPrivate;
            aVar.f58525c.mPoiId = photoContext2.mPoiId;
            aVar.f58525c.defaultSelectStickerPoi = photoContext2.defaultSelectStickerPoi;
            setResult(-1);
        }
    }
}
