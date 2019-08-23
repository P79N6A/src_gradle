package com.google.common.collect;

import com.google.common.a.f;
import com.google.common.a.n;
import com.google.common.a.o;
import com.google.common.annotations.GwtCompatible;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class m {

    static class a<E> extends AbstractCollection<E> {

        /* renamed from: a  reason: collision with root package name */
        final Collection<E> f24772a;

        /* renamed from: b  reason: collision with root package name */
        final n<? super E> f24773b;

        public void clear() {
            av.a((Iterable<T>) this.f24772a, this.f24773b);
        }

        public Object[] toArray() {
            return az.a(iterator()).toArray();
        }

        public boolean isEmpty() {
            boolean z;
            Collection<E> collection = this.f24772a;
            if (aw.c(collection.iterator(), this.f24773b) != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            return false;
        }

        public Iterator<E> iterator() {
            Iterator<E> it2 = this.f24772a.iterator();
            n<? super E> nVar = this.f24773b;
            com.google.common.a.m.a(it2);
            com.google.common.a.m.a(nVar);
            return new b<T>(it2, nVar) {

                /* renamed from: a */
                final /* synthetic */ Iterator f24597a;

                /* renamed from: b */
                final /* synthetic */ n f24598b;

                public final T a(
/*
Method generation error in method: com.google.common.collect.aw.1.a():T, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.google.common.collect.aw.1.a():T, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:301)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:238)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            };
        }

        public int size() {
            int i = 0;
            for (E apply : this.f24772a) {
                if (this.f24773b.apply(apply)) {
                    i++;
                }
            }
            return i;
        }

        public boolean add(E e2) {
            com.google.common.a.m.a(this.f24773b.apply(e2));
            return this.f24772a.add(e2);
        }

        public boolean addAll(Collection<? extends E> collection) {
            for (Object apply : collection) {
                com.google.common.a.m.a(this.f24773b.apply(apply));
            }
            return this.f24772a.addAll(collection);
        }

        public boolean contains(@NullableDecl Object obj) {
            if (m.a(this.f24772a, obj)) {
                return this.f24773b.apply(obj);
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean remove(Object obj) {
            if (!contains(obj) || !this.f24772a.remove(obj)) {
                return false;
            }
            return true;
        }

        public <T> T[] toArray(T[] tArr) {
            return az.a(iterator()).toArray(tArr);
        }

        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it2 = this.f24772a.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                E next = it2.next();
                if (this.f24773b.apply(next) && collection.contains(next)) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it2 = this.f24772a.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                E next = it2.next();
                if (this.f24773b.apply(next) && !collection.contains(next)) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }

        a(Collection<E> collection, n<? super E> nVar) {
            this.f24772a = collection;
            this.f24773b = nVar;
        }
    }

    static class b<F, T> extends AbstractCollection<T> {

        /* renamed from: a  reason: collision with root package name */
        final Collection<F> f24774a;

        /* renamed from: b  reason: collision with root package name */
        final f<? super F, ? extends T> f24775b;

        public final void clear() {
            this.f24774a.clear();
        }

        public final boolean isEmpty() {
            return this.f24774a.isEmpty();
        }

        public final int size() {
            return this.f24774a.size();
        }

        public final Iterator<T> iterator() {
            Iterator<F> it2 = this.f24774a.iterator();
            f<? super F, ? extends T> fVar = this.f24775b;
            com.google.common.a.m.a(fVar);
            return new cd<F, T>(it2, fVar) {

                /* renamed from: a */
                final /* synthetic */ f f24599a;

                public final T a(
/*
Method generation error in method: com.google.common.collect.aw.2.a(java.lang.Object):T, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.google.common.collect.aw.2.a(java.lang.Object):T, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:301)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.addInnerClasses(ClassGen.java:238)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                
*/
            };
        }

        b(Collection<F> collection, f<? super F, ? extends T> fVar) {
            this.f24774a = (Collection) com.google.common.a.m.a(collection);
            this.f24775b = (f) com.google.common.a.m.a(fVar);
        }
    }

    static <T> Collection<T> a(Iterable<T> iterable) {
        return (Collection) iterable;
    }

    public static <F, T> Collection<T> a(Collection<F> collection, f<? super F, T> fVar) {
        return new b(collection, fVar);
    }

    static boolean a(Collection<?> collection, @NullableDecl Object obj) {
        com.google.common.a.m.a(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <E> Collection<E> a(Collection<E> collection, n<? super E> nVar) {
        if (!(collection instanceof a)) {
            return new a((Collection) com.google.common.a.m.a(collection), (n) com.google.common.a.m.a(nVar));
        }
        a aVar = (a) collection;
        return new a(aVar.f24772a, o.a(aVar.f24773b, nVar));
    }
}
