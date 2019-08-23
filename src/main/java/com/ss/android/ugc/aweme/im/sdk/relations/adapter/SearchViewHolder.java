package com.ss.android.ugc.aweme.im.sdk.relations.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/SearchViewHolder;", "Lcom/ss/android/ugc/aweme/im/sdk/relations/viewholder/BaseSelectViewHolder;", "Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bind", "", "item", "preItem", "position", "", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchViewHolder extends BaseSelectViewHolder<IMContact> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52103a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchViewHolder(@org.jetbrains.annotations.NotNull android.view.ViewGroup r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131690464(0x7f0f03e0, float:1.9009972E38)
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            java.lang.String r0 = "LayoutInflater.from(pare…em_search, parent, false)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r0)
            r3.<init>(r4)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r4 = r3.f52240f
            com.ss.android.ugc.aweme.im.sdk.relations.adapter.SearchViewHolder$1 r0 = new com.ss.android.ugc.aweme.im.sdk.relations.adapter.SearchViewHolder$1
            r0.<init>(r3)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r4.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.adapter.SearchViewHolder.<init>(android.view.ViewGroup):void");
    }

    public final /* synthetic */ void a(Object obj, Object obj2, int i) {
        IMContact iMContact = (IMContact) obj;
        IMContact iMContact2 = (IMContact) obj2;
        if (PatchProxy.isSupport(new Object[]{iMContact, iMContact2, Integer.valueOf(i)}, this, f52103a, false, 52898, new Class[]{IMContact.class, IMContact.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iMContact, iMContact2, Integer.valueOf(i)}, this, f52103a, false, 52898, new Class[]{IMContact.class, IMContact.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(iMContact, "item");
        c.b(this.f52240f, iMContact.getDisplayAvatar());
    }
}
