package com.ss.android.ugc.aweme.story.feed.view.profile;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.base.utils.a;
import com.ss.android.ugc.aweme.story.base.utils.e;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;

public class PlayingProfileIndicator extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72770a;

    /* renamed from: b  reason: collision with root package name */
    FragmentActivity f72771b;

    /* renamed from: c  reason: collision with root package name */
    StoryChange.b f72772c;

    /* renamed from: d  reason: collision with root package name */
    StoryChange.a f72773d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f72774e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f72775f;
    private int g;
    private RecyclerView.Adapter<SimpleTextViewHolder> h;
    private TextView i;

    public static class SimpleTextViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f72783a;

        public SimpleTextViewHolder(View view) {
            super(view);
            this.f72783a = (TextView) view.findViewById(C0906R.id.a1v);
            e.a(this.f72783a);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72770a, false, 84046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72770a, false, 84046, new Class[0], Void.TYPE);
            return;
        }
        if (this.f72773d != null) {
            StoryChange.a(this.f72771b, this.f72773d);
        }
        if (this.f72772c != null) {
            StoryChange.a(this.f72771b, this.f72772c);
        }
    }

    public PlayingProfileIndicator(Context context) {
        this(context, null);
    }

    public final void a(UserStory userStory) {
        if (PatchProxy.isSupport(new Object[]{userStory}, this, f72770a, false, 84048, new Class[]{UserStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory}, this, f72770a, false, 84048, new Class[]{UserStory.class}, Void.TYPE);
            return;
        }
        this.g = (int) userStory.getTotalCount();
        this.h.notifyDataSetChanged();
        TextView textView = this.f72774e;
        textView.setText(this.g);
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f72770a, false, 84049, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f72770a, false, 84049, new Class[]{b.class}, Void.TYPE);
            return;
        }
        int indexOf = StoryChange.c(this.f72771b).getAwemeList().indexOf(bVar);
        if (indexOf != -1) {
            this.f72775f.scrollToPosition(indexOf);
            TextView textView = this.i;
            textView.setText((indexOf + 1));
            return;
        }
        throw new RuntimeException("StoryChange里有点问题");
    }

    public PlayingProfileIndicator(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayingProfileIndicator(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g = 10;
        if (PatchProxy.isSupport(new Object[]{context}, this, f72770a, false, 84047, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f72770a, false, 84047, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        LayoutInflater.from(context).inflate(C0906R.layout.ac3, this, true);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f72775f = (RecyclerView) findViewById(C0906R.id.cci);
        this.f72774e = (TextView) findViewById(C0906R.id.d65);
        this.i = (TextView) findViewById(C0906R.id.abr);
        this.i.setVisibility(4);
        this.h = new RecyclerView.Adapter<SimpleTextViewHolder>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72780a;

            public int getItemCount() {
                return 999;
            }

            public /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
                SimpleTextViewHolder simpleTextViewHolder = (SimpleTextViewHolder) viewHolder;
                if (PatchProxy.isSupport(new Object[]{simpleTextViewHolder, Integer.valueOf(i)}, this, f72780a, false, 84053, new Class[]{SimpleTextViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{simpleTextViewHolder, Integer.valueOf(i)}, this, f72780a, false, 84053, new Class[]{SimpleTextViewHolder.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                TextView textView = simpleTextViewHolder.f72783a;
                textView.setText((i + 1));
            }

            @NonNull
            public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
                ViewGroup viewGroup2 = viewGroup;
                if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f72780a, false, 84052, new Class[]{ViewGroup.class, Integer.TYPE}, SimpleTextViewHolder.class)) {
                    return new SimpleTextViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.a7q, viewGroup2, false));
                }
                return (SimpleTextViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f72780a, false, 84052, new Class[]{ViewGroup.class, Integer.TYPE}, SimpleTextViewHolder.class);
            }
        };
        this.f72771b = a.a(context);
        this.f72775f.setAdapter(this.h);
        this.f72775f.setLayoutManager(new LinearLayoutManager(context));
        AnonymousClass4 r9 = new PagerSnapHelper() {
        };
        e.a(this.i);
        e.a(this.f72774e);
        r9.attachToRecyclerView(this.f72775f);
    }
}
