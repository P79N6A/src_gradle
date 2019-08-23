package com.ss.android.ugc.aweme.longvideonew;

import android.widget.TextView;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.setting.d;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0013H\u0007J\u0006\u0010\u0014\u001a\u00020\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/longvideonew/CommentCountControl;", "", "mCommentCountView", "Landroid/widget/TextView;", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "(Landroid/widget/TextView;Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "getMAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getMCommentCountView", "()Landroid/widget/TextView;", "getCommentDisplayCount", "", "onCommentEvent", "", "event", "Lcom/ss/android/ugc/aweme/comment/event/CommentEvent;", "onDestroy", "onVideoEvent", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "updateCommentView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3485a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f3486b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final Aweme f3487c;

    private final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f3485a, false, 56810, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3485a, false, 56810, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f3487c == null) {
            return 0;
        } else {
            AwemeStatistics statistics = this.f3487c.getStatistics();
            if (statistics == null) {
                return 0;
            }
            int commentCount = statistics.getCommentCount();
            if (this.f3487c.getAdCommentStruct() != null && commentCount > 0) {
                commentCount++;
            }
            return commentCount;
        }
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3485a, false, 56811, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3485a, false, 56811, new Class[0], Void.TYPE);
        } else if (this.f3486b != null) {
            if (d.b(this.f3487c) || com.ss.android.ugc.aweme.login.utils.a.a(this.f3487c)) {
                this.f3486b.setText(PushConstants.PUSH_TYPE_NOTIFY);
            } else {
                this.f3486b.setText(b.a((long) a()));
            }
        }
    }

    @Subscribe
    public final void onCommentEvent(@NotNull com.ss.android.ugc.aweme.comment.b.a aVar) {
        com.ss.android.ugc.aweme.comment.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3485a, false, 56812, new Class[]{com.ss.android.ugc.aweme.comment.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3485a, false, 56812, new Class[]{com.ss.android.ugc.aweme.comment.b.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "event");
        int i = aVar2.f36370a;
        if (i == 3 || i == 4 || i == 8) {
            Object obj = aVar2.f36371b;
            if (obj != null) {
                Object[] objArr = (Object[]) obj;
                if (objArr != null && objArr.length == 2) {
                    if (objArr[0] != null) {
                        b();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
            }
        }
    }

    @Subscribe
    public final void onVideoEvent(@Nullable ar arVar) {
        String str;
        ar arVar2 = arVar;
        if (PatchProxy.isSupport(new Object[]{arVar2}, this, f3485a, false, 56813, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar2}, this, f3485a, false, 56813, new Class[]{ar.class}, Void.TYPE);
        } else if (arVar2 != null) {
            if (14 == arVar2.f45292b) {
                Object obj = arVar2.f45293c;
                if (obj != null) {
                    String str2 = (String) obj;
                    Aweme aweme = this.f3487c;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    if (StringUtils.equal(str, str2)) {
                        b();
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                }
            }
        }
    }

    public a(@NotNull TextView textView, @Nullable Aweme aweme) {
        AwemeStatistics awemeStatistics;
        Intrinsics.checkParameterIsNotNull(textView, "mCommentCountView");
        this.f3486b = textView;
        this.f3487c = aweme;
        bg.c(this);
        this.f3486b.setVisibility(0);
        Aweme aweme2 = this.f3487c;
        if (aweme2 != null) {
            awemeStatistics = aweme2.getStatistics();
        } else {
            awemeStatistics = null;
        }
        if (awemeStatistics == null) {
            this.f3486b.setText(PushConstants.PUSH_TYPE_NOTIFY);
        } else if (d.b(this.f3487c) || com.ss.android.ugc.aweme.login.utils.a.a(this.f3487c)) {
            this.f3486b.setText(PushConstants.PUSH_TYPE_NOTIFY);
        } else {
            try {
                this.f3486b.setText(b.a((long) a()));
            } catch (Exception unused) {
                this.f3486b.setText(PushConstants.PUSH_TYPE_NOTIFY);
            }
        }
    }
}
