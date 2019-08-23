package com.ss.android.ugc.aweme.comment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u0001'B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0012\"\u0004\b#\u0010\u0014R\u001a\u0010$\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014¨\u0006("}, d2 = {"Lcom/ss/android/ugc/aweme/comment/CommentDialogParams;", "", "()V", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "enterMethod", "", "getEnterMethod", "()Ljava/lang/String;", "setEnterMethod", "(Ljava/lang/String;)V", "forceOpenReply", "", "getForceOpenReply", "()Z", "setForceOpenReply", "(Z)V", "forceRefresh", "getForceRefresh", "setForceRefresh", "insertCids", "getInsertCids", "setInsertCids", "poiId", "getPoiId", "setPoiId", "previousPage", "getPreviousPage", "setPreviousPage", "scrollToTop", "getScrollToTop", "setScrollToTop", "showReply", "getShowReply", "setShowReply", "Builder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36267a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Aweme f36268b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public String f36269c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36270d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f36271e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f36272f;
    @Nullable
    public String g;
    public boolean h;
    @Nullable
    public String i;
    @Nullable
    public String j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u0017\u001a\u00020\u00002\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u001a\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/comment/CommentDialogParams$Builder;", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "enterMethod", "", "forceOpenReply", "", "forceRefresh", "insertCids", "", "poiId", "previousPage", "scrollToTop", "showReply", "addInsertCid", "insertCid", "build", "Lcom/ss/android/ugc/aweme/comment/CommentDialogParams;", "setEnterMethod", "setForceOpenReply", "setForceRefresh", "setInsertCids", "", "setPoiId", "setPreviousPage", "setScrollToTop", "setShowReply", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.comment.a$a  reason: collision with other inner class name */
    public static final class C0457a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36273a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f36274b;

        /* renamed from: c  reason: collision with root package name */
        private List<String> f36275c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f36276d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f36277e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f36278f;
        private String g;
        private String h;
        private String i;
        private Aweme j;

        public C0457a() {
            this(null, 1);
        }

        @NotNull
        public final a a() {
            if (PatchProxy.isSupport(new Object[0], this, f36273a, false, 27079, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], this, f36273a, false, 27079, new Class[0], a.class);
            }
            if (this.j == null) {
                com.ss.android.ugc.aweme.framework.core.a b2 = com.ss.android.ugc.aweme.framework.core.a.b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "AppTracker.get()");
                if (b2.f3306d) {
                    throw new RuntimeException("Cannot show a comment dialog with a null Aweme");
                }
            }
            a aVar = new a((byte) 0);
            aVar.f36268b = this.j;
            String joinToString$default = CollectionsKt.joinToString$default(this.f36275c, ",", null, null, 0, null, null, 62, null);
            if (PatchProxy.isSupport(new Object[]{joinToString$default}, aVar, a.f36267a, false, 27076, new Class[]{String.class}, Void.TYPE)) {
                Object[] objArr = {joinToString$default};
                a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr, aVar2, a.f36267a, false, 27076, new Class[]{String.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(joinToString$default, "<set-?>");
                aVar.f36269c = joinToString$default;
            }
            aVar.f36270d = this.f36276d;
            aVar.f36271e = this.f36277e;
            aVar.f36272f = this.f36278f;
            aVar.g = this.g;
            aVar.h = this.f36274b;
            aVar.i = this.h;
            aVar.j = this.i;
            return aVar;
        }

        @NotNull
        public final C0457a a(boolean z) {
            this.f36277e = true;
            return this;
        }

        @NotNull
        public final C0457a b(@Nullable String str) {
            this.g = str;
            return this;
        }

        @NotNull
        public final C0457a c(@Nullable String str) {
            this.h = str;
            return this;
        }

        @NotNull
        public final C0457a d(@Nullable String str) {
            this.i = str;
            return this;
        }

        @NotNull
        public final C0457a b(boolean z) {
            this.f36274b = z;
            return this;
        }

        public C0457a(@Nullable Aweme aweme) {
            this.j = aweme;
            this.f36275c = new ArrayList();
            this.g = "";
            this.h = "";
            this.i = "";
        }

        @NotNull
        public final C0457a a(@Nullable String str) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{str}, this, f36273a, false, 27078, new Class[]{String.class}, C0457a.class)) {
                return (C0457a) PatchProxy.accessDispatch(new Object[]{str}, this, f36273a, false, 27078, new Class[]{String.class}, C0457a.class);
            }
            CharSequence charSequence = str;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z = false;
            }
            if (!z) {
                List<String> list = this.f36275c;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                list.add(str);
            }
            return this;
        }

        @NotNull
        public final C0457a a(@Nullable List<String> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f36273a, false, 27077, new Class[]{List.class}, C0457a.class)) {
                return (C0457a) PatchProxy.accessDispatch(new Object[]{list}, this, f36273a, false, 27077, new Class[]{List.class}, C0457a.class);
            }
            if (list != null) {
                this.f36275c = CollectionsKt.toMutableList((Collection<? extends T>) list);
            } else {
                this.f36275c = new ArrayList();
            }
            return this;
        }

        private /* synthetic */ C0457a(Aweme aweme, int i2) {
            this(null);
        }
    }

    private a() {
        this.f36269c = "";
        this.g = "";
        this.i = "";
        this.j = "";
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
