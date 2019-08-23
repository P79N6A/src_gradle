package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.vh.VoteUserViewHolder;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0014J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\tH\u0014¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/sticker/infoSticker/interact/consume/adapter/VoteUserAdapter;", "Lcom/ss/android/ugc/aweme/base/widget/RecyclerHeaderViewAdapter;", "Lcom/ss/android/ugc/aweme/profile/model/User;", "()V", "onBindItemViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "position", "", "onCreateItemViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VoteUserAdapter extends RecyclerHeaderViewAdapter<User> {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f69852f;

    @NotNull
    public final RecyclerView.ViewHolder a(@Nullable ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f69852f, false, 79494, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f69852f, false, 79494, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        if (viewGroup2 == null) {
            Intrinsics.throwNpe();
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.as_, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…user_item, parent, false)");
        return new VoteUserViewHolder(inflate);
    }

    public final void a(@Nullable RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69852f, false, 79493, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69852f, false, 79493, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (viewHolder != null) {
            VoteUserViewHolder voteUserViewHolder = (VoteUserViewHolder) viewHolder;
            Object obj = getData().get(i);
            Intrinsics.checkExpressionValueIsNotNull(obj, "data[position]");
            User user = (User) obj;
            if (PatchProxy.isSupport(new Object[]{user}, voteUserViewHolder, VoteUserViewHolder.f69975a, false, 79629, new Class[]{User.class}, Void.TYPE)) {
                VoteUserViewHolder voteUserViewHolder2 = voteUserViewHolder;
                PatchProxy.accessDispatch(new Object[]{user}, voteUserViewHolder2, VoteUserViewHolder.f69975a, false, 79629, new Class[]{User.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(user, AllStoryActivity.f73306b);
            c.b(voteUserViewHolder.f69976b, user.getAvatarMedium());
            voteUserViewHolder.f69977c.setText(ae.a(user, true));
            voteUserViewHolder.f69976b.setOnClickListener(new VoteUserViewHolder.a(voteUserViewHolder, user));
            voteUserViewHolder.f69977c.setOnClickListener(new VoteUserViewHolder.b(voteUserViewHolder, user));
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.vh.VoteUserViewHolder");
        }
    }
}
