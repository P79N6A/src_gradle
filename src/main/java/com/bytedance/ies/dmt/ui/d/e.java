package com.bytedance.ies.dmt.ui.d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.ss.android.ugc.aweme.C0906R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010\u0005\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ies/dmt/ui/toast/DouyinSystemToast;", "", "()V", "mToast", "Landroid/widget/Toast;", "makeText", "context", "Landroid/content/Context;", "text", "", "duration", "", "resId", "show", "", "Companion", "awemeuikit_douyinCnRelease"}, k = 1, mv = {1, 1, 11})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20348a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private Toast f20349b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ies/dmt/ui/toast/DouyinSystemToast$Companion;", "", "()V", "builder", "Lcom/bytedance/ies/dmt/ui/toast/DouyinSystemToast;", "awemeuikit_douyinCnRelease"}, k = 1, mv = {1, 1, 11})
    public static final class a {
        private a() {
        }

        @JvmStatic
        @NotNull
        public static e a() {
            return new e();
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        try {
            Toast toast = this.f20349b;
            if (toast != null) {
                f.a(toast);
            }
        } catch (Exception unused) {
        }
    }

    @NotNull
    public final e a(@Nullable Context context, @Nullable CharSequence charSequence) {
        if (context == null) {
            return this;
        }
        this.f20349b = new Toast(context);
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            View inflate = ((LayoutInflater) systemService).inflate(C0906R.layout.l5, null);
            View findViewById = inflate.findViewById(C0906R.id.text);
            if (findViewById != null) {
                ((TextView) findViewById).setText(charSequence);
                Toast toast = this.f20349b;
                if (toast != null) {
                    toast.setView(inflate);
                }
                Toast toast2 = this.f20349b;
                if (toast2 != null) {
                    toast2.setGravity(17, 0, 0);
                }
                return this;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }
}
