package com.ss.android.ugc.aweme.im.sdk.chat.viewholder;

import android.content.Context;
import android.view.View;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.im.sdk.chat.k;
import com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.model.GroupNoticeContent;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.l;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/GroupNoticeViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/viewholder/BaseViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/chat/model/GroupNoticeContent;", "itemView", "Landroid/view/View;", "type", "", "(Landroid/view/View;I)V", "bind", "", "msg", "Lcom/bytedance/im/core/model/Message;", "preMsg", "content", "position", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GroupNoticeViewHolder extends BaseViewHolder<GroupNoticeContent> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51075a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupNoticeViewHolder(@NotNull View view, int i) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    public final /* synthetic */ void a(n nVar, n nVar2, BaseContent baseContent, int i) {
        n nVar3 = nVar;
        n nVar4 = nVar2;
        GroupNoticeContent groupNoticeContent = (GroupNoticeContent) baseContent;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{nVar3, nVar4, groupNoticeContent, Integer.valueOf(i)}, this, f51075a, false, 51476, new Class[]{n.class, n.class, GroupNoticeContent.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar3, nVar4, groupNoticeContent, Integer.valueOf(i)}, this, f51075a, false, 51476, new Class[]{n.class, n.class, GroupNoticeContent.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(nVar3, "msg");
        super.a(nVar3, nVar4, groupNoticeContent, i);
        if (groupNoticeContent != null) {
            n nVar5 = this.m;
            Intrinsics.checkExpressionValueIsNotNull(nVar5, "currentMessage");
            Map<String, String> ext = nVar5.getExt();
            if (ext != null) {
                z = ext.containsKey("group_notice_show");
            }
            groupNoticeContent.setHasShow(z);
            String noticeText = groupNoticeContent.getNoticeText();
            if (groupNoticeContent.getType() != 100121) {
                View view = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                k.a(view.getContext(), this.g, noticeText, null, groupNoticeContent, groupNoticeContent.getType(), null);
            } else {
                View view2 = this.itemView;
                Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                Context context = GlobalContext.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
                String string = context.getResources().getString(C0906R.string.at9);
                int type = groupNoticeContent.getType();
                n nVar6 = this.m;
                Intrinsics.checkExpressionValueIsNotNull(nVar6, "currentMessage");
                k.a(view2.getContext(), this.g, noticeText, string, groupNoticeContent, type, nVar6.getConversationId());
            }
            if (!groupNoticeContent.getHasShow()) {
                n nVar7 = this.m;
                Intrinsics.checkExpressionValueIsNotNull(nVar7, "currentMessage");
                Map<String, String> ext2 = nVar7.getExt();
                if (ext2 == null) {
                    ext2 = new HashMap<>();
                }
                ext2.put("group_notice_show", "show");
                n nVar8 = this.m;
                Intrinsics.checkExpressionValueIsNotNull(nVar8, "currentMessage");
                nVar8.setExt(ext2);
                n nVar9 = this.m;
                Intrinsics.checkExpressionValueIsNotNull(nVar9, "currentMessage");
                nVar9.setContent(l.a(groupNoticeContent));
                ad.a(this.m);
            }
        }
    }
}
