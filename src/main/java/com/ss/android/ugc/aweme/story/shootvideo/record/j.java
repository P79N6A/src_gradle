package com.ss.android.ugc.aweme.story.shootvideo.record;

import android.app.Dialog;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.ad;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.hm;
import com.ss.android.ugc.aweme.shortvideo.util.af;
import com.ss.android.ugc.aweme.story.api.IAVStoryService;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jb\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00060\f2#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00060\fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bJV\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00060\f2#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00060\fJ\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0002J1\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00060\fJ\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J=\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00042#\b\u0002\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00060\fH\u0007J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J,\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordLauncher;", "", "()V", "launchIntent", "Landroid/content/Intent;", "afterRequestPermission", "", "context", "Landroid/content/Context;", "grantResults", "", "onPermissionAllowed", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onPermissionDenied", "checkEnvironmentReadyBeforeLaunch", "", "checkPermissionBeforeLaunch", "checkRecordPermission", "checkStorageState", "copyDataIfNeeded", "onCopyDataFinished", "doRealLaunch", "launchStoryRecordActivity", "intent", "launch", "onPermissionDisAllowed", "showRecreateDialogIfNeeded", "onConfirm", "Lkotlin/Function0;", "onCancel", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73938a;

    /* renamed from: b  reason: collision with root package name */
    public static Intent f73939b;

    /* renamed from: c  reason: collision with root package name */
    public static final j f73940c = new j();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "context", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final /* synthetic */ class a extends FunctionReference implements Function1<Context, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a(j jVar) {
            super(1, jVar);
        }

        public final String getName() {
            return "onPermissionDisAllowed";
        }

        public final KDeclarationContainer getOwner() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85688, new Class[0], KDeclarationContainer.class)) {
                return Reflection.getOrCreateKotlinClass(j.class);
            }
            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85688, new Class[0], KDeclarationContainer.class);
        }

        public final String getSignature() {
            return "onPermissionDisAllowed(Landroid/content/Context;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Context) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 85687, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 85687, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context2, "p1");
            j jVar = (j) this.receiver;
            if (PatchProxy.isSupport(new Object[]{context2}, jVar, j.f73938a, false, 85682, new Class[]{Context.class}, Void.TYPE)) {
                j jVar2 = jVar;
                PatchProxy.accessDispatch(new Object[]{context2}, jVar2, j.f73938a, false, 85682, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            af.f71095c.a(context2, af.a.INSTANCE, af.b.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/story/shootvideo/record/StoryRecordLauncher$checkPermissionBeforeLaunch$2", "Lcom/ss/android/ugc/aweme/port/in/IPermissionService$IPermissionRequestListener;", "onRequestPermissionResult", "", "permissions", "", "", "grantResults", "", "([Ljava/lang/String;[I)V", "tools.story-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements ad.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73941a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f73942b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function1 f73943c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function1 f73944d;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.Nullable java.lang.String[] r21, @org.jetbrains.annotations.Nullable int[] r22) {
            /*
                r20 = this;
                r7 = r20
                r9 = r22
                r10 = 2
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r11 = 0
                r0[r11] = r21
                r12 = 1
                r0[r12] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = f73941a
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                r5[r11] = r1
                java.lang.Class<int[]> r1 = int[].class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 85689(0x14eb9, float:1.20076E-40)
                r1 = r20
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0045
                java.lang.Object[] r0 = new java.lang.Object[r10]
                r0[r11] = r21
                r0[r12] = r9
                com.meituan.robust.ChangeQuickRedirect r2 = f73941a
                r3 = 0
                r4 = 85689(0x14eb9, float:1.20076E-40)
                java.lang.Class[] r5 = new java.lang.Class[r10]
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                r5[r11] = r1
                java.lang.Class<int[]> r1 = int[].class
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r20
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0045:
                com.ss.android.ugc.aweme.story.shootvideo.record.j r0 = com.ss.android.ugc.aweme.story.shootvideo.record.j.f73940c
                android.content.Context r1 = r7.f73942b
                kotlin.jvm.functions.Function1 r2 = r7.f73943c
                kotlin.jvm.functions.Function1 r3 = r7.f73944d
                r4 = 4
                java.lang.Object[] r13 = new java.lang.Object[r4]
                r13[r11] = r1
                r13[r12] = r9
                r13[r10] = r2
                r5 = 3
                r13[r5] = r3
                com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.story.shootvideo.record.j.f73938a
                r16 = 0
                r17 = 85681(0x14eb1, float:1.20065E-40)
                java.lang.Class[] r6 = new java.lang.Class[r4]
                java.lang.Class<android.content.Context> r8 = android.content.Context.class
                r6[r11] = r8
                java.lang.Class<int[]> r8 = int[].class
                r6[r12] = r8
                java.lang.Class<kotlin.jvm.functions.Function1> r8 = kotlin.jvm.functions.Function1.class
                r6[r10] = r8
                java.lang.Class<kotlin.jvm.functions.Function1> r8 = kotlin.jvm.functions.Function1.class
                r6[r5] = r8
                java.lang.Class r19 = java.lang.Void.TYPE
                r14 = r0
                r18 = r6
                boolean r6 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                if (r6 == 0) goto L_0x00a9
                java.lang.Object[] r8 = new java.lang.Object[r4]
                r8[r11] = r1
                r8[r12] = r9
                r8[r10] = r2
                r8[r5] = r3
                com.meituan.robust.ChangeQuickRedirect r1 = com.ss.android.ugc.aweme.story.shootvideo.record.j.f73938a
                r2 = 0
                r3 = 85681(0x14eb1, float:1.20065E-40)
                java.lang.Class[] r13 = new java.lang.Class[r4]
                java.lang.Class<android.content.Context> r4 = android.content.Context.class
                r13[r11] = r4
                java.lang.Class<int[]> r4 = int[].class
                r13[r12] = r4
                java.lang.Class<kotlin.jvm.functions.Function1> r4 = kotlin.jvm.functions.Function1.class
                r13[r10] = r4
                java.lang.Class<kotlin.jvm.functions.Function1> r4 = kotlin.jvm.functions.Function1.class
                r13[r5] = r4
                java.lang.Class r14 = java.lang.Void.TYPE
                r9 = r0
                r10 = r1
                r11 = r2
                r12 = r3
                com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
                return
            L_0x00a9:
                if (r9 == 0) goto L_0x00d6
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Collection r4 = (java.util.Collection) r4
                int r5 = r9.length
                r6 = 0
            L_0x00b4:
                if (r6 >= r5) goto L_0x00c9
                r8 = r9[r6]
                if (r8 != 0) goto L_0x00bc
                r10 = 1
                goto L_0x00bd
            L_0x00bc:
                r10 = 0
            L_0x00bd:
                if (r10 != 0) goto L_0x00c6
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r4.add(r8)
            L_0x00c6:
                int r6 = r6 + 1
                goto L_0x00b4
            L_0x00c9:
                java.util.List r4 = (java.util.List) r4
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x00d2
                goto L_0x00d6
            L_0x00d2:
                r3.invoke(r1)
                return
            L_0x00d6:
                r0.a(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.record.j.b.a(java.lang.String[], int[]):void");
        }

        public b(Context context, Function1 function1, Function1 function12) {
            this.f73942b = context;
            this.f73943c = function1;
            this.f73944d = function12;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Landroid/content/Context;", "Lkotlin/ParameterName;", "name", "context", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final /* synthetic */ class c extends FunctionReference implements Function1<Context, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public c(j jVar) {
            super(1, jVar);
        }

        public final String getName() {
            return "doRealLaunch";
        }

        public final KDeclarationContainer getOwner() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85691, new Class[0], KDeclarationContainer.class)) {
                return Reflection.getOrCreateKotlinClass(j.class);
            }
            return (KDeclarationContainer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85691, new Class[0], KDeclarationContainer.class);
        }

        public final String getSignature() {
            return "doRealLaunch(Landroid/content/Context;)V";
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Context) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, changeQuickRedirect, false, 85690, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, this, changeQuickRedirect, false, 85690, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context2, "p1");
            j jVar = (j) this.receiver;
            if (PatchProxy.isSupport(new Object[]{context2}, jVar, j.f73938a, false, 85684, new Class[]{Context.class}, Void.TYPE)) {
                j jVar2 = jVar;
                PatchProxy.accessDispatch(new Object[]{context2}, jVar2, j.f73938a, false, 85684, new Class[]{Context.class}, Void.TYPE);
                return;
            }
            Intent intent = j.f73939b;
            if (intent != null) {
                intent.putExtra("shoot_mode", 4);
                if (!intent.hasExtra("shoot_way")) {
                    intent.putExtra("shoot_way", "story");
                }
                if (!intent.hasExtra("translation_type")) {
                    intent.putExtra("translation_type", 3);
                }
                if (!intent.hasExtra("creation_id")) {
                    intent.putExtra("creation_id", UUID.randomUUID().toString());
                }
                intent.setClass(context2, StoryRecordActivity.class);
                if (context2 instanceof FragmentActivity) {
                    ((FragmentActivity) context2).startActivityForResult(intent, 6);
                }
                Object service = ServiceManager.get().getService(IAVService.class);
                Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…e(IAVService::class.java)");
                ((IAVService) service).getFilterService().refreshData();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Function0 f73946b;

        d(Function0 function0) {
            this.f73946b = function0;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f73945a, false, 85692, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f73945a, false, 85692, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            dialogInterface.dismiss();
            this.f73946b.invoke();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f73947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IAVStoryService f73948b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Function0 f73949c;

        e(IAVStoryService iAVStoryService, Function0 function0) {
            this.f73948b = iAVStoryService;
            this.f73949c = function0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x005c, code lost:
            if (r1 == null) goto L_0x005e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.content.DialogInterface r11, int r12) {
            /*
                r10 = this;
                r7 = 2
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r11
                java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
                r9 = 1
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f73947a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.content.DialogInterface> r1 = android.content.DialogInterface.class
                r5[r8] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 85693(0x14ebd, float:1.20081E-40)
                r1 = r10
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0047
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r11
                java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f73947a
                r3 = 0
                r4 = 85693(0x14ebd, float:1.20081E-40)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.content.DialogInterface> r1 = android.content.DialogInterface.class
                r5[r8] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r9] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0047:
                r11.dismiss()
                com.ss.android.ugc.aweme.story.api.IAVStoryService r0 = r10.f73948b
                com.ss.android.ugc.aweme.story.api.IAVStoryService r1 = r10.f73948b
                android.arch.lifecycle.MutableLiveData r1 = r1.getPublishState()
                java.lang.Object r1 = r1.getValue()
                com.ss.android.ugc.aweme.story.api.j r1 = (com.ss.android.ugc.aweme.story.api.j) r1
                if (r1 == 0) goto L_0x005e
                java.lang.String r1 = r1.f71841c
                if (r1 != 0) goto L_0x0060
            L_0x005e:
                java.lang.String r1 = ""
            L_0x0060:
                r0.cancelPublish(r1)
                kotlin.jvm.functions.Function0 r0 = r10.f73949c
                r0.invoke()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.shootvideo.record.j.e.onClick(android.content.DialogInterface, int):void");
        }
    }

    private j() {
    }

    private final boolean b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f73938a, false, 85679, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f73938a, false, 85679, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (!com.ss.android.ugc.aweme.video.b.h()) {
            com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.c1x).a();
            return false;
        } else if (com.ss.android.ugc.aweme.video.b.i() >= 20971520) {
            return true;
        } else {
            com.bytedance.ies.dmt.ui.d.a.b(context2, (int) C0906R.string.a63).a();
            return false;
        }
    }

    public final boolean a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f73938a, false, 85676, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f73938a, false, 85676, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        IAVStoryService iAVStoryService = (IAVStoryService) ServiceManager.get().getService(IAVStoryService.class);
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVStoryService == null || !iAVStoryService.isStoryPublishing(context2)) {
            Intrinsics.checkExpressionValueIsNotNull(iAVService, "avService");
            if (!iAVService.getPublishService().inPublishPage(context2)) {
                if (!com.ss.android.ugc.aweme.port.in.a.a()) {
                    return b(context);
                }
                com.bytedance.ies.dmt.ui.d.a.b(context.getApplicationContext(), (int) C0906R.string.ah7).a();
                return false;
            }
        }
        com.bytedance.ies.dmt.ui.d.a.c(context.getApplicationContext(), (int) C0906R.string.es).a();
        return false;
    }

    public final boolean a(@NotNull Context context, @NotNull Function1<? super Context, Unit> function1) {
        Context context2 = context;
        Function1<? super Context, Unit> function12 = function1;
        if (PatchProxy.isSupport(new Object[]{context2, function12}, this, f73938a, false, 85678, new Class[]{Context.class, Function1.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, function12}, this, f73938a, false, 85678, new Class[]{Context.class, Function1.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(function12, "onCopyDataFinished");
        com.ss.android.ugc.aweme.port.in.a.a(new hm().a());
        function12.invoke(context2);
        return true;
    }

    public final boolean a(@NotNull Context context, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Context context2 = context;
        Function0<Unit> function03 = function0;
        Function0<Unit> function04 = function02;
        if (PatchProxy.isSupport(new Object[]{context2, function03, function04}, this, f73938a, false, 85683, new Class[]{Context.class, Function0.class, Function0.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, function03, function04}, this, f73938a, false, 85683, new Class[]{Context.class, Function0.class, Function0.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(function03, "onConfirm");
        Intrinsics.checkParameterIsNotNull(function04, "onCancel");
        IAVStoryService iAVStoryService = (IAVStoryService) ServiceManager.get().getService(IAVStoryService.class);
        if (iAVStoryService != null) {
            MutableLiveData<com.ss.android.ugc.aweme.story.api.j> publishState = iAVStoryService.getPublishState();
            if (publishState != null) {
                com.ss.android.ugc.aweme.story.api.j jVar = (com.ss.android.ugc.aweme.story.api.j) publishState.getValue();
                if (jVar != null && jVar.f71843e == 3) {
                    Dialog a2 = new a.C0185a(context2).b((int) C0906R.string.cf9).b((int) C0906R.string.oy, (DialogInterface.OnClickListener) new d(function04)).a((int) C0906R.string.p0, (DialogInterface.OnClickListener) new e(iAVStoryService, function03)).a().a();
                    a2.setCancelable(false);
                    a2.setCanceledOnTouchOutside(false);
                    a2.show();
                    return true;
                }
            }
        }
        return false;
    }
}
