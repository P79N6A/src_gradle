package com.ss.android.ugc.aweme.lancet;

import a.i;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.client.Request;
import com.google.common.util.concurrent.q;
import com.google.common.util.concurrent.v;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.thread.h;
import java.lang.reflect.Type;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001a\u001b\u001cB\u0005¢\u0006\u0002\u0010\u0002J0\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u001c\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0019H\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/lancet/MockDataCallAdapterFactory;", "Lcom/bytedance/retrofit2/CallAdapter$Factory;", "()V", "booleanAsIntAdapter", "com/ss/android/ugc/aweme/lancet/MockDataCallAdapterFactory$booleanAsIntAdapter$1", "Lcom/ss/android/ugc/aweme/lancet/MockDataCallAdapterFactory$booleanAsIntAdapter$1;", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "get", "Lcom/bytedance/retrofit2/CallAdapter;", "returnType", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lcom/bytedance/retrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lcom/bytedance/retrofit2/Retrofit;)Lcom/bytedance/retrofit2/CallAdapter;", "getFeedItemListFromAssets", "Lcom/ss/android/ugc/aweme/feed/model/FeedItemList;", "needMockFeed", "", "R", "call", "Lcom/bytedance/retrofit2/Call;", "Companion", "ListenableFutureCallAdapter", "TaskDelegateCallAdapter", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends CallAdapter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52940a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f52941b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final d f52942c = new d();

    /* renamed from: d  reason: collision with root package name */
    private final Gson f52943d = new GsonBuilder().registerTypeAdapter(Boolean.TYPE, this.f52942c).registerTypeAdapter(Boolean.TYPE, this.f52942c).create();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/lancet/MockDataCallAdapterFactory$Companion;", "", "()V", "ASSETS_FEED", "", "FEED_URL", "create", "Lcom/ss/android/ugc/aweme/lancet/MockDataCallAdapterFactory;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52944a;

        private a() {
        }

        @JvmStatic
        @NotNull
        public final e a() {
            if (!PatchProxy.isSupport(new Object[0], this, f52944a, false, 54955, new Class[0], e.class)) {
                return new e();
            }
            return (e) PatchProxy.accessDispatch(new Object[0], this, f52944a, false, 54955, new Class[0], e.class);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0016J\f\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/lancet/MockDataCallAdapterFactory$ListenableFutureCallAdapter;", "Lcom/bytedance/retrofit2/CallAdapter;", "Lcom/google/common/util/concurrent/ListenableFuture;", "originalCallAdapter", "(Lcom/ss/android/ugc/aweme/lancet/MockDataCallAdapterFactory;Lcom/bytedance/retrofit2/CallAdapter;)V", "adapt", "R", "call", "Lcom/bytedance/retrofit2/Call;", "mockListenableRecommendFeed", "responseType", "Ljava/lang/reflect/Type;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    final class b implements CallAdapter<q<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52945a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f52946b;

        /* renamed from: c  reason: collision with root package name */
        private final CallAdapter<?> f52947c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/feed/model/FeedItemList;", "call"}, k = 3, mv = {1, 1, 15})
        static final class a<V> implements Callable<FeedItemList> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52948a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f52949b;

            a(b bVar) {
                this.f52949b = bVar;
            }

            public final /* synthetic */ Object call() {
                if (!PatchProxy.isSupport(new Object[0], this, f52948a, false, 54959, new Class[0], FeedItemList.class)) {
                    return this.f52949b.f52946b.a();
                }
                return (FeedItemList) PatchProxy.accessDispatch(new Object[0], this, f52948a, false, 54959, new Class[0], FeedItemList.class);
            }
        }

        @NotNull
        public final Type a() {
            if (PatchProxy.isSupport(new Object[0], this, f52945a, false, 54958, new Class[0], Type.class)) {
                return (Type) PatchProxy.accessDispatch(new Object[0], this, f52945a, false, 54958, new Class[0], Type.class);
            }
            Type a2 = this.f52947c.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "originalCallAdapter.responseType()");
            return a2;
        }

        public final /* synthetic */ Object a(Call call) {
            q qVar;
            Object obj;
            if (PatchProxy.isSupport(new Object[]{call}, this, f52945a, false, 54956, new Class[]{Call.class}, q.class)) {
                obj = PatchProxy.accessDispatch(new Object[]{call}, this, f52945a, false, 54956, new Class[]{Call.class}, q.class);
            } else {
                Intrinsics.checkParameterIsNotNull(call, "call");
                if (this.f52946b.a(call)) {
                    if (PatchProxy.isSupport(new Object[0], this, f52945a, false, 54957, new Class[0], q.class)) {
                        qVar = (q) PatchProxy.accessDispatch(new Object[0], this, f52945a, false, 54957, new Class[0], q.class);
                        return qVar;
                    }
                    q a2 = v.a(h.c()).a(new a(this));
                    Intrinsics.checkExpressionValueIsNotNull(a2, "MoreExecutors\n          …edItemListFromAssets() })");
                    return a2;
                }
                obj = this.f52947c.a(call);
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<*>");
                }
            }
            qVar = (q) obj;
            return qVar;
        }

        public b(e eVar, @NotNull CallAdapter<?> callAdapter) {
            Intrinsics.checkParameterIsNotNull(callAdapter, "originalCallAdapter");
            this.f52946b = eVar;
            this.f52947c = callAdapter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0002J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/lancet/MockDataCallAdapterFactory$TaskDelegateCallAdapter;", "Lcom/bytedance/retrofit2/CallAdapter;", "Lbolts/Task;", "originalCallAdapter", "(Lcom/ss/android/ugc/aweme/lancet/MockDataCallAdapterFactory;Lcom/bytedance/retrofit2/CallAdapter;)V", "adapt", "R", "call", "Lcom/bytedance/retrofit2/Call;", "mockTaskRecommendFeed", "Lcom/ss/android/ugc/aweme/feed/model/FeedItemList;", "responseType", "Ljava/lang/reflect/Type;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    final class c implements CallAdapter<i<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52950a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f52951b;

        /* renamed from: c  reason: collision with root package name */
        private final CallAdapter<?> f52952c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/feed/model/FeedItemList;", "call"}, k = 3, mv = {1, 1, 15})
        static final class a<V> implements Callable<TResult> {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f52953a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f52954b;

            a(c cVar) {
                this.f52954b = cVar;
            }

            public final /* synthetic */ Object call() {
                if (!PatchProxy.isSupport(new Object[0], this, f52953a, false, 54963, new Class[0], FeedItemList.class)) {
                    return this.f52954b.f52951b.a();
                }
                return (FeedItemList) PatchProxy.accessDispatch(new Object[0], this, f52953a, false, 54963, new Class[0], FeedItemList.class);
            }
        }

        @Nullable
        public final Type a() {
            if (!PatchProxy.isSupport(new Object[0], this, f52950a, false, 54960, new Class[0], Type.class)) {
                return this.f52952c.a();
            }
            return (Type) PatchProxy.accessDispatch(new Object[0], this, f52950a, false, 54960, new Class[0], Type.class);
        }

        public final /* synthetic */ Object a(Call call) {
            i iVar;
            Object obj;
            if (PatchProxy.isSupport(new Object[]{call}, this, f52950a, false, 54961, new Class[]{Call.class}, i.class)) {
                obj = PatchProxy.accessDispatch(new Object[]{call}, this, f52950a, false, 54961, new Class[]{Call.class}, i.class);
            } else {
                Intrinsics.checkParameterIsNotNull(call, "call");
                if (this.f52951b.a(call)) {
                    if (PatchProxy.isSupport(new Object[0], this, f52950a, false, 54962, new Class[0], i.class)) {
                        iVar = (i) PatchProxy.accessDispatch(new Object[0], this, f52950a, false, 54962, new Class[0], i.class);
                        return iVar;
                    }
                    i a2 = i.a((Callable<TResult>) new a<TResult>(this));
                    Intrinsics.checkExpressionValueIsNotNull(a2, "Task.callInBackground {\n…romAssets()\n            }");
                    return a2;
                }
                obj = this.f52952c.a(call);
                if (obj == null) {
                    throw new TypeCastException("null cannot be cast to non-null type bolts.Task<*>");
                }
            }
            iVar = (i) obj;
            return iVar;
        }

        public c(e eVar, @NotNull CallAdapter<?> callAdapter) {
            Intrinsics.checkParameterIsNotNull(callAdapter, "originalCallAdapter");
            this.f52951b = eVar;
            this.f52952c = callAdapter;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/lancet/MockDataCallAdapterFactory$booleanAsIntAdapter$1", "Lcom/google/gson/TypeAdapter;", "", "read", "in", "Lcom/google/gson/stream/JsonReader;", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Boolean;", "write", "", "out", "Lcom/google/gson/stream/JsonWriter;", "value", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Boolean;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends TypeAdapter<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f52955a;

        d() {
        }

        public final /* synthetic */ Object read(JsonReader jsonReader) {
            JsonReader jsonReader2 = jsonReader;
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{jsonReader2}, this, f52955a, false, 54964, new Class[]{JsonReader.class}, Boolean.class)) {
                return (Boolean) PatchProxy.accessDispatch(new Object[]{jsonReader2}, this, f52955a, false, 54964, new Class[]{JsonReader.class}, Boolean.class);
            }
            Intrinsics.checkParameterIsNotNull(jsonReader2, "in");
            JsonToken peek = jsonReader.peek();
            if (peek != null) {
                switch (f.f52956a[peek.ordinal()]) {
                    case 1:
                        return Boolean.valueOf(jsonReader.nextBoolean());
                    case 2:
                        jsonReader.nextNull();
                        return null;
                    case 3:
                        if (jsonReader.nextInt() == 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 4:
                        return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
                }
            }
            throw new IllegalStateException("Expected BOOLEAN or NUMBER but was " + peek);
        }

        public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
            JsonWriter jsonWriter2 = jsonWriter;
            Boolean bool = (Boolean) obj;
            if (PatchProxy.isSupport(new Object[]{jsonWriter2, bool}, this, f52955a, false, 54965, new Class[]{JsonWriter.class, Boolean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{jsonWriter2, bool}, this, f52955a, false, 54965, new Class[]{JsonWriter.class, Boolean.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(jsonWriter2, "out");
            if (bool == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter2.value(bool.booleanValue());
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final e b() {
        return PatchProxy.isSupport(new Object[0], null, f52940a, true, 54954, new Class[0], e.class) ? (e) PatchProxy.accessDispatch(new Object[0], null, f52940a, true, 54954, new Class[0], e.class) : f52941b.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0073, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006f, code lost:
        r2 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.feed.model.FeedItemList a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f52940a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.FeedItemList> r7 = com.ss.android.ugc.aweme.feed.model.FeedItemList.class
            r4 = 0
            r5 = 54953(0xd6a9, float:7.7006E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f52940a
            r5 = 0
            r6 = 54953(0xd6a9, float:7.7006E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.FeedItemList> r8 = com.ss.android.ugc.aweme.feed.model.FeedItemList.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.ss.android.ugc.aweme.feed.model.FeedItemList) r0
            return r0
        L_0x0028:
            android.content.Context r0 = com.ttnet.org.chromium.base.ContextUtils.getApplicationContext()
            java.lang.String r1 = "ContextUtils.getApplicationContext()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String r1 = "feed_response.json"
            java.io.InputStream r0 = r0.open(r1)
            java.lang.String r1 = "assetInputString"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r0, r1)
            java.io.Reader r2 = (java.io.Reader) r2
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r2, r1)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = 0
            r2 = r0
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch:{ Throwable -> 0x0071 }
            java.io.Reader r2 = (java.io.Reader) r2     // Catch:{ Throwable -> 0x0071 }
            java.lang.String r2 = kotlin.io.p.b(r2)     // Catch:{ Throwable -> 0x0071 }
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            com.google.gson.Gson r0 = r9.f52943d
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.FeedItemList> r1 = com.ss.android.ugc.aweme.feed.model.FeedItemList.class
            java.lang.Object r0 = r0.fromJson((java.lang.String) r2, (java.lang.Class<T>) r1)
            java.lang.String r1 = "gson.fromJson<FeedItemLi…FeedItemList::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.ss.android.ugc.aweme.feed.model.FeedItemList) r0
            return r0
        L_0x006f:
            r2 = move-exception
            goto L_0x0073
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006f }
        L_0x0073:
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lancet.e.a():com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    public final <R> boolean a(Call<R> call) {
        if (PatchProxy.isSupport(new Object[]{call}, this, f52940a, false, 54952, new Class[]{Call.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{call}, this, f52940a, false, 54952, new Class[]{Call.class}, Boolean.TYPE)).booleanValue();
        }
        Request request = call.request();
        Intrinsics.checkExpressionValueIsNotNull(request, "call.request()");
        Intrinsics.areEqual((Object) request.getPath(), (Object) "/aweme/v1/feed/");
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.retrofit2.CallAdapter<?> get(@org.jetbrains.annotations.NotNull java.lang.reflect.Type r16, @org.jetbrains.annotations.NotNull java.lang.annotation.Annotation[] r17, @org.jetbrains.annotations.NotNull com.bytedance.retrofit2.Retrofit r18) {
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
            com.meituan.robust.ChangeQuickRedirect r2 = f52940a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.reflect.Type> r1 = java.lang.reflect.Type.class
            r5[r12] = r1
            java.lang.Class<java.lang.annotation.Annotation[]> r1 = java.lang.annotation.Annotation[].class
            r5[r13] = r1
            java.lang.Class<com.bytedance.retrofit2.Retrofit> r1 = com.bytedance.retrofit2.Retrofit.class
            r5[r14] = r1
            java.lang.Class<com.bytedance.retrofit2.CallAdapter> r6 = com.bytedance.retrofit2.CallAdapter.class
            r3 = 0
            r4 = 54951(0xd6a7, float:7.7003E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0056
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f52940a
            r3 = 0
            r4 = 54951(0xd6a7, float:7.7003E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.reflect.Type> r1 = java.lang.reflect.Type.class
            r5[r12] = r1
            java.lang.Class<java.lang.annotation.Annotation[]> r1 = java.lang.annotation.Annotation[].class
            r5[r13] = r1
            java.lang.Class<com.bytedance.retrofit2.Retrofit> r1 = com.bytedance.retrofit2.Retrofit.class
            r5[r14] = r1
            java.lang.Class<com.bytedance.retrofit2.CallAdapter> r6 = com.bytedance.retrofit2.CallAdapter.class
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.bytedance.retrofit2.CallAdapter r0 = (com.bytedance.retrofit2.CallAdapter) r0
            return r0
        L_0x0056:
            java.lang.String r0 = "returnType"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r9, r0)
            java.lang.String r0 = "retrofit"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            r0 = r7
            com.bytedance.retrofit2.CallAdapter$Factory r0 = (com.bytedance.retrofit2.CallAdapter.Factory) r0
            com.bytedance.retrofit2.CallAdapter r0 = r10.nextCallAdapter(r0, r8, r9)
            java.lang.Class r1 = com.bytedance.retrofit2.CallAdapter.Factory.getRawType(r16)
            java.lang.Class<a.i> r2 = a.i.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r2 == 0) goto L_0x0085
            com.ss.android.ugc.aweme.lancet.e$c r1 = new com.ss.android.ugc.aweme.lancet.e$c
            java.lang.String r2 = "callAdapter"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r1.<init>(r15, r0)
            com.bytedance.retrofit2.CallAdapter r1 = (com.bytedance.retrofit2.CallAdapter) r1
            return r1
        L_0x0085:
            java.lang.Class<com.google.common.util.concurrent.q> r2 = com.google.common.util.concurrent.q.class
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.lancet.e$b r1 = new com.ss.android.ugc.aweme.lancet.e$b
            java.lang.String r2 = "callAdapter"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r1.<init>(r15, r0)
            com.bytedance.retrofit2.CallAdapter r1 = (com.bytedance.retrofit2.CallAdapter) r1
            return r1
        L_0x009a:
            java.lang.String r1 = "callAdapter"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.lancet.e.get(java.lang.reflect.Type, java.lang.annotation.Annotation[], com.bytedance.retrofit2.Retrofit):com.bytedance.retrofit2.CallAdapter");
    }
}
