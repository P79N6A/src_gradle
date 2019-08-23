package com.ss.android.ugc.aweme.im.sdk.module.stranger;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.im.core.a.a.b;
import com.bytedance.im.core.b.b.a.r;
import com.bytedance.im.core.d.d;
import com.bytedance.im.core.d.g;
import com.bytedance.im.core.d.j;
import com.bytedance.im.core.d.q;
import com.bytedance.im.core.proto.MarkStrangerAllConversationReadRequestBody;
import com.bytedance.im.core.proto.RequestBody;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.ss.android.ugc.aweme.im.sdk.module.session.SessionListAdapter;
import com.ss.android.ugc.aweme.im.sdk.module.stranger.c.a;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.widget.ImTextTitleBar;
import org.greenrobot.eventbus.c;

public class StrangerListActivity extends AmeActivity implements LoadMoreRecyclerViewAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51932a = null;

    /* renamed from: e  reason: collision with root package name */
    private static final String f51933e = "StrangerListActivity";

    /* renamed from: b  reason: collision with root package name */
    public a f51934b;

    /* renamed from: c  reason: collision with root package name */
    public DmtStatusView f51935c;

    /* renamed from: d  reason: collision with root package name */
    public ImTextTitleBar f51936d;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f51937f;
    private SessionListAdapter g;
    private com.ss.android.ugc.aweme.im.sdk.module.stranger.b.a h;

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f51932a, false, 52521, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f51932a, false, 52521, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f51932a, false, 52519, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51932a, false, 52519, new Class[0], Void.TYPE);
            return;
        }
        this.h.a(4);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f51932a, false, 52517, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51932a, false, 52517, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onResume", true);
        super.onResume();
        if (this.h != null) {
            a();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onResume", false);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51932a, false, 52515, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51932a, false, 52515, new Class[0], Void.TYPE);
        } else if (NetworkUtils.isNetworkAvailable(this)) {
            if (this.g.getItemCount() == 0) {
                this.f51935c.d();
            }
            this.h.a(1);
        } else {
            if (this.g.getItemCount() == 0) {
                com.ss.android.b.a.a.a.a(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f51942a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f51942a, false, 52525, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f51942a, false, 52525, new Class[0], Void.TYPE);
                        } else if (StrangerListActivity.this.isViewValid()) {
                            StrangerListActivity.this.f51934b.b();
                            StrangerListActivity.this.f51935c.f();
                            com.bytedance.ies.dmt.ui.d.a.b((Context) StrangerListActivity.this, (int) C0906R.string.bgf).a();
                        }
                    }
                }, 100);
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f51932a, false, 52518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51932a, false, 52518, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.h != null) {
            this.h.k();
        }
        if (this.f51934b != null) {
            a aVar = this.f51934b;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f3397a, false, 52551, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f3397a, false, 52551, new Class[0], Void.TYPE);
            } else {
                if (c.a().b((Object) aVar)) {
                    c.a().c(aVar);
                }
                d.a().b((g) aVar.f3401e);
            }
        }
        if (this.f51937f != null) {
            this.f51937f.setAdapter(null);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51932a, false, 52513, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51932a, false, 52513, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.e5);
        com.ss.android.ugc.aweme.im.sdk.d.a.b().setupStatusBar(this);
        if (PatchProxy.isSupport(new Object[0], this, f51932a, false, 52514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51932a, false, 52514, new Class[0], Void.TYPE);
        } else {
            this.f51936d = (ImTextTitleBar) findViewById(C0906R.id.d3m);
            if (!m.a()) {
                this.f51936d.setRightTextSize(UIUtils.dip2Px(this, 15.0f));
                this.f51936d.setRightText((int) C0906R.string.aup);
            }
            this.f51936d.setOnTitlebarClickListener(new ImTextTitleBar.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51938a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f51938a, false, 52522, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f51938a, false, 52522, new Class[0], Void.TYPE);
                        return;
                    }
                    StrangerListActivity.this.onBackPressed();
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f51938a, false, 52523, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f51938a, false, 52523, new Class[0], Void.TYPE);
                        return;
                    }
                    StrangerListActivity strangerListActivity = StrangerListActivity.this;
                    if (PatchProxy.isSupport(new Object[0], strangerListActivity, StrangerListActivity.f51932a, false, 52520, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], strangerListActivity, StrangerListActivity.f51932a, false, 52520, new Class[0], Void.TYPE);
                        return;
                    }
                    AlertDialog create = new AlertDialog.Builder(strangerListActivity, C0906R.style.kx).setMessage((int) C0906R.string.auq).setCancelable(false).setPositiveButton((int) C0906R.string.aqb, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f51945a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51945a, false, 52526, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f51945a, false, 52526, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            q a2 = q.a();
                            AnonymousClass1 r1 = new b<Boolean>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f51947a;

                                public final void a(j jVar) {
                                    if (PatchProxy.isSupport(new Object[]{jVar}, this, f51947a, false, 52528, new Class[]{j.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{jVar}, this, f51947a, false, 52528, new Class[]{j.class}, Void.TYPE);
                                        return;
                                    }
                                    UIUtils.displayToast(GlobalContext.getContext(), StrangerListActivity.this.getResources().getString(C0906R.string.ave));
                                }

                                public final /* synthetic */ void a(Object obj) {
                                    Boolean bool = (Boolean) obj;
                                    if (PatchProxy.isSupport(new Object[]{bool}, this, f51947a, false, 52527, new Class[]{Boolean.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{bool}, this, f51947a, false, 52527, new Class[]{Boolean.class}, Void.TYPE);
                                        return;
                                    }
                                    StrangerListActivity.this.a();
                                }
                            };
                            com.bytedance.im.core.b.b.a.m.a();
                            new r(new b<Boolean>(r1) {

                                /* renamed from: a */
                                final /* synthetic */ b f21313a;

                                public final void a(
/*
Method generation error in method: com.bytedance.im.core.d.q.1.a(com.bytedance.im.core.d.j):void, dex: classes2.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.im.core.d.q.1.a(com.bytedance.im.core.d.j):void, class status: UNLOADED
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
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:623)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
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
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
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

                                public final /* synthetic */ void a(
/*
Method generation error in method: com.bytedance.im.core.d.q.1.a(java.lang.Object):void, dex: classes2.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.im.core.d.q.1.a(java.lang.Object):void, class status: UNLOADED
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
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:623)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
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
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
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
                            }).a(0, new RequestBody.Builder().mark_stranger_all_conversation_read_body(new MarkStrangerAllConversationReadRequestBody.Builder().build()).build(), null, new Object[0]);
                        }
                    }).setNegativeButton((int) C0906R.string.apk, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }).create();
                    if (!create.isShowing()) {
                        create.show();
                    }
                }
            });
            this.f51937f = (RecyclerView) findViewById(C0906R.id.cw8);
            this.f51937f.setLayoutManager(new LinearLayoutManager(this));
            this.g = new SessionListAdapter();
            this.g.f51844b = true;
            this.f51937f.setAdapter(this.g);
            this.f51937f.addOnScrollListener(new FrescoRecycleViewScrollListener(this));
            this.g.setLoadMoreListener(this);
            this.g.setShowFooter(com.ss.android.ugc.aweme.im.sdk.d.a.b().needSessionListShowMore());
            this.f51935c = (DmtStatusView) findViewById(C0906R.id.cvd);
            this.f51935c.setBuilder(DmtStatusView.a.a((Context) this).a(new c.a(this).a(2130840141).b((int) C0906R.string.axt).c(C0906R.string.axs).f20493a).a().a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51940a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f51940a, false, 52524, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f51940a, false, 52524, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    StrangerListActivity.this.a();
                }
            }));
        }
        if (PatchProxy.isSupport(new Object[0], this, f51932a, false, 52516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51932a, false, 52516, new Class[0], Void.TYPE);
        } else {
            this.h = new com.ss.android.ugc.aweme.im.sdk.module.stranger.b.a();
            this.h.a(new com.ss.android.ugc.aweme.im.sdk.module.stranger.a.a());
            this.f51934b = new a(this, this.g, this.f51935c);
            this.h.a(this.f51934b);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.stranger.StrangerListActivity", "onCreate", false);
    }
}
