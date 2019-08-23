package com.feiliao.oauth.sdk.flipchat.open.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.bytedance.sdk.account.b.c.c;
import com.feiliao.oauth.sdk.flipchat.open.a.e;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChat;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatRequestController;
import com.feiliao.oauth.sdk.flipchat.open.b.j;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0004YZ[\\B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010;\u001a\u00020<J\u0010\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u001eH\u0016J\b\u0010?\u001a\u00020<H\u0016J\b\u0010@\u001a\u00020<H\u0016J\b\u0010A\u001a\u00020<H\u0016J\u0012\u0010B\u001a\u00020<2\b\u0010C\u001a\u0004\u0018\u00010DH\u0014J\b\u0010E\u001a\u00020<H\u0014J\u0012\u0010F\u001a\u00020<2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0012\u0010I\u001a\u00020<2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u0012\u0010L\u001a\u00020<2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\b\u0010O\u001a\u00020<H\u0014J\"\u0010P\u001a\u00020<2\u0006\u0010Q\u001a\u00020\u001e2\b\u0010R\u001a\u0004\u0018\u00010\u001e2\u0006\u0010S\u001a\u00020TH\u0016J\u0018\u0010U\u001a\u00020<2\u0006\u0010J\u001a\u00020\u00182\u0006\u0010M\u001a\u00020NH\u0016J\u0010\u0010V\u001a\u00020<2\u0006\u0010J\u001a\u00020\u0018H\u0016J\u0006\u0010W\u001a\u00020<J\u0006\u0010X\u001a\u00020<R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010 \"\u0004\b+\u0010\"R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R\u001c\u00105\u001a\u0004\u0018\u000106X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006]"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/BaseFlipChatWebAuthorizeActivity;", "Landroid/app/Activity;", "Lcom/bytedance/sdk/account/common/api/BDApiEventHandler;", "()V", "disposable", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteDisposable;", "getDisposable$flipchat_open_sdk_release", "()Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteDisposable;", "setDisposable$flipchat_open_sdk_release", "(Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteDisposable;)V", "isAttachWindow", "", "()Z", "setAttachWindow", "(Z)V", "isGetToken", "setGetToken", "loadingController", "Lcom/feiliao/oauth/sdk/flipchat/open/impl/view/LoadingController;", "getLoadingController", "()Lcom/feiliao/oauth/sdk/flipchat/open/impl/view/LoadingController;", "setLoadingController", "(Lcom/feiliao/oauth/sdk/flipchat/open/impl/view/LoadingController;)V", "mAuthRequest", "Lcom/bytedance/sdk/account/common/model/SendAuth$Request;", "getMAuthRequest", "()Lcom/bytedance/sdk/account/common/model/SendAuth$Request;", "setMAuthRequest", "(Lcom/bytedance/sdk/account/common/model/SendAuth$Request;)V", "mobile", "", "getMobile", "()Ljava/lang/String;", "setMobile", "(Ljava/lang/String;)V", "openApi", "Lcom/feiliao/oauth/sdk/open/api/RocketOpenApi;", "getOpenApi", "()Lcom/feiliao/oauth/sdk/open/api/RocketOpenApi;", "setOpenApi", "(Lcom/feiliao/oauth/sdk/open/api/RocketOpenApi;)V", "silentToken", "getSilentToken", "setSilentToken", "title", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "setTitle", "(Landroid/widget/TextView;)V", "titleLeft", "getTitleLeft", "setTitleLeft", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "setWebView", "(Landroid/webkit/WebView;)V", "checkMobile", "", "handleRedirect", "url", "initView", "onAttachedToWindow", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onErrorIntent", "intent", "Landroid/content/Intent;", "onReq", "req", "Lcom/bytedance/sdk/account/common/model/BaseReq;", "onResp", "resp", "Lcom/bytedance/sdk/account/common/model/BaseResp;", "onStop", "redirectToClientApp", "code", "state", "errorCode", "", "sendInnerResponse", "start", "tryDismissDialog", "tryLoadUrls", "AuthWebChromeClient", "AuthWebViewClient", "Companion", "PreloadWebViewClientClient", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public class a extends Activity implements com.bytedance.sdk.account.b.a.a {
    public static final c l = new c((byte) 0);
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public WebView f24317a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public com.feiliao.oauth.sdk.a.a.b f24318b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public TextView f24319c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public TextView f24320d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public com.feiliao.oauth.sdk.flipchat.open.b.f f24321e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f24322f;
    @Nullable
    public String g;
    @Nullable
    public com.feiliao.oauth.sdk.flipchat.open.impl.a.a h;
    @Nullable
    public c.a i;
    public boolean j;
    public boolean k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/BaseFlipChatWebAuthorizeActivity$AuthWebChromeClient;", "Landroid/webkit/WebChromeClient;", "(Lcom/feiliao/oauth/sdk/flipchat/open/impl/BaseFlipChatWebAuthorizeActivity;)V", "onProgressChanged", "", "view", "Landroid/webkit/WebView;", "newProgress", "", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    /* renamed from: com.feiliao.oauth.sdk.flipchat.open.impl.a$a  reason: collision with other inner class name */
    public final class C0272a extends WebChromeClient {
        public final void onProgressChanged(@NotNull WebView webView, int i) {
            Intrinsics.checkParameterIsNotNull(webView, "view");
        }

        public C0272a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/BaseFlipChatWebAuthorizeActivity$AuthWebViewClient;", "Landroid/webkit/WebViewClient;", "(Lcom/feiliao/oauth/sdk/flipchat/open/impl/BaseFlipChatWebAuthorizeActivity;)V", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    public final class b extends WebViewClient {
        public b() {
        }

        public final boolean shouldOverrideUrlLoading(@NotNull WebView webView, @NotNull String str) {
            Intrinsics.checkParameterIsNotNull(webView, "view");
            Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
            if (a.this.a(str)) {
                return true;
            }
            com.bytedance.sdk.account.utils.d.a(a.this);
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0003J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0012"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/BaseFlipChatWebAuthorizeActivity$Companion;", "", "()V", "loadHelp", "", "webView", "Landroid/webkit/WebView;", "req", "Lcom/bytedance/sdk/account/common/model/SendAuth$Request;", "mobile", "", "silentToken", "preload", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatRequestController;", "context", "Landroid/content/Context;", "preloadH5AuthorizePage", "tryPreloadH5AuthorizePage", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    public static final class c {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/feiliao/oauth/sdk/flipchat/open/impl/BaseFlipChatWebAuthorizeActivity$Companion$preload$1", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatRequestController;", "completeRequest", "", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
        /* renamed from: com.feiliao.oauth.sdk.flipchat.open.impl.a$c$a  reason: collision with other inner class name */
        public static final class C0274a implements FlipChatRequestController {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WebView f24333a;

            public final void completeRequest() {
                this.f24333a.destroy();
            }

            C0274a(WebView webView) {
                this.f24333a = webView;
            }
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final FlipChatRequestController a(@NotNull Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            com.feiliao.oauth.sdk.a.b.a.a(context);
            c.a aVar = new c.a();
            aVar.f22263e = "user_info,friend_relation,message";
            aVar.f22259a = "xx";
            return a(context, aVar);
        }

        @JvmStatic
        private FlipChatRequestController a(Context context, c.a aVar) {
            WebView webView = new WebView(context);
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(true);
            }
            webView.setWebViewClient(new d());
            a(webView, aVar, null, null);
            return new C0274a(webView);
        }

        @JvmStatic
        public static void a(@Nullable WebView webView, @NotNull c.a aVar, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkParameterIsNotNull(aVar, "req");
            Uri.Builder appendQueryParameter = Uri.parse("https://api.feiliao.com/ferocket/authorization/").buildUpon().appendQueryParameter("redirect_uri", aVar.f22260b).appendQueryParameter("state", aVar.f22259a).appendQueryParameter("scope", aVar.f22263e).appendQueryParameter("response_type", "code").appendQueryParameter("client_key", aVar.f22261c).appendQueryParameter("appid", h.a().f24287a).appendQueryParameter("override_loading", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            if (str != null) {
                appendQueryParameter.appendQueryParameter("mobile", str);
            }
            if (str2 != null) {
                appendQueryParameter.appendQueryParameter("silentToken", str2);
            }
            Bundle bundle = aVar.extras;
            if (bundle != null) {
                String string = bundle.getString("flipchat_auth_request_from");
                if (string != null) {
                    appendQueryParameter.appendQueryParameter("flipchat_auth_request_from", string);
                }
            }
            Bundle bundle2 = aVar.extras;
            if (bundle2 != null) {
                Bundle bundle3 = bundle2.getBundle("flipchat_auth_h5_params");
                if (bundle3 != null) {
                    Set<String> keySet = bundle3.keySet();
                    if (keySet != null) {
                        for (String str3 : keySet) {
                            appendQueryParameter.appendQueryParameter(str3, bundle3.getString(str3));
                        }
                    }
                }
            }
            String uri = appendQueryParameter.build().toString();
            Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(\"https://api.f…              .toString()");
            if (webView != null) {
                b.a(webView, uri);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/BaseFlipChatWebAuthorizeActivity$PreloadWebViewClientClient;", "Landroid/webkit/WebViewClient;", "()V", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    public static final class d extends WebViewClient {
        public final boolean shouldOverrideUrlLoading(@NotNull WebView webView, @Nullable String str) {
            Intrinsics.checkParameterIsNotNull(webView, "view");
            if (str != null) {
                SharedPreferences sharedPreferences = null;
                if (StringsKt.startsWith$default(str, "bytedance://rloadingfinished", false, 2, null)) {
                    Context context = webView.getContext();
                    if (context != null) {
                        sharedPreferences = com.ss.android.ugc.aweme.q.c.a(context, "flipchat_open_config", 0);
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        if (edit != null) {
                            SharedPreferences.Editor putLong = edit.putLong("finish_h5_auth", System.currentTimeMillis());
                            if (putLong != null) {
                                putLong.apply();
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/feiliao/oauth/sdk/flipchat/open/rx/LiteSingle;", "Lcom/feiliao/oauth/sdk/flipchat/open/model/GetSilentTokenResponse;", "it", "Lcom/feiliao/oauth/sdk/flipchat/open/model/CanSilentRegisterResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class e extends Lambda implements Function1<com.feiliao.oauth.sdk.flipchat.open.a.b, j<com.feiliao.oauth.sdk.flipchat.open.a.e>> {
        public static final e INSTANCE = new e();

        e() {
            super(1);
        }

        @NotNull
        public final j<com.feiliao.oauth.sdk.flipchat.open.a.e> invoke(@NotNull com.feiliao.oauth.sdk.flipchat.open.a.b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
            if (bVar.b()) {
                return i.f24352b.c();
            }
            throw new com.feiliao.oauth.sdk.flipchat.open.api.f(-1, "网络异常");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/feiliao/oauth/sdk/flipchat/open/model/GetSilentTokenResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class f extends Lambda implements Function1<com.feiliao.oauth.sdk.flipchat.open.a.e, Unit> {
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.feiliao.oauth.sdk.flipchat.open.a.e) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull com.feiliao.oauth.sdk.flipchat.open.a.e eVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(eVar, AdvanceSetting.NETWORK_TYPE);
            a aVar = this.this$0;
            e.a aVar2 = eVar.f24265a;
            if (aVar2 != null) {
                str = aVar2.f24266a;
            } else {
                str = null;
            }
            aVar.g = str;
            this.this$0.k = true;
            this.this$0.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class g extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            this.this$0.k = true;
            this.this$0.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f24334a;

        h(a aVar) {
            this.f24334a = aVar;
        }

        public final void onClick(View view) {
            this.f24334a.onBackPressed();
        }
    }

    public void onResp(@Nullable com.bytedance.sdk.account.b.c.b bVar) {
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.j = true;
        a();
    }

    public void onBackPressed() {
        String str;
        c.a aVar = this.i;
        if (aVar != null) {
            str = aVar.f22259a;
        } else {
            str = null;
        }
        a("", str, -2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        com.feiliao.oauth.sdk.flipchat.open.b.f fVar = this.f24321e;
        if (fVar != null) {
            fVar.a();
        }
    }

    public final void a() {
        c.a aVar = this.i;
        if (aVar != null && this.j && this.k) {
            Intrinsics.checkParameterIsNotNull(aVar, "req");
            c.a(this.f24317a, aVar, this.f24322f, this.g);
        }
    }

    public void onErrorIntent(@Nullable Intent intent) {
        String str;
        c.a aVar = this.i;
        if (aVar != null) {
            str = aVar.f22259a;
        } else {
            str = null;
        }
        a("", str, -2);
    }

    public void onReq(@Nullable com.bytedance.sdk.account.b.c.a aVar) {
        if (aVar != null && (aVar instanceof c.a)) {
            c.a aVar2 = (c.a) aVar;
            aVar2.f22260b = "flipchat://open_redirect";
            this.i = aVar2;
        }
    }

    public final boolean a(@NotNull String str) {
        String str2;
        int i2;
        Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (StringsKt.startsWith$default(str, "bytedance://rloadingfinished", false, 2, null)) {
            if (Build.VERSION.SDK_INT < 17) {
                z = isFinishing();
            } else if (isFinishing() || isDestroyed()) {
                z = true;
            }
            if (!z) {
                com.feiliao.oauth.sdk.flipchat.open.impl.a.a aVar = this.h;
                if (aVar != null) {
                    aVar.a();
                }
            }
            return true;
        }
        Uri parse = Uri.parse(str);
        if (Intrinsics.areEqual((Object) parse.getQueryParameter("flipchat_redirect_native"), (Object) "proto")) {
            FlipChat.INSTANCE.getDepend().goToUserProto(this, str);
            return true;
        }
        c.a aVar2 = this.i;
        if (aVar2 != null) {
            str2 = aVar2.f22260b;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            String str3 = aVar2.f22260b;
            Intrinsics.checkExpressionValueIsNotNull(str3, "argument.redirectUri");
            if (StringsKt.startsWith$default(str, str3, false, 2, null)) {
                String queryParameter = parse.getQueryParameter("code");
                String queryParameter2 = parse.getQueryParameter("state");
                if (TextUtils.isEmpty(queryParameter)) {
                    try {
                        i2 = Integer.parseInt(parse.getQueryParameter("error_code"));
                    } catch (Exception unused) {
                        i2 = -1;
                    }
                    a("", "", i2);
                    return false;
                }
                Intrinsics.checkExpressionValueIsNotNull(queryParameter, "code");
                a(queryParameter, queryParameter2, 0);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        if (r3.isShowing() == false) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            android.content.res.Resources r6 = r5.getResources()
            r0 = 2130838683(0x7f02049b, float:1.7282355E38)
            android.graphics.drawable.Drawable r6 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r6, (int) r0)
            java.lang.String r0 = "resources.getDrawable(R.…_opensdk_rocket_progress)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r0)
            java.lang.String r0 = "drawable"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            com.feiliao.oauth.sdk.flipchat.open.impl.a.b.f24328b = r6
            com.feiliao.oauth.sdk.flipchat.open.api.FlipChat r6 = com.feiliao.oauth.sdk.flipchat.open.api.FlipChat.INSTANCE
            com.feiliao.oauth.sdk.flipchat.open.api.FlipChatOpenDepend r6 = r6.getDepend()
            java.lang.String r6 = r6.mobileNum()
            r5.f24322f = r6
            java.lang.String r6 = r5.f24322f
            r0 = 1
            if (r6 == 0) goto L_0x0068
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x0035
            r6 = 1
            goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            if (r6 != r0) goto L_0x0068
            com.feiliao.oauth.sdk.flipchat.open.api.FlipChat r6 = com.feiliao.oauth.sdk.flipchat.open.api.FlipChat.INSTANCE
            com.feiliao.oauth.sdk.flipchat.open.api.FlipChatOpenDepend r6 = r6.getDepend()
            boolean r6 = r6.isLogin()
            if (r6 != 0) goto L_0x0045
            goto L_0x0068
        L_0x0045:
            com.feiliao.oauth.sdk.flipchat.open.impl.i r6 = com.feiliao.oauth.sdk.flipchat.open.impl.i.f24352b
            com.feiliao.oauth.sdk.flipchat.open.b.j r6 = r6.d()
            com.feiliao.oauth.sdk.flipchat.open.impl.a$e r1 = com.feiliao.oauth.sdk.flipchat.open.impl.a.e.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            com.feiliao.oauth.sdk.flipchat.open.b.j r6 = r6.a((kotlin.jvm.functions.Function1<? super T, ? extends com.feiliao.oauth.sdk.flipchat.open.b.j<R>>) r1)
            com.feiliao.oauth.sdk.flipchat.open.impl.a$f r1 = new com.feiliao.oauth.sdk.flipchat.open.impl.a$f
            r1.<init>(r5)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            com.feiliao.oauth.sdk.flipchat.open.impl.a$g r2 = new com.feiliao.oauth.sdk.flipchat.open.impl.a$g
            r2.<init>(r5)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            com.feiliao.oauth.sdk.flipchat.open.b.f r6 = r6.a(r1, r2)
            r5.f24321e = r6
            goto L_0x006a
        L_0x0068:
            r5.k = r0
        L_0x006a:
            com.feiliao.oauth.sdk.flipchat.open.impl.a.a r6 = new com.feiliao.oauth.sdk.flipchat.open.impl.a.a
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            r6.<init>(r1)
            r5.h = r6
            com.feiliao.oauth.sdk.flipchat.open.impl.a.a r6 = r5.h
            if (r6 == 0) goto L_0x00ca
            java.lang.String r2 = "加载中"
            java.lang.String r3 = "loadingText"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            com.feiliao.oauth.sdk.flipchat.open.impl.a.b r3 = r6.f24324a
            if (r3 != 0) goto L_0x008d
            com.feiliao.oauth.sdk.flipchat.open.impl.a.b r3 = new com.feiliao.oauth.sdk.flipchat.open.impl.a.b
            android.content.Context r4 = r6.f24325b
            r3.<init>(r4)
            r6.f24324a = r3
            goto L_0x009a
        L_0x008d:
            com.feiliao.oauth.sdk.flipchat.open.impl.a.b r3 = r6.f24324a
            if (r3 != 0) goto L_0x0094
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0094:
            boolean r3 = r3.isShowing()
            if (r3 != 0) goto L_0x00ca
        L_0x009a:
            com.feiliao.oauth.sdk.flipchat.open.impl.a.b r3 = r6.f24324a
            if (r3 != 0) goto L_0x00a1
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00a1:
            com.feiliao.oauth.sdk.flipchat.open.impl.a.a$a r4 = com.feiliao.oauth.sdk.flipchat.open.impl.a.a.C0273a.f24326a
            android.content.DialogInterface$OnCancelListener r4 = (android.content.DialogInterface.OnCancelListener) r4
            r3.setOnCancelListener(r4)
            com.feiliao.oauth.sdk.flipchat.open.impl.a.b r3 = r6.f24324a
            if (r3 != 0) goto L_0x00af
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00af:
            java.lang.String r4 = "text"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r4)
            android.widget.TextView r3 = r3.f24330a
            if (r3 != 0) goto L_0x00bb
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00bb:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
            com.feiliao.oauth.sdk.flipchat.open.impl.a.b r6 = r6.f24324a
            if (r6 != 0) goto L_0x00c7
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00c7:
            r6.show()
        L_0x00ca:
            com.feiliao.oauth.sdk.a.a.b r6 = com.feiliao.oauth.sdk.a.b.a.a(r1)
            java.lang.String r1 = "BaseRocketOpenApiFactory.createBaseApi(this)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r1)
            r5.f24318b = r6
            com.feiliao.oauth.sdk.a.a.b r6 = r5.f24318b
            if (r6 != 0) goto L_0x00de
            java.lang.String r1 = "openApi"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00de:
            android.content.Intent r1 = r5.getIntent()
            r2 = r5
            com.bytedance.sdk.account.b.a.a r2 = (com.bytedance.sdk.account.b.a.a) r2
            r6.a((android.content.Intent) r1, (com.bytedance.sdk.account.b.a.a) r2)
            r6 = 2131689962(0x7f0f01ea, float:1.9008954E38)
            r5.setContentView(r6)
            r6 = 2131166827(0x7f07066b, float:1.794791E38)
            android.view.View r6 = r5.findViewById(r6)
            android.webkit.WebView r6 = (android.webkit.WebView) r6
            r5.f24317a = r6
            android.webkit.WebView r6 = r5.f24317a
            if (r6 == 0) goto L_0x0106
            android.webkit.WebSettings r6 = r6.getSettings()
            if (r6 == 0) goto L_0x0106
            r6.setJavaScriptEnabled(r0)
        L_0x0106:
            android.webkit.WebView r6 = r5.f24317a
            if (r6 == 0) goto L_0x0114
            com.feiliao.oauth.sdk.flipchat.open.impl.a$b r0 = new com.feiliao.oauth.sdk.flipchat.open.impl.a$b
            r0.<init>()
            android.webkit.WebViewClient r0 = (android.webkit.WebViewClient) r0
            r6.setWebViewClient(r0)
        L_0x0114:
            android.webkit.WebView r6 = r5.f24317a
            if (r6 == 0) goto L_0x0122
            com.feiliao.oauth.sdk.flipchat.open.impl.a$a r0 = new com.feiliao.oauth.sdk.flipchat.open.impl.a$a
            r0.<init>()
            android.webkit.WebChromeClient r0 = (android.webkit.WebChromeClient) r0
            r6.setWebChromeClient(r0)
        L_0x0122:
            r6 = 2131171081(0x7f071709, float:1.7956538E38)
            android.view.View r6 = r5.findViewById(r6)
            boolean r0 = r6 instanceof android.widget.TextView
            r1 = 0
            if (r0 != 0) goto L_0x012f
            r6 = r1
        L_0x012f:
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f24319c = r6
            r6 = 2131171082(0x7f07170a, float:1.795654E38)
            android.view.View r6 = r5.findViewById(r6)
            boolean r0 = r6 instanceof android.widget.TextView
            if (r0 != 0) goto L_0x013f
            r6 = r1
        L_0x013f:
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f24320d = r6
            android.widget.TextView r6 = r5.f24320d
            if (r6 == 0) goto L_0x014c
            r0 = 8
            r6.setVisibility(r0)
        L_0x014c:
            android.widget.TextView r6 = r5.f24319c
            if (r6 == 0) goto L_0x015b
            com.feiliao.oauth.sdk.flipchat.open.impl.a$h r0 = new com.feiliao.oauth.sdk.flipchat.open.impl.a$h
            r0.<init>(r5)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r6.setOnClickListener(r0)
            return
        L_0x015b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.feiliao.oauth.sdk.flipchat.open.impl.a.onCreate(android.os.Bundle):void");
    }

    private void a(@NotNull c.a aVar, @NotNull com.bytedance.sdk.account.b.c.b bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "req");
        Intrinsics.checkParameterIsNotNull(bVar, "resp");
        com.feiliao.oauth.sdk.a.a.b bVar2 = this.f24318b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openApi");
        }
        bVar2.a(aVar, bVar);
    }

    private void a(@NotNull String str, @Nullable String str2, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "code");
        l.a(this);
        c.b bVar = new c.b();
        bVar.f22265a = str;
        bVar.errorCode = i2;
        bVar.f22266b = str2;
        c.a aVar = this.i;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        a(aVar, bVar);
        finish();
    }
}
