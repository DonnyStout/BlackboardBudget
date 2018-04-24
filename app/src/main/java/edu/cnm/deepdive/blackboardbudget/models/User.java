package edu.cnm.deepdive.blackboardbudget.models;

import static android.arch.persistence.room.ForeignKey.CASCADE;

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

  @ColumnInfo(name = "budget_id")
  private long budgetId;

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

  public long getBudgetId() {
    return budgetId;
  }

  public void setBudgetId(long budgetId) {
    this.budgetId = budgetId;
  }
}
