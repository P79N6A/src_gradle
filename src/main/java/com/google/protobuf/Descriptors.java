package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.FieldSet;
import com.google.protobuf.Internal;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.TextFormat;
import com.google.protobuf.WireFormat;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;

public final class Descriptors {
    public static final Logger logger = Logger.getLogger(Descriptors.class.getName());

    /* renamed from: com.google.protobuf.Descriptors$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = new int[FieldDescriptor.Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x008b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00af */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00bb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00c7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00d3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00df */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00eb */
        static {
            /*
                com.google.protobuf.Descriptors$FieldDescriptor$JavaType[] r0 = com.google.protobuf.Descriptors.FieldDescriptor.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType = r0
                r0 = 1
                int[] r1 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.protobuf.Descriptors$FieldDescriptor$JavaType r2 = com.google.protobuf.Descriptors.FieldDescriptor.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$JavaType     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.protobuf.Descriptors$FieldDescriptor$JavaType r3 = com.google.protobuf.Descriptors.FieldDescriptor.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                com.google.protobuf.Descriptors$FieldDescriptor$Type[] r2 = com.google.protobuf.Descriptors.FieldDescriptor.Type.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type = r2
                int[] r2 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r3 = com.google.protobuf.Descriptors.FieldDescriptor.Type.INT32     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x003c }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r2 = com.google.protobuf.Descriptors.FieldDescriptor.Type.SINT32     // Catch:{ NoSuchFieldError -> 0x003c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0052 }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.UINT32     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x005d }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.FIXED32     // Catch:{ NoSuchFieldError -> 0x005d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.INT64     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.SINT64     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x007f }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.SFIXED64     // Catch:{ NoSuchFieldError -> 0x007f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x008b }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.UINT64     // Catch:{ NoSuchFieldError -> 0x008b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008b }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008b }
            L_0x008b:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.FIXED64     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00a3 }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.FLOAT     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00af }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.DOUBLE     // Catch:{ NoSuchFieldError -> 0x00af }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00af }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00af }
            L_0x00af:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00bb }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.BOOL     // Catch:{ NoSuchFieldError -> 0x00bb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00bb }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00bb }
            L_0x00bb:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00c7 }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.STRING     // Catch:{ NoSuchFieldError -> 0x00c7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c7 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c7 }
            L_0x00c7:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00d3 }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.BYTES     // Catch:{ NoSuchFieldError -> 0x00d3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d3 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d3 }
            L_0x00d3:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00df }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.ENUM     // Catch:{ NoSuchFieldError -> 0x00df }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00df }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00df }
            L_0x00df:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00eb }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00eb }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00eb }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00eb }
            L_0x00eb:
                int[] r0 = $SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type     // Catch:{ NoSuchFieldError -> 0x00f7 }
                com.google.protobuf.Descriptors$FieldDescriptor$Type r1 = com.google.protobuf.Descriptors.FieldDescriptor.Type.GROUP     // Catch:{ NoSuchFieldError -> 0x00f7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f7 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f7 }
            L_0x00f7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Descriptors.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class Descriptor extends GenericDescriptor {
        private final Descriptor containingType;
        private final EnumDescriptor[] enumTypes;
        private final FieldDescriptor[] extensions;
        private final FieldDescriptor[] fields;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final Descriptor[] nestedTypes;
        private final OneofDescriptor[] oneofs;
        private DescriptorProtos.DescriptorProto proto;

        public final Descriptor getContainingType() {
            return this.containingType;
        }

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final int getIndex() {
            return this.index;
        }

        public final DescriptorProtos.DescriptorProto toProto() {
            return this.proto;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final DescriptorProtos.MessageOptions getOptions() {
            return this.proto.getOptions();
        }

        public final List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public final List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        public final List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        public final List<Descriptor> getNestedTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.nestedTypes));
        }

        public final List<OneofDescriptor> getOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.oneofs));
        }

        public final boolean isExtendable() {
            if (this.proto.getExtensionRangeList().size() != 0) {
                return true;
            }
            return false;
        }

        public final void crossLink() throws DescriptorValidationException {
            for (Descriptor crossLink : this.nestedTypes) {
                crossLink.crossLink();
            }
            for (FieldDescriptor crossLink2 : this.fields) {
                crossLink2.crossLink();
            }
            for (FieldDescriptor crossLink3 : this.extensions) {
                crossLink3.crossLink();
            }
        }

        public final FieldDescriptor findFieldByNumber(int i) {
            return this.file.pool.fieldsByNumber.get(new DescriptorPool.DescriptorIntPair(this, i));
        }

        public final EnumDescriptor findEnumTypeByName(String str) {
            DescriptorPool descriptorPool = this.file.pool;
            GenericDescriptor findSymbol = descriptorPool.findSymbol(this.fullName + '.' + str);
            if (findSymbol == null || !(findSymbol instanceof EnumDescriptor)) {
                return null;
            }
            return (EnumDescriptor) findSymbol;
        }

        public final FieldDescriptor findFieldByName(String str) {
            DescriptorPool descriptorPool = this.file.pool;
            GenericDescriptor findSymbol = descriptorPool.findSymbol(this.fullName + '.' + str);
            if (findSymbol == null || !(findSymbol instanceof FieldDescriptor)) {
                return null;
            }
            return (FieldDescriptor) findSymbol;
        }

        public final Descriptor findNestedTypeByName(String str) {
            DescriptorPool descriptorPool = this.file.pool;
            GenericDescriptor findSymbol = descriptorPool.findSymbol(this.fullName + '.' + str);
            if (findSymbol == null || !(findSymbol instanceof Descriptor)) {
                return null;
            }
            return (Descriptor) findSymbol;
        }

        public final boolean isExtensionNumber(int i) {
            for (DescriptorProtos.DescriptorProto.ExtensionRange extensionRange : this.proto.getExtensionRangeList()) {
                if (extensionRange.getStart() <= i && i < extensionRange.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isReservedName(String str) {
            Internal.checkNotNull(str);
            for (String equals : this.proto.getReservedNameList()) {
                if (equals.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isReservedNumber(int i) {
            for (DescriptorProtos.DescriptorProto.ReservedRange reservedRange : this.proto.getReservedRangeList()) {
                if (reservedRange.getStart() <= i && i < reservedRange.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        Descriptor(String str) throws DescriptorValidationException {
            String str2;
            String str3;
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str3 = str.substring(lastIndexOf + 1);
                str2 = str.substring(0, lastIndexOf);
            } else {
                str2 = "";
                str3 = str;
            }
            this.index = 0;
            this.proto = DescriptorProtos.DescriptorProto.newBuilder().setName(str3).addExtensionRange(DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder().setStart(1).setEnd(536870912).build()).build();
            this.fullName = str;
            this.containingType = null;
            this.nestedTypes = new Descriptor[0];
            this.enumTypes = new EnumDescriptor[0];
            this.fields = new FieldDescriptor[0];
            this.extensions = new FieldDescriptor[0];
            this.oneofs = new OneofDescriptor[0];
            this.file = new FileDescriptor(str2, this);
        }

        public final void setProto(DescriptorProtos.DescriptorProto descriptorProto) {
            this.proto = descriptorProto;
            for (int i = 0; i < this.nestedTypes.length; i++) {
                this.nestedTypes[i].setProto(descriptorProto.getNestedType(i));
            }
            for (int i2 = 0; i2 < this.oneofs.length; i2++) {
                this.oneofs[i2].setProto(descriptorProto.getOneofDecl(i2));
            }
            for (int i3 = 0; i3 < this.enumTypes.length; i3++) {
                this.enumTypes[i3].setProto(descriptorProto.getEnumType(i3));
            }
            for (int i4 = 0; i4 < this.fields.length; i4++) {
                this.fields[i4].setProto(descriptorProto.getField(i4));
            }
            for (int i5 = 0; i5 < this.extensions.length; i5++) {
                this.extensions[i5].setProto(descriptorProto.getExtension(i5));
            }
        }

        private Descriptor(DescriptorProtos.DescriptorProto descriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i) throws DescriptorValidationException {
            this.index = i;
            this.proto = descriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, descriptorProto.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            this.oneofs = new OneofDescriptor[descriptorProto.getOneofDeclCount()];
            for (int i2 = 0; i2 < descriptorProto.getOneofDeclCount(); i2++) {
                OneofDescriptor[] oneofDescriptorArr = this.oneofs;
                OneofDescriptor oneofDescriptor = new OneofDescriptor(descriptorProto.getOneofDecl(i2), fileDescriptor, this, i2, null);
                oneofDescriptorArr[i2] = oneofDescriptor;
            }
            this.nestedTypes = new Descriptor[descriptorProto.getNestedTypeCount()];
            for (int i3 = 0; i3 < descriptorProto.getNestedTypeCount(); i3++) {
                this.nestedTypes[i3] = new Descriptor(descriptorProto.getNestedType(i3), fileDescriptor, this, i3);
            }
            this.enumTypes = new EnumDescriptor[descriptorProto.getEnumTypeCount()];
            for (int i4 = 0; i4 < descriptorProto.getEnumTypeCount(); i4++) {
                EnumDescriptor[] enumDescriptorArr = this.enumTypes;
                EnumDescriptor enumDescriptor = new EnumDescriptor(descriptorProto.getEnumType(i4), fileDescriptor, this, i4, null);
                enumDescriptorArr[i4] = enumDescriptor;
            }
            this.fields = new FieldDescriptor[descriptorProto.getFieldCount()];
            for (int i5 = 0; i5 < descriptorProto.getFieldCount(); i5++) {
                FieldDescriptor[] fieldDescriptorArr = this.fields;
                FieldDescriptor fieldDescriptor = new FieldDescriptor(descriptorProto.getField(i5), fileDescriptor, this, i5, false, null);
                fieldDescriptorArr[i5] = fieldDescriptor;
            }
            this.extensions = new FieldDescriptor[descriptorProto.getExtensionCount()];
            for (int i6 = 0; i6 < descriptorProto.getExtensionCount(); i6++) {
                FieldDescriptor[] fieldDescriptorArr2 = this.extensions;
                FieldDescriptor fieldDescriptor2 = new FieldDescriptor(descriptorProto.getExtension(i6), fileDescriptor, this, i6, true, null);
                fieldDescriptorArr2[i6] = fieldDescriptor2;
            }
            for (int i7 = 0; i7 < descriptorProto.getOneofDeclCount(); i7++) {
                this.oneofs[i7].fields = new FieldDescriptor[this.oneofs[i7].getFieldCount()];
                this.oneofs[i7].fieldCount = 0;
            }
            for (int i8 = 0; i8 < descriptorProto.getFieldCount(); i8++) {
                OneofDescriptor containingOneof = this.fields[i8].getContainingOneof();
                if (containingOneof != null) {
                    FieldDescriptor[] fieldDescriptorArr3 = containingOneof.fields;
                    int i9 = containingOneof.fieldCount;
                    containingOneof.fieldCount = i9 + 1;
                    fieldDescriptorArr3[i9] = this.fields[i8];
                }
            }
            fileDescriptor.pool.addSymbol(this);
        }

        /* synthetic */ Descriptor(DescriptorProtos.DescriptorProto descriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i, AnonymousClass1 r5) throws DescriptorValidationException {
            this(descriptorProto, fileDescriptor, descriptor, i);
        }
    }

