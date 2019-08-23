package com.ss.android.ugc.aweme.story.shootvideo.record;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.c.i;
import com.ss.android.ugc.aweme.shortvideo.filter.func.RecordFilterModuleImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001aH\u0016J\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001aH\u0016¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordFilterModule;", "Lcom/ss/android/ugc/aweme/shortvideo/filter/func/RecordFilterModuleImpl;", "activity", "Lcom/bytedance/ies/uikit/base/AbsActivity;", "processPresenter", "Lcom/ss/android/medialib/presenter/MediaRecordPresenter;", "videoRecorder", "Lcom/ss/android/ugc/aweme/shortvideo/recorder/VideoRecorder;", "rootLayout", "Landroid/widget/FrameLayout;", "filterAnimationListener", "Lcom/ss/android/ugc/aweme/filter/FilterModule$FilterAnimationListener;", "onVisibilityListener", "Lcom/ss/android/ugc/aweme/filter/FilterModule$OnVisibilityListener;", "onFilterChange", "Lcom/ss/android/ugc/aweme/filter/FilterModule$OnFilterChange;", "shootWaySupplier", "Lcom/ss/android/ugc/aweme/base/fp/compat/SupplierC;", "Lorg/json/JSONObject;", "supplier", "Lcom/ss/android/ugc/aweme/filter/FilterModule$ViewPagerSupplier;", "(Lcom/bytedance/ies/uikit/base/AbsActivity;Lcom/ss/android/medialib/presenter/MediaRecordPresenter;Lcom/ss/android/ugc/aweme/shortvideo/recorder/VideoRecorder;Landroid/widget/FrameLayout;Lcom/ss/android/ugc/aweme/filter/FilterModule$FilterAnimationListener;Lcom/ss/android/ugc/aweme/filter/FilterModule$OnVisibilityListener;Lcom/ss/android/ugc/aweme/filter/FilterModule$OnFilterChange;Lcom/ss/android/ugc/aweme/base/fp/compat/SupplierC;Lcom/ss/android/ugc/aweme/filter/FilterModule$ViewPagerSupplier;)V", "onNativeInitSuccess", "", "setBigEyeLevel", "bigEyeLevel", "", "setReshapeLevel", "reshapeLevel", "setSmoothSkinLevel", "smoothSkinLevel", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryRecordFilterModule extends RecordFilterModuleImpl {
    public static ChangeQuickRedirect q;

    public final void h() {
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, q, false, 85575, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, q, false, 85575, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        i iVar = this.g;
        Intrinsics.checkExpressionValueIsNotNull(iVar, "beautyModule");
        iVar.a(i);
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, q, false, 85573, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, q, false, 85573, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        i iVar = this.g;
        Intrinsics.checkExpressionValueIsNotNull(iVar, "beautyModule");
        iVar.b(i);
    }

    public final void e(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, q, false, 85574, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, q, false, 85574, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        i iVar = this.g;
        Intrinsics.checkExpressionValueIsNotNull(iVar, "beautyModule");
        iVar.e(i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @android.annotation.SuppressLint({"TooManyMethodParam"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StoryRecordFilterModule(@org.jetbrains.annotations.Nullable com.bytedance.ies.uikit.base.AbsActivity r13, @org.jetbrains.annotations.Nullable com.ss.android.medialib.presenter.MediaRecordPresenter r14, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.shortvideo.j.e r15, @org.jetbrains.annotations.Nullable android.widget.FrameLayout r16, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.filter.ac.a r17, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.filter.ac.c r18, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.filter.ac.b r19, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.base.b.a.d<org.json.JSONObject> r20, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.filter.ac.d r21) {
        /*
            r12 = this;
            r10 = r12
            r11 = r15
            com.ss.android.ugc.aweme.shortvideo.j.d r11 = (com.ss.android.ugc.aweme.shortvideo.j.d) r11
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r11
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.shortvideo.c.k r0 = new com.ss.android.ugc.aweme.shortvideo.c.k
            r1 = r14
            r0.<init>(r11, r14)
            com.ss.android.ugc.aweme.shortvideo.c.i r0 = (com.ss.android.ugc.aweme.shortvideo.c.i) r0
            r10.g = r0
            com.ss.android.ugc.aweme.shortvideo.c.i r0 = r10.g
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.record.StoryRecordFilterModule.<init>(com.bytedance.ies.uikit.base.AbsActivity, com.ss.android.medialib.presenter.MediaRecordPresenter, com.ss.android.ugc.aweme.shortvideo.j.e, android.widget.FrameLayout, com.ss.android.ugc.aweme.filter.ac$a, com.ss.android.ugc.aweme.filter.ac$c, com.ss.android.ugc.aweme.filter.ac$b, com.ss.android.ugc.aweme.base.b.a.d, com.ss.android.ugc.aweme.filter.ac$d):void");
    }
}
