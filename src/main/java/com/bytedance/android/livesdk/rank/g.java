package com.bytedance.android.livesdk.rank;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.model.a.k;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.rank.adapter.LinkRankAdapter;
import com.bytedance.android.livesdk.widget.e;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;

public final class g extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17000a;

    /* renamed from: b  reason: collision with root package name */
    private List<k> f17001b;

    public final int a() {
        return C0906R.layout.agk;
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f17000a, false, 12963, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f17000a, false, 12963, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        View findViewById = findViewById(C0906R.id.ti);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0906R.id.c_k);
        View findViewById2 = findViewById(C0906R.id.a9o);
        findViewById.setOnClickListener(new h(this));
        if (Lists.isEmpty(this.f17001b)) {
            recyclerView.setVisibility(8);
            findViewById2.setVisibility(0);
            return;
        }
        recyclerView.setLayoutManager(new SSLinearLayoutManager(getContext()));
        recyclerView.setAdapter(new LinkRankAdapter(this.f17001b));
    }

    public g(@NonNull Context context, List<k> list) {
        super(context);
        this.f17001b = list;
    }
}
