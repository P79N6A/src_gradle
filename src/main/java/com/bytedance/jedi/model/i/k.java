package com.bytedance.jedi.model.i;

import android.os.Environment;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.jedi.model.i.d;
import com.bytedance.jedi.model.i.e;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010%\u001a\u00020&2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(2\n\u0010)\u001a\u0006\u0012\u0002\b\u00030*H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b$\u0010\f\u001a\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Lcom/bytedance/jedi/model/util/SyncLog;", "Lcom/bytedance/jedi/model/util/IJediModelLogger;", "()V", "MAX_BYTES", "", "androidLogAdapter", "Lcom/orhanobut/logger/LogAdapter;", "defaultFormatStrategy", "Lcom/bytedance/jedi/model/util/JediFormatStrategy;", "getDefaultFormatStrategy", "()Lcom/bytedance/jedi/model/util/JediFormatStrategy;", "defaultFormatStrategy$delegate", "Lkotlin/Lazy;", "disk", "", "getDisk", "()Z", "setDisk", "(Z)V", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor$delegate", "isUt", "setUt", "tag", "", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "utFormatStrategy", "Lcom/orhanobut/logger/FormatStrategy;", "getUtFormatStrategy", "()Lcom/orhanobut/logger/FormatStrategy;", "utFormatStrategy$delegate", "onEvent", "", "tracePoint", "Lcom/bytedance/jedi/model/traceable/ITracePoint;", "traceable", "Lcom/bytedance/jedi/model/traceable/ITraceable;", "model_release"}, k = 1, mv = {1, 1, 15})
public final class k implements c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f21746a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(k.class), "defaultFormatStrategy", "getDefaultFormatStrategy()Lcom/bytedance/jedi/model/util/JediFormatStrategy;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(k.class), "utFormatStrategy", "getUtFormatStrategy()Lcom/orhanobut/logger/FormatStrategy;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(k.class), "executor", "getExecutor()Ljava/util/concurrent/Executor;"))};

    /* renamed from: b  reason: collision with root package name */
    static boolean f21747b = false;

    /* renamed from: c  reason: collision with root package name */
    static boolean f21748c = false;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    static String f21749d = "REPO_SYNC";

    /* renamed from: e  reason: collision with root package name */
    static final int f21750e = f21750e;

    /* renamed from: f  reason: collision with root package name */
    static final Lazy f21751f = LazyKt.lazy(b.INSTANCE);
    static final Lazy g = LazyKt.lazy(e.INSTANCE);
    public static final k h = new k();
    private static com.c.a.b i = new a();
    private static final Lazy j = LazyKt.lazy(c.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/jedi/model/util/SyncLog$androidLogAdapter$1", "Lcom/orhanobut/logger/LogAdapter;", "isLoggable", "", "priority", "", "tag", "", "log", "", "message", "model_release"}, k = 1, mv = {1, 1, 15})
    public static final class a implements com.c.a.b {
        a() {
        }

        public final boolean a() {
            return f.f2303a;
        }

        public final void a(int i, @Nullable String str, @NotNull String str2) {
            com.c.a.a aVar;
            Intrinsics.checkParameterIsNotNull(str2, "message");
            if (k.f21747b) {
                k kVar = k.h;
                aVar = (com.c.a.a) k.g.getValue();
            } else {
                k kVar2 = k.h;
                e eVar = (e) k.f21751f.getValue();
                Intrinsics.checkExpressionValueIsNotNull(eVar, "defaultFormatStrategy");
                aVar = eVar;
            }
            aVar.a(i, str, str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/util/JediFormatStrategy;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<e> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        @NotNull
        public final e invoke() {
            e.a a2 = e.a().a(k.f21749d);
            if (k.f21748c) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                Intrinsics.checkExpressionValueIsNotNull(externalStorageDirectory, "Environment.getExternalStorageDirectory()");
                String absolutePath = externalStorageDirectory.getAbsolutePath();
                HandlerThread handlerThread = new HandlerThread("AndroidFileLogger." + r1);
                handlerThread.start();
                Looper looper = handlerThread.getLooper();
                k kVar = k.h;
                a2.f21717a = new d(new d.a(looper, absolutePath + File.separatorChar + "logger", k.f21750e));
            }
            return a2.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/model/util/SerialExecutor;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<j> {
        public static final c INSTANCE = new c();

        c() {
            super(0);
        }

        @NotNull
        public final j invoke() {
            return new j();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.jedi.model.h.b f21752a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f21753b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f21754c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Pair f21755d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.bytedance.jedi.model.h.a f21756e;

        d(com.bytedance.jedi.model.h.b bVar, long j, long j2, Pair pair, com.bytedance.jedi.model.h.a aVar) {
            this.f21752a = bVar;
            this.f21753b = j;
            this.f21754c = j2;
            this.f21755d = pair;
            this.f21756e = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a7, code lost:
            if (r2 == null) goto L_0x00a9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                com.bytedance.jedi.model.h.b r0 = r7.f21752a
                java.lang.Object r0 = r0.a()
                boolean r1 = r0 instanceof kotlin.Pair
                r2 = 0
                if (r1 != 0) goto L_0x000c
                r0 = r2
            L_0x000c:
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 == 0) goto L_0x0014
                java.lang.Object r2 = r0.getSecond()
            L_0x0014:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "[time："
                r0.<init>(r1)
                long r3 = r7.f21753b
                r0.append(r3)
                r1 = 93
                r0.append(r1)
                java.lang.String r3 = "[dur："
                r0.append(r3)
                long r3 = r7.f21754c
                r0.append(r3)
                r0.append(r1)
                java.lang.String r3 = "[from："
                r0.append(r3)
                kotlin.Pair r3 = r7.f21755d
                r0.append(r3)
                r0.append(r1)
                java.lang.String r3 = "[to："
                r0.append(r3)
                com.bytedance.jedi.model.h.a r3 = r7.f21756e
                r0.append(r3)
                r0.append(r1)
                java.lang.String r3 = "[size: "
                r0.append(r3)
                long[] r3 = com.bytedance.jedi.model.i.g.a((java.lang.Object) r2)
                r4 = 1
                r4 = r3[r4]
                r0.append(r4)
                r3 = 47
                r0.append(r3)
                long[] r3 = com.bytedance.jedi.model.i.g.a((java.lang.Object) r2)
                r4 = 0
                r5 = r3[r4]
                r0.append(r5)
                r0.append(r1)
                java.lang.String r3 = "[content："
                r0.append(r3)
                if (r2 == 0) goto L_0x00a9
                java.lang.String r2 = r2.toString()
                if (r2 == 0) goto L_0x00a9
                int r3 = r2.length()
                r5 = 200(0xc8, float:2.8E-43)
                if (r3 <= r5) goto L_0x00a7
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                if (r2 == 0) goto L_0x009f
                java.lang.String r2 = r2.substring(r4, r5)
                java.lang.String r5 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r5)
                r3.append(r2)
                java.lang.String r2 = "..."
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                goto L_0x00a7
            L_0x009f:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x00a7:
                if (r2 != 0) goto L_0x00ab
            L_0x00a9:
                java.lang.String r2 = "null"
            L_0x00ab:
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Object[] r1 = new java.lang.Object[r4]
                com.c.a.e.a(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.model.i.k.d.run():void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/orhanobut/logger/FormatStrategy;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function0<com.c.a.a> {
        public static final e INSTANCE = new e();

        e() {
            super(0);
        }

        @NotNull
        public final com.c.a.a invoke() {
            return AnonymousClass1.f21757a;
        }
    }

    private k() {
    }

    static {
        com.c.a.e.a(i);
    }

    public final void a(@NotNull com.bytedance.jedi.model.h.a<?> aVar, @NotNull com.bytedance.jedi.model.h.b<?> bVar) {
        long j2;
        Intrinsics.checkParameterIsNotNull(aVar, "tracePoint");
        Intrinsics.checkParameterIsNotNull(bVar, "traceable");
        long currentTimeMillis = System.currentTimeMillis();
        Pair<com.bytedance.jedi.model.h.a<?>, Long> b2 = bVar.b();
        if (b2 != null) {
            Long l = (Long) b2.getSecond();
            if (l != null) {
                j2 = l.longValue();
                d dVar = new d(bVar, currentTimeMillis, currentTimeMillis - j2, b2, aVar);
                ((Executor) j.getValue()).execute(dVar);
            }
        }
        j2 = currentTimeMillis;
        d dVar2 = new d(bVar, currentTimeMillis, currentTimeMillis - j2, b2, aVar);
        ((Executor) j.getValue()).execute(dVar2);
    }
}
