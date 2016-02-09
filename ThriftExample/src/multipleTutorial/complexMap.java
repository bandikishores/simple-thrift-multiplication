/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package multipleTutorial;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class complexMap implements org.apache.thrift.TBase<complexMap, complexMap._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("complexMap");

  private static final org.apache.thrift.protocol.TField COMPLEX_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("complexMap", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new complexMapStandardSchemeFactory());
    schemes.put(TupleScheme.class, new complexMapTupleSchemeFactory());
  }

  public Map<Short,List<Short>> complexMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMPLEX_MAP((short)1, "complexMap");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COMPLEX_MAP
          return COMPLEX_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.COMPLEX_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.COMPLEX_MAP, new org.apache.thrift.meta_data.FieldMetaData("complexMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(complexMap.class, metaDataMap);
  }

  public complexMap() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public complexMap(complexMap other) {
    if (other.isSetComplexMap()) {
      Map<Short,List<Short>> __this__complexMap = new HashMap<Short,List<Short>>();
      for (Map.Entry<Short, List<Short>> other_element : other.complexMap.entrySet()) {

        Short other_element_key = other_element.getKey();
        List<Short> other_element_value = other_element.getValue();

        Short __this__complexMap_copy_key = other_element_key;

        List<Short> __this__complexMap_copy_value = new ArrayList<Short>();
        for (Short other_element_value_element : other_element_value) {
          __this__complexMap_copy_value.add(other_element_value_element);
        }

        __this__complexMap.put(__this__complexMap_copy_key, __this__complexMap_copy_value);
      }
      this.complexMap = __this__complexMap;
    }
  }

  public complexMap deepCopy() {
    return new complexMap(this);
  }

  @Override
  public void clear() {
    this.complexMap = null;
  }

  public int getComplexMapSize() {
    return (this.complexMap == null) ? 0 : this.complexMap.size();
  }

  public void putToComplexMap(short key, List<Short> val) {
    if (this.complexMap == null) {
      this.complexMap = new HashMap<Short,List<Short>>();
    }
    this.complexMap.put(key, val);
  }

  public Map<Short,List<Short>> getComplexMap() {
    return this.complexMap;
  }

  public complexMap setComplexMap(Map<Short,List<Short>> complexMap) {
    this.complexMap = complexMap;
    return this;
  }

  public void unsetComplexMap() {
    this.complexMap = null;
  }

  /** Returns true if field complexMap is set (has been assigned a value) and false otherwise */
  public boolean isSetComplexMap() {
    return this.complexMap != null;
  }

  public void setComplexMapIsSet(boolean value) {
    if (!value) {
      this.complexMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case COMPLEX_MAP:
      if (value == null) {
        unsetComplexMap();
      } else {
        setComplexMap((Map<Short,List<Short>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case COMPLEX_MAP:
      return getComplexMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case COMPLEX_MAP:
      return isSetComplexMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof complexMap)
      return this.equals((complexMap)that);
    return false;
  }

  public boolean equals(complexMap that) {
    if (that == null)
      return false;

    boolean this_present_complexMap = true && this.isSetComplexMap();
    boolean that_present_complexMap = true && that.isSetComplexMap();
    if (this_present_complexMap || that_present_complexMap) {
      if (!(this_present_complexMap && that_present_complexMap))
        return false;
      if (!this.complexMap.equals(that.complexMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(complexMap other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    complexMap typedOther = (complexMap)other;

    lastComparison = Boolean.valueOf(isSetComplexMap()).compareTo(typedOther.isSetComplexMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetComplexMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.complexMap, typedOther.complexMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("complexMap(");
    boolean first = true;

    if (isSetComplexMap()) {
      sb.append("complexMap:");
      if (this.complexMap == null) {
        sb.append("null");
      } else {
        sb.append(this.complexMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class complexMapStandardSchemeFactory implements SchemeFactory {
    public complexMapStandardScheme getScheme() {
      return new complexMapStandardScheme();
    }
  }

  private static class complexMapStandardScheme extends StandardScheme<complexMap> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, complexMap struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMPLEX_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.complexMap = new HashMap<Short,List<Short>>(2*_map0.size);
                for (int _i1 = 0; _i1 < _map0.size; ++_i1)
                {
                  short _key2; // required
                  List<Short> _val3; // required
                  _key2 = iprot.readI16();
                  {
                    org.apache.thrift.protocol.TList _list4 = iprot.readListBegin();
                    _val3 = new ArrayList<Short>(_list4.size);
                    for (int _i5 = 0; _i5 < _list4.size; ++_i5)
                    {
                      short _elem6; // required
                      _elem6 = iprot.readI16();
                      _val3.add(_elem6);
                    }
                    iprot.readListEnd();
                  }
                  struct.complexMap.put(_key2, _val3);
                }
                iprot.readMapEnd();
              }
              struct.setComplexMapIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, complexMap struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.complexMap != null) {
        if (struct.isSetComplexMap()) {
          oprot.writeFieldBegin(COMPLEX_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.LIST, struct.complexMap.size()));
            for (Map.Entry<Short, List<Short>> _iter7 : struct.complexMap.entrySet())
            {
              oprot.writeI16(_iter7.getKey());
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I16, _iter7.getValue().size()));
                for (short _iter8 : _iter7.getValue())
                {
                  oprot.writeI16(_iter8);
                }
                oprot.writeListEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class complexMapTupleSchemeFactory implements SchemeFactory {
    public complexMapTupleScheme getScheme() {
      return new complexMapTupleScheme();
    }
  }

  private static class complexMapTupleScheme extends TupleScheme<complexMap> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, complexMap struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetComplexMap()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetComplexMap()) {
        {
          oprot.writeI32(struct.complexMap.size());
          for (Map.Entry<Short, List<Short>> _iter9 : struct.complexMap.entrySet())
          {
            oprot.writeI16(_iter9.getKey());
            {
              oprot.writeI32(_iter9.getValue().size());
              for (short _iter10 : _iter9.getValue())
              {
                oprot.writeI16(_iter10);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, complexMap struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map11 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I16, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.complexMap = new HashMap<Short,List<Short>>(2*_map11.size);
          for (int _i12 = 0; _i12 < _map11.size; ++_i12)
          {
            short _key13; // required
            List<Short> _val14; // required
            _key13 = iprot.readI16();
            {
              org.apache.thrift.protocol.TList _list15 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I16, iprot.readI32());
              _val14 = new ArrayList<Short>(_list15.size);
              for (int _i16 = 0; _i16 < _list15.size; ++_i16)
              {
                short _elem17; // required
                _elem17 = iprot.readI16();
                _val14.add(_elem17);
              }
            }
            struct.complexMap.put(_key13, _val14);
          }
        }
        struct.setComplexMapIsSet(true);
      }
    }
  }

}

