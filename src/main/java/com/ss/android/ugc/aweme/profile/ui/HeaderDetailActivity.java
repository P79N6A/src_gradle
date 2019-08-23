package com.ss.android.ugc.aweme.profile.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.binaryresource.FileBinaryResource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity;
import com.ss.android.ugc.aweme.commercialize.model.b;
import com.ss.android.ugc.aweme.commercialize.views.StateDmtTextView;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.a;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.l;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.share.a.f;
import com.ss.android.ugc.aweme.utils.bc;
import com.ss.android.ugc.aweme.utils.bi;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.utils.fe;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public class HeaderDetailActivity extends AmeActivity implements l, r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61852a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f61853b = (Environment.getExternalStorageDirectory() + "/DCIM/Camera/");
    @BindView(2131493181)
    View avatarDecoPanel;
    @BindView(2131493255)
    View bgView;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f61854c;

    /* renamed from: d  reason: collision with root package name */
    public User f61855d;

    /* renamed from: e  reason: collision with root package name */
    private fe.a f61856e;
    @BindView(2131497901)
    TextView editText;

    /* renamed from: f  reason: collision with root package name */
    private View f61857f;
    @BindView(2131494410)
    FixedRatioFrameLayout fixedRatioFrame;
    private float g;
    private boolean h = true;
    private boolean i = true;
    private Challenge j;
    private String[] k;
    private ImageRequest[] l;
    private a m;
    @BindView(2131493184)
    TextView mDecoHintView;
    @BindView(2131493182)
    StateDmtTextView mDecoTextView;
    @BindView(2131495013)
    ImageView mDownloadView;
    @BindView(2131495097)
    View mMore;
    @BindView(2131497604)
    View mTitleBar;
    private ad n;
    private boolean o;
    private String p;
    @BindView(2131495126)
    ImageView progressBar;
    private ObjectAnimator q;
    @BindView(2131496858)
    ViewGroup rootView;
    @BindView(2131498350)
    RemoteImageView userAvatar;

    public final void a(boolean z) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f61852a, false, 68097, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61852a, false, 68097, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61852a, false, 68098, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61852a, false, 68098, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final String a() {
        String str;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f61852a, false, 68071, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f61852a, false, 68071, new Class[0], String.class);
        } else if (j.a((T[]) this.l)) {
            return "";
        } else {
            for (ImageRequest imageRequest : this.l) {
                if (imageRequest != null) {
                    if (PatchProxy.isSupport(new Object[]{imageRequest}, this, f61852a, false, 68072, new Class[]{ImageRequest.class}, String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[]{imageRequest}, this, f61852a, false, 68072, new Class[]{ImageRequest.class}, String.class);
                    } else {
                        if (imageRequest != null) {
                            if (PatchProxy.isSupport(new Object[]{imageRequest}, this, f61852a, false, 68073, new Class[]{ImageRequest.class}, Boolean.TYPE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{imageRequest}, this, f61852a, false, 68073, new Class[]{ImageRequest.class}, Boolean.TYPE)).booleanValue();
                            } else if (imageRequest == null) {
                                z = false;
                            } else {
                                z = ImagePipelineFactory.getInstance().getMainFileCache().hasKey(DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(imageRequest, null));
                            }
                            if (z) {
                                BinaryResource resource = ImagePipelineFactory.getInstance().getMainFileCache().getResource(DefaultCacheKeyFactory.getInstance().getEncodedCacheKey(imageRequest, null));
                                if (resource != null) {
                                    File file = ((FileBinaryResource) resource).getFile();
                                    if (file != null) {
                                        str = file.getAbsolutePath();
                                    }
                                }
                            }
                        }
                        str = "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        return str;
                    }
                }
            }
            return "";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.ss.android.ugc.aweme.base.ui.RemoteImageView r15, boolean r16, java.lang.String... r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = r17
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r16)
            r12 = 1
            r0[r12] = r1
            r13 = 2
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f61852a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r1 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 68078(0x109ee, float:9.5398E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0058
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.Byte r1 = java.lang.Byte.valueOf(r16)
            r0[r12] = r1
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f61852a
            r3 = 0
            r4 = 68078(0x109ee, float:9.5398E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.base.ui.RemoteImageView> r1 = com.ss.android.ugc.aweme.base.ui.RemoteImageView.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0058:
            if (r8 != 0) goto L_0x005b
            return
        L_0x005b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = com.ss.android.ugc.aweme.base.utils.j.a((T[]) r17)
            if (r1 != 0) goto L_0x007c
            int r1 = r9.length
            r2 = 0
        L_0x0068:
            if (r2 >= r1) goto L_0x007c
            r3 = r9[r2]
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0079
            com.facebook.imagepipeline.request.ImageRequest r3 = r14.c(r3)
            r0.add(r3)
        L_0x0079:
            int r2 = r2 + 1
            goto L_0x0068
        L_0x007c:
            r1 = 0
            if (r16 == 0) goto L_0x00a8
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f61855d
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = com.ss.android.ugc.aweme.utils.t.b(r2)
            if (r2 == 0) goto L_0x0090
            java.util.List r2 = r2.getUrlList()
            java.lang.String r2 = r14.a((java.util.List<java.lang.String>) r2)
            goto L_0x0091
        L_0x0090:
            r2 = r1
        L_0x0091:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x009b
            com.facebook.imagepipeline.request.ImageRequest r1 = r14.c(r2)
        L_0x009b:
            boolean r2 = com.ss.android.ugc.aweme.base.utils.j.a((java.util.Collection<T>) r0)
            if (r2 == 0) goto L_0x00a8
            r0 = 2130839027(0x7f0205f3, float:1.7283053E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r15, (int) r0)
            return
        L_0x00a8:
            int r2 = r0.size()
            com.facebook.imagepipeline.request.ImageRequest[] r2 = new com.facebook.imagepipeline.request.ImageRequest[r2]
            r7.l = r2
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r2 = com.facebook.drawee.backends.pipeline.Fresco.newDraweeControllerBuilder()
            com.facebook.imagepipeline.request.ImageRequest[] r3 = r7.l
            java.lang.Object[] r0 = r0.toArray(r3)
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r0 = r2.setFirstAvailableImageRequests(r0)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r0
            com.facebook.drawee.interfaces.DraweeController r2 = r15.getController()
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r0 = r0.setOldController((com.facebook.drawee.interfaces.DraweeController) r2)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r0
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r0 = r0.setAutoPlayAnimations(r11)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r0 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r0
            if (r1 == 0) goto L_0x00d5
            r0.setLowResImageRequest(r1)
        L_0x00d5:
            com.facebook.drawee.controller.AbstractDraweeController r0 = r0.build()
            r15.setController(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity.a(com.ss.android.ugc.aweme.base.ui.RemoteImageView, boolean, java.lang.String[]):void");
    }

    public final void a(AvatarUri avatarUri) {
        if (PatchProxy.isSupport(new Object[]{avatarUri}, this, f61852a, false, 68090, new Class[]{AvatarUri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarUri}, this, f61852a, false, 68090, new Class[]{AvatarUri.class}, Void.TYPE);
            return;
        }
        this.m.c();
        if (avatarUri == null) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bv).a();
            return;
        }
        this.n.c(avatarUri.uri);
        Uri parse = Uri.parse("file://" + this.p);
        Fresco.getImagePipeline().evictFromCache(parse);
        a(this.userAvatar, false, parse.toString());
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f61852a, false, 68091, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f61852a, false, 68091, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid() && this.m != null) {
            this.m.c();
            if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorCode() == 20022) {
                com.ss.android.common.lib.a.a(this, "profile_image_setting", "review_failure");
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(this, exc, C0906R.string.bv);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f61852a, false, 68092, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f61852a, false, 68092, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.o = true;
        this.p = str;
        if (PatchProxy.isSupport(new Object[0], this, f61852a, false, 68093, new Class[0], Boolean.TYPE)) {
            ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f61852a, false, 68093, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.m != null && this.o) {
            this.o = false;
            this.m.b();
        }
    }

    public final void a(User user, int i2) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2)}, this, f61852a, false, 68094, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i2)}, this, f61852a, false, 68094, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.o = true;
        if (i2 == 4) {
            if (user.getAvatarMedium() != null) {
                a(this.userAvatar, false, (String[]) user.getAvatarMedium().getUrlList().toArray(new String[user.getAvatarMedium().getUrlList().size()]));
            } else {
                c.b(this.userAvatar, user.getAvatarMedium());
            }
            com.bytedance.ies.dmt.ui.d.a.a(GlobalContext.getContext(), (int) C0906R.string.bs9).a();
        }
        if (this.m != null) {
            this.m.c();
        }
    }

    public final void a(Exception exc, int i2) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i2)}, this, f61852a, false, 68095, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i2)}, this, f61852a, false, 68095, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.n != null && this.m != null) {
            if (4 == i2) {
                this.m.c();
                if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorCode() == 20022) {
                    com.ss.android.common.lib.a.a(this, "profile_image_setting", "review_failure");
                }
            }
            if (i2 != 116) {
                com.ss.android.ugc.aweme.app.api.a.a.a(this, exc, C0906R.string.bsd);
            }
        }
    }

    public final void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f61852a, false, 68096, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f61852a, false, 68096, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.m.c();
            if (!TextUtils.isEmpty(str)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) k.a(), str2).a();
                if (z) {
                    finish();
                }
            }
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f61852a, false, 68064, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61852a, false, 68064, new Class[0], Void.TYPE);
            return;
        }
        this.avatarDecoPanel.setVisibility(0);
        this.mDecoTextView.setOnStateChangedListener(new StateDmtTextView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61860a;

            /* renamed from: c  reason: collision with root package name */
            private ViewPropertyAnimator f61862c;

            /* renamed from: d  reason: collision with root package name */
            private boolean f61863d = HeaderDetailActivity.this.mDecoTextView.isPressed();

            public final void a() {
                float f2;
                if (PatchProxy.isSupport(new Object[0], this, f61860a, false, 68100, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f61860a, false, 68100, new Class[0], Void.TYPE);
                    return;
                }
                boolean isPressed = HeaderDetailActivity.this.mDecoTextView.isPressed();
                if (this.f61863d != isPressed) {
                    this.f61863d = isPressed;
                    if (this.f61862c != null) {
                        this.f61862c.cancel();
                        this.f61862c = null;
                    }
                    ViewPropertyAnimator animate = HeaderDetailActivity.this.mDecoTextView.animate();
                    if (isPressed) {
                        f2 = 0.75f;
                    } else {
                        f2 = 1.0f;
                    }
                    this.f61862c = animate.alpha(f2).setDuration(150);
                    this.f61862c.start();
                }
            }
        });
    }

    @OnClick({2131497901})
    public void editProfile() {
        if (PatchProxy.isSupport(new Object[0], this, f61852a, false, 68074, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61852a, false, 68074, new Class[0], Void.TYPE);
            return;
        }
        this.m.a(0);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f61852a, false, 68089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61852a, false, 68089, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, C0906R.anim.br);
    }

    @OnClick({2131494955})
    public void onBackClick() {
        if (PatchProxy.isSupport(new Object[0], this, f61852a, false, 68067, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61852a, false, 68067, new Class[0], Void.TYPE);
            return;
        }
        onBackPressed();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f61852a, false, 68065, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61852a, false, 68065, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.q != null) {
            this.q.cancel();
        }
    }

    @OnClick({2131493182})
    public void onSetSameClicked() {
        if (PatchProxy.isSupport(new Object[0], this, f61852a, false, 68069, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61852a, false, 68069, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.a() || ex.g(this.f61855d) || !b.a(this.f61855d)) {
            if (com.ss.android.ugc.aweme.festival.christmas.a.a()) {
                com.ss.android.ugc.aweme.festival.common.a e2 = com.ss.android.ugc.aweme.festival.christmas.a.e();
                if (e2 != null) {
                    com.ss.android.ugc.aweme.festival.christmas.c.b bVar = e2.h;
                    if (bVar != null) {
                        String str = bVar.f47236c;
                        if (!TextUtils.isEmpty(str)) {
                            com.ss.android.ugc.aweme.festival.christmas.a.a(this, str);
                            com.ss.android.ugc.aweme.common.r.a("enter_activity_page", (Map) new d().a("enter_from", "head").f34114b);
                        }
                    }
                }
            }
        } else {
            b.a(this, this.f61855d, "others_homepage");
        }
    }

    @OnClick({2131495013})
    public void saveBitmap() {
        if (PatchProxy.isSupport(new Object[0], this, f61852a, false, 68070, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61852a, false, 68070, new Class[0], Void.TYPE);
            return;
        }
        this.progressBar.setVisibility(0);
        this.mDownloadView.setVisibility(8);
        showLoadAnim(this.progressBar);
        com.ss.android.ugc.aweme.base.l.a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.C0400b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61867a;

            public final void a(String[] strArr, int[] iArr) {
                if (PatchProxy.isSupport(new Object[]{strArr, iArr}, this, f61867a, false, 68102, new Class[]{String[].class, int[].class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{strArr, iArr}, this, f61867a, false, 68102, new Class[]{String[].class, int[].class}, Void.TYPE);
                    return;
                }
                if (iArr.length > 0) {
                    if (iArr[0] == -1) {
                        if (!ActivityCompat.shouldShowRequestPermissionRationale(HeaderDetailActivity.this, strArr[0])) {
                            bc.a(HeaderDetailActivity.this, C0906R.string.fs, C0906R.string.pm, null, C0906R.string.a0x, new DialogInterface.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f61869a;

                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61869a, false, 68103, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61869a, false, 68103, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    bi.a(HeaderDetailActivity.this);
                                }
                            }).show();
                        }
                        HeaderDetailActivity.this.progressBar.clearAnimation();
                        HeaderDetailActivity.this.progressBar.setVisibility(8);
                        HeaderDetailActivity.this.mDownloadView.setVisibility(0);
                    } else if (iArr[0] == 0) {
                        com.ss.android.b.a.a.a.a(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f61871a;

                            public final void run() {
                                String str;
                                if (PatchProxy.isSupport(new Object[0], this, f61871a, false, 68104, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f61871a, false, 68104, new Class[0], Void.TYPE);
                                    return;
                                }
                                if (HeaderDetailActivity.this.f61855d != null) {
                                    str = HeaderDetailActivity.this.f61855d.getUid() + "_avatar.png";
                                } else {
                                    str = "avatar.png";
                                }
                                HeaderDetailActivity.this.f61854c = BitmapUtils.getBitmapFromSD(HeaderDetailActivity.this.a());
                                if (BitmapUtils.saveBitmapToSD(HeaderDetailActivity.this.f61854c, HeaderDetailActivity.f61853b, str)) {
                                    f.b(HeaderDetailActivity.this, HeaderDetailActivity.f61853b + str);
                                    HeaderDetailActivity.this.b(HeaderDetailActivity.f61853b + str);
                                    HeaderDetailActivity headerDetailActivity = HeaderDetailActivity.this;
                                    String str2 = HeaderDetailActivity.f61853b + str;
                                    if (PatchProxy.isSupport(new Object[]{str2}, headerDetailActivity, HeaderDetailActivity.f61852a, false, 68076, new Class[]{String.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{str2}, headerDetailActivity, HeaderDetailActivity.f61852a, false, 68076, new Class[]{String.class}, Void.TYPE);
                                    } else {
                                        String str3 = Build.BRAND;
                                        if (!TextUtils.isEmpty(str3) && str3.toLowerCase().equals("vivo")) {
                                            String str4 = Environment.getExternalStorageDirectory() + "/相机/" + new File(str2).getName();
                                            com.ss.android.ugc.aweme.video.b.c(str2, str4);
                                            com.ss.android.ugc.aweme.framework.a.a.a("vivo: " + str4);
                                            headerDetailActivity.b(str4);
                                        }
                                    }
                                    com.ss.android.b.a.a.a.b(new Runnable() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f61873a;

                                        public final void run() {
                                            if (PatchProxy.isSupport(new Object[0], this, f61873a, false, 68105, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], this, f61873a, false, 68105, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            com.bytedance.ies.dmt.ui.d.a.a((Context) HeaderDetailActivity.this, (int) C0906R.string.c1f).a();
                                            HeaderDetailActivity.this.progressBar.clearAnimation();
                                            HeaderDetailActivity.this.progressBar.setVisibility(8);
                                            HeaderDetailActivity.this.mDownloadView.setVisibility(0);
                                        }
                                    });
                                    return;
                                }
                                com.ss.android.b.a.a.a.b(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f61875a;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f61875a, false, 68106, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f61875a, false, 68106, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        com.bytedance.ies.dmt.ui.d.a.b((Context) HeaderDetailActivity.this, (int) C0906R.string.c17).a();
                                        HeaderDetailActivity.this.progressBar.clearAnimation();
                                        HeaderDetailActivity.this.progressBar.setVisibility(8);
                                        HeaderDetailActivity.this.mDownloadView.setVisibility(0);
                                    }
                                });
                            }
                        });
                    }
                }
            }
        });
    }

    @OnClick({2131495097})
    public void onMoreClick() {
        if (PatchProxy.isSupport(new Object[0], this, f61852a, false, 68068, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61852a, false, 68068, new Class[0], Void.TYPE);
            return;
        }
        ChallengeAvatarModifyActivity.a aVar = ChallengeAvatarModifyActivity.f35477e;
        Challenge challenge = this.j;
        if (PatchProxy.isSupport(new Object[]{this, challenge}, aVar, ChallengeAvatarModifyActivity.a.f35481a, false, 26017, new Class[]{Activity.class, Challenge.class}, Void.TYPE)) {
            Object[] objArr = {this, challenge};
            ChallengeAvatarModifyActivity.a aVar2 = aVar;
            PatchProxy.accessDispatch(objArr, aVar2, ChallengeAvatarModifyActivity.a.f35481a, false, 26017, new Class[]{Activity.class, Challenge.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(this, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(challenge, "challenge");
        Intent intent = new Intent(this, ChallengeAvatarModifyActivity.class);
        intent.putExtra("challenge_info", challenge);
        startActivity(intent);
    }

    private String a(List<String> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f61852a, false, 68079, new Class[]{List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list}, this, f61852a, false, 68079, new Class[]{List.class}, String.class);
        }
        ImagePipeline imagePipeline = Fresco.getImagePipeline();
        for (String next : list) {
            if (imagePipeline.isInBitmapMemoryCache(Uri.parse(next))) {
                return next;
            }
        }
        return null;
    }

    private ImageRequest c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f61852a, false, 68080, new Class[]{String.class}, ImageRequest.class)) {
            return (ImageRequest) PatchProxy.accessDispatch(new Object[]{str}, this, f61852a, false, 68080, new Class[]{String.class}, ImageRequest.class);
        }
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.setDecodeAllFrames(false);
        return ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).setImageDecodeOptions(new ImageDecodeOptions(imageDecodeOptionsBuilder)).build();
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f61852a, false, 68077, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f61852a, false, 68077, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(str2);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            sendBroadcast(intent);
        }
    }

    public void showLoadAnim(final View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f61852a, false, 68066, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f61852a, false, 68066, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.q = ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, 360.0f});
        this.q.setDuration(600);
        this.q.setRepeatCount(-1);
        this.q.setInterpolator(new LinearInterpolator());
        this.q.start();
        this.q.addListener(new Animator.AnimatorListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61864a;

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f61864a, false, 68101, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f61864a, false, 68101, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                view.setScaleX(0.0f);
                view.setScaleY(0.0f);
                view.setAlpha(0.0f);
                view.setRotation(0.0f);
                view.setVisibility(0);
            }
        });
    }

    public void onCreate(Bundle bundle) {
        int i2;
        int i3;
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f61852a, false, 68063, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f61852a, false, 68063, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bw);
        ButterKnife.bind((Activity) this);
        overridePendingTransition(C0906R.anim.bq, C0906R.anim.br);
        this.f61857f = findViewById(16908290);
        if (PatchProxy.isSupport(new Object[0], this, f61852a, false, 68086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61852a, false, 68086, new Class[0], Void.TYPE);
        } else {
            this.f61856e = (fe.a) getIntent().getParcelableExtra("extra_zoom_info");
            this.k = getIntent().getStringArrayExtra("uri");
            this.g = getIntent().getFloatExtra("wh_ratio", 1.0f);
            this.f61855d = (User) getIntent().getSerializableExtra("share_info");
            this.h = getIntent().getBooleanExtra("enable_download_img", true);
            Intent intent = getIntent();
            if (this.f61855d == null || !this.f61855d.isMe() || com.ss.android.g.a.b()) {
                z = false;
            } else {
                z = true;
            }
            this.i = intent.getBooleanExtra("enable_edit_img", z);
            this.j = (Challenge) getIntent().getSerializableExtra("challenge_info");
        }
        this.fixedRatioFrame.setWhRatio(this.g);
        ((GenericDraweeHierarchy) this.userAvatar.getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER);
        a(this.userAvatar, true, this.k);
        this.m = new a();
        this.m.f61562c = this;
        this.m.a((Activity) this, (Fragment) null);
        this.n = new ad();
        this.n.h = this;
        ViewGroup viewGroup = this.rootView;
        if (com.ss.android.g.a.b()) {
            i2 = -1;
        } else {
            i2 = -16777216;
        }
        viewGroup.setBackgroundColor(i2);
        this.rootView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61858a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f61858a, false, 68099, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f61858a, false, 68099, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (HeaderDetailActivity.this.mTitleBar.getVisibility() != 0) {
                    HeaderDetailActivity.this.onBackPressed();
                }
            }
        });
        if (this.h) {
            this.mDownloadView.setVisibility(0);
            this.bgView.setVisibility(0);
        }
        if (!com.ss.android.g.a.a() && !ex.g(this.f61855d) && com.ss.android.ugc.aweme.commercialize.model.b.a(this.f61855d)) {
            b();
        } else if (com.ss.android.ugc.aweme.festival.christmas.a.a() && this.f61855d != null && !ex.g(this.f61855d) && this.j == null && this.f61855d.getXmasUnlockCount() >= 3) {
            b();
            com.ss.android.ugc.aweme.festival.common.a e2 = com.ss.android.ugc.aweme.festival.christmas.a.e();
            if (!(e2 == null || e2.h == null)) {
                this.mDecoTextView.setText(e2.h.f47235b);
                this.mDecoHintView.setText(e2.h.f47234a);
            }
        }
        if (this.i) {
            this.editText.setVisibility(0);
        }
        if (this.j != null) {
            this.mTitleBar.setVisibility(0);
            if (!com.ss.android.ugc.aweme.account.d.a().isLogin() || this.j.getDisplayCount() < 500000 || this.j.isCommerce()) {
                z2 = false;
            }
            View view = this.mMore;
            if (z2) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            view.setVisibility(i3);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onCreate", false);
    }

    public static void a(Activity activity, @NonNull Bundle bundle) {
        Activity activity2 = activity;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{activity2, bundle2}, null, f61852a, true, 68085, new Class[]{Activity.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, bundle2}, null, f61852a, true, 68085, new Class[]{Activity.class, Bundle.class}, Void.TYPE);
            return;
        }
        if (activity2 != null) {
            Class headerDetailActivity = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getHeaderDetailActivity();
            if (headerDetailActivity == null) {
                headerDetailActivity = HeaderDetailActivity.class;
            }
            Intent intent = new Intent(activity2, headerDetailActivity);
            intent.putExtras(bundle2);
            activity2.startActivity(intent);
            activity2.overridePendingTransition(0, 0);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f61852a, false, 68075, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f61852a, false, 68075, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (!this.m.a(i2, i3, intent2)) {
        }
    }

    private static void a(Activity activity, View view, @NonNull User user, boolean z) {
        if (PatchProxy.isSupport(new Object[]{activity, view, user, Byte.valueOf(z ? (byte) 1 : 0)}, null, f61852a, true, 68082, new Class[]{Activity.class, View.class, User.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, view, user, Byte.valueOf(z)}, null, f61852a, true, 68082, new Class[]{Activity.class, View.class, User.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        UrlModel c2 = ex.c(user);
        if (c2 != null && j.b(c2.getUrlList())) {
            int size = c2.getUrlList().size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = c2.getUrlList().get(i2);
            }
            a(activity, view, 1.0f, user, z, null, strArr);
        }
    }

    public static void a(Activity activity, View view, @NonNull User user, boolean z, int i2) {
        Activity activity2 = activity;
        View view2 = view;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{activity2, view2, user2, (byte) 0, Integer.valueOf(i2)}, null, f61852a, true, 68081, new Class[]{Activity.class, View.class, User.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {activity2, view2, user2, (byte) 0, Integer.valueOf(i2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f61852a, true, 68081, new Class[]{Activity.class, View.class, User.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (user2 != null) {
            user2.setXmasUnlockCount(i2);
        }
        a(activity2, view2, user2, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r20, android.view.View r21, float r22, com.ss.android.ugc.aweme.profile.model.User r23, boolean r24, com.ss.android.ugc.aweme.discover.model.Challenge r25, java.lang.String... r26) {
        /*
            r0 = r20
            r2 = r23
            r3 = r26
            r4 = 7
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r21
            java.lang.Float r6 = java.lang.Float.valueOf(r22)
            r14 = 2
            r5[r14] = r6
            r15 = 3
            r5[r15] = r2
            java.lang.Byte r6 = java.lang.Byte.valueOf(r24)
            r16 = 4
            r5[r16] = r6
            r17 = 0
            r18 = 5
            r5[r18] = r17
            r19 = 6
            r5[r19] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f61852a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r10[r12] = r6
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r10[r13] = r6
            java.lang.Class r6 = java.lang.Float.TYPE
            r10[r14] = r6
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r6 = com.ss.android.ugc.aweme.profile.model.User.class
            r10[r15] = r6
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r10[r16] = r6
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.Challenge> r6 = com.ss.android.ugc.aweme.discover.model.Challenge.class
            r10[r18] = r6
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r10[r19] = r6
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = 0
            r8 = 1
            r9 = 68083(0x109f3, float:9.5405E-41)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x00a9
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r21
            java.lang.Float r0 = java.lang.Float.valueOf(r22)
            r5[r14] = r0
            r5[r15] = r2
            java.lang.Byte r0 = java.lang.Byte.valueOf(r24)
            r5[r16] = r0
            r5[r18] = r17
            r5[r19] = r3
            r0 = 0
            com.meituan.robust.ChangeQuickRedirect r1 = f61852a
            r2 = 1
            r3 = 68083(0x109f3, float:9.5405E-41)
            java.lang.Class[] r4 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r4[r12] = r6
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r4[r13] = r6
            java.lang.Class r6 = java.lang.Float.TYPE
            r4[r14] = r6
            java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r6 = com.ss.android.ugc.aweme.profile.model.User.class
            r4[r15] = r6
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r4[r16] = r6
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.Challenge> r6 = com.ss.android.ugc.aweme.discover.model.Challenge.class
            r4[r18] = r6
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r4[r19] = r6
            java.lang.Class r6 = java.lang.Void.TYPE
            r20 = r5
            r21 = r0
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r4
            r26 = r6
            com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            return
        L_0x00a9:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "extra_zoom_info"
            com.ss.android.ugc.aweme.utils.fe$a r1 = com.ss.android.ugc.aweme.utils.fe.a(r21)
            r4.putParcelable(r5, r1)
            java.lang.String r1 = "uri"
            r4.putStringArray(r1, r3)
            java.lang.String r1 = "wh_ratio"
            r3 = r22
            r4.putFloat(r1, r3)
            java.lang.String r1 = "enable_download_img"
            r3 = r24
            r4.putBoolean(r1, r3)
            if (r2 == 0) goto L_0x00d1
            java.lang.String r1 = "share_info"
            r4.putSerializable(r1, r2)
        L_0x00d1:
            a((android.app.Activity) r0, (android.os.Bundle) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity.a(android.app.Activity, android.view.View, float, com.ss.android.ugc.aweme.profile.model.User, boolean, com.ss.android.ugc.aweme.discover.model.Challenge, java.lang.String[]):void");
    }
}
