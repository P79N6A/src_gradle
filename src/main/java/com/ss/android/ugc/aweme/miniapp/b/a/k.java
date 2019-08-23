package com.ss.android.ugc.aweme.miniapp.b.a;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55523a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f55524b = "k";

    /* renamed from: c  reason: collision with root package name */
    private static c f55525c;
    private static k i;
    private static Map<String, Integer> j;

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f55526d = new HashSet(1);

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f55527e = new HashSet(1);

    /* renamed from: f  reason: collision with root package name */
    private final List<WeakReference<n>> f55528f = new ArrayList(1);
    private final List<n> g = new ArrayList(1);
    private final List<WeakReference<Object>> h = new ArrayList();

    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f55547a;

        /* renamed from: b  reason: collision with root package name */
        private AlertDialog.Builder f55548b;

        public final Dialog a() {
            if (!PatchProxy.isSupport(new Object[0], this, f55547a, false, 59337, new Class[0], Dialog.class)) {
                return this.f55548b.create();
            }
            return (Dialog) PatchProxy.accessDispatch(new Object[0], this, f55547a, false, 59337, new Class[0], Dialog.class);
        }

        public a(Context context) {
            this.f55548b = new AlertDialog.Builder(context);
        }
    }

    public static abstract class b {
        public abstract Dialog a();
    }

    public interface c {
        b a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02e7, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(@android.support.annotation.NonNull android.app.Activity r24, @android.support.annotation.NonNull java.lang.String[] r25, @android.support.annotation.NonNull int[] r26) {
        /*
            r23 = this;
            r8 = r23
            r0 = r24
            r9 = r25
            r10 = r26
            monitor-enter(r23)
            r11 = 3
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x02f0 }
            r12 = 0
            r1[r12] = r0     // Catch:{ all -> 0x02f0 }
            r13 = 1
            r1[r13] = r9     // Catch:{ all -> 0x02f0 }
            r14 = 2
            r1[r14] = r10     // Catch:{ all -> 0x02f0 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ all -> 0x02f0 }
            r4 = 0
            r5 = 59316(0xe7b4, float:8.312E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x02f0 }
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r6[r12] = r2     // Catch:{ all -> 0x02f0 }
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r6[r13] = r2     // Catch:{ all -> 0x02f0 }
            java.lang.Class<int[]> r2 = int[].class
            r6[r14] = r2     // Catch:{ all -> 0x02f0 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x02f0 }
            r2 = r23
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02f0 }
            if (r1 == 0) goto L_0x0058
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x02f0 }
            r1[r12] = r0     // Catch:{ all -> 0x02f0 }
            r1[r13] = r9     // Catch:{ all -> 0x02f0 }
            r1[r14] = r10     // Catch:{ all -> 0x02f0 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ all -> 0x02f0 }
            r4 = 0
            r5 = 59316(0xe7b4, float:8.312E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x02f0 }
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r6[r12] = r0     // Catch:{ all -> 0x02f0 }
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r6[r13] = r0     // Catch:{ all -> 0x02f0 }
            java.lang.Class<int[]> r0 = int[].class
            r6[r14] = r0     // Catch:{ all -> 0x02f0 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x02f0 }
            r2 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02f0 }
            monitor-exit(r23)
            return
        L_0x0058:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Throwable -> 0x02ee }
            r1.<init>(r11)     // Catch:{ Throwable -> 0x02ee }
            int r2 = r9.length     // Catch:{ Throwable -> 0x02ee }
            r3 = 0
        L_0x005f:
            if (r3 >= r2) goto L_0x012d
            r4 = r9[r3]     // Catch:{ Throwable -> 0x02ee }
            r5 = r10[r3]     // Catch:{ Throwable -> 0x02ee }
            r6 = -1
            if (r5 == r6) goto L_0x0074
            boolean r5 = com.ss.android.ugc.aweme.miniapp.b.a.o.a()     // Catch:{ Throwable -> 0x02ee }
            if (r5 == 0) goto L_0x0129
            boolean r5 = com.ss.android.ugc.aweme.miniapp.b.a.h.a((android.content.Context) r0, (java.lang.String) r4)     // Catch:{ Throwable -> 0x02ee }
            if (r5 != 0) goto L_0x0129
        L_0x0074:
            r5 = r10[r3]     // Catch:{ Throwable -> 0x02ee }
            if (r5 == r6) goto L_0x007a
            r10[r3] = r6     // Catch:{ Throwable -> 0x02ee }
        L_0x007a:
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x02ee }
            r15[r12] = r0     // Catch:{ Throwable -> 0x02ee }
            r15[r13] = r4     // Catch:{ Throwable -> 0x02ee }
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.miniapp.b.a.i.f55518a     // Catch:{ Throwable -> 0x02ee }
            r18 = 1
            r19 = 59301(0xe7a5, float:8.3098E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r5[r12] = r6     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r13] = r6     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class r21 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x02ee }
            r20 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x02ee }
            if (r5 == 0) goto L_0x00c5
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x02ee }
            r15[r12] = r0     // Catch:{ Throwable -> 0x02ee }
            r15[r13] = r4     // Catch:{ Throwable -> 0x02ee }
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.miniapp.b.a.i.f55518a     // Catch:{ Throwable -> 0x02ee }
            r18 = 1
            r19 = 59301(0xe7a5, float:8.3098E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r5[r12] = r6     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r13] = r6     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class r21 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x02ee }
            r20 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x02ee }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ Throwable -> 0x02ee }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x02ee }
            goto L_0x011c
        L_0x00c5:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x02ee }
            r6 = 23
            if (r5 < r6) goto L_0x011b
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x02ee }
            r15[r12] = r0     // Catch:{ Throwable -> 0x02ee }
            r15[r13] = r4     // Catch:{ Throwable -> 0x02ee }
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.miniapp.b.a.a.f55491a     // Catch:{ Throwable -> 0x02ee }
            r18 = 1
            r19 = 59264(0xe780, float:8.3047E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r5[r12] = r6     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r13] = r6     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class r21 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x02ee }
            r20 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x02ee }
            if (r5 == 0) goto L_0x0116
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x02ee }
            r15[r12] = r0     // Catch:{ Throwable -> 0x02ee }
            r15[r13] = r4     // Catch:{ Throwable -> 0x02ee }
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.miniapp.b.a.a.f55491a     // Catch:{ Throwable -> 0x02ee }
            r18 = 1
            r19 = 59264(0xe780, float:8.3047E-41)
            java.lang.Class[] r5 = new java.lang.Class[r14]     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r5[r12] = r6     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r13] = r6     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class r21 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x02ee }
            r20 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x02ee }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ Throwable -> 0x02ee }
            boolean r5 = r5.booleanValue()     // Catch:{ Throwable -> 0x02ee }
            goto L_0x011c
        L_0x0116:
            boolean r5 = r0.shouldShowRequestPermissionRationale(r4)     // Catch:{ Throwable -> 0x02ee }
            goto L_0x011c
        L_0x011b:
            r5 = 0
        L_0x011c:
            if (r5 != 0) goto L_0x0129
            java.util.Map<java.lang.String, java.lang.Integer> r5 = j     // Catch:{ Throwable -> 0x02ee }
            boolean r5 = r5.containsKey(r4)     // Catch:{ Throwable -> 0x02ee }
            if (r5 == 0) goto L_0x0129
            r1.add(r4)     // Catch:{ Throwable -> 0x02ee }
        L_0x0129:
            int r3 = r3 + 1
            goto L_0x005f
        L_0x012d:
            boolean r2 = r1.isEmpty()     // Catch:{ Throwable -> 0x02ee }
            if (r2 != 0) goto L_0x02e8
            java.lang.String r7 = r8.a((android.content.Context) r0, (java.util.List<java.lang.String>) r1)     // Catch:{ Throwable -> 0x02ee }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x02ee }
            if (r2 != 0) goto L_0x02e8
            int r2 = r1.size()     // Catch:{ Throwable -> 0x02ee }
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Throwable -> 0x02ee }
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ Throwable -> 0x02ee }
            r16 = r1
            java.lang.String[] r16 = (java.lang.String[]) r16     // Catch:{ Throwable -> 0x02ee }
            r6 = 5
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x02ee }
            r1[r12] = r0     // Catch:{ Throwable -> 0x02ee }
            r1[r13] = r9     // Catch:{ Throwable -> 0x02ee }
            r1[r14] = r16     // Catch:{ Throwable -> 0x02ee }
            r1[r11] = r10     // Catch:{ Throwable -> 0x02ee }
            r5 = 4
            r1[r5] = r7     // Catch:{ Throwable -> 0x02ee }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ Throwable -> 0x02ee }
            r4 = 0
            r17 = 59318(0xe7b6, float:8.3122E-41)
            java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<android.app.Activity> r18 = android.app.Activity.class
            r2[r12] = r18     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<java.lang.String[]> r18 = java.lang.String[].class
            r2[r13] = r18     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<java.lang.String[]> r18 = java.lang.String[].class
            r2[r14] = r18     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<int[]> r18 = int[].class
            r2[r11] = r18     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r2[r5] = r18     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x02ee }
            r19 = r2
            r2 = r23
            r15 = 4
            r5 = r17
            r15 = 5
            r6 = r19
            r22 = r7
            r7 = r18
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x02ee }
            if (r1 == 0) goto L_0x01c0
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Throwable -> 0x02ee }
            r1[r12] = r0     // Catch:{ Throwable -> 0x02ee }
            r1[r13] = r9     // Catch:{ Throwable -> 0x02ee }
            r1[r14] = r16     // Catch:{ Throwable -> 0x02ee }
            r1[r11] = r10     // Catch:{ Throwable -> 0x02ee }
            r7 = r22
            r0 = 4
            r1[r0] = r7     // Catch:{ Throwable -> 0x02ee }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ Throwable -> 0x02ee }
            r4 = 0
            r5 = 59318(0xe7b6, float:8.3122E-41)
            java.lang.Class[] r6 = new java.lang.Class[r15]     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r6[r12] = r0     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r6[r13] = r0     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r6[r14] = r0     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<int[]> r0 = int[].class
            r6[r11] = r0     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2 = 4
            r6[r2] = r0     // Catch:{ Throwable -> 0x02ee }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x02ee }
            r2 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x02ee }
            monitor-exit(r23)
            return
        L_0x01c0:
            r7 = r22
            if (r0 == 0) goto L_0x02e6
            if (r9 == 0) goto L_0x02e6
            int r1 = r9.length     // Catch:{ Throwable -> 0x02ee }
            if (r1 > 0) goto L_0x01cb
            goto L_0x02e6
        L_0x01cb:
            com.ss.android.ugc.aweme.miniapp.b.a.k$1 r15 = new com.ss.android.ugc.aweme.miniapp.b.a.k$1     // Catch:{ Throwable -> 0x02e4 }
            r1 = r15
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r16
            r1.<init>(r3, r4, r5, r6)     // Catch:{ Throwable -> 0x02e4 }
            com.ss.android.ugc.aweme.miniapp.b.a.k$2 r6 = new com.ss.android.ugc.aweme.miniapp.b.a.k$2     // Catch:{ Throwable -> 0x02e4 }
            r6.<init>(r9, r10)     // Catch:{ Throwable -> 0x02e4 }
            r1 = 4
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x02e4 }
            r2[r12] = r0     // Catch:{ Throwable -> 0x02e4 }
            r2[r13] = r7     // Catch:{ Throwable -> 0x02e4 }
            r2[r14] = r15     // Catch:{ Throwable -> 0x02e4 }
            r2[r11] = r6     // Catch:{ Throwable -> 0x02e4 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ Throwable -> 0x02e4 }
            r4 = 0
            r5 = 59322(0xe7ba, float:8.3128E-41)
            r1 = 4
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ Throwable -> 0x02e4 }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r9[r12] = r1     // Catch:{ Throwable -> 0x02e4 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r9[r13] = r1     // Catch:{ Throwable -> 0x02e4 }
            java.lang.Class<android.view.View$OnClickListener> r1 = android.view.View.OnClickListener.class
            r9[r14] = r1     // Catch:{ Throwable -> 0x02e4 }
            java.lang.Class<android.view.View$OnClickListener> r1 = android.view.View.OnClickListener.class
            r9[r11] = r1     // Catch:{ Throwable -> 0x02e4 }
            java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x02e4 }
            r1 = r2
            r2 = r23
            r11 = r6
            r6 = r9
            r9 = r7
            r7 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x02e4 }
            if (r1 == 0) goto L_0x0243
            r1 = 4
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x02e4 }
            r2[r12] = r0     // Catch:{ Throwable -> 0x02e4 }
            r2[r13] = r9     // Catch:{ Throwable -> 0x02e4 }
            r2[r14] = r15     // Catch:{ Throwable -> 0x02e4 }
            r0 = 3
            r2[r0] = r11     // Catch:{ Throwable -> 0x02e4 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ Throwable -> 0x02e4 }
            r4 = 0
            r5 = 59322(0xe7ba, float:8.3128E-41)
            r0 = 4
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x02e4 }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r12] = r0     // Catch:{ Throwable -> 0x02e4 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r13] = r0     // Catch:{ Throwable -> 0x02e4 }
            java.lang.Class<android.view.View$OnClickListener> r0 = android.view.View.OnClickListener.class
            r6[r14] = r0     // Catch:{ Throwable -> 0x02e4 }
            java.lang.Class<android.view.View$OnClickListener> r0 = android.view.View.OnClickListener.class
            r1 = 3
            r6[r1] = r0     // Catch:{ Throwable -> 0x02e4 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x02e4 }
            r1 = r2
            r2 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x02e4 }
            goto L_0x02e4
        L_0x0243:
            com.ss.android.ugc.aweme.miniapp.b.a.k$c r1 = f55525c     // Catch:{ Throwable -> 0x02e4 }
            if (r1 == 0) goto L_0x024e
            com.ss.android.ugc.aweme.miniapp.b.a.k$c r1 = f55525c     // Catch:{ Throwable -> 0x02e4 }
            com.ss.android.ugc.aweme.miniapp.b.a.k$b r1 = r1.a()     // Catch:{ Throwable -> 0x02e4 }
            goto L_0x0253
        L_0x024e:
            com.ss.android.ugc.aweme.miniapp.b.a.k$a r1 = new com.ss.android.ugc.aweme.miniapp.b.a.k$a     // Catch:{ Throwable -> 0x02e4 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x02e4 }
        L_0x0253:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r24)     // Catch:{ Throwable -> 0x02e4 }
            r2 = 2131689686(0x7f0f00d6, float:1.9008394E38)
            r3 = 0
            android.view.View r0 = r0.inflate(r2, r3)     // Catch:{ Throwable -> 0x02e4 }
            r2 = 2131168819(0x7f070e33, float:1.795195E38)
            android.view.View r2 = r0.findViewById(r2)     // Catch:{ Throwable -> 0x02e4 }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ Throwable -> 0x02e4 }
            r3 = 2131563026(0x7f0d1212, float:1.8751497E38)
            r2.setText(r3)     // Catch:{ Throwable -> 0x02e4 }
            r2 = 2131170404(0x7f071464, float:1.7955165E38)
            android.view.View r2 = r0.findViewById(r2)     // Catch:{ Throwable -> 0x02e4 }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ Throwable -> 0x02e4 }
            r3 = 8
            r2.setVisibility(r3)     // Catch:{ Throwable -> 0x02e4 }
            r2 = 2131168463(0x7f070ccf, float:1.7951229E38)
            android.view.View r2 = r0.findViewById(r2)     // Catch:{ Throwable -> 0x02e4 }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ Throwable -> 0x02e4 }
            r2.setText(r9)     // Catch:{ Throwable -> 0x02e4 }
            r2 = 2131165794(0x7f070262, float:1.7945815E38)
            android.view.View r2 = r0.findViewById(r2)     // Catch:{ Throwable -> 0x02e4 }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ Throwable -> 0x02e4 }
            r3 = 2131165793(0x7f070261, float:1.7945813E38)
            android.view.View r3 = r0.findViewById(r3)     // Catch:{ Throwable -> 0x02e4 }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ Throwable -> 0x02e4 }
            r4 = 2131563019(0x7f0d120b, float:1.8751483E38)
            r3.setText(r4)     // Catch:{ Throwable -> 0x02e4 }
            r4 = 2131563016(0x7f0d1208, float:1.8751477E38)
            r2.setText(r4)     // Catch:{ Throwable -> 0x02e4 }
            android.app.Dialog r1 = r1.a()     // Catch:{ Throwable -> 0x02e4 }
            android.view.WindowManager$LayoutParams r4 = new android.view.WindowManager$LayoutParams     // Catch:{ Throwable -> 0x02e4 }
            r4.<init>()     // Catch:{ Throwable -> 0x02e4 }
            r5 = -2
            r4.width = r5     // Catch:{ Throwable -> 0x02e4 }
            r4.height = r5     // Catch:{ Throwable -> 0x02e4 }
            r1.setCancelable(r12)     // Catch:{ Throwable -> 0x02e4 }
            r1.show()     // Catch:{ Throwable -> 0x02e4 }
            android.view.Window r5 = r1.getWindow()     // Catch:{ Throwable -> 0x02e4 }
            r5.setContentView(r0)     // Catch:{ Throwable -> 0x02e4 }
            android.view.Window r0 = r1.getWindow()     // Catch:{ Throwable -> 0x02e4 }
            r0.setAttributes(r4)     // Catch:{ Throwable -> 0x02e4 }
            android.view.Window r0 = r1.getWindow()     // Catch:{ Throwable -> 0x02e4 }
            r4 = 2131625201(0x7f0e04f1, float:1.8877603E38)
            r0.setBackgroundDrawableResource(r4)     // Catch:{ Throwable -> 0x02e4 }
            com.ss.android.ugc.aweme.miniapp.b.a.k$3 r0 = new com.ss.android.ugc.aweme.miniapp.b.a.k$3     // Catch:{ Throwable -> 0x02e4 }
            r0.<init>(r15, r1)     // Catch:{ Throwable -> 0x02e4 }
            r3.setOnClickListener(r0)     // Catch:{ Throwable -> 0x02e4 }
            com.ss.android.ugc.aweme.miniapp.b.a.k$4 r0 = new com.ss.android.ugc.aweme.miniapp.b.a.k$4     // Catch:{ Throwable -> 0x02e4 }
            r0.<init>(r11, r1)     // Catch:{ Throwable -> 0x02e4 }
            r2.setOnClickListener(r0)     // Catch:{ Throwable -> 0x02e4 }
            monitor-exit(r23)
            return
        L_0x02e4:
            monitor-exit(r23)
            return
        L_0x02e6:
            monitor-exit(r23)
            return
        L_0x02e8:
            r0 = 0
            r8.a((java.lang.String[]) r9, (int[]) r10, (java.lang.String[]) r0)     // Catch:{ Throwable -> 0x02ee }
            monitor-exit(r23)
            return
        L_0x02ee:
            monitor-exit(r23)
            return
        L_0x02f0:
            r0 = move-exception
            monitor-exit(r23)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.b.a.k.a(android.app.Activity, java.lang.String[], int[]):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@android.support.annotation.NonNull java.lang.String[] r16, @android.support.annotation.NonNull int[] r17, java.lang.String[] r18) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f55523a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r12] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r13] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 59317(0xe7b5, float:8.3121E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0053
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f55523a
            r3 = 0
            r4 = 59317(0xe7b5, float:8.3121E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r12] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r13] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0053:
            int r0 = r8.length     // Catch:{ Throwable -> 0x00b0 }
            int r1 = r9.length     // Catch:{ Throwable -> 0x00b0 }
            if (r1 >= r0) goto L_0x0058
            int r0 = r9.length     // Catch:{ Throwable -> 0x00b0 }
        L_0x0058:
            java.util.List<java.lang.ref.WeakReference<com.ss.android.ugc.aweme.miniapp.b.a.n>> r1 = r7.f55528f     // Catch:{ Throwable -> 0x00b0 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x00b0 }
        L_0x005e:
            boolean r2 = r1.hasNext()     // Catch:{ Throwable -> 0x00b0 }
            if (r2 == 0) goto L_0x0090
            java.lang.Object r2 = r1.next()     // Catch:{ Throwable -> 0x00b0 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ Throwable -> 0x00b0 }
            java.lang.Object r2 = r2.get()     // Catch:{ Throwable -> 0x00b0 }
            com.ss.android.ugc.aweme.miniapp.b.a.n r2 = (com.ss.android.ugc.aweme.miniapp.b.a.n) r2     // Catch:{ Throwable -> 0x00b0 }
            if (r10 == 0) goto L_0x0079
            int r3 = r10.length     // Catch:{ Throwable -> 0x00b0 }
            if (r3 <= 0) goto L_0x0079
            boolean r3 = r2 instanceof com.ss.android.ugc.aweme.miniapp.b.a.f     // Catch:{ Throwable -> 0x00b0 }
            if (r3 != 0) goto L_0x005e
        L_0x0079:
            r3 = 0
        L_0x007a:
            if (r3 >= r0) goto L_0x005e
            if (r2 == 0) goto L_0x008c
            r4 = r8[r3]     // Catch:{ Throwable -> 0x00b0 }
            r5 = r9[r3]     // Catch:{ Throwable -> 0x00b0 }
            boolean r4 = r2.a((java.lang.String) r4, (int) r5)     // Catch:{ Throwable -> 0x00b0 }
            if (r4 == 0) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            int r3 = r3 + 1
            goto L_0x007a
        L_0x008c:
            r1.remove()     // Catch:{ Throwable -> 0x00b0 }
            goto L_0x005e
        L_0x0090:
            java.util.List<com.ss.android.ugc.aweme.miniapp.b.a.n> r1 = r7.g     // Catch:{ Throwable -> 0x00b0 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x00b0 }
        L_0x0096:
            boolean r2 = r1.hasNext()     // Catch:{ Throwable -> 0x00b0 }
            if (r2 == 0) goto L_0x00a3
            r1.next()     // Catch:{ Throwable -> 0x00b0 }
            r1.remove()     // Catch:{ Throwable -> 0x00b0 }
            goto L_0x0096
        L_0x00a3:
            if (r12 >= r0) goto L_0x00af
            java.util.Set<java.lang.String> r1 = r7.f55526d     // Catch:{ Throwable -> 0x00b0 }
            r2 = r8[r12]     // Catch:{ Throwable -> 0x00b0 }
            r1.remove(r2)     // Catch:{ Throwable -> 0x00b0 }
            int r12 = r12 + 1
            goto L_0x00a3
        L_0x00af:
            return
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.b.a.k.a(java.lang.String[], int[], java.lang.String[]):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f55523a, false, 59325, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f55523a, false, 59325, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.h != null && !this.h.isEmpty()) {
            for (WeakReference<Object> weakReference : this.h) {
                weakReference.get();
            }
        }
    }

    private k() {
        b();
    }

    public static k a() {
        if (PatchProxy.isSupport(new Object[0], null, f55523a, true, 59305, new Class[0], k.class)) {
            return (k) PatchProxy.accessDispatch(new Object[0], null, f55523a, true, 59305, new Class[0], k.class);
        }
        if (i == null) {
            i = new k();
        }
        return i;
    }

    private synchronized void b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f55523a, false, 59306, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55523a, false, 59306, new Class[0], Void.TYPE);
            return;
        }
        for (Field field : Manifest.permission.class.getFields()) {
            try {
                str = (String) field.get("");
            } catch (IllegalAccessException unused) {
                str = null;
            }
            this.f55527e.add(str);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("android.permission.ACCESS_COARSE_LOCATION", Integer.valueOf(C0906R.string.g));
        j.put("android.permission.ACCESS_FINE_LOCATION", Integer.valueOf(C0906R.string.g));
        j.put("android.permission.READ_SMS", Integer.valueOf(C0906R.string.j));
        j.put("android.permission.READ_CONTACTS", Integer.valueOf(C0906R.string.f4476e));
        j.put("android.permission.CAMERA", Integer.valueOf(C0906R.string.f4475d));
        j.put("android.permission.RECORD_AUDIO", Integer.valueOf(C0906R.string.i));
        j.put("android.permission.READ_PHONE_STATE", Integer.valueOf(C0906R.string.h));
        j.put("android.permission.WRITE_EXTERNAL_STORAGE", Integer.valueOf(C0906R.string.f4477f));
        if (Build.VERSION.SDK_INT >= 16) {
            j.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(C0906R.string.f4477f));
        }
    }

    private synchronized void a(@Nullable n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f55523a, false, 59309, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, f55523a, false, 59309, new Class[]{n.class}, Void.TYPE);
            return;
        }
        Iterator<WeakReference<n>> it2 = this.f55528f.iterator();
        while (it2.hasNext()) {
            WeakReference next = it2.next();
            if (next.get() == nVar || next.get() == null) {
                it2.remove();
            }
        }
        Iterator<n> it3 = this.g.iterator();
        while (it3.hasNext()) {
            if (it3.next() == nVar) {
                it3.remove();
            }
        }
    }

    private synchronized void a(@NonNull String[] strArr, @Nullable n nVar) {
        if (PatchProxy.isSupport(new Object[]{strArr, nVar}, this, f55523a, false, 59308, new Class[]{String[].class, n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{strArr, nVar}, this, f55523a, false, 59308, new Class[]{String[].class, n.class}, Void.TYPE);
        } else if (nVar != null) {
            nVar.a(strArr);
            this.g.add(nVar);
            this.f55528f.add(new WeakReference(nVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean a(@android.support.annotation.Nullable android.content.Context r12, @android.support.annotation.NonNull java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r8 = 2
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x007d }
            r9 = 0
            r1[r9] = r12     // Catch:{ all -> 0x007d }
            r10 = 1
            r1[r10] = r13     // Catch:{ all -> 0x007d }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ all -> 0x007d }
            r4 = 0
            r5 = 59310(0xe7ae, float:8.3111E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x007d }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r6[r9] = r2     // Catch:{ all -> 0x007d }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ all -> 0x007d }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x007d }
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0048
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x007d }
            r1[r9] = r12     // Catch:{ all -> 0x007d }
            r1[r10] = r13     // Catch:{ all -> 0x007d }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ all -> 0x007d }
            r4 = 0
            r5 = 59310(0xe7ae, float:8.3111E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x007d }
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r6[r9] = r0     // Catch:{ all -> 0x007d }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0     // Catch:{ all -> 0x007d }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x007d }
            r2 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x007d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x007d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x007d }
            monitor-exit(r11)
            return r0
        L_0x0048:
            if (r12 != 0) goto L_0x004c
            monitor-exit(r11)
            return r9
        L_0x004c:
            boolean r1 = com.ss.android.ugc.aweme.miniapp.b.a.o.a()     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x006a
            boolean r1 = com.ss.android.ugc.aweme.miniapp.b.a.h.a((android.content.Context) r12, (java.lang.String) r13)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0068
            int r0 = com.ss.android.ugc.aweme.miniapp.b.a.i.a(r12, r13)     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0066
            java.util.Set<java.lang.String> r0 = r11.f55527e     // Catch:{ all -> 0x007d }
            boolean r0 = r0.contains(r13)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0068
        L_0x0066:
            monitor-exit(r11)
            return r10
        L_0x0068:
            monitor-exit(r11)
            return r9
        L_0x006a:
            int r0 = com.ss.android.ugc.aweme.miniapp.b.a.i.a(r12, r13)     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x007b
            java.util.Set<java.lang.String> r0 = r11.f55527e     // Catch:{ all -> 0x007d }
            boolean r0 = r0.contains(r13)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            monitor-exit(r11)
            return r9
        L_0x007b:
            monitor-exit(r11)
            return r10
        L_0x007d:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.b.a.k.a(android.content.Context, java.lang.String):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012b, code lost:
        if (r1.equals("android.permission.ACCESS_FINE_LOCATION") != false) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(android.content.Context r20, java.util.List<java.lang.String> r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f55523a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6 = 0
            r7 = 59319(0xe7b7, float:8.3124E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004a
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f55523a
            r15 = 0
            r16 = 59319(0xe7b7, float:8.3124E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x004a:
            boolean r3 = r21.isEmpty()
            if (r3 == 0) goto L_0x0053
            java.lang.String r0 = ""
            return r0
        L_0x0053:
            java.lang.String r3 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x0068
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L_0x0068
            java.lang.String r3 = "android.permission.ACCESS_FINE_LOCATION"
            r1.remove(r3)
        L_0x0068:
            int r3 = r21.size()
            r4 = 2131563008(0x7f0d1200, float:1.875146E38)
            r5 = 101(0x65, float:1.42E-43)
            if (r3 <= r11) goto L_0x00cf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r1 = r21.iterator()
        L_0x007c:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00a3
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map<java.lang.String, java.lang.Integer> r7 = j
            java.lang.Object r6 = r7.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 <= 0) goto L_0x007c
            java.lang.String r6 = r0.getString(r6)
            r3.append(r6)
            java.lang.String r6 = "、"
            r3.append(r6)
            goto L_0x007c
        L_0x00a3:
            int r1 = r3.length()
            int r1 = r1 - r11
            if (r1 < 0) goto L_0x00ad
            r3.deleteCharAt(r1)
        L_0x00ad:
            r1 = 2131563022(0x7f0d120e, float:1.875149E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tt.miniapphost.AppbrandContext r6 = com.tt.miniapphost.AppbrandContext.getInst()
            com.tt.miniapphost.entity.InitParamsEntity r6 = r6.getInitParams()
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r4 = r6.getHostStr(r5, r4)
            r2[r10] = r4
            java.lang.String r3 = r3.toString()
            r2[r11] = r3
            java.lang.String r0 = r0.getString(r1, r2)
            return r0
        L_0x00cf:
            java.lang.Object r1 = r1.get(r10)
            java.lang.String r1 = (java.lang.String) r1
            r3 = -1
            r6 = 6
            int r7 = r1.hashCode()     // Catch:{ Exception -> 0x01dd }
            switch(r7) {
                case -1888586689: goto L_0x0125;
                case -406040016: goto L_0x011b;
                case -63024214: goto L_0x0111;
                case -5573545: goto L_0x0107;
                case 463403621: goto L_0x00fd;
                case 1365911975: goto L_0x00f3;
                case 1831139720: goto L_0x00e9;
                case 1977429404: goto L_0x00df;
                default: goto L_0x00de;
            }     // Catch:{ Exception -> 0x01dd }
        L_0x00de:
            goto L_0x012e
        L_0x00df:
            java.lang.String r2 = "android.permission.READ_CONTACTS"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x01dd }
            if (r1 == 0) goto L_0x012e
            r2 = 3
            goto L_0x012f
        L_0x00e9:
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x01dd }
            if (r1 == 0) goto L_0x012e
            r2 = 5
            goto L_0x012f
        L_0x00f3:
            java.lang.String r2 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x01dd }
            if (r1 == 0) goto L_0x012e
            r2 = 6
            goto L_0x012f
        L_0x00fd:
            java.lang.String r2 = "android.permission.CAMERA"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x01dd }
            if (r1 == 0) goto L_0x012e
            r2 = 4
            goto L_0x012f
        L_0x0107:
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x01dd }
            if (r1 == 0) goto L_0x012e
            r2 = 0
            goto L_0x012f
        L_0x0111:
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x01dd }
            if (r1 == 0) goto L_0x012e
            r2 = 1
            goto L_0x012f
        L_0x011b:
            java.lang.String r2 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x01dd }
            if (r1 == 0) goto L_0x012e
            r2 = 7
            goto L_0x012f
        L_0x0125:
            java.lang.String r7 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = r1.equals(r7)     // Catch:{ Exception -> 0x01dd }
            if (r1 == 0) goto L_0x012e
            goto L_0x012f
        L_0x012e:
            r2 = -1
        L_0x012f:
            switch(r2) {
                case 0: goto L_0x01c1;
                case 1: goto L_0x01a5;
                case 2: goto L_0x01a5;
                case 3: goto L_0x0189;
                case 4: goto L_0x016d;
                case 5: goto L_0x0151;
                case 6: goto L_0x0135;
                case 7: goto L_0x0135;
                default: goto L_0x0132;
            }
        L_0x0132:
            java.lang.String r0 = ""
            return r0
        L_0x0135:
            r1 = 2131563027(0x7f0d1213, float:1.87515E38)
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x01dd }
            com.tt.miniapphost.AppbrandContext r3 = com.tt.miniapphost.AppbrandContext.getInst()     // Catch:{ Exception -> 0x01dd }
            com.tt.miniapphost.entity.InitParamsEntity r3 = r3.getInitParams()     // Catch:{ Exception -> 0x01dd }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x01dd }
            java.lang.String r3 = r3.getHostStr(r5, r4)     // Catch:{ Exception -> 0x01dd }
            r2[r10] = r3     // Catch:{ Exception -> 0x01dd }
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Exception -> 0x01dd }
            return r0
        L_0x0151:
            r1 = 2131563021(0x7f0d120d, float:1.8751487E38)
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x01dd }
            com.tt.miniapphost.AppbrandContext r3 = com.tt.miniapphost.AppbrandContext.getInst()     // Catch:{ Exception -> 0x01dd }
            com.tt.miniapphost.entity.InitParamsEntity r3 = r3.getInitParams()     // Catch:{ Exception -> 0x01dd }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x01dd }
            java.lang.String r3 = r3.getHostStr(r5, r4)     // Catch:{ Exception -> 0x01dd }
            r2[r10] = r3     // Catch:{ Exception -> 0x01dd }
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Exception -> 0x01dd }
            return r0
        L_0x016d:
            r1 = 2131563015(0x7f0d1207, float:1.8751475E38)
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x01dd }
            com.tt.miniapphost.AppbrandContext r3 = com.tt.miniapphost.AppbrandContext.getInst()     // Catch:{ Exception -> 0x01dd }
            com.tt.miniapphost.entity.InitParamsEntity r3 = r3.getInitParams()     // Catch:{ Exception -> 0x01dd }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x01dd }
            java.lang.String r3 = r3.getHostStr(r5, r4)     // Catch:{ Exception -> 0x01dd }
            r2[r10] = r3     // Catch:{ Exception -> 0x01dd }
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Exception -> 0x01dd }
            return r0
        L_0x0189:
            r1 = 2131563017(0x7f0d1209, float:1.875148E38)
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x01dd }
            com.tt.miniapphost.AppbrandContext r3 = com.tt.miniapphost.AppbrandContext.getInst()     // Catch:{ Exception -> 0x01dd }
            com.tt.miniapphost.entity.InitParamsEntity r3 = r3.getInitParams()     // Catch:{ Exception -> 0x01dd }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x01dd }
            java.lang.String r3 = r3.getHostStr(r5, r4)     // Catch:{ Exception -> 0x01dd }
            r2[r10] = r3     // Catch:{ Exception -> 0x01dd }
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Exception -> 0x01dd }
            return r0
        L_0x01a5:
            r1 = 2131563020(0x7f0d120c, float:1.8751485E38)
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x01dd }
            com.tt.miniapphost.AppbrandContext r3 = com.tt.miniapphost.AppbrandContext.getInst()     // Catch:{ Exception -> 0x01dd }
            com.tt.miniapphost.entity.InitParamsEntity r3 = r3.getInitParams()     // Catch:{ Exception -> 0x01dd }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x01dd }
            java.lang.String r3 = r3.getHostStr(r5, r4)     // Catch:{ Exception -> 0x01dd }
            r2[r10] = r3     // Catch:{ Exception -> 0x01dd }
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Exception -> 0x01dd }
            return r0
        L_0x01c1:
            r1 = 2131563018(0x7f0d120a, float:1.8751481E38)
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x01dd }
            com.tt.miniapphost.AppbrandContext r3 = com.tt.miniapphost.AppbrandContext.getInst()     // Catch:{ Exception -> 0x01dd }
            com.tt.miniapphost.entity.InitParamsEntity r3 = r3.getInitParams()     // Catch:{ Exception -> 0x01dd }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ Exception -> 0x01dd }
            java.lang.String r3 = r3.getHostStr(r5, r4)     // Catch:{ Exception -> 0x01dd }
            r2[r10] = r3     // Catch:{ Exception -> 0x01dd }
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Exception -> 0x01dd }
            return r0
        L_0x01dd:
            r0 = move-exception
            java.lang.String r1 = f55524b
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.tt.miniapphost.AppBrandLogger.stacktrace(r6, r1, r0)
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.b.a.k.a(android.content.Context, java.util.List):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0263, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(@android.support.annotation.Nullable android.app.Activity r24, @android.support.annotation.NonNull java.lang.String[] r25, @android.support.annotation.Nullable com.ss.android.ugc.aweme.miniapp.b.a.n r26) {
        /*
            r23 = this;
            r8 = r23
            r0 = r24
            r9 = r25
            r10 = r26
            monitor-enter(r23)
            r11 = 3
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x0266 }
            r12 = 0
            r1[r12] = r0     // Catch:{ all -> 0x0266 }
            r13 = 1
            r1[r13] = r9     // Catch:{ all -> 0x0266 }
            r14 = 2
            r1[r14] = r10     // Catch:{ all -> 0x0266 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ all -> 0x0266 }
            r4 = 0
            r5 = 59313(0xe7b1, float:8.3115E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x0266 }
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r6[r12] = r2     // Catch:{ all -> 0x0266 }
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r6[r13] = r2     // Catch:{ all -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.miniapp.b.a.n> r2 = com.ss.android.ugc.aweme.miniapp.b.a.n.class
            r6[r14] = r2     // Catch:{ all -> 0x0266 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0266 }
            r2 = r23
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0266 }
            if (r1 == 0) goto L_0x0058
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x0266 }
            r1[r12] = r0     // Catch:{ all -> 0x0266 }
            r1[r13] = r9     // Catch:{ all -> 0x0266 }
            r1[r14] = r10     // Catch:{ all -> 0x0266 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ all -> 0x0266 }
            r4 = 0
            r5 = 59313(0xe7b1, float:8.3115E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x0266 }
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r6[r12] = r0     // Catch:{ all -> 0x0266 }
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r6[r13] = r0     // Catch:{ all -> 0x0266 }
            java.lang.Class<com.ss.android.ugc.aweme.miniapp.b.a.n> r0 = com.ss.android.ugc.aweme.miniapp.b.a.n.class
            r6[r14] = r0     // Catch:{ all -> 0x0266 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0266 }
            r2 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0266 }
            monitor-exit(r23)
            return
        L_0x0058:
            if (r0 != 0) goto L_0x005c
            monitor-exit(r23)
            return
        L_0x005c:
            r8.a((java.lang.String[]) r9, (com.ss.android.ugc.aweme.miniapp.b.a.n) r10)     // Catch:{ Throwable -> 0x0264 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0264 }
            r15 = 23
            if (r1 >= r15) goto L_0x00e4
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x0264 }
            r1[r12] = r0     // Catch:{ Throwable -> 0x0264 }
            r1[r13] = r9     // Catch:{ Throwable -> 0x0264 }
            r1[r14] = r10     // Catch:{ Throwable -> 0x0264 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ Throwable -> 0x0264 }
            r4 = 0
            r5 = 59320(0xe7b8, float:8.3125E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r6[r12] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r6[r13] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<com.ss.android.ugc.aweme.miniapp.b.a.n> r2 = com.ss.android.ugc.aweme.miniapp.b.a.n.class
            r6[r14] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0264 }
            r2 = r23
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x0264 }
            if (r1 == 0) goto L_0x00b0
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x0264 }
            r1[r12] = r0     // Catch:{ Throwable -> 0x0264 }
            r1[r13] = r9     // Catch:{ Throwable -> 0x0264 }
            r1[r14] = r10     // Catch:{ Throwable -> 0x0264 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ Throwable -> 0x0264 }
            r4 = 0
            r5 = 59320(0xe7b8, float:8.3125E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r6[r12] = r0     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r6[r13] = r0     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<com.ss.android.ugc.aweme.miniapp.b.a.n> r0 = com.ss.android.ugc.aweme.miniapp.b.a.n.class
            r6[r14] = r0     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0264 }
            r2 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x0264 }
            goto L_0x0262
        L_0x00b0:
            int r1 = r9.length     // Catch:{ Throwable -> 0x0264 }
        L_0x00b1:
            if (r12 >= r1) goto L_0x00df
            r2 = r9[r12]     // Catch:{ Throwable -> 0x0264 }
            if (r10 == 0) goto L_0x00dc
            java.util.Set<java.lang.String> r3 = r8.f55527e     // Catch:{ Throwable -> 0x00dc }
            boolean r3 = r3.contains(r2)     // Catch:{ Throwable -> 0x00dc }
            if (r3 != 0) goto L_0x00c6
            com.ss.android.ugc.aweme.miniapp.b.a.j r3 = com.ss.android.ugc.aweme.miniapp.b.a.j.NOT_FOUND     // Catch:{ Throwable -> 0x00dc }
            boolean r2 = r10.a((java.lang.String) r2, (com.ss.android.ugc.aweme.miniapp.b.a.j) r3)     // Catch:{ Throwable -> 0x00dc }
            goto L_0x00d9
        L_0x00c6:
            int r3 = com.ss.android.ugc.aweme.miniapp.b.a.i.a(r0, r2)     // Catch:{ Throwable -> 0x00dc }
            if (r3 == 0) goto L_0x00d3
            com.ss.android.ugc.aweme.miniapp.b.a.j r3 = com.ss.android.ugc.aweme.miniapp.b.a.j.DENIED     // Catch:{ Throwable -> 0x00dc }
            boolean r2 = r10.a((java.lang.String) r2, (com.ss.android.ugc.aweme.miniapp.b.a.j) r3)     // Catch:{ Throwable -> 0x00dc }
            goto L_0x00d9
        L_0x00d3:
            com.ss.android.ugc.aweme.miniapp.b.a.j r3 = com.ss.android.ugc.aweme.miniapp.b.a.j.GRANTED     // Catch:{ Throwable -> 0x00dc }
            boolean r2 = r10.a((java.lang.String) r2, (com.ss.android.ugc.aweme.miniapp.b.a.j) r3)     // Catch:{ Throwable -> 0x00dc }
        L_0x00d9:
            if (r2 == 0) goto L_0x00dc
            goto L_0x00df
        L_0x00dc:
            int r12 = r12 + 1
            goto L_0x00b1
        L_0x00df:
            r8.a(r10)     // Catch:{ Throwable -> 0x0264 }
            goto L_0x0264
        L_0x00e4:
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x0264 }
            r1[r12] = r0     // Catch:{ Throwable -> 0x0264 }
            r1[r13] = r9     // Catch:{ Throwable -> 0x0264 }
            r1[r14] = r10     // Catch:{ Throwable -> 0x0264 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ Throwable -> 0x0264 }
            r4 = 0
            r5 = 59321(0xe7b9, float:8.3126E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r6[r12] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r6[r13] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<com.ss.android.ugc.aweme.miniapp.b.a.n> r2 = com.ss.android.ugc.aweme.miniapp.b.a.n.class
            r6[r14] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r2 = r23
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x0264 }
            if (r1 == 0) goto L_0x0131
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x0264 }
            r1[r12] = r0     // Catch:{ Throwable -> 0x0264 }
            r1[r13] = r9     // Catch:{ Throwable -> 0x0264 }
            r1[r14] = r10     // Catch:{ Throwable -> 0x0264 }
            com.meituan.robust.ChangeQuickRedirect r3 = f55523a     // Catch:{ Throwable -> 0x0264 }
            r4 = 0
            r5 = 59321(0xe7b9, float:8.3126E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r6[r12] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r6[r13] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<com.ss.android.ugc.aweme.miniapp.b.a.n> r2 = com.ss.android.ugc.aweme.miniapp.b.a.n.class
            r6[r14] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r2 = r23
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x0264 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Throwable -> 0x0264 }
            goto L_0x0177
        L_0x0131:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0264 }
            int r2 = r9.length     // Catch:{ Throwable -> 0x0264 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0264 }
            int r2 = r9.length     // Catch:{ Throwable -> 0x0264 }
            r3 = 0
            r4 = 0
        L_0x013a:
            if (r3 >= r2) goto L_0x016c
            r5 = r9[r3]     // Catch:{ Throwable -> 0x0264 }
            java.util.Set<java.lang.String> r6 = r8.f55527e     // Catch:{ Throwable -> 0x0264 }
            boolean r6 = r6.contains(r5)     // Catch:{ Throwable -> 0x0264 }
            if (r6 != 0) goto L_0x014e
            if (r10 == 0) goto L_0x0169
            com.ss.android.ugc.aweme.miniapp.b.a.j r6 = com.ss.android.ugc.aweme.miniapp.b.a.j.NOT_FOUND     // Catch:{ Throwable -> 0x0264 }
            r10.a((java.lang.String) r5, (com.ss.android.ugc.aweme.miniapp.b.a.j) r6)     // Catch:{ Throwable -> 0x0264 }
            goto L_0x0169
        L_0x014e:
            boolean r6 = r8.a((android.content.Context) r0, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0264 }
            if (r6 != 0) goto L_0x0162
            java.util.Set<java.lang.String> r6 = r8.f55526d     // Catch:{ Throwable -> 0x0264 }
            boolean r6 = r6.contains(r5)     // Catch:{ Throwable -> 0x0264 }
            if (r6 != 0) goto L_0x0160
            r1.add(r5)     // Catch:{ Throwable -> 0x0264 }
            goto L_0x0169
        L_0x0160:
            r4 = 1
            goto L_0x0169
        L_0x0162:
            if (r10 == 0) goto L_0x0169
            com.ss.android.ugc.aweme.miniapp.b.a.j r6 = com.ss.android.ugc.aweme.miniapp.b.a.j.GRANTED     // Catch:{ Throwable -> 0x0264 }
            r10.a((java.lang.String) r5, (com.ss.android.ugc.aweme.miniapp.b.a.j) r6)     // Catch:{ Throwable -> 0x0264 }
        L_0x0169:
            int r3 = r3 + 1
            goto L_0x013a
        L_0x016c:
            boolean r2 = r1.isEmpty()     // Catch:{ Throwable -> 0x0264 }
            if (r2 == 0) goto L_0x0177
            if (r4 != 0) goto L_0x0177
            r8.a(r10)     // Catch:{ Throwable -> 0x0264 }
        L_0x0177:
            boolean r2 = r1.isEmpty()     // Catch:{ Throwable -> 0x0264 }
            if (r2 != 0) goto L_0x0262
            int r2 = r1.size()     // Catch:{ Throwable -> 0x0264 }
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Throwable -> 0x0264 }
            java.lang.Object[] r2 = r1.toArray(r2)     // Catch:{ Throwable -> 0x0264 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ Throwable -> 0x0264 }
            java.util.Set<java.lang.String> r3 = r8.f55526d     // Catch:{ Throwable -> 0x0264 }
            r3.addAll(r1)     // Catch:{ Throwable -> 0x0264 }
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x0264 }
            r1[r12] = r0     // Catch:{ Throwable -> 0x0264 }
            r1[r13] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x0264 }
            r1[r14] = r3     // Catch:{ Throwable -> 0x0264 }
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.miniapp.b.a.i.f55518a     // Catch:{ Throwable -> 0x0264 }
            r19 = 1
            r20 = 59299(0xe7a3, float:8.3096E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r3[r12] = r4     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r3[r13] = r4     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0264 }
            r3[r14] = r4     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class r22 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0264 }
            r16 = r1
            r21 = r3
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Throwable -> 0x0264 }
            if (r1 == 0) goto L_0x01eb
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x0264 }
            r1[r12] = r0     // Catch:{ Throwable -> 0x0264 }
            r1[r13] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x0264 }
            r1[r14] = r0     // Catch:{ Throwable -> 0x0264 }
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.miniapp.b.a.i.f55518a     // Catch:{ Throwable -> 0x0264 }
            r19 = 1
            r20 = 59299(0xe7a3, float:8.3096E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r0[r12] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r0[r13] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0264 }
            r0[r14] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class r22 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0264 }
            r16 = r1
            r21 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Throwable -> 0x0264 }
            goto L_0x0264
        L_0x01eb:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0264 }
            if (r1 < r15) goto L_0x024d
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x0264 }
            r1[r12] = r0     // Catch:{ Throwable -> 0x0264 }
            r1[r13] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x0264 }
            r1[r14] = r3     // Catch:{ Throwable -> 0x0264 }
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.miniapp.b.a.a.f55491a     // Catch:{ Throwable -> 0x0264 }
            r19 = 1
            r20 = 59263(0xe77f, float:8.3045E-41)
            java.lang.Class[] r3 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            r3[r12] = r4     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r3[r13] = r4     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0264 }
            r3[r14] = r4     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class r22 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0264 }
            r16 = r1
            r21 = r3
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Throwable -> 0x0264 }
            if (r1 == 0) goto L_0x0249
            java.lang.Object[] r15 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x0264 }
            r15[r12] = r0     // Catch:{ Throwable -> 0x0264 }
            r15[r13] = r2     // Catch:{ Throwable -> 0x0264 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x0264 }
            r15[r14] = r0     // Catch:{ Throwable -> 0x0264 }
            r16 = 0
            com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.ugc.aweme.miniapp.b.a.a.f55491a     // Catch:{ Throwable -> 0x0264 }
            r18 = 1
            r19 = 59263(0xe77f, float:8.3045E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r12] = r1     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r13] = r1     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0264 }
            r0[r14] = r1     // Catch:{ Throwable -> 0x0264 }
            java.lang.Class r21 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0264 }
            r20 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x0264 }
            goto L_0x0262
        L_0x0249:
            r0.requestPermissions(r2, r13)     // Catch:{ Throwable -> 0x0264 }
            goto L_0x0264
        L_0x024d:
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.miniapp.b.a.i.a     // Catch:{ Throwable -> 0x0264 }
            if (r1 == 0) goto L_0x0262
            android.os.Handler r1 = new android.os.Handler     // Catch:{ Throwable -> 0x0264 }
            android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch:{ Throwable -> 0x0264 }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x0264 }
            com.ss.android.ugc.aweme.miniapp.b.a.i$1 r3 = new com.ss.android.ugc.aweme.miniapp.b.a.i$1     // Catch:{ Throwable -> 0x0264 }
            r3.<init>(r2, r0, r13)     // Catch:{ Throwable -> 0x0264 }
            r1.post(r3)     // Catch:{ Throwable -> 0x0264 }
        L_0x0262:
            monitor-exit(r23)
            return
        L_0x0264:
            monitor-exit(r23)
            return
        L_0x0266:
            r0 = move-exception
            monitor-exit(r23)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.b.a.k.a(android.app.Activity, java.lang.String[], com.ss.android.ugc.aweme.miniapp.b.a.n):void");
    }
}
