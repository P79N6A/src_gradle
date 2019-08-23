package com.ss.android.ugc.aweme.openauthorize;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import android.support.v4.content.ContextCompat;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.sdk.account.b.c.c;
import com.bytedance.sdk.account.bdplatform.b.c;
import com.bytedance.sdk.account.bdplatform.impl.view.BaseBDAuthorizeActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlinx.coroutines.af;
import kotlinx.coroutines.bd;
import kotlinx.coroutines.bk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 72\u00020\u00012\u00020\u0002:\u00017B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0007H\u0002J\"\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010$\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u0012H\u0016J\u0012\u0010'\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010*\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010-\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0012\u0010.\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010/\u001a\u00020\u0012H\u0016J\b\u00100\u001a\u00020\u0007H\u0016J\u0012\u00101\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0012\u00104\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u0011\u00105\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0002\u00106R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/ss/android/ugc/aweme/openauthorize/AwemeAuthorizedActivity;", "Lcom/bytedance/sdk/account/bdplatform/impl/view/BaseBDAuthorizeActivity;", "Lcom/ss/android/ugc/aweme/openauthorize/IThirdClientKeyProvider;", "()V", "mAppIconBitmap", "Landroid/graphics/drawable/BitmapDrawable;", "mIsUserBanned", "", "mMainHandler", "Landroid/os/Handler;", "mUserAvatarBitmap", "mUserClickBtnToAuthorize", "ttPlatformApi", "Lcom/ss/android/ugc/aweme/openauthorize/platformapi/TTPlatformApi;", "kotlin.jvm.PlatformType", "createDepend", "Lcom/bytedance/sdk/account/bdplatform/api/BDAuthorizePlatformDepend;", "finish", "", "getClientKey", "", "getLoadingProgressBar", "Landroid/graphics/drawable/Drawable;", "handleIntent", "intent", "Landroid/content/Intent;", "eventHandler", "Lcom/bytedance/sdk/account/common/api/BDApiEventHandler;", "initPlatformConfiguration", "Lcom/bytedance/sdk/account/bdplatform/model/BDPlatformConfiguration;", "needBindMobile", "onActivityResult", "requestCode", "", "resultCode", "data", "onAuthLogin", "authInfoResponse", "Lcom/bytedance/sdk/account/bdplatform/model/AuthInfoResponse;", "onCancel", "p0", "Lcom/bytedance/sdk/account/common/model/SendAuth$Response;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onError", "onErrorIntent", "onLoginClick", "onNeedLogin", "onReq", "req", "Lcom/bytedance/sdk/account/common/model/BaseReq;", "onSuccess", "tryForceBindPhone", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AwemeAuthorizedActivity extends BaseBDAuthorizeActivity implements e {
    public static final a Companion = new a((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    private HashMap _$_findViewCache;
    public BitmapDrawable mAppIconBitmap;
    public boolean mIsUserBanned;
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    public BitmapDrawable mUserAvatarBitmap;
    private boolean mUserClickBtnToAuthorize;
    private com.ss.android.ugc.aweme.openauthorize.c.a ttPlatformApi = com.ss.android.ugc.aweme.openauthorize.c.b.a(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/openauthorize/AwemeAuthorizedActivity$Companion;", "", "()V", "AUTH_AUTH_SUCCESS_EVENT_NAME", "", "AUTH_FAILED_VALUE", "AUTH_NOTIFY_EVENT_NAME", "AUTH_SUBMIT_EVENT_NAME", "AUTH_SUCCESS_VALUE", "CHANNEL_KEY", "DELAY_LOGIN_TIME", "", "DESC_TEXT_SIZE", "", "ENTER_FROM", "LOGIN_BUTTON_MARGIN", "", "LOGIN_REQUEST_CODE", "PLATFORM", "TAG", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tH\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/openauthorize/AwemeAuthorizedActivity$initPlatformConfiguration$1", "Lcom/ss/android/ugc/aweme/base/FrescoHelper$Callback;", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "dataSource", "Lcom/facebook/datasource/DataSource;", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58339a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeAuthorizedActivity f58340b;

        public final void a(@Nullable Exception exc) {
        }

        b(AwemeAuthorizedActivity awemeAuthorizedActivity) {
            this.f58340b = awemeAuthorizedActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.Nullable com.facebook.datasource.DataSource<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>> r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f58339a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.facebook.datasource.DataSource> r1 = com.facebook.datasource.DataSource.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 63380(0xf794, float:8.8814E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0032
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f58339a
                r3 = 0
                r4 = 63380(0xf794, float:8.8814E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.facebook.datasource.DataSource> r1 = com.facebook.datasource.DataSource.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0032:
                if (r10 == 0) goto L_0x0043
                java.lang.Object r0 = r10.getResult()
                com.facebook.common.references.CloseableReference r0 = (com.facebook.common.references.CloseableReference) r0
                if (r0 == 0) goto L_0x0043
                java.lang.Object r0 = r0.get()
                com.facebook.imagepipeline.image.CloseableImage r0 = (com.facebook.imagepipeline.image.CloseableImage) r0
                goto L_0x0044
            L_0x0043:
                r0 = 0
            L_0x0044:
                boolean r1 = r0 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap
                if (r1 == 0) goto L_0x0068
                com.facebook.imagepipeline.image.CloseableStaticBitmap r0 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r0
                android.graphics.Bitmap r0 = r0.getUnderlyingBitmap()
                com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity r1 = r9.f58340b
                android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
                com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity r3 = r9.f58340b
                android.content.res.Resources r3 = r3.getResources()
                r2.<init>(r3, r0)
                r1.mUserAvatarBitmap = r2
                com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity r0 = r9.f58340b
                com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity r1 = r9.f58340b
                android.graphics.drawable.BitmapDrawable r1 = r1.mUserAvatarBitmap
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                r0.setUserAvatar(r1)
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity.b.a(com.facebook.datasource.DataSource):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0016J\u001e\u0010\u0007\u001a\u00020\u00032\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\tH\u0016¨\u0006\f"}, d2 = {"com/ss/android/ugc/aweme/openauthorize/AwemeAuthorizedActivity$initPlatformConfiguration$2", "Lcom/ss/android/ugc/aweme/base/FrescoHelper$Callback;", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "dataSource", "Lcom/facebook/datasource/DataSource;", "Lcom/facebook/common/references/CloseableReference;", "Lcom/facebook/imagepipeline/image/CloseableImage;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58341a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeAuthorizedActivity f58342b;

        public final void a(@Nullable Exception exc) {
        }

        c(AwemeAuthorizedActivity awemeAuthorizedActivity) {
            this.f58342b = awemeAuthorizedActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.Nullable com.facebook.datasource.DataSource<com.facebook.common.references.CloseableReference<com.facebook.imagepipeline.image.CloseableImage>> r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f58341a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.facebook.datasource.DataSource> r1 = com.facebook.datasource.DataSource.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 63381(0xf795, float:8.8816E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0032
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f58341a
                r3 = 0
                r4 = 63381(0xf795, float:8.8816E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<com.facebook.datasource.DataSource> r1 = com.facebook.datasource.DataSource.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0032:
                if (r10 == 0) goto L_0x0043
                java.lang.Object r0 = r10.getResult()
                com.facebook.common.references.CloseableReference r0 = (com.facebook.common.references.CloseableReference) r0
                if (r0 == 0) goto L_0x0043
                java.lang.Object r0 = r0.get()
                com.facebook.imagepipeline.image.CloseableImage r0 = (com.facebook.imagepipeline.image.CloseableImage) r0
                goto L_0x0044
            L_0x0043:
                r0 = 0
            L_0x0044:
                boolean r1 = r0 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap
                if (r1 == 0) goto L_0x0068
                com.facebook.imagepipeline.image.CloseableStaticBitmap r0 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r0
                android.graphics.Bitmap r0 = r0.getUnderlyingBitmap()
                com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity r1 = r9.f58342b
                android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
                com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity r3 = r9.f58342b
                android.content.res.Resources r3 = r3.getResources()
                r2.<init>(r3, r0)
                r1.mAppIconBitmap = r2
                com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity r0 = r9.f58342b
                com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity r1 = r9.f58342b
                android.graphics.drawable.BitmapDrawable r1 = r1.mAppIconBitmap
                android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
                r0.setAppIcon(r1)
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity.c.a(com.facebook.datasource.DataSource):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "AwemeAuthorizedActivity.kt", c = {261}, d = "invokeSuspend", e = "com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity$onAuthLogin$1")
    static final class d extends k implements Function2<af, kotlin.coroutines.c<? super Unit>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ com.bytedance.sdk.account.bdplatform.b.b $authInfoResponse;
        Object L$0;
        int label;
        private af p$;
        final /* synthetic */ AwemeAuthorizedActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(AwemeAuthorizedActivity awemeAuthorizedActivity, com.bytedance.sdk.account.bdplatform.b.b bVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.this$0 = awemeAuthorizedActivity;
            this.$authInfoResponse = bVar;
        }

        @NotNull
        public final kotlin.coroutines.c<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.c<?> cVar) {
            if (PatchProxy.isSupport(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 63383, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class)) {
                return (kotlin.coroutines.c) PatchProxy.accessDispatch(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 63383, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
            }
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            d dVar = new d(this.this$0, this.$authInfoResponse, cVar);
            dVar.p$ = (af) obj;
            return dVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            Object obj3 = obj;
            if (PatchProxy.isSupport(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 63384, new Class[]{Object.class, Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 63384, new Class[]{Object.class, Object.class}, Object.class);
            }
            return ((d) create(obj3, (kotlin.coroutines.c) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object obj2;
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 63382, new Class[]{Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 63382, new Class[]{Object.class}, Object.class);
            }
            Object a2 = kotlin.coroutines.a.b.a();
            switch (this.label) {
                case 0:
                    af afVar = this.p$;
                    AwemeAuthorizedActivity awemeAuthorizedActivity = this.this$0;
                    this.L$0 = afVar;
                    this.label = 1;
                    obj2 = awemeAuthorizedActivity.tryForceBindPhone(this);
                    if (obj2 == a2) {
                        return a2;
                    }
                    break;
                case 1:
                    obj2 = obj;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj2).booleanValue()) {
                this.this$0.showView(this.$authInfoResponse);
            } else {
                this.this$0.onLoginResult(-1);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "type", "", "oldUser", "Lcom/ss/android/ugc/aweme/profile/model/User;", "newUser", "extra", "Landroid/os/Bundle;", "onChanged"}, k = 3, mv = {1, 1, 15})
    static final class e implements IAccountUserService.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwemeAuthorizedActivity f58343a;

        e(AwemeAuthorizedActivity awemeAuthorizedActivity) {
            this.f58343a = awemeAuthorizedActivity;
        }

        public final void a(int i, @Nullable User user, @Nullable User user2, @Nullable Bundle bundle) {
            boolean z;
            AwemeAuthorizedActivity awemeAuthorizedActivity = this.f58343a;
            if (i == 8) {
                z = true;
            } else {
                z = false;
            }
            awemeAuthorizedActivity.mIsUserBanned = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58344a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AwemeAuthorizedActivity f58345b;

        f(AwemeAuthorizedActivity awemeAuthorizedActivity) {
            this.f58345b = awemeAuthorizedActivity;
        }

        public final void run() {
            ArrayList arrayList;
            boolean z;
            ArrayList arrayList2;
            boolean z2;
            ArrayList arrayList3;
            if (PatchProxy.isSupport(new Object[0], this, f58344a, false, 63385, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f58344a, false, 63385, new Class[0], Void.TYPE);
                return;
            }
            d dVar = d.f58377d;
            String clientKey = this.f58345b.getClientKey();
            if (clientKey == null) {
                clientKey = "";
            }
            if (PatchProxy.isSupport(new Object[]{clientKey, (byte) 1}, dVar, d.f58374a, false, 63391, new Class[]{String.class, Boolean.TYPE}, ArrayList.class)) {
                Object[] objArr = {clientKey, (byte) 1};
                d dVar2 = dVar;
                arrayList = (ArrayList) PatchProxy.accessDispatch(objArr, dVar2, d.f58374a, false, 63391, new Class[]{String.class, Boolean.TYPE}, ArrayList.class);
            } else {
                Intrinsics.checkParameterIsNotNull(clientKey, "clientKey");
                CharSequence charSequence = clientKey;
                if (charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList2 = new ArrayList();
                } else {
                    arrayList2 = d.f58375b.get(clientKey);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                }
                Intrinsics.checkExpressionValueIsNotNull(arrayList2, "when {\n            clien…)\n            }\n        }");
                if (charSequence.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    d.f58375b.remove(clientKey);
                }
                Collection collection = arrayList2;
                d dVar3 = d.f58377d;
                if (PatchProxy.isSupport(new Object[]{clientKey}, dVar3, d.f58374a, false, 63392, new Class[]{String.class}, ArrayList.class)) {
                    d dVar4 = dVar3;
                    arrayList3 = (ArrayList) PatchProxy.accessDispatch(new Object[]{clientKey}, dVar4, d.f58374a, false, 63392, new Class[]{String.class}, ArrayList.class);
                } else {
                    arrayList3 = new ArrayList();
                }
                CollectionsKt.addAll(collection, (Iterable<? extends T>) arrayList3);
                arrayList = arrayList2;
            }
            AwemeAuthorizeLoginActivity.a(this.f58345b, 2001, arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"tryForceBindPhone", "", "continuation", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "AwemeAuthorizedActivity.kt", c = {272}, d = "tryForceBindPhone", e = "com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity")
    static final class g extends kotlin.coroutines.jvm.internal.d {
        public static ChangeQuickRedirect changeQuickRedirect;
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AwemeAuthorizedActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(AwemeAuthorizedActivity awemeAuthorizedActivity, kotlin.coroutines.c cVar) {
            super(cVar);
            this.this$0 = awemeAuthorizedActivity;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 63386, new Class[]{Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 63386, new Class[]{Object.class}, Object.class);
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.tryForceBindPhone(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "result", "<anonymous parameter 2>", "", "onResult"}, k = 3, mv = {1, 1, 15})
    static final class h implements IAccountService.h {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.c f58347b;

        h(kotlin.coroutines.c cVar) {
            this.f58347b = cVar;
        }

        public final void a(int i, int i2, @Nullable Object obj) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f58346a, false, 63387, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj}, this, f58346a, false, 63387, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
                return;
            }
            kotlin.coroutines.c cVar = this.f58347b;
            if (i2 == 1) {
                z = true;
            }
            cVar.resumeWith(l.m673constructorimpl(Boolean.valueOf(z)));
        }
    }

    public final void _$_clearFindViewByIdCache() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63377, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63377, new Class[0], Void.TYPE);
            return;
        }
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 63376, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 63376, new Class[]{Integer.TYPE}, View.class);
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this._$_findViewCache.put(Integer.valueOf(i), view);
        }
        return view;
    }

    @Nullable
    public final Drawable getLoadingProgressBar() {
        return null;
    }

    public final void onCancel() {
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63378, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63378, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 63379, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 63379, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Nullable
    public final String getClientKey() {
        c.a aVar = this.mLastRequest;
        if (aVar != null) {
            String str = aVar.f22261c;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    @NotNull
    public final com.bytedance.sdk.account.bdplatform.a.b createDepend() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63364, new Class[0], com.bytedance.sdk.account.bdplatform.a.b.class)) {
            return new b(this);
        }
        return (com.bytedance.sdk.account.bdplatform.a.b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63364, new Class[0], com.bytedance.sdk.account.bdplatform.a.b.class);
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63362, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63362, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final boolean onNeedLogin() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63369, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63369, new Class[0], Boolean.TYPE)).booleanValue();
        }
        this.mMainHandler.postDelayed(new f(this), 1500);
        return true;
    }

    private final boolean needBindMobile() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63373, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63373, new Class[0], Boolean.TYPE)).booleanValue();
        }
        com.ss.android.ugc.aweme.openauthorize.a.a aVar = d.f58376c;
        if (aVar != null && aVar.f58355e) {
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            User curUser = a2.getCurUser();
            if (curUser != null) {
                z = curUser.isPhoneBinded();
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (r3 == null) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLoginClick() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 63374(0xf78e, float:8.8806E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            r5 = 0
            r6 = 63374(0xf78e, float:8.8806E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            r0 = 1
            r9.mUserClickBtnToAuthorize = r0
            java.lang.String r0 = "auth_submit"
            com.ss.android.ugc.aweme.app.d.d r1 = new com.ss.android.ugc.aweme.app.d.d
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "native"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "channel"
            com.bytedance.sdk.account.b.c.c$a r3 = r9.mLastRequest
            if (r3 == 0) goto L_0x0041
            java.lang.String r3 = r3.f22261c
            if (r3 != 0) goto L_0x0043
        L_0x0041:
            java.lang.String r3 = ""
        L_0x0043:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "platform"
            java.lang.String r3 = "native_click"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity.onLoginClick():void");
    }

    @NotNull
    public final com.bytedance.sdk.account.bdplatform.b.c initPlatformConfiguration() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63371, new Class[0], com.bytedance.sdk.account.bdplatform.b.c.class)) {
            return (com.bytedance.sdk.account.bdplatform.b.c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63371, new Class[0], com.bytedance.sdk.account.bdplatform.b.c.class);
        }
        Context context = this;
        setAppIcon(ContextCompat.getDrawable(context, 2130839490));
        IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        User curUser = a2.getCurUser();
        Intrinsics.checkExpressionValueIsNotNull(curUser, "AccountUserProxyService.get().curUser");
        com.ss.android.ugc.aweme.base.c.a(curUser.getAvatarMedium(), (c.a) new b(this));
        a aVar = a.f58349b;
        String str = this.mAuthInfoResponse.f22271b;
        Intrinsics.checkExpressionValueIsNotNull(str, "mAuthInfoResponse.clientIcon");
        c.a cVar = new c(this);
        if (PatchProxy.isSupport(new Object[]{str, cVar}, aVar, a.f58348a, false, 63344, new Class[]{String.class, c.a.class}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{str, cVar}, aVar2, a.f58348a, false, 63344, new Class[]{String.class, c.a.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
            Intrinsics.checkParameterIsNotNull(cVar, "callback");
            UrlModel urlModel = new UrlModel();
            urlModel.setUri(str);
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            urlModel.setUrlList(arrayList);
            com.ss.android.ugc.aweme.base.c.a(urlModel, cVar);
        }
        c.a d2 = new c.a().a("#161823").a(false).c("#32343D").g("#32343D").j("#26ffffff").n("#FE2C55").a(ContextCompat.getDrawable(context, 2130840176)).a(13.0f).k("#80FFFFFF").l("#57FFFFFF").b(ContextCompat.getDrawable(context, 2130839492)).c(ContextCompat.getDrawable(context, 2130839493)).b("#E8E8E9").e("#E8E8E9").i("#E8E8E9").m("授权并登录").a(32).b(32).d(this.mAuthInfoResponse.f22270a);
        String format = String.format("%s授权登录", Arrays.copyOf(new Object[]{getString(C0906R.string.ak)}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
        c.a f2 = d2.f(format);
        IAccountUserService a3 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
        User curUser2 = a3.getCurUser();
        Intrinsics.checkExpressionValueIsNotNull(curUser2, "AccountUserProxyService.get().curUser");
        c.a o = f2.h(curUser2.getNickname()).a(this.mAuthInfoResponse.f22272c).o(com.ss.android.ugc.aweme.account.util.f.b());
        IAccountUserService a4 = com.ss.android.ugc.aweme.account.d.a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "AccountUserProxyService.get()");
        User curUser3 = a4.getCurUser();
        Intrinsics.checkExpressionValueIsNotNull(curUser3, "AccountUserProxyService.get().curUser");
        com.bytedance.sdk.account.bdplatform.b.c cVar2 = o.p(curUser3.getUid()).f22280a;
        Intrinsics.checkExpressionValueIsNotNull(cVar2, "BDPlatformConfiguration.…                .create()");
        return cVar2;
    }

    public final void onAuthLogin(@Nullable com.bytedance.sdk.account.bdplatform.b.b bVar) {
        com.bytedance.sdk.account.bdplatform.b.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, changeQuickRedirect, false, 63372, new Class[]{com.bytedance.sdk.account.bdplatform.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, changeQuickRedirect, false, 63372, new Class[]{com.bytedance.sdk.account.bdplatform.b.b.class}, Void.TYPE);
            return;
        }
        bk unused = kotlinx.coroutines.g.a(bd.f83876a, com.ss.android.ugc.aweme.f.a.f43886c, null, new d(this, bVar2, null), 2);
    }

    public final void onCancel(@Nullable c.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, changeQuickRedirect, false, 63367, new Class[]{c.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, changeQuickRedirect, false, 63367, new Class[]{c.b.class}, Void.TYPE);
            return;
        }
        n.a("aweme_authorize_result", com.ss.android.ugc.aweme.app.d.c.a().a("result", "failed").a("reason", "cancel").b());
        c.f58368e.a(c.f58367d, 0, "", getClientKey());
        this.ttPlatformApi.a((com.bytedance.sdk.account.b.c.a) this.mLastRequest, (com.bytedance.sdk.account.b.c.b) bVar);
        finish();
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 63361, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 63361, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity", "onCreate", true);
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.account.d.a().addUserChangeListener(new e(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity", "onCreate", false);
    }

    public final void onErrorIntent(@Nullable Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, changeQuickRedirect, false, 63368, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, changeQuickRedirect, false, 63368, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        n.a("aweme_authorize_result", com.ss.android.ugc.aweme.app.d.c.a().a("result", "failed").a("reason", "errorIntent").b());
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0050, code lost:
        if (r4 == null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReq(@org.jetbrains.annotations.Nullable com.bytedance.sdk.account.b.c.a r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.sdk.account.b.c.a> r3 = com.bytedance.sdk.account.b.c.a.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 63370(0xf78a, float:8.88E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = changeQuickRedirect
            r13 = 0
            r14 = 63370(0xf78a, float:8.88E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.sdk.account.b.c.a> r0 = com.bytedance.sdk.account.b.c.a.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            super.onReq(r18)
            java.lang.String r0 = "auth_notify"
            com.ss.android.ugc.aweme.app.d.d r1 = new com.ss.android.ugc.aweme.app.d.d
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "native"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "channel"
            r3 = r17
            com.bytedance.sdk.account.b.c.c$a r4 = r3.mLastRequest
            if (r4 == 0) goto L_0x0052
            java.lang.String r4 = r4.f22261c
            if (r4 != 0) goto L_0x0054
        L_0x0052:
            java.lang.String r4 = ""
        L_0x0054:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity.onReq(com.bytedance.sdk.account.b.c.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
        if (r3 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a1, code lost:
        if (r2 == null) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(@org.jetbrains.annotations.Nullable com.bytedance.sdk.account.b.c.c.b r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.sdk.account.b.c.c$b> r1 = com.bytedance.sdk.account.b.c.c.b.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 63366(0xf786, float:8.8795E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 63366(0xf786, float:8.8795E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.sdk.account.b.c.c$b> r1 = com.bytedance.sdk.account.b.c.c.b.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            java.lang.String r0 = "aweme_authorize_result"
            com.ss.android.ugc.aweme.app.d.c r1 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r2 = "result"
            java.lang.String r3 = "failed"
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "reason"
            java.lang.String r3 = "sdk error"
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            org.json.JSONObject r1 = r1.b()
            com.ss.android.ugc.aweme.app.n.a((java.lang.String) r0, (org.json.JSONObject) r1)
            if (r10 == 0) goto L_0x005b
            android.os.Bundle r0 = r10.extras
            if (r0 == 0) goto L_0x005b
            java.lang.String r1 = "response_type"
            int r8 = r0.getInt(r1)
        L_0x005b:
            r0 = 3
            if (r8 == r0) goto L_0x0061
            r0 = 2
            if (r8 != r0) goto L_0x0095
        L_0x0061:
            java.lang.String r0 = "auth_success"
            com.ss.android.ugc.aweme.app.d.d r1 = new com.ss.android.ugc.aweme.app.d.d
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "native"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "channel"
            com.bytedance.sdk.account.b.c.c$a r3 = r9.mLastRequest
            if (r3 == 0) goto L_0x007a
            java.lang.String r3 = r3.f22261c
            if (r3 != 0) goto L_0x007c
        L_0x007a:
            java.lang.String r3 = ""
        L_0x007c:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "platform"
            java.lang.String r3 = "native_click"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "status"
            java.lang.String r3 = "0"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
        L_0x0095:
            com.ss.android.ugc.aweme.openauthorize.c$a r0 = com.ss.android.ugc.aweme.openauthorize.c.f58368e
            int r1 = com.ss.android.ugc.aweme.openauthorize.c.f58366c
            if (r10 == 0) goto L_0x009d
            int r8 = r10.errorCode
        L_0x009d:
            if (r10 == 0) goto L_0x00a3
            java.lang.String r2 = r10.errorMsg
            if (r2 != 0) goto L_0x00a5
        L_0x00a3:
            java.lang.String r2 = ""
        L_0x00a5:
            java.lang.String r3 = r9.getClientKey()
            r0.a(r1, r8, r2, r3)
            com.ss.android.ugc.aweme.openauthorize.c.a r0 = r9.ttPlatformApi
            com.bytedance.sdk.account.b.c.c$a r1 = r9.mLastRequest
            com.bytedance.sdk.account.b.c.a r1 = (com.bytedance.sdk.account.b.c.a) r1
            r2 = r10
            com.bytedance.sdk.account.b.c.b r2 = (com.bytedance.sdk.account.b.c.b) r2
            r0.a((com.bytedance.sdk.account.b.c.a) r1, (com.bytedance.sdk.account.b.c.b) r2)
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity.onError(com.bytedance.sdk.account.b.c.c$b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0069, code lost:
        if (r3 == null) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSuccess(@org.jetbrains.annotations.Nullable com.bytedance.sdk.account.b.c.c.b r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.sdk.account.b.c.c$b> r1 = com.bytedance.sdk.account.b.c.c.b.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 63365(0xf785, float:8.8793E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 63365(0xf785, float:8.8793E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.bytedance.sdk.account.b.c.c$b> r1 = com.bytedance.sdk.account.b.c.c.b.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            com.ss.android.ugc.aweme.openauthorize.c$a r0 = com.ss.android.ugc.aweme.openauthorize.c.f58368e
            java.lang.String r1 = ""
            java.lang.String r2 = r9.getClientKey()
            r0.a(r8, r8, r1, r2)
            java.lang.String r0 = "aweme_authorize_result"
            com.ss.android.ugc.aweme.app.d.c r1 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r2 = "result"
            java.lang.String r3 = "success"
            com.ss.android.ugc.aweme.app.d.c r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            org.json.JSONObject r1 = r1.b()
            com.ss.android.ugc.aweme.app.n.a((java.lang.String) r0, (org.json.JSONObject) r1)
            java.lang.String r0 = "auth_success"
            com.ss.android.ugc.aweme.app.d.d r1 = new com.ss.android.ugc.aweme.app.d.d
            r1.<init>()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "native"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "channel"
            com.bytedance.sdk.account.b.c.c$a r3 = r9.mLastRequest
            if (r3 == 0) goto L_0x006b
            java.lang.String r3 = r3.f22261c
            if (r3 != 0) goto L_0x006d
        L_0x006b:
            java.lang.String r3 = ""
        L_0x006d:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "platform"
            java.lang.String r3 = "native_click"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "status"
            java.lang.String r3 = "1"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            com.ss.android.ugc.aweme.openauthorize.c.a r0 = r9.ttPlatformApi
            com.bytedance.sdk.account.b.c.c$a r1 = r9.mLastRequest
            com.bytedance.sdk.account.b.c.a r1 = (com.bytedance.sdk.account.b.c.a) r1
            r2 = r10
            com.bytedance.sdk.account.b.c.b r2 = (com.bytedance.sdk.account.b.c.b) r2
            r0.a((com.bytedance.sdk.account.b.c.a) r1, (com.bytedance.sdk.account.b.c.b) r2)
            r9.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity.onSuccess(com.bytedance.sdk.account.b.c.c$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0084 A[FALL_THROUGH, PHI: r9 
      PHI: (r9v3 java.lang.Object) = (r9v1 java.lang.Object), (r9v7 java.lang.Object) binds: [B:7:0x0022, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object tryForceBindPhone(@org.jetbrains.annotations.NotNull kotlin.coroutines.c<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity.g
            if (r0 == 0) goto L_0x0014
            r0 = r9
            com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity$g r0 = (com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity.g) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L_0x0019
        L_0x0014:
            com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity$g r0 = new com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity$g
            r0.<init>(r8, r9)
        L_0x0019:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.a.b.a()
            int r2 = r0.label
            r3 = 1
            switch(r2) {
                case 0: goto L_0x002d;
                case 1: goto L_0x0084;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x002d:
            boolean r9 = r8.needBindMobile()
            if (r9 == 0) goto L_0x008a
            r0.L$0 = r8
            r0.label = r3
            kotlin.coroutines.g r9 = new kotlin.coroutines.g
            kotlin.coroutines.c r2 = kotlin.coroutines.a.b.a(r0)
            r9.<init>(r2)
            r2 = r9
            kotlin.coroutines.c r2 = (kotlin.coroutines.c) r2
            com.ss.android.ugc.aweme.m r3 = com.ss.android.ugc.aweme.account.c.c()
            r4 = r8
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.String r5 = "authorize_force_bind"
            r6 = 0
            com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity$h r7 = new com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity$h
            r7.<init>(r2)
            com.ss.android.ugc.aweme.IAccountService$h r7 = (com.ss.android.ugc.aweme.IAccountService.h) r7
            r3.bindMobile(r4, r5, r6, r7)
            java.lang.String r2 = "phone_bundling_click"
            com.ss.android.ugc.aweme.app.d.d r3 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = "auth_login"
            com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
            java.lang.String r4 = "channel"
            java.lang.String r5 = r8.getClientKey()
            com.ss.android.ugc.aweme.app.d.d r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r2, (java.util.Map) r3)
            java.lang.Object r9 = r9.a()
            java.lang.Object r2 = kotlin.coroutines.a.b.a()
            if (r9 != r2) goto L_0x0081
            kotlin.coroutines.jvm.internal.g.b(r0)
        L_0x0081:
            if (r9 != r1) goto L_0x0084
            return r1
        L_0x0084:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r3 = r9.booleanValue()
        L_0x008a:
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.openauthorize.AwemeAuthorizedActivity.tryForceBindPhone(kotlin.coroutines.c):java.lang.Object");
    }

    public final boolean handleIntent(@Nullable Intent intent, @Nullable com.bytedance.sdk.account.b.a.a aVar) {
        Intent intent2 = intent;
        com.bytedance.sdk.account.b.a.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{intent2, aVar2}, this, changeQuickRedirect, false, 63363, new Class[]{Intent.class, com.bytedance.sdk.account.b.a.a.class}, Boolean.TYPE)) {
            return this.ttPlatformApi.a(intent2, aVar2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent2, aVar2}, this, changeQuickRedirect, false, 63363, new Class[]{Intent.class, com.bytedance.sdk.account.b.a.a.class}, Boolean.TYPE)).booleanValue();
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, changeQuickRedirect, false, 63375, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, changeQuickRedirect, false, 63375, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 2001) {
            int i3 = -1;
            if (i2 == -1 && !this.mIsUserBanned) {
                i3 = 0;
            }
            onLoginResult(i3);
        }
    }
}
