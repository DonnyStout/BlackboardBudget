package edu.cnm.deepdive.blackboardbudget.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = User.class,
    parentColumns = "user_id",
    childColumns = "user_id")})
public class Expense {


  @PrimaryKey
  @ColumnInfo(name = "expense_id")
  private long expenseId;

  @ColumnInfo(name = "date")
  private String date;

  @ColumnInfo(name = "name")
  private String name;

  @ColumnInfo(name = "amount")
  private long amount;

  @ColumnInfo(name = "user_id")
  private long userId;

  public long getExpenseId() {
    return expenseId;
  }

  public void setExpenseId(long expenseId) {
    this.expenseId = expenseId;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
