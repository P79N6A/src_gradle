package com.ss.android.ugc.aweme.favorites.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/bean/ProfileCollectionItemStruct;", "", "()V", "count", "", "getCount", "()J", "setCount", "(J)V", "coverList", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getCoverList", "()Ljava/util/List;", "setCoverList", "(Ljava/util/List;)V", "ids", "", "getIds", "setIds", "structType", "", "getStructType", "()I", "setStructType", "(I)V", "title", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44208a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f44209b = "";

    /* renamed from: c  reason: collision with root package name */
    public long f44210c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public List<UrlModel> f44211d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f44212e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public List<String> f44213f = new ArrayList();

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f44208a, false, 39448, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f44208a, false, 39448, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.f44209b = str2;
    }

    public final void b(@NotNull List<String> list) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f44208a, false, 39450, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f44208a, false, 39450, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.f44213f = list2;
    }

    public final void a(@NotNull List<UrlModel> list) {
        List<UrlModel> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f44208a, false, 39449, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f44208a, false, 39449, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.f44211d = list2;
    }
}
