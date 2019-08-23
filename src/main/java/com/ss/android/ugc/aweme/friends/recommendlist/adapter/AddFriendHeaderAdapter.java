package com.ss.android.ugc.aweme.friends.recommendlist.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\u0014\u0010\u001a\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001cJ&\u0010\u001d\u001a\u00020\u000f2\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R(\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/AddFriendHeaderAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/AddFriendViewHolder;", "()V", "mCommandDrawable", "Landroid/graphics/drawable/Drawable;", "mContactDrawable", "mData", "", "Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/HeaderIconState;", "mFaceDrawable", "mItemClickListener", "Lkotlin/Function3;", "Landroid/view/View;", "", "", "mScanDrawable", "getItem", "position", "getItemCount", "onBindViewHolder", "viewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "setData", "data", "", "setItemClickListener", "onItemClick", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AddFriendHeaderAdapter extends RecyclerView.Adapter<AddFriendViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48951a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f48952d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f48953b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public Function3<? super View, ? super Integer, ? super Integer, Unit> f48954c;

    /* renamed from: e  reason: collision with root package name */
    private final Drawable f48955e;

    /* renamed from: f  reason: collision with root package name */
    private final Drawable f48956f;
    private final Drawable g;
    private final Drawable h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/AddFriendHeaderAdapter$Companion;", "", "()V", "COMMAND", "", "CONTACT", "FACE_TO_FACE", "SCAN", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/friends/recommendlist/adapter/AddFriendHeaderAdapter$onBindViewHolder$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48957a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f48958b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AddFriendHeaderAdapter f48959c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AddFriendViewHolder f48960d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f48961e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f48962f;

        b(a aVar, AddFriendHeaderAdapter addFriendHeaderAdapter, AddFriendViewHolder addFriendViewHolder, int i, a aVar2) {
            this.f48958b = aVar;
            this.f48959c = addFriendHeaderAdapter;
            this.f48960d = addFriendViewHolder;
            this.f48961e = i;
            this.f48962f = aVar2;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f48957a, false, 46721, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f48957a, false, 46721, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function3<? super View, ? super Integer, ? super Integer, Unit> function3 = this.f48959c.f48954c;
            if (function3 != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                function3.invoke(view, Integer.valueOf(this.f48958b.f48977b), Integer.valueOf(this.f48961e));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/friends/recommendlist/adapter/AddFriendHeaderAdapter$onBindViewHolder$1$2"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48963a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f48964b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AddFriendHeaderAdapter f48965c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AddFriendViewHolder f48966d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f48967e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a f48968f;

        c(a aVar, AddFriendHeaderAdapter addFriendHeaderAdapter, AddFriendViewHolder addFriendViewHolder, int i, a aVar2) {
            this.f48964b = aVar;
            this.f48965c = addFriendHeaderAdapter;
            this.f48966d = addFriendViewHolder;
            this.f48967e = i;
            this.f48968f = aVar2;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f48963a, false, 46722, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f48963a, false, 46722, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            Function3<? super View, ? super Integer, ? super Integer, Unit> function3 = this.f48965c.f48954c;
            if (function3 != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, AdvanceSetting.NETWORK_TYPE);
                function3.invoke(view, Integer.valueOf(this.f48964b.f48977b), Integer.valueOf(this.f48967e));
            }
        }
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f48951a, false, 46716, new Class[0], Integer.TYPE)) {
            return this.f48953b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f48951a, false, 46716, new Class[0], Integer.TYPE)).intValue();
    }

    public AddFriendHeaderAdapter() {
        Context context = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "GlobalContext.getContext()");
        this.f48955e = com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130838759);
        Context context2 = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "GlobalContext.getContext()");
        this.f48956f = com.ss.android.ugc.bytex.a.a.a.a(context2.getResources(), 2130838758);
        Context context3 = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context3, "GlobalContext.getContext()");
        this.g = com.ss.android.ugc.bytex.a.a.a.a(context3.getResources(), 2130838763);
        Context context4 = GlobalContext.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context4, "GlobalContext.getContext()");
        this.h = com.ss.android.ugc.bytex.a.a.a.a(context4.getResources(), 2130838761);
    }

    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        AddFriendViewHolder addFriendViewHolder;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48951a, false, 46715, new Class[]{ViewGroup.class, Integer.TYPE}, AddFriendViewHolder.class)) {
            addFriendViewHolder = (AddFriendViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f48951a, false, 46715, new Class[]{ViewGroup.class, Integer.TYPE}, AddFriendViewHolder.class);
        } else {
            Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.eu, viewGroup2, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(pare…ader_item, parent, false)");
            addFriendViewHolder = new AddFriendViewHolder(inflate);
        }
        return addFriendViewHolder;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        a aVar;
        AddFriendViewHolder addFriendViewHolder = (AddFriendViewHolder) viewHolder;
        if (PatchProxy.isSupport(new Object[]{addFriendViewHolder, Integer.valueOf(i)}, this, f48951a, false, 46718, new Class[]{AddFriendViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{addFriendViewHolder, Integer.valueOf(i)}, this, f48951a, false, 46718, new Class[]{AddFriendViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(addFriendViewHolder, "viewHolder");
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48951a, false, 46717, new Class[]{Integer.TYPE}, a.class)) {
            aVar = (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48951a, false, 46717, new Class[]{Integer.TYPE}, a.class);
        } else if (i < 0 || i >= this.f48953b.size()) {
            aVar = null;
        } else {
            aVar = this.f48953b.get(i);
        }
        a aVar2 = aVar;
        if (aVar2 != null) {
            switch (aVar2.f48977b) {
                case 0:
                    addFriendViewHolder.f48969a.setImageDrawable(this.f48955e);
                    break;
                case 1:
                    addFriendViewHolder.f48969a.setImageDrawable(this.f48956f);
                    break;
                case 2:
                    addFriendViewHolder.f48969a.setImageDrawable(this.g);
                    break;
                case 3:
                    addFriendViewHolder.f48969a.setImageDrawable(this.h);
                    break;
            }
            ImageView imageView = addFriendViewHolder.f48969a;
            a aVar3 = aVar2;
            AddFriendViewHolder addFriendViewHolder2 = addFriendViewHolder;
            int i2 = i;
            a aVar4 = aVar2;
            b bVar = new b(aVar3, this, addFriendViewHolder2, i2, aVar4);
            imageView.setOnClickListener(bVar);
            View view = addFriendViewHolder.itemView;
            c cVar = new c(aVar3, this, addFriendViewHolder2, i2, aVar4);
            view.setOnClickListener(cVar);
            addFriendViewHolder.f48971c.setText(aVar2.f48978c);
            if (aVar2.f48979d > 0) {
                addFriendViewHolder.f48970b.setVisibility(0);
            } else {
                addFriendViewHolder.f48970b.setVisibility(8);
            }
        }
    }
}
