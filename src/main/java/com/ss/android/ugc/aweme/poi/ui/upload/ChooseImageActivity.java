package com.ss.android.ugc.aweme.poi.ui.upload;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.ss.android.ugc.aweme.feed.y;
import com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter;
import com.ss.android.ugc.aweme.views.AutoRTLTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\"\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0014J\b\u0010\u001d\u001a\u00020\u000eH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\b0\nj\b\u0012\u0004\u0012\u00020\b`\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/upload/ChooseImageActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeBaseActivity;", "Lcom/ss/android/ugc/aweme/poi/ui/upload/ChooseImageAdapter$SelectUploadImageListener;", "()V", "mAdapter", "Lcom/ss/android/ugc/aweme/poi/ui/upload/ChooseImageAdapter;", "mFilePathList", "", "", "mSelectedImageFilePathList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "poiId", "finishImmediately", "", "getImageFilePathList", "getLayout", "", "init", "jumpToPreview", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "selectImage", "count", "setStatusBarColor", "showTipDialog", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ChooseImageActivity extends AmeBaseActivity implements ChooseImageAdapter.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60902a;

    /* renamed from: b  reason: collision with root package name */
    ChooseImageAdapter f60903b;

    /* renamed from: c  reason: collision with root package name */
    List<String> f60904c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<String> f60905d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    String f60906e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f60907f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChooseImageActivity f60909b;

        a(ChooseImageActivity chooseImageActivity) {
            this.f60909b = chooseImageActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f60908a, false, 66719, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f60908a, false, 66719, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f60909b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChooseImageActivity f60911b;

        b(ChooseImageActivity chooseImageActivity) {
            this.f60911b = chooseImageActivity;
        }

        /* JADX WARNING: type inference failed for: r6v9, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00fb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r19) {
            /*
                r18 = this;
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r19
                com.meituan.robust.ChangeQuickRedirect r4 = f60910a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<android.view.View> r3 = android.view.View.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 66720(0x104a0, float:9.3495E-41)
                r3 = r18
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0034
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r19
                com.meituan.robust.ChangeQuickRedirect r12 = f60910a
                r13 = 0
                r14 = 66720(0x104a0, float:9.3495E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<android.view.View> r0 = android.view.View.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r18
                com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                return
            L_0x0034:
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r19)
                r0 = r18
                com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity r10 = r0.f60911b
                java.lang.Object[] r2 = new java.lang.Object[r9]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity.f60902a
                r5 = 0
                r6 = 66710(0x10496, float:9.348E-41)
                java.lang.Class[] r7 = new java.lang.Class[r9]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r10
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x005f
                java.lang.Object[] r2 = new java.lang.Object[r9]
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity.f60902a
                r5 = 0
                r6 = 66710(0x10496, float:9.348E-41)
                java.lang.Class[] r7 = new java.lang.Class[r9]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x005f:
                com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter r2 = r10.f60903b
                if (r2 == 0) goto L_0x006c
                java.util.List<java.lang.Integer> r2 = r2.f60917d
                if (r2 == 0) goto L_0x006c
                int r2 = r2.size()
                goto L_0x006d
            L_0x006c:
                r2 = 0
            L_0x006d:
                java.util.ArrayList<java.lang.String> r3 = r10.f60905d
                r3.clear()
                r3 = 0
            L_0x0073:
                if (r3 >= r2) goto L_0x00a0
                java.util.ArrayList<java.lang.String> r4 = r10.f60905d
                java.util.List<java.lang.String> r5 = r10.f60904c
                r6 = 0
                if (r5 == 0) goto L_0x009a
                com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter r7 = r10.f60903b
                if (r7 == 0) goto L_0x008a
                java.util.List<java.lang.Integer> r7 = r7.f60917d
                if (r7 == 0) goto L_0x008a
                java.lang.Object r6 = r7.get(r3)
                java.lang.Integer r6 = (java.lang.Integer) r6
            L_0x008a:
                if (r6 != 0) goto L_0x008f
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x008f:
                int r6 = r6.intValue()
                java.lang.Object r5 = r5.get(r6)
                r6 = r5
                java.lang.String r6 = (java.lang.String) r6
            L_0x009a:
                r4.add(r6)
                int r3 = r3 + 1
                goto L_0x0073
            L_0x00a0:
                java.lang.String r2 = r10.f60906e
                if (r2 != 0) goto L_0x00a6
                java.lang.String r2 = ""
            L_0x00a6:
                com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity$a r3 = com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity.w
                r4 = r10
                android.app.Activity r4 = (android.app.Activity) r4
                java.util.ArrayList<java.lang.String> r5 = r10.f60905d
                r6 = 3
                java.lang.Object[] r11 = new java.lang.Object[r6]
                r11[r9] = r2
                r11[r1] = r4
                r7 = 2
                r11[r7] = r5
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity.a.f60946a
                r14 = 0
                r15 = 66760(0x104c8, float:9.355E-41)
                java.lang.Class[] r8 = new java.lang.Class[r6]
                java.lang.Class<java.lang.String> r10 = java.lang.String.class
                r8[r9] = r10
                java.lang.Class<android.app.Activity> r10 = android.app.Activity.class
                r8[r1] = r10
                java.lang.Class<java.util.ArrayList> r10 = java.util.ArrayList.class
                r8[r7] = r10
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r3
                r16 = r8
                boolean r8 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r8 == 0) goto L_0x00fb
                java.lang.Object[] r11 = new java.lang.Object[r6]
                r11[r9] = r2
                r11[r1] = r4
                r11[r7] = r5
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity.a.f60946a
                r14 = 0
                r15 = 66760(0x104c8, float:9.355E-41)
                java.lang.Class[] r2 = new java.lang.Class[r6]
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r2[r9] = r4
                java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
                r2[r1] = r4
                java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
                r2[r7] = r1
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r3
                r16 = r2
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                return
            L_0x00fb:
                java.lang.String r1 = "poiId"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r1)
                java.lang.String r1 = "activity"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r1)
                java.lang.String r1 = "uriList"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r1)
                android.content.Intent r1 = new android.content.Intent
                r3 = r4
                android.content.Context r3 = (android.content.Context) r3
                java.lang.Class<com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity> r6 = com.ss.android.ugc.aweme.poi.ui.upload.PoiUploadImagePreviewActivity.class
                r1.<init>(r3, r6)
                java.lang.String r3 = "poi_id"
                r1.putExtra(r3, r2)
                java.lang.String r2 = "upload_img_uri_list"
                java.io.Serializable r5 = (java.io.Serializable) r5
                r1.putExtra(r2, r5)
                r2 = 17
                r4.startActivityForResult(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity.b.onClick(android.view.View):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/poi/ui/upload/ChooseImageActivity$init$3", "Lcom/ss/android/ugc/aweme/base/opensourcemodified/android/support/design/widget/ViewPagerBottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends ViewPagerBottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60912a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ChooseImageActivity f60913b;

        public final void a(@NotNull View view, float f2) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2)}, this, f60912a, false, 66722, new Class[]{View.class, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2)}, this, f60912a, false, 66722, new Class[]{View.class, Float.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "bottomSheet");
        }

        c(ChooseImageActivity chooseImageActivity) {
            this.f60913b = chooseImageActivity;
        }

        public final void a(@NotNull View view, int i) {
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i)}, this, f60912a, false, 66721, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i)}, this, f60912a, false, 66721, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(view2, "bottomSheet");
            if (i == 5) {
                this.f60913b.c();
            }
        }
    }

    private View b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60902a, false, 66714, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60902a, false, 66714, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f60907f == null) {
            this.f60907f = new HashMap();
        }
        View view = (View) this.f60907f.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.f60907f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final int a() {
        return C0906R.layout.ao;
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60902a, false, 66716, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60902a, false, 66716, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onCreate", false);
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60902a, false, 66717, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60902a, false, 66717, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60902a, false, 66718, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60902a, false, 66718, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f60902a, false, 66709, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60902a, false, 66709, new Class[0], Void.TYPE);
            return;
        }
        finish();
        overridePendingTransition(0, C0906R.anim.s);
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f60902a, false, 66708, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60902a, false, 66708, new Class[0], Void.TYPE);
            return;
        }
        c();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f60902a, false, 66705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60902a, false, 66705, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> d() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f60902a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r4 = 0
            r5 = 66711(0x10497, float:9.3482E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f60902a
            r5 = 0
            r6 = 66711(0x10497, float:9.3482E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0028:
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.String r1 = "_data"
            r4[r0] = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 128(0x80, float:1.794E-43)
            r1.<init>(r2)
            android.net.Uri r3 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r7 = "date_added DESC"
            r8 = 0
            android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Exception -> 0x0073 }
            r5 = 0
            r6 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0073 }
            if (r2 != 0) goto L_0x0050
            r0 = r1
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            return r0
        L_0x004b:
            r0 = move-exception
            goto L_0x0081
        L_0x004d:
            r0 = move-exception
            r8 = r2
            goto L_0x0074
        L_0x0050:
            if (r2 == 0) goto L_0x005b
            boolean r3 = r2.moveToNext()     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            goto L_0x005c
        L_0x005b:
            r3 = r8
        L_0x005c:
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            if (r3 == 0) goto L_0x006a
            java.lang.String r3 = r2.getString(r0)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            r1.add(r3)     // Catch:{ Exception -> 0x004d, all -> 0x004b }
            goto L_0x0050
        L_0x006a:
            if (r2 == 0) goto L_0x007e
            r2.close()
            goto L_0x007e
        L_0x0070:
            r0 = move-exception
            r2 = r8
            goto L_0x0081
        L_0x0073:
            r0 = move-exception
        L_0x0074:
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0070 }
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0070 }
            if (r8 == 0) goto L_0x007e
            r8.close()
        L_0x007e:
            java.util.List r1 = (java.util.List) r1
            return r1
        L_0x0081:
            if (r2 == 0) goto L_0x0086
            r2.close()
        L_0x0086:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity.d():java.util.List");
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60902a, false, 66706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60902a, false, 66706, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.f60906e = getIntent().getStringExtra("poi_id");
        if (Build.VERSION.SDK_INT >= 19) {
            int statusBarHeight = StatusBarUtils.getStatusBarHeight(this);
            View b2 = b(C0906R.id.cv0);
            Intrinsics.checkExpressionValueIsNotNull(b2, "status_bar");
            b2.getLayoutParams().height = statusBarHeight;
        }
        if (y.d()) {
            if (PatchProxy.isSupport(new Object[0], this, f60902a, false, 66707, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60902a, false, 66707, new Class[0], Void.TYPE);
            } else {
                new d(this).show();
            }
        }
        ((ImageView) b(C0906R.id.ix)).setOnClickListener(new a(this));
        ((AutoRTLTextView) b(C0906R.id.d8x)).setOnClickListener(new b(this));
        ViewPagerBottomSheetBehavior a2 = ViewPagerBottomSheetBehavior.a(findViewById(C0906R.id.a3z));
        a2.l = new c(this);
        Intrinsics.checkExpressionValueIsNotNull(a2, "behavior");
        a2.f34776e = true;
        Context context = this;
        a2.a(p.a(context) + p.d(context));
        RecyclerView recyclerView = (RecyclerView) b(C0906R.id.arc);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "image_grid");
        recyclerView.setLayoutManager(new GridLayoutManager(null, 4));
        ((RecyclerView) b(C0906R.id.arc)).addItemDecoration(new GridSpacingItemDecoration(4, (int) UIUtils.dip2Px(context, 1.0f), false));
        ChooseImageAdapter chooseImageAdapter = new ChooseImageAdapter(context, 4, 1.0d, 1.5f, 0, this);
        this.f60903b = chooseImageAdapter;
        RecyclerView recyclerView2 = (RecyclerView) b(C0906R.id.arc);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "image_grid");
        recyclerView2.setAdapter(this.f60903b);
        this.f60904c.addAll(d());
        ChooseImageAdapter chooseImageAdapter2 = this.f60903b;
        if (chooseImageAdapter2 != null) {
            List<String> list = this.f60904c;
            if (PatchProxy.isSupport(new Object[]{list}, chooseImageAdapter2, ChooseImageAdapter.f60914a, false, 66728, new Class[]{List.class}, Void.TYPE)) {
                ChooseImageAdapter chooseImageAdapter3 = chooseImageAdapter2;
                PatchProxy.accessDispatch(new Object[]{list}, chooseImageAdapter3, ChooseImageAdapter.f60914a, false, 66728, new Class[]{List.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(list, "filePaths");
                chooseImageAdapter2.f60915b.clear();
                chooseImageAdapter2.f60915b.addAll(list);
                int size = chooseImageAdapter2.f60915b.size();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(size)}, chooseImageAdapter2, ChooseImageAdapter.f60914a, false, 66729, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    ChooseImageAdapter chooseImageAdapter4 = chooseImageAdapter2;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(size)}, chooseImageAdapter4, ChooseImageAdapter.f60914a, false, 66729, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    if (chooseImageAdapter2.f60917d == null) {
                        chooseImageAdapter2.f60917d = new ArrayList();
                    } else {
                        List<Integer> list2 = chooseImageAdapter2.f60917d;
                        if (list2 != null) {
                            list2.clear();
                        }
                    }
                    if (chooseImageAdapter2.f60916c == null) {
                        chooseImageAdapter2.f60916c = new ArrayList();
                    } else {
                        List<Integer> list3 = chooseImageAdapter2.f60916c;
                        if (list3 != null) {
                            list3.clear();
                        }
                    }
                    for (int i = 0; i < size; i++) {
                        List<Integer> list4 = chooseImageAdapter2.f60916c;
                        if (list4 != null) {
                            list4.add(-1);
                        }
                    }
                }
                chooseImageAdapter2.notifyDataSetChanged();
            }
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f60902a, false, 66712, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f60902a, false, 66712, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i > 0) {
            AutoRTLTextView autoRTLTextView = (AutoRTLTextView) b(C0906R.id.d8x);
            Intrinsics.checkExpressionValueIsNotNull(autoRTLTextView, "tv_add");
            autoRTLTextView.setVisibility(0);
            AutoRTLTextView autoRTLTextView2 = (AutoRTLTextView) b(C0906R.id.d8x);
            Intrinsics.checkExpressionValueIsNotNull(autoRTLTextView2, "tv_add");
            String string = getString(C0906R.string.bgx);
            Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.next_step_with_count)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            autoRTLTextView2.setText(format);
        } else {
            AutoRTLTextView autoRTLTextView3 = (AutoRTLTextView) b(C0906R.id.d8x);
            Intrinsics.checkExpressionValueIsNotNull(autoRTLTextView3, "tv_add");
            autoRTLTextView3.setVisibility(8);
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f60902a, false, 66713, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f60902a, false, 66713, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 17) {
            finish();
        }
    }
}
