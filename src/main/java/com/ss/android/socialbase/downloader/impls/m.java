package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.depend.aa;
import com.ss.android.socialbase.downloader.depend.g;
import com.ss.android.socialbase.downloader.depend.t;
import com.ss.android.socialbase.downloader.depend.w;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.h;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.e.e;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.a;
import com.ss.android.socialbase.downloader.model.b;
import java.util.List;

public class m extends h.a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f31032a = "m";

    /* renamed from: b  reason: collision with root package name */
    private final l f31033b = new p(true);

    public final void a(a aVar) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.b(e.a(aVar));
        }
    }

    public final void a(List<String> list) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a(list);
        }
    }

    public final void a(int i, g gVar, int i2, boolean z) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.b(i, e.a(gVar), d.c(i2), z);
        }
    }

    public final boolean a(DownloadInfo downloadInfo) throws RemoteException {
        if (this.f31033b == null) {
            return false;
        }
        return this.f31033b.a(downloadInfo);
    }

    public final void a(int i, Notification notification) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a(i, notification);
        }
    }

    public final void a(boolean z) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a(true, z);
        }
    }

    public final void a(b bVar) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a(bVar);
        }
    }

    public final void a(int i, List<b> list) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.b(i, list);
        }
    }

    public final void a(z zVar) throws RemoteException {
        e.AnonymousClass16 r3;
        if (this.f31033b != null) {
            l lVar = this.f31033b;
            if (zVar == null) {
                r3 = null;
            } else {
                r3 = new aa(zVar) {

                    /* renamed from: a */
                    final /* synthetic */ z f30970a;

                    public final void a(
/*
Method generation error in method: com.ss.android.socialbase.downloader.e.e.16.a(int):void, dex: classes4.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.socialbase.downloader.e.e.16.a(int):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
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
                };
            }
            lVar.a((aa) r3);
        }
    }

    public final void a(int i, t tVar) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a(i, e.a(tVar));
        }
    }

    public final boolean c() throws RemoteException {
        if (this.f31033b == null) {
            return false;
        }
        return this.f31033b.d();
    }

    public final void d() throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.e();
        }
    }

    public final void a() throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a();
        }
    }

    public final boolean b() throws RemoteException {
        if (this.f31033b == null) {
            return false;
        }
        return this.f31033b.b();
    }

    public final List<DownloadInfo> c(String str) throws RemoteException {
        if (this.f31033b == null) {
            return null;
        }
        return this.f31033b.d(str);
    }

    public final List<DownloadInfo> d(String str) throws RemoteException {
        if (this.f31033b == null) {
            return null;
        }
        return this.f31033b.c(str);
    }

    public final void e(int i) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.e(i);
        }
    }

    public final long f(int i) throws RemoteException {
        if (this.f31033b == null) {
            return 0;
        }
        return this.f31033b.f(i);
    }

    public final int g(int i) throws RemoteException {
        if (this.f31033b == null) {
            return 0;
        }
        return this.f31033b.g(i);
    }

    public final boolean h(int i) throws RemoteException {
        if (this.f31033b == null) {
            return false;
        }
        return this.f31033b.h(i);
    }

    public final DownloadInfo i(int i) throws RemoteException {
        if (this.f31033b == null) {
            return null;
        }
        return this.f31033b.i(i);
    }

    public final List<b> j(int i) throws RemoteException {
        if (this.f31033b == null) {
            return null;
        }
        return this.f31033b.j(i);
    }

    public final void k(int i) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.k(i);
        }
    }

    public final void l(int i) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.l(i);
        }
    }

    public final boolean m(int i) throws RemoteException {
        if (this.f31033b == null) {
            return false;
        }
        return this.f31033b.n(i);
    }

    public final void n(int i) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.m(i);
        }
    }

    public final int o(int i) throws RemoteException {
        return c.a().b(i);
    }

    public final boolean p(int i) throws RemoteException {
        if (this.f31033b == null) {
            return false;
        }
        return this.f31033b.p(i);
    }

    public final void q(int i) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.q(i);
        }
    }

    public final boolean r(int i) throws RemoteException {
        if (this.f31033b == null) {
            return false;
        }
        return this.f31033b.r(i);
    }

    public final List<DownloadInfo> a(String str) throws RemoteException {
        if (this.f31033b == null) {
            return null;
        }
        return this.f31033b.a(str);
    }

    public final List<DownloadInfo> b(String str) throws RemoteException {
        if (this.f31033b == null) {
            return null;
        }
        return this.f31033b.b(str);
    }

    public final t s(int i) throws RemoteException {
        if (this.f31033b == null) {
            return null;
        }
        return e.a(this.f31033b.s(i));
    }

    public final w t(int i) throws RemoteException {
        if (this.f31033b == null) {
            return null;
        }
        return e.a(this.f31033b.t(i));
    }

    public final com.ss.android.socialbase.downloader.depend.e u(int i) throws RemoteException {
        if (this.f31033b == null) {
            return null;
        }
        return e.a(this.f31033b.u(i));
    }

    public final void b(int i) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.b(i);
        }
    }

    public final boolean c(int i) throws RemoteException {
        if (this.f31033b == null) {
            return false;
        }
        return this.f31033b.c(i);
    }

    public final void d(int i) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.d(i);
        }
    }

    public final void a(int i) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a(i);
        }
    }

    public final boolean b(DownloadInfo downloadInfo) throws RemoteException {
        if (this.f31033b == null) {
            return false;
        }
        return this.f31033b.c(downloadInfo);
    }

    public final void a(int i, boolean z) throws RemoteException {
        c.a().b(i, z);
    }

    public final int a(String str, String str2) throws RemoteException {
        if (this.f31033b == null) {
            return 0;
        }
        return this.f31033b.a(str, str2);
    }

    public final DownloadInfo b(String str, String str2) throws RemoteException {
        if (this.f31033b == null) {
            return null;
        }
        return this.f31033b.b(str, str2);
    }

    public final void a(int i, int i2) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a(i, i2);
        }
    }

    public final void b(int i, List<b> list) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a(i, list);
        }
    }

    public final void a(int i, int i2, long j) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a(i, i2, j);
        }
    }

    public final void b(int i, g gVar, int i2, boolean z) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a(i, e.a(gVar), d.c(i2), z);
        }
    }

    public final void a(int i, int i2, int i3, int i4) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a(i, i2, i3, i4);
        }
    }

    public final void a(int i, int i2, int i3, long j) throws RemoteException {
        if (this.f31033b != null) {
            this.f31033b.a(i, i2, i3, j);
        }
    }
}
