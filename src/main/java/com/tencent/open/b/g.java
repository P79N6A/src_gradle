package com.tencent.open.b;

import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.open.a.f;
import com.tencent.open.d.a;
import com.tencent.open.d.c;
import com.tencent.open.d.d;
import com.tencent.open.d.h;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.entity.ByteArrayEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    protected static g f79690a;

    /* renamed from: b  reason: collision with root package name */
    protected Random f79691b = new Random();

    /* renamed from: c  reason: collision with root package name */
    protected List<Serializable> f79692c = Collections.synchronizedList(new ArrayList());

    /* renamed from: d  reason: collision with root package name */
    protected List<Serializable> f79693d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e  reason: collision with root package name */
    protected HandlerThread f79694e;

    /* renamed from: f  reason: collision with root package name */
    protected Handler f79695f;
    protected Executor g = com.tencent.open.d.g.a();
    protected Executor h = com.tencent.open.d.g.a();

    /* access modifiers changed from: protected */
    public final void b() {
        this.h.execute(new Runnable() {
            /*  JADX ERROR: IF instruction can be used only in fallback mode
                jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
                	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:566)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:472)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:205)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
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
            public final void run() {
                /*
                    r10 = this;
                    com.tencent.open.b.g r0 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x00c0 }
                    android.os.Bundle r0 = r0.c()     // Catch:{ Exception -> 0x00c0 }
                    if (r0 != 0) goto L_0x0009
                    return
                L_0x0009:
                    android.content.Context r1 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x00c0 }
                    r2 = 0
                    com.tencent.open.d.d r1 = com.tencent.open.d.d.a(r1, r2)     // Catch:{ Exception -> 0x00c0 }
                    java.lang.String r3 = "Common_HttpRetryCount"
                    int r1 = r1.a(r3)     // Catch:{ Exception -> 0x00c0 }
                    if (r1 != 0) goto L_0x001b
                    r1 = 3
                L_0x001b:
                    java.lang.String r3 = "openSDK_LOG.ReportManager"
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
                    java.lang.String r5 = "-->doReportCgi, retryCount: "
                    r4.<init>(r5)     // Catch:{ Exception -> 0x00c0 }
                    r4.append(r1)     // Catch:{ Exception -> 0x00c0 }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00c0 }
                    com.tencent.open.a.f.b(r3, r4)     // Catch:{ Exception -> 0x00c0 }
                    r3 = 0
                    r4 = 0
                L_0x0030:
                    r5 = 1
                    int r4 = r4 + r5
                    android.content.Context r6 = com.tencent.open.d.c.a()     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    org.apache.http.client.HttpClient r6 = com.tencent.open.d.a.a((android.content.Context) r6, (java.lang.String) r2)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    org.apache.http.client.methods.HttpPost r7 = new org.apache.http.client.methods.HttpPost     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    java.lang.String r8 = "http://wspeed.qq.com/w.cgi"
                    r7.<init>(r8)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    java.lang.String r8 = "Accept-Encoding"
                    java.lang.String r9 = "gzip"
                    r7.addHeader(r8, r9)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    java.lang.String r8 = "Content-Type"
                    java.lang.String r9 = "application/x-www-form-urlencoded"
                    r7.setHeader(r8, r9)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    java.lang.String r8 = com.tencent.open.d.a.a((android.os.Bundle) r0)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    byte[] r8 = com.tencent.open.d.h.e(r8)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    org.apache.http.entity.ByteArrayEntity r9 = new org.apache.http.entity.ByteArrayEntity     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    r9.<init>(r8)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    r7.setEntity(r9)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    org.apache.http.HttpResponse r6 = r6.execute(r7)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    org.apache.http.StatusLine r6 = r6.getStatusLine()     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    int r6 = r6.getStatusCode()     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    java.lang.String r7 = "openSDK_LOG.ReportManager"
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    java.lang.String r9 = "-->doReportCgi, statusCode: "
                    r8.<init>(r9)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    r8.append(r6)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    java.lang.String r8 = r8.toString()     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    com.tencent.open.a.f.b(r7, r8)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    r7 = 200(0xc8, float:2.8E-43)
                    if (r6 != r7) goto L_0x00a9
                    com.tencent.open.b.f r6 = com.tencent.open.b.f.a()     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    java.lang.String r7 = "report_cgi"
                    r6.b(r7)     // Catch:{ ConnectTimeoutException -> 0x009f, SocketTimeoutException -> 0x0096, Exception -> 0x008d }
                    r3 = 1
                    goto L_0x00a9
                L_0x008d:
                    r0 = move-exception
                    java.lang.String r1 = "openSDK_LOG.ReportManager"
                    java.lang.String r2 = "-->doReportCgi, doupload exception"
                    com.tencent.open.a.f.b(r1, r2, r0)     // Catch:{ Exception -> 0x00c0 }
                    goto L_0x00a9
                L_0x0096:
                    r5 = move-exception
                    java.lang.String r6 = "openSDK_LOG.ReportManager"
                    java.lang.String r7 = "-->doReportCgi, doupload exception"
                    com.tencent.open.a.f.b(r6, r7, r5)     // Catch:{ Exception -> 0x00c0 }
                    goto L_0x00a7
                L_0x009f:
                    r5 = move-exception
                    java.lang.String r6 = "openSDK_LOG.ReportManager"
                    java.lang.String r7 = "-->doReportCgi, doupload exception"
                    com.tencent.open.a.f.b(r6, r7, r5)     // Catch:{ Exception -> 0x00c0 }
                L_0x00a7:
                    if (r4 < r1) goto L_0x0030
                L_0x00a9:
                    if (r3 != 0) goto L_0x00b8
                    com.tencent.open.b.f r0 = com.tencent.open.b.f.a()     // Catch:{ Exception -> 0x00c0 }
                    java.lang.String r1 = "report_cgi"
                    com.tencent.open.b.g r2 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x00c0 }
                    java.util.List<java.io.Serializable> r2 = r2.f79692c     // Catch:{ Exception -> 0x00c0 }
                    r0.a(r1, r2)     // Catch:{ Exception -> 0x00c0 }
                L_0x00b8:
                    com.tencent.open.b.g r0 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x00c0 }
                    java.util.List<java.io.Serializable> r0 = r0.f79692c     // Catch:{ Exception -> 0x00c0 }
                    r0.clear()     // Catch:{ Exception -> 0x00c0 }
                    return
                L_0x00c0:
                    r0 = move-exception
                    java.lang.String r1 = "openSDK_LOG.ReportManager"
                    java.lang.String r2 = "-->doReportCgi, doupload exception out."
                    com.tencent.open.a.f.b(r1, r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.g.AnonymousClass4.run():void");
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void e() {
        this.g.execute(new Runnable() {
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
                r6 = -4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
                if (android.text.TextUtils.isEmpty(r0.f79759a) == false) goto L_0x0058;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
                r0 = r3;
                r9 = 0;
                r11 = 0;
                r13 = -6;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
                r0 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
                r13 = com.tencent.open.d.a.a(r0);
                r0 = r15;
                r9 = 0;
                r11 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
                r0 = e;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
                r1.f79707a.f79693d.clear();
                com.tencent.open.a.f.b("openSDK_LOG.ReportManager", "doReportVia, NetworkUnavailableException.");
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a1, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
                r0 = r15;
                r9 = 0;
                r11 = 0;
                r13 = -4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
                r4 = android.os.SystemClock.elapsedRealtime();
                r0 = r15;
                r9 = 0;
                r11 = 0;
                r13 = -8;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b5, code lost:
                r4 = android.os.SystemClock.elapsedRealtime();
                r0 = r15;
                r9 = 0;
                r11 = 0;
                r13 = -7;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c0, code lost:
                continue;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c0, code lost:
                continue;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c0, code lost:
                continue;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c0, code lost:
                continue;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c0, code lost:
                continue;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0093 */
            /* JADX WARNING: Removed duplicated region for block: B:27:? A[ExcHandler: Exception (unused java.lang.Exception), PHI: r8 
              PHI: (r8v10 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v11 boolean), (r8v11 boolean), (r8v1 boolean) binds: [B:8:0x0034, B:11:0x0048, B:21:0x005c, B:22:?, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:8:0x0034] */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x006d A[ExcHandler: IOException (r0v25 'e' java.io.IOException A[CUSTOM_DECLARE]), PHI: r8 r15 
              PHI: (r8v9 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v11 boolean), (r8v11 boolean), (r8v1 boolean) binds: [B:8:0x0034, B:11:0x0048, B:21:0x005c, B:22:?, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]
              PHI: (r15v4 int) = (r15v0 int), (r15v0 int), (r15v5 int), (r15v5 int), (r15v0 int) binds: [B:8:0x0034, B:11:0x0048, B:21:0x005c, B:22:?, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE], Splitter:B:8:0x0034] */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x0079 A[ExcHandler: a (e com.tencent.open.d.a$a), Splitter:B:8:0x0034] */
            /* JADX WARNING: Removed duplicated region for block: B:36:0x0093 A[SYNTHETIC, Splitter:B:36:0x0093] */
            /* JADX WARNING: Removed duplicated region for block: B:40:? A[ExcHandler: JSONException (unused org.json.JSONException), PHI: r8 r15 
              PHI: (r8v7 boolean) = (r8v1 boolean), (r8v11 boolean), (r8v11 boolean), (r8v1 boolean) binds: [B:8:0x0034, B:21:0x005c, B:22:?, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]
              PHI: (r15v3 int) = (r15v0 int), (r15v5 int), (r15v5 int), (r15v0 int) binds: [B:8:0x0034, B:21:0x005c, B:22:?, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:8:0x0034] */
            /* JADX WARNING: Removed duplicated region for block: B:42:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), PHI: r8 r15 
              PHI: (r8v6 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v11 boolean), (r8v11 boolean), (r8v1 boolean) binds: [B:8:0x0034, B:11:0x0048, B:21:0x005c, B:22:?, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]
              PHI: (r15v2 int) = (r15v0 int), (r15v0 int), (r15v5 int), (r15v5 int), (r15v0 int) binds: [B:8:0x0034, B:11:0x0048, B:21:0x005c, B:22:?, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:8:0x0034] */
            /* JADX WARNING: Removed duplicated region for block: B:44:? A[ExcHandler: ConnectTimeoutException (unused org.apache.http.conn.ConnectTimeoutException), PHI: r8 r15 
              PHI: (r8v5 boolean) = (r8v1 boolean), (r8v1 boolean), (r8v11 boolean), (r8v11 boolean), (r8v1 boolean) binds: [B:8:0x0034, B:11:0x0048, B:21:0x005c, B:22:?, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE]
              PHI: (r15v1 int) = (r15v0 int), (r15v0 int), (r15v5 int), (r15v5 int), (r15v0 int) binds: [B:8:0x0034, B:11:0x0048, B:21:0x005c, B:22:?, B:16:0x0050] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:8:0x0034] */
            /* JADX WARNING: Removed duplicated region for block: B:50:0x00d9 A[Catch:{ Exception -> 0x010b }] */
            /* JADX WARNING: Removed duplicated region for block: B:51:0x00e3 A[Catch:{ Exception -> 0x010b }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r27 = this;
                    r1 = r27
                    com.tencent.open.b.g r0 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x010b }
                    android.os.Bundle r2 = r0.d()     // Catch:{ Exception -> 0x010b }
                    if (r2 != 0) goto L_0x000b
                    return
                L_0x000b:
                    java.lang.String r0 = "openSDK_LOG.ReportManager"
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010b }
                    java.lang.String r4 = "-->doReportVia, params: "
                    r3.<init>(r4)     // Catch:{ Exception -> 0x010b }
                    java.lang.String r4 = r2.toString()     // Catch:{ Exception -> 0x010b }
                    r3.append(r4)     // Catch:{ Exception -> 0x010b }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x010b }
                    com.tencent.open.a.f.a(r0, r3)     // Catch:{ Exception -> 0x010b }
                    int r3 = com.tencent.open.b.e.a()     // Catch:{ Exception -> 0x010b }
                    long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x010b }
                    r0 = 0
                    r8 = 0
                    r9 = 0
                    r11 = 0
                    r13 = 0
                L_0x0031:
                    r14 = 1
                    int r15 = r0 + 1
                    android.content.Context r0 = com.tencent.open.d.c.a()     // Catch:{ ConnectTimeoutException -> 0x00b5, SocketTimeoutException -> 0x00a9, JSONException -> 0x00a2, b -> 0x0093, a -> 0x0079, IOException -> 0x006d, Exception -> 0x0065 }
                    java.lang.String r6 = "http://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report"
                    java.lang.String r7 = "POST"
                    com.tencent.open.d.h$a r0 = com.tencent.open.d.a.a(r0, r6, r7, r2)     // Catch:{ ConnectTimeoutException -> 0x00b5, SocketTimeoutException -> 0x00a9, JSONException -> 0x00a2, b -> 0x0093, a -> 0x0079, IOException -> 0x006d, Exception -> 0x0065 }
                    java.lang.String r6 = r0.f79759a     // Catch:{ ConnectTimeoutException -> 0x00b5, SocketTimeoutException -> 0x00a9, JSONException -> 0x00a2, b -> 0x0093, a -> 0x0079, IOException -> 0x006d, Exception -> 0x0065 }
                    org.json.JSONObject r6 = com.tencent.open.d.h.d((java.lang.String) r6)     // Catch:{ ConnectTimeoutException -> 0x00b5, SocketTimeoutException -> 0x00a9, JSONException -> 0x00a2, b -> 0x0093, a -> 0x0079, IOException -> 0x006d, Exception -> 0x0065 }
                    java.lang.String r7 = "ret"
                    int r6 = r6.getInt(r7)     // Catch:{ JSONException -> 0x004d, ConnectTimeoutException -> 0x00b5, SocketTimeoutException -> 0x00a9, b -> 0x0093, a -> 0x0079, IOException -> 0x006d, Exception -> 0x0065 }
                    goto L_0x004e
                L_0x004d:
                    r6 = -4
                L_0x004e:
                    if (r6 == 0) goto L_0x0058
                    java.lang.String r6 = r0.f79759a     // Catch:{ ConnectTimeoutException -> 0x00b5, SocketTimeoutException -> 0x00a9, JSONException -> 0x00a2, b -> 0x0093, a -> 0x0079, IOException -> 0x006d, Exception -> 0x0065 }
                    boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ ConnectTimeoutException -> 0x00b5, SocketTimeoutException -> 0x00a9, JSONException -> 0x00a2, b -> 0x0093, a -> 0x0079, IOException -> 0x006d, Exception -> 0x0065 }
                    if (r6 != 0) goto L_0x005a
                L_0x0058:
                    r15 = r3
                    r8 = 1
                L_0x005a:
                    long r6 = r0.f79760b     // Catch:{ ConnectTimeoutException -> 0x00b5, SocketTimeoutException -> 0x00a9, JSONException -> 0x00a2, b -> 0x0093, a -> 0x0079, IOException -> 0x006d, Exception -> 0x0065 }
                    long r9 = r0.f79761c     // Catch:{ ConnectTimeoutException -> 0x00b5, SocketTimeoutException -> 0x00a9, JSONException -> 0x00a2, b -> 0x0093, a -> 0x0062, IOException -> 0x006d, Exception -> 0x0065 }
                    r11 = r9
                    r0 = r15
                    r9 = r6
                    goto L_0x00c0
                L_0x0062:
                    r0 = move-exception
                    r9 = r6
                    goto L_0x007a
                L_0x0065:
                    r0 = -6
                    r0 = r3
                    r9 = 0
                    r11 = 0
                    r13 = -6
                    goto L_0x00c0
                L_0x006d:
                    r0 = move-exception
                    int r0 = com.tencent.open.d.a.a((java.io.IOException) r0)     // Catch:{ Exception -> 0x010b }
                    r13 = r0
                    r0 = r15
                    r9 = 0
                    r11 = 0
                    goto L_0x00c0
                L_0x0079:
                    r0 = move-exception
                L_0x007a:
                    java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x00c2 }
                    java.lang.String r2 = "http status code error:"
                    java.lang.String r3 = ""
                    java.lang.String r0 = r0.replace(r2, r3)     // Catch:{ Exception -> 0x00c2 }
                    int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00c2 }
                    r24 = r0
                    r18 = r4
                    r20 = r9
                    r22 = r11
                    goto L_0x00ca
                L_0x0093:
                    com.tencent.open.b.g r0 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x010b }
                    java.util.List<java.io.Serializable> r0 = r0.f79693d     // Catch:{ Exception -> 0x010b }
                    r0.clear()     // Catch:{ Exception -> 0x010b }
                    java.lang.String r0 = "openSDK_LOG.ReportManager"
                    java.lang.String r2 = "doReportVia, NetworkUnavailableException."
                    com.tencent.open.a.f.b(r0, r2)     // Catch:{ Exception -> 0x010b }
                    return
                L_0x00a2:
                    r0 = r15
                    r9 = 0
                    r11 = 0
                    r13 = -4
                    goto L_0x00c0
                L_0x00a9:
                    long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x010b }
                    r0 = -8
                    r0 = r15
                    r9 = 0
                    r11 = 0
                    r13 = -8
                    goto L_0x00c0
                L_0x00b5:
                    long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x010b }
                    r0 = -7
                    r0 = r15
                    r9 = 0
                    r11 = 0
                    r13 = -7
                L_0x00c0:
                    if (r0 < r3) goto L_0x0031
                L_0x00c2:
                    r18 = r4
                    r20 = r9
                    r22 = r11
                    r24 = r13
                L_0x00ca:
                    com.tencent.open.b.g r0 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x010b }
                    java.lang.String r17 = "mapp_apptrace_sdk"
                    r25 = 0
                    r26 = 0
                    r16 = r0
                    r16.a(r17, r18, r20, r22, r24, r25, r26)     // Catch:{ Exception -> 0x010b }
                    if (r8 == 0) goto L_0x00e3
                    com.tencent.open.b.f r0 = com.tencent.open.b.f.a()     // Catch:{ Exception -> 0x010b }
                    java.lang.String r2 = "report_via"
                    r0.b(r2)     // Catch:{ Exception -> 0x010b }
                    goto L_0x00f0
                L_0x00e3:
                    com.tencent.open.b.f r0 = com.tencent.open.b.f.a()     // Catch:{ Exception -> 0x010b }
                    java.lang.String r2 = "report_via"
                    com.tencent.open.b.g r3 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x010b }
                    java.util.List<java.io.Serializable> r3 = r3.f79693d     // Catch:{ Exception -> 0x010b }
                    r0.a(r2, r3)     // Catch:{ Exception -> 0x010b }
                L_0x00f0:
                    com.tencent.open.b.g r0 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x010b }
                    java.util.List<java.io.Serializable> r0 = r0.f79693d     // Catch:{ Exception -> 0x010b }
                    r0.clear()     // Catch:{ Exception -> 0x010b }
                    java.lang.String r0 = "openSDK_LOG.ReportManager"
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010b }
                    java.lang.String r3 = "-->doReportVia, uploadSuccess: "
                    r2.<init>(r3)     // Catch:{ Exception -> 0x010b }
                    r2.append(r8)     // Catch:{ Exception -> 0x010b }
                    java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x010b }
                    com.tencent.open.a.f.b(r0, r2)     // Catch:{ Exception -> 0x010b }
                    return
                L_0x010b:
                    r0 = move-exception
                    java.lang.String r2 = "openSDK_LOG.ReportManager"
                    java.lang.String r3 = "-->doReportVia, exception in serial executor."
                    com.tencent.open.a.f.b(r2, r3, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.g.AnonymousClass5.run():void");
            }
        });
    }

    public static synchronized g a() {
        g gVar;
        synchronized (g.class) {
            if (f79690a == null) {
                f79690a = new g();
            }
            gVar = f79690a;
        }
        return gVar;
    }

    private g() {
        if (this.f79694e == null) {
            this.f79694e = new HandlerThread("opensdk.report.handlerthread", 10);
            this.f79694e.start();
        }
        if (this.f79694e.isAlive() && this.f79694e.getLooper() != null) {
            this.f79695f = new Handler(this.f79694e.getLooper()) {
                public final void handleMessage(Message message) {
                    switch (message.what) {
                        case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE:
                            g.this.b();
                            break;
                        case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST:
                            g.this.e();
                            break;
                    }
                    super.handleMessage(message);
                }
            };
        }
    }

    /* access modifiers changed from: protected */
    public final Bundle d() {
        List a2 = f.a().a("report_via");
        if (a2 != null) {
            this.f79693d.addAll(a2);
        }
        f.b("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + this.f79693d.size());
        if (this.f79693d.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<Serializable> it2 = this.f79693d.iterator();
        while (it2.hasNext()) {
            JSONObject jSONObject = new JSONObject();
            b bVar = (b) it2.next();
            for (String next : bVar.f79681a.keySet()) {
                try {
                    String str = bVar.f79681a.get(next);
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put(next, str);
                } catch (JSONException e2) {
                    f.b("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e2);
                }
            }
            jSONArray.put(jSONObject);
        }
        f.a("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        Bundle bundle = new Bundle();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("data", jSONArray);
            bundle.putString("data", jSONObject2.toString());
            return bundle;
        } catch (JSONException e3) {
            f.b("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e3);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final Bundle c() {
        if (this.f79692c.size() == 0) {
            return null;
        }
        b bVar = (b) this.f79692c.get(0);
        if (bVar == null) {
            f.b("openSDK_LOG.ReportManager", "-->prepareCgiData, the 0th cgireportitem is null.");
            return null;
        }
        String str = bVar.f79681a.get("appid");
        List a2 = f.a().a("report_cgi");
        if (a2 != null) {
            this.f79692c.addAll(a2);
        }
        f.b("openSDK_LOG.ReportManager", "-->prepareCgiData, mCgiList size: " + this.f79692c.size());
        if (this.f79692c.size() == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            bundle.putString("appid", str);
            bundle.putString("releaseversion", "OpenSdk_3.3.0.lite");
            bundle.putString("device", Build.DEVICE);
            bundle.putString("qua", "V1_AND_OpenSDK_3.3.0.lite_1077_RDM_B");
            bundle.putString("key", "apn,frequency,commandid,resultcode,tmcost,reqsize,rspsize,detail,touin,deviceinfo");
            for (int i = 0; i < this.f79692c.size(); i++) {
                b bVar2 = (b) this.f79692c.get(i);
                bundle.putString(i + "_1", bVar2.f79681a.get("apn"));
                bundle.putString(i + "_2", bVar2.f79681a.get("frequency"));
                bundle.putString(i + "_3", bVar2.f79681a.get("commandid"));
                bundle.putString(i + "_4", bVar2.f79681a.get("resultCode"));
                bundle.putString(i + "_5", bVar2.f79681a.get("timeCost"));
                bundle.putString(i + "_6", bVar2.f79681a.get("reqSize"));
                bundle.putString(i + "_7", bVar2.f79681a.get("rspSize"));
                bundle.putString(i + "_8", bVar2.f79681a.get("detail"));
                bundle.putString(i + "_9", bVar2.f79681a.get("uin"));
                bundle.putString(i + "_10", c.d(c.a()) + "&" + bVar2.f79681a.get("deviceInfo"));
            }
            f.a("openSDK_LOG.ReportManager", "-->prepareCgiData, end. params: " + bundle.toString());
            return bundle;
        } catch (Exception e2) {
            f.b("openSDK_LOG.ReportManager", "-->prepareCgiData, exception.", e2);
            return null;
        }
    }

    protected static int a(int i) {
        if (i == 0) {
            int a2 = d.a(c.a(), null).a("Common_CGIReportFrequencySuccess");
            if (a2 == 0) {
                return 10;
            }
            return a2;
        }
        int a3 = d.a(c.a(), null).a("Common_CGIReportFrequencyFailed");
        if (a3 == 0) {
            return 100;
        }
        return a3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r0 == 0) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r0 == 0) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static boolean a(java.lang.String r5, int r6) {
        /*
            java.lang.String r0 = "report_cgi"
            boolean r0 = r5.equals(r0)
            r1 = 5
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x001d
            android.content.Context r0 = com.tencent.open.d.c.a()
            com.tencent.open.d.d r0 = com.tencent.open.d.d.a(r0, r2)
            java.lang.String r2 = "Common_CGIReportMaxcount"
            int r0 = r0.a(r2)
            if (r0 != 0) goto L_0x0037
        L_0x001b:
            r0 = 5
            goto L_0x0037
        L_0x001d:
            java.lang.String r0 = "report_via"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0036
            android.content.Context r0 = com.tencent.open.d.c.a()
            com.tencent.open.d.d r0 = com.tencent.open.d.d.a(r0, r2)
            java.lang.String r2 = "Agent_ReportBatchCount"
            int r0 = r0.a(r2)
            if (r0 != 0) goto L_0x0037
            goto L_0x001b
        L_0x0036:
            r0 = 0
        L_0x0037:
            java.lang.String r1 = "openSDK_LOG.ReportManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "-->availableCount, report: "
            r2.<init>(r4)
            r2.append(r5)
            java.lang.String r5 = " | dataSize: "
            r2.append(r5)
            r2.append(r6)
            java.lang.String r5 = " | maxcount: "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            com.tencent.open.a.f.b(r1, r5)
            if (r6 < r0) goto L_0x005e
            r5 = 1
            return r5
        L_0x005e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.g.a(java.lang.String, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (r5 == 0) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r4.f79691b.nextInt(100) < r5) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r4.f79691b.nextInt(100) < r5) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "openSDK_LOG.ReportManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "-->availableFrequency, report: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " | ext: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.tencent.open.a.f.b(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0023
            return r1
        L_0x0023:
            java.lang.String r0 = "report_cgi"
            boolean r0 = r5.equals(r0)
            r2 = 1
            r3 = 100
            if (r0 == 0) goto L_0x0041
            int r5 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x0040 }
            int r5 = a(r5)
            java.util.Random r6 = r4.f79691b
            int r6 = r6.nextInt(r3)
            if (r6 >= r5) goto L_0x006e
        L_0x003e:
            r1 = 1
            goto L_0x006e
        L_0x0040:
            return r1
        L_0x0041:
            java.lang.String r0 = "report_via"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x006c
            android.content.Context r5 = com.tencent.open.d.c.a()
            if (r5 != 0) goto L_0x0052
        L_0x004f:
            r5 = 100
            goto L_0x0063
        L_0x0052:
            android.content.Context r5 = com.tencent.open.d.c.a()
            com.tencent.open.d.d r5 = com.tencent.open.d.d.a(r5, r6)
            java.lang.String r6 = "Common_BusinessReportFrequency"
            int r5 = r5.a(r6)
            if (r5 != 0) goto L_0x0063
            goto L_0x004f
        L_0x0063:
            java.util.Random r6 = r4.f79691b
            int r6 = r6.nextInt(r3)
            if (r6 >= r5) goto L_0x006e
            goto L_0x003e
        L_0x006c:
            r5 = 100
        L_0x006e:
            java.lang.String r6 = "openSDK_LOG.ReportManager"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "-->availableFrequency, result: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r2 = " | frequency: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.tencent.open.a.f.b(r6, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.g.a(java.lang.String, java.lang.String):boolean");
    }

    public final void a(final Bundle bundle, String str, final boolean z) {
        if (bundle != null) {
            f.a("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
            if (a("report_via", str) || z) {
                this.g.execute(new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:11:0x00fe A[Catch:{ Exception -> 0x01a0 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:12:0x0101 A[Catch:{ Exception -> 0x01a0 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:15:0x0115 A[Catch:{ Exception -> 0x01a0 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:16:0x0118 A[Catch:{ Exception -> 0x01a0 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:19:0x013f A[Catch:{ Exception -> 0x01a0 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:22:0x0169 A[Catch:{ Exception -> 0x01a0 }] */
                    /* JADX WARNING: Removed duplicated region for block: B:25:0x0175 A[Catch:{ Exception -> 0x01a0 }] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r5 = this;
                            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x01a0 }
                            r0.<init>()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "uin"
                            java.lang.String r2 = "1000"
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "imei"
                            android.content.Context r2 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r2 = com.tencent.open.b.c.a(r2)     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "imsi"
                            android.content.Context r2 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r2 = com.tencent.open.b.c.b(r2)     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "android_id"
                            android.content.Context r2 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r2 = com.tencent.open.b.c.c(r2)     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "mac"
                            java.lang.String r2 = com.tencent.open.b.c.a()     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "platform"
                            java.lang.String r2 = "1"
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "os_ver"
                            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "position"
                            android.content.Context r2 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r2 = com.tencent.open.d.h.b((android.content.Context) r2)     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "network"
                            android.content.Context r2 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r2 = com.tencent.open.b.a.a(r2)     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "language"
                            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r2 = r2.getLanguage()     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "resolution"
                            android.content.Context r2 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r3 = com.tencent.open.b.c.f79682a     // Catch:{ Exception -> 0x01a0 }
                            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x01a0 }
                            if (r3 == 0) goto L_0x00b8
                            if (r2 != 0) goto L_0x0084
                            java.lang.String r2 = ""
                            goto L_0x00ba
                        L_0x0084:
                            java.lang.String r3 = ""
                            com.tencent.open.b.c.f79682a = r3     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r3 = "window"
                            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ Exception -> 0x01a0 }
                            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch:{ Exception -> 0x01a0 }
                            if (r2 == 0) goto L_0x00b8
                            android.view.Display r3 = r2.getDefaultDisplay()     // Catch:{ Exception -> 0x01a0 }
                            int r3 = r3.getWidth()     // Catch:{ Exception -> 0x01a0 }
                            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ Exception -> 0x01a0 }
                            int r2 = r2.getHeight()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a0 }
                            r4.<init>()     // Catch:{ Exception -> 0x01a0 }
                            r4.append(r3)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r3 = "x"
                            r4.append(r3)     // Catch:{ Exception -> 0x01a0 }
                            r4.append(r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x01a0 }
                            com.tencent.open.b.c.f79682a = r2     // Catch:{ Exception -> 0x01a0 }
                        L_0x00b8:
                            java.lang.String r2 = com.tencent.open.b.c.f79682a     // Catch:{ Exception -> 0x01a0 }
                        L_0x00ba:
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "apn"
                            android.content.Context r2 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r2 = com.tencent.open.b.a.b(r2)     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "model_name"
                            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "timezone"
                            java.util.TimeZone r2 = java.util.TimeZone.getDefault()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r2 = r2.getID()     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "sdk_ver"
                            java.lang.String r2 = "3.3.0.lite"
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "qz_ver"
                            android.content.Context r2 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r3 = "com.qzone"
                            java.lang.String r2 = com.tencent.open.d.h.c(r2, r3)     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "qq_ver"
                            android.content.Context r2 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r3 = "com.tencent.mobileqq"
                            if (r2 != 0) goto L_0x0101
                            java.lang.String r2 = ""
                            goto L_0x0106
                        L_0x0101:
                            com.tencent.open.d.h.b(r2, r3)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r2 = com.tencent.open.d.h.f79753a     // Catch:{ Exception -> 0x01a0 }
                        L_0x0106:
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "qua"
                            android.content.Context r2 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r3 = com.tencent.open.d.c.b()     // Catch:{ Exception -> 0x01a0 }
                            if (r2 != 0) goto L_0x0118
                            java.lang.String r2 = ""
                            goto L_0x011e
                        L_0x0118:
                            java.lang.String r2 = com.tencent.open.d.h.c(r2, r3)     // Catch:{ Exception -> 0x01a0 }
                            com.tencent.open.d.h.f79754b = r2     // Catch:{ Exception -> 0x01a0 }
                        L_0x011e:
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "packagename"
                            java.lang.String r2 = com.tencent.open.d.c.b()     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r1 = "app_ver"
                            android.content.Context r2 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r3 = com.tencent.open.d.c.b()     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r2 = com.tencent.open.d.h.c(r2, r3)     // Catch:{ Exception -> 0x01a0 }
                            r0.putString(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            android.os.Bundle r1 = r4     // Catch:{ Exception -> 0x01a0 }
                            if (r1 == 0) goto L_0x0144
                            android.os.Bundle r1 = r4     // Catch:{ Exception -> 0x01a0 }
                            r0.putAll(r1)     // Catch:{ Exception -> 0x01a0 }
                        L_0x0144:
                            com.tencent.open.b.b r1 = new com.tencent.open.b.b     // Catch:{ Exception -> 0x01a0 }
                            r1.<init>(r0)     // Catch:{ Exception -> 0x01a0 }
                            com.tencent.open.b.g r0 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x01a0 }
                            java.util.List<java.io.Serializable> r0 = r0.f79693d     // Catch:{ Exception -> 0x01a0 }
                            r0.add(r1)     // Catch:{ Exception -> 0x01a0 }
                            com.tencent.open.b.g r0 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x01a0 }
                            java.util.List<java.io.Serializable> r0 = r0.f79693d     // Catch:{ Exception -> 0x01a0 }
                            int r0 = r0.size()     // Catch:{ Exception -> 0x01a0 }
                            android.content.Context r1 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x01a0 }
                            r2 = 0
                            com.tencent.open.d.d r1 = com.tencent.open.d.d.a(r1, r2)     // Catch:{ Exception -> 0x01a0 }
                            java.lang.String r2 = "Agent_ReportTimeInterval"
                            int r1 = r1.a(r2)     // Catch:{ Exception -> 0x01a0 }
                            if (r1 != 0) goto L_0x016b
                            r1 = 10000(0x2710, float:1.4013E-41)
                        L_0x016b:
                            java.lang.String r2 = "report_via"
                            boolean r0 = com.tencent.open.b.g.a((java.lang.String) r2, (int) r0)     // Catch:{ Exception -> 0x01a0 }
                            r2 = 1001(0x3e9, float:1.403E-42)
                            if (r0 != 0) goto L_0x0193
                            boolean r0 = r6     // Catch:{ Exception -> 0x01a0 }
                            if (r0 == 0) goto L_0x017a
                            goto L_0x0193
                        L_0x017a:
                            com.tencent.open.b.g r0 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x01a0 }
                            android.os.Handler r0 = r0.f79695f     // Catch:{ Exception -> 0x01a0 }
                            boolean r0 = r0.hasMessages(r2)     // Catch:{ Exception -> 0x01a0 }
                            if (r0 != 0) goto L_0x0192
                            android.os.Message r0 = android.os.Message.obtain()     // Catch:{ Exception -> 0x01a0 }
                            r0.what = r2     // Catch:{ Exception -> 0x01a0 }
                            com.tencent.open.b.g r2 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x01a0 }
                            android.os.Handler r2 = r2.f79695f     // Catch:{ Exception -> 0x01a0 }
                            long r3 = (long) r1     // Catch:{ Exception -> 0x01a0 }
                            r2.sendMessageDelayed(r0, r3)     // Catch:{ Exception -> 0x01a0 }
                        L_0x0192:
                            return
                        L_0x0193:
                            com.tencent.open.b.g r0 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x01a0 }
                            r0.e()     // Catch:{ Exception -> 0x01a0 }
                            com.tencent.open.b.g r0 = com.tencent.open.b.g.this     // Catch:{ Exception -> 0x01a0 }
                            android.os.Handler r0 = r0.f79695f     // Catch:{ Exception -> 0x01a0 }
                            r0.removeMessages(r2)     // Catch:{ Exception -> 0x01a0 }
                            goto L_0x01a8
                        L_0x01a0:
                            r0 = move-exception
                            java.lang.String r1 = "openSDK_LOG.ReportManager"
                            java.lang.String r2 = "--> reporVia, exception in sub thread."
                            com.tencent.open.a.f.b(r1, r2, r0)
                        L_0x01a8:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.g.AnonymousClass2.run():void");
                    }
                });
            }
        }
    }

    public final void a(String str, String str2, Bundle bundle, boolean z) {
        final Bundle bundle2 = bundle;
        final String str3 = str;
        final String str4 = str2;
        AnonymousClass6 r0 = new Runnable(true) {
            /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8 A[Catch:{ Exception -> 0x0100 }] */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0 A[Catch:{ Exception -> 0x0100 }] */
            /* JADX WARNING: Removed duplicated region for block: B:53:0x00e6 A[EDGE_INSN: B:53:0x00e6->B:43:0x00e6 ?: BREAK  , SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r10 = this;
                    android.os.Bundle r0 = r2     // Catch:{ Exception -> 0x0100 }
                    if (r0 != 0) goto L_0x000c
                    java.lang.String r0 = "openSDK_LOG.ReportManager"
                    java.lang.String r1 = "-->httpRequest, params is null!"
                    com.tencent.open.a.f.e(r0, r1)     // Catch:{ Exception -> 0x0100 }
                    return
                L_0x000c:
                    int r0 = com.tencent.open.b.e.a()     // Catch:{ Exception -> 0x0100 }
                    if (r0 != 0) goto L_0x0013
                    r0 = 3
                L_0x0013:
                    java.lang.String r1 = "openSDK_LOG.ReportManager"
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0100 }
                    java.lang.String r3 = "-->httpRequest, retryCount: "
                    r2.<init>(r3)     // Catch:{ Exception -> 0x0100 }
                    r2.append(r0)     // Catch:{ Exception -> 0x0100 }
                    java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0100 }
                    com.tencent.open.a.f.b(r1, r2)     // Catch:{ Exception -> 0x0100 }
                    android.content.Context r1 = com.tencent.open.d.c.a()     // Catch:{ Exception -> 0x0100 }
                    r2 = 0
                    org.apache.http.client.HttpClient r1 = com.tencent.open.d.a.a((android.content.Context) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x0100 }
                    android.os.Bundle r2 = r2     // Catch:{ Exception -> 0x0100 }
                    java.lang.String r2 = com.tencent.open.d.a.a((android.os.Bundle) r2)     // Catch:{ Exception -> 0x0100 }
                    boolean r3 = true     // Catch:{ Exception -> 0x0100 }
                    if (r3 == 0) goto L_0x003d
                    java.lang.String r2 = java.net.URLEncoder.encode(r2)     // Catch:{ Exception -> 0x0100 }
                L_0x003d:
                    java.lang.String r3 = r5     // Catch:{ Exception -> 0x0100 }
                    java.lang.String r3 = r3.toUpperCase()     // Catch:{ Exception -> 0x0100 }
                    java.lang.String r4 = "GET"
                    boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0100 }
                    if (r3 == 0) goto L_0x005f
                    java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x0100 }
                    java.lang.String r4 = r3     // Catch:{ Exception -> 0x0100 }
                    r3.<init>(r4)     // Catch:{ Exception -> 0x0100 }
                    r3.append(r2)     // Catch:{ Exception -> 0x0100 }
                    org.apache.http.client.methods.HttpGet r2 = new org.apache.http.client.methods.HttpGet     // Catch:{ Exception -> 0x0100 }
                    java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0100 }
                    r2.<init>(r3)     // Catch:{ Exception -> 0x0100 }
                    goto L_0x0081
                L_0x005f:
                    java.lang.String r3 = r5     // Catch:{ Exception -> 0x0100 }
                    java.lang.String r3 = r3.toUpperCase()     // Catch:{ Exception -> 0x0100 }
                    java.lang.String r4 = "POST"
                    boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0100 }
                    if (r3 == 0) goto L_0x00f8
                    org.apache.http.client.methods.HttpPost r3 = new org.apache.http.client.methods.HttpPost     // Catch:{ Exception -> 0x0100 }
                    java.lang.String r4 = r3     // Catch:{ Exception -> 0x0100 }
                    r3.<init>(r4)     // Catch:{ Exception -> 0x0100 }
                    byte[] r2 = com.tencent.open.d.h.e(r2)     // Catch:{ Exception -> 0x0100 }
                    org.apache.http.entity.ByteArrayEntity r4 = new org.apache.http.entity.ByteArrayEntity     // Catch:{ Exception -> 0x0100 }
                    r4.<init>(r2)     // Catch:{ Exception -> 0x0100 }
                    r3.setEntity(r4)     // Catch:{ Exception -> 0x0100 }
                    r2 = r3
                L_0x0081:
                    java.lang.String r3 = "Accept-Encoding"
                    java.lang.String r4 = "gzip"
                    r2.addHeader(r3, r4)     // Catch:{ Exception -> 0x0100 }
                    java.lang.String r3 = "Content-Type"
                    java.lang.String r4 = "application/x-www-form-urlencoded"
                    r2.addHeader(r3, r4)     // Catch:{ Exception -> 0x0100 }
                    r3 = 0
                    r4 = 0
                L_0x0091:
                    r5 = 1
                    int r3 = r3 + r5
                    org.apache.http.HttpResponse r6 = r1.execute(r2)     // Catch:{ ConnectTimeoutException -> 0x00dd, SocketTimeoutException -> 0x00d5, Exception -> 0x00cd }
                    org.apache.http.StatusLine r6 = r6.getStatusLine()     // Catch:{ ConnectTimeoutException -> 0x00dd, SocketTimeoutException -> 0x00d5, Exception -> 0x00cd }
                    int r6 = r6.getStatusCode()     // Catch:{ ConnectTimeoutException -> 0x00dd, SocketTimeoutException -> 0x00d5, Exception -> 0x00cd }
                    java.lang.String r7 = "openSDK_LOG.ReportManager"
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ConnectTimeoutException -> 0x00dd, SocketTimeoutException -> 0x00d5, Exception -> 0x00cd }
                    java.lang.String r9 = "-->httpRequest, statusCode: "
                    r8.<init>(r9)     // Catch:{ ConnectTimeoutException -> 0x00dd, SocketTimeoutException -> 0x00d5, Exception -> 0x00cd }
                    r8.append(r6)     // Catch:{ ConnectTimeoutException -> 0x00dd, SocketTimeoutException -> 0x00d5, Exception -> 0x00cd }
                    java.lang.String r8 = r8.toString()     // Catch:{ ConnectTimeoutException -> 0x00dd, SocketTimeoutException -> 0x00d5, Exception -> 0x00cd }
                    com.tencent.open.a.f.b(r7, r8)     // Catch:{ ConnectTimeoutException -> 0x00dd, SocketTimeoutException -> 0x00d5, Exception -> 0x00cd }
                    r7 = 200(0xc8, float:2.8E-43)
                    if (r6 == r7) goto L_0x00be
                    java.lang.String r6 = "openSDK_LOG.ReportManager"
                    java.lang.String r7 = "-->ReportCenter httpRequest : HttpStatuscode != 200"
                    com.tencent.open.a.f.b(r6, r7)     // Catch:{ ConnectTimeoutException -> 0x00dd, SocketTimeoutException -> 0x00d5, Exception -> 0x00cd }
                    goto L_0x00e6
                L_0x00be:
                    java.lang.String r4 = "openSDK_LOG.ReportManager"
                    java.lang.String r6 = "-->ReportCenter httpRequest Thread success"
                    com.tencent.open.a.f.b(r4, r6)     // Catch:{ ConnectTimeoutException -> 0x00cb, SocketTimeoutException -> 0x00c9, Exception -> 0x00c7 }
                    r4 = 1
                    goto L_0x00e6
                L_0x00c7:
                    r4 = 1
                    goto L_0x00cd
                L_0x00c9:
                    r4 = 1
                    goto L_0x00d5
                L_0x00cb:
                    r4 = 1
                    goto L_0x00dd
                L_0x00cd:
                    java.lang.String r0 = "openSDK_LOG.ReportManager"
                    java.lang.String r1 = "-->ReportCenter httpRequest Exception"
                    com.tencent.open.a.f.b(r0, r1)     // Catch:{ Exception -> 0x0100 }
                    goto L_0x00e6
                L_0x00d5:
                    java.lang.String r6 = "openSDK_LOG.ReportManager"
                    java.lang.String r7 = "-->ReportCenter httpRequest SocketTimeoutException"
                    com.tencent.open.a.f.b(r6, r7)     // Catch:{ Exception -> 0x0100 }
                    goto L_0x00e4
                L_0x00dd:
                    java.lang.String r6 = "openSDK_LOG.ReportManager"
                    java.lang.String r7 = "-->ReportCenter httpRequest ConnectTimeoutException"
                    com.tencent.open.a.f.b(r6, r7)     // Catch:{ Exception -> 0x0100 }
                L_0x00e4:
                    if (r3 < r0) goto L_0x0091
                L_0x00e6:
                    if (r4 != r5) goto L_0x00f0
                    java.lang.String r0 = "openSDK_LOG.ReportManager"
                    java.lang.String r1 = "-->ReportCenter httpRequest Thread request success"
                    com.tencent.open.a.f.b(r0, r1)     // Catch:{ Exception -> 0x0100 }
                    goto L_0x0107
                L_0x00f0:
                    java.lang.String r0 = "openSDK_LOG.ReportManager"
                    java.lang.String r1 = "-->ReportCenter httpRequest Thread request failed"
                    com.tencent.open.a.f.b(r0, r1)     // Catch:{ Exception -> 0x0100 }
                    return
                L_0x00f8:
                    java.lang.String r0 = "openSDK_LOG.ReportManager"
                    java.lang.String r1 = "-->httpRequest unkonw request method return."
                    com.tencent.open.a.f.e(r0, r1)     // Catch:{ Exception -> 0x0100 }
                    return
                L_0x0100:
                    java.lang.String r0 = "openSDK_LOG.ReportManager"
                    java.lang.String r1 = "-->httpRequest, exception in serial executor."
                    com.tencent.open.a.f.b(r0, r1)
                L_0x0107:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.g.AnonymousClass6.run():void");
            }
        };
        com.tencent.open.d.g.a(r0);
    }

    public final void a(String str, long j, long j2, long j3, int i) {
        a(str, j, j2, j3, i, "", false);
    }

    public final void a(String str, long j, long j2, long j3, int i, String str2, boolean z) {
        int i2 = i;
        f.a("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j + " | reqSize:" + j2 + " | rspSize: " + j3 + " | responseCode: " + i2 + " | detail: " + str2);
        if (a("report_cgi", i2)) {
            Executor executor = this.h;
            final long j4 = j;
            final String str3 = str;
            final String str4 = str2;
            final int i3 = i;
            final long j5 = j2;
            final long j6 = j3;
            AnonymousClass3 r0 = new Runnable(false) {
                public final void run() {
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - j4;
                        Bundle bundle = new Bundle();
                        String a2 = a.a(c.a());
                        bundle.putString("apn", a2);
                        bundle.putString("appid", "1000067");
                        bundle.putString("commandid", str3);
                        bundle.putString("detail", str4);
                        bundle.putString("deviceInfo", "network=" + a2 + '&' + "sdcard=" + (Environment.getExternalStorageState().equals("mounted") ? 1 : 0) + '&' + "wifi=" + a.c(c.a()));
                        int i = 100;
                        int a3 = 100 / g.a(i3);
                        if (a3 <= 0) {
                            i = 1;
                        } else if (a3 <= 100) {
                            i = a3;
                        }
                        bundle.putString("frequency", i);
                        bundle.putString("reqSize", j5);
                        bundle.putString("resultCode", i3);
                        bundle.putString("rspSize", j6);
                        bundle.putString("timeCost", elapsedRealtime);
                        bundle.putString("uin", "1000");
                        g.this.f79692c.add(new b(bundle));
                        int size = g.this.f79692c.size();
                        int a4 = d.a(c.a(), null).a("Agent_ReportTimeInterval");
                        if (a4 == 0) {
                            a4 = 10000;
                        }
                        if (!g.a("report_cgi", size)) {
                            if (!false) {
                                if (!g.this.f79695f.hasMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE)) {
                                    Message obtain = Message.obtain();
                                    obtain.what = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                                    g.this.f79695f.sendMessageDelayed(obtain, (long) a4);
                                }
                                return;
                            }
                        }
                        g.this.b();
                        g.this.f79695f.removeMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                    } catch (Exception e2) {
                        f.b("openSDK_LOG.ReportManager", "--> reportCGI, exception in sub thread.", e2);
                    }
                }
            };
            executor.execute(r0);
        }
    }
}
