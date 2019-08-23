package com.ss.android.ugc.aweme.setting.ui;

import a.i;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.setting.api.BlackApiManager;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public class ChatControlSettingActivity extends BaseControlSettingActivity implements WeakHandler.IHandler {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f64127e;

    /* renamed from: f  reason: collision with root package name */
    private int f64128f;
    private boolean g;
    private boolean h;
    private String i;
    private WeakHandler j;

    public final String e() {
        return "";
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64127e, false, 72437, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64127e, false, 72437, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64127e, false, 72438, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64127e, false, 72438, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64127e, false, 72439, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64127e, false, 72439, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.ChatControlSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f64127e, false, 72436, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64127e, false, 72436, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f64127e, false, 72432, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64127e, false, 72432, new Class[0], Void.TYPE);
            return;
        }
        this.mEveryoneItem.setTag(1);
        this.mFriendsItem.setTag(2);
        this.mOffItem.setTag(3);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f64127e, false, 72429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64127e, false, 72429, new Class[0], Void.TYPE);
        } else if (!a.b()) {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.w1).statusBarDarkFont(true).init();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f64127e, false, 72430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64127e, false, 72430, new Class[0], Void.TYPE);
            return;
        }
        if (this.h) {
            this.mTitle.setText(getString(C0906R.string.s5));
        } else {
            this.mTitle.setText(getString(C0906R.string.dtr));
        }
        if (this.g || !a.b()) {
            this.mEveryoneItem.setVisibility(0);
            if (1 == this.f64128f) {
                a(this.mEveryoneItem);
            }
        } else {
            this.mEveryoneItem.setVisibility(8);
        }
        if (3 == this.f64128f) {
            a(this.mOffItem);
        } else if (2 == this.f64128f) {
            a(this.mFriendsItem);
        }
        if (b.c() && !this.h) {
            a((CharSequence) getString(C0906R.string.c4v));
        }
    }

    public final void a() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f64127e, false, 72431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64127e, false, 72431, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = getIntent();
        int i3 = 1;
        if (a.b()) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        this.f64128f = intent.getIntExtra("chat_set", i2);
        if (-1 == this.f64128f || this.f64128f == 0) {
            if (a.b()) {
                i3 = 2;
            }
            this.f64128f = i3;
        }
        if (a.b()) {
            this.g = getIntent().getBooleanExtra("chat_setting_open_everyone", false);
        }
        this.f64104b = this.f64128f;
        this.h = getIntent().getBooleanExtra("from_parental_platform", false);
        this.i = getIntent().getStringExtra("user_id");
        this.j = new WeakHandler(this);
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f64127e, false, 72433, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f64127e, false, 72433, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        switch (i2) {
            case 1:
                a(this.mEveryoneItem);
                return;
            case 2:
                a(this.mFriendsItem);
                return;
            case 3:
                a(this.mOffItem);
                break;
        }
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f64127e, false, 72435, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f64127e, false, 72435, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        Object obj = message2.obj;
        if (obj instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            X_();
        } else if (obj instanceof Exception) {
            X_();
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f64127e, false, 72434, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f64127e, false, 72434, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.h) {
            HashMap hashMap = new HashMap();
            hashMap.put("chat_set", String.valueOf(i2));
            q<BaseResponse> a2 = ParentalPlatformApi.a(this.i, hashMap);
            if (a2 != null) {
                l.a(a2, new k<BaseResponse>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64129a;

                    public final /* bridge */ /* synthetic */ void onSuccess(@NullableDecl Object obj) {
                    }

                    public final void onFailure(Throwable th) {
                        if (PatchProxy.isSupport(new Object[]{th}, this, f64129a, false, 72440, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th}, this, f64129a, false, 72440, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        i.a((Callable<TResult>) new Callable<Object>() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f64131a;

                            public final Object call() throws Exception {
                                if (PatchProxy.isSupport(new Object[0], this, f64131a, false, 72441, new Class[0], Object.class)) {
                                    return PatchProxy.accessDispatch(new Object[0], this, f64131a, false, 72441, new Class[0], Object.class);
                                }
                                ChatControlSettingActivity.this.X_();
                                return null;
                            }
                        }, i.f1052b);
                    }
                });
            }
        } else {
            WeakHandler weakHandler = this.j;
            if (PatchProxy.isSupport(new Object[]{weakHandler, Integer.valueOf(i2)}, null, BlackApiManager.f63835a, true, 72142, new Class[]{WeakHandler.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{weakHandler, Integer.valueOf(i2)}, null, BlackApiManager.f63835a, true, 72142, new Class[]{WeakHandler.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            m.a().a(weakHandler, new Callable(i2) {

                /* renamed from: a */
                public static ChangeQuickRedirect f63837a;

                /* renamed from: b */
                final /* synthetic */ int f63838b;

                public final java.lang.Object call(
/*
Method generation error in method: com.ss.android.ugc.aweme.setting.api.BlackApiManager.1.call():java.lang.Object, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.setting.api.BlackApiManager.1.call():java.lang.Object, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
            }, 1);
        }
    }

    public static final void a(Context context, int i2, boolean z, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0), str2}, null, f64127e, true, 72428, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i2), Byte.valueOf(z), str2}, null, f64127e, true, 72428, new Class[]{Context.class, Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, ChatControlSettingActivity.class);
        intent.putExtra("chat_set", i2);
        intent.putExtra("chat_setting_open_everyone", z);
        intent.putExtra("from_parental_platform", true);
        intent.putExtra("user_id", str2);
        if (context2 instanceof Application) {
            intent.addFlags(268435456);
        }
        context2.startActivity(intent);
    }
}
