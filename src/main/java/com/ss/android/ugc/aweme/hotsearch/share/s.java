package com.ss.android.ugc.aweme.hotsearch.share;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.share.ck;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0006\u0010\u0017\u001a\u00020\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/hotsearch/share/ValentineShareHelper;", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$IActionHandler;", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$OnShareCallback;", "activity", "Landroid/app/Activity;", "hitRankShareStruct", "Lcom/ss/android/ugc/aweme/hotsearch/share/HitRankShareStruct;", "(Landroid/app/Activity;Lcom/ss/android/ugc/aweme/hotsearch/share/HitRankShareStruct;)V", "getActivity", "()Landroid/app/Activity;", "shareDialog", "Lcom/ss/android/ugc/aweme/hotsearch/share/ValentineShareDialog;", "checkStatus", "", "shareType", "", "onAction", "struct", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareStruct;", "onShareComplete", "", "p0", "Lcom/ss/android/ugc/aweme/framework/services/IShareService$ShareResult;", "showShareDialog", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class s implements IShareService.IActionHandler, IShareService.OnShareCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49861a;

    /* renamed from: b  reason: collision with root package name */
    public ValentineShareDialog f49862b = new ValentineShareDialog(this.f49863c, new ck(), this.f49864d);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Activity f49863c;

    /* renamed from: d  reason: collision with root package name */
    private b f49864d;

    public final boolean checkStatus(@Nullable String str) {
        return true;
    }

    public final boolean onAction(@Nullable IShareService.ShareStruct shareStruct, @Nullable String str) {
        return true;
    }

    public final void onShareComplete(@Nullable IShareService.ShareResult shareResult) {
    }

    public s(@NotNull Activity activity, @NotNull b bVar) {
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(bVar, "hitRankShareStruct");
        this.f49863c = activity;
        this.f49864d = bVar;
        this.f49862b.setActionHandler(this);
        this.f49862b.setShareCallback(this);
    }
}
