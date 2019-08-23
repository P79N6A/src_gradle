package com.ss.android.ugc.aweme.discover.hotspot;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailFragment;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.feed.param.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailActivity;", "Lcom/ss/android/ugc/aweme/detail/ui/DetailActivity;", "()V", "createFragment", "Lcom/ss/android/ugc/aweme/detail/ui/DetailFragment;", "param", "Lcom/ss/android/ugc/aweme/feed/param/FeedParam;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class HotSpotDetailActivity extends DetailActivity {
    public static ChangeQuickRedirect h;
    public static final a i = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/HotSpotDetailActivity$Companion;", "", "()V", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "param", "Lcom/ss/android/ugc/aweme/discover/model/SearchResultParam;", "launchHotSpot", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42404a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        public final void a(@Nullable Context context, @NotNull SearchResultParam searchResultParam) {
            Context context2 = context;
            SearchResultParam searchResultParam2 = searchResultParam;
            if (PatchProxy.isSupport(new Object[]{context2, searchResultParam2}, this, f42404a, false, 36423, new Class[]{Context.class, SearchResultParam.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, searchResultParam2}, this, f42404a, false, 36423, new Class[]{Context.class, SearchResultParam.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(searchResultParam2, "param");
            if (context2 != null) {
                context2.startActivity(b(context2, searchResultParam2));
            }
        }

        @NotNull
        public final Intent b(@Nullable Context context, @NotNull SearchResultParam searchResultParam) {
            Context context2 = context;
            SearchResultParam searchResultParam2 = searchResultParam;
            if (PatchProxy.isSupport(new Object[]{context2, searchResultParam2}, this, f42404a, false, 36424, new Class[]{Context.class, SearchResultParam.class}, Intent.class)) {
                return (Intent) PatchProxy.accessDispatch(new Object[]{context2, searchResultParam2}, this, f42404a, false, 36424, new Class[]{Context.class, SearchResultParam.class}, Intent.class);
            }
            Intrinsics.checkParameterIsNotNull(searchResultParam2, "param");
            Intent intent = new Intent(context2, HotSpotDetailActivity.class);
            intent.putExtra("hot_search_key", searchResultParam.getKeyword());
            intent.putExtra("refer", "trending_page");
            intent.putExtra("video_from", "trending_page");
            intent.putExtra("previous_page", searchResultParam.getEnterFrom());
            intent.putExtra("hot_is_ad", searchResultParam.isAd());
            r.a("enter_trending_page", (Map) d.a().a("enter_method", searchResultParam.getEnterFrom()).a("trending_topic", searchResultParam.getKeyword()).f34114b);
            return intent;
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final void a(@Nullable Context context, @NotNull SearchResultParam searchResultParam) {
        Context context2 = context;
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{context2, searchResultParam2}, null, h, true, 36419, new Class[]{Context.class, SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, searchResultParam2}, null, h, true, 36419, new Class[]{Context.class, SearchResultParam.class}, Void.TYPE);
            return;
        }
        i.a(context2, searchResultParam2);
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, h, false, 36420, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, h, false, 36420, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity", "onCreate", false);
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 36421, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 36421, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, h, false, 36422, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, h, false, 36422, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.hotspot.HotSpotDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, h, false, 36416, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, h, false, 36416, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    @NotNull
    public final DetailFragment a(@NotNull b bVar) {
        HotSpotDetailFragment hotSpotDetailFragment;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, h, false, 36415, new Class[]{b.class}, DetailFragment.class)) {
            return (DetailFragment) PatchProxy.accessDispatch(new Object[]{bVar2}, this, h, false, 36415, new Class[]{b.class}, DetailFragment.class);
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "param");
        HotSpotDetailFragment.a aVar = HotSpotDetailFragment.n;
        if (PatchProxy.isSupport(new Object[]{bVar2}, aVar, HotSpotDetailFragment.a.f42405a, false, 36429, new Class[]{b.class}, HotSpotDetailFragment.class)) {
            HotSpotDetailFragment.a aVar2 = aVar;
            hotSpotDetailFragment = (HotSpotDetailFragment) PatchProxy.accessDispatch(new Object[]{bVar2}, aVar2, HotSpotDetailFragment.a.f42405a, false, 36429, new Class[]{b.class}, HotSpotDetailFragment.class);
        } else {
            Intrinsics.checkParameterIsNotNull(bVar2, "param");
            Bundle bundle = new Bundle();
            bundle.putSerializable("feed_param", bVar2);
            hotSpotDetailFragment = new HotSpotDetailFragment();
            hotSpotDetailFragment.setArguments(bundle);
        }
        return hotSpotDetailFragment;
    }
}
