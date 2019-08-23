package com.ss.android.ugc.aweme.freeflowcard;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.freeflowcard.data.b.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.af;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J$\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/FreeFlowDataTestActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getStartModeWithRange", "Lkotlin/Pair;", "", "start", "end", "loadCurMonthData", "", "loadData", "loadLastMonthData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FreeFlowDataTestActivity extends AmeActivity implements af {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48544a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final e f48545b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap f48546c;

    public FreeFlowDataTestActivity() {
        this(null, 1, null);
    }

    private View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48544a, false, 46044, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48544a, false, 46044, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.f48546c == null) {
            this.f48546c = new HashMap();
        }
        View view = (View) this.f48546c.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.f48546c.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f48544a, false, 46046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48544a, false, 46046, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48544a, false, 46047, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48544a, false, 46047, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @NotNull
    public final e a() {
        return this.f48545b;
    }

    public FreeFlowDataTestActivity(@NotNull e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "coroutineContext");
        this.f48545b = eVar;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        int i;
        boolean z;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f48544a, false, 46039, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f48544a, false, 46039, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.bk);
        if (PatchProxy.isSupport(new Object[0], this, f48544a, false, 46040, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48544a, false, 46040, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f48544a, false, 46041, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48544a, false, 46041, new Class[0], Void.TYPE);
            } else {
                long[] b2 = a.b();
                List<a> a2 = com.ss.android.ugc.aweme.freeflowcard.data.a.a().a(b2[0], b2[1]);
                Intrinsics.checkExpressionValueIsNotNull(a2, "lastMonthData");
                Iterable<a> iterable = a2;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    i = 0;
                    for (a aVar : iterable) {
                        if (aVar.mode == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            i++;
                            if (i < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                } else {
                    i = 0;
                }
                DmtTextView dmtTextView = (DmtTextView) a(C0906R.id.b7c);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, "last_no_wifi");
                dmtTextView.setText(String.valueOf(a2.size() - i));
                DmtTextView dmtTextView2 = (DmtTextView) a(C0906R.id.b7f);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView2, "last_wifi");
                dmtTextView2.setText(String.valueOf(i));
            }
            if (PatchProxy.isSupport(new Object[0], this, f48544a, false, 46042, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48544a, false, 46042, new Class[0], Void.TYPE);
            } else {
                Pair<Integer, Integer> a3 = a(1, 7);
                DmtTextView dmtTextView3 = (DmtTextView) a(C0906R.id.dxo);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView3, "wifi_1");
                dmtTextView3.setText("1-7\n\n" + ((Number) a3.getFirst()).intValue());
                DmtTextView dmtTextView4 = (DmtTextView) a(C0906R.id.br1);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView4, "no_wifi_1");
                dmtTextView4.setText("1-7\n\n" + ((Number) a3.getSecond()).intValue());
                Pair<Integer, Integer> a4 = a(8, 18);
                DmtTextView dmtTextView5 = (DmtTextView) a(C0906R.id.dxp);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView5, "wifi_2");
                dmtTextView5.setText("8-18\n\n" + ((Number) a4.getFirst()).intValue());
                DmtTextView dmtTextView6 = (DmtTextView) a(C0906R.id.br2);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView6, "no_wifi_2");
                dmtTextView6.setText("8-18\n\n" + ((Number) a4.getSecond()).intValue());
                Pair<Integer, Integer> a5 = a(19, 25);
                DmtTextView dmtTextView7 = (DmtTextView) a(C0906R.id.dxq);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView7, "wifi_3");
                dmtTextView7.setText("19-25\n\n" + ((Number) a5.getFirst()).intValue());
                DmtTextView dmtTextView8 = (DmtTextView) a(C0906R.id.br3);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView8, "no_wifi_3");
                dmtTextView8.setText("19-25\n\n" + ((Number) a5.getSecond()).intValue());
                Pair<Integer, Integer> a6 = a(26, a.a());
                DmtTextView dmtTextView9 = (DmtTextView) a(C0906R.id.dxr);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView9, "wifi_4");
                dmtTextView9.setText("26-31\n\n" + ((Number) a6.getFirst()).intValue());
                DmtTextView dmtTextView10 = (DmtTextView) a(C0906R.id.br4);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView10, "no_wifi_4");
                dmtTextView10.setText("26-31\n\n" + ((Number) a6.getSecond()).intValue());
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onCreate", false);
    }

    private final Pair<Integer, Integer> a(int i, int i2) {
        int i3;
        boolean z;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f48544a, false, 46043, new Class[]{Integer.TYPE, Integer.TYPE}, Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f48544a, false, 46043, new Class[]{Integer.TYPE, Integer.TYPE}, Pair.class);
        }
        long[] a2 = a.a(i, i2);
        List<a> a3 = com.ss.android.ugc.aweme.freeflowcard.data.a.a().a(a2[0], a2[1]);
        if (CollectionUtils.isEmpty(a3)) {
            i3 = 0;
        } else {
            Intrinsics.checkExpressionValueIsNotNull(a3, "data");
            Iterable<a> iterable = a3;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                int i5 = 0;
                for (a aVar : iterable) {
                    if (aVar.mode == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i5++;
                        if (i5 < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                i4 = i5;
            }
            i3 = a3.size() - i4;
        }
        return new Pair<>(Integer.valueOf(i4), Integer.valueOf(i3));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FreeFlowDataTestActivity(e eVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? f.INSTANCE : eVar);
    }
}
