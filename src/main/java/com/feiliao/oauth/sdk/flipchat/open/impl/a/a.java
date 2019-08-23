package com.feiliao.oauth.sdk.flipchat.open.impl.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/view/LoadingController;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mLoadingDialog", "Lcom/feiliao/oauth/sdk/flipchat/open/impl/view/LoadingDialog;", "dismissLoadingDialog", "", "showLoadingDialog", "loadingText", "", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public b f24324a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f24325b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onCancel"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.feiliao.oauth.sdk.flipchat.open.impl.a.a$a  reason: collision with other inner class name */
    public static final class C0273a implements DialogInterface.OnCancelListener {

        /* renamed from: a  reason: collision with root package name */
        public static final C0273a f24326a = new C0273a();

        C0273a() {
        }

        public final void onCancel(DialogInterface dialogInterface) {
        }
    }

    public final void a() {
        boolean z;
        if (this.f24325b instanceof Activity) {
            if (Build.VERSION.SDK_INT < 17) {
                z = ((Activity) this.f24325b).isFinishing();
            } else if (((Activity) this.f24325b).isFinishing() || ((Activity) this.f24325b).isDestroyed()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f24324a = null;
                return;
            }
            b bVar = this.f24324a;
            if (bVar != null && bVar.isShowing()) {
                try {
                    b bVar2 = this.f24324a;
                    if (bVar2 != null) {
                        bVar2.dismiss();
                    }
                } catch (Exception unused) {
                    this.f24324a = null;
                }
            }
        }
    }

    public a(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f24325b = context;
    }
}
