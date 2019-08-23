package com.ss.android.ugc.aweme.notification.view;

import android.content.Context;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.friends.ui.ak;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nB-\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\rB=\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u000fH\u0014¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/view/FansRecommendFriendItemView;", "Lcom/ss/android/ugc/aweme/friends/ui/RecommendFriendItemViewV2;", "context", "Landroid/content/Context;", "followClickMap", "Ljava/util/HashMap;", "", "", "(Landroid/content/Context;Ljava/util/HashMap;)V", "canBeRemoved", "(Landroid/content/Context;Ljava/util/HashMap;Z)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/util/HashMap;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/util/HashMap;Z)V", "getLayoutId", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends ak {
    public final int getLayoutId() {
        return C0906R.layout.u1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, @NotNull HashMap<String, Boolean> hashMap, boolean z) {
        super(context, null, 0, hashMap, true);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(hashMap, "followClickMap");
    }
}
