package com.ss.android.ugc.aweme.im.sdk.detail.b;

import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bJ\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bJ\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0002¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/im/sdk/detail/utils/MemberHelper;", "", "()V", "searchMember", "", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;", "dataList", "keyWord", "", "setDetailText", "", "textView", "Landroid/widget/TextView;", "imMember", "keyword", "setNameText", "showSignature", "im.base_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51426a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f51427b = new a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/ugc/aweme/im/sdk/chat/group/model/IMMember;", "kotlin.jvm.PlatformType", "o2", "compare"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.b.a$a  reason: collision with other inner class name */
    public static final class C0599a<T> implements Comparator<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51428a;

        /* renamed from: b  reason: collision with root package name */
        public static final C0599a f51429b = new C0599a();

        C0599a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            IMUser iMUser;
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar = (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) obj;
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar2 = (com.ss.android.ugc.aweme.im.sdk.chat.b.a.a) obj2;
            if (PatchProxy.isSupport(new Object[]{aVar, aVar2}, this, f51428a, false, 52057, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class, com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{aVar, aVar2}, this, f51428a, false, 52057, new Class[]{com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class, com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class}, Integer.TYPE)).intValue();
            }
            IMUser iMUser2 = null;
            if (aVar != null) {
                iMUser = aVar.getUser();
            } else {
                iMUser = null;
            }
            if (aVar2 != null) {
                iMUser2 = aVar2.getUser();
            }
            if (iMUser == null && iMUser2 == null) {
                return 0;
            }
            if (iMUser != null && iMUser2 != null) {
                return Integer.compare(iMUser2.getSearchType(), iMUser.getSearchType());
            }
            if (iMUser == null) {
                return -1;
            }
            return 1;
        }
    }

    private a() {
    }

    public final void a(TextView textView, com.ss.android.ugc.aweme.im.sdk.chat.b.a.a aVar) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, aVar}, this, f51426a, false, 52056, new Class[]{TextView.class, com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, aVar}, this, f51426a, false, 52056, new Class[]{TextView.class, com.ss.android.ugc.aweme.im.sdk.chat.b.a.a.class}, Void.TYPE);
            return;
        }
        textView2.setVisibility(8);
    }
}
