package edu.cnm.deepdive.blackboardbudget.models;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = User.class,
    parentColumns = "user_id",
    childColumns = "user_id")})
public class Budget {


  @PrimaryKey
  @ColumnInfo(name = "budget_id")
  private long budgetId;

  @ColumnInfo(name = "amount")
  private long amount;

  @ColumnInfo(name = "user_id")
  private long userId;

  public long getBudgetId() {
    return budgetId;
  }

  public void setBudgetId(long budgetId) {
    this.budgetId = budgetId;
  }

  public long getAmount() {
    return amount;
  }

  public void setAmount(long amount) {
    this.amount = amount;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }
}
