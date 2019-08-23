package com.feiliao.oauth.sdk.flipchat.open.api;

import android.app.Activity;
import com.bytedance.sdk.account.api.call.d;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u0014J\u0006\u0010\u001b\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthActivityPresenter;", "", "activity", "Landroid/app/Activity;", "update", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatUpdateResponse;", "login", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "bind", "(Landroid/app/Activity;Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;)V", "getActivity", "()Landroid/app/Activity;", "getBind", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "getLogin", "requestController", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatRequestController;", "getUpdate", "doFlipCatBind", "", "doFlipChatLogin", "doFlipChatUpdate", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "startAction", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    FlipChatRequestController f24280a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Activity f24281b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final c<i> f24282c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final c<d> f24283d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final c<d> f24284e;

    /* access modifiers changed from: package-private */
    public final void a() {
        c<d> cVar = this.f24283d;
        if (cVar != null) {
            this.f24280a = FlipChat.INSTANCE.requestAuthLogin(this.f24281b, cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        c<d> cVar = this.f24284e;
        if (cVar != null) {
            this.f24280a = FlipChat.INSTANCE.requestAuthBind(this.f24281b, cVar);
        }
    }

    public b(@NotNull Activity activity, @Nullable c<i> cVar, @Nullable c<d> cVar2, @Nullable c<d> cVar3) {
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f24281b = activity;
        this.f24282c = cVar;
        this.f24283d = cVar2;
        this.f24284e = cVar3;
    }
}
