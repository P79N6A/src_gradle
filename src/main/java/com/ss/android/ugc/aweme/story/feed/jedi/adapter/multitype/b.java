package com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.StoryMultiTypeViewHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003JY\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002'\b\u0002\u0010\u0005\u001a!\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\f2 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\u000fH&J8\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0010\u001a\u00020\u00072 \u0010\r\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006j\n\u0012\u0006\b\u0001\u0012\u00028\u0000`\u000fH'¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryViewHolderFactoryRegistry;", "VH", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;", "", "register", "typeMatcher", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "position", "", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/ViewHolderTypeMatcher;", "factory", "Landroid/view/ViewGroup;", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/ViewHolderFactory;", "viewType", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface b<VH extends StoryMultiTypeViewHolder<?>> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class a {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "VH", "Lcom/ss/android/ugc/aweme/story/feed/jedi/adapter/multitype/StoryMultiTypeViewHolder;", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.story.feed.jedi.adapter.multitype.b$a$a  reason: collision with other inner class name */
        static final class C0757a extends Lambda implements Function1<Integer, Boolean> {
            public static final C0757a INSTANCE = new C0757a();
            public static ChangeQuickRedirect changeQuickRedirect;

            C0757a() {
                super(1);
            }

            public final boolean invoke(int i) {
                return true;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(invoke(((Number) obj).intValue()));
            }
        }
    }

    @NotNull
    b<VH> a(@NotNull Function1<? super Integer, Boolean> function1, @NotNull Function1<? super ViewGroup, ? extends VH> function12);
}
