package com.google.protobuf;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Descriptors;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.Message;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public final class MapEntry<K, V> extends AbstractMessage {
    private volatile int cachedSerializedSize;
    public final K key;
    private final Metadata<K, V> metadata;
    public final V value;

    public static class Builder<K, V> extends AbstractMessage.Builder<Builder<K, V>> {
        private boolean hasKey;
        private boolean hasValue;
        private K key;
        private final Metadata<K, V> metadata;
        private V value;

        public Builder<K, V> setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return this;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public Descriptors.Descriptor getDescriptorForType() {
            return this.metadata.descriptor;
        }

        public UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        public MapEntry<K, V> build() {
            MapEntry<K, V> buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw newUninitializedMessageException(buildPartial);
        }

        public MapEntry<K, V> buildPartial() {
            return new MapEntry<>((Metadata) this.metadata, (Object) this.key, (Object) this.value);
        }

        public Builder<K, V> clearKey() {
            this.key = this.metadata.defaultKey;
            this.hasKey = false;
            return this;
        }

        public Builder<K, V> clearValue() {
            this.value = this.metadata.defaultValue;
            this.hasValue = false;
            return this;
        }

        public boolean isInitialized() {
            return MapEntry.isInitialized(this.metadata, this.value);
        }

        public Builder<K, V> clone() {
            Builder builder = new Builder(this.metadata, this.key, this.value, this.hasKey, this.hasValue);
            return builder;
        }

        public MapEntry<K, V> getDefaultInstanceForType() {
            return new MapEntry<>((Metadata) this.metadata, this.metadata.defaultKey, this.metadata.defaultValue);
        }

        public Map<Descriptors.FieldDescriptor, Object> getAllFields() {
            TreeMap treeMap = new TreeMap();
            for (Descriptors.FieldDescriptor next : this.metadata.descriptor.getFields()) {
                if (hasField(next)) {
                    treeMap.put(next, getField(next));
                }
            }
            return Collections.unmodifiableMap(treeMap);
        }

        public int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        public Builder<K, V> setKey(K k) {
            this.key = k;
            this.hasKey = true;
            return this;
        }

        public Builder<K, V> setValue(V v) {
            this.value = v;
            this.hasValue = true;
            return this;
        }

        private Builder(Metadata<K, V> metadata2) {
            this(metadata2, metadata2.defaultKey, metadata2.defaultValue, false, false);
        }

        public boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
            checkFieldDescriptor(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                return this.hasKey;
            }
            return this.hasValue;
        }

        public Builder<K, V> clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            checkFieldDescriptor(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                clearKey();
            } else {
                clearValue();
            }
            return this;
        }

        private void checkFieldDescriptor(Descriptors.FieldDescriptor fieldDescriptor) {
            if (fieldDescriptor.getContainingType() != this.metadata.descriptor) {
                throw new RuntimeException("Wrong FieldDescriptor \"" + fieldDescriptor.getFullName() + "\" used in message \"" + this.metadata.descriptor.getFullName());
            }
        }

        public Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
            Object obj;
            checkFieldDescriptor(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                obj = getKey();
            } else {
                obj = getValue();
            }
            if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
                return fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(((Integer) obj).intValue());
            }
            return obj;
        }

        public Message.Builder newBuilderForField(Descriptors.FieldDescriptor fieldDescriptor) {
            checkFieldDescriptor(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 2 && fieldDescriptor.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                return ((Message) this.value).newBuilderForType();
            }
            throw new RuntimeException("\"" + fieldDescriptor.getFullName() + "\" is not a message value field.");
        }

        public Builder<K, V> addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        public Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        public Builder<K, V> setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            checkFieldDescriptor(fieldDescriptor);
            if (fieldDescriptor.getNumber() == 1) {
                setKey(obj);
            } else {
                if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
                    obj = Integer.valueOf(((Descriptors.EnumValueDescriptor) obj).getNumber());
                } else if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.MESSAGE && obj != null && !this.metadata.defaultValue.getClass().isInstance(obj)) {
                    obj = ((Message) this.metadata.defaultValue).toBuilder().mergeFrom((Message) obj).build();
                }
                setValue(obj);
            }
            return this;
        }

        public Builder<K, V> setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
            throw new RuntimeException("There is no repeated field in a map entry message.");
        }

        private Builder(Metadata<K, V> metadata2, K k, V v, boolean z, boolean z2) {
            this.metadata = metadata2;
            this.key = k;
            this.value = v;
            this.hasKey = z;
            this.hasValue = z2;
        }
    }

    static final class Metadata<K, V> extends MapEntryLite.Metadata<K, V> {
        public final Descriptors.Descriptor descriptor;
        public final Parser<MapEntry<K, V>> parser = new AbstractParser<MapEntry<K, V>>() {
            public MapEntry<K, V> parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new MapEntry<>(Metadata.this, codedInputStream, extensionRegistryLite);
            }
        };

        public Metadata(Descriptors.Descriptor descriptor2, MapEntry<K, V> mapEntry, WireFormat.FieldType fieldType, WireFormat.FieldType fieldType2) {
            super(fieldType, mapEntry.key, fieldType2, mapEntry.value);
            this.descriptor = descriptor2;
        }
    }

    public final K getKey() {
        return this.key;
    }

    /* access modifiers changed from: package-private */
    public final Metadata<K, V> getMetadata() {
        return this.metadata;
    }

    public final V getValue() {
        return this.value;
    }

    public final Descriptors.Descriptor getDescriptorForType() {
        return this.metadata.descriptor;
    }

    public final Parser<MapEntry<K, V>> getParserForType() {
        return this.metadata.parser;
    }

    public final UnknownFieldSet getUnknownFields() {
        return UnknownFieldSet.getDefaultInstance();
    }

    public final MapEntry<K, V> getDefaultInstanceForType() {
        return new MapEntry<>((Metadata) this.metadata, (K) this.metadata.defaultKey, (V) this.metadata.defaultValue);
    }

    public final boolean isInitialized() {
        return isInitialized(this.metadata, this.value);
    }

    public final Builder<K, V> newBuilderForType() {
        return new Builder<>(this.metadata);
    }

    public final Builder<K, V> toBuilder() {
        Builder builder = new Builder(this.metadata, this.key, this.value, true, true);
        return builder;
    }

    public final int getSerializedSize() {
        if (this.cachedSerializedSize != -1) {
            return this.cachedSerializedSize;
        }
        int computeSerializedSize = MapEntryLite.computeSerializedSize(this.metadata, this.key, this.value);
        this.cachedSerializedSize = computeSerializedSize;
        return computeSerializedSize;
    }

    public final Map<Descriptors.FieldDescriptor, Object> getAllFields() {
        TreeMap treeMap = new TreeMap();
        for (Descriptors.FieldDescriptor next : this.metadata.descriptor.getFields()) {
            if (hasField(next)) {
                treeMap.put(next, getField(next));
            }
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public final int getRepeatedFieldCount(Descriptors.FieldDescriptor fieldDescriptor) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    public final boolean hasField(Descriptors.FieldDescriptor fieldDescriptor) {
        checkFieldDescriptor(fieldDescriptor);
        return true;
    }

    public final void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        MapEntryLite.writeTo(codedOutputStream, this.metadata, this.key, this.value);
    }

    private void checkFieldDescriptor(Descriptors.FieldDescriptor fieldDescriptor) {
        if (fieldDescriptor.getContainingType() != this.metadata.descriptor) {
            throw new RuntimeException("Wrong FieldDescriptor \"" + fieldDescriptor.getFullName() + "\" used in message \"" + this.metadata.descriptor.getFullName());
        }
    }

    public final Object getField(Descriptors.FieldDescriptor fieldDescriptor) {
        Object obj;
        checkFieldDescriptor(fieldDescriptor);
        if (fieldDescriptor.getNumber() == 1) {
            obj = getKey();
        } else {
            obj = getValue();
        }
        if (fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.ENUM) {
            return fieldDescriptor.getEnumType().findValueByNumberCreatingIfUnknown(((Integer) obj).intValue());
        }
        return obj;
    }

    public final Object getRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i) {
        throw new RuntimeException("There is no repeated field in a map entry message.");
    }

    public static <V> boolean isInitialized(Metadata metadata2, V v) {
        if (metadata2.valueType.getJavaType() == WireFormat.JavaType.MESSAGE) {
            return ((MessageLite) v).isInitialized();
        }
        return true;
    }

    private MapEntry(Metadata metadata2, K k, V v) {
        this.cachedSerializedSize = -1;
        this.key = k;
        this.value = v;
        this.metadata = metadata2;
    }

    private MapEntry(Metadata<K, V> metadata2, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this.cachedSerializedSize = -1;
        try {
            this.metadata = metadata2;
            Map.Entry parseEntry = MapEntryLite.parseEntry(codedInputStream, metadata2, extensionRegistryLite);
            this.key = parseEntry.getKey();
            this.value = parseEntry.getValue();
        } catch (InvalidProtocolBufferException e2) {
            throw e2.setUnfinishedMessage(this);
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(this);
        }
    }

    public static <K, V> MapEntry<K, V> newDefaultInstance(Descriptors.Descriptor descriptor, WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        MapEntry mapEntry = new MapEntry(descriptor, fieldType, k, fieldType2, v);
        return mapEntry;
    }

    private MapEntry(Descriptors.Descriptor descriptor, WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.cachedSerializedSize = -1;
        this.key = k;
        this.value = v;
        this.metadata = new Metadata<>(descriptor, this, fieldType, fieldType2);
    }
}
