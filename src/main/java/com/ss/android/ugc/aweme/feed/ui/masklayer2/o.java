package com.ss.android.ugc.aweme.feed.ui.masklayer2;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/OptionAction;", "", "actionsManager", "Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager;", "(Lcom/ss/android/ugc/aweme/feed/ui/masklayer2/ActionsManager;)V", "mActionManager", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "setMAweme", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "mEnterFrom", "", "getMEnterFrom", "()Ljava/lang/String;", "setMEnterFrom", "(Ljava/lang/String;)V", "doClick", "", "v", "Landroid/view/View;", "onClick", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public abstract class o {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f46786d;

    /* renamed from: e  reason: collision with root package name */
    final a f46787e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public Aweme f46788f;
    @NotNull
    public String g;

    public abstract void a(@NotNull View view);

    public o(@NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "actionsManager");
        this.f46787e = aVar;
        this.f46788f = aVar.f46752c;
        this.g = aVar.f46753d;
    }
}
