package com.ss.android.ugc.aweme.commercialize.utils;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0007J\u001c\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0007J\u001c\u0010\u0018\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\u001c\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b*\u00020\f8FX\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/ChallengeProperty;", "", "()V", "cacheSize", "", "list", "Ljava/util/LinkedList;", "", "lock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "isCommerceChallenge", "", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "isCommerceChallenge$annotations", "(Lcom/ss/android/ugc/aweme/discover/model/Challenge;)V", "(Lcom/ss/android/ugc/aweme/discover/model/Challenge;)Z", "isCommerce", "ch", "idOrName", "markCommerce", "", "challenge", "struct", "Lcom/ss/android/ugc/aweme/model/TextExtraStruct;", "markCommerceByUrl", "uri", "Landroid/net/Uri;", "url", "markCommerceLocked", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39820a;

    /* renamed from: b  reason: collision with root package name */
    public static final r f39821b = new r();

    /* renamed from: c  reason: collision with root package name */
    private static final ReentrantReadWriteLock f39822c = new ReentrantReadWriteLock();

    /* renamed from: d  reason: collision with root package name */
    private static final LinkedList<String> f39823d = new LinkedList<>();

    private r() {
    }

    @JvmStatic
    public static final void a(@Nullable TextExtraStruct textExtraStruct) {
        if (PatchProxy.isSupport(new Object[]{textExtraStruct}, null, f39820a, true, 32424, new Class[]{TextExtraStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textExtraStruct}, null, f39820a, true, 32424, new Class[]{TextExtraStruct.class}, Void.TYPE);
            return;
        }
        if (textExtraStruct != null && textExtraStruct.isCommerce()) {
            a(textExtraStruct.getCid());
            a(textExtraStruct.getHashTagName());
        }
    }

    @JvmStatic
    public static final boolean b(@Nullable Challenge challenge) {
        if (PatchProxy.isSupport(new Object[]{challenge}, null, f39820a, true, 32429, new Class[]{Challenge.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{challenge}, null, f39820a, true, 32429, new Class[]{Challenge.class}, Boolean.TYPE)).booleanValue();
        } else if (challenge == null || !c(challenge)) {
            return false;
        } else {
            return true;
        }
    }

    private final void c(String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f39820a, false, 32430, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f39820a, false, 32430, new Class[]{String.class}, Void.TYPE);
            return;
        }
        CharSequence charSequence = str2;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (!z) {
            f39823d.remove(str2);
            f39823d.add(str2);
            while (f39823d.size() > 100) {
                f39823d.removeFirst();
            }
        }
    }

    @JvmStatic
    public static final boolean b(@Nullable String str) {
        String str2 = str;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f39820a, true, 32428, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f39820a, true, 32428, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        CharSequence charSequence = str2;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (z) {
            return false;
        }
        ReentrantReadWriteLock.ReadLock readLock = f39822c.readLock();
        readLock.lock();
        try {
            return f39823d.contains(str2);
        } finally {
            readLock.unlock();
        }
    }

    public static final boolean c(@NotNull Challenge challenge) {
        boolean z;
        Challenge challenge2 = challenge;
        if (PatchProxy.isSupport(new Object[]{challenge2}, null, f39820a, true, 32431, new Class[]{Challenge.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{challenge2}, null, f39820a, true, 32431, new Class[]{Challenge.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(challenge2, "$this$isCommerceChallenge");
        if (challenge.isCommerce() || challenge.isCommerceAndValid()) {
            return true;
        }
        CharSequence schema = challenge.getSchema();
        if (schema == null || schema.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String queryParameter = Uri.parse(challenge.getSchema()).getQueryParameter("is_commerce");
            if (Intrinsics.areEqual((Object) queryParameter, (Object) PushConstants.PUSH_TYPE_THROUGH_MESSAGE) || StringsKt.equals("true", queryParameter, true)) {
                return true;
            }
        }
        return false;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @kotlin.jvm.JvmStatic
    public static final void a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.discover.model.Challenge r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f39820a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.Challenge> r3 = com.ss.android.ugc.aweme.discover.model.Challenge.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 32425(0x7ea9, float:4.5437E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0030
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f39820a
            r13 = 1
            r14 = 32425(0x7ea9, float:4.5437E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.Challenge> r0 = com.ss.android.ugc.aweme.discover.model.Challenge.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0030:
            if (r17 == 0) goto L_0x0086
            boolean r2 = c((com.ss.android.ugc.aweme.discover.model.Challenge) r17)
            if (r2 == r1) goto L_0x0039
            return
        L_0x0039:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f39822c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            int r3 = r1.getWriteHoldCount()
            if (r3 != 0) goto L_0x004a
            int r3 = r1.getReadHoldCount()
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            r4 = 0
        L_0x004c:
            if (r4 >= r3) goto L_0x0054
            r2.unlock()
            int r4 = r4 + 1
            goto L_0x004c
        L_0x0054:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            com.ss.android.ugc.aweme.commercialize.utils.r r4 = f39821b     // Catch:{ all -> 0x0079 }
            java.lang.String r5 = r17.getCid()     // Catch:{ all -> 0x0079 }
            r4.c((java.lang.String) r5)     // Catch:{ all -> 0x0079 }
            com.ss.android.ugc.aweme.commercialize.utils.r r4 = f39821b     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = r17.getChallengeName()     // Catch:{ all -> 0x0079 }
            r4.c((java.lang.String) r0)     // Catch:{ all -> 0x0079 }
        L_0x006d:
            if (r9 >= r3) goto L_0x0075
            r2.lock()
            int r9 = r9 + 1
            goto L_0x006d
        L_0x0075:
            r1.unlock()
            return
        L_0x0079:
            r0 = move-exception
        L_0x007a:
            if (r9 >= r3) goto L_0x0082
            r2.lock()
            int r9 = r9 + 1
            goto L_0x007a
        L_0x0082:
            r1.unlock()
            throw r0
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.r.a(com.ss.android.ugc.aweme.discover.model.Challenge):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @kotlin.jvm.JvmStatic
    public static final void a(@org.jetbrains.annotations.Nullable java.lang.String r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f39820a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 32423(0x7ea7, float:4.5434E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f39820a
            r13 = 1
            r14 = 32423(0x7ea7, float:4.5434E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x003f
            int r2 = r2.length()
            if (r2 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            if (r1 == 0) goto L_0x0042
            return
        L_0x0042:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = f39822c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r1.readLock()
            int r3 = r1.getWriteHoldCount()
            if (r3 != 0) goto L_0x0053
            int r3 = r1.getReadHoldCount()
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            r4 = 0
        L_0x0055:
            if (r4 >= r3) goto L_0x005d
            r2.unlock()
            int r4 = r4 + 1
            goto L_0x0055
        L_0x005d:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            com.ss.android.ugc.aweme.commercialize.utils.r r4 = f39821b     // Catch:{ all -> 0x0075 }
            r4.c((java.lang.String) r0)     // Catch:{ all -> 0x0075 }
        L_0x0069:
            if (r9 >= r3) goto L_0x0071
            r2.lock()
            int r9 = r9 + 1
            goto L_0x0069
        L_0x0071:
            r1.unlock()
            return
        L_0x0075:
            r0 = move-exception
        L_0x0076:
            if (r9 >= r3) goto L_0x007e
            r2.lock()
            int r9 = r9 + 1
            goto L_0x0076
        L_0x007e:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.r.a(java.lang.String):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @kotlin.jvm.JvmStatic
    public static final void a(@org.jetbrains.annotations.Nullable android.net.Uri r19, @org.jetbrains.annotations.Nullable java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f39820a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.net.Uri> r4 = android.net.Uri.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r4 = 0
            r6 = 1
            r7 = 32426(0x7eaa, float:4.5439E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0043
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f39820a
            r15 = 1
            r16 = 32426(0x7eaa, float:4.5439E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.net.Uri> r1 = android.net.Uri.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0043:
            if (r0 == 0) goto L_0x00af
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x0053
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r2 = 0
            goto L_0x0054
        L_0x0053:
            r2 = 1
        L_0x0054:
            if (r2 == 0) goto L_0x0057
            goto L_0x00af
        L_0x0057:
            java.lang.String r2 = "is_commerce"
            java.lang.String r0 = r0.getQueryParameter(r2)
            java.lang.String r2 = "1"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r2 != 0) goto L_0x006f
            java.lang.String r2 = "true"
            boolean r0 = kotlin.text.StringsKt.equals(r2, r0, r11)
            if (r0 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            return
        L_0x006f:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f39822c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            int r3 = r0.getWriteHoldCount()
            if (r3 != 0) goto L_0x0080
            int r3 = r0.getReadHoldCount()
            goto L_0x0081
        L_0x0080:
            r3 = 0
        L_0x0081:
            r4 = 0
        L_0x0082:
            if (r4 >= r3) goto L_0x008a
            r2.unlock()
            int r4 = r4 + 1
            goto L_0x0082
        L_0x008a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r0.writeLock()
            r4.lock()
            com.ss.android.ugc.aweme.commercialize.utils.r r0 = f39821b     // Catch:{ all -> 0x00a2 }
            r0.c((java.lang.String) r1)     // Catch:{ all -> 0x00a2 }
        L_0x0096:
            if (r10 >= r3) goto L_0x009e
            r2.lock()
            int r10 = r10 + 1
            goto L_0x0096
        L_0x009e:
            r4.unlock()
            return
        L_0x00a2:
            r0 = move-exception
        L_0x00a3:
            if (r10 >= r3) goto L_0x00ab
            r2.lock()
            int r10 = r10 + 1
            goto L_0x00a3
        L_0x00ab:
            r4.unlock()
            throw r0
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.r.a(android.net.Uri, java.lang.String):void");
    }
}
