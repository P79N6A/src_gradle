package com.feiliao.oauth.sdk.flipchat.open.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.account.api.call.d;
import com.bytedance.sdk.account.utils.ToastUtils;
import com.feiliao.oauth.sdk.flipchat.open.debug.FlipChatDebug;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0014R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/api/BaseFlipChatAuthActivity;", "Landroid/app/Activity;", "()V", "bind", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "getBind", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "login", "getLogin", "presenter", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthActivityPresenter;", "getPresenter", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthActivityPresenter;", "update", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatUpdateResponse;", "getUpdate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public abstract class a extends Activity {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final c<i> f24273a = new c(this);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final c<d> f24274b = new b(this);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final c<d> f24275c = new C0271a(this);
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final b f24276d = new b(this, this.f24273a, this.f24274b, this.f24275c);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f"}, d2 = {"com/feiliao/oauth/sdk/flipchat/open/api/BaseFlipChatAuthActivity$bind$1", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "onAuthError", "", "errorCode", "", "errorMsg", "", "response", "onAuthResponse", "onFlipChatAuthorizeError", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.feiliao.oauth.sdk.flipchat.open.api.a$a  reason: collision with other inner class name */
    public static final class C0271a implements c<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f24277a;

        C0271a(a aVar) {
            this.f24277a = aVar;
        }

        public final /* synthetic */ void a(Object obj) {
            Intrinsics.checkParameterIsNotNull((d) obj, "response");
            FlipChat.INSTANCE.getDepend().refreshUserInfo();
            this.f24277a.finish();
        }

        public final void a(int i, @Nullable String str) {
            Context context = this.f24277a;
            if (str == null) {
                str = "授权失败";
            }
            ToastUtils.showToast(context, str);
            this.f24277a.finish();
        }

        public final /* synthetic */ void a(int i, String str, Object obj) {
            Intrinsics.checkParameterIsNotNull((d) obj, "response");
            Context context = this.f24277a;
            if (str == null) {
                str = "授权失败";
            }
            ToastUtils.showToast(context, str);
            this.f24277a.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f"}, d2 = {"com/feiliao/oauth/sdk/flipchat/open/api/BaseFlipChatAuthActivity$login$1", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "Lcom/bytedance/sdk/account/api/call/UserApiResponse;", "onAuthError", "", "errorCode", "", "errorMsg", "", "response", "onAuthResponse", "onFlipChatAuthorizeError", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    public static final class b implements c<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f24278a;

        b(a aVar) {
            this.f24278a = aVar;
        }

        public final /* synthetic */ void a(Object obj) {
            Intrinsics.checkParameterIsNotNull((d) obj, "response");
            FlipChat.INSTANCE.getDepend().refreshUserInfo();
            this.f24278a.finish();
        }

        public final void a(int i, @Nullable String str) {
            Context context = this.f24278a;
            if (str == null) {
                str = "授权失败";
            }
            ToastUtils.showToast(context, str);
            this.f24278a.finish();
        }

        public final /* synthetic */ void a(int i, String str, Object obj) {
            Intrinsics.checkParameterIsNotNull((d) obj, "response");
            Context context = this.f24278a;
            if (str == null) {
                str = "授权失败";
            }
            ToastUtils.showToast(context, str);
            this.f24278a.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\f"}, d2 = {"com/feiliao/oauth/sdk/flipchat/open/api/BaseFlipChatAuthActivity$update$1", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatAuthCallback;", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatUpdateResponse;", "onAuthError", "", "errorCode", "", "errorMsg", "", "response", "onAuthResponse", "onFlipChatAuthorizeError", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    public static final class c implements c<i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f24279a;

        c(a aVar) {
            this.f24279a = aVar;
        }

        public final /* synthetic */ void a(Object obj) {
            Intrinsics.checkParameterIsNotNull((i) obj, "response");
            FlipChat.INSTANCE.getDepend().refreshUserInfo();
            this.f24279a.finish();
        }

        public final void a(int i, @Nullable String str) {
            Context context = this.f24279a;
            if (str == null) {
                str = "授权失败";
            }
            ToastUtils.showToast(context, str);
            this.f24279a.finish();
        }

        public final /* synthetic */ void a(int i, String str, Object obj) {
            Intrinsics.checkParameterIsNotNull((i) obj, "response");
            Context context = this.f24279a;
            if (str == null) {
                str = "授权失败";
            }
            ToastUtils.showToast(context, str);
            this.f24279a.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        b bVar = this.f24276d;
        FlipChatPageRequestCallback flipChatPageRequestCallback = d.f24285a;
        if (flipChatPageRequestCallback != null) {
            flipChatPageRequestCallback.onPageComplete();
        }
        d.f24285a = null;
        FlipChatRequestController flipChatRequestController = bVar.f24280a;
        if (flipChatRequestController != null) {
            flipChatRequestController.completeRequest();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0906R.layout.mf);
        b bVar = this.f24276d;
        if (FlipChatDebug.checkDebugChoose()) {
            int intExtra = bVar.f24281b.getIntent().getIntExtra("request_auth_type", 0);
            boolean booleanExtra = bVar.f24281b.getIntent().getBooleanExtra("tobind", false);
            switch (intExtra) {
                case 1:
                    bVar.a();
                    return;
                case 2:
                    bVar.b();
                    return;
                case 3:
                    c<i> cVar = bVar.f24282c;
                    if (cVar != null) {
                        bVar.f24280a = FlipChat.INSTANCE.requestUpdateToken(bVar.f24281b, cVar);
                        break;
                    } else {
                        return;
                    }
                default:
                    if (!booleanExtra) {
                        bVar.a();
                        break;
                    } else {
                        bVar.b();
                        return;
                    }
            }
        }
    }
}
