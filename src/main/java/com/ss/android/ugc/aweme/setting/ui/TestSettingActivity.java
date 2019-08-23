package com.ss.android.ugc.aweme.setting.ui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import android.text.method.ReplacementTransformationMethod;
import android.util.ArrayMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChat;
import com.feiliao.oauth.sdk.flipchat.open.api.FlipChatApiCallback;
import com.google.common.collect.ai;
import com.google.common.collect.cg;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.config.AppConfig;
import com.ss.android.common.util.EventsSender;
import com.ss.android.newmedia.redbadge.e;
import com.ss.android.newmedia.redbadge.f;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.debug.AbTestSettingActivity;
import com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity;
import com.ss.android.ugc.aweme.app.debug.FlowWindowService;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.conan.IConanService;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.global.test.EntityTestActivity;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.language.e;
import com.ss.android.ugc.aweme.legoImp.task.DelayedBaceSpeedMethodTestTask;
import com.ss.android.ugc.aweme.live.LiveFeedActivity;
import com.ss.android.ugc.aweme.live.LiveSettingActivity;
import com.ss.android.ugc.aweme.login.b;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.ss.android.ugc.aweme.qrcode.v2.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.requesttask.idle.m;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.k;
import com.ss.android.ugc.aweme.setting.model.LocalAbTestModel;
import com.ss.android.ugc.aweme.setting.r;
import com.ss.android.ugc.aweme.util.g;
import com.ss.android.ugc.aweme.utils.dr;
import com.ss.android.ugc.aweme.utils.eq;
import com.ss.android.ugc.aweme.utils.et;
import com.ss.android.ugc.aweme.utils.v;
import com.ss.android.ugc.aweme.web.l;
import com.ss.android.ugc.aweme.y;
import com.ss.android.ugc.playerkit.c.c;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

