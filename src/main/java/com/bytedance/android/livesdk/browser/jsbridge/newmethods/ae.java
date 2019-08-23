package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.bytedance.android.livesdk.m.b.d;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.f.b.c;
import com.bytedance.ies.f.b.f;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.disposables.Disposable;
import org.json.JSONObject;

public final class ae extends c<JSONObject, a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9529a;

    /* renamed from: b  reason: collision with root package name */
    public Disposable f9530b;

    /* renamed from: c  reason: collision with root package name */
    public Fragment f9531c;

    /* renamed from: d  reason: collision with root package name */
    public ProgressDialog f9532d;

    /* renamed from: e  reason: collision with root package name */
    f f9533e;

    static final class a {
        @SerializedName("code")

        /* renamed from: a  reason: collision with root package name */
        int f9544a;
        @SerializedName("uri")

        /* renamed from: b  reason: collision with root package name */
        String f9545b;
        @SerializedName("url")

        /* renamed from: c  reason: collision with root package name */
        String f9546c;

        private a(int i, String str, String str2) {
            this.f9544a = i;
            this.f9545b = str;
            this.f9546c = str2;
        }

        /* synthetic */ a(int i, String str, String str2, byte b2) {
            this(1, str, str2);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9529a, false, 3727, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9529a, false, 3727, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9532d != null) {
            this.f9532d.dismiss();
            this.f9532d = null;
        }
        d();
    }

    public final void d_() {
        if (PatchProxy.isSupport(new Object[0], this, f9529a, false, 3723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9529a, false, 3723, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9530b != null) {
            this.f9530b.dispose();
        }
        this.f9531c = null;
        this.f9533e = null;
    }

    public ae(Fragment fragment) {
        this.f9531c = fragment;
    }

    public final /* synthetic */ void a(@NonNull Object obj, @NonNull final f fVar) throws Exception {
        final JSONObject jSONObject = (JSONObject) obj;
        if (PatchProxy.isSupport(new Object[]{jSONObject, fVar}, this, f9529a, false, 3722, new Class[]{JSONObject.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, fVar}, this, f9529a, false, 3722, new Class[]{JSONObject.class, f.class}, Void.TYPE);
            return;
        }
        this.f9533e = fVar;
        com.bytedance.android.livesdk.m.f.a((Activity) fVar.f20640a).a(new d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f9534a;

            public final void a(String... strArr) {
                if (PatchProxy.isSupport(new Object[]{strArr}, this, f9534a, false, 3728, new Class[]{String[].class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{strArr}, this, f9534a, false, 3728, new Class[]{String[].class}, Void.TYPE);
                    return;
                }
                int optInt = jSONObject.optInt("duration_limit", 10);
                Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                intent.putExtra("android.intent.extra.durationLimit", optInt);
                intent.putExtra("android.intent.extra.videoQuality", 1);
                if (ae.this.f9531c.getActivity() == null) {
                    ae.this.d();
                } else {
                    ae.this.f9531c.startActivityForResult(intent, 9001);
                }
            }

            public final void b(String... strArr) {
                if (PatchProxy.isSupport(new Object[]{strArr}, this, f9534a, false, 3729, new Class[]{String[].class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{strArr}, this, f9534a, false, 3729, new Class[]{String[].class}, Void.TYPE);
                    return;
                }
                UIUtils.displayToastWithIcon(fVar.f20640a, 2130841006, (int) C0906R.string.csz);
                ae.this.d();
            }
        }, "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
