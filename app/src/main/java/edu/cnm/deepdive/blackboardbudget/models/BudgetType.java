package edu.cnm.deepdive.blackboardbudget.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = {@ForeignKey(entity = Budget.class,
    parentColumns = "budget_id",
    childColumns = "budget_id"),
    @ForeignKey(entity = Type.class,
    parentColumns = "type_id",
    childColumns = "type_id")})
public class BudgetType {


  @PrimaryKey
  @ColumnInfo(name = "budgettype_id")
  private long budgetTypeId;

  @ColumnInfo(name = "budget_id")
  private long budgetId;

  @ColumnInfo(name = "type_id")
  private long typeId;

  public long getBudgetTypeId() {
    return budgetTypeId;
  }

  public void setBudgetTypeId(long budgetTypeId) {
    this.budgetTypeId = budgetTypeId;
  }

  public long getBudgetId() {
    return budgetId;
  }

  public void setBudgetId(long budgetId) {
    this.budgetId = budgetId;
  }

  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }
}
