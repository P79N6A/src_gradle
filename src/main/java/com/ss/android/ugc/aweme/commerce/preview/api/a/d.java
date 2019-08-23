package com.ss.android.ugc.aweme.commerce.preview.api.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commerce.service.d.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.net.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\fH\u0016R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/api/vo/PreviewVideoIdsResponse;", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "Lcom/ss/android/ugc/aweme/net/CancelableRequest;", "()V", "awemeList", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getAwemeList", "()Ljava/util/List;", "setAwemeList", "(Ljava/util/List;)V", "cursor", "", "getCursor", "()I", "setCursor", "(I)V", "hasMore", "", "getHasMore", "()Z", "setHasMore", "(Z)V", "requestSessionId", "", "getRequestSessionId", "()Ljava/lang/String;", "setRequestSessionId", "(Ljava/lang/String;)V", "setRequestId", "", "requestId", "cur", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends a implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37340a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f37341b = "";

    /* renamed from: c  reason: collision with root package name */
    public int f37342c;
    @SerializedName("aweme_list")
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public List<Aweme> f37343d;
    @SerializedName("has_more")

    /* renamed from: e  reason: collision with root package name */
    public boolean f37344e;

    public final void a(@NotNull String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f37340a, false, 28876, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f37340a, false, 28876, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        this.f37341b = str;
        this.f37342c = i;
    }
}
