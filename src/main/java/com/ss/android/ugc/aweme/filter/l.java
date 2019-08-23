package com.ss.android.ugc.aweme.filter;

import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.google.common.collect.ay;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u0002H\u00100\u000e\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxDependencyImpl;", "Lcom/ss/android/ugc/aweme/filter/FilterBoxDependency;", "filterView", "Lcom/ss/android/ugc/aweme/filter/FilterViewImpl;", "(Lcom/ss/android/ugc/aweme/filter/FilterViewImpl;)V", "buildTabView", "Landroid/view/View;", "activity", "Landroid/support/v7/app/AppCompatActivity;", "getTabName", "", "makeDefaultFilterBean", "Lcom/ss/android/ugc/aweme/filter/FilterBean;", "makeListMultimap", "Lcom/google/common/collect/ListMultimap;", "K", "V", "setFilter", "", "filter", "triggerLoginIfNeeded", "", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class l implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47634a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f47635b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final FilterViewImpl f47636c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/FilterBoxDependencyImpl$Companion;", "", "()V", "create", "Lcom/ss/android/ugc/aweme/filter/FilterBoxDependencyImpl;", "filterView", "Lcom/ss/android/ugc/aweme/filter/FilterViewImpl;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47637a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @NotNull
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f47634a, false, 44114, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47634a, false, 44114, new Class[0], String.class);
        }
        AppCompatActivity appCompatActivity = this.f47636c.f3238b;
        Intrinsics.checkExpressionValueIsNotNull(appCompatActivity, "filterView.activity");
        return k.a(appCompatActivity);
    }

    @NotNull
    public final <K, V> ay<K, V> d() {
        if (PatchProxy.isSupport(new Object[0], this, f47634a, false, 44119, new Class[0], ay.class)) {
            return (ay) PatchProxy.accessDispatch(new Object[0], this, f47634a, false, 44119, new Class[0], ay.class);
        }
        ay<K, V> c2 = an.c();
        Intrinsics.checkExpressionValueIsNotNull(c2, "FilterSources.makeMultimap()");
        return c2;
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f47634a, false, 44116, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47634a, false, 44116, new Class[0], Boolean.TYPE)).booleanValue();
        }
        AppCompatActivity appCompatActivity = this.f47636c.f3238b;
        Intrinsics.checkExpressionValueIsNotNull(appCompatActivity, "filterView.activity");
        if (PatchProxy.isSupport(new Object[]{appCompatActivity}, null, k.f47633a, true, 44112, new Class[]{AppCompatActivity.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{appCompatActivity}, null, k.f47633a, true, 44112, new Class[]{AppCompatActivity.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(appCompatActivity, PushConstants.INTENT_ACTIVITY_NAME);
        return false;
    }

    @NotNull
    public final h c() {
        if (PatchProxy.isSupport(new Object[0], this, f47634a, false, 44118, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f47634a, false, 44118, new Class[0], h.class);
        }
        an d2 = com.ss.android.ugc.aweme.port.in.a.d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "AVEnv.getFilterSources()");
        MutableLiveData<List<h>> a2 = d2.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AVEnv.getFilterSources().preparedFilterSources");
        List list = (List) a2.getValue();
        if (list != null && !list.isEmpty()) {
            return (h) list.get(0);
        }
        h a3 = y.a();
        AppCompatActivity appCompatActivity = this.f47636c.f3238b;
        Intrinsics.checkExpressionValueIsNotNull(appCompatActivity, "filterView.activity");
        a3.f47599c = appCompatActivity.getResources().getStringArray(C0906R.array.v)[0];
        Intrinsics.checkExpressionValueIsNotNull(a3, "FilterHelperCopy.makeNor…er_name)[0]\n            }");
        return a3;
    }

    public l(@NotNull FilterViewImpl filterViewImpl) {
        Intrinsics.checkParameterIsNotNull(filterViewImpl, "filterView");
        this.f47636c = filterViewImpl;
    }

    public final void a(@NotNull h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f47634a, false, 44115, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f47634a, false, 44115, new Class[]{h.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hVar, "filter");
        if (this.f47636c.f3238b != null) {
            FilterViewModel.a(this.f47636c.f3238b, hVar);
        }
    }

    @NotNull
    public final View a(@NotNull AppCompatActivity appCompatActivity) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        if (PatchProxy.isSupport(new Object[]{appCompatActivity2}, this, f47634a, false, 44117, new Class[]{AppCompatActivity.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{appCompatActivity2}, this, f47634a, false, 44117, new Class[]{AppCompatActivity.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(appCompatActivity2, PushConstants.INTENT_ACTIVITY_NAME);
        Context context = appCompatActivity2;
        FrameLayout frameLayout = new FrameLayout(context);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = new AVDmtHorizontalImageTextLayout(context, null, 0, 6, null);
        AppCompatActivity appCompatActivity3 = this.f47636c.f3238b;
        Intrinsics.checkExpressionValueIsNotNull(appCompatActivity3, "filterView.activity");
        aVDmtHorizontalImageTextLayout.setText(k.a(appCompatActivity3));
        aVDmtHorizontalImageTextLayout.setTextSize(15);
        aVDmtHorizontalImageTextLayout.setGravity(17);
        if (com.ss.android.g.a.a()) {
            if (PatchProxy.isSupport(new Object[0], aVDmtHorizontalImageTextLayout, AVDmtHorizontalImageTextLayout.f74546a, false, 86757, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVDmtHorizontalImageTextLayout, AVDmtHorizontalImageTextLayout.f74546a, false, 86757, new Class[0], Void.TYPE);
            } else {
                AVDmtTextView aVDmtTextView = aVDmtHorizontalImageTextLayout.f74547b;
                if (aVDmtTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("avDmtTextView");
                }
                aVDmtTextView.a();
            }
        }
        aVDmtHorizontalImageTextLayout.setImageRes(2130839579);
        aVDmtHorizontalImageTextLayout.setPadding(0, 0, (int) UIUtils.dip2Px(aVDmtHorizontalImageTextLayout.getContext(), 12.0f), 0);
        frameLayout.addView(aVDmtHorizontalImageTextLayout, new FrameLayout.LayoutParams(-2, -2, 17));
        return frameLayout;
    }
}
