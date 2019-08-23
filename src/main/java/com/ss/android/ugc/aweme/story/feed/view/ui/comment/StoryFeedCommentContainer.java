package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.api.model.g;
import java.util.ArrayList;
import java.util.List;

public class StoryFeedCommentContainer extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72866a;

    /* renamed from: b  reason: collision with root package name */
    List<g> f72867b;

    /* renamed from: c  reason: collision with root package name */
    a f72868c;

    /* renamed from: d  reason: collision with root package name */
    private ViewGroup f72869d;

    /* renamed from: e  reason: collision with root package name */
    private DmtTextView f72870e;

    public interface a {
        void a(g gVar);

        void ah_();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72866a, false, 84185, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72866a, false, 84185, new Class[0], Void.TYPE);
            return;
        }
        removeAllViews();
        a(0);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f72866a, false, 84187, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72866a, false, 84187, new Class[0], Void.TYPE);
            return;
        }
        int i = 0;
        while (i < this.f72867b.size() && i < 3) {
            g gVar = this.f72867b.get(i);
            if (PatchProxy.isSupport(new Object[]{gVar}, this, f72866a, false, 84190, new Class[]{g.class}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{gVar}, this, f72866a, false, 84190, new Class[]{g.class}, Boolean.TYPE)).booleanValue();
            } else {
                StoryCommentView storyCommentView = (StoryCommentView) LayoutInflater.from(getContext()).inflate(C0906R.layout.a3t, null);
                addView(storyCommentView, new LinearLayout.LayoutParams(-1, -2));
                storyCommentView.setComment(gVar);
                com.ss.android.ugc.aweme.story.feed.view.ui.a.a(storyCommentView);
                storyCommentView.setOnClickListener(new f(this));
            }
            i++;
        }
        post(new e(this));
    }

    public void setCommentClickListener(a aVar) {
        this.f72868c = aVar;
    }

    public StoryFeedCommentContainer(Context context) {
        this(context, null);
    }

    private void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72866a, false, 84188, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72866a, false, 84188, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i <= 0) {
            this.f72870e.setText(getResources().getString(C0906R.string.cea));
        } else {
            this.f72870e.setText(String.format(getResources().getString(C0906R.string.ce_), new Object[]{Integer.valueOf(i)}));
        }
        addView(this.f72869d, -2, -2);
    }

    public StoryFeedCommentContainer(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(List<g> list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f72866a, false, 84186, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f72866a, false, 84186, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f72867b.clear();
        this.f72867b.addAll(list);
        removeAllViews();
        b();
        a(i);
    }

    public StoryFeedCommentContainer(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[0], this, f72866a, false, 84183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72866a, false, 84183, new Class[0], Void.TYPE);
            return;
        }
        setOrientation(1);
        this.f72867b = new ArrayList();
        if (PatchProxy.isSupport(new Object[0], this, f72866a, false, 84184, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72866a, false, 84184, new Class[0], Void.TYPE);
            return;
        }
        this.f72869d = (ViewGroup) LayoutInflater.from(getContext()).inflate(C0906R.layout.a6a, null);
        this.f72870e = (DmtTextView) this.f72869d.findViewById(C0906R.id.v5);
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(this.f72869d);
        this.f72869d.setOnClickListener(new d(this));
    }
}
