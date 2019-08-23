package com.ss.android.ugc.aweme.ac;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ac.b;

@TargetApi(23)
public final class a extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31580a;

    /* renamed from: b  reason: collision with root package name */
    b.C0400b f31581b;

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f31580a, false, 63530, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f31580a, false, 63530, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        requestPermissions(getArguments().getStringArray("permissions"), 1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRequestPermissionsResult(int r15, @android.support.annotation.NonNull java.lang.String[] r16, @android.support.annotation.NonNull int[] r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = r16
            r9 = r17
            r10 = 3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r11 = 0
            r0[r11] = r1
            r12 = 1
            r0[r12] = r8
            r13 = 2
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f31580a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r12] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 63531(0xf82b, float:8.9026E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0059
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r11] = r1
            r0[r12] = r8
            r0[r13] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f31580a
            r3 = 0
            r4 = 63531(0xf82b, float:8.9026E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r12] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0059:
            super.onRequestPermissionsResult(r15, r16, r17)
            com.ss.android.ugc.aweme.ac.b$b r0 = r7.f31581b
            if (r0 == 0) goto L_0x0065
            com.ss.android.ugc.aweme.ac.b$b r0 = r7.f31581b
            r0.a(r8, r9)
        L_0x0065:
            android.app.FragmentManager r0 = r14.getFragmentManager()
            android.app.FragmentTransaction r0 = r0.beginTransaction()
            android.app.FragmentTransaction r0 = r0.remove(r14)
            r0.commitAllowingStateLoss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ac.a.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
