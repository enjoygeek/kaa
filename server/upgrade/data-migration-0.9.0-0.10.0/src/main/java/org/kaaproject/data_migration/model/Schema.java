package org.kaaproject.data_migration.model;

public class Schema {

    private Long id;

    private int version;

    private String name;

    private String description;

    private String createdUsername;

    private long createdTime;

    private Long appId;

    private String schems;

    private String type;


    public Schema() {
    }

    public Schema(Long id, int version, String name, String description, String createdUsername, long createdTime, Long appId, String schems, String type) {
        this.id = id;
        this.version = version;
        this.name = name;
        this.description = description;
        this.createdUsername = createdUsername;
        this.createdTime = createdTime;
        this.appId = appId;
        this.schems = schems;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedUsername() {
        return createdUsername;
    }

    public void setCreatedUsername(String createdUsername) {
        this.createdUsername = createdUsername;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getSchems() {
        return schems;
    }

    public void setSchems(String schems) {
        this.schems = schems;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
