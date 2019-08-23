package com.google.protobuf;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;

public enum Syntax implements ProtocolMessageEnum {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    
    private static final Syntax[] VALUES = null;
    private static final Internal.EnumLiteMap<Syntax> internalValueMap = null;
    private final int value;

    public static Internal.EnumLiteMap<Syntax> internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return TypeProto.getDescriptor().getEnumTypes().get(0);
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
    }

    static {
        internalValueMap = new Internal.EnumLiteMap<Syntax>() {
            public final Syntax findValueByNumber(int i) {
                return Syntax.forNumber(i);
            }
        };
        VALUES = values();
    }

    @Deprecated
    public static Syntax valueOf(int i) {
        return forNumber(i);
    }

    public static Syntax forNumber(int i) {
        switch (i) {
            case 0:
                return SYNTAX_PROTO2;
            case 1:
                return SYNTAX_PROTO3;
            default:
                return null;
        }
    }

    public static Syntax valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        } else if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        } else {
            return VALUES[enumValueDescriptor.getIndex()];
        }
    }

    private Syntax(int i) {
        this.value = i;
    }
}
