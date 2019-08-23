package com.ss.android.ugc.aweme.share.invitefriends.imagecode;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
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
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.c.b;
import com.ss.android.ugc.aweme.share.invitefriends.imagecode.a;
import com.ss.android.ugc.aweme.u.ae;
import com.ss.android.ugc.aweme.utils.permission.a;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u00011\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0016J\b\u00108\u001a\u000205H\u0016J\u0018\u00109\u001a\u0002052\u000e\u0010:\u001a\n\u0018\u00010;j\u0004\u0018\u0001`<H\u0016J\u0006\u0010=\u001a\u000205J\b\u0010>\u001a\u00020\u0019H\u0016J\u000e\u0010?\u001a\u0002052\u0006\u0010@\u001a\u00020\u0016J\u0012\u0010A\u001a\u0002052\b\u0010B\u001a\u0004\u0018\u00010CH\u0014J\b\u0010D\u001a\u000205H\u0016J\u0010\u0010E\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\u0010\u0010F\u001a\u0002052\u0006\u0010G\u001a\u00020\u0019H\u0016J\u0010\u0010H\u001a\u0002052\u0006\u0010I\u001a\u00020JH\u0002J\b\u0010K\u001a\u000205H\u0016R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b+\u0010\u0012\u001a\u0004\b)\u0010*R\u000e\u0010,\u001a\u00020-X.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u000201X\u0004¢\u0006\u0004\n\u0002\u00102R\u000e\u00103\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lcom/ss/android/ugc/aweme/share/invitefriends/imagecode/ImageTokenShareDialog;", "Landroid/app/Dialog;", "Lcom/ss/android/ugc/aweme/share/invitefriends/imagecode/IInviteFriendWithImageTokenContract$View;", "Lcom/ss/android/ugc/aweme/qrcode/presenter/IQRCodeView;", "context", "Landroid/content/Context;", "mEnterFrom", "", "(Landroid/content/Context;Ljava/lang/String;)V", "mActivity", "Landroid/app/Activity;", "mChannelId", "", "mDelegate", "Lcom/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate;", "getMDelegate", "()Lcom/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate;", "mDelegate$delegate", "Lkotlin/Lazy;", "mDescription2", "Landroid/widget/TextView;", "mDialogContentView", "Landroid/view/View;", "mForSaveImageView", "mHasStoragePermission", "", "mImageHasSaved", "mImageLoadListener", "Lcom/facebook/drawee/controller/BaseControllerListener;", "Lcom/facebook/imagepipeline/image/ImageInfo;", "mImageSavePath", "mIsCacheUsed", "mIsImageLoaded", "mIsViewValid", "mPresenter", "Lcom/ss/android/ugc/aweme/share/invitefriends/imagecode/IInviteFriendWithImageTokenContract$Presenter;", "getMPresenter", "()Lcom/ss/android/ugc/aweme/share/invitefriends/imagecode/IInviteFriendWithImageTokenContract$Presenter;", "mPresenter$delegate", "mQRCodePresenter", "Lcom/ss/android/ugc/aweme/qrcode/presenter/QRCodePresenter;", "getMQRCodePresenter", "()Lcom/ss/android/ugc/aweme/qrcode/presenter/QRCodePresenter;", "mQRCodePresenter$delegate", "mQrCode", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "mQrCode2", "mRootView", "mSaveViewSnapshotAsFileCallback", "com/ss/android/ugc/aweme/share/invitefriends/imagecode/ImageTokenShareDialog$mSaveViewSnapshotAsFileCallback$1", "Lcom/ss/android/ugc/aweme/share/invitefriends/imagecode/ImageTokenShareDialog$mSaveViewSnapshotAsFileCallback$1;", "mTitle2", "bindQRCode", "", "info", "Lcom/ss/android/ugc/aweme/qrcode/model/QRCodeInfo;", "dismiss", "getQRCodeFailed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "initView", "isViewValid", "onClick", "view", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetachedFromWindow", "onGetQRCodeInfoSuccess", "onWindowFocusChanged", "hasFocus", "saveToGallery", "cardFile", "Ljava/io/File;", "show", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b extends Dialog implements com.ss.android.ugc.aweme.qrcode.d.a, a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65085a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f65086b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "mPresenter", "getMPresenter()Lcom/ss/android/ugc/aweme/share/invitefriends/imagecode/IInviteFriendWithImageTokenContract$Presenter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "mQRCodePresenter", "getMQRCodePresenter()Lcom/ss/android/ugc/aweme/qrcode/presenter/QRCodePresenter;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "mDelegate", "getMDelegate()Lcom/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate;"))};

    /* renamed from: c  reason: collision with root package name */
    public View f65087c;

    /* renamed from: d  reason: collision with root package name */
    public View f65088d;

    /* renamed from: e  reason: collision with root package name */
    public RemoteImageView f65089e;

    /* renamed from: f  reason: collision with root package name */
    public RemoteImageView f65090f;
    public Activity g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public String l = "";
    public boolean m;
    public final BaseControllerListener<ImageInfo> n;
    public final k o;
    public final String p;
    private View q;
    private TextView r;
    private TextView s;
    private boolean t;
    private final Lazy u;
    private final Lazy v;
    private final Lazy w;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0016¨\u0006\f¸\u0006\u0000"}, d2 = {"com/ss/android/ugc/aweme/share/invitefriends/imagecode/ImageTokenShareDialog$bindQRCode$1$1", "Lcom/ss/android/ugc/aweme/base/FrescoHelper$Callback;", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "dataSource", "Lcom/facebook/datasource/DataSource;", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65091a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f65092b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f65093c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.qrcode.c.a f65094d;

        public final void a(@NotNull Exception exc) {
            if (PatchProxy.isSupport(new Object[]{exc}, this, f65091a, false, 73522, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc}, this, f65091a, false, 73522, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(exc, "e");
            if (this.f65093c.h) {
                com.bytedance.ies.dmt.ui.d.a.c((Context) com.ss.android.ugc.aweme.app.k.a(), this.f65093c.getContext().getString(C0906R.string.b2x)).a();
            }
        }

        public final void a(@NotNull DataSource<CloseableReference<CloseableImage>> dataSource) {
            if (PatchProxy.isSupport(new Object[]{dataSource}, this, f65091a, false, 73521, new Class[]{DataSource.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dataSource}, this, f65091a, false, 73521, new Class[]{DataSource.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(dataSource, "dataSource");
            if (this.f65093c.h) {
                com.ss.android.ugc.aweme.base.c.b(b.a(this.f65093c), this.f65094d.f63358a);
                b.b(this.f65093c).setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setUri(Uri.parse(this.f65092b)).setOldController(b.b(this.f65093c).getController())).setControllerListener(this.f65093c.n)).build());
                this.f65093c.a().a(this.f65092b);
            }
        }

        a(String str, b bVar, com.ss.android.ugc.aweme.qrcode.c.a aVar) {
            this.f65092b = str;
            this.f65093c = bVar;
            this.f65094d = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.share.invitefriends.imagecode.b$b  reason: collision with other inner class name */
    static final class C0701b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65095a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f65096b;

        C0701b(b bVar) {
            this.f65096b = bVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f65095a, false, 73523, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65095a, false, 73523, new Class[0], Void.TYPE);
                return;
            }
            c.a(this.f65096b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65097a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f65098b;

        c(b bVar) {
            this.f65098b = bVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f65097a, false, 73524, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f65097a, false, 73524, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f65098b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65099a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f65100b = new d();

        d() {
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f65099a, false, 73525, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f65099a, false, 73525, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/BitmapDrawable;", "call"}, k = 3, mv = {1, 1, 15})
    static final class e<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f65102b;

        e(b bVar) {
            this.f65102b = bVar;
        }

        /* access modifiers changed from: private */
        @Nullable
        /* renamed from: a */
        public BitmapDrawable call() {
            if (PatchProxy.isSupport(new Object[0], this, f65101a, false, 73526, new Class[0], BitmapDrawable.class)) {
                return (BitmapDrawable) PatchProxy.accessDispatch(new Object[0], this, f65101a, false, 73526, new Class[0], BitmapDrawable.class);
            }
            BitmapDrawable bitmapDrawable = null;
            try {
                if (this.f65102b.a().c()) {
                    Context context = this.f65102b.getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    Resources resources = context.getResources();
                    File d2 = this.f65102b.a().d();
                    if (d2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Intrinsics.checkExpressionValueIsNotNull(d2, "mQRCodePresenter.imageCacheFile!!");
                    bitmapDrawable = new BitmapDrawable(resources, d2.getAbsolutePath());
                }
            } catch (Exception unused) {
            }
            return bitmapDrawable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "task", "Lbolts/Task;", "Landroid/graphics/drawable/BitmapDrawable;", "then"}, k = 3, mv = {1, 1, 15})
    static final class f<TTaskResult, TContinuationResult> implements a.g<BitmapDrawable, Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65103a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f65104b;

        f(b bVar) {
            this.f65104b = bVar;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f65103a, false, 73527, new Class[]{a.i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f65103a, false, 73527, new Class[]{a.i.class}, Void.TYPE);
            } else if (this.f65104b.h && iVar != null) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) iVar.e();
                if (bitmapDrawable != null) {
                    GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) b.a(this.f65104b).getHierarchy();
                    Intrinsics.checkExpressionValueIsNotNull(genericDraweeHierarchy, "mQrCode.hierarchy");
                    genericDraweeHierarchy.setFadeDuration(0);
                    Drawable drawable = bitmapDrawable;
                    ((GenericDraweeHierarchy) b.a(this.f65104b).getHierarchy()).setPlaceholderImage(drawable, ScalingUtils.ScaleType.CENTER_CROP);
                    GenericDraweeHierarchy genericDraweeHierarchy2 = (GenericDraweeHierarchy) b.b(this.f65104b).getHierarchy();
                    Intrinsics.checkExpressionValueIsNotNull(genericDraweeHierarchy2, "mQrCode2.hierarchy");
                    genericDraweeHierarchy2.setFadeDuration(0);
                    ((GenericDraweeHierarchy) b.b(this.f65104b).getHierarchy()).setPlaceholderImage(drawable, ScalingUtils.ScaleType.CENTER_CROP);
                    this.f65104b.i = true;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/share/invitefriends/CommandTokenDialogDelegate;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function0<com.ss.android.ugc.aweme.share.invitefriends.a> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Context $context;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, Context context) {
            super(0);
            this.this$0 = bVar;
            this.$context = context;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.share.invitefriends.a invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73528, new Class[0], com.ss.android.ugc.aweme.share.invitefriends.a.class)) {
                return (com.ss.android.ugc.aweme.share.invitefriends.a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73528, new Class[0], com.ss.android.ugc.aweme.share.invitefriends.a.class);
            }
            Context context = this.$context;
            Dialog dialog = this.this$0;
            View view = this.this$0.f65087c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDialogContentView");
            }
            com.ss.android.ugc.aweme.share.invitefriends.a aVar = new com.ss.android.ugc.aweme.share.invitefriends.a(context, dialog, view, new Function1<View, Unit>(this.this$0) {
                public static ChangeQuickRedirect changeQuickRedirect;

                public final String getName() {
                    return "onClick";
                }

                public final KDeclarationContainer getOwner() {
                    if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73530, new Class[0], KDeclarationContainer.class)) {
                        return Reflection.getOrCreateKotlinClass(b.class);
                    }
                    return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73530, new Class[0], KDeclarationContainer.class);
                }

                public final String getSignature() {
                    return "onClick(Landroid/view/View;)V";
                }

                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((View) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull View view) {
                    int i;
                    View view2 = view;
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, changeQuickRedirect, false, 73529, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, changeQuickRedirect, false, 73529, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(view2, "p1");
                    b bVar = (b) this.receiver;
                    if (PatchProxy.isSupport(new Object[]{view2}, bVar, b.f65085a, false, 73515, new Class[]{View.class}, Void.TYPE)) {
                        b bVar2 = bVar;
                        PatchProxy.accessDispatch(new Object[]{view2}, bVar2, b.f65085a, false, 73515, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    Intrinsics.checkParameterIsNotNull(view2, "view");
                    if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                        int id = view.getId();
                        if (id == C0906R.id.a4p || id == C0906R.id.a4m) {
                            if (view.getId() == C0906R.id.a4p) {
                                i = 0;
                            } else {
                                i = 1;
                            }
                            bVar.k = i;
                            r.a("add_profile_friends", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_from", bVar.p).a("platform", com.ss.android.ugc.aweme.share.c.i.a(bVar.k)).f34114b);
                            if (!bVar.i) {
                                com.bytedance.ies.dmt.ui.d.a.c((Context) com.ss.android.ugc.aweme.app.k.a(), bVar.getContext().getString(C0906R.string.a7b)).a();
                                return;
                            }
                            if (com.ss.android.ugc.aweme.utils.permission.f.c(bVar.g) != 0) {
                                z = false;
                            }
                            bVar.m = z;
                            if (!bVar.m) {
                                com.ss.android.ugc.aweme.utils.permission.a.a(bVar.g, "android.permission.WRITE_EXTERNAL_STORAGE", new l(bVar));
                            } else if (!TextUtils.isEmpty(bVar.l)) {
                                new com.ss.android.ugc.aweme.share.c.h(bVar.g).a(bVar.k).b().b(bVar.l).c().a();
                                bVar.dismiss();
                            } else {
                                com.bytedance.ies.dmt.ui.d.a.b((Context) bVar.g, (int) C0906R.string.b2z).a();
                            }
                        } else if (id == C0906R.id.cva) {
                            com.ss.android.ugc.aweme.qrcode.d.e a2 = bVar.a();
                            IAccountUserService a3 = com.ss.android.ugc.aweme.account.d.a();
                            Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
                            a2.b(16, a3.getCurUserId());
                        } else if (id == C0906R.id.ti) {
                            bVar.dismiss();
                        }
                    }
                }
            }, this.this$0.m);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/share/invitefriends/imagecode/ImageTokenShareDialog$mImageLoadListener$1", "Lcom/facebook/drawee/controller/BaseControllerListener;", "Lcom/facebook/imagepipeline/image/ImageInfo;", "onFinalImageSet", "", "id", "", "imageInfo", "animatable", "Landroid/graphics/drawable/Animatable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h extends BaseControllerListener<ImageInfo> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f65106b;

        h(b bVar) {
            this.f65106b = bVar;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            ImageInfo imageInfo = (ImageInfo) obj;
            if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f65105a, false, 73531, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f65105a, false, 73531, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                return;
            }
            this.f65106b.i = true;
            if (!this.f65106b.j && this.f65106b.m) {
                this.f65106b.j = true;
                com.ss.android.ugc.aweme.share.c.b.a(b.c(this.f65106b), this.f65106b.o);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/share/invitefriends/imagecode/InviteFriendWithImageTokenPresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function0<f> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @NotNull
        public final f invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73532, new Class[0], f.class)) {
                return new f(this.this$0);
            }
            return (f) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73532, new Class[0], f.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/qrcode/presenter/QRCodePresenter;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function0<com.ss.android.ugc.aweme.qrcode.d.e> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ b this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.qrcode.d.e invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 73533, new Class[0], com.ss.android.ugc.aweme.qrcode.d.e.class)) {
                return new com.ss.android.ugc.aweme.qrcode.d.e(new com.ss.android.ugc.aweme.qrcode.c.j(), this.this$0);
            }
            return (com.ss.android.ugc.aweme.qrcode.d.e) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 73533, new Class[0], com.ss.android.ugc.aweme.qrcode.d.e.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/share/invitefriends/imagecode/ImageTokenShareDialog$mSaveViewSnapshotAsFileCallback$1", "Lcom/ss/android/ugc/aweme/share/sharerequest/ShareHelperV2$SaveViewSnapshotAsFileCallback;", "onSaveFail", "", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSaveOK", "file", "Ljava/io/File;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class k implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65107a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f65108b;

        k(b bVar) {
            this.f65108b = bVar;
        }

        public final void a(@NotNull Exception exc) {
            Exception exc2 = exc;
            if (PatchProxy.isSupport(new Object[]{exc2}, this, f65107a, false, 73535, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc2}, this, f65107a, false, 73535, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(exc2, "ex");
            if (this.f65108b.h) {
                com.ss.android.ugc.aweme.share.invitefriends.a b2 = this.f65108b.b();
                if (PatchProxy.isSupport(new Object[0], b2, com.ss.android.ugc.aweme.share.invitefriends.a.f65029a, false, 73489, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], b2, com.ss.android.ugc.aweme.share.invitefriends.a.f65029a, false, 73489, new Class[0], Void.TYPE);
                } else {
                    View view = b2.f65030b;
                    view.setPadding(0, 0, 0, (int) UIUtils.dip2Px(view.getContext(), 10.0f));
                    view.setVisibility(4);
                    b2.f65031c.setText((int) C0906R.string.b30);
                    b2.f65032d.setText((int) C0906R.string.b30);
                }
                if (!this.f65108b.m) {
                    com.bytedance.ies.dmt.ui.d.a.b(this.f65108b.getContext(), (int) C0906R.string.b2z).a();
                }
            }
        }

        public final void a(@NotNull File file) {
            File file2 = file;
            if (PatchProxy.isSupport(new Object[]{file2}, this, f65107a, false, 73534, new Class[]{File.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{file2}, this, f65107a, false, 73534, new Class[]{File.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(file2, "file");
            if (this.f65108b.h) {
                b bVar = this.f65108b;
                if (PatchProxy.isSupport(new Object[]{file2}, bVar, b.f65085a, false, 73516, new Class[]{File.class}, Void.TYPE)) {
                    b bVar2 = bVar;
                    PatchProxy.accessDispatch(new Object[]{file2}, bVar2, b.f65085a, false, 73516, new Class[]{File.class}, Void.TYPE);
                } else {
                    String path = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), file.getName()).getPath();
                    com.ss.android.ugc.aweme.video.b.c(file.getPath(), path);
                    Activity activity = bVar.g;
                    activity.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + path)));
                }
                b bVar3 = this.f65108b;
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkExpressionValueIsNotNull(absolutePath, "file.absolutePath");
                bVar3.l = absolutePath;
                new ae().a(this.f65108b.p).b(com.ss.android.ugc.aweme.share.c.i.a(this.f65108b.k)).c("shaped").e();
                if (!this.f65108b.m) {
                    new com.ss.android.ugc.aweme.share.c.h(this.f65108b.g).a(this.f65108b.k).b().b(this.f65108b.l).c().a();
                    this.f65108b.dismiss();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/share/invitefriends/imagecode/ImageTokenShareDialog$onClick$1", "Lcom/ss/android/ugc/aweme/utils/permission/AwemePermissionUtils$OnPermissionListener;", "onPermissionDenied", "", "onPermissionGranted", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class l implements a.C0792a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65109a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f65110b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f65109a, false, 73536, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65109a, false, 73536, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.share.c.b.a(b.c(this.f65110b), this.f65110b.o);
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f65109a, false, 73537, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65109a, false, 73537, new Class[0], Void.TYPE);
                return;
            }
            this.f65110b.dismiss();
            com.ss.android.ugc.aweme.share.invitefriends.b.b(this.f65110b.g, this.f65110b.p);
        }

        l(b bVar) {
            this.f65110b = bVar;
        }
    }

    public final com.ss.android.ugc.aweme.qrcode.d.e a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f65085a, false, 73507, new Class[0], com.ss.android.ugc.aweme.qrcode.d.e.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f65085a, false, 73507, new Class[0], com.ss.android.ugc.aweme.qrcode.d.e.class);
        } else {
            value = this.v.getValue();
        }
        return (com.ss.android.ugc.aweme.qrcode.d.e) value;
    }

    public final com.ss.android.ugc.aweme.share.invitefriends.a b() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f65085a, false, 73508, new Class[0], com.ss.android.ugc.aweme.share.invitefriends.a.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f65085a, false, 73508, new Class[0], com.ss.android.ugc.aweme.share.invitefriends.a.class);
        } else {
            value = this.w.getValue();
        }
        return (com.ss.android.ugc.aweme.share.invitefriends.a) value;
    }

    public final void show() {
        if (PatchProxy.isSupport(new Object[0], this, f65085a, false, 73518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65085a, false, 73518, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        com.ss.android.ugc.aweme.share.invitefriends.a b2 = b();
        View view = this.f65087c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogContentView");
        }
        b2.a(true, view);
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f65085a, false, 73519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65085a, false, 73519, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.share.invitefriends.a b2 = b();
        View view = this.f65087c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogContentView");
        }
        b2.a(false, view);
        new Handler().postDelayed(new C0701b(this), 100);
    }

    public final void onDetachedFromWindow() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f65085a, false, 73517, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65085a, false, 73517, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.h = false;
        if (PatchProxy.isSupport(new Object[0], this, f65085a, false, 73506, new Class[0], a.C0700a.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f65085a, false, 73506, new Class[0], a.C0700a.class);
        } else {
            value = this.u.getValue();
        }
        ((a.C0700a) value).a();
    }

    public static final /* synthetic */ RemoteImageView a(b bVar) {
        RemoteImageView remoteImageView = bVar.f65089e;
        if (remoteImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mQrCode");
        }
        return remoteImageView;
    }

    public static final /* synthetic */ RemoteImageView b(b bVar) {
        RemoteImageView remoteImageView = bVar.f65090f;
        if (remoteImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mQrCode2");
        }
        return remoteImageView;
    }

    public static final /* synthetic */ View c(b bVar) {
        View view = bVar.f65088d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mForSaveImageView");
        }
        return view;
    }

    public final void a(@Nullable Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f65085a, false, 73512, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f65085a, false, 73512, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        b().d(1);
        com.ss.android.ugc.aweme.app.api.a.a.a(getContext(), (Throwable) exc);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f65085a, false, 73514, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f65085a, false, 73514, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            TextView textView = this.s;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDescription2");
            }
            float width = (float) textView.getWidth();
            TextView textView2 = this.s;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDescription2");
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, width, (float) textView2.getHeight(), Color.parseColor("#4150ae"), Color.parseColor("#e55994"), Shader.TileMode.CLAMP);
            TextView textView3 = this.s;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDescription2");
            }
            TextPaint paint = textView3.getPaint();
            Intrinsics.checkExpressionValueIsNotNull(paint, "mDescription2.paint");
            paint.setShader(linearGradient);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.qrcode.c.a r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f65085a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.qrcode.c.a> r1 = com.ss.android.ugc.aweme.qrcode.c.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 73511(0x11f27, float:1.03011E-40)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f65085a
            r3 = 0
            r4 = 73511(0x11f27, float:1.03011E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.qrcode.c.a> r1 = com.ss.android.ugc.aweme.qrcode.c.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            java.lang.String r0 = "info"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            com.ss.android.ugc.aweme.share.invitefriends.a r0 = r9.b()
            r0.c(r7)
            java.lang.String r0 = "qr_code_generate"
            com.ss.android.ugc.aweme.app.d.d r1 = new com.ss.android.ugc.aweme.app.d.d
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = r9.p
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "platform"
            int r3 = r9.k
            java.lang.String r3 = com.ss.android.ugc.aweme.share.c.i.a(r3)
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "qr_code_type"
            java.lang.String r3 = "shaped"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f65085a
            r3 = 0
            r4 = 73513(0x11f29, float:1.03014E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.qrcode.c.a> r1 = com.ss.android.ugc.aweme.qrcode.c.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0096
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f65085a
            r3 = 0
            r4 = 73513(0x11f29, float:1.03014E-40)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.qrcode.c.a> r1 = com.ss.android.ugc.aweme.qrcode.c.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0096:
            if (r10 == 0) goto L_0x0143
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r10.f63358a
            java.lang.String r1 = "info.qrcodeUrl"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r10.f63358a
            java.lang.String r1 = "info.qrcodeUrl"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.util.List r0 = r0.getUrlList()
            java.lang.String r1 = "info.qrcodeUrl.urlList"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r10.f63358a
            java.lang.String r1 = "info.qrcodeUrl"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.util.List r0 = r0.getUrlList()
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00d2
        L_0x00d0:
            java.lang.String r0 = ""
        L_0x00d2:
            android.net.Uri r1 = android.net.Uri.parse(r0)
            boolean r1 = com.ss.android.ugc.aweme.base.c.a((android.net.Uri) r1)
            if (r1 == 0) goto L_0x0137
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r9.f65089e
            if (r1 != 0) goto L_0x00e5
            java.lang.String r2 = "mQrCode"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00e5:
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r10.f63358a
            com.ss.android.ugc.aweme.base.c.b(r1, r2)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r9.f65090f
            if (r1 != 0) goto L_0x00f3
            java.lang.String r2 = "mQrCode2"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x00f3:
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r2 = com.facebook.drawee.backends.pipeline.Fresco.newDraweeControllerBuilder()
            android.net.Uri r3 = android.net.Uri.parse(r0)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r2 = r2.setUri((android.net.Uri) r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r9.f65090f
            if (r3 != 0) goto L_0x0108
            java.lang.String r4 = "mQrCode2"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
        L_0x0108:
            com.facebook.drawee.interfaces.DraweeController r3 = r3.getController()
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r2 = r2.setOldController((com.facebook.drawee.interfaces.DraweeController) r3)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r2 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r2
            com.facebook.drawee.controller.BaseControllerListener<com.facebook.imagepipeline.image.ImageInfo> r3 = r9.n
            com.facebook.drawee.controller.ControllerListener r3 = (com.facebook.drawee.controller.ControllerListener) r3
            com.facebook.drawee.controller.AbstractDraweeControllerBuilder r2 = r2.setControllerListener(r3)
            com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder r2 = (com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder) r2
            com.facebook.drawee.controller.AbstractDraweeController r2 = r2.build()
            com.facebook.drawee.interfaces.DraweeController r2 = (com.facebook.drawee.interfaces.DraweeController) r2
            r1.setController(r2)
            com.ss.android.ugc.aweme.qrcode.d.e r1 = r9.a()
            boolean r1 = r1.c()
            if (r1 != 0) goto L_0x0143
            com.ss.android.ugc.aweme.qrcode.d.e r1 = r9.a()
            r1.a((java.lang.String) r0)
            return
        L_0x0137:
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r10.f63358a
            com.ss.android.ugc.aweme.share.invitefriends.imagecode.b$a r2 = new com.ss.android.ugc.aweme.share.invitefriends.imagecode.b$a
            r2.<init>(r0, r9, r10)
            com.ss.android.ugc.aweme.base.c$a r2 = (com.ss.android.ugc.aweme.base.c.a) r2
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.model.UrlModel) r1, (com.ss.android.ugc.aweme.base.c.a) r2)
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.invitefriends.imagecode.b.a(com.ss.android.ugc.aweme.qrcode.c.a):void");
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f65085a, false, 73509, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f65085a, false, 73509, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.jr);
        if (getWindow() != null) {
            setCanceledOnTouchOutside(true);
        }
        this.h = true;
        if (PatchProxy.isSupport(new Object[0], this, f65085a, false, 73510, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65085a, false, 73510, new Class[0], Void.TYPE);
            return;
        }
        View findViewById = findViewById(C0906R.id.a4n);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.dialog_root)");
        this.q = findViewById;
        View view = this.q;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view.setOnClickListener(new c(this));
        View findViewById2 = findViewById(C0906R.id.chu);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.root)");
        this.f65087c = findViewById2;
        View view2 = this.f65087c;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDialogContentView");
        }
        view2.setOnClickListener(d.f65100b);
        View findViewById3 = findViewById(C0906R.id.aho);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.for_save_img)");
        this.f65088d = findViewById3;
        View findViewById4 = findViewById(C0906R.id.d3_);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.title2)");
        this.r = (TextView) findViewById4;
        TextView textView = this.r;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitle2");
        }
        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        User curUser = a2.getCurUser();
        Intrinsics.checkExpressionValueIsNotNull(curUser, "AccountUserProxyService.get().curUser");
        textView.setText(curUser.getNickname());
        View findViewById5 = findViewById(C0906R.id.c9n);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.qr_code)");
        this.f65089e = (RemoteImageView) findViewById5;
        View findViewById6 = findViewById(C0906R.id.c9o);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.qr_code2)");
        this.f65090f = (RemoteImageView) findViewById6;
        View findViewById7 = findViewById(C0906R.id.a3v);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.description2)");
        this.s = (TextView) findViewById7;
        b().a(1);
        if (a().c()) {
            this.t = true;
            Uri fromFile = Uri.fromFile(a().d());
            Fresco.getImagePipeline().evictFromCache(fromFile);
            RemoteImageView remoteImageView = this.f65089e;
            if (remoteImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mQrCode");
            }
            remoteImageView.setImageURI(fromFile);
            RemoteImageView remoteImageView2 = this.f65090f;
            if (remoteImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mQrCode2");
            }
            PipelineDraweeControllerBuilder uri = Fresco.newDraweeControllerBuilder().setUri(fromFile);
            RemoteImageView remoteImageView3 = this.f65090f;
            if (remoteImageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mQrCode2");
            }
            remoteImageView2.setController(((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) uri.setOldController(remoteImageView3.getController())).setControllerListener(this.n)).build());
            a.i.a((Callable<TResult>) new e<TResult>(this)).a((a.g<TResult, TContinuationResult>) new f<TResult,TContinuationResult>(this), a.i.f1052b);
        }
        com.ss.android.ugc.aweme.qrcode.d.e a3 = a();
        IAccountUserService a4 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "AccountUserProxyService.get()");
        a3.b(16, a4.getCurUserId());
        b().b(1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, @NotNull String str) {
        super(context, C0906R.style.su);
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "mEnterFrom");
        this.p = str;
        this.g = (Activity) context;
        if (com.ss.android.ugc.aweme.utils.permission.f.c(this.g) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.m = z;
        this.n = new h(this);
        this.u = LazyKt.lazy(new i(this));
        this.v = LazyKt.lazy(new j(this));
        this.w = LazyKt.lazy(new g(this, context));
        this.o = new k(this);
    }
}
