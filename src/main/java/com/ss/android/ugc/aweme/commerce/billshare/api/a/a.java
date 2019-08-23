package com.ss.android.ugc.aweme.commerce.billshare.api.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.net.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\fH\u0016R&\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/billshare/api/vo/BillShareResponse;", "Lcom/ss/android/ugc/aweme/commerce/service/dto/CommerceBaseResponse;", "Lcom/ss/android/ugc/aweme/net/CancelableRequest;", "()V", "awemeList", "", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getAwemeList", "()Ljava/util/List;", "setAwemeList", "(Ljava/util/List;)V", "cursor", "", "getCursor", "()I", "setCursor", "(I)V", "requestSessionId", "", "getRequestSessionId", "()Ljava/lang/String;", "setRequestSessionId", "(Ljava/lang/String;)V", "topAweme", "getTopAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setTopAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "total", "getTotal", "setTotal", "setRequestId", "", "requestId", "cur", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends com.ss.android.ugc.aweme.commerce.service.d.a implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36741a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f36742b = "";

    /* renamed from: c  reason: collision with root package name */
    public int f36743c;
    @SerializedName("aweme_list")
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public List<Aweme> f36744d;
    @SerializedName("total")

    /* renamed from: e  reason: collision with root package name */
    public int f36745e;
    @SerializedName("top_aweme")
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public Aweme f36746f;

    public final void a(@NotNull String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f36741a, false, 28009, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f36741a, false, 28009, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        this.f36742b = str;
        this.f36743c = i;
    }
}
