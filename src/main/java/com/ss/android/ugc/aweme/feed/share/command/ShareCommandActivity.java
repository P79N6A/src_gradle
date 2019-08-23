package com.ss.android.ugc.aweme.feed.share.command;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AdsAppActivity;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.model.SmsParseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.invitefriends.response.SmsInviteFriendDialog;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.b;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0003&'(B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\"\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0016J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0010H\u0014J\"\u0010\u001c\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u001a\u0010\u001e\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0018\u0010#\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0012\u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/share/command/ShareCommandActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "()V", "mCurrentDialog", "Landroid/app/Dialog;", "mIsFromScan", "", "mQRCodeType", "", "mSchemaCommandApi", "Lcom/ss/android/ugc/aweme/feed/share/command/ShareCommandActivity$ShareCommandApi;", "buildSupportType", "", "getQrCodeType", "qrCodeType", "getSchema", "", "intent", "Landroid/content/Intent;", "handleSchema", "result", "Lcom/ss/android/ugc/aweme/share/command/Schema;", "type", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showCommonDialog", "desc", "showInviteDialog", "showSMSInviteDialog", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "showVideoDialog", "showWebviewDialog", "trySmsInviteCodeTrans", "command", "ExtraArgs", "ShareCommandApi", "Type", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ShareCommandActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45878a;

    /* renamed from: b  reason: collision with root package name */
    public Dialog f45879b;

    /* renamed from: c  reason: collision with root package name */
    private ShareCommandApi f45880c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f45881d;

    /* renamed from: e  reason: collision with root package name */
    private int f45882e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/share/command/ShareCommandActivity$ShareCommandApi;", "", "getSchema", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/ss/android/ugc/aweme/share/command/Schema;", "command", "", "supportType", "getUrlSchema", "parseSmsCode", "Lcom/ss/android/ugc/aweme/friends/model/SmsParseResponse;", "code", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface ShareCommandApi {
        @NotNull
        @GET(a = "/aweme/v2/platform/share/command/trans/")
        q<com.ss.android.ugc.aweme.share.a.d> getSchema(@NotNull @Query(a = "command") String str, @NotNull @Query(a = "support_type") String str2);

        @NotNull
        @GET(a = "/aweme/v1/schema/trans/")
        q<com.ss.android.ugc.aweme.share.a.d> getUrlSchema(@NotNull @Query(a = "url") String str, @NotNull @Query(a = "support_type") String str2);

        @NotNull
        @GET(a = "/aweme/v1/user/contact/referral/")
        q<SmsParseResponse> parseSmsCode(@NotNull @Query(a = "referral_code") String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/feed/share/command/ShareCommandActivity$getSchema$1", "Lcom/google/common/util/concurrent/FutureCallback;", "Lcom/ss/android/ugc/aweme/share/command/Schema;", "onFailure", "", "t", "", "onSuccess", "result", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements com.google.common.util.concurrent.k<com.ss.android.ugc.aweme.share.a.d> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45883a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareCommandActivity f45884b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f45885c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45886d;

        public final /* synthetic */ void onSuccess(Object obj) {
            com.ss.android.ugc.aweme.share.a.d dVar = (com.ss.android.ugc.aweme.share.a.d) obj;
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f45883a, false, 42223, new Class[]{com.ss.android.ugc.aweme.share.a.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f45883a, false, 42223, new Class[]{com.ss.android.ugc.aweme.share.a.d.class}, Void.TYPE);
                return;
            }
            this.f45884b.a(dVar, this.f45885c, this.f45886d);
        }

        public final void onFailure(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f45883a, false, 42224, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f45883a, false, 42224, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "t");
            this.f45884b.finish();
        }

        a(ShareCommandActivity shareCommandActivity, String str, int i) {
            this.f45884b = shareCommandActivity;
            this.f45885c = str;
            this.f45886d = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/feed/share/command/ShareCommandActivity$getSchema$2", "Lcom/google/common/util/concurrent/FutureCallback;", "Lcom/ss/android/ugc/aweme/share/command/Schema;", "onFailure", "", "t", "", "onSuccess", "result", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements com.google.common.util.concurrent.k<com.ss.android.ugc.aweme.share.a.d> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45887a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareCommandActivity f45888b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f45889c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45890d;

        public final void onFailure(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f45887a, false, 42226, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f45887a, false, 42226, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "t");
            this.f45888b.finish();
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            com.ss.android.ugc.aweme.share.a.d dVar = (com.ss.android.ugc.aweme.share.a.d) obj;
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f45887a, false, 42225, new Class[]{com.ss.android.ugc.aweme.share.a.d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f45887a, false, 42225, new Class[]{com.ss.android.ugc.aweme.share.a.d.class}, Void.TYPE);
                return;
            }
            ShareCommandActivity shareCommandActivity = this.f45888b;
            String str = this.f45889c;
            Intrinsics.checkExpressionValueIsNotNull(str, "type");
            shareCommandActivity.a(dVar, str, this.f45890d);
        }

        b(ShareCommandActivity shareCommandActivity, String str, int i) {
            this.f45888b = shareCommandActivity;
            this.f45889c = str;
            this.f45890d = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45891a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareCommandActivity f45892b;

        c(ShareCommandActivity shareCommandActivity) {
            this.f45892b = shareCommandActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f45891a, false, 42227, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f45891a, false, 42227, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f45892b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class d implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45893a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareCommandActivity f45894b;

        d(ShareCommandActivity shareCommandActivity) {
            this.f45894b = shareCommandActivity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f45893a, false, 42228, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f45893a, false, 42228, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            this.f45894b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45895a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareCommandActivity f45896b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.share.a.d f45897c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f45898d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.views.b f45899e;

        e(ShareCommandActivity shareCommandActivity, com.ss.android.ugc.aweme.share.a.d dVar, String str, com.ss.android.ugc.aweme.views.b bVar) {
            this.f45896b = shareCommandActivity;
            this.f45897c = dVar;
            this.f45898d = str;
            this.f45899e = bVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f45895a, false, 42229, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f45895a, false, 42229, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            if (this.f45897c != null) {
                Intent intent = new Intent(this.f45896b, AdsAppActivity.class);
                intent.putExtra("from_token", this.f45898d);
                intent.putExtra("token_request_id", this.f45897c.getRid());
                intent.setData(Uri.parse(this.f45897c.getSchema()));
                this.f45896b.startActivity(intent);
                this.f45899e.dismiss();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45900a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.views.b f45901b;

        f(com.ss.android.ugc.aweme.views.b bVar) {
            this.f45901b = bVar;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f45900a, false, 42230, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f45900a, false, 42230, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f45901b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class g implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45902a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareCommandActivity f45903b;

        g(ShareCommandActivity shareCommandActivity) {
            this.f45903b = shareCommandActivity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f45902a, false, 42231, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f45902a, false, 42231, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            this.f45903b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class h implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareCommandActivity f45905b;

        h(ShareCommandActivity shareCommandActivity) {
            this.f45905b = shareCommandActivity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f45904a, false, 42232, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f45904a, false, 42232, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            this.f45905b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 15})
    static final class i implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareCommandActivity f45907b;

        i(ShareCommandActivity shareCommandActivity) {
            this.f45907b = shareCommandActivity;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f45906a, false, 42233, new Class[]{DialogInterface.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f45906a, false, 42233, new Class[]{DialogInterface.class}, Void.TYPE);
                return;
            }
            this.f45907b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class j<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareCommandActivity f45909b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f45910c;

        j(ShareCommandActivity shareCommandActivity, r rVar) {
            this.f45909b = shareCommandActivity;
            this.f45910c = rVar;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            if (PatchProxy.isSupport(new Object[0], this, f45908a, false, 42234, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45908a, false, 42234, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                z = r.a(this.f45910c, r.a(this.f45909b.getIntent().getStringExtra("command_code")));
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class k<TTaskResult, TContinuationResult> implements a.g<Boolean, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45911a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareCommandActivity f45912b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ r f45913c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.share.a.d f45914d;

        k(ShareCommandActivity shareCommandActivity, r rVar, com.ss.android.ugc.aweme.share.a.d dVar) {
            this.f45912b = shareCommandActivity;
            this.f45913c = rVar;
            this.f45914d = dVar;
        }

        public final /* synthetic */ Object then(a.i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f45911a, false, 42235, new Class[]{a.i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f45911a, false, 42235, new Class[]{a.i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
            Object e2 = iVar.e();
            Intrinsics.checkExpressionValueIsNotNull(e2, "it.result");
            if (((Boolean) e2).booleanValue()) {
                this.f45913c.a(this.f45914d);
                this.f45913c.setOnDismissListener(new DialogInterface.OnDismissListener(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f45915a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ k f45916b;

                    {
                        this.f45916b = r1;
                    }

                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f45915a, false, 42236, new Class[]{DialogInterface.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f45915a, false, 42236, new Class[]{DialogInterface.class}, Void.TYPE);
                            return;
                        }
                        this.f45916b.f45912b.finish();
                    }
                });
                this.f45913c.show();
                this.f45912b.f45879b = this.f45913c;
            }
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/ugc/aweme/feed/share/command/ShareCommandActivity$trySmsInviteCodeTrans$1", "Lcom/google/common/util/concurrent/FutureCallback;", "Lcom/ss/android/ugc/aweme/friends/model/SmsParseResponse;", "onFailure", "", "t", "", "onSuccess", "response", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class l implements com.google.common.util.concurrent.k<SmsParseResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f45917a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ShareCommandActivity f45918b;

        l(ShareCommandActivity shareCommandActivity) {
            this.f45918b = shareCommandActivity;
        }

        public final void onFailure(@NotNull Throwable th) {
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{th2}, this, f45917a, false, 42238, new Class[]{Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{th2}, this, f45917a, false, 42238, new Class[]{Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(th2, "t");
            this.f45918b.finish();
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            SmsParseResponse smsParseResponse = (SmsParseResponse) obj;
            if (PatchProxy.isSupport(new Object[]{smsParseResponse}, this, f45917a, false, 42237, new Class[]{SmsParseResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{smsParseResponse}, this, f45917a, false, 42237, new Class[]{SmsParseResponse.class}, Void.TYPE);
                return;
            }
            if (smsParseResponse != null && smsParseResponse.statusCode == 0) {
                User user = smsParseResponse.user;
                if (user != null && !ex.g(user)) {
                    ShareCommandActivity shareCommandActivity = this.f45918b;
                    if (PatchProxy.isSupport(new Object[]{user}, shareCommandActivity, ShareCommandActivity.f45878a, false, 42210, new Class[]{User.class}, Void.TYPE)) {
                        ShareCommandActivity shareCommandActivity2 = shareCommandActivity;
                        PatchProxy.accessDispatch(new Object[]{user}, shareCommandActivity2, ShareCommandActivity.f45878a, false, 42210, new Class[]{User.class}, Void.TYPE);
                    }
                    if (!shareCommandActivity.isFinishing()) {
                        Dialog dialog = shareCommandActivity.f45879b;
                        if (dialog != null) {
                            j.a(dialog);
                        }
                        SmsInviteFriendDialog smsInviteFriendDialog = new SmsInviteFriendDialog(shareCommandActivity, user);
                        smsInviteFriendDialog.setOnDismissListener(new h(shareCommandActivity));
                        smsInviteFriendDialog.show();
                        shareCommandActivity.f45879b = smsInviteFriendDialog;
                        r.a("invite_friend_popup_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("to_user_id", user.getUid()).f34114b);
                    }
                    return;
                }
            }
            this.f45918b.finish();
        }
    }

    private final String a() {
        if (!PatchProxy.isSupport(new Object[0], this, f45878a, false, 42211, new Class[0], String.class)) {
            return "16";
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f45878a, false, 42211, new Class[0], String.class);
    }

    private static String a(int i2) {
        return i2 == 2 ? "shaped" : i2 == 1 ? "general" : "";
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f45878a, false, 42220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45878a, false, 42220, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f45878a, false, 42221, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f45878a, false, 42221, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f45878a, false, 42215, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45878a, false, 42215, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        Dialog dialog = this.f45879b;
        if (dialog != null) {
            j.a(dialog);
        }
        finish();
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f45878a, false, 42207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45878a, false, 42207, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        Dialog dialog = this.f45879b;
        if (dialog != null) {
            j.a(dialog);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r12) {
        /*
            r11 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 42206(0xa4de, float:5.9143E-41)
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            r3 = 0
            r4 = 42206(0xa4de, float:5.9143E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            java.lang.String r0 = "com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            super.onCreate(r12)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IRetrofitService> r1 = com.ss.android.ugc.aweme.framework.services.IRetrofitService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.framework.services.IRetrofitService r0 = (com.ss.android.ugc.aweme.framework.services.IRetrofitService) r0
            java.lang.String r1 = "https://aweme.snssdk.com"
            com.ss.android.ugc.aweme.framework.services.IRetrofit r0 = r0.createNewRetrofit(r1)
            java.lang.Class<com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$ShareCommandApi> r1 = com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity.ShareCommandApi.class
            java.lang.Object r0 = r0.create(r1)
            java.lang.String r1 = "retrofit.create(ShareCommandApi::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$ShareCommandApi r0 = (com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity.ShareCommandApi) r0
            r11.f45880c = r0
            android.content.Intent r7 = r11.getIntent()
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r0)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            r3 = 0
            r4 = 42208(0xa4e0, float:5.9146E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0097
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            r3 = 0
            r4 = 42208(0xa4e0, float:5.9146E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ba
        L_0x0097:
            boolean r0 = com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler.isTeenModeON()
            if (r0 != 0) goto L_0x01ba
            java.lang.String r0 = "command_code"
            java.lang.String r10 = r7.getStringExtra(r0)
            java.lang.String r0 = "command_type"
            java.lang.String r0 = r7.getStringExtra(r0)
            java.lang.String r1 = "qr_code_type"
            int r1 = r7.getIntExtra(r1, r9)
            r11.f45882e = r1
            java.lang.String r2 = "IS_FROM_SCAN"
            boolean r2 = r7.getBooleanExtra(r2, r9)
            r11.f45881d = r2
            r2 = r10
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x00f6
            java.lang.String r2 = "command"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r2)
            java.lang.String r2 = "http://"
            r3 = 0
            r4 = 2
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r10, r2, r9, r4, r3)
            if (r2 != 0) goto L_0x00d9
            java.lang.String r2 = "https://"
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r10, r2, r9, r4, r3)
            if (r2 == 0) goto L_0x00f6
        L_0x00d9:
            android.net.Uri r2 = android.net.Uri.parse(r10)
            java.lang.String r3 = "schema_type"
            java.lang.String r2 = r2.getQueryParameter(r3)
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x00f4
            java.lang.String r3 = "11"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x00f6
        L_0x00f4:
            r2 = 1
            goto L_0x00f7
        L_0x00f6:
            r2 = 0
        L_0x00f7:
            java.lang.String r3 = "link"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r3 != 0) goto L_0x018e
            java.lang.String r3 = "pic"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x0109
            goto L_0x018e
        L_0x0109:
            java.lang.String r2 = "sms_invite_code"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0169
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            r3 = 0
            r4 = 42209(0xa4e1, float:5.9147E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0142
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            r3 = 0
            r4 = 42209(0xa4e1, float:5.9147E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01ba
        L_0x0142:
            boolean r0 = com.ss.android.ugc.aweme.feed.share.command.CommandObserver.a(r10)
            if (r0 == 0) goto L_0x01ba
            com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$ShareCommandApi r0 = r11.f45880c
            if (r0 != 0) goto L_0x0151
            java.lang.String r1 = "mSchemaCommandApi"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0151:
            if (r10 != 0) goto L_0x0156
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0156:
            com.google.common.util.concurrent.q r0 = r0.parseSmsCode(r10)
            com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$l r1 = new com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$l
            r1.<init>(r11)
            com.google.common.util.concurrent.k r1 = (com.google.common.util.concurrent.k) r1
            com.ss.android.ugc.aweme.base.k r2 = com.ss.android.ugc.aweme.base.k.f34752b
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.common.util.concurrent.l.a(r0, r1, r2)
            goto L_0x01ba
        L_0x0169:
            com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$ShareCommandApi r2 = r11.f45880c
            if (r2 != 0) goto L_0x0172
            java.lang.String r3 = "mSchemaCommandApi"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0172:
            java.lang.String r3 = "command"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r3)
            java.lang.String r3 = r11.a()
            com.google.common.util.concurrent.q r2 = r2.getSchema(r10, r3)
            com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$b r3 = new com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$b
            r3.<init>(r11, r0, r1)
            com.google.common.util.concurrent.k r3 = (com.google.common.util.concurrent.k) r3
            com.ss.android.ugc.aweme.base.k r0 = com.ss.android.ugc.aweme.base.k.f34752b
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            com.google.common.util.concurrent.l.a(r2, r3, r0)
            goto L_0x01ba
        L_0x018e:
            if (r2 == 0) goto L_0x0196
            java.lang.String r2 = "UTF-8"
            java.lang.String r10 = java.net.URLEncoder.encode(r10, r2)
        L_0x0196:
            com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$ShareCommandApi r2 = r11.f45880c
            if (r2 != 0) goto L_0x019f
            java.lang.String r3 = "mSchemaCommandApi"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x019f:
            java.lang.String r3 = "tempCommand"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r3)
            java.lang.String r3 = r11.a()
            com.google.common.util.concurrent.q r2 = r2.getUrlSchema(r10, r3)
            com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$a r3 = new com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$a
            r3.<init>(r11, r0, r1)
            com.google.common.util.concurrent.k r3 = (com.google.common.util.concurrent.k) r3
            com.ss.android.ugc.aweme.base.k r0 = com.ss.android.ugc.aweme.base.k.f34752b
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            com.google.common.util.concurrent.l.a(r2, r3, r0)
        L_0x01ba:
            r0 = 2131689545(0x7f0f0049, float:1.9008108E38)
            r11.setContentView((int) r0)
            r0 = 2131166543(0x7f07054f, float:1.7947334E38)
            android.view.View r0 = r11.findViewById(r0)
            com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$c r1 = new com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$c
            r1.<init>(r11)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            java.lang.String r0 = "com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity.onCreate(android.os.Bundle):void");
    }

    private final void a(com.ss.android.ugc.aweme.share.a.d dVar, String str, String str2) {
        String str3;
        com.ss.android.ugc.aweme.share.a.d dVar2 = dVar;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{dVar2, str4, str5}, this, f45878a, false, 42216, new Class[]{com.ss.android.ugc.aweme.share.a.d.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, str4, str5}, this, f45878a, false, 42216, new Class[]{com.ss.android.ugc.aweme.share.a.d.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Dialog dialog = this.f45879b;
        if (dialog != null) {
            j.a(dialog);
        }
        if (Intrinsics.areEqual((Object) str5, (Object) "link")) {
            str3 = getString(C0906R.string.c73, new Object[]{"链接"});
            Intrinsics.checkExpressionValueIsNotNull(str3, "getString(R.string.share_schema_check, \"链接\")");
        } else {
            if (Intrinsics.areEqual((Object) str5, (Object) "token")) {
                str3 = getString(C0906R.string.c73, new Object[]{"口令"});
            } else if (this.f45882e == 2) {
                str3 = getString(C0906R.string.c73, new Object[]{"抖音码"});
            } else {
                str3 = getString(C0906R.string.c73, new Object[]{"二维码"});
            }
            Intrinsics.checkExpressionValueIsNotNull(str3, "if (type == Type.SYMBOL)…\n            }\n\n        }");
        }
        com.ss.android.ugc.aweme.views.b a2 = new b.a().b(str4).a(str3).c(getString(C0906R.string.c76)).a(2130840525).d(getString(C0906R.string.c79)).a((Context) this);
        a2.setCanceledOnTouchOutside(false);
        a2.setOnDismissListener(new d(this));
        a2.a(new e(this, dVar2, str5, a2));
        a2.b(new f(a2));
        a2.show();
        this.f45879b = a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0147, code lost:
        if (r2 == null) goto L_0x0149;
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0370  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.share.a.d r18, java.lang.String r19, int r20) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r13 = 2
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.share.a.d> r1 = com.ss.android.ugc.aweme.share.a.d.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 42212(0xa4e4, float:5.9152E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            r3 = 0
            r4 = 42212(0xa4e4, float:5.9152E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.share.a.d> r1 = com.ss.android.ugc.aweme.share.a.d.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005c:
            boolean r0 = r17.isFinishing()
            if (r0 == 0) goto L_0x0063
            return
        L_0x0063:
            if (r8 != 0) goto L_0x0069
            r17.finish()
            return
        L_0x0069:
            int r0 = r18.getStatusCode()
            if (r0 == 0) goto L_0x009f
            boolean r0 = r7.f45881d
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r18.getStatusMsg()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008e
            r0 = r7
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = r18.getStatusMsg()
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (java.lang.String) r1)
            r0.a()
            goto L_0x009b
        L_0x008e:
            r0 = r7
            android.content.Context r0 = (android.content.Context) r0
            r1 = 2131562400(0x7f0d0fa0, float:1.8750228E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r0, (int) r1)
            r0.a()
        L_0x009b:
            r17.finish()
            return
        L_0x009f:
            java.lang.String r0 = r18.getSchema()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x06b3
            com.ss.android.ugc.aweme.share.a.e r0 = r18.getSchemeDetail()
            if (r0 != 0) goto L_0x00b3
            goto L_0x06b3
        L_0x00b3:
            java.lang.String r0 = ""
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            int r1 = r18.getSchemaType()
            switch(r1) {
                case 1: goto L_0x05c6;
                case 2: goto L_0x0568;
                case 3: goto L_0x0528;
                case 4: goto L_0x04e8;
                case 5: goto L_0x04a8;
                case 6: goto L_0x00c2;
                case 7: goto L_0x0468;
                case 8: goto L_0x00c2;
                case 9: goto L_0x00c2;
                case 10: goto L_0x0405;
                case 11: goto L_0x039d;
                case 12: goto L_0x00c2;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00c2;
                case 15: goto L_0x00c2;
                case 16: goto L_0x02f3;
                case 17: goto L_0x02b3;
                case 18: goto L_0x00c2;
                case 19: goto L_0x0268;
                case 20: goto L_0x0227;
                case 21: goto L_0x01e6;
                case 22: goto L_0x00cb;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            java.lang.String r0 = ""
            r17.finish()
        L_0x00c7:
            r1 = r16
            goto L_0x062b
        L_0x00cb:
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            if (r1 == 0) goto L_0x00c7
            java.lang.String r0 = r18.getShareUserName()
            if (r0 != 0) goto L_0x00d9
            java.lang.String r0 = ""
        L_0x00d9:
            java.lang.String r1 = r18.getSchema()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = "id"
            java.lang.String r1 = r1.getQueryParameter(r2)
            if (r1 != 0) goto L_0x00eb
            java.lang.String r1 = ""
        L_0x00eb:
            r14 = r1
            java.lang.String r1 = r18.getSchema()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            java.lang.String r2 = "attached_activity_id"
            java.lang.String r1 = r1.getQueryParameter(r2)
            if (r1 != 0) goto L_0x00fe
            java.lang.String r1 = ""
        L_0x00fe:
            r16 = r1
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            com.ss.android.ugc.aweme.commercialize.coupon.model.c r1 = r1.couponInfo
            if (r1 == 0) goto L_0x0181
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            com.ss.android.ugc.aweme.commercialize.coupon.model.c r1 = r1.couponInfo
            java.lang.String r2 = "result.schemeDetail.couponInfo"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getTitle()
            java.lang.String r2 = "result.schemeDetail.couponInfo.title"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0126
            r1 = 1
            goto L_0x0127
        L_0x0126:
            r1 = 0
        L_0x0127:
            if (r1 == 0) goto L_0x012a
            goto L_0x0181
        L_0x012a:
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            java.lang.String r2 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getPoiName()
            if (r1 != 0) goto L_0x013b
            java.lang.String r1 = ""
        L_0x013b:
            com.ss.android.ugc.aweme.share.a.e r2 = r18.getSchemeDetail()
            com.ss.android.ugc.aweme.commercialize.coupon.model.c r2 = r2.couponInfo
            if (r2 == 0) goto L_0x0149
            java.lang.String r2 = r2.getTitle()
            if (r2 != 0) goto L_0x014b
        L_0x0149:
            java.lang.String r2 = ""
        L_0x014b:
            com.ss.android.ugc.aweme.share.a.e r3 = r18.getSchemeDetail()
            com.ss.android.ugc.aweme.commercialize.coupon.model.c r3 = r3.couponInfo
            java.lang.String r4 = "result.schemeDetail.couponInfo"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            int r3 = r3.getCouponId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 2131562417(0x7f0d0fb1, float:1.8750262E38)
            java.lang.String r4 = r7.getString(r4)
            java.lang.String r5 = "getString(R.string.share_schema_coupon_text)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r11] = r0
            r5[r12] = r1
            r5[r13] = r2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r10)
            java.lang.String r0 = java.lang.String.format(r4, r0)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r15 = r3
            goto L_0x019e
        L_0x0181:
            r1 = 2131562418(0x7f0d0fb2, float:1.8750264E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r2 = "getString(R.string.share…ma_coupon_text_over_time)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r11] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r12)
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
        L_0x019e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r18.getSchema()
            r1.append(r2)
            java.lang.String r2 = "&from_user_id="
            r1.append(r2)
            java.lang.String r2 = r18.getShareUserId()
            r1.append(r2)
            java.lang.String r2 = "&to_user_id="
            r1.append(r2)
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r3 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getCurUserId()
            r1.append(r2)
            java.lang.String r2 = "&coupon_id="
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = "&enter_from=token_coupon&enter_method=click_poi_coupon"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8.setSchema(r1)
            r7.a((com.ss.android.ugc.aweme.share.a.d) r8, (java.lang.String) r0, (java.lang.String) r9)
            java.lang.String r0 = "poi_coupon"
            goto L_0x00c7
        L_0x01e6:
            com.ss.android.ugc.aweme.share.a.e r0 = r18.getSchemeDetail()
            java.lang.String r1 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r0 = r0.getNickName()
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0203
            r0 = 2131561157(0x7f0d0ac5, float:1.8747707E38)
            java.lang.String r0 = r7.getString(r0)
        L_0x0203:
            r1 = 2131559230(0x7f0d033e, float:1.8743798E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r2 = "getString(R.string.command_dialog_goods_shop_tip)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r11] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r12)
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.a((com.ss.android.ugc.aweme.share.a.d) r8, (java.lang.String) r0, (java.lang.String) r9)
            java.lang.String r0 = ""
            goto L_0x00c7
        L_0x0227:
            com.ss.android.ugc.aweme.share.a.e r0 = r18.getSchemeDetail()
            java.lang.String r1 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r0 = r0.getGoodsName()
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0244
            r0 = 2131558426(0x7f0d001a, float:1.8742167E38)
            java.lang.String r0 = r7.getString(r0)
        L_0x0244:
            r1 = 2131559232(0x7f0d0340, float:1.8743802E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r2 = "getString(R.string.command_dialog_goods_tip)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r11] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r12)
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.a((com.ss.android.ugc.aweme.share.a.d) r8, (java.lang.String) r0, (java.lang.String) r9)
            java.lang.String r0 = ""
            goto L_0x00c7
        L_0x0268:
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            java.lang.String r2 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getAuthorUserName()
            if (r1 == 0) goto L_0x00c7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "@"
            r0.<init>(r1)
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            java.lang.String r2 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getForwardUserName()
            r0.append(r1)
            java.lang.String r1 = "转发了@"
            r0.append(r1)
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            java.lang.String r2 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getAuthorUserName()
            r0.append(r1)
            java.lang.String r1 = "的视频"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.a((com.ss.android.ugc.aweme.share.a.d) r8, (java.lang.String) r0, (java.lang.String) r9)
            java.lang.String r0 = "forward"
            goto L_0x00c7
        L_0x02b3:
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            java.lang.String r2 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getStickerName()
            if (r1 == 0) goto L_0x00c7
            r0 = 2131562426(0x7f0d0fba, float:1.875028E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "getString(R.string.share…hema_sticker_detail_text)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.ss.android.ugc.aweme.share.a.e r2 = r18.getSchemeDetail()
            java.lang.String r3 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getStickerName()
            r1[r11] = r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r12)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.a((com.ss.android.ugc.aweme.share.a.d) r8, (java.lang.String) r0, (java.lang.String) r9)
            java.lang.String r0 = "sticker_detail"
            goto L_0x00c7
        L_0x02f3:
            java.lang.String r0 = r18.getShareUserId()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r2 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getCurUserId()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x0313
            r17.finish()
            goto L_0x0399
        L_0x0313:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            r3 = 0
            r4 = 42217(0xa4e9, float:5.9159E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.share.a.d> r1 = com.ss.android.ugc.aweme.share.a.d.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0351
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            r3 = 0
            r4 = 42217(0xa4e9, float:5.9159E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.share.a.d> r1 = com.ss.android.ugc.aweme.share.a.d.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0399
        L_0x0351:
            android.app.Dialog r0 = r7.f45879b
            if (r0 == 0) goto L_0x0358
            com.ss.android.ugc.aweme.feed.share.command.j.a(r0)
        L_0x0358:
            com.ss.android.ugc.aweme.share.invitefriends.response.InviteFriendResponseDialog$a r0 = new com.ss.android.ugc.aweme.share.invitefriends.response.InviteFriendResponseDialog$a
            r0.<init>()
            r1 = 0
            if (r8 == 0) goto L_0x036b
            com.ss.android.ugc.aweme.share.a.e r2 = r18.getSchemeDetail()
            if (r2 == 0) goto L_0x036b
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getUserAvartar()
            goto L_0x036c
        L_0x036b:
            r2 = r1
        L_0x036c:
            r0.f65125e = r2
            if (r8 == 0) goto L_0x037a
            com.ss.android.ugc.aweme.share.a.e r2 = r18.getSchemeDetail()
            if (r2 == 0) goto L_0x037a
            java.lang.String r1 = r2.getNickName()
        L_0x037a:
            r0.f65124d = r1
            r0.f65122b = r8
            r0.f65123c = r9
            com.ss.android.ugc.aweme.share.invitefriends.response.InviteFriendResponseDialog r1 = new com.ss.android.ugc.aweme.share.invitefriends.response.InviteFriendResponseDialog
            r2 = r7
            android.app.Activity r2 = (android.app.Activity) r2
            r1.<init>(r2, r0)
            com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$g r0 = new com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$g
            r0.<init>(r7)
            android.content.DialogInterface$OnDismissListener r0 = (android.content.DialogInterface.OnDismissListener) r0
            r1.setOnDismissListener(r0)
            r1.show()
            android.app.Dialog r1 = (android.app.Dialog) r1
            r7.f45879b = r1
        L_0x0399:
            java.lang.String r0 = "invite"
            goto L_0x00c7
        L_0x039d:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            r3 = 0
            r4 = 42214(0xa4e6, float:5.9154E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.share.a.d> r1 = com.ss.android.ugc.aweme.share.a.d.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x03db
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            r3 = 0
            r4 = 42214(0xa4e6, float:5.9154E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.share.a.d> r1 = com.ss.android.ugc.aweme.share.a.d.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0401
        L_0x03db:
            android.app.Dialog r0 = r7.f45879b
            if (r0 == 0) goto L_0x03e2
            com.ss.android.ugc.aweme.feed.share.command.j.a(r0)
        L_0x03e2:
            com.ss.android.ugc.aweme.feed.share.command.r r0 = new com.ss.android.ugc.aweme.feed.share.command.r
            r1 = r7
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1, r9)
            com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$j r1 = new com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$j
            r1.<init>(r7, r0)
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            a.i r1 = a.i.a((java.util.concurrent.Callable<TResult>) r1)
            com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$k r2 = new com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$k
            r2.<init>(r7, r0, r8)
            a.g r2 = (a.g) r2
            java.util.concurrent.Executor r0 = a.i.f1052b
            r1.a((a.g<TResult, TContinuationResult>) r2, (java.util.concurrent.Executor) r0)
        L_0x0401:
            java.lang.String r0 = "webview"
            goto L_0x00c7
        L_0x0405:
            java.lang.String r1 = ""
            java.lang.String r2 = r18.getSchema()
            java.lang.String r3 = "type"
            java.lang.String r2 = com.ss.android.ugc.aweme.ag.k.b(r2, r3)
            int r2 = java.lang.Integer.parseInt(r2)
            switch(r2) {
                case 0: goto L_0x0455;
                case 1: goto L_0x0446;
                case 2: goto L_0x0437;
                case 3: goto L_0x0428;
                case 4: goto L_0x0419;
                default: goto L_0x0418;
            }
        L_0x0418:
            goto L_0x0463
        L_0x0419:
            r0 = 2131558830(0x7f0d01ae, float:1.8742987E38)
            java.lang.String r1 = r7.getString(r0)
            java.lang.String r0 = "getString(R.string.aweme_ranking_of_star)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r0)
            java.lang.String r0 = "hot_search_star_board"
            goto L_0x0463
        L_0x0428:
            r0 = 2131558829(0x7f0d01ad, float:1.8742985E38)
            java.lang.String r1 = r7.getString(r0)
            java.lang.String r0 = "getString(R.string.aweme…nking_of_positive_energy)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r0)
            java.lang.String r0 = "hot_search_positive_energy_board"
            goto L_0x0463
        L_0x0437:
            r0 = 2131558828(0x7f0d01ac, float:1.8742983E38)
            java.lang.String r1 = r7.getString(r0)
            java.lang.String r0 = "getString(R.string.aweme_ranking_of_music)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r0)
            java.lang.String r0 = "hot_search_music_board"
            goto L_0x0463
        L_0x0446:
            r0 = 2131558831(0x7f0d01af, float:1.8742989E38)
            java.lang.String r1 = r7.getString(r0)
            java.lang.String r0 = "getString(R.string.aweme_ranking_of_video)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r0)
            java.lang.String r0 = "hot_search_video_board"
            goto L_0x0463
        L_0x0455:
            r0 = 2131558832(0x7f0d01b0, float:1.874299E38)
            java.lang.String r1 = r7.getString(r0)
            java.lang.String r0 = "getString(R.string.aweme_ranking_of_word)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r0)
            java.lang.String r0 = "hot_search_board"
        L_0x0463:
            r7.a((com.ss.android.ugc.aweme.share.a.d) r8, (java.lang.String) r1, (java.lang.String) r9)
            goto L_0x00c7
        L_0x0468:
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            java.lang.String r2 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getPoiName()
            if (r1 == 0) goto L_0x00c7
            r0 = 2131562423(0x7f0d0fb7, float:1.8750274E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "getString(R.string.share_schema_poi_text)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.ss.android.ugc.aweme.share.a.e r2 = r18.getSchemeDetail()
            java.lang.String r3 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getPoiName()
            r1[r11] = r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r12)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.a((com.ss.android.ugc.aweme.share.a.d) r8, (java.lang.String) r0, (java.lang.String) r9)
            java.lang.String r0 = "poi"
            goto L_0x00c7
        L_0x04a8:
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            java.lang.String r2 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getLiveUserName()
            if (r1 == 0) goto L_0x00c7
            r0 = 2131562420(0x7f0d0fb4, float:1.8750268E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "getString(R.string.share_schema_live_text)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.ss.android.ugc.aweme.share.a.e r2 = r18.getSchemeDetail()
            java.lang.String r3 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getLiveUserName()
            r1[r11] = r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r12)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.a((com.ss.android.ugc.aweme.share.a.d) r8, (java.lang.String) r0, (java.lang.String) r9)
            java.lang.String r0 = "live"
            goto L_0x00c7
        L_0x04e8:
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            java.lang.String r2 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getNickName()
            if (r1 == 0) goto L_0x00c7
            r0 = 2131562424(0x7f0d0fb8, float:1.8750276E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "getString(R.string.share_schema_profile_text)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.ss.android.ugc.aweme.share.a.e r2 = r18.getSchemeDetail()
            java.lang.String r3 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getNickName()
            r1[r11] = r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r12)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.a((com.ss.android.ugc.aweme.share.a.d) r8, (java.lang.String) r0, (java.lang.String) r9)
            java.lang.String r0 = "person"
            goto L_0x00c7
        L_0x0528:
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            java.lang.String r2 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getMusicTitle()
            if (r1 == 0) goto L_0x00c7
            r0 = 2131562421(0x7f0d0fb5, float:1.875027E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "getString(R.string.share_schema_music_text)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            com.ss.android.ugc.aweme.share.a.e r2 = r18.getSchemeDetail()
            java.lang.String r3 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getMusicTitle()
            r1[r11] = r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r12)
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.a((com.ss.android.ugc.aweme.share.a.d) r8, (java.lang.String) r0, (java.lang.String) r9)
            java.lang.String r0 = "music"
            goto L_0x00c7
        L_0x0568:
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            java.lang.String r2 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.share.a.b r1 = r1.getTransChallenge()
            if (r1 == 0) goto L_0x00c7
            com.ss.android.ugc.aweme.share.a.e r0 = r18.getSchemeDetail()
            java.lang.String r1 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.share.a.b r0 = r0.getTransChallenge()
            java.lang.String r1 = "result.schemeDetail.transChallenge"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r0 = r0.getChaName()
            com.ss.android.ugc.aweme.share.a.e r1 = r18.getSchemeDetail()
            java.lang.String r2 = "result.schemeDetail"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.share.a.b r1 = r1.getTransChallenge()
            java.lang.String r2 = "result.schemeDetail.transChallenge"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.getAuthorName()
            r1 = 2131562415(0x7f0d0faf, float:1.8750258E38)
            java.lang.String r1 = r7.getString(r1)
            java.lang.String r2 = "getString(R.string.share_schema_challenge_text)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r2[r11] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r12)
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r7.a((com.ss.android.ugc.aweme.share.a.d) r8, (java.lang.String) r0, (java.lang.String) r9)
            java.lang.String r0 = "tag"
            goto L_0x00c7
        L_0x05c6:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            r3 = 0
            r4 = 42213(0xa4e5, float:5.9153E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.share.a.d> r1 = com.ss.android.ugc.aweme.share.a.d.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0604
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f45878a
            r3 = 0
            r4 = 42213(0xa4e5, float:5.9153E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<com.ss.android.ugc.aweme.share.a.d> r1 = com.ss.android.ugc.aweme.share.a.d.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0627
        L_0x0604:
            android.app.Dialog r0 = r7.f45879b
            if (r0 == 0) goto L_0x060b
            com.ss.android.ugc.aweme.feed.share.command.j.a(r0)
        L_0x060b:
            com.ss.android.ugc.aweme.feed.share.command.m r0 = new com.ss.android.ugc.aweme.feed.share.command.m
            r1 = r7
            android.content.Context r1 = (android.content.Context) r1
            r0.<init>(r1, r9)
            r0.a(r8)
            com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$i r1 = new com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity$i
            r1.<init>(r7)
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            r0.setOnDismissListener(r1)
            r0.show()
            android.app.Dialog r0 = (android.app.Dialog) r0
            r7.f45879b = r0
        L_0x0627:
            java.lang.String r0 = "video"
            goto L_0x00c7
        L_0x062b:
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "from_iid"
            long r4 = r18.getIid()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (long) r4)
            java.lang.String r3 = "request_id"
            java.lang.String r4 = r18.getRid()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "token_from"
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r9)
            java.lang.String r3 = "to_user_id"
            com.ss.android.ugc.aweme.IAccountUserService r4 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r5 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            java.lang.String r4 = r4.getCurUserId()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "from_user_id"
            java.lang.String r4 = r18.getShareUserId()
            com.ss.android.ugc.aweme.app.d.d r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "token_type"
            com.ss.android.ugc.aweme.app.d.d r0 = r2.a((java.lang.String) r3, (java.lang.String) r0)
            java.lang.String r2 = a(r20)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0681
            java.lang.String r2 = "qr_code_type"
            java.lang.String r3 = a(r20)
            r0.a((java.lang.String) r2, (java.lang.String) r3)
        L_0x0681:
            r2 = r14
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x068f
            java.lang.String r2 = "poi_id"
            r0.a((java.lang.String) r2, (java.lang.String) r14)
        L_0x068f:
            r2 = r15
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x069d
            java.lang.String r2 = "coupon_id"
            r0.a((java.lang.String) r2, (java.lang.String) r15)
        L_0x069d:
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x06ab
            java.lang.String r2 = "activity_id"
            r0.a((java.lang.String) r2, (java.lang.String) r1)
        L_0x06ab:
            java.lang.String r1 = "token_find"
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r0)
            return
        L_0x06b3:
            r17.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.share.command.ShareCommandActivity.a(com.ss.android.ugc.aweme.share.a.d, java.lang.String, int):void");
    }
}
