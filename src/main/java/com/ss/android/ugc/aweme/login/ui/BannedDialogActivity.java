package com.ss.android.ugc.aweme.login.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.commercialize.api.DouPlusRefundApi;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.login.utils.BannedApi;
import com.ss.android.ugc.aweme.profile.model.BannedToastModel;
import com.ss.android.ugc.aweme.profile.model.UserPunishInfo;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\b\u0010&\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020$H\u0002J\"\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\b\u0010/\u001a\u00020$H\u0016J\u0012\u00100\u001a\u00020$2\b\u00101\u001a\u0004\u0018\u000102H\u0014J\b\u00103\u001a\u00020$H\u0014J\b\u00104\u001a\u00020$H\u0002J\b\u00105\u001a\u00020$H\u0002J\b\u00106\u001a\u00020$H\u0002J\b\u00107\u001a\u00020$H\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\r\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\n\"\u0004\b\"\u0010\u0010¨\u00069"}, d2 = {"Lcom/ss/android/ugc/aweme/login/ui/BannedDialogActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "()V", "appealButton", "Lcom/ss/android/ugc/aweme/profile/model/UserPunishInfo$JumpButtonModel;", "getAppealButton", "()Lcom/ss/android/ugc/aweme/profile/model/UserPunishInfo$JumpButtonModel;", "canRefund", "", "getCanRefund", "()Z", "cancelButton", "getCancelButton", "currentIsTopActivity", "getCurrentIsTopActivity", "setCurrentIsTopActivity", "(Z)V", "refundModel", "Lcom/ss/android/ugc/aweme/commercialize/api/DouPlusRefundApi$Response;", "getRefundModel", "()Lcom/ss/android/ugc/aweme/commercialize/api/DouPlusRefundApi$Response;", "setRefundModel", "(Lcom/ss/android/ugc/aweme/commercialize/api/DouPlusRefundApi$Response;)V", "refundModelReturned", "getRefundModelReturned", "setRefundModelReturned", "toastModel", "Lcom/ss/android/ugc/aweme/profile/model/BannedToastModel;", "getToastModel", "()Lcom/ss/android/ugc/aweme/profile/model/BannedToastModel;", "setToastModel", "(Lcom/ss/android/ugc/aweme/profile/model/BannedToastModel;)V", "toastModelReturned", "getToastModelReturned", "setToastModelReturned", "checkShow", "", "doAppeal", "doCancel", "doRefund", "finishWithoutAnim", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "requestBannedApi", "requestRefundApi", "showRefundDialog", "showSimpleDialog", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class BannedDialogActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53778a;
    public static final long g = TimeUnit.SECONDS.toMillis(2);
    public static long h;
    public static boolean i;
    public static final a j = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f53779b = true;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public BannedToastModel f53780c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f53781d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public DouPlusRefundApi.a f53782e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f53783f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/login/ui/BannedDialogActivity$Companion;", "", "()V", "REQ_BROWSER", "", "REQ_FEEDBACK", "isShowing", "", "()Z", "setShowing", "(Z)V", "showInterval", "", "getShowInterval", "()J", "showTimestamp", "getShowTimestamp", "setShowTimestamp", "(J)V", "showBannedDialog", "", "context", "Landroid/content/Context;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53784a;

        private a() {
        }

        public static boolean a() {
            return BannedDialogActivity.i;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/login/ui/BannedDialogActivity$requestBannedApi$1", "Lcom/google/common/util/concurrent/FutureCallback;", "Lcom/ss/android/ugc/aweme/profile/model/BannedToastModel;", "onFailure", "", "t", "", "onSuccess", "result", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.google.common.util.concurrent.k<BannedToastModel> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53785a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannedDialogActivity f53786b;

        b(BannedDialogActivity bannedDialogActivity) {
            this.f53786b = bannedDialogActivity;
        }

        public final void onFailure(@NotNull Throwable th) {
            if (PatchProxy.isSupport(new Object[]{th}, this, f53785a, false, 56421, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f53785a, false, 56421, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th, "t");
            this.f53786b.f53780c = null;
            this.f53786b.f53781d = true;
            this.f53786b.a();
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            BannedToastModel bannedToastModel = (BannedToastModel) obj;
            if (PatchProxy.isSupport(new Object[]{bannedToastModel}, this, f53785a, false, 56420, new Class[]{BannedToastModel.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bannedToastModel}, this, f53785a, false, 56420, new Class[]{BannedToastModel.class}, Void.TYPE);
                return;
            }
            this.f53786b.f53780c = bannedToastModel;
            this.f53786b.f53781d = true;
            this.f53786b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/login/ui/BannedDialogActivity$requestRefundApi$1", "Lcom/google/common/util/concurrent/FutureCallback;", "Lcom/ss/android/ugc/aweme/commercialize/api/DouPlusRefundApi$Response;", "onFailure", "", "t", "", "onSuccess", "result", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.google.common.util.concurrent.k<DouPlusRefundApi.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53787a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannedDialogActivity f53788b;

        c(BannedDialogActivity bannedDialogActivity) {
            this.f53788b = bannedDialogActivity;
        }

        public final void onFailure(@NotNull Throwable th) {
            if (PatchProxy.isSupport(new Object[]{th}, this, f53787a, false, 56423, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th}, this, f53787a, false, 56423, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th, "t");
            this.f53788b.f53782e = null;
            this.f53788b.f53783f = true;
            this.f53788b.a();
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            DouPlusRefundApi.a aVar = (DouPlusRefundApi.a) obj;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f53787a, false, 56422, new Class[]{DouPlusRefundApi.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f53787a, false, 56422, new Class[]{DouPlusRefundApi.a.class}, Void.TYPE);
                return;
            }
            this.f53788b.f53782e = aVar;
            this.f53788b.f53783f = true;
            this.f53788b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class d implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53789a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannedDialogActivity f53790b;

        d(BannedDialogActivity bannedDialogActivity) {
            this.f53790b = bannedDialogActivity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f53789a, false, 56424, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f53789a, false, 56424, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            if (this.f53790b.f53779b) {
                this.f53790b.d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53791a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannedDialogActivity f53792b;

        e(BannedDialogActivity bannedDialogActivity) {
            this.f53792b = bannedDialogActivity;
        }

        public final void onClick(View view) {
            String str;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{view}, this, f53791a, false, 56425, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f53791a, false, 56425, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            BannedDialogActivity bannedDialogActivity = this.f53792b;
            if (PatchProxy.isSupport(new Object[0], bannedDialogActivity, BannedDialogActivity.f53778a, false, 56409, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bannedDialogActivity, BannedDialogActivity.f53778a, false, 56409, new Class[0], Void.TYPE);
                return;
            }
            DouPlusRefundApi.a aVar = bannedDialogActivity.f53782e;
            if (aVar != null) {
                str = aVar.getFullUrl();
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            if (!z) {
                Intent intent = new Intent(bannedDialogActivity, CrossPlatformActivity.class);
                intent.putExtra(PushConstants.WEB_URL, str);
                intent.putExtra("use_ordinary_web", false);
                bannedDialogActivity.startActivityForResult(intent, 17);
                bannedDialogActivity.f53779b = false;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53793a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannedDialogActivity f53794b;

        f(BannedDialogActivity bannedDialogActivity) {
            this.f53794b = bannedDialogActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f53793a, false, 56426, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f53793a, false, 56426, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f53794b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53795a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannedDialogActivity f53796b;

        g(BannedDialogActivity bannedDialogActivity) {
            this.f53796b = bannedDialogActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f53795a, false, 56427, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f53795a, false, 56427, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f53796b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/ugc/aweme/login/ui/BannedDialogActivity$showSimpleDialog$1$1"}, k = 3, mv = {1, 1, 15})
    static final class h implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53797a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannedDialogActivity f53798b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BannedToastModel f53799c;

        h(BannedDialogActivity bannedDialogActivity, BannedToastModel bannedToastModel) {
            this.f53798b = bannedDialogActivity;
            this.f53799c = bannedToastModel;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53797a, false, 56428, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53797a, false, 56428, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f53798b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/ugc/aweme/login/ui/BannedDialogActivity$showSimpleDialog$1$2"}, k = 3, mv = {1, 1, 15})
    static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53800a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannedDialogActivity f53801b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BannedToastModel f53802c;

        i(BannedDialogActivity bannedDialogActivity, BannedToastModel bannedToastModel) {
            this.f53801b = bannedDialogActivity;
            this.f53802c = bannedToastModel;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53800a, false, 56429, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53800a, false, 56429, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f53801b.c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/ugc/aweme/login/ui/BannedDialogActivity$showSimpleDialog$1$3"}, k = 3, mv = {1, 1, 15})
    static final class j implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannedDialogActivity f53804b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BannedToastModel f53805c;

        j(BannedDialogActivity bannedDialogActivity, BannedToastModel bannedToastModel) {
            this.f53804b = bannedDialogActivity;
            this.f53805c = bannedToastModel;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53803a, false, 56430, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53803a, false, 56430, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f53804b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick", "com/ss/android/ugc/aweme/login/ui/BannedDialogActivity$showSimpleDialog$1$4"}, k = 3, mv = {1, 1, 15})
    static final class k implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53806a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannedDialogActivity f53807b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BannedToastModel f53808c;

        k(BannedDialogActivity bannedDialogActivity, BannedToastModel bannedToastModel) {
            this.f53807b = bannedDialogActivity;
            this.f53808c = bannedToastModel;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53806a, false, 56431, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53806a, false, 56431, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f53807b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss", "com/ss/android/ugc/aweme/login/ui/BannedDialogActivity$showSimpleDialog$1$5"}, k = 3, mv = {1, 1, 15})
    static final class l implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53809a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BannedDialogActivity f53810b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BannedToastModel f53811c;

        l(BannedDialogActivity bannedDialogActivity, BannedToastModel bannedToastModel) {
            this.f53810b = bannedDialogActivity;
            this.f53811c = bannedToastModel;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f53809a, false, 56432, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f53809a, false, 56432, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            if (this.f53810b.f53779b) {
                this.f53810b.d();
            }
        }
    }

    public final void onBackPressed() {
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f53778a, false, 56417, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53778a, false, 56417, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f53778a, false, 56418, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f53778a, false, 56418, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f53778a, false, 56412, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53778a, false, 56412, new Class[0], Void.TYPE);
        } else if (!isFinishing()) {
            finish();
            overridePendingTransition(0, 0);
            com.ss.android.ugc.aweme.account.c.b().logout("user_banned");
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f53778a, false, 56414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53778a, false, 56414, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        i = false;
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f53778a, false, 56400, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53778a, false, 56400, new Class[0], Boolean.TYPE)).booleanValue();
        }
        DouPlusRefundApi.a aVar = this.f53782e;
        if (aVar != null && aVar.canRefund) {
            DouPlusRefundApi.a aVar2 = this.f53782e;
            if (aVar2 == null || !aVar2.hasUrl()) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Nullable
    private UserPunishInfo.JumpButtonModel f() {
        if (PatchProxy.isSupport(new Object[0], this, f53778a, false, 56401, new Class[0], UserPunishInfo.JumpButtonModel.class)) {
            return (UserPunishInfo.JumpButtonModel) PatchProxy.accessDispatch(new Object[0], this, f53778a, false, 56401, new Class[0], UserPunishInfo.JumpButtonModel.class);
        } else if (e()) {
            BannedToastModel bannedToastModel = this.f53780c;
            if (bannedToastModel != null) {
                UserPunishInfo userPunishInfo = bannedToastModel.userPunishInfo;
                if (userPunishInfo != null) {
                    return userPunishInfo.leftButton;
                }
            }
            return null;
        } else {
            BannedToastModel bannedToastModel2 = this.f53780c;
            if (bannedToastModel2 != null) {
                UserPunishInfo userPunishInfo2 = bannedToastModel2.userPunishInfo;
                if (userPunishInfo2 != null) {
                    return userPunishInfo2.rightButton;
                }
            }
            return null;
        }
    }

    @Nullable
    private UserPunishInfo.JumpButtonModel g() {
        if (PatchProxy.isSupport(new Object[0], this, f53778a, false, 56402, new Class[0], UserPunishInfo.JumpButtonModel.class)) {
            return (UserPunishInfo.JumpButtonModel) PatchProxy.accessDispatch(new Object[0], this, f53778a, false, 56402, new Class[0], UserPunishInfo.JumpButtonModel.class);
        } else if (e()) {
            BannedToastModel bannedToastModel = this.f53780c;
            if (bannedToastModel != null) {
                UserPunishInfo userPunishInfo = bannedToastModel.userPunishInfo;
                if (userPunishInfo != null) {
                    return userPunishInfo.rightButton;
                }
            }
            return null;
        } else {
            BannedToastModel bannedToastModel2 = this.f53780c;
            if (bannedToastModel2 != null) {
                UserPunishInfo userPunishInfo2 = bannedToastModel2.userPunishInfo;
                if (userPunishInfo2 != null) {
                    return userPunishInfo2.leftButton;
                }
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f53778a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 56407(0xdc57, float:7.9043E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f53778a
            r5 = 0
            r6 = 56407(0xdc57, float:7.9043E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.profile.model.BannedToastModel r1 = r9.f53780c
            com.ss.android.ugc.aweme.profile.model.UserPunishInfo$JumpButtonModel r2 = r9.g()
            if (r2 == 0) goto L_0x0030
            java.lang.String r2 = r2.target
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            if (r1 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.profile.model.UserPunishInfo r1 = r1.userPunishInfo
            if (r1 == 0) goto L_0x003a
            int r1 = r1.showWebView
            goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            com.ss.android.ugc.aweme.profile.model.UserPunishInfo$JumpButtonModel r3 = r9.g()
            r4 = 16
            if (r3 != 0) goto L_0x0051
            android.content.Intent r1 = new android.content.Intent
            r2 = r9
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Class<com.ss.android.ugc.aweme.feedback.FeedbackActivity> r3 = com.ss.android.ugc.aweme.feedback.FeedbackActivity.class
            r1.<init>(r2, r3)
            r9.startActivityForResult(r1, r4)
            goto L_0x0080
        L_0x0051:
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0082
            if (r1 <= 0) goto L_0x0073
            android.content.Intent r1 = new android.content.Intent
            r3 = r9
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r4 = com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r1.<init>(r3, r4)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r1.setData(r2)
            r2 = 17
            r9.startActivityForResult(r1, r2)
            goto L_0x0080
        L_0x0073:
            android.content.Intent r1 = new android.content.Intent
            r2 = r9
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Class<com.ss.android.ugc.aweme.feedback.FeedbackActivity> r3 = com.ss.android.ugc.aweme.feedback.FeedbackActivity.class
            r1.<init>(r2, r3)
            r9.startActivityForResult(r1, r4)
        L_0x0080:
            r9.f53779b = r0
        L_0x0082:
            boolean r0 = r9.f53779b
            if (r0 == 0) goto L_0x0089
            r9.d()
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity.b():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f53778a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 56408(0xdc58, float:7.9044E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f53778a
            r5 = 0
            r6 = 56408(0xdc58, float:7.9044E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.profile.model.UserPunishInfo$JumpButtonModel r1 = r9.f()
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = r1.target
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            com.ss.android.ugc.aweme.profile.model.BannedToastModel r2 = r9.f53780c
            if (r2 == 0) goto L_0x003a
            com.ss.android.ugc.aweme.profile.model.UserPunishInfo r2 = r2.userPunishInfo
            if (r2 == 0) goto L_0x003a
            int r2 = r2.showWebView
            goto L_0x003b
        L_0x003a:
            r2 = 0
        L_0x003b:
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0049
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r3 = 0
            goto L_0x004a
        L_0x0049:
            r3 = 1
        L_0x004a:
            if (r3 != 0) goto L_0x0091
            if (r2 <= 0) goto L_0x0080
            android.content.Intent r2 = new android.content.Intent
            r3 = r9
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r4 = com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r2.<init>(r3, r4)
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            java.lang.String r3 = "uid"
            com.ss.android.ugc.aweme.IAccountUserService r4 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r5 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.String r4 = r4.getLastUid()
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r3, r4)
            android.net.Uri r1 = r1.build()
            r2.setData(r1)
            r1 = 17
            r9.startActivityForResult(r2, r1)
            goto L_0x008f
        L_0x0080:
            android.content.Intent r1 = new android.content.Intent
            r2 = r9
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Class<com.ss.android.ugc.aweme.feedback.FeedbackActivity> r3 = com.ss.android.ugc.aweme.feedback.FeedbackActivity.class
            r1.<init>(r2, r3)
            r2 = 16
            r9.startActivityForResult(r1, r2)
        L_0x008f:
            r9.f53779b = r0
        L_0x0091:
            boolean r0 = r9.f53779b
            if (r0 == 0) goto L_0x0098
            r9.d()
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity.c():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f53778a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 56406(0xdc56, float:7.9042E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f53778a
            r5 = 0
            r6 = 56406(0xdc56, float:7.9042E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            boolean r1 = r11.f53781d
            if (r1 == 0) goto L_0x01f1
            boolean r1 = r11.f53783f
            if (r1 != 0) goto L_0x002f
            goto L_0x01f1
        L_0x002f:
            boolean r1 = r11.e()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0129
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = f53778a
            r7 = 0
            r8 = 56411(0xdc5b, float:7.9049E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x005c
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = f53778a
            r7 = 0
            r8 = 56411(0xdc5b, float:7.9049E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x01f0
        L_0x005c:
            boolean r1 = r11.isFinishing()
            if (r1 != 0) goto L_0x0128
            r1 = r11
            android.content.Context r1 = (android.content.Context) r1
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r1)
            r5 = 2131689912(0x7f0f01b8, float:1.9008853E38)
            android.view.View r4 = r4.inflate(r5, r3, r0)
            if (r4 == 0) goto L_0x0120
            com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView r4 = (com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView) r4
            com.ss.android.ugc.aweme.profile.model.BannedToastModel r5 = r11.f53780c
            if (r5 == 0) goto L_0x007f
            com.ss.android.ugc.aweme.profile.model.UserPunishInfo r5 = r5.userPunishInfo
            if (r5 == 0) goto L_0x007f
            java.lang.String r5 = r5.title
            goto L_0x0080
        L_0x007f:
            r5 = r3
        L_0x0080:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x008d
            int r6 = r5.length()
            if (r6 != 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r6 = 0
            goto L_0x008e
        L_0x008d:
            r6 = 1
        L_0x008e:
            if (r6 != 0) goto L_0x009c
            android.widget.TextView r6 = r4.getTitleView()
            java.lang.String r7 = "content.titleView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r7)
            r6.setText(r5)
        L_0x009c:
            com.ss.android.ugc.aweme.profile.model.UserPunishInfo$JumpButtonModel r5 = r11.f()
            if (r5 == 0) goto L_0x00a5
            java.lang.String r5 = r5.text
            goto L_0x00a6
        L_0x00a5:
            r5 = r3
        L_0x00a6:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x00b3
            int r6 = r5.length()
            if (r6 != 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r6 = 0
            goto L_0x00b4
        L_0x00b3:
            r6 = 1
        L_0x00b4:
            if (r6 != 0) goto L_0x00c2
            android.widget.TextView r6 = r4.getCancelView()
            java.lang.String r7 = "content.cancelView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r7)
            r6.setText(r5)
        L_0x00c2:
            com.ss.android.ugc.aweme.profile.model.UserPunishInfo$JumpButtonModel r5 = r11.g()
            if (r5 == 0) goto L_0x00ca
            java.lang.String r3 = r5.text
        L_0x00ca:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x00d6
            int r5 = r3.length()
            if (r5 != 0) goto L_0x00d5
            goto L_0x00d6
        L_0x00d5:
            r2 = 0
        L_0x00d6:
            if (r2 != 0) goto L_0x00e4
            android.widget.TextView r2 = r4.getAppealView()
            java.lang.String r5 = "content.appealView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)
            r2.setText(r3)
        L_0x00e4:
            com.ss.android.ugc.aweme.framework.e.c r2 = new com.ss.android.ugc.aweme.framework.e.c
            r2.<init>(r1)
            r1 = r4
            android.view.View r1 = (android.view.View) r1
            com.ss.android.ugc.aweme.framework.e.c r1 = r2.a(r1)
            android.support.v7.app.AlertDialog r1 = r1.a()
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$d r2 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$d
            r2.<init>(r11)
            android.content.DialogInterface$OnDismissListener r2 = (android.content.DialogInterface.OnDismissListener) r2
            r1.setOnDismissListener(r2)
            r1.setCancelable(r0)
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$e r0 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$e
            r0.<init>(r11)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r4.f39912c = r0
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$f r0 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$f
            r0.<init>(r11)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r4.f39913d = r0
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$g r0 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$g
            r0.<init>(r11)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r4.f39914e = r0
            r1.show()
            goto L_0x0128
        L_0x0120:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.views.DouPlusRefundBanView"
            r0.<init>(r1)
            throw r0
        L_0x0128:
            return
        L_0x0129:
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = f53778a
            r7 = 0
            r8 = 56410(0xdc5a, float:7.9047E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x014d
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r6 = f53778a
            r7 = 0
            r8 = 56410(0xdc5a, float:7.9047E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x014d:
            boolean r1 = r11.isFinishing()
            if (r1 != 0) goto L_0x01f0
            com.ss.android.ugc.aweme.profile.model.BannedToastModel r1 = r11.f53780c
            r4 = r11
            android.content.Context r4 = (android.content.Context) r4
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r4 = com.ss.android.a.a.a(r4)
            if (r1 == 0) goto L_0x0165
            com.ss.android.ugc.aweme.profile.model.UserPunishInfo r5 = r1.userPunishInfo
            if (r5 == 0) goto L_0x0165
            java.lang.String r5 = r5.title
            goto L_0x0166
        L_0x0165:
            r5 = r3
        L_0x0166:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x0173
            int r6 = r5.length()
            if (r6 != 0) goto L_0x0171
            goto L_0x0173
        L_0x0171:
            r6 = 0
            goto L_0x0174
        L_0x0173:
            r6 = 1
        L_0x0174:
            if (r6 == 0) goto L_0x017d
            r5 = 2131558484(0x7f0d0054, float:1.8742285E38)
            r4.setMessage((int) r5)
            goto L_0x0180
        L_0x017d:
            r4.setMessage((java.lang.CharSequence) r5)
        L_0x0180:
            com.ss.android.ugc.aweme.profile.model.UserPunishInfo$JumpButtonModel r5 = r11.f()
            if (r5 == 0) goto L_0x0189
            java.lang.String r5 = r5.text
            goto L_0x018a
        L_0x0189:
            r5 = r3
        L_0x018a:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            if (r5 == 0) goto L_0x0197
            int r6 = r5.length()
            if (r6 != 0) goto L_0x0195
            goto L_0x0197
        L_0x0195:
            r6 = 0
            goto L_0x0198
        L_0x0197:
            r6 = 1
        L_0x0198:
            if (r6 == 0) goto L_0x01a8
            r5 = 2131559036(0x7f0d027c, float:1.8743405E38)
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$h r6 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$h
            r6.<init>(r11, r1)
            android.content.DialogInterface$OnClickListener r6 = (android.content.DialogInterface.OnClickListener) r6
            r4.setPositiveButton((int) r5, (android.content.DialogInterface.OnClickListener) r6)
            goto L_0x01b2
        L_0x01a8:
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$i r6 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$i
            r6.<init>(r11, r1)
            android.content.DialogInterface$OnClickListener r6 = (android.content.DialogInterface.OnClickListener) r6
            r4.setPositiveButton((java.lang.CharSequence) r5, (android.content.DialogInterface.OnClickListener) r6)
        L_0x01b2:
            com.ss.android.ugc.aweme.profile.model.UserPunishInfo$JumpButtonModel r5 = r11.g()
            if (r5 == 0) goto L_0x01ba
            java.lang.String r3 = r5.text
        L_0x01ba:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x01c6
            int r5 = r3.length()
            if (r5 != 0) goto L_0x01c5
            goto L_0x01c6
        L_0x01c5:
            r2 = 0
        L_0x01c6:
            if (r2 == 0) goto L_0x01d6
            r2 = 2131558666(0x7f0d010a, float:1.8742654E38)
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$j r3 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$j
            r3.<init>(r11, r1)
            android.content.DialogInterface$OnClickListener r3 = (android.content.DialogInterface.OnClickListener) r3
            r4.setNegativeButton((int) r2, (android.content.DialogInterface.OnClickListener) r3)
            goto L_0x01e0
        L_0x01d6:
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$k r2 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$k
            r2.<init>(r11, r1)
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            r4.setNegativeButton((java.lang.CharSequence) r3, (android.content.DialogInterface.OnClickListener) r2)
        L_0x01e0:
            com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$l r2 = new com.ss.android.ugc.aweme.login.ui.BannedDialogActivity$l
            r2.<init>(r11, r1)
            android.content.DialogInterface$OnDismissListener r2 = (android.content.DialogInterface.OnDismissListener) r2
            r4.setOnDismissListener(r2)
            r4.setCancelable(r0)
            r4.show()
        L_0x01f0:
            return
        L_0x01f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.login.ui.BannedDialogActivity.a():void");
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f53778a, false, 56403, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f53778a, false, 56403, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView((int) C0906R.layout.lw);
        StatusBarUtils.setTransparent(this);
        i = true;
        if (PatchProxy.isSupport(new Object[0], this, f53778a, false, 56405, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53778a, false, 56405, new Class[0], Void.TYPE);
        } else {
            IAccountUserService a2 = com.ss.android.ugc.aweme.account.d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            com.google.common.util.concurrent.l.a(BannedApi.a(a2.getLastUid()), new b(this), a.i.f1052b);
        }
        if (PatchProxy.isSupport(new Object[0], this, f53778a, false, 56404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53778a, false, 56404, new Class[0], Void.TYPE);
        } else {
            com.google.common.util.concurrent.l.a(DouPlusRefundApi.a(), new c(this), a.i.f1052b);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.login.ui.BannedDialogActivity", "onCreate", false);
    }

    public final void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f53778a, false, 56413, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent}, this, f53778a, false, 56413, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
        } else if (i4 == 16 || i4 == 17) {
            this.f53779b = true;
            d();
        } else {
            super.onActivityResult(i2, i3, intent);
        }
    }
}
