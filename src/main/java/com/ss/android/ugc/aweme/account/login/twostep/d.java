package com.ss.android.ugc.aweme.account.login.twostep;

import a.g;
import a.i;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;
import com.ss.android.ugc.aweme.account.login.twostep.f;
import com.ss.android.ugc.aweme.account.ui.TwoStepAuthActivity;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.ej;
import com.ss.android.ugc.aweme.utils.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\"\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J!\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0002\u0010$J\u0012\u0010%\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010\u000fH\u0002JD\u0010'\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u000f2\b\u0010)\u001a\u0004\u0018\u00010\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/twostep/ThirdPartyAuthenticator;", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator;", "Lcom/ss/android/ugc/aweme/account/base/activity/AmeSSActivity$IOnActivityResultListener;", "activity", "Landroid/support/v7/app/AppCompatActivity;", "viewStub", "Landroid/view/ViewStub;", "authCallback", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$AuthResult;", "(Landroid/support/v7/app/AppCompatActivity;Landroid/view/ViewStub;Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthenticator$AuthResult;)V", "appListLayout", "Landroid/widget/LinearLayout;", "itemClickListener", "Landroid/view/View$OnClickListener;", "verifyTicket", "", "checkWeChatStatus", "", "createItemFromName", "Lcom/ss/android/ugc/aweme/account/login/twostep/AppItem;", "platform", "inflateView", "Landroid/view/View;", "initViews", "", "view", "loadAppList", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onThirdPartyFailed", "errorCode", "errorDesc", "(Ljava/lang/Integer;Ljava/lang/String;)V", "onThirdPartySuccess", "ticket", "verifyThirdPartyResult", "code", "state", "openId", "accessToken", "expiresIn", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class d extends f implements AmeSSActivity.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32317a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f32318b;

    /* renamed from: c  reason: collision with root package name */
    public View.OnClickListener f32319c;

    /* renamed from: d  reason: collision with root package name */
    public String f32320d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 13})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32321a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f32322b;

        a(d dVar) {
            this.f32322b = dVar;
        }

        public final void onClick(View view) {
            boolean z;
            View view2 = view;
            if (PatchProxy.isSupport(new Object[]{view2}, this, f32321a, false, 20378, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f32321a, false, 20378, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            String str = null;
            Intrinsics.checkExpressionValueIsNotNull(view2, AdvanceSetting.NETWORK_TYPE);
            int id = view.getId();
            if (id == 2130839830) {
                str = "sina_weibo";
            } else if (id == 2130839828) {
                d dVar = this.f32322b;
                if (PatchProxy.isSupport(new Object[0], dVar, d.f32317a, false, 20377, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], dVar, d.f32317a, false, 20377, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    boolean b2 = ej.b(dVar.c(), "com.tencent.mm");
                    if (!b2) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) dVar.c(), (int) C0906R.string.hq).a();
                    }
                    z = b2;
                }
                if (z) {
                    str = "weixin";
                } else {
                    return;
                }
            } else if (id == 2130839823) {
                str = "qzone_sns";
            } else if (id == 2130839818) {
                str = "flipchat";
            } else if (id == 2130839826) {
                str = "toutiao";
            }
            Intent intent = new Intent(this.f32322b.c(), AuthorizeActivity.class);
            intent.putExtra("platform", str);
            intent.putExtra("IS_AUTHORIZE_ONLY", true);
            intent.putExtra("is_login", false);
            if (this.f32322b.c() instanceof TwoStepAuthActivity) {
                AppCompatActivity c2 = this.f32322b.c();
                if (c2 != null) {
                    ((TwoStepAuthActivity) c2).n = this.f32322b;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.ui.TwoStepAuthActivity");
                }
            }
            AppCompatActivity c3 = this.f32322b.c();
            if (c3 != null) {
                c3.startActivityForResult(intent, 123);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/account/login/twostep/AppItem;", "Lkotlin/collections/ArrayList;", "call"}, k = 3, mv = {1, 1, 13})
    static final class b<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f32324b;

        b(d dVar) {
            this.f32324b = dVar;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e4, code lost:
            if (r5.equals("toutiao_v2") != false) goto L_0x012f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x012d, code lost:
            if (r5.equals("toutiao") != false) goto L_0x012f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x012f, code lost:
            r7 = r13.c();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0138, code lost:
            if (r7 == null) goto L_0x0142;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x013a, code lost:
            r7 = r7.getString(com.ss.android.ugc.aweme.C0906R.string.co8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0142, code lost:
            r7 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0143, code lost:
            new com.ss.android.ugc.aweme.account.login.twostep.a(2130839826, r7);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object call() {
            /*
                r14 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f32323a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<java.util.ArrayList> r7 = java.util.ArrayList.class
                r4 = 0
                r5 = 20379(0x4f9b, float:2.8557E-41)
                r2 = r14
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0026
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f32323a
                r5 = 0
                r6 = 20379(0x4f9b, float:2.8557E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
                r3 = r14
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                return r0
            L_0x0026:
                com.ss.android.ugc.aweme.account.login.twostep.d r1 = r14.f32324b
                org.json.JSONObject r1 = r1.l
                r2 = 0
                if (r1 == 0) goto L_0x0034
                java.lang.String r3 = "data"
                org.json.JSONObject r1 = r1.getJSONObject(r3)
                goto L_0x0035
            L_0x0034:
                r1 = r2
            L_0x0035:
                if (r1 == 0) goto L_0x003e
                java.lang.String r3 = "platforms"
                org.json.JSONArray r3 = r1.getJSONArray(r3)
                goto L_0x003f
            L_0x003e:
                r3 = r2
            L_0x003f:
                com.ss.android.ugc.aweme.account.login.twostep.d r4 = r14.f32324b
                java.lang.String r5 = "verify_ticket"
                java.lang.String r6 = ""
                java.lang.String r1 = com.bytedance.common.utility.JsonUtils.queryString(r1, r5, r6)
                r4.f32320d = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r4 = 1
                if (r3 == 0) goto L_0x0067
                int r5 = r3.length()
                int r5 = r5 - r4
                if (r5 < 0) goto L_0x0067
                r6 = 0
            L_0x005b:
                java.lang.String r7 = r3.getString(r6)
                r1.add(r7)
                if (r6 == r5) goto L_0x0067
                int r6 = r6 + 1
                goto L_0x005b
            L_0x0067:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x0070:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L_0x016f
                java.lang.Object r5 = r1.next()
                java.lang.String r5 = (java.lang.String) r5
                com.ss.android.ugc.aweme.account.login.twostep.d r13 = r14.f32324b
                java.lang.Object[] r6 = new java.lang.Object[r4]
                r6[r0] = r5
                com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.account.login.twostep.d.f32317a
                r9 = 0
                r10 = 20376(0x4f98, float:2.8553E-41)
                java.lang.Class[] r11 = new java.lang.Class[r4]
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                r11[r0] = r7
                java.lang.Class<com.ss.android.ugc.aweme.account.login.twostep.a> r12 = com.ss.android.ugc.aweme.account.login.twostep.a.class
                r7 = r13
                boolean r6 = com.meituan.robust.PatchProxy.isSupport(r6, r7, r8, r9, r10, r11, r12)
                if (r6 == 0) goto L_0x00b0
                java.lang.Object[] r6 = new java.lang.Object[r4]
                r6[r0] = r5
                com.meituan.robust.ChangeQuickRedirect r8 = com.ss.android.ugc.aweme.account.login.twostep.d.f32317a
                r9 = 0
                r10 = 20376(0x4f98, float:2.8553E-41)
                java.lang.Class[] r11 = new java.lang.Class[r4]
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r11[r0] = r5
                java.lang.Class<com.ss.android.ugc.aweme.account.login.twostep.a> r12 = com.ss.android.ugc.aweme.account.login.twostep.a.class
                r7 = r13
                java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r6, r7, r8, r9, r10, r11, r12)
                com.ss.android.ugc.aweme.account.login.twostep.a r5 = (com.ss.android.ugc.aweme.account.login.twostep.a) r5
                goto L_0x0168
            L_0x00b0:
                if (r5 != 0) goto L_0x00b4
                goto L_0x0167
            L_0x00b4:
                int r6 = r5.hashCode()
                switch(r6) {
                    case -1530308138: goto L_0x0147;
                    case -1134307907: goto L_0x0127;
                    case -791575966: goto L_0x0107;
                    case -471473230: goto L_0x00e7;
                    case 635922494: goto L_0x00de;
                    case 1851692357: goto L_0x00bd;
                    default: goto L_0x00bb;
                }
            L_0x00bb:
                goto L_0x0167
            L_0x00bd:
                java.lang.String r6 = "flipchat"
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L_0x0167
                com.ss.android.ugc.aweme.account.login.twostep.a r5 = new com.ss.android.ugc.aweme.account.login.twostep.a
                r6 = 2130839818(0x7f02090a, float:1.7284657E38)
                android.support.v7.app.AppCompatActivity r7 = r13.c()
                if (r7 == 0) goto L_0x00d8
                r8 = 2131560034(0x7f0d0662, float:1.8745429E38)
                java.lang.String r7 = r7.getString(r8)
                goto L_0x00d9
            L_0x00d8:
                r7 = r2
            L_0x00d9:
                r5.<init>(r6, r7)
                goto L_0x0168
            L_0x00de:
                java.lang.String r6 = "toutiao_v2"
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L_0x0167
                goto L_0x012f
            L_0x00e7:
                java.lang.String r6 = "sina_weibo"
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L_0x0167
                com.ss.android.ugc.aweme.account.login.twostep.a r5 = new com.ss.android.ugc.aweme.account.login.twostep.a
                r6 = 2130839830(0x7f020916, float:1.7284682E38)
                android.support.v7.app.AppCompatActivity r7 = r13.c()
                if (r7 == 0) goto L_0x0102
                r8 = 2131564638(0x7f0d185e, float:1.8754767E38)
                java.lang.String r7 = r7.getString(r8)
                goto L_0x0103
            L_0x0102:
                r7 = r2
            L_0x0103:
                r5.<init>(r6, r7)
                goto L_0x0168
            L_0x0107:
                java.lang.String r6 = "weixin"
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L_0x0167
                com.ss.android.ugc.aweme.account.login.twostep.a r5 = new com.ss.android.ugc.aweme.account.login.twostep.a
                r6 = 2130839828(0x7f020914, float:1.7284678E38)
                android.support.v7.app.AppCompatActivity r7 = r13.c()
                if (r7 == 0) goto L_0x0122
                r8 = 2131564650(0x7f0d186a, float:1.8754791E38)
                java.lang.String r7 = r7.getString(r8)
                goto L_0x0123
            L_0x0122:
                r7 = r2
            L_0x0123:
                r5.<init>(r6, r7)
                goto L_0x0168
            L_0x0127:
                java.lang.String r6 = "toutiao"
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L_0x0167
            L_0x012f:
                com.ss.android.ugc.aweme.account.login.twostep.a r5 = new com.ss.android.ugc.aweme.account.login.twostep.a
                r6 = 2130839826(0x7f020912, float:1.7284674E38)
                android.support.v7.app.AppCompatActivity r7 = r13.c()
                if (r7 == 0) goto L_0x0142
                r8 = 2131563087(0x7f0d124f, float:1.8751621E38)
                java.lang.String r7 = r7.getString(r8)
                goto L_0x0143
            L_0x0142:
                r7 = r2
            L_0x0143:
                r5.<init>(r6, r7)
                goto L_0x0168
            L_0x0147:
                java.lang.String r6 = "qzone_sns"
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L_0x0167
                com.ss.android.ugc.aweme.account.login.twostep.a r5 = new com.ss.android.ugc.aweme.account.login.twostep.a
                r6 = 2130839823(0x7f02090f, float:1.7284667E38)
                android.support.v7.app.AppCompatActivity r7 = r13.c()
                if (r7 == 0) goto L_0x0162
                r8 = 2131561939(0x7f0d0dd3, float:1.8749293E38)
                java.lang.String r7 = r7.getString(r8)
                goto L_0x0163
            L_0x0162:
                r7 = r2
            L_0x0163:
                r5.<init>(r6, r7)
                goto L_0x0168
            L_0x0167:
                r5 = r2
            L_0x0168:
                if (r5 == 0) goto L_0x0070
                r3.add(r5)
                goto L_0x0070
            L_0x016f:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.d.b.call():java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012n\u0010\u0002\u001aj\u0012.\u0012,\u0012\u0004\u0012\u00020\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00060\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006 \u0007*4\u0012.\u0012,\u0012\u0004\u0012\u00020\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00060\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/account/login/twostep/AppItem;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "then", "(Lbolts/Task;)Lkotlin/Unit;"}, k = 3, mv = {1, 1, 13})
    static final class c<TTaskResult, TContinuationResult> implements g<ArrayList<a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f32326b;

        c(d dVar) {
            this.f32326b = dVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f32325a, false, 20380, new Class[]{i.class}, Unit.class)) {
                return (Unit) PatchProxy.accessDispatch(new Object[]{iVar}, this, f32325a, false, 20380, new Class[]{i.class}, Unit.class);
            } else if (!y.a(iVar)) {
                return null;
            } else {
                int a2 = u.a(16.0d);
                Intrinsics.checkExpressionValueIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
                Iterator it2 = ((ArrayList) iVar.e()).iterator();
                while (it2.hasNext()) {
                    a aVar = (a) it2.next();
                    com.ss.android.ugc.aweme.account.ui.g a3 = new com.ss.android.ugc.aweme.account.ui.g(this.f32326b.c()).a(aVar.f32278b, aVar.f32279c);
                    Intrinsics.checkExpressionValueIsNotNull(a3, "view");
                    a3.setId(aVar.f32278b);
                    a3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    a3.setBackgroundResource(2130841606);
                    a3.setPadding(a2, a2, a2, a2);
                    View.OnClickListener onClickListener = this.f32326b.f32319c;
                    if (onClickListener == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("itemClickListener");
                    }
                    a3.setOnClickListener(onClickListener);
                    LinearLayout linearLayout = this.f32326b.f32318b;
                    if (linearLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("appListLayout");
                    }
                    linearLayout.addView(a3);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$TwoStepApiResponse;", "kotlin.jvm.PlatformType", "then", "(Lbolts/Task;)Lkotlin/Unit;"}, k = 3, mv = {1, 1, 13})
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$d  reason: collision with other inner class name */
    static final class C0412d<TTaskResult, TContinuationResult> implements g<TwoStepAuthApi.a, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32327a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f32328b;

        C0412d(d dVar) {
            this.f32328b = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00f8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(a.i r19) {
            /*
                r18 = this;
                r7 = r18
                r8 = r19
                r9 = 1
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r10 = 0
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f32327a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<kotlin.Unit> r6 = kotlin.Unit.class
                r3 = 0
                r4 = 20381(0x4f9d, float:2.856E-41)
                r1 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f32327a
                r3 = 0
                r4 = 20381(0x4f9d, float:2.856E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class<a.i> r1 = a.i.class
                r5[r10] = r1
                java.lang.Class<kotlin.Unit> r6 = kotlin.Unit.class
                r1 = r18
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                kotlin.Unit r0 = (kotlin.Unit) r0
                return r0
            L_0x0039:
                boolean r0 = com.ss.android.ugc.aweme.utils.y.a((a.i) r19)
                r1 = 0
                if (r0 != 0) goto L_0x0048
                com.ss.android.ugc.aweme.account.login.twostep.d r0 = r7.f32328b
                java.lang.String r2 = "TwoStepAuthApi.verifyThirdParty bolts Task error"
                r0.a(r1, r2)
                return r1
            L_0x0048:
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r0)
                java.lang.Object r0 = r19.e()
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a r0 = (com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.a) r0
                java.lang.String r2 = r0.f32271b
                if (r2 == 0) goto L_0x006b
                if (r2 == 0) goto L_0x0063
                java.lang.String r2 = r2.toLowerCase()
                java.lang.String r3 = "(this as java.lang.String).toLowerCase()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
                goto L_0x006c
            L_0x0063:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x006b:
                r2 = r1
            L_0x006c:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                java.lang.String r3 = "success"
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 == 0) goto L_0x00ec
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r2 = r0.f32272c
                if (r2 == 0) goto L_0x00ec
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r2 = r0.f32272c
                java.lang.String r2 = r2.f32274b
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L_0x0089
                goto L_0x00ec
            L_0x0089:
                com.ss.android.ugc.aweme.account.login.twostep.d r1 = r7.f32328b
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r0 = r0.f32272c
                java.lang.String r0 = r0.f32274b
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.login.twostep.d.f32317a
                r14 = 0
                r15 = 20374(0x4f96, float:2.855E-41)
                java.lang.Class[] r2 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r2[r10] = r3
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r1
                r16 = r2
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
                if (r2 == 0) goto L_0x00c1
                java.lang.Object[] r11 = new java.lang.Object[r9]
                r11[r10] = r0
                com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.account.login.twostep.d.f32317a
                r14 = 0
                r15 = 20374(0x4f96, float:2.855E-41)
                java.lang.Class[] r0 = new java.lang.Class[r9]
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r0[r10] = r2
                java.lang.Class r17 = java.lang.Void.TYPE
                r12 = r1
                r16 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
                goto L_0x00e9
            L_0x00c1:
                java.lang.String r2 = "double_verify_pass"
                com.ss.android.ugc.aweme.account.a.a.b r3 = new com.ss.android.ugc.aweme.account.a.a.b
                r3.<init>()
                java.lang.String r4 = "enter_url"
                java.lang.String r5 = r1.m
                com.ss.android.ugc.aweme.account.a.a.b r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "verify_way"
                java.lang.String r5 = "third_party_verify"
                com.ss.android.ugc.aweme.account.a.a.b r3 = r3.a((java.lang.String) r4, (java.lang.String) r5)
                java.lang.String r4 = "verify_pass"
                com.ss.android.ugc.aweme.account.a.a.b r3 = r3.a((java.lang.String) r4, (int) r9)
                java.util.Map<java.lang.String, java.lang.String> r3 = r3.f31599b
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r2, (java.util.Map) r3)
                r1.d()
                r1.b(r0)
            L_0x00e9:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L_0x00ec:
                if (r0 == 0) goto L_0x00f5
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r2 = r0.f32272c
                if (r2 == 0) goto L_0x00f5
                java.lang.Integer r2 = r2.f32275c
                goto L_0x00f6
            L_0x00f5:
                r2 = r1
            L_0x00f6:
                if (r0 == 0) goto L_0x00ff
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a r0 = r0.f32272c
                if (r0 == 0) goto L_0x00ff
                java.lang.String r0 = r0.f32276d
                goto L_0x0100
            L_0x00ff:
                r0 = r1
            L_0x0100:
                com.ss.android.ugc.aweme.account.login.twostep.d r3 = r7.f32328b
                r3.a(r2, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.d.C0412d.then(a.i):java.lang.Object");
        }
    }

    @Nullable
    public final View a() {
        if (PatchProxy.isSupport(new Object[0], this, f32317a, false, 20369, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f32317a, false, 20369, new Class[0], View.class);
        }
        if (this.n.getLayoutResource() <= 0) {
            this.n.setLayoutResource(C0906R.layout.a9r);
        }
        View inflate = this.n.inflate();
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f32317a, false, 20370, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f32317a, false, 20370, new Class[]{View.class}, Void.TYPE);
        } else if (inflate != null) {
            View findViewById = inflate.findViewById(C0906R.id.dmk);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.t…_auth_third_party_layout)");
            this.f32318b = (LinearLayout) findViewById;
            this.f32319c = new a(this);
            if (PatchProxy.isSupport(new Object[0], this, f32317a, false, 20375, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f32317a, false, 20375, new Class[0], Void.TYPE);
            } else if (this.l != null) {
                i.a((Callable<TResult>) new b<TResult>(this)).a((g<TResult, TContinuationResult>) new c<TResult,TContinuationResult>(this), i.f1052b);
            }
        }
        return inflate;
    }

    public final void a(Integer num, String str) {
        if (PatchProxy.isSupport(new Object[]{num, str}, this, f32317a, false, 20373, new Class[]{Integer.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{num, str}, this, f32317a, false, 20373, new Class[]{Integer.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.account.a.a.b a2 = new com.ss.android.ugc.aweme.account.a.a.b().a("enter_url", this.m).a("verify_way", "third_party_verify").a("verify_pass", 0);
        if (num != null) {
            num.intValue();
            a2.a("error_code", num.intValue());
        }
        r.a("double_verify_pass", (Map) a2.f31599b);
        d();
        com.bytedance.ies.dmt.ui.d.a.b((Context) c(), (int) C0906R.string.hp).a();
        b(num, str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(@NotNull AppCompatActivity appCompatActivity, @NotNull ViewStub viewStub, @NotNull f.a aVar) {
        super(appCompatActivity, viewStub, aVar);
        Intrinsics.checkParameterIsNotNull(appCompatActivity, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(viewStub, "viewStub");
        Intrinsics.checkParameterIsNotNull(aVar, "authCallback");
    }

    public final void a(int i, int i2, @Nullable Intent intent) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f32317a, false, 20371, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f32317a, false, 20371, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i == 123) {
            String str7 = null;
            if (i2 == -1) {
                if (intent2 != null) {
                    str = intent2.getStringExtra("ori_platform");
                } else {
                    str = null;
                }
                if (intent2 != null) {
                    str2 = intent2.getStringExtra("AUTHORIZE_OK_STATE");
                } else {
                    str2 = null;
                }
                if (intent2 != null) {
                    str3 = intent2.getStringExtra("AUTHORIZE_OK_CODE");
                } else {
                    str3 = null;
                }
                if (intent2 != null) {
                    str4 = intent2.getStringExtra("AUTHORIZE_OK_OPEN_ID");
                } else {
                    str4 = null;
                }
                if (intent2 != null) {
                    str5 = intent2.getStringExtra("AUTHORIZE_OK_ACCESS_TOKEN");
                } else {
                    str5 = null;
                }
                if (intent2 != null) {
                    str6 = intent2.getStringExtra("AUTHORIZE_OK_EXPIRE_IN");
                } else {
                    str6 = null;
                }
                if (PatchProxy.isSupport(new Object[]{str, str3, str2, str4, str5, str6}, this, f32317a, false, 20372, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, str3, str2, str4, str5, str6}, this, f32317a, false, 20372, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, Void.TYPE);
                } else {
                    i<TwoStepAuthApi.a> a2 = TwoStepAuthApi.f32267b.a(this.f32320d, str, str3, str2, str4, str5, str6);
                    if (a2 != null) {
                        a2.a((g<TResult, TContinuationResult>) new C0412d<TResult,TContinuationResult>(this), i.f1052b);
                    } else {
                        a(null, "TwoStepAuthApi.verifyThirdParty bolts Task null");
                    }
                }
            } else {
                if (intent2 != null) {
                    num = Integer.valueOf(intent2.getIntExtra("error_code", 0));
                } else {
                    num = null;
                }
                if (intent2 != null) {
                    str7 = intent2.getStringExtra("description");
                }
                a(num, str7);
            }
        }
    }
}
