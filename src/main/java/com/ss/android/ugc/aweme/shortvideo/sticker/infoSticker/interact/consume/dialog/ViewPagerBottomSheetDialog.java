package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.app.AppCompatDialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior;

public class ViewPagerBottomSheetDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69924a;

    /* renamed from: b  reason: collision with root package name */
    boolean f69925b;

    /* renamed from: c  reason: collision with root package name */
    boolean f69926c;

    /* renamed from: d  reason: collision with root package name */
    boolean f69927d;

    /* renamed from: e  reason: collision with root package name */
    private ViewPagerBottomSheetBehavior<FrameLayout> f69928e;

    /* renamed from: f  reason: collision with root package name */
    private ViewPagerBottomSheetBehavior.a f69929f;

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f69924a, false, 79560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69924a, false, 79560, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        if (this.f69928e != null) {
            ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior = this.f69928e;
            if (PatchProxy.isSupport(new Object[]{4}, viewPagerBottomSheetBehavior, ViewPagerBottomSheetBehavior.f69905a, false, 79535, new Class[]{Integer.TYPE}, Void.TYPE)) {
                ViewPagerBottomSheetBehavior<FrameLayout> viewPagerBottomSheetBehavior2 = viewPagerBottomSheetBehavior;
                PatchProxy.accessDispatch(new Object[]{4}, viewPagerBottomSheetBehavior2, ViewPagerBottomSheetBehavior.f69905a, false, 79535, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (4 != viewPagerBottomSheetBehavior.g) {
                if (viewPagerBottomSheetBehavior.j == null) {
                    viewPagerBottomSheetBehavior.g = 4;
                    return;
                }
                View view = (View) viewPagerBottomSheetBehavior.j.get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !ViewCompat.isAttachedToWindow(view)) {
                        viewPagerBottomSheetBehavior.a(view, 4);
                    } else {
                        view.post(new Runnable(view, 4) {

                            /* renamed from: a */
                            public static ChangeQuickRedirect f69911a;

                            /* renamed from: b */
                            final /* synthetic */ View f69912b;

                            /* renamed from: c */
                            final /* synthetic */ int f69913c;

                            public final void run(
/*
Method generation error in method: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.1.run():void, dex: classes5.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetBehavior.1.run():void, class status: UNLOADED
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
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
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
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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
                }
            }
        }
    }

    public void setContentView(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f69924a, false, 79557, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f69924a, false, 79557, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.setContentView(a(0, view, null));
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f69924a, false, 79556, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f69924a, false, 79556, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public void setCancelable(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69924a, false, 79559, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69924a, false, 79559, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setCancelable(z);
        if (this.f69925b != z) {
            this.f69925b = z;
            if (this.f69928e != null) {
                this.f69928e.f69909e = z;
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69924a, false, 79561, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69924a, false, 79561, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f69925b) {
            this.f69925b = true;
        }
        this.f69926c = z;
        this.f69927d = true;
    }

    public void setContentView(@LayoutRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69924a, false, 79555, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69924a, false, 79555, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setContentView(a(i, null, null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ViewPagerBottomSheetDialog(@android.support.annotation.NonNull android.content.Context r20, @android.support.annotation.StyleRes int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r11 = 1
            r3[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f69924a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Integer.TYPE
            r4 = 0
            r6 = 1
            r7 = 79564(0x136cc, float:1.11493E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0054
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r12[r11] = r3
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f69924a
            r15 = 1
            r16 = 79564(0x136cc, float:1.11493E-40)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2[r10] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r11] = r3
            java.lang.Class r18 = java.lang.Integer.TYPE
            r17 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0071
        L_0x0054:
            if (r21 != 0) goto L_0x006f
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r20.getTheme()
            r4 = 2130772095(0x7f01007f, float:1.7147299E38)
            boolean r3 = r3.resolveAttribute(r4, r2, r11)
            if (r3 == 0) goto L_0x006b
            int r2 = r2.resourceId
            goto L_0x0071
        L_0x006b:
            r2 = 2131493329(0x7f0c01d1, float:1.8610135E38)
            goto L_0x0071
        L_0x006f:
            r2 = r21
        L_0x0071:
            r0.<init>(r1, r2)
            r0.f69925b = r11
            r0.f69926c = r11
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetDialog$4 r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetDialog$4
            r1.<init>()
            r0.f69929f = r1
            r0.supportRequestWindowFeature(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetDialog.<init>(android.content.Context, int):void");
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (PatchProxy.isSupport(new Object[]{view, layoutParams}, this, f69924a, false, 79558, new Class[]{View.class, ViewGroup.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, layoutParams}, this, f69924a, false, 79558, new Class[]{View.class, ViewGroup.LayoutParams.class}, Void.TYPE);
            return;
        }
        super.setContentView(a(0, view, layoutParams));
    }

    private View a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        View view2;
        int i2 = i;
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, layoutParams2}, this, f69924a, false, 79562, new Class[]{Integer.TYPE, View.class, ViewGroup.LayoutParams.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, layoutParams2}, this, f69924a, false, 79562, new Class[]{Integer.TYPE, View.class, ViewGroup.LayoutParams.class}, View.class);
        }
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0906R.layout.ig, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(C0906R.id.zq);
        if (i2 == 0 || view != null) {
            view2 = view;
        } else {
            view2 = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(C0906R.id.a3z);
        this.f69928e = ViewPagerBottomSheetBehavior.b(frameLayout2);
        this.f69928e.l = this.f69929f;
        this.f69928e.f69909e = this.f69925b;
        if (layoutParams2 == null) {
            frameLayout2.addView(view2);
        } else {
            frameLayout2.addView(view2, layoutParams2);
        }
        coordinatorLayout.findViewById(C0906R.id.d67).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69930a;

            public final void onClick(View view) {
                boolean z;
                if (PatchProxy.isSupport(new Object[]{view}, this, f69930a, false, 79565, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f69930a, false, 79565, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (ViewPagerBottomSheetDialog.this.f69925b && ViewPagerBottomSheetDialog.this.isShowing()) {
                    ViewPagerBottomSheetDialog viewPagerBottomSheetDialog = ViewPagerBottomSheetDialog.this;
                    if (PatchProxy.isSupport(new Object[0], viewPagerBottomSheetDialog, ViewPagerBottomSheetDialog.f69924a, false, 79563, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], viewPagerBottomSheetDialog, ViewPagerBottomSheetDialog.f69924a, false, 79563, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        if (!viewPagerBottomSheetDialog.f69927d) {
                            if (Build.VERSION.SDK_INT < 11) {
                                viewPagerBottomSheetDialog.f69926c = true;
                            } else {
                                TypedArray obtainStyledAttributes = viewPagerBottomSheetDialog.getContext().obtainStyledAttributes(new int[]{16843611});
                                viewPagerBottomSheetDialog.f69926c = obtainStyledAttributes.getBoolean(0, true);
                                obtainStyledAttributes.recycle();
                            }
                            viewPagerBottomSheetDialog.f69927d = true;
                        }
                        z = viewPagerBottomSheetDialog.f69926c;
                    }
                    if (z) {
                        ViewPagerBottomSheetDialog.this.cancel();
                    }
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(frameLayout2, new AccessibilityDelegateCompat() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69932a;

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
                if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat2}, this, f69932a, false, 79566, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat2}, this, f69932a, false, 79566, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
                    return;
                }
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                if (ViewPagerBottomSheetDialog.this.f69925b) {
                    accessibilityNodeInfoCompat2.addAction(1048576);
                    accessibilityNodeInfoCompat2.setDismissable(true);
                    return;
                }
                accessibilityNodeInfoCompat2.setDismissable(false);
            }

            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), bundle}, this, f69932a, false, 79567, new Class[]{View.class, Integer.TYPE, Bundle.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), bundle}, this, f69932a, false, 79567, new Class[]{View.class, Integer.TYPE, Bundle.class}, Boolean.TYPE)).booleanValue();
                } else if (i != 1048576 || !ViewPagerBottomSheetDialog.this.f69925b) {
                    return super.performAccessibilityAction(view, i, bundle);
                } else {
                    ViewPagerBottomSheetDialog.this.cancel();
                    return true;
                }
            }
        });
        frameLayout2.setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        return frameLayout;
    }
}
