package com.ss.android.ugc.aweme.commerce.service.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/define/OrderType;", "", "()V", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0494a f37960a = new C0494a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/define/OrderType$Companion;", "", "()V", "GENERAL_SORT", "", "GENERAL_SORT_ID", "HOT_SORT_ID", "NEW_PRODUCT", "NEW_SORT_ID", "PRICE", "PRICE_SORT_ID", "SALESVOLUME", "getOrderType", "id", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.commerce.service.c.a$a  reason: collision with other inner class name */
    public static final class C0494a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37961a;

        private C0494a() {
        }

        public /* synthetic */ C0494a(byte b2) {
            this();
        }

        @NotNull
        public final String a(@Nullable String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f37961a, false, 29686, new Class[]{String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f37961a, false, 29686, new Class[]{String.class}, String.class);
            }
            if (str2 != null) {
                switch (str.hashCode()) {
                    case 48:
                        if (str2.equals(PushConstants.PUSH_TYPE_NOTIFY)) {
                            return "general_sort";
                        }
                        break;
                    case 49:
                        if (str2.equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                            return "salesvolume";
                        }
                        break;
                    case 50:
                        if (str2.equals(PushConstants.PUSH_TYPE_UPLOAD_LOG)) {
                            return "new_product";
                        }
                        break;
                    case 51:
                        if (str2.equals("3")) {
                            return "price";
                        }
                        break;
                }
            }
            return "";
        }
    }
}
