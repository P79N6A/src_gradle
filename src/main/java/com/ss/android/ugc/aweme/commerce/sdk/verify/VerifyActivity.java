package com.ss.android.ugc.aweme.commerce.sdk.verify;

import a.g;
import a.i;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.IESBrowserFragment;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.commerce.sdk.verify.api.VerifyApi;
import com.ss.android.ugc.aweme.commerce.service.logs.af;
import com.ss.android.ugc.aweme.commerce.service.logs.z;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0003J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0010H\u0014J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/verify/VerifyActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "()V", "mCurState", "", "mEnterFrom", "", "mEnterMethod", "mHasReadProtocol", "", "mImmersionBar", "Lcom/gyf/barlibrary/ImmersionBar;", "mOpenId", "", "mSchemaUrl", "bindViews", "", "changeState", "state", "fetchState", "fillDefaultData", "findAndAdjustViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "refreshRights", "setStatusBarColor", "Companion", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class VerifyActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37898a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f37899d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String f37900b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f37901c = "";

    /* renamed from: e  reason: collision with root package name */
    private ImmersionBar f37902e;

    /* renamed from: f  reason: collision with root package name */
    private long f37903f;
    private String g = "";
    private boolean h;
    private int i = 1;
    private HashMap j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/verify/VerifyActivity$Companion;", "", "()V", "KEY_ENTER_FROM", "", "KEY_ENTER_METHOD", "KEY_OPEN_ID", "KEY_SCHEMA_URL", "STATE_LOADING", "", "STATE_THREE", "STATE_TWO", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerifyActivity f37905b;

        b(VerifyActivity verifyActivity) {
            this.f37905b = verifyActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37904a, false, 29610, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37904a, false, 29610, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerifyActivity f37907b;

        c(VerifyActivity verifyActivity) {
            this.f37907b = verifyActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37906a, false, 29611, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37906a, false, 29611, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerifyActivity f37909b;

        d(VerifyActivity verifyActivity) {
            this.f37909b = verifyActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37908a, false, 29612, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37908a, false, 29612, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37909b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerifyActivity f37911b;

        e(VerifyActivity verifyActivity) {
            this.f37911b = verifyActivity;
        }

        public final void onClick(View view) {
            i iVar;
            if (PatchProxy.isSupport(new Object[]{view}, this, f37910a, false, 29613, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37910a, false, 29613, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            com.ss.android.ugc.aweme.commerce.sdk.verify.api.a aVar = com.ss.android.ugc.aweme.commerce.sdk.verify.api.a.f37941c;
            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.commerce.sdk.verify.api.a.f37939a, false, 29621, new Class[0], i.class)) {
                iVar = (i) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.commerce.sdk.verify.api.a.f37939a, false, 29621, new Class[0], i.class);
            } else {
                aVar.a();
                VerifyApi verifyApi = com.ss.android.ugc.aweme.commerce.sdk.verify.api.a.f37940b;
                if (verifyApi != null) {
                    iVar = verifyApi.uploadReadLicense();
                } else {
                    iVar = null;
                }
            }
            if (iVar != null) {
                iVar.a((g<TResult, TContinuationResult>) new g<com.ss.android.ugc.aweme.commerce.service.d.a, Void>(this) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f37912a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ e f37913b;

                    {
                        this.f37913b = r1;
                    }

                    public final /* synthetic */ Object then(i iVar) {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f37912a, false, 29614, new Class[]{i.class}, Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f37912a, false, 29614, new Class[]{i.class}, Void.class);
                        } else if (iVar == null || iVar.e() == null || iVar.d() || ((com.ss.android.ugc.aweme.commerce.service.d.a) iVar.e()).statusCode != 0) {
                            UIUtils.displayToast((Context) this.f37913b.f37911b, (int) C0906R.string.bgf);
                            return null;
                        } else {
                            com.ss.android.ugc.aweme.commerce.service.h.a a2 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(this.f37913b.f37911b);
                            if (a2 != null) {
                                a2.l(true);
                            }
                            this.f37913b.f37911b.a(3);
                            return null;
                        }
                    }
                }, i.f1052b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerifyActivity f37915b;

        f(VerifyActivity verifyActivity) {
            this.f37915b = verifyActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37914a, false, 29615, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37914a, false, 29615, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37915b.setResult(-1);
            af afVar = new af();
            String str = this.f37915b.f37900b;
            if (PatchProxy.isSupport(new Object[]{str}, afVar, af.f38065a, false, 29739, new Class[]{String.class}, af.class)) {
                af afVar2 = afVar;
                afVar = (af) PatchProxy.accessDispatch(new Object[]{str}, afVar2, af.f38065a, false, 29739, new Class[]{String.class}, af.class);
            } else {
                Intrinsics.checkParameterIsNotNull(str, "enterFrom");
                afVar.f38066f = str;
            }
            String str2 = this.f37915b.f37901c;
            if (PatchProxy.isSupport(new Object[]{str2}, afVar, af.f38065a, false, 29740, new Class[]{String.class}, af.class)) {
                af afVar3 = afVar;
                afVar = (af) PatchProxy.accessDispatch(new Object[]{str2}, afVar3, af.f38065a, false, 29740, new Class[]{String.class}, af.class);
            } else {
                Intrinsics.checkParameterIsNotNull(str2, "enterMethod");
                afVar.g = str2;
            }
            afVar.a(false).b();
            this.f37915b.finish();
        }
    }

    private View b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f37898a, false, 29606, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f37898a, false, 29606, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.j == null) {
            this.j = new HashMap();
        }
        View view = (View) this.j.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.j.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f37898a, false, 29608, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37898a, false, 29608, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.sdk.verify.VerifyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.sdk.verify.VerifyActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37898a, false, 29609, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37898a, false, 29609, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.sdk.verify.VerifyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f37898a, false, 29604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37898a, false, 29604, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar immersionBar = this.f37902e;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f37898a, false, 29603, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37898a, false, 29603, new Class[0], Void.TYPE);
            return;
        }
        this.f37902e = ImmersionBar.with((Activity) this);
        if (getContentResolver() != null) {
            ImmersionBar immersionBar = this.f37902e;
            if (immersionBar != null) {
                immersionBar.init();
            }
        }
    }

    public final void a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f37898a, false, 29605, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f37898a, false, 29605, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i3) {
            case 1:
                Fragment findFragmentById = getSupportFragmentManager().findFragmentById(C0906R.id.c8c);
                if (findFragmentById != null) {
                    ((IESBrowserFragment) findFragmentById).a("https://aweme.snssdk.com/falcon/douyin_falcon/business/agreement/?version=300android");
                    LinearLayout linearLayout = (LinearLayout) b(C0906R.id.fs);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout, "area_pass");
                    linearLayout.setVisibility(8);
                    LinearLayout linearLayout2 = (LinearLayout) b(C0906R.id.fu);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "area_view_protocol");
                    linearLayout2.setVisibility(0);
                    LinearLayout linearLayout3 = (LinearLayout) b(C0906R.id.fq);
                    Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "area_loading");
                    linearLayout3.setVisibility(8);
                    ((DmtTextView) b(C0906R.id.dnp)).setTextColor(getResources().getColor(C0906R.color.a17));
                    ((DmtTextView) b(C0906R.id.dnk)).setTextColor(getResources().getColor(C0906R.color.a1m));
                    ((RelativeLayout) b(C0906R.id.cf3)).setBackgroundResource(2130838384);
                    RelativeLayout relativeLayout = (RelativeLayout) b(C0906R.id.cf1);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "ring_step_one");
                    relativeLayout.setBackground(null);
                    RelativeLayout relativeLayout2 = (RelativeLayout) b(C0906R.id.cf2);
                    Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "ring_step_three");
                    relativeLayout2.setBackground(null);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.sdk.activity.IESBrowserFragment");
                }
            case 2:
                LinearLayout linearLayout4 = (LinearLayout) b(C0906R.id.fu);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "area_view_protocol");
                linearLayout4.setVisibility(8);
                LinearLayout linearLayout5 = (LinearLayout) b(C0906R.id.fs);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "area_pass");
                linearLayout5.setVisibility(8);
                LinearLayout linearLayout6 = (LinearLayout) b(C0906R.id.fq);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "area_loading");
                linearLayout6.setVisibility(0);
                break;
            case 3:
                LinearLayout linearLayout7 = (LinearLayout) b(C0906R.id.fu);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout7, "area_view_protocol");
                linearLayout7.setVisibility(8);
                LinearLayout linearLayout8 = (LinearLayout) b(C0906R.id.fq);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout8, "area_loading");
                linearLayout8.setVisibility(8);
                LinearLayout linearLayout9 = (LinearLayout) b(C0906R.id.fs);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout9, "area_pass");
                linearLayout9.setVisibility(0);
                RelativeLayout relativeLayout3 = (RelativeLayout) b(C0906R.id.cf1);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "ring_step_one");
                relativeLayout3.setBackground(null);
                RelativeLayout relativeLayout4 = (RelativeLayout) b(C0906R.id.cf3);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout4, "ring_step_two");
                relativeLayout4.setBackground(null);
                ((RelativeLayout) b(C0906R.id.cf2)).setBackgroundResource(2130838384);
                ((DmtTextView) b(C0906R.id.dnp)).setTextColor(getResources().getColor(C0906R.color.a1m));
                ((DmtTextView) b(C0906R.id.dnk)).setTextColor(getResources().getColor(C0906R.color.a17));
                break;
        }
        ((ImageView) b(C0906R.id.aqr)).setBackgroundResource(2130838455);
        ((ImageView) b(C0906R.id.aqq)).setBackgroundResource(2130838454);
        this.i = i3;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        int i2;
        boolean z;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f37898a, false, 29597, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f37898a, false, 29597, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.sdk.verify.VerifyActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ek);
        if (PatchProxy.isSupport(new Object[0], this, f37898a, false, 29598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37898a, false, 29598, new Class[0], Void.TYPE);
        } else {
            this.f37903f = getIntent().getLongExtra("verify_open_id", 0);
            String stringExtra = getIntent().getStringExtra("verify_schema_url");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.g = stringExtra;
            String stringExtra2 = getIntent().getStringExtra("verify_enter_from");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.f37900b = stringExtra2;
            String stringExtra3 = getIntent().getStringExtra("verify_enter_method");
            if (stringExtra3 == null) {
                stringExtra3 = "";
            }
            this.f37901c = stringExtra3;
            if (PatchProxy.isSupport(new Object[0], this, f37898a, false, 29599, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37898a, false, 29599, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.commerce.service.h.a a2 = com.ss.android.ugc.aweme.commerce.service.h.b.f37971b.a(this);
                if (a2 == null || !a2.k(false)) {
                    z = false;
                } else {
                    z = true;
                }
                this.h = z;
            }
            z zVar = new z();
            String str = this.f37900b;
            if (PatchProxy.isSupport(new Object[]{str}, zVar, z.f38167a, false, 29728, new Class[]{String.class}, z.class)) {
                z zVar2 = zVar;
                zVar = (z) PatchProxy.accessDispatch(new Object[]{str}, zVar2, z.f38167a, false, 29728, new Class[]{String.class}, z.class);
            } else {
                Intrinsics.checkParameterIsNotNull(str, "enterFrom");
                zVar.f38168f = str;
            }
            String str2 = this.f37901c;
            if (PatchProxy.isSupport(new Object[]{str2}, zVar, z.f38167a, false, 29729, new Class[]{String.class}, z.class)) {
                z zVar3 = zVar;
                zVar = (z) PatchProxy.accessDispatch(new Object[]{str2}, zVar3, z.f38167a, false, 29729, new Class[]{String.class}, z.class);
            } else {
                Intrinsics.checkParameterIsNotNull(str2, "enterMethod");
                zVar.g = str2;
            }
            zVar.a(false).b();
            if (this.h) {
                i2 = 3;
            } else {
                i2 = 1;
            }
            this.i = i2;
        }
        if (PatchProxy.isSupport(new Object[0], this, f37898a, false, 29602, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37898a, false, 29602, new Class[0], Void.TYPE);
        } else {
            View b2 = b(C0906R.id.cv0);
            Intrinsics.checkExpressionValueIsNotNull(b2, "status_bar");
            if (PatchProxy.isSupport(new Object[]{b2}, null, com.ss.android.ugc.aweme.commerce.sdk.e.b.f37726a, true, 29577, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{b2}, null, com.ss.android.ugc.aweme.commerce.sdk.e.b.f37726a, true, 29577, new Class[]{View.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(b2, "view");
                if (Build.VERSION.SDK_INT >= 19) {
                    b2.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(b2.getContext());
                }
            }
            DmtTextView dmtTextView = (DmtTextView) b(C0906R.id.wp);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "commerce_detail_orders");
            dmtTextView.setVisibility(8);
            ImageView imageView = (ImageView) b(C0906R.id.oi);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "btn_more");
            imageView.setVisibility(8);
        }
        a(this.i);
        if (PatchProxy.isSupport(new Object[0], this, f37898a, false, 29601, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37898a, false, 29601, new Class[0], Void.TYPE);
        } else {
            DmtTextView dmtTextView2 = (DmtTextView) b(C0906R.id.cr0);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "shop_title_center");
            dmtTextView2.setAlpha(1.0f);
            DmtTextView dmtTextView3 = (DmtTextView) b(C0906R.id.cr0);
            Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "shop_title_center");
            dmtTextView3.setText(getString(C0906R.string.bkf));
        }
        if (PatchProxy.isSupport(new Object[0], this, f37898a, false, 29600, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37898a, false, 29600, new Class[0], Void.TYPE);
        } else {
            ((RelativeLayout) b(C0906R.id.cf3)).setOnClickListener(new b(this));
            ((RelativeLayout) b(C0906R.id.cf2)).setOnClickListener(new c(this));
            ((ImageView) b(C0906R.id.ix)).setOnClickListener(new d(this));
            ((DmtTextView) b(C0906R.id.m9)).setOnClickListener(new e(this));
            ((DmtTextView) b(C0906R.id.o1)).setOnClickListener(new f(this));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.sdk.verify.VerifyActivity", "onCreate", false);
    }
}
