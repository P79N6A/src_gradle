package com.ss.android.ugc.aweme.discover.hotspot;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.e;
import com.bytedance.jedi.arch.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailPageFragment;
import com.ss.android.ugc.aweme.discover.hotspot.SpotChangeCallBack;
import com.ss.android.ugc.aweme.discover.hotspot.list.HotSpotListAdapter;
import com.ss.android.ugc.aweme.discover.hotspot.list.HotSpotListDialog;
import com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainState;
import com.ss.android.ugc.aweme.discover.hotspot.viewmodel.HotSpotMainViewModel;
import com.ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\b\u0010\u0014\u001a\u00020\u0010H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/SpotBottomViewHolder;", "Lcom/ss/android/ugc/aweme/discover/hotspot/SpotBaseViewHolder;", "lifecycleOwner", "Lcom/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailPageFragment;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailPageFragment;Landroid/view/View;)V", "getItemView", "()Landroid/view/View;", "setItemView", "(Landroid/view/View;)V", "getLifecycleOwner", "()Lcom/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailPageFragment;", "setLifecycleOwner", "(Lcom/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailPageFragment;)V", "bind", "", "spot", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "onCreate", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SpotBottomViewHolder extends SpotBaseViewHolder {
    public static ChangeQuickRedirect h;
    @NotNull
    public HotSpotDetailPageFragment i;
    @NotNull
    public View j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42411a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SpotBottomViewHolder f42412b;

        a(SpotBottomViewHolder spotBottomViewHolder) {
            this.f42412b = spotBottomViewHolder;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f42411a, false, 36529, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f42411a, false, 36529, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            HotSpotDetailPageFragment hotSpotDetailPageFragment = this.f42412b.i;
            if (PatchProxy.isSupport(new Object[0], hotSpotDetailPageFragment, HotSpotDetailPageFragment.g, false, 36455, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], hotSpotDetailPageFragment, HotSpotDetailPageFragment.g, false, 36455, new Class[0], Void.TYPE);
            } else {
                HotSpotMainViewModel q = hotSpotDetailPageFragment.q();
                if (PatchProxy.isSupport(new Object[0], q, HotSpotMainViewModel.f42486d, false, 36637, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], q, HotSpotMainViewModel.f42486d, false, 36637, new Class[0], Void.TYPE);
                } else {
                    q.b(new HotSpotMainViewModel.b(q));
                }
                if (hotSpotDetailPageFragment.getActivity() != null) {
                    FragmentActivity activity = hotSpotDetailPageFragment.getActivity();
                    if (activity == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!activity.isFinishing()) {
                        if (hotSpotDetailPageFragment.p == null) {
                            Context context = hotSpotDetailPageFragment.getContext();
                            if (context == null) {
                                Intrinsics.throwNpe();
                            }
                            Intrinsics.checkExpressionValueIsNotNull(context, "context!!");
                            hotSpotDetailPageFragment.p = new HotSpotListDialog(context, hotSpotDetailPageFragment.q());
                            HotSpotListDialog hotSpotListDialog = hotSpotDetailPageFragment.p;
                            if (hotSpotListDialog != null) {
                                e.a.a(hotSpotDetailPageFragment, hotSpotDetailPageFragment.q(), e.INSTANCE, false, false, null, null, new HotSpotDetailPageFragment.i(hotSpotListDialog, hotSpotDetailPageFragment), 30, null);
                            }
                        } else {
                            HotSpotListDialog hotSpotListDialog2 = hotSpotDetailPageFragment.p;
                            if (hotSpotListDialog2 != null) {
                                if (PatchProxy.isSupport(new Object[0], hotSpotListDialog2, HotSpotListDialog.f42456a, false, 36599, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], hotSpotListDialog2, HotSpotListDialog.f42456a, false, 36599, new Class[0], Void.TYPE);
                                } else {
                                    RecyclerView recyclerView = hotSpotListDialog2.f42457b;
                                    if (recyclerView == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("listView");
                                    }
                                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                                    if (layoutManager != null) {
                                        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                                        RecyclerView recyclerView2 = hotSpotListDialog2.f42457b;
                                        if (recyclerView2 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("listView");
                                        }
                                        RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
                                        if (layoutManager2 != null) {
                                            int findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager2).findLastVisibleItemPosition();
                                            int i = 0;
                                            for (Object next : hotSpotListDialog2.f42458c.f42452b) {
                                                int i2 = i + 1;
                                                if (i < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                HotSearchItem hotSearchItem = (HotSearchItem) next;
                                                if (i >= findFirstVisibleItemPosition && i <= findLastVisibleItemPosition) {
                                                    SpotChangeCallBack.a aVar = SpotChangeCallBack.f42414d;
                                                    Context context2 = hotSpotListDialog2.getContext();
                                                    Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                                                    r.a("trending_topic_show", aVar.a(context2, hotSearchItem));
                                                }
                                                i = i2;
                                            }
                                            HotSpotListAdapter hotSpotListAdapter = hotSpotListDialog2.f42458c;
                                            if (PatchProxy.isSupport(new Object[0], hotSpotListAdapter, HotSpotListAdapter.f42451a, false, 36596, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], hotSpotListAdapter, HotSpotListAdapter.f42451a, false, 36596, new Class[0], Void.TYPE);
                                            } else {
                                                for (HotSearchItem hasSentMob : hotSpotListAdapter.f42452b) {
                                                    hasSentMob.setHasSentMob(false);
                                                }
                                            }
                                        } else {
                                            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                                        }
                                    } else {
                                        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                                    }
                                }
                            }
                        }
                        HotSpotListDialog hotSpotListDialog3 = hotSpotDetailPageFragment.p;
                        if (hotSpotListDialog3 != null) {
                            hotSpotListDialog3.show();
                        }
                    }
                }
            }
            SpotChangeCallBack.a aVar2 = SpotChangeCallBack.f42414d;
            Context context3 = this.f42412b.j.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "itemView.context");
            r.a("click_more_trending", aVar2.b(context3));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "listResponse", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<f, HotSearchListResponse, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SpotBottomViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SpotBottomViewHolder spotBottomViewHolder) {
            super(2);
            this.this$0 = spotBottomViewHolder;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((f) obj, (HotSearchListResponse) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull f fVar, @NotNull final HotSearchListResponse hotSearchListResponse) {
            if (PatchProxy.isSupport(new Object[]{fVar, hotSearchListResponse}, this, changeQuickRedirect, false, 36532, new Class[]{f.class, HotSearchListResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar, hotSearchListResponse}, this, changeQuickRedirect, false, 36532, new Class[]{f.class, HotSearchListResponse.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar, "$receiver");
            Intrinsics.checkParameterIsNotNull(hotSearchListResponse, "listResponse");
            fVar.a(this.this$0.f(), new Function1<HotSpotMainState, List<? extends HotSearchItem>>(this) {
                public static ChangeQuickRedirect changeQuickRedirect;
                final /* synthetic */ b this$0;

                {
                    this.this$0 = r1;
                }

                @NotNull
                public final List<HotSearchItem> invoke(@NotNull HotSpotMainState hotSpotMainState) {
                    if (PatchProxy.isSupport(new Object[]{hotSpotMainState}, this, changeQuickRedirect, false, 36533, new Class[]{HotSpotMainState.class}, List.class)) {
                        return (List) PatchProxy.accessDispatch(new Object[]{hotSpotMainState}, this, changeQuickRedirect, false, 36533, new Class[]{HotSpotMainState.class}, List.class);
                    }
                    Intrinsics.checkParameterIsNotNull(hotSpotMainState, AdvanceSetting.NETWORK_TYPE);
                    String curSpotWord = hotSpotMainState.getCurSpotWord();
                    HotSearchEntity data = hotSearchListResponse.getData();
                    Intrinsics.checkExpressionValueIsNotNull(data, "listResponse.data");
                    List<HotSearchItem> list = data.getList();
                    Intrinsics.checkExpressionValueIsNotNull(list, "listResponse.data.list");
                    Collection arrayList = new ArrayList();
                    for (Object next : list) {
                        if (!TextUtils.equals(((HotSearchItem) next).getWord(), curSpotWord)) {
                            arrayList.add(next);
                        }
                    }
                    List<HotSearchItem> list2 = (List) arrayList;
                    this.this$0.this$0.a(list2.subList(0, Math.min(list2.size(), 5)));
                    return list2;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/bytedance/jedi/arch/IdentitySubscriber;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function2<f, Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ SpotBottomViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SpotBottomViewHolder spotBottomViewHolder) {
            super(2);
            this.this$0 = spotBottomViewHolder;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((f) obj, ((Boolean) obj2).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull f fVar, boolean z) {
            f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{fVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 36536, new Class[]{f.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fVar2, Byte.valueOf(z)}, this, changeQuickRedirect, false, 36536, new Class[]{f.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "$receiver");
            com.ss.android.ugc.aweme.discover.hotspot.b.b.a(this.this$0.j, z, 400);
        }
    }

    public final void aj_() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 36525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 36525, new Class[0], Void.TYPE);
            return;
        }
        super.aj_();
        e.a.a(this, f(), f.INSTANCE, false, false, null, null, new b(this), 30, null);
        Disposable unused = a(f(), g.INSTANCE, c(), false, new c(this));
        if (com.ss.android.ugc.aweme.discover.hotspot.b.a.f42443b.b()) {
            LinearLayout linearLayout = (LinearLayout) this.j.findViewById(C0906R.id.ctj);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "itemView.spot_bottom_inner");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 16;
                LinearLayout linearLayout2 = (LinearLayout) this.j.findViewById(C0906R.id.ctj);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "itemView.spot_bottom_inner");
                linearLayout2.setLayoutParams(layoutParams2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
    }

    public final void a(@NotNull List<HotSearchItem> list) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{list}, this, h, false, 36526, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, h, false, 36526, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "spot");
        StringBuilder sb = new StringBuilder("");
        for (Object next : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            sb.append(((HotSearchItem) next).getWord());
            if (i2 != list.size() - 1) {
                sb.append("   ");
            }
            i2 = i3;
        }
        ((MarqueeView) this.j.findViewById(C0906R.id.ctl)).setText(sb.toString());
        ((MarqueeView) this.j.findViewById(C0906R.id.ctl)).a();
        this.j.setOnClickListener(new a(this));
    }

    public SpotBottomViewHolder(@NotNull HotSpotDetailPageFragment hotSpotDetailPageFragment, @NotNull View view) {
        Intrinsics.checkParameterIsNotNull(hotSpotDetailPageFragment, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.i = hotSpotDetailPageFragment;
        this.j = view;
    }
}
