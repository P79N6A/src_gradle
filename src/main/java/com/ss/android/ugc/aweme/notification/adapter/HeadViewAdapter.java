package com.ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/adapter/HeadViewAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/notification/adapter/HeadHolder;", "mActivity", "Landroid/app/Activity;", "mAvatarCount", "", "(Landroid/app/Activity;I)V", "mAvatarSize", "mData", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "data", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HeadViewAdapter extends RecyclerView.Adapter<HeadHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57910a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f57911b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final List<User> f57912c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final int f57913d = ((int) UIUtils.dip2Px(GlobalContext.getContext(), 27.0f));

    /* renamed from: e  reason: collision with root package name */
    private final Activity f57914e;

    /* renamed from: f  reason: collision with root package name */
    private final int f57915f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/notification/adapter/HeadViewAdapter$Companion;", "", "()V", "SIZE_AVATAR", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f57910a, false, 63036, new Class[0], Integer.TYPE)) {
            return this.f57912c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f57910a, false, 63036, new Class[0], Integer.TYPE)).intValue();
    }

    public final void a(@NotNull List<? extends User> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f57910a, false, 63035, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f57910a, false, 63035, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "data");
        this.f57912c.clear();
        this.f57912c.addAll(CollectionsKt.take(list, this.f57915f));
        notifyDataSetChanged();
    }

    public HeadViewAdapter(@NotNull Activity activity, int i) {
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        this.f57914e = activity;
        this.f57915f = i;
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        HeadHolder headHolder;
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f57910a, false, 63033, new Class[]{ViewGroup.class, Integer.TYPE}, HeadHolder.class)) {
            headHolder = (HeadHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f57910a, false, 63033, new Class[]{ViewGroup.class, Integer.TYPE}, HeadHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            AvatarImageWithVerify avatarImageWithVerify = new AvatarImageWithVerify(viewGroup.getContext());
            avatarImageWithVerify.setLayoutParams(new ViewGroup.LayoutParams(this.f57913d, this.f57913d));
            headHolder = new HeadHolder(this.f57914e, avatarImageWithVerify);
        }
        return headHolder;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        HeadHolder headHolder = (HeadHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{headHolder, Integer.valueOf(i)}, this, f57910a, false, 63034, new Class[]{HeadHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{headHolder, Integer.valueOf(i)}, this, f57910a, false, 63034, new Class[]{HeadHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(headHolder, "holder");
        User user = this.f57912c.get(i);
        if (PatchProxy.isSupport(new Object[]{user}, headHolder, HeadHolder.f57906a, false, 63031, new Class[]{User.class}, Void.TYPE)) {
            HeadHolder headHolder2 = headHolder;
            PatchProxy.accessDispatch(new Object[]{user}, headHolder2, HeadHolder.f57906a, false, 63031, new Class[]{User.class}, Void.TYPE);
            return;
        }
        if (user != null) {
            headHolder.f57907b = user;
            headHolder.f57908c.setData(user);
        }
    }
}
