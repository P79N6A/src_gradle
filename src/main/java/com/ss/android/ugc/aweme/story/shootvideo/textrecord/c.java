package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import a.g;
import a.i;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.story.shootvideo.a.b;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.f;
import com.ss.android.ugc.aweme.utils.ax;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class c implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74231a;

    /* renamed from: b  reason: collision with root package name */
    public StoryTextRecordLayout f74232b;

    /* renamed from: c  reason: collision with root package name */
    public View f74233c;

    /* renamed from: d  reason: collision with root package name */
    View f74234d;

    /* renamed from: e  reason: collision with root package name */
    public a f74235e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f74236f;
    private View g;
    private View h;
    private String i;
    private String j;
    private f k;

    public interface a {
        void a(String str, TextStickerData textStickerData);
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f74231a, false, 86189, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f74231a, false, 86189, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        this.i = str3;
        this.f74232b.q = this.i;
        this.j = str4;
        if (this.f74232b != null) {
            StoryTextRecordLayout storyTextRecordLayout = this.f74232b;
            if (PatchProxy.isSupport(new Object[]{str4, str3, (byte) 0, (byte) 1}, storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86214, new Class[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
                StoryTextRecordLayout storyTextRecordLayout2 = storyTextRecordLayout;
                PatchProxy.accessDispatch(new Object[]{str4, str3, (byte) 0, (byte) 1}, storyTextRecordLayout2, StoryTextRecordLayout.f74215a, false, 86214, new Class[]{String.class, String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            } else if (storyTextRecordLayout.v != null) {
                storyTextRecordLayout.v.a(str4, str3, false, true);
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74231a, false, 86195, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74231a, false, 86195, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f74232b != null) {
            StoryTextRecordLayout storyTextRecordLayout = this.f74232b;
            if (PatchProxy.isSupport(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86230, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86230, new Class[0], Void.TYPE);
            } else if (storyTextRecordLayout.v != null) {
                storyTextRecordLayout.f74216b.postDelayed(new p(storyTextRecordLayout), 300);
            }
        }
        if (!z) {
            this.f74234d.postDelayed(new h(this), 300);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f74231a, false, 86196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74231a, false, 86196, new Class[0], Void.TYPE);
        } else if (this.f74232b != null) {
            this.f74232b.dismiss();
            StoryTextRecordLayout storyTextRecordLayout = this.f74232b;
            if (PatchProxy.isSupport(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86232, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86232, new Class[0], Void.TYPE);
                return;
            }
            if (storyTextRecordLayout.v != null) {
                storyTextRecordLayout.v.e();
            }
        }
    }

    public final d c() {
        if (!PatchProxy.isSupport(new Object[0], this, f74231a, false, 86199, new Class[0], d.class)) {
            return d.a().a("creation_id", this.i).a("shoot_way", this.j).a("content_type", "photo").a("content_source", "shoot").a("enter_from", "video_shoot_page");
        }
        return (d) PatchProxy.accessDispatch(new Object[0], this, f74231a, false, 86199, new Class[0], d.class);
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f74231a, false, 86191, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74231a, false, 86191, new Class[0], Void.TYPE);
            return;
        }
        this.k.a();
        this.f74236f = false;
        com.ss.android.ugc.aweme.story.shootvideo.a.b(this.f74232b);
        com.ss.android.ugc.aweme.story.shootvideo.a.a(this.g);
        com.ss.android.ugc.aweme.story.shootvideo.a.a(this.h);
        if (this.f74234d != null) {
            this.f74234d.setBackgroundColor(0);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74231a, false, 86190, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74231a, false, 86190, new Class[0], Void.TYPE);
            return;
        }
        StoryTextRecordLayout storyTextRecordLayout = this.f74232b;
        if (PatchProxy.isSupport(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86212, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86212, new Class[0], Void.TYPE);
        } else if (storyTextRecordLayout.v == null) {
            if (PatchProxy.isSupport(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86213, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86213, new Class[0], Void.TYPE);
            } else {
                LayoutInflater.from(storyTextRecordLayout.getContext()).inflate(C0906R.layout.a9_, storyTextRecordLayout);
                storyTextRecordLayout.v = (StoryTextRecordTextInputLayout) storyTextRecordLayout.findViewById(C0906R.id.d27);
                storyTextRecordLayout.v.b(true);
                storyTextRecordLayout.v.q = false;
                storyTextRecordLayout.f74218d = (TextView) storyTextRecordLayout.findViewById(C0906R.id.ao7);
                storyTextRecordLayout.f74220f = storyTextRecordLayout.findViewById(C0906R.id.ks);
                storyTextRecordLayout.f74220f.setPadding(0, UIUtils.getStatusBarHeight(storyTextRecordLayout.getContext()), 0, 0);
                storyTextRecordLayout.h = storyTextRecordLayout.findViewById(C0906R.id.kb);
                storyTextRecordLayout.g = storyTextRecordLayout.findViewById(C0906R.id.ka);
                storyTextRecordLayout.i = storyTextRecordLayout.findViewById(C0906R.id.cn8);
                storyTextRecordLayout.k = storyTextRecordLayout.findViewById(C0906R.id.bql);
                storyTextRecordLayout.k.setVisibility(8);
                storyTextRecordLayout.f74216b = (FrameLayout) storyTextRecordLayout.findViewById(C0906R.id.kc);
                storyTextRecordLayout.f74217c = storyTextRecordLayout.findViewById(C0906R.id.kt);
                storyTextRecordLayout.h.setBackground(bc.a(-1, 16777215, (int) UIUtils.dip2Px(storyTextRecordLayout.getContext(), 2.0f), (int) UIUtils.dip2Px(storyTextRecordLayout.getContext(), 4.0f)));
                storyTextRecordLayout.k.setOnClickListener(new ax() {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f74221a;

                    public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.story.shootvideo.textrecord.StoryTextRecordLayout.1.a(android.view.View):void, dex: classes5.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.story.shootvideo.textrecord.StoryTextRecordLayout.1.a(android.view.View):void, class status: UNLOADED
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
                storyTextRecordLayout.v.setBgColorChangeListener(new k(storyTextRecordLayout));
                com.ss.android.ugc.aweme.notification.d.c.a(storyTextRecordLayout.k);
                com.ss.android.ugc.aweme.notification.d.c.b(storyTextRecordLayout.i);
                if (fc.a()) {
                    storyTextRecordLayout.a();
                }
            }
            if (PatchProxy.isSupport(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86217, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86217, new Class[0], Void.TYPE);
            } else {
                storyTextRecordLayout.f74217c.setBackground(bc.a(j.a().c().f74253a));
                storyTextRecordLayout.g.setBackground(bc.a(j.a().c().f74253a));
                storyTextRecordLayout.i.setOnClickListener(new l(storyTextRecordLayout));
                storyTextRecordLayout.v.setTextStickerUpdateListener(new m(storyTextRecordLayout));
                if (PatchProxy.isSupport(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86218, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86218, new Class[0], Void.TYPE);
                } else {
                    storyTextRecordLayout.f74216b.setOnClickListener(n.f74267b);
                    storyTextRecordLayout.f74216b.setOnTouchListener(new o(storyTextRecordLayout));
                }
            }
        }
        this.k.a(this);
        this.f74236f = true;
        com.ss.android.ugc.aweme.story.shootvideo.a.a(this.f74232b);
        com.ss.android.ugc.aweme.story.shootvideo.a.b(this.g);
        com.ss.android.ugc.aweme.story.shootvideo.a.b(this.h);
        if (this.f74234d != null) {
            this.f74234d.setBackground(bc.a(j.a().c().f74253a));
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74231a, false, 86197, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74231a, false, 86197, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f74236f) {
            StoryTextRecordLayout storyTextRecordLayout = this.f74232b;
            if (PatchProxy.isSupport(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86222, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86222, new Class[0], Void.TYPE);
            } else {
                storyTextRecordLayout.s = false;
                storyTextRecordLayout.v.setVisibility(0);
                if (PatchProxy.isSupport(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86225, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86225, new Class[0], Void.TYPE);
                } else {
                    if (storyTextRecordLayout.l != null) {
                        storyTextRecordLayout.l.a();
                    }
                    if (storyTextRecordLayout.f74219e == null) {
                        storyTextRecordLayout.f74218d.setVisibility(8);
                    } else {
                        storyTextRecordLayout.f74219e.setVisibility(8);
                        storyTextRecordLayout.k.setVisibility(8);
                    }
                }
                storyTextRecordLayout.b(false);
            }
        }
        StoryTextRecordLayout storyTextRecordLayout2 = this.f74232b;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, storyTextRecordLayout2, StoryTextRecordLayout.f74215a, false, 86231, new Class[]{Integer.TYPE}, Void.TYPE)) {
            StoryTextRecordLayout storyTextRecordLayout3 = storyTextRecordLayout2;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, storyTextRecordLayout3, StoryTextRecordLayout.f74215a, false, 86231, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        storyTextRecordLayout2.v.a(i2);
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74231a, false, 86198, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74231a, false, 86198, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f74232b.dismiss();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(boolean z) {
        this.f74234d.setBackground(bc.a(j.a().c().f74253a));
        if (!z) {
            StringBuilder sb = new StringBuilder();
            for (int i2 : j.a().c().f74253a) {
                sb.append("0x" + Integer.toHexString(i2) + ",");
            }
            com.ss.android.ugc.aweme.utils.a.f75468b.a("select_text_background", c().a("color", sb.toString()).f34114b);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(com.ss.android.ugc.aweme.shortvideo.view.c cVar, String str, i iVar) throws Exception {
        cVar.dismiss();
        if (iVar == null || iVar.d()) {
            com.bytedance.ies.dmt.ui.d.a.b(this.f74232b.getContext(), "保存图片失败!").a();
        } else if (!(this.f74235e == null || this.f74232b.getTextStickerData() == null)) {
            this.f74235e.a(str, this.f74232b.getTextStickerData());
        }
        return null;
    }

    public final void a(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f74231a, false, 86192, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f74231a, false, 86192, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        StoryTextRecordLayout storyTextRecordLayout = this.f74232b;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86227, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            StoryTextRecordLayout storyTextRecordLayout2 = storyTextRecordLayout;
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, storyTextRecordLayout2, StoryTextRecordLayout.f74215a, false, 86227, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i3 == -1 && i2 == 1000) {
            storyTextRecordLayout.a((TextStickerData) intent2.getParcelableExtra("text_sticker_data"));
        }
    }

    public final void a(View view, StoryTextRecordLayout storyTextRecordLayout, View view2, View view3, View view4, Fragment fragment) {
        View view5 = view;
        StoryTextRecordLayout storyTextRecordLayout2 = storyTextRecordLayout;
        View view6 = view2;
        View view7 = view3;
        View view8 = view4;
        Fragment fragment2 = fragment;
        if (PatchProxy.isSupport(new Object[]{view5, storyTextRecordLayout2, view6, view7, view8, fragment2}, this, f74231a, false, 86188, new Class[]{View.class, StoryTextRecordLayout.class, View.class, View.class, View.class, Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view5, storyTextRecordLayout2, view6, view7, view8, fragment2}, this, f74231a, false, 86188, new Class[]{View.class, StoryTextRecordLayout.class, View.class, View.class, View.class, Fragment.class}, Void.TYPE);
            return;
        }
        this.f74234d = view5;
        this.f74232b = storyTextRecordLayout2;
        this.g = view6;
        this.h = view7;
        this.f74233c = view8;
        this.f74232b.j = fragment2;
        this.k = new f(fragment.getActivity());
        this.f74232b.setStickerShowListener(new b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74237a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f74237a, false, 86205, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74237a, false, 86205, new Class[0], Void.TYPE);
                    return;
                }
                c.this.f74233c.setVisibility(8);
            }

            public final void dismiss() {
                if (PatchProxy.isSupport(new Object[0], this, f74237a, false, 86206, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74237a, false, 86206, new Class[0], Void.TYPE);
                    return;
                }
                c.this.f74233c.setVisibility(0);
            }
        });
        this.f74232b.setOnStoryTextRecordFinishListener(new b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74239a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f74239a, false, 86208, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f74239a, false, 86208, new Class[0], Void.TYPE);
                    return;
                }
                if (c.this.f74236f) {
                    StoryTextRecordLayout storyTextRecordLayout = c.this.f74232b;
                    if (PatchProxy.isSupport(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86221, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], storyTextRecordLayout, StoryTextRecordLayout.f74215a, false, 86221, new Class[0], Void.TYPE);
                    } else {
                        TextStickerData textStickerData = null;
                        if (storyTextRecordLayout.f74219e != null) {
                            textStickerData = new TextStickerData(storyTextRecordLayout.f74219e.getText(), storyTextRecordLayout.f74219e.getCurMode(), storyTextRecordLayout.f74219e.getCurColor(), storyTextRecordLayout.f74219e.getCurAlignTxt(), com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a().f74173c);
                        }
                        if (textStickerData == null) {
                            storyTextRecordLayout.v.a("", 1, -1, 2, com.ss.android.ugc.aweme.story.shootvideo.textfont.d.a().f74173c, true);
                        } else {
                            StoryTextRecordTextInputLayout storyTextRecordTextInputLayout = storyTextRecordLayout.v;
                            if (PatchProxy.isSupport(new Object[]{textStickerData, (byte) 0}, storyTextRecordTextInputLayout, TextStickerInputLayout.f74318b, false, 86382, new Class[]{TextStickerData.class, Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{textStickerData, (byte) 0}, storyTextRecordTextInputLayout, TextStickerInputLayout.f74318b, false, 86382, new Class[]{TextStickerData.class, Boolean.TYPE}, Void.TYPE);
                            } else {
                                storyTextRecordTextInputLayout.a(textStickerData.mTextStr, textStickerData.mBgMode, textStickerData.mColor, textStickerData.mAlign, textStickerData.mFontType, false);
                            }
                        }
                    }
                }
                com.ss.android.ugc.aweme.utils.a.f75468b.a("edit_text", c.this.c().a("enter_method", "click_screen").f34114b);
            }

            public final void a(boolean z) {
                i iVar;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74239a, false, 86207, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74239a, false, 86207, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                c cVar = c.this;
                if (PatchProxy.isSupport(new Object[0], cVar, c.f74231a, false, 86193, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], cVar, c.f74231a, false, 86193, new Class[0], Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.video.b.a(new File(com.ss.android.ugc.aweme.port.in.a.f61119b.getFilesDir().getAbsolutePath(), "story"));
                    String str = r1.getAbsolutePath() + File.separator + "story_text_bg.png";
                    try {
                        File file = new File(str);
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Exception unused) {
                    }
                    cVar.f74232b.u = false;
                    com.ss.android.ugc.aweme.shortvideo.view.c a2 = com.ss.android.ugc.aweme.shortvideo.view.c.a(cVar.f74232b.getContext(), cVar.f74232b.getContext().getResources().getString(C0906R.string.brl));
                    long currentTimeMillis = System.currentTimeMillis();
                    a2.setIndeterminate(true);
                    ArrayList arrayList = new ArrayList();
                    if (PatchProxy.isSupport(new Object[]{str}, cVar, c.f74231a, false, 86194, new Class[]{String.class}, i.class)) {
                        iVar = (i) PatchProxy.accessDispatch(new Object[]{str}, cVar, c.f74231a, false, 86194, new Class[]{String.class}, i.class);
                    } else {
                        iVar = i.a((Callable<TResult>) new f<TResult>(cVar), i.f1052b).a((g<TResult, TContinuationResult>) new g<TResult,TContinuationResult>(str), (Executor) i.f1051a);
                    }
                    arrayList.add(iVar);
                    i.b((Collection<? extends i<?>>) arrayList);
                    i.a(Math.max(0, 500 - (System.currentTimeMillis() - currentTimeMillis)));
                    i.b((Collection<? extends i<?>>) arrayList).a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(cVar, a2, str), i.f1052b);
                }
                if (z) {
                    com.ss.android.ugc.aweme.utils.a.f75468b.a("text_complete", c.this.c().f34114b);
                }
            }
        });
        this.f74232b.setOnChangeBgColorListener(new d(this));
        this.f74234d.setBackground(bc.a(j.a().c().f74253a));
    }
}
