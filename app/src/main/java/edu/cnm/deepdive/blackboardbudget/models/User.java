package edu.cnm.deepdive.blackboardbudget.models;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(indices = {@Index(value = {"username"}, unique = true)})
public class User {

  @PrimaryKey
  @ColumnInfo(name = "user_id")
  private long userId;

  @ColumnInfo(name = "username")
  private String username;

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }
}
