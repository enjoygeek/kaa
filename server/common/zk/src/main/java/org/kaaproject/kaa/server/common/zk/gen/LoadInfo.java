/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.kaa.server.common.zk.gen;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class LoadInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LoadInfo\",\"namespace\":\"org.kaaproject.kaa.server.common.zk.gen\",\"fields\":[{\"name\":\"endpointCount\",\"type\":\"int\"},{\"name\":\"loadAverage\",\"type\":\"double\"}]}");
  private int endpointCount;
  private double loadAverage;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}.
   */
  public LoadInfo() {
  }

  /**
   * All-args constructor.
   */
  public LoadInfo(java.lang.Integer endpointCount, java.lang.Double loadAverage) {
    this.endpointCount = endpointCount;
    this.loadAverage = loadAverage;
  }

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  /**
   * Creates a new LoadInfo RecordBuilder
   */
  public static org.kaaproject.kaa.server.common.zk.gen.LoadInfo.Builder newBuilder() {
    return new org.kaaproject.kaa.server.common.zk.gen.LoadInfo.Builder();
  }

  /**
   * Creates a new LoadInfo RecordBuilder by copying an existing Builder
   */
  public static org.kaaproject.kaa.server.common.zk.gen.LoadInfo.Builder newBuilder(org.kaaproject.kaa.server.common.zk.gen.LoadInfo.Builder other) {
    return new org.kaaproject.kaa.server.common.zk.gen.LoadInfo.Builder(other);
  }

  /**
   * Creates a new LoadInfo RecordBuilder by copying an existing LoadInfo instance
   */
  public static org.kaaproject.kaa.server.common.zk.gen.LoadInfo.Builder newBuilder(org.kaaproject.kaa.server.common.zk.gen.LoadInfo other) {
    return new org.kaaproject.kaa.server.common.zk.gen.LoadInfo.Builder(other);
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }

  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return endpointCount;
      case 1:
        return loadAverage;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        endpointCount = (java.lang.Integer) value$;
        break;
      case 1:
        loadAverage = (java.lang.Double) value$;
        break;
      default:
        throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'endpointCount' field.
   */
  public java.lang.Integer getEndpointCount() {
    return endpointCount;
  }

  /**
   * Sets the value of the 'endpointCount' field.
   *
   * @param value the value to set.
   */
  public void setEndpointCount(java.lang.Integer value) {
    this.endpointCount = value;
  }

  /**
   * Gets the value of the 'loadAverage' field.
   */
  public java.lang.Double getLoadAverage() {
    return loadAverage;
  }

  /**
   * Sets the value of the 'loadAverage' field.
   *
   * @param value the value to set.
   */
  public void setLoadAverage(java.lang.Double value) {
    this.loadAverage = value;
  }

  /**
   * RecordBuilder for LoadInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LoadInfo>
      implements org.apache.avro.data.RecordBuilder<LoadInfo> {

    private int endpointCount;
    private double loadAverage;

    /**
     * Creates a new Builder
     */
    private Builder() {
      super(org.kaaproject.kaa.server.common.zk.gen.LoadInfo.SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder
     */
    private Builder(org.kaaproject.kaa.server.common.zk.gen.LoadInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.endpointCount)) {
        this.endpointCount = data().deepCopy(fields()[0].schema(), other.endpointCount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.loadAverage)) {
        this.loadAverage = data().deepCopy(fields()[1].schema(), other.loadAverage);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing LoadInfo instance
     */
    private Builder(org.kaaproject.kaa.server.common.zk.gen.LoadInfo other) {
      super(org.kaaproject.kaa.server.common.zk.gen.LoadInfo.SCHEMA$);
      if (isValidValue(fields()[0], other.endpointCount)) {
        this.endpointCount = data().deepCopy(fields()[0].schema(), other.endpointCount);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.loadAverage)) {
        this.loadAverage = data().deepCopy(fields()[1].schema(), other.loadAverage);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Gets the value of the 'endpointCount' field
     */
    public java.lang.Integer getEndpointCount() {
      return endpointCount;
    }

    /**
     * Sets the value of the 'endpointCount' field
     */
    public org.kaaproject.kaa.server.common.zk.gen.LoadInfo.Builder setEndpointCount(int value) {
      validate(fields()[0], value);
      this.endpointCount = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'endpointCount' field has been set
     */
    public boolean hasEndpointCount() {
      return fieldSetFlags()[0];
    }

    /**
     * Clears the value of the 'endpointCount' field
     */
    public org.kaaproject.kaa.server.common.zk.gen.LoadInfo.Builder clearEndpointCount() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'loadAverage' field
     */
    public java.lang.Double getLoadAverage() {
      return loadAverage;
    }

    /**
     * Sets the value of the 'loadAverage' field
     */
    public org.kaaproject.kaa.server.common.zk.gen.LoadInfo.Builder setLoadAverage(double value) {
      validate(fields()[1], value);
      this.loadAverage = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'loadAverage' field has been set
     */
    public boolean hasLoadAverage() {
      return fieldSetFlags()[1];
    }

    /**
     * Clears the value of the 'loadAverage' field
     */
    public org.kaaproject.kaa.server.common.zk.gen.LoadInfo.Builder clearLoadAverage() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public LoadInfo build() {
      try {
        LoadInfo record = new LoadInfo();
        record.endpointCount = fieldSetFlags()[0] ? this.endpointCount : (java.lang.Integer) defaultValue(fields()[0]);
        record.loadAverage = fieldSetFlags()[1] ? this.loadAverage : (java.lang.Double) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