    static final class DescriptorPool {
        private boolean allowUnknownDependencies;
        private final Set<FileDescriptor> dependencies = new HashSet();
        private final Map<String, GenericDescriptor> descriptorsByName = new HashMap();
        public final Map<DescriptorIntPair, EnumValueDescriptor> enumValuesByNumber = new HashMap();
        public final Map<DescriptorIntPair, FieldDescriptor> fieldsByNumber = new HashMap();

        static final class DescriptorIntPair {
            private final GenericDescriptor descriptor;
            private final int number;

            public final int hashCode() {
                return (this.descriptor.hashCode() * 65535) + this.number;
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof DescriptorIntPair)) {
                    return false;
                }
                DescriptorIntPair descriptorIntPair = (DescriptorIntPair) obj;
                if (this.descriptor == descriptorIntPair.descriptor && this.number == descriptorIntPair.number) {
                    return true;
                }
                return false;
            }

            DescriptorIntPair(GenericDescriptor genericDescriptor, int i) {
                this.descriptor = genericDescriptor;
                this.number = i;
            }
        }

        static final class PackageDescriptor extends GenericDescriptor {
            private final FileDescriptor file;
            private final String fullName;
            private final String name;

            public final FileDescriptor getFile() {
                return this.file;
            }

            public final String getFullName() {
                return this.fullName;
            }

            public final String getName() {
                return this.name;
            }

            public final Message toProto() {
                return this.file.toProto();
            }

            PackageDescriptor(String str, String str2, FileDescriptor fileDescriptor) {
                this.file = fileDescriptor;
                this.fullName = str2;
                this.name = str;
            }
        }

        enum SearchFilter {
            TYPES_ONLY,
            AGGREGATES_ONLY,
            ALL_SYMBOLS
        }

        /* access modifiers changed from: package-private */
        public final GenericDescriptor findSymbol(String str) {
            return findSymbol(str, SearchFilter.ALL_SYMBOLS);
        }

        /* access modifiers changed from: package-private */
        public final boolean isType(GenericDescriptor genericDescriptor) {
            if ((genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void addEnumValueByNumber(EnumValueDescriptor enumValueDescriptor) {
            DescriptorIntPair descriptorIntPair = new DescriptorIntPair(enumValueDescriptor.getType(), enumValueDescriptor.getNumber());
            EnumValueDescriptor put = this.enumValuesByNumber.put(descriptorIntPair, enumValueDescriptor);
            if (put != null) {
                this.enumValuesByNumber.put(descriptorIntPair, put);
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean isAggregate(GenericDescriptor genericDescriptor) {
            if ((genericDescriptor instanceof Descriptor) || (genericDescriptor instanceof EnumDescriptor) || (genericDescriptor instanceof PackageDescriptor) || (genericDescriptor instanceof ServiceDescriptor)) {
                return true;
            }
            return false;
        }

        private void importPublicDependencies(FileDescriptor fileDescriptor) {
            for (FileDescriptor next : fileDescriptor.getPublicDependencies()) {
                if (this.dependencies.add(next)) {
                    importPublicDependencies(next);
                }
            }
        }

        static void validateSymbolName(GenericDescriptor genericDescriptor) throws DescriptorValidationException {
            String name = genericDescriptor.getName();
            if (name.length() != 0) {
                boolean z = true;
                for (int i = 0; i < name.length(); i++) {
                    char charAt = name.charAt(i);
                    if (charAt >= 128) {
                        z = false;
                    }
                    if (!Character.isLetter(charAt) && charAt != '_' && (!Character.isDigit(charAt) || i <= 0)) {
                        z = false;
                    }
                }
                if (!z) {
                    throw new DescriptorValidationException(genericDescriptor, "\"" + name + "\" is not a valid identifier.", (AnonymousClass1) null);
                }
                return;
            }
            throw new DescriptorValidationException(genericDescriptor, "Missing name.", (AnonymousClass1) null);
        }

        /* access modifiers changed from: package-private */
        public final void addFieldByNumber(FieldDescriptor fieldDescriptor) throws DescriptorValidationException {
            DescriptorIntPair descriptorIntPair = new DescriptorIntPair(fieldDescriptor.getContainingType(), fieldDescriptor.getNumber());
            FieldDescriptor put = this.fieldsByNumber.put(descriptorIntPair, fieldDescriptor);
            if (put != null) {
                this.fieldsByNumber.put(descriptorIntPair, put);
                throw new DescriptorValidationException((GenericDescriptor) fieldDescriptor, "Field number " + fieldDescriptor.getNumber() + " has already been used in \"" + fieldDescriptor.getContainingType().getFullName() + "\" by field \"" + put.getName() + "\".", (AnonymousClass1) null);
            }
        }

        /* access modifiers changed from: package-private */
        public final void addSymbol(GenericDescriptor genericDescriptor) throws DescriptorValidationException {
            validateSymbolName(genericDescriptor);
            String fullName = genericDescriptor.getFullName();
            int lastIndexOf = fullName.lastIndexOf(46);
            GenericDescriptor put = this.descriptorsByName.put(fullName, genericDescriptor);
            if (put != null) {
                this.descriptorsByName.put(fullName, put);
                if (genericDescriptor.getFile() != put.getFile()) {
                    throw new DescriptorValidationException(genericDescriptor, "\"" + fullName + "\" is already defined in file \"" + put.getFile().getName() + "\".", (AnonymousClass1) null);
                } else if (lastIndexOf == -1) {
                    throw new DescriptorValidationException(genericDescriptor, "\"" + fullName + "\" is already defined.", (AnonymousClass1) null);
                } else {
                    throw new DescriptorValidationException(genericDescriptor, "\"" + fullName.substring(lastIndexOf + 1) + "\" is already defined in \"" + fullName.substring(0, lastIndexOf) + "\".", (AnonymousClass1) null);
                }
            }
        }

        DescriptorPool(FileDescriptor[] fileDescriptorArr, boolean z) {
            this.allowUnknownDependencies = z;
            for (int i = 0; i < fileDescriptorArr.length; i++) {
                this.dependencies.add(fileDescriptorArr[i]);
                importPublicDependencies(fileDescriptorArr[i]);
            }
            for (FileDescriptor next : this.dependencies) {
                try {
                    addPackage(next.getPackage(), next);
                } catch (DescriptorValidationException e2) {
                    throw new AssertionError(e2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void addPackage(String str, FileDescriptor fileDescriptor) throws DescriptorValidationException {
            String str2;
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf == -1) {
                str2 = str;
            } else {
                addPackage(str.substring(0, lastIndexOf), fileDescriptor);
                str2 = str.substring(lastIndexOf + 1);
            }
            GenericDescriptor put = this.descriptorsByName.put(str, new PackageDescriptor(str2, str, fileDescriptor));
            if (put != null) {
                this.descriptorsByName.put(str, put);
                if (!(put instanceof PackageDescriptor)) {
                    throw new DescriptorValidationException(fileDescriptor, "\"" + str2 + "\" is already defined (as something other than a package) in file \"" + put.getFile().getName() + "\".", (AnonymousClass1) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final GenericDescriptor findSymbol(String str, SearchFilter searchFilter) {
            GenericDescriptor genericDescriptor = this.descriptorsByName.get(str);
            if (genericDescriptor != null && (searchFilter == SearchFilter.ALL_SYMBOLS || ((searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor)) || (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor))))) {
                return genericDescriptor;
            }
            for (FileDescriptor fileDescriptor : this.dependencies) {
                GenericDescriptor genericDescriptor2 = fileDescriptor.pool.descriptorsByName.get(str);
                if (genericDescriptor2 != null && (searchFilter == SearchFilter.ALL_SYMBOLS || ((searchFilter == SearchFilter.TYPES_ONLY && isType(genericDescriptor2)) || (searchFilter == SearchFilter.AGGREGATES_ONLY && isAggregate(genericDescriptor2))))) {
                    return genericDescriptor2;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final GenericDescriptor lookupSymbol(String str, GenericDescriptor genericDescriptor, SearchFilter searchFilter) throws DescriptorValidationException {
            GenericDescriptor genericDescriptor2;
            String str2;
            String str3;
            if (str.startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
                str2 = str.substring(1);
                genericDescriptor2 = findSymbol(str2, searchFilter);
            } else {
                int indexOf = str.indexOf(46);
                if (indexOf == -1) {
                    str3 = str;
                } else {
                    str3 = str.substring(0, indexOf);
                }
                StringBuilder sb = new StringBuilder(genericDescriptor.getFullName());
                while (true) {
                    int lastIndexOf = sb.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
                    if (lastIndexOf == -1) {
                        genericDescriptor2 = findSymbol(str, searchFilter);
                        str2 = str;
                        break;
                    }
                    int i = lastIndexOf + 1;
                    sb.setLength(i);
                    sb.append(str3);
                    GenericDescriptor findSymbol = findSymbol(sb.toString(), SearchFilter.AGGREGATES_ONLY);
                    if (findSymbol != null) {
                        if (indexOf != -1) {
                            sb.setLength(i);
                            sb.append(str);
                            genericDescriptor2 = findSymbol(sb.toString(), searchFilter);
                        } else {
                            genericDescriptor2 = findSymbol;
                        }
                        str2 = sb.toString();
                    } else {
                        sb.setLength(lastIndexOf);
                    }
                }
            }
            if (genericDescriptor2 != null) {
                return genericDescriptor2;
            }
            if (!this.allowUnknownDependencies || searchFilter != SearchFilter.TYPES_ONLY) {
                throw new DescriptorValidationException(genericDescriptor, "\"" + str + "\" is not defined.", (AnonymousClass1) null);
            }
            Logger logger = Descriptors.logger;
            logger.warning("The descriptor for message type \"" + str + "\" can not be found and a placeholder is created for it");
            Descriptor descriptor = new Descriptor(str2);
            this.dependencies.add(descriptor.getFile());
            return descriptor;
        }
    }

    public static class DescriptorValidationException extends Exception {
        private static final long serialVersionUID = 5750205775490483148L;
        private final String description;
        private final String name;
        private final Message proto;

        public String getDescription() {
            return this.description;
        }

        public Message getProblemProto() {
            return this.proto;
        }

        public String getProblemSymbolName() {
            return this.name;
        }

        private DescriptorValidationException(FileDescriptor fileDescriptor, String str) {
            super(fileDescriptor.getName() + ": " + str);
            this.name = fileDescriptor.getName();
            this.proto = fileDescriptor.toProto();
            this.description = str;
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str) {
            super(genericDescriptor.getFullName() + ": " + str);
            this.name = genericDescriptor.getFullName();
            this.proto = genericDescriptor.toProto();
            this.description = str;
        }

        /* synthetic */ DescriptorValidationException(FileDescriptor fileDescriptor, String str, AnonymousClass1 r3) {
            this(fileDescriptor, str);
        }

        /* synthetic */ DescriptorValidationException(GenericDescriptor genericDescriptor, String str, AnonymousClass1 r3) {
            this(genericDescriptor, str);
        }

        private DescriptorValidationException(GenericDescriptor genericDescriptor, String str, Throwable th) {
            this(genericDescriptor, str);
            initCause(th);
        }

        /* synthetic */ DescriptorValidationException(GenericDescriptor genericDescriptor, String str, Throwable th, AnonymousClass1 r4) {
            this(genericDescriptor, str, th);
        }
    }

    public static final class EnumDescriptor extends GenericDescriptor implements Internal.EnumLiteMap<EnumValueDescriptor> {
        private final Descriptor containingType;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private DescriptorProtos.EnumDescriptorProto proto;
        private final WeakHashMap<Integer, WeakReference<EnumValueDescriptor>> unknownValues;
        private EnumValueDescriptor[] values;

        public final Descriptor getContainingType() {
            return this.containingType;
        }

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final int getIndex() {
            return this.index;
        }

        public final DescriptorProtos.EnumDescriptorProto toProto() {
            return this.proto;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final DescriptorProtos.EnumOptions getOptions() {
            return this.proto.getOptions();
        }

        /* access modifiers changed from: package-private */
        public final int getUnknownEnumValueDescriptorCount() {
            return this.unknownValues.size();
        }

        public final List<EnumValueDescriptor> getValues() {
            return Collections.unmodifiableList(Arrays.asList(this.values));
        }

        public final EnumValueDescriptor findValueByNumber(int i) {
            return this.file.pool.enumValuesByNumber.get(new DescriptorPool.DescriptorIntPair(this, i));
        }

        public final void setProto(DescriptorProtos.EnumDescriptorProto enumDescriptorProto) {
            this.proto = enumDescriptorProto;
            for (int i = 0; i < this.values.length; i++) {
                this.values[i].setProto(enumDescriptorProto.getValue(i));
            }
        }

        public final EnumValueDescriptor findValueByName(String str) {
            DescriptorPool descriptorPool = this.file.pool;
            GenericDescriptor findSymbol = descriptorPool.findSymbol(this.fullName + '.' + str);
            if (findSymbol == null || !(findSymbol instanceof EnumValueDescriptor)) {
                return null;
            }
            return (EnumValueDescriptor) findSymbol;
        }

        public final EnumValueDescriptor findValueByNumberCreatingIfUnknown(int i) {
            EnumValueDescriptor findValueByNumber = findValueByNumber(i);
            if (findValueByNumber != null) {
                return findValueByNumber;
            }
            synchronized (this) {
                Integer valueOf = Integer.valueOf(i);
                WeakReference weakReference = this.unknownValues.get(valueOf);
                if (weakReference != null) {
                    findValueByNumber = (EnumValueDescriptor) weakReference.get();
                }
                if (findValueByNumber == null) {
                    findValueByNumber = new EnumValueDescriptor(this.file, this, valueOf, (AnonymousClass1) null);
                    this.unknownValues.put(valueOf, new WeakReference(findValueByNumber));
                }
            }
            return findValueByNumber;
        }

        private EnumDescriptor(DescriptorProtos.EnumDescriptorProto enumDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i) throws DescriptorValidationException {
            this.unknownValues = new WeakHashMap<>();
            this.index = i;
            this.proto = enumDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, enumDescriptorProto.getName());
            this.file = fileDescriptor;
            this.containingType = descriptor;
            if (enumDescriptorProto.getValueCount() != 0) {
                this.values = new EnumValueDescriptor[enumDescriptorProto.getValueCount()];
                for (int i2 = 0; i2 < enumDescriptorProto.getValueCount(); i2++) {
                    EnumValueDescriptor[] enumValueDescriptorArr = this.values;
                    EnumValueDescriptor enumValueDescriptor = new EnumValueDescriptor(enumDescriptorProto.getValue(i2), fileDescriptor, this, i2, null);
                    enumValueDescriptorArr[i2] = enumValueDescriptor;
                }
                fileDescriptor.pool.addSymbol(this);
                return;
            }
            throw new DescriptorValidationException((GenericDescriptor) this, "Enums must contain at least one value.", (AnonymousClass1) null);
        }

        /* synthetic */ EnumDescriptor(DescriptorProtos.EnumDescriptorProto enumDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i, AnonymousClass1 r5) throws DescriptorValidationException {
            this(enumDescriptorProto, fileDescriptor, descriptor, i);
        }
    }

    public static final class EnumValueDescriptor extends GenericDescriptor implements Internal.EnumLite {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private Integer number;
        private DescriptorProtos.EnumValueDescriptorProto proto;
        private final EnumDescriptor type;

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final int getIndex() {
            return this.index;
        }

        public final EnumDescriptor getType() {
            return this.type;
        }

        public final DescriptorProtos.EnumValueDescriptorProto toProto() {
            return this.proto;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final int getNumber() {
            return this.proto.getNumber();
        }

        public final DescriptorProtos.EnumValueOptions getOptions() {
            return this.proto.getOptions();
        }

        public final String toString() {
            return this.proto.getName();
        }

        public final void setProto(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto) {
            this.proto = enumValueDescriptorProto;
        }

        private EnumValueDescriptor(FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, Integer num) {
            DescriptorProtos.EnumValueDescriptorProto build = DescriptorProtos.EnumValueDescriptorProto.newBuilder().setName("UNKNOWN_ENUM_VALUE_" + enumDescriptor.getName() + "_" + num).setNumber(num.intValue()).build();
            this.index = -1;
            this.proto = build;
            this.file = fileDescriptor;
            this.type = enumDescriptor;
            this.fullName = enumDescriptor.getFullName() + '.' + build.getName();
            this.number = num;
        }

        /* synthetic */ EnumValueDescriptor(FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, Integer num, AnonymousClass1 r4) {
            this(fileDescriptor, enumDescriptor, num);
        }

        private EnumValueDescriptor(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto, FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, int i) throws DescriptorValidationException {
            this.index = i;
            this.proto = enumValueDescriptorProto;
            this.file = fileDescriptor;
            this.type = enumDescriptor;
            this.fullName = enumDescriptor.getFullName() + '.' + enumValueDescriptorProto.getName();
            fileDescriptor.pool.addSymbol(this);
            fileDescriptor.pool.addEnumValueByNumber(this);
        }

        /* synthetic */ EnumValueDescriptor(DescriptorProtos.EnumValueDescriptorProto enumValueDescriptorProto, FileDescriptor fileDescriptor, EnumDescriptor enumDescriptor, int i, AnonymousClass1 r5) throws DescriptorValidationException {
            this(enumValueDescriptorProto, fileDescriptor, enumDescriptor, i);
        }
    }

    public static final class FieldDescriptor extends GenericDescriptor implements FieldSet.FieldDescriptorLite<FieldDescriptor>, Comparable<FieldDescriptor> {
        private static final WireFormat.FieldType[] table = WireFormat.FieldType.values();
        private OneofDescriptor containingOneof;
        private Descriptor containingType;
        private Object defaultValue;
        private EnumDescriptor enumType;
        private final Descriptor extensionScope;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private final String jsonName;
        private Descriptor messageType;
        private DescriptorProtos.FieldDescriptorProto proto;
        private Type type;

        public enum JavaType {
            INT(0),
            LONG(0L),
            FLOAT(Float.valueOf(0.0f)),
            DOUBLE(Double.valueOf(0.0d)),
            BOOLEAN(Boolean.FALSE),
            STRING(""),
            BYTE_STRING(ByteString.EMPTY),
            ENUM(null),
            MESSAGE(null);
            
            public final Object defaultDefault;

            private JavaType(Object obj) {
                this.defaultDefault = obj;
            }
        }

        public enum Type {
            DOUBLE(JavaType.DOUBLE),
            FLOAT(JavaType.FLOAT),
            INT64(JavaType.LONG),
            UINT64(JavaType.LONG),
            INT32(JavaType.INT),
            FIXED64(JavaType.LONG),
            FIXED32(JavaType.INT),
            BOOL(JavaType.BOOLEAN),
            STRING(JavaType.STRING),
            GROUP(JavaType.MESSAGE),
            MESSAGE(JavaType.MESSAGE),
            BYTES(JavaType.BYTE_STRING),
            UINT32(JavaType.INT),
            ENUM(JavaType.ENUM),
            SFIXED32(JavaType.INT),
            SFIXED64(JavaType.LONG),
            SINT32(JavaType.INT),
            SINT64(JavaType.LONG);
            
            private JavaType javaType;

            public final JavaType getJavaType() {
                return this.javaType;
            }

            public final DescriptorProtos.FieldDescriptorProto.Type toProto() {
                return DescriptorProtos.FieldDescriptorProto.Type.forNumber(ordinal() + 1);
            }

            public static Type valueOf(DescriptorProtos.FieldDescriptorProto.Type type) {
                return values()[type.getNumber() - 1];
            }

            private Type(JavaType javaType2) {
                this.javaType = javaType2;
            }
        }

        public final OneofDescriptor getContainingOneof() {
            return this.containingOneof;
        }

        public final Descriptor getContainingType() {
            return this.containingType;
        }

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getJsonName() {
            return this.jsonName;
        }

        public final Type getType() {
            return this.type;
        }

        public final DescriptorProtos.FieldDescriptorProto toProto() {
            return this.proto;
        }

        public final JavaType getJavaType() {
            return this.type.getJavaType();
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final int getNumber() {
            return this.proto.getNumber();
        }

        public final DescriptorProtos.FieldOptions getOptions() {
            return this.proto.getOptions();
        }

        public final boolean hasDefaultValue() {
            return this.proto.hasDefaultValue();
        }

        public final boolean isExtension() {
            return this.proto.hasExtendee();
        }

        public final String toString() {
            return getFullName();
        }

        public final WireFormat.JavaType getLiteJavaType() {
            return getLiteType().getJavaType();
        }

        public final WireFormat.FieldType getLiteType() {
            return table[this.type.ordinal()];
        }

        public final boolean isOptional() {
            if (this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_OPTIONAL) {
                return true;
            }
            return false;
        }

        public final boolean isRepeated() {
            if (this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REPEATED) {
                return true;
            }
            return false;
        }

        public final boolean isRequired() {
            if (this.proto.getLabel() == DescriptorProtos.FieldDescriptorProto.Label.LABEL_REQUIRED) {
                return true;
            }
            return false;
        }

        static {
            if (Type.values().length != DescriptorProtos.FieldDescriptorProto.Type.values().length) {
                throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
            }
        }

        public final Object getDefaultValue() {
            if (getJavaType() != JavaType.MESSAGE) {
                return this.defaultValue;
            }
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }

        public final EnumDescriptor getEnumType() {
            if (getJavaType() == JavaType.ENUM) {
                return this.enumType;
            }
            throw new UnsupportedOperationException("This field is not of enum type.");
        }

        public final Descriptor getExtensionScope() {
            if (isExtension()) {
                return this.extensionScope;
            }
            throw new UnsupportedOperationException("This field is not an extension.");
        }

        public final Descriptor getMessageType() {
            if (getJavaType() == JavaType.MESSAGE) {
                return this.messageType;
            }
            throw new UnsupportedOperationException("This field is not of message type.");
        }

        public final boolean isMapField() {
            if (getType() != Type.MESSAGE || !isRepeated() || !getMessageType().getOptions().getMapEntry()) {
                return false;
            }
            return true;
        }

        public final boolean isPackable() {
            if (!isRepeated() || !getLiteType().isPackable()) {
                return false;
            }
            return true;
        }

        public final boolean isPacked() {
            if (!isPackable()) {
                return false;
            }
            if (getFile().getSyntax() == FileDescriptor.Syntax.PROTO2) {
                return getOptions().getPacked();
            }
            if (!getOptions().hasPacked() || getOptions().getPacked()) {
                return true;
            }
            return false;
        }

        public final boolean needsUtf8Check() {
            if (this.type != Type.STRING) {
                return false;
            }
            if (!getContainingType().getOptions().getMapEntry() && getFile().getSyntax() != FileDescriptor.Syntax.PROTO3) {
                return getFile().getOptions().getJavaStringCheckUtf8();
            }
            return true;
        }

        public final void crossLink() throws DescriptorValidationException {
            if (this.proto.hasExtendee()) {
                GenericDescriptor lookupSymbol = this.file.pool.lookupSymbol(this.proto.getExtendee(), this, DescriptorPool.SearchFilter.TYPES_ONLY);
                if (lookupSymbol instanceof Descriptor) {
                    this.containingType = (Descriptor) lookupSymbol;
                    if (!getContainingType().isExtensionNumber(getNumber())) {
                        throw new DescriptorValidationException((GenericDescriptor) this, "\"" + getContainingType().getFullName() + "\" does not declare " + getNumber() + " as an extension number.", (AnonymousClass1) null);
                    }
                } else {
                    throw new DescriptorValidationException((GenericDescriptor) this, "\"" + this.proto.getExtendee() + "\" is not a message type.", (AnonymousClass1) null);
                }
            }
            if (this.proto.hasTypeName()) {
                GenericDescriptor lookupSymbol2 = this.file.pool.lookupSymbol(this.proto.getTypeName(), this, DescriptorPool.SearchFilter.TYPES_ONLY);
                if (!this.proto.hasType()) {
                    if (lookupSymbol2 instanceof Descriptor) {
                        this.type = Type.MESSAGE;
                    } else if (lookupSymbol2 instanceof EnumDescriptor) {
                        this.type = Type.ENUM;
                    } else {
                        throw new DescriptorValidationException((GenericDescriptor) this, "\"" + this.proto.getTypeName() + "\" is not a type.", (AnonymousClass1) null);
                    }
                }
                if (getJavaType() == JavaType.MESSAGE) {
                    if (lookupSymbol2 instanceof Descriptor) {
                        this.messageType = (Descriptor) lookupSymbol2;
                        if (this.proto.hasDefaultValue()) {
                            throw new DescriptorValidationException((GenericDescriptor) this, "Messages can't have default values.", (AnonymousClass1) null);
                        }
                    } else {
                        throw new DescriptorValidationException((GenericDescriptor) this, "\"" + this.proto.getTypeName() + "\" is not a message type.", (AnonymousClass1) null);
                    }
                } else if (getJavaType() != JavaType.ENUM) {
                    throw new DescriptorValidationException((GenericDescriptor) this, "Field with primitive type has type_name.", (AnonymousClass1) null);
                } else if (lookupSymbol2 instanceof EnumDescriptor) {
                    this.enumType = (EnumDescriptor) lookupSymbol2;
                } else {
                    throw new DescriptorValidationException((GenericDescriptor) this, "\"" + this.proto.getTypeName() + "\" is not an enum type.", (AnonymousClass1) null);
                }
            } else if (getJavaType() == JavaType.MESSAGE || getJavaType() == JavaType.ENUM) {
                throw new DescriptorValidationException((GenericDescriptor) this, "Field with message or enum type missing type_name.", (AnonymousClass1) null);
            }
            if (!this.proto.getOptions().getPacked() || isPackable()) {
                if (!this.proto.hasDefaultValue()) {
                    if (!isRepeated()) {
                        switch (getJavaType()) {
                            case ENUM:
                                this.defaultValue = this.enumType.getValues().get(0);
                                break;
                            case MESSAGE:
                                this.defaultValue = null;
                                break;
                            default:
                                this.defaultValue = getJavaType().defaultDefault;
                                break;
                        }
                    } else {
                        this.defaultValue = Collections.emptyList();
                    }
                } else if (!isRepeated()) {
                    try {
                        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$Descriptors$FieldDescriptor$Type[getType().ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                                this.defaultValue = Integer.valueOf(TextFormat.parseInt32(this.proto.getDefaultValue()));
                                break;
                            case 4:
                            case 5:
                                this.defaultValue = Integer.valueOf(TextFormat.parseUInt32(this.proto.getDefaultValue()));
                                break;
                            case 6:
                            case e.l /*?: ONE_ARG  (7 int)*/:
                            case 8:
                                this.defaultValue = Long.valueOf(TextFormat.parseInt64(this.proto.getDefaultValue()));
                                break;
                            case 9:
                            case 10:
                                this.defaultValue = Long.valueOf(TextFormat.parseUInt64(this.proto.getDefaultValue()));
                                break;
                            case 11:
                                if (!this.proto.getDefaultValue().equals("inf")) {
                                    if (!this.proto.getDefaultValue().equals("-inf")) {
                                        if (!this.proto.getDefaultValue().equals("nan")) {
                                            this.defaultValue = Float.valueOf(this.proto.getDefaultValue());
                                            break;
                                        } else {
                                            this.defaultValue = Float.valueOf(Float.NaN);
                                            break;
                                        }
                                    } else {
                                        this.defaultValue = Float.valueOf(Float.NEGATIVE_INFINITY);
                                        break;
                                    }
                                } else {
                                    this.defaultValue = Float.valueOf(Float.POSITIVE_INFINITY);
                                    break;
                                }
                            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                                if (!this.proto.getDefaultValue().equals("inf")) {
                                    if (!this.proto.getDefaultValue().equals("-inf")) {
                                        if (!this.proto.getDefaultValue().equals("nan")) {
                                            this.defaultValue = Double.valueOf(this.proto.getDefaultValue());
                                            break;
                                        } else {
                                            this.defaultValue = Double.valueOf(Double.NaN);
                                            break;
                                        }
                                    } else {
                                        this.defaultValue = Double.valueOf(Double.NEGATIVE_INFINITY);
                                        break;
                                    }
                                } else {
                                    this.defaultValue = Double.valueOf(Double.POSITIVE_INFINITY);
                                    break;
                                }
                            case 13:
                                this.defaultValue = Boolean.valueOf(this.proto.getDefaultValue());
                                break;
                            case 14:
                                this.defaultValue = this.proto.getDefaultValue();
                                break;
                            case 15:
                                this.defaultValue = TextFormat.unescapeBytes(this.proto.getDefaultValue());
                                break;
                            case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                                this.defaultValue = this.enumType.findValueByName(this.proto.getDefaultValue());
                                if (this.defaultValue != null) {
                                    break;
                                } else {
                                    throw new DescriptorValidationException((GenericDescriptor) this, "Unknown enum default value: \"" + this.proto.getDefaultValue() + '\"', (AnonymousClass1) null);
                                }
                            case 17:
                            case 18:
                                throw new DescriptorValidationException((GenericDescriptor) this, "Message type had default value.", (AnonymousClass1) null);
                        }
                    } catch (TextFormat.InvalidEscapeSequenceException e2) {
                        throw new DescriptorValidationException(this, "Couldn't parse default value: " + e2.getMessage(), e2, null);
                    } catch (NumberFormatException e3) {
                        throw new DescriptorValidationException(this, "Could not parse default value: \"" + this.proto.getDefaultValue() + '\"', e3, null);
                    }
                } else {
                    throw new DescriptorValidationException((GenericDescriptor) this, "Repeated fields cannot have default values.", (AnonymousClass1) null);
                }
                if (!isExtension()) {
                    this.file.pool.addFieldByNumber(this);
                }
                if (this.containingType != null && this.containingType.getOptions().getMessageSetWireFormat()) {
                    if (!isExtension()) {
                        throw new DescriptorValidationException((GenericDescriptor) this, "MessageSets cannot have fields, only extensions.", (AnonymousClass1) null);
                    } else if (!isOptional() || getType() != Type.MESSAGE) {
                        throw new DescriptorValidationException((GenericDescriptor) this, "Extensions of MessageSets must be optional messages.", (AnonymousClass1) null);
                    }
                }
            } else {
                throw new DescriptorValidationException((GenericDescriptor) this, "[packed = true] can only be specified for repeated primitive fields.", (AnonymousClass1) null);
            }
        }

        public final void setProto(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            this.proto = fieldDescriptorProto;
        }

        public final int compareTo(FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.containingType == this.containingType) {
                return getNumber() - fieldDescriptor.getNumber();
            }
            throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        }

        private static String fieldNameToJsonName(String str) {
            StringBuilder sb = new StringBuilder(str.length());
            boolean z = false;
            for (int i = 0; i < str.length(); i++) {
                Character valueOf = Character.valueOf(str.charAt(i));
                if (valueOf.charValue() == '_') {
                    z = true;
                } else if (z) {
                    sb.append(Character.toUpperCase(valueOf.charValue()));
                    z = false;
                } else {
                    sb.append(valueOf);
                }
            }
            return sb.toString();
        }

        public final MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Message.Builder) builder).mergeFrom((Message) messageLite);
        }

        private FieldDescriptor(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i, boolean z) throws DescriptorValidationException {
            this.index = i;
            this.proto = fieldDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, fieldDescriptorProto.getName());
            this.file = fileDescriptor;
            if (fieldDescriptorProto.hasJsonName()) {
                this.jsonName = fieldDescriptorProto.getJsonName();
            } else {
                this.jsonName = fieldNameToJsonName(fieldDescriptorProto.getName());
            }
            if (fieldDescriptorProto.hasType()) {
                this.type = Type.valueOf(fieldDescriptorProto.getType());
            }
            if (getNumber() > 0) {
                if (z) {
                    if (fieldDescriptorProto.hasExtendee()) {
                        this.containingType = null;
                        if (descriptor != null) {
                            this.extensionScope = descriptor;
                        } else {
                            this.extensionScope = null;
                        }
                        if (!fieldDescriptorProto.hasOneofIndex()) {
                            this.containingOneof = null;
                        } else {
                            throw new DescriptorValidationException((GenericDescriptor) this, "FieldDescriptorProto.oneof_index set for extension field.", (AnonymousClass1) null);
                        }
                    } else {
                        throw new DescriptorValidationException((GenericDescriptor) this, "FieldDescriptorProto.extendee not set for extension field.", (AnonymousClass1) null);
                    }
                } else if (!fieldDescriptorProto.hasExtendee()) {
                    this.containingType = descriptor;
                    if (!fieldDescriptorProto.hasOneofIndex()) {
                        this.containingOneof = null;
                    } else if (fieldDescriptorProto.getOneofIndex() < 0 || fieldDescriptorProto.getOneofIndex() >= descriptor.toProto().getOneofDeclCount()) {
                        throw new DescriptorValidationException((GenericDescriptor) this, "FieldDescriptorProto.oneof_index is out of range for type " + descriptor.getName(), (AnonymousClass1) null);
                    } else {
                        this.containingOneof = descriptor.getOneofs().get(fieldDescriptorProto.getOneofIndex());
                        this.containingOneof.fieldCount++;
                    }
                    this.extensionScope = null;
                } else {
                    throw new DescriptorValidationException((GenericDescriptor) this, "FieldDescriptorProto.extendee set for non-extension field.", (AnonymousClass1) null);
                }
                fileDescriptor.pool.addSymbol(this);
                return;
            }
            throw new DescriptorValidationException((GenericDescriptor) this, "Field numbers must be positive integers.", (AnonymousClass1) null);
        }

        /* synthetic */ FieldDescriptor(DescriptorProtos.FieldDescriptorProto fieldDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i, boolean z, AnonymousClass1 r6) throws DescriptorValidationException {
            this(fieldDescriptorProto, fileDescriptor, descriptor, i, z);
        }
    }

    public static final class FileDescriptor extends GenericDescriptor {
        private final FileDescriptor[] dependencies;
        private final EnumDescriptor[] enumTypes;
        private final FieldDescriptor[] extensions;
        private final Descriptor[] messageTypes;
        public final DescriptorPool pool;
        private DescriptorProtos.FileDescriptorProto proto;
        private final FileDescriptor[] publicDependencies;
        private final ServiceDescriptor[] services;

        public interface InternalDescriptorAssigner {
            ExtensionRegistry assignDescriptors(FileDescriptor fileDescriptor);
        }

        public enum Syntax {
            UNKNOWN("unknown"),
            PROTO2("proto2"),
            PROTO3("proto3");
            
            public final String name;

            private Syntax(String str) {
                this.name = str;
            }
        }

        public final FileDescriptor getFile() {
            return this;
        }

        public final DescriptorProtos.FileDescriptorProto toProto() {
            return this.proto;
        }

        public final String getFullName() {
            return this.proto.getName();
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final DescriptorProtos.FileOptions getOptions() {
            return this.proto.getOptions();
        }

        public final String getPackage() {
            return this.proto.getPackage();
        }

        public final List<FileDescriptor> getDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.dependencies));
        }

        public final List<EnumDescriptor> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.enumTypes));
        }

        public final List<FieldDescriptor> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.extensions));
        }

        public final List<Descriptor> getMessageTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.messageTypes));
        }

        public final List<FileDescriptor> getPublicDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.publicDependencies));
        }

        public final List<ServiceDescriptor> getServices() {
            return Collections.unmodifiableList(Arrays.asList(this.services));
        }

        /* access modifiers changed from: package-private */
        public final boolean supportsUnknownEnumValue() {
            if (getSyntax() == Syntax.PROTO3) {
                return true;
            }
            return false;
        }

        public final Syntax getSyntax() {
            if (Syntax.PROTO3.name.equals(this.proto.getSyntax())) {
                return Syntax.PROTO3;
            }
            return Syntax.PROTO2;
        }

        private void crossLink() throws DescriptorValidationException {
            for (Descriptor crossLink : this.messageTypes) {
                crossLink.crossLink();
            }
            for (ServiceDescriptor crossLink2 : this.services) {
                crossLink2.crossLink();
            }
            for (FieldDescriptor crossLink3 : this.extensions) {
                crossLink3.crossLink();
            }
        }

        private void setProto(DescriptorProtos.FileDescriptorProto fileDescriptorProto) {
            this.proto = fileDescriptorProto;
            for (int i = 0; i < this.messageTypes.length; i++) {
                this.messageTypes[i].setProto(fileDescriptorProto.getMessageType(i));
            }
            for (int i2 = 0; i2 < this.enumTypes.length; i2++) {
                this.enumTypes[i2].setProto(fileDescriptorProto.getEnumType(i2));
            }
            for (int i3 = 0; i3 < this.services.length; i3++) {
                this.services[i3].setProto(fileDescriptorProto.getService(i3));
            }
            for (int i4 = 0; i4 < this.extensions.length; i4++) {
                this.extensions[i4].setProto(fileDescriptorProto.getExtension(i4));
            }
        }

        public final EnumDescriptor findEnumTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (getPackage().length() > 0) {
                str = getPackage() + '.' + str;
            }
            GenericDescriptor findSymbol = this.pool.findSymbol(str);
            if (findSymbol == null || !(findSymbol instanceof EnumDescriptor) || findSymbol.getFile() != this) {
                return null;
            }
            return (EnumDescriptor) findSymbol;
        }

        public final FieldDescriptor findExtensionByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (getPackage().length() > 0) {
                str = getPackage() + '.' + str;
            }
            GenericDescriptor findSymbol = this.pool.findSymbol(str);
            if (findSymbol == null || !(findSymbol instanceof FieldDescriptor) || findSymbol.getFile() != this) {
                return null;
            }
            return (FieldDescriptor) findSymbol;
        }

        public final Descriptor findMessageTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (getPackage().length() > 0) {
                str = getPackage() + '.' + str;
            }
            GenericDescriptor findSymbol = this.pool.findSymbol(str);
            if (findSymbol == null || !(findSymbol instanceof Descriptor) || findSymbol.getFile() != this) {
                return null;
            }
            return (Descriptor) findSymbol;
        }

        public final ServiceDescriptor findServiceByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            if (getPackage().length() > 0) {
                str = getPackage() + '.' + str;
            }
            GenericDescriptor findSymbol = this.pool.findSymbol(str);
            if (findSymbol == null || !(findSymbol instanceof ServiceDescriptor) || findSymbol.getFile() != this) {
                return null;
            }
            return (ServiceDescriptor) findSymbol;
        }

        public static FileDescriptor buildFrom(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr) throws DescriptorValidationException {
            return buildFrom(fileDescriptorProto, fileDescriptorArr, false);
        }

        public static void internalUpdateFileDescriptor(FileDescriptor fileDescriptor, ExtensionRegistry extensionRegistry) {
            try {
                fileDescriptor.setProto(DescriptorProtos.FileDescriptorProto.parseFrom(fileDescriptor.proto.toByteString(), (ExtensionRegistryLite) extensionRegistry));
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
            }
        }

        FileDescriptor(String str, Descriptor descriptor) throws DescriptorValidationException {
            this.pool = new DescriptorPool(new FileDescriptor[0], true);
            DescriptorProtos.FileDescriptorProto.Builder newBuilder = DescriptorProtos.FileDescriptorProto.newBuilder();
            this.proto = newBuilder.setName(descriptor.getFullName() + ".placeholder.proto").setPackage(str).addMessageType(descriptor.toProto()).build();
            this.dependencies = new FileDescriptor[0];
            this.publicDependencies = new FileDescriptor[0];
            this.messageTypes = new Descriptor[]{descriptor};
            this.enumTypes = new EnumDescriptor[0];
            this.services = new ServiceDescriptor[0];
            this.extensions = new FieldDescriptor[0];
            this.pool.addPackage(str, this);
            this.pool.addSymbol(descriptor);
        }

        public static FileDescriptor buildFrom(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, boolean z) throws DescriptorValidationException {
            FileDescriptor fileDescriptor = new FileDescriptor(fileDescriptorProto, fileDescriptorArr, new DescriptorPool(fileDescriptorArr, z), z);
            fileDescriptor.crossLink();
            return fileDescriptor;
        }

        public static void internalBuildGeneratedFileFrom(String[] strArr, FileDescriptor[] fileDescriptorArr, InternalDescriptorAssigner internalDescriptorAssigner) {
            StringBuilder sb = new StringBuilder();
            for (String append : strArr) {
                sb.append(append);
            }
            byte[] bytes = sb.toString().getBytes(Internal.ISO_8859_1);
            try {
                try {
                    FileDescriptor buildFrom = buildFrom(DescriptorProtos.FileDescriptorProto.parseFrom(bytes), fileDescriptorArr, true);
                    ExtensionRegistry assignDescriptors = internalDescriptorAssigner.assignDescriptors(buildFrom);
                    if (assignDescriptors != null) {
                        try {
                            buildFrom.setProto(DescriptorProtos.FileDescriptorProto.parseFrom(bytes, (ExtensionRegistryLite) assignDescriptors));
                        } catch (InvalidProtocolBufferException e2) {
                            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e2);
                        }
                    }
                } catch (DescriptorValidationException e3) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + r0.getName() + "\".", e3);
                }
            } catch (InvalidProtocolBufferException e4) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e4);
            }
        }

        private FileDescriptor(DescriptorProtos.FileDescriptorProto fileDescriptorProto, FileDescriptor[] fileDescriptorArr, DescriptorPool descriptorPool, boolean z) throws DescriptorValidationException {
            this.pool = descriptorPool;
            this.proto = fileDescriptorProto;
            this.dependencies = (FileDescriptor[]) fileDescriptorArr.clone();
            HashMap hashMap = new HashMap();
            for (FileDescriptor fileDescriptor : fileDescriptorArr) {
                hashMap.put(fileDescriptor.getName(), fileDescriptor);
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < fileDescriptorProto.getPublicDependencyCount(); i++) {
                int publicDependency = fileDescriptorProto.getPublicDependency(i);
                if (publicDependency < 0 || publicDependency >= fileDescriptorProto.getDependencyCount()) {
                    throw new DescriptorValidationException(this, "Invalid public dependency index.", (AnonymousClass1) null);
                }
                FileDescriptor fileDescriptor2 = (FileDescriptor) hashMap.get(fileDescriptorProto.getDependency(publicDependency));
                if (fileDescriptor2 != null) {
                    arrayList.add(fileDescriptor2);
                } else if (!z) {
                    throw new DescriptorValidationException(this, "Invalid public dependency: " + r3, (AnonymousClass1) null);
                }
            }
            this.publicDependencies = new FileDescriptor[arrayList.size()];
            arrayList.toArray(this.publicDependencies);
            descriptorPool.addPackage(getPackage(), this);
            this.messageTypes = new Descriptor[fileDescriptorProto.getMessageTypeCount()];
            for (int i2 = 0; i2 < fileDescriptorProto.getMessageTypeCount(); i2++) {
                Descriptor[] descriptorArr = this.messageTypes;
                Descriptor descriptor = new Descriptor(fileDescriptorProto.getMessageType(i2), this, null, i2, null);
                descriptorArr[i2] = descriptor;
            }
            this.enumTypes = new EnumDescriptor[fileDescriptorProto.getEnumTypeCount()];
            for (int i3 = 0; i3 < fileDescriptorProto.getEnumTypeCount(); i3++) {
                EnumDescriptor[] enumDescriptorArr = this.enumTypes;
                EnumDescriptor enumDescriptor = new EnumDescriptor(fileDescriptorProto.getEnumType(i3), this, null, i3, null);
                enumDescriptorArr[i3] = enumDescriptor;
            }
            this.services = new ServiceDescriptor[fileDescriptorProto.getServiceCount()];
            for (int i4 = 0; i4 < fileDescriptorProto.getServiceCount(); i4++) {
                this.services[i4] = new ServiceDescriptor(fileDescriptorProto.getService(i4), this, i4, null);
            }
            this.extensions = new FieldDescriptor[fileDescriptorProto.getExtensionCount()];
            for (int i5 = 0; i5 < fileDescriptorProto.getExtensionCount(); i5++) {
                FieldDescriptor[] fieldDescriptorArr = this.extensions;
                FieldDescriptor fieldDescriptor = new FieldDescriptor(fileDescriptorProto.getExtension(i5), this, null, i5, true, null);
                fieldDescriptorArr[i5] = fieldDescriptor;
            }
        }

        public static void internalBuildGeneratedFileFrom(String[] strArr, Class<?> cls, String[] strArr2, String[] strArr3, InternalDescriptorAssigner internalDescriptorAssigner) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < strArr2.length; i++) {
                try {
                    arrayList.add((FileDescriptor) cls.getClassLoader().loadClass(strArr2[i]).getField("descriptor").get(null));
                } catch (Exception unused) {
                    Logger logger = Descriptors.logger;
                    logger.warning("Descriptors for \"" + strArr3[i] + "\" can not be found.");
                }
            }
            FileDescriptor[] fileDescriptorArr = new FileDescriptor[arrayList.size()];
            arrayList.toArray(fileDescriptorArr);
            internalBuildGeneratedFileFrom(strArr, fileDescriptorArr, internalDescriptorAssigner);
        }
    }

    public static abstract class GenericDescriptor {
        public abstract FileDescriptor getFile();

        public abstract String getFullName();

        public abstract String getName();

        public abstract Message toProto();
    }

    public static final class MethodDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private Descriptor inputType;
        private Descriptor outputType;
        private DescriptorProtos.MethodDescriptorProto proto;
        private final ServiceDescriptor service;

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final int getIndex() {
            return this.index;
        }

        public final Descriptor getInputType() {
            return this.inputType;
        }

        public final Descriptor getOutputType() {
            return this.outputType;
        }

        public final ServiceDescriptor getService() {
            return this.service;
        }

        public final DescriptorProtos.MethodDescriptorProto toProto() {
            return this.proto;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final DescriptorProtos.MethodOptions getOptions() {
            return this.proto.getOptions();
        }

        public final void crossLink() throws DescriptorValidationException {
            GenericDescriptor lookupSymbol = this.file.pool.lookupSymbol(this.proto.getInputType(), this, DescriptorPool.SearchFilter.TYPES_ONLY);
            if (lookupSymbol instanceof Descriptor) {
                this.inputType = (Descriptor) lookupSymbol;
                GenericDescriptor lookupSymbol2 = this.file.pool.lookupSymbol(this.proto.getOutputType(), this, DescriptorPool.SearchFilter.TYPES_ONLY);
                if (lookupSymbol2 instanceof Descriptor) {
                    this.outputType = (Descriptor) lookupSymbol2;
                    return;
                }
                throw new DescriptorValidationException((GenericDescriptor) this, "\"" + this.proto.getOutputType() + "\" is not a message type.", (AnonymousClass1) null);
            }
            throw new DescriptorValidationException((GenericDescriptor) this, "\"" + this.proto.getInputType() + "\" is not a message type.", (AnonymousClass1) null);
        }

        public final void setProto(DescriptorProtos.MethodDescriptorProto methodDescriptorProto) {
            this.proto = methodDescriptorProto;
        }

        private MethodDescriptor(DescriptorProtos.MethodDescriptorProto methodDescriptorProto, FileDescriptor fileDescriptor, ServiceDescriptor serviceDescriptor, int i) throws DescriptorValidationException {
            this.index = i;
            this.proto = methodDescriptorProto;
            this.file = fileDescriptor;
            this.service = serviceDescriptor;
            this.fullName = serviceDescriptor.getFullName() + '.' + methodDescriptorProto.getName();
            fileDescriptor.pool.addSymbol(this);
        }

        /* synthetic */ MethodDescriptor(DescriptorProtos.MethodDescriptorProto methodDescriptorProto, FileDescriptor fileDescriptor, ServiceDescriptor serviceDescriptor, int i, AnonymousClass1 r5) throws DescriptorValidationException {
            this(methodDescriptorProto, fileDescriptor, serviceDescriptor, i);
        }
    }

    public static final class OneofDescriptor {
        private Descriptor containingType;
        public int fieldCount;
        public FieldDescriptor[] fields;
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private DescriptorProtos.OneofDescriptorProto proto;

        public final Descriptor getContainingType() {
            return this.containingType;
        }

        public final int getFieldCount() {
            return this.fieldCount;
        }

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final int getIndex() {
            return this.index;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final DescriptorProtos.OneofOptions getOptions() {
            return this.proto.getOptions();
        }

        public final List<FieldDescriptor> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.fields));
        }

        public final void setProto(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto) {
            this.proto = oneofDescriptorProto;
        }

        public final FieldDescriptor getField(int i) {
            return this.fields[i];
        }

        private OneofDescriptor(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i) throws DescriptorValidationException {
            this.proto = oneofDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, descriptor, oneofDescriptorProto.getName());
            this.file = fileDescriptor;
            this.index = i;
            this.containingType = descriptor;
            this.fieldCount = 0;
        }

        /* synthetic */ OneofDescriptor(DescriptorProtos.OneofDescriptorProto oneofDescriptorProto, FileDescriptor fileDescriptor, Descriptor descriptor, int i, AnonymousClass1 r5) throws DescriptorValidationException {
            this(oneofDescriptorProto, fileDescriptor, descriptor, i);
        }
    }

    public static final class ServiceDescriptor extends GenericDescriptor {
        private final FileDescriptor file;
        private final String fullName;
        private final int index;
        private MethodDescriptor[] methods;
        private DescriptorProtos.ServiceDescriptorProto proto;

        public final FileDescriptor getFile() {
            return this.file;
        }

        public final String getFullName() {
            return this.fullName;
        }

        public final int getIndex() {
            return this.index;
        }

        public final DescriptorProtos.ServiceDescriptorProto toProto() {
            return this.proto;
        }

        public final String getName() {
            return this.proto.getName();
        }

        public final DescriptorProtos.ServiceOptions getOptions() {
            return this.proto.getOptions();
        }

        public final void crossLink() throws DescriptorValidationException {
            for (MethodDescriptor crossLink : this.methods) {
                crossLink.crossLink();
            }
        }

        public final List<MethodDescriptor> getMethods() {
            return Collections.unmodifiableList(Arrays.asList(this.methods));
        }

        public final void setProto(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto) {
            this.proto = serviceDescriptorProto;
            for (int i = 0; i < this.methods.length; i++) {
                this.methods[i].setProto(serviceDescriptorProto.getMethod(i));
            }
        }

        public final MethodDescriptor findMethodByName(String str) {
            DescriptorPool descriptorPool = this.file.pool;
            GenericDescriptor findSymbol = descriptorPool.findSymbol(this.fullName + '.' + str);
            if (findSymbol == null || !(findSymbol instanceof MethodDescriptor)) {
                return null;
            }
            return (MethodDescriptor) findSymbol;
        }

        private ServiceDescriptor(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto, FileDescriptor fileDescriptor, int i) throws DescriptorValidationException {
            this.index = i;
            this.proto = serviceDescriptorProto;
            this.fullName = Descriptors.computeFullName(fileDescriptor, null, serviceDescriptorProto.getName());
            this.file = fileDescriptor;
            this.methods = new MethodDescriptor[serviceDescriptorProto.getMethodCount()];
            for (int i2 = 0; i2 < serviceDescriptorProto.getMethodCount(); i2++) {
                MethodDescriptor[] methodDescriptorArr = this.methods;
                MethodDescriptor methodDescriptor = new MethodDescriptor(serviceDescriptorProto.getMethod(i2), fileDescriptor, this, i2, null);
                methodDescriptorArr[i2] = methodDescriptor;
            }
            fileDescriptor.pool.addSymbol(this);
        }

        /* synthetic */ ServiceDescriptor(DescriptorProtos.ServiceDescriptorProto serviceDescriptorProto, FileDescriptor fileDescriptor, int i, AnonymousClass1 r4) throws DescriptorValidationException {
            this(serviceDescriptorProto, fileDescriptor, i);
        }
    }

    public static String computeFullName(FileDescriptor fileDescriptor, Descriptor descriptor, String str) {
        if (descriptor != null) {
            return descriptor.getFullName() + '.' + str;
        } else if (fileDescriptor.getPackage().length() <= 0) {
            return str;
        } else {
            return fileDescriptor.getPackage() + '.' + str;
        }
    }
}
