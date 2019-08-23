package com.ss.android.ugc.aweme.filter;

import android.support.v7.app.AppCompatActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0006"}, d2 = {"getTabName", "", "activity", "Landroid/support/v7/app/AppCompatActivity;", "triggerLoginIfNeeded", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47633a;

    @NotNull
    public static final String a(@NotNull AppCompatActivity appCompatActivity) {
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        if (PatchProxy.isSupport(new Object[]{appCompatActivity2}, null, f47633a, true, 44113, new Class[]{AppCompatActivity.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{appCompatActivity2}, null, f47633a, true, 44113, new Class[]{AppCompatActivity.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(appCompatActivity2, PushConstants.INTENT_ACTIVITY_NAME);
        String string = appCompatActivity.getResources().getString(C0906R.string.ik);
        Intrinsics.checkExpressionValueIsNotNull(string, "activity.resources.getSt…g(R.string.av_filter_box)");
        return string;
    }
}
