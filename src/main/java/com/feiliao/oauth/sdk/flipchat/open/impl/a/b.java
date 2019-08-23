package com.feiliao.oauth.sdk.flipchat.open.impl.a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/view/LoadingDialog;", "Landroid/app/Dialog;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mLoadingText", "Landroid/widget/TextView;", "mProgressBar", "Landroid/widget/ProgressBar;", "dp2px", "", "context", "dpValue", "", "init", "", "setLoadingText", "text", "", "setProgressBar", "drawable", "Landroid/graphics/drawable/Drawable;", "Companion", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
public final class b extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    public static Drawable f24328b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f24329c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TextView f24330a;

    /* renamed from: d  reason: collision with root package name */
    private ProgressBar f24331d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f24332e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/feiliao/oauth/sdk/flipchat/open/impl/view/LoadingDialog$Companion;", "", "()V", "processBar", "Landroid/graphics/drawable/Drawable;", "initProcessBar", "", "drawable", "flipchat_open_sdk_release"}, k = 1, mv = {1, 1, 13})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context) {
        super(context, C0906R.style.uy);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f24332e = context;
        View inflate = LayoutInflater.from(this.f24332e).inflate(C0906R.layout.f4508me, null);
        View findViewById = inflate.findViewById(C0906R.id.agi);
        if (findViewById != null) {
            this.f24331d = (ProgressBar) findViewById;
            View findViewById2 = inflate.findViewById(C0906R.id.bck);
            if (findViewById2 != null) {
                this.f24330a = (TextView) findViewById2;
                Drawable drawable = f24328b;
                if (drawable != null) {
                    ProgressBar progressBar = this.f24331d;
                    if (progressBar == null) {
                        Intrinsics.throwNpe();
                    }
                    progressBar.setIndeterminateDrawable(drawable);
                }
                setContentView(inflate);
                setCancelable(true);
                setCanceledOnTouchOutside(false);
                Window window = getWindow();
                if (window == null) {
                    Intrinsics.throwNpe();
                }
                WindowManager.LayoutParams attributes = window.getAttributes();
                window.setGravity(17);
                attributes.width = a(this.f24332e, 144.0f);
                attributes.height = a(this.f24332e, 96.0f);
                window.setAttributes(attributes);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.ProgressBar");
    }

    private static int a(Context context, float f2) {
        Resources resources = context.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
        return (int) ((f2 * resources.getDisplayMetrics().density) + 0.5f);
    }
}
