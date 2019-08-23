package com.feiliao.oauth.sdk.flipchat.open.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatConfig;", "", "builder", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatConfig$Builder;", "(Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatConfig$Builder;)V", "appId", "", "getAppId", "()Ljava/lang/String;", "getBuilder", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatConfig$Builder;", "clientKey", "getClientKey", "depend", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;", "getDepend", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;", "host", "getHost", "platformAppId", "getPlatformAppId", "uiConfig", "Lcom/feiliao/oauth/sdk/flipchat/open/api/UiConfig;", "getUiConfig", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/UiConfig;", "setUiConfig", "(Lcom/feiliao/oauth/sdk/flipchat/open/api/UiConfig;)V", "Builder", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class e {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public final String f24287a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f24288b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f24289c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f24290d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final FlipChatOpenDepend f24291e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public k f24292f;
    @NotNull
    public final a g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019R\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatConfig$Builder;", "", "()V", "appId", "", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "clientKey", "getClientKey", "setClientKey", "depend", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;", "getDepend", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;", "setDepend", "(Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatOpenDepend;)V", "host", "getHost", "setHost", "platformAppId", "getPlatformAppId", "setPlatformAppId", "uiConfig", "Lcom/feiliao/oauth/sdk/flipchat/open/api/UiConfig;", "getUiConfig", "()Lcom/feiliao/oauth/sdk/flipchat/open/api/UiConfig;", "setUiConfig", "(Lcom/feiliao/oauth/sdk/flipchat/open/api/UiConfig;)V", "build", "Lcom/feiliao/oauth/sdk/flipchat/open/api/FlipChatConfig;", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    public static final class a {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        public String f24293a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public String f24294b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public String f24295c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        public String f24296d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public FlipChatOpenDepend f24297e;
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        public k f24298f;
    }

    private e(a aVar) {
        this.g = aVar;
        String str = this.g.f24293a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appId");
        }
        this.f24287a = str;
        String str2 = this.g.f24294b;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clientKey");
        }
        this.f24288b = str2;
        String str3 = this.g.f24295c;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("platformAppId");
        }
        this.f24289c = str3;
        String str4 = this.g.f24296d;
        if (str4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("host");
        }
        this.f24290d = str4;
        FlipChatOpenDepend flipChatOpenDepend = this.g.f24297e;
        if (flipChatOpenDepend == null) {
            Intrinsics.throwUninitializedPropertyAccessException("depend");
        }
        this.f24291e = flipChatOpenDepend;
        this.f24292f = this.g.f24298f;
    }

    public /* synthetic */ e(@NotNull a aVar, byte b2) {
        this(aVar);
    }
}
