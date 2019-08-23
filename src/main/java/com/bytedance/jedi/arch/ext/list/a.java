package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.ext.list.differ.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0017\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000bH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0016R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "T", "", "mDiffer", "Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getMDiffer", "()Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getCurrentList", "", "getItem", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "submitList", "", "list", "ext_list_release"}, k = 1, mv = {1, 1, 15})
public interface a<T> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.jedi.arch.ext.list.a$a  reason: collision with other inner class name */
    public static final class C0194a {
        public static <T> int a(a<T> aVar) {
            return aVar.a().a();
        }

        @Nullable
        public static <T> T a(a<T> aVar, int i) {
            return aVar.a().a(i);
        }

        public static <T> void a(a<T> aVar, @Nullable List<? extends T> list) {
            b a2 = aVar.a();
            a2.f21357b++;
            int i = a2.f21357b;
            List<? extends T> list2 = a2.f21358c;
            if (list != list2) {
                if (list == null) {
                    if (list2 == null) {
                        Intrinsics.throwNpe();
                    }
                    int size = list2.size();
                    a2.f21358c = null;
                    a2.f21359d.onRemoved(0, size);
                } else if (list2 == null) {
                    a2.f21358c = list;
                    a2.f21359d.onInserted(0, list.size());
                } else {
                    a2.f21360e.f21368a.execute(new b.a(a2, list2, list, i));
                }
            }
        }
    }

    @NotNull
    b<T> a();

    void a(@Nullable List<? extends T> list);
}
