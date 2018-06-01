package edu.cnm.deepdive.blackboardbudget.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.blackboardbudget.models.BudgetType;

@Dao
public interface BudgetTypeDao {

  @Query("SELECT * FROM budgettype WHERE budgettype_id LIKE :budgetTypeId LIMIT 1")
  BudgetType findByBudgetTypeId(long budgetTypeId);

}
