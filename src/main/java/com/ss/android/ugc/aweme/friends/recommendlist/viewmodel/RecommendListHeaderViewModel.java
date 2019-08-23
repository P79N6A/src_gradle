package com.ss.android.ugc.aweme.friends.recommendlist.viewmodel;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListHeaderViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/HeaderState;", "()V", "defaultState", "showContactDot", "", "show", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendListHeaderViewModel extends JediViewModel<HeaderState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f49016d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/HeaderState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<HeaderState, HeaderState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $show;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(1);
            this.$show = z;
        }

        @NotNull
        public final HeaderState invoke(@NotNull HeaderState headerState) {
            a aVar;
            com.ss.android.ugc.aweme.friends.recommendlist.adapter.a aVar2;
            HeaderState headerState2 = headerState;
            char c2 = 1;
            if (PatchProxy.isSupport(new Object[]{headerState2}, this, changeQuickRedirect, false, 46804, new Class[]{HeaderState.class}, HeaderState.class)) {
                return (HeaderState) PatchProxy.accessDispatch(new Object[]{headerState2}, this, changeQuickRedirect, false, 46804, new Class[]{HeaderState.class}, HeaderState.class);
            }
            Intrinsics.checkParameterIsNotNull(headerState2, "$receiver");
            List arrayList = new ArrayList();
            for (com.ss.android.ugc.aweme.friends.recommendlist.adapter.a aVar3 : headerState.getHeader().f49054c) {
                if (aVar3.f48977b == 0) {
                    boolean z = this.$show;
                    int i = aVar3.f48977b;
                    String str = aVar3.f48978c;
                    int i2 = aVar3.f48980e;
                    Object[] objArr = new Object[4];
                    objArr[0] = Integer.valueOf(i);
                    objArr[c2] = str;
                    objArr[2] = Integer.valueOf(z ? 1 : 0);
                    objArr[3] = Integer.valueOf(i2);
                    ChangeQuickRedirect changeQuickRedirect2 = com.ss.android.ugc.aweme.friends.recommendlist.adapter.a.f48976a;
                    Class[] clsArr = new Class[4];
                    clsArr[0] = Integer.TYPE;
                    clsArr[c2] = String.class;
                    clsArr[2] = Integer.TYPE;
                    clsArr[3] = Integer.TYPE;
                    int i3 = i2;
                    String str2 = str;
                    if (PatchProxy.isSupport(objArr, aVar3, changeQuickRedirect2, false, 46723, clsArr, com.ss.android.ugc.aweme.friends.recommendlist.adapter.a.class)) {
                        com.ss.android.ugc.aweme.friends.recommendlist.adapter.a aVar4 = aVar3;
                        aVar2 = (com.ss.android.ugc.aweme.friends.recommendlist.adapter.a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(z), Integer.valueOf(i3)}, aVar4, com.ss.android.ugc.aweme.friends.recommendlist.adapter.a.f48976a, false, 46723, new Class[]{Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, com.ss.android.ugc.aweme.friends.recommendlist.adapter.a.class);
                    } else {
                        Intrinsics.checkParameterIsNotNull(str2, PushConstants.TITLE);
                        aVar2 = new com.ss.android.ugc.aweme.friends.recommendlist.adapter.a(i, str2, z, i3);
                    }
                    arrayList.add(aVar2);
                } else {
                    arrayList.add(aVar3);
                }
                c2 = 1;
            }
            a header = headerState.getHeader();
            int i4 = header.f49053b;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4), arrayList}, header, a.f49052a, false, 46794, new Class[]{Integer.TYPE, List.class}, a.class)) {
                a aVar5 = header;
                aVar = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i4), arrayList}, aVar5, a.f49052a, false, 46794, new Class[]{Integer.TYPE, List.class}, a.class);
            } else {
                Intrinsics.checkParameterIsNotNull(arrayList, "data");
                aVar = new a(i4, arrayList);
            }
            return headerState2.copy(aVar);
        }
    }

    public final /* synthetic */ x c() {
        HeaderState headerState;
        if (PatchProxy.isSupport(new Object[0], this, f49016d, false, 46802, new Class[0], HeaderState.class)) {
            headerState = (HeaderState) PatchProxy.accessDispatch(new Object[0], this, f49016d, false, 46802, new Class[0], HeaderState.class);
        } else {
            headerState = new HeaderState(null, 1, null);
        }
        return headerState;
    }
}
