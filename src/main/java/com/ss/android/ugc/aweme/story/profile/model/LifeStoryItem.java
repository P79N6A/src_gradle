package com.ss.android.ugc.aweme.story.profile.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.story.api.model.b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/story/profile/model/LifeStoryItem;", "Ljava/io/Serializable;", "date", "", "awemeWithComment", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "(JLcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;)V", "getAwemeWithComment", "()Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "setAwemeWithComment", "(Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;)V", "getDate", "()J", "setDate", "(J)V", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class LifeStoryItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private b awemeWithComment;
    private long date;

    public LifeStoryItem() {
        this(0, null, 3, null);
    }

    @Nullable
    public final b getAwemeWithComment() {
        return this.awemeWithComment;
    }

    public final long getDate() {
        return this.date;
    }

    public final void setAwemeWithComment(@Nullable b bVar) {
        this.awemeWithComment = bVar;
    }

    public final void setDate(long j) {
        this.date = j;
    }

    public LifeStoryItem(long j, @Nullable b bVar) {
        this.date = j;
        this.awemeWithComment = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LifeStoryItem(long j, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : bVar);
    }
}
