package com.ss.android.ugc.aweme.comment;

import android.support.v4.content.ContextCompat;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001-B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0010J\u001d\u0010\u0012\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\"\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0010J+\u0010$\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0016\u0010%\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0013\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010&J\u0016\u0010'\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010*\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010,R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/ugc/aweme/comment/CommentPostingManager;", "", "()V", "FAILED", "", "POSTED", "POSTING", "RETRYING", "UNKNOWN", "mComments", "", "", "Lcom/ss/android/ugc/aweme/comment/CommentPostingManager$CommentPostingStatus;", "generateTempCommentId", "getPosition", "comment", "Lcom/ss/android/ugc/aweme/comment/model/Comment;", "getReplyComment", "getRequestParams", "", "(Lcom/ss/android/ugc/aweme/comment/model/Comment;)[Ljava/lang/Object;", "getRequestType", "isDuringPosting", "", "isFailed", "isRetrying", "remove", "", "setComment", "setFailed", "setPosition", "position", "setPosted", "setPosting", "setReplyComment", "replyComment", "setRequestParams", "requestParams", "(Lcom/ss/android/ugc/aweme/comment/model/Comment;[Ljava/lang/Object;)V", "setRequestType", "requestType", "setRetrying", "updateStatus", "statusView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "CommentPostingStatus", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36431a;

    /* renamed from: b  reason: collision with root package name */
    static final Map<String, a> f36432b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final f f36433c = new f();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0017J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003JX\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0012\b\u0002\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010*\u001a\u00020\u0003H\u0016J\t\u0010+\u001a\u00020,HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR&\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\bX\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0011\"\u0004\b\u001e\u0010\u0013¨\u0006-"}, d2 = {"Lcom/ss/android/ugc/aweme/comment/CommentPostingManager$CommentPostingStatus;", "", "status", "", "comment", "Lcom/ss/android/ugc/aweme/comment/model/Comment;", "position", "requestParams", "", "requestType", "replyComment", "(ILcom/ss/android/ugc/aweme/comment/model/Comment;I[Ljava/lang/Object;ILcom/ss/android/ugc/aweme/comment/model/Comment;)V", "getComment", "()Lcom/ss/android/ugc/aweme/comment/model/Comment;", "setComment", "(Lcom/ss/android/ugc/aweme/comment/model/Comment;)V", "getPosition", "()I", "setPosition", "(I)V", "getReplyComment", "setReplyComment", "getRequestParams", "()[Ljava/lang/Object;", "setRequestParams", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getRequestType", "setRequestType", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILcom/ss/android/ugc/aweme/comment/model/Comment;I[Ljava/lang/Object;ILcom/ss/android/ugc/aweme/comment/model/Comment;)Lcom/ss/android/ugc/aweme/comment/CommentPostingManager$CommentPostingStatus;", "equals", "", "other", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36434a;

        /* renamed from: b  reason: collision with root package name */
        public int f36435b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public Comment f36436c;

        /* renamed from: d  reason: collision with root package name */
        public int f36437d;
        @NotNull

        /* renamed from: e  reason: collision with root package name */
        public Object[] f36438e;

        /* renamed from: f  reason: collision with root package name */
        public int f36439f;
        @Nullable
        public Comment g;

        @JvmOverloads
        public a() {
            this(0, null, 0, null, 0, null, 63);
        }

        @NotNull
        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f36434a, false, 27156, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f36434a, false, 27156, new Class[0], String.class);
            }
            return "CommentPostingStatus(status=" + this.f36435b + ", comment=" + this.f36436c + ", position=" + this.f36437d + ", requestParams=" + Arrays.toString(this.f36438e) + ", requestType=" + this.f36439f + ", replyComment=" + this.g + ")";
        }

        public final int hashCode() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f36434a, false, 27153, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36434a, false, 27153, new Class[0], Integer.TYPE)).intValue();
            }
            int i2 = this.f36435b * 31;
            Comment comment = this.f36436c;
            if (comment != null) {
                i = comment.hashCode();
            }
            return ((((((i2 + i) * 31) + this.f36437d) * 31) + Arrays.hashCode(this.f36438e)) * 31) + this.f36439f;
        }

        public final boolean equals(@Nullable Object obj) {
            Class<?> cls;
            if (PatchProxy.isSupport(new Object[]{obj}, this, f36434a, false, 27152, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f36434a, false, 27152, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (this == obj) {
                return true;
            } else {
                Class<?> cls2 = getClass();
                if (obj != null) {
                    cls = obj.getClass();
                } else {
                    cls = null;
                }
                if (!Intrinsics.areEqual((Object) cls2, (Object) cls)) {
                    return false;
                }
                if (obj != null) {
                    a aVar = (a) obj;
                    if (this.f36435b == aVar.f36435b && !(!Intrinsics.areEqual((Object) this.f36436c, (Object) aVar.f36436c)) && this.f36437d == aVar.f36437d && Arrays.equals(this.f36438e, aVar.f36438e) && this.f36439f == aVar.f36439f) {
                        return true;
                    }
                    return false;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.CommentPostingManager.CommentPostingStatus");
            }
        }

        @JvmOverloads
        private a(int i, @Nullable Comment comment, int i2, @NotNull Object[] objArr, int i3, @Nullable Comment comment2) {
            Intrinsics.checkParameterIsNotNull(objArr, "requestParams");
            this.f36435b = i;
            this.f36436c = comment;
            this.f36437d = i2;
            this.f36438e = objArr;
            this.f36439f = i3;
            this.g = comment2;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ a(int r7, com.ss.android.ugc.aweme.comment.model.Comment r8, int r9, java.lang.Object[] r10, int r11, com.ss.android.ugc.aweme.comment.model.Comment r12, int r13) {
            /*
                r6 = this;
                r0 = r13 & 1
                r1 = -1
                if (r0 == 0) goto L_0x0007
                r0 = -1
                goto L_0x0008
            L_0x0007:
                r0 = r7
            L_0x0008:
                r7 = r13 & 2
                r2 = 0
                if (r7 == 0) goto L_0x000f
                r3 = r2
                goto L_0x0010
            L_0x000f:
                r3 = r8
            L_0x0010:
                r7 = r13 & 4
                if (r7 == 0) goto L_0x0016
                r4 = -1
                goto L_0x0017
            L_0x0016:
                r4 = r9
            L_0x0017:
                r7 = r13 & 8
                if (r7 == 0) goto L_0x001e
                r7 = 0
                java.lang.Object[] r10 = new java.lang.Object[r7]
            L_0x001e:
                r5 = r10
                r7 = r13 & 16
                if (r7 == 0) goto L_0x0024
                goto L_0x0025
            L_0x0024:
                r1 = r11
            L_0x0025:
                r7 = r13 & 32
                if (r7 == 0) goto L_0x002b
                r13 = r2
                goto L_0x002c
            L_0x002b:
                r13 = r12
            L_0x002c:
                r7 = r6
                r8 = r0
                r9 = r3
                r10 = r4
                r11 = r5
                r12 = r1
                r7.<init>(r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.f.a.<init>(int, com.ss.android.ugc.aweme.comment.model.Comment, int, java.lang.Object[], int, com.ss.android.ugc.aweme.comment.model.Comment, int):void");
        }
    }

    private f() {
    }

    @NotNull
    public final String a() {
        if (PatchProxy.isSupport(new Object[0], this, f36431a, false, 27147, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f36431a, false, 27147, new Class[0], String.class);
        }
        return System.currentTimeMillis() + UUID.randomUUID();
    }

    public final boolean b(@NotNull Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36431a, false, 27134, new Class[]{Comment.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{comment2}, this, f36431a, false, 27134, new Class[]{Comment.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar == null || aVar.f36435b != 2) {
            return false;
        }
        return true;
    }

    public final void c(@NotNull Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36431a, false, 27135, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f36431a, false, 27135, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar != null) {
            aVar.f36435b = 2;
            return;
        }
        Map<String, a> map = f36432b;
        String fakeId = comment.getFakeId();
        Intrinsics.checkExpressionValueIsNotNull(fakeId, "comment.fakeId");
        a aVar2 = new a(2, null, 0, null, 0, null, 62);
        map.put(fakeId, aVar2);
    }

    public final void d(@NotNull Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36431a, false, 27136, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f36431a, false, 27136, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar != null) {
            aVar.f36435b = 1;
            return;
        }
        Map<String, a> map = f36432b;
        String fakeId = comment.getFakeId();
        Intrinsics.checkExpressionValueIsNotNull(fakeId, "comment.fakeId");
        a aVar2 = new a(1, null, 0, null, 0, null, 62);
        map.put(fakeId, aVar2);
    }

    public final boolean e(@NotNull Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36431a, false, 27137, new Class[]{Comment.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{comment2}, this, f36431a, false, 27137, new Class[]{Comment.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar == null || aVar.f36435b != 3) {
            return false;
        }
        return true;
    }

    public final void f(@NotNull Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36431a, false, 27139, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f36431a, false, 27139, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar != null) {
            aVar.f36435b = 4;
            return;
        }
        Map<String, a> map = f36432b;
        String fakeId = comment.getFakeId();
        Intrinsics.checkExpressionValueIsNotNull(fakeId, "comment.fakeId");
        a aVar2 = new a(4, null, 0, null, 0, null, 62);
        map.put(fakeId, aVar2);
    }

    public final void g(@NotNull Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36431a, false, 27140, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f36431a, false, 27140, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        f36432b.remove(comment.getFakeId());
    }

    public final int h(@NotNull Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36431a, false, 27142, new Class[]{Comment.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{comment2}, this, f36431a, false, 27142, new Class[]{Comment.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar != null) {
            return aVar.f36437d;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004c, code lost:
        if (r0 == null) goto L_0x004e;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object[] i(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.comment.model.Comment r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f36431a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.comment.model.Comment> r3 = com.ss.android.ugc.aweme.comment.model.Comment.class
            r7[r9] = r3
            java.lang.Class<java.lang.Object[]> r8 = java.lang.Object[].class
            r5 = 0
            r6 = 27144(0x6a08, float:3.8037E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f36431a
            r13 = 0
            r14 = 27144(0x6a08, float:3.8037E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.comment.model.Comment> r0 = com.ss.android.ugc.aweme.comment.model.Comment.class
            r15[r9] = r0
            java.lang.Class<java.lang.Object[]> r16 = java.lang.Object[].class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
        L_0x0037:
            java.lang.String r1 = "comment"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.comment.f$a> r1 = f36432b
            java.lang.String r0 = r18.getFakeId()
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.comment.f$a r0 = (com.ss.android.ugc.aweme.comment.f.a) r0
            if (r0 == 0) goto L_0x004e
            java.lang.Object[] r0 = r0.f36438e
            if (r0 != 0) goto L_0x0050
        L_0x004e:
            java.lang.Object[] r0 = new java.lang.Object[r9]
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.f.i(com.ss.android.ugc.aweme.comment.model.Comment):java.lang.Object[]");
    }

    public final int j(@NotNull Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36431a, false, 27146, new Class[]{Comment.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{comment2}, this, f36431a, false, 27146, new Class[]{Comment.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar != null) {
            return aVar.f36439f;
        }
        return -1;
    }

    @Nullable
    public final Comment l(@NotNull Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36431a, false, 27150, new Class[]{Comment.class}, Comment.class)) {
            return (Comment) PatchProxy.accessDispatch(new Object[]{comment2}, this, f36431a, false, 27150, new Class[]{Comment.class}, Comment.class);
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar != null) {
            return aVar.g;
        }
        return null;
    }

    public final void k(@NotNull Comment comment) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{comment}, this, f36431a, false, 27148, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f36431a, false, 27148, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(comment, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar != null) {
            Comment comment2 = aVar.f36436c;
            CharSequence replyToUserId = comment.getReplyToUserId();
            if (replyToUserId == null || replyToUserId.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && comment2 != null) {
                CharSequence replyToUserId2 = comment2.getReplyToUserId();
                if (!(replyToUserId2 == null || replyToUserId2.length() == 0)) {
                    z2 = false;
                }
                if (!z2) {
                    comment.setReplyToUserId(comment2.getReplyToUserId());
                }
            }
            aVar.f36436c = comment;
            return;
        }
        Map<String, a> map = f36432b;
        String fakeId = comment.getFakeId();
        Intrinsics.checkExpressionValueIsNotNull(fakeId, "comment.fakeId");
        a aVar2 = new a(0, comment, 0, null, 0, null, 61);
        map.put(fakeId, aVar2);
    }

    public final boolean a(@NotNull Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36431a, false, 27133, new Class[]{Comment.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{comment2}, this, f36431a, false, 27133, new Class[]{Comment.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar == null) {
            return false;
        }
        int i = aVar.f36435b;
        if (1 <= i && 3 >= i && aVar.f36437d >= 0) {
            return true;
        }
        return false;
    }

    public final void a(@NotNull Comment comment, @Nullable Comment comment2) {
        Comment comment3 = comment;
        Comment comment4 = comment2;
        if (PatchProxy.isSupport(new Object[]{comment3, comment4}, this, f36431a, false, 27149, new Class[]{Comment.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment3, comment4}, this, f36431a, false, 27149, new Class[]{Comment.class, Comment.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(comment, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar != null) {
            aVar.g = comment4;
            return;
        }
        Map<String, a> map = f36432b;
        String fakeId = comment.getFakeId();
        Intrinsics.checkExpressionValueIsNotNull(fakeId, "comment.fakeId");
        a aVar2 = new a(0, null, 0, null, 0, comment2, 31);
        map.put(fakeId, aVar2);
    }

    public final void a(@NotNull Comment comment, int i) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2, Integer.valueOf(i)}, this, f36431a, false, 27141, new Class[]{Comment.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2, Integer.valueOf(i)}, this, f36431a, false, 27141, new Class[]{Comment.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar != null) {
            aVar.f36437d = i;
            return;
        }
        Map<String, a> map = f36432b;
        String fakeId = comment.getFakeId();
        Intrinsics.checkExpressionValueIsNotNull(fakeId, "comment.fakeId");
        a aVar2 = new a(0, null, i, null, 0, null, 59);
        map.put(fakeId, aVar2);
    }

    public final void b(@NotNull Comment comment, int i) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2, Integer.valueOf(i)}, this, f36431a, false, 27145, new Class[]{Comment.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2, Integer.valueOf(i)}, this, f36431a, false, 27145, new Class[]{Comment.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar != null) {
            aVar.f36439f = i;
            return;
        }
        Map<String, a> map = f36432b;
        String fakeId = comment.getFakeId();
        Intrinsics.checkExpressionValueIsNotNull(fakeId, "comment.fakeId");
        a aVar2 = new a(0, null, 0, null, i, null, 47);
        map.put(fakeId, aVar2);
    }

    public final void a(@NotNull Comment comment, @Nullable DmtTextView dmtTextView) {
        Comment comment2 = comment;
        DmtTextView dmtTextView2 = dmtTextView;
        if (PatchProxy.isSupport(new Object[]{comment2, dmtTextView2}, this, f36431a, false, 27151, new Class[]{Comment.class, DmtTextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2, dmtTextView2}, this, f36431a, false, 27151, new Class[]{Comment.class, DmtTextView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(comment2, "comment");
        if (dmtTextView2 != null) {
            a aVar = f36432b.get(comment.getFakeId());
            if (aVar != null) {
                switch (aVar.f36435b) {
                    case 2:
                        dmtTextView2.setVisibility(0);
                        dmtTextView2.setTextColor(ContextCompat.getColor(GlobalContext.getContext(), C0906R.color.hs));
                        dmtTextView2.setText(C0906R.string.w_);
                        return;
                    case 3:
                        dmtTextView2.setVisibility(0);
                        dmtTextView2.setTextColor(ContextCompat.getColor(GlobalContext.getContext(), C0906R.color.a73));
                        dmtTextView2.setText(C0906R.string.w9);
                        return;
                }
            }
            dmtTextView2.setVisibility(8);
        }
    }

    public final void a(@NotNull Comment comment, @NotNull Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{comment, objArr}, this, f36431a, false, 27143, new Class[]{Comment.class, Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, objArr}, this, f36431a, false, 27143, new Class[]{Comment.class, Object[].class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(comment, "comment");
        Intrinsics.checkParameterIsNotNull(objArr, "requestParams");
        a aVar = f36432b.get(comment.getFakeId());
        if (aVar != null) {
            if (PatchProxy.isSupport(new Object[]{objArr}, aVar, a.f36434a, false, 27154, new Class[]{Object[].class}, Void.TYPE)) {
                Object[] objArr2 = {objArr};
                a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr2, aVar2, a.f36434a, false, 27154, new Class[]{Object[].class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(objArr, "<set-?>");
                aVar.f36438e = objArr;
            }
        } else {
            Map<String, a> map = f36432b;
            String fakeId = comment.getFakeId();
            Intrinsics.checkExpressionValueIsNotNull(fakeId, "comment.fakeId");
            a aVar3 = new a(0, null, 0, objArr, 0, null, 55);
            map.put(fakeId, aVar3);
        }
    }
}
