package com.ss.android.ugc.aweme.effectplatform;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effectplatform.d;
import com.ss.android.ugc.aweme.n.b;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.tools.ad;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.f;
import com.ss.android.ugc.effectmanager.effect.b.i;
import com.ss.android.ugc.effectmanager.effect.b.k;
import com.ss.android.ugc.effectmanager.effect.b.l;
import com.ss.android.ugc.effectmanager.effect.b.m;
import com.ss.android.ugc.effectmanager.effect.b.n;
import com.ss.android.ugc.effectmanager.effect.b.p;
import com.ss.android.ugc.effectmanager.effect.e.b.o;
import com.ss.android.ugc.effectmanager.effect.e.b.q;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.g;
import com.ss.android.ugc.effectmanager.h;
import com.ss.android.ugc.effectmanager.j;
import com.ss.android.ugc.effectmanager.link.LinkSelector;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import okhttp3.OkHttpClient;

public class EffectPlatform implements LifecycleObserver, g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3091a;

    /* renamed from: b  reason: collision with root package name */
    public static final File f3092b = new File(a.f61119b.getFilesDir(), "effect");

    /* renamed from: c  reason: collision with root package name */
    public static final List<Host> f3093c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static final String f3094d;
    private static ArrayList<String> l;

    /* renamed from: e  reason: collision with root package name */
    public d f3095e;

    /* renamed from: f  reason: collision with root package name */
    private g f3096f;
    private int g = 2;
    private Context h;
    private String i;
    private Random j = new Random();
    private OkHttpClient k;

    public static List<Host> a() {
        return f3093c;
    }

    public static String b() {
        return f3094d;
    }

    public final void a(@NonNull String str, boolean z, String str2, int i2, int i3, k kVar) {
        String str3 = str;
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{str3, (byte) 1, str2, Integer.valueOf(i2), Integer.valueOf(i3), kVar2}, this, f3091a, false, 38919, new Class[]{String.class, Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, k.class}, Void.TYPE)) {
            Object[] objArr = {str3, (byte) 1, str2, Integer.valueOf(i2), Integer.valueOf(i3), kVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f3091a, false, 38919, new Class[]{String.class, Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, k.class}, Void.TYPE);
            return;
        }
        d dVar = this.f3095e;
        Object[] objArr3 = {str3, (byte) 1, str2, Integer.valueOf(i2), Integer.valueOf(i3), kVar2};
        if (PatchProxy.isSupport(objArr3, dVar, d.f43812a, false, 38951, new Class[]{String.class, Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, k.class}, Void.TYPE)) {
            Object[] objArr4 = {str3, (byte) 1, str2, Integer.valueOf(i2), Integer.valueOf(i3), kVar2};
            Object[] objArr5 = objArr4;
            d dVar2 = dVar;
            PatchProxy.accessDispatch(objArr5, dVar2, d.f43812a, false, 38951, new Class[]{String.class, Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, k.class}, Void.TYPE);
        } else if (!dVar.f43814b) {
            kVar2.a(dVar.b());
        } else {
            h hVar = dVar.f43815c;
            d.AnonymousClass1 r0 = new com.ss.android.ugc.effectmanager.effect.b.a(str, true, str2, i2, i3, kVar) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43816a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f43817b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ boolean f43818c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ String f43819d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ int f43820e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ int f43821f;
                final /* synthetic */ k g;

                public final void a(c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f43816a, false, 38976, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f43816a, false, 38976, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    d.this.a(this.f43817b, this.f43818c, this.f43819d, this.f43820e, this.f43821f, this.g);
                }

                /* JADX WARNING: Removed duplicated region for block: B:23:0x01bb  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(boolean r25) {
                    /*
                        r24 = this;
                        r7 = r24
                        r8 = 1
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        java.lang.Byte r1 = java.lang.Byte.valueOf(r25)
                        r9 = 0
                        r0[r9] = r1
                        com.meituan.robust.ChangeQuickRedirect r2 = f43816a
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r1 = java.lang.Boolean.TYPE
                        r5[r9] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 38975(0x983f, float:5.4616E-41)
                        r1 = r24
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x003e
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        java.lang.Byte r1 = java.lang.Byte.valueOf(r25)
                        r0[r9] = r1
                        com.meituan.robust.ChangeQuickRedirect r2 = f43816a
                        r3 = 0
                        r4 = 38975(0x983f, float:5.4616E-41)
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class r1 = java.lang.Boolean.TYPE
                        r5[r9] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r24
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        return
                    L_0x003e:
                        if (r25 == 0) goto L_0x01cb
                        com.ss.android.ugc.aweme.effectplatform.d r10 = com.ss.android.ugc.aweme.effectplatform.d.this
                        java.lang.String r12 = r7.f43817b
                        boolean r14 = r7.f43818c
                        java.lang.String r15 = r7.f43819d
                        int r13 = r7.f43820e
                        int r11 = r7.f43821f
                        com.ss.android.ugc.effectmanager.effect.b.k r6 = r7.g
                        r5 = 6
                        java.lang.Object[] r0 = new java.lang.Object[r5]
                        r0[r9] = r12
                        java.lang.Byte r1 = java.lang.Byte.valueOf(r14)
                        r0[r8] = r1
                        r4 = 2
                        r0[r4] = r15
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
                        r16 = 3
                        r0[r16] = r1
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
                        r17 = 4
                        r0[r17] = r1
                        r18 = 5
                        r0[r18] = r6
                        com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.effectplatform.d.f43812a
                        r3 = 0
                        r19 = 38950(0x9826, float:5.458E-41)
                        java.lang.Class[] r1 = new java.lang.Class[r5]
                        java.lang.Class<java.lang.String> r20 = java.lang.String.class
                        r1[r9] = r20
                        java.lang.Class r20 = java.lang.Boolean.TYPE
                        r1[r8] = r20
                        java.lang.Class<java.lang.String> r20 = java.lang.String.class
                        r1[r4] = r20
                        java.lang.Class r20 = java.lang.Integer.TYPE
                        r1[r16] = r20
                        java.lang.Class r20 = java.lang.Integer.TYPE
                        r1[r17] = r20
                        java.lang.Class<com.ss.android.ugc.effectmanager.effect.b.k> r20 = com.ss.android.ugc.effectmanager.effect.b.k.class
                        r1[r18] = r20
                        java.lang.Class r20 = java.lang.Void.TYPE
                        r21 = r1
                        r1 = r10
                        r4 = r19
                        r8 = 6
                        r5 = r21
                        r23 = r6
                        r6 = r20
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x00eb
                        java.lang.Object[] r0 = new java.lang.Object[r8]
                        r0[r9] = r12
                        java.lang.Byte r1 = java.lang.Byte.valueOf(r14)
                        r2 = 1
                        r0[r2] = r1
                        r1 = 2
                        r0[r1] = r15
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
                        r0[r16] = r2
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
                        r0[r17] = r2
                        r2 = r23
                        r0[r18] = r2
                        com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.effectplatform.d.f43812a
                        r3 = 0
                        r4 = 38950(0x9826, float:5.458E-41)
                        java.lang.Class[] r5 = new java.lang.Class[r8]
                        java.lang.Class<java.lang.String> r6 = java.lang.String.class
                        r5[r9] = r6
                        java.lang.Class r6 = java.lang.Boolean.TYPE
                        r8 = 1
                        r5[r8] = r6
                        java.lang.Class<java.lang.String> r6 = java.lang.String.class
                        r5[r1] = r6
                        java.lang.Class r1 = java.lang.Integer.TYPE
                        r5[r16] = r1
                        java.lang.Class r1 = java.lang.Integer.TYPE
                        r5[r17] = r1
                        java.lang.Class<com.ss.android.ugc.effectmanager.effect.b.k> r1 = com.ss.android.ugc.effectmanager.effect.b.k.class
                        r5[r18] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r10
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        goto L_0x01dc
                    L_0x00eb:
                        r2 = r23
                        r1 = 2
                        java.lang.Object[] r0 = new java.lang.Object[r1]
                        r0[r9] = r12
                        r3 = 1
                        r0[r3] = r2
                        r17 = 0
                        com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.effectplatform.l.f43865a
                        r19 = 1
                        r20 = 39011(0x9863, float:5.4666E-41)
                        java.lang.Class[] r4 = new java.lang.Class[r1]
                        java.lang.Class<java.lang.String> r5 = java.lang.String.class
                        r4[r9] = r5
                        java.lang.Class<com.ss.android.ugc.effectmanager.effect.b.k> r5 = com.ss.android.ugc.effectmanager.effect.b.k.class
                        r4[r3] = r5
                        java.lang.Class<com.ss.android.ugc.aweme.effectplatform.l> r22 = com.ss.android.ugc.aweme.effectplatform.l.class
                        r16 = r0
                        r21 = r4
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
                        if (r0 == 0) goto L_0x013b
                        java.lang.Object[] r0 = new java.lang.Object[r1]
                        r0[r9] = r12
                        r3 = 1
                        r0[r3] = r2
                        r17 = 0
                        com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.effectplatform.l.f43865a
                        r19 = 1
                        r20 = 39011(0x9863, float:5.4666E-41)
                        java.lang.Class[] r1 = new java.lang.Class[r1]
                        java.lang.Class<java.lang.String> r2 = java.lang.String.class
                        r1[r9] = r2
                        java.lang.Class<com.ss.android.ugc.effectmanager.effect.b.k> r2 = com.ss.android.ugc.effectmanager.effect.b.k.class
                        r1[r3] = r2
                        java.lang.Class<com.ss.android.ugc.aweme.effectplatform.l> r22 = com.ss.android.ugc.aweme.effectplatform.l.class
                        r16 = r0
                    L_0x0132:
                        r21 = r1
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
                        com.ss.android.ugc.aweme.effectplatform.l r0 = (com.ss.android.ugc.aweme.effectplatform.l) r0
                        goto L_0x0191
                    L_0x013b:
                        com.ss.android.ugc.aweme.effectplatform.l$a r0 = com.ss.android.ugc.aweme.effectplatform.l.f43866d
                        java.lang.Object[] r3 = new java.lang.Object[r1]
                        r3[r9] = r12
                        r4 = 1
                        r3[r4] = r2
                        com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.effectplatform.l.a.f43870a
                        r19 = 0
                        r20 = 39012(0x9864, float:5.4667E-41)
                        java.lang.Class[] r5 = new java.lang.Class[r1]
                        java.lang.Class<java.lang.String> r6 = java.lang.String.class
                        r5[r9] = r6
                        java.lang.Class<com.ss.android.ugc.effectmanager.effect.b.k> r6 = com.ss.android.ugc.effectmanager.effect.b.k.class
                        r5[r4] = r6
                        java.lang.Class<com.ss.android.ugc.aweme.effectplatform.l> r22 = com.ss.android.ugc.aweme.effectplatform.l.class
                        r16 = r3
                        r17 = r0
                        r21 = r5
                        boolean r3 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
                        if (r3 == 0) goto L_0x0182
                        java.lang.Object[] r3 = new java.lang.Object[r1]
                        r3[r9] = r12
                        r4 = 1
                        r3[r4] = r2
                        com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.effectplatform.l.a.f43870a
                        r19 = 0
                        r20 = 39012(0x9864, float:5.4667E-41)
                        java.lang.Class[] r1 = new java.lang.Class[r1]
                        java.lang.Class<java.lang.String> r2 = java.lang.String.class
                        r1[r9] = r2
                        java.lang.Class<com.ss.android.ugc.effectmanager.effect.b.k> r2 = com.ss.android.ugc.effectmanager.effect.b.k.class
                        r1[r4] = r2
                        java.lang.Class<com.ss.android.ugc.aweme.effectplatform.l> r22 = com.ss.android.ugc.aweme.effectplatform.l.class
                        r16 = r3
                        r17 = r0
                        goto L_0x0132
                    L_0x0182:
                        java.lang.String r0 = "panel"
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
                        java.lang.String r0 = "listener"
                        kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r0)
                        com.ss.android.ugc.aweme.effectplatform.l r0 = new com.ss.android.ugc.aweme.effectplatform.l
                        r0.<init>(r12, r2, r9)
                    L_0x0191:
                        com.ss.android.ugc.effectmanager.h r1 = r10.f43815c
                        com.ss.android.ugc.effectmanager.a.a r2 = r1.h
                        if (r2 == 0) goto L_0x01b9
                        com.ss.android.ugc.effectmanager.effect.c.a r2 = r1.f77488a
                        if (r2 != 0) goto L_0x019c
                        goto L_0x01b9
                    L_0x019c:
                        java.lang.String r2 = com.ss.android.ugc.effectmanager.h.b()
                        com.ss.android.ugc.effectmanager.a.a r3 = r1.h
                        com.ss.android.ugc.effectmanager.g r3 = r3.f77204a
                        com.ss.android.ugc.effectmanager.j r3 = r3.z
                        r3.a((java.lang.String) r2, (com.ss.android.ugc.effectmanager.effect.b.k) r0)
                        com.ss.android.ugc.effectmanager.effect.c.a r0 = r1.f77488a
                        r18 = 0
                        r1 = r11
                        r11 = r0
                        r0 = r13
                        r13 = r2
                        r16 = r0
                        r17 = r1
                        r11.a(r12, r13, r14, r15, r16, r17, r18)
                        return
                    L_0x01b9:
                        if (r0 == 0) goto L_0x01dc
                        com.ss.android.ugc.effectmanager.common.e.c r1 = new com.ss.android.ugc.effectmanager.common.e.c
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.String r3 = "请先初始化"
                        r2.<init>(r3)
                        r1.<init>((java.lang.Exception) r2)
                        r0.a((com.ss.android.ugc.effectmanager.common.e.c) r1)
                        goto L_0x01dc
                    L_0x01cb:
                        com.ss.android.ugc.aweme.effectplatform.d r8 = com.ss.android.ugc.aweme.effectplatform.d.this
                        java.lang.String r9 = r7.f43817b
                        boolean r10 = r7.f43818c
                        java.lang.String r11 = r7.f43819d
                        int r12 = r7.f43820e
                        int r13 = r7.f43821f
                        com.ss.android.ugc.effectmanager.effect.b.k r14 = r7.g
                        r8.a(r9, r10, r11, r12, r13, r14)
                    L_0x01dc:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectplatform.d.AnonymousClass1.a(boolean):void");
                }

                {
                    this.f43817b = r2;
                    this.f43818c = r3;
                    this.f43819d = r4;
                    this.f43820e = r5;
                    this.f43821f = r6;
                    this.g = r7;
                }
            };
            hVar.a(str3, (String) null, 2, (com.ss.android.ugc.effectmanager.effect.b.a) r0);
        }
    }

    public final void a(@NonNull String str, boolean z, @NonNull com.ss.android.ugc.effectmanager.effect.b.g gVar) {
        String str2 = str;
        com.ss.android.ugc.effectmanager.effect.b.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{str2, (byte) 0, gVar2}, this, f3091a, false, 38922, new Class[]{String.class, Boolean.TYPE, com.ss.android.ugc.effectmanager.effect.b.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, (byte) 0, gVar2}, this, f3091a, false, 38922, new Class[]{String.class, Boolean.TYPE, com.ss.android.ugc.effectmanager.effect.b.g.class}, Void.TYPE);
            return;
        }
        c();
        this.f3095e.b(str2, false, gVar2);
    }

    public final void a(@NonNull String str, String str2, boolean z, int i2, int i3, int i4, String str3, @NonNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{str, str2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3, fVar2}, this, f3091a, false, 38924, new Class[]{String.class, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3, fVar2}, this, f3091a, false, 38924, new Class[]{String.class, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, f.class}, Void.TYPE);
            return;
        }
        d dVar = this.f3095e;
        Object[] objArr = {str, str2, Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3, fVar2};
        if (PatchProxy.isSupport(objArr, dVar, d.f43812a, false, 38957, new Class[]{String.class, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3, fVar2}, dVar, d.f43812a, false, 38957, new Class[]{String.class, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, f.class}, Void.TYPE);
        } else if (!dVar.f43814b) {
            fVar2.a(dVar.b());
        } else {
            dVar.a(str, str2, i2, i3, i4, str3, z, fVar);
        }
    }

    public final void a(@Nullable String str, boolean z, int i2, int i3, @NonNull l lVar) {
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{str, (byte) 0, Integer.valueOf(i2), Integer.valueOf(i3), lVar2}, this, f3091a, false, 38925, new Class[]{String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, l.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, (byte) 0, Integer.valueOf(i2), Integer.valueOf(i3), lVar2}, this, f3091a, false, 38925, new Class[]{String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, l.class}, Void.TYPE);
            return;
        }
        c();
        d dVar = this.f3095e;
        if (PatchProxy.isSupport(new Object[]{str, (byte) 0, Integer.valueOf(i2), Integer.valueOf(i3), lVar2}, dVar, d.f43812a, false, 38953, new Class[]{String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, l.class}, Void.TYPE)) {
            d dVar2 = dVar;
            PatchProxy.accessDispatch(new Object[]{str, (byte) 0, Integer.valueOf(i2), Integer.valueOf(i3), lVar2}, dVar2, d.f43812a, false, 38953, new Class[]{String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, l.class}, Void.TYPE);
        } else if (!dVar.f43814b) {
            lVar2.a(dVar.b());
        } else {
            h hVar = dVar.f43815c;
            if (hVar.h == null || hVar.f77488a == null) {
                if (lVar2 != null) {
                    lVar2.a(new c((Exception) new IllegalStateException("请先初始化")));
                }
                return;
            }
            String b2 = h.b();
            hVar.h.f77204a.z.a(b2, lVar2);
            com.ss.android.ugc.effectmanager.effect.c.a aVar = hVar.f77488a;
            o oVar = new o(aVar.f77355a, b2, str, i2, i3, aVar.f77357c);
            aVar.f77356b.q.a(oVar);
        }
    }

    public final void a(@NonNull String str, @Nullable String str2, i iVar) {
        String str3 = str;
        String str4 = str2;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, iVar2}, this, f3091a, false, 38929, new Class[]{String.class, String.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, iVar2}, this, f3091a, false, 38929, new Class[]{String.class, String.class, i.class}, Void.TYPE);
            return;
        }
        c();
        d dVar = this.f3095e;
        if (PatchProxy.isSupport(new Object[]{str3, str4, iVar2}, dVar, d.f43812a, false, 38962, new Class[]{String.class, String.class, i.class}, Void.TYPE)) {
            d dVar2 = dVar;
            PatchProxy.accessDispatch(new Object[]{str3, str4, iVar2}, dVar2, d.f43812a, false, 38962, new Class[]{String.class, String.class, i.class}, Void.TYPE);
        } else if (!dVar.f43814b) {
            iVar2.a(null, dVar.b());
        } else {
            h hVar = dVar.f43815c;
            Map a2 = dVar.a(str4);
            if (hVar.h == null) {
                if (iVar2 != null) {
                    iVar2.a(null, new c((Exception) new IllegalStateException("请先初始化")));
                }
                return;
            }
            h.AnonymousClass4 r5 = new com.ss.android.ugc.effectmanager.effect.b.h(iVar2) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ i f77502a;

                public final void a(c cVar) {
                    this.f77502a.a(null, cVar);
                }

                public final void a(List<Effect> list) {
                    if (!list.isEmpty()) {
                        this.f77502a.a(list.get(0));
                    } else {
                        this.f77502a.a(null, new c(1));
                    }
                }

                {
                    this.f77502a = r2;
                }
            };
            ArrayList arrayList = new ArrayList();
            arrayList.add(str3);
            hVar.a((List<String>) arrayList, true, a2, (com.ss.android.ugc.effectmanager.effect.b.h) r5);
        }
    }

    public final void a(List<String> list, @Nullable String str, boolean z, com.ss.android.ugc.effectmanager.effect.b.h hVar) {
        List<String> list2 = list;
        String str2 = str;
        com.ss.android.ugc.effectmanager.effect.b.h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{list2, str2, Byte.valueOf(z ? (byte) 1 : 0), hVar2}, this, f3091a, false, 38930, new Class[]{List.class, String.class, Boolean.TYPE, com.ss.android.ugc.effectmanager.effect.b.h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, str2, Byte.valueOf(z), hVar2}, this, f3091a, false, 38930, new Class[]{List.class, String.class, Boolean.TYPE, com.ss.android.ugc.effectmanager.effect.b.h.class}, Void.TYPE);
            return;
        }
        c();
        d dVar = this.f3095e;
        if (PatchProxy.isSupport(new Object[]{list2, str2, Byte.valueOf(z), hVar2}, dVar, d.f43812a, false, 38963, new Class[]{List.class, String.class, Boolean.TYPE, com.ss.android.ugc.effectmanager.effect.b.h.class}, Void.TYPE)) {
            d dVar2 = dVar;
            PatchProxy.accessDispatch(new Object[]{list2, str2, Byte.valueOf(z), hVar2}, dVar2, d.f43812a, false, 38963, new Class[]{List.class, String.class, Boolean.TYPE, com.ss.android.ugc.effectmanager.effect.b.h.class}, Void.TYPE);
        } else if (!dVar.f43814b) {
            hVar2.a((c) null);
        } else {
            dVar.f43815c.a(list2, z, dVar.a(str2), hVar2);
        }
    }

    public final void a(@Nullable String str, @Nullable String str2, @NonNull p pVar) {
        String str3 = str;
        String str4 = str2;
        p pVar2 = pVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, pVar2}, this, f3091a, false, 38934, new Class[]{String.class, String.class, p.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, pVar2}, this, f3091a, false, 38934, new Class[]{String.class, String.class, p.class}, Void.TYPE);
            return;
        }
        d dVar = this.f3095e;
        if (PatchProxy.isSupport(new Object[]{str3, str4, pVar2}, dVar, d.f43812a, false, 38967, new Class[]{String.class, String.class, p.class}, Void.TYPE)) {
            d dVar2 = dVar;
            PatchProxy.accessDispatch(new Object[]{str3, str4, pVar2}, dVar2, d.f43812a, false, 38967, new Class[]{String.class, String.class, p.class}, Void.TYPE);
        } else if (str3 != null && str4 != null) {
            if (!dVar.f43814b) {
                pVar.a();
            } else {
                dVar.f43815c.a(str3, str4, pVar2);
            }
        }
    }

    public final void a(String str, List<String> list, String str2, @NonNull m mVar) {
        String str3 = str;
        String str4 = str2;
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{str3, list, str4, mVar2}, this, f3091a, false, 38935, new Class[]{String.class, List.class, String.class, m.class}, Void.TYPE)) {
            Object[] objArr = {str3, list, str4, mVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f3091a, false, 38935, new Class[]{String.class, List.class, String.class, m.class}, Void.TYPE);
            return;
        }
        d dVar = this.f3095e;
        if (PatchProxy.isSupport(new Object[]{str3, list, str4, mVar2}, dVar, d.f43812a, false, 38969, new Class[]{String.class, List.class, String.class, m.class}, Void.TYPE)) {
            Object[] objArr3 = {str3, list, str4, mVar2};
            Object[] objArr4 = objArr3;
            d dVar2 = dVar;
            PatchProxy.accessDispatch(objArr4, dVar2, d.f43812a, false, 38969, new Class[]{String.class, List.class, String.class, m.class}, Void.TYPE);
        } else if (str3 != null && !CollectionUtils.isEmpty(list)) {
            if (!dVar.f43814b) {
                mVar.b();
            } else {
                dVar.f43815c.a(str3, str4, mVar2);
            }
        }
    }

    public final void a(String str, List<String> list, Boolean bool, n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{str, list, bool, nVar2}, this, f3091a, false, 38936, new Class[]{String.class, List.class, Boolean.class, n.class}, Void.TYPE)) {
            Object[] objArr = {str, list, bool, nVar2};
            PatchProxy.accessDispatch(objArr, this, f3091a, false, 38936, new Class[]{String.class, List.class, Boolean.class, n.class}, Void.TYPE);
            return;
        }
        d dVar = this.f3095e;
        if (PatchProxy.isSupport(new Object[]{str, list, bool, nVar2}, dVar, d.f43812a, false, 38970, new Class[]{String.class, List.class, Boolean.class, n.class}, Void.TYPE)) {
            Object[] objArr2 = {str, list, bool, nVar2};
            d dVar2 = dVar;
            PatchProxy.accessDispatch(objArr2, dVar2, d.f43812a, false, 38970, new Class[]{String.class, List.class, Boolean.class, n.class}, Void.TYPE);
        } else if (!dVar.f43814b) {
            nVar2.a(dVar.b());
        } else {
            h hVar = dVar.f43815c;
            if (hVar.h == null || hVar.f77490c == null) {
                if (nVar2 != null) {
                    nVar2.a(new c((Exception) new IllegalStateException("请先初始化")));
                }
                return;
            }
            String b2 = h.b();
            j jVar = hVar.h.f77204a.z;
            if (jVar.f77509c == null) {
                jVar.f77509c = new HashMap();
            }
            jVar.f77509c.put(b2, nVar2);
            com.ss.android.ugc.effectmanager.effect.c.d dVar3 = hVar.f77490c;
            com.ss.android.ugc.effectmanager.effect.e.b.g gVar = new com.ss.android.ugc.effectmanager.effect.e.b.g(dVar3.f77368b, str, b2, dVar3.f77369c, list, bool.booleanValue());
            dVar3.f77367a.q.a(gVar);
        }
    }

    public final boolean a(@Nullable Effect effect) {
        Effect effect2 = effect;
        if (!PatchProxy.isSupport(new Object[]{effect2}, this, f3091a, false, 38939, new Class[]{Effect.class}, Boolean.TYPE)) {
            return this.f3095e.a(effect2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2}, this, f3091a, false, 38939, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
    }

    public final h f() {
        return this.f3095e.f43815c;
    }

    static {
        if (com.ss.android.g.a.a() && !com.ss.android.g.a.b()) {
            f3093c.add(new Host("https://api.tiktokv.com/effect/api"));
            f3094d = "1180";
        } else if (com.ss.android.g.a.b()) {
            f3093c.add(new Host("https://api2.musical.ly/effect/api"));
            f3094d = "1233";
        } else {
            f3093c.add(new Host("https://effect.snssdk.com"));
            f3094d = "1128";
        }
    }

    public static String d() {
        if (PatchProxy.isSupport(new Object[0], null, f3091a, true, 38915, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f3091a, true, 38915, new Class[0], String.class);
        }
        String e2 = a.f61121d.e();
        if (com.ss.android.ugc.aweme.g.a.a() && TextUtils.equals("local_test", e2) && ad.f74603c.a()) {
            e2 = "default";
        }
        return e2;
    }

    public void c() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3091a, false, 38914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3091a, false, 38914, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3096f != null && (TextUtils.isEmpty(this.f3096f.f77479e) || TextUtils.equals(PushConstants.PUSH_TYPE_NOTIFY, this.f3096f.f77479e))) {
            g gVar = this.f3096f;
            if (AppLog.getServerDeviceId() == null) {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            } else {
                str = AppLog.getServerDeviceId();
            }
            gVar.f77479e = str;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3091a, false, 38938, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3091a, false, 38938, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.f3095e;
        if (PatchProxy.isSupport(new Object[0], dVar, d.f43812a, false, 38973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], dVar, d.f43812a, false, 38973, new Class[0], Void.TYPE);
            return;
        }
        if (dVar.f43814b) {
            h hVar = dVar.f43815c;
            if (hVar.h != null) {
                hVar.h.f77204a.z.a();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void destroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3091a, false, 38933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3091a, false, 38933, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.f3095e;
        if (PatchProxy.isSupport(new Object[0], dVar, d.f43812a, false, 38966, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], dVar, d.f43812a, false, 38966, new Class[0], Void.TYPE);
            return;
        }
        if (dVar.f43815c != null) {
            h hVar = dVar.f43815c;
            if (hVar.g && hVar.h != null) {
                com.ss.android.ugc.effectmanager.common.h hVar2 = hVar.h.f77204a.q;
                if (hVar2.f77329c) {
                    hVar2.f77328b.shutdown();
                }
                hVar.h.f77204a.z.a();
                LinkSelector linkSelector = hVar.i;
                if (!(linkSelector.f77518b == null || linkSelector.f77522f == null)) {
                    linkSelector.f77522f.unregisterReceiver(linkSelector.f77518b);
                }
                hVar.g = false;
            }
            dVar.f43815c = null;
        }
        dVar.f43814b = false;
    }

    public static ArrayList<String> g() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], null, f3091a, true, 38940, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], null, f3091a, true, 38940, new Class[0], ArrayList.class);
        }
        if (l != null) {
            return l;
        }
        ArrayList arrayList = new ArrayList();
        for (com.ss.android.ugc.aweme.draft.a.c next : com.ss.android.ugc.aweme.draft.l.a().b()) {
            if (!(next.B() == null || next.B().stickers == null)) {
                for (b next2 : next.B().stickers) {
                    if (TextUtils.isEmpty(next2.path)) {
                        StringBuilder sb = new StringBuilder("InfoStickers_resdir_null:");
                        if (next2.stickerId != null) {
                            str2 = next2.stickerId;
                        } else {
                            str2 = "";
                        }
                        sb.append(str2);
                        ExceptionMonitor.ensureNotReachHere(sb.toString());
                    } else {
                        arrayList.add(next2.path.substring(next2.path.lastIndexOf(File.separator) + 1));
                    }
                }
            }
            if (!(next.z == null || next.z.getEffectPointModels() == null)) {
                Iterator<EffectPointModel> it2 = next.z.getEffectPointModels().iterator();
                while (it2.hasNext()) {
                    EffectPointModel next3 = it2.next();
                    if (TextUtils.isEmpty(next3.getResDir())) {
                        StringBuilder sb2 = new StringBuilder("EffectListModel_resdir_null:");
                        if (next3.getKey() != null) {
                            str = next3.getKey();
                        } else {
                            str = "";
                        }
                        sb2.append(str);
                        ExceptionMonitor.ensureNotReachHere(sb2.toString());
                    } else {
                        arrayList.add(next3.getResDir().substring(next3.getResDir().lastIndexOf(File.separator) + 1));
                    }
                }
            }
        }
        ArrayList<String> arrayList2 = new ArrayList<>(new HashSet(arrayList));
        l = arrayList2;
        return arrayList2;
    }

    public final void a(LifecycleOwner lifecycleOwner) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner}, this, f3091a, false, 38932, new Class[]{LifecycleOwner.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner}, this, f3091a, false, 38932, new Class[]{LifecycleOwner.class}, Void.TYPE);
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public final void a(@NonNull String str, @NonNull com.ss.android.ugc.effectmanager.effect.b.g gVar) {
        String str2 = str;
        com.ss.android.ugc.effectmanager.effect.b.g gVar2 = gVar;
        if (PatchProxy.isSupport(new Object[]{str2, gVar2}, this, f3091a, false, 38921, new Class[]{String.class, com.ss.android.ugc.effectmanager.effect.b.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, gVar2}, this, f3091a, false, 38921, new Class[]{String.class, com.ss.android.ugc.effectmanager.effect.b.g.class}, Void.TYPE);
            return;
        }
        c();
        this.f3095e.a(str2, gVar2);
    }

    public final void a(Effect effect, i iVar) {
        Effect effect2 = effect;
        i iVar2 = iVar;
        if (PatchProxy.isSupport(new Object[]{effect2, iVar2}, this, f3091a, false, 38928, new Class[]{Effect.class, i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2, iVar2}, this, f3091a, false, 38928, new Class[]{Effect.class, i.class}, Void.TYPE);
            return;
        }
        c();
        d dVar = this.f3095e;
        if (PatchProxy.isSupport(new Object[]{effect2, iVar2}, dVar, d.f43812a, false, 38961, new Class[]{Effect.class, i.class}, Void.TYPE)) {
            d dVar2 = dVar;
            PatchProxy.accessDispatch(new Object[]{effect2, iVar2}, dVar2, d.f43812a, false, 38961, new Class[]{Effect.class, i.class}, Void.TYPE);
        } else if (!dVar.f43814b) {
            iVar2.a(effect2, dVar.b());
        } else {
            ai.a("fetchEffect " + effect2.name + " requirements = " + effect2.requirements);
            dVar.f43815c.a(effect2, iVar2);
        }
    }

    public final void a(@NonNull ProviderEffect providerEffect, @NonNull com.ss.android.ugc.effectmanager.effect.b.b bVar) {
        ProviderEffect providerEffect2 = providerEffect;
        com.ss.android.ugc.effectmanager.effect.b.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{providerEffect2, bVar2}, this, f3091a, false, 38927, new Class[]{ProviderEffect.class, com.ss.android.ugc.effectmanager.effect.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{providerEffect2, bVar2}, this, f3091a, false, 38927, new Class[]{ProviderEffect.class, com.ss.android.ugc.effectmanager.effect.b.b.class}, Void.TYPE);
            return;
        }
        c();
        d dVar = this.f3095e;
        if (PatchProxy.isSupport(new Object[]{providerEffect2, bVar2}, dVar, d.f43812a, false, 38960, new Class[]{ProviderEffect.class, com.ss.android.ugc.effectmanager.effect.b.b.class}, Void.TYPE)) {
            d dVar2 = dVar;
            PatchProxy.accessDispatch(new Object[]{providerEffect2, bVar2}, dVar2, d.f43812a, false, 38960, new Class[]{ProviderEffect.class, com.ss.android.ugc.effectmanager.effect.b.b.class}, Void.TYPE);
        } else if (!dVar.f43814b) {
            bVar2.a(providerEffect2, dVar.b());
        } else {
            h hVar = dVar.f43815c;
            if (hVar.h == null || hVar.f77488a == null) {
                if (bVar2 != null) {
                    bVar2.a(providerEffect2, new c((Exception) new IllegalStateException("请先初始化")));
                }
                return;
            }
            String b2 = h.b();
            j jVar = hVar.h.f77204a.z;
            if (jVar.h == null) {
                jVar.h = new HashMap();
            }
            jVar.h.put(b2, bVar2);
            com.ss.android.ugc.effectmanager.effect.c.b bVar3 = hVar.f77489b;
            bVar3.f77359a.q.a(new com.ss.android.ugc.effectmanager.effect.e.b.f(bVar3.f77360b, b2, providerEffect2, bVar3.f77362d));
        }
    }

    public final void a(String str, com.ss.android.ugc.effectmanager.effect.b.j jVar) {
        String str2 = str;
        com.ss.android.ugc.effectmanager.effect.b.j jVar2 = jVar;
        if (PatchProxy.isSupport(new Object[]{str2, jVar2}, this, f3091a, false, 38937, new Class[]{String.class, com.ss.android.ugc.effectmanager.effect.b.j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jVar2}, this, f3091a, false, 38937, new Class[]{String.class, com.ss.android.ugc.effectmanager.effect.b.j.class}, Void.TYPE);
            return;
        }
        d dVar = this.f3095e;
        if (PatchProxy.isSupport(new Object[]{str2, jVar2}, dVar, d.f43812a, false, 38971, new Class[]{String.class, com.ss.android.ugc.effectmanager.effect.b.j.class}, Void.TYPE)) {
            d dVar2 = dVar;
            PatchProxy.accessDispatch(new Object[]{str2, jVar2}, dVar2, d.f43812a, false, 38971, new Class[]{String.class, com.ss.android.ugc.effectmanager.effect.b.j.class}, Void.TYPE);
        } else if (!dVar.f43814b) {
            jVar2.a(dVar.b());
        } else {
            h hVar = dVar.f43815c;
            if (hVar.h == null || hVar.f77490c == null) {
                if (jVar2 != null) {
                    jVar2.a(new c((Exception) new IllegalStateException("请先初始化")));
                }
                return;
            }
            String b2 = h.b();
            j jVar3 = hVar.h.f77204a.z;
            if (jVar3.f77510d == null) {
                jVar3.f77510d = new HashMap();
            }
            jVar3.f77510d.put(b2, jVar2);
            com.ss.android.ugc.effectmanager.effect.c.d dVar3 = hVar.f77490c;
            dVar3.f77367a.q.a(new com.ss.android.ugc.effectmanager.effect.e.b.l(dVar3.f77368b, str2, b2, dVar3.f77369c));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x027c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EffectPlatform(android.content.Context r18, java.lang.String r19, okhttp3.OkHttpClient r20) {
        /*
            r17 = this;
            r7 = r17
            r17.<init>()
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r7.j = r0
            r0 = 2
            r7.g = r0
            r0 = r18
            r7.h = r0
            r0 = r19
            r7.i = r0
            r0 = r20
            r7.k = r0
            com.ss.android.ugc.aweme.effectplatform.d r0 = new com.ss.android.ugc.aweme.effectplatform.d
            r0.<init>()
            r7.f3095e = r0
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3091a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 38913(0x9801, float:5.4529E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r9 = 1
            if (r0 == 0) goto L_0x004b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3091a
            r3 = 0
            r4 = 38913(0x9801, float:5.4529E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0145
        L_0x004b:
            java.lang.String r0 = d()
            boolean r1 = com.ss.android.g.a.a()
            r2 = 0
            if (r1 != 0) goto L_0x0063
            com.ss.android.ugc.aweme.port.in.y r1 = com.ss.android.ugc.aweme.port.in.a.h
            android.content.Context r3 = r7.h
            android.content.Context r3 = r3.getApplicationContext()
            com.ss.android.ugc.aweme.s.a.a r1 = r1.a(r3)
            goto L_0x0064
        L_0x0063:
            r1 = r2
        L_0x0064:
            if (r1 != 0) goto L_0x0068
            r3 = r2
            goto L_0x0070
        L_0x0068:
            double r3 = r1.getLongitude()
            java.lang.String r3 = java.lang.String.valueOf(r3)
        L_0x0070:
            if (r1 != 0) goto L_0x0074
            r4 = r2
            goto L_0x007c
        L_0x0074:
            double r4 = r1.getLatitude()
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L_0x007c:
            if (r1 != 0) goto L_0x007f
            goto L_0x0085
        L_0x007f:
            com.ss.android.ugc.aweme.port.in.y r1 = com.ss.android.ugc.aweme.port.in.a.h
            java.lang.String r2 = r1.a()
        L_0x0085:
            com.ss.android.ugc.effectmanager.g$a r1 = new com.ss.android.ugc.effectmanager.g$a
            r1.<init>()
            java.lang.String r5 = com.ss.android.ugc.aweme.port.in.a.g()
            r1.f77481a = r5
            r1.f77485e = r0
            java.lang.String r0 = "4.9.0"
            r1.f77482b = r0
            com.ss.android.ugc.aweme.port.in.m r0 = com.ss.android.ugc.aweme.port.in.a.f61121d
            java.lang.String r0 = r0.d()
            r1.f77483c = r0
            java.lang.String r0 = "android"
            r1.f77486f = r0
            java.lang.String r0 = android.os.Build.MODEL
            r1.g = r0
            com.ss.android.ugc.aweme.effectplatform.h r0 = new com.ss.android.ugc.aweme.effectplatform.h
            r0.<init>()
            r1.l = r0
            com.ss.android.ttve.utils.b r0 = new com.ss.android.ttve.utils.b
            r0.<init>()
            r1.r = r0
            java.lang.String r0 = com.ss.android.common.applog.AppLog.getServerDeviceId()
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "0"
            goto L_0x00c1
        L_0x00bd:
            java.lang.String r0 = com.ss.android.common.applog.AppLog.getServerDeviceId()
        L_0x00c1:
            r1.f77484d = r0
            java.lang.String r0 = f3094d
            r1.j = r0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.language.I18nManagerService> r5 = com.ss.android.ugc.aweme.language.I18nManagerService.class
            java.lang.Object r0 = r0.getService(r5)
            com.ss.android.ugc.aweme.language.I18nManagerService r0 = (com.ss.android.ugc.aweme.language.I18nManagerService) r0
            java.lang.String r0 = r0.getAppLanguage()
            r1.o = r0
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.language.I18nManagerService> r5 = com.ss.android.ugc.aweme.language.I18nManagerService.class
            java.lang.Object r0 = r0.getService(r5)
            com.ss.android.ugc.aweme.language.I18nManagerService r0 = (com.ss.android.ugc.aweme.language.I18nManagerService) r0
            java.lang.String r0 = r0.getSysLanguage()
            r1.p = r0
            r1.t = r3
            r1.u = r4
            r1.v = r2
            int r0 = r7.g
            r1.n = r0
            java.io.File r0 = f3092b
            r1.h = r0
            if (r0 == 0) goto L_0x0104
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x0104
            r0.mkdirs()
        L_0x0104:
            com.ss.android.ugc.aweme.property.a r0 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r2 = com.ss.android.ugc.aweme.property.a.C0682a.EffectPlatformUseTTNet
            boolean r0 = r0.a(r2)
            if (r0 == 0) goto L_0x0114
            com.ss.android.ugc.aweme.effectplatform.m r0 = new com.ss.android.ugc.aweme.effectplatform.m
            r0.<init>()
            goto L_0x011b
        L_0x0114:
            com.ss.android.ugc.aweme.effectplatform.b r0 = new com.ss.android.ugc.aweme.effectplatform.b
            okhttp3.OkHttpClient r2 = r7.k
            r0.<init>(r2)
        L_0x011b:
            r1.k = r0
            java.lang.String r0 = r7.i
            r1.i = r0
            java.util.List<com.ss.android.ugc.effectmanager.link.model.host.Host> r0 = f3093c
            com.ss.android.ugc.effectmanager.link.model.configuration.LinkSelectorConfiguration r2 = r1.w
            r2.setOriginHosts(r0)
            android.content.Context r0 = r7.h
            com.ss.android.ugc.effectmanager.link.model.configuration.LinkSelectorConfiguration r2 = r1.w
            r2.setContext(r0)
            com.ss.android.ugc.effectmanager.link.model.configuration.LinkSelectorConfiguration r0 = r1.w
            r0.setLazy(r9)
            com.ss.android.ugc.aweme.port.in.a.e()
            com.ss.android.ugc.aweme.effectplatform.EffectPlatform$1 r0 = new com.ss.android.ugc.aweme.effectplatform.EffectPlatform$1
            r0.<init>()
            r1.q = r0
            com.ss.android.ugc.effectmanager.g r0 = new com.ss.android.ugc.effectmanager.g
            r0.<init>(r1, r8)
            r7.f3096f = r0
        L_0x0145:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3091a
            r3 = 0
            r4 = 38910(0x97fe, float:5.4525E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x016b
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3091a
            r3 = 0
            r4 = 38910(0x97fe, float:5.4525E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01c0
        L_0x016b:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3091a
            r3 = 0
            r4 = 38911(0x97ff, float:5.4526E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0198
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f3091a
            r3 = 0
            r4 = 38911(0x97ff, float:5.4526E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01a0
        L_0x0198:
            com.ss.android.ugc.aweme.property.a r0 = com.ss.android.ugc.aweme.port.in.a.M
            com.ss.android.ugc.aweme.property.a$a r1 = com.ss.android.ugc.aweme.property.a.C0682a.EnableEffectDiskCache
            boolean r0 = r0.a(r1)
        L_0x01a0:
            if (r0 == 0) goto L_0x01c0
            com.ss.android.ugc.effectmanager.g r0 = r7.f3096f
            java.util.ArrayList<java.lang.String> r0 = r0.t
            if (r0 != 0) goto L_0x01b0
            com.ss.android.ugc.effectmanager.g r0 = r7.f3096f
            java.util.ArrayList r1 = g()
            r0.t = r1
        L_0x01b0:
            com.ss.android.ugc.effectmanager.g r0 = r7.f3096f
            com.ss.android.ugc.effectmanager.common.d.a r0 = r0.r
            if (r0 != 0) goto L_0x01c0
            com.ss.android.ugc.effectmanager.g r0 = r7.f3096f
            com.ss.android.ugc.effectmanager.g r1 = r7.f3096f
            com.ss.android.ugc.effectmanager.common.a.a r1 = com.ss.android.ugc.effectmanager.common.a.a.a((com.ss.android.ugc.effectmanager.g) r1)
            r0.r = r1
        L_0x01c0:
            com.ss.android.ugc.aweme.effectplatform.d r0 = r7.f3095e
            com.ss.android.ugc.effectmanager.g r1 = r7.f3096f
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.effectplatform.d.f43812a
            r13 = 0
            r14 = 38945(0x9821, float:5.4574E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.effectmanager.g> r2 = com.ss.android.ugc.effectmanager.g.class
            r15[r8] = r2
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r0
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x01fb
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.effectplatform.d.f43812a
            r13 = 0
            r14 = 38945(0x9821, float:5.4574E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.effectmanager.g> r1 = com.ss.android.ugc.effectmanager.g.class
            r15[r8] = r1
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            goto L_0x0354
        L_0x01fb:
            com.ss.android.ugc.effectmanager.h r2 = new com.ss.android.ugc.effectmanager.h
            r2.<init>()
            r0.f43815c = r2
            com.ss.android.ugc.effectmanager.h r2 = r0.f43815c
            if (r1 == 0) goto L_0x0218
            com.ss.android.ugc.effectmanager.link.model.configuration.LinkSelectorConfiguration r3 = r1.u
            if (r3 == 0) goto L_0x0218
            java.util.List<com.ss.android.ugc.effectmanager.link.model.host.Host> r4 = r3.mOriginHosts
            int r4 = r4.size()
            if (r4 <= r9) goto L_0x0218
            boolean r3 = r3.mIsNetworkChangeMonitor
            if (r3 == 0) goto L_0x0218
            r3 = 1
            goto L_0x0219
        L_0x0218:
            r3 = 0
        L_0x0219:
            if (r3 == 0) goto L_0x0247
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            java.lang.Thread r4 = r4.getThread()
            if (r4 != r3) goto L_0x022a
            goto L_0x0247
        L_0x022a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Method cannot be called off the main application thread (on: "
            r1.<init>(r2)
            java.lang.String r2 = r3.getName()
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0247:
            if (r1 == 0) goto L_0x0277
            com.ss.android.ugc.effectmanager.link.model.configuration.LinkSelectorConfiguration r3 = r1.u
            java.util.List<com.ss.android.ugc.effectmanager.link.model.host.Host> r3 = r3.mOriginHosts
            if (r3 == 0) goto L_0x0277
            com.ss.android.ugc.effectmanager.link.model.configuration.LinkSelectorConfiguration r3 = r1.u
            java.util.List<com.ss.android.ugc.effectmanager.link.model.host.Host> r3 = r3.mOriginHosts
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x025a
            goto L_0x0277
        L_0x025a:
            com.ss.android.ugc.effectmanager.link.model.configuration.LinkSelectorConfiguration r3 = r1.u
            android.content.Context r3 = r3.mContext
            if (r3 == 0) goto L_0x0277
            com.ss.android.ugc.effectmanager.common.d.c r3 = r1.v
            if (r3 == 0) goto L_0x0277
            com.ss.android.ugc.effectmanager.d.a r3 = r1.w
            if (r3 == 0) goto L_0x0277
            java.io.File r3 = r1.i
            if (r3 == 0) goto L_0x0277
            java.io.File r3 = r1.i
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x0275
            goto L_0x0277
        L_0x0275:
            r3 = 1
            goto L_0x0278
        L_0x0277:
            r3 = 0
        L_0x0278:
            if (r3 != 0) goto L_0x027c
            goto L_0x0350
        L_0x027c:
            com.ss.android.ugc.effectmanager.a.a r3 = new com.ss.android.ugc.effectmanager.a.a
            r3.<init>(r1)
            r2.h = r3
            com.ss.android.ugc.effectmanager.a.a r3 = r2.h
            com.ss.android.ugc.effectmanager.link.LinkSelector r3 = r3.f77205b
            r2.i = r3
            java.util.concurrent.ExecutorService r1 = r1.y
            com.ss.android.ugc.effectmanager.common.h r3 = new com.ss.android.ugc.effectmanager.common.h
            r3.<init>()
            com.ss.android.ugc.effectmanager.common.h$a r4 = new com.ss.android.ugc.effectmanager.common.h$a
            r4.<init>()
            if (r1 != 0) goto L_0x02a2
            com.ss.android.ugc.effectmanager.common.e r1 = new com.ss.android.ugc.effectmanager.common.e
            java.lang.String r5 = "EffectManager"
            r1.<init>(r5, r9)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newCachedThreadPool(r1)
        L_0x02a2:
            r4.f77334a = r1
            com.ss.android.ugc.effectmanager.a.a r1 = r2.h
            r4.f77336c = r1
            java.util.concurrent.ExecutorService r1 = r4.f77334a
            r3.f77328b = r1
            boolean r1 = r4.f77335b
            r3.f77329c = r1
            com.ss.android.ugc.effectmanager.a.a r1 = r4.f77336c
            r3.f77330d = r1
            r3.f77327a = r9
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.f77331e = r1
            com.ss.android.ugc.effectmanager.d.a.b r1 = new com.ss.android.ugc.effectmanager.d.a.b
            com.ss.android.ugc.effectmanager.link.LinkSelector r4 = r2.i
            r1.<init>(r4)
            r1.f77350a = r9
            java.lang.String r4 = "LINK_SELECTOR"
            java.util.Map<java.lang.String, com.ss.android.ugc.effectmanager.d.a.a> r5 = r3.f77331e
            r5.put(r4, r1)
            com.ss.android.ugc.effectmanager.a.a r1 = r2.h
            com.ss.android.ugc.effectmanager.g r1 = r1.f77204a
            r1.q = r3
            com.ss.android.ugc.effectmanager.effect.c.c r1 = new com.ss.android.ugc.effectmanager.effect.c.c
            com.ss.android.ugc.effectmanager.a.a r3 = r2.h
            com.ss.android.ugc.effectmanager.g r3 = r3.f77204a
            r1.<init>(r3)
            r2.f77492e = r1
            com.ss.android.ugc.effectmanager.effect.c.a r1 = new com.ss.android.ugc.effectmanager.effect.c.a
            com.ss.android.ugc.effectmanager.a.a r3 = r2.h
            r1.<init>(r3)
            r2.f77488a = r1
            com.ss.android.ugc.effectmanager.effect.c.b r1 = new com.ss.android.ugc.effectmanager.effect.c.b
            com.ss.android.ugc.effectmanager.a.a r3 = r2.h
            r1.<init>(r3)
            r2.f77489b = r1
            com.ss.android.ugc.effectmanager.effect.c.d r1 = new com.ss.android.ugc.effectmanager.effect.c.d
            com.ss.android.ugc.effectmanager.a.a r3 = r2.h
            r1.<init>(r3)
            r2.f77490c = r1
            com.ss.android.ugc.effectmanager.effect.c.a r1 = r2.f77488a
            com.ss.android.ugc.effectmanager.h$1 r3 = new com.ss.android.ugc.effectmanager.h$1
            r3.<init>()
            r1.f77358d = r3
            com.ss.android.ugc.effectmanager.effect.c.b r1 = r2.f77489b
            com.ss.android.ugc.effectmanager.h$2 r3 = new com.ss.android.ugc.effectmanager.h$2
            r3.<init>()
            r1.f77361c = r3
            com.ss.android.ugc.effectmanager.effect.c.e r1 = new com.ss.android.ugc.effectmanager.effect.c.e
            com.ss.android.ugc.effectmanager.a.a r3 = r2.h
            r1.<init>(r3)
            r2.f77491d = r1
            com.ss.android.ugc.effectmanager.a.a r1 = r2.h
            com.ss.android.ugc.effectmanager.g r1 = r1.f77204a
            com.ss.android.ugc.effectmanager.common.d.a r1 = r1.r
            if (r1 != 0) goto L_0x0330
            com.ss.android.ugc.effectmanager.common.a.b r1 = new com.ss.android.ugc.effectmanager.common.a.b
            com.ss.android.ugc.effectmanager.a.a r3 = r2.h
            com.ss.android.ugc.effectmanager.g r3 = r3.f77204a
            r1.<init>((com.ss.android.ugc.effectmanager.g) r3)
            com.ss.android.ugc.effectmanager.h.f77487f = r1
            com.ss.android.ugc.effectmanager.a.a r1 = r2.h
            com.ss.android.ugc.effectmanager.g r1 = r1.f77204a
            com.ss.android.ugc.effectmanager.common.d.a r3 = com.ss.android.ugc.effectmanager.h.f77487f
            r1.r = r3
            goto L_0x0338
        L_0x0330:
            com.ss.android.ugc.effectmanager.a.a r1 = r2.h
            com.ss.android.ugc.effectmanager.g r1 = r1.f77204a
            com.ss.android.ugc.effectmanager.common.d.a r1 = r1.r
            com.ss.android.ugc.effectmanager.h.f77487f = r1
        L_0x0338:
            com.ss.android.ugc.effectmanager.a.a r1 = r2.h
            com.ss.android.ugc.effectmanager.g r1 = r1.f77204a
            com.ss.android.ugc.effectmanager.d.a r1 = r1.w
            com.ss.android.ugc.effectmanager.link.LinkSelector r3 = r2.i
            r1.f77348b = r3
            r2.g = r9
            com.ss.android.ugc.effectmanager.link.LinkSelector r1 = r2.i
            boolean r1 = r1.j
            if (r1 != 0) goto L_0x034f
            com.ss.android.ugc.effectmanager.link.LinkSelector r1 = r2.i
            r1.c()
        L_0x034f:
            r8 = 1
        L_0x0350:
            r0.f43814b = r8
            boolean r0 = r0.f43814b
        L_0x0354:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effectplatform.EffectPlatform.<init>(android.content.Context, java.lang.String, okhttp3.OkHttpClient):void");
    }

    public final void a(@NonNull String str, @Nullable String str2, int i2, int i3, @NonNull l lVar) {
        l lVar2 = lVar;
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i2), Integer.valueOf(i3), lVar2}, this, f3091a, false, 38926, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, l.class}, Void.TYPE)) {
            Object[] objArr = {str, str2, Integer.valueOf(i2), Integer.valueOf(i3), lVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f3091a, false, 38926, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, l.class}, Void.TYPE);
            return;
        }
        c();
        d dVar = this.f3095e;
        Object[] objArr3 = {str, str2, Integer.valueOf(i2), Integer.valueOf(i3), lVar2};
        if (PatchProxy.isSupport(objArr3, dVar, d.f43812a, false, 38959, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, l.class}, Void.TYPE)) {
            Object[] objArr4 = {str, str2, Integer.valueOf(i2), Integer.valueOf(i3), lVar2};
            Object[] objArr5 = objArr4;
            d dVar2 = dVar;
            PatchProxy.accessDispatch(objArr5, dVar2, d.f43812a, false, 38959, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, l.class}, Void.TYPE);
        } else if (!dVar.f43814b) {
            lVar2.a(dVar.b());
        } else {
            h hVar = dVar.f43815c;
            if (hVar.h == null || hVar.f77488a == null) {
                if (lVar2 != null) {
                    lVar2.a(new c((Exception) new IllegalStateException("请先初始化")));
                }
                return;
            }
            String b2 = h.b();
            hVar.h.f77204a.z.a(b2, lVar2);
            com.ss.android.ugc.effectmanager.effect.c.a aVar = hVar.f77488a;
            q qVar = new q(aVar.f77355a, b2, str, str2, i2, i3, aVar.f77357c);
            aVar.f77356b.q.a(qVar);
        }
    }

    public final void a(@NonNull String str, String str2, int i2, int i3, int i4, String str3, @NonNull f fVar) {
        String str4 = str;
        String str5 = str2;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{str4, str5, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3, fVar2}, this, f3091a, false, 38920, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3, fVar2}, this, f3091a, false, 38920, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, f.class}, Void.TYPE);
            return;
        }
        d dVar = this.f3095e;
        Object[] objArr = {str4, str5, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3, fVar2};
        if (PatchProxy.isSupport(objArr, dVar, d.f43812a, false, 38952, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3, fVar2}, dVar, d.f43812a, false, 38952, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, f.class}, Void.TYPE);
        } else if (!dVar.f43814b) {
            fVar2.a(dVar.b());
        } else {
            h hVar = dVar.f43815c;
            d.AnonymousClass2 r0 = new com.ss.android.ugc.effectmanager.effect.b.a(str, str2, i2, i3, i4, str3, fVar) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f43822a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f43823b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f43824c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ int f43825d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ int f43826e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ int f43827f;
                final /* synthetic */ String g;
                final /* synthetic */ f h;

                public final void a(c cVar) {
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f43822a, false, 38978, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f43822a, false, 38978, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    d.this.a(this.f43823b, this.f43824c, this.f43825d, this.f43826e, this.f43827f, this.g, true, this.h);
                }

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f43822a, false, 38977, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f43822a, false, 38977, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else if (z) {
                        d.this.a(this.f43823b, this.f43824c, this.f43825d, this.f43826e, this.f43827f, this.g, false, this.h);
                    } else {
                        d.this.a(this.f43823b, this.f43824c, this.f43825d, this.f43826e, this.f43827f, this.g, true, this.h);
                    }
                }

                {
                    this.f43823b = r2;
                    this.f43824c = r3;
                    this.f43825d = r4;
                    this.f43826e = r5;
                    this.f43827f = r6;
                    this.g = r7;
                    this.h = r8;
                }
            };
            hVar.a(str4, str5, (com.ss.android.ugc.effectmanager.effect.b.a) r0);
        }
    }
}
