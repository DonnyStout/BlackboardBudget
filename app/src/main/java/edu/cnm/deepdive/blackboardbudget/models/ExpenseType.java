package edu.cnm.deepdive.blackboardbudget.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = User.class,
    parentColumns = "type_id",
    childColumns = "type_id"), @ForeignKey(entity = Expense.class,
    parentColumns = "expense_id",
    childColumns = "expense_id")})
public class ExpenseType {


  @PrimaryKey
  @ColumnInfo(name = "expensetype_id")
  private long expenseTypeId;

  @ColumnInfo(name = "expense_id")
  private long expenseId;

  @ColumnInfo(name = "type_id")
  private long typeId;

  public long getExpenseTypeId() {
    return expenseTypeId;
  }

  public void setExpenseTypeId(long expenseTypeId) {
    this.expenseTypeId = expenseTypeId;
  }

  public long getExpenseId() {
    return expenseId;
  }

  public void setExpenseId(long expenseId) {
    this.expenseId = expenseId;
  }

  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }
}
