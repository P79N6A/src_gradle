package com.ss.android.ugc.aweme.main.dialogmanager;

import android.app.Activity;
import android.arch.lifecycle.LifecycleObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.dialogmanager.b;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/main/dialogmanager/HomeDialogManager;", "Landroid/arch/lifecycle/LifecycleObserver;", "()V", "mCurIndex", "", "getMCurIndex", "()I", "setMCurIndex", "(I)V", "mIDialogList", "Ljava/util/ArrayList;", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog;", "getMIDialogList", "()Ljava/util/ArrayList;", "registDialog", "", "iDialog", "show", "activity", "Landroid/app/Activity;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HomeDialogManager implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54719a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f54720b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public int f54721c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 1, 15})
    public static final class a<T> implements Comparator<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54722a;

        public final int compare(T t, T t2) {
            if (!PatchProxy.isSupport(new Object[]{t, t2}, this, f54722a, false, 57979, new Class[]{Object.class, Object.class}, Integer.TYPE)) {
                return ComparisonsKt.compareValues(Integer.valueOf(((b) t).a()), Integer.valueOf(((b) t2).a()));
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{t, t2}, this, f54722a, false, 57979, new Class[]{Object.class, Object.class}, Integer.TYPE)).intValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/ugc/aweme/main/dialogmanager/HomeDialogManager$show$2", "Lcom/ss/android/ugc/aweme/main/dialogmanager/IHomeDialog$DialogDismissListener;", "onDialogDismiss", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f54723a;

        public b(Activity activity) {
            this.f54723a = activity;
        }
    }

    public final void a(@NotNull b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f54719a, false, 57977, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f54719a, false, 57977, new Class[]{b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "iDialog");
        this.f54720b.add(bVar2);
    }
}
