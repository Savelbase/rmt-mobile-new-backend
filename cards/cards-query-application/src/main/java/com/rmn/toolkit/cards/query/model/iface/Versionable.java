package com.rmn.toolkit.cards.query.model.iface;

public interface Versionable {

    Integer getVersion();

    void setVersion(Integer version);

    default void incrementVersion() {
        this.setVersion(this.getVersion() + 1);
    }
}
