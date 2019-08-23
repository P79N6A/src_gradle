package com.ss.android.ugc.aweme.feed.ui.seekbar;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003J\b\u0010\f\u001a\u0004\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0007R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/ui/seekbar/FullFeedFragmentPanelOnPageScrollEvent;", "", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mEventType", "", "mPageType", "", "mBaseListFragmentPanel", "Lcom/ss/android/ugc/aweme/feed/panel/BaseListFragmentPanel;", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;Ljava/lang/String;ILcom/ss/android/ugc/aweme/feed/panel/BaseListFragmentPanel;)V", "getAweme", "getBaseListFragmentPanel", "getEventType", "getPageType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f46858a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46859b;

    /* renamed from: c  reason: collision with root package name */
    public final int f46860c;

    /* renamed from: d  reason: collision with root package name */
    public final BaseListFragmentPanel f46861d;

    public b(@Nullable Aweme aweme, @NotNull String str, int i, @Nullable BaseListFragmentPanel baseListFragmentPanel) {
        Intrinsics.checkParameterIsNotNull(str, "mEventType");
        this.f46858a = aweme;
        this.f46859b = str;
        this.f46860c = i;
        this.f46861d = baseListFragmentPanel;
    }
}
