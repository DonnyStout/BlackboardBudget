package edu.cnm.deepdive.blackboardbudget.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.PrimaryKey;

public class Type {


  @PrimaryKey
  @ColumnInfo(name = "type_id")
  private long typeId;

  @ColumnInfo(name = "type")
  private String type;

  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
