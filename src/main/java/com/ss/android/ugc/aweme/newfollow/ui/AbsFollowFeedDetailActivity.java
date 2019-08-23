package com.ss.android.ugc.aweme.newfollow.ui;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import butterknife.BindView;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import com.ss.android.ugc.aweme.common.widget.DragView;
import com.ss.android.ugc.aweme.feed.h.aa;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.e.a;
import com.ss.android.ugc.aweme.forward.view.FeedDetailActivity;
import com.ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.ss.android.ugc.aweme.newfollow.c.b;
import com.ss.android.ugc.aweme.newfollow.f.f;
import com.ss.android.ugc.aweme.newfollow.util.ScreenBroadcastReceiver;
import com.ss.android.ugc.aweme.newfollow.util.d;
import com.ss.android.ugc.aweme.newfollow.util.e;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.dq;

public abstract class AbsFollowFeedDetailActivity<T extends View> extends AmeSSActivity implements WeakHandler.IHandler, j, ScreenBroadcastReceiver.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57173a;

    /* renamed from: b  reason: collision with root package name */
    protected T f57174b;

    /* renamed from: c  reason: collision with root package name */
    protected Aweme f57175c;

    /* renamed from: d  reason: collision with root package name */
    public String f57176d;

    /* renamed from: e  reason: collision with root package name */
    protected String f57177e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f57178f;
    protected WeakHandler g;
    public String h = "list";
    public boolean i;
    protected DataCenter j;
    protected WidgetManager k;
    protected boolean l;
    private f m;
    @BindView(2131493960)
    protected DiggLayout mDiggLayout;
    @BindView(2131493925)
    protected DragView mDragView;
    @BindView(2131496848)
    protected ViewGroup mRootView;
    private boolean n;
    private MotionEvent o;
    private MotionEvent p;
    private boolean q;
    private ScreenBroadcastReceiver r;

    public final void a(Aweme aweme) {
    }

    public final void a(f fVar) {
    }

    public final void a(Exception exc, Aweme aweme) {
    }

    public abstract int f();

    public void g() {
    }

    public Context getContext() {
        return null;
    }

    public void h() {
    }

    public abstract T j();

    public abstract void k();

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61425, new Class[0], Void.TYPE);
        } else if (this.f57175c != null) {
            d c2 = e.a().c(this.f57177e);
            if (c2 != null) {
                c2.a(this.f57176d);
            }
        }
    }

    public final void K_() {
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61434, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61434, new Class[0], Void.TYPE);
            return;
        }
        if (this.mStatusActive) {
            l();
        }
    }

    public boolean isActive() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61433, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61433, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (super.isActive() && this.q) {
            z = true;
        }
        return z;
    }

    public void l() {
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61422, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61422, new Class[0], Void.TYPE);
            return;
        }
        if (!this.q) {
            a();
            c();
            this.q = true;
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61428, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61428, new Class[0], Void.TYPE);
            return;
        }
        if (this.mDragView != null) {
            this.mDragView.a();
        }
    }

    public final Aweme n() {
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61431, new Class[0], Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61431, new Class[0], Aweme.class);
        } else if (this.f57175c == null || this.f57175c.getAwemeType() != 13) {
            return this.f57175c;
        } else {
            return this.f57175c.getForwardItem();
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61427, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61427, new Class[0], Void.TYPE);
            return;
        }
        m();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61421, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (!dq.a()) {
            a();
            c();
            this.q = true;
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61423, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61423, new Class[0], Void.TYPE);
        } else if ("detail".equals(a.a())) {
            com.ss.android.ugc.aweme.newfollow.g.a.b();
        } else if ("personal_homepage".equals(this.f57176d) || "others_homepage".equals(this.f57176d)) {
            com.ss.android.ugc.aweme.newfollow.g.a.b(this.f57176d);
        } else {
            com.ss.android.ugc.aweme.newfollow.g.a.a();
        }
    }

    public void i() {
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61417, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61417, new Class[0], Void.TYPE);
            return;
        }
        if (this.f57175c != null) {
            d c2 = e.a().c(this.f57177e);
            if (c2 != null) {
                c2.f57413d.b(16777216);
            }
        }
        finish();
        overridePendingTransition(0, 0);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61419, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61419, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (com.ss.android.ugc.aweme.feed.k.a.f45564a == this.f57175c) {
            com.ss.android.ugc.aweme.feed.k.a.f45564a = null;
        }
        this.r.a();
        if (this.m != null) {
            this.m.k();
            this.m.j();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61420, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (!isFinishing()) {
            if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61424, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61424, new Class[0], Void.TYPE);
            } else if ("detail".equals(a.a())) {
                com.ss.android.ugc.aweme.newfollow.g.a.b(this.f57176d, "detail");
            } else if ("personal_homepage".equals(this.f57176d) || "others_homepage".equals(this.f57176d)) {
                String str = this.f57176d;
                if (PatchProxy.isSupport(new Object[]{str, "list"}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61352, new Class[]{String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, "list"}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61352, new Class[]{String.class, String.class}, Void.TYPE);
                } else if (com.ss.android.ugc.aweme.newfollow.g.a.a(str) != -1) {
                    long currentTimeMillis = System.currentTimeMillis() - com.ss.android.ugc.aweme.newfollow.g.a.a(str);
                    if (currentTimeMillis > 0) {
                        com.ss.android.ugc.aweme.newfollow.g.a.a(currentTimeMillis, str, "list");
                    }
                    com.ss.android.ugc.aweme.newfollow.g.a.a(str, -1);
                }
            } else {
                com.ss.android.ugc.aweme.newfollow.g.a.a(this.f57176d, "list");
            }
            if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61426, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61426, new Class[0], Void.TYPE);
            } else if (this.f57175c != null) {
                d c2 = e.a().c(this.f57177e);
                if (c2 != null) {
                    c2.b(this.f57176d);
                }
            }
        }
        this.q = false;
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f57173a, false, 61432, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f57173a, false, 61432, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2.what == 0) {
            k();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f57173a, false, 61418, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f57173a, false, 61418, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                if (this.g.hasMessages(0)) {
                    this.g.removeMessages(0);
                }
                if (com.ss.android.ugc.aweme.newfollow.util.f.a(this.o, this.p, motionEvent, (Context) this)) {
                    this.n = true;
                    if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61429, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61429, new Class[0], Void.TYPE);
                    } else {
                        Aweme n2 = n();
                        if (!(n2 == null || n2.getStatus() == null || n2.getStatus().getPrivateStatus() == 1)) {
                            this.mDiggLayout.a(this.o.getX(), this.o.getY());
                        }
                        if (this.f57175c.getAwemeType() != 13) {
                            bg.a(new b(0, this.f57175c));
                        } else if (!(this.m == null || n2 == null)) {
                            if (PatchProxy.isSupport(new Object[]{n2}, this, f57173a, false, 61430, new Class[]{Aweme.class}, Boolean.TYPE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{n2}, this, f57173a, false, 61430, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                            } else {
                                if (n2 != null) {
                                    Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(n2.getAid());
                                    int userDigg = n2.getUserDigg();
                                    if (b2 != null) {
                                        userDigg = b2.getUserDigg();
                                    }
                                    if (userDigg == 1) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            if (!z) {
                                this.m.a(n2, 1);
                            }
                        }
                    }
                } else {
                    this.n = false;
                }
                if (this.o != null) {
                    this.o.recycle();
                }
                this.o = MotionEvent.obtain(motionEvent);
                if (this.n || super.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 1:
                if (!this.n && this.o != null && !com.ss.android.ugc.aweme.newfollow.util.f.a(0, this.o, motionEvent, (Context) this)) {
                    this.g.sendMessageDelayed(this.g.obtainMessage(0), (((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime()) + this.o.getEventTime());
                }
                if (this.p != null) {
                    this.p.recycle();
                }
                this.p = MotionEvent.obtain(motionEvent);
                if (this.n || super.dispatchTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 2:
                if (com.ss.android.ugc.aweme.newfollow.util.f.a(0, this.o, motionEvent, (Context) this)) {
                    this.g.removeMessages(0);
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f57173a, false, 61415, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f57173a, false, 61415, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        this.mActivityAnimType = 1;
        super.onCreate(bundle);
        setContentView(f());
        if (PatchProxy.isSupport(new Object[0], this, f57173a, false, 61416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57173a, false, 61416, new Class[0], Void.TYPE);
        } else {
            this.f57176d = getIntent().getStringExtra("enter_from");
            this.f57177e = getIntent().getStringExtra("share_id");
            this.h = getIntent().getStringExtra("page_type");
            this.i = getIntent().getBooleanExtra("launch_from_origin_detail", false);
            this.f57178f = getIntent().getBooleanExtra("use_follow_flow_strategy", false);
            this.f57175c = com.ss.android.ugc.aweme.feed.k.a.f45564a;
            this.f57174b = j();
            DragView dragView = this.mDragView;
            T t = this.f57174b;
            DragView.b bVar = (DragView.b) getIntent().getParcelableExtra("view_info");
            if (PatchProxy.isSupport(new Object[]{t, bVar}, dragView, DragView.f40338a, false, 33583, new Class[]{View.class, DragView.b.class}, Void.TYPE)) {
                DragView dragView2 = dragView;
                PatchProxy.accessDispatch(new Object[]{t, bVar}, dragView2, DragView.f40338a, false, 33583, new Class[]{View.class, DragView.b.class}, Void.TYPE);
            } else if (!(t == null || bVar == null)) {
                dragView.getViewTreeObserver().addOnGlobalLayoutListener(dragView);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(bVar.f40383d, bVar.f40384e);
                layoutParams.leftMargin = bVar.f40381b;
                layoutParams.topMargin = bVar.f40382c;
                dragView.f40339b = t;
                dragView.f40340c = bVar;
                dragView.f40343f = bVar.f40385f;
                if (Build.VERSION.SDK_INT >= 21) {
                    dragView.f40339b.setOutlineProvider(new ViewOutlineProvider() {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f40344a;

                        public final void getOutline(
/*
Method generation error in method: com.ss.android.ugc.aweme.common.widget.DragView.1.getOutline(android.view.View, android.graphics.Outline):void, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.common.widget.DragView.1.getOutline(android.view.View, android.graphics.Outline):void, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                    });
                    dragView.f40339b.setClipToOutline(true);
                    dragView.f40339b.setVisibility(4);
                }
                dragView.addView(dragView.f40339b, layoutParams);
                dragView.i = 0;
                dragView.setBackgroundColor(dragView.i << 24);
            }
            this.mDragView.setDragStateListener(new DragView.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57179a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f57179a, false, 61435, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57179a, false, 61435, new Class[0], Void.TYPE);
                        return;
                    }
                    AbsFollowFeedDetailActivity.this.l = true;
                    AbsFollowFeedDetailActivity.this.h();
                }

                public final void b() {
                    if (PatchProxy.isSupport(new Object[0], this, f57179a, false, 61436, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57179a, false, 61436, new Class[0], Void.TYPE);
                        return;
                    }
                    AbsFollowFeedDetailActivity.this.l = true;
                    AbsFollowFeedDetailActivity.this.h();
                }

                public final void c() {
                    if (PatchProxy.isSupport(new Object[0], this, f57179a, false, 61437, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57179a, false, 61437, new Class[0], Void.TYPE);
                        return;
                    }
                    AbsFollowFeedDetailActivity.this.l = false;
                    AbsFollowFeedDetailActivity.this.h();
                }

                public final void d() {
                    if (PatchProxy.isSupport(new Object[0], this, f57179a, false, 61438, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57179a, false, 61438, new Class[0], Void.TYPE);
                        return;
                    }
                    AbsFollowFeedDetailActivity.this.l = true;
                    AbsFollowFeedDetailActivity.this.h();
                }

                public final void e() {
                    if (PatchProxy.isSupport(new Object[0], this, f57179a, false, 61439, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57179a, false, 61439, new Class[0], Void.TYPE);
                        return;
                    }
                    AbsFollowFeedDetailActivity.this.i();
                }
            });
            this.g = new WeakHandler(this);
            if (this.f57175c == null) {
                finish();
            } else {
                com.ss.android.ugc.aweme.newfollow.g.a.b(this.f57175c, this.f57176d);
                this.j = DataCenter.a(ViewModelProviders.of((FragmentActivity) this), (LifecycleOwner) this);
                this.k = WidgetManager.a((FragmentActivity) this, (View) this.mRootView);
                this.k.a(this.j);
                g();
            }
        }
        getWindow().setFlags(1024, 1024);
        this.r = new ScreenBroadcastReceiver(this);
        this.r.a(this);
        this.m = new f(this.f57176d, 0);
        this.m.d();
        this.m.a(new aa());
        this.m.a((j) this);
    }

    public static void a(Context context, DragView.b bVar, Aweme aweme, String str, String str2) {
        String str3;
        Context context2 = context;
        DragView.b bVar2 = bVar;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, bVar2, aweme, str4, str5}, null, f57173a, true, 61411, new Class[]{Context.class, DragView.b.class, Aweme.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context2, bVar2, aweme, str4, str5};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f57173a, true, 61411, new Class[]{Context.class, DragView.b.class, Aweme.class, String.class, String.class}, Void.TYPE);
        } else if (aweme != null) {
            Intent intent = new Intent(context2, ImageFollowFeedDetailActivity.class);
            intent.putExtra("view_info", bVar2);
            com.ss.android.ugc.aweme.feed.k.a.a(aweme);
            intent.putExtra("enter_from", str4);
            intent.putExtra("share_id", str5);
            intent.putExtra("launch_from_origin_detail", com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof OriginDetailActivity);
            if (com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof FeedDetailActivity) {
                str3 = "detail";
            } else {
                str3 = "list";
            }
            intent.putExtra("page_type", str3);
            context2.startActivity(intent);
        }
    }

    public static void a(Context context, DragView.b bVar, Aweme aweme, int i2, String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{context, bVar, aweme, 2, str, str2}, null, f57173a, true, 61412, new Class[]{Context.class, DragView.b.class, Aweme.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, bVar, aweme, 2, str, str2};
            PatchProxy.accessDispatch(objArr, null, f57173a, true, 61412, new Class[]{Context.class, DragView.b.class, Aweme.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        a(context, bVar, aweme, 2, str, str2, false);
    }

    private static void a(Context context, DragView.b bVar, Aweme aweme, int i2, String str, String str2, boolean z) {
        if (PatchProxy.isSupport(new Object[]{context, bVar, aweme, Integer.valueOf(i2), str, str2, (byte) 0}, null, f57173a, true, 61413, new Class[]{Context.class, DragView.b.class, Aweme.class, Integer.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, bVar, aweme, Integer.valueOf(i2), str, str2, (byte) 0}, null, f57173a, true, 61413, new Class[]{Context.class, DragView.b.class, Aweme.class, Integer.TYPE, String.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(context, bVar, aweme, i2, str, str2, false, false);
    }

    public static void a(Context context, DragView.b bVar, Aweme aweme, int i2, String str, String str2, boolean z, boolean z2) {
        String str3;
        Context context2 = context;
        DragView.b bVar2 = bVar;
        String str4 = str;
        String str5 = str2;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{context2, bVar2, aweme, Integer.valueOf(i2), str4, str5, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f57173a, true, 61414, new Class[]{Context.class, DragView.b.class, Aweme.class, Integer.TYPE, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bVar2, aweme, Integer.valueOf(i2), str4, str5, Byte.valueOf(z), Byte.valueOf(z2)}, null, f57173a, true, 61414, new Class[]{Context.class, DragView.b.class, Aweme.class, Integer.TYPE, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (aweme != null) {
            if (com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof OriginDetailActivity) {
                z3 = true;
            }
            Intent intent = new Intent(context2, VideoFollowFeedDetailActivity.class);
            intent.putExtra("view_info", bVar2);
            com.ss.android.ugc.aweme.feed.k.a.a(aweme);
            intent.putExtra("play_action_type", i2);
            intent.putExtra("enter_from", str4);
            intent.putExtra("share_id", str5);
            intent.putExtra("launch_from_origin_detail", z3);
            intent.putExtra("use_follow_flow_strategy", z2);
            if (com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof FeedDetailActivity) {
                str3 = "detail";
            } else {
                str3 = "list";
            }
            intent.putExtra("page_type", str3);
            intent.putExtra("pause_on_close", z);
            context2.startActivity(intent);
        }
    }
}
