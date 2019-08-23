package com.ss.android.ugc.aweme.im.sdk.chat.input.audio.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.base.a;
import com.ss.android.ugc.aweme.im.sdk.R$styleable;
import com.ss.android.ugc.aweme.im.sdk.chat.input.audio.j;
import com.ss.android.ugc.aweme.im.sdk.chat.input.audio.l;
import com.ss.android.ugc.aweme.im.sdk.utils.m;

public class AudioRecordBar extends DmtTextView implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50418a;

    /* renamed from: b  reason: collision with root package name */
    public float f50419b;

    /* renamed from: c  reason: collision with root package name */
    public float f50420c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f50421d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f50422e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f50423f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private float n;
    private boolean o;
    private AudioRecordStateView p;
    private j q;
    private long r;

    public void setListener(j jVar) {
        this.q = jVar;
    }

    public void setStateView(AudioRecordStateView audioRecordStateView) {
        this.p = audioRecordStateView;
    }

    public AudioRecordBar(Context context) {
        super(context);
        a(context, null);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (PatchProxy.isSupport(new Object[]{onClickListener}, this, f50418a, false, 50747, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener}, this, f50418a, false, 50747, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        super.setOnClickListener(null);
    }

    public AudioRecordBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f50418a, false, 50742, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f50418a, false, 50742, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        setOnTouchListener(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AudioRecordBar);
            this.g = obtainStyledAttributes.getResourceId(5, -1);
            this.h = obtainStyledAttributes.getResourceId(6, this.g);
            this.i = obtainStyledAttributes.getResourceId(3, -1);
            this.j = obtainStyledAttributes.getResourceId(4, this.i);
            this.k = obtainStyledAttributes.getResourceId(0, -1);
            this.l = obtainStyledAttributes.getResourceId(1, this.k);
            this.m = obtainStyledAttributes.getDimensionPixelOffset(2, 50);
            obtainStyledAttributes.recycle();
            setText(this.g);
            setContentDescription(getContext().getResources().getString(this.g));
            setTextColor(getResources().getColor(this.i));
            setBackgroundResource(this.k);
            this.f50422e = l.a(context);
            if (m.b()) {
                getPaint().setFakeBoldText(true);
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f50418a, false, 50748, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f50418a, false, 50748, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f50422e) {
            this.f50419b = motionEvent.getX();
            this.f50420c = motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                if (SystemClock.uptimeMillis() - this.r < 1000) {
                    return true;
                }
                this.r = SystemClock.uptimeMillis();
                this.n = motionEvent.getY();
                if (PatchProxy.isSupport(new Object[0], this, f50418a, false, 50743, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50418a, false, 50743, new Class[0], Void.TYPE);
                } else if (!this.o) {
                    this.o = true;
                    setText(this.h);
                    setContentDescription(getContext().getResources().getString(this.h));
                    setTextColor(getResources().getColor(this.j));
                    setBackgroundResource(this.l);
                    if (this.p != null) {
                        this.p.a(0);
                    }
                    if (this.q != null) {
                        this.q.a();
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (PatchProxy.isSupport(new Object[0], this, f50418a, false, 50744, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50418a, false, 50744, new Class[0], Void.TYPE);
                } else if (this.o) {
                    this.o = false;
                    setText(this.g);
                    setContentDescription(getContext().getResources().getString(this.g));
                    setTextColor(getResources().getColor(this.i));
                    setBackgroundResource(this.k);
                    if (this.q != null) {
                        this.q.b();
                    }
                }
            } else if (motionEvent.getAction() == 2 && this.p != null && this.o) {
                if (!this.f50421d && Math.abs(motionEvent.getY()) - this.n >= ((float) this.m)) {
                    this.f50421d = true;
                    if (PatchProxy.isSupport(new Object[0], this, f50418a, false, 50745, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50418a, false, 50745, new Class[0], Void.TYPE);
                    } else if (this.p != null) {
                        AudioRecordStateView audioRecordStateView = this.p;
                        if (PatchProxy.isSupport(new Object[0], audioRecordStateView, AudioRecordStateView.f50426a, false, 50758, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], audioRecordStateView, AudioRecordStateView.f50426a, false, 50758, new Class[0], Void.TYPE);
                        } else {
                            if (audioRecordStateView.f50430e != -1) {
                                audioRecordStateView.f50427b.setText(audioRecordStateView.f50430e);
                            } else {
                                audioRecordStateView.f50427b.setText("");
                            }
                            audioRecordStateView.f50428c.setVisibility(4);
                            if (audioRecordStateView.i != -1) {
                                audioRecordStateView.f50429d.setImageResource(audioRecordStateView.i);
                                audioRecordStateView.f50429d.setVisibility(0);
                            } else {
                                audioRecordStateView.f50429d.setVisibility(4);
                            }
                            audioRecordStateView.a();
                        }
                    }
                } else if (this.f50421d && Math.abs(motionEvent.getY()) - this.n < ((float) this.m)) {
                    AudioRecordStateView audioRecordStateView2 = this.p;
                    if (PatchProxy.isSupport(new Object[0], audioRecordStateView2, AudioRecordStateView.f50426a, false, 50755, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], audioRecordStateView2, AudioRecordStateView.f50426a, false, 50755, new Class[0], Void.TYPE);
                    } else if (audioRecordStateView2.k > 0) {
                        audioRecordStateView2.a(audioRecordStateView2.k);
                    } else {
                        audioRecordStateView2.a(audioRecordStateView2.j);
                    }
                    this.f50421d = false;
                }
            }
            return true;
        } else if (this.f50423f) {
            return true;
        } else {
            this.f50423f = true;
            Activity activity = (Activity) view.getContext();
            AnonymousClass1 r1 = new a<Boolean>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50424a;

                public final /* synthetic */ void run(Object obj) {
                    Boolean bool = (Boolean) obj;
                    if (PatchProxy.isSupport(new Object[]{bool}, this, f50424a, false, 50749, new Class[]{Boolean.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bool}, this, f50424a, false, 50749, new Class[]{Boolean.class}, Void.TYPE);
                        return;
                    }
                    AudioRecordBar.this.f50422e = bool.booleanValue();
                    AudioRecordBar.this.f50423f = false;
                }
            };
            if (PatchProxy.isSupport(new Object[]{activity, r1}, null, l.f50411a, true, 50736, new Class[]{Activity.class, a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, r1}, null, l.f50411a, true, 50736, new Class[]{Activity.class, a.class}, Void.TYPE);
            } else {
                b.a(activity, new String[]{"android.permission.RECORD_AUDIO"}, new b.C0400b(r1, activity) {

                    /* renamed from: a */
                    public static ChangeQuickRedirect f50412a;

                    /* renamed from: b */
                    final /* synthetic */ a f50413b;

                    /* renamed from: c */
                    final /* synthetic */ Activity f50414c;

                    public final void a(
/*
Method generation error in method: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.l.1.a(java.lang.String[], int[]):void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.l.1.a(java.lang.String[], int[]):void, class status: UNLOADED
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
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
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
                });
            }
            return true;
        }
    }

    public AudioRecordBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context, attributeSet);
    }
}
