package com.ss.android.ad.splash.core.video;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.core.video.b;
import com.ss.android.ad.splash.core.video.e;
import com.ss.android.ad.splash.utils.f;
import com.ss.android.ad.splash.utils.h;
import com.ss.android.ad.splash.utils.k;
import com.ss.android.ad.splash.utils.l;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class g implements b, e.a, l.a {

    /* renamed from: a  reason: collision with root package name */
    public e f27784a;

    /* renamed from: b  reason: collision with root package name */
    public l f27785b = new l(this);

    /* renamed from: c  reason: collision with root package name */
    public long f27786c = 0;

    /* renamed from: d  reason: collision with root package name */
    public c f27787d;

    /* renamed from: e  reason: collision with root package name */
    public b.a f27788e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27789f;
    public Runnable g;
    private long h;
    private int i;
    private ViewGroup j;
    private long k = 0;
    private String l;
    private long m = 0;
    private long n;
    private List<String> o;
    private int[] p = new int[2];
    private ArrayList<Runnable> q;
    private boolean r;
    private WeakReference<Context> s;
    private boolean t;
    private boolean u;
    private long v;
    private Runnable w;

    public final void a() {
        this.r = false;
    }

    public final void c() {
        if (this.f27787d != null) {
            this.f27787d.b();
        }
    }

    public final void b() {
        if (this.f27788e != null) {
            this.k = System.currentTimeMillis() - this.f27786c;
            b.a aVar = this.f27788e;
            h.a(this.m, this.n);
            aVar.b();
        }
    }

    public final void d() {
        if (this.f27787d != null) {
            this.f27787d.c();
        }
        if (this.f27784a != null) {
            this.f27784a.e();
        }
        this.f27785b.removeCallbacks(this.w);
    }

    private void e() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("show_expected", this.i);
            String str = "not_real_time";
            if (this.f27789f) {
                str = "real_time";
            }
            jSONObject.put("show_type", str);
            if (com.ss.android.ad.splash.core.e.Q() != -1) {
                int i2 = 1;
                if (com.ss.android.ad.splash.core.e.Q() != 1) {
                    i2 = 2;
                }
                jSONObject.put("awemelaunch", i2);
            }
            jSONObject2.putOpt("ad_extra_data", jSONObject);
            jSONObject2.putOpt("is_ad_event", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            if (!com.ss.android.ad.splash.utils.g.a(this.l)) {
                jSONObject2.put("log_extra", this.l);
            }
            jSONObject2.put("ad_fetch_time", this.v);
        } catch (JSONException unused) {
            jSONObject2 = null;
        }
        com.ss.android.ad.splash.core.e.a(this.h, "splash_ad", "play", jSONObject2);
        com.ss.android.ad.splash.core.e.a(this.h, this.l, this.o, 2);
    }

    public final void a(@NonNull MotionEvent motionEvent) {
        if (this.f27788e != null) {
            b.a aVar = this.f27788e;
            h.a(this.m, this.n);
            aVar.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
    }

    public final void a(SurfaceHolder surfaceHolder) {
        this.r = true;
        if (this.f27787d != null) {
            c cVar = this.f27787d;
            cVar.a((Runnable) new Runnable(surfaceHolder) {

                /* renamed from: a */
                final /* synthetic */ SurfaceHolder f27758a;

                public final void run(
/*
Method generation error in method: com.ss.android.ad.splash.core.video.c.2.run():void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ad.splash.core.video.c.2.run():void, class status: UNLOADED
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
            if (this.q != null && !this.q.isEmpty()) {
                Iterator it2 = new ArrayList(this.q).iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                this.q.clear();
            }
        }
    }

    public final void a(Message message) {
        if (this.f27784a != null && message != null && this.s != null && this.s.get() != null) {
            int i2 = message.what;
            switch (i2) {
                case 108:
                    if (message.obj instanceof Long) {
                        this.n = ((Long) message.obj).longValue();
                        return;
                    }
                    break;
                case 109:
                    if (message.obj instanceof Long) {
                        this.m = ((Long) message.obj).longValue();
                        return;
                    }
                    break;
                default:
                    boolean z = true;
                    switch (i2) {
                        case 302:
                            int i3 = message.what;
                            if (this.s == null || this.s.get() == null) {
                                z = false;
                            }
                            if (z && this.f27784a != null) {
                                this.f27784a.c();
                                if (this.f27788e != null) {
                                    this.f27788e.a(this.k);
                                }
                            }
                            return;
                        case 303:
                            if (this.f27784a != null) {
                                this.f27784a.c();
                            }
                            if (this.f27788e != null) {
                                b.a aVar = this.f27788e;
                                h.a(this.m, this.n);
                                aVar.a();
                                return;
                            }
                            break;
                        case 304:
                            int i4 = message.arg1;
                            if (this.f27784a != null) {
                                this.f27784a.c();
                            }
                            if (this.t && i4 == 3 && !this.u) {
                                e();
                                this.u = true;
                                return;
                            }
                        case 305:
                            if (this.f27785b != null) {
                                this.f27785b.removeCallbacks(this.w);
                            }
                            if (!this.t && !this.u) {
                                e();
                                this.u = true;
                            }
                            if (this.f27784a != null) {
                                this.f27784a.c();
                                return;
                            }
                            break;
                        case 306:
                            if (this.f27784a != null) {
                                this.f27784a.c();
                                break;
                            }
                            break;
                    }
                    break;
            }
        }
    }

    public final boolean a(@NonNull f fVar) {
        int i2;
        if (com.ss.android.ad.splash.utils.g.a(fVar.f27773b) || com.ss.android.ad.splash.utils.g.a(fVar.f27772a)) {
            return false;
        }
        this.l = fVar.g;
        this.h = fVar.f27774c;
        this.i = fVar.l;
        this.v = fVar.h;
        this.f27784a.s = fVar.o;
        if (fVar.j) {
            e eVar = this.f27784a;
            int i3 = fVar.m;
            int i4 = fVar.n;
            if (!(eVar.f27768f == null || (i3 == 0 && i4 == 0))) {
                ((RelativeLayout.LayoutParams) eVar.f27768f.getLayoutParams()).setMargins(i3, i4, i3, i4);
            }
        }
        e eVar2 = this.f27784a;
        boolean z = fVar.j;
        boolean z2 = fVar.k;
        if (eVar2.s) {
            eVar2.g.setVisibility(8);
            if (z) {
                eVar2.f27766d.setVisibility(0);
                eVar2.r.setVisibility(0);
                if (com.ss.android.ad.splash.core.e.b()) {
                    eVar2.q.setVisibility(0);
                }
            }
            if (z2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) eVar2.p.getLayoutParams();
                layoutParams.height = f.g() - 4;
                eVar2.p.setLayoutParams(layoutParams);
                eVar2.p.setVisibility(4);
                eVar2.n.setPadding(4, 4, 0, 4);
                eVar2.n.setVisibility(0);
                eVar2.o.setBackgroundResource(2130840550);
                eVar2.o.setTextColor(eVar2.k.getResources().getColor(C0906R.color.a48));
            }
        } else {
            eVar2.g.setVisibility(8);
            if (z) {
                eVar2.f27766d.setVisibility(0);
                if (com.ss.android.ad.splash.core.e.b()) {
                    eVar2.f27764b.setVisibility(0);
                }
            }
            if (z2) {
                eVar2.f27763a.setVisibility(0);
                eVar2.f27765c.setVisibility(0);
            }
            if (z && com.ss.android.ad.splash.core.e.g() == 1) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(12);
                layoutParams2.addRule(11);
                layoutParams2.setMargins(0, 0, (int) k.a(eVar2.k, 10.0f), 0);
                eVar2.f27763a.setLayoutParams(layoutParams2);
                eVar2.f27763a.setPadding(0, 0, 0, (int) k.a(eVar2.k, 10.0f));
                eVar2.b();
            } else if (!z2) {
                eVar2.b();
            }
        }
        e eVar3 = this.f27784a;
        int i5 = fVar.f27775d;
        int i6 = fVar.f27776e;
        eVar3.h = i5;
        eVar3.i = i6;
        e eVar4 = this.f27784a;
        ViewGroup viewGroup = this.j;
        if (eVar4.j.getParent() != null) {
            ((ViewGroup) eVar4.j.getParent()).removeView(eVar4.j);
        }
        viewGroup.addView(eVar4.j);
        eVar4.b(0);
        int i7 = fVar.i;
        if (this.f27784a.a() instanceof FrameLayout.LayoutParams) {
            this.j.getLocationInWindow(this.p);
            FrameLayout.LayoutParams a2 = this.f27784a.a();
            if (a2 != null) {
                a2.topMargin = i7;
                a2.leftMargin = 0;
                a2.gravity = 51;
                this.f27784a.j.setLayoutParams(a2);
            }
        }
        this.f27785b = new l(this);
        this.f27787d = new c(this.f27785b);
        e eVar5 = this.f27784a;
        int i8 = fVar.f27775d;
        if (i8 == -1) {
            i8 = eVar5.k.getResources().getDisplayMetrics().widthPixels;
        }
        if (i8 > 0) {
            if (eVar5.h <= 0 || eVar5.i <= 0) {
                i2 = 0;
            } else {
                i2 = eVar5.k.getResources().getDimensionPixelSize(C0906R.dimen.lh);
                int dimensionPixelSize = eVar5.k.getResources().getDimensionPixelSize(C0906R.dimen.li);
                int i9 = (int) (((float) eVar5.i) * ((((float) i8) * 1.0f) / ((float) eVar5.h)));
                if (i9 <= i2) {
                    if (i9 < dimensionPixelSize) {
                        i2 = dimensionPixelSize;
                    } else {
                        i2 = i9;
                    }
                }
            }
            ViewGroup.LayoutParams layoutParams3 = eVar5.j.getLayoutParams();
            if (i8 == -1 || i8 == -2 || i8 > 0) {
                layoutParams3.width = i8;
            }
            if (i2 == -1 || i2 == -2 || i2 > 0) {
                layoutParams3.height = i2;
            }
            eVar5.j.setLayoutParams(layoutParams3);
        }
        this.k = 0;
        this.f27784a.g.setVisibility(0);
        try {
            String str = fVar.f27772a;
            if (this.f27787d != null) {
                c cVar = this.f27787d;
                cVar.a((Runnable) new Runnable(str) {

                    /* renamed from: a */
                    final /* synthetic */ String f27760a;

                    public final void run(
/*
Method generation error in method: com.ss.android.ad.splash.core.video.c.3.run():void, dex: classes3.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ad.splash.core.video.c.3.run():void, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
            this.f27786c = System.currentTimeMillis();
            if (!com.ss.android.ad.splash.utils.g.a(str)) {
                this.f27784a.a(8);
                this.f27784a.a(0);
                AnonymousClass1 r0 = new Runnable() {
                    public final void run() {
                        g.this.f27786c = System.currentTimeMillis();
                        g.this.f27784a.b(0);
                        if (g.this.f27787d != null) {
                            c cVar = g.this.f27787d;
                            cVar.f27755e = false;
                            if (cVar.f27751a != null) {
                                try {
                                    cVar.f27751a.a(0.0f, 0.0f);
                                } catch (Throwable unused) {
                                }
                            }
                            cVar.a((Runnable) new Runnable() {
                                public final void run(
/*
Method generation error in method: com.ss.android.ad.splash.core.video.c.1.run():void, dex: classes3.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ad.splash.core.video.c.1.run():void, class status: UNLOADED
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
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
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
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                            cVar.f27753c = 0;
                        }
                        if (g.this.f27785b != null) {
                            g.this.f27785b.postDelayed(g.this.g, 100);
                        }
                    }
                };
                if (!this.f27784a.l || !this.r) {
                    if (this.q == null) {
                        this.q = new ArrayList<>();
                    }
                    this.q.add(r0);
                } else {
                    r0.run();
                }
            }
            this.l = fVar.g;
            this.o = fVar.f27777f;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public g(Context context, ViewGroup viewGroup) {
        boolean z = false;
        this.u = false;
        this.f27789f = false;
        this.v = 0;
        this.g = new Runnable() {
            public final void run() {
                if (g.this.f27787d != null) {
                    c cVar = g.this.f27787d;
                    if (cVar.f27754d != null) {
                        cVar.f27754d.obtainMessage(108).sendToTarget();
                    }
                }
            }
        };
        this.w = new Runnable() {
            public final void run() {
                if (g.this.f27788e != null) {
                    g.this.f27788e.c();
                }
            }
        };
        this.j = viewGroup;
        this.s = new WeakReference<>(context);
        this.f27784a = new e(context, LayoutInflater.from(context.getApplicationContext()).inflate(C0906R.layout.ad9, null, false));
        this.f27784a.m = this;
        this.t = Build.VERSION.SDK_INT >= 17 ? true : z;
    }

    public final void a(int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder("surfaceChanged, format = ");
        sb.append(i2);
        sb.append(", width = ");
        sb.append(i3);
        sb.append(", height = ");
        sb.append(i4);
    }
}
