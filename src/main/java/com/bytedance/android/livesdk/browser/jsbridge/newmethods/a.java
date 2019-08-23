package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.ies.f.b.c;
import com.bytedance.ies.f.b.f;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a extends c<C0074a, b> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9490a;

    /* renamed from: b  reason: collision with root package name */
    private AlertDialog f9491b;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.a$a  reason: collision with other inner class name */
    static final class C0074a {
        @SerializedName("title")

        /* renamed from: a  reason: collision with root package name */
        String f9492a;
        @SerializedName("content")

        /* renamed from: b  reason: collision with root package name */
        String f9493b;
        @SerializedName("confirmText")

        /* renamed from: c  reason: collision with root package name */
        String f9494c;
        @SerializedName("showCancel")

        /* renamed from: d  reason: collision with root package name */
        boolean f9495d;
        @SerializedName("cancelText")

        /* renamed from: e  reason: collision with root package name */
        String f9496e;

        C0074a() {
        }
    }

    static final class b {
        @SerializedName("data")

        /* renamed from: a  reason: collision with root package name */
        C0075a f9497a;

        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.a$b$a  reason: collision with other inner class name */
        static final class C0075a {
            @SerializedName("confirm")

            /* renamed from: a  reason: collision with root package name */
            boolean f9498a;
            @SerializedName("cancel")

            /* renamed from: b  reason: collision with root package name */
            boolean f9499b;

            C0075a(boolean z) {
                this.f9498a = z;
                this.f9499b = !z;
            }
        }

        private b(boolean z) {
            this.f9497a = new C0075a(z);
        }

        /* synthetic */ b(boolean z, byte b2) {
            this(z);
        }
    }

    public final void d_() {
        if (PatchProxy.isSupport(new Object[0], this, f9490a, false, 3660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9490a, false, 3660, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9491b != null) {
            this.f9491b.dismiss();
        }
        this.f9491b = null;
    }

    public final /* synthetic */ void a(@NonNull Object obj, @NonNull f fVar) throws Exception {
        String str;
        String str2;
        C0074a aVar = (C0074a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar, fVar}, this, f9490a, false, 3659, new Class[]{C0074a.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, fVar}, this, f9490a, false, 3659, new Class[]{C0074a.class, f.class}, Void.TYPE);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(fVar.f20640a);
        builder.setMessage((CharSequence) aVar.f9493b);
        if (!TextUtils.isEmpty(aVar.f9492a)) {
            builder.setTitle((CharSequence) aVar.f9492a);
        }
        if (TextUtils.isEmpty(aVar.f9494c)) {
            str = ac.a((int) C0906R.string.dg_);
        } else {
            str = aVar.f9494c;
        }
        builder.setPositiveButton((CharSequence) str, (DialogInterface.OnClickListener) new b(this));
        if (aVar.f9495d) {
            if (TextUtils.isEmpty(aVar.f9496e)) {
                str2 = ac.a((int) C0906R.string.cpz);
            } else {
                str2 = aVar.f9496e;
            }
            builder.setNegativeButton((CharSequence) str2, (DialogInterface.OnClickListener) new c(this));
        }
        this.f9491b = builder.create();
        this.f9491b.show();
    }
}
