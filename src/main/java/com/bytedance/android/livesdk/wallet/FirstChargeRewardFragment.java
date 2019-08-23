package com.bytedance.android.livesdk.wallet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.setting.l;
import com.bytedance.android.livesdk.chatroom.e.y;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.h.e;
import com.bytedance.android.livesdkapi.i.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/android/livesdk/wallet/FirstChargeRewardFragment;", "Landroid/support/v4/app/Fragment;", "()V", "mItemUILayout", "", "mIvRewardIcon", "Landroid/widget/ImageView;", "mLlRewardLayout", "Landroid/widget/LinearLayout;", "mTvRewardTitle", "Landroid/widget/TextView;", "mUILayout", "initView", "", "rootView", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "RewardViewHolder", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
public final class FirstChargeRewardFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17774a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f17775d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public int f17776b = C0906R.layout.ahy;

    /* renamed from: c  reason: collision with root package name */
    public int f17777c = C0906R.layout.aj8;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f17778e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f17779f;
    private LinearLayout g;
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/bytedance/android/livesdk/wallet/FirstChargeRewardFragment$Companion;", "", "()V", "newInstance", "Lcom/bytedance/android/livesdk/wallet/FirstChargeRewardFragment;", "uiLayout", "", "itemUILayout", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17780a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rR\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/android/livesdk/wallet/FirstChargeRewardFragment$RewardViewHolder;", "", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mIvRewardIcon", "Landroid/widget/ImageView;", "mRewardPlaceholder", "mTvRewardText", "Landroid/widget/TextView;", "bindView", "", "reward", "Lcom/bytedance/android/livesdkapi/model/FirstChargeRewardList$FirstChargeReward;", "Lcom/bytedance/android/livesdkapi/model/FirstChargeRewardList;", "isLast", "", "livesdk_cnDouyinRelease"}, k = 1, mv = {1, 1, 13})
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17781a;

        /* renamed from: b  reason: collision with root package name */
        final ImageView f17782b;

        /* renamed from: c  reason: collision with root package name */
        final TextView f17783c;

        /* renamed from: d  reason: collision with root package name */
        final View f17784d;

        /* renamed from: e  reason: collision with root package name */
        private final View f17785e;

        public b(@NotNull View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f17785e = view;
            View findViewById = this.f17785e.findViewById(C0906R.id.b4g);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.iv_reward_item_icon)");
            this.f17782b = (ImageView) findViewById;
            View findViewById2 = this.f17785e.findViewById(C0906R.id.dhk);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.tv_reward_item_text)");
            this.f17783c = (TextView) findViewById2;
            View findViewById3 = this.f17785e.findViewById(C0906R.id.ce4);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.reward_item_placeholder)");
            this.f17784d = findViewById3;
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f17774a, false, 13949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17774a, false, 13949, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.clear();
        }
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        byte b2;
        int i;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, bundle}, this, f17774a, false, 13946, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle}, this, f17774a, false, 13946, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{view2}, this, f17774a, false, 13947, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f17774a, false, 13947, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f17778e = (ImageView) view2.findViewById(C0906R.id.b4f);
            this.f17779f = (TextView) view2.findViewById(C0906R.id.dhm);
            this.g = (LinearLayout) view2.findViewById(C0906R.id.bhq);
        }
        l<com.bytedance.android.livesdkapi.i.a> lVar = LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE;
        Intrinsics.checkExpressionValueIsNotNull(lVar, "LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE");
        com.bytedance.android.livesdkapi.i.a aVar = (com.bytedance.android.livesdkapi.i.a) lVar.a();
        if (aVar != null) {
            ImageModel imageModel = aVar.f18803b;
            if (imageModel != null) {
                com.bytedance.android.livesdk.chatroom.f.b.a(this.f17778e, imageModel);
            }
            e eVar = aVar.f18802a;
            if (eVar != null) {
                TextView textView = this.f17779f;
                if (textView != null) {
                    textView.setText(y.a(eVar, ""));
                }
            }
            List<a.C0137a> list = aVar.f18804c;
            Intrinsics.checkExpressionValueIsNotNull(list, "rewardList.firstChargeRewards");
            if (!list.isEmpty()) {
                List<a.C0137a> list2 = aVar.f18804c;
                Intrinsics.checkExpressionValueIsNotNull(list2, "rewardList.firstChargeRewards");
                int i2 = 0;
                for (Object next : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    a.C0137a aVar2 = (a.C0137a) next;
                    View inflate = getLayoutInflater().inflate(this.f17777c, this.g, false);
                    Intrinsics.checkExpressionValueIsNotNull(inflate, "itemReward");
                    b bVar = new b(inflate);
                    Intrinsics.checkExpressionValueIsNotNull(aVar2, "reward");
                    if (i2 == aVar.f18804c.size() - 1) {
                        b2 = 1;
                    } else {
                        b2 = 0;
                    }
                    if (PatchProxy.isSupport(new Object[]{aVar2, Byte.valueOf(b2)}, bVar, b.f17781a, false, 13956, new Class[]{a.C0137a.class, Boolean.TYPE}, Void.TYPE)) {
                        b bVar2 = bVar;
                        PatchProxy.accessDispatch(new Object[]{aVar2, Byte.valueOf(b2)}, bVar2, b.f17781a, false, 13956, new Class[]{a.C0137a.class, Boolean.TYPE}, Void.TYPE);
                    } else {
                        Intrinsics.checkParameterIsNotNull(aVar2, "reward");
                        View view3 = bVar.f17784d;
                        if (b2 != 0) {
                            i = 8;
                        } else {
                            i = 0;
                        }
                        view3.setVisibility(i);
                        ImageModel imageModel2 = aVar2.f18806b;
                        if (imageModel2 != null) {
                            com.bytedance.android.livesdk.chatroom.f.b.a(bVar.f17782b, imageModel2);
                        }
                        e eVar2 = aVar2.f18805a;
                        if (eVar2 != null) {
                            bVar.f17783c.setText(y.a(eVar2, ""));
                        }
                    }
                    LinearLayout linearLayout = this.g;
                    if (linearLayout != null) {
                        linearLayout.addView(inflate);
                    }
                    i2 = i3;
                }
            }
        }
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f17774a, false, 13945, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f17774a, false, 13945, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(this.f17776b, viewGroup2, false);
    }
}
