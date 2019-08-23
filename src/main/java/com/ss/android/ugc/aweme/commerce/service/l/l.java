package com.ss.android.ugc.aweme.commerce.service.l;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/UIHelper;", "", "()V", "Companion", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f38039a = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/UIHelper$Companion;", "", "()V", "bindPreferredImages", "", "imageView", "Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", "preferredImages", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38040a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final void a(@NotNull RemoteImageView remoteImageView, @Nullable List<? extends UrlModel> list) {
            RemoteImageView remoteImageView2 = remoteImageView;
            List<? extends UrlModel> list2 = list;
            if (PatchProxy.isSupport(new Object[]{remoteImageView2, list2}, this, f38040a, false, 30017, new Class[]{RemoteImageView.class, List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{remoteImageView2, list2}, this, f38040a, false, 30017, new Class[]{RemoteImageView.class, List.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(remoteImageView2, "imageView");
            if (list2 != null && (!list2.isEmpty())) {
                c.b(remoteImageView2, (UrlModel) list2.get(0));
            }
        }
    }
}
