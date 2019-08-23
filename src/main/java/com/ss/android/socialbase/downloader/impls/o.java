package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import android.os.IBinder;
import android.os.RemoteException;
import com.ss.android.socialbase.downloader.constants.g;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.aa;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.depend.z;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.h;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.downloader.m;
import com.ss.android.socialbase.downloader.downloader.n;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.e.e;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

public class o implements l, m {

    /* renamed from: a  reason: collision with root package name */
    private static final String f31038a = "o";

    /* renamed from: b  reason: collision with root package name */
    private volatile h f31039b;

    /* renamed from: c  reason: collision with root package name */
    private n<IndependentProcessDownloadService> f31040c = b.k();

    /* renamed from: d  reason: collision with root package name */
    private l f31041d = new p();

    public final void b(DownloadInfo downloadInfo) {
    }

    public final void g() {
        this.f31039b = null;
    }

    public final void a(List<String> list) {
        if (this.f31039b == null) {
            this.f31041d.a(list);
            return;
        }
        try {
            this.f31039b.a(list);
        } catch (RemoteException unused) {
        }
    }

    public final void a(int i, IDownloadListener iDownloadListener, g gVar, boolean z) {
        if (this.f31039b != null) {
            try {
                this.f31039b.b(i, e.a(iDownloadListener, gVar != g.SUB), gVar.ordinal(), z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final boolean a(DownloadInfo downloadInfo) {
        if (this.f31039b == null) {
            return this.f31041d.a(downloadInfo);
        }
        try {
            this.f31039b.a(downloadInfo);
        } catch (RemoteException unused) {
        }
        return false;
    }

    public final void a(boolean z, boolean z2) {
        if (this.f31039b == null) {
            this.f31041d.a(z, z2);
            return;
        }
        try {
            this.f31039b.a(z2);
        } catch (RemoteException unused) {
        }
    }

    public final void a(DownloadTask downloadTask) {
        if (!(downloadTask == null || this.f31040c == null)) {
            this.f31040c.b(downloadTask);
        }
    }

    public final void a(int i, List<com.ss.android.socialbase.downloader.model.b> list) {
        if (this.f31039b != null) {
            try {
                this.f31039b.b(i, list);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(int i, boolean z) {
        if (this.f31039b != null) {
            try {
                this.f31039b.a(i, z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(com.ss.android.socialbase.downloader.model.b bVar) {
        if (this.f31039b == null) {
            this.f31041d.a(bVar);
            return;
        }
        try {
            this.f31039b.a(bVar);
        } catch (RemoteException unused) {
        }
    }

    public final void a(aa aaVar) {
        e.AnonymousClass15 r3;
        if (this.f31039b != null) {
            try {
                h hVar = this.f31039b;
                if (aaVar == null) {
                    r3 = null;
                } else {
                    r3 = new z.a(aaVar) {

                        /* renamed from: a */
                        final /* synthetic */ aa f30969a;

                        public final void a(
/*
Method generation error in method: com.ss.android.socialbase.downloader.e.e.15.a(int):void, dex: classes4.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.socialbase.downloader.e.e.15.a(int):void, class status: UNLOADED
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
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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
                    };
                }
                hVar.a((z) r3);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(int i, u uVar) {
        if (this.f31039b != null) {
            try {
                this.f31039b.a(i, e.a(uVar));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(IBinder iBinder) {
        this.f31039b = h.a.a(iBinder);
        if (d.a()) {
            a((aa) new aa() {
                public final void a(int i) {
                    Downloader.getInstance(b.q()).pause(i);
                    List<com.ss.android.socialbase.downloader.model.b> j = l.a(false).j(i);
                    if (j != null) {
                        l.a(true).a(i, d.a(j));
                    }
                }
            });
        }
    }

    public final boolean b() {
        return b.r();
    }

    public final boolean f() {
        if (this.f31039b != null) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (this.f31039b != null) {
            try {
                this.f31039b.a();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void c() {
        if (this.f31040c != null) {
            this.f31040c.e();
        }
    }

    public o() {
        this.f31040c.a((m) this);
    }

    public final void e() {
        if (this.f31039b == null) {
            this.f31041d.e();
            return;
        }
        try {
            this.f31039b.d();
        } catch (RemoteException unused) {
        }
    }

    public final boolean d() {
        if (this.f31039b == null) {
            return this.f31041d.d();
        }
        try {
            return this.f31039b.c();
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final List<DownloadInfo> d(String str) {
        if (this.f31039b != null) {
            try {
                return this.f31039b.c(str);
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final void e(int i) {
        if (this.f31039b != null) {
            try {
                this.f31039b.e(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final long f(int i) {
        if (this.f31039b == null) {
            return 0;
        }
        try {
            return this.f31039b.f(i);
        } catch (RemoteException unused) {
            return 0;
        }
    }

    public final int g(int i) {
        if (this.f31039b == null) {
            return 0;
        }
        try {
            return this.f31039b.g(i);
        } catch (RemoteException unused) {
            return 0;
        }
    }

    public final boolean h(int i) {
        if (this.f31039b == null) {
            return false;
        }
        try {
            return this.f31039b.h(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final void m(int i) {
        if (this.f31040c != null) {
            this.f31040c.a(i);
        }
    }

    public final boolean n(int i) {
        if (this.f31039b == null) {
            return false;
        }
        try {
            return this.f31039b.m(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final List<DownloadInfo> a(String str) {
        if (this.f31039b == null) {
            return this.f31041d.a(str);
        }
        try {
            return this.f31039b.a(str);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final List<DownloadInfo> b(String str) {
        if (this.f31039b == null) {
            return this.f31041d.b(str);
        }
        try {
            return this.f31039b.b(str);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final List<DownloadInfo> c(String str) {
        if (this.f31039b == null) {
            return this.f31041d.c(str);
        }
        try {
            return this.f31039b.d(str);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void d(int i) {
        if (this.f31039b != null) {
            try {
                this.f31039b.d(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final DownloadInfo i(int i) {
        if (this.f31039b == null) {
            return this.f31041d.i(i);
        }
        try {
            return this.f31039b.i(i);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final List<com.ss.android.socialbase.downloader.model.b> j(int i) {
        if (this.f31039b == null) {
            return this.f31041d.j(i);
        }
        try {
            return this.f31039b.j(i);
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void k(int i) {
        if (this.f31039b == null) {
            this.f31041d.k(i);
            return;
        }
        try {
            this.f31039b.k(i);
        } catch (RemoteException unused) {
        }
    }

    public final void l(int i) {
        if (this.f31039b == null) {
            this.f31041d.l(i);
            return;
        }
        try {
            this.f31039b.l(i);
        } catch (RemoteException unused) {
        }
    }

    public final int o(int i) {
        if (this.f31039b == null) {
            return c.a().b(i);
        }
        try {
            return this.f31039b.o(i);
        } catch (RemoteException unused) {
            return -1;
        }
    }

    public final boolean p(int i) {
        if (this.f31039b == null) {
            return this.f31041d.p(i);
        }
        try {
            return this.f31039b.p(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final void q(int i) {
        if (this.f31039b == null) {
            this.f31041d.q(i);
            return;
        }
        try {
            this.f31039b.q(i);
        } catch (RemoteException unused) {
        }
    }

    public final boolean r(int i) {
        if (this.f31039b == null) {
            return this.f31041d.r(i);
        }
        try {
            return this.f31039b.r(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final u s(int i) {
        if (this.f31039b != null) {
            try {
                return e.a(this.f31039b.s(i));
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final x t(int i) {
        if (this.f31039b != null) {
            try {
                return e.a(this.f31039b.t(i));
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final com.ss.android.socialbase.downloader.depend.n u(int i) {
        if (this.f31039b != null) {
            try {
                return e.a(this.f31039b.u(i));
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final void a(int i) {
        if (this.f31039b != null) {
            try {
                this.f31039b.a(i);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void b(int i) {
        if (this.f31039b == null) {
            this.f31041d.b(i);
            return;
        }
        try {
            this.f31039b.b(i);
        } catch (RemoteException unused) {
        }
    }

    public final boolean c(int i) {
        if (this.f31039b == null) {
            return false;
        }
        try {
            return this.f31039b.c(i);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final boolean c(DownloadInfo downloadInfo) {
        if (this.f31039b == null) {
            return this.f31041d.c(downloadInfo);
        }
        try {
            return this.f31039b.b(downloadInfo);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final void b(DownloadTask downloadTask) {
        if (!(downloadTask == null || this.f31040c == null)) {
            this.f31040c.c(downloadTask);
        }
    }

    public final int a(String str, String str2) {
        return b.a(str, str2);
    }

    public final DownloadInfo b(String str, String str2) {
        return i(a(str, str2));
    }

    public final void a(int i, int i2) {
        if (this.f31039b != null) {
            try {
                this.f31039b.a(i, i2);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void b(int i, List<com.ss.android.socialbase.downloader.model.b> list) {
        if (this.f31039b == null) {
            this.f31041d.b(i, list);
            return;
        }
        try {
            this.f31039b.a(i, list);
        } catch (RemoteException unused) {
        }
    }

    public final void a(int i, Notification notification) {
        if (this.f31039b == null) {
            this.f31041d.a(i, notification);
            return;
        }
        try {
            this.f31039b.a(i, notification);
        } catch (RemoteException unused) {
        }
    }

    public final void a(int i, int i2, long j) {
        if (this.f31039b == null) {
            this.f31041d.a(i, i2, j);
            return;
        }
        try {
            this.f31039b.a(i, i2, j);
        } catch (RemoteException unused) {
        }
    }

    public final void b(int i, IDownloadListener iDownloadListener, g gVar, boolean z) {
        boolean z2;
        if (this.f31039b != null) {
            try {
                h hVar = this.f31039b;
                if (gVar == g.SUB) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                hVar.a(i, e.a(iDownloadListener, z2), gVar.ordinal(), z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (this.f31039b == null) {
            this.f31041d.a(i, i2, i3, i4);
            return;
        }
        try {
            this.f31039b.a(i, i2, i3, i4);
        } catch (RemoteException unused) {
        }
    }

    public final void a(int i, int i2, int i3, long j) {
        if (this.f31039b == null) {
            this.f31041d.a(i, i2, i3, j);
            return;
        }
        try {
            this.f31039b.a(i, i2, i3, j);
        } catch (RemoteException unused) {
        }
    }
}
