package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.ai;
import com.ss.android.ugc.aweme.discover.ui.ak;
import com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0014J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0014J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/GuessWordsViewHolder;", "Lcom/ss/android/ugc/aweme/discover/adapter/BaseWordViewHolder;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/Word;", "itemView", "Landroid/view/View;", "listener", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IGuessWordHandler;", "(Landroid/view/View;Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IGuessWordHandler;)V", "mListener", "bindRealData", "", "list", "", "checkPlaceHolder", "", "initDifferenceView", "mobShowEvent", "mobShowEventByItem", "item", "position", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class GuessWordsViewHolder extends BaseWordViewHolder<Word> {
    public static ChangeQuickRedirect h;
    @NotNull
    @JvmField
    public static final List<Word> j;
    public static final a k = new a((byte) 0);
    public ak.a i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/GuessWordsViewHolder$Companion;", "", "()V", "GUESS_WORDS_PLACE_HOLDER", "", "Lcom/ss/android/ugc/aweme/discover/model/suggest/Word;", "create", "Lcom/ss/android/ugc/aweme/discover/adapter/GuessWordsViewHolder;", "parent", "Landroid/view/ViewGroup;", "listener", "Lcom/ss/android/ugc/aweme/discover/ui/SearchActionHandler$IGuessWordHandler;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41614a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/discover/adapter/GuessWordsViewHolder$bindRealData$1", "Lcom/ss/android/ugc/aweme/widget/flowlayout/TagAdapter;", "Lcom/ss/android/ugc/aweme/discover/model/suggest/Word;", "getView", "Landroid/view/View;", "parent", "Lcom/ss/android/ugc/aweme/widget/flowlayout/FlowLayout;", "position", "", "item", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b extends com.ss.android.ugc.aweme.widget.flowlayout.a<Word> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GuessWordsViewHolder f41616b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f41617c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/discover/adapter/GuessWordsViewHolder$bindRealData$1$getView$1", "Lcom/ss/android/ugc/aweme/discover/ui/OnSearchItemTouchAnimListener;", "onAction", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class a extends ai {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41618a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f41619b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f41620c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Word f41621d;

            public final void b(@NotNull View view, @NotNull MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f41618a, false, 35585, new Class[]{View.class, MotionEvent.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f41618a, false, 35585, new Class[]{View.class, MotionEvent.class}, Void.TYPE);
                    return;
                }
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(motionEvent, "event");
                r.a("trending_words_click", (Map) d.a().a("words_position", this.f41620c).a("words_source", "recom_search").a("words_content", this.f41621d.getWord()).a("group_id", this.f41621d.getId()).f34114b);
                ak.a aVar = this.f41619b.f41616b.i;
                if (aVar != null) {
                    aVar.a(this.f41621d, this.f41620c);
                }
            }

            a(b bVar, int i, Word word) {
                this.f41619b = bVar;
                this.f41620c = i;
                this.f41621d = word;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GuessWordsViewHolder guessWordsViewHolder, List list, List list2) {
            super(list2);
            this.f41616b = guessWordsViewHolder;
            this.f41617c = list;
        }

        public final /* synthetic */ View a(FlowLayout flowLayout, int i, Object obj) {
            FlowLayout flowLayout2 = flowLayout;
            Word word = (Word) obj;
            if (PatchProxy.isSupport(new Object[]{flowLayout2, Integer.valueOf(i), word}, this, f41615a, false, 35584, new Class[]{FlowLayout.class, Integer.TYPE, Word.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{flowLayout2, Integer.valueOf(i), word}, this, f41615a, false, 35584, new Class[]{FlowLayout.class, Integer.TYPE, Word.class}, View.class);
            }
            Intrinsics.checkParameterIsNotNull(flowLayout, "parent");
            Intrinsics.checkParameterIsNotNull(word, "item");
            View view = this.f41616b.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            View inflate = LayoutInflater.from(view.getContext()).inflate(C0906R.layout.vq, flowLayout2, false);
            TextView textView = (TextView) inflate.findViewById(C0906R.id.dcz);
            Intrinsics.checkExpressionValueIsNotNull(textView, "word");
            textView.setText(word.getWord());
            inflate.setOnTouchListener(new a(this, i, word));
            Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
            return inflate;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new Word());
        List<Word> unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkExpressionValueIsNotNull(unmodifiableList, "Collections.unmodifiableList(placeholder)");
        j = unmodifiableList;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, h, false, 35580, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 35580, new Class[0], Void.TYPE);
            return;
        }
        r.a("trending_show", (Map) d.a().a("words_num", this.g.size()).a("words_source", "recom_search").f34114b);
        super.a();
    }

    public final boolean b(@NotNull List<Word> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, h, false, 35578, new Class[]{List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list}, this, h, false, 35578, new Class[]{List.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(list, "list");
        if (!Intrinsics.areEqual((Object) list, (Object) j)) {
            return false;
        }
        v.a(this.f41549c, 0);
        v.a((View) this.f41550d, 8);
        return true;
    }

    public final void c(@NotNull List<Word> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, h, false, 35579, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, h, false, 35579, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "list");
        v.a((View) this.f41550d, 0);
        v.a(this.f41549c, 8);
        this.g = list;
        TagFlowLayout tagFlowLayout = this.f41550d;
        Intrinsics.checkExpressionValueIsNotNull(tagFlowLayout, "mTagGroup");
        tagFlowLayout.setAdapter(new b(this, list, list));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GuessWordsViewHolder(@NotNull View view, @Nullable ak.a aVar) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        if (PatchProxy.isSupport(new Object[0], this, h, false, 35577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, h, false, 35577, new Class[0], Void.TYPE);
        } else {
            this.f41548b.setText(C0906R.string.al6);
            TextView textView = this.f41548b;
            Intrinsics.checkExpressionValueIsNotNull(textView, "mTitle");
            TextPaint paint = textView.getPaint();
            Intrinsics.checkExpressionValueIsNotNull(paint, "mTitle.paint");
            paint.setFakeBoldText(true);
            this.f41548b.setTextSize(1, 14.0f);
            TextView textView2 = this.f41548b;
            TextView textView3 = this.f41548b;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "mTitle");
            Context context = textView3.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "mTitle.context");
            textView2.setTextColor(context.getResources().getColor(C0906R.color.hz));
            TextView textView4 = this.f41548b;
            Intrinsics.checkExpressionValueIsNotNull(textView4, "mTitle");
            Context context2 = textView4.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "mTitle.context");
            Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(context2.getResources(), 2130838940);
            Intrinsics.checkExpressionValueIsNotNull(a2, "drawable");
            a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
            TextView textView5 = this.f41548b;
            Intrinsics.checkExpressionValueIsNotNull(textView5, "mTitle");
            textView5.setCompoundDrawablePadding(u.a(7.5d));
            this.f41548b.setCompoundDrawables(a2, null, null, null);
            v.a(this.f41552f, 8);
            v.a(this.f41551e, 8);
            this.f41550d.setMaxLine(-1);
        }
        this.i = aVar;
    }

    public final /* synthetic */ void a(Object obj, int i2) {
        Word word = (Word) obj;
        if (PatchProxy.isSupport(new Object[]{word, Integer.valueOf(i2)}, this, h, false, 35581, new Class[]{Word.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{word, Integer.valueOf(i2)}, this, h, false, 35581, new Class[]{Word.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(word, "item");
        r.a("trending_words_show", (Map) d.a().a("words_position", i2).a("words_source", "recom_search").a("words_content", word.getWord()).a("group_id", word.getId()).f34114b);
    }
}
