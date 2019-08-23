package com.ss.android.ugc.aweme.commerce.preview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.floatvideo.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/SinglePlayerManager;", "", "()V", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class m {
    @Nullable
    @SuppressLint({"CI_StaticFieldLeak", "StaticFieldLeak"})

    /* renamed from: a  reason: collision with root package name */
    public static h f37516a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public static Aweme f37517b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f37518c = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/SinglePlayerManager$Companion;", "", "()V", "lastAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getLastAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setLastAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "lastPlayerBox", "Lcom/ss/android/ugc/aweme/commerce/floatvideo/RecyclePlayBox;", "getLastPlayerBox", "()Lcom/ss/android/ugc/aweme/commerce/floatvideo/RecyclePlayBox;", "setLastPlayerBox", "(Lcom/ss/android/ugc/aweme/commerce/floatvideo/RecyclePlayBox;)V", "playOnVideoHolder", "parent", "Landroid/view/ViewGroup;", "wrapperView", "Landroid/view/View;", "aweme", "release", "", "releaseLastView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37519a;

        private a() {
        }

        @Nullable
        public static h a() {
            return m.f37516a;
        }

        @Nullable
        public static Aweme b() {
            return m.f37517b;
        }

        private final void c() {
            ViewParent viewParent;
            if (PatchProxy.isSupport(new Object[0], this, f37519a, false, 28807, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37519a, false, 28807, new Class[0], Void.TYPE);
                return;
            }
            h a2 = a();
            if (a2 != null) {
                a2.c();
            }
            h a3 = a();
            if (a3 != null) {
                a3.e();
            }
            h a4 = a();
            if (a4 != null) {
                viewParent = a4.getParent();
            } else {
                viewParent = null;
            }
            ViewGroup viewGroup = (ViewGroup) viewParent;
            if (viewGroup != null) {
                viewGroup.removeView(a());
            }
            a((h) null);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(@Nullable h hVar) {
            m.f37516a = hVar;
        }

        private static void a(@Nullable Aweme aweme) {
            m.f37517b = aweme;
        }

        @JvmStatic
        @Nullable
        public final h a(@NotNull ViewGroup viewGroup, @NotNull View view, @NotNull Aweme aweme) {
            ViewGroup viewGroup2 = viewGroup;
            View view2 = view;
            Aweme aweme2 = aweme;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, view2, aweme2}, this, f37519a, false, 28806, new Class[]{ViewGroup.class, View.class, Aweme.class}, h.class)) {
                return (h) PatchProxy.accessDispatch(new Object[]{viewGroup2, view2, aweme2}, this, f37519a, false, 28806, new Class[]{ViewGroup.class, View.class, Aweme.class}, h.class);
            }
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            Intrinsics.checkParameterIsNotNull(view2, "wrapperView");
            Intrinsics.checkParameterIsNotNull(aweme2, "aweme");
            c();
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
            a(new h(context, null, 0, 6));
            viewGroup2.addView(a(), view.getWidth(), view.getHeight());
            h a2 = a();
            if (a2 != null) {
                a2.a(aweme, 3, view.getWidth(), view.getHeight(), 0, 2);
            }
            h a3 = a();
            if (a3 != null) {
                a3.d();
            }
            a(aweme);
            return a();
        }
    }
}
