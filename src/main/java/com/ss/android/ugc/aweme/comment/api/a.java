package com.ss.android.ugc.aweme.comment.api;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0004J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010+\u001a\u00020,J4\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010)2\u000e\u00100\u001a\n\u0018\u000101j\u0004\u0018\u0001`22\u0006\u00103\u001a\u00020\u00042\b\b\u0002\u00104\u001a\u00020.H\u0007J\u001a\u00105\u001a\u00020'2\u0010\b\u0002\u00100\u001a\n\u0018\u000101j\u0004\u0018\u0001`2H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/ss/android/ugc/aweme/comment/api/CommentExceptionUtils;", "", "()V", "ERROR_CODE", "", "ERROR_UNKNOWN", "ERR_CHECK_FRE_CMT", "ERR_CHECK_FRE_CMT_CNT", "ERR_CHECK_FRE_FORWARD", "ERR_CLIENT_VERSION_ERROR", "ERR_COMMENT_CLOSE", "ERR_COMMENT_DENY", "ERR_COMMENT_DIRT_WORD", "ERR_COMMENT_ITEM_DELETE", "ERR_COMMENT_LIMIT", "ERR_COMMENT_REPEAT", "ERR_COMMENT_TOO_LONG", "ERR_FORWARD_CONTENT_EMPTY", "ERR_FORWARD_CONTENT_TOO_LONG", "ERR_FORWARD_DENY", "ERR_FORWARD_FAIL", "ERR_FORWARD_FAIL_ORIGIN", "ERR_FORWARD_INVALID_ORIGIN", "ERR_FORWARD_PRE_DELETE", "ERR_HIT_SHARK_CLICK_VERFY_CODE", "ERR_HIT_SHARK_SLIDE_VERFY_CODE", "ERR_INVALID_PARAM", "ERR_ITEM_COMMENT_CLOSE", "ERR_ITEM_DOES_NOT_EXISTS", "ERR_ITEM_IS_PRIVATE", "ERR_PUNISHED", "ERR_SERVICE_INTERNAL", "ERR_VERSION_TOO_LOW", "ITEM_COMMENT_DELETE_IS_DENIED", "ITEM_COMMENT_DOES_NOT_EXISTS", "USER_COMMENT_IS_BAN", "USER_DOES_NOT_LOGIN", "USER_OPERATION_IS_BAN", "displayToast", "", "context", "Landroid/content/Context;", "id", "msg", "", "handleException", "", "c", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "strId", "isCommentGone", "logTerminalMonitor", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36363a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f36364b = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.comment.api.a$a  reason: collision with other inner class name */
    static final class C0458a implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final C0458a f36365a = new C0458a();

        C0458a() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final boolean a(@Nullable Context context, @Nullable Exception exc, int i) {
        Context context2 = context;
        Exception exc2 = exc;
        if (!PatchProxy.isSupport(new Object[]{context2, exc2, Integer.valueOf(i)}, null, f36363a, true, 27288, new Class[]{Context.class, Exception.class, Integer.TYPE}, Boolean.TYPE)) {
            return a(context2, exc2, i, false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, exc2, Integer.valueOf(i)}, null, f36363a, true, 27288, new Class[]{Context.class, Exception.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
    }

    private a() {
    }

    private void a(@NotNull Context context, int i) {
        Context context2 = context;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, f36363a, false, 27291, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, f36363a, false, 27291, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        if (i2 != 0) {
            String string = context.getResources().getString(i2);
            Intrinsics.checkExpressionValueIsNotNull(string, "msg");
            a(context2, string);
        }
    }

    private void a(@NotNull Context context, @NotNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f36363a, false, 27290, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f36363a, false, 27290, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str2, "msg");
        try {
            com.bytedance.ies.dmt.ui.d.a.b(context, str).a();
        } catch (Exception e2) {
            Logger.throwException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01af, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01ba, code lost:
        if (android.text.TextUtils.isEmpty(r3.getPrompt()) != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01bc, code lost:
        r1 = f36364b;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, "context");
        r2 = r3.getPrompt();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, "exception.prompt");
        r1.a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01da, code lost:
        if (android.text.TextUtils.isEmpty(r3.getErrorMsg()) != false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01dc, code lost:
        r1 = f36364b;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, "context");
        r2 = r3.getErrorMsg();
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, "exception.errorMsg");
        r1.a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01f0, code lost:
        r1 = f36364b;
        kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, "context");
        r1.a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01fa, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x024c, code lost:
        return false;
     */
    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmOverloads
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(@org.jetbrains.annotations.Nullable android.content.Context r22, @org.jetbrains.annotations.Nullable java.lang.Exception r23, int r24, boolean r25) {
        /*
            r1 = r23
            r2 = r24
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r22
            r12 = 1
            r4[r12] = r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r24)
            r13 = 2
            r4[r13] = r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r25)
            r14 = 3
            r4[r14] = r5
            com.meituan.robust.ChangeQuickRedirect r6 = f36363a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r9[r11] = r5
            java.lang.Class<java.lang.Exception> r5 = java.lang.Exception.class
            r9[r12] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r13] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r9[r14] = r5
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = 0
            r7 = 1
            r8 = 27287(0x6a97, float:3.8237E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0076
            java.lang.Object[] r15 = new java.lang.Object[r3]
            r15[r11] = r22
            r15[r12] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r15[r13] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r25)
            r15[r14] = r0
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = f36363a
            r18 = 1
            r19 = 27287(0x6a97, float:3.8237E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1
            java.lang.Class<java.lang.Exception> r1 = java.lang.Exception.class
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r14] = r1
            java.lang.Class r21 = java.lang.Boolean.TYPE
            r20 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0076:
            com.ss.android.ugc.aweme.comment.api.a r10 = f36364b
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f36363a
            r6 = 0
            r7 = 27289(0x6a99, float:3.824E-41)
            java.lang.Class[] r8 = new java.lang.Class[r12]
            java.lang.Class<java.lang.Exception> r4 = java.lang.Exception.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r10
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x00a6
            java.lang.Object[] r3 = new java.lang.Object[r12]
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f36363a
            r6 = 0
            r7 = 27289(0x6a99, float:3.824E-41)
            java.lang.Class[] r8 = new java.lang.Class[r12]
            java.lang.Class<java.lang.Exception> r4 = java.lang.Exception.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00f4
        L_0x00a6:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x00f3 }
            r3.<init>()     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r4 = "url"
            java.lang.String r5 = "comment/publish"
            r3.put(r4, r5)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r4 = "errorCode"
            boolean r5 = r1 instanceof com.ss.android.ugc.aweme.base.api.a.b.a     // Catch:{ Exception -> 0x00f3 }
            if (r5 != 0) goto L_0x00ba
            r5 = 0
            goto L_0x00bb
        L_0x00ba:
            r5 = r1
        L_0x00bb:
            com.ss.android.ugc.aweme.base.api.a.b.a r5 = (com.ss.android.ugc.aweme.base.api.a.b.a) r5     // Catch:{ Exception -> 0x00f3 }
            if (r5 == 0) goto L_0x00c8
            int r5 = r5.getErrorCode()     // Catch:{ Exception -> 0x00f3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00cc
        L_0x00c8:
            java.lang.String r5 = java.lang.String.valueOf(r23)     // Catch:{ Exception -> 0x00f3 }
        L_0x00cc:
            r3.put(r4, r5)     // Catch:{ Exception -> 0x00f3 }
            boolean r4 = r1 instanceof com.ss.android.ugc.aweme.base.api.a.b.a     // Catch:{ Exception -> 0x00f3 }
            if (r4 == 0) goto L_0x00eb
            java.lang.String r4 = "prompt"
            r5 = r1
            com.ss.android.ugc.aweme.base.api.a.b.a r5 = (com.ss.android.ugc.aweme.base.api.a.b.a) r5     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r5 = r5.getPrompt()     // Catch:{ Exception -> 0x00f3 }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r4 = "errorDesc"
            r5 = r1
            com.ss.android.ugc.aweme.base.api.a.b.a r5 = (com.ss.android.ugc.aweme.base.api.a.b.a) r5     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r5 = r5.getErrorMsg()     // Catch:{ Exception -> 0x00f3 }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x00f3 }
        L_0x00eb:
            java.lang.String r4 = "api_error_web_return_log"
            java.lang.String r5 = ""
            com.ss.android.ugc.aweme.base.n.b((java.lang.String) r4, (java.lang.String) r5, (org.json.JSONObject) r3)     // Catch:{ Exception -> 0x00f3 }
            goto L_0x00f4
        L_0x00f3:
        L_0x00f4:
            if (r22 != 0) goto L_0x00fb
            android.content.Context r0 = com.ss.android.common.applog.GlobalContext.getContext()
            goto L_0x00fd
        L_0x00fb:
            r0 = r22
        L_0x00fd:
            boolean r3 = r1 instanceof com.ss.android.ugc.aweme.base.api.a.b.a
            if (r3 != 0) goto L_0x010c
            com.ss.android.ugc.aweme.comment.api.a r1 = f36364b
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            r1.a((android.content.Context) r0, (int) r2)
            return r11
        L_0x010c:
            r3 = r1
            com.ss.android.ugc.aweme.base.api.a.b.a r3 = (com.ss.android.ugc.aweme.base.api.a.b.a) r3
            int r4 = r3.getErrorCode()
            switch(r4) {
                case 8: goto L_0x01fb;
                case 9: goto L_0x01b0;
                default: goto L_0x0116;
            }
        L_0x0116:
            switch(r4) {
                case 2055: goto L_0x01b0;
                case 2056: goto L_0x01b0;
                default: goto L_0x0119;
            }
        L_0x0119:
            switch(r4) {
                case 2146: goto L_0x01b0;
                case 2147: goto L_0x01b0;
                case 2148: goto L_0x01b0;
                default: goto L_0x011c;
            }
        L_0x011c:
            switch(r4) {
                case 3055: goto L_0x01b0;
                case 3056: goto L_0x01b0;
                case 3057: goto L_0x01b0;
                case 3058: goto L_0x01af;
                case 3059: goto L_0x01af;
                default: goto L_0x011f;
            }
        L_0x011f:
            switch(r4) {
                case 5051: goto L_0x01b0;
                case 5052: goto L_0x01b0;
                case 5053: goto L_0x01b0;
                case 5054: goto L_0x01b0;
                case 5055: goto L_0x01b0;
                case 5056: goto L_0x01b0;
                case 5057: goto L_0x01b0;
                default: goto L_0x0122;
            }
        L_0x0122:
            switch(r4) {
                case 5: goto L_0x01b0;
                case 13: goto L_0x01b0;
                case 19: goto L_0x01b0;
                case 100: goto L_0x01b0;
                case 1001: goto L_0x0175;
                case 2053: goto L_0x01b0;
                case 2084: goto L_0x01b0;
                case 2152: goto L_0x01b0;
                case 2155: goto L_0x01af;
                case 2209: goto L_0x01b0;
                case 2554: goto L_0x01b0;
                case 3050: goto L_0x01b0;
                case 3220: goto L_0x01b0;
                case 5049: goto L_0x01b0;
                default: goto L_0x0125;
            }
        L_0x0125:
            if (r25 == 0) goto L_0x024c
            java.lang.String r1 = r3.getPrompt()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0148
            com.ss.android.ugc.aweme.comment.api.a r1 = f36364b
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.String r2 = r3.getPrompt()
            java.lang.String r3 = "exception.prompt"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r1.a((android.content.Context) r0, (java.lang.String) r2)
            goto L_0x024c
        L_0x0148:
            java.lang.String r1 = r3.getErrorMsg()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0169
            com.ss.android.ugc.aweme.comment.api.a r1 = f36364b
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.String r2 = r3.getErrorMsg()
            java.lang.String r3 = "exception.errorMsg"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r1.a((android.content.Context) r0, (java.lang.String) r2)
            goto L_0x024c
        L_0x0169:
            com.ss.android.ugc.aweme.comment.api.a r1 = f36364b
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            r1.a((android.content.Context) r0, (int) r2)
            goto L_0x024c
        L_0x0175:
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r2 = com.ss.android.a.a.a(r0)     // Catch:{ Exception -> 0x01ae }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01ae }
            r3.<init>()     // Catch:{ Exception -> 0x01ae }
            com.ss.android.ugc.aweme.base.api.a.b.a r1 = (com.ss.android.ugc.aweme.base.api.a.b.a) r1     // Catch:{ Exception -> 0x01ae }
            java.lang.String r1 = r1.getErrorMsg()     // Catch:{ Exception -> 0x01ae }
            r3.append(r1)     // Catch:{ Exception -> 0x01ae }
            java.lang.String r1 = ","
            r3.append(r1)     // Catch:{ Exception -> 0x01ae }
            r1 = 2131561292(0x7f0d0b4c, float:1.874798E38)
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x01ae }
            r3.append(r0)     // Catch:{ Exception -> 0x01ae }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x01ae }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x01ae }
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = r2.setMessage((java.lang.CharSequence) r0)     // Catch:{ Exception -> 0x01ae }
            r1 = 2131561543(0x7f0d0c47, float:1.874849E38)
            com.ss.android.ugc.aweme.comment.api.a$a r2 = com.ss.android.ugc.aweme.comment.api.a.C0458a.f36365a     // Catch:{ Exception -> 0x01ae }
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2     // Catch:{ Exception -> 0x01ae }
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r0 = r0.setPositiveButton((int) r1, (android.content.DialogInterface.OnClickListener) r2)     // Catch:{ Exception -> 0x01ae }
            r0.show()     // Catch:{ Exception -> 0x01ae }
        L_0x01ae:
            return r12
        L_0x01af:
            return r11
        L_0x01b0:
            java.lang.String r1 = r3.getPrompt()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01d0
            com.ss.android.ugc.aweme.comment.api.a r1 = f36364b
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.String r2 = r3.getPrompt()
            java.lang.String r3 = "exception.prompt"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r1.a((android.content.Context) r0, (java.lang.String) r2)
            goto L_0x01fa
        L_0x01d0:
            java.lang.String r1 = r3.getErrorMsg()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01f0
            com.ss.android.ugc.aweme.comment.api.a r1 = f36364b
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.String r2 = r3.getErrorMsg()
            java.lang.String r3 = "exception.errorMsg"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            r1.a((android.content.Context) r0, (java.lang.String) r2)
            goto L_0x01fa
        L_0x01f0:
            com.ss.android.ugc.aweme.comment.api.a r1 = f36364b
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            r1.a((android.content.Context) r0, (int) r2)
        L_0x01fa:
            return r12
        L_0x01fb:
            com.ss.android.ugc.aweme.framework.core.a r1 = com.ss.android.ugc.aweme.framework.core.a.b()
            java.lang.String r2 = "AppTracker.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.app.Activity r1 = r1.a()
            if (r1 == 0) goto L_0x023f
            com.ss.android.ugc.aweme.framework.core.a r0 = com.ss.android.ugc.aweme.framework.core.a.b()
            java.lang.String r1 = "AppTracker.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.app.Activity r0 = r0.a()
            r1 = 2131559234(0x7f0d0342, float:1.8743806E38)
            java.lang.String r0 = r0.getString(r1)
            com.ss.android.ugc.aweme.framework.core.a r1 = com.ss.android.ugc.aweme.framework.core.a.b()
            java.lang.String r2 = "AppTracker.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.app.Activity r1 = r1.a()
            java.lang.String r2 = "comment_net_exception"
            java.lang.String r3 = "system_auto"
            com.ss.android.ugc.aweme.utils.ad r4 = com.ss.android.ugc.aweme.utils.ad.a()
            java.lang.String r5 = "login_title"
            com.ss.android.ugc.aweme.utils.ad r0 = r4.a((java.lang.String) r5, (java.lang.String) r0)
            android.os.Bundle r0 = r0.f75487b
            com.ss.android.ugc.aweme.login.e.a((android.app.Activity) r1, (java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r0)
            goto L_0x024c
        L_0x023f:
            com.ss.android.ugc.aweme.comment.api.a r1 = f36364b
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r2 = 2131564521(0x7f0d17e9, float:1.875453E38)
            r1.a((android.content.Context) r0, (int) r2)
        L_0x024c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.api.a.a(android.content.Context, java.lang.Exception, int, boolean):boolean");
    }
}
