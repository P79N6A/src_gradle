package com.ss.android.ugc.aweme.filter;

import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.filter.at;
import com.ss.android.ugc.aweme.shortvideo.c.m;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u0013\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010Q\u001a\u00020\b2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020THÖ\u0001J\t\u0010U\u001a\u00020VHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\n\"\u0004\b&\u0010\fR\u001a\u0010'\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\n\"\u0004\b(\u0010\fR\u001a\u0010)\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\n\"\u0004\b*\u0010\fR\u001c\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u00107\u001a\u0004\u0018\u000108X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010=\u001a\u0004\u0018\u00010>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010C\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001c\"\u0004\bE\u0010\u001eR\u001a\u0010F\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\n\"\u0004\bH\u0010\fR\u001c\u0010I\u001a\u0004\u0018\u00010JX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006W"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterParams;", "", "activity", "Landroid/support/v7/app/AppCompatActivity;", "(Landroid/support/v7/app/AppCompatActivity;)V", "getActivity", "()Landroid/support/v7/app/AppCompatActivity;", "chooseDisableFilter", "", "getChooseDisableFilter", "()Z", "setChooseDisableFilter", "(Z)V", "etParams", "Lcom/ss/android/ugc/aweme/shortvideo/model/AVETParameter;", "getEtParams", "()Lcom/ss/android/ugc/aweme/shortvideo/model/AVETParameter;", "setEtParams", "(Lcom/ss/android/ugc/aweme/shortvideo/model/AVETParameter;)V", "faceBeautyParams", "Lcom/ss/android/ugc/aweme/filter/FaceBeautyParams;", "getFaceBeautyParams", "()Lcom/ss/android/ugc/aweme/filter/FaceBeautyParams;", "setFaceBeautyParams", "(Lcom/ss/android/ugc/aweme/filter/FaceBeautyParams;)V", "filterBoxRoot", "Landroid/widget/FrameLayout;", "getFilterBoxRoot", "()Landroid/widget/FrameLayout;", "setFilterBoxRoot", "(Landroid/widget/FrameLayout;)V", "filterTagProcessor", "Lcom/ss/android/ugc/aweme/filter/IFilterTagProcessor;", "getFilterTagProcessor", "()Lcom/ss/android/ugc/aweme/filter/IFilterTagProcessor;", "setFilterTagProcessor", "(Lcom/ss/android/ugc/aweme/filter/IFilterTagProcessor;)V", "isShowBottomTab", "setShowBottomTab", "isShowText", "setShowText", "isSupportTanning", "setSupportTanning", "listenableActivityRegistry", "Lcom/ss/android/ugc/aweme/base/activity/ListenableActivityRegistry;", "getListenableActivityRegistry", "()Lcom/ss/android/ugc/aweme/base/activity/ListenableActivityRegistry;", "setListenableActivityRegistry", "(Lcom/ss/android/ugc/aweme/base/activity/ListenableActivityRegistry;)V", "onFaceViewListener", "Lcom/ss/android/ugc/aweme/filter/IFilterView$OnFaceViewListener;", "getOnFaceViewListener", "()Lcom/ss/android/ugc/aweme/filter/IFilterView$OnFaceViewListener;", "setOnFaceViewListener", "(Lcom/ss/android/ugc/aweme/filter/IFilterView$OnFaceViewListener;)V", "onFilterTabChangeListener", "Lcom/ss/android/ugc/aweme/filter/IFilterView$OnFilterTabChangeListener;", "getOnFilterTabChangeListener", "()Lcom/ss/android/ugc/aweme/filter/IFilterView$OnFilterTabChangeListener;", "setOnFilterTabChangeListener", "(Lcom/ss/android/ugc/aweme/filter/IFilterView$OnFilterTabChangeListener;)V", "onFilterViewListener", "Lcom/ss/android/ugc/aweme/filter/IFilterView$OnFilterViewListener;", "getOnFilterViewListener", "()Lcom/ss/android/ugc/aweme/filter/IFilterView$OnFilterViewListener;", "setOnFilterViewListener", "(Lcom/ss/android/ugc/aweme/filter/IFilterView$OnFilterViewListener;)V", "rootLayout", "getRootLayout", "setRootLayout", "showDisableIcon", "getShowDisableIcon", "setShowDisableIcon", "ulikeBeautyParams", "Lcom/ss/android/ugc/aweme/shortvideo/beauty/UlikeBeautyParams;", "getUlikeBeautyParams", "()Lcom/ss/android/ugc/aweme/shortvideo/beauty/UlikeBeautyParams;", "setUlikeBeautyParams", "(Lcom/ss/android/ugc/aweme/shortvideo/beauty/UlikeBeautyParams;)V", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47475a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f47476b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public FrameLayout f47477c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public at.d f47478d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public e f47479e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public at.b f47480f;
    public boolean g;
    public boolean h;
    public boolean i;
    @NotNull
    public g j;
    @Nullable
    public as k;
    @Nullable
    public at.c l;
    @Nullable
    public m m;
    public boolean n;
    public boolean o;
    @Nullable
    public AVETParameter p;
    @NotNull
    public final AppCompatActivity q;

    public final boolean equals(@Nullable Object obj) {
        if (!PatchProxy.isSupport(new Object[]{obj}, this, f47475a, false, 44326, new Class[]{Object.class}, Boolean.TYPE)) {
            return this == obj || ((obj instanceof ad) && Intrinsics.areEqual((Object) this.q, (Object) ((ad) obj).q));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f47475a, false, 44326, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final int hashCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f47475a, false, 44325, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47475a, false, 44325, new Class[0], Integer.TYPE)).intValue();
        }
        AppCompatActivity appCompatActivity = this.q;
        if (appCompatActivity != null) {
            i2 = appCompatActivity.hashCode();
        }
        return i2;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f47475a, false, 44324, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47475a, false, 44324, new Class[0], String.class);
        }
        return "FilterParams(activity=" + this.q + ")";
    }

    public ad(@NotNull AppCompatActivity appCompatActivity) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        Intrinsics.checkParameterIsNotNull(appCompatActivity2, PushConstants.INTENT_ACTIVITY_NAME);
        this.q = appCompatActivity2;
        g gVar = new g(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095);
        this.j = gVar;
    }
}
