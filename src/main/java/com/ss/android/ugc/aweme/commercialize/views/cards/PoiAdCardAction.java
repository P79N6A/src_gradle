package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0014¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/cards/PoiAdCardAction;", "Lcom/ss/android/ugc/aweme/commercialize/views/cards/AbsAdCardAction;", "context", "Landroid/content/Context;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "lifecycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "simplePageLoadListener", "Lcom/ss/android/ugc/aweme/commercialize/listener/SimplePageLoadListener;", "(Landroid/content/Context;Lcom/ss/android/ugc/aweme/feed/model/Aweme;Landroid/arch/lifecycle/LifecycleOwner;Lcom/ss/android/ugc/aweme/commercialize/listener/SimplePageLoadListener;)V", "onClick", "", "onClose", "onResume", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiAdCardAction extends AbsAdCardAction {
    public static ChangeQuickRedirect j;

    public final void a() {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33099, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33099, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        g.a("close", this.f2957f, this.g, "card");
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, j, false, 33098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, j, false, 33098, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.i instanceof j) {
            LifecycleOwner lifecycleOwner = this.i;
            if (lifecycleOwner != null) {
                ((j) lifecycleOwner).a(true);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.views.cards.IAdHalfWebPageFragment");
            }
        }
    }

    public PoiAdCardAction(@Nullable Context context, @Nullable Aweme aweme, @Nullable LifecycleOwner lifecycleOwner, @Nullable f fVar) {
        super(context, aweme, lifecycleOwner, fVar);
        this.f2955d = 2130839477;
    }
}
