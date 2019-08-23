package com.ss.android.ugc.aweme.profile.ui;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView;
import com.ss.android.ugc.aweme.profile.ui.widget.PreviewBoxView;
import com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0012\u0010\u001a\u001a\u00020\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/ugc/aweme/profile/ui/CropActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "()V", "mCancel", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mConfirm", "mCoverImage", "Lcom/ss/android/ugc/aweme/profile/ui/widget/PinchImageView;", "mCoverWindow", "Lcom/ss/android/ugc/aweme/profile/ui/widget/PreviewBoxView;", "mCropContainer", "Lcom/ss/android/ugc/aweme/profile/ui/widget/SwitchModeFrameLayout;", "mLoadingDialog", "Lcom/ss/android/ugc/aweme/profile/ui/DmtStatusViewDialog;", "mTitleBar", "Landroid/view/View;", "mWindowRect", "Landroid/graphics/Rect;", "originalBitmap", "Landroid/graphics/Bitmap;", "bindViewById", "", "getCropBitmap", "view", "bitmap", "initView", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "saveToFile", "", "setStaturBarForKitKat", "setStatusBarColor", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CropActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61758a;
    public static final a g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public PinchImageView f61759b;

    /* renamed from: c  reason: collision with root package name */
    public PreviewBoxView f61760c;

    /* renamed from: d  reason: collision with root package name */
    Bitmap f61761d;

    /* renamed from: e  reason: collision with root package name */
    public Rect f61762e;

    /* renamed from: f  reason: collision with root package name */
    public DmtStatusViewDialog f61763f;
    private SwitchModeFrameLayout h;
    private DmtTextView i;
    private DmtTextView j;
    private View k;
    private HashMap l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J6\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004J6\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/ui/CropActivity$Companion;", "", "()V", "CROP_MIN_SIZE", "", "EXTRA_IS_OVAL", "", "EXTRA_ORIGINAL_URL", "EXTRA_RECT_MARGIN", "EXTRA_RECT_RATIO", "gotoCrop", "", "activity", "Landroid/app/Activity;", "originalUrl", "isOval", "", "rectRatio", "", "rectMargin", "requestCode", "fragment", "Landroid/support/v4/app/Fragment;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61764a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(@NotNull Activity activity, @NotNull String str, boolean z, float f2, int i, int i2) {
            Activity activity2 = activity;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{activity2, str2, Byte.valueOf(z ? (byte) 1 : 0), Float.valueOf(f2), Integer.valueOf(i), 10002}, this, f61764a, false, 67930, new Class[]{Activity.class, String.class, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {activity2, str2, Byte.valueOf(z), Float.valueOf(f2), Integer.valueOf(i), 10002};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f61764a, false, 67930, new Class[]{Activity.class, String.class, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
            Intrinsics.checkParameterIsNotNull(str2, "originalUrl");
            Intent intent = new Intent(activity2, CropActivity.class);
            intent.putExtra("original_url", str2);
            intent.putExtra("is_oval", z);
            intent.putExtra("rect_ratio", f2);
            intent.putExtra("rect_margin", i);
            activity2.startActivityForResult(intent, 10002);
        }

        public final void a(@NotNull Fragment fragment, @NotNull String str, boolean z, float f2, int i, int i2) {
            Fragment fragment2 = fragment;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{fragment2, str2, Byte.valueOf(z ? (byte) 1 : 0), Float.valueOf(f2), Integer.valueOf(i), 10002}, this, f61764a, false, 67931, new Class[]{Fragment.class, String.class, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {fragment2, str2, Byte.valueOf(z), Float.valueOf(f2), Integer.valueOf(i), 10002};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f61764a, false, 67931, new Class[]{Fragment.class, String.class, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fragment2, "fragment");
            Intrinsics.checkParameterIsNotNull(str2, "originalUrl");
            Intent intent = new Intent(fragment.getContext(), CropActivity.class);
            intent.putExtra("original_url", str2);
            intent.putExtra("is_oval", z);
            intent.putExtra("rect_ratio", f2);
            intent.putExtra("rect_margin", i);
            fragment2.startActivityForResult(intent, 10002);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61765a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CropActivity f61766b;

        b(CropActivity cropActivity) {
            this.f61766b = cropActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f61765a, false, 67932, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f61765a, false, 67932, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (CropActivity.a(this.f61766b).getPinchMode() == 0) {
                this.f61766b.setResult(0);
                this.f61766b.finish();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61767a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CropActivity f61768b;

        c(CropActivity cropActivity) {
            this.f61768b = cropActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f61767a, false, 67933, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f61767a, false, 67933, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (CropActivity.a(this.f61768b).getPinchMode() == 0) {
                CropActivity.b(this.f61768b).show();
                i.a((Callable<TResult>) new Callable<String>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f61769a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ c f61770b;

                    {
                        this.f61770b = r1;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
                    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: android.graphics.Bitmap} */
                    /* JADX WARNING: Multi-variable type inference failed */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ java.lang.Object call() {
                        /*
                            r15 = this;
                            r0 = 0
                            java.lang.Object[] r1 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r3 = f61769a
                            java.lang.Class[] r6 = new java.lang.Class[r0]
                            java.lang.Class<java.lang.String> r7 = java.lang.String.class
                            r4 = 0
                            r5 = 67934(0x1095e, float:9.5196E-41)
                            r2 = r15
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                            if (r1 == 0) goto L_0x0028
                            java.lang.Object[] r2 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r4 = f61769a
                            r5 = 0
                            r6 = 67934(0x1095e, float:9.5196E-41)
                            java.lang.Class[] r7 = new java.lang.Class[r0]
                            java.lang.Class<java.lang.String> r8 = java.lang.String.class
                            r3 = r15
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                            java.lang.String r0 = (java.lang.String) r0
                            return r0
                        L_0x0028:
                            com.ss.android.ugc.aweme.profile.ui.CropActivity$c r1 = r15.f61770b
                            com.ss.android.ugc.aweme.profile.ui.CropActivity r1 = r1.f61768b
                            java.lang.Object[] r2 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.profile.ui.CropActivity.f61758a
                            r5 = 0
                            r6 = 67925(0x10955, float:9.5183E-41)
                            java.lang.Class[] r7 = new java.lang.Class[r0]
                            java.lang.Class<java.lang.String> r8 = java.lang.String.class
                            r3 = r1
                            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                            if (r2 == 0) goto L_0x0053
                            java.lang.Object[] r2 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.profile.ui.CropActivity.f61758a
                            r5 = 0
                            r6 = 67925(0x10955, float:9.5183E-41)
                            java.lang.Class[] r7 = new java.lang.Class[r0]
                            java.lang.Class<java.lang.String> r8 = java.lang.String.class
                            r3 = r1
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                            java.lang.String r0 = (java.lang.String) r0
                            return r0
                        L_0x0053:
                            java.io.File r9 = com.ss.android.ugc.aweme.profile.d.l.b()
                            com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView r10 = r1.f61759b
                            if (r10 != 0) goto L_0x0060
                            java.lang.String r2 = "mCoverImage"
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
                        L_0x0060:
                            android.graphics.Bitmap r11 = r1.f61761d
                            if (r11 != 0) goto L_0x0069
                            java.lang.String r2 = "originalBitmap"
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
                        L_0x0069:
                            r12 = 2
                            java.lang.Object[] r2 = new java.lang.Object[r12]
                            r2[r0] = r10
                            r13 = 1
                            r2[r13] = r11
                            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.profile.ui.CropActivity.f61758a
                            r5 = 0
                            r6 = 67924(0x10954, float:9.5182E-41)
                            java.lang.Class[] r7 = new java.lang.Class[r12]
                            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView> r3 = com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.class
                            r7[r0] = r3
                            java.lang.Class<android.graphics.Bitmap> r3 = android.graphics.Bitmap.class
                            r7[r13] = r3
                            java.lang.Class<android.graphics.Bitmap> r8 = android.graphics.Bitmap.class
                            r3 = r1
                            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                            r14 = 0
                            if (r2 == 0) goto L_0x00ad
                            java.lang.Object[] r2 = new java.lang.Object[r12]
                            r2[r0] = r10
                            r2[r13] = r11
                            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.profile.ui.CropActivity.f61758a
                            r5 = 0
                            r6 = 67924(0x10954, float:9.5182E-41)
                            java.lang.Class[] r7 = new java.lang.Class[r12]
                            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView> r3 = com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView.class
                            r7[r0] = r3
                            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
                            r7[r13] = r0
                            java.lang.Class<android.graphics.Bitmap> r8 = android.graphics.Bitmap.class
                            r3 = r1
                            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                            r11 = r0
                            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
                            goto L_0x0151
                        L_0x00ad:
                            android.graphics.RectF r2 = r10.a((android.graphics.RectF) r14)
                            android.graphics.Rect r3 = r1.f61762e
                            if (r3 != 0) goto L_0x00b7
                            goto L_0x0151
                        L_0x00b7:
                            android.graphics.Rect r3 = r1.f61762e
                            if (r3 != 0) goto L_0x00be
                            kotlin.jvm.internal.Intrinsics.throwNpe()
                        L_0x00be:
                            int r3 = r3.left
                            float r3 = (float) r3
                            float r4 = r2.left
                            float r3 = r3 - r4
                            float r4 = r2.width()
                            float r3 = r3 / r4
                            int r4 = r11.getWidth()
                            float r4 = (float) r4
                            float r3 = r3 * r4
                            int r3 = (int) r3
                            android.graphics.Rect r4 = r1.f61762e
                            if (r4 != 0) goto L_0x00d8
                            kotlin.jvm.internal.Intrinsics.throwNpe()
                        L_0x00d8:
                            int r4 = r4.top
                            float r4 = (float) r4
                            float r5 = r2.top
                            float r4 = r4 - r5
                            float r5 = r2.height()
                            float r4 = r4 / r5
                            int r5 = r11.getHeight()
                            float r5 = (float) r5
                            float r4 = r4 * r5
                            int r4 = (int) r4
                            android.graphics.Rect r5 = r1.f61762e
                            if (r5 != 0) goto L_0x00f2
                            kotlin.jvm.internal.Intrinsics.throwNpe()
                        L_0x00f2:
                            int r5 = r5.width()
                            float r5 = (float) r5
                            float r6 = r2.width()
                            float r5 = r5 / r6
                            int r6 = r11.getWidth()
                            float r6 = (float) r6
                            float r5 = r5 * r6
                            int r5 = (int) r5
                            android.graphics.Rect r6 = r1.f61762e
                            if (r6 != 0) goto L_0x010b
                            kotlin.jvm.internal.Intrinsics.throwNpe()
                        L_0x010b:
                            int r6 = r6.height()
                            float r6 = (float) r6
                            float r2 = r2.height()
                            float r6 = r6 / r2
                            int r2 = r11.getHeight()
                            float r2 = (float) r2
                            float r6 = r6 * r2
                            int r2 = (int) r6
                            if (r3 >= 0) goto L_0x0120
                            r3 = 0
                        L_0x0120:
                            if (r4 >= 0) goto L_0x0123
                            goto L_0x0124
                        L_0x0123:
                            r0 = r4
                        L_0x0124:
                            int r4 = r11.getWidth()
                            if (r5 <= r4) goto L_0x012e
                            int r5 = r11.getWidth()
                        L_0x012e:
                            int r4 = r11.getHeight()
                            if (r2 <= r4) goto L_0x0138
                            int r2 = r11.getHeight()
                        L_0x0138:
                            r4 = 250(0xfa, float:3.5E-43)
                            if (r5 < r4) goto L_0x0144
                            if (r2 >= r4) goto L_0x013f
                            goto L_0x0144
                        L_0x013f:
                            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r11, r3, r0, r5, r2)
                            goto L_0x0151
                        L_0x0144:
                            com.ss.android.ugc.aweme.profile.ui.CropActivity$d r0 = new com.ss.android.ugc.aweme.profile.ui.CropActivity$d
                            r0.<init>(r1)
                            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
                            java.util.concurrent.Executor r1 = a.i.f1052b
                            a.i.a((java.util.concurrent.Callable<TResult>) r0, (java.util.concurrent.Executor) r1)
                            r11 = r14
                        L_0x0151:
                            if (r11 != 0) goto L_0x0154
                            goto L_0x016c
                        L_0x0154:
                            java.lang.String r0 = "file"
                            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r9, r0)
                            java.lang.String r0 = r9.getParent()
                            java.lang.String r1 = r9.getName()
                            boolean r0 = com.bytedance.common.utility.BitmapUtils.saveBitmapToSD(r11, r0, r1)
                            if (r0 == 0) goto L_0x016c
                            java.lang.String r0 = r9.getAbsolutePath()
                            return r0
                        L_0x016c:
                            return r14
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.CropActivity.c.AnonymousClass1.call():java.lang.Object");
                    }
                }).a((a.g<TResult, TContinuationResult>) new a.g<String, Void>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f61771a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ c f61772b;

                    {
                        this.f61772b = r1;
                    }

                    public final /* synthetic */ Object then(i iVar) {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f61771a, false, 67935, new Class[]{i.class}, Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f61771a, false, 67935, new Class[]{i.class}, Void.class);
                        }
                        CropActivity.b(this.f61772b.f61768b).dismiss();
                        Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
                        if (iVar.b() && !TextUtils.isEmpty((CharSequence) iVar.e())) {
                            Intent intent = new Intent();
                            intent.setData(Uri.fromFile(new File((String) iVar.e())));
                            this.f61772b.f61768b.setResult(-1, intent);
                            this.f61772b.f61768b.finish();
                        }
                        return null;
                    }
                }, i.f1052b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class d<V> implements Callable<Unit> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61773a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CropActivity f61774b;

        d(CropActivity cropActivity) {
            this.f61774b = cropActivity;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f61773a, false, 67936, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61773a, false, 67936, new Class[0], Void.TYPE);
            } else {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.f61774b, (int) C0906R.string.bmr).a();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\n¢\u0006\u0002\b\u000e"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "<anonymous parameter 3>", "<anonymous parameter 4>", "<anonymous parameter 5>", "<anonymous parameter 6>", "<anonymous parameter 7>", "<anonymous parameter 8>", "onLayoutChange"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CropActivity f61776b;

        e(CropActivity cropActivity) {
            this.f61776b = cropActivity;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f61775a, false, 67937, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f61775a, false, 67937, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f61776b.f61762e == null) {
                this.f61776b.f61762e = CropActivity.c(this.f61776b).getVisibleRect();
                CropActivity.a(this.f61776b).setDisplayWindowRect(this.f61776b.f61762e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/profile/ui/CropActivity$initView$2", "Lcom/ss/android/ugc/aweme/profile/ui/widget/SwitchModeFrameLayout$SimpleTouchEventIntercepter;", "onInterceptTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f extends SwitchModeFrameLayout.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61777a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CropActivity f61778b;

        f(CropActivity cropActivity) {
            this.f61778b = cropActivity;
        }

        public final void a(@Nullable MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f61777a, false, 67938, new Class[]{MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f61777a, false, 67938, new Class[]{MotionEvent.class}, Void.TYPE);
            } else if (motionEvent == null || motionEvent.getAction() != 0) {
                if (motionEvent != null && motionEvent.getAction() == 1) {
                    if (this.f61778b.f61762e == null) {
                        this.f61778b.f61762e = CropActivity.c(this.f61778b).getVisibleRect();
                    }
                    CropActivity.c(this.f61778b).a();
                }
            } else {
                CropActivity.c(this.f61778b).b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CropActivity f61780b;

        g(CropActivity cropActivity) {
            this.f61780b = cropActivity;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f61779a, false, 67939, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61779a, false, 67939, new Class[0], Void.TYPE);
                return;
            }
            CropActivity.c(this.f61780b).a();
        }
    }

    private View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61758a, false, 67926, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61758a, false, 67926, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.l == null) {
            this.l = new HashMap();
        }
        View view = (View) this.l.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.l.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f61758a, false, 67928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61758a, false, 67928, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61758a, false, 67929, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61758a, false, 67929, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f61758a, false, 67921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61758a, false, 67921, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public static final /* synthetic */ PinchImageView a(CropActivity cropActivity) {
        PinchImageView pinchImageView = cropActivity.f61759b;
        if (pinchImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverImage");
        }
        return pinchImageView;
    }

    public static final /* synthetic */ DmtStatusViewDialog b(CropActivity cropActivity) {
        DmtStatusViewDialog dmtStatusViewDialog = cropActivity.f61763f;
        if (dmtStatusViewDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLoadingDialog");
        }
        return dmtStatusViewDialog;
    }

    public static final /* synthetic */ PreviewBoxView c(CropActivity cropActivity) {
        PreviewBoxView previewBoxView = cropActivity.f61760c;
        if (previewBoxView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoverWindow");
        }
        return previewBoxView;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f61758a, false, 67919, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f61758a, false, 67919, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.db);
        if (PatchProxy.isSupport(new Object[0], this, f61758a, false, 67920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61758a, false, 67920, new Class[0], Void.TYPE);
        } else {
            SwitchModeFrameLayout switchModeFrameLayout = (SwitchModeFrameLayout) a((int) C0906R.id.a1n);
            Intrinsics.checkExpressionValueIsNotNull(switchModeFrameLayout, "crop_container");
            this.h = switchModeFrameLayout;
            PinchImageView pinchImageView = (PinchImageView) a((int) C0906R.id.b08);
            Intrinsics.checkExpressionValueIsNotNull(pinchImageView, "iv_cover");
            this.f61759b = pinchImageView;
            PreviewBoxView previewBoxView = (PreviewBoxView) a((int) C0906R.id.b0b);
            Intrinsics.checkExpressionValueIsNotNull(previewBoxView, "iv_cover_window");
            this.f61760c = previewBoxView;
            DmtTextView dmtTextView = (DmtTextView) a((int) C0906R.id.d9v);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "tv_cancel");
            this.i = dmtTextView;
            DmtTextView dmtTextView2 = (DmtTextView) a((int) C0906R.id.d_u);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "tv_confirm");
            this.j = dmtTextView2;
            TextTitleBar textTitleBar = (TextTitleBar) a((int) C0906R.id.d3m);
            Intrinsics.checkExpressionValueIsNotNull(textTitleBar, "title_bar");
            this.k = textTitleBar;
            boolean booleanExtra = getIntent().getBooleanExtra("is_oval", false);
            PreviewBoxView previewBoxView2 = this.f61760c;
            if (previewBoxView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCoverWindow");
            }
            previewBoxView2.a(booleanExtra ? 1 : 0).a(getIntent().getFloatExtra("rect_ratio", 1.0f)).b(getIntent().getIntExtra("rect_margin", 0));
            DmtTextView dmtTextView3 = this.i;
            if (dmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCancel");
            }
            dmtTextView3.setOnClickListener(new b(this));
            this.f61763f = new DmtStatusViewDialog(this);
            DmtTextView dmtTextView4 = this.j;
            if (dmtTextView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfirm");
            }
            dmtTextView4.setOnClickListener(new c(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f61758a, false, 67923, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61758a, false, 67923, new Class[0], Void.TYPE);
        } else {
            String stringExtra = getIntent().getStringExtra("original_url");
            if (TextUtils.isEmpty(stringExtra)) {
                finish();
                setResult(0);
            } else {
                int readPictureDegree = BitmapUtils.readPictureDegree(stringExtra);
                Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(stringExtra, 1080, 1080);
                if (bitmapFromSD == null) {
                    finish();
                    setResult(0);
                } else {
                    Bitmap rotateBitmap = BitmapUtils.rotateBitmap(bitmapFromSD, readPictureDegree);
                    Intrinsics.checkExpressionValueIsNotNull(rotateBitmap, "BitmapUtils.rotateBitmap(bitmap, degree)");
                    this.f61761d = rotateBitmap;
                    PinchImageView pinchImageView2 = this.f61759b;
                    if (pinchImageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCoverImage");
                    }
                    Bitmap bitmap = this.f61761d;
                    if (bitmap == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("originalBitmap");
                    }
                    pinchImageView2.setImageBitmap(bitmap);
                    PreviewBoxView previewBoxView3 = this.f61760c;
                    if (previewBoxView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCoverWindow");
                    }
                    previewBoxView3.addOnLayoutChangeListener(new e(this));
                    SwitchModeFrameLayout switchModeFrameLayout2 = this.h;
                    if (switchModeFrameLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCropContainer");
                    }
                    switchModeFrameLayout2.setIntercepter(new f(this));
                    PreviewBoxView previewBoxView4 = this.f61760c;
                    if (previewBoxView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCoverWindow");
                    }
                    previewBoxView4.postDelayed(new g(this), 1000);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f61758a, false, 67922, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61758a, false, 67922, new Class[0], Void.TYPE);
        } else if (Build.VERSION.SDK_INT >= 19) {
            int statusBarHeight = StatusBarUtils.getStatusBarHeight(this);
            View view = this.k;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = statusBarHeight;
                View view2 = this.k;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
                }
                view2.requestLayout();
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onCreate", false);
    }
}
