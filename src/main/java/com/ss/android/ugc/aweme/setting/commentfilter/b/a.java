package com.ss.android.ugc.aweme.setting.commentfilter.b;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.fe.b.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/commentfilter/util/CommentFilterUtil;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0693a f63900a = new C0693a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/commentfilter/util/CommentFilterUtil$Companion;", "Lcom/ss/android/ugc/aweme/setting/serverpush/PushSettingsManager$PushSettingCallback;", "()V", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "tryShowCommentFilterGuide", "context", "Landroid/app/Activity;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "comment", "Lcom/ss/android/ugc/aweme/comment/model/Comment;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.b.a$a  reason: collision with other inner class name */
    public static final class C0693a implements a.C0028a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63901a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.b.a$a$a  reason: collision with other inner class name */
        static final class C0694a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63902a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f63903b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f63904c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Activity f63905d;

            C0694a(d dVar, String str, Activity activity) {
                this.f63903b = dVar;
                this.f63904c = str;
                this.f63905d = activity;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63902a, false, 72198, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63902a, false, 72198, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                String a2 = this.f63903b.a("settings_times_" + this.f63904c, PushConstants.PUSH_TYPE_NOTIFY);
                Intrinsics.checkExpressionValueIsNotNull(a2, "storage.get(SETTING_TIMES_KEY + uid, \"0\")");
                this.f63903b.b("settings_times_" + this.f63904c, String.valueOf(Integer.parseInt(a2) + 1));
                this.f63905d.startActivity(new Intent(this.f63905d, CommentFilterActivity.class));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog1", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.b.a$a$b */
        static final class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63906a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f63907b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f63908c;

            b(d dVar, String str) {
                this.f63907b = dVar;
                this.f63908c = str;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63906a, false, 72199, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f63906a, false, 72199, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                String a2 = this.f63907b.a("not_now_times_" + this.f63908c, PushConstants.PUSH_TYPE_NOTIFY);
                Intrinsics.checkExpressionValueIsNotNull(a2, "storage.get(NOT_NOW_TIMES_KEY + uid, \"0\")");
                this.f63907b.b("not_now_times_" + this.f63908c, String.valueOf(Integer.parseInt(a2) + 1));
                dialogInterface.dismiss();
            }
        }

        public final void a(@NotNull Exception exc) {
            Exception exc2 = exc;
            if (PatchProxy.isSupport(new Object[]{exc2}, this, f63901a, false, 72196, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc2}, this, f63901a, false, 72196, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(exc2, "e");
        }

        private C0693a() {
        }

        public /* synthetic */ C0693a(byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d8, code lost:
            if ((true ^ kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) java.lang.Boolean.valueOf(r5.Y()))) != false) goto L_0x00da;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.setting.serverpush.a.c r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f63901a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.setting.serverpush.a.c> r3 = com.ss.android.ugc.aweme.setting.serverpush.a.c.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 72195(0x11a03, float:1.01167E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0036
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f63901a
                r13 = 0
                r14 = 72195(0x11a03, float:1.01167E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.setting.serverpush.a.c> r0 = com.ss.android.ugc.aweme.setting.serverpush.a.c.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                return
            L_0x0036:
                java.lang.String r2 = "settings"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
                boolean r2 = com.ss.android.g.a.a()
                if (r2 == 0) goto L_0x01e4
                com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
                java.lang.String r3 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                boolean r2 = r2.isLogin()
                if (r2 == 0) goto L_0x01e4
                com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
                java.lang.String r3 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                java.lang.String r2 = r2.getCurUserId()
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x01e4
                com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
                java.lang.String r3 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                java.lang.String r2 = r2.getCurUserId()
                com.ss.android.ugc.aweme.fe.b.d r3 = com.ss.android.ugc.aweme.fe.b.d.a()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "settings_times_"
                r4.<init>(r5)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = ""
                java.lang.String r4 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r5 = ""
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
                if (r4 != 0) goto L_0x00da
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "not_now_times_"
                r4.<init>(r5)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = ""
                java.lang.String r4 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r5 = ""
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
                if (r4 != 0) goto L_0x00da
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "comment_filter_function_open_"
                r4.<init>(r5)
                r4.append(r2)
                java.lang.String r4 = r4.toString()
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                java.lang.Boolean r4 = r3.a((java.lang.String) r4, (java.lang.Boolean) r5)
                com.ss.android.ugc.aweme.setting.AbTestManager r5 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.String r6 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
                boolean r5 = r5.Y()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
                r1 = r1 ^ r4
                if (r1 == 0) goto L_0x0158
            L_0x00da:
                com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.String r4 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                boolean r1 = r1.Y()
                if (r1 == 0) goto L_0x0110
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "settings_times_"
                r1.<init>(r4)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = "0"
                r3.b((java.lang.String) r1, (java.lang.String) r4)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "not_now_times_"
                r1.<init>(r4)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = "0"
                r3.b((java.lang.String) r1, (java.lang.String) r4)
                goto L_0x0136
            L_0x0110:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "settings_times_"
                r1.<init>(r4)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = "1"
                r3.b((java.lang.String) r1, (java.lang.String) r4)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "not_now_times_"
                r1.<init>(r4)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r4 = "2"
                r3.b((java.lang.String) r1, (java.lang.String) r4)
            L_0x0136:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "comment_filter_function_open_"
                r1.<init>(r4)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ss.android.ugc.aweme.setting.AbTestManager r4 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                java.lang.String r5 = "AbTestManager.getInstance()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
                boolean r4 = r4.Y()
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                r3.b((java.lang.String) r1, (java.lang.Boolean) r4)
            L_0x0158:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "comment_filter_function_open_"
                r1.<init>(r4)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                java.lang.Boolean r1 = r3.a((java.lang.String) r1, (java.lang.Boolean) r4)
                java.lang.String r4 = "storage.get(COMMENT_FILT…_OPEN + \"_\" + uid, false)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L_0x01e4
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "comment_filter_status_"
                r1.<init>(r4)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
                java.lang.Integer r1 = r3.a((java.lang.String) r1, (java.lang.Integer) r4)
                if (r1 != 0) goto L_0x0190
                return
            L_0x0190:
                int r1 = r1.intValue()
                if (r1 != 0) goto L_0x01e4
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "comment_filter_status_"
                r1.<init>(r4)
                com.ss.android.ugc.aweme.IAccountUserService r4 = com.ss.android.ugc.aweme.account.d.a()
                java.lang.String r5 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
                java.lang.String r4 = r4.getCurUserId()
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                int r4 = r0.A
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3.b((java.lang.String) r1, (java.lang.Integer) r4)
                int r0 = r0.A
                if (r0 <= 0) goto L_0x01e4
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "settings_times_"
                r0.<init>(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "1"
                r3.b((java.lang.String) r0, (java.lang.String) r1)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "not_now_times_"
                r0.<init>(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "2"
                r3.b((java.lang.String) r0, (java.lang.String) r1)
            L_0x01e4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.commentfilter.b.a.C0693a.a(com.ss.android.ugc.aweme.setting.serverpush.a.c):void");
        }

        public final void a(@Nullable Activity activity, @NotNull Aweme aweme, @NotNull Comment comment) {
            Activity activity2 = activity;
            Aweme aweme2 = aweme;
            Comment comment2 = comment;
            if (PatchProxy.isSupport(new Object[]{activity2, aweme2, comment2}, this, f63901a, false, 72197, new Class[]{Activity.class, Aweme.class, Comment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, aweme2, comment2}, this, f63901a, false, 72197, new Class[]{Activity.class, Aweme.class, Comment.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
            Intrinsics.checkParameterIsNotNull(comment2, "comment");
            if (activity2 != null && !activity.isFinishing() && com.ss.android.g.a.a()) {
                IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
                String curUserId = a2.getCurUserId();
                d a3 = d.a();
                StringBuilder sb = new StringBuilder("comment_filter_function_open_");
                IAccountUserService a4 = com.ss.android.ugc.aweme.account.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a4, "AccountUserProxyService.get()");
                sb.append(a4.getCurUserId());
                Boolean a5 = a3.a(sb.toString(), Boolean.FALSE);
                Intrinsics.checkExpressionValueIsNotNull(a5, "NativeStorage.instance()…e.get().curUserId, false)");
                if (a5.booleanValue()) {
                    CharSequence charSequence = curUserId;
                    if (TextUtils.equals(aweme.getAuthorUid(), charSequence)) {
                        User user = comment.getUser();
                        Intrinsics.checkExpressionValueIsNotNull(user, "comment.user");
                        if (!TextUtils.equals(user.getUid(), charSequence)) {
                            d a6 = d.a();
                            String a7 = a6.a("settings_times_" + curUserId, PushConstants.PUSH_TYPE_NOTIFY);
                            Intrinsics.checkExpressionValueIsNotNull(a7, "storage.get(SETTING_TIMES_KEY + uid, \"0\")");
                            if (Integer.parseInt(a7) <= 0) {
                                String a8 = a6.a("not_now_times_" + curUserId, PushConstants.PUSH_TYPE_NOTIFY);
                                Intrinsics.checkExpressionValueIsNotNull(a8, "storage.get(NOT_NOW_TIMES_KEY + uid, \"0\")");
                                if (Integer.parseInt(a8) <= 1) {
                                    Dialog a9 = new a.C0185a(activity2).b((int) C0906R.string.a4u).a(activity2.getString(C0906R.string.ajx), (DialogInterface.OnClickListener) new C0694a(a6, curUserId, activity2)).b(activity2.getString(C0906R.string.bil), (DialogInterface.OnClickListener) new b(a6, curUserId)).a().a();
                                    a9.setCanceledOnTouchOutside(false);
                                    a9.setCancelable(false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
