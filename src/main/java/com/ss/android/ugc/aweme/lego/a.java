package com.ss.android.ugc.aweme.lego;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import android.support.annotation.AnyThread;
import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.a.b;
import com.ss.android.ugc.aweme.lego.a.c;
import com.ss.android.ugc.aweme.lego.a.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006FGHIJKB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007J \u0010#\u001a\u00020\u00002\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0%2\u0006\u0010'\u001a\u00020&H\u0007J \u0010#\u001a\u00020\u00002\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0%2\u0006\u0010)\u001a\u00020(H\u0007J\u0006\u0010*\u001a\u00020 J\u0006\u0010+\u001a\u00020 J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020.H\u0007J#\u0010/\u001a\u0002H0\"\u0004\b\u0000\u001002\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0%H\u0007¢\u0006\u0002\u00101J#\u00102\u001a\u0002H0\"\u0004\b\u0000\u001002\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0%H\u0007¢\u0006\u0002\u00101J\b\u00103\u001a\u00020 H\u0002J\b\u00104\u001a\u00020 H\u0002J\b\u00105\u001a\u00020 H\u0002J\b\u00106\u001a\u00020 H\u0002J\b\u00107\u001a\u00020 H\u0002J\b\u00108\u001a\u000209H\u0007J\u0010\u0010:\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020;H\u0007J\b\u0010<\u001a\u00020 H\u0002J\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u00020>J\b\u0010@\u001a\u00020AH\u0007J\b\u0010B\u001a\u00020CH\u0007J\b\u0010D\u001a\u00020EH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/Lego;", "", "()V", "DELAY_BOOT_FINISH_ENSURE", "", "DELAY_REQUEST_IDLE", "DELAY_REQUEST_SPARSE", "DELAY_WORK_SPARSE", "DURATION_REQUEST_SPARSE", "DURATION_WORK_SPARSE", "MSG_BOOT_FINISH_ENSURE", "", "MSG_REQUEST_IDLE", "MSG_REQUEST_SPARSE", "MSG_WORK_BOOT_FINISH", "MSG_WORK_IDLE", "MSG_WORK_SPARSE", "bootState", "Lcom/ss/android/ugc/aweme/lego/Lego$BootState;", "context", "Landroid/content/Context;", "inflateProcessor", "Lcom/ss/android/ugc/aweme/lego/processor/InflateProcessor;", "mainHandler", "Lcom/ss/android/ugc/aweme/lego/Lego$MainHandler;", "requestProcessor", "Lcom/ss/android/ugc/aweme/lego/processor/RequestProcessor;", "serviceProcessor", "Lcom/ss/android/ugc/aweme/lego/processor/ServiceProcessor;", "taskProcess", "Lcom/ss/android/ugc/aweme/lego/processor/TaskProcessor;", "addActivity", "", "activity", "Landroid/app/Activity;", "addProvider", "name", "Ljava/lang/Class;", "Lcom/ss/android/ugc/aweme/lego/LegoInflate;", "inflate", "Lcom/ss/android/ugc/aweme/lego/LegoService;", "service", "bootFinish", "bootReset", "ensureTask", "task", "Lcom/ss/android/ugc/aweme/lego/LegoTask;", "getInflate", "T", "(Ljava/lang/Class;)Ljava/lang/Object;", "getService", "handleRequestIdle", "handleRequestSparse", "handleWorkBootFinish", "handleWorkIdle", "handleWorkSparse", "inflateTransaction", "Lcom/ss/android/ugc/aweme/lego/Lego$InflateTransaction;", "init", "Landroid/app/Application;", "initIdle", "isBootFinish", "", "isColdBoot", "requestTransaction", "Lcom/ss/android/ugc/aweme/lego/Lego$RequestTransaction;", "serviceTransaction", "Lcom/ss/android/ugc/aweme/lego/Lego$ServiceTransaction;", "taskTransaction", "Lcom/ss/android/ugc/aweme/lego/Lego$TaskTransaction;", "BootState", "InflateTransaction", "MainHandler", "RequestTransaction", "ServiceTransaction", "TaskTransaction", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"StaticFieldLeak", "CI_StaticFieldLeak"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3404a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f3405b = new d();

    /* renamed from: c  reason: collision with root package name */
    public static final b f3406c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final c f3407d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.lego.a.a f3408e = new com.ss.android.ugc.aweme.lego.a.a();

    /* renamed from: f  reason: collision with root package name */
    public static Context f3409f;
    public static c g;
    public static C0611a h = C0611a.COLD_BOOT_BEGIN;
    public static final a i = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\u00002\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007H\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007R(\u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/Lego$ServiceTransaction;", "", "()V", "cache", "", "Lcom/ss/android/ugc/aweme/lego/WorkType;", "", "Ljava/lang/Class;", "Lcom/ss/android/ugc/aweme/lego/LegoService;", "addService", "name", "commit", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f3410a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<f, List<Class<? extends LegoService>>> f3411b = new HashMap();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.lego.a$e$a  reason: collision with other inner class name */
        static final class C0615a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53039a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Class f53040b;

            C0615a(Class cls) {
                this.f53040b = cls;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53039a, false, 55108, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53039a, false, 55108, new Class[0], Void.TYPE);
                    return;
                }
                a.f3407d.b(this.f53040b);
            }
        }

        public e() {
            for (f put : f.values()) {
                this.f3411b.put(put, new ArrayList());
            }
        }

        @MainThread
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f3410a, false, 55107, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3410a, false, 55107, new Class[0], Void.TYPE);
            } else if (!this.f3411b.isEmpty()) {
                for (f fVar : f.values()) {
                    c a2 = a.f3407d;
                    List<Class<? extends LegoService>> list = this.f3411b.get(fVar);
                    if (list == null) {
                        Intrinsics.throwNpe();
                    }
                    a2.a(fVar, list);
                }
                for (Class b2 : a.f3407d.c(f.MAIN)) {
                    a.f3407d.b(b2);
                }
                for (Class aVar : a.f3407d.c(f.BACKGROUND)) {
                    b.a().execute(new C0615a(aVar));
                }
                if (a.f3407d.a(f.SPARSE) && !a.b(a.i).hasMessages(1202)) {
                    a.b(a.i).a(1202);
                }
                if (a.f3407d.a(f.IDLE)) {
                    a.b(a.i).a(1200);
                }
                this.f3411b.clear();
            }
        }

        @NotNull
        @MainThread
        public final e a(@NotNull Class<? extends LegoService> cls) {
            if (PatchProxy.isSupport(new Object[]{cls}, this, f3410a, false, 55106, new Class[]{Class.class}, e.class)) {
                return (e) PatchProxy.accessDispatch(new Object[]{cls}, this, f3410a, false, 55106, new Class[]{Class.class}, e.class);
            }
            Intrinsics.checkParameterIsNotNull(cls, "name");
            LegoService c2 = a.f3407d.c(cls);
            if (c2 != null) {
                List<Class<? extends LegoService>> list = this.f3411b.get(c2.type());
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                list.add(cls);
            }
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/Lego$TaskTransaction;", "", "()V", "cache", "", "Lcom/ss/android/ugc/aweme/lego/WorkType;", "", "Lcom/ss/android/ugc/aweme/lego/LegoTask;", "addTask", "task", "name", "", "commit", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f3412a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<f, List<LegoTask>> f3413b = new HashMap();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.lego.a$f$a  reason: collision with other inner class name */
        static final class C0616a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53041a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LegoTask f53042b;

            C0616a(LegoTask legoTask) {
                this.f53042b = legoTask;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53041a, false, 55112, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53041a, false, 55112, new Class[0], Void.TYPE);
                    return;
                }
                a.f3405b.b(this.f53042b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53043a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LegoTask f53044b;

            b(LegoTask legoTask) {
                this.f53044b = legoTask;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53043a, false, 55113, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53043a, false, 55113, new Class[0], Void.TYPE);
                    return;
                }
                a.f3405b.b(this.f53044b);
            }
        }

        public f() {
            for (f put : f.values()) {
                this.f3413b.put(put, new ArrayList());
            }
        }

        @MainThread
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f3412a, false, 55111, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3412a, false, 55111, new Class[0], Void.TYPE);
            } else if (!this.f3413b.isEmpty()) {
                for (f fVar : f.values()) {
                    d d2 = a.f3405b;
                    List<LegoTask> list = this.f3413b.get(fVar);
                    if (list == null) {
                        Intrinsics.throwNpe();
                    }
                    d2.b(fVar, list);
                }
                d d3 = a.f3405b;
                f fVar2 = f.MAIN;
                List<LegoTask> list2 = this.f3413b.get(f.MAIN);
                if (list2 == null) {
                    Intrinsics.throwNpe();
                }
                for (LegoTask b2 : d3.a(fVar2, list2)) {
                    a.f3405b.b(b2);
                }
                d d4 = a.f3405b;
                f fVar3 = f.BACKGROUND;
                List<LegoTask> list3 = this.f3413b.get(f.BACKGROUND);
                if (list3 == null) {
                    Intrinsics.throwNpe();
                }
                for (LegoTask aVar : d4.a(fVar3, list3)) {
                    b.a().execute(new C0616a(aVar));
                }
                if (a.h != C0611a.COLD_BOOT_BEGIN) {
                    d d5 = a.f3405b;
                    f fVar4 = f.BOOT_FINISH;
                    List<LegoTask> list4 = this.f3413b.get(f.BOOT_FINISH);
                    if (list4 == null) {
                        Intrinsics.throwNpe();
                    }
                    for (LegoTask bVar : d5.a(fVar4, list4)) {
                        b.a().execute(new b(bVar));
                    }
                }
                if (a.f3405b.a(f.SPARSE) && !a.b(a.i).hasMessages(1202)) {
                    a.b(a.i).a(1202);
                }
                if (a.f3405b.a(f.IDLE)) {
                    a.b(a.i).a(1200);
                }
                this.f3413b.clear();
            }
        }

        @NotNull
        @MainThread
        public final f a(@NotNull LegoTask legoTask) {
            if (PatchProxy.isSupport(new Object[]{legoTask}, this, f3412a, false, 55109, new Class[]{LegoTask.class}, f.class)) {
                return (f) PatchProxy.accessDispatch(new Object[]{legoTask}, this, f3412a, false, 55109, new Class[]{LegoTask.class}, f.class);
            }
            Intrinsics.checkParameterIsNotNull(legoTask, "task");
            List<LegoTask> list = this.f3413b.get(legoTask.type());
            if (list == null) {
                Intrinsics.throwNpe();
            }
            list.add(legoTask);
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/Lego$BootState;", "", "(Ljava/lang/String;I)V", "COLD_BOOT_BEGIN", "COLD_BOOT_END", "HOT_BOOT_BEGIN", "HOT_BOOT_END", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.lego.a$a  reason: collision with other inner class name */
    public enum C0611a {
        COLD_BOOT_BEGIN,
        COLD_BOOT_END,
        HOT_BOOT_BEGIN,
        HOT_BOOT_END;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\u00002\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H\u0007J\b\u0010\t\u001a\u00020\nH\u0007R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/Lego$InflateTransaction;", "", "()V", "cache", "", "Ljava/lang/Class;", "Lcom/ss/android/ugc/aweme/lego/LegoInflate;", "addInflate", "name", "commit", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53016a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Class<? extends c>> f53017b = new ArrayList();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.lego.a$b$a  reason: collision with other inner class name */
        static final class C0613a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53021a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Class f53022b;

            C0613a(Class cls) {
                this.f53022b = cls;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53021a, false, 55097, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53021a, false, 55097, new Class[0], Void.TYPE);
                    return;
                }
                a.f3408e.c(this.f53022b);
            }
        }

        @MainThread
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f53016a, false, 55096, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53016a, false, 55096, new Class[0], Void.TYPE);
            } else if (!this.f53017b.isEmpty()) {
                for (Class<? extends c> aVar : this.f53017b) {
                    b.b().post(new C0613a(aVar));
                }
                this.f53017b.clear();
            }
        }

        @NotNull
        @MainThread
        public final b a(@NotNull Class<? extends c> cls) {
            if (PatchProxy.isSupport(new Object[]{cls}, this, f53016a, false, 55095, new Class[]{Class.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{cls}, this, f53016a, false, 55095, new Class[]{Class.class}, b.class);
            }
            Intrinsics.checkParameterIsNotNull(cls, "name");
            if (a.f3408e.b(cls)) {
                return this;
            }
            this.f53017b.add(cls);
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/Lego$MainHandler;", "Landroid/os/Handler;", "()V", "handleMessage", "", "msg", "Landroid/os/Message;", "sendMsg", "what", "", "delay", "", "obj", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53023a;

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f53023a, false, 55099, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f53023a, false, 55099, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            a(i, 0);
        }

        public final void handleMessage(@Nullable Message message) {
            Integer num;
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f53023a, false, 55098, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f53023a, false, 55098, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            if (message2 != null) {
                num = Integer.valueOf(message2.what);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1205) {
                a.i.e();
                return;
            }
            if (num != null && num.intValue() == 1201) {
                a aVar = a.i;
                if (PatchProxy.isSupport(new Object[0], aVar, a.f3404a, false, 55089, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f3404a, false, 55089, new Class[0], Void.TYPE);
                } else {
                    Class b2 = a.f3407d.b(f.BOOT_FINISH);
                    if (b2 != null) {
                        b.a().execute(new i(b2));
                    }
                    LegoTask b3 = a.f3405b.b(f.BOOT_FINISH);
                    if (b3 != null) {
                        b.a().execute(new j(b3));
                    }
                    if (a.f3407d.a(f.BOOT_FINISH) || a.f3405b.a(f.BOOT_FINISH)) {
                        c cVar = a.g;
                        if (cVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
                        }
                        cVar.a(1201, 50);
                    }
                }
            } else if (num != null && num.intValue() == 1202) {
                a aVar2 = a.i;
                if (PatchProxy.isSupport(new Object[0], aVar2, a.f3404a, false, 55090, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar2, a.f3404a, false, 55090, new Class[0], Void.TYPE);
                } else {
                    Class b4 = a.f3407d.b(f.SPARSE);
                    if (b4 != null) {
                        b.a().execute(new m(b4));
                    }
                    LegoTask b5 = a.f3405b.b(f.SPARSE);
                    if (b5 != null) {
                        b.a().execute(new n(b5));
                    }
                    if (a.f3407d.a(f.SPARSE) || a.f3405b.a(f.SPARSE)) {
                        c cVar2 = a.g;
                        if (cVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
                        }
                        cVar2.a(1202, 50);
                    }
                }
            } else if (num != null && num.intValue() == 1203) {
                a aVar3 = a.i;
                if (PatchProxy.isSupport(new Object[0], aVar3, a.f3404a, false, 55091, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar3, a.f3404a, false, 55091, new Class[0], Void.TYPE);
                } else {
                    if (a.f3406c.a(e.SPARSE)) {
                        d c2 = a.f3406c.c(e.SPARSE);
                        if (c2 != null) {
                            b.f53063b.a(e.SPARSE).execute(new h(c2));
                        }
                    }
                    if (a.f3406c.a(e.SPARSE)) {
                        c cVar3 = a.g;
                        if (cVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
                        }
                        cVar3.a(1203, 2000);
                    }
                }
            } else if (num != null && num.intValue() == 1204) {
                a aVar4 = a.i;
                if (PatchProxy.isSupport(new Object[0], aVar4, a.f3404a, false, 55092, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar4, a.f3404a, false, 55092, new Class[0], Void.TYPE);
                } else if (a.f3406c.a(e.SPARSE)) {
                    c cVar4 = a.g;
                    if (cVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
                    }
                    cVar4.a(1204, 2000);
                } else {
                    if (a.f3406c.a(e.IDLE)) {
                        d c3 = a.f3406c.c(e.IDLE);
                        if (c3 != null) {
                            b.f53063b.a(e.IDLE).execute(new g(c3));
                        }
                    }
                    if (a.f3406c.a(e.IDLE)) {
                        c cVar5 = a.g;
                        if (cVar5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
                        }
                        cVar5.a(1204, 2000);
                    }
                }
            }
        }

        public final void a(int i, long j) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2)}, this, f53023a, false, 55100, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2)}, this, f53023a, false, 55100, new Class[]{Integer.TYPE, Long.TYPE}, Void.TYPE);
                return;
            }
            a(i, j2, null);
        }

        private void a(int i, long j, @Nullable Object obj) {
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), null}, this, f53023a, false, 55101, new Class[]{Integer.TYPE, Long.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), null}, this, f53023a, false, 55101, new Class[]{Integer.TYPE, Long.TYPE, Object.class}, Void.TYPE);
                return;
            }
            Message obtainMessage = obtainMessage();
            obtainMessage.what = i;
            obtainMessage.obj = null;
            removeMessages(i);
            sendMessageDelayed(obtainMessage, j2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/lego/Lego$RequestTransaction;", "", "()V", "cache", "", "Lcom/ss/android/ugc/aweme/lego/RequestType;", "", "Lcom/ss/android/ugc/aweme/lego/LegoRequest;", "addRequest", "request", "commit", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53029a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<e, List<d>> f53030b = new HashMap();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.lego.a$d$a  reason: collision with other inner class name */
        static final class C0614a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53035a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f53036b;

            C0614a(d dVar) {
                this.f53036b = dVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53035a, false, 55104, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53035a, false, 55104, new Class[0], Void.TYPE);
                    return;
                }
                a.f3406c.a(this.f53036b, a.f());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53037a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f53038b;

            b(d dVar) {
                this.f53038b = dVar;
            }

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53037a, false, 55105, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53037a, false, 55105, new Class[0], Void.TYPE);
                    return;
                }
                a.f3406c.a(this.f53038b, a.f());
            }
        }

        public d() {
            for (e put : e.values()) {
                this.f53030b.put(put, new ArrayList());
            }
        }

        @MainThread
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f53029a, false, 55103, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53029a, false, 55103, new Class[0], Void.TYPE);
            } else if (!this.f53030b.isEmpty()) {
                for (e eVar : e.values()) {
                    com.ss.android.ugc.aweme.lego.a.b f2 = a.f3406c;
                    List<d> list = this.f53030b.get(eVar);
                    if (list == null) {
                        Intrinsics.throwNpe();
                    }
                    f2.a(eVar, list);
                }
                for (d aVar : a.f3406c.b(e.P0)) {
                    b.f53063b.a(e.P0).execute(new C0614a(aVar));
                }
                for (d bVar : a.f3406c.b(e.NORMAL)) {
                    b.f53063b.a(e.NORMAL).execute(new b(bVar));
                }
                if (a.g()) {
                    if (!a.b(a.i).hasMessages(1203) && a.f3406c.a(e.SPARSE)) {
                        a.b(a.i).a(1203, 2000);
                    }
                    if (!a.b(a.i).hasMessages(1204) && a.f3406c.a(e.IDLE)) {
                        a.b(a.i).a(1204, 2000);
                    }
                }
                this.f53030b.clear();
            }
        }

        @NotNull
        @MainThread
        public final d a(@NotNull d dVar) {
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f53029a, false, 55102, new Class[]{d.class}, d.class)) {
                return (d) PatchProxy.accessDispatch(new Object[]{dVar}, this, f53029a, false, 55102, new Class[]{d.class}, d.class);
            }
            Intrinsics.checkParameterIsNotNull(dVar, "request");
            List<d> list = this.f53030b.get(dVar.a());
            if (list == null) {
                Intrinsics.throwNpe();
            }
            list.add(dVar);
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53045a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f53046b;

        g(d dVar) {
            this.f53046b = dVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53045a, false, 55114, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53045a, false, 55114, new Class[0], Void.TYPE);
                return;
            }
            a.f3406c.a(this.f53046b, a.f());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53047a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f53048b;

        h(d dVar) {
            this.f53048b = dVar;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53047a, false, 55115, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53047a, false, 55115, new Class[0], Void.TYPE);
                return;
            }
            a.f3406c.a(this.f53048b, a.f());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53049a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f53050b;

        i(Class cls) {
            this.f53050b = cls;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53049a, false, 55116, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53049a, false, 55116, new Class[0], Void.TYPE);
                return;
            }
            a.f3407d.b(this.f53050b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LegoTask f53052b;

        j(LegoTask legoTask) {
            this.f53052b = legoTask;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53051a, false, 55117, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53051a, false, 55117, new Class[0], Void.TYPE);
                return;
            }
            a.f3405b.b(this.f53052b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53053a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f53054b;

        k(Class cls) {
            this.f53054b = cls;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53053a, false, 55118, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53053a, false, 55118, new Class[0], Void.TYPE);
                return;
            }
            a.f3407d.b(this.f53054b);
            a.b(a.i).a(1200);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53055a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LegoTask f53056b;

        l(LegoTask legoTask) {
            this.f53056b = legoTask;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53055a, false, 55119, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53055a, false, 55119, new Class[0], Void.TYPE);
                return;
            }
            a.f3405b.b(this.f53056b);
            a.b(a.i).a(1200);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53057a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f53058b;

        m(Class cls) {
            this.f53058b = cls;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53057a, false, 55120, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53057a, false, 55120, new Class[0], Void.TYPE);
                return;
            }
            a.f3407d.b(this.f53058b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53059a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LegoTask f53060b;

        n(LegoTask legoTask) {
            this.f53060b = legoTask;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53059a, false, 55121, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53059a, false, 55121, new Class[0], Void.TYPE);
                return;
            }
            a.f3405b.b(this.f53060b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/lego/Lego$initIdle$1", "Landroid/os/MessageQueue$IdleHandler;", "queueIdle", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class o implements MessageQueue.IdleHandler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53061a;

        public final boolean queueIdle() {
            if (PatchProxy.isSupport(new Object[0], this, f53061a, false, 55122, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53061a, false, 55122, new Class[0], Boolean.TYPE)).booleanValue();
            }
            a aVar = a.i;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f3404a, false, 55088, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f3404a, false, 55088, new Class[0], Void.TYPE);
            } else {
                Class b2 = a.f3407d.b(f.IDLE);
                if (b2 != null) {
                    b.a().execute(new k(b2));
                }
                LegoTask b3 = a.f3405b.b(f.IDLE);
                if (b3 != null) {
                    b.a().execute(new l(b3));
                }
            }
            return true;
        }
    }

    private a() {
    }

    public static boolean f() {
        if (h == C0611a.COLD_BOOT_BEGIN || h == C0611a.COLD_BOOT_END) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        if (h == C0611a.COLD_BOOT_END || h == C0611a.HOT_BOOT_END) {
            return true;
        }
        return false;
    }

    @NotNull
    @MainThread
    public final f a() {
        if (!PatchProxy.isSupport(new Object[0], this, f3404a, false, 55078, new Class[0], f.class)) {
            return new f();
        }
        return (f) PatchProxy.accessDispatch(new Object[0], this, f3404a, false, 55078, new Class[0], f.class);
    }

    @NotNull
    @MainThread
    public final e b() {
        if (!PatchProxy.isSupport(new Object[0], this, f3404a, false, 55079, new Class[0], e.class)) {
            return new e();
        }
        return (e) PatchProxy.accessDispatch(new Object[0], this, f3404a, false, 55079, new Class[0], e.class);
    }

    @NotNull
    @MainThread
    public final b c() {
        if (!PatchProxy.isSupport(new Object[0], this, f3404a, false, 55080, new Class[0], b.class)) {
            return new b();
        }
        return (b) PatchProxy.accessDispatch(new Object[0], this, f3404a, false, 55080, new Class[0], b.class);
    }

    @NotNull
    @MainThread
    public final d d() {
        if (!PatchProxy.isSupport(new Object[0], this, f3404a, false, 55081, new Class[0], d.class)) {
            return new d();
        }
        return (d) PatchProxy.accessDispatch(new Object[0], this, f3404a, false, 55081, new Class[0], d.class);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3404a, false, 55086, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3404a, false, 55086, new Class[0], Void.TYPE);
            return;
        }
        if (h == C0611a.COLD_BOOT_BEGIN) {
            h = C0611a.COLD_BOOT_END;
            c cVar = g;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
            }
            cVar.a(1201, 1000);
            c cVar2 = g;
            if (cVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
            }
            cVar2.a(1203, 1000);
            c cVar3 = g;
            if (cVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
            }
            cVar3.a(1204, 60000);
        }
        if (h == C0611a.HOT_BOOT_BEGIN) {
            h = C0611a.HOT_BOOT_END;
            c cVar4 = g;
            if (cVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
            }
            cVar4.a(1203, 1000);
            c cVar5 = g;
            if (cVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
            }
            cVar5.a(1204, 60000);
        }
    }

    public static final /* synthetic */ c b(a aVar) {
        c cVar = g;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mainHandler");
        }
        return cVar;
    }

    @MainThread
    public final <T> T b(@NotNull Class<? extends c> cls) {
        Class<? extends c> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f3404a, false, 55083, new Class[]{Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls2}, this, f3404a, false, 55083, new Class[]{Class.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(cls2, "name");
        return f3408e.a(cls2);
    }

    @AnyThread
    public final <T> T a(@NotNull Class<? extends LegoService> cls) {
        Class<? extends LegoService> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, f3404a, false, 55082, new Class[]{Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls2}, this, f3404a, false, 55082, new Class[]{Class.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(cls2, "name");
        return f3407d.a(cls2);
    }

    @AnyThread
    public final void a(@NotNull LegoTask legoTask) {
        LegoTask legoTask2 = legoTask;
        if (PatchProxy.isSupport(new Object[]{legoTask2}, this, f3404a, false, 55085, new Class[]{LegoTask.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{legoTask2}, this, f3404a, false, 55085, new Class[]{LegoTask.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(legoTask2, "task");
        f3405b.a(legoTask2);
    }

    @NotNull
    @MainThread
    public final a a(@NotNull Class<? extends LegoService> cls, @NotNull LegoService legoService) {
        Class<? extends LegoService> cls2 = cls;
        LegoService legoService2 = legoService;
        if (PatchProxy.isSupport(new Object[]{cls2, legoService2}, this, f3404a, false, 55076, new Class[]{Class.class, LegoService.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{cls2, legoService2}, this, f3404a, false, 55076, new Class[]{Class.class, LegoService.class}, a.class);
        }
        Intrinsics.checkParameterIsNotNull(cls2, "name");
        Intrinsics.checkParameterIsNotNull(legoService2, "service");
        f3407d.a(cls2, legoService2);
        return this;
    }

    @NotNull
    @MainThread
    public final a a(@NotNull Class<? extends c> cls, @NotNull c cVar) {
        Class<? extends c> cls2 = cls;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cls2, cVar2}, this, f3404a, false, 55077, new Class[]{Class.class, c.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{cls2, cVar2}, this, f3404a, false, 55077, new Class[]{Class.class, c.class}, a.class);
        }
        Intrinsics.checkParameterIsNotNull(cls2, "name");
        Intrinsics.checkParameterIsNotNull(cVar2, "inflate");
        f3408e.a(cls2, cVar2);
        return this;
    }
}
