package com.bytedance.android.live.core.network.b;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.network.response.RequestError;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.dialog.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7855a;

    public static boolean a(Exception exc) {
        boolean z;
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, null, f7855a, true, 424, new Class[]{Exception.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{exc2}, null, f7855a, true, 424, new Class[]{Exception.class}, Boolean.TYPE)).booleanValue();
        }
        if (exc2 instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) exc2;
            if (PatchProxy.isSupport(new Object[]{aVar}, null, f7855a, true, 425, new Class[]{com.bytedance.android.live.a.a.b.a.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, null, f7855a, true, 425, new Class[]{com.bytedance.android.live.a.a.b.a.class}, Boolean.TYPE)).booleanValue();
            } else if (aVar.getErrorCode() == 20047) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static void a(Context context, Throwable th) {
        Context context2 = context;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{context2, th2}, null, f7855a, true, 415, new Class[]{Context.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, th2}, null, f7855a, true, 415, new Class[]{Context.class, Throwable.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{context2, th2, null, null}, null, f7855a, true, 417, new Class[]{Context.class, Throwable.class, String.class, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, th2, null, null}, null, f7855a, true, 417, new Class[]{Context.class, Throwable.class, String.class, Runnable.class}, Void.TYPE);
            return;
        }
        if (th2 instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th2;
            if (aVar.getErrorCode() != 20006) {
                String prompt = aVar.getPrompt();
                String alert = aVar.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    String string = context.getResources().getString(C0906R.string.crx);
                    if (PatchProxy.isSupport(new Object[]{context2, alert, string, null}, null, f7855a, true, 418, new Class[]{Context.class, String.class, String.class, Runnable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context2, alert, string, null}, null, f7855a, true, 418, new Class[]{Context.class, String.class, String.class, Runnable.class}, Void.TYPE);
                    } else {
                        if (context2 != null) {
                            b.a aVar2 = new b.a(context2);
                            aVar2.a((CharSequence) context.getResources().getString(C0906R.string.cu2));
                            aVar2.b((CharSequence) alert);
                            aVar2.a((CharSequence) string, (DialogInterface.OnClickListener) null);
                            aVar2.f8551b.r = new b(null);
                            aVar2.a().show();
                        }
                    }
                } else if (!TextUtils.isEmpty(prompt)) {
                    com.bytedance.android.live.uikit.d.a.a(context2, prompt);
                } else {
                    com.bytedance.android.live.uikit.d.a.a(context2, (String) null);
                }
                return;
            }
        }
        com.bytedance.android.live.uikit.d.a.a(context2, (String) null);
    }

    public static void a(int i, com.bytedance.android.live.core.network.a.b bVar, String str) throws Exception {
        com.bytedance.android.live.core.network.a.b bVar2 = bVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), bVar2, str2}, null, f7855a, true, 420, new Class[]{Integer.TYPE, com.bytedance.android.live.core.network.a.b.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), bVar2, str2}, null, f7855a, true, 420, new Class[]{Integer.TYPE, com.bytedance.android.live.core.network.a.b.class, String.class}, Void.TYPE);
            return;
        }
        throw new com.bytedance.android.live.core.network.b(i, bVar2.f7852c, str2).setPrompt(bVar2.f7851b);
    }

    public static void a(int i, RequestError requestError, Extra extra, String str) throws Exception {
        RequestError requestError2 = requestError;
        Extra extra2 = extra;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), requestError2, extra2, str2}, null, f7855a, true, 419, new Class[]{Integer.TYPE, RequestError.class, Extra.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), requestError2, extra2, str2}, null, f7855a, true, 419, new Class[]{Integer.TYPE, RequestError.class, Extra.class, String.class}, Void.TYPE);
            return;
        }
        a(i, requestError2, com.bytedance.android.live.a.a().toJson((Object) extra2), str2);
    }

    public static void a(int i, RequestError requestError, String str, String str2) throws Exception {
        RequestError requestError2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), requestError, str3, str4}, null, f7855a, true, 421, new Class[]{Integer.TYPE, RequestError.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), requestError, str3, str4}, null, f7855a, true, 421, new Class[]{Integer.TYPE, RequestError.class, String.class, String.class}, Void.TYPE);
            return;
        }
        if (requestError == null) {
            requestError2 = new RequestError();
            requestError2.prompts = ac.a((int) C0906R.string.ctq);
        } else {
            requestError2 = requestError;
        }
        throw new com.bytedance.android.live.core.network.b(i, requestError2.url, str4).setErrorMsg(requestError2.message).setPrompt(requestError2.prompts).setAlert(requestError2.alert).setExtra(str3);
    }
}
