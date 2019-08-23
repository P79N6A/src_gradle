package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.Window;
import com.bytedance.android.livesdk.browser.fragment.WebDialogFragment;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class z extends d<a, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9627a;

    /* renamed from: b  reason: collision with root package name */
    private WebDialogFragment f9628b;

    static final class a {
        @SerializedName("type")

        /* renamed from: a  reason: collision with root package name */
        String f9629a;
        @SerializedName("args")

        /* renamed from: b  reason: collision with root package name */
        C0076a f9630b;

        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.z$a$a  reason: collision with other inner class name */
        static final class C0076a {
            @SerializedName("url")

            /* renamed from: a  reason: collision with root package name */
            String f9631a;
            @SerializedName("width")

            /* renamed from: b  reason: collision with root package name */
            int f9632b;
            @SerializedName("height")

            /* renamed from: c  reason: collision with root package name */
            int f9633c;
            @SerializedName("radius")

            /* renamed from: d  reason: collision with root package name */
            int f9634d;
            @SerializedName("close_by_mask")

            /* renamed from: e  reason: collision with root package name */
            int f9635e;
        }

        a() {
        }
    }

    public z(WebDialogFragment webDialogFragment) {
        this.f9628b = webDialogFragment;
    }

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        String str;
        a aVar = (a) obj;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{aVar, fVar}, this, f9627a, false, 3702, new Class[]{a.class, f.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar, fVar}, this, f9627a, false, 3702, new Class[]{a.class, f.class}, Object.class);
        }
        if (TextUtils.equals("webview_popup", aVar.f9629a)) {
            a.C0076a aVar2 = aVar.f9630b;
            WebDialogFragment webDialogFragment = this.f9628b;
            String str2 = aVar2.f9631a;
            int i = aVar2.f9632b;
            int i2 = aVar2.f9633c;
            int i3 = aVar2.f9634d;
            int i4 = aVar2.f9635e;
            int i5 = i3;
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, webDialogFragment, WebDialogFragment.f9368e, false, 3573, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                WebDialogFragment webDialogFragment2 = webDialogFragment;
                PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i4)}, webDialogFragment2, WebDialogFragment.f9368e, false, 3573, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (!(webDialogFragment.getDialog() == null || webDialogFragment.getDialog().getWindow() == null)) {
                webDialogFragment.getDialog().show();
                Window window = webDialogFragment.getDialog().getWindow();
                if (window != null) {
                    window.clearFlags(32);
                    window.getAttributes().dimAmount = 0.6f;
                }
                if (!TextUtils.isEmpty(str2)) {
                    if (PatchProxy.isSupport(new Object[0], webDialogFragment, WebDialogFragment.f9368e, false, 3574, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], webDialogFragment, WebDialogFragment.f9368e, false, 3574, new Class[0], String.class);
                    } else if (webDialogFragment.q == null || webDialogFragment.q.y == null) {
                        str = "";
                    } else {
                        str = webDialogFragment.q.y.getUrl();
                    }
                    if (TextUtils.equals(str2, str)) {
                        webDialogFragment.a(i5);
                        FragmentActivity activity = webDialogFragment.getActivity();
                        if (activity != null && activity.getRequestedOrientation() == 1) {
                            if (webDialogFragment.r) {
                                i2 += 48;
                            }
                            webDialogFragment.a(webDialogFragment.getDialog(), i, i2, webDialogFragment.i);
                        }
                        if (i4 == 1) {
                            z = true;
                        }
                        webDialogFragment.a(z);
                    }
                }
            }
        } else {
            terminate();
        }
        return null;
    }
}
