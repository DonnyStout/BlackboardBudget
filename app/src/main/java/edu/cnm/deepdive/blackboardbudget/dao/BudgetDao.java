package edu.cnm.deepdive.blackboardbudget.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import edu.cnm.deepdive.blackboardbudget.models.Budget;

@Dao
public interface BudgetDao {


  @Query("SELECT * FROM budget WHERE budget_id LIKE :budgetId AND user_id LIKE :userId LIMIT 1")
  Budget findByBudgetAndUserId(long budgetId, long userId);


}
