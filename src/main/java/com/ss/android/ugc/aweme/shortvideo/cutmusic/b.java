package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicScrollView;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.e;
import com.ss.android.ugc.aweme.shortvideo.f;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.utils.ey;

public final class b implements MusicDragView.a, MusicDragView.b, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66670a;

    /* renamed from: b  reason: collision with root package name */
    private View f66671b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f66672c;

    /* renamed from: d  reason: collision with root package name */
    private MusicDragView f66673d;

    /* renamed from: e  reason: collision with root package name */
    private e.a f66674e;

    /* renamed from: f  reason: collision with root package name */
    private f f66675f;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f66670a, false, 76044, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66670a, false, 76044, new Class[0], Void.TYPE);
            return;
        }
        this.f66674e.a(this.f66673d.f66642e, this.f66673d.b());
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f66670a, false, 76045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66670a, false, 76045, new Class[0], Void.TYPE);
            return;
        }
        a();
        this.f66674e.b(this.f66673d.f66642e, this.f66673d.b());
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f66670a, false, 76042, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66670a, false, 76042, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f66671b == null) {
            return false;
        } else {
            if (this.f66671b != null) {
                this.f66672c.removeView(this.f66671b);
                this.f66671b = null;
            }
            return true;
        }
    }

    public final void a(f fVar) {
        this.f66675f = fVar;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66670a, false, 76043, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66670a, false, 76043, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f66673d != null) {
            MusicDragView musicDragView = this.f66673d;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, musicDragView, MusicDragView.f66638a, false, 76096, new Class[]{Integer.TYPE}, Void.TYPE)) {
                MusicDragView musicDragView2 = musicDragView;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, musicDragView2, MusicDragView.f66638a, false, 76096, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (musicDragView.cutMusicLayout != null && musicDragView.cutMusicLayout.getVisibility() == 0) {
                DmtCutMusicLayout dmtCutMusicLayout = musicDragView.cutMusicLayout;
                float f2 = (((float) i) * 1.0f) / ((float) musicDragView.f66643f);
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, dmtCutMusicLayout, DmtCutMusicLayout.f66620a, false, 76070, new Class[]{Float.TYPE}, Void.TYPE)) {
                    DmtCutMusicLayout dmtCutMusicLayout2 = dmtCutMusicLayout;
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, dmtCutMusicLayout2, DmtCutMusicLayout.f66620a, false, 76070, new Class[]{Float.TYPE}, Void.TYPE);
                    return;
                }
                dmtCutMusicLayout.a(f2, false);
            }
        }
    }

    public b(@NonNull FrameLayout frameLayout, @NonNull e.a aVar) {
        this.f66672c = frameLayout;
        this.f66674e = aVar;
    }

    public final void a(int i, int i2, int i3) {
        int i4;
        MusicDragView musicDragView;
        int i5 = i;
        int i6 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66670a, false, 76040, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f66670a, false, 76040, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        LayoutInflater from = LayoutInflater.from(this.f66672c.getContext());
        if (fc.a()) {
            i4 = C0906R.layout.aec;
        } else {
            i4 = C0906R.layout.gf;
        }
        this.f66671b = from.inflate(i4, this.f66672c, false);
        this.f66672c.addView(this.f66671b);
        View view = this.f66671b;
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, MusicDragView.f66638a, true, 76088, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, MusicDragView.class)) {
            musicDragView = (MusicDragView) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, null, MusicDragView.f66638a, true, 76088, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, MusicDragView.class);
        } else {
            MusicDragView musicDragView2 = new MusicDragView();
            musicDragView2.f66641d = i5;
            musicDragView2.f66642e = i3;
            musicDragView2.f66643f = i6;
            if (PatchProxy.isSupport(new Object[]{view}, musicDragView2, MusicDragView.f66638a, false, 76089, new Class[]{View.class}, MusicDragView.class)) {
                MusicDragView musicDragView3 = musicDragView2;
                MusicDragView musicDragView4 = (MusicDragView) PatchProxy.accessDispatch(new Object[]{view}, musicDragView3, MusicDragView.f66638a, false, 76089, new Class[]{View.class}, MusicDragView.class);
            } else {
                musicDragView2.f66640c = view;
                ButterKnife.bind((Object) musicDragView2, musicDragView2.f66640c);
                if (PatchProxy.isSupport(new Object[0], musicDragView2, MusicDragView.f66638a, false, 76094, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], musicDragView2, MusicDragView.f66638a, false, 76094, new Class[0], Void.TYPE);
                } else {
                    musicDragView2.mTextViewTotalTime.setText(ey.a(musicDragView2.f66643f));
                    musicDragView2.mTextViewTimeStart.setText(musicDragView2.mTimeString);
                    musicDragView2.f66639b = new ImageView(musicDragView2.f66640c.getContext());
                    musicDragView2.f66639b.setImageResource(2130838816);
                    musicDragView2.f66639b.setScaleType(ImageView.ScaleType.FIT_XY);
                    musicDragView2.slideContainer.addView(musicDragView2.f66639b);
                    musicDragView2.f66639b.setX(musicDragView2.mKTVView.getX() - ((float) (musicDragView2.f66639b.getWidth() / 2)));
                    musicDragView2.mKTVView.setLength(musicDragView2.a());
                    musicDragView2.f66639b.setOnTouchListener(musicDragView2);
                    musicDragView2.cutMusicLayout.setBubbleTextViewAttrite(f.c(musicDragView2.cutMusicLayout.getContext()));
                    musicDragView2.cutMusicLayout.setScrollListener(new DmtCutMusicScrollView.a() {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f66646a;

                        public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView.2.a(float):void, dex: classes5.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView.2.a(float):void, class status: UNLOADED
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

                        public final void b(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView.2.b(float):void, dex: classes5.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView.2.b(float):void, class status: UNLOADED
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
                    musicDragView2.cutMusicLayout.a((((float) musicDragView2.f66642e) * 1.0f) / ((float) musicDragView2.f66643f));
                    musicDragView2.cutMusicLayout.setTimeBubble(musicDragView2.f66642e);
                }
                musicDragView2.f66640c.bringToFront();
                if (musicDragView2.f66643f > musicDragView2.f66641d && musicDragView2.f66643f < musicDragView2.f66641d + PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) {
                    musicDragView2.g = true;
                }
            }
            view.post(new Runnable(musicDragView2) {

                /* renamed from: a */
                public static ChangeQuickRedirect f66644a;

                /* renamed from: b */
                final /* synthetic */ MusicDragView f66645b;

                public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView.1.run():void, dex: classes5.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView.1.run():void, class status: UNLOADED
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
            });
            if (musicDragView2.i != null) {
                musicDragView2.i.b();
            }
            musicDragView = musicDragView2;
        }
        musicDragView.h = this;
        musicDragView.i = this;
        this.f66673d = musicDragView;
        if (this.f66675f != null) {
            MusicDragView musicDragView5 = this.f66673d;
            f a2 = f.a().a(this.f66675f);
            if (PatchProxy.isSupport(new Object[]{a2, Integer.valueOf(i), Integer.valueOf(i2)}, musicDragView5, MusicDragView.f66638a, false, 76095, new Class[]{f.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                MusicDragView musicDragView6 = musicDragView5;
                PatchProxy.accessDispatch(new Object[]{a2, Integer.valueOf(i), Integer.valueOf(i2)}, musicDragView6, MusicDragView.f66638a, false, 76095, new Class[]{f.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                f.a().a(a2, (long) i5, (long) i6);
                f.a().b(a2);
                if (a2 == null || musicDragView5.cutMusicLayout == null) {
                    musicDragView5.a(true);
                } else {
                    musicDragView5.a(false);
                    musicDragView5.cutMusicLayout.setAudioWaveViewData(a2);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f66670a, false, 76041, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66670a, false, 76041, new Class[0], Void.TYPE);
            return;
        }
        if (this.f66671b != null) {
            this.f66671b.setAlpha(0.0f);
            this.f66671b.animate().alpha(1.0f).setDuration(200).start();
        }
    }
}
