package com.ss.android.ugc.aweme.app.api.a;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33786a;

    public static void a(Context context, com.ss.android.ugc.aweme.base.api.a.b.a aVar) {
        Context context2 = context;
        com.ss.android.ugc.aweme.base.api.a.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{context2, aVar2}, null, f33786a, true, 23184, new Class[]{Context.class, com.ss.android.ugc.aweme.base.api.a.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aVar2}, null, f33786a, true, 23184, new Class[]{Context.class, com.ss.android.ugc.aweme.base.api.a.b.a.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(aVar.getResponse())) {
            try {
                JSONObject jSONObject = new JSONObject(aVar.getResponse());
                if (!TextUtils.isEmpty(jSONObject.optString("status_msg"))) {
                    aVar2.setErrorMsg(jSONObject.optString("status_msg"));
                }
            } catch (JSONException unused) {
            }
        }
        a(context2, aVar2, C0906R.string.cak);
    }

    public static void a(Context context, Throwable th) {
        Context context2 = context;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{context2, th2}, null, f33786a, true, 23185, new Class[]{Context.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, th2}, null, f33786a, true, 23185, new Class[]{Context.class, Throwable.class}, Void.TYPE);
            return;
        }
        a(context2, th2, C0906R.string.cak);
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Throwable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r21, java.lang.Throwable r22, int r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r23)
            r13 = 2
            r4[r13] = r5
            com.meituan.robust.ChangeQuickRedirect r6 = f33786a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r9[r11] = r5
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r9[r12] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 23186(0x5a92, float:3.249E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005b
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r14[r13] = r0
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f33786a
            r17 = 1
            r18 = 23186(0x5a92, float:3.249E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x005b:
            if (r1 != 0) goto L_0x005e
            return
        L_0x005e:
            r3 = 0
            boolean r4 = r1 instanceof com.ss.android.ugc.aweme.base.api.a.b.a
            if (r4 == 0) goto L_0x0067
            r3 = r1
            com.ss.android.ugc.aweme.base.api.a.b.a r3 = (com.ss.android.ugc.aweme.base.api.a.b.a) r3
            goto L_0x0072
        L_0x0067:
            java.lang.Throwable r1 = r22.getCause()
            boolean r4 = r1 instanceof com.ss.android.ugc.aweme.base.api.a.b.a
            if (r4 == 0) goto L_0x0072
            r3 = r1
            com.ss.android.ugc.aweme.base.api.a.b.a r3 = (com.ss.android.ugc.aweme.base.api.a.b.a) r3
        L_0x0072:
            if (r3 == 0) goto L_0x00f5
            int r1 = r3.getErrorCode()
            r4 = 2155(0x86b, float:3.02E-42)
            if (r1 != r4) goto L_0x007d
            return
        L_0x007d:
            int r1 = r3.getErrorCode()
            r4 = 1001(0x3e9, float:1.403E-42)
            if (r1 != r4) goto L_0x00a2
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = com.ss.android.a.a.a(r21)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r1 = r3.getErrorMsg()     // Catch:{ Exception -> 0x00a1 }
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = r0.setMessage((java.lang.CharSequence) r1)     // Catch:{ Exception -> 0x00a1 }
            r1 = 2131561543(0x7f0d0c47, float:1.874849E38)
            com.ss.android.ugc.aweme.app.api.a.a$1 r2 = new com.ss.android.ugc.aweme.app.api.a.a$1     // Catch:{ Exception -> 0x00a1 }
            r2.<init>()     // Catch:{ Exception -> 0x00a1 }
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = r0.setPositiveButton((int) r1, (android.content.DialogInterface.OnClickListener) r2)     // Catch:{ Exception -> 0x00a1 }
            r0.show()     // Catch:{ Exception -> 0x00a1 }
            return
        L_0x00a1:
            return
        L_0x00a2:
            r4 = 2003(0x7d3, float:2.807E-42)
            if (r1 == r4) goto L_0x00f4
            r4 = 2004(0x7d4, float:2.808E-42)
            if (r1 != r4) goto L_0x00ab
            goto L_0x00f4
        L_0x00ab:
            if (r0 == 0) goto L_0x00f3
            java.lang.String r1 = r3.getPrompt()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00c3
            java.lang.String r1 = r3.getPrompt()
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
            r0.a()
            goto L_0x00fe
        L_0x00c3:
            java.lang.String r1 = r3.getErrorMsg()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d9
            java.lang.String r1 = r3.getErrorMsg()
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
            r0.a()
            goto L_0x00fe
        L_0x00d9:
            int r1 = r3.getErrorCode()
            r3 = 100
            if (r1 != r3) goto L_0x00ec
            r1 = 2131559241(0x7f0d0349, float:1.874382E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
            goto L_0x00fe
        L_0x00ec:
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r2)
            r0.a()
        L_0x00f3:
            return
        L_0x00f4:
            return
        L_0x00f5:
            if (r0 == 0) goto L_0x00fe
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r2)
            r0.a()
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.api.a.a.a(android.content.Context, java.lang.Throwable, int):void");
    }

    public static void a(Context context, Exception exc, @StringRes int i, @StringRes int i2) {
        Context context2 = context;
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{context2, exc2, Integer.valueOf(C0906R.string.ba3), Integer.valueOf(i2)}, null, f33786a, true, 23187, new Class[]{Context.class, Exception.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, exc2, Integer.valueOf(C0906R.string.ba3), Integer.valueOf(i2)}, null, f33786a, true, 23187, new Class[]{Context.class, Exception.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (exc2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc2;
            if (aVar.getErrorCode() == 2752) {
                String errorMsg = aVar.getErrorMsg();
                String string = context.getResources().getString(i2);
                a.C0185a a2 = new a.C0185a(context2).a((int) C0906R.string.ba3);
                if (TextUtils.isEmpty(errorMsg)) {
                    errorMsg = string;
                }
                a2.b(errorMsg).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) null).a().a();
            }
        }
    }
}
