package com.ss.android.ugc.aweme.commerce.d;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.commercialize.ad.c;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.fe.method.CloseHalfDialogBridge;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/profile/UserDataDialog;", "Landroid/app/Dialog;", "activity", "Landroid/app/Activity;", "halfHeight", "", "url", "", "corner", "", "outCancel", "", "bgColor", "(Landroid/app/Activity;ILjava/lang/String;FZI)V", "closeHalfDialog", "", "event", "Lcom/ss/android/ugc/aweme/fe/method/CloseHalfDialogBridge$CloseHalfDialog;", "dismiss", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2873a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f2874b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2875c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2876d;

    /* renamed from: e  reason: collision with root package name */
    private final float f2877e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2878f = true;
    private final int g;

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f2873a, false, 29229, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2873a, false, 29229, new Class[0], Void.TYPE);
            return;
        }
        b.a(this);
        bg.d(this);
        ((CrossPlatformWebView) findViewById(C0906R.id.chb)).d(this.f2874b);
    }

    @Subscribe(a = ThreadMode.MAIN)
    public final void closeHalfDialog(@NotNull CloseHalfDialogBridge.a aVar) {
        CloseHalfDialogBridge.a aVar2 = aVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2873a, false, 29230, new Class[]{CloseHalfDialogBridge.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2873a, false, 29230, new Class[]{CloseHalfDialogBridge.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "event");
        JsonElement parse = new JsonParser().parse(aVar2.f44434a.toString());
        Intrinsics.checkExpressionValueIsNotNull(parse, "JsonParser().parse(event.params.toString())");
        JsonElement jsonElement = parse.getAsJsonObject().get("reactId");
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            String asString = jsonElement.getAsString();
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) findViewById(C0906R.id.chb);
            Intrinsics.checkExpressionValueIsNotNull(crossPlatformWebView, "rn_user_data");
            z = Intrinsics.areEqual((Object) asString, (Object) crossPlatformWebView.getReactId());
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            dismiss();
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2873a, false, 29228, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2873a, false, 29228, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        WindowManager.LayoutParams layoutParams = null;
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.iu, null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        inflate.setLayoutParams(new ViewGroup.LayoutParams(p.b(getContext()), this.f2875c));
        c cVar = new c(this.g, this.f2877e, this.f2877e, 0.0f, 0.0f);
        inflate.setBackground(cVar);
        setContentView(inflate);
        setCanceledOnTouchOutside(this.f2878f);
        ((CrossPlatformWebView) findViewById(C0906R.id.chb)).a(17, 0, 0, 0, 0);
        ((CrossPlatformWebView) findViewById(C0906R.id.chb)).a(this.f2876d, true);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            layoutParams = window2.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = this.f2875c;
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setAttributes(layoutParams);
        }
        bg.c(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull Activity activity, int i, @NotNull String str, float f2, boolean z, int i2) {
        super(activity, C0906R.style.su);
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
        this.f2874b = activity;
        this.f2875c = i;
        this.f2876d = str;
        this.f2877e = f2;
        this.g = i2;
    }
}
