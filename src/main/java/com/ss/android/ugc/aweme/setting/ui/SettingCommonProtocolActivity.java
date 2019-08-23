package com.ss.android.ugc.aweme.setting.ui;

import a.i;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.challenge.a.c;
import com.ss.android.ugc.aweme.common.q;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.freeflowcard.b;
import com.ss.android.ugc.aweme.freeflowcard.data.a;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.f;
import com.ss.android.ugc.aweme.u.z;
import com.ss.android.ugc.aweme.update.h;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.eb;
import java.util.Map;
import java.util.concurrent.Callable;

public class SettingCommonProtocolActivity extends AmeBaseActivity implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64201a;
    @BindView(2131493167)
    CommonItemView mAutoPlay;
    @BindView(2131494070)
    CommonItemView mDynamicCoverItem;
    @BindView(2131496412)
    CommonItemView mPreUpload;
    @BindView(2131497590)
    TextView mTitle;
    @BindView(2131498319)
    CommonItemView mUpdateItem;

    public final int a() {
        return C0906R.layout.dw;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64201a, false, 72640, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64201a, false, 72640, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingCommonProtocolActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingCommonProtocolActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64201a, false, 72641, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64201a, false, 72641, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingCommonProtocolActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f64201a, false, 72631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64201a, false, 72631, new Class[0], Void.TYPE);
            return;
        }
        eb.a(this, getResources().getColor(C0906R.color.yx));
    }

    @OnClick({2131493213})
    public void exit(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64201a, false, 72639, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64201a, false, 72639, new Class[]{View.class}, Void.TYPE);
            return;
        }
        finish();
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{view}, this, f64201a, false, 72634, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64201a, false, 72634, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.a8a) {
            if (PatchProxy.isSupport(new Object[0], this, f64201a, false, 72636, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64201a, false, 72636, new Class[0], Void.TYPE);
            } else {
                this.mDynamicCoverItem.setChecked(!this.mDynamicCoverItem.c());
                z.a a2 = z.a("click_animated_thumbnail").a("previous_page", "general_settings");
                if (this.mDynamicCoverItem.c()) {
                    str2 = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                } else {
                    str2 = PushConstants.PUSH_TYPE_NOTIFY;
                }
                a2.a("status", str2).h().e();
                if (this.mDynamicCoverItem.c()) {
                    str3 = "on";
                } else {
                    str3 = "off";
                }
                q.a(this, "dynamic_cover", str3);
                f.a(this, this.mDynamicCoverItem.c());
                bg.a(new c(this.mDynamicCoverItem.c() ^ true ? 1 : 0));
            }
        } else if (id == C0906R.id.dod) {
            if (PatchProxy.isSupport(new Object[0], this, f64201a, false, 72637, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64201a, false, 72637, new Class[0], Void.TYPE);
            } else {
                new h(this, this).a();
            }
        } else if (id == C0906R.id.h1) {
            if (PatchProxy.isSupport(new Object[0], this, f64201a, false, 72635, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64201a, false, 72635, new Class[0], Void.TYPE);
            } else {
                this.mAutoPlay.setChecked(!this.mAutoPlay.c());
                a a3 = a.a();
                if (PatchProxy.isSupport(new Object[0], a3, a.f48602a, false, 46061, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], a3, a.f48602a, false, 46061, new Class[0], Void.TYPE);
                } else {
                    i.a((Callable<TResult>) new Callable<Void>() {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f48611a;

                        /* renamed from: a */
                        public java.lang.Void call(
/*
Method generation error in method: com.ss.android.ugc.aweme.freeflowcard.data.a.3.a():java.lang.Void, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.freeflowcard.data.a.3.a():java.lang.Void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                        
*/
                    });
                }
                if (!this.mAutoPlay.c()) {
                    b.a().i = false;
                }
                com.ss.android.ugc.aweme.freeflowcard.data.b.b c2 = a.a().c();
                c2.isOpen = this.mAutoPlay.c();
                c2.changeType = 1;
                c2.monthlyState = 0;
                c2.resetTime = com.ss.android.ugc.aweme.freeflowcard.a.c();
                c2.isDayOpen = false;
                c2.dayOpenResetTime = 0;
                a.a().a(c2);
                if (this.mAutoPlay.c()) {
                    str = "no_wifi_auto_open";
                } else {
                    str = "no_wifi_auto_close";
                }
                r.a(str, (Map) null);
            }
        } else if (id == C0906R.id.c55) {
            if (PatchProxy.isSupport(new Object[0], this, f64201a, false, 72638, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64201a, false, 72638, new Class[0], Void.TYPE);
                return;
            }
            this.mPreUpload.setChecked(!this.mPreUpload.c());
            ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().setEnablePreUploadByUser(this.mPreUpload.c());
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64201a, false, 72629, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64201a, false, 72629, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingCommonProtocolActivity", "onCreate", true);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f64201a, false, 72630, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64201a, false, 72630, new Class[0], Void.TYPE);
        } else {
            this.mDynamicCoverItem.setChecked(f.a(this));
            this.mAutoPlay.setChecked(a.a().b());
            this.mPreUpload.setChecked(((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enablePreUploadByUser());
            if (AbTestManager.a().d().newFlowStrategy == 1) {
                this.mAutoPlay.setVisibility(8);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f64201a, false, 72632, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64201a, false, 72632, new Class[0], Void.TYPE);
        } else {
            this.mTitle.setText(C0906R.string.c53);
        }
        if (PatchProxy.isSupport(new Object[0], this, f64201a, false, 72633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64201a, false, 72633, new Class[0], Void.TYPE);
        } else {
            this.mDynamicCoverItem.setOnClickListener(this);
            this.mUpdateItem.setOnClickListener(this);
            this.mAutoPlay.setOnClickListener(this);
            this.mPreUpload.setOnClickListener(this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.SettingCommonProtocolActivity", "onCreate", false);
    }
}
