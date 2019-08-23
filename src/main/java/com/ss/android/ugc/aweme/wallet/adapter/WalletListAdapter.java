package com.ss.android.ugc.aweme.wallet.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.wallet.model.WalletEntranceResponse;
import java.util.List;

public class WalletListAdapter extends RecyclerView.Adapter<WalletItemHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76558a;

    /* renamed from: b  reason: collision with root package name */
    public List<WalletEntranceResponse.b> f76559b;

    static class WalletItemHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76560a;
        @BindView(2131498588)
        CommonItemView mWalletItem;

        WalletItemHolder(@NonNull View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
        }
    }

    public class WalletItemHolder_ViewBinding implements Unbinder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76561a;

        /* renamed from: b  reason: collision with root package name */
        private WalletItemHolder f76562b;

        @CallSuper
        public void unbind() {
            if (PatchProxy.isSupport(new Object[0], this, f76561a, false, 89798, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f76561a, false, 89798, new Class[0], Void.TYPE);
                return;
            }
            WalletItemHolder walletItemHolder = this.f76562b;
            if (walletItemHolder != null) {
                this.f76562b = null;
                walletItemHolder.mWalletItem = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        @UiThread
        public WalletItemHolder_ViewBinding(WalletItemHolder walletItemHolder, View view) {
            this.f76562b = walletItemHolder;
            walletItemHolder.mWalletItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.dwj, "field 'mWalletItem'", CommonItemView.class);
        }
    }

    public int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f76558a, false, 89793, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76558a, false, 89793, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f76559b == null) {
            return 0;
        } else {
            return this.f76559b.size();
        }
    }

    @NonNull
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f76558a, false, 89791, new Class[]{ViewGroup.class, Integer.TYPE}, WalletItemHolder.class)) {
            return new WalletItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a1b, viewGroup2, false));
        }
        return (WalletItemHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f76558a, false, 89791, new Class[]{ViewGroup.class, Integer.TYPE}, WalletItemHolder.class);
    }

    public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        WalletItemHolder walletItemHolder = (WalletItemHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{walletItemHolder, Integer.valueOf(i)}, this, f76558a, false, 89792, new Class[]{WalletItemHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{walletItemHolder, Integer.valueOf(i)}, this, f76558a, false, 89792, new Class[]{WalletItemHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        WalletEntranceResponse.b bVar = this.f76559b.get(i);
        if (PatchProxy.isSupport(new Object[]{bVar}, walletItemHolder, WalletItemHolder.f76560a, false, 89795, new Class[]{WalletEntranceResponse.b.class}, Void.TYPE)) {
            WalletItemHolder walletItemHolder2 = walletItemHolder;
            PatchProxy.accessDispatch(new Object[]{bVar}, walletItemHolder2, WalletItemHolder.f76560a, false, 89795, new Class[]{WalletEntranceResponse.b.class}, Void.TYPE);
            return;
        }
        walletItemHolder.mWalletItem.setLeftText(bVar.f76574d);
        if (!StringUtils.isEmpty(bVar.f76575e)) {
            walletItemHolder.mWalletItem.setRightText(bVar.f76575e);
        }
        walletItemHolder.mWalletItem.setOnClickListener(new a(walletItemHolder, bVar));
        if (!StringUtils.isEmpty(bVar.g)) {
            walletItemHolder.mWalletItem.setLeftIconImageUrl(bVar.g);
        }
    }
}
