package com.ss.android.ugc.aweme.share.invitefriends.imagecode;

import a.g;
import a.i;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qrcode.c.j;
import com.ss.android.ugc.aweme.qrcode.d.e;
import com.ss.android.ugc.aweme.share.c.b;
import com.ss.android.ugc.aweme.share.invitefriends.imagecode.a;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.utils.permission.f;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;

public class InviteFriendWithImageTokenDialog extends Dialog implements com.ss.android.ugc.aweme.qrcode.d.a, a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65061a;

    /* renamed from: b  reason: collision with root package name */
    public e f65062b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f65063c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f65064d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f65065e;

    /* renamed from: f  reason: collision with root package name */
    protected BaseControllerListener<ImageInfo> f65066f;
    public a g;
    public b.a h = new b.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65071a;

        public final void a(Exception exc) {
            if (PatchProxy.isSupport(new Object[]{exc}, this, f65071a, false, 73554, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc}, this, f65071a, false, 73554, new Class[]{Exception.class}, Void.TYPE);
            } else if (InviteFriendWithImageTokenDialog.this.f65063c) {
                com.bytedance.ies.dmt.ui.d.a.b(InviteFriendWithImageTokenDialog.this.getContext(), (int) C0906R.string.c6m).a();
                if (InviteFriendWithImageTokenDialog.this.g != null) {
                    InviteFriendWithImageTokenDialog.this.g.a();
                }
            }
        }

        public final void a(File file) {
            File file2 = file;
            if (PatchProxy.isSupport(new Object[]{file2}, this, f65071a, false, 73553, new Class[]{File.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{file2}, this, f65071a, false, 73553, new Class[]{File.class}, Void.TYPE);
            } else if (InviteFriendWithImageTokenDialog.this.f65063c) {
                InviteFriendWithImageTokenDialog inviteFriendWithImageTokenDialog = InviteFriendWithImageTokenDialog.this;
                if (PatchProxy.isSupport(new Object[]{file2}, inviteFriendWithImageTokenDialog, InviteFriendWithImageTokenDialog.f65061a, false, 73547, new Class[]{File.class}, Void.TYPE)) {
                    InviteFriendWithImageTokenDialog inviteFriendWithImageTokenDialog2 = inviteFriendWithImageTokenDialog;
                    PatchProxy.accessDispatch(new Object[]{file2}, inviteFriendWithImageTokenDialog2, InviteFriendWithImageTokenDialog.f65061a, false, 73547, new Class[]{File.class}, Void.TYPE);
                } else {
                    String path = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), file.getName()).getPath();
                    com.ss.android.ugc.aweme.video.b.c(file.getPath(), path);
                    Context context = inviteFriendWithImageTokenDialog.getContext();
                    context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + path)));
                }
                if (InviteFriendWithImageTokenDialog.this.g != null) {
                    InviteFriendWithImageTokenDialog.this.g.a(file2);
                }
            }
        }
    };
    private a.C0700a i;
    private Activity j;
    private int k;
    private String l;
    private String m;
    @BindView(2131493914)
    TextView mDescription;
    @BindView(2131493915)
    TextView mDescription2;
    @BindView(2131494377)
    View mForSaveImageView;
    @BindView(2131496567)
    RemoteImageView mQrCode;
    @BindView(2131496568)
    RemoteImageView mQrCode2;
    @BindView(2131497590)
    TextView mTitle;
    @BindView(2131497591)
    TextView mTitle2;

    public interface a {
        void a();

        void a(File file);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ BitmapDrawable a() throws Exception {
        try {
            if (this.f65062b.c()) {
                return new BitmapDrawable(getContext().getResources(), this.f65062b.d().getAbsolutePath());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @OnClick({2131493574})
    public void onCloseClick() {
        if (PatchProxy.isSupport(new Object[0], this, f65061a, false, 73545, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65061a, false, 73545, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f65061a, false, 73548, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65061a, false, 73548, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f65063c = false;
        if (this.i != null) {
            this.i.a();
        }
    }

    @OnClick({2131493938})
    public void onConfirmClick() {
        if (PatchProxy.isSupport(new Object[0], this, f65061a, false, 73546, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65061a, false, 73546, new Class[0], Void.TYPE);
        } else if (!this.f65065e) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), getContext().getString(C0906R.string.a7b)).a();
        } else if (f.c(this.j) != 0) {
            com.ss.android.ugc.aweme.utils.permission.a.a(this.j, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f65073a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f65073a, false, 73555, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f65073a, false, 73555, new Class[0], Void.TYPE);
                        return;
                    }
                    b.a(InviteFriendWithImageTokenDialog.this.mForSaveImageView, InviteFriendWithImageTokenDialog.this.h);
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f65073a, false, 73556, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f65073a, false, 73556, new Class[0], Void.TYPE);
                        return;
                    }
                    if (InviteFriendWithImageTokenDialog.this.g != null) {
                        InviteFriendWithImageTokenDialog.this.g.a();
                    }
                }
            });
        } else {
            b.a(this.mForSaveImageView, this.h);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(i iVar) throws Exception {
        if (this.f65063c && iVar.e() != null) {
            ((GenericDraweeHierarchy) this.mQrCode.getHierarchy()).setFadeDuration(0);
            ((GenericDraweeHierarchy) this.mQrCode.getHierarchy()).setPlaceholderImage((Drawable) iVar.e(), ScalingUtils.ScaleType.CENTER_CROP);
            ((GenericDraweeHierarchy) this.mQrCode2.getHierarchy()).setFadeDuration(0);
            ((GenericDraweeHierarchy) this.mQrCode2.getHierarchy()).setPlaceholderImage((Drawable) iVar.e(), ScalingUtils.ScaleType.CENTER_CROP);
            this.f65065e = true;
        }
        return null;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65061a, false, 73544, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65061a, false, 73544, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, (float) this.mDescription2.getWidth(), (float) this.mDescription2.getHeight(), Color.parseColor("#4150ae"), Color.parseColor("#e55994"), Shader.TileMode.CLAMP);
            this.mDescription2.getPaint().setShader(linearGradient);
        }
    }

    public final String a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, f65061a, false, 73543, new Class[]{UrlModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{urlModel}, this, f65061a, false, 73543, new Class[]{UrlModel.class}, String.class);
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return "";
        } else {
            return urlModel.getUrlList().get(0);
        }
    }

    public final void a(final com.ss.android.ugc.aweme.qrcode.c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f65061a, false, 73540, new Class[]{com.ss.android.ugc.aweme.qrcode.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f65061a, false, 73540, new Class[]{com.ss.android.ugc.aweme.qrcode.c.a.class}, Void.TYPE);
            return;
        }
        r.a("qr_code_generate", (Map) new d().a("enter_from", this.m).a("platform", com.ss.android.ugc.aweme.share.c.i.a(this.k)).a("qr_code_type", "shaped").f34114b);
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f65061a, false, 73542, new Class[]{com.ss.android.ugc.aweme.qrcode.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f65061a, false, 73542, new Class[]{com.ss.android.ugc.aweme.qrcode.c.a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            String a2 = a(aVar.f63358a);
            if (c.a(Uri.parse(a2))) {
                c.b(this.mQrCode, aVar.f63358a);
                this.mQrCode2.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri(Uri.parse(a(aVar.f63358a))).setOldController(this.mQrCode2.getController())).setControllerListener(this.f65066f)).build());
                if (!this.f65062b.c()) {
                    this.f65062b.a(a2);
                }
            } else {
                c.a(aVar.f63358a, (c.a) new c.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f65068a;

                    public final void a(Exception exc) {
                        if (PatchProxy.isSupport(new Object[]{exc}, this, f65068a, false, 73552, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc}, this, f65068a, false, 73552, new Class[]{Exception.class}, Void.TYPE);
                        } else if (InviteFriendWithImageTokenDialog.this.f65063c) {
                            com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), InviteFriendWithImageTokenDialog.this.getContext().getString(C0906R.string.b2x)).a();
                        }
                    }

                    public final void a(DataSource<CloseableReference<CloseableImage>> dataSource) {
                        if (PatchProxy.isSupport(new Object[]{dataSource}, this, f65068a, false, 73551, new Class[]{DataSource.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dataSource}, this, f65068a, false, 73551, new Class[]{DataSource.class}, Void.TYPE);
                        } else if (InviteFriendWithImageTokenDialog.this.f65063c) {
                            c.b(InviteFriendWithImageTokenDialog.this.mQrCode, aVar.f63358a);
                            InviteFriendWithImageTokenDialog.this.mQrCode2.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri(Uri.parse(InviteFriendWithImageTokenDialog.this.a(aVar.f63358a))).setOldController(InviteFriendWithImageTokenDialog.this.mQrCode2.getController())).setControllerListener(InviteFriendWithImageTokenDialog.this.f65066f)).build());
                            InviteFriendWithImageTokenDialog.this.f65062b.a(InviteFriendWithImageTokenDialog.this.a(aVar.f63358a));
                        }
                    }
                });
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f65061a, false, 73538, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f65061a, false, 73538, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.i = new f(this);
        this.f65062b = new e(new j(), this);
        setContentView(C0906R.layout.jd);
        ButterKnife.bind((Dialog) this);
        if (PatchProxy.isSupport(new Object[0], this, f65061a, false, 73539, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65061a, false, 73539, new Class[0], Void.TYPE);
        } else {
            this.mDescription.setText(getContext().getString(C0906R.string.b2v, new Object[]{this.l}));
            this.mTitle2.setText(com.ss.android.ugc.aweme.account.d.a().getCurUser().getNickname());
            this.f65066f = new BaseControllerListener<ImageInfo>() {
                public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                    InviteFriendWithImageTokenDialog.this.f65065e = true;
                }
            };
            if (this.f65062b.c()) {
                this.f65064d = true;
                Uri fromFile = Uri.fromFile(this.f65062b.d());
                Fresco.getImagePipeline().evictFromCache(fromFile);
                this.mQrCode.setImageURI(fromFile);
                this.mQrCode2.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri(fromFile).setOldController(this.mQrCode2.getController())).setControllerListener(this.f65066f)).build());
                i.a((Callable<TResult>) new d<TResult>(this)).a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(this), i.f1052b);
            }
            this.f65062b.b(16, com.ss.android.ugc.aweme.account.d.a().getCurUserId());
        }
        this.f65063c = true;
        setCanceledOnTouchOutside(false);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.dimAmount = 0.85f;
        getWindow().setAttributes(attributes);
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f65061a, false, 73541, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f65061a, false, 73541, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), (Throwable) exc2);
    }

    public InviteFriendWithImageTokenDialog(@NonNull Activity activity, int i2, @NonNull String str, String str2) {
        super(activity, C0906R.style.su);
        this.j = activity;
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        this.l = str;
        this.k = i2;
        this.m = str2;
    }
}