public class TestSettingActivity extends AmeBaseActivity implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64283a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f64284b = com.ss.android.ugc.aweme.g.a.a();

    /* renamed from: c  reason: collision with root package name */
    private y f64285c = new y() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64287a;

        public final void a(String str, boolean z) {
            if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f64287a, false, 72828, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f64287a, false, 72828, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            } else if (!z || !com.ss.android.sdk.b.b.a().a("flipchat")) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) TestSettingActivity.this, "飞聊绑定失败").a();
            } else {
                TestSettingActivity.this.itemUnbindFlipChat.setRightTxt("已绑定");
                com.bytedance.ies.dmt.ui.d.a.a((Context) TestSettingActivity.this, "飞聊绑定成功").a();
            }
        }
    };
    @BindView(2131493838)
    SettingItemSwitch cronetItem;

    /* renamed from: d  reason: collision with root package name */
    private AwemeAppData f64286d;
    @BindView(2131493879)
    EditText debugCommandInput;
    @BindView(2131493882)
    SettingItemSwitch debugWebBar;
    @BindView(2131497423)
    SettingItemSwitch enableAnrChecker;
    @BindView(2131497424)
    SettingItemSwitch enableConanChecker;
    @BindView(2131496119)
    SettingItemSwitch enableMessagePb2Json;
    @BindView(2131494121)
    SettingItemSwitch enableMicroAppItem;
    @BindView(2131494156)
    EditText etInput;
    @BindView(2131494428)
    SettingItemSwitch geckoItem;
    @BindView(2131494429)
    SettingItem geckoTestHelperItem;
    @BindView(2131494631)
    SettingItemSwitch hostItem;
    @BindView(2131494653)
    SettingItemSwitch httpsItem;
    @BindView(2131494711)
    SettingItemSwitch iesOfflineItem;
    @BindView(2131494837)
    SettingItemSwitch interactStickerDebug;
    @BindView(2131494858)
    SettingItem itemApplyRedbadge;
    @BindView(2131494862)
    SettingItem itemClearMemoryCache;
    @BindView(2131494136)
    SettingItem itemEnterAVTestSetting;
    @BindView(2131494134)
    SettingItem itemSearchAb;
    @BindView(2131494930)
    SettingItemSwitch itemSecUidChecker;
    @BindView(2131494937)
    SettingItem itemUnbindFlipChat;
    @BindView(2131495316)
    SettingItemSwitch leakDetectorItem;
    @BindView(2131495434)
    SettingItem liveDebugItem;
    @BindView(2131495469)
    SettingItemSwitch liveMoneyItem;
    @BindView(2131495473)
    SettingItemSwitch livePressureItem;
    @BindView(2131495486)
    SettingItemSwitch liveResolutionItem;
    @BindView(2131494884)
    SettingItemSwitch logItem;
    @BindView(2131492876)
    SettingItem mAbTestItem;
    @BindView(2131493166)
    SettingItem mAutoDadian;
    @BindView(2131496617)
    SettingItemSwitch mCloseReactionOrigin;
    @BindView(2131494630)
    EditText mEventHostEditText;
    @BindView(2131494632)
    Button mEventHostOkBtn;
    @BindView(2131494167)
    View mEventHostView;
    @BindView(2131494177)
    SettingItemSwitch mExoPlayerSwitch;
    @BindView(2131495689)
    SettingItemSwitch mLongVideoSwitch;
    @BindView(2131494386)
    SettingItemSwitch mMakeClientWatermark;
    @BindView(2131495299)
    LinearLayout mSettingContainer;
    @BindView(2131497063)
    EditText mSettingIntervalEditText;
    @BindView(2131497064)
    Button mSettingIntervalOkBtn;
    @BindView(2131498598)
    SettingItemSwitch mShowWatermarkInfo;
    @BindView(2131493894)
    SettingItemSwitch mStickerChannel;
    @BindView(2131497590)
    TextView mTitle;
    @BindView(2131497613)
    ViewGroup mTitleLayout;
    @BindView(2131497890)
    TextView mTvDeveice;
    @BindView(2131498202)
    TextView mTvToolSdkVersion;
    @BindView(2131498298)
    SettingItemSwitch mUeTool;
    @BindView(2131498334)
    EditText mUrlInput;
    @BindView(2131498337)
    SettingItemSwitch mUseNewFFmpeg;
    @BindView(2131498217)
    SettingItemSwitch mUseTestHost;
    @BindView(2131498606)
    EditText mWebusedefaultEditText;
    @BindView(2131498607)
    Button mWebusedefaultOkBtn;
    @BindView(2131496053)
    Button openDebugBoxButton;
    @BindView(2131497425)
    SettingItemSwitch openVEHook;
    @BindView(2131496814)
    SettingItemSwitch rnFallback;
    @BindView(2131497148)
    SettingItemSwitch showPLayerInfoUI;
    @BindView(2131497152)
    SettingItemSwitch showVideoBitrateInfo;
    @BindView(2131497427)
    SettingItemSwitch switchToolsDir;
    @BindView(2131497486)
    SettingItem testOOM;
    @BindView(2131498604)
    SettingItem webRippleView;

    static class a extends ReplacementTransformationMethod {
        a() {
        }

        public final char[] getOriginal() {
            return new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        }

        public final char[] getReplacement() {
            return new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        }
    }

    public final int a() {
        return C0906R.layout.ea;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72818, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72818, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64283a, false, 72819, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64283a, false, 72819, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @OnClick({2131496572})
    public void qrClick() {
    }

    public void OnSettingItemClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64283a, false, 72779, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64283a, false, 72779, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.dwy) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72749, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72749, new Class[0], Void.TYPE);
            } else {
                Intent intent = new Intent(this, CrossPlatformActivity.class);
                intent.setData(Uri.parse("http://aweme.snssdk.com/falcon/douyin_falcon/jsbridge_test/"));
                intent.putExtra(PushConstants.TITLE, "Web测试页");
                startActivity(intent);
            }
        } else if (id == C0906R.id.aqz) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f64283a, false, 72805, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f64283a, false, 72805, new Class[]{View.class}, Void.TYPE);
            } else {
                this.iesOfflineItem.setChecked(!this.iesOfflineItem.a());
                this.f64286d.f2499b = this.iesOfflineItem.a();
                SharePrefCache.inst().getIesOffline().a(Boolean.valueOf(this.iesOfflineItem.a()));
            }
        } else if (id == C0906R.id.ay3) {
            if (com.ss.android.sdk.b.b.a().a("flipchat")) {
                Toast makeText = Toast.makeText(this, "飞聊已经绑定，正在解绑", 1);
                if (PatchProxy.isSupport(new Object[]{makeText}, null, ae.f64410a, true, 72834, new Class[]{Toast.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{makeText}, null, ae.f64410a, true, 72834, new Class[]{Toast.class}, Void.TYPE);
                } else {
                    if (Build.VERSION.SDK_INT == 25) {
                        eq.a(makeText);
                    }
                    makeText.show();
                }
                AnonymousClass6 r0 = new b.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64297a;

                    public final void a(boolean z) {
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64297a, false, 72833, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64297a, false, 72833, new Class[]{Boolean.TYPE}, Void.TYPE);
                        } else if (z) {
                            TestSettingActivity.this.itemUnbindFlipChat.setRightTxt("未绑定");
                            d.a().refreshPassportUserInfo();
                            IIMService a2 = com.ss.android.ugc.aweme.im.b.a();
                            if (a2 != null) {
                                a2.onFlipChatMsgUnbind(true);
                            }
                            com.bytedance.ies.dmt.ui.d.a.a((Context) TestSettingActivity.this, "解绑飞聊成功").a();
                        } else {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) TestSettingActivity.this, "解绑飞聊失").a();
                        }
                    }
                };
                if (PatchProxy.isSupport(new Object[]{this, r0}, null, com.ss.android.ugc.aweme.login.b.f53741a, true, 56331, new Class[]{Activity.class, b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{this, r0}, null, com.ss.android.ugc.aweme.login.b.f53741a, true, 56331, new Class[]{Activity.class, b.a.class}, Void.TYPE);
                } else {
                    FlipChat.INSTANCE.requestAuthUnBind(this, new FlipChatApiCallback<BaseApiResponse>(r0) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f53742a;

                        /* renamed from: b */
                        final /* synthetic */ a f53743b;

                        public final /* synthetic */ void onError(
/*
Method generation error in method: com.ss.android.ugc.aweme.login.b.1.onError(java.lang.Object):void, dex: classes5.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.login.b.1.onError(java.lang.Object):void, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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

                        public final /* synthetic */ void onSuccess(
/*
Method generation error in method: com.ss.android.ugc.aweme.login.b.1.onSuccess(java.lang.Object):void, dex: classes5.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.login.b.1.onSuccess(java.lang.Object):void, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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
            } else {
                Intent authorizeActivityStartIntent = c.c().getAuthorizeActivityStartIntent(this);
                authorizeActivityStartIntent.putExtra("platform", "flipchat");
                authorizeActivityStartIntent.putExtra("is_login", false);
                startActivityForResult(authorizeActivityStartIntent, 10005);
            }
        } else if (id == C0906R.id.beo) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72802, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72802, new Class[0], Void.TYPE);
            } else {
                this.livePressureItem.setChecked(!this.livePressureItem.a());
                SharePrefCache.inst().mockLiveSend().a(Boolean.valueOf(this.livePressureItem.a()));
                this.livePressureItem.a();
            }
        } else if (id == C0906R.id.aj4) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72806, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72806, new Class[0], Void.TYPE);
            } else {
                this.geckoItem.setChecked(!this.geckoItem.a());
                SharePrefCache.inst().getGeckoLocalTestUseOnline().a(Boolean.valueOf(this.geckoItem.a()));
            }
        } else if (id == C0906R.id.bek) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72803, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72803, new Class[0], Void.TYPE);
            } else {
                this.liveMoneyItem.setChecked(!this.liveMoneyItem.a());
                SharePrefCache.inst().mockLiveMoney().a(Boolean.valueOf(this.liveMoneyItem.a()));
            }
        } else if (id == C0906R.id.bf1) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72804, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72804, new Class[0], Void.TYPE);
            } else {
                this.liveResolutionItem.setChecked(!this.liveResolutionItem.a());
                SharePrefCache.inst().mockLiveResolution().a(Boolean.valueOf(this.liveResolutionItem.a()));
            }
        } else if (id == C0906R.id.aay) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72807, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72807, new Class[0], Void.TYPE);
            } else {
                new AlertDialog.Builder(this).setItems((CharSequence[]) new String[]{"IJK", "IJK_HARDWARE", "EXO"}, (DialogInterface.OnClickListener) new ac(this)).create().show();
            }
        } else if (id == C0906R.id.bkr) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72808, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72808, new Class[0], Void.TYPE);
            } else {
                this.mLongVideoSwitch.setChecked(!this.mLongVideoSwitch.a());
                ((IAVService) ServiceManager.get().getService(IAVService.class)).setLongVideoPermitted(this.mLongVideoSwitch.a());
            }
        } else if (id == C0906R.id.dou) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72801, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72801, new Class[0], Void.TYPE);
            } else {
                this.mUseNewFFmpeg.setChecked(!this.mUseNewFFmpeg.a());
                SharePrefCache.inst().getUseNewFFmpeg().a(Boolean.valueOf(this.mUseNewFFmpeg.a()));
            }
        } else if (id == C0906R.id.ape) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72794, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72794, new Class[0], Void.TYPE);
            } else {
                this.httpsItem.setChecked(!this.httpsItem.a());
                AppConfig.getInstance(this).setUseHttps(this.httpsItem.a());
                SharePrefCache.inst().getUseHttps().a(Boolean.valueOf(this.httpsItem.a()));
            }
        } else if (id == C0906R.id.aou) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72795, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72795, new Class[0], Void.TYPE);
            } else {
                this.hostItem.setChecked(!this.hostItem.isChecked());
                SharePrefCache.inst().getUseDefaultHost().a(Boolean.valueOf(this.hostItem.isChecked()));
                if (this.hostItem.isChecked()) {
                    EventsSender.inst().setHost("data.bytedance.net/et_api/logview/verify");
                    com.ss.android.ugc.aweme.q.c.a(this, "test_data", 0).edit().putString("host", "data.bytedance.net/et_api/logview/verify").apply();
                    EventsSender.inst().setSenderEnable(true);
                } else {
                    EventsSender.inst().setSenderEnable(false);
                }
                SharePrefCache.inst().getUseHttps().a(Boolean.valueOf(this.hostItem.isChecked()));
            }
        } else if (id == C0906R.id.a2u) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72797, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72797, new Class[0], Void.TYPE);
            } else {
                this.debugWebBar.setChecked(!this.debugWebBar.isChecked());
                SharePrefCache.inst().getDebugWebBar().a(Boolean.valueOf(this.debugWebBar.a()));
            }
        } else if (id == C0906R.id.cgw) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72796, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72796, new Class[0], Void.TYPE);
            } else {
                this.rnFallback.setChecked(!this.rnFallback.isChecked());
                SharePrefCache.inst().getRnFallback().a(Boolean.valueOf(this.rnFallback.a()));
            }
        } else if (id == C0906R.id.a1m) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72798, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72798, new Class[0], Void.TYPE);
            } else {
                this.cronetItem.setChecked(!this.cronetItem.a());
                SharePrefCache.inst().getUseCronet().a(Boolean.valueOf(this.cronetItem.a()));
            }
        } else if (id == C0906R.id.awk) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72799, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72799, new Class[0], Void.TYPE);
            } else {
                if (!this.logItem.a()) {
                    this.logItem.setChecked(true);
                    startService(new Intent(this, FlowWindowService.class));
                }
            }
        } else if (id == C0906R.id.dlb) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72800, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72800, new Class[0], Void.TYPE);
            } else {
                this.mUseTestHost.setChecked(!this.mUseTestHost.a());
                com.ss.android.ugc.aweme.aj.b.b().a((Context) this, "is_use_test_host", this.mUseTestHost.a());
            }
        } else if (id == C0906R.id.cr8) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72809, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72809, new Class[0], Void.TYPE);
            } else {
                this.showPLayerInfoUI.setChecked(!this.showPLayerInfoUI.a());
                SharePrefCache.inst().getShowPlayerInfoUI().a(Boolean.valueOf(this.showPLayerInfoUI.a()));
            }
        } else if (id == C0906R.id.crb) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72788, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72788, new Class[0], Void.TYPE);
            } else {
                this.showVideoBitrateInfo.setChecked(!this.showVideoBitrateInfo.a());
                SharePrefCache.inst().getShowVideoBitrateInfo().a(Boolean.valueOf(this.showVideoBitrateInfo.a()));
            }
        } else if (id == C0906R.id.ahx) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72789, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72789, new Class[0], Void.TYPE);
            } else {
                this.mMakeClientWatermark.setChecked(!this.mMakeClientWatermark.isChecked());
                LocalAbTestModel f2 = AbTestManager.a().f();
                if (f2 != null) {
                    f2.forceMakeClientWatermark = this.mMakeClientWatermark.isChecked();
                }
            }
        } else if (id == C0906R.id.dwt) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72790, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72790, new Class[0], Void.TYPE);
            } else {
                this.mShowWatermarkInfo.setChecked(!this.mShowWatermarkInfo.isChecked());
                LocalAbTestModel f3 = AbTestManager.a().f();
                if (f3 != null) {
                    f3.showWatermarkDebugInfo = this.mShowWatermarkInfo.isChecked();
                }
            }
        } else if (id == C0906R.id.cah) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72791, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72791, new Class[0], Void.TYPE);
            } else {
                this.mCloseReactionOrigin.setChecked(!this.mCloseReactionOrigin.isChecked());
                LocalAbTestModel f4 = AbTestManager.a().f();
                if (f4 != null) {
                    f4.reactionOnlyViewVideo = this.mCloseReactionOrigin.isChecked();
                }
            }
        } else if (id == C0906R.id.dns) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72792, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72792, new Class[0], Void.TYPE);
            } else {
                this.mUeTool.isChecked();
                this.mUeTool.setChecked(false);
            }
        } else if (id == C0906R.id.a_2) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72793, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72793, new Class[0], Void.TYPE);
            } else {
                this.enableMicroAppItem.setChecked(!this.enableMicroAppItem.isChecked());
                if (this.enableMicroAppItem.isChecked()) {
                    SharePrefCache.inst().getDownloadMicroApp().a(1);
                } else {
                    SharePrefCache.inst().getDownloadMicroApp().a(0);
                }
            }
        } else if (id == C0906R.id.h0) {
            if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72814, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72814, new Class[0], Void.TYPE);
            } else {
                if (f64284b) {
                    try {
                        Class<?> cls = Class.forName("com.ss.android.module.verify_applog.AppLogVerifyClient");
                        Method declaredMethod = cls.getDeclaredMethod("init", new Class[]{String.class, String.class, Boolean.TYPE});
                        Method declaredMethod2 = cls.getDeclaredMethod("getUserOrNull", new Class[]{Context.class});
                        cls.getDeclaredMethod("saveUser", new Class[]{Context.class, String.class});
                        Method declaredMethod3 = cls.getDeclaredMethod("beginVerifyAppLog", new Class[]{Activity.class, String.class});
                        Method declaredMethod4 = cls.getDeclaredMethod("inst", new Class[0]);
                        Method declaredMethod5 = cls.getDeclaredMethod("tryInit", new Class[]{Context.class, String.class, String.class});
                        declaredMethod.invoke(null, new Object[]{"1128", "", Boolean.TRUE});
                        declaredMethod3.invoke(null, new Object[]{this, (String) declaredMethod2.invoke(null, new Object[]{this})});
                        declaredMethod5.invoke(declaredMethod4.invoke(null, new Object[0]), new Object[]{this, "1128", ""});
                    } catch (Exception unused) {
                    }
                }
            }
        } else if (id != C0906R.id.bdl) {
            if (id == C0906R.id.aj5) {
                if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72811, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72811, new Class[0], Void.TYPE);
                } else {
                    new AlertDialog.Builder(this).setItems((CharSequence[]) new String[]{"清除Common包", "清除Site包", "Common包是否存在", "site包是否存在"}, (DialogInterface.OnClickListener) new ad(this)).create().show();
                }
            } else if (id == C0906R.id.avs) {
                try {
                    f.a().b(this, 33);
                    com.bytedance.ies.dmt.ui.d.a.a((Context) this, "红点展现成功", 1).a();
                } catch (e unused2) {
                    com.bytedance.ies.dmt.ui.d.a.a((Context) this, "红点展现失败", 1).a();
                }
            } else if (id == C0906R.id.a37) {
                this.mStickerChannel.setChecked(!this.mStickerChannel.a());
                ((IAVService) ServiceManager.get().getService(IAVService.class)).setUsingOnline(!this.mStickerChannel.a());
            } else if (id == C0906R.id.avw) {
                et.a(10);
            } else if (id == C0906R.id.bwx) {
                if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72781, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72781, new Class[0], Void.TYPE);
                } else {
                    this.enableMessagePb2Json.setChecked(!this.enableMessagePb2Json.a());
                    SharePrefCache.inst().isEnableMessagePb2Json().a(Boolean.valueOf(this.enableMessagePb2Json.a()));
                }
            } else if (id == C0906R.id.baj) {
                if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72782, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72782, new Class[0], Void.TYPE);
                } else {
                    this.leakDetectorItem.setChecked(!this.leakDetectorItem.a());
                    ((com.ss.android.ugc.aweme.r.a) com.ss.android.ugc.aweme.base.sharedpref.c.a(this, com.ss.android.ugc.aweme.r.a.class)).b(Boolean.valueOf(this.leakDetectorItem.a()));
                }
            } else if (id == C0906R.id.d04) {
                com.bytedance.d.a.a();
            } else if (id == C0906R.id.av7) {
                if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72783, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72783, new Class[0], Void.TYPE);
                } else {
                    this.interactStickerDebug.setChecked(!this.interactStickerDebug.a());
                    SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(this, "test_data", 0).edit();
                    edit.putBoolean("sp_interact_stickers_test", this.interactStickerDebug.isChecked());
                    edit.apply();
                }
            } else if (id == C0906R.id.cy9) {
                if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72784, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72784, new Class[0], Void.TYPE);
                } else {
                    this.enableAnrChecker.setChecked(!this.enableAnrChecker.a());
                    SharedPreferences.Editor edit2 = com.ss.android.ugc.aweme.q.c.a(this, "test_data", 0).edit();
                    edit2.putBoolean("sp_key_enable_anr", this.enableAnrChecker.isChecked());
                    edit2.apply();
                }
            } else if (id == C0906R.id.cyb) {
                if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72786, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72786, new Class[0], Void.TYPE);
                } else {
                    if (!this.openVEHook.a()) {
                        this.openVEHook.toggle();
                        m.f63637b = true;
                        m.f63638c.a();
                    }
                }
            } else if (id == C0906R.id.cy_) {
                if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72787, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72787, new Class[0], Void.TYPE);
                } else {
                    this.enableConanChecker.setChecked(!this.enableConanChecker.a());
                    try {
                        if (this.enableConanChecker.isChecked()) {
                            com.ss.android.ugc.aweme.util.b bVar = com.ss.android.ugc.aweme.util.b.f75418b;
                            Application application = getApplication();
                            if (PatchProxy.isSupport(new Object[]{application, (byte) 0}, bVar, com.ss.android.ugc.aweme.util.b.f75417a, false, 87772, new Class[]{Application.class, Boolean.TYPE}, Void.TYPE)) {
                                com.ss.android.ugc.aweme.util.b bVar2 = bVar;
                                PatchProxy.accessDispatch(new Object[]{application, (byte) 0}, bVar2, com.ss.android.ugc.aweme.util.b.f75417a, false, 87772, new Class[]{Application.class, Boolean.TYPE}, Void.TYPE);
                            } else {
                                Intrinsics.checkParameterIsNotNull(application, "application");
                                IConanService iConanService = (IConanService) ServiceManager.get().getService(IConanService.class);
                                if (iConanService != null) {
                                    iConanService.init(application, false);
                                }
                                if (iConanService != null) {
                                    iConanService.start();
                                }
                            }
                        } else {
                            com.ss.android.ugc.aweme.util.b bVar3 = com.ss.android.ugc.aweme.util.b.f75418b;
                            if (PatchProxy.isSupport(new Object[0], bVar3, com.ss.android.ugc.aweme.util.b.f75417a, false, 87773, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], bVar3, com.ss.android.ugc.aweme.util.b.f75417a, false, 87773, new Class[0], Void.TYPE);
                            } else {
                                IConanService iConanService2 = (IConanService) ServiceManager.get().getService(IConanService.class);
                                if (iConanService2 != null) {
                                    iConanService2.stop();
                                }
                            }
                        }
                    } catch (Exception unused3) {
                    }
                }
            } else if (id == C0906R.id.axv) {
                if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72810, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72810, new Class[0], Void.TYPE);
                } else {
                    this.itemSecUidChecker.setChecked(!this.itemSecUidChecker.a());
                    dr.a().f75767f = this.itemSecUidChecker.a();
                }
            } else if (id == C0906R.id.a_d) {
                if (PatchProxy.isSupport(new Object[]{this}, null, AbTestSettingSearchActivity.f34127a, true, 23324, new Class[]{Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{this}, null, AbTestSettingSearchActivity.f34127a, true, 23324, new Class[]{Context.class}, Void.TYPE);
                } else {
                    startActivity(new Intent(this, AbTestSettingSearchActivity.class));
                }
            } else if (id == C0906R.id.cye) {
                if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72785, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72785, new Class[0], Void.TYPE);
                } else {
                    this.switchToolsDir.setChecked(!this.switchToolsDir.a());
                    SharedPreferences.Editor edit3 = com.ss.android.ugc.aweme.q.c.a(this, "test_data", 0).edit();
                    edit3.putBoolean("sp_key_tools_dir_external", this.switchToolsDir.isChecked());
                    edit3.apply();
                }
            } else if (id == C0906R.id.a_f) {
                if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72780, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72780, new Class[0], Void.TYPE);
                    return;
                }
                ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().startTestSettingActivity(this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72765, new Class[0], Void.TYPE);
            return;
        }
        if (this.mEventHostEditText != null) {
            g.a(this.mEventHostEditText.getEditableText().toString(), (Context) this);
        }
    }

    @OnClick({2131496763})
    public void clearUserRealNameVerify() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72761, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72761, new Class[0], Void.TYPE);
            return;
        }
        new com.ss.android.ugc.aweme.zhima.b().a();
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72817, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72817, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(C0906R.anim.cx, C0906R.anim.da);
    }

    @OnClick({2131497884})
    public void goDependencies() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72757, new Class[0], Void.TYPE);
            return;
        }
        startActivity(new Intent(this, TestDependenciesActivity.class));
    }

    @OnClick({2131498054})
    public void goPlugin() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72756, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72756, new Class[0], Void.TYPE);
            return;
        }
        h.a().a((Activity) this, "aweme://pluginlist/");
    }

    /* access modifiers changed from: package-private */
    public com.bytedance.ies.geckoclient.f i() {
        if (!PatchProxy.isSupport(new Object[0], this, f64283a, false, 72813, new Class[0], com.bytedance.ies.geckoclient.f.class)) {
            return (com.bytedance.ies.geckoclient.f) ServiceManager.get().getService(com.bytedance.ies.geckoclient.f.class);
        }
        return (com.bytedance.ies.geckoclient.f) PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72813, new Class[0], com.bytedance.ies.geckoclient.f.class);
    }

    @OnClick({2131496307})
    public void onConfigPoiOverseas() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72776, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72776, new Class[0], Void.TYPE);
            return;
        }
        startActivity(new Intent(this, TestPoiOverseasActivity.class));
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72748, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72748, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        c.c().setAuthorzieBindResult(null);
    }

    @OnClick({2131494412})
    public void onEnterFreeFlowData() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72769, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72769, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, "I18n没有相关数据");
        } else {
            startActivity(new Intent(this, FreeFlowDataTestActivity.class));
        }
    }

    @OnClick({2131494139})
    public void onEnterLivingFeed() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72771, new Class[0], Void.TYPE);
            return;
        }
        startActivity(new Intent(this, LiveFeedActivity.class));
    }

    @OnClick({2131494141})
    public void onEnterLivingSetting() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72768, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72768, new Class[0], Void.TYPE);
            return;
        }
        startActivity(new Intent(this, LiveSettingActivity.class));
    }

    @OnClick({2131494142})
    public void onEnterMicroAppList() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72772, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72772, new Class[0], Void.TYPE);
            return;
        }
        ((IMiniAppService) ServiceManager.get().getService(IMiniAppService.class)).openMircoAppList(this);
    }

    @OnClick({2131494413})
    public void onTestFreeFlowMemberUpdate() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72770, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, "I18n没有相关数据").a();
        } else {
            com.ss.android.ugc.aweme.freeflowcard.freeflowmember.a.f3325c.a(true);
        }
    }

    @OnClick({2131497769})
    public void openAVSchemaTest() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72763, new Class[0], Void.TYPE);
            return;
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).openAVSchemaTestActivity(this);
    }

    @OnClick({2131496053})
    public void openDebugbox() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72816, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.util.d.a((Activity) this);
    }

    @OnClick({2131496566})
    public void qrAdTestClick() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72752, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72752, new Class[0], Void.TYPE);
            return;
        }
        ScanQRCodeActivityV2.a((Context) this, 1);
    }

    @OnClick({2131496764})
    public void testHotFix() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72753, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72753, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64295a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f64295a, false, 72832, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f64295a, false, 72832, new Class[0], Void.TYPE);
                    return;
                }
                new DelayedBaceSpeedMethodTestTask().run();
            }
        });
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72778, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72778, new Class[0], Void.TYPE);
            return;
        }
        if (this.mSettingIntervalEditText != null) {
            try {
                int intValue = Integer.valueOf(this.mSettingIntervalEditText.getEditableText().toString()).intValue();
                if (intValue > 0 || ((long) intValue) <= TimeUnit.DAYS.toMillis(1)) {
                    r.f64012e = intValue * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                    com.bytedance.ies.dmt.ui.d.a.a((Context) this, (int) C0906R.string.btj).a();
                } else {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.btg).a();
                }
            } catch (NumberFormatException unused) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.btg).a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public com.bytedance.ies.geckoclient.f h() {
        if (!PatchProxy.isSupport(new Object[0], this, f64283a, false, 72812, new Class[0], com.bytedance.ies.geckoclient.f.class)) {
            return ((com.ss.android.ugc.aweme.web.d) ServiceManager.get().getService(com.ss.android.ugc.aweme.web.d.class)).a(l.c().g());
        }
        return (com.bytedance.ies.geckoclient.f) PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72812, new Class[0], com.bytedance.ies.geckoclient.f.class);
    }

    @OnClick({2131495208})
    public void jumpToH5() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72777, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72777, new Class[0], Void.TYPE);
            return;
        }
        String trim = this.mUrlInput.getText().toString().trim();
        if (TextUtils.isEmpty(trim) || !trim.startsWith("http")) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.abx).a();
            return;
        }
        h.a().a("aweme://webview/?url=" + trim);
    }

    @OnClick({2131495216})
    public void languageDialogTest() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72762, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72762, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.a()) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openLanguageTestDialog(this);
        } else {
            com.bytedance.ies.dmt.ui.d.a.a((Context) this, "抖音没有该功能").a();
        }
    }

    @OnClick({2131496828})
    public void onConfigReactNative() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72774, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72774, new Class[0], Void.TYPE);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = getLayoutInflater().inflate(C0906R.layout.qs, null);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor edit = defaultSharedPreferences.edit();
        String string = defaultSharedPreferences.getString("test_schema", "aweme://reactnative?dev=1&channel_name=rn_patch&bundle_name=business&module_name=page_business");
        String string2 = defaultSharedPreferences.getString("debug_http_host", "10.1.57.172:8081");
        EditText editText = (EditText) inflate.findViewById(C0906R.id.ch8);
        editText.setText(string2);
        EditText editText2 = (EditText) inflate.findViewById(C0906R.id.ch7);
        editText2.setText(string);
        builder.setView(inflate);
        builder.setTitle((CharSequence) "React Native 测试页");
        builder.setNeutralButton((CharSequence) "schema跳转", (DialogInterface.OnClickListener) new aa(edit, editText, editText2));
        builder.create().show();
    }

    @OnClick({2131494140})
    public void onEnterLivingRoom() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72773, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72773, new Class[0], Void.TYPE);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = getLayoutInflater().inflate(C0906R.layout.kj, null);
        builder.setView(inflate);
        builder.setNeutralButton((CharSequence) "进入直播间", (DialogInterface.OnClickListener) new z(this, (EditText) inflate.findViewById(C0906R.id.bff)));
        builder.setTitle((CharSequence) "进入直播间");
        builder.create().show();
    }

    @OnClick({2131496829})
    public void onReactNativeSettingsClick() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72775, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72775, new Class[0], Void.TYPE);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View inflate = getLayoutInflater().inflate(C0906R.layout.qt, null);
        EditText editText = (EditText) inflate.findViewById(C0906R.id.ch9);
        String str = com.ss.android.ugc.aweme.crossplatform.platform.rn.l.a().f40884b;
        if (!TextUtils.isEmpty(str)) {
            editText.setText(str);
        }
        builder.setView(inflate);
        builder.setTitle((CharSequence) "React Native 测试设置");
        builder.setNeutralButton((CharSequence) "Confirm", (DialogInterface.OnClickListener) new ab(editText));
        builder.create().show();
    }

    @OnClick({2131497775})
    public void openPayTest() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72764, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72764, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, com.ss.android.ugc.aweme.commercialize.g.f38874a, true, 30260, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, com.ss.android.ugc.aweme.commercialize.g.f38874a, true, 30260, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        ICommerceService a2 = com.ss.android.ugc.aweme.commercialize.g.a();
        if (a2 != null) {
            a2.launchPayTest(this);
        }
    }

    @OnClick({2131498136})
    public void goSettings() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72758, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72758, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            ArrayMap<String, Object> arrayMap = new ArrayMap<>();
            arrayMap.put("SettingsReader.get()", com.ss.android.ugc.aweme.global.config.settings.g.b());
            arrayMap.put("SharePrefCache.inst()", SharePrefCache.inst());
            arrayMap.put("CommonSharePrefCache.inst()", x.a());
            arrayMap.put("DefaultSharedpreference.getInstance()", com.ss.android.ugc.aweme.aj.b.b());
            arrayMap.put("SettingsManagerProxy.inst().getCommonSettingsWatcher().getImSetting()", SettingsManagerProxy.inst().getCommonSettingsWatcher().a());
            if (PatchProxy.isSupport(new Object[]{this, arrayMap}, null, com.ss.android.ugc.aweme.global.test.c.f49612a, true, 49485, new Class[]{Context.class, ArrayMap.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{this, arrayMap}, null, com.ss.android.ugc.aweme.global.test.c.f49612a, true, 49485, new Class[]{Context.class, ArrayMap.class}, Void.TYPE);
            } else {
                Intent intent = new Intent(this, EntityTestActivity.class);
                EntityTestActivity.f49571b = arrayMap;
                startActivity(intent);
            }
        } else {
            com.bytedance.ies.dmt.ui.d.a.a((Context) this, "EntityTestUtil 只能使用ArrayMap，当前API版本过低").a();
        }
    }

    @OnClick({2131493878})
    public void runCommandClick() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72815, new Class[0], Void.TYPE);
        } else if (this.debugCommandInput.getText() != null) {
            com.ss.android.ugc.aweme.g.a.a aVar = com.ss.android.ugc.aweme.g.a.a.f49503c;
            String obj = this.debugCommandInput.getText().toString();
            if (PatchProxy.isSupport(new Object[]{obj}, aVar, com.ss.android.ugc.aweme.g.a.a.f49501a, false, 34622, new Class[]{String.class}, Boolean.TYPE)) {
                com.ss.android.ugc.aweme.g.a.a aVar2 = aVar;
                ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, aVar2, com.ss.android.ugc.aweme.g.a.a.f49501a, false, 34622, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (obj != null) {
                    CharSequence charSequence = obj;
                    if (StringsKt.contains$default(charSequence, (CharSequence) " ", false, 2, (Object) null)) {
                        List split = new Regex(" ").split(charSequence, 0);
                        if (split.size() >= 2) {
                            String str = (String) split.get(0);
                            split.subList(1, split.size());
                            if (com.ss.android.ugc.aweme.g.a.a.f49502b.containsKey(str)) {
                                com.ss.android.ugc.aweme.g.a.b bVar = com.ss.android.ugc.aweme.g.a.a.f49502b.get(str);
                                if (bVar != null) {
                                    z = bVar.a();
                                }
                            }
                        }
                    }
                }
                if (z) {
                    com.bytedance.ies.dmt.ui.d.a.a(com.ss.android.ugc.aweme.base.utils.d.a(), "command executed ok").a();
                } else {
                    com.bytedance.ies.dmt.ui.d.a.b(com.ss.android.ugc.aweme.base.utils.d.a(), "command executed fail").a();
                }
            }
        } else {
            com.bytedance.ies.dmt.ui.d.a.b((Context) this, "input command").a();
        }
    }

    @OnClick({2131496901})
    public void scanChange() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72750, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72750, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{this, (byte) 1, 2}, null, QRCodePermissionActivity.f63311a, true, 70365, new Class[]{Context.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this, (byte) 1, 2}, null, QRCodePermissionActivity.f63311a, true, 70365, new Class[]{Context.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - QRCodePermissionActivity.f63313c >= 1000) {
            QRCodePermissionActivity.f63313c = currentTimeMillis;
            QRCodePermissionActivity.f63312b = 2;
            Intent intent = new Intent(this, QRCodePermissionActivity.class);
            intent.putExtra("finishAfterScan", true);
            intent.putExtra("page_from", 2);
            startActivity(intent);
        }
    }

    @OnClick({2131493370})
    public void setCarrierRegion() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72759, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72759, new Class[0], Void.TYPE);
            return;
        }
        String obj = this.etInput.getText().toString();
        if (PatchProxy.isSupport(new Object[]{this, obj}, null, com.ss.android.ugc.aweme.language.e.f53002a, true, 55069, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this, obj}, null, com.ss.android.ugc.aweme.language.e.f53002a, true, 55069, new Class[]{Context.class, String.class}, Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.q.c.a(this, "test_setting", 0).edit().putString("pref_carrier", obj).apply();
        }
        com.bytedance.ies.dmt.ui.d.a.a((Context) this, "保存成功, 重启后生效").a();
    }

    @OnClick({2131492876})
    public void toAb() {
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72760, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72760, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.debug.a aVar = new com.ss.android.ugc.aweme.app.debug.a();
        aVar.category = getString(C0906R.string.a3);
        if (PatchProxy.isSupport(new Object[]{this, aVar}, null, AbTestSettingActivity.f34125a, true, 23313, new Class[]{Context.class, com.ss.android.ugc.aweme.app.debug.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this, aVar}, null, AbTestSettingActivity.f34125a, true, 23313, new Class[]{Context.class, com.ss.android.ugc.aweme.app.debug.a.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(this, AbTestSettingActivity.class);
        intent.putExtra("paeg_param", aVar);
        startActivity(intent);
    }

    @OnClick({2131497829})
    public void clickChangeRegion() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72751, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72751, new Class[0], Void.TYPE);
            return;
        }
        String b2 = com.ss.android.ugc.aweme.language.e.b();
        AnonymousClass4 r1 = new e.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64293a;

            public final void a(String str) {
                if (PatchProxy.isSupport(new Object[]{str}, this, f64293a, false, 72831, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f64293a, false, 72831, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                TestSettingActivity.this.etInput.setText(str);
                TestSettingActivity.this.etInput.setSelection(str.length());
                TestSettingActivity.this.setCarrierRegion();
            }
        };
        if (PatchProxy.isSupport(new Object[]{this, b2, r1}, null, com.ss.android.ugc.aweme.language.e.f53002a, true, 55067, new Class[]{Activity.class, String.class, e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this, b2, r1}, null, com.ss.android.ugc.aweme.language.e.f53002a, true, 55067, new Class[]{Activity.class, String.class, e.a.class}, Void.TYPE);
            return;
        }
        ai b3 = com.ss.android.ugc.aweme.account.login.model.a.b();
        HashMap hashMap = new HashMap();
        cg it2 = b3.iterator();
        while (it2.hasNext()) {
            com.ss.android.ugc.aweme.account.login.model.a aVar = (com.ss.android.ugc.aweme.account.login.model.a) it2.next();
            if (aVar != null) {
                hashMap.put(aVar.f32262d, g.a((Context) this, aVar.f32260b));
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String next : com.ss.android.ugc.aweme.language.e.f53003b) {
            if (hashMap.get(next) == null) {
                str = "";
            } else {
                str = (String) hashMap.get(next);
            }
            arrayList.add(next);
            arrayList2.add("[" + next + "]" + str);
        }
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        new AlertDialog.Builder(this).setTitle((CharSequence) "选择国家地区码").setSingleChoiceItems((CharSequence[]) arrayList2.toArray(new String[arrayList2.size()]), arrayList.indexOf(b2), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(r1, arrayList) {

            /* renamed from: a */
            public static ChangeQuickRedirect f53006a;

            /* renamed from: b */
            final /* synthetic */ a f53007b;

            /* renamed from: c */
            final /* synthetic */ ArrayList f53008c;

            public final void onClick(
/*
Method generation error in method: com.ss.android.ugc.aweme.language.e.1.onClick(android.content.DialogInterface, int):void, dex: classes5.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.language.e.1.onClick(android.content.DialogInterface, int):void, class status: UNLOADED
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
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:89)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:680)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:89)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:680)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
        }).create().show();
    }

    @OnClick({2131493837})
    public void crash(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64283a, false, 72755, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64283a, false, 72755, new Class[]{View.class}, Void.TYPE);
            return;
        }
        throw new IllegalStateException("test a crash");
    }

    @OnClick({2131493213})
    public void exit(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f64283a, false, 72754, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f64283a, false, 72754, new Class[]{View.class}, Void.TYPE);
            return;
        }
        finish();
    }

    private void a(com.bytedance.ies.dmt.ui.widget.setting.b... bVarArr) {
        if (PatchProxy.isSupport(new Object[]{bVarArr}, this, f64283a, false, 72745, new Class[]{com.bytedance.ies.dmt.ui.widget.setting.b[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVarArr}, this, f64283a, false, 72745, new Class[]{com.bytedance.ies.dmt.ui.widget.setting.b[].class}, Void.TYPE);
            return;
        }
        for (int i = 0; i < 41; i++) {
            com.bytedance.ies.dmt.ui.widget.setting.b bVar = bVarArr[i];
            if (bVar != null) {
                bVar.setOnSettingItemClickListener(this);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        boolean z;
        int i;
        String str2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64283a, false, 72743, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64283a, false, 72743, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72746, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72746, new Class[0], Void.TYPE);
        } else {
            SharePrefCache inst = SharePrefCache.inst();
            this.httpsItem.setChecked(((Boolean) inst.getUseHttps().c()).booleanValue());
            this.hostItem.setChecked(((Boolean) inst.getUseDefaultHost().c()).booleanValue());
            this.rnFallback.setChecked(((Boolean) inst.getRnFallback().c()).booleanValue());
            this.debugWebBar.setChecked(((Boolean) inst.getDebugWebBar().c()).booleanValue());
            this.cronetItem.setChecked(((Boolean) inst.getUseCronet().c()).booleanValue());
            this.iesOfflineItem.setChecked(((Boolean) inst.getIesOffline().c()).booleanValue());
            this.geckoItem.setChecked(((Boolean) inst.getGeckoLocalTestUseOnline().c()).booleanValue());
            this.mTitleLayout.setBackgroundColor(getResources().getColor(C0906R.color.a17));
            this.f64286d = AwemeAppData.p();
            EditText editText = this.mEventHostEditText;
            AwemeAppData awemeAppData = this.f64286d;
            if (PatchProxy.isSupport(new Object[0], awemeAppData, AwemeAppData.ad, false, 22274, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], awemeAppData, AwemeAppData.ad, false, 22274, new Class[0], String.class);
            } else {
                if (System.currentTimeMillis() - awemeAppData.af > TimeUnit.DAYS.toMillis(2)) {
                    awemeAppData.ae = "";
                    awemeAppData.af = 0;
                }
                str = awemeAppData.ae;
            }
            editText.setText(str);
            this.mEventHostEditText.setOnEditorActionListener(new w(this));
            this.mEventHostOkBtn = (Button) findViewById(C0906R.id.aov);
            this.mEventHostOkBtn.setOnClickListener(new x(this));
            this.mWebusedefaultOkBtn = (Button) findViewById(C0906R.id.dx1);
            this.mWebusedefaultOkBtn.setOnClickListener(new y(this));
            this.mSettingIntervalEditText.setText(String.valueOf(r.f64012e / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
            this.mSettingIntervalEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64289a;

                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f64289a, false, 72829, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f64289a, false, 72829, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                    } else if (i2 != 6 && i2 != 0) {
                        return false;
                    } else {
                        TestSettingActivity.this.d();
                        return true;
                    }
                }
            });
            this.mSettingIntervalOkBtn.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64291a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f64291a, false, 72830, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f64291a, false, 72830, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    TestSettingActivity.this.d();
                }
            });
            TextView textView = this.mTvDeveice;
            textView.setText("\nApkInfo: " + com.ss.android.newmedia.app.a.a(getApplicationInfo().sourceDir, 1903654775) + "\nChannel: " + i.a().getChannel() + "\nDeviceId: " + AppLog.getServerDeviceId() + "\nFLAVOR: douyinCn" + "\nFLAVOR_app: douyin" + "\nFLAVOR_mode: cn" + "\nUserId: " + d.a().getCurUserId());
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            TextView textView2 = this.mTvToolSdkVersion;
            StringBuilder sb = new StringBuilder("\nVESdk version: ");
            sb.append(iAVService.getVESDKVersion());
            sb.append("\nEffectSdk version: ");
            sb.append(iAVService.getEffectSDKVersion());
            textView2.setText(sb.toString());
            this.livePressureItem.setChecked(((Boolean) inst.mockLiveSend().c()).booleanValue());
            this.liveMoneyItem.setChecked(((Boolean) inst.mockLiveMoney().c()).booleanValue());
            this.liveResolutionItem.setChecked(((Boolean) inst.mockLiveResolution().c()).booleanValue());
            SettingItemSwitch settingItemSwitch = this.enableMicroAppItem;
            if (((Integer) SharePrefCache.inst().getDownloadMicroApp().c()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            settingItemSwitch.setChecked(z);
            this.enableMessagePb2Json.setChecked(((Boolean) SharePrefCache.inst().isEnableMessagePb2Json().c()).booleanValue());
            this.leakDetectorItem.setChecked(((com.ss.android.ugc.aweme.r.a) com.ss.android.ugc.aweme.base.sharedpref.c.a(this, com.ss.android.ugc.aweme.r.a.class)).a(Boolean.TRUE).booleanValue());
            c.a a2 = k.a();
            String str3 = "";
            if (a2 == c.a.Ijk) {
                str3 = "IJK";
            } else if (a2 == c.a.IjkHardware) {
                str3 = "IJK_HARDWARE";
            } else if (a2 == c.a.EXO) {
                str3 = "EXO";
            }
            this.mExoPlayerSwitch.setStartText(str3);
            String b2 = com.ss.android.ugc.aweme.language.e.b();
            EditText editText2 = this.etInput;
            if (com.ss.android.g.a.a()) {
                i = 0;
            } else {
                i = 8;
            }
            editText2.setVisibility(i);
            this.etInput.setText(b2);
            this.etInput.setSelection(b2.length());
            this.etInput.setTransformationMethod(new a());
            this.mLongVideoSwitch.setChecked(((IAVService) ServiceManager.get().getService(IAVService.class)).isLongVideoPermitted());
            this.mUseTestHost.setChecked(com.ss.android.ugc.aweme.aj.b.b().b((Context) this, "is_use_test_host", false));
            if (v.f75967b) {
                this.mUseNewFFmpeg.setStartText(getString(C0906R.string.aem));
            } else {
                this.mUseNewFFmpeg.setStartText(getString(C0906R.string.ael));
            }
            this.mUseNewFFmpeg.setChecked(((Boolean) inst.getUseNewFFmpeg().c()).booleanValue());
            this.showPLayerInfoUI.setChecked(((Boolean) inst.getShowPlayerInfoUI().c()).booleanValue());
            this.showVideoBitrateInfo.setChecked(((Boolean) inst.getShowVideoBitrateInfo().c()).booleanValue());
            if (com.ss.android.ugc.aweme.g.a.a() && AbTestManager.a().f() != null) {
                this.mMakeClientWatermark.setChecked(AbTestManager.a().f().forceMakeClientWatermark);
                this.mShowWatermarkInfo.setChecked(AbTestManager.a().f().showWatermarkDebugInfo);
            }
            this.mStickerChannel.setChecked(!((IAVService) ServiceManager.get().getService(IAVService.class)).getUsingOnline());
            SharedPreferences a3 = com.ss.android.ugc.aweme.q.c.a(this, "test_data", 0);
            this.interactStickerDebug.setChecked(a3.getBoolean("sp_interact_stickers_test", false));
            this.enableAnrChecker.setChecked(a3.getBoolean("sp_key_enable_anr", false));
            this.openVEHook.setChecked(m.f63637b);
            this.enableConanChecker.setChecked(false);
            this.switchToolsDir.setChecked(a3.getBoolean("sp_key_tools_dir_external", false));
            com.ss.android.ugc.aweme.account.c.c().setAuthorzieBindResult(this.f64285c);
            SettingItem settingItem = this.itemUnbindFlipChat;
            if (com.ss.android.sdk.b.b.a().a("flipchat")) {
                str2 = "已绑定";
            } else {
                str2 = "未绑定";
            }
            settingItem.setRightTxt(str2);
            if (com.ss.android.g.a.b()) {
                findViewById(C0906R.id.c2c).setVisibility(8);
            }
            this.itemSecUidChecker.setChecked(true);
        }
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72747, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72747, new Class[0], Void.TYPE);
        } else {
            this.mTitle.setText(getText(C0906R.string.civ));
            this.mEventHostEditText.setText(com.ss.android.ugc.aweme.q.c.a(this, "test_data", 0).getString("host", ""));
        }
        if (PatchProxy.isSupport(new Object[0], this, f64283a, false, 72744, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64283a, false, 72744, new Class[0], Void.TYPE);
        } else {
            a(this.iesOfflineItem, this.geckoItem, this.livePressureItem, this.liveMoneyItem, this.liveResolutionItem, this.mExoPlayerSwitch, this.mLongVideoSwitch, this.mUseNewFFmpeg, this.showPLayerInfoUI, this.showVideoBitrateInfo, this.mUseTestHost, this.httpsItem, this.hostItem, this.rnFallback, this.debugWebBar, this.cronetItem, this.logItem, this.mMakeClientWatermark, this.mShowWatermarkInfo, this.webRippleView, this.mCloseReactionOrigin, this.mUeTool, this.enableMicroAppItem, this.testOOM, this.leakDetectorItem, this.enableMessagePb2Json, this.mAutoDadian, this.geckoTestHelperItem, this.liveDebugItem, this.itemApplyRedbadge, this.mStickerChannel, this.itemClearMemoryCache, this.interactStickerDebug, this.itemUnbindFlipChat, this.enableAnrChecker, this.openVEHook, this.enableConanChecker, this.itemSecUidChecker, this.itemSearchAb, this.switchToolsDir, this.itemEnterAVTestSetting);
        }
        LinearLayout linearLayout = this.mSettingContainer;
        if (PatchProxy.isSupport(new Object[]{linearLayout}, null, com.ss.android.ugc.aweme.setting.annotation.b.f63809a, true, 72120, new Class[]{ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linearLayout}, null, com.ss.android.ugc.aweme.setting.annotation.b.f63809a, true, 72120, new Class[]{ViewGroup.class}, Void.TYPE);
        } else {
            a.i.a((Callable<TResult>) new Callable<ArrayList<View>>(linearLayout) {

                /* renamed from: a */
                public static ChangeQuickRedirect f63819a;

                /* renamed from: b */
                final /* synthetic */ ViewGroup f63820b;

                public final /* synthetic */ java.lang.Object call(
/*
Method generation error in method: com.ss.android.ugc.aweme.setting.annotation.b.5.call():java.lang.Object, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.setting.annotation.b.5.call():java.lang.Object, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:89)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:680)
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
            }).a((a.g<TResult, TContinuationResult>) new a.g<ArrayList<View>, Void>(linearLayout) {

                /* renamed from: a */
                public static ChangeQuickRedirect f63817a;

                /* renamed from: b */
                final /* synthetic */ ViewGroup f63818b;

                public final /* synthetic */ java.lang.Object then(
/*
Method generation error in method: com.ss.android.ugc.aweme.setting.annotation.b.4.then(a.i):java.lang.Object, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.setting.annotation.b.4.then(a.i):java.lang.Object, class status: UNLOADED
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
            }, a.i.f1052b);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestSettingActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f64283a, false, 72767, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f64283a, false, 72767, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (!(i3 == 1001 && intent != null && intent.getExtras() == null) && i3 == 10005) {
            if (i2 != -1 || !com.ss.android.sdk.b.b.a().a("flipchat")) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this, "飞聊绑定失败").a();
            } else {
                this.itemUnbindFlipChat.setRightTxt("已绑定");
                com.bytedance.ies.dmt.ui.d.a.a((Context) this, "飞聊绑定成功").a();
            }
        }
    }
}
