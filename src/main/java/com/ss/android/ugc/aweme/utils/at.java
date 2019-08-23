package com.ss.android.ugc.aweme.utils;

import a.g;
import a.i;
import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Callable;

public final class at {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75535a;

    /* renamed from: b  reason: collision with root package name */
    public static a f75536b;

    /* renamed from: c  reason: collision with root package name */
    public static Integer f75537c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f75541a;

        /* renamed from: b  reason: collision with root package name */
        public double f75542b;
    }

    public static Integer a() {
        return f75537c;
    }

    public static a b() {
        RandomAccessFile randomAccessFile;
        double d2;
        RandomAccessFile randomAccessFile2;
        if (PatchProxy.isSupport(new Object[0], null, f75535a, true, 88133, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f75535a, true, 88133, new Class[0], a.class);
        }
        a aVar = new a();
        RandomAccessFile randomAccessFile3 = null;
        try {
            String valueOf = String.valueOf(Process.myPid());
            randomAccessFile = new RandomAccessFile("/proc/stat", "r");
            try {
                String[] split = randomAccessFile.readLine().split(" ");
                d2 = 0.0d;
                int length = split.length;
                for (int i = 2; i < length; i++) {
                    d2 += Double.parseDouble(split[i]);
                }
                randomAccessFile2 = new RandomAccessFile("/proc/" + valueOf + "/stat", "r");
            } catch (Throwable th) {
                th = th;
                a((Closeable) randomAccessFile);
                a((Closeable) randomAccessFile3);
                throw th;
            }
            try {
                String[] split2 = randomAccessFile2.readLine().split(" ");
                aVar.f75541a = Double.parseDouble(split2[13]) + Double.parseDouble(split2[14]) + Double.parseDouble(split2[15]) + Double.parseDouble(split2[16]);
                aVar.f75542b = d2;
                a((Closeable) randomAccessFile);
                a((Closeable) randomAccessFile2);
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile3 = randomAccessFile2;
                a((Closeable) randomAccessFile);
                a((Closeable) randomAccessFile3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = null;
            a((Closeable) randomAccessFile);
            a((Closeable) randomAccessFile3);
            throw th;
        }
        return aVar;
    }

    private static void a(Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, null, f75535a, true, 88134, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable}, null, f75535a, true, 88134, new Class[]{Closeable.class}, Void.TYPE);
            return;
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, f75535a, true, 88132, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, f75535a, true, 88132, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        final boolean z2 = z;
        i.a((Callable<TResult>) new Callable<a>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75540a;

            public final /* synthetic */ Object call() throws Exception {
                if (!PatchProxy.isSupport(new Object[0], this, f75540a, false, 88136, new Class[0], a.class)) {
                    return at.b();
                }
                return (a) PatchProxy.accessDispatch(new Object[0], this, f75540a, false, 88136, new Class[0], a.class);
            }
        }).a((g<TResult, TContinuationResult>) new g<a, Void>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f75538a;

            public final /* synthetic */ Object then(i iVar) throws Exception {
                if (PatchProxy.isSupport(new Object[]{iVar}, this, f75538a, false, 88135, new Class[]{i.class}, Void.class)) {
                    return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f75538a, false, 88135, new Class[]{i.class}, Void.class);
                }
                if (iVar.e() != null) {
                    if (!(!z2 || at.f75536b == null || ((a) iVar.e()).f75542b == at.f75536b.f75542b)) {
                        at.f75537c = Integer.valueOf((int) (((((a) iVar.e()).f75541a - at.f75536b.f75541a) * 100.0d) / (((a) iVar.e()).f75542b - at.f75536b.f75542b)));
                    }
                    at.f75536b = (a) iVar.e();
                }
                return null;
            }
        }, i.f1052b);
    }
}
