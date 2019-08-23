package com.ss.android.ugc.aweme.discover.hotspot;

import android.app.Activity;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/SpotChangeCallBack;", "Landroid/arch/lifecycle/ViewModel;", "()V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "mData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SpotChangeCallBack extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42413a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f42414d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final b<HotSearchItem> f42415b = new b<>();

    /* renamed from: c  reason: collision with root package name */
    public int f42416c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u0005\u001a\u00020\nH\u0002J\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/SpotChangeCallBack$Companion;", "", "()V", "from", "Lcom/ss/android/ugc/aweme/discover/hotspot/SpotChangeCallBack;", "context", "Landroid/content/Context;", "getCurSpot", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "activity", "Landroid/support/v4/app/FragmentActivity;", "getCurrentChangeLiveData", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "getMap", "", "", "curItem", "onSpotChange", "", "spot", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42417a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SpotChangeCallBack a(@NotNull Context context) {
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f42417a, false, 36543, new Class[]{Context.class}, SpotChangeCallBack.class)) {
                return (SpotChangeCallBack) PatchProxy.accessDispatch(new Object[]{context2}, this, f42417a, false, 36543, new Class[]{Context.class}, SpotChangeCallBack.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Activity a2 = v.a(context);
            if (a2 != null) {
                ViewModel viewModel = ViewModelProviders.of((FragmentActivity) a2).get(SpotChangeCallBack.class);
                Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders\n     …angeCallBack::class.java)");
                return (SpotChangeCallBack) viewModel;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }

        @JvmStatic
        @NotNull
        public final Map<String, String> b(@NotNull Context context) {
            String str;
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2}, this, f42417a, false, 36547, new Class[]{Context.class}, Map.class)) {
                return (Map) PatchProxy.accessDispatch(new Object[]{context2}, this, f42417a, false, 36547, new Class[]{Context.class}, Map.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Activity a2 = v.a(context);
            if (a2 != null) {
                Context context3 = (FragmentActivity) a2;
                com.ss.android.ugc.aweme.feed.param.b a3 = FeedParamProvider.f45761c.a(context3);
                if (!a3.isHotSpot()) {
                    return new HashMap<>();
                }
                SpotChangeCallBack a4 = a(context3);
                d a5 = d.a().a("enter_method", a3.getPreviousPage());
                HotSearchItem hotSearchItem = (HotSearchItem) a4.f42415b.getValue();
                if (hotSearchItem != null) {
                    str = hotSearchItem.getWord();
                } else {
                    str = null;
                }
                Map<String, String> map = a5.a("trending_topic", str).a("order", a4.f42416c + 1).f34114b;
                Intrinsics.checkExpressionValueIsNotNull(map, "EventMapBuilder.newBuild…               .builder()");
                return map;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }

        @JvmStatic
        @NotNull
        public final Map<String, String> a(@NotNull Context context, @Nullable HotSearchItem hotSearchItem) {
            Integer num;
            Context context2 = context;
            if (PatchProxy.isSupport(new Object[]{context2, hotSearchItem}, this, f42417a, false, 36546, new Class[]{Context.class, HotSearchItem.class}, Map.class)) {
                return (Map) PatchProxy.accessDispatch(new Object[]{context2, hotSearchItem}, this, f42417a, false, 36546, new Class[]{Context.class, HotSearchItem.class}, Map.class);
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Activity a2 = v.a(context);
            if (a2 != null) {
                com.ss.android.ugc.aweme.feed.param.b a3 = FeedParamProvider.f45761c.a((FragmentActivity) a2);
                String str = null;
                if (hotSearchItem != null) {
                    num = Integer.valueOf(hotSearchItem.getPosition());
                } else {
                    num = null;
                }
                d a4 = d.a().a("enter_method", a3.getPreviousPage());
                if (hotSearchItem != null) {
                    str = hotSearchItem.getWord();
                }
                Map<String, String> map = a4.a("trending_topic", str).a("order", (Object) num).f34114b;
                Intrinsics.checkExpressionValueIsNotNull(map, "EventMapBuilder.newBuild…               .builder()");
                return map;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }
}
