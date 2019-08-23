package com.ss.android.ugc.aweme.tools.music.avoidonresult;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J*\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/avoidonresult/AvoidOnResult;", "", "activity", "Landroid/support/v4/app/FragmentActivity;", "(Landroid/support/v4/app/FragmentActivity;)V", "fragment", "Landroid/support/v4/app/Fragment;", "(Landroid/support/v4/app/Fragment;)V", "mAvoidOnResultFragment", "Lcom/ss/android/ugc/aweme/tools/music/avoidonresult/AvoidOnResultFragment;", "findAvoidOnResultFragment", "getAvoidOnResultFragment", "startForResult", "", "requestCode", "", "runnable", "Lkotlin/Function1;", "callback", "Lcom/ss/android/ugc/aweme/tools/music/avoidonresult/AvoidOnResult$Callback;", "intent", "Landroid/content/Intent;", "clazz", "Ljava/lang/Class;", "Callback", "Companion", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74802a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final b f74803b = new b((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final String f74804d = f74804d;

    /* renamed from: c  reason: collision with root package name */
    private AvoidOnResultFragment f74805c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/avoidonresult/AvoidOnResult$Callback;", "", "onActivityResult", "", "resultCode", "", "data", "Landroid/content/Intent;", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.tools.music.avoidonresult.a$a  reason: collision with other inner class name */
    public interface C0774a {
        void a(int i, @Nullable Intent intent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/tools/music/avoidonresult/AvoidOnResult$Companion;", "", "()V", "TAG", "", "tools.music_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(@NotNull Fragment fragment) {
        this(fragment.getActivity());
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(@org.jetbrains.annotations.Nullable android.support.v4.app.FragmentActivity r18) {
        /*
            r17 = this;
            r17.<init>()
            if (r18 == 0) goto L_0x00b8
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f74802a
            r5 = 0
            r6 = 87205(0x154a5, float:1.222E-40)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.support.v4.app.FragmentActivity> r3 = android.support.v4.app.FragmentActivity.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment> r8 = com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment.class
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003f
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f74802a
            r13 = 0
            r14 = 87205(0x154a5, float:1.222E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.support.v4.app.FragmentActivity> r0 = android.support.v4.app.FragmentActivity.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment> r16 = com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment r0 = (com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment) r0
        L_0x003b:
            r1 = r0
            r0 = r17
            goto L_0x00ab
        L_0x003f:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f74802a
            r5 = 0
            r6 = 87206(0x154a6, float:1.22202E-40)
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.support.v4.app.FragmentActivity> r3 = android.support.v4.app.FragmentActivity.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment> r8 = com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment.class
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0072
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f74802a
            r13 = 0
            r14 = 87206(0x154a6, float:1.22202E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.support.v4.app.FragmentActivity> r1 = android.support.v4.app.FragmentActivity.class
            r15[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment> r16 = com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment.class
            r11 = r17
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0087
        L_0x0072:
            android.support.v4.app.FragmentManager r1 = r18.getSupportFragmentManager()
            java.lang.String r2 = f74804d
            android.support.v4.app.Fragment r1 = r1.findFragmentByTag(r2)
            if (r1 != 0) goto L_0x0080
            r1 = 0
            goto L_0x0089
        L_0x0080:
            java.lang.String r2 = "activity.supportFragment…ByTag(TAG) ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            if (r1 == 0) goto L_0x00ae
        L_0x0087:
            com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment r1 = (com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment) r1
        L_0x0089:
            if (r1 != 0) goto L_0x00a9
            com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment r1 = new com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment
            r1.<init>()
            android.support.v4.app.FragmentManager r0 = r18.getSupportFragmentManager()
            android.support.v4.app.FragmentTransaction r2 = r0.beginTransaction()
            r3 = r1
            android.support.v4.app.Fragment r3 = (android.support.v4.app.Fragment) r3
            java.lang.String r4 = f74804d
            android.support.v4.app.FragmentTransaction r2 = r2.add((android.support.v4.app.Fragment) r3, (java.lang.String) r4)
            r2.commitAllowingStateLoss()
            if (r0 == 0) goto L_0x00a9
            r0.executePendingTransactions()
        L_0x00a9:
            r0 = r1
            goto L_0x003b
        L_0x00ab:
            r0.f74805c = r1
            return
        L_0x00ae:
            r0 = r17
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment"
            r1.<init>(r2)
            throw r1
        L_0x00b8:
            r0 = r17
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.avoidonresult.a.<init>(android.support.v4.app.FragmentActivity):void");
    }

    public final void a(int i, @NotNull Function1<? super Fragment, Unit> function1, @NotNull C0774a aVar) {
        Function1<? super Fragment, Unit> function12 = function1;
        C0774a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), function12, aVar2}, this, f74802a, false, 87209, new Class[]{Integer.TYPE, Function1.class, C0774a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), function12, aVar2}, this, f74802a, false, 87209, new Class[]{Integer.TYPE, Function1.class, C0774a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(function12, "runnable");
        Intrinsics.checkParameterIsNotNull(aVar2, "callback");
        AvoidOnResultFragment avoidOnResultFragment = this.f74805c;
        if (avoidOnResultFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAvoidOnResultFragment");
        }
        avoidOnResultFragment.a(i, function12, aVar2);
    }
}
